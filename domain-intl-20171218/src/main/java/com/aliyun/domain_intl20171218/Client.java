// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218;

import com.aliyun.tea.*;
import com.aliyun.domain_intl20171218.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("domain-intl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request AcknowledgeTaskResultRequest
     * @return AcknowledgeTaskResultResponse
     */
    public AcknowledgeTaskResultResponse acknowledgeTaskResult(AcknowledgeTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acknowledgeTaskResultWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request BatchFuzzyMatchDomainSensitiveWordRequest
     * @return BatchFuzzyMatchDomainSensitiveWordResponse
     */
    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchFuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request CancelDomainVerificationRequest
     * @return CancelDomainVerificationResponse
     */
    public CancelDomainVerificationResponse cancelDomainVerification(CancelDomainVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDomainVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomain"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request CheckDomainRequest
     * @return CheckDomainResponse
     */
    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request CheckDomainSunriseClaimRequest
     * @return CheckDomainSunriseClaimResponse
     */
    public CheckDomainSunriseClaimResponse checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainSunriseClaimWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request CheckTransferInFeasibilityRequest
     * @return CheckTransferInFeasibilityResponse
     */
    public CheckTransferInFeasibilityResponse checkTransferInFeasibility(CheckTransferInFeasibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkTransferInFeasibilityWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request ConfirmTransferInEmailRequest
     * @return ConfirmTransferInEmailResponse
     */
    public ConfirmTransferInEmailResponse confirmTransferInEmail(ConfirmTransferInEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmTransferInEmailWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request DeleteEmailVerificationRequest
     * @return DeleteEmailVerificationResponse
     */
    public DeleteEmailVerificationResponse deleteEmailVerification(DeleteEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEmailVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request DeleteRegistrantProfileRequest
     * @return DeleteRegistrantProfileResponse
     */
    public DeleteRegistrantProfileResponse deleteRegistrantProfile(DeleteRegistrantProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegistrantProfileWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request EmailVerifiedRequest
     * @return EmailVerifiedResponse
     */
    public EmailVerifiedResponse emailVerified(EmailVerifiedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.emailVerifiedWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request FuzzyMatchDomainSensitiveWordRequest
     * @return FuzzyMatchDomainSensitiveWordResponse
     */
    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request ListEmailVerificationRequest
     * @return ListEmailVerificationResponse
     */
    public ListEmailVerificationResponse listEmailVerification(ListEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEmailVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request LookupTmchNoticeRequest
     * @return LookupTmchNoticeResponse
     */
    public LookupTmchNoticeResponse lookupTmchNotice(LookupTmchNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupTmchNoticeWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request PollTaskResultRequest
     * @return PollTaskResultResponse
     */
    public PollTaskResultResponse pollTaskResult(PollTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pollTaskResultWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryArtExtensionRequest
     * @return QueryArtExtensionResponse
     */
    public QueryArtExtensionResponse queryArtExtension(QueryArtExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryArtExtensionWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryChangeLogListRequest
     * @return QueryChangeLogListResponse
     */
    public QueryChangeLogListResponse queryChangeLogList(QueryChangeLogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChangeLogListWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryContactInfoRequest
     * @return QueryContactInfoResponse
     */
    public QueryContactInfoResponse queryContactInfo(QueryContactInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContactInfoWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDSRecordRequest
     * @return QueryDSRecordResponse
     */
    public QueryDSRecordResponse queryDSRecord(QueryDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDSRecordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDnsHostRequest
     * @return QueryDnsHostResponse
     */
    public QueryDnsHostResponse queryDnsHost(QueryDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDnsHostWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDomainByDomainNameRequest
     * @return QueryDomainByDomainNameResponse
     */
    public QueryDomainByDomainNameResponse queryDomainByDomainName(QueryDomainByDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainByDomainNameWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDomainByInstanceIdRequest
     * @return QueryDomainByInstanceIdResponse
     */
    public QueryDomainByInstanceIdResponse queryDomainByInstanceId(QueryDomainByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainByInstanceIdWithOptions(request, runtime);
    }

    /**
     * @param request QueryDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainListWithOptions(QueryDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ccompany)) {
            query.put("Ccompany", request.ccompany);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startExpirationDate)) {
            query.put("StartExpirationDate", request.startExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRegistrationDate)) {
            query.put("StartRegistrationDate", request.startRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainList"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    public QueryDomainListResponse queryDomainList(QueryDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainListWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryDomainRealNameVerificationInfoRequest
     * @return QueryDomainRealNameVerificationInfoResponse
     */
    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainRealNameVerificationInfoWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryEnsAssociationRequest
     * @return QueryEnsAssociationResponse
     */
    public QueryEnsAssociationResponse queryEnsAssociation(QueryEnsAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEnsAssociationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryFailReasonForDomainRealNameVerificationRequest
     * @return QueryFailReasonForDomainRealNameVerificationResponse
     */
    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailReasonForDomainRealNameVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryFailReasonForRegistrantProfileRealNameVerificationRequest
     * @return QueryFailReasonForRegistrantProfileRealNameVerificationResponse
     */
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryLocalEnsAssociationRequest
     * @return QueryLocalEnsAssociationResponse
     */
    public QueryLocalEnsAssociationResponse queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocalEnsAssociationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryRegistrantProfileRealNameVerificationInfoRequest
     * @return QueryRegistrantProfileRealNameVerificationInfoResponse
     */
    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRegistrantProfileRealNameVerificationInfoWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRegistrantProfiles"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryRegistrantProfilesRequest
     * @return QueryRegistrantProfilesResponse
     */
    public QueryRegistrantProfilesResponse queryRegistrantProfiles(QueryRegistrantProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRegistrantProfilesWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTaskDetailHistoryRequest
     * @return QueryTaskDetailHistoryResponse
     */
    public QueryTaskDetailHistoryResponse queryTaskDetailHistory(QueryTaskDetailHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskDetailHistoryWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTaskDetailListRequest
     * @return QueryTaskDetailListResponse
     */
    public QueryTaskDetailListResponse queryTaskDetailList(QueryTaskDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskDetailListWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTaskInfoHistoryRequest
     * @return QueryTaskInfoHistoryResponse
     */
    public QueryTaskInfoHistoryResponse queryTaskInfoHistory(QueryTaskInfoHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskInfoHistoryWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTaskListRequest
     * @return QueryTaskListResponse
     */
    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTransferInByInstanceIdRequest
     * @return QueryTransferInByInstanceIdResponse
     */
    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferInByInstanceIdWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTransferInListRequest
     * @return QueryTransferInListResponse
     */
    public QueryTransferInListResponse queryTransferInList(QueryTransferInListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferInListWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request QueryTransferOutInfoRequest
     * @return QueryTransferOutInfoResponse
     */
    public QueryTransferOutInfoResponse queryTransferOutInfo(QueryTransferOutInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransferOutInfoWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request RegistrantProfileRealNameVerificationRequest
     * @return RegistrantProfileRealNameVerificationResponse
     */
    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request ResendEmailVerificationRequest
     * @return ResendEmailVerificationResponse
     */
    public ResendEmailVerificationResponse resendEmailVerification(ResendEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendEmailVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForCreatingOrderActivateRequest
     * @return SaveBatchTaskForCreatingOrderActivateResponse
     */
    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForCreatingOrderRedeemRequest
     * @return SaveBatchTaskForCreatingOrderRedeemResponse
     */
    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForCreatingOrderRenewRequest
     * @return SaveBatchTaskForCreatingOrderRenewResponse
     */
    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForCreatingOrderTransferRequest
     * @return SaveBatchTaskForCreatingOrderTransferResponse
     */
    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForDomainNameProxyService"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForDomainNameProxyServiceRequest
     * @return SaveBatchTaskForDomainNameProxyServiceResponse
     */
    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForModifyingDomainDnsRequest
     * @return SaveBatchTaskForModifyingDomainDnsResponse
     */
    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForModifyingDomainDnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际站删除抢注批量接口</p>
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
            new TeaPair("version", "2017-12-18"),
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
     * <b>summary</b> : 
     * <p>国际站删除抢注批量接口</p>
     * 
     * @param request SaveBatchTaskForReserveDropListDomainRequest
     * @return SaveBatchTaskForReserveDropListDomainResponse
     */
    public SaveBatchTaskForReserveDropListDomainResponse saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForReserveDropListDomainWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForTransferProhibitionLockRequest
     * @return SaveBatchTaskForTransferProhibitionLockResponse
     */
    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForUpdateProhibitionLockRequest
     * @return SaveBatchTaskForUpdateProhibitionLockResponse
     */
    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    /**
     * @param request SaveBatchTaskForUpdatingContactInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveBatchTaskForUpdatingContactInfoResponse
     */
    public SaveBatchTaskForUpdatingContactInfoResponse saveBatchTaskForUpdatingContactInfoWithOptions(SaveBatchTaskForUpdatingContactInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SaveBatchTaskForUpdatingContactInfo"),
            new TeaPair("version", "2017-12-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveBatchTaskForUpdatingContactInfoResponse());
    }

    /**
     * @param request SaveBatchTaskForUpdatingContactInfoRequest
     * @return SaveBatchTaskForUpdatingContactInfoResponse
     */
    public SaveBatchTaskForUpdatingContactInfoResponse saveBatchTaskForUpdatingContactInfo(SaveBatchTaskForUpdatingContactInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoWithOptions(request, runtime);
    }

    /**
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveBatchTaskForUpdatingContactInfoByNewContact"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveBatchTaskForUpdatingContactInfoByNewContactRequest
     * @return SaveBatchTaskForUpdatingContactInfoByNewContactResponse
     */
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(request, runtime);
    }

    /**
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRegistrantProfile"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveRegistrantProfileRequest
     * @return SaveRegistrantProfileResponse
     */
    public SaveRegistrantProfileResponse saveRegistrantProfile(SaveRegistrantProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRegistrantProfileWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForAddingDSRecordRequest
     * @return SaveSingleTaskForAddingDSRecordResponse
     */
    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForAddingDSRecordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForApprovingTransferOutRequest
     * @return SaveSingleTaskForApprovingTransferOutResponse
     */
    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForApprovingTransferOutWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForAssociatingEnsRequest
     * @return SaveSingleTaskForAssociatingEnsResponse
     */
    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForAssociatingEnsWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCancelingTransferInRequest
     * @return SaveSingleTaskForCancelingTransferInResponse
     */
    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferInWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCancelingTransferOutRequest
     * @return SaveSingleTaskForCancelingTransferOutResponse
     */
    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferOutWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCreatingDnsHostRequest
     * @return SaveSingleTaskForCreatingDnsHostResponse
     */
    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingDnsHostWithOptions(request, runtime);
    }

    /**
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSingleTaskForCreatingOrderActivate"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCreatingOrderActivateRequest
     * @return SaveSingleTaskForCreatingOrderActivateResponse
     */
    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCreatingOrderRedeemRequest
     * @return SaveSingleTaskForCreatingOrderRedeemResponse
     */
    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCreatingOrderRenewRequest
     * @return SaveSingleTaskForCreatingOrderRenewResponse
     */
    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForCreatingOrderTransferRequest
     * @return SaveSingleTaskForCreatingOrderTransferResponse
     */
    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForDeletingDSRecordRequest
     * @return SaveSingleTaskForDeletingDSRecordResponse
     */
    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDeletingDSRecordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("action", "SaveSingleTaskForDeletingDnsHost"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForDeletingDnsHostRequest
     * @return SaveSingleTaskForDeletingDnsHostResponse
     */
    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDeletingDnsHostWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForDisassociatingEnsRequest
     * @return SaveSingleTaskForDisassociatingEnsResponse
     */
    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDisassociatingEnsWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForDomainNameProxyServiceRequest
     * @return SaveSingleTaskForDomainNameProxyServiceResponse
     */
    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForModifyingDSRecordRequest
     * @return SaveSingleTaskForModifyingDSRecordResponse
     */
    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForModifyingDSRecordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForModifyingDnsHostRequest
     * @return SaveSingleTaskForModifyingDnsHostResponse
     */
    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForModifyingDnsHostWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForQueryingTransferAuthorizationCodeRequest
     * @return SaveSingleTaskForQueryingTransferAuthorizationCodeResponse
     */
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForSaveArtExtensionRequest
     * @return SaveSingleTaskForSaveArtExtensionResponse
     */
    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSaveArtExtensionWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForSynchronizingDSRecordRequest
     * @return SaveSingleTaskForSynchronizingDSRecordResponse
     */
    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDSRecordWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForSynchronizingDnsHostRequest
     * @return SaveSingleTaskForSynchronizingDnsHostResponse
     */
    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDnsHostWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForTransferProhibitionLockRequest
     * @return SaveSingleTaskForTransferProhibitionLockResponse
     */
    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForUpdateProhibitionLockRequest
     * @return SaveSingleTaskForUpdateProhibitionLockResponse
     */
    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveSingleTaskForUpdatingContactInfoRequest
     * @return SaveSingleTaskForUpdatingContactInfoResponse
     */
    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSingleTaskForUpdatingContactInfoWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveTaskForSubmittingDomainDeleteRequest
     * @return SaveTaskForSubmittingDomainDeleteResponse
     */
    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainDeleteWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest
     * @return SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest
     * @return SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest
     * @return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse
     */
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request SubmitEmailVerificationRequest
     * @return SubmitEmailVerificationResponse
     */
    public SubmitEmailVerificationResponse submitEmailVerification(SubmitEmailVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitEmailVerificationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request TransferInCheckMailTokenRequest
     * @return TransferInCheckMailTokenResponse
     */
    public TransferInCheckMailTokenResponse transferInCheckMailToken(TransferInCheckMailTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInCheckMailTokenWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request TransferInReenterTransferAuthorizationCodeRequest
     * @return TransferInReenterTransferAuthorizationCodeResponse
     */
    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInReenterTransferAuthorizationCodeWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request TransferInRefetchWhoisEmailRequest
     * @return TransferInRefetchWhoisEmailResponse
     */
    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInRefetchWhoisEmailWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request TransferInResendMailTokenRequest
     * @return TransferInResendMailTokenResponse
     */
    public TransferInResendMailTokenResponse transferInResendMailToken(TransferInResendMailTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInResendMailTokenWithOptions(request, runtime);
    }

    /**
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyContactField"),
            new TeaPair("version", "2017-12-18"),
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
     * @param request VerifyContactFieldRequest
     * @return VerifyContactFieldResponse
     */
    public VerifyContactFieldResponse verifyContactField(VerifyContactFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyContactFieldWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2017-12-18"),
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
     * @param request VerifyEmailRequest
     * @return VerifyEmailResponse
     */
    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyEmailWithOptions(request, runtime);
    }
}
