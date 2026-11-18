// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agenticbas20260630;

import com.aliyun.tea.*;
import com.aliyun.agenticbas20260630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "AgenticBAS";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agenticbas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>description</b> :
     * <p>Submits retests for existing vulnerabilities that the current account has access to. OperationInput accepts only VulnIds. The original array must contain 1 to 100 elements, and duplicate elements are counted. The original length is validated before deduplication. If the limit is exceeded, the entire request is rejected and no verification records are created. Valid vulnerability IDs are processed item by item. A single item failure does not block the remaining items or roll back accepted items. SuccessCount and Results.Success only indicate that the verification records are created and accepted, and do not mean that the vulnerabilities have been retested or passed verification. Retests are executed asynchronously and may consume credits.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits asynchronous retests in bulk for specified vulnerabilities under the current account and returns the acceptance results for each item.</p>
     * 
     * @param tmpReq BatchVerifyPentestVulnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchVerifyPentestVulnResponse
     */
    public BatchVerifyPentestVulnResponse batchVerifyPentestVulnWithOptions(BatchVerifyPentestVulnRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchVerifyPentestVulnShrinkRequest request = new BatchVerifyPentestVulnShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchVerifyPentestVuln"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchVerifyPentestVulnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Submits retests for existing vulnerabilities that the current account has access to. OperationInput accepts only VulnIds. The original array must contain 1 to 100 elements, and duplicate elements are counted. The original length is validated before deduplication. If the limit is exceeded, the entire request is rejected and no verification records are created. Valid vulnerability IDs are processed item by item. A single item failure does not block the remaining items or roll back accepted items. SuccessCount and Results.Success only indicate that the verification records are created and accepted, and do not mean that the vulnerabilities have been retested or passed verification. Retests are executed asynchronously and may consume credits.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits asynchronous retests in bulk for specified vulnerabilities under the current account and returns the acceptance results for each item.</p>
     * 
     * @param request BatchVerifyPentestVulnRequest
     * @return BatchVerifyPentestVulnResponse
     */
    public BatchVerifyPentestVulnResponse batchVerifyPentestVuln(BatchVerifyPentestVulnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchVerifyPentestVulnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates penetration testing tasks for authorized assets of the current account and returns the task IDs. You can specify up to five targets at a time, and one task is created for each target.
     * Before you call this operation, you must activate the AgenticBAS service or meet the validity period and quota conditions of the trial service. The target assets must meet the ownership verification requirements of the selected asset source. Business parameters are passed in OperationInput. VulnCheckItems and PentestRequirement cannot be empty at the same time. Currently, only IMMEDIATE execution is supported, and scheduled execution is not supported.
     * A successful creation response only indicates that the tasks are created and does not wait for the scan to complete. Save the TaskId in TaskList, query the status and usage by calling DescribePentestTaskList, and then use the same TaskId to query vulnerabilities or reports. Tasks may enter a queue. If a report is not generated, the query response may not contain a download link.
     * Credentials use an object structure of &quot;identity name -&gt; credential configuration&quot;. The following are synthetic examples. Replace them with authorized test identities in actual calls.</p>
     * <pre><code class="language-json">{
     *   &quot;Credentials&quot;: {
     *     &quot;accountUser&quot;: {
     *       &quot;account&quot;: {
     *         &quot;username&quot;: &quot;example-user&quot;,
     *         &quot;password&quot;: &quot;example-password&quot;
     *       }
     *     },
     *     &quot;cookieUser&quot;: {
     *       &quot;cookies&quot;: [
     *         {
     *           &quot;name&quot;: &quot;session&quot;,
     *           &quot;value&quot;: &quot;example-session&quot;,
     *           &quot;domain&quot;: &quot;example.com&quot;,
     *           &quot;path&quot;: &quot;/&quot;,
     *           &quot;secure&quot;: true,
     *           &quot;httpOnly&quot;: true,
     *           &quot;sameSite&quot;: &quot;Lax&quot;
     *         }
     *       ]
     *     },
     *     &quot;localUser&quot;: {
     *       &quot;localStorage&quot;: {
     *         &quot;access_token&quot;: &quot;example-local-token&quot;
     *       }
     *     },
     *     &quot;sessionUser&quot;: {
     *       &quot;sessionStorage&quot;: {
     *         &quot;session_token&quot;: &quot;example-session-token&quot;
     *       }
     *     },
     *     &quot;headerUser&quot;: {
     *       &quot;extraHeaders&quot;: {
     *         &quot;Authorization&quot;: &quot;Bearer example-token&quot;
     *       }
     *     }
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates penetration testing tasks for authorized assets of the current account and returns the task IDs. You can specify up to five targets at a time, and one task is created for each target.</p>
     * 
     * @param tmpReq CreatePentestTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePentestTaskResponse
     */
    public CreatePentestTaskResponse createPentestTaskWithOptions(CreatePentestTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePentestTaskShrinkRequest request = new CreatePentestTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePentestTask"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePentestTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates penetration testing tasks for authorized assets of the current account and returns the task IDs. You can specify up to five targets at a time, and one task is created for each target.
     * Before you call this operation, you must activate the AgenticBAS service or meet the validity period and quota conditions of the trial service. The target assets must meet the ownership verification requirements of the selected asset source. Business parameters are passed in OperationInput. VulnCheckItems and PentestRequirement cannot be empty at the same time. Currently, only IMMEDIATE execution is supported, and scheduled execution is not supported.
     * A successful creation response only indicates that the tasks are created and does not wait for the scan to complete. Save the TaskId in TaskList, query the status and usage by calling DescribePentestTaskList, and then use the same TaskId to query vulnerabilities or reports. Tasks may enter a queue. If a report is not generated, the query response may not contain a download link.
     * Credentials use an object structure of &quot;identity name -&gt; credential configuration&quot;. The following are synthetic examples. Replace them with authorized test identities in actual calls.</p>
     * <pre><code class="language-json">{
     *   &quot;Credentials&quot;: {
     *     &quot;accountUser&quot;: {
     *       &quot;account&quot;: {
     *         &quot;username&quot;: &quot;example-user&quot;,
     *         &quot;password&quot;: &quot;example-password&quot;
     *       }
     *     },
     *     &quot;cookieUser&quot;: {
     *       &quot;cookies&quot;: [
     *         {
     *           &quot;name&quot;: &quot;session&quot;,
     *           &quot;value&quot;: &quot;example-session&quot;,
     *           &quot;domain&quot;: &quot;example.com&quot;,
     *           &quot;path&quot;: &quot;/&quot;,
     *           &quot;secure&quot;: true,
     *           &quot;httpOnly&quot;: true,
     *           &quot;sameSite&quot;: &quot;Lax&quot;
     *         }
     *       ]
     *     },
     *     &quot;localUser&quot;: {
     *       &quot;localStorage&quot;: {
     *         &quot;access_token&quot;: &quot;example-local-token&quot;
     *       }
     *     },
     *     &quot;sessionUser&quot;: {
     *       &quot;sessionStorage&quot;: {
     *         &quot;session_token&quot;: &quot;example-session-token&quot;
     *       }
     *     },
     *     &quot;headerUser&quot;: {
     *       &quot;extraHeaders&quot;: {
     *         &quot;Authorization&quot;: &quot;Bearer example-token&quot;
     *       }
     *     }
     *   }
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates penetration testing tasks for authorized assets of the current account and returns the task IDs. You can specify up to five targets at a time, and one task is created for each target.</p>
     * 
     * @param request CreatePentestTaskRequest
     * @return CreatePentestTaskResponse
     */
    public CreatePentestTaskResponse createPentestTask(CreatePentestTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPentestTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PDF report of a specified penetration test task for the current account, and returns a temporary Object Storage Service (OSS) download URL and the expiration time without returning the report content.</p>
     * 
     * @param tmpReq DescribePentestReportContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePentestReportContentResponse
     */
    public DescribePentestReportContentResponse describePentestReportContentWithOptions(DescribePentestReportContentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePentestReportContentShrinkRequest request = new DescribePentestReportContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePentestReportContent"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePentestReportContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PDF report of a specified penetration test task for the current account, and returns a temporary Object Storage Service (OSS) download URL and the expiration time without returning the report content.</p>
     * 
     * @param request DescribePentestReportContentRequest
     * @return DescribePentestReportContentResponse
     */
    public DescribePentestReportContentResponse describePentestReportContent(DescribePentestReportContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestReportContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the penetration testing nodes of the current account by paging and returns the node status, execution duration, Credits usage, time, and vulnerability statistics.
     * Use OperationInput to specify query conditions. Paging is implemented by using CurrentPage and PageSize. By default, the first page is returned with 10 entries per page. You can filter nodes by node name keyword and node status.
     * The response includes TaskList and PageInfo. Duration indicates the execution duration in seconds. CreditsUsed indicates the number of Credits used. Nodes that have not started may not have a start time or duration, and nodes that have not finished may not have a completion time. All UNIX timestamps are in UNIX seconds. You can transform them to the time zone of the invoker for display.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the penetration testing nodes of the current account by paging and returns the node status, execution duration, Credits usage, time, and vulnerability statistics.</p>
     * 
     * @param tmpReq DescribePentestTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePentestTaskListResponse
     */
    public DescribePentestTaskListResponse describePentestTaskListWithOptions(DescribePentestTaskListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePentestTaskListShrinkRequest request = new DescribePentestTaskListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePentestTaskList"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePentestTaskListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the penetration testing nodes of the current account by paging and returns the node status, execution duration, Credits usage, time, and vulnerability statistics.
     * Use OperationInput to specify query conditions. Paging is implemented by using CurrentPage and PageSize. By default, the first page is returned with 10 entries per page. You can filter nodes by node name keyword and node status.
     * The response includes TaskList and PageInfo. Duration indicates the execution duration in seconds. CreditsUsed indicates the number of Credits used. Nodes that have not started may not have a start time or duration, and nodes that have not finished may not have a completion time. All UNIX timestamps are in UNIX seconds. You can transform them to the time zone of the invoker for display.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the penetration testing nodes of the current account by paging and returns the node status, execution duration, Credits usage, time, and vulnerability statistics.</p>
     * 
     * @param request DescribePentestTaskListRequest
     * @return DescribePentestTaskListResponse
     */
    public DescribePentestTaskListResponse describePentestTaskList(DescribePentestTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestTaskListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified single vulnerability under the current account by using OperationInput.VulnId and returns a VulnDetail object. This operation only reads existing vulnerability data, does not create scan or verification tasks, and does not support batch queries by using TaskId or VulnIds. You can call DescribePentestVulnList to obtain vulnerability IDs and then query the details of each vulnerability. The caller identity is determined by the gateway, and you cannot specify other accounts through request parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single vulnerability under the current account without triggering a scan or vulnerability verification.</p>
     * 
     * @param tmpReq DescribePentestVulnDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePentestVulnDetailResponse
     */
    public DescribePentestVulnDetailResponse describePentestVulnDetailWithOptions(DescribePentestVulnDetailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePentestVulnDetailShrinkRequest request = new DescribePentestVulnDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePentestVulnDetail"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePentestVulnDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a specified single vulnerability under the current account by using OperationInput.VulnId and returns a VulnDetail object. This operation only reads existing vulnerability data, does not create scan or verification tasks, and does not support batch queries by using TaskId or VulnIds. You can call DescribePentestVulnList to obtain vulnerability IDs and then query the details of each vulnerability. The caller identity is determined by the gateway, and you cannot specify other accounts through request parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single vulnerability under the current account without triggering a scan or vulnerability verification.</p>
     * 
     * @param request DescribePentestVulnDetailRequest
     * @return DescribePentestVulnDetailResponse
     */
    public DescribePentestVulnDetailResponse describePentestVulnDetail(DescribePentestVulnDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestVulnDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the penetration testing vulnerabilities of the current account by task ID with pagination. Returns information such as the vulnerability title, severity, authentication status, affected URLs, and discovery time, and supports filtering by severity.</p>
     * 
     * @param tmpReq DescribePentestVulnListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePentestVulnListResponse
     */
    public DescribePentestVulnListResponse describePentestVulnListWithOptions(DescribePentestVulnListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePentestVulnListShrinkRequest request = new DescribePentestVulnListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operationInput)) {
            request.operationInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operationInput, "OperationInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationInputShrink)) {
            query.put("OperationInput", request.operationInputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePentestVulnList"),
            new TeaPair("version", "2026-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePentestVulnListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the penetration testing vulnerabilities of the current account by task ID with pagination. Returns information such as the vulnerability title, severity, authentication status, affected URLs, and discovery time, and supports filtering by severity.</p>
     * 
     * @param request DescribePentestVulnListRequest
     * @return DescribePentestVulnListResponse
     */
    public DescribePentestVulnListResponse describePentestVulnList(DescribePentestVulnListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestVulnListWithOptions(request, runtime);
    }
}
