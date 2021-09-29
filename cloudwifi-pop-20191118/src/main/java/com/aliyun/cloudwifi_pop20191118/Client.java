// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118;

import com.aliyun.tea.*;
import com.aliyun.cloudwifi_pop20191118.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "cloudwf.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudwifi-pop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListJobOrdersWithSizeResponse listJobOrdersWithSizeWithOptions(ListJobOrdersWithSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobOrdersWithSize", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobOrdersWithSizeResponse());
    }

    public ListJobOrdersWithSizeResponse listJobOrdersWithSize(ListJobOrdersWithSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobOrdersWithSizeWithOptions(request, runtime);
    }

    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentityWithOptions(GetApgroupConfigByIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApgroupConfigByIdentity", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApgroupConfigByIdentityResponse());
    }

    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentity(GetApgroupConfigByIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupConfigByIdentityWithOptions(request, runtime);
    }

    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSizeWithOptions(GetNetDeviceInfoWithSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNetDeviceInfoWithSize", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetNetDeviceInfoWithSizeResponse());
    }

    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSize(GetNetDeviceInfoWithSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNetDeviceInfoWithSizeWithOptions(request, runtime);
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSaveWithOptions(PutAppConfigAndSaveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAppConfigAndSave", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new PutAppConfigAndSaveResponse());
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSave(PutAppConfigAndSaveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAppConfigAndSaveWithOptions(request, runtime);
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfoWithOptions(UpdateNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNetDeviceInfo", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNetDeviceInfoResponse());
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfo(UpdateNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNetDeviceInfoWithOptions(request, runtime);
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSerWithOptions(GetGroupMiscAggTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGroupMiscAggTimeSer", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetGroupMiscAggTimeSerResponse());
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSer(GetGroupMiscAggTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupMiscAggTimeSerWithOptions(request, runtime);
    }

    public GetApDetailedConfigResponse getApDetailedConfigWithOptions(GetApDetailedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApDetailedConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApDetailedConfigResponse());
    }

    public GetApDetailedConfigResponse getApDetailedConfig(GetApDetailedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApDetailedConfigWithOptions(request, runtime);
    }

    public SaveApRadioConfigResponse saveApRadioConfigWithOptions(SaveApRadioConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveApRadioConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SaveApRadioConfigResponse());
    }

    public SaveApRadioConfigResponse saveApRadioConfig(SaveApRadioConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApRadioConfigWithOptions(request, runtime);
    }

    public SaveApgroupPortalConfigResponse saveApgroupPortalConfigWithOptions(SaveApgroupPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApgroupPortalConfigShrinkRequest request = new SaveApgroupPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveApgroupPortalConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SaveApgroupPortalConfigResponse());
    }

    public SaveApgroupPortalConfigResponse saveApgroupPortalConfig(SaveApgroupPortalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApgroupPortalConfigWithOptions(request, runtime);
    }

    public SaveApPortalConfigResponse saveApPortalConfigWithOptions(SaveApPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApPortalConfigShrinkRequest request = new SaveApPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveApPortalConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SaveApPortalConfigResponse());
    }

    public SaveApPortalConfigResponse saveApPortalConfig(SaveApPortalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApPortalConfigWithOptions(request, runtime);
    }

    public GetApDetailStatusResponse getApDetailStatusWithOptions(GetApDetailStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApDetailStatus", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApDetailStatusResponse());
    }

    public GetApDetailStatusResponse getApDetailStatus(GetApDetailStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApDetailStatusWithOptions(request, runtime);
    }

    public GetNetDeviceInfoResponse getNetDeviceInfoWithOptions(GetNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNetDeviceInfo", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetNetDeviceInfoResponse());
    }

    public GetNetDeviceInfoResponse getNetDeviceInfo(GetNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNetDeviceInfoWithOptions(request, runtime);
    }

    public EffectApConfigResponse effectApConfigWithOptions(EffectApConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EffectApConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new EffectApConfigResponse());
    }

    public EffectApConfigResponse effectApConfig(EffectApConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectApConfigWithOptions(request, runtime);
    }

    public RepairApRadioResponse repairApRadioWithOptions(RepairApRadioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RepairApRadio", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new RepairApRadioResponse());
    }

    public RepairApRadioResponse repairApRadio(RepairApRadioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repairApRadioWithOptions(request, runtime);
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSerWithOptions(GetRadioRunHistoryTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRadioRunHistoryTimeSer", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetRadioRunHistoryTimeSerResponse());
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSer(GetRadioRunHistoryTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRadioRunHistoryTimeSerWithOptions(request, runtime);
    }

    public RebootApResponse rebootApWithOptions(RebootApRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootAp", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new RebootApResponse());
    }

    public RebootApResponse rebootAp(RebootApRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootApWithOptions(request, runtime);
    }

    public NewJobOrderResponse newJobOrderWithOptions(NewJobOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        NewJobOrderShrinkRequest request = new NewJobOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NewJobOrder", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new NewJobOrderResponse());
    }

    public NewJobOrderResponse newJobOrder(NewJobOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newJobOrderWithOptions(request, runtime);
    }

    public NewNetDeviceInfoResponse newNetDeviceInfoWithOptions(NewNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NewNetDeviceInfo", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new NewNetDeviceInfoResponse());
    }

    public NewNetDeviceInfoResponse newNetDeviceInfo(NewNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newNetDeviceInfoWithOptions(request, runtime);
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfigWithOptions(SaveApgroupSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveApgroupSsidConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SaveApgroupSsidConfigResponse());
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfig(SaveApgroupSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApgroupSsidConfigWithOptions(request, runtime);
    }

    public DeleteApgroupConfigResponse deleteApgroupConfigWithOptions(DeleteApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApgroupConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteApgroupConfigResponse());
    }

    public DeleteApgroupConfigResponse deleteApgroupConfig(DeleteApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApgroupConfigWithOptions(request, runtime);
    }

    public KickStaResponse kickStaWithOptions(KickStaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KickSta", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new KickStaResponse());
    }

    public KickStaResponse kickSta(KickStaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.kickStaWithOptions(request, runtime);
    }

    public DeleteApSsidConfigResponse deleteApSsidConfigWithOptions(DeleteApSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApSsidConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteApSsidConfigResponse());
    }

    public DeleteApSsidConfigResponse deleteApSsidConfig(DeleteApSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApSsidConfigWithOptions(request, runtime);
    }

    public GetApAddressByMacResponse getApAddressByMacWithOptions(GetApAddressByMacRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApAddressByMac", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApAddressByMacResponse());
    }

    public GetApAddressByMacResponse getApAddressByMac(GetApAddressByMacRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApAddressByMacWithOptions(request, runtime);
    }

    public GetApInfoFromPoolResponse getApInfoFromPoolWithOptions(GetApInfoFromPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApInfoFromPool", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApInfoFromPoolResponse());
    }

    public GetApInfoFromPoolResponse getApInfoFromPool(GetApInfoFromPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApInfoFromPoolWithOptions(request, runtime);
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfoWithOptions(DeleteNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetDeviceInfo", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetDeviceInfoResponse());
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfo(DeleteNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetDeviceInfoWithOptions(request, runtime);
    }

    public AddApListToApgroupResponse addApListToApgroupWithOptions(AddApListToApgroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddApListToApgroupShrinkRequest request = new AddApListToApgroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apMacList)) {
            request.apMacListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apMacList, "ApMacList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddApListToApgroup", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new AddApListToApgroupResponse());
    }

    public AddApListToApgroupResponse addApListToApgroup(AddApListToApgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addApListToApgroupWithOptions(request, runtime);
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfigWithOptions(GetApgroupSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApgroupSsidConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApgroupSsidConfigResponse());
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfig(GetApgroupSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupSsidConfigWithOptions(request, runtime);
    }

    public SaveApSsidConfigResponse saveApSsidConfigWithOptions(SaveApSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveApSsidConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SaveApSsidConfigResponse());
    }

    public SaveApSsidConfigResponse saveApSsidConfig(SaveApSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApSsidConfigWithOptions(request, runtime);
    }

    public EffectApgroupConfigResponse effectApgroupConfigWithOptions(EffectApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EffectApgroupConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new EffectApgroupConfigResponse());
    }

    public EffectApgroupConfigResponse effectApgroupConfig(EffectApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectApgroupConfigWithOptions(request, runtime);
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSerWithOptions(GetApRunHistoryTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApRunHistoryTimeSer", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApRunHistoryTimeSerResponse());
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSer(GetApRunHistoryTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApRunHistoryTimeSerWithOptions(request, runtime);
    }

    public ListApgroupDescendantResponse listApgroupDescendantWithOptions(ListApgroupDescendantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApgroupDescendant", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListApgroupDescendantResponse());
    }

    public ListApgroupDescendantResponse listApgroupDescendant(ListApgroupDescendantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApgroupDescendantWithOptions(request, runtime);
    }

    public SetApAddressResponse setApAddressWithOptions(SetApAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetApAddress", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetApAddressResponse());
    }

    public SetApAddressResponse setApAddress(SetApAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setApAddressWithOptions(request, runtime);
    }

    public GetApAssetResponse getApAssetWithOptions(GetApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApAsset", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApAssetResponse());
    }

    public GetApAssetResponse getApAsset(GetApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApAssetWithOptions(request, runtime);
    }

    public SetApNameResponse setApNameWithOptions(SetApNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetApName", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new SetApNameResponse());
    }

    public SetApNameResponse setApName(SetApNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setApNameWithOptions(request, runtime);
    }

    public GetApgroupIdResponse getApgroupIdWithOptions(GetApgroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApgroupId", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApgroupIdResponse());
    }

    public GetApgroupIdResponse getApgroupId(GetApgroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupIdWithOptions(request, runtime);
    }

    public GetStaStatusListByApResponse getStaStatusListByApWithOptions(GetStaStatusListByApRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStaStatusListByAp", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetStaStatusListByApResponse());
    }

    public GetStaStatusListByApResponse getStaStatusListByAp(GetStaStatusListByApRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStaStatusListByApWithOptions(request, runtime);
    }

    public ListJobOrdersResponse listJobOrdersWithOptions(ListJobOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobOrders", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobOrdersResponse());
    }

    public ListJobOrdersResponse listJobOrders(ListJobOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobOrdersWithOptions(request, runtime);
    }

    public NewApgroupConfigResponse newApgroupConfigWithOptions(NewApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NewApgroupConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new NewApgroupConfigResponse());
    }

    public NewApgroupConfigResponse newApgroupConfig(NewApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newApgroupConfigWithOptions(request, runtime);
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupIdWithOptions(GetApStatusByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApStatusByGroupId", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApStatusByGroupIdResponse());
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupId(GetApStatusByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApStatusByGroupIdWithOptions(request, runtime);
    }

    public GetApgroupDetailedConfigResponse getApgroupDetailedConfigWithOptions(GetApgroupDetailedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApgroupDetailedConfig", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new GetApgroupDetailedConfigResponse());
    }

    public GetApgroupDetailedConfigResponse getApgroupDetailedConfig(GetApgroupDetailedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupDetailedConfigWithOptions(request, runtime);
    }

    public QueryJobOrderResponse queryJobOrderWithOptions(QueryJobOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryJobOrder", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new QueryJobOrderResponse());
    }

    public QueryJobOrderResponse queryJobOrder(QueryJobOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobOrderWithOptions(request, runtime);
    }

    public RegisterApAssetResponse registerApAssetWithOptions(RegisterApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterApAsset", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterApAssetResponse());
    }

    public RegisterApAssetResponse registerApAsset(RegisterApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerApAssetWithOptions(request, runtime);
    }

    public UnRegisterApAssetResponse unRegisterApAssetWithOptions(UnRegisterApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnRegisterApAsset", "2019-11-18", "HTTPS", "POST", "AK", "json", req, runtime), new UnRegisterApAssetResponse());
    }

    public UnRegisterApAssetResponse unRegisterApAsset(UnRegisterApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unRegisterApAssetWithOptions(request, runtime);
    }
}
