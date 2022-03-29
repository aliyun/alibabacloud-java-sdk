// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102;

import com.aliyun.tea.*;
import com.aliyun.cro20200102.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "cro-vpc.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cro", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AccountRiskReportResponse accountRiskReportWithOptions(AccountRiskReportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AccountRiskReportShrinkRequest request = new AccountRiskReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraData)) {
            request.extraDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraData, "ExtraData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asToken)) {
            query.put("AsToken", request.asToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entranceCode)) {
            query.put("EntranceCode", request.entranceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateFailureReason)) {
            query.put("OperateFailureReason", request.operateFailureReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateResult)) {
            query.put("OperateResult", request.operateResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDataShrink)) {
            body.put("ExtraData", request.extraDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccountRiskReport"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccountRiskReportResponse());
    }

    public AccountRiskReportResponse accountRiskReport(AccountRiskReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.accountRiskReportWithOptions(request, runtime);
    }

    public ApplyWatermarkLicenseResponse applyWatermarkLicenseWithOptions(ApplyWatermarkLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            query.put("Nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyWatermarkLicense"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyWatermarkLicenseResponse());
    }

    public ApplyWatermarkLicenseResponse applyWatermarkLicense(ApplyWatermarkLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyWatermarkLicenseWithOptions(request, runtime);
    }

    public CheckRealNameResponse checkRealNameWithOptions(CheckRealNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRealName"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRealNameResponse());
    }

    public CheckRealNameResponse checkRealName(CheckRealNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRealNameWithOptions(request, runtime);
    }

    public EmbedWatermarkResponse embedWatermarkWithOptions(EmbedWatermarkRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EmbedWatermarkShrinkRequest request = new EmbedWatermarkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.carrierLink)) {
            query.put("CarrierLink", request.carrierLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invisibleText)) {
            query.put("InvisibleText", request.invisibleText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markMode)) {
            query.put("MarkMode", request.markMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleText)) {
            query.put("VisibleText", request.visibleText);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendParamsShrink)) {
            body.put("ExtendParams", request.extendParamsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EmbedWatermark"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EmbedWatermarkResponse());
    }

    public EmbedWatermarkResponse embedWatermark(EmbedWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.embedWatermarkWithOptions(request, runtime);
    }

    public ExtractWatermarkResponse extractWatermarkWithOptions(ExtractWatermarkRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExtractWatermarkShrinkRequest request = new ExtractWatermarkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.carrierLink)) {
            query.put("CarrierLink", request.carrierLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendParamsShrink)) {
            body.put("ExtendParams", request.extendParamsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtractWatermark"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtractWatermarkResponse());
    }

    public ExtractWatermarkResponse extractWatermark(ExtractWatermarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractWatermarkWithOptions(request, runtime);
    }

    public GetAccountIdentityInfoResponse getAccountIdentityInfoWithOptions(GetAccountIdentityInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAccountIdentityInfoShrinkRequest request = new GetAccountIdentityInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            body.put("Properties", request.propertiesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountIdentityInfo"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountIdentityInfoResponse());
    }

    public GetAccountIdentityInfoResponse getAccountIdentityInfo(GetAccountIdentityInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountIdentityInfoWithOptions(request, runtime);
    }

    public GetCallRelationResponse getCallRelationWithOptions(GetCallRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallRelation"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallRelationResponse());
    }

    public GetCallRelationResponse getCallRelation(GetCallRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallRelationWithOptions(request, runtime);
    }

    public GetVerifyResultResponse getVerifyResultWithOptions(GetVerifyResultRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetVerifyResultShrinkRequest request = new GetVerifyResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.properties)) {
            request.propertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.properties, "Properties", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertiesShrink)) {
            body.put("Properties", request.propertiesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVerifyResult"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVerifyResultResponse());
    }

    public GetVerifyResultResponse getVerifyResult(GetVerifyResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVerifyResultWithOptions(request, runtime);
    }

    public GetVerifyTokenResponse getVerifyTokenWithOptions(GetVerifyTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardType)) {
            query.put("CardType", request.cardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyPolicyId)) {
            query.put("PrivacyPolicyId", request.privacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVerifyToken"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVerifyTokenResponse());
    }

    public GetVerifyTokenResponse getVerifyToken(GetVerifyTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVerifyTokenWithOptions(request, runtime);
    }

    public GetWatermarkAppInfoResponse getWatermarkAppInfoWithOptions(GetWatermarkAppInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            query.put("Nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWatermarkAppInfo"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWatermarkAppInfoResponse());
    }

    public GetWatermarkAppInfoResponse getWatermarkAppInfo(GetWatermarkAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWatermarkAppInfoWithOptions(request, runtime);
    }

    public IdentifyAccountModifyRiskResponse identifyAccountModifyRiskWithOptions(IdentifyAccountModifyRiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IdentifyAccountModifyRiskShrinkRequest request = new IdentifyAccountModifyRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraData)) {
            request.extraDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraData, "ExtraData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entranceCode)) {
            query.put("EntranceCode", request.entranceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInput)) {
            query.put("UserInput", request.userInput);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDataShrink)) {
            body.put("ExtraData", request.extraDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdentifyAccountModifyRisk"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdentifyAccountModifyRiskResponse());
    }

    public IdentifyAccountModifyRiskResponse identifyAccountModifyRisk(IdentifyAccountModifyRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.identifyAccountModifyRiskWithOptions(request, runtime);
    }

    public IdentifyLoginRiskResponse identifyLoginRiskWithOptions(IdentifyLoginRiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IdentifyLoginRiskShrinkRequest request = new IdentifyLoginRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraData)) {
            request.extraDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraData, "ExtraData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entranceCode)) {
            query.put("EntranceCode", request.entranceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.socialNetworkServiceType)) {
            query.put("SocialNetworkServiceType", request.socialNetworkServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInput)) {
            query.put("UserInput", request.userInput);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDataShrink)) {
            body.put("ExtraData", request.extraDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdentifyLoginRisk"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdentifyLoginRiskResponse());
    }

    public IdentifyLoginRiskResponse identifyLoginRisk(IdentifyLoginRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.identifyLoginRiskWithOptions(request, runtime);
    }

    public IdentifyRegisterRiskResponse identifyRegisterRiskWithOptions(IdentifyRegisterRiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IdentifyRegisterRiskShrinkRequest request = new IdentifyRegisterRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraData)) {
            request.extraDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraData, "ExtraData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entranceCode)) {
            query.put("EntranceCode", request.entranceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInput)) {
            query.put("UserInput", request.userInput);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDataShrink)) {
            body.put("ExtraData", request.extraDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IdentifyRegisterRisk"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IdentifyRegisterRiskResponse());
    }

    public IdentifyRegisterRiskResponse identifyRegisterRisk(IdentifyRegisterRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.identifyRegisterRiskWithOptions(request, runtime);
    }

    public ListAstralnetAppUrlsResponse listAstralnetAppUrlsWithOptions(ListAstralnetAppUrlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAstralnetAppUrls"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAstralnetAppUrlsResponse());
    }

    public ListAstralnetAppUrlsResponse listAstralnetAppUrls(ListAstralnetAppUrlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAstralnetAppUrlsWithOptions(request, runtime);
    }

    public PrecheckUsabilityResponse precheckUsabilityWithOptions(PrecheckUsabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrecheckUsability"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrecheckUsabilityResponse());
    }

    public PrecheckUsabilityResponse precheckUsability(PrecheckUsabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.precheckUsabilityWithOptions(request, runtime);
    }

    public QueryJobStatusResponse queryJobStatusWithOptions(QueryJobStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryJobStatusShrinkRequest request = new QueryJobStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            body.put("Data", request.dataShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobStatus"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobStatusResponse());
    }

    public QueryJobStatusResponse queryJobStatus(QueryJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobStatusWithOptions(request, runtime);
    }

    public ScanMobileAppResponse scanMobileAppWithOptions(ScanMobileAppRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanMobileAppShrinkRequest request = new ScanMobileAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            body.put("Data", request.dataShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanMobileApp"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanMobileAppResponse());
    }

    public ScanMobileAppResponse scanMobileApp(ScanMobileAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanMobileAppWithOptions(request, runtime);
    }

    public ScanOpenSourceComplianceResponse scanOpenSourceComplianceWithOptions(ScanOpenSourceComplianceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanOpenSourceComplianceShrinkRequest request = new ScanOpenSourceComplianceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            body.put("Data", request.dataShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanOpenSourceCompliance"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanOpenSourceComplianceResponse());
    }

    public ScanOpenSourceComplianceResponse scanOpenSourceCompliance(ScanOpenSourceComplianceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanOpenSourceComplianceWithOptions(request, runtime);
    }

    public SendAccountModifyResultResponse sendAccountModifyResultWithOptions(SendAccountModifyResultRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendAccountModifyResultShrinkRequest request = new SendAccountModifyResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionSource)) {
            query.put("ActionSource", request.actionSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asToken)) {
            query.put("AsToken", request.asToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyFailureReason)) {
            query.put("ModifyFailureReason", request.modifyFailureReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyResult)) {
            query.put("ModifyResult", request.modifyResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newContent)) {
            query.put("NewContent", request.newContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldContent)) {
            query.put("OldContent", request.oldContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendAccountModifyResult"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendAccountModifyResultResponse());
    }

    public SendAccountModifyResultResponse sendAccountModifyResult(SendAccountModifyResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendAccountModifyResultWithOptions(request, runtime);
    }

    public SendIdentityValidateResultResponse sendIdentityValidateResultWithOptions(SendIdentityValidateResultRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendIdentityValidateResultShrinkRequest request = new SendIdentityValidateResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceEnvironment)) {
            request.deviceEnvironmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceEnvironment, "DeviceEnvironment", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraData)) {
            request.extraDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraData, "ExtraData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.validatorTypes)) {
            request.validatorTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.validatorTypes, "ValidatorTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionSource)) {
            query.put("ActionSource", request.actionSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asToken)) {
            query.put("AsToken", request.asToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entranceCode)) {
            query.put("EntranceCode", request.entranceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateSubType)) {
            query.put("OperateSubType", request.operateSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            query.put("OperateTime", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteCode)) {
            query.put("SiteCode", request.siteCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInput)) {
            query.put("UserInput", request.userInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateFailureReason)) {
            query.put("ValidateFailureReason", request.validateFailureReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateResult)) {
            query.put("ValidateResult", request.validateResult);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceEnvironmentShrink)) {
            body.put("DeviceEnvironment", request.deviceEnvironmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDataShrink)) {
            body.put("ExtraData", request.extraDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validatorTypesShrink)) {
            body.put("ValidatorTypes", request.validatorTypesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendIdentityValidateResult"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendIdentityValidateResultResponse());
    }

    public SendIdentityValidateResultResponse sendIdentityValidateResult(SendIdentityValidateResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendIdentityValidateResultWithOptions(request, runtime);
    }

    public UnbindAccountIdentityInfoResponse unbindAccountIdentityInfoWithOptions(UnbindAccountIdentityInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAccountIdentityInfo"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAccountIdentityInfoResponse());
    }

    public UnbindAccountIdentityInfoResponse unbindAccountIdentityInfo(UnbindAccountIdentityInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindAccountIdentityInfoWithOptions(request, runtime);
    }

    public UploadWatermarkLogResponse uploadWatermarkLogWithOptions(UploadWatermarkLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            query.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            query.put("Nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadWatermarkLog"),
            new TeaPair("version", "2020-01-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadWatermarkLogResponse());
    }

    public UploadWatermarkLogResponse uploadWatermarkLog(UploadWatermarkLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadWatermarkLogWithOptions(request, runtime);
    }
}
