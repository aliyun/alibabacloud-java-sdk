// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129;

import com.aliyun.tea.*;
import com.aliyun.domain20180129.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcknowledgeTaskResult", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new AcknowledgeTaskResultResponse());
    }

    public AcknowledgeTaskResultResponse acknowledgeTaskResult(AcknowledgeTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acknowledgeTaskResultWithOptions(request, runtime);
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWordWithOptions(BatchFuzzyMatchDomainSensitiveWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchFuzzyMatchDomainSensitiveWord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new BatchFuzzyMatchDomainSensitiveWordResponse());
    }

    public BatchFuzzyMatchDomainSensitiveWordResponse batchFuzzyMatchDomainSensitiveWord(BatchFuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchFuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    public CancelDomainVerificationResponse cancelDomainVerificationWithOptions(CancelDomainVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelDomainVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CancelDomainVerificationResponse());
    }

    public CancelDomainVerificationResponse cancelDomainVerification(CancelDomainVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelDomainVerificationWithOptions(request, runtime);
    }

    public CancelOperationAuditResponse cancelOperationAuditWithOptions(CancelOperationAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOperationAudit", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOperationAuditResponse());
    }

    public CancelOperationAuditResponse cancelOperationAudit(CancelOperationAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOperationAuditWithOptions(request, runtime);
    }

    public CancelQualificationVerificationResponse cancelQualificationVerificationWithOptions(CancelQualificationVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelQualificationVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CancelQualificationVerificationResponse());
    }

    public CancelQualificationVerificationResponse cancelQualificationVerification(CancelQualificationVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelQualificationVerificationWithOptions(request, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelTask", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CancelTaskResponse());
    }

    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDomain", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDomainResponse());
    }

    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    public CheckDomainSunriseClaimResponse checkDomainSunriseClaimWithOptions(CheckDomainSunriseClaimRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDomainSunriseClaim", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDomainSunriseClaimResponse());
    }

    public CheckDomainSunriseClaimResponse checkDomainSunriseClaim(CheckDomainSunriseClaimRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainSunriseClaimWithOptions(request, runtime);
    }

    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLockWithOptions(CheckMaxYearOfServerLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckMaxYearOfServerLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CheckMaxYearOfServerLockResponse());
    }

    public CheckMaxYearOfServerLockResponse checkMaxYearOfServerLock(CheckMaxYearOfServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMaxYearOfServerLockWithOptions(request, runtime);
    }

    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApplyWithOptions(CheckProcessingServerLockApplyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckProcessingServerLockApply", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CheckProcessingServerLockApplyResponse());
    }

    public CheckProcessingServerLockApplyResponse checkProcessingServerLockApply(CheckProcessingServerLockApplyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkProcessingServerLockApplyWithOptions(request, runtime);
    }

    public CheckTransferInFeasibilityResponse checkTransferInFeasibilityWithOptions(CheckTransferInFeasibilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckTransferInFeasibility", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new CheckTransferInFeasibilityResponse());
    }

    public CheckTransferInFeasibilityResponse checkTransferInFeasibility(CheckTransferInFeasibilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTransferInFeasibilityWithOptions(request, runtime);
    }

    public ConfirmTransferInEmailResponse confirmTransferInEmailWithOptions(ConfirmTransferInEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmTransferInEmail", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmTransferInEmailResponse());
    }

    public ConfirmTransferInEmailResponse confirmTransferInEmail(ConfirmTransferInEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmTransferInEmailWithOptions(request, runtime);
    }

    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomainGroup", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainGroupResponse());
    }

    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    public DeleteEmailVerificationResponse deleteEmailVerificationWithOptions(DeleteEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEmailVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEmailVerificationResponse());
    }

    public DeleteEmailVerificationResponse deleteEmailVerification(DeleteEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEmailVerificationWithOptions(request, runtime);
    }

    public DeleteRegistrantProfileResponse deleteRegistrantProfileWithOptions(DeleteRegistrantProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRegistrantProfile", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRegistrantProfileResponse());
    }

    public DeleteRegistrantProfileResponse deleteRegistrantProfile(DeleteRegistrantProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRegistrantProfileWithOptions(request, runtime);
    }

    public EmailVerifiedResponse emailVerifiedWithOptions(EmailVerifiedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EmailVerified", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new EmailVerifiedResponse());
    }

    public EmailVerifiedResponse emailVerified(EmailVerifiedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emailVerifiedWithOptions(request, runtime);
    }

    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWordWithOptions(FuzzyMatchDomainSensitiveWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FuzzyMatchDomainSensitiveWord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new FuzzyMatchDomainSensitiveWordResponse());
    }

    public FuzzyMatchDomainSensitiveWordResponse fuzzyMatchDomainSensitiveWord(FuzzyMatchDomainSensitiveWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fuzzyMatchDomainSensitiveWordWithOptions(request, runtime);
    }

    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicyWithOptions(GetOperationOssUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOperationOssUploadPolicy", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new GetOperationOssUploadPolicyResponse());
    }

    public GetOperationOssUploadPolicyResponse getOperationOssUploadPolicy(GetOperationOssUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOperationOssUploadPolicyWithOptions(request, runtime);
    }

    public GetQualificationUploadPolicyResponse getQualificationUploadPolicyWithOptions(GetQualificationUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualificationUploadPolicy", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualificationUploadPolicyResponse());
    }

    public GetQualificationUploadPolicyResponse getQualificationUploadPolicy(GetQualificationUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualificationUploadPolicyWithOptions(request, runtime);
    }

    public ListEmailVerificationResponse listEmailVerificationWithOptions(ListEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEmailVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListEmailVerificationResponse());
    }

    public ListEmailVerificationResponse listEmailVerification(ListEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmailVerificationWithOptions(request, runtime);
    }

    public ListServerLockResponse listServerLockWithOptions(ListServerLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServerLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListServerLockResponse());
    }

    public ListServerLockResponse listServerLock(ListServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerLockWithOptions(request, runtime);
    }

    public LookupTmchNoticeResponse lookupTmchNoticeWithOptions(LookupTmchNoticeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LookupTmchNotice", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new LookupTmchNoticeResponse());
    }

    public LookupTmchNoticeResponse lookupTmchNotice(LookupTmchNoticeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupTmchNoticeWithOptions(request, runtime);
    }

    public PollTaskResultResponse pollTaskResultWithOptions(PollTaskResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PollTaskResult", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new PollTaskResultResponse());
    }

    public PollTaskResultResponse pollTaskResult(PollTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pollTaskResultWithOptions(request, runtime);
    }

    public QueryAdvancedDomainListResponse queryAdvancedDomainListWithOptions(QueryAdvancedDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAdvancedDomainList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAdvancedDomainListResponse());
    }

    public QueryAdvancedDomainListResponse queryAdvancedDomainList(QueryAdvancedDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAdvancedDomainListWithOptions(request, runtime);
    }

    public QueryArtExtensionResponse queryArtExtensionWithOptions(QueryArtExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryArtExtension", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryArtExtensionResponse());
    }

    public QueryArtExtensionResponse queryArtExtension(QueryArtExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryArtExtensionWithOptions(request, runtime);
    }

    public QueryChangeLogListResponse queryChangeLogListWithOptions(QueryChangeLogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryChangeLogList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryChangeLogListResponse());
    }

    public QueryChangeLogListResponse queryChangeLogList(QueryChangeLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryChangeLogListWithOptions(request, runtime);
    }

    public QueryContactInfoResponse queryContactInfoWithOptions(QueryContactInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryContactInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryContactInfoResponse());
    }

    public QueryContactInfoResponse queryContactInfo(QueryContactInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContactInfoWithOptions(request, runtime);
    }

    public QueryDnsHostResponse queryDnsHostWithOptions(QueryDnsHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDnsHost", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDnsHostResponse());
    }

    public QueryDnsHostResponse queryDnsHost(QueryDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDnsHostWithOptions(request, runtime);
    }

    public QueryDomainAdminDivisionResponse queryDomainAdminDivisionWithOptions(QueryDomainAdminDivisionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainAdminDivision", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainAdminDivisionResponse());
    }

    public QueryDomainAdminDivisionResponse queryDomainAdminDivision(QueryDomainAdminDivisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainAdminDivisionWithOptions(request, runtime);
    }

    public QueryDomainByDomainNameResponse queryDomainByDomainNameWithOptions(QueryDomainByDomainNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainByDomainName", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainByDomainNameResponse());
    }

    public QueryDomainByDomainNameResponse queryDomainByDomainName(QueryDomainByDomainNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainByDomainNameWithOptions(request, runtime);
    }

    public QueryDomainByInstanceIdResponse queryDomainByInstanceIdWithOptions(QueryDomainByInstanceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainByInstanceId", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainByInstanceIdResponse());
    }

    public QueryDomainByInstanceIdResponse queryDomainByInstanceId(QueryDomainByInstanceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainByInstanceIdWithOptions(request, runtime);
    }

    public QueryDomainGroupListResponse queryDomainGroupListWithOptions(QueryDomainGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainGroupList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainGroupListResponse());
    }

    public QueryDomainGroupListResponse queryDomainGroupList(QueryDomainGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainGroupListWithOptions(request, runtime);
    }

    public QueryDomainListResponse queryDomainListWithOptions(QueryDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainListResponse());
    }

    public QueryDomainListResponse queryDomainList(QueryDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainListWithOptions(request, runtime);
    }

    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfoWithOptions(QueryDomainRealNameVerificationInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainRealNameVerificationInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainRealNameVerificationInfoResponse());
    }

    public QueryDomainRealNameVerificationInfoResponse queryDomainRealNameVerificationInfo(QueryDomainRealNameVerificationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainRealNameVerificationInfoWithOptions(request, runtime);
    }

    public QueryDomainSuffixResponse queryDomainSuffixWithOptions(QueryDomainSuffixRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDomainSuffix", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDomainSuffixResponse());
    }

    public QueryDomainSuffixResponse queryDomainSuffix(QueryDomainSuffixRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDomainSuffixWithOptions(request, runtime);
    }

    public QueryDSRecordResponse queryDSRecordWithOptions(QueryDSRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDSRecord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDSRecordResponse());
    }

    public QueryDSRecordResponse queryDSRecord(QueryDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDSRecordWithOptions(request, runtime);
    }

    public QueryEmailVerificationResponse queryEmailVerificationWithOptions(QueryEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEmailVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEmailVerificationResponse());
    }

    public QueryEmailVerificationResponse queryEmailVerification(QueryEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEmailVerificationWithOptions(request, runtime);
    }

    public QueryEnsAssociationResponse queryEnsAssociationWithOptions(QueryEnsAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEnsAssociation", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEnsAssociationResponse());
    }

    public QueryEnsAssociationResponse queryEnsAssociation(QueryEnsAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEnsAssociationWithOptions(request, runtime);
    }

    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualificationWithOptions(QueryFailingReasonListForQualificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFailingReasonListForQualification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFailingReasonListForQualificationResponse());
    }

    public QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualification(QueryFailingReasonListForQualificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailingReasonListForQualificationWithOptions(request, runtime);
    }

    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerificationWithOptions(QueryFailReasonForDomainRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFailReasonForDomainRealNameVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFailReasonForDomainRealNameVerificationResponse());
    }

    public QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerification(QueryFailReasonForDomainRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailReasonForDomainRealNameVerificationWithOptions(request, runtime);
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFailReasonForRegistrantProfileRealNameVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFailReasonForRegistrantProfileRealNameVerificationResponse());
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerification(QueryFailReasonForRegistrantProfileRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFailReasonForRegistrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    public QueryLocalEnsAssociationResponse queryLocalEnsAssociationWithOptions(QueryLocalEnsAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryLocalEnsAssociation", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryLocalEnsAssociationResponse());
    }

    public QueryLocalEnsAssociationResponse queryLocalEnsAssociation(QueryLocalEnsAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLocalEnsAssociationWithOptions(request, runtime);
    }

    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetailWithOptions(QueryOperationAuditInfoDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOperationAuditInfoDetail", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOperationAuditInfoDetailResponse());
    }

    public QueryOperationAuditInfoDetailResponse queryOperationAuditInfoDetail(QueryOperationAuditInfoDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOperationAuditInfoDetailWithOptions(request, runtime);
    }

    public QueryOperationAuditInfoListResponse queryOperationAuditInfoListWithOptions(QueryOperationAuditInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOperationAuditInfoList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOperationAuditInfoListResponse());
    }

    public QueryOperationAuditInfoListResponse queryOperationAuditInfoList(QueryOperationAuditInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOperationAuditInfoListWithOptions(request, runtime);
    }

    public QueryQualificationDetailResponse queryQualificationDetailWithOptions(QueryQualificationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryQualificationDetail", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryQualificationDetailResponse());
    }

    public QueryQualificationDetailResponse queryQualificationDetail(QueryQualificationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificationDetailWithOptions(request, runtime);
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfoWithOptions(QueryRegistrantProfileRealNameVerificationInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRegistrantProfileRealNameVerificationInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRegistrantProfileRealNameVerificationInfoResponse());
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse queryRegistrantProfileRealNameVerificationInfo(QueryRegistrantProfileRealNameVerificationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRegistrantProfileRealNameVerificationInfoWithOptions(request, runtime);
    }

    public QueryRegistrantProfilesResponse queryRegistrantProfilesWithOptions(QueryRegistrantProfilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRegistrantProfiles", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRegistrantProfilesResponse());
    }

    public QueryRegistrantProfilesResponse queryRegistrantProfiles(QueryRegistrantProfilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRegistrantProfilesWithOptions(request, runtime);
    }

    public QueryServerLockResponse queryServerLockWithOptions(QueryServerLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryServerLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryServerLockResponse());
    }

    public QueryServerLockResponse queryServerLock(QueryServerLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServerLockWithOptions(request, runtime);
    }

    public QueryTaskDetailHistoryResponse queryTaskDetailHistoryWithOptions(QueryTaskDetailHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskDetailHistory", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskDetailHistoryResponse());
    }

    public QueryTaskDetailHistoryResponse queryTaskDetailHistory(QueryTaskDetailHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskDetailHistoryWithOptions(request, runtime);
    }

    public QueryTaskDetailListResponse queryTaskDetailListWithOptions(QueryTaskDetailListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskDetailList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskDetailListResponse());
    }

    public QueryTaskDetailListResponse queryTaskDetailList(QueryTaskDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskDetailListWithOptions(request, runtime);
    }

    public QueryTaskInfoHistoryResponse queryTaskInfoHistoryWithOptions(QueryTaskInfoHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskInfoHistory", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskInfoHistoryResponse());
    }

    public QueryTaskInfoHistoryResponse queryTaskInfoHistory(QueryTaskInfoHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskInfoHistoryWithOptions(request, runtime);
    }

    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskListResponse());
    }

    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceIdWithOptions(QueryTransferInByInstanceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTransferInByInstanceId", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTransferInByInstanceIdResponse());
    }

    public QueryTransferInByInstanceIdResponse queryTransferInByInstanceId(QueryTransferInByInstanceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferInByInstanceIdWithOptions(request, runtime);
    }

    public QueryTransferInListResponse queryTransferInListWithOptions(QueryTransferInListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTransferInList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTransferInListResponse());
    }

    public QueryTransferInListResponse queryTransferInList(QueryTransferInListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferInListWithOptions(request, runtime);
    }

    public QueryTransferOutInfoResponse queryTransferOutInfoWithOptions(QueryTransferOutInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTransferOutInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTransferOutInfoResponse());
    }

    public QueryTransferOutInfoResponse queryTransferOutInfo(QueryTransferOutInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTransferOutInfoWithOptions(request, runtime);
    }

    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerificationWithOptions(RegistrantProfileRealNameVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegistrantProfileRealNameVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new RegistrantProfileRealNameVerificationResponse());
    }

    public RegistrantProfileRealNameVerificationResponse registrantProfileRealNameVerification(RegistrantProfileRealNameVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registrantProfileRealNameVerificationWithOptions(request, runtime);
    }

    public ResendEmailVerificationResponse resendEmailVerificationWithOptions(ResendEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResendEmailVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ResendEmailVerificationResponse());
    }

    public ResendEmailVerificationResponse resendEmailVerification(ResendEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendEmailVerificationWithOptions(request, runtime);
    }

    public ResetQualificationVerificationResponse resetQualificationVerificationWithOptions(ResetQualificationVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetQualificationVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ResetQualificationVerificationResponse());
    }

    public ResetQualificationVerificationResponse resetQualificationVerification(ResetQualificationVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetQualificationVerificationWithOptions(request, runtime);
    }

    public SaveBatchDomainRemarkResponse saveBatchDomainRemarkWithOptions(SaveBatchDomainRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchDomainRemark", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchDomainRemarkResponse());
    }

    public SaveBatchDomainRemarkResponse saveBatchDomainRemark(SaveBatchDomainRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchDomainRemarkWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivateWithOptions(SaveBatchTaskForCreatingOrderActivateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForCreatingOrderActivate", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForCreatingOrderActivateResponse());
    }

    public SaveBatchTaskForCreatingOrderActivateResponse saveBatchTaskForCreatingOrderActivate(SaveBatchTaskForCreatingOrderActivateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeemWithOptions(SaveBatchTaskForCreatingOrderRedeemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForCreatingOrderRedeem", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForCreatingOrderRedeemResponse());
    }

    public SaveBatchTaskForCreatingOrderRedeemResponse saveBatchTaskForCreatingOrderRedeem(SaveBatchTaskForCreatingOrderRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenewWithOptions(SaveBatchTaskForCreatingOrderRenewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForCreatingOrderRenew", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForCreatingOrderRenewResponse());
    }

    public SaveBatchTaskForCreatingOrderRenewResponse saveBatchTaskForCreatingOrderRenew(SaveBatchTaskForCreatingOrderRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransferWithOptions(SaveBatchTaskForCreatingOrderTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForCreatingOrderTransfer", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForCreatingOrderTransferResponse());
    }

    public SaveBatchTaskForCreatingOrderTransferResponse saveBatchTaskForCreatingOrderTransfer(SaveBatchTaskForCreatingOrderTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyServiceWithOptions(SaveBatchTaskForDomainNameProxyServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForDomainNameProxyService", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForDomainNameProxyServiceResponse());
    }

    public SaveBatchTaskForDomainNameProxyServiceResponse saveBatchTaskForDomainNameProxyService(SaveBatchTaskForDomainNameProxyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDnsWithOptions(SaveBatchTaskForModifyingDomainDnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForModifyingDomainDns", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForModifyingDomainDnsResponse());
    }

    public SaveBatchTaskForModifyingDomainDnsResponse saveBatchTaskForModifyingDomainDns(SaveBatchTaskForModifyingDomainDnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForModifyingDomainDnsWithOptions(request, runtime);
    }

    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLockWithOptions(SaveBatchTaskForTransferProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForTransferProhibitionLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForTransferProhibitionLockResponse());
    }

    public SaveBatchTaskForTransferProhibitionLockResponse saveBatchTaskForTransferProhibitionLock(SaveBatchTaskForTransferProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLockWithOptions(SaveBatchTaskForUpdateProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForUpdateProhibitionLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForUpdateProhibitionLockResponse());
    }

    public SaveBatchTaskForUpdateProhibitionLockResponse saveBatchTaskForUpdateProhibitionLock(SaveBatchTaskForUpdateProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForUpdatingContactInfoByNewContact", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForUpdatingContactInfoByNewContactResponse());
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse saveBatchTaskForUpdatingContactInfoByNewContact(SaveBatchTaskForUpdatingContactInfoByNewContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByNewContactWithOptions(request, runtime);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse());
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse saveBatchTaskForUpdatingContactInfoByRegistrantProfileId(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBatchTaskForUpdatingContactInfoByRegistrantProfileIdWithOptions(request, runtime);
    }

    public SaveDomainGroupResponse saveDomainGroupWithOptions(SaveDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveDomainGroup", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveDomainGroupResponse());
    }

    public SaveDomainGroupResponse saveDomainGroup(SaveDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveDomainGroupWithOptions(request, runtime);
    }

    public SaveRegistrantProfileResponse saveRegistrantProfileWithOptions(SaveRegistrantProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveRegistrantProfile", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveRegistrantProfileResponse());
    }

    public SaveRegistrantProfileResponse saveRegistrantProfile(SaveRegistrantProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveRegistrantProfileWithOptions(request, runtime);
    }

    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecordWithOptions(SaveSingleTaskForAddingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForAddingDSRecord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForAddingDSRecordResponse());
    }

    public SaveSingleTaskForAddingDSRecordResponse saveSingleTaskForAddingDSRecord(SaveSingleTaskForAddingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForAddingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOutWithOptions(SaveSingleTaskForApprovingTransferOutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForApprovingTransferOut", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForApprovingTransferOutResponse());
    }

    public SaveSingleTaskForApprovingTransferOutResponse saveSingleTaskForApprovingTransferOut(SaveSingleTaskForApprovingTransferOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForApprovingTransferOutWithOptions(request, runtime);
    }

    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEnsWithOptions(SaveSingleTaskForAssociatingEnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForAssociatingEns", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForAssociatingEnsResponse());
    }

    public SaveSingleTaskForAssociatingEnsResponse saveSingleTaskForAssociatingEns(SaveSingleTaskForAssociatingEnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForAssociatingEnsWithOptions(request, runtime);
    }

    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferInWithOptions(SaveSingleTaskForCancelingTransferInRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCancelingTransferIn", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCancelingTransferInResponse());
    }

    public SaveSingleTaskForCancelingTransferInResponse saveSingleTaskForCancelingTransferIn(SaveSingleTaskForCancelingTransferInRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferInWithOptions(request, runtime);
    }

    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOutWithOptions(SaveSingleTaskForCancelingTransferOutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCancelingTransferOut", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCancelingTransferOutResponse());
    }

    public SaveSingleTaskForCancelingTransferOutResponse saveSingleTaskForCancelingTransferOut(SaveSingleTaskForCancelingTransferOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCancelingTransferOutWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHostWithOptions(SaveSingleTaskForCreatingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCreatingDnsHost", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCreatingDnsHostResponse());
    }

    public SaveSingleTaskForCreatingDnsHostResponse saveSingleTaskForCreatingDnsHost(SaveSingleTaskForCreatingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivateWithOptions(SaveSingleTaskForCreatingOrderActivateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCreatingOrderActivate", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCreatingOrderActivateResponse());
    }

    public SaveSingleTaskForCreatingOrderActivateResponse saveSingleTaskForCreatingOrderActivate(SaveSingleTaskForCreatingOrderActivateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderActivateWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeemWithOptions(SaveSingleTaskForCreatingOrderRedeemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCreatingOrderRedeem", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCreatingOrderRedeemResponse());
    }

    public SaveSingleTaskForCreatingOrderRedeemResponse saveSingleTaskForCreatingOrderRedeem(SaveSingleTaskForCreatingOrderRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRedeemWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenewWithOptions(SaveSingleTaskForCreatingOrderRenewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCreatingOrderRenew", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCreatingOrderRenewResponse());
    }

    public SaveSingleTaskForCreatingOrderRenewResponse saveSingleTaskForCreatingOrderRenew(SaveSingleTaskForCreatingOrderRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderRenewWithOptions(request, runtime);
    }

    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransferWithOptions(SaveSingleTaskForCreatingOrderTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForCreatingOrderTransfer", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForCreatingOrderTransferResponse());
    }

    public SaveSingleTaskForCreatingOrderTransferResponse saveSingleTaskForCreatingOrderTransfer(SaveSingleTaskForCreatingOrderTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForCreatingOrderTransferWithOptions(request, runtime);
    }

    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHostWithOptions(SaveSingleTaskForDeletingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForDeletingDnsHost", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForDeletingDnsHostResponse());
    }

    public SaveSingleTaskForDeletingDnsHostResponse saveSingleTaskForDeletingDnsHost(SaveSingleTaskForDeletingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDeletingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecordWithOptions(SaveSingleTaskForDeletingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForDeletingDSRecord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForDeletingDSRecordResponse());
    }

    public SaveSingleTaskForDeletingDSRecordResponse saveSingleTaskForDeletingDSRecord(SaveSingleTaskForDeletingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDeletingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEnsWithOptions(SaveSingleTaskForDisassociatingEnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForDisassociatingEns", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForDisassociatingEnsResponse());
    }

    public SaveSingleTaskForDisassociatingEnsResponse saveSingleTaskForDisassociatingEns(SaveSingleTaskForDisassociatingEnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDisassociatingEnsWithOptions(request, runtime);
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyServiceWithOptions(SaveSingleTaskForDomainNameProxyServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForDomainNameProxyService", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForDomainNameProxyServiceResponse());
    }

    public SaveSingleTaskForDomainNameProxyServiceResponse saveSingleTaskForDomainNameProxyService(SaveSingleTaskForDomainNameProxyServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForDomainNameProxyServiceWithOptions(request, runtime);
    }

    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHostWithOptions(SaveSingleTaskForModifyingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForModifyingDnsHost", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForModifyingDnsHostResponse());
    }

    public SaveSingleTaskForModifyingDnsHostResponse saveSingleTaskForModifyingDnsHost(SaveSingleTaskForModifyingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForModifyingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecordWithOptions(SaveSingleTaskForModifyingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForModifyingDSRecord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForModifyingDSRecordResponse());
    }

    public SaveSingleTaskForModifyingDSRecordResponse saveSingleTaskForModifyingDSRecord(SaveSingleTaskForModifyingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForModifyingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForQueryingTransferAuthorizationCode", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForQueryingTransferAuthorizationCodeResponse());
    }

    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse saveSingleTaskForQueryingTransferAuthorizationCode(SaveSingleTaskForQueryingTransferAuthorizationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForQueryingTransferAuthorizationCodeWithOptions(request, runtime);
    }

    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtensionWithOptions(SaveSingleTaskForSaveArtExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForSaveArtExtension", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForSaveArtExtensionResponse());
    }

    public SaveSingleTaskForSaveArtExtensionResponse saveSingleTaskForSaveArtExtension(SaveSingleTaskForSaveArtExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSaveArtExtensionWithOptions(request, runtime);
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHostWithOptions(SaveSingleTaskForSynchronizingDnsHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForSynchronizingDnsHost", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForSynchronizingDnsHostResponse());
    }

    public SaveSingleTaskForSynchronizingDnsHostResponse saveSingleTaskForSynchronizingDnsHost(SaveSingleTaskForSynchronizingDnsHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDnsHostWithOptions(request, runtime);
    }

    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecordWithOptions(SaveSingleTaskForSynchronizingDSRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForSynchronizingDSRecord", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForSynchronizingDSRecordResponse());
    }

    public SaveSingleTaskForSynchronizingDSRecordResponse saveSingleTaskForSynchronizingDSRecord(SaveSingleTaskForSynchronizingDSRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForSynchronizingDSRecordWithOptions(request, runtime);
    }

    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLockWithOptions(SaveSingleTaskForTransferProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForTransferProhibitionLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForTransferProhibitionLockResponse());
    }

    public SaveSingleTaskForTransferProhibitionLockResponse saveSingleTaskForTransferProhibitionLock(SaveSingleTaskForTransferProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForTransferProhibitionLockWithOptions(request, runtime);
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLockWithOptions(SaveSingleTaskForUpdateProhibitionLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForUpdateProhibitionLock", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForUpdateProhibitionLockResponse());
    }

    public SaveSingleTaskForUpdateProhibitionLockResponse saveSingleTaskForUpdateProhibitionLock(SaveSingleTaskForUpdateProhibitionLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForUpdateProhibitionLockWithOptions(request, runtime);
    }

    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfoWithOptions(SaveSingleTaskForUpdatingContactInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveSingleTaskForUpdatingContactInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveSingleTaskForUpdatingContactInfoResponse());
    }

    public SaveSingleTaskForUpdatingContactInfoResponse saveSingleTaskForUpdatingContactInfo(SaveSingleTaskForUpdatingContactInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveSingleTaskForUpdatingContactInfoWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDeleteWithOptions(SaveTaskForSubmittingDomainDeleteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForSubmittingDomainDelete", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForSubmittingDomainDeleteResponse());
    }

    public SaveTaskForSubmittingDomainDeleteResponse saveTaskForSubmittingDomainDelete(SaveTaskForSubmittingDomainDeleteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainDeleteWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredential", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse());
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse saveTaskForSubmittingDomainRealNameVerificationByIdentityCredential(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialWithOptions(request, runtime);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse());
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileID(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDWithOptions(request, runtime);
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForUpdatingRegistrantInfoByIdentityCredential", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse());
    }

    public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialResponse saveTaskForUpdatingRegistrantInfoByIdentityCredential(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByIdentityCredentialWithOptions(request, runtime);
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse());
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse saveTaskForUpdatingRegistrantInfoByRegistrantProfileID(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForUpdatingRegistrantInfoByRegistrantProfileIDWithOptions(request, runtime);
    }

    public ScrollDomainListResponse scrollDomainListWithOptions(ScrollDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScrollDomainList", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new ScrollDomainListResponse());
    }

    public ScrollDomainListResponse scrollDomainList(ScrollDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scrollDomainListWithOptions(request, runtime);
    }

    public SubmitEmailVerificationResponse submitEmailVerificationWithOptions(SubmitEmailVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitEmailVerification", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitEmailVerificationResponse());
    }

    public SubmitEmailVerificationResponse submitEmailVerification(SubmitEmailVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitEmailVerificationWithOptions(request, runtime);
    }

    public SubmitOperationAuditInfoResponse submitOperationAuditInfoWithOptions(SubmitOperationAuditInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitOperationAuditInfo", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitOperationAuditInfoResponse());
    }

    public SubmitOperationAuditInfoResponse submitOperationAuditInfo(SubmitOperationAuditInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOperationAuditInfoWithOptions(request, runtime);
    }

    public SubmitOperationCredentialsResponse submitOperationCredentialsWithOptions(SubmitOperationCredentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitOperationCredentials", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitOperationCredentialsResponse());
    }

    public SubmitOperationCredentialsResponse submitOperationCredentials(SubmitOperationCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOperationCredentialsWithOptions(request, runtime);
    }

    public TransferInCheckMailTokenResponse transferInCheckMailTokenWithOptions(TransferInCheckMailTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferInCheckMailToken", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new TransferInCheckMailTokenResponse());
    }

    public TransferInCheckMailTokenResponse transferInCheckMailToken(TransferInCheckMailTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInCheckMailTokenWithOptions(request, runtime);
    }

    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCodeWithOptions(TransferInReenterTransferAuthorizationCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferInReenterTransferAuthorizationCode", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new TransferInReenterTransferAuthorizationCodeResponse());
    }

    public TransferInReenterTransferAuthorizationCodeResponse transferInReenterTransferAuthorizationCode(TransferInReenterTransferAuthorizationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInReenterTransferAuthorizationCodeWithOptions(request, runtime);
    }

    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmailWithOptions(TransferInRefetchWhoisEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferInRefetchWhoisEmail", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new TransferInRefetchWhoisEmailResponse());
    }

    public TransferInRefetchWhoisEmailResponse transferInRefetchWhoisEmail(TransferInRefetchWhoisEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInRefetchWhoisEmailWithOptions(request, runtime);
    }

    public TransferInResendMailTokenResponse transferInResendMailTokenWithOptions(TransferInResendMailTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferInResendMailToken", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new TransferInResendMailTokenResponse());
    }

    public TransferInResendMailTokenResponse transferInResendMailToken(TransferInResendMailTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInResendMailTokenWithOptions(request, runtime);
    }

    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroupWithOptions(UpdateDomainToDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainToDomainGroup", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainToDomainGroupResponse());
    }

    public UpdateDomainToDomainGroupResponse updateDomainToDomainGroup(UpdateDomainToDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainToDomainGroupWithOptions(request, runtime);
    }

    public VerifyContactFieldResponse verifyContactFieldWithOptions(VerifyContactFieldRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyContactField", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyContactFieldResponse());
    }

    public VerifyContactFieldResponse verifyContactField(VerifyContactFieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyContactFieldWithOptions(request, runtime);
    }

    public VerifyEmailResponse verifyEmailWithOptions(VerifyEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyEmail", "2018-01-29", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyEmailResponse());
    }

    public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyEmailWithOptions(request, runtime);
    }
}
