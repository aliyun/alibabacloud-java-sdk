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

    public AddApListToApgroupResponse addApListToApgroupWithOptions(AddApListToApgroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddApListToApgroupShrinkRequest request = new AddApListToApgroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apMacList)) {
            request.apMacListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apMacList, "ApMacList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApGroupId", request.apGroupId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddApListToApgroup"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddApListToApgroupResponse());
    }

    public AddApListToApgroupResponse addApListToApgroup(AddApListToApgroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addApListToApgroupWithOptions(request, runtime);
    }

    public DelApThirdAppResponse delApThirdAppWithOptions(DelApThirdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApAssetId", request.apAssetId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Id", request.id);
        query.put("Mac", request.mac);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelApThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelApThirdAppResponse());
    }

    public DelApThirdAppResponse delApThirdApp(DelApThirdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delApThirdAppWithOptions(request, runtime);
    }

    public DeleteApSsidConfigResponse deleteApSsidConfigWithOptions(DeleteApSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("RadioIndex", request.radioIndex);
        query.put("Ssid", request.ssid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApSsidConfigResponse());
    }

    public DeleteApSsidConfigResponse deleteApSsidConfig(DeleteApSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApSsidConfigWithOptions(request, runtime);
    }

    public DeleteApgroupConfigResponse deleteApgroupConfigWithOptions(DeleteApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApGroupUUId", request.apGroupUUId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApgroupConfigResponse());
    }

    public DeleteApgroupConfigResponse deleteApgroupConfig(DeleteApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApgroupConfigWithOptions(request, runtime);
    }

    public DeleteApgroupThirdAppResponse deleteApgroupThirdAppWithOptions(DeleteApgroupThirdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Id", request.id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApgroupThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApgroupThirdAppResponse());
    }

    public DeleteApgroupThirdAppResponse deleteApgroupThirdApp(DeleteApgroupThirdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApgroupThirdAppWithOptions(request, runtime);
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfoWithOptions(DeleteNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Ids", request.ids);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetDeviceInfoResponse());
    }

    public DeleteNetDeviceInfoResponse deleteNetDeviceInfo(DeleteNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetDeviceInfoWithOptions(request, runtime);
    }

    public EditApgroupThirdAppResponse editApgroupThirdAppWithOptions(EditApgroupThirdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("AppCode", request.appCode);
        query.put("AppData", request.appData);
        query.put("AppName", request.appName);
        query.put("ApplyToSubGroup", request.applyToSubGroup);
        query.put("Category", request.category);
        query.put("ConfigType", request.configType);
        query.put("Id", request.id);
        query.put("InheritParentGroup", request.inheritParentGroup);
        query.put("ThirdAppName", request.thirdAppName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditApgroupThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditApgroupThirdAppResponse());
    }

    public EditApgroupThirdAppResponse editApgroupThirdApp(EditApgroupThirdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editApgroupThirdAppWithOptions(request, runtime);
    }

    public EffectApConfigResponse effectApConfigWithOptions(EffectApConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EffectApConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EffectApConfigResponse());
    }

    public EffectApConfigResponse effectApConfig(EffectApConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectApConfigWithOptions(request, runtime);
    }

    public EffectApgroupConfigResponse effectApgroupConfigWithOptions(EffectApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApGroupUUId", request.apGroupUUId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EffectApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EffectApgroupConfigResponse());
    }

    public EffectApgroupConfigResponse effectApgroupConfig(EffectApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectApgroupConfigWithOptions(request, runtime);
    }

    public GetApAddressByMacResponse getApAddressByMacWithOptions(GetApAddressByMacRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Language", request.language);
        query.put("Mac", request.mac);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApAddressByMac"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApAddressByMacResponse());
    }

    public GetApAddressByMacResponse getApAddressByMac(GetApAddressByMacRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApAddressByMacWithOptions(request, runtime);
    }

    public GetApAssetResponse getApAssetWithOptions(GetApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApAssetResponse());
    }

    public GetApAssetResponse getApAsset(GetApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApAssetWithOptions(request, runtime);
    }

    public GetApDetailStatusResponse getApDetailStatusWithOptions(GetApDetailStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Mac", request.mac);
        query.put("NeedApgroupInfo", request.needApgroupInfo);
        query.put("NeedRadioStatus", request.needRadioStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApDetailStatus"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApDetailStatusResponse());
    }

    public GetApDetailStatusResponse getApDetailStatus(GetApDetailStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApDetailStatusWithOptions(request, runtime);
    }

    public GetApDetailedConfigResponse getApDetailedConfigWithOptions(GetApDetailedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApDetailedConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApDetailedConfigResponse());
    }

    public GetApDetailedConfigResponse getApDetailedConfig(GetApDetailedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApDetailedConfigWithOptions(request, runtime);
    }

    public GetApInfoFromPoolResponse getApInfoFromPoolWithOptions(GetApInfoFromPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApInfoFromPool"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApInfoFromPoolResponse());
    }

    public GetApInfoFromPoolResponse getApInfoFromPool(GetApInfoFromPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApInfoFromPoolWithOptions(request, runtime);
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSerWithOptions(GetApRunHistoryTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("End", request.end);
        query.put("Start", request.start);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApRunHistoryTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApRunHistoryTimeSerResponse());
    }

    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSer(GetApRunHistoryTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApRunHistoryTimeSerWithOptions(request, runtime);
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupIdWithOptions(GetApStatusByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Cursor", request.cursor);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApStatusByGroupId"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApStatusByGroupIdResponse());
    }

    public GetApStatusByGroupIdResponse getApStatusByGroupId(GetApStatusByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApStatusByGroupIdWithOptions(request, runtime);
    }

    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentityWithOptions(GetApgroupConfigByIdentityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("ApgroupUuid", request.apgroupUuid);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupConfigByIdentity"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApgroupConfigByIdentityResponse());
    }

    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentity(GetApgroupConfigByIdentityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupConfigByIdentityWithOptions(request, runtime);
    }

    public GetApgroupDetailedConfigResponse getApgroupDetailedConfigWithOptions(GetApgroupDetailedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("ApgroupUuid", request.apgroupUuid);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupDetailedConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApgroupDetailedConfigResponse());
    }

    public GetApgroupDetailedConfigResponse getApgroupDetailedConfig(GetApgroupDetailedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupDetailedConfigWithOptions(request, runtime);
    }

    public GetApgroupIdResponse getApgroupIdWithOptions(GetApgroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupId"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApgroupIdResponse());
    }

    public GetApgroupIdResponse getApgroupId(GetApgroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupIdWithOptions(request, runtime);
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfigWithOptions(GetApgroupSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApGroupUUId", request.apGroupUUId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApgroupSsidConfigResponse());
    }

    public GetApgroupSsidConfigResponse getApgroupSsidConfig(GetApgroupSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApgroupSsidConfigWithOptions(request, runtime);
    }

    public GetBatchTaskProgressResponse getBatchTaskProgressWithOptions(GetBatchTaskProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskProgress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskProgressResponse());
    }

    public GetBatchTaskProgressResponse getBatchTaskProgress(GetBatchTaskProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBatchTaskProgressWithOptions(request, runtime);
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSerWithOptions(GetGroupMiscAggTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupUuid", request.apgroupUuid);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("End", request.end);
        query.put("Start", request.start);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupMiscAggTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupMiscAggTimeSerResponse());
    }

    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSer(GetGroupMiscAggTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupMiscAggTimeSerWithOptions(request, runtime);
    }

    public GetNetDeviceInfoResponse getNetDeviceInfoWithOptions(GetNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Cursor", request.cursor);
        query.put("HostName", request.hostName);
        query.put("Id", request.id);
        query.put("Idc", request.idc);
        query.put("LogicNetPod", request.logicNetPod);
        query.put("Manufacturer", request.manufacturer);
        query.put("MgnIp", request.mgnIp);
        query.put("Model", request.model);
        query.put("NetPod", request.netPod);
        query.put("PageSize", request.pageSize);
        query.put("Password", request.password);
        query.put("RequestId", request.requestId);
        query.put("Role", request.role);
        query.put("ServiceTag", request.serviceTag);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetDeviceInfoResponse());
    }

    public GetNetDeviceInfoResponse getNetDeviceInfo(GetNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNetDeviceInfoWithOptions(request, runtime);
    }

    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSizeWithOptions(GetNetDeviceInfoWithSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Cursor", request.cursor);
        query.put("HostName", request.hostName);
        query.put("Id", request.id);
        query.put("Idc", request.idc);
        query.put("LogicNetPod", request.logicNetPod);
        query.put("Manufacturer", request.manufacturer);
        query.put("MgnIp", request.mgnIp);
        query.put("Model", request.model);
        query.put("NetPod", request.netPod);
        query.put("PageSize", request.pageSize);
        query.put("Password", request.password);
        query.put("RequestId", request.requestId);
        query.put("Role", request.role);
        query.put("ServiceTag", request.serviceTag);
        query.put("Username", request.username);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetDeviceInfoWithSize"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetDeviceInfoWithSizeResponse());
    }

    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSize(GetNetDeviceInfoWithSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNetDeviceInfoWithSizeWithOptions(request, runtime);
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSerWithOptions(GetRadioRunHistoryTimeSerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("End", request.end);
        query.put("Start", request.start);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRadioRunHistoryTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRadioRunHistoryTimeSerResponse());
    }

    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSer(GetRadioRunHistoryTimeSerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRadioRunHistoryTimeSerWithOptions(request, runtime);
    }

    public GetStaStatusListByApResponse getStaStatusListByApWithOptions(GetStaStatusListByApRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Cursor", request.cursor);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStaStatusListByAp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStaStatusListByApResponse());
    }

    public GetStaStatusListByApResponse getStaStatusListByAp(GetStaStatusListByApRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStaStatusListByApWithOptions(request, runtime);
    }

    public KickStaResponse kickStaWithOptions(KickStaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("StaMac", request.staMac);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KickSta"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KickStaResponse());
    }

    public KickStaResponse kickSta(KickStaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.kickStaWithOptions(request, runtime);
    }

    public ListApgroupDescendantResponse listApgroupDescendantWithOptions(ListApgroupDescendantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("ApgroupUuid", request.apgroupUuid);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Cursor", request.cursor);
        query.put("Level", request.level);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApgroupDescendant"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApgroupDescendantResponse());
    }

    public ListApgroupDescendantResponse listApgroupDescendant(ListApgroupDescendantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApgroupDescendantWithOptions(request, runtime);
    }

    public ListJobOrdersResponse listJobOrdersWithOptions(ListJobOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("ChangingType", request.changingType);
        query.put("ClientSystem", request.clientSystem);
        query.put("ClientUniqueId", request.clientUniqueId);
        query.put("Cursor", request.cursor);
        query.put("EndTime", request.endTime);
        query.put("Handler", request.handler);
        query.put("Id", request.id);
        query.put("OrderStatus", request.orderStatus);
        query.put("PageSize", request.pageSize);
        query.put("RequestId", request.requestId);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobOrders"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobOrdersResponse());
    }

    public ListJobOrdersResponse listJobOrders(ListJobOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobOrdersWithOptions(request, runtime);
    }

    public ListJobOrdersWithSizeResponse listJobOrdersWithSizeWithOptions(ListJobOrdersWithSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("ChangingType", request.changingType);
        query.put("ClientSystem", request.clientSystem);
        query.put("ClientUniqueId", request.clientUniqueId);
        query.put("Cursor", request.cursor);
        query.put("EndTime", request.endTime);
        query.put("Handler", request.handler);
        query.put("Id", request.id);
        query.put("OrderStatus", request.orderStatus);
        query.put("PageSize", request.pageSize);
        query.put("RequestId", request.requestId);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobOrdersWithSize"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobOrdersWithSizeResponse());
    }

    public ListJobOrdersWithSizeResponse listJobOrdersWithSize(ListJobOrdersWithSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobOrdersWithSizeWithOptions(request, runtime);
    }

    public NewApgroupConfigResponse newApgroupConfigWithOptions(NewApgroupConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Name", request.name);
        query.put("ParentApgroupId", request.parentApgroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NewApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NewApgroupConfigResponse());
    }

    public NewApgroupConfigResponse newApgroupConfig(NewApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newApgroupConfigWithOptions(request, runtime);
    }

    public NewJobOrderResponse newJobOrderWithOptions(NewJobOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        NewJobOrderShrinkRequest request = new NewJobOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("CallbackUrl", request.callbackUrl);
        query.put("ChangeType", request.changeType);
        query.put("ClientSystem", request.clientSystem);
        query.put("ClientUniqueId", request.clientUniqueId);
        query.put("Creator", request.creator);
        query.put("ReferUrl", request.referUrl);
        query.put("RequestId", request.requestId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NewJobOrder"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NewJobOrderResponse());
    }

    public NewJobOrderResponse newJobOrder(NewJobOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newJobOrderWithOptions(request, runtime);
    }

    public NewNetDeviceInfoResponse newNetDeviceInfoWithOptions(NewNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NewNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NewNetDeviceInfoResponse());
    }

    public NewNetDeviceInfoResponse newNetDeviceInfo(NewNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.newNetDeviceInfoWithOptions(request, runtime);
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSaveWithOptions(PutAppConfigAndSaveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("ConfigureType", request.configureType);
        query.put("CurrentTime", request.currentTime);
        query.put("Data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAppConfigAndSave"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutAppConfigAndSaveResponse());
    }

    public PutAppConfigAndSaveResponse putAppConfigAndSave(PutAppConfigAndSaveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAppConfigAndSaveWithOptions(request, runtime);
    }

    public QueryJobOrderResponse queryJobOrderWithOptions(QueryJobOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("OrderId", request.orderId);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobOrder"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobOrderResponse());
    }

    public QueryJobOrderResponse queryJobOrder(QueryJobOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobOrderWithOptions(request, runtime);
    }

    public RebootApResponse rebootApWithOptions(RebootApRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootAp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootApResponse());
    }

    public RebootApResponse rebootAp(RebootApRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootApWithOptions(request, runtime);
    }

    public RegisterApAssetResponse registerApAssetWithOptions(RegisterApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApGroupUUId", request.apGroupUUId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Id", request.id);
        query.put("Mac", request.mac);
        query.put("SerialNo", request.serialNo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterApAssetResponse());
    }

    public RegisterApAssetResponse registerApAsset(RegisterApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerApAssetWithOptions(request, runtime);
    }

    public RepairApRadioResponse repairApRadioWithOptions(RepairApRadioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("RadioIndex", request.radioIndex);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepairApRadio"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepairApRadioResponse());
    }

    public RepairApRadioResponse repairApRadio(RepairApRadioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repairApRadioWithOptions(request, runtime);
    }

    public SaveApPortalConfigResponse saveApPortalConfigWithOptions(SaveApPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApPortalConfigShrinkRequest request = new SaveApPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApConfigId", request.apConfigId);
        query.put("AppAuthUrl", request.appAuthUrl);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("AuthKey", request.authKey);
        query.put("AuthSecret", request.authSecret);
        query.put("CheckUrl", request.checkUrl);
        query.put("ClientDownload", request.clientDownload);
        query.put("ClientUpload", request.clientUpload);
        query.put("Countdown", request.countdown);
        query.put("Network", request.network);
        query.put("PortalTypes", request.portalTypesShrink);
        query.put("PortalUrl", request.portalUrl);
        query.put("TimeStamp", request.timeStamp);
        query.put("TotalDownload", request.totalDownload);
        query.put("TotalUpload", request.totalUpload);
        query.put("WebAuthUrl", request.webAuthUrl);
        query.put("Whitelist", request.whitelist);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApPortalConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApPortalConfigResponse());
    }

    public SaveApPortalConfigResponse saveApPortalConfig(SaveApPortalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApPortalConfigWithOptions(request, runtime);
    }

    public SaveApRadioConfigResponse saveApRadioConfigWithOptions(SaveApRadioConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("BcastRate", request.bcastRate);
        query.put("BeaconInt", request.beaconInt);
        query.put("Channel", request.channel);
        query.put("Disabled", request.disabled);
        query.put("Frag", request.frag);
        query.put("Htmode", request.htmode);
        query.put("Hwmode", request.hwmode);
        query.put("Id", request.id);
        query.put("McastRate", request.mcastRate);
        query.put("MgmtRate", request.mgmtRate);
        query.put("Minrate", request.minrate);
        query.put("Noscan", request.noscan);
        query.put("Probereq", request.probereq);
        query.put("RequireMode", request.requireMode);
        query.put("Rts", request.rts);
        query.put("Shortgi", request.shortgi);
        query.put("Txpower", request.txpower);
        query.put("Uapsd", request.uapsd);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApRadioConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApRadioConfigResponse());
    }

    public SaveApRadioConfigResponse saveApRadioConfig(SaveApRadioConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApRadioConfigWithOptions(request, runtime);
    }

    public SaveApSsidConfigResponse saveApSsidConfigWithOptions(SaveApSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcctPort", request.acctPort);
        query.put("AcctSecret", request.acctSecret);
        query.put("AcctServer", request.acctServer);
        query.put("AcctStatusServerWork", request.acctStatusServerWork);
        query.put("ApAssetId", request.apAssetId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("ArpProxyEnable", request.arpProxyEnable);
        query.put("AuthCache", request.authCache);
        query.put("AuthPort", request.authPort);
        query.put("AuthSecret", request.authSecret);
        query.put("AuthServer", request.authServer);
        query.put("AuthStatusServerWork", request.authStatusServerWork);
        query.put("Cir", request.cir);
        query.put("CirStep", request.cirStep);
        query.put("CirType", request.cirType);
        query.put("CirUl", request.cirUl);
        query.put("DaeClient", request.daeClient);
        query.put("DaePort", request.daePort);
        query.put("DaeSecret", request.daeSecret);
        query.put("Disabled", request.disabled);
        query.put("DisassocLowAck", request.disassocLowAck);
        query.put("DisassocWeakRssi", request.disassocWeakRssi);
        query.put("DynamicVlan", request.dynamicVlan);
        query.put("EncKey", request.encKey);
        query.put("Encryption", request.encryption);
        query.put("FourthAuthPort", request.fourthAuthPort);
        query.put("FourthAuthSecret", request.fourthAuthSecret);
        query.put("FourthAuthServer", request.fourthAuthServer);
        query.put("FtOverDs", request.ftOverDs);
        query.put("Hidden", request.hidden);
        query.put("Id", request.id);
        query.put("Ieee80211r", request.ieee80211r);
        query.put("Ieee80211w", request.ieee80211w);
        query.put("IgnoreWeakProbe", request.ignoreWeakProbe);
        query.put("Isolate", request.isolate);
        query.put("LiteEffect", request.liteEffect);
        query.put("Mac", request.mac);
        query.put("MaxInactivity", request.maxInactivity);
        query.put("Maxassoc", request.maxassoc);
        query.put("MobilityDomain", request.mobilityDomain);
        query.put("MulticastForward", request.multicastForward);
        query.put("Nasid", request.nasid);
        query.put("NdProxyWork", request.ndProxyWork);
        query.put("Network", request.network);
        query.put("Ownip", request.ownip);
        query.put("RadioIndex", request.radioIndex);
        query.put("SecondaryAcctPort", request.secondaryAcctPort);
        query.put("SecondaryAcctSecret", request.secondaryAcctSecret);
        query.put("SecondaryAcctServer", request.secondaryAcctServer);
        query.put("SecondaryAuthPort", request.secondaryAuthPort);
        query.put("SecondaryAuthSecret", request.secondaryAuthSecret);
        query.put("SecondaryAuthServer", request.secondaryAuthServer);
        query.put("SendConfigToAp", request.sendConfigToAp);
        query.put("ShortPreamble", request.shortPreamble);
        query.put("Ssid", request.ssid);
        query.put("SsidLb", request.ssidLb);
        query.put("ThirdAuthPort", request.thirdAuthPort);
        query.put("ThirdAuthSecret", request.thirdAuthSecret);
        query.put("ThirdAuthServer", request.thirdAuthServer);
        query.put("Type", request.type);
        query.put("VlanDhcp", request.vlanDhcp);
        query.put("Wmm", request.wmm);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApSsidConfigResponse());
    }

    public SaveApSsidConfigResponse saveApSsidConfig(SaveApSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApSsidConfigWithOptions(request, runtime);
    }

    public SaveApThirdAppResponse saveApThirdAppWithOptions(SaveApThirdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddStyle", request.addStyle);
        query.put("ApAssetId", request.apAssetId);
        query.put("AppCode", request.appCode);
        query.put("AppData", request.appData);
        query.put("AppName", request.appName);
        query.put("Category", request.category);
        query.put("Id", request.id);
        query.put("Mac", request.mac);
        query.put("ThirdAppName", request.thirdAppName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApThirdAppResponse());
    }

    public SaveApThirdAppResponse saveApThirdApp(SaveApThirdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApThirdAppWithOptions(request, runtime);
    }

    public SaveApgroupPortalConfigResponse saveApgroupPortalConfigWithOptions(SaveApgroupPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApgroupPortalConfigShrinkRequest request = new SaveApgroupPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApgroupId", request.apgroupId);
        query.put("AppAuthUrl", request.appAuthUrl);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("AuthKey", request.authKey);
        query.put("AuthSecret", request.authSecret);
        query.put("CheckUrl", request.checkUrl);
        query.put("ClientDownload", request.clientDownload);
        query.put("ClientUpload", request.clientUpload);
        query.put("Countdown", request.countdown);
        query.put("Network", request.network);
        query.put("PortalTypes", request.portalTypesShrink);
        query.put("PortalUrl", request.portalUrl);
        query.put("TimeStamp", request.timeStamp);
        query.put("TotalDownload", request.totalDownload);
        query.put("TotalUpload", request.totalUpload);
        query.put("WebAuthUrl", request.webAuthUrl);
        query.put("Whitelist", request.whitelist);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApgroupPortalConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApgroupPortalConfigResponse());
    }

    public SaveApgroupPortalConfigResponse saveApgroupPortalConfig(SaveApgroupPortalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApgroupPortalConfigWithOptions(request, runtime);
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfigWithOptions(SaveApgroupSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcctPort", request.acctPort);
        query.put("AcctSecret", request.acctSecret);
        query.put("AcctServer", request.acctServer);
        query.put("ApgroupId", request.apgroupId);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("AuthCache", request.authCache);
        query.put("AuthPort", request.authPort);
        query.put("AuthSecret", request.authSecret);
        query.put("AuthServer", request.authServer);
        query.put("Binding", request.binding);
        query.put("Cir", request.cir);
        query.put("DaeClient", request.daeClient);
        query.put("DaePort", request.daePort);
        query.put("DaeSecret", request.daeSecret);
        query.put("Disabled", request.disabled);
        query.put("DisassocLowAck", request.disassocLowAck);
        query.put("DisassocWeakRssi", request.disassocWeakRssi);
        query.put("DynamicVlan", request.dynamicVlan);
        query.put("Effect", request.effect);
        query.put("EncKey", request.encKey);
        query.put("Encryption", request.encryption);
        query.put("Hidden", request.hidden);
        query.put("Id", request.id);
        query.put("Ieee80211w", request.ieee80211w);
        query.put("IgnoreWeakProbe", request.ignoreWeakProbe);
        query.put("Isolate", request.isolate);
        query.put("LiteEffect", request.liteEffect);
        query.put("MaxInactivity", request.maxInactivity);
        query.put("Maxassoc", request.maxassoc);
        query.put("MulticastForward", request.multicastForward);
        query.put("Nasid", request.nasid);
        query.put("Network", request.network);
        query.put("NewSsid", request.newSsid);
        query.put("Ownip", request.ownip);
        query.put("SecondaryAcctPort", request.secondaryAcctPort);
        query.put("SecondaryAcctSecret", request.secondaryAcctSecret);
        query.put("SecondaryAcctServer", request.secondaryAcctServer);
        query.put("SecondaryAuthPort", request.secondaryAuthPort);
        query.put("SecondaryAuthSecret", request.secondaryAuthSecret);
        query.put("SecondaryAuthServer", request.secondaryAuthServer);
        query.put("ShortPreamble", request.shortPreamble);
        query.put("Ssid", request.ssid);
        query.put("SsidLb", request.ssidLb);
        query.put("Type", request.type);
        query.put("VlanDhcp", request.vlanDhcp);
        query.put("Wmm", request.wmm);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApgroupSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApgroupSsidConfigResponse());
    }

    public SaveApgroupSsidConfigResponse saveApgroupSsidConfig(SaveApgroupSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApgroupSsidConfigWithOptions(request, runtime);
    }

    public SetApAddressResponse setApAddressWithOptions(SetApAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApAreaName", request.apAreaName);
        query.put("ApBuildingName", request.apBuildingName);
        query.put("ApCampusName", request.apCampusName);
        query.put("ApCityName", request.apCityName);
        query.put("ApFloor", request.apFloor);
        query.put("ApGroup", request.apGroup);
        query.put("ApName", request.apName);
        query.put("ApNationName", request.apNationName);
        query.put("ApProvinceName", request.apProvinceName);
        query.put("ApUnitId", request.apUnitId);
        query.put("ApUnitName", request.apUnitName);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Direction", request.direction);
        query.put("Language", request.language);
        query.put("Lat", request.lat);
        query.put("Lng", request.lng);
        query.put("Mac", request.mac);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApAddress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApAddressResponse());
    }

    public SetApAddressResponse setApAddress(SetApAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setApAddressWithOptions(request, runtime);
    }

    public SetApNameResponse setApNameWithOptions(SetApNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApMac", request.apMac);
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApName"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApNameResponse());
    }

    public SetApNameResponse setApName(SetApNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setApNameWithOptions(request, runtime);
    }

    public UnRegisterApAssetResponse unRegisterApAssetWithOptions(UnRegisterApAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("AssetApgroupId", request.assetApgroupId);
        query.put("Category", request.category);
        query.put("Id", request.id);
        query.put("Mac", request.mac);
        query.put("SerialNo", request.serialNo);
        query.put("UseFor", request.useFor);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRegisterApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnRegisterApAssetResponse());
    }

    public UnRegisterApAssetResponse unRegisterApAsset(UnRegisterApAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unRegisterApAssetWithOptions(request, runtime);
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfoWithOptions(UpdateNetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppCode", request.appCode);
        query.put("AppName", request.appName);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetDeviceInfoResponse());
    }

    public UpdateNetDeviceInfoResponse updateNetDeviceInfo(UpdateNetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNetDeviceInfoWithOptions(request, runtime);
    }
}
