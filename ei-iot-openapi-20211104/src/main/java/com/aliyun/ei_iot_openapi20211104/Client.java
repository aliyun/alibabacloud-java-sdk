// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104;

import com.aliyun.tea.*;
import com.aliyun.ei_iot_openapi20211104.models.*;
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
        this._endpoint = this.getEndpoint("ei-iot-openapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BindDeviceResponse bindDeviceWithOptions(BindDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.bizRequest))) {
            bodyFlat.put("BizRequest", request.bizRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDevice"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDeviceResponse());
    }

    public BindDeviceResponse bindDevice(BindDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDeviceWithOptions(request, runtime);
    }

    public BindDeviceOwnerByOuterIdResponse bindDeviceOwnerByOuterIdWithOptions(BindDeviceOwnerByOuterIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModel)) {
            body.put("DeviceModel", request.deviceModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerDeviceId)) {
            body.put("OuterDeviceId", request.outerDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDeviceOwnerByOuterId"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDeviceOwnerByOuterIdResponse());
    }

    public BindDeviceOwnerByOuterIdResponse bindDeviceOwnerByOuterId(BindDeviceOwnerByOuterIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDeviceOwnerByOuterIdWithOptions(request, runtime);
    }

    public GetCurrentCommandEventLogResponse getCurrentCommandEventLogWithOptions(GetCurrentCommandEventLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.bizRequest))) {
            bodyFlat.put("BizRequest", request.bizRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCurrentCommandEventLog"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCurrentCommandEventLogResponse());
    }

    public GetCurrentCommandEventLogResponse getCurrentCommandEventLog(GetCurrentCommandEventLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCurrentCommandEventLogWithOptions(request, runtime);
    }

    public GetTemplatePropertyValueByCodeResponse getTemplatePropertyValueByCodeWithOptions(GetTemplatePropertyValueByCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            body.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplatePropertyValueByCode"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplatePropertyValueByCodeResponse());
    }

    public GetTemplatePropertyValueByCodeResponse getTemplatePropertyValueByCode(GetTemplatePropertyValueByCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplatePropertyValueByCodeWithOptions(request, runtime);
    }

    public PageDeviceInfoListResponse pageDeviceInfoListWithOptions(PageDeviceInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.bizRequest))) {
            bodyFlat.put("BizRequest", request.bizRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageDeviceInfoList"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageDeviceInfoListResponse());
    }

    public PageDeviceInfoListResponse pageDeviceInfoList(PageDeviceInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageDeviceInfoListWithOptions(request, runtime);
    }

    public SyncDevicePropertyResponse syncDevicePropertyWithOptions(SyncDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.deviceDataPushRequest))) {
            bodyFlat.put("DeviceDataPushRequest", request.deviceDataPushRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDeviceProperty"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDevicePropertyResponse());
    }

    public SyncDevicePropertyResponse syncDeviceProperty(SyncDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncDevicePropertyWithOptions(request, runtime);
    }

    public UnRegisterDeviceResponse unRegisterDeviceWithOptions(UnRegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            query.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerDeviceId)) {
            query.put("OuterDeviceId", request.outerDeviceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRegisterDevice"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnRegisterDeviceResponse());
    }

    public UnRegisterDeviceResponse unRegisterDevice(UnRegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unRegisterDeviceWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.deviceUpdateRequest))) {
            bodyFlat.put("DeviceUpdateRequest", request.deviceUpdateRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevice"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public UpdateSpaceUnitResponse updateSpaceUnitWithOptions(UpdateSpaceUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.app))) {
            bodyFlat.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.bizRequest))) {
            bodyFlat.put("BizRequest", request.bizRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tenant))) {
            bodyFlat.put("Tenant", request.tenant);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSpaceUnit"),
            new TeaPair("version", "2021-11-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSpaceUnitResponse());
    }

    public UpdateSpaceUnitResponse updateSpaceUnit(UpdateSpaceUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceUnitWithOptions(request, runtime);
    }
}
