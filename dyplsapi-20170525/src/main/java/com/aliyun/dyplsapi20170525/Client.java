// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyplsapi20170525.models.*;
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

    public AddAxnTrackNoResponse addAxnTrackNoWithOptions(AddAxnTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SubsId", request.subsId);
        query.put("trackNo", request.trackNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAxnTrackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAxnTrackNoResponse());
    }

    public AddAxnTrackNoResponse addAxnTrackNo(AddAxnTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAxnTrackNoWithOptions(request, runtime);
    }

    public AddSecretBlacklistResponse addSecretBlacklistWithOptions(AddSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BlackNo", request.blackNo);
        query.put("BlackType", request.blackType);
        query.put("PoolKey", request.poolKey);
        query.put("Remark", request.remark);
        query.put("WayControl", request.wayControl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSecretBlacklist"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSecretBlacklistResponse());
    }

    public AddSecretBlacklistResponse addSecretBlacklist(AddSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSecretBlacklistWithOptions(request, runtime);
    }

    public BindAxbResponse bindAxbWithOptions(BindAxbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ASRModelId", request.ASRModelId);
        query.put("ASRStatus", request.ASRStatus);
        query.put("CallDisplayType", request.callDisplayType);
        query.put("CallRestrict", request.callRestrict);
        query.put("CallTimeout", request.callTimeout);
        query.put("ExpectCity", request.expectCity);
        query.put("Expiration", request.expiration);
        query.put("IsRecordingEnabled", request.isRecordingEnabled);
        query.put("OutId", request.outId);
        query.put("OutOrderId", request.outOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoA", request.phoneNoA);
        query.put("PhoneNoB", request.phoneNoB);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RingConfig", request.ringConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxb"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxbResponse());
    }

    public BindAxbResponse bindAxb(BindAxbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxbWithOptions(request, runtime);
    }

    public BindAxgResponse bindAxgWithOptions(BindAxgRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ASRModelId", request.ASRModelId);
        query.put("ASRStatus", request.ASRStatus);
        query.put("CallDisplayType", request.callDisplayType);
        query.put("CallRestrict", request.callRestrict);
        query.put("ExpectCity", request.expectCity);
        query.put("Expiration", request.expiration);
        query.put("GroupId", request.groupId);
        query.put("IsRecordingEnabled", request.isRecordingEnabled);
        query.put("OutId", request.outId);
        query.put("OutOrderId", request.outOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoA", request.phoneNoA);
        query.put("PhoneNoB", request.phoneNoB);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RingConfig", request.ringConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxg"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxgResponse());
    }

    public BindAxgResponse bindAxg(BindAxgRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxgWithOptions(request, runtime);
    }

    public BindAxnResponse bindAxnWithOptions(BindAxnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ASRModelId", request.ASRModelId);
        query.put("ASRStatus", request.ASRStatus);
        query.put("CallDisplayType", request.callDisplayType);
        query.put("CallRestrict", request.callRestrict);
        query.put("CallTimeout", request.callTimeout);
        query.put("ExpectCity", request.expectCity);
        query.put("Expiration", request.expiration);
        query.put("IsRecordingEnabled", request.isRecordingEnabled);
        query.put("NoType", request.noType);
        query.put("OutId", request.outId);
        query.put("OutOrderId", request.outOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoA", request.phoneNoA);
        query.put("PhoneNoB", request.phoneNoB);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RingConfig", request.ringConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxn"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnResponse());
    }

    public BindAxnResponse bindAxn(BindAxnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnWithOptions(request, runtime);
    }

    public BindAxnExtensionResponse bindAxnExtensionWithOptions(BindAxnExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ASRModelId", request.ASRModelId);
        query.put("ASRStatus", request.ASRStatus);
        query.put("CallDisplayType", request.callDisplayType);
        query.put("CallRestrict", request.callRestrict);
        query.put("ExpectCity", request.expectCity);
        query.put("Expiration", request.expiration);
        query.put("Extension", request.extension);
        query.put("IsRecordingEnabled", request.isRecordingEnabled);
        query.put("OutId", request.outId);
        query.put("OutOrderId", request.outOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoA", request.phoneNoA);
        query.put("PhoneNoB", request.phoneNoB);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RingConfig", request.ringConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxnExtension"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnExtensionResponse());
    }

    public BindAxnExtensionResponse bindAxnExtension(BindAxnExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAxnExtensionWithOptions(request, runtime);
    }

    public BuySecretNoResponse buySecretNoWithOptions(BuySecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("DisplayPool", request.displayPool);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuySecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuySecretNoResponse());
    }

    public BuySecretNoResponse buySecretNo(BuySecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.buySecretNoWithOptions(request, runtime);
    }

    public CancelPickUpWaybillResponse cancelPickUpWaybillWithOptions(CancelPickUpWaybillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CancelDesc", request.cancelDesc);
        query.put("OuterOrderCode", request.outerOrderCode);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPickUpWaybill"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPickUpWaybillResponse());
    }

    public CancelPickUpWaybillResponse cancelPickUpWaybill(CancelPickUpWaybillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPickUpWaybillWithOptions(request, runtime);
    }

    public ConfirmSendSmsResponse confirmSendSmsWithOptions(ConfirmSendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmSendSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmSendSmsResponse());
    }

    public ConfirmSendSmsResponse confirmSendSms(ConfirmSendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmSendSmsWithOptions(request, runtime);
    }

    public CreateAxgGroupResponse createAxgGroupWithOptions(CreateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("Numbers", request.numbers);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAxgGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAxgGroupResponse());
    }

    public CreateAxgGroupResponse createAxgGroup(CreateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAxgGroupWithOptions(request, runtime);
    }

    public CreatePickUpWaybillResponse createPickUpWaybillWithOptions(CreatePickUpWaybillRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePickUpWaybillShrinkRequest request = new CreatePickUpWaybillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.consigneeAddress))) {
            request.consigneeAddressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.consigneeAddress), "ConsigneeAddress", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.goodsInfos)) {
            request.goodsInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.goodsInfos, "GoodsInfos", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.sendAddress))) {
            request.sendAddressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.sendAddress), "SendAddress", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsigneeAddress", request.consigneeAddressShrink);
        query.put("ConsigneeMobile", request.consigneeMobile);
        query.put("ConsigneeName", request.consigneeName);
        query.put("ConsigneePhone", request.consigneePhone);
        query.put("CpCode", request.cpCode);
        query.put("GoodsInfos", request.goodsInfosShrink);
        query.put("OrderChannels", request.orderChannels);
        query.put("OuterOrderCode", request.outerOrderCode);
        query.put("Remark", request.remark);
        query.put("SendAddress", request.sendAddressShrink);
        query.put("SendMobile", request.sendMobile);
        query.put("SendName", request.sendName);
        query.put("SendPhone", request.sendPhone);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePickUpWaybill"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePickUpWaybillResponse());
    }

    public CreatePickUpWaybillResponse createPickUpWaybill(CreatePickUpWaybillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPickUpWaybillWithOptions(request, runtime);
    }

    public CreateSubscriptionResponse createSubscriptionWithOptions(CreateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BindToken", request.bindToken);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNo", request.phoneNo);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscription"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionResponse());
    }

    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscriptionWithOptions(request, runtime);
    }

    public DeleteSecretBlacklistResponse deleteSecretBlacklistWithOptions(DeleteSecretBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BlackNo", request.blackNo);
        query.put("BlackType", request.blackType);
        query.put("PoolKey", request.poolKey);
        query.put("Remark", request.remark);
        query.put("WayControl", request.wayControl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecretBlacklist"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretBlacklistResponse());
    }

    public DeleteSecretBlacklistResponse deleteSecretBlacklist(DeleteSecretBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecretBlacklistWithOptions(request, runtime);
    }

    public GetFaceVerifyResponse getFaceVerifyWithOptions(GetFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VerifyToken", request.verifyToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFaceVerify"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFaceVerifyResponse());
    }

    public GetFaceVerifyResponse getFaceVerify(GetFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceVerifyWithOptions(request, runtime);
    }

    public GetSecretAsrDetailResponse getSecretAsrDetailWithOptions(GetSecretAsrDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("CallTime", request.callTime);
        query.put("PoolKey", request.poolKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretAsrDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretAsrDetailResponse());
    }

    public GetSecretAsrDetailResponse getSecretAsrDetail(GetSecretAsrDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecretAsrDetailWithOptions(request, runtime);
    }

    public GetSubscriptionDetailResponse getSubscriptionDetailWithOptions(GetSubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionDetailResponse());
    }

    public GetSubscriptionDetailResponse getSubscriptionDetail(GetSubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubscriptionDetailWithOptions(request, runtime);
    }

    public GetTotalPublicUrlResponse getTotalPublicUrlWithOptions(GetTotalPublicUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("CallTime", request.callTime);
        query.put("CheckSubs", request.checkSubs);
        query.put("OwnerId", request.ownerId);
        query.put("PartnerKey", request.partnerKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTotalPublicUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTotalPublicUrlResponse());
    }

    public GetTotalPublicUrlResponse getTotalPublicUrl(GetTotalPublicUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTotalPublicUrlWithOptions(request, runtime);
    }

    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MetaInfo", request.metaInfo);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitFaceVerify"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitFaceVerifyResponse());
    }

    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
    }

    public LockSecretNoResponse lockSecretNoWithOptions(LockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockSecretNoResponse());
    }

    public LockSecretNoResponse lockSecretNo(LockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockSecretNoWithOptions(request, runtime);
    }

    public OperateAxgGroupResponse operateAxgGroupWithOptions(OperateAxgGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("Numbers", request.numbers);
        query.put("OperateType", request.operateType);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAxgGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAxgGroupResponse());
    }

    public OperateAxgGroupResponse operateAxgGroup(OperateAxgGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateAxgGroupWithOptions(request, runtime);
    }

    public OperateBlackNoResponse operateBlackNoWithOptions(OperateBlackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BlackNo", request.blackNo);
        query.put("OperateType", request.operateType);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Tips", request.tips);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateBlackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateBlackNoResponse());
    }

    public OperateBlackNoResponse operateBlackNo(OperateBlackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateBlackNoWithOptions(request, runtime);
    }

    public QueryCallStatusResponse queryCallStatusWithOptions(QueryCallStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallNo", request.callNo);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallStatus"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallStatusResponse());
    }

    public QueryCallStatusResponse queryCallStatus(QueryCallStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallStatusWithOptions(request, runtime);
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNoWithOptions(QueryPhoneNoAByTrackNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CabinetNo", request.cabinetNo);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("trackNo", request.trackNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneNoAByTrackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneNoAByTrackNoResponse());
    }

    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPhoneNoAByTrackNoWithOptions(request, runtime);
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrlWithOptions(QueryRecordFileDownloadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("CallTime", request.callTime);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ProductType", request.productType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordFileDownloadUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordFileDownloadUrlResponse());
    }

    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordFileDownloadUrlWithOptions(request, runtime);
    }

    public QuerySecretNoDetailResponse querySecretNoDetailWithOptions(QuerySecretNoDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretNoDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretNoDetailResponse());
    }

    public QuerySecretNoDetailResponse querySecretNoDetail(QuerySecretNoDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySecretNoDetailWithOptions(request, runtime);
    }

    public QuerySecretNoRemainResponse querySecretNoRemainWithOptions(QuerySecretNoRemainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretNoRemain"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretNoRemainResponse());
    }

    public QuerySecretNoRemainResponse querySecretNoRemain(QuerySecretNoRemainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySecretNoRemainWithOptions(request, runtime);
    }

    public QuerySubsIdResponse querySubsIdWithOptions(QuerySubsIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySubsId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySubsIdResponse());
    }

    public QuerySubsIdResponse querySubsId(QuerySubsIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubsIdWithOptions(request, runtime);
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetailWithOptions(QuerySubscriptionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ProductType", request.productType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySubscriptionDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySubscriptionDetailResponse());
    }

    public QuerySubscriptionDetailResponse querySubscriptionDetail(QuerySubscriptionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscriptionDetailWithOptions(request, runtime);
    }

    public ReleaseSecretNoResponse releaseSecretNoWithOptions(ReleaseSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseSecretNoResponse());
    }

    public ReleaseSecretNoResponse releaseSecretNo(ReleaseSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseSecretNoWithOptions(request, runtime);
    }

    public UnbindSubscriptionResponse unbindSubscriptionWithOptions(UnbindSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ProductType", request.productType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSubscription"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSubscriptionResponse());
    }

    public UnbindSubscriptionResponse unbindSubscription(UnbindSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSubscriptionWithOptions(request, runtime);
    }

    public UnlockSecretNoResponse unlockSecretNoWithOptions(UnlockSecretNoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockSecretNoResponse());
    }

    public UnlockSecretNoResponse unlockSecretNo(UnlockSecretNoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockSecretNoWithOptions(request, runtime);
    }

    public UpdateDefaultBResponse updateDefaultBWithOptions(UpdateDefaultBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNo", request.phoneNo);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDefaultB"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDefaultBResponse());
    }

    public UpdateDefaultBResponse updateDefaultB(UpdateDefaultBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDefaultBWithOptions(request, runtime);
    }

    public UpdatePhoneNumberResponse updatePhoneNumberWithOptions(UpdatePhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BindToken", request.bindToken);
        query.put("NewPhoneNo", request.newPhoneNo);
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneNumber"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneNumberResponse());
    }

    public UpdatePhoneNumberResponse updatePhoneNumber(UpdatePhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneNumberWithOptions(request, runtime);
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitchWithOptions(UpdatePhoneSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PoolKey", request.poolKey);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecretNo", request.secretNo);
        query.put("SubsId", request.subsId);
        query.put("SwitchStatus", request.switchStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhoneSwitch"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhoneSwitchResponse());
    }

    public UpdatePhoneSwitchResponse updatePhoneSwitch(UpdatePhoneSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhoneSwitchWithOptions(request, runtime);
    }

    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ASRModelId", request.ASRModelId);
        query.put("ASRStatus", request.ASRStatus);
        query.put("CallDisplayType", request.callDisplayType);
        query.put("CallRestrict", request.callRestrict);
        query.put("Expiration", request.expiration);
        query.put("GroupId", request.groupId);
        query.put("IsRecordingEnabled", request.isRecordingEnabled);
        query.put("OperateType", request.operateType);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNoA", request.phoneNoA);
        query.put("PhoneNoB", request.phoneNoB);
        query.put("PhoneNoX", request.phoneNoX);
        query.put("PoolKey", request.poolKey);
        query.put("ProductType", request.productType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RingConfig", request.ringConfig);
        query.put("SubsId", request.subsId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }
}
