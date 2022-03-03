// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120;

import com.aliyun.tea.*;
import com.aliyun.iot20180120.models.*;
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
            new TeaPair("ap-northeast-2-pop", "iot.aliyuncs.com"),
            new TeaPair("ap-south-1", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-chengdu", "iot.aliyuncs.com"),
            new TeaPair("cn-edge-1", "iot.aliyuncs.com"),
            new TeaPair("cn-fujian", "iot.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-wuhan", "iot.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "iot.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "iot.aliyuncs.com"),
            new TeaPair("me-east-1", "iot.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "iot.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddDataForApiSourceResponse addDataForApiSourceWithOptions(AddDataForApiSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataForApiSource"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataForApiSourceResponse());
    }

    public AddDataForApiSourceResponse addDataForApiSource(AddDataForApiSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDataForApiSourceWithOptions(request, runtime);
    }

    public BatchAddDataForApiSourceResponse batchAddDataForApiSourceWithOptions(BatchAddDataForApiSourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchAddDataForApiSourceShrinkRequest request = new BatchAddDataForApiSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contentList)) {
            request.contentListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contentList, "ContentList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentListShrink)) {
            query.put("ContentList", request.contentListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddDataForApiSource"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddDataForApiSourceResponse());
    }

    public BatchAddDataForApiSourceResponse batchAddDataForApiSource(BatchAddDataForApiSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddDataForApiSourceWithOptions(request, runtime);
    }

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelationsWithOptions(BatchAddDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.device)) {
            query.put("Device", request.device);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddDeviceGroupRelations"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddDeviceGroupRelationsResponse());
    }

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddDeviceGroupRelationsWithOptions(request, runtime);
    }

    public BatchAddThingTopoResponse batchAddThingTopoWithOptions(BatchAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gwDeviceName)) {
            query.put("GwDeviceName", request.gwDeviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gwProductKey)) {
            query.put("GwProductKey", request.gwProductKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topoAddItem)) {
            query.put("TopoAddItem", request.topoAddItem);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddThingTopo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddThingTopoResponse());
    }

    public BatchAddThingTopoResponse batchAddThingTopo(BatchAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddThingTopoWithOptions(request, runtime);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriverWithOptions(BatchBindDeviceToEdgeInstanceWithDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindDeviceToEdgeInstanceWithDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindDeviceToEdgeInstanceWithDriverResponse());
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDeviceToEdgeInstanceWithDriverWithOptions(request, runtime);
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProjectWithOptions(BatchBindDevicesIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("Devices", request.devices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindDevicesIntoProject"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindDevicesIntoProjectResponse());
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDevicesIntoProjectWithOptions(request, runtime);
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProjectWithOptions(BatchBindProductsIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKeys)) {
            body.put("ProductKeys", request.productKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindProductsIntoProject"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindProductsIntoProjectResponse());
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindProductsIntoProjectWithOptions(request, runtime);
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNamesWithOptions(BatchCheckDeviceNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameList)) {
            query.put("DeviceNameList", request.deviceNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCheckDeviceNames"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCheckDeviceNamesResponse());
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNames(BatchCheckDeviceNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCheckDeviceNamesWithOptions(request, runtime);
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfigWithOptions(BatchClearEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchClearEdgeInstanceDeviceConfig"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchClearEdgeInstanceDeviceConfigResponse());
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchClearEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelationsWithOptions(BatchDeleteDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.device)) {
            query.put("Device", request.device);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDeviceGroupRelations"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDeviceGroupRelationsResponse());
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteDeviceGroupRelationsWithOptions(request, runtime);
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannelWithOptions(BatchDeleteEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelIds)) {
            query.put("ChannelIds", request.channelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteEdgeInstanceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteEdgeInstanceChannelResponse());
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatusWithOptions(BatchGetDeviceBindStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetDeviceBindStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetDeviceBindStatusResponse());
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceBindStatusWithOptions(request, runtime);
    }

    public BatchGetDeviceStateResponse batchGetDeviceStateWithOptions(BatchGetDeviceStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetDeviceState"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetDeviceStateResponse());
    }

    public BatchGetDeviceStateResponse batchGetDeviceState(BatchGetDeviceStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceStateWithOptions(request, runtime);
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriverWithOptions(BatchGetEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverIds)) {
            query.put("DriverIds", request.driverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeDriverResponse());
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriver(BatchGetEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannelWithOptions(BatchGetEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelIds)) {
            query.put("ChannelIds", request.channelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeInstanceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeInstanceChannelResponse());
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannelWithOptions(BatchGetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeInstanceDeviceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeInstanceDeviceChannelResponse());
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfigWithOptions(BatchGetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeInstanceDeviceConfig"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeInstanceDeviceConfigResponse());
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriverWithOptions(BatchGetEdgeInstanceDeviceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeInstanceDeviceDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeInstanceDeviceDriverResponse());
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigsWithOptions(BatchGetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverIds)) {
            query.put("DriverIds", request.driverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetEdgeInstanceDriverConfigs"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetEdgeInstanceDriverConfigsResponse());
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public BatchPubResponse batchPubWithOptions(BatchPubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageContent)) {
            query.put("MessageContent", request.messageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qos)) {
            query.put("Qos", request.qos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicShortName)) {
            query.put("TopicShortName", request.topicShortName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPub"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPubResponse());
    }

    public BatchPubResponse batchPub(BatchPubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchPubWithOptions(request, runtime);
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetailWithOptions(BatchQueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryDeviceDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryDeviceDetailResponse());
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryDeviceDetailWithOptions(request, runtime);
    }

    public BatchRegisterDeviceResponse batchRegisterDeviceWithOptions(BatchRegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRegisterDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRegisterDeviceResponse());
    }

    public BatchRegisterDeviceResponse batchRegisterDevice(BatchRegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithOptions(request, runtime);
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyIdWithOptions(BatchRegisterDeviceWithApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("ApplyId", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRegisterDeviceWithApplyId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRegisterDeviceWithApplyIdResponse());
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithApplyIdWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannelWithOptions(BatchSetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetEdgeInstanceDeviceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetEdgeInstanceDeviceChannelResponse());
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfigWithOptions(BatchSetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceConfigs)) {
            query.put("DeviceConfigs", request.deviceConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetEdgeInstanceDeviceConfig"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetEdgeInstanceDeviceConfigResponse());
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstanceWithOptions(BatchUnbindDeviceFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIds)) {
            query.put("IotIds", request.iotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindDeviceFromEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindDeviceFromEdgeInstanceResponse());
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindDeviceFromEdgeInstanceWithOptions(request, runtime);
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevicesWithOptions(BatchUnbindProjectDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("Devices", request.devices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindProjectDevices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindProjectDevicesResponse());
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectDevicesWithOptions(request, runtime);
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProductsWithOptions(BatchUnbindProjectProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKeys)) {
            body.put("ProductKeys", request.productKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindProjectProducts"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindProjectProductsResponse());
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectProductsWithOptions(request, runtime);
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNicknameWithOptions(BatchUpdateDeviceNicknameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceNicknameInfo)) {
            query.put("DeviceNicknameInfo", request.deviceNicknameInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateDeviceNickname"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateDeviceNicknameResponse());
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateDeviceNicknameWithOptions(request, runtime);
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstanceWithOptions(BindApplicationToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationVersion)) {
            query.put("ApplicationVersion", request.applicationVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindApplicationToEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindApplicationToEdgeInstanceResponse());
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindApplicationToEdgeInstanceWithOptions(request, runtime);
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstanceWithOptions(BindDriverToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDriverToEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDriverToEdgeInstanceResponse());
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDriverToEdgeInstanceWithOptions(request, runtime);
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstanceWithOptions(BindGatewayToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindGatewayToEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindGatewayToEdgeInstanceResponse());
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindGatewayToEdgeInstanceWithOptions(request, runtime);
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstanceWithOptions(BindRoleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindRoleToEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindRoleToEdgeInstanceResponse());
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindRoleToEdgeInstanceWithOptions(request, runtime);
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstanceWithOptions(BindSceneRuleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSceneRuleToEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSceneRuleToEdgeInstanceResponse());
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindSceneRuleToEdgeInstanceWithOptions(request, runtime);
    }

    public CancelJobResponse cancelJobWithOptions(CancelJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelJobResponse());
    }

    public CancelJobResponse cancelJob(CancelJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelJobWithOptions(request, runtime);
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJobWithOptions(CancelOTAStrategyByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOTAStrategyByJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOTAStrategyByJobResponse());
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTAStrategyByJobWithOptions(request, runtime);
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDeviceWithOptions(CancelOTATaskByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOTATaskByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOTATaskByDeviceResponse());
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByDeviceWithOptions(request, runtime);
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJobWithOptions(CancelOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cancelInProgressTask)) {
            query.put("CancelInProgressTask", request.cancelInProgressTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelNotifiedTask)) {
            query.put("CancelNotifiedTask", request.cancelNotifiedTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelQueuedTask)) {
            query.put("CancelQueuedTask", request.cancelQueuedTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelScheduledTask)) {
            query.put("CancelScheduledTask", request.cancelScheduledTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelUnconfirmedTask)) {
            query.put("CancelUnconfirmedTask", request.cancelUnconfirmedTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOTATaskByJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOTATaskByJobResponse());
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJob(CancelOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByJobWithOptions(request, runtime);
    }

    public CancelReleaseProductResponse cancelReleaseProductWithOptions(CancelReleaseProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelReleaseProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelReleaseProductResponse());
    }

    public CancelReleaseProductResponse cancelReleaseProduct(CancelReleaseProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelReleaseProductWithOptions(request, runtime);
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigsWithOptions(ClearEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearEdgeInstanceDriverConfigs"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearEdgeInstanceDriverConfigsResponse());
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public CloseDeviceTunnelResponse closeDeviceTunnelWithOptions(CloseDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tunnelId)) {
            query.put("TunnelId", request.tunnelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseDeviceTunnelResponse());
    }

    public CloseDeviceTunnelResponse closeDeviceTunnel(CloseDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeDeviceTunnelWithOptions(request, runtime);
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeploymentWithOptions(CloseEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseEdgeInstanceDeployment"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseEdgeInstanceDeploymentResponse());
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public ConfirmOTATaskResponse confirmOTATaskWithOptions(ConfirmOTATaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmOTATask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmOTATaskResponse());
    }

    public ConfirmOTATaskResponse confirmOTATask(ConfirmOTATaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmOTATaskWithOptions(request, runtime);
    }

    public CopyThingModelResponse copyThingModelWithOptions(CopyThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceModelVersion)) {
            query.put("SourceModelVersion", request.sourceModelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProductKey)) {
            query.put("SourceProductKey", request.sourceProductKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProductKey)) {
            query.put("TargetProductKey", request.targetProductKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyThingModelResponse());
    }

    public CopyThingModelResponse copyThingModel(CopyThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyThingModelWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelationWithOptions(CreateConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroupSubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupSubscribeRelationResponse());
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public CreateDataAPIServiceResponse createDataAPIServiceWithOptions(CreateDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            body.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originSql)) {
            body.put("OriginSql", request.originSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestParam)) {
            body.put("RequestParam", request.requestParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseParam)) {
            body.put("ResponseParam", request.responseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateSql)) {
            body.put("TemplateSql", request.templateSql);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataAPIService"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataAPIServiceResponse());
    }

    public CreateDataAPIServiceResponse createDataAPIService(CreateDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataAPIServiceWithOptions(request, runtime);
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJobWithOptions(CreateDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            body.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAliyunId)) {
            body.put("TargetAliyunId", request.targetAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceConfig)) {
            body.put("TargetInstanceConfig", request.targetInstanceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUid)) {
            body.put("TargetUid", request.targetUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceDistributeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceDistributeJobResponse());
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJob(CreateDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceDistributeJobWithOptions(request, runtime);
    }

    public CreateDeviceDynamicGroupResponse createDeviceDynamicGroupWithOptions(CreateDeviceDynamicGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicGroupExpression)) {
            query.put("DynamicGroupExpression", request.dynamicGroupExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDesc)) {
            query.put("GroupDesc", request.groupDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceDynamicGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceDynamicGroupResponse());
    }

    public CreateDeviceDynamicGroupResponse createDeviceDynamicGroup(CreateDeviceDynamicGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceDynamicGroupWithOptions(request, runtime);
    }

    public CreateDeviceGroupResponse createDeviceGroupWithOptions(CreateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupDesc)) {
            query.put("GroupDesc", request.groupDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superGroupId)) {
            query.put("SuperGroupId", request.superGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceGroupResponse());
    }

    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceGroupWithOptions(request, runtime);
    }

    public CreateDeviceTunnelResponse createDeviceTunnelWithOptions(CreateDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udi)) {
            query.put("Udi", request.udi);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceTunnelResponse());
    }

    public CreateDeviceTunnelResponse createDeviceTunnel(CreateDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceTunnelWithOptions(request, runtime);
    }

    public CreateEdgeDriverResponse createEdgeDriverWithOptions(CreateEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuArch)) {
            query.put("CpuArch", request.cpuArch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverName)) {
            query.put("DriverName", request.driverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverProtocol)) {
            query.put("DriverProtocol", request.driverProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBuiltIn)) {
            query.put("IsBuiltIn", request.isBuiltIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            query.put("Runtime", request.runtime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeDriverResponse());
    }

    public CreateEdgeDriverResponse createEdgeDriver(CreateEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverWithOptions(request, runtime);
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersionWithOptions(CreateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argument)) {
            query.put("Argument", request.argument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configCheckRule)) {
            query.put("ConfigCheckRule", request.configCheckRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerConfig)) {
            query.put("ContainerConfig", request.containerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverConfig)) {
            query.put("DriverConfig", request.driverConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeVersion)) {
            query.put("EdgeVersion", request.edgeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceConfig)) {
            query.put("SourceConfig", request.sourceConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeDriverVersionResponse());
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersion(CreateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverVersionWithOptions(request, runtime);
    }

    public CreateEdgeInstanceResponse createEdgeInstanceWithOptions(CreateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeInstanceResponse());
    }

    public CreateEdgeInstanceResponse createEdgeInstance(CreateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceWithOptions(request, runtime);
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannelWithOptions(CreateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            query.put("ChannelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            query.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeInstanceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeInstanceChannelResponse());
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceChannelWithOptions(request, runtime);
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeploymentWithOptions(CreateEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeInstanceDeployment"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeInstanceDeploymentResponse());
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public CreateEdgeInstanceMessageRoutingResponse createEdgeInstanceMessageRoutingWithOptions(CreateEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceData)) {
            query.put("SourceData", request.sourceData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetData)) {
            query.put("TargetData", request.targetData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIotHubQos)) {
            query.put("TargetIotHubQos", request.targetIotHubQos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicFilter)) {
            query.put("TopicFilter", request.topicFilter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeInstanceMessageRouting"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeInstanceMessageRoutingResponse());
    }

    public CreateEdgeInstanceMessageRoutingResponse createEdgeInstanceMessageRouting(CreateEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddressWithOptions(CreateEdgeOssPreSignedAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceVersion)) {
            query.put("ResourceVersion", request.resourceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeOssPreSignedAddress"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeOssPreSignedAddressResponse());
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeOssPreSignedAddressWithOptions(request, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateJobShrinkRequest request = new CreateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobFile)) {
            request.jobFileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobFile, "JobFile", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rolloutConfig)) {
            request.rolloutConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rolloutConfig, "RolloutConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targetConfig)) {
            request.targetConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targetConfig, "TargetConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timeoutConfig)) {
            request.timeoutConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timeoutConfig, "TimeoutConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDocument)) {
            query.put("JobDocument", request.jobDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFileShrink)) {
            query.put("JobFile", request.jobFileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolloutConfigShrink)) {
            query.put("RolloutConfig", request.rolloutConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTime)) {
            query.put("ScheduledTime", request.scheduledTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetConfigShrink)) {
            query.put("TargetConfig", request.targetConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutConfigShrink)) {
            query.put("TimeoutConfig", request.timeoutConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTaskWithOptions(CreateLoRaNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfo)) {
            query.put("DeviceInfo", request.deviceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoRaNodesTask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoRaNodesTaskResponse());
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTask(CreateLoRaNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoRaNodesTaskWithOptions(request, runtime);
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJobWithOptions(CreateOTADynamicUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadProtocol)) {
            query.put("DownloadProtocol", request.downloadProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMode)) {
            query.put("DynamicMode", request.dynamicMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPerMinute)) {
            query.put("MaximumPerMinute", request.maximumPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiModuleMode)) {
            query.put("MultiModuleMode", request.multiModuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needConfirm)) {
            query.put("NeedConfirm", request.needConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needPush)) {
            query.put("NeedPush", request.needPush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwriteMode)) {
            query.put("OverwriteMode", request.overwriteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryCount)) {
            query.put("RetryCount", request.retryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVersion)) {
            query.put("SrcVersion", request.srcVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOTADynamicUpgradeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOTADynamicUpgradeJobResponse());
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTADynamicUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAFirmwareResponse createOTAFirmwareWithOptions(CreateOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destVersion)) {
            query.put("DestVersion", request.destVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareDesc)) {
            query.put("FirmwareDesc", request.firmwareDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareName)) {
            query.put("FirmwareName", request.firmwareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareSign)) {
            query.put("FirmwareSign", request.firmwareSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareSize)) {
            query.put("FirmwareSize", request.firmwareSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareUrl)) {
            query.put("FirmwareUrl", request.firmwareUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiFiles)) {
            query.put("MultiFiles", request.multiFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needToVerify)) {
            query.put("NeedToVerify", request.needToVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signMethod)) {
            query.put("SignMethod", request.signMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVersion)) {
            query.put("SrcVersion", request.srcVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udi)) {
            query.put("Udi", request.udi);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOTAFirmware"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOTAFirmwareResponse());
    }

    public CreateOTAFirmwareResponse createOTAFirmware(CreateOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAFirmwareWithOptions(request, runtime);
    }

    public CreateOTAModuleResponse createOTAModuleWithOptions(CreateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOTAModule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOTAModuleResponse());
    }

    public CreateOTAModuleResponse createOTAModule(CreateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAModuleWithOptions(request, runtime);
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJobWithOptions(CreateOTAStaticUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnListFileUrl)) {
            query.put("DnListFileUrl", request.dnListFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadProtocol)) {
            query.put("DownloadProtocol", request.downloadProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayPercent)) {
            query.put("GrayPercent", request.grayPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPerMinute)) {
            query.put("MaximumPerMinute", request.maximumPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiModuleMode)) {
            query.put("MultiModuleMode", request.multiModuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needConfirm)) {
            query.put("NeedConfirm", request.needConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needPush)) {
            query.put("NeedPush", request.needPush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwriteMode)) {
            query.put("OverwriteMode", request.overwriteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryCount)) {
            query.put("RetryCount", request.retryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleFinishTime)) {
            query.put("ScheduleFinishTime", request.scheduleFinishTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVersion)) {
            query.put("SrcVersion", request.srcVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDeviceName)) {
            query.put("TargetDeviceName", request.targetDeviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSelection)) {
            query.put("TargetSelection", request.targetSelection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOTAStaticUpgradeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOTAStaticUpgradeJobResponse());
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAStaticUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJobWithOptions(CreateOTAVerifyJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadProtocol)) {
            query.put("DownloadProtocol", request.downloadProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needConfirm)) {
            query.put("NeedConfirm", request.needConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needPush)) {
            query.put("NeedPush", request.needPush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDeviceName)) {
            query.put("TargetDeviceName", request.targetDeviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutInMinutes)) {
            query.put("TimeoutInMinutes", request.timeoutInMinutes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOTAVerifyJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOTAVerifyJobResponse());
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJob(CreateOTAVerifyJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAVerifyJobWithOptions(request, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunCommodityCode)) {
            query.put("AliyunCommodityCode", request.aliyunCommodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryKey)) {
            query.put("CategoryKey", request.categoryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            query.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id2)) {
            query.put("Id2", request.id2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinPermissionId)) {
            query.put("JoinPermissionId", request.joinPermissionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishAuto)) {
            query.put("PublishAuto", request.publishAuto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateType)) {
            query.put("ValidateType", request.validateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
    }

    public CreateProductDistributeJobResponse createProductDistributeJobWithOptions(CreateProductDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAliyunId)) {
            query.put("TargetAliyunId", request.targetAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUid)) {
            query.put("TargetUid", request.targetUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductDistributeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductDistributeJobResponse());
    }

    public CreateProductDistributeJobResponse createProductDistributeJob(CreateProductDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductDistributeJobWithOptions(request, runtime);
    }

    public CreateProductTagsResponse createProductTagsWithOptions(CreateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTag)) {
            query.put("ProductTag", request.productTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductTagsResponse());
    }

    public CreateProductTagsResponse createProductTags(CreateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTagsWithOptions(request, runtime);
    }

    public CreateProductTopicResponse createProductTopicWithOptions(CreateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicShortName)) {
            query.put("TopicShortName", request.topicShortName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProductTopic"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductTopicResponse());
    }

    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTopicWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDesc)) {
            query.put("RuleDesc", request.ruleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.select)) {
            query.put("Select", request.select);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortTopic)) {
            query.put("ShortTopic", request.shortTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicType)) {
            query.put("TopicType", request.topicType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.where)) {
            query.put("Where", request.where);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateRuleActionResponse createRuleActionWithOptions(CreateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            query.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorActionFlag)) {
            query.put("ErrorActionFlag", request.errorActionFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRuleAction"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleActionResponse());
    }

    public CreateRuleActionResponse createRuleAction(CreateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleActionWithOptions(request, runtime);
    }

    public CreateSceneRuleResponse createSceneRuleWithOptions(CreateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleContent)) {
            query.put("RuleContent", request.ruleContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDescription)) {
            query.put("RuleDescription", request.ruleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSceneRuleResponse());
    }

    public CreateSceneRuleResponse createSceneRule(CreateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSceneRuleWithOptions(request, runtime);
    }

    public CreateSoundCodeResponse createSoundCodeWithOptions(CreateSoundCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCodeContent)) {
            body.put("SoundCodeContent", request.soundCodeContent);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSoundCode"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSoundCodeResponse());
    }

    public CreateSoundCodeResponse createSoundCode(CreateSoundCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSoundCodeWithOptions(request, runtime);
    }

    public CreateSpeechResponse createSpeechWithOptions(CreateSpeechRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSpeechShrinkRequest request = new CreateSpeechShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.soundCodeConfig)) {
            request.soundCodeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.soundCodeConfig, "SoundCodeConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            body.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSoundCode)) {
            body.put("EnableSoundCode", request.enableSoundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCodeConfigShrink)) {
            body.put("SoundCodeConfig", request.soundCodeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            body.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechType)) {
            body.put("SpeechType", request.speechType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("Volume", request.volume);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSpeechResponse());
    }

    public CreateSpeechResponse createSpeech(CreateSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpeechWithOptions(request, runtime);
    }

    public CreateStudioAppDomainOpenResponse createStudioAppDomainOpenWithOptions(CreateStudioAppDomainOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStudioAppDomainOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStudioAppDomainOpenResponse());
    }

    public CreateStudioAppDomainOpenResponse createStudioAppDomainOpen(CreateStudioAppDomainOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStudioAppDomainOpenWithOptions(request, runtime);
    }

    public CreateSubscribeRelationResponse createSubscribeRelationWithOptions(CreateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupIds)) {
            query.put("ConsumerGroupIds", request.consumerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDataFlag)) {
            query.put("DeviceDataFlag", request.deviceDataFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceLifeCycleFlag)) {
            query.put("DeviceLifeCycleFlag", request.deviceLifeCycleFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatusChangeFlag)) {
            query.put("DeviceStatusChangeFlag", request.deviceStatusChangeFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTagFlag)) {
            query.put("DeviceTagFlag", request.deviceTagFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTopoLifeCycleFlag)) {
            query.put("DeviceTopoLifeCycleFlag", request.deviceTopoLifeCycleFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundDeviceListFlag)) {
            query.put("FoundDeviceListFlag", request.foundDeviceListFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsConfiguration)) {
            query.put("MnsConfiguration", request.mnsConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaEventFlag)) {
            query.put("OtaEventFlag", request.otaEventFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaJobFlag)) {
            query.put("OtaJobFlag", request.otaJobFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaVersionFlag)) {
            query.put("OtaVersionFlag", request.otaVersionFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thingHistoryFlag)) {
            query.put("ThingHistoryFlag", request.thingHistoryFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscribeRelationResponse());
    }

    public CreateSubscribeRelationResponse createSubscribeRelation(CreateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscribeRelationWithOptions(request, runtime);
    }

    public CreateThingModelResponse createThingModelWithOptions(CreateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockName)) {
            query.put("FunctionBlockName", request.functionBlockName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thingModelJson)) {
            query.put("ThingModelJson", request.thingModelJson);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThingModelResponse());
    }

    public CreateThingModelResponse createThingModel(CreateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingModelWithOptions(request, runtime);
    }

    public CreateThingScriptResponse createThingScriptWithOptions(CreateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThingScript"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThingScriptResponse());
    }

    public CreateThingScriptResponse createThingScript(CreateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingScriptWithOptions(request, runtime);
    }

    public CreateTopicRouteTableResponse createTopicRouteTableWithOptions(CreateTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstTopic)) {
            query.put("DstTopic", request.dstTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTopic)) {
            query.put("SrcTopic", request.srcTopic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopicRouteTable"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicRouteTableResponse());
    }

    public CreateTopicRouteTableResponse createTopicRouteTable(CreateTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTopicRouteTableWithOptions(request, runtime);
    }

    public DeleteClientIdsResponse deleteClientIdsWithOptions(DeleteClientIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientIds"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientIdsResponse());
    }

    public DeleteClientIdsResponse deleteClientIds(DeleteClientIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClientIdsWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelationWithOptions(DeleteConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroupSubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupSubscribeRelationResponse());
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJobWithOptions(DeleteDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceDistributeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceDistributeJobResponse());
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceDistributeJobWithOptions(request, runtime);
    }

    public DeleteDeviceDynamicGroupResponse deleteDeviceDynamicGroupWithOptions(DeleteDeviceDynamicGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceDynamicGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceDynamicGroupResponse());
    }

    public DeleteDeviceDynamicGroupResponse deleteDeviceDynamicGroup(DeleteDeviceDynamicGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceDynamicGroupWithOptions(request, runtime);
    }

    public DeleteDeviceFileResponse deleteDeviceFileWithOptions(DeleteDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceFile"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceFileResponse());
    }

    public DeleteDeviceFileResponse deleteDeviceFile(DeleteDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceFileWithOptions(request, runtime);
    }

    public DeleteDeviceGroupResponse deleteDeviceGroupWithOptions(DeleteDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceGroupResponse());
    }

    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceGroupWithOptions(request, runtime);
    }

    public DeleteDevicePropResponse deleteDevicePropWithOptions(DeleteDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propKey)) {
            query.put("PropKey", request.propKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceProp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicePropResponse());
    }

    public DeleteDevicePropResponse deleteDeviceProp(DeleteDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicePropWithOptions(request, runtime);
    }

    public DeleteDeviceSpeechResponse deleteDeviceSpeechWithOptions(DeleteDeviceSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSpeechList)) {
            body.put("DeviceSpeechList", request.deviceSpeechList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceSpeechResponse());
    }

    public DeleteDeviceSpeechResponse deleteDeviceSpeech(DeleteDeviceSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceSpeechWithOptions(request, runtime);
    }

    public DeleteDeviceTunnelResponse deleteDeviceTunnelWithOptions(DeleteDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tunnelId)) {
            query.put("TunnelId", request.tunnelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceTunnelResponse());
    }

    public DeleteDeviceTunnelResponse deleteDeviceTunnel(DeleteDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceTunnelWithOptions(request, runtime);
    }

    public DeleteEdgeDriverResponse deleteEdgeDriverWithOptions(DeleteEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeDriverResponse());
    }

    public DeleteEdgeDriverResponse deleteEdgeDriver(DeleteEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverWithOptions(request, runtime);
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersionWithOptions(DeleteEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeDriverVersionResponse());
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverVersionWithOptions(request, runtime);
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstanceWithOptions(DeleteEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeInstanceResponse());
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstance(DeleteEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeInstanceWithOptions(request, runtime);
    }

    public DeleteEdgeInstanceMessageRoutingResponse deleteEdgeInstanceMessageRoutingWithOptions(DeleteEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeInstanceMessageRouting"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeInstanceMessageRoutingResponse());
    }

    public DeleteEdgeInstanceMessageRoutingResponse deleteEdgeInstanceMessageRouting(DeleteEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
    }

    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobWithOptions(request, runtime);
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmwareWithOptions(DeleteOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOTAFirmware"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOTAFirmwareResponse());
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmware(DeleteOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAFirmwareWithOptions(request, runtime);
    }

    public DeleteOTAModuleResponse deleteOTAModuleWithOptions(DeleteOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOTAModule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOTAModuleResponse());
    }

    public DeleteOTAModuleResponse deleteOTAModule(DeleteOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAModuleWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public DeleteProductTagsResponse deleteProductTagsWithOptions(DeleteProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTagKey)) {
            query.put("ProductTagKey", request.productTagKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductTagsResponse());
    }

    public DeleteProductTagsResponse deleteProductTags(DeleteProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTagsWithOptions(request, runtime);
    }

    public DeleteProductTopicResponse deleteProductTopicWithOptions(DeleteProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("TopicId", request.topicId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProductTopic"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductTopicResponse());
    }

    public DeleteProductTopicResponse deleteProductTopic(DeleteProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTopicWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteRuleActionResponse deleteRuleActionWithOptions(DeleteRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionId)) {
            query.put("ActionId", request.actionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRuleAction"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleActionResponse());
    }

    public DeleteRuleActionResponse deleteRuleAction(DeleteRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleActionWithOptions(request, runtime);
    }

    public DeleteSceneRuleResponse deleteSceneRuleWithOptions(DeleteSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneRuleResponse());
    }

    public DeleteSceneRuleResponse deleteSceneRule(DeleteSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSceneRuleWithOptions(request, runtime);
    }

    public DeleteSoundCodeResponse deleteSoundCodeWithOptions(DeleteSoundCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCode)) {
            body.put("SoundCode", request.soundCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSoundCode"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSoundCodeResponse());
    }

    public DeleteSoundCodeResponse deleteSoundCode(DeleteSoundCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSoundCodeWithOptions(request, runtime);
    }

    public DeleteSpeechResponse deleteSpeechWithOptions(DeleteSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechCodeList)) {
            body.put("SpeechCodeList", request.speechCodeList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpeechResponse());
    }

    public DeleteSpeechResponse deleteSpeech(DeleteSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpeechWithOptions(request, runtime);
    }

    public DeleteStudioAppDomainOpenResponse deleteStudioAppDomainOpenWithOptions(DeleteStudioAppDomainOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStudioAppDomainOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStudioAppDomainOpenResponse());
    }

    public DeleteStudioAppDomainOpenResponse deleteStudioAppDomainOpen(DeleteStudioAppDomainOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStudioAppDomainOpenWithOptions(request, runtime);
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelationWithOptions(DeleteSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscribeRelationResponse());
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelation(DeleteSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteThingModelResponse deleteThingModelWithOptions(DeleteThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventIdentifier)) {
            query.put("EventIdentifier", request.eventIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyIdentifier)) {
            query.put("PropertyIdentifier", request.propertyIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIdentifier)) {
            query.put("ServiceIdentifier", request.serviceIdentifier);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteThingModelResponse());
    }

    public DeleteThingModelResponse deleteThingModel(DeleteThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteThingModelWithOptions(request, runtime);
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTableWithOptions(DeleteTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstTopic)) {
            query.put("DstTopic", request.dstTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTopic)) {
            query.put("SrcTopic", request.srcTopic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopicRouteTable"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicRouteTableResponse());
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTable(DeleteTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTopicRouteTableWithOptions(request, runtime);
    }

    public DisableDeviceTunnelResponse disableDeviceTunnelWithOptions(DisableDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeviceTunnelResponse());
    }

    public DisableDeviceTunnelResponse disableDeviceTunnel(DisableDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceTunnelWithOptions(request, runtime);
    }

    public DisableDeviceTunnelShareResponse disableDeviceTunnelShareWithOptions(DisableDeviceTunnelShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDeviceTunnelShare"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeviceTunnelShareResponse());
    }

    public DisableDeviceTunnelShareResponse disableDeviceTunnelShare(DisableDeviceTunnelShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceTunnelShareWithOptions(request, runtime);
    }

    public DisableSceneRuleResponse disableSceneRuleWithOptions(DisableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSceneRuleResponse());
    }

    public DisableSceneRuleResponse disableSceneRule(DisableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneRuleWithOptions(request, runtime);
    }

    public DisableThingResponse disableThingWithOptions(DisableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableThing"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableThingResponse());
    }

    public DisableThingResponse disableThing(DisableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableThingWithOptions(request, runtime);
    }

    public EnableDeviceTunnelResponse enableDeviceTunnelWithOptions(EnableDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeviceTunnelResponse());
    }

    public EnableDeviceTunnelResponse enableDeviceTunnel(EnableDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceTunnelWithOptions(request, runtime);
    }

    public EnableDeviceTunnelShareResponse enableDeviceTunnelShareWithOptions(EnableDeviceTunnelShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeviceTunnelShare"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeviceTunnelShareResponse());
    }

    public EnableDeviceTunnelShareResponse enableDeviceTunnelShare(EnableDeviceTunnelShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceTunnelShareWithOptions(request, runtime);
    }

    public EnableSceneRuleResponse enableSceneRuleWithOptions(EnableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSceneRuleResponse());
    }

    public EnableSceneRuleResponse enableSceneRule(EnableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneRuleWithOptions(request, runtime);
    }

    public EnableThingResponse enableThingWithOptions(EnableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableThing"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableThingResponse());
    }

    public EnableThingResponse enableThing(EnableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableThingWithOptions(request, runtime);
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURLWithOptions(GenerateDeviceNameListURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDeviceNameListURL"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDeviceNameListURLResponse());
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURL(GenerateDeviceNameListURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDeviceNameListURLWithOptions(request, runtime);
    }

    public GenerateFileUploadURLResponse generateFileUploadURLWithOptions(GenerateFileUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSuffix)) {
            query.put("FileSuffix", request.fileSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateFileUploadURL"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateFileUploadURLResponse());
    }

    public GenerateFileUploadURLResponse generateFileUploadURL(GenerateFileUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateFileUploadURLWithOptions(request, runtime);
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURLWithOptions(GenerateOTAUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSuffix)) {
            query.put("FileSuffix", request.fileSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateOTAUploadURL"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateOTAUploadURLResponse());
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURL(GenerateOTAUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateOTAUploadURLWithOptions(request, runtime);
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetailWithOptions(GetDataAPIServiceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiSrn)) {
            body.put("ApiSrn", request.apiSrn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataAPIServiceDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataAPIServiceDetailResponse());
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataAPIServiceDetailWithOptions(request, runtime);
    }

    public GetDeviceShadowResponse getDeviceShadowWithOptions(GetDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceShadow"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceShadowResponse());
    }

    public GetDeviceShadowResponse getDeviceShadow(GetDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceShadowWithOptions(request, runtime);
    }

    public GetDeviceStatusResponse getDeviceStatusWithOptions(GetDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceStatusResponse());
    }

    public GetDeviceStatusResponse getDeviceStatus(GetDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceStatusWithOptions(request, runtime);
    }

    public GetDeviceTunnelShareStatusResponse getDeviceTunnelShareStatusWithOptions(GetDeviceTunnelShareStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceTunnelShareStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceTunnelShareStatusResponse());
    }

    public GetDeviceTunnelShareStatusResponse getDeviceTunnelShareStatus(GetDeviceTunnelShareStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceTunnelShareStatusWithOptions(request, runtime);
    }

    public GetDeviceTunnelStatusResponse getDeviceTunnelStatusWithOptions(GetDeviceTunnelStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceTunnelStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceTunnelStatusResponse());
    }

    public GetDeviceTunnelStatusResponse getDeviceTunnelStatus(GetDeviceTunnelStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceTunnelStatusWithOptions(request, runtime);
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersionWithOptions(GetEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeDriverVersionResponse());
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersion(GetEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeDriverVersionWithOptions(request, runtime);
    }

    public GetEdgeInstanceResponse getEdgeInstanceWithOptions(GetEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeInstanceResponse());
    }

    public GetEdgeInstanceResponse getEdgeInstance(GetEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceWithOptions(request, runtime);
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeploymentWithOptions(GetEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            query.put("DeploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeInstanceDeployment"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeInstanceDeploymentResponse());
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public GetEdgeInstanceMessageRoutingResponse getEdgeInstanceMessageRoutingWithOptions(GetEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeInstanceMessageRouting"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeInstanceMessageRoutingResponse());
    }

    public GetEdgeInstanceMessageRoutingResponse getEdgeInstanceMessageRouting(GetEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDeviceWithOptions(GetGatewayBySubDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayBySubDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayBySubDeviceResponse());
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDevice(GetGatewayBySubDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayBySubDeviceWithOptions(request, runtime);
    }

    public GetLoraNodesTaskResponse getLoraNodesTaskWithOptions(GetLoraNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoraNodesTask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoraNodesTaskResponse());
    }

    public GetLoraNodesTaskResponse getLoraNodesTask(GetLoraNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoraNodesTaskWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetRuleActionResponse getRuleActionWithOptions(GetRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionId)) {
            query.put("ActionId", request.actionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleAction"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleActionResponse());
    }

    public GetRuleActionResponse getRuleAction(GetRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleActionWithOptions(request, runtime);
    }

    public GetSceneRuleResponse getSceneRuleWithOptions(GetSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSceneRuleResponse());
    }

    public GetSceneRuleResponse getSceneRule(GetSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSceneRuleWithOptions(request, runtime);
    }

    public GetSoundCodeAudioResponse getSoundCodeAudioWithOptions(GetSoundCodeAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCodeList)) {
            body.put("SoundCodeList", request.soundCodeList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSoundCodeAudio"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSoundCodeAudioResponse());
    }

    public GetSoundCodeAudioResponse getSoundCodeAudio(GetSoundCodeAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSoundCodeAudioWithOptions(request, runtime);
    }

    public GetSpeechDeviceDetailResponse getSpeechDeviceDetailWithOptions(GetSpeechDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpeechDeviceDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpeechDeviceDetailResponse());
    }

    public GetSpeechDeviceDetailResponse getSpeechDeviceDetail(GetSpeechDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpeechDeviceDetailWithOptions(request, runtime);
    }

    public GetSpeechVoiceResponse getSpeechVoiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpeechVoice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpeechVoiceResponse());
    }

    public GetSpeechVoiceResponse getSpeechVoice() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpeechVoiceWithOptions(runtime);
    }

    public GetStudioAppTokenOpenResponse getStudioAppTokenOpenWithOptions(GetStudioAppTokenOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStudioAppTokenOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStudioAppTokenOpenResponse());
    }

    public GetStudioAppTokenOpenResponse getStudioAppTokenOpen(GetStudioAppTokenOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStudioAppTokenOpenWithOptions(request, runtime);
    }

    public GetThingModelTslResponse getThingModelTslWithOptions(GetThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simple)) {
            query.put("Simple", request.simple);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThingModelTsl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThingModelTslResponse());
    }

    public GetThingModelTslResponse getThingModelTsl(GetThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslWithOptions(request, runtime);
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublishedWithOptions(GetThingModelTslPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simple)) {
            query.put("Simple", request.simple);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThingModelTslPublished"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThingModelTslPublishedResponse());
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublished(GetThingModelTslPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslPublishedWithOptions(request, runtime);
    }

    public GetThingScriptResponse getThingScriptWithOptions(GetThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThingScript"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThingScriptResponse());
    }

    public GetThingScriptResponse getThingScript(GetThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingScriptWithOptions(request, runtime);
    }

    public GetThingTemplateResponse getThingTemplateWithOptions(GetThingTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryKey)) {
            query.put("CategoryKey", request.categoryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThingTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThingTemplateResponse());
    }

    public GetThingTemplateResponse getThingTemplate(GetThingTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTemplateWithOptions(request, runtime);
    }

    public GetThingTopoResponse getThingTopoWithOptions(GetThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThingTopo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThingTopoResponse());
    }

    public GetThingTopoResponse getThingTopo(GetThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTopoWithOptions(request, runtime);
    }

    public GisQueryDeviceLocationResponse gisQueryDeviceLocationWithOptions(GisQueryDeviceLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thingList)) {
            query.put("ThingList", request.thingList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GisQueryDeviceLocation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GisQueryDeviceLocationResponse());
    }

    public GisQueryDeviceLocationResponse gisQueryDeviceLocation(GisQueryDeviceLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.gisQueryDeviceLocationWithOptions(request, runtime);
    }

    public GisSearchDeviceTraceResponse gisSearchDeviceTraceWithOptions(GisSearchDeviceTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapMatch)) {
            query.put("MapMatch", request.mapMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GisSearchDeviceTrace"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GisSearchDeviceTraceResponse());
    }

    public GisSearchDeviceTraceResponse gisSearchDeviceTrace(GisSearchDeviceTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.gisSearchDeviceTraceWithOptions(request, runtime);
    }

    public ImportThingModelTslResponse importThingModelTslWithOptions(ImportThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockName)) {
            query.put("FunctionBlockName", request.functionBlockName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tslStr)) {
            query.put("TslStr", request.tslStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tslUrl)) {
            query.put("TslUrl", request.tslUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportThingModelTsl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportThingModelTslResponse());
    }

    public ImportThingModelTslResponse importThingModelTsl(ImportThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importThingModelTslWithOptions(request, runtime);
    }

    public InvokeDataAPIServiceResponse invokeDataAPIServiceWithOptions(InvokeDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiSrn)) {
            body.put("ApiSrn", request.apiSrn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeDataAPIService"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDataAPIServiceResponse());
    }

    public InvokeDataAPIServiceResponse invokeDataAPIService(InvokeDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeDataAPIServiceWithOptions(request, runtime);
    }

    public InvokeThingServiceResponse invokeThingServiceWithOptions(InvokeThingServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.args)) {
            query.put("Args", request.args);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeThingService"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeThingServiceResponse());
    }

    public InvokeThingServiceResponse invokeThingService(InvokeThingServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingServiceWithOptions(request, runtime);
    }

    public InvokeThingsServiceResponse invokeThingsServiceWithOptions(InvokeThingsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.args)) {
            query.put("Args", request.args);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeThingsService"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeThingsServiceResponse());
    }

    public InvokeThingsServiceResponse invokeThingsService(InvokeThingsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingsServiceWithOptions(request, runtime);
    }

    public ListAnalyticsDataResponse listAnalyticsDataWithOptions(ListAnalyticsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            query.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isoId)) {
            query.put("IsoId", request.isoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnalyticsData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnalyticsDataResponse());
    }

    public ListAnalyticsDataResponse listAnalyticsData(ListAnalyticsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnalyticsDataWithOptions(request, runtime);
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJobWithOptions(ListDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUid)) {
            query.put("TargetUid", request.targetUid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceDistributeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceDistributeJobResponse());
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJob(ListDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceDistributeJobWithOptions(request, runtime);
    }

    public ListDistributedDeviceResponse listDistributedDeviceWithOptions(ListDistributedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUid)) {
            query.put("TargetUid", request.targetUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistributedDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistributedDeviceResponse());
    }

    public ListDistributedDeviceResponse listDistributedDevice(ListDistributedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedDeviceWithOptions(request, runtime);
    }

    public ListDistributedProductResponse listDistributedProductWithOptions(ListDistributedProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUid)) {
            query.put("TargetUid", request.targetUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistributedProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistributedProductResponse());
    }

    public ListDistributedProductResponse listDistributedProduct(ListDistributedProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedProductWithOptions(request, runtime);
    }

    public ListJobResponse listJobWithOptions(ListJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobResponse());
    }

    public ListJobResponse listJob(ListJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobWithOptions(request, runtime);
    }

    public ListOTAFirmwareResponse listOTAFirmwareWithOptions(ListOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destVersion)) {
            query.put("DestVersion", request.destVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAFirmware"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAFirmwareResponse());
    }

    public ListOTAFirmwareResponse listOTAFirmware(ListOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAFirmwareWithOptions(request, runtime);
    }

    public ListOTAJobByDeviceResponse listOTAJobByDeviceWithOptions(ListOTAJobByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAJobByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAJobByDeviceResponse());
    }

    public ListOTAJobByDeviceResponse listOTAJobByDevice(ListOTAJobByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByDeviceWithOptions(request, runtime);
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmwareWithOptions(ListOTAJobByFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAJobByFirmware"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAJobByFirmwareResponse());
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmware(ListOTAJobByFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByFirmwareWithOptions(request, runtime);
    }

    public ListOTAModuleByProductResponse listOTAModuleByProductWithOptions(ListOTAModuleByProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAModuleByProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAModuleByProductResponse());
    }

    public ListOTAModuleByProductResponse listOTAModuleByProduct(ListOTAModuleByProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleByProductWithOptions(request, runtime);
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDeviceWithOptions(ListOTAModuleVersionsByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAModuleVersionsByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAModuleVersionsByDeviceResponse());
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleVersionsByDeviceWithOptions(request, runtime);
    }

    public ListOTATaskByJobResponse listOTATaskByJobWithOptions(ListOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNames)) {
            query.put("DeviceNames", request.deviceNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTATaskByJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTATaskByJobResponse());
    }

    public ListOTATaskByJobResponse listOTATaskByJob(ListOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTATaskByJobWithOptions(request, runtime);
    }

    public ListOTAUnfinishedTaskByDeviceResponse listOTAUnfinishedTaskByDeviceWithOptions(ListOTAUnfinishedTaskByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOTAUnfinishedTaskByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOTAUnfinishedTaskByDeviceResponse());
    }

    public ListOTAUnfinishedTaskByDeviceResponse listOTAUnfinishedTaskByDevice(ListOTAUnfinishedTaskByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAUnfinishedTaskByDeviceWithOptions(request, runtime);
    }

    public ListProductByTagsResponse listProductByTagsWithOptions(ListProductByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTag)) {
            query.put("ProductTag", request.productTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductByTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductByTagsResponse());
    }

    public ListProductByTagsResponse listProductByTags(ListProductByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductByTagsWithOptions(request, runtime);
    }

    public ListProductTagsResponse listProductTagsWithOptions(ListProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductTagsResponse());
    }

    public ListProductTagsResponse listProductTags(ListProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductTagsWithOptions(request, runtime);
    }

    public ListRuleResponse listRuleWithOptions(ListRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleResponse());
    }

    public ListRuleResponse listRule(ListRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleWithOptions(request, runtime);
    }

    public ListRuleActionsResponse listRuleActionsWithOptions(ListRuleActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuleActions"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleActionsResponse());
    }

    public ListRuleActionsResponse listRuleActions(ListRuleActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleActionsWithOptions(request, runtime);
    }

    public ListTaskResponse listTaskWithOptions(ListTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTaskShrinkRequest request = new ListTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.device)) {
            request.deviceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.device, "Device", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceShrink)) {
            query.put("Device", request.deviceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskResponse());
    }

    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    public ListThingModelVersionResponse listThingModelVersionWithOptions(ListThingModelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListThingModelVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListThingModelVersionResponse());
    }

    public ListThingModelVersionResponse listThingModelVersion(ListThingModelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingModelVersionWithOptions(request, runtime);
    }

    public ListThingTemplatesResponse listThingTemplatesWithOptions(ListThingTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListThingTemplates"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListThingTemplatesResponse());
    }

    public ListThingTemplatesResponse listThingTemplates(ListThingTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingTemplatesWithOptions(request, runtime);
    }

    public NotifyAddThingTopoResponse notifyAddThingTopoWithOptions(NotifyAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceListStr)) {
            query.put("DeviceListStr", request.deviceListStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gwDeviceName)) {
            query.put("GwDeviceName", request.gwDeviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gwIotId)) {
            query.put("GwIotId", request.gwIotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gwProductKey)) {
            query.put("GwProductKey", request.gwProductKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NotifyAddThingTopo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NotifyAddThingTopoResponse());
    }

    public NotifyAddThingTopoResponse notifyAddThingTopo(NotifyAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyAddThingTopoWithOptions(request, runtime);
    }

    public OpenIotServiceResponse openIotServiceWithOptions(OpenIotServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenIotService"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenIotServiceResponse());
    }

    public OpenIotServiceResponse openIotService(OpenIotServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openIotServiceWithOptions(request, runtime);
    }

    public PrintByTemplateResponse printByTemplateWithOptions(PrintByTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyPrintTopic)) {
            body.put("HistoryPrintTopic", request.historyPrintTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJsonString)) {
            body.put("ParamsJsonString", request.paramsJsonString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBizCode)) {
            body.put("TemplateBizCode", request.templateBizCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrintByTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrintByTemplateResponse());
    }

    public PrintByTemplateResponse printByTemplate(PrintByTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.printByTemplateWithOptions(request, runtime);
    }

    public PubResponse pubWithOptions(PubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.correlationData)) {
            query.put("CorrelationData", request.correlationData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageContent)) {
            query.put("MessageContent", request.messageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qos)) {
            query.put("Qos", request.qos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseTopic)) {
            query.put("ResponseTopic", request.responseTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicFullName)) {
            query.put("TopicFullName", request.topicFullName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProp)) {
            query.put("UserProp", request.userProp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Pub"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PubResponse());
    }

    public PubResponse pub(PubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubWithOptions(request, runtime);
    }

    public PubBroadcastResponse pubBroadcastWithOptions(PubBroadcastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageContent)) {
            query.put("MessageContent", request.messageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicFullName)) {
            query.put("TopicFullName", request.topicFullName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PubBroadcast"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PubBroadcastResponse());
    }

    public PubBroadcastResponse pubBroadcast(PubBroadcastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubBroadcastWithOptions(request, runtime);
    }

    public PublishStudioAppResponse publishStudioAppWithOptions(PublishStudioAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishStudioApp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishStudioAppResponse());
    }

    public PublishStudioAppResponse publishStudioApp(PublishStudioAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishStudioAppWithOptions(request, runtime);
    }

    public PublishThingModelResponse publishThingModelWithOptions(PublishThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishThingModelResponse());
    }

    public PublishThingModelResponse publishThingModel(PublishThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishThingModelWithOptions(request, runtime);
    }

    public PushSpeechResponse pushSpeechWithOptions(PushSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushMode)) {
            body.put("PushMode", request.pushMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechCodeList)) {
            body.put("SpeechCodeList", request.speechCodeList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushSpeechResponse());
    }

    public PushSpeechResponse pushSpeech(PushSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushSpeechWithOptions(request, runtime);
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatusWithOptions(QueryBatchRegisterDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("ApplyId", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBatchRegisterDeviceStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBatchRegisterDeviceStatusResponse());
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBatchRegisterDeviceStatusWithOptions(request, runtime);
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyIdWithOptions(QueryCertUrlByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("ApplyId", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCertUrlByApplyId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCertUrlByApplyIdResponse());
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCertUrlByApplyIdWithOptions(request, runtime);
    }

    public QueryClientIdsResponse queryClientIdsWithOptions(QueryClientIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClientIds"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClientIdsResponse());
    }

    public QueryClientIdsResponse queryClientIds(QueryClientIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClientIdsWithOptions(request, runtime);
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupIdWithOptions(QueryConsumerGroupByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConsumerGroupByGroupId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConsumerGroupByGroupIdResponse());
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupByGroupIdWithOptions(request, runtime);
    }

    public QueryConsumerGroupListResponse queryConsumerGroupListWithOptions(QueryConsumerGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzy)) {
            query.put("Fuzzy", request.fuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConsumerGroupList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConsumerGroupListResponse());
    }

    public QueryConsumerGroupListResponse queryConsumerGroupList(QueryConsumerGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupListWithOptions(request, runtime);
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatusWithOptions(QueryConsumerGroupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConsumerGroupStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConsumerGroupStatusResponse());
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupStatusWithOptions(request, runtime);
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLogWithOptions(QueryDetailSceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDetailSceneRuleLog"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDetailSceneRuleLogResponse());
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDetailSceneRuleLogWithOptions(request, runtime);
    }

    public QueryDeviceResponse queryDeviceWithOptions(QueryDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceResponse());
    }

    public QueryDeviceResponse queryDevice(QueryDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceWithOptions(request, runtime);
    }

    public QueryDeviceBySQLResponse queryDeviceBySQLWithOptions(QueryDeviceBySQLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQL)) {
            query.put("SQL", request.SQL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceBySQL"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceBySQLResponse());
    }

    public QueryDeviceBySQLResponse queryDeviceBySQL(QueryDeviceBySQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceBySQLWithOptions(request, runtime);
    }

    public QueryDeviceByStatusResponse queryDeviceByStatusWithOptions(QueryDeviceByStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceByStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceByStatusResponse());
    }

    public QueryDeviceByStatusResponse queryDeviceByStatus(QueryDeviceByStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByStatusWithOptions(request, runtime);
    }

    public QueryDeviceByTagsResponse queryDeviceByTagsWithOptions(QueryDeviceByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceByTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceByTagsResponse());
    }

    public QueryDeviceByTagsResponse queryDeviceByTags(QueryDeviceByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByTagsWithOptions(request, runtime);
    }

    public QueryDeviceCertResponse queryDeviceCertWithOptions(QueryDeviceCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceCert"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceCertResponse());
    }

    public QueryDeviceCertResponse queryDeviceCert(QueryDeviceCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceCertWithOptions(request, runtime);
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredPropertyWithOptions(QueryDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceDesiredProperty"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceDesiredPropertyResponse());
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public QueryDeviceDetailResponse queryDeviceDetailWithOptions(QueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceDetailResponse());
    }

    public QueryDeviceDetailResponse queryDeviceDetail(QueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDetailWithOptions(request, runtime);
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetailWithOptions(QueryDeviceDistributeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceDistributeDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceDistributeDetailResponse());
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeDetailWithOptions(request, runtime);
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJobWithOptions(QueryDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceDistributeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceDistributeJobResponse());
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceEventDataResponse queryDeviceEventDataWithOptions(QueryDeviceEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceEventData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceEventDataResponse());
    }

    public QueryDeviceEventDataResponse queryDeviceEventData(QueryDeviceEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventDataWithOptions(request, runtime);
    }

    public QueryDeviceFileResponse queryDeviceFileWithOptions(QueryDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceFile"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceFileResponse());
    }

    public QueryDeviceFileResponse queryDeviceFile(QueryDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileWithOptions(request, runtime);
    }

    public QueryDeviceFileListResponse queryDeviceFileListWithOptions(QueryDeviceFileListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceFileList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceFileListResponse());
    }

    public QueryDeviceFileListResponse queryDeviceFileList(QueryDeviceFileListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileListWithOptions(request, runtime);
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDeviceWithOptions(QueryDeviceGroupByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceGroupByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceGroupByDeviceResponse());
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByDeviceWithOptions(request, runtime);
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTagsWithOptions(QueryDeviceGroupByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceGroupByTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceGroupByTagsResponse());
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByTagsWithOptions(request, runtime);
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfoWithOptions(QueryDeviceGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceGroupInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceGroupInfoResponse());
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupInfoWithOptions(request, runtime);
    }

    public QueryDeviceGroupListResponse queryDeviceGroupListWithOptions(QueryDeviceGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTypes)) {
            query.put("GroupTypes", request.groupTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superGroupId)) {
            query.put("SuperGroupId", request.superGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceGroupList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceGroupListResponse());
    }

    public QueryDeviceGroupListResponse queryDeviceGroupList(QueryDeviceGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupListWithOptions(request, runtime);
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagListWithOptions(QueryDeviceGroupTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceGroupTagList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceGroupTagListResponse());
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupTagListWithOptions(request, runtime);
    }

    public QueryDeviceInfoResponse queryDeviceInfoWithOptions(QueryDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceInfoResponse());
    }

    public QueryDeviceInfoResponse queryDeviceInfo(QueryDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceInfoWithOptions(request, runtime);
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroupWithOptions(QueryDeviceListByDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceListByDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceListByDeviceGroupResponse());
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceListByDeviceGroupWithOptions(request, runtime);
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventDataWithOptions(QueryDeviceOriginalEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceOriginalEventData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceOriginalEventDataResponse());
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalEventDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyDataWithOptions(QueryDeviceOriginalPropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceOriginalPropertyData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceOriginalPropertyDataResponse());
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatusWithOptions(QueryDeviceOriginalPropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceOriginalPropertyStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceOriginalPropertyStatusResponse());
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyStatusWithOptions(request, runtime);
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceDataWithOptions(QueryDeviceOriginalServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceOriginalServiceData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceOriginalServiceDataResponse());
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalServiceDataWithOptions(request, runtime);
    }

    public QueryDevicePropResponse queryDevicePropWithOptions(QueryDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceProp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePropResponse());
    }

    public QueryDevicePropResponse queryDeviceProp(QueryDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropWithOptions(request, runtime);
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesDataWithOptions(QueryDevicePropertiesDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePropertiesData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePropertiesDataResponse());
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesData(QueryDevicePropertiesDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertiesDataWithOptions(request, runtime);
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyDataWithOptions(QueryDevicePropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePropertyData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePropertyDataResponse());
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyData(QueryDevicePropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyDataWithOptions(request, runtime);
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatusWithOptions(QueryDevicePropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePropertyStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePropertyStatusResponse());
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyStatusWithOptions(request, runtime);
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceDataWithOptions(QueryDeviceServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceServiceData"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceServiceDataResponse());
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceData(QueryDeviceServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceServiceDataWithOptions(request, runtime);
    }

    public QueryDeviceSpeechResponse queryDeviceSpeechWithOptions(QueryDeviceSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceSpeechResponse());
    }

    public QueryDeviceSpeechResponse queryDeviceSpeech(QueryDeviceSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceSpeechWithOptions(request, runtime);
    }

    public QueryDeviceStatisticsResponse queryDeviceStatisticsWithOptions(QueryDeviceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceStatistics"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceStatisticsResponse());
    }

    public QueryDeviceStatisticsResponse queryDeviceStatistics(QueryDeviceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceStatisticsWithOptions(request, runtime);
    }

    public QueryDeviceTunnelResponse queryDeviceTunnelWithOptions(QueryDeviceTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tunnelId)) {
            query.put("TunnelId", request.tunnelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceTunnel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceTunnelResponse());
    }

    public QueryDeviceTunnelResponse queryDeviceTunnel(QueryDeviceTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceTunnelWithOptions(request, runtime);
    }

    public QueryDynamicGroupDevicesResponse queryDynamicGroupDevicesWithOptions(QueryDynamicGroupDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzyName)) {
            query.put("FuzzyName", request.fuzzyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDynamicGroupDevices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDynamicGroupDevicesResponse());
    }

    public QueryDynamicGroupDevicesResponse queryDynamicGroupDevices(QueryDynamicGroupDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDynamicGroupDevicesWithOptions(request, runtime);
    }

    public QueryEdgeDriverResponse queryEdgeDriverWithOptions(QueryEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverName)) {
            query.put("DriverName", request.driverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeDriverResponse());
    }

    public QueryEdgeDriverResponse queryEdgeDriver(QueryEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverWithOptions(request, runtime);
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersionWithOptions(QueryEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionState)) {
            query.put("VersionState", request.versionState);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeDriverVersionResponse());
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverVersionWithOptions(request, runtime);
    }

    public QueryEdgeInstanceResponse queryEdgeInstanceWithOptions(QueryEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceResponse());
    }

    public QueryEdgeInstanceResponse queryEdgeInstance(QueryEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannelWithOptions(QueryEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            query.put("ChannelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceChannelResponse());
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceChannelWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDeviceWithOptions(QueryEdgeInstanceDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceDeviceResponse());
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriverWithOptions(QueryEdgeInstanceDeviceByDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceDeviceByDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceDeviceByDriverResponse());
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceByDriverWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriverWithOptions(QueryEdgeInstanceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceDriver"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceDriverResponse());
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDriverWithOptions(request, runtime);
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGatewayWithOptions(QueryEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceGateway"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceGatewayResponse());
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeploymentWithOptions(QueryEdgeInstanceHistoricDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceHistoricDeployment"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceHistoricDeploymentResponse());
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceHistoricDeploymentWithOptions(request, runtime);
    }

    public QueryEdgeInstanceMessageRoutingResponse queryEdgeInstanceMessageRoutingWithOptions(QueryEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceMessageRouting"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceMessageRoutingResponse());
    }

    public QueryEdgeInstanceMessageRoutingResponse queryEdgeInstanceMessageRouting(QueryEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRuleWithOptions(QueryEdgeInstanceSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEdgeInstanceSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEdgeInstanceSceneRuleResponse());
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceSceneRuleWithOptions(request, runtime);
    }

    public QueryJobResponse queryJobWithOptions(QueryJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobResponse());
    }

    public QueryJobResponse queryJob(QueryJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobWithOptions(request, runtime);
    }

    public QueryJobStatisticsResponse queryJobStatisticsWithOptions(QueryJobStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobStatistics"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobStatisticsResponse());
    }

    public QueryJobStatisticsResponse queryJobStatistics(QueryJobStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobStatisticsWithOptions(request, runtime);
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissionsWithOptions(QueryLoRaJoinPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLoRaJoinPermissions"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLoRaJoinPermissionsResponse());
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLoRaJoinPermissionsWithOptions(request, runtime);
    }

    public QueryMessageInfoResponse queryMessageInfoWithOptions(QueryMessageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniMsgId)) {
            query.put("UniMsgId", request.uniMsgId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessageInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageInfoResponse());
    }

    public QueryMessageInfoResponse queryMessageInfo(QueryMessageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMessageInfoWithOptions(request, runtime);
    }

    public QueryOTAFirmwareResponse queryOTAFirmwareWithOptions(QueryOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firmwareId)) {
            query.put("FirmwareId", request.firmwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOTAFirmware"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOTAFirmwareResponse());
    }

    public QueryOTAFirmwareResponse queryOTAFirmware(QueryOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAFirmwareWithOptions(request, runtime);
    }

    public QueryOTAJobResponse queryOTAJobWithOptions(QueryOTAJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOTAJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOTAJobResponse());
    }

    public QueryOTAJobResponse queryOTAJob(QueryOTAJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAJobWithOptions(request, runtime);
    }

    public QueryPageByApplyIdResponse queryPageByApplyIdWithOptions(QueryPageByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("ApplyId", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPageByApplyId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPageByApplyIdResponse());
    }

    public QueryPageByApplyIdResponse queryPageByApplyId(QueryPageByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPageByApplyIdWithOptions(request, runtime);
    }

    public QueryProductResponse queryProductWithOptions(QueryProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductResponse());
    }

    public QueryProductResponse queryProduct(QueryProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductWithOptions(request, runtime);
    }

    public QueryProductCertInfoResponse queryProductCertInfoWithOptions(QueryProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductCertInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductCertInfoResponse());
    }

    public QueryProductCertInfoResponse queryProductCertInfo(QueryProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductCertInfoWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunCommodityCode)) {
            query.put("AliyunCommodityCode", request.aliyunCommodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryProductTopicResponse queryProductTopicWithOptions(QueryProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductTopic"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductTopicResponse());
    }

    public QueryProductTopicResponse queryProductTopic(QueryProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductTopicWithOptions(request, runtime);
    }

    public QuerySceneRuleResponse querySceneRuleWithOptions(QuerySceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySceneRuleResponse());
    }

    public QuerySceneRuleResponse querySceneRule(QuerySceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySceneRuleWithOptions(request, runtime);
    }

    public QuerySolutionDeviceGroupPageResponse querySolutionDeviceGroupPageWithOptions(QuerySolutionDeviceGroupPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fuzzyGroupName)) {
            query.put("FuzzyGroupName", request.fuzzyGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            query.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            query.put("ProjectCode", request.projectCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySolutionDeviceGroupPage"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySolutionDeviceGroupPageResponse());
    }

    public QuerySolutionDeviceGroupPageResponse querySolutionDeviceGroupPage(QuerySolutionDeviceGroupPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySolutionDeviceGroupPageWithOptions(request, runtime);
    }

    public QuerySoundCodeListResponse querySoundCodeListWithOptions(QuerySoundCodeListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySoundCodeList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySoundCodeListResponse());
    }

    public QuerySoundCodeListResponse querySoundCodeList(QuerySoundCodeListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySoundCodeListWithOptions(request, runtime);
    }

    public QuerySpeechResponse querySpeechWithOptions(QuerySpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechCode)) {
            body.put("SpeechCode", request.speechCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechResponse());
    }

    public QuerySpeechResponse querySpeech(QuerySpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechWithOptions(request, runtime);
    }

    public QuerySpeechDeviceResponse querySpeechDeviceWithOptions(QuerySpeechDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.availableSpace)) {
            body.put("AvailableSpace", request.availableSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableSpaceScope)) {
            body.put("AvailableSpaceScope", request.availableSpaceScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeechDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechDeviceResponse());
    }

    public QuerySpeechDeviceResponse querySpeechDevice(QuerySpeechDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechDeviceWithOptions(request, runtime);
    }

    public QuerySpeechListResponse querySpeechListWithOptions(QuerySpeechListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeechList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechListResponse());
    }

    public QuerySpeechListResponse querySpeechList(QuerySpeechListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechListWithOptions(request, runtime);
    }

    public QuerySpeechPushJobResponse querySpeechPushJobWithOptions(QuerySpeechPushJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushMode)) {
            body.put("PushMode", request.pushMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("StatusList", request.statusList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeechPushJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechPushJobResponse());
    }

    public QuerySpeechPushJobResponse querySpeechPushJob(QuerySpeechPushJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobWithOptions(request, runtime);
    }

    public QuerySpeechPushJobDeviceResponse querySpeechPushJobDeviceWithOptions(QuerySpeechPushJobDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            body.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeechPushJobDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechPushJobDeviceResponse());
    }

    public QuerySpeechPushJobDeviceResponse querySpeechPushJobDevice(QuerySpeechPushJobDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobDeviceWithOptions(request, runtime);
    }

    public QuerySpeechPushJobSpeechResponse querySpeechPushJobSpeechWithOptions(QuerySpeechPushJobSpeechRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            body.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageId)) {
            body.put("PageId", request.pageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpeechPushJobSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpeechPushJobSpeechResponse());
    }

    public QuerySpeechPushJobSpeechResponse querySpeechPushJobSpeech(QuerySpeechPushJobSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpeechPushJobSpeechWithOptions(request, runtime);
    }

    public QueryStudioAppDomainListOpenResponse queryStudioAppDomainListOpenWithOptions(QueryStudioAppDomainListOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStudioAppDomainListOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStudioAppDomainListOpenResponse());
    }

    public QueryStudioAppDomainListOpenResponse queryStudioAppDomainListOpen(QueryStudioAppDomainListOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppDomainListOpenWithOptions(request, runtime);
    }

    public QueryStudioAppListResponse queryStudioAppListWithOptions(QueryStudioAppListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fuzzyName)) {
            body.put("FuzzyName", request.fuzzyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            body.put("Types", request.types);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStudioAppList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStudioAppListResponse());
    }

    public QueryStudioAppListResponse queryStudioAppList(QueryStudioAppListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppListWithOptions(request, runtime);
    }

    public QueryStudioAppPageListOpenResponse queryStudioAppPageListOpenWithOptions(QueryStudioAppPageListOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRelease)) {
            body.put("IsRelease", request.isRelease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStudioAppPageListOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStudioAppPageListOpenResponse());
    }

    public QueryStudioAppPageListOpenResponse queryStudioAppPageListOpen(QueryStudioAppPageListOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioAppPageListOpenWithOptions(request, runtime);
    }

    public QueryStudioProjectListResponse queryStudioProjectListWithOptions(QueryStudioProjectListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStudioProjectList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStudioProjectListResponse());
    }

    public QueryStudioProjectListResponse queryStudioProjectList(QueryStudioProjectListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStudioProjectListWithOptions(request, runtime);
    }

    public QuerySubscribeRelationResponse querySubscribeRelationWithOptions(QuerySubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySubscribeRelationResponse());
    }

    public QuerySubscribeRelationResponse querySubscribeRelation(QuerySubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscribeRelationWithOptions(request, runtime);
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLogWithOptions(QuerySummarySceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySummarySceneRuleLog"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySummarySceneRuleLogResponse());
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySummarySceneRuleLogWithOptions(request, runtime);
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroupWithOptions(QuerySuperDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySuperDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySuperDeviceGroupResponse());
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroup(QuerySuperDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySuperDeviceGroupWithOptions(request, runtime);
    }

    public QueryTaskResponse queryTaskWithOptions(QueryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskResponse());
    }

    public QueryTaskResponse queryTask(QueryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskWithOptions(request, runtime);
    }

    public QueryThingModelResponse queryThingModelWithOptions(QueryThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryThingModelResponse());
    }

    public QueryThingModelResponse queryThingModel(QueryThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfigWithOptions(QueryThingModelExtendConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryThingModelExtendConfig"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryThingModelExtendConfigResponse());
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublishedWithOptions(QueryThingModelExtendConfigPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryThingModelExtendConfigPublished"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryThingModelExtendConfigPublishedResponse());
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigPublishedWithOptions(request, runtime);
    }

    public QueryThingModelPublishedResponse queryThingModelPublishedWithOptions(QueryThingModelPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryThingModelPublished"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryThingModelPublishedResponse());
    }

    public QueryThingModelPublishedResponse queryThingModelPublished(QueryThingModelPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelPublishedWithOptions(request, runtime);
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTableWithOptions(QueryTopicReverseRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTopicReverseRouteTable"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTopicReverseRouteTableResponse());
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicReverseRouteTableWithOptions(request, runtime);
    }

    public QueryTopicRouteTableResponse queryTopicRouteTableWithOptions(QueryTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTopicRouteTable"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTopicRouteTableResponse());
    }

    public QueryTopicRouteTableResponse queryTopicRouteTable(QueryTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicRouteTableWithOptions(request, runtime);
    }

    public RRpcResponse rRpcWithOptions(RRpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestBase64Byte)) {
            query.put("RequestBase64Byte", request.requestBase64Byte);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RRpc"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RRpcResponse());
    }

    public RRpcResponse rRpc(RRpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rRpcWithOptions(request, runtime);
    }

    public RefreshDeviceTunnelSharePasswordResponse refreshDeviceTunnelSharePasswordWithOptions(RefreshDeviceTunnelSharePasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDeviceTunnelSharePassword"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDeviceTunnelSharePasswordResponse());
    }

    public RefreshDeviceTunnelSharePasswordResponse refreshDeviceTunnelSharePassword(RefreshDeviceTunnelSharePasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshDeviceTunnelSharePasswordWithOptions(request, runtime);
    }

    public RefreshStudioAppTokenOpenResponse refreshStudioAppTokenOpenWithOptions(RefreshStudioAppTokenOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshStudioAppTokenOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshStudioAppTokenOpenResponse());
    }

    public RefreshStudioAppTokenOpenResponse refreshStudioAppTokenOpen(RefreshStudioAppTokenOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshStudioAppTokenOpenWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEui)) {
            query.put("DevEui", request.devEui);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinEui)) {
            query.put("JoinEui", request.joinEui);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loraNodeType)) {
            query.put("LoraNodeType", request.loraNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            query.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pinCode)) {
            query.put("PinCode", request.pinCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersionWithOptions(ReleaseEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseEdgeDriverVersionResponse());
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEdgeDriverVersionWithOptions(request, runtime);
    }

    public ReleaseProductResponse releaseProductWithOptions(ReleaseProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseProductResponse());
    }

    public ReleaseProductResponse releaseProduct(ReleaseProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseProductWithOptions(request, runtime);
    }

    public RemoveThingTopoResponse removeThingTopoWithOptions(RemoveThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveThingTopo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveThingTopoResponse());
    }

    public RemoveThingTopoResponse removeThingTopo(RemoveThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeThingTopoWithOptions(request, runtime);
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGatewayWithOptions(ReplaceEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentGatewayId)) {
            query.put("CurrentGatewayId", request.currentGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newGatewayId)) {
            query.put("NewGatewayId", request.newGatewayId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceEdgeInstanceGateway"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceEdgeInstanceGatewayResponse());
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public RerunJobResponse rerunJobWithOptions(RerunJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunJobResponse());
    }

    public RerunJobResponse rerunJob(RerunJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rerunJobWithOptions(request, runtime);
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPositionWithOptions(ResetConsumerGroupPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetConsumerGroupPosition"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetConsumerGroupPositionResponse());
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetConsumerGroupPositionWithOptions(request, runtime);
    }

    public ResetThingResponse resetThingWithOptions(ResetThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetThing"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetThingResponse());
    }

    public ResetThingResponse resetThing(ResetThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetThingWithOptions(request, runtime);
    }

    public ReupgradeOTATaskResponse reupgradeOTATaskWithOptions(ReupgradeOTATaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReupgradeOTATask"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReupgradeOTATaskResponse());
    }

    public ReupgradeOTATaskResponse reupgradeOTATask(ReupgradeOTATaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reupgradeOTATaskWithOptions(request, runtime);
    }

    public SaveDevicePropResponse saveDevicePropWithOptions(SaveDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.props)) {
            query.put("Props", request.props);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveDeviceProp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveDevicePropResponse());
    }

    public SaveDevicePropResponse saveDeviceProp(SaveDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveDevicePropWithOptions(request, runtime);
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredPropertyWithOptions(SetDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("Versions", request.versions);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceDesiredProperty"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceDesiredPropertyResponse());
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTagsWithOptions(SetDeviceGroupTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagString)) {
            query.put("TagString", request.tagString);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceGroupTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceGroupTagsResponse());
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTags(SetDeviceGroupTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceGroupTagsWithOptions(request, runtime);
    }

    public SetDevicePropertyResponse setDevicePropertyWithOptions(SetDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceProperty"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDevicePropertyResponse());
    }

    public SetDevicePropertyResponse setDeviceProperty(SetDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicePropertyWithOptions(request, runtime);
    }

    public SetDevicesPropertyResponse setDevicesPropertyWithOptions(SetDevicesPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDevicesProperty"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDevicesPropertyResponse());
    }

    public SetDevicesPropertyResponse setDevicesProperty(SetDevicesPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicesPropertyWithOptions(request, runtime);
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigsWithOptions(SetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            query.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEdgeInstanceDriverConfigs"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEdgeInstanceDriverConfigsResponse());
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public SetProductCertInfoResponse setProductCertInfoWithOptions(SetProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueModel)) {
            query.put("IssueModel", request.issueModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetProductCertInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetProductCertInfoResponse());
    }

    public SetProductCertInfoResponse setProductCertInfo(SetProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setProductCertInfoWithOptions(request, runtime);
    }

    public SetStudioProjectCooperationResponse setStudioProjectCooperationWithOptions(SetStudioProjectCooperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetStudioProjectCooperation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetStudioProjectCooperationResponse());
    }

    public SetStudioProjectCooperationResponse setStudioProjectCooperation(SetStudioProjectCooperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setStudioProjectCooperationWithOptions(request, runtime);
    }

    public SetupStudioAppAuthModeOpenResponse setupStudioAppAuthModeOpenWithOptions(SetupStudioAppAuthModeOpenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authMode)) {
            body.put("AuthMode", request.authMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupStudioAppAuthModeOpen"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupStudioAppAuthModeOpenResponse());
    }

    public SetupStudioAppAuthModeOpenResponse setupStudioAppAuthModeOpen(SetupStudioAppAuthModeOpenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupStudioAppAuthModeOpenWithOptions(request, runtime);
    }

    public SpeechByCombinationResponse speechByCombinationWithOptions(SpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.combinationList)) {
            body.put("CombinationList", request.combinationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechId)) {
            body.put("SpeechId", request.speechId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SpeechByCombination"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SpeechByCombinationResponse());
    }

    public SpeechByCombinationResponse speechByCombination(SpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.speechByCombinationWithOptions(request, runtime);
    }

    public SpeechBySynthesisResponse speechBySynthesisWithOptions(SpeechBySynthesisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechId)) {
            body.put("SpeechId", request.speechId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            body.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("Volume", request.volume);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SpeechBySynthesis"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SpeechBySynthesisResponse());
    }

    public SpeechBySynthesisResponse speechBySynthesis(SpeechBySynthesisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.speechBySynthesisWithOptions(request, runtime);
    }

    public StartCpuResponse startCpuWithOptions(StartCpuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCpu"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCpuResponse());
    }

    public StartCpuResponse startCpu(StartCpuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCpuWithOptions(request, runtime);
    }

    public StartRuleResponse startRuleWithOptions(StartRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRuleResponse());
    }

    public StartRuleResponse startRule(StartRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRuleWithOptions(request, runtime);
    }

    public StopRuleResponse stopRuleWithOptions(StopRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRuleResponse());
    }

    public StopRuleResponse stopRule(StopRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRuleWithOptions(request, runtime);
    }

    public SubscribeTopicResponse subscribeTopicWithOptions(SubscribeTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribeTopic"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeTopicResponse());
    }

    public SubscribeTopicResponse subscribeTopic(SubscribeTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscribeTopicWithOptions(request, runtime);
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombinationWithOptions(SyncSpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.combinationList)) {
            body.put("CombinationList", request.combinationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechId)) {
            body.put("SpeechId", request.speechId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncSpeechByCombination"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncSpeechByCombinationResponse());
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombination(SyncSpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncSpeechByCombinationWithOptions(request, runtime);
    }

    public TestSpeechResponse testSpeechWithOptions(TestSpeechRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestSpeechShrinkRequest request = new TestSpeechShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.soundCodeConfig)) {
            request.soundCodeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.soundCodeConfig, "SoundCodeConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFormat)) {
            body.put("AudioFormat", request.audioFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSoundCode)) {
            body.put("EnableSoundCode", request.enableSoundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCodeConfigShrink)) {
            body.put("SoundCodeConfig", request.soundCodeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            body.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechType)) {
            body.put("SpeechType", request.speechType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("Volume", request.volume);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestSpeechResponse());
    }

    public TestSpeechResponse testSpeech(TestSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testSpeechWithOptions(request, runtime);
    }

    public TransformClientIdResponse transformClientIdWithOptions(TransformClientIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformClientId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformClientIdResponse());
    }

    public TransformClientIdResponse transformClientId(TransformClientIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transformClientIdWithOptions(request, runtime);
    }

    public TriggerSceneRuleResponse triggerSceneRuleWithOptions(TriggerSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerSceneRuleResponse());
    }

    public TriggerSceneRuleResponse triggerSceneRule(TriggerSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerSceneRuleWithOptions(request, runtime);
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstanceWithOptions(UnbindApplicationFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindApplicationFromEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindApplicationFromEdgeInstanceResponse());
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindApplicationFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstanceWithOptions(UnbindDriverFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDriverFromEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDriverFromEdgeInstanceResponse());
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDriverFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstanceWithOptions(UnbindRoleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindRoleFromEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindRoleFromEdgeInstanceResponse());
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindRoleFromEdgeInstanceWithOptions(request, runtime);
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstanceWithOptions(UnbindSceneRuleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSceneRuleFromEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSceneRuleFromEdgeInstanceResponse());
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSceneRuleFromEdgeInstanceWithOptions(request, runtime);
    }

    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(UpdateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newGroupName)) {
            query.put("NewGroupName", request.newGroupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerGroupResponse());
    }

    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConsumerGroupWithOptions(request, runtime);
    }

    public UpdateDeviceGroupResponse updateDeviceGroupWithOptions(UpdateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupDesc)) {
            query.put("GroupDesc", request.groupDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceGroupResponse());
    }

    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceGroupWithOptions(request, runtime);
    }

    public UpdateDeviceShadowResponse updateDeviceShadowWithOptions(UpdateDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deltaUpdate)) {
            query.put("DeltaUpdate", request.deltaUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shadowMessage)) {
            query.put("ShadowMessage", request.shadowMessage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceShadow"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceShadowResponse());
    }

    public UpdateDeviceShadowResponse updateDeviceShadow(UpdateDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceShadowWithOptions(request, runtime);
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersionWithOptions(UpdateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argument)) {
            query.put("Argument", request.argument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configCheckRule)) {
            query.put("ConfigCheckRule", request.configCheckRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerConfig)) {
            query.put("ContainerConfig", request.containerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverConfig)) {
            query.put("DriverConfig", request.driverConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverVersion)) {
            query.put("DriverVersion", request.driverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeVersion)) {
            query.put("EdgeVersion", request.edgeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceConfig)) {
            query.put("SourceConfig", request.sourceConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeDriverVersion"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeDriverVersionResponse());
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeDriverVersionWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceResponse updateEdgeInstanceWithOptions(UpdateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizEnable)) {
            query.put("BizEnable", request.bizEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeInstanceResponse());
    }

    public UpdateEdgeInstanceResponse updateEdgeInstance(UpdateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannelWithOptions(UpdateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            query.put("ChannelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            query.put("Configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driverId)) {
            query.put("DriverId", request.driverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeInstanceChannel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeInstanceChannelResponse());
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceChannelWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceMessageRoutingResponse updateEdgeInstanceMessageRoutingWithOptions(UpdateEdgeInstanceMessageRoutingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceData)) {
            query.put("SourceData", request.sourceData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetData)) {
            query.put("TargetData", request.targetData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIotHubQos)) {
            query.put("TargetIotHubQos", request.targetIotHubQos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicFilter)) {
            query.put("TopicFilter", request.topicFilter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeInstanceMessageRouting"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeInstanceMessageRoutingResponse());
    }

    public UpdateEdgeInstanceMessageRoutingResponse updateEdgeInstanceMessageRouting(UpdateEdgeInstanceMessageRoutingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceMessageRoutingWithOptions(request, runtime);
    }

    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateJobShrinkRequest request = new UpdateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rolloutConfig)) {
            request.rolloutConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rolloutConfig, "RolloutConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timeoutConfig)) {
            request.timeoutConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timeoutConfig, "TimeoutConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolloutConfigShrink)) {
            query.put("RolloutConfig", request.rolloutConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutConfigShrink)) {
            query.put("TimeoutConfig", request.timeoutConfigShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateJobWithOptions(request, runtime);
    }

    public UpdateOTAModuleResponse updateOTAModuleWithOptions(UpdateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOTAModule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOTAModuleResponse());
    }

    public UpdateOTAModuleResponse updateOTAModule(UpdateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOTAModuleWithOptions(request, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfigWithOptions(UpdateProductFilterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyTimestampFilter)) {
            query.put("PropertyTimestampFilter", request.propertyTimestampFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValueFilter)) {
            query.put("PropertyValueFilter", request.propertyValueFilter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductFilterConfig"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductFilterConfigResponse());
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfig(UpdateProductFilterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductFilterConfigWithOptions(request, runtime);
    }

    public UpdateProductTagsResponse updateProductTagsWithOptions(UpdateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTag)) {
            query.put("ProductTag", request.productTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductTags"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductTagsResponse());
    }

    public UpdateProductTagsResponse updateProductTags(UpdateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTagsWithOptions(request, runtime);
    }

    public UpdateProductTopicResponse updateProductTopicWithOptions(UpdateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("TopicId", request.topicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicShortName)) {
            query.put("TopicShortName", request.topicShortName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProductTopic"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductTopicResponse());
    }

    public UpdateProductTopicResponse updateProductTopic(UpdateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTopicWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDesc)) {
            query.put("RuleDesc", request.ruleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.select)) {
            query.put("Select", request.select);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortTopic)) {
            query.put("ShortTopic", request.shortTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicType)) {
            query.put("TopicType", request.topicType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.where)) {
            query.put("Where", request.where);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateRuleActionResponse updateRuleActionWithOptions(UpdateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionId)) {
            query.put("ActionId", request.actionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            query.put("Configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleAction"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleActionResponse());
    }

    public UpdateRuleActionResponse updateRuleAction(UpdateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleActionWithOptions(request, runtime);
    }

    public UpdateSceneRuleResponse updateSceneRuleWithOptions(UpdateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleContent)) {
            query.put("RuleContent", request.ruleContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDescription)) {
            query.put("RuleDescription", request.ruleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSceneRule"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSceneRuleResponse());
    }

    public UpdateSceneRuleResponse updateSceneRule(UpdateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSceneRuleWithOptions(request, runtime);
    }

    public UpdateSpeechResponse updateSpeechWithOptions(UpdateSpeechRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSpeechShrinkRequest request = new UpdateSpeechShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.soundCodeConfig)) {
            request.soundCodeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.soundCodeConfig, "SoundCodeConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableSoundCode)) {
            body.put("EnableSoundCode", request.enableSoundCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            body.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("ProjectCode", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soundCodeConfigShrink)) {
            body.put("SoundCodeConfig", request.soundCodeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechCode)) {
            body.put("SpeechCode", request.speechCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            body.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("Volume", request.volume);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSpeech"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSpeechResponse());
    }

    public UpdateSpeechResponse updateSpeech(UpdateSpeechRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpeechWithOptions(request, runtime);
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelationWithOptions(UpdateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupIds)) {
            query.put("ConsumerGroupIds", request.consumerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDataFlag)) {
            query.put("DeviceDataFlag", request.deviceDataFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceLifeCycleFlag)) {
            query.put("DeviceLifeCycleFlag", request.deviceLifeCycleFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatusChangeFlag)) {
            query.put("DeviceStatusChangeFlag", request.deviceStatusChangeFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTagFlag)) {
            query.put("DeviceTagFlag", request.deviceTagFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTopoLifeCycleFlag)) {
            query.put("DeviceTopoLifeCycleFlag", request.deviceTopoLifeCycleFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foundDeviceListFlag)) {
            query.put("FoundDeviceListFlag", request.foundDeviceListFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsConfiguration)) {
            query.put("MnsConfiguration", request.mnsConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaEventFlag)) {
            query.put("OtaEventFlag", request.otaEventFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaJobFlag)) {
            query.put("OtaJobFlag", request.otaJobFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaVersionFlag)) {
            query.put("OtaVersionFlag", request.otaVersionFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thingHistoryFlag)) {
            query.put("ThingHistoryFlag", request.thingHistoryFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscribeRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscribeRelationResponse());
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelation(UpdateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscribeRelationWithOptions(request, runtime);
    }

    public UpdateThingModelResponse updateThingModelWithOptions(UpdateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockId)) {
            query.put("FunctionBlockId", request.functionBlockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionBlockName)) {
            query.put("FunctionBlockName", request.functionBlockName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thingModelJson)) {
            query.put("ThingModelJson", request.thingModelJson);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateThingModel"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateThingModelResponse());
    }

    public UpdateThingModelResponse updateThingModel(UpdateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingModelWithOptions(request, runtime);
    }

    public UpdateThingScriptResponse updateThingScriptWithOptions(UpdateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            query.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateThingScript"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateThingScriptResponse());
    }

    public UpdateThingScriptResponse updateThingScript(UpdateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingScriptWithOptions(request, runtime);
    }
}
