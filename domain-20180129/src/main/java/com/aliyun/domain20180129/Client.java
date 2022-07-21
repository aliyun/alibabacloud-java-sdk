// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129;

import com.aliyun.tea.*;
import com.aliyun.domain20180129.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
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

    public AcknowledgeTaskResultResponse acknowledgeTaskResultWithOptions(AcknowledgeTaskResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AcknowledgeTaskResultResponse acknowledgeTaskResult(AcknowledgeTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acknowledgeTaskResultWithOptions(request, runtime);
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWordWithOptions(BatchFuzzyMatchDomainSensitiveWordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchFuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    public CancelDomainVerificationResponse cancelDomainVerificationWithOptions(CancelDomainVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelDomainVerificationResponse cancelDomainVerification(CancelDomainVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelDomainVerificationWithOptions(request, runtime);
    }

    public CancelOperationAuditResponse cancelOperationAuditWithOptions(CancelOperationAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordId)) {
            query.put("AuditRecordId", request.auditRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelOperationAuditResponse cancelOperationAudit(CancelOperationAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOperationAuditWithOptions(request, runtime);
    }

    public CancelQualificationVerificationResponse cancelQualificationVerificationWithOptions(CancelQualificationVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelQualificationVerificationResponse cancelQualificationVerification(CancelQualificationVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelQualificationVerificationWithOptions(request, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    public CheckDomainSunriseClaimResponse checkDomainSunriseClaimWithOptions(CheckDomainSunriseClaimRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckDomainSunriseClaimResponse checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainSunriseClaimWithOptions(request, runtime);
    }

    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLockWithOptions(CheckMaxYearOfServerLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMaxYearOfServerLockWithOptions(request, runtime);
    }

    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApplyWithOptions(CheckProcessingServerLockApplyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkProcessingServerLockApplyWithOptions(request, runtime);
    }

    public CheckTransferInFeasibilityResponse checkTransferInFeasibilityWithOptions(CheckTransferInFeasibilityRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckTransferInFeasibilityResponse checkTransferInFeasibility(CheckTransferInFeasibilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTransferInFeasibilityWithOptions(request, runtime);
    }

    public ConfirmTransferInEmailResponse confirmTransferInEmailWithOptions(ConfirmTransferInEmailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ConfirmTransferInEmailResponse confirmTransferInEmail(ConfirmTransferInEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmTransferInEmailWithOptions(request, runtime);
    }

    public DeleteContactTemplatesResponse deleteContactTemplatesWithOptions(DeleteContactTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileIds)) {
            query.put("RegistrantProfileIds", request.registrantProfileIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteContactTemplatesResponse deleteContactTemplates(DeleteContactTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContactTemplatesWithOptions(request, runtime);
    }

    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    public DeleteEmailVerificationResponse deleteEmailVerificationWithOptions(DeleteEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteEmailVerificationResponse deleteEmailVerification(DeleteEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEmailVerificationWithOptions(request, runtime);
    }

    public DeleteRegistrantProfileResponse deleteRegistrantProfileWithOptions(DeleteRegistrantProfileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRegistrantProfileResponse deleteRegistrantProfile(DeleteRegistrantProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRegistrantProfileWithOptions(request, runtime);
    }

    public EmailVerifiedResponse emailVerifiedWithOptions(EmailVerifiedRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EmailVerifiedResponse emailVerified(EmailVerifiedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emailVerifiedWithOptions(request, runtime);
    }

    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWordWithOptions(FuzzyMatchDomainSensitiveWordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicyWithOptions(GetOperationOssUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditType)) {
            query.put("AuditType", request.auditType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOperationOssUploadPolicyWithOptions(request, runtime);
    }

    public GetQualificationUploadPolicyResponse getQualificationUploadPolicyWithOptions(GetQualificationUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetQualificationUploadPolicyResponse getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualificationUploadPolicyWithOptions(request, runtime);
    }

    public ListEmailVerificationResponse listEmailVerificationWithOptions(ListEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEmailVerificationResponse listEmailVerification(ListEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmailVerificationWithOptions(request, runtime);
    }

    public ListServerLockResponse listServerLockWithOptions(ListServerLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListServerLockResponse listServerLock(ListServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerLockWithOptions(request, runtime);
    }

    public LookupTmchNoticeResponse lookupTmchNoticeWithOptions(LookupTmchNoticeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public LookupTmchNoticeResponse lookupTmchNotice(LookupTmchNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupTmchNoticeWithOptions(request, runtime);
    }

    public PollTaskResultResponse pollTaskResultWithOptions(PollTaskResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public PollTaskResultResponse pollTaskResult(PollTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pollTaskResultWithOptions(request, runtime);
    }

    public QueryAdvancedDomainListResponse queryAdvancedDomainListWithOptions(QueryAdvancedDomainListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAdvancedDomainListResponse queryAdvancedDomainList(QueryAdvancedDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAdvancedDomainListWithOptions(request, runtime);
    }

    public QueryArtExtensionResponse queryArtExtensionWithOptions(QueryArtExtensionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryArtExtensionResponse queryArtExtension(QueryArtExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryArtExtensionWithOptions(request, runtime);
    }

    public QueryChangeLogListResponse queryChangeLogListWithOptions(QueryChangeLogListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryChangeLogListResponse queryChangeLogList(QueryChangeLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryChangeLogListWithOptions(request, runtime);
    }

    public QueryContactInfoResponse queryContactInfoWithOptions(QueryContactInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryContactInfoResponse queryContactInfo(QueryContactInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContactInfoWithOptions(request, runtime);
    }

    public QueryDSRecordResponse queryDSRecordWithOptions(QueryDSRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDSRecordResponse queryDSRecord(QueryDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDSRecordWithOptions(request, runtime);
    }

    public QueryDnsHostResponse queryDnsHostWithOptions(QueryDnsHostRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDnsHostResponse queryDnsHost(QueryDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDnsHostWithOptions(request, runtime);
    }

    public QueryDomainAdminDivisionResponse queryDomainAdminDivisionWithOptions(QueryDomainAdminDivisionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainAdminDivisionResponse queryDomainAdminDivision(QueryDomainAdminDivisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainAdminDivisionWithOptions(request, runtime);
    }

    public QueryDomainByDomainNameResponse queryDomainByDomainNameWithOptions(QueryDomainByDomainNameRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainByDomainNameResponse queryDomainByDomainName(QueryDomainByDomainNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainByDomainNameWithOptions(request, runtime);
    }

    public QueryDomainByInstanceIdResponse queryDomainByInstanceIdWithOptions(QueryDomainByInstanceIdRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainByInstanceIdResponse queryDomainByInstanceId(QueryDomainByInstanceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainByInstanceIdWithOptions(request, runtime);
    }

    public QueryDomainGroupListResponse queryDomainGroupListWithOptions(QueryDomainGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainGroupName)) {
            query.put("DomainGroupName", request.domainGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDeletingGroup)) {
            query.put("ShowDeletingGroup", request.showDeletingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainGroupListResponse queryDomainGroupList(QueryDomainGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainGroupListWithOptions(request, runtime);
    }

    public QueryDomainListResponse queryDomainListWithOptions(QueryDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.startExpirationDate)) {
            query.put("StartExpirationDate", request.startExpirationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRegistrationDate)) {
            query.put("StartRegistrationDate", request.startRegistrationDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainListResponse queryDomainList(QueryDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainListWithOptions(request, runtime);
    }

    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfoWithOptions(QueryDomainRealNameVerificationInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainRealNameVerificationInfoWithOptions(request, runtime);
    }

    public QueryDomainSuffixResponse queryDomainSuffixWithOptions(QueryDomainSuffixRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryDomainSuffixResponse queryDomainSuffix(QueryDomainSuffixRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainSuffixWithOptions(request, runtime);
    }

    public QueryEmailVerificationResponse queryEmailVerificationWithOptions(QueryEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryEmailVerificationResponse queryEmailVerification(QueryEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEmailVerificationWithOptions(request, runtime);
    }

    public QueryEnsAssociationResponse queryEnsAssociationWithOptions(QueryEnsAssociationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryEnsAssociationResponse queryEnsAssociation(QueryEnsAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEnsAssociationWithOptions(request, runtime);
    }

    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerificationWithOptions(QueryFailReasonForDomainRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailReasonForDomainRealNameVerificationWithOptions(request, runtime);
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualificationWithOptions(QueryFailingReasonListForQualificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailingReasonListForQualificationWithOptions(request, runtime);
    }

    public QueryLocalEnsAssociationResponse queryLocalEnsAssociationWithOptions(QueryLocalEnsAssociationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryLocalEnsAssociationResponse queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLocalEnsAssociationWithOptions(request, runtime);
    }

    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetailWithOptions(QueryOperationAuditInfoDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditRecordId)) {
            query.put("AuditRecordId", request.auditRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOperationAuditInfoDetailWithOptions(request, runtime);
    }

    public QueryOperationAuditInfoListResponse queryOperationAuditInfoListWithOptions(QueryOperationAuditInfoListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryOperationAuditInfoListResponse queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOperationAuditInfoListWithOptions(request, runtime);
    }

    public QueryQualificationDetailResponse queryQualificationDetailWithOptions(QueryQualificationDetailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryQualificationDetailResponse queryQualificationDetail(QueryQualificationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificationDetailWithOptions(request, runtime);
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfoWithOptions(QueryRegistrantProfileRealNameVerificationInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRegistrantProfileRealNameVerificationInfoWithOptions(request, runtime);
    }

    public QueryRegistrantProfilesResponse queryRegistrantProfilesWithOptions(QueryRegistrantProfilesRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.zhRegistrantOrganization)) {
            query.put("ZhRegistrantOrganization", request.zhRegistrantOrganization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryRegistrantProfilesResponse queryRegistrantProfiles(QueryRegistrantProfilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRegistrantProfilesWithOptions(request, runtime);
    }

    public QueryServerLockResponse queryServerLockWithOptions(QueryServerLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryServerLockResponse queryServerLock(QueryServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServerLockWithOptions(request, runtime);
    }

    public QueryTaskDetailHistoryResponse queryTaskDetailHistoryWithOptions(QueryTaskDetailHistoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTaskDetailHistoryResponse queryTaskDetailHistory(QueryTaskDetailHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskDetailHistoryWithOptions(request, runtime);
    }

    public QueryTaskDetailListResponse queryTaskDetailListWithOptions(QueryTaskDetailListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTaskDetailListResponse queryTaskDetailList(QueryTaskDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskDetailListWithOptions(request, runtime);
    }

    public QueryTaskInfoHistoryResponse queryTaskInfoHistoryWithOptions(QueryTaskInfoHistoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTaskInfoHistoryResponse queryTaskInfoHistory(QueryTaskInfoHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskInfoHistoryWithOptions(request, runtime);
    }

    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdWithOptions(QueryTransferInByInstanceIdRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferInByInstanceIdWithOptions(request, runtime);
    }

    public QueryTransferInListResponse queryTransferInListWithOptions(QueryTransferInListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTransferInListResponse queryTransferInList(QueryTransferInListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferInListWithOptions(request, runtime);
    }

    public QueryTransferOutInfoResponse queryTransferOutInfoWithOptions(QueryTransferOutInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryTransferOutInfoResponse queryTransferOutInfo(QueryTransferOutInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferOutInfoWithOptions(request, runtime);
    }

    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerificationWithOptions(RegistrantProfileRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    public ResendEmailVerificationResponse resendEmailVerificationWithOptions(ResendEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ResendEmailVerificationResponse resendEmailVerification(ResendEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendEmailVerificationWithOptions(request, runtime);
    }

    public ResetQualificationVerificationResponse resetQualificationVerificationWithOptions(ResetQualificationVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ResetQualificationVerificationResponse resetQualificationVerification(ResetQualificationVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetQualificationVerificationWithOptions(request, runtime);
    }

    public SaveBatchDomainRemarkResponse saveBatchDomainRemarkWithOptions(SaveBatchDomainRemarkRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchDomainRemarkResponse saveBatchDomainRemark(SaveBatchDomainRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchDomainRemarkWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivateWithOptions(SaveBatchTaskForCreatingOrderActivateRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeemWithOptions(SaveBatchTaskForCreatingOrderRedeemRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenewWithOptions(SaveBatchTaskForCreatingOrderRenewRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransferWithOptions(SaveBatchTaskForCreatingOrderTransferRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyServiceWithOptions(SaveBatchTaskForDomainNameProxyServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDnsWithOptions(SaveBatchTaskForModifyingDomainDnsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForModifyingDomainDnsWithOptions(request, runtime);
    }

    public SaveBatchTaskForReserveDropListDomainResponse saveBatchTaskForReserveDropListDomainWithOptions(SaveBatchTaskForReserveDropListDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactTemplateId)) {
            query.put("ContactTemplateId", request.contactTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domains)) {
            query.put("Domains", request.domains);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForReserveDropListDomainResponse saveBatchTaskForReserveDropListDomain(SaveBatchTaskForReserveDropListDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForReserveDropListDomainWithOptions(request, runtime);
    }

    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLockWithOptions(SaveBatchTaskForTransferProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLockWithOptions(SaveBatchTaskForUpdateProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(request, runtime);
    }

    public SaveDomainGroupResponse saveDomainGroupWithOptions(SaveDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveDomainGroupResponse saveDomainGroup(SaveDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveDomainGroupWithOptions(request, runtime);
    }

    public SaveRegistrantProfileResponse saveRegistrantProfileWithOptions(SaveRegistrantProfileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveRegistrantProfileResponse saveRegistrantProfile(SaveRegistrantProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveRegistrantProfileWithOptions(request, runtime);
    }

    public SaveRegistrantProfileRealNameVerificationResponse saveRegistrantProfileRealNameVerificationWithOptions(SaveRegistrantProfileRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveRegistrantProfileRealNameVerificationResponse saveRegistrantProfileRealNameVerification(SaveRegistrantProfileRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecordWithOptions(SaveSingleTaskForAddingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForAddingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOutWithOptions(SaveSingleTaskForApprovingTransferOutRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForApprovingTransferOutWithOptions(request, runtime);
    }

    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEnsWithOptions(SaveSingleTaskForAssociatingEnsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForAssociatingEnsWithOptions(request, runtime);
    }

    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferInWithOptions(SaveSingleTaskForCancelingTransferInRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferInWithOptions(request, runtime);
    }

    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOutWithOptions(SaveSingleTaskForCancelingTransferOutRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferOutWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHostWithOptions(SaveSingleTaskForCreatingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivateWithOptions(SaveSingleTaskForCreatingOrderActivateRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeemWithOptions(SaveSingleTaskForCreatingOrderRedeemRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenewWithOptions(SaveSingleTaskForCreatingOrderRenewRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransferWithOptions(SaveSingleTaskForCreatingOrderTransferRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecordWithOptions(SaveSingleTaskForDeletingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDeletingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHostWithOptions(SaveSingleTaskForDeletingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDeletingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEnsWithOptions(SaveSingleTaskForDisassociatingEnsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDisassociatingEnsWithOptions(request, runtime);
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyServiceWithOptions(SaveSingleTaskForDomainNameProxyServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecordWithOptions(SaveSingleTaskForModifyingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForModifyingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHostWithOptions(SaveSingleTaskForModifyingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForModifyingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(request, runtime);
    }

    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtensionWithOptions(SaveSingleTaskForSaveArtExtensionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSaveArtExtensionWithOptions(request, runtime);
    }

    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecordWithOptions(SaveSingleTaskForSynchronizingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHostWithOptions(SaveSingleTaskForSynchronizingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLockWithOptions(SaveSingleTaskForTransferProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLockWithOptions(SaveSingleTaskForUpdateProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfoWithOptions(SaveSingleTaskForUpdatingContactInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForUpdatingContactInfoWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDeleteWithOptions(SaveTaskForSubmittingDomainDeleteRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainDeleteWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(request, runtime);
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(request, runtime);
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(request, runtime);
    }

    public ScrollDomainListResponse scrollDomainListWithOptions(ScrollDomainListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ScrollDomainListResponse scrollDomainList(ScrollDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scrollDomainListWithOptions(request, runtime);
    }

    public SetDefaultRegistrantProfileResponse setDefaultRegistrantProfileWithOptions(SetDefaultRegistrantProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.registrantProfileId)) {
            query.put("RegistrantProfileId", request.registrantProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SetDefaultRegistrantProfileResponse setDefaultRegistrantProfile(SetDefaultRegistrantProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultRegistrantProfileWithOptions(request, runtime);
    }

    public SubmitEmailVerificationResponse submitEmailVerificationWithOptions(SubmitEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SubmitEmailVerificationResponse submitEmailVerification(SubmitEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitEmailVerificationWithOptions(request, runtime);
    }

    public SubmitOperationAuditInfoResponse submitOperationAuditInfoWithOptions(SubmitOperationAuditInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SubmitOperationAuditInfoResponse submitOperationAuditInfo(SubmitOperationAuditInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOperationAuditInfoWithOptions(request, runtime);
    }

    public SubmitOperationCredentialsResponse submitOperationCredentialsWithOptions(SubmitOperationCredentialsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SubmitOperationCredentialsResponse submitOperationCredentials(SubmitOperationCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOperationCredentialsWithOptions(request, runtime);
    }

    public TransferInCheckMailTokenResponse transferInCheckMailTokenWithOptions(TransferInCheckMailTokenRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public TransferInCheckMailTokenResponse transferInCheckMailToken(TransferInCheckMailTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInCheckMailTokenWithOptions(request, runtime);
    }

    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCodeWithOptions(TransferInReenterTransferAuthorizationCodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInReenterTransferAuthorizationCodeWithOptions(request, runtime);
    }

    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmailWithOptions(TransferInRefetchWhoisEmailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInRefetchWhoisEmailWithOptions(request, runtime);
    }

    public TransferInResendMailTokenResponse transferInResendMailTokenWithOptions(TransferInResendMailTokenRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public TransferInResendMailTokenResponse transferInResendMailToken(TransferInResendMailTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInResendMailTokenWithOptions(request, runtime);
    }

    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroupWithOptions(UpdateDomainToDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainToDomainGroupWithOptions(request, runtime);
    }

    public VerifyContactFieldResponse verifyContactFieldWithOptions(VerifyContactFieldRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public VerifyContactFieldResponse verifyContactField(VerifyContactFieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyContactFieldWithOptions(request, runtime);
    }

    public VerifyEmailResponse verifyEmailWithOptions(VerifyEmailRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyEmailWithOptions(request, runtime);
    }
}
