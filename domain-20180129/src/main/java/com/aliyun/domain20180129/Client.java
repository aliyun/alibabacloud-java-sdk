// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129;

import com.aliyun.tea.*;
import com.aliyun.domain20180129.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "domain-intl.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("domain", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>After the task detail result is confirmed, it can no longer be queried from the <a href="https://help.aliyun.com/document_detail/69361.html">PollTaskResult</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke AcknowledgeTaskResult to confirm the task detail result.</p>
     * 
     * @param request AcknowledgeTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcknowledgeTaskResultResponse
     */
    public AcknowledgeTaskResultResponse acknowledgeTaskResultWithOptions(AcknowledgeTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDetailNo)) {
            query.put("TaskDetailNo", request.taskDetailNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcknowledgeTaskResult"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcknowledgeTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the task detail result is confirmed, it can no longer be queried from the <a href="https://help.aliyun.com/document_detail/69361.html">PollTaskResult</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke AcknowledgeTaskResult to confirm the task detail result.</p>
     * 
     * @param request AcknowledgeTaskResultRequest
     * @return AcknowledgeTaskResultResponse
     */
    public AcknowledgeTaskResultResponse acknowledgeTaskResult(AcknowledgeTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acknowledgeTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke BatchFuzzyMatchDomainSensitiveWord to batch check whether domain names contain sensitive words.</p>
     * 
     * @param request BatchFuzzyMatchDomainSensitiveWordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchFuzzyMatchDomainSensitiveWordResponse
     */
    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWordWithOptions(BatchFuzzyMatchDomainSensitiveWordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchFuzzyMatchDomainSensitiveWord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchFuzzyMatchDomainSensitiveWordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke BatchFuzzyMatchDomainSensitiveWord to batch check whether domain names contain sensitive words.</p>
     * 
     * @param request BatchFuzzyMatchDomainSensitiveWordRequest
     * @return BatchFuzzyMatchDomainSensitiveWordResponse
     */
    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchFuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels real-name verification for a domain name.</p>
     * 
     * @param request CancelDomainVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDomainVerificationResponse
     */
    public CancelDomainVerificationResponse cancelDomainVerificationWithOptions(CancelDomainVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDomainVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDomainVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels real-name verification for a domain name.</p>
     * 
     * @param request CancelDomainVerificationRequest
     * @return CancelDomainVerificationResponse
     */
    public CancelDomainVerificationResponse cancelDomainVerification(CancelDomainVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDomainVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the CancelOperationAudit API to cancel a self-service operation audit.</p>
     * 
     * @param request CancelOperationAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOperationAuditResponse
     */
    public CancelOperationAuditResponse cancelOperationAuditWithOptions(CancelOperationAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordId)) {
            query.put("AuditRecordId", request.auditRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOperationAudit"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOperationAuditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the CancelOperationAudit API to cancel a self-service operation audit.</p>
     * 
     * @param request CancelOperationAuditRequest
     * @return CancelOperationAuditResponse
     */
    public CancelOperationAuditResponse cancelOperationAudit(CancelOperationAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOperationAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the qualification verification for &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request CancelQualificationVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelQualificationVerificationResponse
     */
    public CancelQualificationVerificationResponse cancelQualificationVerificationWithOptions(CancelQualificationVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationType)) {
            query.put("QualificationType", request.qualificationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelQualificationVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelQualificationVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the qualification verification for &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request CancelQualificationVerificationRequest
     * @return CancelQualificationVerificationResponse
     */
    public CancelQualificationVerificationResponse cancelQualificationVerification(CancelQualificationVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelQualificationVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke CancelTask to cancel an ongoing job.</p>
     * 
     * @param request CancelTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNo)) {
            query.put("TaskNo", request.taskNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke CancelTask to cancel an ongoing job.</p>
     * 
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the resource group to which a domain name belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the resource group to which a domain name belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For the legitimacy requirements of domain names, see <a href="https://help.aliyun.com/document_detail/67788.html">Domain Name Legitimacy</a>.</p>
     * <blockquote>
     * <p>The CheckDomain API has a frequency limit. The combined queries per second (QPS) limit for an Alibaba Cloud account and its RAM users is 10, and the total QPS limit for this API is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the CheckDomain API to check whether a domain name can be registered.</p>
     * 
     * @param request CheckDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feeCommand)) {
            query.put("FeeCommand", request.feeCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feeCurrency)) {
            query.put("FeeCurrency", request.feeCurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feePeriod)) {
            query.put("FeePeriod", request.feePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomain"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>For the legitimacy requirements of domain names, see <a href="https://help.aliyun.com/document_detail/67788.html">Domain Name Legitimacy</a>.</p>
     * <blockquote>
     * <p>The CheckDomain API has a frequency limit. The combined queries per second (QPS) limit for an Alibaba Cloud account and its RAM users is 10, and the total QPS limit for this API is 100.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the CheckDomain API to check whether a domain name can be registered.</p>
     * 
     * @param request CheckDomainRequest
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the trademark keyword key based on the provided domain name.</p>
     * 
     * @param request CheckDomainSunriseClaimRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDomainSunriseClaimResponse
     */
    public CheckDomainSunriseClaimResponse checkDomainSunriseClaimWithOptions(CheckDomainSunriseClaimRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomainSunriseClaim"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainSunriseClaimResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the trademark keyword key based on the provided domain name.</p>
     * 
     * @param request CheckDomainSunriseClaimRequest
     * @return CheckDomainSunriseClaimResponse
     */
    public CheckDomainSunriseClaimResponse checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainSunriseClaimWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls CheckIntlFixPriceDomainStatus to check the status and price of an international fixed-price domain name that is on sale.</p>
     * 
     * @param request CheckIntlFixPriceDomainStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckIntlFixPriceDomainStatusResponse
     */
    public CheckIntlFixPriceDomainStatusResponse checkIntlFixPriceDomainStatusWithOptions(CheckIntlFixPriceDomainStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckIntlFixPriceDomainStatus"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckIntlFixPriceDomainStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls CheckIntlFixPriceDomainStatus to check the status and price of an international fixed-price domain name that is on sale.</p>
     * 
     * @param request CheckIntlFixPriceDomainStatusRequest
     * @return CheckIntlFixPriceDomainStatusResponse
     */
    public CheckIntlFixPriceDomainStatusResponse checkIntlFixPriceDomainStatus(CheckIntlFixPriceDomainStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkIntlFixPriceDomainStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the maximum number of years for which a domain name can be purchased or renewed.</p>
     * 
     * @param request CheckMaxYearOfServerLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMaxYearOfServerLockResponse
     */
    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLockWithOptions(CheckMaxYearOfServerLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkAction)) {
            query.put("CheckAction", request.checkAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMaxYearOfServerLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMaxYearOfServerLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the maximum number of years for which a domain name can be purchased or renewed.</p>
     * 
     * @param request CheckMaxYearOfServerLockRequest
     * @return CheckMaxYearOfServerLockResponse
     */
    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMaxYearOfServerLockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the domain name has a registry lock service request with the <strong>Processing</strong> status at the domain name registry.</p>
     * 
     * @param request CheckProcessingServerLockApplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckProcessingServerLockApplyResponse
     */
    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApplyWithOptions(CheckProcessingServerLockApplyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feePeriod)) {
            query.put("FeePeriod", request.feePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckProcessingServerLockApply"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckProcessingServerLockApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the domain name has a registry lock service request with the <strong>Processing</strong> status at the domain name registry.</p>
     * 
     * @param request CheckProcessingServerLockApplyRequest
     * @return CheckProcessingServerLockApplyResponse
     */
    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkProcessingServerLockApplyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the CheckTransferInFeasibility API to validate whether a domain name can be transferred in.</p>
     * 
     * @param request CheckTransferInFeasibilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckTransferInFeasibilityResponse
     */
    public CheckTransferInFeasibilityResponse checkTransferInFeasibilityWithOptions(CheckTransferInFeasibilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferAuthorizationCode)) {
            query.put("TransferAuthorizationCode", request.transferAuthorizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTransferInFeasibility"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTransferInFeasibilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the CheckTransferInFeasibility API to validate whether a domain name can be transferred in.</p>
     * 
     * @param request CheckTransferInFeasibilityRequest
     * @return CheckTransferInFeasibilityResponse
     */
    public CheckTransferInFeasibilityResponse checkTransferInFeasibility(CheckTransferInFeasibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkTransferInFeasibilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Directly confirm the transfer-in mailbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke ConfirmTransferInEmail to confirm the transfer-in mailbox.</p>
     * 
     * @param request ConfirmTransferInEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmTransferInEmailResponse
     */
    public ConfirmTransferInEmailResponse confirmTransferInEmailWithOptions(ConfirmTransferInEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmTransferInEmail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmTransferInEmailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Directly confirm the transfer-in mailbox.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke ConfirmTransferInEmail to confirm the transfer-in mailbox.</p>
     * 
     * @param request ConfirmTransferInEmailRequest
     * @return ConfirmTransferInEmailResponse
     */
    public ConfirmTransferInEmailResponse confirmTransferInEmail(ConfirmTransferInEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmTransferInEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an international fixed-price domain name order by calling CreateIntlFixedPriceDomainOrder.</p>
     * 
     * @param request CreateIntlFixedPriceDomainOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIntlFixedPriceDomainOrderResponse
     */
    public CreateIntlFixedPriceDomainOrderResponse createIntlFixedPriceDomainOrderWithOptions(CreateIntlFixedPriceDomainOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedPrice)) {
            query.put("ExpectedPrice", request.expectedPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntlFixedPriceDomainOrder"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntlFixedPriceDomainOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an international fixed-price domain name order by calling CreateIntlFixedPriceDomainOrder.</p>
     * 
     * @param request CreateIntlFixedPriceDomainOrderRequest
     * @return CreateIntlFixedPriceDomainOrderResponse
     */
    public CreateIntlFixedPriceDomainOrderResponse createIntlFixedPriceDomainOrder(CreateIntlFixedPriceDomainOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIntlFixedPriceDomainOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch delete domain contact templates.</p>
     * 
     * @param request DeleteContactTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactTemplatesResponse
     */
    public DeleteContactTemplatesResponse deleteContactTemplatesWithOptions(DeleteContactTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileIds)) {
            query.put("RegistrantProfileIds", request.registrantProfileIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactTemplates"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch delete domain contact templates.</p>
     * 
     * @param request DeleteContactTemplatesRequest
     * @return DeleteContactTemplatesResponse
     */
    public DeleteContactTemplatesResponse deleteContactTemplates(DeleteContactTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deleting a group containing more than 1,000 domain names is an asynchronous procedure. You must wait for the system to process the request.</p>
     * 
     * @param request DeleteDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainGroupResponse
     */
    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainGroup"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deleting a group containing more than 1,000 domain names is an asynchronous procedure. You must wait for the system to process the request.</p>
     * 
     * @param request DeleteDomainGroupRequest
     * @return DeleteDomainGroupResponse
     */
    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If you want to use the email address again after deletion, you must complete email verification again.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DeleteEmailVerification API to delete an email address that has passed verification.</p>
     * 
     * @param request DeleteEmailVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEmailVerificationResponse
     */
    public DeleteEmailVerificationResponse deleteEmailVerificationWithOptions(DeleteEmailVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEmailVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEmailVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If you want to use the email address again after deletion, you must complete email verification again.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DeleteEmailVerification API to delete an email address that has passed verification.</p>
     * 
     * @param request DeleteEmailVerificationRequest
     * @return DeleteEmailVerificationResponse
     */
    public DeleteEmailVerificationResponse deleteEmailVerification(DeleteEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEmailVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If the API call succeeds, the System immediately deletes the corresponding domain name registrant profile.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DeleteRegistrantProfile API to delete a specified domain name registrant profile.</p>
     * 
     * @param request DeleteRegistrantProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistrantProfileResponse
     */
    public DeleteRegistrantProfileResponse deleteRegistrantProfileWithOptions(DeleteRegistrantProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistrantProfile"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistrantProfileResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If the API call succeeds, the System immediately deletes the corresponding domain name registrant profile.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DeleteRegistrantProfile API to delete a specified domain name registrant profile.</p>
     * 
     * @param request DeleteRegistrantProfileRequest
     * @return DeleteRegistrantProfileResponse
     */
    public DeleteRegistrantProfileResponse deleteRegistrantProfile(DeleteRegistrantProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegistrantProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information from the domain name knowledge base.</p>
     * 
     * @param request DomainKnowledgeRetrieveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DomainKnowledgeRetrieveResponse
     */
    public DomainKnowledgeRetrieveResponse domainKnowledgeRetrieveWithOptions(DomainKnowledgeRetrieveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalTopN)) {
            query.put("GlobalTopN", request.globalTopN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.site)) {
            query.put("Site", request.site);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DomainKnowledgeRetrieve"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DomainKnowledgeRetrieveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information from the domain name knowledge base.</p>
     * 
     * @param request DomainKnowledgeRetrieveRequest
     * @return DomainKnowledgeRetrieveResponse
     */
    public DomainKnowledgeRetrieveResponse domainKnowledgeRetrieve(DomainKnowledgeRetrieveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.domainKnowledgeRetrieveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the special business process for a domain name</p>
     * 
     * @param request DomainSpecialBizCancelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DomainSpecialBizCancelResponse
     */
    public DomainSpecialBizCancelResponse domainSpecialBizCancelWithOptions(DomainSpecialBizCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DomainSpecialBizCancel"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DomainSpecialBizCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the special business process for a domain name</p>
     * 
     * @param request DomainSpecialBizCancelRequest
     * @return DomainSpecialBizCancelResponse
     */
    public DomainSpecialBizCancelResponse domainSpecialBizCancel(DomainSpecialBizCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.domainSpecialBizCancelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>邮箱验证通过</p>
     * 
     * @param request EmailVerifiedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EmailVerifiedResponse
     */
    public EmailVerifiedResponse emailVerifiedWithOptions(EmailVerifiedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EmailVerified"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EmailVerifiedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>邮箱验证通过</p>
     * 
     * @param request EmailVerifiedRequest
     * @return EmailVerifiedResponse
     */
    public EmailVerifiedResponse emailVerified(EmailVerifiedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.emailVerifiedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke FuzzyMatchDomainSensitiveWord to check whether a domain name contains sensitive words.</p>
     * 
     * @param request FuzzyMatchDomainSensitiveWordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FuzzyMatchDomainSensitiveWordResponse
     */
    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWordWithOptions(FuzzyMatchDomainSensitiveWordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FuzzyMatchDomainSensitiveWord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FuzzyMatchDomainSensitiveWordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke FuzzyMatchDomainSensitiveWord to check whether a domain name contains sensitive words.</p>
     * 
     * @param request FuzzyMatchDomainSensitiveWordRequest
     * @return FuzzyMatchDomainSensitiveWordResponse
     */
    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names for fixed-price orders at the international site (alibabacloud.com).</p>
     * 
     * @param request GetIntlFixPriceDomainListUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntlFixPriceDomainListUrlResponse
     */
    public GetIntlFixPriceDomainListUrlResponse getIntlFixPriceDomainListUrlWithOptions(GetIntlFixPriceDomainListUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listDate)) {
            query.put("ListDate", request.listDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntlFixPriceDomainListUrl"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntlFixPriceDomainListUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of domain names for fixed-price orders at the international site (alibabacloud.com).</p>
     * 
     * @param request GetIntlFixPriceDomainListUrlRequest
     * @return GetIntlFixPriceDomainListUrlResponse
     */
    public GetIntlFixPriceDomainListUrlResponse getIntlFixPriceDomainListUrl(GetIntlFixPriceDomainListUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntlFixPriceDomainListUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetOperationOssUploadPolicy to obtain the storage information for review materials.</p>
     * 
     * @param request GetOperationOssUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOperationOssUploadPolicyResponse
     */
    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicyWithOptions(GetOperationOssUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditType)) {
            query.put("AuditType", request.auditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperationOssUploadPolicy"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationOssUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetOperationOssUploadPolicy to obtain the storage information for review materials.</p>
     * 
     * @param request GetOperationOssUploadPolicyRequest
     * @return GetOperationOssUploadPolicyResponse
     */
    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationOssUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the authorization policy corresponding to the &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request GetQualificationUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualificationUploadPolicyResponse
     */
    public GetQualificationUploadPolicyResponse getQualificationUploadPolicyWithOptions(GetQualificationUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualificationUploadPolicy"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualificationUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the authorization policy corresponding to the &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request GetQualificationUploadPolicyRequest
     * @return GetQualificationUploadPolicyResponse
     */
    public GetQualificationUploadPolicyResponse getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualificationUploadPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the ListEmailVerification API to query the email verification list.</p>
     * 
     * @param request ListEmailVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEmailVerificationResponse
     */
    public ListEmailVerificationResponse listEmailVerificationWithOptions(ListEmailVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginCreateTime)) {
            query.put("BeginCreateTime", request.beginCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            query.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationStatus)) {
            query.put("VerificationStatus", request.verificationStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEmailVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEmailVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the ListEmailVerification API to query the email verification list.</p>
     * 
     * @param request ListEmailVerificationRequest
     * @return ListEmailVerificationResponse
     */
    public ListEmailVerificationResponse listEmailVerification(ListEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEmailVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about domain names for which registry locks are enabled.</p>
     * 
     * @param request ListServerLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerLockResponse
     */
    public ListServerLockResponse listServerLockWithOptions(ListServerLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginStartDate)) {
            query.put("BeginStartDate", request.beginStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExpireDate)) {
            query.put("EndExpireDate", request.endExpireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endStartDate)) {
            query.put("EndStartDate", request.endStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockProductId)) {
            query.put("LockProductId", request.lockProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByType)) {
            query.put("OrderByType", request.orderByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverLockStatus)) {
            query.put("ServerLockStatus", request.serverLockStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startExpireDate)) {
            query.put("StartExpireDate", request.startExpireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about domain names for which registry locks are enabled.</p>
     * 
     * @param request ListServerLockRequest
     * @return ListServerLockResponse
     */
    public ListServerLockResponse listServerLock(ListServerLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerLockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>LookupTmchNotice</code> to look up a trademark term from the TMCH by passing it as the <code>key</code>.</p>
     * 
     * @param request LookupTmchNoticeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LookupTmchNoticeResponse
     */
    public LookupTmchNoticeResponse lookupTmchNoticeWithOptions(LookupTmchNoticeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.claimKey)) {
            query.put("ClaimKey", request.claimKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupTmchNotice"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupTmchNoticeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>LookupTmchNotice</code> to look up a trademark term from the TMCH by passing it as the <code>key</code>.</p>
     * 
     * @param request LookupTmchNoticeRequest
     * @return LookupTmchNoticeResponse
     */
    public LookupTmchNoticeResponse lookupTmchNotice(LookupTmchNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupTmchNoticeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API must be used together with <a href="~~AcknowledgeTaskResult~~">AcknowledgeTaskResult</a> to confirm job results. Once a job result is confirmed, the corresponding job record can no longer be queried through this API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke PollTaskResult to obtain a list of domain name job details that have completed execution (including jobs that succeeded or failed and exceeded the retry count).</p>
     * 
     * @param request PollTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PollTaskResultResponse
     */
    public PollTaskResultResponse pollTaskResultWithOptions(PollTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNo)) {
            query.put("TaskNo", request.taskNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskResultStatus)) {
            query.put("TaskResultStatus", request.taskResultStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PollTaskResult"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PollTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API must be used together with <a href="~~AcknowledgeTaskResult~~">AcknowledgeTaskResult</a> to confirm job results. Once a job result is confirmed, the corresponding job record can no longer be queried through this API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke PollTaskResult to obtain a list of domain name job details that have completed execution (including jobs that succeeded or failed and exceeded the retry count).</p>
     * 
     * @param request PollTaskResultRequest
     * @return PollTaskResultResponse
     */
    public PollTaskResultResponse pollTaskResult(PollTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pollTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Search for domain names under your current Alibaba Cloud account that meet specific conditions. A maximum of <strong>5000</strong> entries are displayed. If the result reaches <strong>5000</strong> entries, narrow your search scope.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke QueryAdvancedDomainList to perform an advanced search of the domain name list.</p>
     * 
     * @param request QueryAdvancedDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAdvancedDomainListResponse
     */
    public QueryAdvancedDomainListResponse queryAdvancedDomainListWithOptions(QueryAdvancedDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameSort)) {
            query.put("DomainNameSort", request.domainNameSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExpirationDate)) {
            query.put("EndExpirationDate", request.endExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endLength)) {
            query.put("EndLength", request.endLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRegistrationDate)) {
            query.put("EndRegistrationDate", request.endRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excluded)) {
            query.put("Excluded", request.excluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedPrefix)) {
            query.put("ExcludedPrefix", request.excludedPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedSuffix)) {
            query.put("ExcludedSuffix", request.excludedSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationDateSort)) {
            query.put("ExpirationDateSort", request.expirationDateSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.form)) {
            query.put("Form", request.form);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPremiumDomain)) {
            query.put("IsPremiumDomain", request.isPremiumDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordPrefix)) {
            query.put("KeyWordPrefix", request.keyWordPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordSuffix)) {
            query.put("KeyWordSuffix", request.keyWordSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDomainType)) {
            query.put("ProductDomainType", request.productDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDomainTypeSort)) {
            query.put("ProductDomainTypeSort", request.productDomainTypeSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationDateSort)) {
            query.put("RegistrationDateSort", request.registrationDateSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startExpirationDate)) {
            query.put("StartExpirationDate", request.startExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startLength)) {
            query.put("StartLength", request.startLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRegistrationDate)) {
            query.put("StartRegistrationDate", request.startRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suffixs)) {
            query.put("Suffixs", request.suffixs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeType)) {
            query.put("TradeType", request.tradeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAdvancedDomainList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAdvancedDomainListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Search for domain names under your current Alibaba Cloud account that meet specific conditions. A maximum of <strong>5000</strong> entries are displayed. If the result reaches <strong>5000</strong> entries, narrow your search scope.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke QueryAdvancedDomainList to perform an advanced search of the domain name list.</p>
     * 
     * @param request QueryAdvancedDomainListRequest
     * @return QueryAdvancedDomainListResponse
     */
    public QueryAdvancedDomainListResponse queryAdvancedDomainList(QueryAdvancedDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAdvancedDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryArtExtension API to query Art extension information.</p>
     * 
     * @param request QueryArtExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryArtExtensionResponse
     */
    public QueryArtExtensionResponse queryArtExtensionWithOptions(QueryArtExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryArtExtension"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryArtExtensionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryArtExtension API to query Art extension information.</p>
     * 
     * @param request QueryArtExtensionRequest
     * @return QueryArtExtensionResponse
     */
    public QueryArtExtensionResponse queryArtExtension(QueryArtExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryArtExtensionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call QueryChangeLogList to get a paginated list of the operation logs.</p>
     * 
     * @param request QueryChangeLogListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChangeLogListResponse
     */
    public QueryChangeLogListResponse queryChangeLogListWithOptions(QueryChangeLogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChangeLogList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChangeLogListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call QueryChangeLogList to get a paginated list of the operation logs.</p>
     * 
     * @param request QueryChangeLogListRequest
     * @return QueryChangeLogListResponse
     */
    public QueryChangeLogListResponse queryChangeLogList(QueryChangeLogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChangeLogListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryContactInfo to query domain contact information.</p>
     * 
     * @param request QueryContactInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryContactInfoResponse
     */
    public QueryContactInfoResponse queryContactInfoWithOptions(QueryContactInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContactInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContactInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryContactInfo to query domain contact information.</p>
     * 
     * @param request QueryContactInfoRequest
     * @return QueryContactInfoResponse
     */
    public QueryContactInfoResponse queryContactInfo(QueryContactInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContactInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryDSRecord to query the DS records of a domain name.</p>
     * 
     * @param request QueryDSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDSRecordResponse
     */
    public QueryDSRecordResponse queryDSRecordWithOptions(QueryDSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDSRecord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDSRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryDSRecord to query the DS records of a domain name.</p>
     * 
     * @param request QueryDSRecordRequest
     * @return QueryDSRecordResponse
     */
    public QueryDSRecordResponse queryDSRecord(QueryDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDSRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS host for a domain name.</p>
     * 
     * @param request QueryDnsHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDnsHostResponse
     */
    public QueryDnsHostResponse queryDnsHostWithOptions(QueryDnsHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDnsHost"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDnsHostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the DNS host for a domain name.</p>
     * 
     * @param request QueryDnsHostRequest
     * @return QueryDnsHostResponse
     */
    public QueryDnsHostResponse queryDnsHost(QueryDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDnsHostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryDomainAdminDivision API to query Chinese administrative regions.</p>
     * 
     * @param request QueryDomainAdminDivisionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainAdminDivisionResponse
     */
    public QueryDomainAdminDivisionResponse queryDomainAdminDivisionWithOptions(QueryDomainAdminDivisionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainAdminDivision"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainAdminDivisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryDomainAdminDivision API to query Chinese administrative regions.</p>
     * 
     * @param request QueryDomainAdminDivisionRequest
     * @return QueryDomainAdminDivisionResponse
     */
    public QueryDomainAdminDivisionResponse queryDomainAdminDivision(QueryDomainAdminDivisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainAdminDivisionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>QueryDomainByDomainName</code> to retrieve information about a domain name.</p>
     * 
     * @param request QueryDomainByDomainNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainByDomainNameResponse
     */
    public QueryDomainByDomainNameResponse queryDomainByDomainNameWithOptions(QueryDomainByDomainNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainByDomainName"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainByDomainNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>QueryDomainByDomainName</code> to retrieve information about a domain name.</p>
     * 
     * @param request QueryDomainByDomainNameRequest
     * @return QueryDomainByDomainNameResponse
     */
    public QueryDomainByDomainNameResponse queryDomainByDomainName(QueryDomainByDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainByDomainNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>QueryDomainByInstanceId</code> to retrieve the basic information of a domain name by instance ID.</p>
     * 
     * @param request QueryDomainByInstanceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainByInstanceIdResponse
     */
    public QueryDomainByInstanceIdResponse queryDomainByInstanceIdWithOptions(QueryDomainByInstanceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainByInstanceId"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainByInstanceIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call <code>QueryDomainByInstanceId</code> to retrieve the basic information of a domain name by instance ID.</p>
     * 
     * @param request QueryDomainByInstanceIdRequest
     * @return QueryDomainByInstanceIdResponse
     */
    public QueryDomainByInstanceIdResponse queryDomainByInstanceId(QueryDomainByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainByInstanceIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain groups.</p>
     * 
     * @param request QueryDomainGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainGroupListResponse
     */
    public QueryDomainGroupListResponse queryDomainGroupListWithOptions(QueryDomainGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupName)) {
            query.put("DomainGroupName", request.domainGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByType)) {
            query.put("OrderByType", request.orderByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKeyType)) {
            query.put("OrderKeyType", request.orderKeyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDeletingGroup)) {
            query.put("ShowDeletingGroup", request.showDeletingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainGroupList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain groups.</p>
     * 
     * @param request QueryDomainGroupListRequest
     * @return QueryDomainGroupListResponse
     */
    public QueryDomainGroupListResponse queryDomainGroupList(QueryDomainGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainGroupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of domain names in your account.</p>
     * 
     * @param request QueryDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainListWithOptions(QueryDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewEnabled)) {
            query.put("AutoRenewEnabled", request.autoRenewEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ccompany)) {
            query.put("Ccompany", request.ccompany);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dns)) {
            query.put("Dns", request.dns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExpirationDate)) {
            query.put("EndExpirationDate", request.endExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRegistrationDate)) {
            query.put("EndRegistrationDate", request.endRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByType)) {
            query.put("OrderByType", request.orderByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderKeyType)) {
            query.put("OrderKeyType", request.orderKeyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDomainType)) {
            query.put("ProductDomainType", request.productDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrar)) {
            query.put("Registrar", request.registrar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startExpirationDate)) {
            query.put("StartExpirationDate", request.startExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRegistrationDate)) {
            query.put("StartRegistrationDate", request.startRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of domain names in your account.</p>
     * 
     * @param request QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainList(QueryDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryDomainRealNameVerificationInfo to query real-name verification information for a domain name.</p>
     * 
     * @param request QueryDomainRealNameVerificationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainRealNameVerificationInfoResponse
     */
    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfoWithOptions(QueryDomainRealNameVerificationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchImage)) {
            query.put("FetchImage", request.fetchImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainRealNameVerificationInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainRealNameVerificationInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryDomainRealNameVerificationInfo to query real-name verification information for a domain name.</p>
     * 
     * @param request QueryDomainRealNameVerificationInfoRequest
     * @return QueryDomainRealNameVerificationInfoResponse
     */
    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainRealNameVerificationInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实时查询域名价格</p>
     * 
     * @param tmpReq QueryDomainRealTimePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainRealTimePriceResponse
     */
    public QueryDomainRealTimePriceResponse queryDomainRealTimePriceWithOptions(QueryDomainRealTimePriceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryDomainRealTimePriceShrinkRequest request = new QueryDomainRealTimePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domainItem)) {
            request.domainItemShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domainItem, "DomainItem", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            query.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainItemShrink)) {
            query.put("DomainItem", request.domainItemShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainRealTimePrice"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainRealTimePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时查询域名价格</p>
     * 
     * @param request QueryDomainRealTimePriceRequest
     * @return QueryDomainRealTimePriceResponse
     */
    public QueryDomainRealTimePriceResponse queryDomainRealTimePrice(QueryDomainRealTimePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainRealTimePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain name special business details</p>
     * 
     * @param request QueryDomainSpecialBizDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainSpecialBizDetailResponse
     */
    public QueryDomainSpecialBizDetailResponse queryDomainSpecialBizDetailWithOptions(QueryDomainSpecialBizDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainSpecialBizDetail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainSpecialBizDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain name special business details</p>
     * 
     * @param request QueryDomainSpecialBizDetailRequest
     * @return QueryDomainSpecialBizDetailResponse
     */
    public QueryDomainSpecialBizDetailResponse queryDomainSpecialBizDetail(QueryDomainSpecialBizDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainSpecialBizDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain special business details by domain name</p>
     * 
     * @param request QueryDomainSpecialBizInfoByDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainSpecialBizInfoByDomainResponse
     */
    public QueryDomainSpecialBizInfoByDomainResponse queryDomainSpecialBizInfoByDomainWithOptions(QueryDomainSpecialBizInfoByDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainSpecialBizInfoByDomain"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainSpecialBizInfoByDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query domain special business details by domain name</p>
     * 
     * @param request QueryDomainSpecialBizInfoByDomainRequest
     * @return QueryDomainSpecialBizInfoByDomainResponse
     */
    public QueryDomainSpecialBizInfoByDomainResponse queryDomainSpecialBizInfoByDomain(QueryDomainSpecialBizInfoByDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainSpecialBizInfoByDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available domain name suffixes.</p>
     * 
     * @param request QueryDomainSuffixRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainSuffixResponse
     */
    public QueryDomainSuffixResponse queryDomainSuffixWithOptions(QueryDomainSuffixRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainSuffix"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainSuffixResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available domain name suffixes.</p>
     * 
     * @param request QueryDomainSuffixRequest
     * @return QueryDomainSuffixResponse
     */
    public QueryDomainSuffixResponse queryDomainSuffix(QueryDomainSuffixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainSuffixWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryEmailVerification API to query the email verification result.</p>
     * 
     * @param request QueryEmailVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEmailVerificationResponse
     */
    public QueryEmailVerificationResponse queryEmailVerificationWithOptions(QueryEmailVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEmailVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEmailVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryEmailVerification API to query the email verification result.</p>
     * 
     * @param request QueryEmailVerificationRequest
     * @return QueryEmailVerificationResponse
     */
    public QueryEmailVerificationResponse queryEmailVerification(QueryEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEmailVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryEnsAssociation API to query the wallet address attached in the ENS system.</p>
     * 
     * @param request QueryEnsAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEnsAssociationResponse
     */
    public QueryEnsAssociationResponse queryEnsAssociationWithOptions(QueryEnsAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEnsAssociation"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEnsAssociationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryEnsAssociation API to query the wallet address attached in the ENS system.</p>
     * 
     * @param request QueryEnsAssociationRequest
     * @return QueryEnsAssociationResponse
     */
    public QueryEnsAssociationResponse queryEnsAssociation(QueryEnsAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEnsAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the reasons for real-name verification (including naming review) failure for a domain name.</p>
     * 
     * @param request QueryFailReasonForDomainRealNameVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFailReasonForDomainRealNameVerificationResponse
     */
    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerificationWithOptions(QueryFailReasonForDomainRealNameVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameVerificationAction)) {
            query.put("RealNameVerificationAction", request.realNameVerificationAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFailReasonForDomainRealNameVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFailReasonForDomainRealNameVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the reasons for real-name verification (including naming review) failure for a domain name.</p>
     * 
     * @param request QueryFailReasonForDomainRealNameVerificationRequest
     * @return QueryFailReasonForDomainRealNameVerificationResponse
     */
    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailReasonForDomainRealNameVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryFailReasonForRegistrantProfileRealNameVerification API to query the reasons why identity verification for an information template failed the Review.</p>
     * 
     * @param request QueryFailReasonForRegistrantProfileRealNameVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFailReasonForRegistrantProfileRealNameVerificationResponse
     */
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileID)) {
            query.put("RegistrantProfileID", request.registrantProfileID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFailReasonForRegistrantProfileRealNameVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFailReasonForRegistrantProfileRealNameVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryFailReasonForRegistrantProfileRealNameVerification API to query the reasons why identity verification for an information template failed the Review.</p>
     * 
     * @param request QueryFailReasonForRegistrantProfileRealNameVerificationRequest
     * @return QueryFailReasonForRegistrantProfileRealNameVerificationResponse
     */
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the reasons for qualification verification failure for &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request QueryFailingReasonListForQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFailingReasonListForQualificationResponse
     */
    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualificationWithOptions(QueryFailingReasonListForQualificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationType)) {
            query.put("QualificationType", request.qualificationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFailingReasonListForQualification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFailingReasonListForQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the reasons for qualification verification failure for &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request QueryFailingReasonListForQualificationRequest
     * @return QueryFailingReasonListForQualificationResponse
     */
    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailingReasonListForQualificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of international fixed-price orders by calling QueryIntlFixedPriceOrderList.</p>
     * 
     * @param request QueryIntlFixedPriceOrderListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIntlFixedPriceOrderListResponse
     */
    public QueryIntlFixedPriceOrderListResponse queryIntlFixedPriceOrderListWithOptions(QueryIntlFixedPriceOrderListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIntlFixedPriceOrderList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIntlFixedPriceOrderListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of international fixed-price orders by calling QueryIntlFixedPriceOrderList.</p>
     * 
     * @param request QueryIntlFixedPriceOrderListRequest
     * @return QueryIntlFixedPriceOrderListResponse
     */
    public QueryIntlFixedPriceOrderListResponse queryIntlFixedPriceOrderList(QueryIntlFixedPriceOrderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryIntlFixedPriceOrderListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryLocalEnsAssociation to query the ENS binding address recorded in the Alibaba Cloud system.</p>
     * 
     * @param request QueryLocalEnsAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLocalEnsAssociationResponse
     */
    public QueryLocalEnsAssociationResponse queryLocalEnsAssociationWithOptions(QueryLocalEnsAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLocalEnsAssociation"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLocalEnsAssociationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryLocalEnsAssociation to query the ENS binding address recorded in the Alibaba Cloud system.</p>
     * 
     * @param request QueryLocalEnsAssociationRequest
     * @return QueryLocalEnsAssociationResponse
     */
    public QueryLocalEnsAssociationResponse queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocalEnsAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryOperationAuditInfoDetail API to query the details of a self-service operation review record.</p>
     * 
     * @param request QueryOperationAuditInfoDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOperationAuditInfoDetailResponse
     */
    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetailWithOptions(QueryOperationAuditInfoDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordId)) {
            query.put("AuditRecordId", request.auditRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOperationAuditInfoDetail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOperationAuditInfoDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryOperationAuditInfoDetail API to query the details of a self-service operation review record.</p>
     * 
     * @param request QueryOperationAuditInfoDetailRequest
     * @return QueryOperationAuditInfoDetailResponse
     */
    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOperationAuditInfoDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryOperationAuditInfoList to query the list of review records for self-service operations.</p>
     * 
     * @param request QueryOperationAuditInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOperationAuditInfoListResponse
     */
    public QueryOperationAuditInfoListResponse queryOperationAuditInfoListWithOptions(QueryOperationAuditInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditType)) {
            query.put("AuditType", request.auditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOperationAuditInfoList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOperationAuditInfoListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryOperationAuditInfoList to query the list of review records for self-service operations.</p>
     * 
     * @param request QueryOperationAuditInfoListRequest
     * @return QueryOperationAuditInfoListResponse
     */
    public QueryOperationAuditInfoListResponse queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOperationAuditInfoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the qualification verification details of &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request QueryQualificationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryQualificationDetailResponse
     */
    public QueryQualificationDetailResponse queryQualificationDetailWithOptions(QueryQualificationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationType)) {
            query.put("QualificationType", request.qualificationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQualificationDetail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQualificationDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the qualification verification details of &quot;.restaurant&quot; and &quot;.trademark&quot; domain names.</p>
     * 
     * @param request QueryQualificationDetailRequest
     * @return QueryQualificationDetailResponse
     */
    public QueryQualificationDetailResponse queryQualificationDetail(QueryQualificationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryQualificationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryRegistrantProfileRealNameVerificationInfo API to query the identity verification documents of an information template.</p>
     * 
     * @param request QueryRegistrantProfileRealNameVerificationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfoWithOptions(QueryRegistrantProfileRealNameVerificationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchImage)) {
            query.put("FetchImage", request.fetchImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRegistrantProfileRealNameVerificationInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRegistrantProfileRealNameVerificationInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the QueryRegistrantProfileRealNameVerificationInfo API to query the identity verification documents of an information template.</p>
     * 
     * @param request QueryRegistrantProfileRealNameVerificationInfoRequest
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRegistrantProfileRealNameVerificationInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can pass in optional parameters to help you find registrant profiles more precisely. For example:</p>
     * <ul>
     * <li>If you already know the ID of a registrant profile, you can pass in the registrant profile ID to query detailed profile information.</li>
     * <li>If you do not know the ID of a registrant profile, you can pass in parameters such as the domain name registrant name to query detailed profile information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain name registrant profiles under the current account.</p>
     * 
     * @param request QueryRegistrantProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRegistrantProfilesResponse
     */
    public QueryRegistrantProfilesResponse queryRegistrantProfilesWithOptions(QueryRegistrantProfilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRegistrantProfile)) {
            query.put("DefaultRegistrantProfile", request.defaultRegistrantProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameStatus)) {
            query.put("RealNameStatus", request.realNameStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileType)) {
            query.put("RegistrantProfileType", request.registrantProfileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRegistrantProfiles"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRegistrantProfilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can pass in optional parameters to help you find registrant profiles more precisely. For example:</p>
     * <ul>
     * <li>If you already know the ID of a registrant profile, you can pass in the registrant profile ID to query detailed profile information.</li>
     * <li>If you do not know the ID of a registrant profile, you can pass in parameters such as the domain name registrant name to query detailed profile information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the domain name registrant profiles under the current account.</p>
     * 
     * @param request QueryRegistrantProfilesRequest
     * @return QueryRegistrantProfilesResponse
     */
    public QueryRegistrantProfilesResponse queryRegistrantProfiles(QueryRegistrantProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRegistrantProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the registry lock details of a domain name.</p>
     * 
     * @param request QueryServerLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryServerLockResponse
     */
    public QueryServerLockResponse queryServerLockWithOptions(QueryServerLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryServerLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryServerLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the registry lock details of a domain name.</p>
     * 
     * @param request QueryServerLockRequest
     * @return QueryServerLockResponse
     */
    public QueryServerLockResponse queryServerLock(QueryServerLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryServerLockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryTaskDetailHistory to perform a paged query on the detail history list of a specified domain name job.</p>
     * 
     * @param request QueryTaskDetailHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskDetailHistoryResponse
     */
    public QueryTaskDetailHistoryResponse queryTaskDetailHistoryWithOptions(QueryTaskDetailHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameCursor)) {
            query.put("DomainNameCursor", request.domainNameCursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDetailNoCursor)) {
            query.put("TaskDetailNoCursor", request.taskDetailNoCursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNo)) {
            query.put("TaskNo", request.taskNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskDetailHistory"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskDetailHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryTaskDetailHistory to perform a paged query on the detail history list of a specified domain name job.</p>
     * 
     * @param request QueryTaskDetailHistoryRequest
     * @return QueryTaskDetailHistoryResponse
     */
    public QueryTaskDetailHistoryResponse queryTaskDetailHistory(QueryTaskDetailHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskDetailHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details list of a specified domain name task by paging.</p>
     * 
     * @param request QueryTaskDetailListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskDetailListResponse
     */
    public QueryTaskDetailListResponse queryTaskDetailListWithOptions(QueryTaskDetailListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNo)) {
            query.put("TaskNo", request.taskNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskDetailList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskDetailListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details list of a specified domain name task by paging.</p>
     * 
     * @param request QueryTaskDetailListRequest
     * @return QueryTaskDetailListResponse
     */
    public QueryTaskDetailListResponse queryTaskDetailList(QueryTaskDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskDetailListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryTaskInfoHistory to perform a paged query of the domain name job history list under your account.</p>
     * 
     * @param request QueryTaskInfoHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskInfoHistoryResponse
     */
    public QueryTaskInfoHistoryResponse queryTaskInfoHistoryWithOptions(QueryTaskInfoHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginCreateTime)) {
            query.put("BeginCreateTime", request.beginCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeCursor)) {
            query.put("CreateTimeCursor", request.createTimeCursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            query.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskNoCursor)) {
            query.put("TaskNoCursor", request.taskNoCursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskInfoHistory"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskInfoHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke QueryTaskInfoHistory to perform a paged query of the domain name job history list under your account.</p>
     * 
     * @param request QueryTaskInfoHistoryRequest
     * @return QueryTaskInfoHistoryResponse
     */
    public QueryTaskInfoHistoryResponse queryTaskInfoHistory(QueryTaskInfoHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskInfoHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTaskList to perform a paged query of the domain name job list under your account.</p>
     * 
     * @param request QueryTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginCreateTime)) {
            query.put("BeginCreateTime", request.beginCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            query.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTaskList to perform a paged query of the domain name job list under your account.</p>
     * 
     * @param request QueryTaskListRequest
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferInByInstanceId to query domain name transfer-in information by instance ID.</p>
     * 
     * @param request QueryTransferInByInstanceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTransferInByInstanceIdResponse
     */
    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdWithOptions(QueryTransferInByInstanceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTransferInByInstanceId"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTransferInByInstanceIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferInByInstanceId to query domain name transfer-in information by instance ID.</p>
     * 
     * @param request QueryTransferInByInstanceIdRequest
     * @return QueryTransferInByInstanceIdResponse
     */
    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferInByInstanceIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferInList to query the domain name transfer-in list.</p>
     * 
     * @param request QueryTransferInListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTransferInListResponse
     */
    public QueryTransferInListResponse queryTransferInListWithOptions(QueryTransferInListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simpleTransferInStatus)) {
            query.put("SimpleTransferInStatus", request.simpleTransferInStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submissionEndDate)) {
            query.put("SubmissionEndDate", request.submissionEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submissionStartDate)) {
            query.put("SubmissionStartDate", request.submissionStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTransferInList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTransferInListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferInList to query the domain name transfer-in list.</p>
     * 
     * @param request QueryTransferInListRequest
     * @return QueryTransferInListResponse
     */
    public QueryTransferInListResponse queryTransferInList(QueryTransferInListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferInListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferOutInfo to query domain name transfer-out information.</p>
     * 
     * @param request QueryTransferOutInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTransferOutInfoResponse
     */
    public QueryTransferOutInfoResponse queryTransferOutInfoWithOptions(QueryTransferOutInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTransferOutInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTransferOutInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryTransferOutInfo to query domain name transfer-out information.</p>
     * 
     * @param request QueryTransferOutInfoRequest
     * @return QueryTransferOutInfoResponse
     */
    public QueryTransferOutInfoResponse queryTransferOutInfo(QueryTransferOutInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferOutInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Identity verification document review takes 3 to 5 business days. After the authority completes the review, you can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the identity verification result.  </li>
     * <li>If identity verification fails, refer to <a href="https://help.aliyun.com/document_detail/35885.html">Reasons for Identity Verification Failure and Solutions</a> for troubleshooting and resolution.<blockquote>
     * <p>You must invoke this API using the POST method; otherwise, the invocation will fail. When using a software development kit (SDK), set the <strong>method</strong> parameter of the request object to <strong>POST</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke the RegistrantProfileRealNameVerification API to submit real-name verification for an information template.</p>
     * 
     * @param request RegistrantProfileRealNameVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegistrantProfileRealNameVerificationResponse
     */
    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerificationWithOptions(RegistrantProfileRealNameVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialNo)) {
            query.put("IdentityCredentialNo", request.identityCredentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialType)) {
            query.put("IdentityCredentialType", request.identityCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileID)) {
            query.put("RegistrantProfileID", request.registrantProfileID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityCredential)) {
            body.put("IdentityCredential", request.identityCredential);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegistrantProfileRealNameVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegistrantProfileRealNameVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Identity verification document review takes 3 to 5 business days. After the authority completes the review, you can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the identity verification result.  </li>
     * <li>If identity verification fails, refer to <a href="https://help.aliyun.com/document_detail/35885.html">Reasons for Identity Verification Failure and Solutions</a> for troubleshooting and resolution.<blockquote>
     * <p>You must invoke this API using the POST method; otherwise, the invocation will fail. When using a software development kit (SDK), set the <strong>method</strong> parameter of the request object to <strong>POST</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke the RegistrantProfileRealNameVerification API to submit real-name verification for an information template.</p>
     * 
     * @param request RegistrantProfileRealNameVerificationRequest
     * @return RegistrantProfileRealNameVerificationResponse
     */
    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the ResendEmailVerification API to resend the verification email.</p>
     * 
     * @param request ResendEmailVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendEmailVerificationResponse
     */
    public ResendEmailVerificationResponse resendEmailVerificationWithOptions(ResendEmailVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendEmailVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendEmailVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the ResendEmailVerification API to resend the verification email.</p>
     * 
     * @param request ResendEmailVerificationRequest
     * @return ResendEmailVerificationResponse
     */
    public ResendEmailVerificationResponse resendEmailVerification(ResendEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendEmailVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reset the qualification verification status for .restaurant and .trademark domain names.</p>
     * 
     * @param request ResetQualificationVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetQualificationVerificationResponse
     */
    public ResetQualificationVerificationResponse resetQualificationVerificationWithOptions(ResetQualificationVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetQualificationVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetQualificationVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reset the qualification verification status for .restaurant and .trademark domain names.</p>
     * 
     * @param request ResetQualificationVerificationRequest
     * @return ResetQualificationVerificationResponse
     */
    public ResetQualificationVerificationResponse resetQualificationVerification(ResetQualificationVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetQualificationVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke SaveBatchDomainRemark to batch save domain name remarks.</p>
     * 
     * @param request SaveBatchDomainRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchDomainRemarkResponse
     */
    public SaveBatchDomainRemarkResponse saveBatchDomainRemarkWithOptions(SaveBatchDomainRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchDomainRemark"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchDomainRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke SaveBatchDomainRemark to batch save domain name remarks.</p>
     * 
     * @param request SaveBatchDomainRemarkRequest
     * @return SaveBatchDomainRemarkResponse
     */
    public SaveBatchDomainRemarkResponse saveBatchDomainRemark(SaveBatchDomainRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchDomainRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To query the result of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to quickly transfer out domain names.</p>
     * 
     * @param request SaveBatchTaskForApplyQuickTransferOutOpenlyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForApplyQuickTransferOutOpenlyResponse
     */
    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponse saveBatchTaskForApplyQuickTransferOutOpenlyWithOptions(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForApplyQuickTransferOutOpenly"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForApplyQuickTransferOutOpenlyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To query the result of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to quickly transfer out domain names.</p>
     * 
     * @param request SaveBatchTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveBatchTaskForApplyQuickTransferOutOpenlyResponse
     */
    public SaveBatchTaskForApplyQuickTransferOutOpenlyResponse saveBatchTaskForApplyQuickTransferOutOpenly(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForApplyQuickTransferOutOpenlyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, domain names can only be registered by using real-name verified domain name registrant profiles. Passing registrant information directly to register domain names is no longer supported.
     * To register a domain name, you must specify associated domain name to be registered, associated domain name registrant information, and the DNS servers. You must associate associated domain name registrant information by using the ID of a real-name verified domain name registrant profile. For DNS servers, you can use the default Alibaba Cloud DNS or specify custom DNS servers.</p>
     * <blockquote>
     * <ul>
     * <li>The total number of domain names registered per week cannot exceed 100,000.</li>
     * <li>Registration payments can only be made by using the account cash balance. Credit limits are not supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The request parameter format for the <strong>SaveBatchTaskForCreatingOrderActivate</strong> operation is OrderActivateParam.N.*, where N represents the sequence number of associated domain name.
     * To query the task execution result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch domain name registration task.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderActivateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivateWithOptions(SaveBatchTaskForCreatingOrderActivateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderActivateParam)) {
            query.put("OrderActivateParam", request.orderActivateParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForCreatingOrderActivate"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForCreatingOrderActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, domain names can only be registered by using real-name verified domain name registrant profiles. Passing registrant information directly to register domain names is no longer supported.
     * To register a domain name, you must specify associated domain name to be registered, associated domain name registrant information, and the DNS servers. You must associate associated domain name registrant information by using the ID of a real-name verified domain name registrant profile. For DNS servers, you can use the default Alibaba Cloud DNS or specify custom DNS servers.</p>
     * <blockquote>
     * <ul>
     * <li>The total number of domain names registered per week cannot exceed 100,000.</li>
     * <li>Registration payments can only be made by using the account cash balance. Credit limits are not supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The request parameter format for the <strong>SaveBatchTaskForCreatingOrderActivate</strong> operation is OrderActivateParam.N.*, where N represents the sequence number of associated domain name.
     * To query the task execution result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch domain name registration task.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderActivateRequest
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForCreatingOrderRedeem API to submit a batch domain redeem job.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderRedeemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeemWithOptions(SaveBatchTaskForCreatingOrderRedeemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderRedeemParam)) {
            query.put("OrderRedeemParam", request.orderRedeemParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForCreatingOrderRedeem"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForCreatingOrderRedeemResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForCreatingOrderRedeem API to submit a batch domain redeem job.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderRedeemRequest
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch domain name renewal task.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderRenewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenewWithOptions(SaveBatchTaskForCreatingOrderRenewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderRenewParam)) {
            query.put("OrderRenewParam", request.orderRenewParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForCreatingOrderRenew"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForCreatingOrderRenewResponse());
    }

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch domain name renewal task.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderRenewRequest
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API. For more information, see <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.5096389cgV6sng">QueryTaskDetailList</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForCreatingOrderTransfer API to submit a batch domain name transfer-in job.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransferWithOptions(SaveBatchTaskForCreatingOrderTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderTransferParam)) {
            query.put("OrderTransferParam", request.orderTransferParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForCreatingOrderTransfer"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForCreatingOrderTransferResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API. For more information, see <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.5096389cgV6sng">QueryTaskDetailList</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForCreatingOrderTransfer API to submit a batch domain name transfer-in job.</p>
     * 
     * @param request SaveBatchTaskForCreatingOrderTransferRequest
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForDomainNameProxyService API to submit a batch domain name proxy service job.</p>
     * 
     * @param request SaveBatchTaskForDomainNameProxyServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyServiceWithOptions(SaveBatchTaskForDomainNameProxyServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForDomainNameProxyService"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForDomainNameProxyServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveBatchTaskForDomainNameProxyService API to submit a batch domain name proxy service job.</p>
     * 
     * @param request SaveBatchTaskForDomainNameProxyServiceRequest
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交批量生成证书的任务</p>
     * 
     * @param tmpReq SaveBatchTaskForGenerateDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForGenerateDomainCertificateResponse
     */
    public SaveBatchTaskForGenerateDomainCertificateResponse saveBatchTaskForGenerateDomainCertificateWithOptions(SaveBatchTaskForGenerateDomainCertificateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveBatchTaskForGenerateDomainCertificateShrinkRequest request = new SaveBatchTaskForGenerateDomainCertificateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domainNames)) {
            request.domainNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domainNames, "DomainNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNamesShrink)) {
            query.put("DomainNames", request.domainNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForGenerateDomainCertificate"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForGenerateDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交批量生成证书的任务</p>
     * 
     * @param request SaveBatchTaskForGenerateDomainCertificateRequest
     * @return SaveBatchTaskForGenerateDomainCertificateResponse
     */
    public SaveBatchTaskForGenerateDomainCertificateResponse saveBatchTaskForGenerateDomainCertificate(SaveBatchTaskForGenerateDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForGenerateDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to modify the DNS servers for the specified domain names.</p>
     * 
     * @param request SaveBatchTaskForModifyingDomainDnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDnsWithOptions(SaveBatchTaskForModifyingDomainDnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunDns)) {
            query.put("AliyunDns", request.aliyunDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameServer)) {
            query.put("DomainNameServer", request.domainNameServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForModifyingDomainDns"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForModifyingDomainDnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>To query the task result, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to modify the DNS servers for the specified domain names.</p>
     * 
     * @param request SaveBatchTaskForModifyingDomainDnsRequest
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForModifyingDomainDnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To query task execution results, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the SaveBatchTaskForReserveDropListDomain API to submit a batch task for domain reservation.</p>
     * 
     * @param request SaveBatchTaskForReserveDropListDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    public SaveBatchTaskForReserveDropListDomainResponse saveBatchTaskForReserveDropListDomainWithOptions(SaveBatchTaskForReserveDropListDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForReserveDropListDomain"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForReserveDropListDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>To query task execution results, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the SaveBatchTaskForReserveDropListDomain API to submit a batch task for domain reservation.</p>
     * 
     * @param request SaveBatchTaskForReserveDropListDomainRequest
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    public SaveBatchTaskForReserveDropListDomainResponse saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForReserveDropListDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After submitting the task, call <code>QueryTaskDetailList</code> to check its status.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch transfer-out task for multiple domain names using their authorization codes.</p>
     * 
     * @param request SaveBatchTaskForTransferOutByAuthorizationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForTransferOutByAuthorizationCodeResponse
     */
    public SaveBatchTaskForTransferOutByAuthorizationCodeResponse saveBatchTaskForTransferOutByAuthorizationCodeWithOptions(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transferOutParamList)) {
            query.put("TransferOutParamList", request.transferOutParamList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForTransferOutByAuthorizationCode"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForTransferOutByAuthorizationCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After submitting the task, call <code>QueryTaskDetailList</code> to check its status.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch transfer-out task for multiple domain names using their authorization codes.</p>
     * 
     * @param request SaveBatchTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveBatchTaskForTransferOutByAuthorizationCodeResponse
     */
    public SaveBatchTaskForTransferOutByAuthorizationCodeResponse saveBatchTaskForTransferOutByAuthorizationCode(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForTransferOutByAuthorizationCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To check the result of the task, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Call SaveBatchTaskForTransferProhibitionLock to enable or disable the transfer prohibition lock for multiple domain names.</p>
     * 
     * @param request SaveBatchTaskForTransferProhibitionLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLockWithOptions(SaveBatchTaskForTransferProhibitionLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForTransferProhibitionLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForTransferProhibitionLockResponse());
    }

    /**
     * <b>description</b> :
     * <p>To check the result of the task, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Call SaveBatchTaskForTransferProhibitionLock to enable or disable the transfer prohibition lock for multiple domain names.</p>
     * 
     * @param request SaveBatchTaskForTransferProhibitionLockRequest
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To check the status of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to enable or disable the update prohibition lock for one or more domain names.</p>
     * 
     * @param request SaveBatchTaskForUpdateProhibitionLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLockWithOptions(SaveBatchTaskForUpdateProhibitionLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForUpdateProhibitionLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForUpdateProhibitionLockResponse());
    }

    /**
     * <b>description</b> :
     * <p>To check the status of the task, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a batch task to enable or disable the update prohibition lock for one or more domain names.</p>
     * 
     * @param request SaveBatchTaskForUpdateProhibitionLockRequest
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a domain information modification job with new contact information.</p>
     * 
     * @param request SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferOutProhibited)) {
            query.put("TransferOutProhibited", request.transferOutProhibited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForUpdatingContactInfoByNewContact"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForUpdatingContactInfoByNewContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a domain information modification job with new contact information.</p>
     * 
     * @param request SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To check the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Call SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId to update the contact information of one or more domain names by using a registrant profile.</p>
     * 
     * @param request SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse
     */
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferOutProhibited)) {
            query.put("TransferOutProhibited", request.transferOutProhibited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>To check the task result, call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Call SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId to update the contact information of one or more domain names by using a registrant profile.</p>
     * 
     * @param request SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest
     * @return SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse
     */
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveDomainGroup API to create or update a domain name group.</p>
     * 
     * @param request SaveDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveDomainGroupResponse
     */
    public SaveDomainGroupResponse saveDomainGroupWithOptions(SaveDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupName)) {
            query.put("DomainGroupName", request.domainGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveDomainGroup"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveDomainGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveDomainGroup API to create or update a domain name group.</p>
     * 
     * @param request SaveDomainGroupRequest
     * @return SaveDomainGroupResponse
     */
    public SaveDomainGroupResponse saveDomainGroup(SaveDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The domain name registrant profile contains registrant information. When you create or update a registrant profile, we recommend that you fill in all registrant information according to your actual situation and ensure consistency between the Chinese and English versions. To avoid faults during domain name registry review, we recommend entering all English registrant information in lowercase letters. For specific requirements, see the parameter descriptions below.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveRegistrantProfile API to create or update a domain name registrant profile.</p>
     * 
     * @param request SaveRegistrantProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveRegistrantProfileResponse
     */
    public SaveRegistrantProfileResponse saveRegistrantProfileWithOptions(SaveRegistrantProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRegistrantProfile)) {
            query.put("DefaultRegistrantProfile", request.defaultRegistrantProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileType)) {
            query.put("RegistrantProfileType", request.registrantProfileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRegistrantProfile"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveRegistrantProfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>The domain name registrant profile contains registrant information. When you create or update a registrant profile, we recommend that you fill in all registrant information according to your actual situation and ensure consistency between the Chinese and English versions. To avoid faults during domain name registry review, we recommend entering all English registrant information in lowercase letters. For specific requirements, see the parameter descriptions below.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveRegistrantProfile API to create or update a domain name registrant profile.</p>
     * 
     * @param request SaveRegistrantProfileRequest
     * @return SaveRegistrantProfileResponse
     */
    public SaveRegistrantProfileResponse saveRegistrantProfile(SaveRegistrantProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRegistrantProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveRegistrantProfileRealNameVerification API to save domain contact and certificate information.</p>
     * 
     * @param request SaveRegistrantProfileRealNameVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveRegistrantProfileRealNameVerificationResponse
     */
    public SaveRegistrantProfileRealNameVerificationResponse saveRegistrantProfileRealNameVerificationWithOptions(SaveRegistrantProfileRealNameVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredential)) {
            query.put("IdentityCredential", request.identityCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialNo)) {
            query.put("IdentityCredentialNo", request.identityCredentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialType)) {
            query.put("IdentityCredentialType", request.identityCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileType)) {
            query.put("RegistrantProfileType", request.registrantProfileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRegistrantProfileRealNameVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveRegistrantProfileRealNameVerificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SaveRegistrantProfileRealNameVerification API to save domain contact and certificate information.</p>
     * 
     * @param request SaveRegistrantProfileRealNameVerificationRequest
     * @return SaveRegistrantProfileRealNameVerificationResponse
     */
    public SaveRegistrantProfileRealNameVerificationResponse saveRegistrantProfileRealNameVerification(SaveRegistrantProfileRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForAddingDSRecord API to submit a job for creating a DS record.</p>
     * 
     * @param request SaveSingleTaskForAddingDSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecordWithOptions(SaveSingleTaskForAddingDSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digestType)) {
            query.put("DigestType", request.digestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyTag)) {
            query.put("KeyTag", request.keyTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForAddingDSRecord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForAddingDSRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForAddingDSRecord API to submit a job for creating a DS record.</p>
     * 
     * @param request SaveSingleTaskForAddingDSRecordRequest
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForAddingDSRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To check the task\&quot;s status, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a task for a quick transfer-out of a domain name.</p>
     * 
     * @param request SaveSingleTaskForApplyQuickTransferOutOpenlyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForApplyQuickTransferOutOpenlyResponse
     */
    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponse saveSingleTaskForApplyQuickTransferOutOpenlyWithOptions(SaveSingleTaskForApplyQuickTransferOutOpenlyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForApplyQuickTransferOutOpenly"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForApplyQuickTransferOutOpenlyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. To check the task\&quot;s status, call the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a task for a quick transfer-out of a domain name.</p>
     * 
     * @param request SaveSingleTaskForApplyQuickTransferOutOpenlyRequest
     * @return SaveSingleTaskForApplyQuickTransferOutOpenlyResponse
     */
    public SaveSingleTaskForApplyQuickTransferOutOpenlyResponse saveSingleTaskForApplyQuickTransferOutOpenly(SaveSingleTaskForApplyQuickTransferOutOpenlyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForApplyQuickTransferOutOpenlyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>确认转出</p>
     * 
     * @param request SaveSingleTaskForApprovingTransferOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOutWithOptions(SaveSingleTaskForApprovingTransferOutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForApprovingTransferOut"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForApprovingTransferOutResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>确认转出</p>
     * 
     * @param request SaveSingleTaskForApprovingTransferOutRequest
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForApprovingTransferOutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a job to attach an ENS address.</p>
     * 
     * @param request SaveSingleTaskForAssociatingEnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEnsWithOptions(SaveSingleTaskForAssociatingEnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForAssociatingEns"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForAssociatingEnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a job to attach an ENS address.</p>
     * 
     * @param request SaveSingleTaskForAssociatingEnsRequest
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForAssociatingEnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCancelingTransferIn API to submit a job to cancel a domain name transfer-in.</p>
     * 
     * @param request SaveSingleTaskForCancelingTransferInRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferInWithOptions(SaveSingleTaskForCancelingTransferInRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCancelingTransferIn"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCancelingTransferInResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCancelingTransferIn API to submit a job to cancel a domain name transfer-in.</p>
     * 
     * @param request SaveSingleTaskForCancelingTransferInRequest
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferInWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCancelingTransferOut API to submit a job to cancel a domain name transfer-out.</p>
     * 
     * @param request SaveSingleTaskForCancelingTransferOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOutWithOptions(SaveSingleTaskForCancelingTransferOutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCancelingTransferOut"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCancelingTransferOutResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by invoking the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCancelingTransferOut API to submit a job to cancel a domain name transfer-out.</p>
     * 
     * @param request SaveSingleTaskForCancelingTransferOutRequest
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferOutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForCreatingDnsHost to submit a single job for creating a DNS host.</p>
     * 
     * @param request SaveSingleTaskForCreatingDnsHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHostWithOptions(SaveSingleTaskForCreatingDnsHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsName)) {
            query.put("DnsName", request.dnsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingDnsHost"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCreatingDnsHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForCreatingDnsHost to submit a single job for creating a DNS host.</p>
     * 
     * @param request SaveSingleTaskForCreatingDnsHostRequest
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingDnsHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, you can associated domain names only by using real-name verified domain name registrant profiles. Passing registrant information directly to associated domain names is no longer supported.
     * To register a domain name, you must specify the domain name, registrant information, and DNS servers. You must associate the registrant information with a real-name verified domain name registrant profile by specifying the profile ID. You can use the default Alibaba Cloud DNS servers or specify custom DNS servers.
     * You can call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation to query the task execution result.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a domain name registration task.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderActivateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivateWithOptions(SaveSingleTaskForCreatingOrderActivateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunDns)) {
            query.put("AliyunDns", request.aliyunDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dns1)) {
            query.put("Dns1", request.dns1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dns2)) {
            query.put("Dns2", request.dns2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDomainProxy)) {
            query.put("EnableDomainProxy", request.enableDomainProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedPunycode)) {
            query.put("ExpectedPunycode", request.expectedPunycode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitPremiumActivation)) {
            query.put("PermitPremiumActivation", request.permitPremiumActivation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDuration)) {
            query.put("SubscriptionDuration", request.subscriptionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkDomainActivation)) {
            query.put("TrademarkDomainActivation", request.trademarkDomainActivation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingOrderActivate"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCreatingOrderActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Starting from March 1, 2022, you can associated domain names only by using real-name verified domain name registrant profiles. Passing registrant information directly to associated domain names is no longer supported.
     * To register a domain name, you must specify the domain name, registrant information, and DNS servers. You must associate the registrant information with a real-name verified domain name registrant profile by specifying the profile ID. You can use the default Alibaba Cloud DNS servers or specify custom DNS servers.
     * You can call the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> operation to query the task execution result.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a domain name registration task.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderActivateRequest
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForCreatingOrderRedeem to submit a domain redeem job.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderRedeemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeemWithOptions(SaveSingleTaskForCreatingOrderRedeemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentExpirationDate)) {
            query.put("CurrentExpirationDate", request.currentExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingOrderRedeem"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCreatingOrderRedeemResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForCreatingOrderRedeem to submit a domain redeem job.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderRedeemRequest
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To check the execution results of the task, call <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Use SaveSingleTaskForCreatingOrderRenew to submit a domain name renewal task.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderRenewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenewWithOptions(SaveSingleTaskForCreatingOrderRenewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentExpirationDate)) {
            query.put("CurrentExpirationDate", request.currentExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitPremiumRenew)) {
            query.put("PermitPremiumRenew", request.permitPremiumRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDuration)) {
            query.put("SubscriptionDuration", request.subscriptionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingOrderRenew"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCreatingOrderRenewResponse());
    }

    /**
     * <b>description</b> :
     * <p>To check the execution results of the task, call <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Use SaveSingleTaskForCreatingOrderRenew to submit a domain name renewal task.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderRenewRequest
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by calling the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCreatingOrderTransfer API to submit a domain name transfer-in job.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransferWithOptions(SaveSingleTaskForCreatingOrderTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationCode)) {
            query.put("AuthorizationCode", request.authorizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitPremiumTransfer)) {
            query.put("PermitPremiumTransfer", request.permitPremiumTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionNo)) {
            query.put("PromotionNo", request.promotionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCoupon)) {
            query.put("UseCoupon", request.useCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePromotion)) {
            query.put("UsePromotion", request.usePromotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingOrderTransfer"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForCreatingOrderTransferResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by calling the QueryTaskDetailList API (<del>67710</del>).</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForCreatingOrderTransfer API to submit a domain name transfer-in job.</p>
     * 
     * @param request SaveSingleTaskForCreatingOrderTransferRequest
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDeletingDSRecord API to submit a job for deleting a DS record.</p>
     * 
     * @param request SaveSingleTaskForDeletingDSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecordWithOptions(SaveSingleTaskForDeletingDSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyTag)) {
            query.put("KeyTag", request.keyTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForDeletingDSRecord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForDeletingDSRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDeletingDSRecord API to submit a job for deleting a DS record.</p>
     * 
     * @param request SaveSingleTaskForDeletingDSRecordRequest
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDeletingDSRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDeletingDnsHost API to submit a job for deleting a DNS host.</p>
     * 
     * @param request SaveSingleTaskForDeletingDnsHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHostWithOptions(SaveSingleTaskForDeletingDnsHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsName)) {
            query.put("DnsName", request.dnsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForDeletingDnsHost"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForDeletingDnsHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDeletingDnsHost API to submit a job for deleting a DNS host.</p>
     * 
     * @param request SaveSingleTaskForDeletingDnsHostRequest
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDeletingDnsHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDisassociatingEns API to submit a job for detaching an ENS address.</p>
     * 
     * @param request SaveSingleTaskForDisassociatingEnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEnsWithOptions(SaveSingleTaskForDisassociatingEnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForDisassociatingEns"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForDisassociatingEnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDisassociatingEns API to submit a job for detaching an ENS address.</p>
     * 
     * @param request SaveSingleTaskForDisassociatingEnsRequest
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDisassociatingEnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Invoke the SaveSingleTaskForDomainNameProxyService API to submit a domain name proxy service job.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDomainNameProxyService API to submit a domain name proxy service job.</p>
     * 
     * @param request SaveSingleTaskForDomainNameProxyServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyServiceWithOptions(SaveSingleTaskForDomainNameProxyServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForDomainNameProxyService"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForDomainNameProxyServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Invoke the SaveSingleTaskForDomainNameProxyService API to submit a domain name proxy service job.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForDomainNameProxyService API to submit a domain name proxy service job.</p>
     * 
     * @param request SaveSingleTaskForDomainNameProxyServiceRequest
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交生成域名证书任务</p>
     * 
     * @param request SaveSingleTaskForGenerateDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForGenerateDomainCertificateResponse
     */
    public SaveSingleTaskForGenerateDomainCertificateResponse saveSingleTaskForGenerateDomainCertificateWithOptions(SaveSingleTaskForGenerateDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForGenerateDomainCertificate"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForGenerateDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交生成域名证书任务</p>
     * 
     * @param request SaveSingleTaskForGenerateDomainCertificateRequest
     * @return SaveSingleTaskForGenerateDomainCertificateResponse
     */
    public SaveSingleTaskForGenerateDomainCertificateResponse saveSingleTaskForGenerateDomainCertificate(SaveSingleTaskForGenerateDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForGenerateDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForModifyingDSRecord to submit a job for modifying a DS record.</p>
     * 
     * @param request SaveSingleTaskForModifyingDSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecordWithOptions(SaveSingleTaskForModifyingDSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digest)) {
            query.put("Digest", request.digest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digestType)) {
            query.put("DigestType", request.digestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyTag)) {
            query.put("KeyTag", request.keyTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForModifyingDSRecord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForModifyingDSRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke SaveSingleTaskForModifyingDSRecord to submit a job for modifying a DS record.</p>
     * 
     * @param request SaveSingleTaskForModifyingDSRecordRequest
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForModifyingDSRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForModifyingDnsHost API to submit a job for modifying a DNS host.</p>
     * 
     * @param request SaveSingleTaskForModifyingDnsHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHostWithOptions(SaveSingleTaskForModifyingDnsHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsName)) {
            query.put("DnsName", request.dnsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForModifyingDnsHost"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForModifyingDnsHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForModifyingDnsHost API to submit a job for modifying a DNS host.</p>
     * 
     * @param request SaveSingleTaskForModifyingDnsHostRequest
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForModifyingDnsHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by calling the QueryTaskDetailList API (<del>67710</del>). The transfer password is returned in the TaskResult field of the corresponding job.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForQueryingTransferAuthorizationCode API to submit a job for retrieving the domain name transfer password.</p>
     * 
     * @param request SaveSingleTaskForQueryingTransferAuthorizationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForQueryingTransferAuthorizationCodeResponse
     */
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForQueryingTransferAuthorizationCode"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForQueryingTransferAuthorizationCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by calling the QueryTaskDetailList API (<del>67710</del>). The transfer password is returned in the TaskResult field of the corresponding job.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForQueryingTransferAuthorizationCode API to submit a job for retrieving the domain name transfer password.</p>
     * 
     * @param request SaveSingleTaskForQueryingTransferAuthorizationCodeRequest
     * @return SaveSingleTaskForQueryingTransferAuthorizationCodeResponse
     */
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单笔抢注批量接口</p>
     * 
     * @param request SaveSingleTaskForReserveDropListDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForReserveDropListDomainResponse
     */
    public SaveSingleTaskForReserveDropListDomainResponse saveSingleTaskForReserveDropListDomainWithOptions(SaveSingleTaskForReserveDropListDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dns1)) {
            query.put("Dns1", request.dns1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dns2)) {
            query.put("Dns2", request.dns2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForReserveDropListDomain"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForReserveDropListDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单笔抢注批量接口</p>
     * 
     * @param request SaveSingleTaskForReserveDropListDomainRequest
     * @return SaveSingleTaskForReserveDropListDomainResponse
     */
    public SaveSingleTaskForReserveDropListDomainResponse saveSingleTaskForReserveDropListDomain(SaveSingleTaskForReserveDropListDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForReserveDropListDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSaveArtExtension API to submit a job for creating Art extension information.</p>
     * 
     * @param request SaveSingleTaskForSaveArtExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtensionWithOptions(SaveSingleTaskForSaveArtExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateOrPeriod)) {
            query.put("DateOrPeriod", request.dateOrPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.features)) {
            query.put("Features", request.features);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inscriptionsAndMarkings)) {
            query.put("InscriptionsAndMarkings", request.inscriptionsAndMarkings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maker)) {
            query.put("Maker", request.maker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialsAndTechniques)) {
            query.put("MaterialsAndTechniques", request.materialsAndTechniques);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reference)) {
            query.put("Reference", request.reference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForSaveArtExtension"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForSaveArtExtensionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSaveArtExtension API to submit a job for creating Art extension information.</p>
     * 
     * @param request SaveSingleTaskForSaveArtExtensionRequest
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSaveArtExtensionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSynchronizingDSRecord API to submit a job for synchronizing a DS record.</p>
     * 
     * @param request SaveSingleTaskForSynchronizingDSRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecordWithOptions(SaveSingleTaskForSynchronizingDSRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForSynchronizingDSRecord"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForSynchronizingDSRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSynchronizingDSRecord API to submit a job for synchronizing a DS record.</p>
     * 
     * @param request SaveSingleTaskForSynchronizingDSRecordRequest
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDSRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSynchronizingDnsHost API to submit a DNS host synchronization job. This is used to handle cases such as missing or inconsistent DNS hosts.</p>
     * 
     * @param request SaveSingleTaskForSynchronizingDnsHostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHostWithOptions(SaveSingleTaskForSynchronizingDnsHostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForSynchronizingDnsHost"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForSynchronizingDnsHostResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">Query Task Detail List</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForSynchronizingDnsHost API to submit a DNS host synchronization job. This is used to handle cases such as missing or inconsistent DNS hosts.</p>
     * 
     * @param request SaveSingleTaskForSynchronizingDnsHostRequest
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDnsHostWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a single transfer-out task based on the transfer key of a domain name.</p>
     * 
     * @param request SaveSingleTaskForTransferOutByAuthorizationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForTransferOutByAuthorizationCodeResponse
     */
    public SaveSingleTaskForTransferOutByAuthorizationCodeResponse saveSingleTaskForTransferOutByAuthorizationCodeWithOptions(SaveSingleTaskForTransferOutByAuthorizationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationCode)) {
            query.put("AuthorizationCode", request.authorizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForTransferOutByAuthorizationCode"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForTransferOutByAuthorizationCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a single transfer-out task based on the transfer key of a domain name.</p>
     * 
     * @param request SaveSingleTaskForTransferOutByAuthorizationCodeRequest
     * @return SaveSingleTaskForTransferOutByAuthorizationCodeResponse
     */
    public SaveSingleTaskForTransferOutByAuthorizationCodeResponse saveSingleTaskForTransferOutByAuthorizationCode(SaveSingleTaskForTransferOutByAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForTransferOutByAuthorizationCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">List Task Details</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForTransferProhibitionLock API to submit a transfer prohibition lock job.</p>
     * 
     * @param request SaveSingleTaskForTransferProhibitionLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLockWithOptions(SaveSingleTaskForTransferProhibitionLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForTransferProhibitionLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForTransferProhibitionLockResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">List Task Details</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForTransferProhibitionLock API to submit a transfer prohibition lock job.</p>
     * 
     * @param request SaveSingleTaskForTransferProhibitionLockRequest
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForUpdateProhibitionLock API to submit a task for the Update Prohibition Lock.</p>
     * 
     * @param request SaveSingleTaskForUpdateProhibitionLockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLockWithOptions(SaveSingleTaskForUpdateProhibitionLockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForUpdateProhibitionLock"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForUpdateProhibitionLockResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="~~QueryTaskDetailList~~">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForUpdateProhibitionLock API to submit a task for the Update Prohibition Lock.</p>
     * 
     * @param request SaveSingleTaskForUpdateProhibitionLockRequest
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForUpdatingContactInfo API to submit a domain contact information update job.</p>
     * 
     * @param request SaveSingleTaskForUpdatingContactInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfoWithOptions(SaveSingleTaskForUpdatingContactInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addTransferLock)) {
            query.put("AddTransferLock", request.addTransferLock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            query.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForUpdatingContactInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSingleTaskForUpdatingContactInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the job execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveSingleTaskForUpdatingContactInfo API to submit a domain contact information update job.</p>
     * 
     * @param request SaveSingleTaskForUpdatingContactInfoRequest
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForUpdatingContactInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Invoke SaveTaskForSubmittingDomainDelete to submit a domain deletion job.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a domain deletion job. Only whitelist users can access this API.</p>
     * 
     * @param request SaveTaskForSubmittingDomainDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForSubmittingDomainDeleteResponse
     */
    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDeleteWithOptions(SaveTaskForSubmittingDomainDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForSubmittingDomainDelete"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForSubmittingDomainDeleteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Invoke SaveTaskForSubmittingDomainDelete to submit a domain deletion job.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit a domain deletion job. Only whitelist users can access this API.</p>
     * 
     * @param request SaveTaskForSubmittingDomainDeleteRequest
     * @return SaveTaskForSubmittingDomainDeleteResponse
     */
    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits real-name verification information for one or more domain names in bulk.</p>
     * 
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialNo)) {
            query.put("IdentityCredentialNo", request.identityCredentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialType)) {
            query.put("IdentityCredentialType", request.identityCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityCredential)) {
            body.put("IdentityCredential", request.identityCredential);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredential"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits real-name verification information for one or more domain names in bulk.</p>
     * 
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to submit real-name verification information for a domain name by using a specified registrant profile.</p>
     * 
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to submit real-name verification information for a domain name by using a specified registrant profile.</p>
     * 
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveTaskForUpdatingRegistrantInfoByIdentityCredential API to submit a batch job for updating registrant contact information by providing contact details and required documentation. You must provide the corresponding documentation as required.</p>
     * 
     * @param request SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialNo)) {
            query.put("IdentityCredentialNo", request.identityCredentialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCredentialType)) {
            query.put("IdentityCredentialType", request.identityCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferOutProhibited)) {
            query.put("TransferOutProhibited", request.transferOutProhibited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityCredential)) {
            body.put("IdentityCredential", request.identityCredential);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForUpdatingRegistrantInfoByIdentityCredential"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the task execution result by using the <a href="https://help.aliyun.com/document_detail/67710.html">QueryTaskDetailList</a> API.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SaveTaskForUpdatingRegistrantInfoByIdentityCredential API to submit a batch job for updating registrant contact information by providing contact details and required documentation. You must provide the corresponding documentation as required.</p>
     * 
     * @param request SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.33f47edeV0nkFx">QueryTaskDetailList</a> API to check the task result. After a successful update, the registrant information for the domain name is updated to match the registrant profile. If the domain name requires real-name verification, it becomes verified.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a task to update registrant information using a registrant profile ID.</p>
     * 
     * @param request SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferOutProhibited)) {
            query.put("TransferOutProhibited", request.transferOutProhibited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the <a href="https://help.aliyun.com/document_detail/67710.htm?spm=a2c4g.11186623.0.0.33f47edeV0nkFx">QueryTaskDetailList</a> API to check the task result. After a successful update, the registrant information for the domain name is updated to match the registrant profile. If the domain name requires real-name verification, it becomes verified.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a task to update registrant information using a registrant profile ID.</p>
     * 
     * @param request SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of domain names, a slow response may occur when you call an API operation to query domain names. In this case, you can call this operation to query domain names more quickly. When you call this operation for the first time, specify the request parameters except ScrollId. A scroll ID is returned without other data. In the second request, use the scroll ID obtained from the previous response. In subsequent requests, the newly specified request parameters do not take effect, and the request parameters that are specified in the first request prevail.</p>
     * 
     * <b>summary</b> : 
     * <p>Traverses domain names.</p>
     * 
     * @param request ScrollDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScrollDomainListResponse
     */
    public ScrollDomainListResponse scrollDomainListWithOptions(ScrollDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainStatus)) {
            query.put("DomainStatus", request.domainStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExpirationDate)) {
            query.put("EndExpirationDate", request.endExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endLength)) {
            query.put("EndLength", request.endLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRegistrationDate)) {
            query.put("EndRegistrationDate", request.endRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excluded)) {
            query.put("Excluded", request.excluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedPrefix)) {
            query.put("ExcludedPrefix", request.excludedPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedSuffix)) {
            query.put("ExcludedSuffix", request.excludedSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.form)) {
            query.put("Form", request.form);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordPrefix)) {
            query.put("KeyWordPrefix", request.keyWordPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWordSuffix)) {
            query.put("KeyWordSuffix", request.keyWordSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDomainType)) {
            query.put("ProductDomainType", request.productDomainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scrollId)) {
            query.put("ScrollId", request.scrollId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startExpirationDate)) {
            query.put("StartExpirationDate", request.startExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startLength)) {
            query.put("StartLength", request.startLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRegistrationDate)) {
            query.put("StartRegistrationDate", request.startRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suffixs)) {
            query.put("Suffixs", request.suffixs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeType)) {
            query.put("TradeType", request.tradeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScrollDomainList"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScrollDomainListResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of domain names, a slow response may occur when you call an API operation to query domain names. In this case, you can call this operation to query domain names more quickly. When you call this operation for the first time, specify the request parameters except ScrollId. A scroll ID is returned without other data. In the second request, use the scroll ID obtained from the previous response. In subsequent requests, the newly specified request parameters do not take effect, and the request parameters that are specified in the first request prevail.</p>
     * 
     * <b>summary</b> : 
     * <p>Traverses domain names.</p>
     * 
     * @param request ScrollDomainListRequest
     * @return ScrollDomainListResponse
     */
    public ScrollDomainListResponse scrollDomainList(ScrollDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scrollDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SetDefaultRegistrantProfile API to set the default contact template for a domain name.</p>
     * 
     * @param request SetDefaultRegistrantProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultRegistrantProfileResponse
     */
    public SetDefaultRegistrantProfileResponse setDefaultRegistrantProfileWithOptions(SetDefaultRegistrantProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultRegistrantProfile"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultRegistrantProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SetDefaultRegistrantProfile API to set the default contact template for a domain name.</p>
     * 
     * @param request SetDefaultRegistrantProfileRequest
     * @return SetDefaultRegistrantProfileResponse
     */
    public SetDefaultRegistrantProfileResponse setDefaultRegistrantProfile(SetDefaultRegistrantProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultRegistrantProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation currently supports only domain names registered on the China site (aliyun.com).
     * <strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://wanwang.aliyun.com/help/price.html?spm=5176.22941859.J_9989412330.10.68a51838KnzTeD">pricing</a> of domain name services.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Sets or cancels auto-renewal for a domain name.</p>
     * 
     * @param request SetupDomainAutoRenewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetupDomainAutoRenewResponse
     */
    public SetupDomainAutoRenewResponse setupDomainAutoRenewWithOptions(SetupDomainAutoRenewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupDomainAutoRenew"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupDomainAutoRenewResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation currently supports only domain names registered on the China site (aliyun.com).
     * <strong>Before using this operation, make sure that you fully understand the billing method and <a href="https://wanwang.aliyun.com/help/price.html?spm=5176.22941859.J_9989412330.10.68a51838KnzTeD">pricing</a> of domain name services.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Sets or cancels auto-renewal for a domain name.</p>
     * 
     * @param request SetupDomainAutoRenewRequest
     * @return SetupDomainAutoRenewResponse
     */
    public SetupDomainAutoRenewResponse setupDomainAutoRenew(SetupDomainAutoRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupDomainAutoRenewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submit documentation for special domain name services</p>
     * 
     * @param request SubmitDomainSpecialBizCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDomainSpecialBizCredentialsResponse
     */
    public SubmitDomainSpecialBizCredentialsResponse submitDomainSpecialBizCredentialsWithOptions(SubmitDomainSpecialBizCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentials)) {
            body.put("Credentials", request.credentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            body.put("Extend", request.extend);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDomainSpecialBizCredentials"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDomainSpecialBizCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submit documentation for special domain name services</p>
     * 
     * @param request SubmitDomainSpecialBizCredentialsRequest
     * @return SubmitDomainSpecialBizCredentialsResponse
     */
    public SubmitDomainSpecialBizCredentialsResponse submitDomainSpecialBizCredentials(SubmitDomainSpecialBizCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDomainSpecialBizCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After receiving the verification email, you must log on to your mailbox and complete verification within 3 days. If the verification email has expired, you can invoke the <a href="https://help.aliyun.com/document_detail/67734.html">ResendEmailVerification</a> API to resend the verification email.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SubmitEmailVerification API to send an email verification message.</p>
     * 
     * @param request SubmitEmailVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitEmailVerificationResponse
     */
    public SubmitEmailVerificationResponse submitEmailVerificationWithOptions(SubmitEmailVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendIfExist)) {
            query.put("SendIfExist", request.sendIfExist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitEmailVerification"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitEmailVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>After receiving the verification email, you must log on to your mailbox and complete verification within 3 days. If the verification email has expired, you can invoke the <a href="https://help.aliyun.com/document_detail/67734.html">ResendEmailVerification</a> API to resend the verification email.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the SubmitEmailVerification API to send an email verification message.</p>
     * 
     * @param request SubmitEmailVerificationRequest
     * @return SubmitEmailVerificationResponse
     */
    public SubmitEmailVerificationResponse submitEmailVerification(SubmitEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitEmailVerificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SubmitOperationAuditInfo API to submit self-service business review information.</p>
     * 
     * @param request SubmitOperationAuditInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitOperationAuditInfoResponse
     */
    public SubmitOperationAuditInfoResponse submitOperationAuditInfoWithOptions(SubmitOperationAuditInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditInfo)) {
            query.put("AuditInfo", request.auditInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditType)) {
            query.put("AuditType", request.auditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitOperationAuditInfo"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitOperationAuditInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SubmitOperationAuditInfo API to submit self-service business review information.</p>
     * 
     * @param request SubmitOperationAuditInfoRequest
     * @return SubmitOperationAuditInfoResponse
     */
    public SubmitOperationAuditInfoResponse submitOperationAuditInfo(SubmitOperationAuditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitOperationAuditInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SubmitOperationCredentials API to submit certificate materials for self-service operations pending review.</p>
     * 
     * @param request SubmitOperationCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitOperationCredentialsResponse
     */
    public SubmitOperationCredentialsResponse submitOperationCredentialsWithOptions(SubmitOperationCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordId)) {
            query.put("AuditRecordId", request.auditRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditType)) {
            query.put("AuditType", request.auditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentials)) {
            query.put("Credentials", request.credentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regType)) {
            query.put("RegType", request.regType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitOperationCredentials"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitOperationCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the SubmitOperationCredentials API to submit certificate materials for self-service operations pending review.</p>
     * 
     * @param request SubmitOperationCredentialsRequest
     * @return SubmitOperationCredentialsResponse
     */
    public SubmitOperationCredentialsResponse submitOperationCredentials(SubmitOperationCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitOperationCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the TransferInCheckMailToken operation to verify the email token of a domain name registrant.</p>
     * 
     * @param request TransferInCheckMailTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInCheckMailTokenResponse
     */
    public TransferInCheckMailTokenResponse transferInCheckMailTokenWithOptions(TransferInCheckMailTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInCheckMailToken"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInCheckMailTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the TransferInCheckMailToken operation to verify the email token of a domain name registrant.</p>
     * 
     * @param request TransferInCheckMailTokenRequest
     * @return TransferInCheckMailTokenResponse
     */
    public TransferInCheckMailTokenResponse transferInCheckMailToken(TransferInCheckMailTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInCheckMailTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the TransferInReenterTransferAuthorizationCode API to re-enter the transfer password for domain name transfer-in.</p>
     * 
     * @param request TransferInReenterTransferAuthorizationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInReenterTransferAuthorizationCodeResponse
     */
    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCodeWithOptions(TransferInReenterTransferAuthorizationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferAuthorizationCode)) {
            query.put("TransferAuthorizationCode", request.transferAuthorizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInReenterTransferAuthorizationCode"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInReenterTransferAuthorizationCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the TransferInReenterTransferAuthorizationCode API to re-enter the transfer password for domain name transfer-in.</p>
     * 
     * @param request TransferInReenterTransferAuthorizationCodeRequest
     * @return TransferInReenterTransferAuthorizationCodeResponse
     */
    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInReenterTransferAuthorizationCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The system automatically retrieves the registrant\&quot;s email address from WHOIS. If the email address is incorrect or cannot be retrieved, the system will re-scrape the WHOIS email address.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke TransferInRefetchWhoisEmail to perform email verification for domain transfer-in.</p>
     * 
     * @param request TransferInRefetchWhoisEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInRefetchWhoisEmailResponse
     */
    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmailWithOptions(TransferInRefetchWhoisEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInRefetchWhoisEmail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInRefetchWhoisEmailResponse());
    }

    /**
     * <b>description</b> :
     * <p>The system automatically retrieves the registrant\&quot;s email address from WHOIS. If the email address is incorrect or cannot be retrieved, the system will re-scrape the WHOIS email address.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke TransferInRefetchWhoisEmail to perform email verification for domain transfer-in.</p>
     * 
     * @param request TransferInRefetchWhoisEmailRequest
     * @return TransferInRefetchWhoisEmailResponse
     */
    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInRefetchWhoisEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the TransferInResendMailToken API to resend the verification email for domain transfer-in.</p>
     * 
     * @param request TransferInResendMailTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInResendMailTokenResponse
     */
    public TransferInResendMailTokenResponse transferInResendMailTokenWithOptions(TransferInResendMailTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInResendMailToken"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInResendMailTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the TransferInResendMailToken API to resend the verification email for domain transfer-in.</p>
     * 
     * @param request TransferInResendMailTokenRequest
     * @return TransferInResendMailTokenResponse
     */
    public TransferInResendMailTokenResponse transferInResendMailToken(TransferInResendMailTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInResendMailTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>If you use file upload to replace more than 1,000 domain names in a domain name group, the operation is asynchronous. The result is available only after the request is processed.</p>
     * 
     * @param request UpdateDomainToDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainToDomainGroupResponse
     */
    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroupWithOptions(UpdateDomainToDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupId)) {
            query.put("DomainGroupId", request.domainGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replace)) {
            query.put("Replace", request.replace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileToUpload)) {
            body.put("FileToUpload", request.fileToUpload);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainToDomainGroup"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainToDomainGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>If you use file upload to replace more than 1,000 domain names in a domain name group, the operation is asynchronous. The result is available only after the request is processed.</p>
     * 
     * @param request UpdateDomainToDomainGroupRequest
     * @return UpdateDomainToDomainGroupResponse
     */
    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainToDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Whether some parameters are required depends on the requirements of the domain name registry. This API validates the compliance and validity of the input parameters and does not perform validation against actual domain information.</p>
     * 
     * @param request VerifyContactFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyContactFieldResponse
     */
    public VerifyContactFieldResponse verifyContactFieldWithOptions(VerifyContactFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postalCode)) {
            query.put("PostalCode", request.postalCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantName)) {
            query.put("RegistrantName", request.registrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantOrganization)) {
            query.put("RegistrantOrganization", request.registrantOrganization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantType)) {
            query.put("RegistrantType", request.registrantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telArea)) {
            query.put("TelArea", request.telArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telExt)) {
            query.put("TelExt", request.telExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhAddress)) {
            query.put("ZhAddress", request.zhAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhCity)) {
            query.put("ZhCity", request.zhCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhProvince)) {
            query.put("ZhProvince", request.zhProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantName)) {
            query.put("ZhRegistrantName", request.zhRegistrantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyContactField"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyContactFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Whether some parameters are required depends on the requirements of the domain name registry. This API validates the compliance and validity of the input parameters and does not perform validation against actual domain information.</p>
     * 
     * @param request VerifyContactFieldRequest
     * @return VerifyContactFieldResponse
     */
    public VerifyContactFieldResponse verifyContactField(VerifyContactFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyContactFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the VerifyEmail API to submit email verification.</p>
     * 
     * @param request VerifyEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyEmailResponse
     */
    public VerifyEmailResponse verifyEmailWithOptions(VerifyEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyEmail"),
            new TeaPair("version", "2018-01-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the VerifyEmail API to submit email verification.</p>
     * 
     * @param request VerifyEmailRequest
     * @return VerifyEmailResponse
     */
    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyEmailWithOptions(request, runtime);
    }
}
