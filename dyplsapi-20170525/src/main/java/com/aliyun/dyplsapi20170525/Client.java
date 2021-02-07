// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyplsapi20170525.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyplsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetTotalPublicUrlResponse getTotalPublicUrlWithOptions(GetTotalPublicUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTotalPublicUrl", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new GetTotalPublicUrlResponse());
    }

    public GetTotalPublicUrlResponse getTotalPublicUrl(GetTotalPublicUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTotalPublicUrlWithOptions(request, runtime);
    }

    public GetSubscriptionDetailResponse getSubscriptionDetailWithOptions(GetSubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSubscriptionDetail", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new GetSubscriptionDetailResponse());
    }

    public GetSubscriptionDetailResponse getSubscriptionDetail(GetSubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubscriptionDetailWithOptions(request, runtime);
    }

    public UpdatePhoneNumberResponse updatePhoneNumberWithOptions(UpdatePhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePhoneNumber", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePhoneNumberResponse());
    }

    public UpdatePhoneNumberResponse updatePhoneNumber(UpdatePhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneNumberWithOptions(request, runtime);
    }

    public GetFaceVerifyResponse getFaceVerifyWithOptions(GetFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFaceVerify", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new GetFaceVerifyResponse());
    }

    public GetFaceVerifyResponse getFaceVerify(GetFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceVerifyWithOptions(request, runtime);
    }

    public UpdateDefaultBResponse updateDefaultBWithOptions(UpdateDefaultBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDefaultB", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDefaultBResponse());
    }

    public UpdateDefaultBResponse updateDefaultB(UpdateDefaultBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDefaultBWithOptions(request, runtime);
    }

    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitFaceVerify", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new InitFaceVerifyResponse());
    }

    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
    }

    public CreateSubscriptionResponse createSubscriptionWithOptions(CreateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSubscription", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateSubscriptionResponse());
    }

    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscriptionWithOptions(request, runtime);
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitchWithOptions(UpdatePhoneSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePhoneSwitch", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePhoneSwitchResponse());
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitch(UpdatePhoneSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneSwitchWithOptions(request, runtime);
    }

    public GetSecretAsrDetailResponse getSecretAsrDetailWithOptions(GetSecretAsrDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSecretAsrDetail", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new GetSecretAsrDetailResponse());
    }

    public GetSecretAsrDetailResponse getSecretAsrDetail(GetSecretAsrDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretAsrDetailWithOptions(request, runtime);
    }

    public DeleteSecretBlacklistResponse deleteSecretBlacklistWithOptions(DeleteSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSecretBlacklist", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSecretBlacklistResponse());
    }

    public DeleteSecretBlacklistResponse deleteSecretBlacklist(DeleteSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecretBlacklistWithOptions(request, runtime);
    }

    public AddSecretBlacklistResponse addSecretBlacklistWithOptions(AddSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSecretBlacklist", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new AddSecretBlacklistResponse());
    }

    public AddSecretBlacklistResponse addSecretBlacklist(AddSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSecretBlacklistWithOptions(request, runtime);
    }

    public LockSecretNoResponse lockSecretNoWithOptions(LockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LockSecretNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new LockSecretNoResponse());
    }

    public LockSecretNoResponse lockSecretNo(LockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockSecretNoWithOptions(request, runtime);
    }

    public UnlockSecretNoResponse unlockSecretNoWithOptions(UnlockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnlockSecretNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UnlockSecretNoResponse());
    }

    public UnlockSecretNoResponse unlockSecretNo(UnlockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockSecretNoWithOptions(request, runtime);
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNoWithOptions(QueryPhoneNoAByTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPhoneNoAByTrackNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryPhoneNoAByTrackNoResponse());
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPhoneNoAByTrackNoWithOptions(request, runtime);
    }

    public AddAxnTrackNoResponse addAxnTrackNoWithOptions(AddAxnTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddAxnTrackNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new AddAxnTrackNoResponse());
    }

    public AddAxnTrackNoResponse addAxnTrackNo(AddAxnTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAxnTrackNoWithOptions(request, runtime);
    }

    public OperateBlackNoResponse operateBlackNoWithOptions(OperateBlackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OperateBlackNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new OperateBlackNoResponse());
    }

    public OperateBlackNoResponse operateBlackNo(OperateBlackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateBlackNoWithOptions(request, runtime);
    }

    public QuerySubsIdResponse querySubsIdWithOptions(QuerySubsIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySubsId", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySubsIdResponse());
    }

    public QuerySubsIdResponse querySubsId(QuerySubsIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubsIdWithOptions(request, runtime);
    }

    public QuerySecretNoRemainResponse querySecretNoRemainWithOptions(QuerySecretNoRemainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySecretNoRemain", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySecretNoRemainResponse());
    }

    public QuerySecretNoRemainResponse querySecretNoRemain(QuerySecretNoRemainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySecretNoRemainWithOptions(request, runtime);
    }

    public BindAxgResponse bindAxgWithOptions(BindAxgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAxg", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BindAxgResponse());
    }

    public BindAxgResponse bindAxg(BindAxgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxgWithOptions(request, runtime);
    }

    public OperateAxgGroupResponse operateAxgGroupWithOptions(OperateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OperateAxgGroup", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new OperateAxgGroupResponse());
    }

    public OperateAxgGroupResponse operateAxgGroup(OperateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateAxgGroupWithOptions(request, runtime);
    }

    public CreateAxgGroupResponse createAxgGroupWithOptions(CreateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAxgGroup", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateAxgGroupResponse());
    }

    public CreateAxgGroupResponse createAxgGroup(CreateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAxgGroupWithOptions(request, runtime);
    }

    public QueryCallStatusResponse queryCallStatusWithOptions(QueryCallStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCallStatus", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryCallStatusResponse());
    }

    public QueryCallStatusResponse queryCallStatus(QueryCallStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallStatusWithOptions(request, runtime);
    }

    public BuySecretNoResponse buySecretNoWithOptions(BuySecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BuySecretNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BuySecretNoResponse());
    }

    public BuySecretNoResponse buySecretNo(BuySecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.buySecretNoWithOptions(request, runtime);
    }

    public ReleaseSecretNoResponse releaseSecretNoWithOptions(ReleaseSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseSecretNo", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseSecretNoResponse());
    }

    public ReleaseSecretNoResponse releaseSecretNo(ReleaseSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseSecretNoWithOptions(request, runtime);
    }

    public BindAxnExtensionResponse bindAxnExtensionWithOptions(BindAxnExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAxnExtension", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BindAxnExtensionResponse());
    }

    public BindAxnExtensionResponse bindAxnExtension(BindAxnExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnExtensionWithOptions(request, runtime);
    }

    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSubscription", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UpdateSubscriptionResponse());
    }

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetailWithOptions(QuerySubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySubscriptionDetail", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySubscriptionDetailResponse());
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetail(QuerySubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscriptionDetailWithOptions(request, runtime);
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrlWithOptions(QueryRecordFileDownloadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordFileDownloadUrl", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordFileDownloadUrlResponse());
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordFileDownloadUrlWithOptions(request, runtime);
    }

    public UnbindSubscriptionResponse unbindSubscriptionWithOptions(UnbindSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindSubscription", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UnbindSubscriptionResponse());
    }

    public UnbindSubscriptionResponse unbindSubscription(UnbindSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSubscriptionWithOptions(request, runtime);
    }

    public BindAxnResponse bindAxnWithOptions(BindAxnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAxn", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BindAxnResponse());
    }

    public BindAxnResponse bindAxn(BindAxnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnWithOptions(request, runtime);
    }

    public BindAxbResponse bindAxbWithOptions(BindAxbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAxb", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BindAxbResponse());
    }

    public BindAxbResponse bindAxb(BindAxbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxbWithOptions(request, runtime);
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
}
