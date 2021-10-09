// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301;

import com.aliyun.tea.*;
import com.aliyun.mindlive20210301.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mindlive", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public UpdateLiveSellPointStateResponse updateLiveSellPointStateWithOptions(UpdateLiveSellPointStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveSellPointState", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveSellPointStateResponse());
    }

    public UpdateLiveSellPointStateResponse updateLiveSellPointState(UpdateLiveSellPointStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveSellPointStateWithOptions(request, runtime);
    }

    public UpdateLiveTeleprompterStateResponse updateLiveTeleprompterStateWithOptions(UpdateLiveTeleprompterStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveTeleprompterState", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveTeleprompterStateResponse());
    }

    public UpdateLiveTeleprompterStateResponse updateLiveTeleprompterState(UpdateLiveTeleprompterStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveTeleprompterStateWithOptions(request, runtime);
    }

    public RequestBindDataResponse requestBindDataWithOptions(RequestBindDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RequestBindData", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestBindDataResponse());
    }

    public RequestBindDataResponse requestBindData(RequestBindDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestBindDataWithOptions(request, runtime);
    }

    public LogoutDeviceResponse logoutDeviceWithOptions(LogoutDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LogoutDevice", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new LogoutDeviceResponse());
    }

    public LogoutDeviceResponse logoutDevice(LogoutDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logoutDeviceWithOptions(request, runtime);
    }

    public ReportDevConfigResponse reportDevConfigWithOptions(ReportDevConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportDevConfig", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReportDevConfigResponse());
    }

    public ReportDevConfigResponse reportDevConfig(ReportDevConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDevConfigWithOptions(request, runtime);
    }

    public RequestBackgroundResponse requestBackgroundWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestBackground", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestBackgroundResponse());
    }

    public RequestBackgroundResponse requestBackground() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestBackgroundWithOptions(runtime);
    }

    public RequestBindingStateResponse requestBindingStateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestBindingState", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestBindingStateResponse());
    }

    public RequestBindingStateResponse requestBindingState() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestBindingStateWithOptions(runtime);
    }

    public QueryItemBackgroundsResponse queryItemBackgroundsWithOptions(QueryItemBackgroundsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryItemBackgroundsShrinkRequest request = new QueryItemBackgroundsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemBackgrounds", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemBackgroundsResponse());
    }

    public QueryItemBackgroundsResponse queryItemBackgrounds(QueryItemBackgroundsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemBackgroundsWithOptions(request, runtime);
    }

    public RequestAuthorizationDataResponse requestAuthorizationDataWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestAuthorizationData", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestAuthorizationDataResponse());
    }

    public RequestAuthorizationDataResponse requestAuthorizationData() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestAuthorizationDataWithOptions(runtime);
    }

    public RequestPasterResponse requestPasterWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestPaster", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestPasterResponse());
    }

    public RequestPasterResponse requestPaster() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestPasterWithOptions(runtime);
    }

    public RequestUserConfigResponse requestUserConfigWithOptions(RequestUserConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RequestUserConfig", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestUserConfigResponse());
    }

    public RequestUserConfigResponse requestUserConfig(RequestUserConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestUserConfigWithOptions(request, runtime);
    }

    public RequestOssStsResponse requestOssStsWithOptions(RequestOssStsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RequestOssSts", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestOssStsResponse());
    }

    public RequestOssStsResponse requestOssSts(RequestOssStsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestOssStsWithOptions(request, runtime);
    }

    public ResetDeviceResponse resetDeviceWithOptions(ResetDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetDevice", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetDeviceResponse());
    }

    public ResetDeviceResponse resetDevice(ResetDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDeviceWithOptions(request, runtime);
    }

    public RequestDeviceInfoResponse requestDeviceInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestDeviceInfo", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestDeviceInfoResponse());
    }

    public RequestDeviceInfoResponse requestDeviceInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestDeviceInfoWithOptions(runtime);
    }

    public RequestResetDataResponse requestResetDataWithOptions(RequestResetDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RequestResetData", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestResetDataResponse());
    }

    public RequestResetDataResponse requestResetData(RequestResetDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestResetDataWithOptions(request, runtime);
    }

    public LoginDeviceResponse loginDeviceWithOptions(LoginDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LoginDevice", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new LoginDeviceResponse());
    }

    public LoginDeviceResponse loginDevice(LoginDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.loginDeviceWithOptions(request, runtime);
    }

    public ReportUserConfigResponse reportUserConfigWithOptions(ReportUserConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportUserConfig", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReportUserConfigResponse());
    }

    public ReportUserConfigResponse reportUserConfig(ReportUserConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportUserConfigWithOptions(request, runtime);
    }

    public UpdateCurrentItemResponse updateCurrentItemWithOptions(UpdateCurrentItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCurrentItem", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCurrentItemResponse());
    }

    public UpdateCurrentItemResponse updateCurrentItem(UpdateCurrentItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCurrentItemWithOptions(request, runtime);
    }

    public RequestLiveSellPointStateResponse requestLiveSellPointStateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestLiveSellPointState", "2021-03-01", "HTTPS", "GET", "AK", "json", req, runtime), new RequestLiveSellPointStateResponse());
    }

    public RequestLiveSellPointStateResponse requestLiveSellPointState() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestLiveSellPointStateWithOptions(runtime);
    }

    public RequestServiceInfoResponse requestServiceInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestServiceInfo", "2021-03-01", "HTTPS", "GET", "AK", "json", req, runtime), new RequestServiceInfoResponse());
    }

    public RequestServiceInfoResponse requestServiceInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestServiceInfoWithOptions(runtime);
    }

    public ReportCurrentBackgroundResponse reportCurrentBackgroundWithOptions(ReportCurrentBackgroundRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportCurrentBackgroundShrinkRequest request = new ReportCurrentBackgroundShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bgConfig)) {
            request.bgConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bgConfig, "BgConfig", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportCurrentBackground", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReportCurrentBackgroundResponse());
    }

    public ReportCurrentBackgroundResponse reportCurrentBackground(ReportCurrentBackgroundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportCurrentBackgroundWithOptions(request, runtime);
    }

    public ReportScreenResponse reportScreenWithOptions(ReportScreenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportScreen", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReportScreenResponse());
    }

    public ReportScreenResponse reportScreen(ReportScreenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportScreenWithOptions(request, runtime);
    }

    public RequestIotTriadResponse requestIotTriadWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestIotTriad", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestIotTriadResponse());
    }

    public RequestIotTriadResponse requestIotTriad() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestIotTriadWithOptions(runtime);
    }

    public RequestUserSellPointTemplateResponse requestUserSellPointTemplateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestUserSellPointTemplate", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new RequestUserSellPointTemplateResponse());
    }

    public RequestUserSellPointTemplateResponse requestUserSellPointTemplate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestUserSellPointTemplateWithOptions(runtime);
    }

    public ReportLiveStateResponse reportLiveStateWithOptions(ReportLiveStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportLiveState", "2021-03-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReportLiveStateResponse());
    }

    public ReportLiveStateResponse reportLiveState(ReportLiveStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportLiveStateWithOptions(request, runtime);
    }

    public RequestLiveTeleprompterStateResponse requestLiveTeleprompterStateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("RequestLiveTeleprompterState", "2021-03-01", "HTTPS", "GET", "AK", "json", req, runtime), new RequestLiveTeleprompterStateResponse());
    }

    public RequestLiveTeleprompterStateResponse requestLiveTeleprompterState() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestLiveTeleprompterStateWithOptions(runtime);
    }
}
