// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agenticbas20260630;

import com.aliyun.tea.*;
import com.aliyun.agenticbas20260630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <b>summary</b> : 
     * <p>创建渗透测试任务</p>
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
     * <b>summary</b> : 
     * <p>创建渗透测试任务</p>
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
     * <p>查询渗透测试报告内容</p>
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
     * <p>查询渗透测试报告内容</p>
     * 
     * @param request DescribePentestReportContentRequest
     * @return DescribePentestReportContentResponse
     */
    public DescribePentestReportContentResponse describePentestReportContent(DescribePentestReportContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestReportContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询渗透测试任务列表</p>
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
     * <b>summary</b> : 
     * <p>查询渗透测试任务列表</p>
     * 
     * @param request DescribePentestTaskListRequest
     * @return DescribePentestTaskListResponse
     */
    public DescribePentestTaskListResponse describePentestTaskList(DescribePentestTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询渗透测试漏洞列表</p>
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
     * <p>查询渗透测试漏洞列表</p>
     * 
     * @param request DescribePentestVulnListRequest
     * @return DescribePentestVulnListResponse
     */
    public DescribePentestVulnListResponse describePentestVulnList(DescribePentestVulnListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePentestVulnListWithOptions(request, runtime);
    }
}
