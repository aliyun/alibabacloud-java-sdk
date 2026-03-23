// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118;

import com.aliyun.tea.*;
import com.aliyun.cloudwifi_pop20191118.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @param tmpReq AddApListToApgroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddApListToApgroupResponse
     */
    public AddApListToApgroupResponse addApListToApgroupWithOptions(AddApListToApgroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request AddApListToApgroupRequest
     * @return AddApListToApgroupResponse
     */
    public AddApListToApgroupResponse addApListToApgroup(AddApListToApgroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApListToApgroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备的三方app</p>
     * 
     * @param request DelApThirdAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelApThirdAppResponse
     */
    public DelApThirdAppResponse delApThirdAppWithOptions(DelApThirdAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>删除设备的三方app</p>
     * 
     * @param request DelApThirdAppRequest
     * @return DelApThirdAppResponse
     */
    public DelApThirdAppResponse delApThirdApp(DelApThirdAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delApThirdAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteApSsidConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApSsidConfigResponse
     */
    public DeleteApSsidConfigResponse deleteApSsidConfigWithOptions(DeleteApSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteApSsidConfigRequest
     * @return DeleteApSsidConfigResponse
     */
    public DeleteApSsidConfigResponse deleteApSsidConfig(DeleteApSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApSsidConfigWithOptions(request, runtime);
    }

    /**
     * @param request DeleteApgroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApgroupConfigResponse
     */
    public DeleteApgroupConfigResponse deleteApgroupConfigWithOptions(DeleteApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteApgroupConfigRequest
     * @return DeleteApgroupConfigResponse
     */
    public DeleteApgroupConfigResponse deleteApgroupConfig(DeleteApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApgroupConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除AP组上的SSID</p>
     * 
     * @param request DeleteApgroupSsidConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApgroupSsidConfigResponse
     */
    public DeleteApgroupSsidConfigResponse deleteApgroupSsidConfigWithOptions(DeleteApgroupSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>删除AP组上的SSID</p>
     * 
     * @param request DeleteApgroupSsidConfigRequest
     * @return DeleteApgroupSsidConfigResponse
     */
    public DeleteApgroupSsidConfigResponse deleteApgroupSsidConfig(DeleteApgroupSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApgroupSsidConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备组的三方app</p>
     * 
     * @param request DeleteApgroupThirdAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApgroupThirdAppResponse
     */
    public DeleteApgroupThirdAppResponse deleteApgroupThirdAppWithOptions(DeleteApgroupThirdAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>删除设备组的三方app</p>
     * 
     * @param request DeleteApgroupThirdAppRequest
     * @return DeleteApgroupThirdAppResponse
     */
    public DeleteApgroupThirdAppResponse deleteApgroupThirdApp(DeleteApgroupThirdAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApgroupThirdAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteNetDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetDeviceInfoResponse
     */
    public DeleteNetDeviceInfoResponse deleteNetDeviceInfoWithOptions(DeleteNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteNetDeviceInfoRequest
     * @return DeleteNetDeviceInfoResponse
     */
    public DeleteNetDeviceInfoResponse deleteNetDeviceInfo(DeleteNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置设备组的三方app</p>
     * 
     * @param request EditApgroupThirdAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditApgroupThirdAppResponse
     */
    public EditApgroupThirdAppResponse editApgroupThirdAppWithOptions(EditApgroupThirdAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>配置设备组的三方app</p>
     * 
     * @param request EditApgroupThirdAppRequest
     * @return EditApgroupThirdAppResponse
     */
    public EditApgroupThirdAppResponse editApgroupThirdApp(EditApgroupThirdAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editApgroupThirdAppWithOptions(request, runtime);
    }

    /**
     * @param request EffectApConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EffectApConfigResponse
     */
    public EffectApConfigResponse effectApConfigWithOptions(EffectApConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request EffectApConfigRequest
     * @return EffectApConfigResponse
     */
    public EffectApConfigResponse effectApConfig(EffectApConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectApConfigWithOptions(request, runtime);
    }

    /**
     * @param request EffectApgroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EffectApgroupConfigResponse
     */
    public EffectApgroupConfigResponse effectApgroupConfigWithOptions(EffectApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request EffectApgroupConfigRequest
     * @return EffectApgroupConfigResponse
     */
    public EffectApgroupConfigResponse effectApgroupConfig(EffectApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectApgroupConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询蚂蚁环境终端状态</p>
     * 
     * @param request GetAntStaStatusByMacRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAntStaStatusByMacResponse
     */
    public GetAntStaStatusByMacResponse getAntStaStatusByMacWithOptions(GetAntStaStatusByMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAntStaStatusByMac"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAntStaStatusByMacResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询蚂蚁环境终端状态</p>
     * 
     * @param request GetAntStaStatusByMacRequest
     * @return GetAntStaStatusByMacResponse
     */
    public GetAntStaStatusByMacResponse getAntStaStatusByMac(GetAntStaStatusByMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAntStaStatusByMacWithOptions(request, runtime);
    }

    /**
     * @param request GetApAddressByMacRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApAddressByMacResponse
     */
    public GetApAddressByMacResponse getApAddressByMacWithOptions(GetApAddressByMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApAddressByMacRequest
     * @return GetApAddressByMacResponse
     */
    public GetApAddressByMacResponse getApAddressByMac(GetApAddressByMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApAddressByMacWithOptions(request, runtime);
    }

    /**
     * @param request GetApAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApAssetResponse
     */
    public GetApAssetResponse getApAssetWithOptions(GetApAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApAssetRequest
     * @return GetApAssetResponse
     */
    public GetApAssetResponse getApAsset(GetApAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApAssetWithOptions(request, runtime);
    }

    /**
     * @param request GetApDetailStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApDetailStatusResponse
     */
    public GetApDetailStatusResponse getApDetailStatusWithOptions(GetApDetailStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApDetailStatusRequest
     * @return GetApDetailStatusResponse
     */
    public GetApDetailStatusResponse getApDetailStatus(GetApDetailStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApDetailStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetApDetailedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApDetailedConfigResponse
     */
    public GetApDetailedConfigResponse getApDetailedConfigWithOptions(GetApDetailedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApDetailedConfigRequest
     * @return GetApDetailedConfigResponse
     */
    public GetApDetailedConfigResponse getApDetailedConfig(GetApDetailedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApDetailedConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetApInfoFromPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApInfoFromPoolResponse
     */
    public GetApInfoFromPoolResponse getApInfoFromPoolWithOptions(GetApInfoFromPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApInfoFromPoolRequest
     * @return GetApInfoFromPoolResponse
     */
    public GetApInfoFromPoolResponse getApInfoFromPool(GetApInfoFromPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApInfoFromPoolWithOptions(request, runtime);
    }

    /**
     * @param request GetApRunHistoryTimeSerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApRunHistoryTimeSerResponse
     */
    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSerWithOptions(GetApRunHistoryTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApRunHistoryTimeSerRequest
     * @return GetApRunHistoryTimeSerResponse
     */
    public GetApRunHistoryTimeSerResponse getApRunHistoryTimeSer(GetApRunHistoryTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApRunHistoryTimeSerWithOptions(request, runtime);
    }

    /**
     * @param request GetApStatusByGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApStatusByGroupIdResponse
     */
    public GetApStatusByGroupIdResponse getApStatusByGroupIdWithOptions(GetApStatusByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApStatusByGroupIdRequest
     * @return GetApStatusByGroupIdResponse
     */
    public GetApStatusByGroupIdResponse getApStatusByGroupId(GetApStatusByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApStatusByGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据组id查组的基本信息（名称之类）</p>
     * 
     * @param request GetApgroupConfigByIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApgroupConfigByIdentityResponse
     */
    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentityWithOptions(GetApgroupConfigByIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>根据组id查组的基本信息（名称之类）</p>
     * 
     * @param request GetApgroupConfigByIdentityRequest
     * @return GetApgroupConfigByIdentityResponse
     */
    public GetApgroupConfigByIdentityResponse getApgroupConfigByIdentity(GetApgroupConfigByIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupConfigByIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备组的完整配置(含ssid、portal等）</p>
     * 
     * @param request GetApgroupDetailedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApgroupDetailedConfigResponse
     */
    public GetApgroupDetailedConfigResponse getApgroupDetailedConfigWithOptions(GetApgroupDetailedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>查询设备组的完整配置(含ssid、portal等）</p>
     * 
     * @param request GetApgroupDetailedConfigRequest
     * @return GetApgroupDetailedConfigResponse
     */
    public GetApgroupDetailedConfigResponse getApgroupDetailedConfig(GetApgroupDetailedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupDetailedConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetApgroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApgroupIdResponse
     */
    public GetApgroupIdResponse getApgroupIdWithOptions(GetApgroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApgroupIdRequest
     * @return GetApgroupIdResponse
     */
    public GetApgroupIdResponse getApgroupId(GetApgroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupIdWithOptions(request, runtime);
    }

    /**
     * @param request GetApgroupSsidConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApgroupSsidConfigResponse
     */
    public GetApgroupSsidConfigResponse getApgroupSsidConfigWithOptions(GetApgroupSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetApgroupSsidConfigRequest
     * @return GetApgroupSsidConfigResponse
     */
    public GetApgroupSsidConfigResponse getApgroupSsidConfig(GetApgroupSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApgroupSsidConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询批量任务的执行进度</p>
     * 
     * @param request GetBatchTaskProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTaskProgressResponse
     */
    public GetBatchTaskProgressResponse getBatchTaskProgressWithOptions(GetBatchTaskProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>查询批量任务的执行进度</p>
     * 
     * @param request GetBatchTaskProgressRequest
     * @return GetBatchTaskProgressResponse
     */
    public GetBatchTaskProgressResponse getBatchTaskProgress(GetBatchTaskProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTaskProgressWithOptions(request, runtime);
    }

    /**
     * @param request GetGroupMiscAggTimeSerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupMiscAggTimeSerResponse
     */
    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSerWithOptions(GetGroupMiscAggTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetGroupMiscAggTimeSerRequest
     * @return GetGroupMiscAggTimeSerResponse
     */
    public GetGroupMiscAggTimeSerResponse getGroupMiscAggTimeSer(GetGroupMiscAggTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupMiscAggTimeSerWithOptions(request, runtime);
    }

    /**
     * @param request GetNetDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetDeviceInfoResponse
     */
    public GetNetDeviceInfoResponse getNetDeviceInfoWithOptions(GetNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetNetDeviceInfoRequest
     * @return GetNetDeviceInfoResponse
     */
    public GetNetDeviceInfoResponse getNetDeviceInfo(GetNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetDeviceInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetNetDeviceInfoWithSizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetDeviceInfoWithSizeResponse
     */
    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSizeWithOptions(GetNetDeviceInfoWithSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetNetDeviceInfoWithSizeRequest
     * @return GetNetDeviceInfoWithSizeResponse
     */
    public GetNetDeviceInfoWithSizeResponse getNetDeviceInfoWithSize(GetNetDeviceInfoWithSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetDeviceInfoWithSizeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取体验加PV/UV信息</p>
     * 
     * @param request GetPageVisitDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPageVisitDataResponse
     */
    public GetPageVisitDataResponse getPageVisitDataWithOptions(GetPageVisitDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPageVisitData"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPageVisitDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取体验加PV/UV信息</p>
     * 
     * @param request GetPageVisitDataRequest
     * @return GetPageVisitDataResponse
     */
    public GetPageVisitDataResponse getPageVisitData(GetPageVisitDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPageVisitDataWithOptions(request, runtime);
    }

    /**
     * @param request GetRadioRunHistoryTimeSerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRadioRunHistoryTimeSerResponse
     */
    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSerWithOptions(GetRadioRunHistoryTimeSerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetRadioRunHistoryTimeSerRequest
     * @return GetRadioRunHistoryTimeSerResponse
     */
    public GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSer(GetRadioRunHistoryTimeSerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRadioRunHistoryTimeSerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端设备的详细状态</p>
     * 
     * @param request GetStaDetailedStatusByMacRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStaDetailedStatusByMacResponse
     */
    public GetStaDetailedStatusByMacResponse getStaDetailedStatusByMacWithOptions(GetStaDetailedStatusByMacRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStaDetailedStatusByMac"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStaDetailedStatusByMacResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端设备的详细状态</p>
     * 
     * @param request GetStaDetailedStatusByMacRequest
     * @return GetStaDetailedStatusByMacResponse
     */
    public GetStaDetailedStatusByMacResponse getStaDetailedStatusByMac(GetStaDetailedStatusByMacRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStaDetailedStatusByMacWithOptions(request, runtime);
    }

    /**
     * @param request GetStaStatusListByApRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStaStatusListByApResponse
     */
    public GetStaStatusListByApResponse getStaStatusListByApWithOptions(GetStaStatusListByApRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetStaStatusListByApRequest
     * @return GetStaStatusListByApResponse
     */
    public GetStaStatusListByApResponse getStaStatusListByAp(GetStaStatusListByApRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStaStatusListByApWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>判断是否刑天的业务</p>
     * 
     * @param request JudgeXingTianBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JudgeXingTianBusinessResponse
     */
    public JudgeXingTianBusinessResponse judgeXingTianBusinessWithOptions(JudgeXingTianBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realmId)) {
            query.put("RealmId", request.realmId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JudgeXingTianBusiness"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JudgeXingTianBusinessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>判断是否刑天的业务</p>
     * 
     * @param request JudgeXingTianBusinessRequest
     * @return JudgeXingTianBusinessResponse
     */
    public JudgeXingTianBusinessResponse judgeXingTianBusiness(JudgeXingTianBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.judgeXingTianBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>踢除蚂蚁环境的终端</p>
     * 
     * @param request KickAntStaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KickAntStaResponse
     */
    public KickAntStaResponse kickAntStaWithOptions(KickAntStaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KickAntSta"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KickAntStaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>踢除蚂蚁环境的终端</p>
     * 
     * @param request KickAntStaRequest
     * @return KickAntStaResponse
     */
    public KickAntStaResponse kickAntSta(KickAntStaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kickAntStaWithOptions(request, runtime);
    }

    /**
     * @param request KickStaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KickStaResponse
     */
    public KickStaResponse kickStaWithOptions(KickStaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request KickStaRequest
     * @return KickStaResponse
     */
    public KickStaResponse kickSta(KickStaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kickStaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据组id查组内第一级子组</p>
     * 
     * @param request ListApgroupDescendantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApgroupDescendantResponse
     */
    public ListApgroupDescendantResponse listApgroupDescendantWithOptions(ListApgroupDescendantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>根据组id查组内第一级子组</p>
     * 
     * @param request ListApgroupDescendantRequest
     * @return ListApgroupDescendantResponse
     */
    public ListApgroupDescendantResponse listApgroupDescendant(ListApgroupDescendantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApgroupDescendantWithOptions(request, runtime);
    }

    /**
     * @param request ListJobOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobOrdersResponse
     */
    public ListJobOrdersResponse listJobOrdersWithOptions(ListJobOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ListJobOrdersRequest
     * @return ListJobOrdersResponse
     */
    public ListJobOrdersResponse listJobOrders(ListJobOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobOrdersWithOptions(request, runtime);
    }

    /**
     * @param request ListJobOrdersWithSizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobOrdersWithSizeResponse
     */
    public ListJobOrdersWithSizeResponse listJobOrdersWithSizeWithOptions(ListJobOrdersWithSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ListJobOrdersWithSizeRequest
     * @return ListJobOrdersWithSizeResponse
     */
    public ListJobOrdersWithSizeResponse listJobOrdersWithSize(ListJobOrdersWithSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobOrdersWithSizeWithOptions(request, runtime);
    }

    /**
     * @param request NewApgroupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NewApgroupConfigResponse
     */
    public NewApgroupConfigResponse newApgroupConfigWithOptions(NewApgroupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request NewApgroupConfigRequest
     * @return NewApgroupConfigResponse
     */
    public NewApgroupConfigResponse newApgroupConfig(NewApgroupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newApgroupConfigWithOptions(request, runtime);
    }

    /**
     * @param tmpReq NewJobOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NewJobOrderResponse
     */
    public NewJobOrderResponse newJobOrderWithOptions(NewJobOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request NewJobOrderRequest
     * @return NewJobOrderResponse
     */
    public NewJobOrderResponse newJobOrder(NewJobOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newJobOrderWithOptions(request, runtime);
    }

    /**
     * @param request NewNetDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NewNetDeviceInfoResponse
     */
    public NewNetDeviceInfoResponse newNetDeviceInfoWithOptions(NewNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request NewNetDeviceInfoRequest
     * @return NewNetDeviceInfoResponse
     */
    public NewNetDeviceInfoResponse newNetDeviceInfo(NewNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.newNetDeviceInfoWithOptions(request, runtime);
    }

    /**
     * @param request PutAppConfigAndSaveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutAppConfigAndSaveResponse
     */
    public PutAppConfigAndSaveResponse putAppConfigAndSaveWithOptions(PutAppConfigAndSaveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request PutAppConfigAndSaveRequest
     * @return PutAppConfigAndSaveResponse
     */
    public PutAppConfigAndSaveResponse putAppConfigAndSave(PutAppConfigAndSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putAppConfigAndSaveWithOptions(request, runtime);
    }

    /**
     * @param request QueryJobOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryJobOrderResponse
     */
    public QueryJobOrderResponse queryJobOrderWithOptions(QueryJobOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request QueryJobOrderRequest
     * @return QueryJobOrderResponse
     */
    public QueryJobOrderResponse queryJobOrder(QueryJobOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryJobOrderWithOptions(request, runtime);
    }

    /**
     * @param request RebootApRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootApResponse
     */
    public RebootApResponse rebootApWithOptions(RebootApRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request RebootApRequest
     * @return RebootApResponse
     */
    public RebootApResponse rebootAp(RebootApRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootApWithOptions(request, runtime);
    }

    /**
     * @param request RegisterApAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterApAssetResponse
     */
    public RegisterApAssetResponse registerApAssetWithOptions(RegisterApAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request RegisterApAssetRequest
     * @return RegisterApAssetResponse
     */
    public RegisterApAssetResponse registerApAsset(RegisterApAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerApAssetWithOptions(request, runtime);
    }

    /**
     * @param request RepairApRadioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RepairApRadioResponse
     */
    public RepairApRadioResponse repairApRadioWithOptions(RepairApRadioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request RepairApRadioRequest
     * @return RepairApRadioResponse
     */
    public RepairApRadioResponse repairApRadio(RepairApRadioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.repairApRadioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存设备的基本配置</p>
     * 
     * @param request SaveApBasicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApBasicConfigResponse
     */
    public SaveApBasicConfigResponse saveApBasicConfigWithOptions(SaveApBasicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>保存设备的基本配置</p>
     * 
     * @param request SaveApBasicConfigRequest
     * @return SaveApBasicConfigResponse
     */
    public SaveApBasicConfigResponse saveApBasicConfig(SaveApBasicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApBasicConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置设备的portal</p>
     * 
     * @param tmpReq SaveApPortalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApPortalConfigResponse
     */
    public SaveApPortalConfigResponse saveApPortalConfigWithOptions(SaveApPortalConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>配置设备的portal</p>
     * 
     * @param request SaveApPortalConfigRequest
     * @return SaveApPortalConfigResponse
     */
    public SaveApPortalConfigResponse saveApPortalConfig(SaveApPortalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApPortalConfigWithOptions(request, runtime);
    }

    /**
     * @param request SaveApRadioConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApRadioConfigResponse
     */
    public SaveApRadioConfigResponse saveApRadioConfigWithOptions(SaveApRadioConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SaveApRadioConfigRequest
     * @return SaveApRadioConfigResponse
     */
    public SaveApRadioConfigResponse saveApRadioConfig(SaveApRadioConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApRadioConfigWithOptions(request, runtime);
    }

    /**
     * @param request SaveApSsidConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApSsidConfigResponse
     */
    public SaveApSsidConfigResponse saveApSsidConfigWithOptions(SaveApSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SaveApSsidConfigRequest
     * @return SaveApSsidConfigResponse
     */
    public SaveApSsidConfigResponse saveApSsidConfig(SaveApSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApSsidConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置设备的三方app</p>
     * 
     * @param request SaveApThirdAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApThirdAppResponse
     */
    public SaveApThirdAppResponse saveApThirdAppWithOptions(SaveApThirdAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>配置设备的三方app</p>
     * 
     * @param request SaveApThirdAppRequest
     * @return SaveApThirdAppResponse
     */
    public SaveApThirdAppResponse saveApThirdApp(SaveApThirdAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApThirdAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存设备组的基本配置</p>
     * 
     * @param request SaveApgroupBasicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApgroupBasicConfigResponse
     */
    public SaveApgroupBasicConfigResponse saveApgroupBasicConfigWithOptions(SaveApgroupBasicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>保存设备组的基本配置</p>
     * 
     * @param request SaveApgroupBasicConfigRequest
     * @return SaveApgroupBasicConfigResponse
     */
    public SaveApgroupBasicConfigResponse saveApgroupBasicConfig(SaveApgroupBasicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApgroupBasicConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置设备组的portal</p>
     * 
     * @param tmpReq SaveApgroupPortalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApgroupPortalConfigResponse
     */
    public SaveApgroupPortalConfigResponse saveApgroupPortalConfigWithOptions(SaveApgroupPortalConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>配置设备组的portal</p>
     * 
     * @param request SaveApgroupPortalConfigRequest
     * @return SaveApgroupPortalConfigResponse
     */
    public SaveApgroupPortalConfigResponse saveApgroupPortalConfig(SaveApgroupPortalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApgroupPortalConfigWithOptions(request, runtime);
    }

    /**
     * @param request SaveApgroupSsidConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveApgroupSsidConfigResponse
     */
    public SaveApgroupSsidConfigResponse saveApgroupSsidConfigWithOptions(SaveApgroupSsidConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SaveApgroupSsidConfigRequest
     * @return SaveApgroupSsidConfigResponse
     */
    public SaveApgroupSsidConfigResponse saveApgroupSsidConfig(SaveApgroupSsidConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveApgroupSsidConfigWithOptions(request, runtime);
    }

    /**
     * @param request SetApAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApAddressResponse
     */
    public SetApAddressResponse setApAddressWithOptions(SetApAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SetApAddressRequest
     * @return SetApAddressResponse
     */
    public SetApAddressResponse setApAddress(SetApAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApAddressWithOptions(request, runtime);
    }

    /**
     * @param request SetApNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApNameResponse
     */
    public SetApNameResponse setApNameWithOptions(SetApNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SetApNameRequest
     * @return SetApNameResponse
     */
    public SetApNameResponse setApName(SetApNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注销AP设备</p>
     * 
     * @param request UnRegisterApAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnRegisterApAssetResponse
     */
    public UnRegisterApAssetResponse unRegisterApAssetWithOptions(UnRegisterApAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>注销AP设备</p>
     * 
     * @param request UnRegisterApAssetRequest
     * @return UnRegisterApAssetResponse
     */
    public UnRegisterApAssetResponse unRegisterApAsset(UnRegisterApAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unRegisterApAssetWithOptions(request, runtime);
    }

    /**
     * @param request UpdateNetDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetDeviceInfoResponse
     */
    public UpdateNetDeviceInfoResponse updateNetDeviceInfoWithOptions(UpdateNetDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateNetDeviceInfoRequest
     * @return UpdateNetDeviceInfoResponse
     */
    public UpdateNetDeviceInfoResponse updateNetDeviceInfo(UpdateNetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetDeviceInfoWithOptions(request, runtime);
    }
}
