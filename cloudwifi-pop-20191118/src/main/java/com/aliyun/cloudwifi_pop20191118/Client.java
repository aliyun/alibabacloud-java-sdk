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
        if (!com.aliyun.teautil.Common.isUnset(request.apGroupId)) {
            query.put("ApGroupId", request.apGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apMacListShrink)) {
            body.put("ApMacList", request.apMacListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
        if (!com.aliyun.teautil.Common.isUnset(request.apAssetId)) {
            query.put("ApAssetId", request.apAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelApThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.radioIndex)) {
            query.put("RadioIndex", request.radioIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssid)) {
            query.put("Ssid", request.ssid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apGroupUUId)) {
            query.put("ApGroupUUId", request.apGroupUUId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApgroupConfigResponse());
    }

    public DeleteApgroupConfigResponse deleteApgroupConfig(DeleteApgroupConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApgroupConfigWithOptions(request, runtime);
    }

    public DeleteApgroupSsidConfigResponse deleteApgroupSsidConfigWithOptions(DeleteApgroupSsidConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApgroupSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApgroupSsidConfigResponse());
    }

    public DeleteApgroupSsidConfigResponse deleteApgroupSsidConfig(DeleteApgroupSsidConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApgroupSsidConfigWithOptions(request, runtime);
    }

    public DeleteApgroupThirdAppResponse deleteApgroupThirdAppWithOptions(DeleteApgroupThirdAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApgroupThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appData)) {
            query.put("AppData", request.appData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyToSubGroup)) {
            query.put("ApplyToSubGroup", request.applyToSubGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inheritParentGroup)) {
            query.put("InheritParentGroup", request.inheritParentGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdAppName)) {
            query.put("ThirdAppName", request.thirdAppName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditApgroupThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EffectApConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apGroupUUId)) {
            query.put("ApGroupUUId", request.apGroupUUId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EffectApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApAddressByMac"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needApgroupInfo)) {
            query.put("NeedApgroupInfo", request.needApgroupInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRadioStatus)) {
            query.put("NeedRadioStatus", request.needRadioStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApDetailStatus"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApDetailedConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApInfoFromPool"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApRunHistoryTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApStatusByGroupId"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apgroupUuid)) {
            query.put("ApgroupUuid", request.apgroupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupConfigByIdentity"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apgroupUuid)) {
            query.put("ApgroupUuid", request.apgroupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupDetailedConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupId"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apGroupUUId)) {
            query.put("ApGroupUUId", request.apGroupUUId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApgroupSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskProgress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupUuid)) {
            query.put("ApgroupUuid", request.apgroupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupMiscAggTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idc)) {
            query.put("Idc", request.idc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicNetPod)) {
            query.put("LogicNetPod", request.logicNetPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manufacturer)) {
            query.put("Manufacturer", request.manufacturer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mgnIp)) {
            query.put("MgnIp", request.mgnIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netPod)) {
            query.put("NetPod", request.netPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTag)) {
            query.put("ServiceTag", request.serviceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetDeviceInfo"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idc)) {
            query.put("Idc", request.idc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicNetPod)) {
            query.put("LogicNetPod", request.logicNetPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manufacturer)) {
            query.put("Manufacturer", request.manufacturer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mgnIp)) {
            query.put("MgnIp", request.mgnIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netPod)) {
            query.put("NetPod", request.netPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTag)) {
            query.put("ServiceTag", request.serviceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetDeviceInfoWithSize"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRadioRunHistoryTimeSer"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStaStatusListByAp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staMac)) {
            query.put("StaMac", request.staMac);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KickSta"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apgroupUuid)) {
            query.put("ApgroupUuid", request.apgroupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApgroupDescendant"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changingType)) {
            query.put("ChangingType", request.changingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSystem)) {
            query.put("ClientSystem", request.clientSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueId)) {
            query.put("ClientUniqueId", request.clientUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handler)) {
            query.put("Handler", request.handler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobOrders"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changingType)) {
            query.put("ChangingType", request.changingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSystem)) {
            query.put("ClientSystem", request.clientSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueId)) {
            query.put("ClientUniqueId", request.clientUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handler)) {
            query.put("Handler", request.handler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobOrdersWithSize"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentApgroupId)) {
            query.put("ParentApgroupId", request.parentApgroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NewApgroupConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeType)) {
            query.put("ChangeType", request.changeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSystem)) {
            query.put("ClientSystem", request.clientSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUniqueId)) {
            query.put("ClientUniqueId", request.clientUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referUrl)) {
            query.put("ReferUrl", request.referUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("Devices", request.devices);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configureType)) {
            query.put("ConfigureType", request.configureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentTime)) {
            query.put("CurrentTime", request.currentTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAppConfigAndSave"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobOrder"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootAp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apGroupUUId)) {
            query.put("ApGroupUUId", request.apGroupUUId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            query.put("SerialNo", request.serialNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.radioIndex)) {
            query.put("RadioIndex", request.radioIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepairApRadio"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepairApRadioResponse());
    }

    public RepairApRadioResponse repairApRadio(RepairApRadioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repairApRadioWithOptions(request, runtime);
    }

    public SaveApBasicConfigResponse saveApBasicConfigWithOptions(SaveApBasicConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dai)) {
            query.put("Dai", request.dai);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.echoInt)) {
            query.put("EchoInt", request.echoInt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failover)) {
            query.put("Failover", request.failover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insecureAllowed)) {
            query.put("InsecureAllowed", request.insecureAllowed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanIp)) {
            query.put("LanIp", request.lanIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanMask)) {
            query.put("LanMask", request.lanMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanStatus)) {
            query.put("LanStatus", request.lanStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logIp)) {
            query.put("LogIp", request.logIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            query.put("LogLevel", request.logLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwd)) {
            query.put("Passwd", request.passwd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            query.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scan)) {
            query.put("Scan", request.scan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenServer)) {
            query.put("TokenServer", request.tokenServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpn)) {
            query.put("Vpn", request.vpn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApBasicConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApBasicConfigResponse());
    }

    public SaveApBasicConfigResponse saveApBasicConfig(SaveApBasicConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApBasicConfigWithOptions(request, runtime);
    }

    public SaveApPortalConfigResponse saveApPortalConfigWithOptions(SaveApPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApPortalConfigShrinkRequest request = new SaveApPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apConfigId)) {
            query.put("ApConfigId", request.apConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appAuthUrl)) {
            query.put("AppAuthUrl", request.appAuthUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSecret)) {
            query.put("AuthSecret", request.authSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientDownload)) {
            query.put("ClientDownload", request.clientDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUpload)) {
            query.put("ClientUpload", request.clientUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countdown)) {
            query.put("Countdown", request.countdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portalTypesShrink)) {
            query.put("PortalTypes", request.portalTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portalUrl)) {
            query.put("PortalUrl", request.portalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStamp)) {
            query.put("TimeStamp", request.timeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDownload)) {
            query.put("TotalDownload", request.totalDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalUpload)) {
            query.put("TotalUpload", request.totalUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAuthUrl)) {
            query.put("WebAuthUrl", request.webAuthUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            query.put("Whitelist", request.whitelist);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApPortalConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bcastRate)) {
            query.put("BcastRate", request.bcastRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beaconInt)) {
            query.put("BeaconInt", request.beaconInt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frag)) {
            query.put("Frag", request.frag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.htmode)) {
            query.put("Htmode", request.htmode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hwmode)) {
            query.put("Hwmode", request.hwmode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcastRate)) {
            query.put("McastRate", request.mcastRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mgmtRate)) {
            query.put("MgmtRate", request.mgmtRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minrate)) {
            query.put("Minrate", request.minrate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noscan)) {
            query.put("Noscan", request.noscan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.probereq)) {
            query.put("Probereq", request.probereq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireMode)) {
            query.put("RequireMode", request.requireMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rts)) {
            query.put("Rts", request.rts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortgi)) {
            query.put("Shortgi", request.shortgi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.txpower)) {
            query.put("Txpower", request.txpower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uapsd)) {
            query.put("Uapsd", request.uapsd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApRadioConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.acctPort)) {
            query.put("AcctPort", request.acctPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acctSecret)) {
            query.put("AcctSecret", request.acctSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acctServer)) {
            query.put("AcctServer", request.acctServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acctStatusServerWork)) {
            query.put("AcctStatusServerWork", request.acctStatusServerWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apAssetId)) {
            query.put("ApAssetId", request.apAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arpProxyEnable)) {
            query.put("ArpProxyEnable", request.arpProxyEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authCache)) {
            query.put("AuthCache", request.authCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authPort)) {
            query.put("AuthPort", request.authPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSecret)) {
            query.put("AuthSecret", request.authSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authServer)) {
            query.put("AuthServer", request.authServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authStatusServerWork)) {
            query.put("AuthStatusServerWork", request.authStatusServerWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cir)) {
            query.put("Cir", request.cir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cirStep)) {
            query.put("CirStep", request.cirStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cirType)) {
            query.put("CirType", request.cirType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cirUl)) {
            query.put("CirUl", request.cirUl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daeClient)) {
            query.put("DaeClient", request.daeClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daePort)) {
            query.put("DaePort", request.daePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daeSecret)) {
            query.put("DaeSecret", request.daeSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassocLowAck)) {
            query.put("DisassocLowAck", request.disassocLowAck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassocWeakRssi)) {
            query.put("DisassocWeakRssi", request.disassocWeakRssi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicVlan)) {
            query.put("DynamicVlan", request.dynamicVlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encKey)) {
            query.put("EncKey", request.encKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryption)) {
            query.put("Encryption", request.encryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fourthAuthPort)) {
            query.put("FourthAuthPort", request.fourthAuthPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fourthAuthSecret)) {
            query.put("FourthAuthSecret", request.fourthAuthSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fourthAuthServer)) {
            query.put("FourthAuthServer", request.fourthAuthServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ftOverDs)) {
            query.put("FtOverDs", request.ftOverDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidden)) {
            query.put("Hidden", request.hidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ieee80211r)) {
            query.put("Ieee80211r", request.ieee80211r);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ieee80211w)) {
            query.put("Ieee80211w", request.ieee80211w);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreWeakProbe)) {
            query.put("IgnoreWeakProbe", request.ignoreWeakProbe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolate)) {
            query.put("Isolate", request.isolate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liteEffect)) {
            query.put("LiteEffect", request.liteEffect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInactivity)) {
            query.put("MaxInactivity", request.maxInactivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxassoc)) {
            query.put("Maxassoc", request.maxassoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobilityDomain)) {
            query.put("MobilityDomain", request.mobilityDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multicastForward)) {
            query.put("MulticastForward", request.multicastForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasid)) {
            query.put("Nasid", request.nasid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ndProxyWork)) {
            query.put("NdProxyWork", request.ndProxyWork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownip)) {
            query.put("Ownip", request.ownip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.radioIndex)) {
            query.put("RadioIndex", request.radioIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctPort)) {
            query.put("SecondaryAcctPort", request.secondaryAcctPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctSecret)) {
            query.put("SecondaryAcctSecret", request.secondaryAcctSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctServer)) {
            query.put("SecondaryAcctServer", request.secondaryAcctServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthPort)) {
            query.put("SecondaryAuthPort", request.secondaryAuthPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthSecret)) {
            query.put("SecondaryAuthSecret", request.secondaryAuthSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthServer)) {
            query.put("SecondaryAuthServer", request.secondaryAuthServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendConfigToAp)) {
            query.put("SendConfigToAp", request.sendConfigToAp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortPreamble)) {
            query.put("ShortPreamble", request.shortPreamble);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssid)) {
            query.put("Ssid", request.ssid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssidLb)) {
            query.put("SsidLb", request.ssidLb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdAuthPort)) {
            query.put("ThirdAuthPort", request.thirdAuthPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdAuthSecret)) {
            query.put("ThirdAuthSecret", request.thirdAuthSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdAuthServer)) {
            query.put("ThirdAuthServer", request.thirdAuthServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlanDhcp)) {
            query.put("VlanDhcp", request.vlanDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmm)) {
            query.put("Wmm", request.wmm);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.addStyle)) {
            query.put("AddStyle", request.addStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apAssetId)) {
            query.put("ApAssetId", request.apAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appData)) {
            query.put("AppData", request.appData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdAppName)) {
            query.put("ThirdAppName", request.thirdAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApThirdApp"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApThirdAppResponse());
    }

    public SaveApThirdAppResponse saveApThirdApp(SaveApThirdAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApThirdAppWithOptions(request, runtime);
    }

    public SaveApgroupBasicConfigResponse saveApgroupBasicConfigWithOptions(SaveApgroupBasicConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dai)) {
            query.put("Dai", request.dai);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.echoInt)) {
            query.put("EchoInt", request.echoInt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failover)) {
            query.put("Failover", request.failover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insecureAllowed)) {
            query.put("InsecureAllowed", request.insecureAllowed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isConfigStrongConsistency)) {
            query.put("IsConfigStrongConsistency", request.isConfigStrongConsistency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanIp)) {
            query.put("LanIp", request.lanIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanMask)) {
            query.put("LanMask", request.lanMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lanStatus)) {
            query.put("LanStatus", request.lanStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logIp)) {
            query.put("LogIp", request.logIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            query.put("LogLevel", request.logLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentApgroupId)) {
            query.put("ParentApgroupId", request.parentApgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwd)) {
            query.put("Passwd", request.passwd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            query.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scan)) {
            query.put("Scan", request.scan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenServer)) {
            query.put("TokenServer", request.tokenServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpn)) {
            query.put("Vpn", request.vpn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workMode)) {
            query.put("WorkMode", request.workMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApgroupBasicConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApgroupBasicConfigResponse());
    }

    public SaveApgroupBasicConfigResponse saveApgroupBasicConfig(SaveApgroupBasicConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApgroupBasicConfigWithOptions(request, runtime);
    }

    public SaveApgroupPortalConfigResponse saveApgroupPortalConfigWithOptions(SaveApgroupPortalConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveApgroupPortalConfigShrinkRequest request = new SaveApgroupPortalConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portalTypes)) {
            request.portalTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portalTypes, "PortalTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appAuthUrl)) {
            query.put("AppAuthUrl", request.appAuthUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSecret)) {
            query.put("AuthSecret", request.authSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkUrl)) {
            query.put("CheckUrl", request.checkUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientDownload)) {
            query.put("ClientDownload", request.clientDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUpload)) {
            query.put("ClientUpload", request.clientUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countdown)) {
            query.put("Countdown", request.countdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portalTypesShrink)) {
            query.put("PortalTypes", request.portalTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portalUrl)) {
            query.put("PortalUrl", request.portalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStamp)) {
            query.put("TimeStamp", request.timeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalDownload)) {
            query.put("TotalDownload", request.totalDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalUpload)) {
            query.put("TotalUpload", request.totalUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webAuthUrl)) {
            query.put("WebAuthUrl", request.webAuthUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            query.put("Whitelist", request.whitelist);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApgroupPortalConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.acctPort)) {
            query.put("AcctPort", request.acctPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acctSecret)) {
            query.put("AcctSecret", request.acctSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acctServer)) {
            query.put("AcctServer", request.acctServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apgroupId)) {
            query.put("ApgroupId", request.apgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authCache)) {
            query.put("AuthCache", request.authCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authPort)) {
            query.put("AuthPort", request.authPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSecret)) {
            query.put("AuthSecret", request.authSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authServer)) {
            query.put("AuthServer", request.authServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.binding)) {
            query.put("Binding", request.binding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cir)) {
            query.put("Cir", request.cir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daeClient)) {
            query.put("DaeClient", request.daeClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daePort)) {
            query.put("DaePort", request.daePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daeSecret)) {
            query.put("DaeSecret", request.daeSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassocLowAck)) {
            query.put("DisassocLowAck", request.disassocLowAck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disassocWeakRssi)) {
            query.put("DisassocWeakRssi", request.disassocWeakRssi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicVlan)) {
            query.put("DynamicVlan", request.dynamicVlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effect)) {
            query.put("Effect", request.effect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encKey)) {
            query.put("EncKey", request.encKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryption)) {
            query.put("Encryption", request.encryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidden)) {
            query.put("Hidden", request.hidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ieee80211w)) {
            query.put("Ieee80211w", request.ieee80211w);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreWeakProbe)) {
            query.put("IgnoreWeakProbe", request.ignoreWeakProbe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolate)) {
            query.put("Isolate", request.isolate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liteEffect)) {
            query.put("LiteEffect", request.liteEffect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInactivity)) {
            query.put("MaxInactivity", request.maxInactivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxassoc)) {
            query.put("Maxassoc", request.maxassoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multicastForward)) {
            query.put("MulticastForward", request.multicastForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasid)) {
            query.put("Nasid", request.nasid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSsid)) {
            query.put("NewSsid", request.newSsid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownip)) {
            query.put("Ownip", request.ownip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctPort)) {
            query.put("SecondaryAcctPort", request.secondaryAcctPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctSecret)) {
            query.put("SecondaryAcctSecret", request.secondaryAcctSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAcctServer)) {
            query.put("SecondaryAcctServer", request.secondaryAcctServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthPort)) {
            query.put("SecondaryAuthPort", request.secondaryAuthPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthSecret)) {
            query.put("SecondaryAuthSecret", request.secondaryAuthSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryAuthServer)) {
            query.put("SecondaryAuthServer", request.secondaryAuthServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortPreamble)) {
            query.put("ShortPreamble", request.shortPreamble);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssid)) {
            query.put("Ssid", request.ssid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssidLb)) {
            query.put("SsidLb", request.ssidLb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlanDhcp)) {
            query.put("VlanDhcp", request.vlanDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmm)) {
            query.put("Wmm", request.wmm);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApgroupSsidConfig"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apAreaName)) {
            query.put("ApAreaName", request.apAreaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apBuildingName)) {
            query.put("ApBuildingName", request.apBuildingName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apCampusName)) {
            query.put("ApCampusName", request.apCampusName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apCityName)) {
            query.put("ApCityName", request.apCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apFloor)) {
            query.put("ApFloor", request.apFloor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apGroup)) {
            query.put("ApGroup", request.apGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apName)) {
            query.put("ApName", request.apName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apNationName)) {
            query.put("ApNationName", request.apNationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apProvinceName)) {
            query.put("ApProvinceName", request.apProvinceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apUnitId)) {
            query.put("ApUnitId", request.apUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apUnitName)) {
            query.put("ApUnitName", request.apUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lat)) {
            query.put("Lat", request.lat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lng)) {
            query.put("Lng", request.lng);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApAddress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.apMac)) {
            query.put("ApMac", request.apMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApName"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetApgroupId)) {
            query.put("AssetApgroupId", request.assetApgroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            query.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            query.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useFor)) {
            query.put("UseFor", request.useFor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRegisterApAsset"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("Devices", request.devices);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
