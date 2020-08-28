// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118;

import com.aliyun.tea.*;
import com.aliyun.cloudwifi_pop20191118.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "cloudwf.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudwifi-pop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSizeWithOptions(GetNetDeviceInfoWithSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNetDeviceInfoWithSize", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetNetDeviceInfoWithSizeResponse());
    }

    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSize(GetNetDeviceInfoWithSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetDeviceInfoWithSizeWithOptions(request, runtime);
    }

    public ListJobOrdersWithSizeResponse listJobOrdersWithSizeWithOptions(ListJobOrdersWithSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListJobOrdersWithSize", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new ListJobOrdersWithSizeResponse());
    }

    public ListJobOrdersWithSizeResponse listJobOrdersWithSize(ListJobOrdersWithSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobOrdersWithSizeWithOptions(request, runtime);
    }

    public NewJobOrderResponse newJobOrderWithOptions(NewJobOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NewJobOrder", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new NewJobOrderResponse());
    }

    public NewJobOrderResponse newJobOrder(NewJobOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newJobOrderWithOptions(request, runtime);
    }

    public NewNetDeviceInfoResponse newNetDeviceInfoWithOptions(NewNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NewNetDeviceInfo", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new NewNetDeviceInfoResponse());
    }

    public NewNetDeviceInfoResponse newNetDeviceInfo(NewNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newNetDeviceInfoWithOptions(request, runtime);
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfoWithOptions(DeleteNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNetDeviceInfo", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new DeleteNetDeviceInfoResponse());
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfo(DeleteNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetDeviceInfoWithOptions(request, runtime);
    }

    public QueryJobOrderResponse queryJobOrderWithOptions(QueryJobOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryJobOrder", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new QueryJobOrderResponse());
    }

    public QueryJobOrderResponse queryJobOrder(QueryJobOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryJobOrderWithOptions(request, runtime);
    }

    public GetNetDeviceInfoResponse getNetDeviceInfoWithOptions(GetNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNetDeviceInfo", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetNetDeviceInfoResponse());
    }

    public GetNetDeviceInfoResponse getNetDeviceInfo(GetNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetDeviceInfoWithOptions(request, runtime);
    }

    public ListJobOrdersResponse listJobOrdersWithOptions(ListJobOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListJobOrders", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new ListJobOrdersResponse());
    }

    public ListJobOrdersResponse listJobOrders(ListJobOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobOrdersWithOptions(request, runtime);
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfoWithOptions(UpdateNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateNetDeviceInfo", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new UpdateNetDeviceInfoResponse());
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfo(UpdateNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetDeviceInfoWithOptions(request, runtime);
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSaveWithOptions(PutAppConfigAndSaveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutAppConfigAndSave", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new PutAppConfigAndSaveResponse());
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSave(PutAppConfigAndSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putAppConfigAndSaveWithOptions(request, runtime);
    }

    public RepairApRadioResponse repairApRadioWithOptions(RepairApRadioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RepairApRadio", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new RepairApRadioResponse());
    }

    public RepairApRadioResponse repairApRadio(RepairApRadioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.repairApRadioWithOptions(request, runtime);
    }

    public RebootApResponse rebootApWithOptions(RebootApRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootAp", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new RebootApResponse());
    }

    public RebootApResponse rebootAp(RebootApRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootApWithOptions(request, runtime);
    }

    public SaveApRadioConfigResponse saveApRadioConfigWithOptions(SaveApRadioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveApRadioConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new SaveApRadioConfigResponse());
    }

    public SaveApRadioConfigResponse saveApRadioConfig(SaveApRadioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApRadioConfigWithOptions(request, runtime);
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSerWithOptions(GetRadioRunHistoryTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRadioRunHistoryTimeSer", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetRadioRunHistoryTimeSerResponse());
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSer(GetRadioRunHistoryTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRadioRunHistoryTimeSerWithOptions(request, runtime);
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSerWithOptions(GetApRunHistoryTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApRunHistoryTimeSer", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApRunHistoryTimeSerResponse());
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSer(GetApRunHistoryTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApRunHistoryTimeSerWithOptions(request, runtime);
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSerWithOptions(GetGroupMiscAggTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGroupMiscAggTimeSer", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetGroupMiscAggTimeSerResponse());
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSer(GetGroupMiscAggTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupMiscAggTimeSerWithOptions(request, runtime);
    }

    public GetApInfoFromPoolResponse getApInfoFromPoolWithOptions(GetApInfoFromPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApInfoFromPool", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApInfoFromPoolResponse());
    }

    public GetApInfoFromPoolResponse getApInfoFromPool(GetApInfoFromPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApInfoFromPoolWithOptions(request, runtime);
    }

    public KickStaResponse kickStaWithOptions(KickStaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("KickSta", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new KickStaResponse());
    }

    public KickStaResponse kickSta(KickStaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kickStaWithOptions(request, runtime);
    }

    public DeleteApgroupConfigResponse deleteApgroupConfigWithOptions(DeleteApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApgroupConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new DeleteApgroupConfigResponse());
    }

    public DeleteApgroupConfigResponse deleteApgroupConfig(DeleteApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApgroupConfigWithOptions(request, runtime);
    }

    public GetApDetailedConfigResponse getApDetailedConfigWithOptions(GetApDetailedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApDetailedConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApDetailedConfigResponse());
    }

    public GetApDetailedConfigResponse getApDetailedConfig(GetApDetailedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApDetailedConfigWithOptions(request, runtime);
    }

    public GetApDetailStatusResponse getApDetailStatusWithOptions(GetApDetailStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApDetailStatus", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApDetailStatusResponse());
    }

    public GetApDetailStatusResponse getApDetailStatus(GetApDetailStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApDetailStatusWithOptions(request, runtime);
    }

    public DeleteApSsidConfigResponse deleteApSsidConfigWithOptions(DeleteApSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApSsidConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new DeleteApSsidConfigResponse());
    }

    public DeleteApSsidConfigResponse deleteApSsidConfig(DeleteApSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApSsidConfigWithOptions(request, runtime);
    }

    public GetApgroupIdResponse getApgroupIdWithOptions(GetApgroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApgroupId", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApgroupIdResponse());
    }

    public GetApgroupIdResponse getApgroupId(GetApgroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupIdWithOptions(request, runtime);
    }

    public SetApAddressResponse setApAddressWithOptions(SetApAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetApAddress", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new SetApAddressResponse());
    }

    public SetApAddressResponse setApAddress(SetApAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApAddressWithOptions(request, runtime);
    }

    public SaveApSsidConfigResponse saveApSsidConfigWithOptions(SaveApSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveApSsidConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new SaveApSsidConfigResponse());
    }

    public SaveApSsidConfigResponse saveApSsidConfig(SaveApSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApSsidConfigWithOptions(request, runtime);
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupIdWithOptions(GetApStatusByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApStatusByGroupId", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApStatusByGroupIdResponse());
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupId(GetApStatusByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApStatusByGroupIdWithOptions(request, runtime);
    }

    public EffectApgroupConfigResponse effectApgroupConfigWithOptions(EffectApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EffectApgroupConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new EffectApgroupConfigResponse());
    }

    public EffectApgroupConfigResponse effectApgroupConfig(EffectApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectApgroupConfigWithOptions(request, runtime);
    }

    public RegisterApAssetResponse registerApAssetWithOptions(RegisterApAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RegisterApAsset", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new RegisterApAssetResponse());
    }

    public RegisterApAssetResponse registerApAsset(RegisterApAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerApAssetWithOptions(request, runtime);
    }

    public EffectApConfigResponse effectApConfigWithOptions(EffectApConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EffectApConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new EffectApConfigResponse());
    }

    public EffectApConfigResponse effectApConfig(EffectApConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectApConfigWithOptions(request, runtime);
    }

    public SetApNameResponse setApNameWithOptions(SetApNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetApName", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new SetApNameResponse());
    }

    public SetApNameResponse setApName(SetApNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApNameWithOptions(request, runtime);
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfigWithOptions(SaveApgroupSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveApgroupSsidConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new SaveApgroupSsidConfigResponse());
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfig(SaveApgroupSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApgroupSsidConfigWithOptions(request, runtime);
    }

    public GetStaStatusListByApResponse getStaStatusListByApWithOptions(GetStaStatusListByApRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStaStatusListByAp", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetStaStatusListByApResponse());
    }

    public GetStaStatusListByApResponse getStaStatusListByAp(GetStaStatusListByApRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStaStatusListByApWithOptions(request, runtime);
    }

    public GetApAddressByMacResponse getApAddressByMacWithOptions(GetApAddressByMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApAddressByMac", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApAddressByMacResponse());
    }

    public GetApAddressByMacResponse getApAddressByMac(GetApAddressByMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApAddressByMacWithOptions(request, runtime);
    }

    public AddApListToApgroupResponse addApListToApgroupWithOptions(AddApListToApgroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddApListToApgroup", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new AddApListToApgroupResponse());
    }

    public AddApListToApgroupResponse addApListToApgroup(AddApListToApgroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApListToApgroupWithOptions(request, runtime);
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfigWithOptions(GetApgroupSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApgroupSsidConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApgroupSsidConfigResponse());
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfig(GetApgroupSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupSsidConfigWithOptions(request, runtime);
    }

    public NewApgroupConfigResponse newApgroupConfigWithOptions(NewApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NewApgroupConfig", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new NewApgroupConfigResponse());
    }

    public NewApgroupConfigResponse newApgroupConfig(NewApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newApgroupConfigWithOptions(request, runtime);
    }

    public GetApAssetResponse getApAssetWithOptions(GetApAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApAsset", "HTTPS", "POST", "2019-11-18", "AK", TeaModel.buildMap(request), null, runtime), new GetApAssetResponse());
    }

    public GetApAssetResponse getApAsset(GetApAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApAssetWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
