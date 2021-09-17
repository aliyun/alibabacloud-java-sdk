// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyplsapi20170525.models.*;
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
        this._endpoint = this.getEndpoint("dyplsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DeleteSecretBlacklistResponse deleteSecretBlacklistWithOptions(DeleteSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecretBlacklist", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecretBlacklistResponse());
    }

    public DeleteSecretBlacklistResponse deleteSecretBlacklist(DeleteSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecretBlacklistWithOptions(request, runtime);
    }

    public BindAxnExtensionResponse bindAxnExtensionWithOptions(BindAxnExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAxnExtension", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BindAxnExtensionResponse());
    }

    public BindAxnExtensionResponse bindAxnExtension(BindAxnExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnExtensionWithOptions(request, runtime);
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitchWithOptions(UpdatePhoneSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePhoneSwitch", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePhoneSwitchResponse());
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitch(UpdatePhoneSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneSwitchWithOptions(request, runtime);
    }

    public GetTotalPublicUrlResponse getTotalPublicUrlWithOptions(GetTotalPublicUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTotalPublicUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetTotalPublicUrlResponse());
    }

    public GetTotalPublicUrlResponse getTotalPublicUrl(GetTotalPublicUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTotalPublicUrlWithOptions(request, runtime);
    }

    public BuySecretNoResponse buySecretNoWithOptions(BuySecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BuySecretNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BuySecretNoResponse());
    }

    public BuySecretNoResponse buySecretNo(BuySecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.buySecretNoWithOptions(request, runtime);
    }

    public CreateSubscriptionResponse createSubscriptionWithOptions(CreateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubscription", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubscriptionResponse());
    }

    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscriptionWithOptions(request, runtime);
    }

    public GetFaceVerifyResponse getFaceVerifyWithOptions(GetFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFaceVerify", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetFaceVerifyResponse());
    }

    public GetFaceVerifyResponse getFaceVerify(GetFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceVerifyWithOptions(request, runtime);
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetailWithOptions(QuerySubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySubscriptionDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySubscriptionDetailResponse());
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetail(QuerySubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscriptionDetailWithOptions(request, runtime);
    }

    public QueryCallStatusResponse queryCallStatusWithOptions(QueryCallStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCallStatus", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCallStatusResponse());
    }

    public QueryCallStatusResponse queryCallStatus(QueryCallStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallStatusWithOptions(request, runtime);
    }

    public UpdatePhoneNumberResponse updatePhoneNumberWithOptions(UpdatePhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePhoneNumber", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePhoneNumberResponse());
    }

    public UpdatePhoneNumberResponse updatePhoneNumber(UpdatePhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneNumberWithOptions(request, runtime);
    }

    public OperateBlackNoResponse operateBlackNoWithOptions(OperateBlackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateBlackNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new OperateBlackNoResponse());
    }

    public OperateBlackNoResponse operateBlackNo(OperateBlackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateBlackNoWithOptions(request, runtime);
    }

    public GetSecretAsrDetailResponse getSecretAsrDetailWithOptions(GetSecretAsrDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSecretAsrDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecretAsrDetailResponse());
    }

    public GetSecretAsrDetailResponse getSecretAsrDetail(GetSecretAsrDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretAsrDetailWithOptions(request, runtime);
    }

    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSubscription", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSubscriptionResponse());
    }

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }

    public LockSecretNoResponse lockSecretNoWithOptions(LockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockSecretNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new LockSecretNoResponse());
    }

    public LockSecretNoResponse lockSecretNo(LockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockSecretNoWithOptions(request, runtime);
    }

    public UnlockSecretNoResponse unlockSecretNoWithOptions(UnlockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockSecretNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockSecretNoResponse());
    }

    public UnlockSecretNoResponse unlockSecretNo(UnlockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockSecretNoWithOptions(request, runtime);
    }

    public ReleaseSecretNoResponse releaseSecretNoWithOptions(ReleaseSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseSecretNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseSecretNoResponse());
    }

    public ReleaseSecretNoResponse releaseSecretNo(ReleaseSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseSecretNoWithOptions(request, runtime);
    }

    public OperateAxgGroupResponse operateAxgGroupWithOptions(OperateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateAxgGroup", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new OperateAxgGroupResponse());
    }

    public OperateAxgGroupResponse operateAxgGroup(OperateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateAxgGroupWithOptions(request, runtime);
    }

    public UpdateDefaultBResponse updateDefaultBWithOptions(UpdateDefaultBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDefaultB", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDefaultBResponse());
    }

    public UpdateDefaultBResponse updateDefaultB(UpdateDefaultBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDefaultBWithOptions(request, runtime);
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNoWithOptions(QueryPhoneNoAByTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPhoneNoAByTrackNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPhoneNoAByTrackNoResponse());
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPhoneNoAByTrackNoWithOptions(request, runtime);
    }

    public AddAxnTrackNoResponse addAxnTrackNoWithOptions(AddAxnTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAxnTrackNo", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddAxnTrackNoResponse());
    }

    public AddAxnTrackNoResponse addAxnTrackNo(AddAxnTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAxnTrackNoWithOptions(request, runtime);
    }

    public QuerySecretNoRemainResponse querySecretNoRemainWithOptions(QuerySecretNoRemainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySecretNoRemain", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySecretNoRemainResponse());
    }

    public QuerySecretNoRemainResponse querySecretNoRemain(QuerySecretNoRemainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySecretNoRemainWithOptions(request, runtime);
    }

    public CreateAxgGroupResponse createAxgGroupWithOptions(CreateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAxgGroup", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAxgGroupResponse());
    }

    public CreateAxgGroupResponse createAxgGroup(CreateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAxgGroupWithOptions(request, runtime);
    }

    public BindAxbResponse bindAxbWithOptions(BindAxbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAxb", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BindAxbResponse());
    }

    public BindAxbResponse bindAxb(BindAxbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxbWithOptions(request, runtime);
    }

    public UnbindSubscriptionResponse unbindSubscriptionWithOptions(UnbindSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindSubscription", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindSubscriptionResponse());
    }

    public UnbindSubscriptionResponse unbindSubscription(UnbindSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSubscriptionWithOptions(request, runtime);
    }

    public QuerySubsIdResponse querySubsIdWithOptions(QuerySubsIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySubsId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySubsIdResponse());
    }

    public QuerySubsIdResponse querySubsId(QuerySubsIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubsIdWithOptions(request, runtime);
    }

    public ConfirmSendSmsResponse confirmSendSmsWithOptions(ConfirmSendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmSendSms", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmSendSmsResponse());
    }

    public ConfirmSendSmsResponse confirmSendSms(ConfirmSendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmSendSmsWithOptions(request, runtime);
    }

    public GetSubscriptionDetailResponse getSubscriptionDetailWithOptions(GetSubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSubscriptionDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetSubscriptionDetailResponse());
    }

    public GetSubscriptionDetailResponse getSubscriptionDetail(GetSubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubscriptionDetailWithOptions(request, runtime);
    }

    public BindAxgResponse bindAxgWithOptions(BindAxgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAxg", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BindAxgResponse());
    }

    public BindAxgResponse bindAxg(BindAxgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxgWithOptions(request, runtime);
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrlWithOptions(QueryRecordFileDownloadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRecordFileDownloadUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRecordFileDownloadUrlResponse());
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordFileDownloadUrlWithOptions(request, runtime);
    }

    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitFaceVerify", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new InitFaceVerifyResponse());
    }

    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
    }

    public BindAxnResponse bindAxnWithOptions(BindAxnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAxn", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BindAxnResponse());
    }

    public BindAxnResponse bindAxn(BindAxnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnWithOptions(request, runtime);
    }

    public AddSecretBlacklistResponse addSecretBlacklistWithOptions(AddSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSecretBlacklist", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddSecretBlacklistResponse());
    }

    public AddSecretBlacklistResponse addSecretBlacklist(AddSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSecretBlacklistWithOptions(request, runtime);
    }
}
