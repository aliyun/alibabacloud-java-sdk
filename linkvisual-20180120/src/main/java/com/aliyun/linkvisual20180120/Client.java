// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120;

import com.aliyun.tea.*;
import com.aliyun.linkvisual20180120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkvisual.aliyuncs.com"),
            new TeaPair("me-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("us-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("us-west-1", "linkvisual.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkvisual", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDeviceWithOptions(AddEventRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEventRecordPlanDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEventRecordPlanDeviceResponse());
    }

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public AddFaceDeviceGroupResponse addFaceDeviceGroupWithOptions(AddFaceDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupName)) {
            query.put("DeviceGroupName", request.deviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceDeviceGroupResponse());
    }

    public AddFaceDeviceGroupResponse addFaceDeviceGroup(AddFaceDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceDeviceGroupWithOptions(request, runtime);
    }

    public AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroupWithOptions(AddFaceDeviceToDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceDeviceToDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceDeviceToDeviceGroupResponse());
    }

    public AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceDeviceToDeviceGroupWithOptions(request, runtime);
    }

    public AddFaceUserResponse addFaceUserWithOptions(AddFaceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePicUrl)) {
            query.put("FacePicUrl", request.facePicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceUser"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceUserResponse());
    }

    public AddFaceUserResponse addFaceUser(AddFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserWithOptions(request, runtime);
    }

    public AddFaceUserGroupResponse addFaceUserGroupWithOptions(AddFaceUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceUserGroupResponse());
    }

    public AddFaceUserGroupResponse addFaceUserGroup(AddFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserGroupWithOptions(request, runtime);
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelationWithOptions(AddFaceUserGroupAndDeviceGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relation)) {
            query.put("Relation", request.relation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceUserGroupAndDeviceGroupRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public AddFaceUserPictureResponse addFaceUserPictureWithOptions(AddFaceUserPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePicUrl)) {
            query.put("FacePicUrl", request.facePicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceUserPicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceUserPictureResponse());
    }

    public AddFaceUserPictureResponse addFaceUserPicture(AddFaceUserPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserPictureWithOptions(request, runtime);
    }

    public AddFaceUserToUserGroupResponse addFaceUserToUserGroupWithOptions(AddFaceUserToUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFaceUserToUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFaceUserToUserGroupResponse());
    }

    public AddFaceUserToUserGroupResponse addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserToUserGroupWithOptions(request, runtime);
    }

    public AddRecordPlanDeviceResponse addRecordPlanDeviceWithOptions(AddRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecordPlanDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecordPlanDeviceResponse());
    }

    public AddRecordPlanDeviceResponse addRecordPlanDevice(AddRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordPlanDeviceWithOptions(request, runtime);
    }

    public BatchQueryVisionDeviceInfoResponse batchQueryVisionDeviceInfoWithOptions(BatchQueryVisionDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameList)) {
            query.put("DeviceNameList", request.deviceNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdList)) {
            query.put("IotIdList", request.iotIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryVisionDeviceInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryVisionDeviceInfoResponse());
    }

    public BatchQueryVisionDeviceInfoResponse batchQueryVisionDeviceInfo(BatchQueryVisionDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryVisionDeviceInfoWithOptions(request, runtime);
    }

    public BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevicesWithOptions(BindPictureSearchAppWithDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIotIds)) {
            query.put("DeviceIotIds", request.deviceIotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPictureSearchAppWithDevices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPictureSearchAppWithDevicesResponse());
    }

    public BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    public CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDeviceWithOptions(CheckFaceUserDoExistOnDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFaceUserDoExistOnDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFaceUserDoExistOnDeviceResponse());
    }

    public CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFaceUserDoExistOnDeviceWithOptions(request, runtime);
    }

    public ClearFaceDeviceDBResponse clearFaceDeviceDBWithOptions(ClearFaceDeviceDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearFaceDeviceDB"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearFaceDeviceDBResponse());
    }

    public ClearFaceDeviceDBResponse clearFaceDeviceDB(ClearFaceDeviceDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearFaceDeviceDBWithOptions(request, runtime);
    }

    public CreateEventRecordPlanResponse createEventRecordPlanWithOptions(CreateEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventTypes)) {
            query.put("EventTypes", request.eventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preRecordDuration)) {
            query.put("PreRecordDuration", request.preRecordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordDuration)) {
            query.put("RecordDuration", request.recordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventRecordPlanResponse());
    }

    public CreateEventRecordPlanResponse createEventRecordPlan(CreateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventRecordPlanWithOptions(request, runtime);
    }

    public CreateGbDeviceResponse createGbDeviceWithOptions(CreateGbDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaNetProtocol)) {
            query.put("MediaNetProtocol", request.mediaNetProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subProductKey)) {
            query.put("SubProductKey", request.subProductKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGbDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGbDeviceResponse());
    }

    public CreateGbDeviceResponse createGbDevice(CreateGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGbDeviceWithOptions(request, runtime);
    }

    public CreateLocalFileUploadJobResponse createLocalFileUploadJobWithOptions(CreateLocalFileUploadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeSlot)) {
            query.put("TimeSlot", request.timeSlot);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLocalFileUploadJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLocalFileUploadJobResponse());
    }

    public CreateLocalFileUploadJobResponse createLocalFileUploadJob(CreateLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocalFileUploadJobWithOptions(request, runtime);
    }

    public CreateLocalRecordDownloadByTimeJobResponse createLocalRecordDownloadByTimeJobWithOptions(CreateLocalRecordDownloadByTimeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLocalRecordDownloadByTimeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLocalRecordDownloadByTimeJobResponse());
    }

    public CreateLocalRecordDownloadByTimeJobResponse createLocalRecordDownloadByTimeJob(CreateLocalRecordDownloadByTimeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocalRecordDownloadByTimeJobWithOptions(request, runtime);
    }

    public CreatePictureSearchAppResponse createPictureSearchAppWithOptions(CreatePictureSearchAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePictureSearchApp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePictureSearchAppResponse());
    }

    public CreatePictureSearchAppResponse createPictureSearchApp(CreatePictureSearchAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPictureSearchAppWithOptions(request, runtime);
    }

    public CreatePictureSearchJobResponse createPictureSearchJobWithOptions(CreatePictureSearchJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyThreshold)) {
            query.put("BodyThreshold", request.bodyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureSearchType)) {
            query.put("PictureSearchType", request.pictureSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPicUrl)) {
            query.put("SearchPicUrl", request.searchPicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePictureSearchJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePictureSearchJobResponse());
    }

    public CreatePictureSearchJobResponse createPictureSearchJob(CreatePictureSearchJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPictureSearchJobWithOptions(request, runtime);
    }

    public CreateRecordDownloadByTimeJobResponse createRecordDownloadByTimeJobWithOptions(CreateRecordDownloadByTimeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.recordType)) {
            query.put("RecordType", request.recordType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecordDownloadByTimeJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecordDownloadByTimeJobResponse());
    }

    public CreateRecordDownloadByTimeJobResponse createRecordDownloadByTimeJob(CreateRecordDownloadByTimeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordDownloadByTimeJobWithOptions(request, runtime);
    }

    public CreateRecordPlanResponse createRecordPlanWithOptions(CreateRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecordPlanResponse());
    }

    public CreateRecordPlanResponse createRecordPlan(CreateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordPlanWithOptions(request, runtime);
    }

    public CreateRtmpDeviceResponse createRtmpDeviceWithOptions(CreateRtmpDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pullAuthKey)) {
            query.put("PullAuthKey", request.pullAuthKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullKeyExpireTime)) {
            query.put("PullKeyExpireTime", request.pullKeyExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAuthKey)) {
            query.put("PushAuthKey", request.pushAuthKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushKeyExpireTime)) {
            query.put("PushKeyExpireTime", request.pushKeyExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subStreamName)) {
            query.put("SubStreamName", request.subStreamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRtmpDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRtmpDeviceResponse());
    }

    public CreateRtmpDeviceResponse createRtmpDevice(CreateRtmpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRtmpDeviceWithOptions(request, runtime);
    }

    public CreateStreamPushJobResponse createStreamPushJobWithOptions(CreateStreamPushJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushUrl)) {
            query.put("PushUrl", request.pushUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamPushJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamPushJobResponse());
    }

    public CreateStreamPushJobResponse createStreamPushJob(CreateStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamPushJobWithOptions(request, runtime);
    }

    public CreateStreamSnapshotJobResponse createStreamSnapshotJobWithOptions(CreateStreamSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotInterval)) {
            query.put("SnapshotInterval", request.snapshotInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamSnapshotJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamSnapshotJobResponse());
    }

    public CreateStreamSnapshotJobResponse createStreamSnapshotJob(CreateStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamSnapshotJobWithOptions(request, runtime);
    }

    public CreateTimeTemplateResponse createTimeTemplateWithOptions(CreateTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allDay)) {
            query.put("AllDay", request.allDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeSections)) {
            query.put("TimeSections", request.timeSections);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTimeTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTimeTemplateResponse());
    }

    public CreateTimeTemplateResponse createTimeTemplate(CreateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTimeTemplateWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlanWithOptions(DeleteEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRecordPlanResponse());
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlan(DeleteEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDeviceWithOptions(DeleteEventRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventRecordPlanDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRecordPlanDeviceResponse());
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteFaceDeviceGroupResponse deleteFaceDeviceGroupWithOptions(DeleteFaceDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceDeviceGroupResponse());
    }

    public DeleteFaceDeviceGroupResponse deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceDeviceGroupWithOptions(request, runtime);
    }

    public DeleteFaceUserResponse deleteFaceUserWithOptions(DeleteFaceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceUser"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceUserResponse());
    }

    public DeleteFaceUserResponse deleteFaceUser(DeleteFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserWithOptions(request, runtime);
    }

    public DeleteFaceUserGroupResponse deleteFaceUserGroupWithOptions(DeleteFaceUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceUserGroupResponse());
    }

    public DeleteFaceUserGroupResponse deleteFaceUserGroup(DeleteFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserGroupWithOptions(request, runtime);
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse deleteFaceUserGroupAndDeviceGroupRelationWithOptions(DeleteFaceUserGroupAndDeviceGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlId)) {
            query.put("ControlId", request.controlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceUserGroupAndDeviceGroupRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public DeleteFaceUserPictureResponse deleteFaceUserPictureWithOptions(DeleteFaceUserPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePicMd5)) {
            query.put("FacePicMd5", request.facePicMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceUserPicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceUserPictureResponse());
    }

    public DeleteFaceUserPictureResponse deleteFaceUserPicture(DeleteFaceUserPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserPictureWithOptions(request, runtime);
    }

    public DeleteGbDeviceResponse deleteGbDeviceWithOptions(DeleteGbDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGbDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGbDeviceResponse());
    }

    public DeleteGbDeviceResponse deleteGbDevice(DeleteGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGbDeviceWithOptions(request, runtime);
    }

    public DeleteLocalFileUploadJobResponse deleteLocalFileUploadJobWithOptions(DeleteLocalFileUploadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLocalFileUploadJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLocalFileUploadJobResponse());
    }

    public DeleteLocalFileUploadJobResponse deleteLocalFileUploadJob(DeleteLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLocalFileUploadJobWithOptions(request, runtime);
    }

    public DeletePictureResponse deletePictureWithOptions(DeletePictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.pictureIdList)) {
            query.put("PictureIdList", request.pictureIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePictureResponse());
    }

    public DeletePictureResponse deletePicture(DeletePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePictureWithOptions(request, runtime);
    }

    public DeleteRecordResponse deleteRecordWithOptions(DeleteRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameList)) {
            query.put("FileNameList", request.fileNameList);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordResponse());
    }

    public DeleteRecordResponse deleteRecord(DeleteRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordWithOptions(request, runtime);
    }

    public DeleteRecordPlanResponse deleteRecordPlanWithOptions(DeleteRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordPlanResponse());
    }

    public DeleteRecordPlanResponse deleteRecordPlan(DeleteRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanWithOptions(request, runtime);
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDeviceWithOptions(DeleteRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecordPlanDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordPlanDeviceResponse());
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteRtmpDeviceResponse deleteRtmpDeviceWithOptions(DeleteRtmpDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRtmpDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRtmpDeviceResponse());
    }

    public DeleteRtmpDeviceResponse deleteRtmpDevice(DeleteRtmpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRtmpDeviceWithOptions(request, runtime);
    }

    public DeleteRtmpKeyResponse deleteRtmpKeyWithOptions(DeleteRtmpKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRtmpKey"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRtmpKeyResponse());
    }

    public DeleteRtmpKeyResponse deleteRtmpKey(DeleteRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRtmpKeyWithOptions(request, runtime);
    }

    public DeleteStreamPushJobResponse deleteStreamPushJobWithOptions(DeleteStreamPushJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStreamPushJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamPushJobResponse());
    }

    public DeleteStreamPushJobResponse deleteStreamPushJob(DeleteStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamPushJobWithOptions(request, runtime);
    }

    public DeleteStreamSnapshotJobResponse deleteStreamSnapshotJobWithOptions(DeleteStreamSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStreamSnapshotJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamSnapshotJobResponse());
    }

    public DeleteStreamSnapshotJobResponse deleteStreamSnapshotJob(DeleteStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamSnapshotJobWithOptions(request, runtime);
    }

    public DeleteTimeTemplateResponse deleteTimeTemplateWithOptions(DeleteTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTimeTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTimeTemplateResponse());
    }

    public DeleteTimeTemplateResponse deleteTimeTemplate(DeleteTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTimeTemplateWithOptions(request, runtime);
    }

    public DetectUserFaceByUrlResponse detectUserFaceByUrlWithOptions(DetectUserFaceByUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.facePicUrl)) {
            query.put("FacePicUrl", request.facePicUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectUserFaceByUrl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectUserFaceByUrlResponse());
    }

    public DetectUserFaceByUrlResponse detectUserFaceByUrl(DetectUserFaceByUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectUserFaceByUrlWithOptions(request, runtime);
    }

    public EnableGbSubDeviceResponse enableGbSubDeviceWithOptions(EnableGbSubDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceId)) {
            query.put("SubDeviceId", request.subDeviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableGbSubDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableGbSubDeviceResponse());
    }

    public EnableGbSubDeviceResponse enableGbSubDevice(EnableGbSubDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableGbSubDeviceWithOptions(request, runtime);
    }

    public GetPictureSearchJobStatusResponse getPictureSearchJobStatusWithOptions(GetPictureSearchJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPictureSearchJobStatus"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPictureSearchJobStatusResponse());
    }

    public GetPictureSearchJobStatusResponse getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPictureSearchJobStatusWithOptions(request, runtime);
    }

    public PictureSearchPictureResponse pictureSearchPictureWithOptions(PictureSearchPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containPicUrl)) {
            query.put("ContainPicUrl", request.containPicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureSearchType)) {
            query.put("PictureSearchType", request.pictureSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPicUrl)) {
            query.put("SearchPicUrl", request.searchPicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PictureSearchPicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PictureSearchPictureResponse());
    }

    public PictureSearchPictureResponse pictureSearchPicture(PictureSearchPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pictureSearchPictureWithOptions(request, runtime);
    }

    public QueryCarProcessEventsResponse queryCarProcessEventsWithOptions(QueryCarProcessEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaIndex)) {
            query.put("AreaIndex", request.areaIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            query.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceName)) {
            query.put("SubDeviceName", request.subDeviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subIotId)) {
            query.put("SubIotId", request.subIotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subProductKey)) {
            query.put("SubProductKey", request.subProductKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCarProcessEvents"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCarProcessEventsResponse());
    }

    public QueryCarProcessEventsResponse queryCarProcessEvents(QueryCarProcessEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCarProcessEventsWithOptions(request, runtime);
    }

    public QueryDeviceEventResponse queryDeviceEventWithOptions(QueryDeviceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceEvent"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceEventResponse());
    }

    public QueryDeviceEventResponse queryDeviceEvent(QueryDeviceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventWithOptions(request, runtime);
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPictureWithOptions(QueryDeviceEventPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceEventPicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceEventPictureResponse());
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPicture(QueryDeviceEventPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventPictureWithOptions(request, runtime);
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecordWithOptions(QueryDeviceEventRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceEventRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceEventRecordResponse());
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecord(QueryDeviceEventRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventRecordWithOptions(request, runtime);
    }

    public QueryDevicePictureByListResponse queryDevicePictureByListWithOptions(QueryDevicePictureByListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureIdList)) {
            query.put("PictureIdList", request.pictureIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureType)) {
            query.put("PictureType", request.pictureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbWidth)) {
            query.put("ThumbWidth", request.thumbWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePictureByList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePictureByListResponse());
    }

    public QueryDevicePictureByListResponse queryDevicePictureByList(QueryDevicePictureByListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureByListWithOptions(request, runtime);
    }

    public QueryDevicePictureFileResponse queryDevicePictureFileWithOptions(QueryDevicePictureFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.captureId)) {
            query.put("CaptureId", request.captureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureType)) {
            query.put("PictureType", request.pictureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbWidth)) {
            query.put("ThumbWidth", request.thumbWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePictureFile"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePictureFileResponse());
    }

    public QueryDevicePictureFileResponse queryDevicePictureFile(QueryDevicePictureFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureFileWithOptions(request, runtime);
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycleWithOptions(QueryDevicePictureLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePictureLifeCycle"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePictureLifeCycleResponse());
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycleWithOptions(QueryDeviceRecordLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceList)) {
            query.put("DeviceList", request.deviceList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceRecordLifeCycle"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceRecordLifeCycleResponse());
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrlWithOptions(QueryDeviceVodUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStun)) {
            query.put("EnableStun", request.enableStun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playUnLimited)) {
            query.put("PlayUnLimited", request.playUnLimited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheme)) {
            query.put("Scheme", request.scheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seekTime)) {
            query.put("SeekTime", request.seekTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldEncrypt)) {
            query.put("ShouldEncrypt", request.shouldEncrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlValidDuration)) {
            query.put("UrlValidDuration", request.urlValidDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceVodUrl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceVodUrlResponse());
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrl(QueryDeviceVodUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceVodUrlWithOptions(request, runtime);
    }

    public QueryDeviceVodUrlByTimeResponse queryDeviceVodUrlByTimeWithOptions(QueryDeviceVodUrlByTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStun)) {
            query.put("EnableStun", request.enableStun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playUnLimited)) {
            query.put("PlayUnLimited", request.playUnLimited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheme)) {
            query.put("Scheme", request.scheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seekTime)) {
            query.put("SeekTime", request.seekTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldEncrypt)) {
            query.put("ShouldEncrypt", request.shouldEncrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlValidDuration)) {
            query.put("UrlValidDuration", request.urlValidDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceVodUrlByTime"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceVodUrlByTimeResponse());
    }

    public QueryDeviceVodUrlByTimeResponse queryDeviceVodUrlByTime(QueryDeviceVodUrlByTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceVodUrlByTimeWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetailWithOptions(QueryEventRecordPlanDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventRecordPlanDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventRecordPlanDetailResponse());
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDetailWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDeviceWithOptions(QueryEventRecordPlanDeviceByDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventRecordPlanDeviceByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventRecordPlanDeviceByDeviceResponse());
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlanWithOptions(QueryEventRecordPlanDeviceByPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventRecordPlanDeviceByPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventRecordPlanDeviceByPlanResponse());
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlansResponse queryEventRecordPlansWithOptions(QueryEventRecordPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEventRecordPlans"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEventRecordPlansResponse());
    }

    public QueryEventRecordPlansResponse queryEventRecordPlans(QueryEventRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlansWithOptions(request, runtime);
    }

    public QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroupWithOptions(QueryFaceAllDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceAllDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceAllDeviceGroupResponse());
    }

    public QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllDeviceGroupWithOptions(request, runtime);
    }

    public QueryFaceAllUserGroupResponse queryFaceAllUserGroupWithOptions(QueryFaceAllUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceAllUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceAllUserGroupResponse());
    }

    public QueryFaceAllUserGroupResponse queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserGroupWithOptions(request, runtime);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelationWithOptions(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceAllUserGroupAndDeviceGroupRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceAllUserGroupAndDeviceGroupRelationResponse());
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupIdWithOptions(QueryFaceAllUserIdsByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceAllUserIdsByGroupId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceAllUserIdsByGroupIdResponse());
    }

    public QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserIdsByGroupIdWithOptions(request, runtime);
    }

    public QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserIdWithOptions(QueryFaceCustomUserIdByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceCustomUserIdByUserId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceCustomUserIdByUserIdResponse());
    }

    public QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceCustomUserIdByUserIdWithOptions(request, runtime);
    }

    public QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDeviceWithOptions(QueryFaceDeviceGroupsByDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceDeviceGroupsByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceDeviceGroupsByDeviceResponse());
    }

    public QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceDeviceGroupsByDeviceWithOptions(request, runtime);
    }

    public QueryFaceUserResponse queryFaceUserWithOptions(QueryFaceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUser"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserResponse());
    }

    public QueryFaceUserResponse queryFaceUser(QueryFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserWithOptions(request, runtime);
    }

    public QueryFaceUserBatchResponse queryFaceUserBatchWithOptions(QueryFaceUserBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUserBatch"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserBatchResponse());
    }

    public QueryFaceUserBatchResponse queryFaceUserBatch(QueryFaceUserBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserBatchWithOptions(request, runtime);
    }

    public QueryFaceUserByNameResponse queryFaceUserByNameWithOptions(QueryFaceUserByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUserByName"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserByNameResponse());
    }

    public QueryFaceUserByNameResponse queryFaceUserByName(QueryFaceUserByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserByNameWithOptions(request, runtime);
    }

    public QueryFaceUserGroupResponse queryFaceUserGroupWithOptions(QueryFaceUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserGroupResponse());
    }

    public QueryFaceUserGroupResponse queryFaceUserGroup(QueryFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserGroupWithOptions(request, runtime);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelationWithOptions(QueryFaceUserGroupAndDeviceGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlId)) {
            query.put("ControlId", request.controlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUserGroupAndDeviceGroupRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserIdWithOptions(QueryFaceUserIdByCustomUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFaceUserIdByCustomUserId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceUserIdByCustomUserIdResponse());
    }

    public QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserIdByCustomUserIdWithOptions(request, runtime);
    }

    public QueryGbSubDeviceListResponse queryGbSubDeviceListWithOptions(QueryGbSubDeviceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("PageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGbSubDeviceList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGbSubDeviceListResponse());
    }

    public QueryGbSubDeviceListResponse queryGbSubDeviceList(QueryGbSubDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGbSubDeviceListWithOptions(request, runtime);
    }

    public QueryLiveStreamingResponse queryLiveStreamingWithOptions(QueryLiveStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheDuration)) {
            query.put("CacheDuration", request.cacheDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStun)) {
            query.put("EnableStun", request.enableStun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceIFrame)) {
            query.put("ForceIFrame", request.forceIFrame);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playUnLimited)) {
            query.put("PlayUnLimited", request.playUnLimited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheme)) {
            query.put("Scheme", request.scheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldEncrypt)) {
            query.put("ShouldEncrypt", request.shouldEncrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlValidDuration)) {
            query.put("UrlValidDuration", request.urlValidDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLiveStreaming"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLiveStreamingResponse());
    }

    public QueryLiveStreamingResponse queryLiveStreaming(QueryLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLiveStreamingWithOptions(request, runtime);
    }

    public QueryLocalFileUploadJobResponse queryLocalFileUploadJobWithOptions(QueryLocalFileUploadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLocalFileUploadJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLocalFileUploadJobResponse());
    }

    public QueryLocalFileUploadJobResponse queryLocalFileUploadJob(QueryLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocalFileUploadJobWithOptions(request, runtime);
    }

    public QueryMonthRecordResponse queryMonthRecordWithOptions(QueryMonthRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            query.put("Month", request.month);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonthRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonthRecordResponse());
    }

    public QueryMonthRecordResponse queryMonthRecord(QueryMonthRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthRecordWithOptions(request, runtime);
    }

    public QueryPictureFilesResponse queryPictureFilesWithOptions(QueryPictureFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pictureSource)) {
            query.put("PictureSource", request.pictureSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureType)) {
            query.put("PictureType", request.pictureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureFiles"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureFilesResponse());
    }

    public QueryPictureFilesResponse queryPictureFiles(QueryPictureFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureFilesWithOptions(request, runtime);
    }

    public QueryPictureSearchAiboxesResponse queryPictureSearchAiboxesWithOptions(QueryPictureSearchAiboxesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureSearchAiboxes"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureSearchAiboxesResponse());
    }

    public QueryPictureSearchAiboxesResponse queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchAiboxesWithOptions(request, runtime);
    }

    public QueryPictureSearchAppsResponse queryPictureSearchAppsWithOptions(QueryPictureSearchAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureSearchApps"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureSearchAppsResponse());
    }

    public QueryPictureSearchAppsResponse queryPictureSearchApps(QueryPictureSearchAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchAppsWithOptions(request, runtime);
    }

    public QueryPictureSearchDevicesResponse queryPictureSearchDevicesWithOptions(QueryPictureSearchDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureSearchDevices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureSearchDevicesResponse());
    }

    public QueryPictureSearchDevicesResponse queryPictureSearchDevices(QueryPictureSearchDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchDevicesWithOptions(request, runtime);
    }

    public QueryPictureSearchJobResponse queryPictureSearchJobWithOptions(QueryPictureSearchJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStatus)) {
            query.put("JobStatus", request.jobStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureSearchJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureSearchJobResponse());
    }

    public QueryPictureSearchJobResponse queryPictureSearchJob(QueryPictureSearchJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchJobWithOptions(request, runtime);
    }

    public QueryPictureSearchJobResultResponse queryPictureSearchJobResultWithOptions(QueryPictureSearchJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPictureSearchJobResult"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPictureSearchJobResultResponse());
    }

    public QueryPictureSearchJobResultResponse queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchJobResultWithOptions(request, runtime);
    }

    public QueryRecordResponse queryRecordWithOptions(QueryRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSnapshot)) {
            query.put("NeedSnapshot", request.needSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordType)) {
            query.put("RecordType", request.recordType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordResponse());
    }

    public QueryRecordResponse queryRecord(QueryRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordWithOptions(request, runtime);
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordIdWithOptions(QueryRecordByRecordIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordByRecordId"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordByRecordIdResponse());
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordId(QueryRecordByRecordIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordByRecordIdWithOptions(request, runtime);
    }

    public QueryRecordDownloadJobByIdResponse queryRecordDownloadJobByIdWithOptions(QueryRecordDownloadJobByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordDownloadJobById"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordDownloadJobByIdResponse());
    }

    public QueryRecordDownloadJobByIdResponse queryRecordDownloadJobById(QueryRecordDownloadJobByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadJobByIdWithOptions(request, runtime);
    }

    public QueryRecordDownloadJobListResponse queryRecordDownloadJobListWithOptions(QueryRecordDownloadJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordDownloadJobList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordDownloadJobListResponse());
    }

    public QueryRecordDownloadJobListResponse queryRecordDownloadJobList(QueryRecordDownloadJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadJobListWithOptions(request, runtime);
    }

    public QueryRecordDownloadUrlResponse queryRecordDownloadUrlWithOptions(QueryRecordDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordDownloadUrl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordDownloadUrlResponse());
    }

    public QueryRecordDownloadUrlResponse queryRecordDownloadUrl(QueryRecordDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadUrlWithOptions(request, runtime);
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetailWithOptions(QueryRecordPlanDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordPlanDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordPlanDetailResponse());
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetail(QueryRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDetailWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDeviceWithOptions(QueryRecordPlanDeviceByDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordPlanDeviceByDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordPlanDeviceByDeviceResponse());
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlanWithOptions(QueryRecordPlanDeviceByPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordPlanDeviceByPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordPlanDeviceByPlanResponse());
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public QueryRecordPlansResponse queryRecordPlansWithOptions(QueryRecordPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordPlans"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordPlansResponse());
    }

    public QueryRecordPlansResponse queryRecordPlans(QueryRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlansWithOptions(request, runtime);
    }

    public QueryRecordUrlResponse queryRecordUrlWithOptions(QueryRecordUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.seekTime)) {
            query.put("SeekTime", request.seekTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlValidDuration)) {
            query.put("UrlValidDuration", request.urlValidDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordUrl"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordUrlResponse());
    }

    public QueryRecordUrlResponse queryRecordUrl(QueryRecordUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordUrlWithOptions(request, runtime);
    }

    public QueryRecordUrlByTimeResponse queryRecordUrlByTimeWithOptions(QueryRecordUrlByTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlValidDuration)) {
            query.put("UrlValidDuration", request.urlValidDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordUrlByTime"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordUrlByTimeResponse());
    }

    public QueryRecordUrlByTimeResponse queryRecordUrlByTime(QueryRecordUrlByTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordUrlByTimeWithOptions(request, runtime);
    }

    public QueryRtmpKeyResponse queryRtmpKeyWithOptions(QueryRtmpKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRtmpKey"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRtmpKeyResponse());
    }

    public QueryRtmpKeyResponse queryRtmpKey(QueryRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRtmpKeyWithOptions(request, runtime);
    }

    public QueryStreamPushJobResponse queryStreamPushJobWithOptions(QueryStreamPushJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStreamPushJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStreamPushJobResponse());
    }

    public QueryStreamPushJobResponse queryStreamPushJob(QueryStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamPushJobWithOptions(request, runtime);
    }

    public QueryStreamPushJobListResponse queryStreamPushJobListWithOptions(QueryStreamPushJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStreamPushJobList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStreamPushJobListResponse());
    }

    public QueryStreamPushJobListResponse queryStreamPushJobList(QueryStreamPushJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamPushJobListWithOptions(request, runtime);
    }

    public QueryStreamSnapshotJobResponse queryStreamSnapshotJobWithOptions(QueryStreamSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStreamSnapshotJob"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStreamSnapshotJobResponse());
    }

    public QueryStreamSnapshotJobResponse queryStreamSnapshotJob(QueryStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamSnapshotJobWithOptions(request, runtime);
    }

    public QueryTimeTemplateResponse queryTimeTemplateWithOptions(QueryTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTimeTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTimeTemplateResponse());
    }

    public QueryTimeTemplateResponse queryTimeTemplate(QueryTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateWithOptions(request, runtime);
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetailWithOptions(QueryTimeTemplateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTimeTemplateDetail"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTimeTemplateDetailResponse());
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateDetailWithOptions(request, runtime);
    }

    public QueryVisionDeviceInfoResponse queryVisionDeviceInfoWithOptions(QueryVisionDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVisionDeviceInfo"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVisionDeviceInfoResponse());
    }

    public QueryVisionDeviceInfoResponse queryVisionDeviceInfo(QueryVisionDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVisionDeviceInfoWithOptions(request, runtime);
    }

    public QueryVoiceIntercomResponse queryVoiceIntercomWithOptions(QueryVoiceIntercomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheme)) {
            query.put("Scheme", request.scheme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVoiceIntercom"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVoiceIntercomResponse());
    }

    public QueryVoiceIntercomResponse queryVoiceIntercom(QueryVoiceIntercomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVoiceIntercomWithOptions(request, runtime);
    }

    public RefreshGbSubDeviceListResponse refreshGbSubDeviceListWithOptions(RefreshGbSubDeviceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshGbSubDeviceList"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshGbSubDeviceListResponse());
    }

    public RefreshGbSubDeviceListResponse refreshGbSubDeviceList(RefreshGbSubDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshGbSubDeviceListWithOptions(request, runtime);
    }

    public RemoveFaceDeviceFromDeviceGroupResponse removeFaceDeviceFromDeviceGroupWithOptions(RemoveFaceDeviceFromDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFaceDeviceFromDeviceGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFaceDeviceFromDeviceGroupResponse());
    }

    public RemoveFaceDeviceFromDeviceGroupResponse removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFaceDeviceFromDeviceGroupWithOptions(request, runtime);
    }

    public RemoveFaceUserFromUserGroupResponse removeFaceUserFromUserGroupWithOptions(RemoveFaceUserFromUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFaceUserFromUserGroup"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFaceUserFromUserGroupResponse());
    }

    public RemoveFaceUserFromUserGroupResponse removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFaceUserFromUserGroupWithOptions(request, runtime);
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycleWithOptions(SetDevicePictureLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.day)) {
            query.put("Day", request.day);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDevicePictureLifeCycle"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDevicePictureLifeCycleResponse());
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycleWithOptions(SetDeviceRecordLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.day)) {
            query.put("Day", request.day);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceRecordLifeCycle"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceRecordLifeCycleResponse());
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public StopLiveStreamingResponse stopLiveStreamingWithOptions(StopLiveStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLiveStreaming"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLiveStreamingResponse());
    }

    public StopLiveStreamingResponse stopLiveStreaming(StopLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLiveStreamingWithOptions(request, runtime);
    }

    public StopTriggeredRecordResponse stopTriggeredRecordWithOptions(StopTriggeredRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTriggeredRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTriggeredRecordResponse());
    }

    public StopTriggeredRecordResponse stopTriggeredRecord(StopTriggeredRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTriggeredRecordWithOptions(request, runtime);
    }

    public TransferDeviceInstanceResponse transferDeviceInstanceWithOptions(TransferDeviceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameList)) {
            query.put("DeviceNameList", request.deviceNameList);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferDeviceInstance"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferDeviceInstanceResponse());
    }

    public TransferDeviceInstanceResponse transferDeviceInstance(TransferDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferDeviceInstanceWithOptions(request, runtime);
    }

    public TriggerCapturePictureResponse triggerCapturePictureWithOptions(TriggerCapturePictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerCapturePicture"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerCapturePictureResponse());
    }

    public TriggerCapturePictureResponse triggerCapturePicture(TriggerCapturePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerCapturePictureWithOptions(request, runtime);
    }

    public TriggerRecordResponse triggerRecordWithOptions(TriggerRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.preRecordDuration)) {
            query.put("PreRecordDuration", request.preRecordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordDuration)) {
            query.put("RecordDuration", request.recordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerRecord"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerRecordResponse());
    }

    public TriggerRecordResponse triggerRecord(TriggerRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerRecordWithOptions(request, runtime);
    }

    public UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevicesWithOptions(UnbindPictureSearchAppWithDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIotIds)) {
            query.put("DeviceIotIds", request.deviceIotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindPictureSearchAppWithDevices"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindPictureSearchAppWithDevicesResponse());
    }

    public UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlanWithOptions(UpdateEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventTypes)) {
            query.put("EventTypes", request.eventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preRecordDuration)) {
            query.put("PreRecordDuration", request.preRecordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordDuration)) {
            query.put("RecordDuration", request.recordDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventRecordPlanResponse());
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlan(UpdateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventRecordPlanWithOptions(request, runtime);
    }

    public UpdateFaceUserResponse updateFaceUserWithOptions(UpdateFaceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePicUrl)) {
            query.put("FacePicUrl", request.facePicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFaceUser"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFaceUserResponse());
    }

    public UpdateFaceUserResponse updateFaceUser(UpdateFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceUserWithOptions(request, runtime);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelationWithOptions(UpdateFaceUserGroupAndDeviceGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlId)) {
            query.put("ControlId", request.controlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationId)) {
            query.put("IsolationId", request.isolationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relation)) {
            query.put("Relation", request.relation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFaceUserGroupAndDeviceGroupRelation"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public UpdateGbDeviceResponse updateGbDeviceWithOptions(UpdateGbDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGbDevice"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGbDeviceResponse());
    }

    public UpdateGbDeviceResponse updateGbDevice(UpdateGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGbDeviceWithOptions(request, runtime);
    }

    public UpdateInstanceInternetProtocolResponse updateInstanceInternetProtocolWithOptions(UpdateInstanceInternetProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotInstanceId)) {
            query.put("IotInstanceId", request.iotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceInternetProtocol"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceInternetProtocolResponse());
    }

    public UpdateInstanceInternetProtocolResponse updateInstanceInternetProtocol(UpdateInstanceInternetProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceInternetProtocolWithOptions(request, runtime);
    }

    public UpdatePictureSearchAppResponse updatePictureSearchAppWithOptions(UpdatePictureSearchAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePictureSearchApp"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePictureSearchAppResponse());
    }

    public UpdatePictureSearchAppResponse updatePictureSearchApp(UpdatePictureSearchAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePictureSearchAppWithOptions(request, runtime);
    }

    public UpdateRecordPlanResponse updateRecordPlanWithOptions(UpdateRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordPlan"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordPlanResponse());
    }

    public UpdateRecordPlanResponse updateRecordPlan(UpdateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordPlanWithOptions(request, runtime);
    }

    public UpdateRtmpKeyResponse updateRtmpKeyWithOptions(UpdateRtmpKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.pullAuthKey)) {
            query.put("PullAuthKey", request.pullAuthKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullKeyExpireTime)) {
            query.put("PullKeyExpireTime", request.pullKeyExpireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAuthKey)) {
            query.put("PushAuthKey", request.pushAuthKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushKeyExpireTime)) {
            query.put("PushKeyExpireTime", request.pushKeyExpireTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRtmpKey"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRtmpKeyResponse());
    }

    public UpdateRtmpKeyResponse updateRtmpKey(UpdateRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRtmpKeyWithOptions(request, runtime);
    }

    public UpdateTimeTemplateResponse updateTimeTemplateWithOptions(UpdateTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allDay)) {
            query.put("AllDay", request.allDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeSections)) {
            query.put("TimeSections", request.timeSections);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTimeTemplate"),
            new TeaPair("version", "2018-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTimeTemplateResponse());
    }

    public UpdateTimeTemplateResponse updateTimeTemplate(UpdateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTimeTemplateWithOptions(request, runtime);
    }
}
