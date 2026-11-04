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

    /**
     * <b>summary</b> : 
     * <p>Creates an intelligent alert event recording plan for an IP camera.</p>
     * 
     * @param request AddEventRecordPlanDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEventRecordPlanDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates an intelligent alert event recording plan for an IP camera.</p>
     * 
     * @param request AddEventRecordPlanDeviceRequest
     * @return AddEventRecordPlanDeviceResponse
     */
    public AddEventRecordPlanDeviceResponse addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEventRecordPlanDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the device group (<strong>DeviceGroupId</strong>). Save this value locally for use when invoking other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a device group for the face library.</p>
     * 
     * @param request AddFaceDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceDeviceGroupResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the device group (<strong>DeviceGroupId</strong>). Save this value locally for use when invoking other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a device group for the face library.</p>
     * 
     * @param request AddFaceDeviceGroupRequest
     * @return AddFaceDeviceGroupResponse
     */
    public AddFaceDeviceGroupResponse addFaceDeviceGroup(AddFaceDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a device to a device group.</p>
     * 
     * @param request AddFaceDeviceToDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceDeviceToDeviceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds a device to a device group.</p>
     * 
     * @param request AddFaceDeviceToDeviceGroupRequest
     * @return AddFaceDeviceToDeviceGroupResponse
     */
    public AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceDeviceToDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a URL for downloading the user\&quot;s face image in advance.<blockquote>
     * <p>Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns a user ID (<strong>UserId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to the face database.</p>
     * 
     * @param request AddFaceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceUserResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a URL for downloading the user\&quot;s face image in advance.<blockquote>
     * <p>Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns a user ID (<strong>UserId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to the face database.</p>
     * 
     * @param request AddFaceUserRequest
     * @return AddFaceUserResponse
     */
    public AddFaceUserResponse addFaceUser(AddFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) limit for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the user group (<strong>UserGroupId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group.</p>
     * 
     * @param request AddFaceUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceUserGroupResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) limit for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the user group (<strong>UserGroupId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a user group.</p>
     * 
     * @param request AddFaceUserGroupRequest
     * @return AddFaceUserGroupResponse
     */
    public AddFaceUserGroupResponse addFaceUserGroup(AddFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request AddFaceUserGroupAndDeviceGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceUserGroupAndDeviceGroupRelationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds a face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request AddFaceUserGroupAndDeviceGroupRelationRequest
     * @return AddFaceUserGroupAndDeviceGroupRelationResponse
     */
    public AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a download URL for the user\&quot;s face image in advance.<blockquote>
     * <p>Only images in JPEG and JPG format are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the unique identity (<strong>Data</strong>) of the user\&quot;s face image. Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a face image for a user in the face database.</p>
     * 
     * @param request AddFaceUserPictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceUserPictureResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a download URL for the user\&quot;s face image in advance.<blockquote>
     * <p>Only images in JPEG and JPG format are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the unique identity (<strong>Data</strong>) of the user\&quot;s face image. Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a face image for a user in the face database.</p>
     * 
     * @param request AddFaceUserPictureRequest
     * @return AddFaceUserPictureResponse
     */
    public AddFaceUserPictureResponse addFaceUserPicture(AddFaceUserPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserPictureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a user group.</p>
     * 
     * @param request AddFaceUserToUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFaceUserToUserGroupResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a user group.</p>
     * 
     * @param request AddFaceUserToUserGroupRequest
     * @return AddFaceUserToUserGroupResponse
     */
    public AddFaceUserToUserGroupResponse addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFaceUserToUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a continuous recording plan for an IPC device.</p>
     * 
     * @param request AddRecordPlanDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecordPlanDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds a continuous recording plan for an IPC device.</p>
     * 
     * @param request AddRecordPlanDeviceRequest
     * @return AddRecordPlanDeviceResponse
     */
    public AddRecordPlanDeviceResponse addRecordPlanDevice(AddRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordPlanDeviceWithOptions(request, runtime);
    }

    /**
     * @param request BatchQueryVisionDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryVisionDeviceInfoResponse
     */
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

    /**
     * @param request BatchQueryVisionDeviceInfoRequest
     * @return BatchQueryVisionDeviceInfoResponse
     */
    public BatchQueryVisionDeviceInfoResponse batchQueryVisionDeviceInfo(BatchQueryVisionDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryVisionDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the invocation failed.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds devices to an image search instance in batches.</p>
     * 
     * @param request BindPictureSearchAppWithDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPictureSearchAppWithDevicesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the invocation failed.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds devices to an image search instance in batches.</p>
     * 
     * @param request BindPictureSearchAppWithDevicesRequest
     * @return BindPictureSearchAppWithDevicesResponse
     */
    public BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the face of a specified user is successfully synchronized on the device.</p>
     * 
     * @param request CheckFaceUserDoExistOnDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckFaceUserDoExistOnDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Checks whether the face of a specified user is successfully synchronized on the device.</p>
     * 
     * @param request CheckFaceUserDoExistOnDeviceRequest
     * @return CheckFaceUserDoExistOnDeviceResponse
     */
    public CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFaceUserDoExistOnDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears all face databases under a specified business isolation ID for a V-series edge all-in-one machine.</p>
     * 
     * @param request ClearFaceDeviceDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearFaceDeviceDBResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears all face databases under a specified business isolation ID for a V-series edge all-in-one machine.</p>
     * 
     * @param request ClearFaceDeviceDBRequest
     * @return ClearFaceDeviceDBResponse
     */
    public ClearFaceDeviceDBResponse clearFaceDeviceDB(ClearFaceDeviceDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearFaceDeviceDBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a recording plan for intelligent alert events.</p>
     * 
     * @param request CreateEventRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a recording plan for intelligent alert events.</p>
     * 
     * @param request CreateEventRecordPlanRequest
     * @return CreateEventRecordPlanResponse
     */
    public CreateEventRecordPlanResponse createEventRecordPlan(CreateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventRecordPlanWithOptions(request, runtime);
    }

    /**
     * @param request CreateGbDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGbDeviceResponse
     */
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

    /**
     * @param request CreateGbDeviceRequest
     * @return CreateGbDeviceResponse
     */
    public CreateGbDeviceResponse createGbDevice(CreateGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGbDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A single local video recording upload job supports uploading up to 200 files. The maximum number of items in the TimeSlot list is 200.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a local video recording upload job.</p>
     * 
     * @param request CreateLocalFileUploadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLocalFileUploadJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>A single local video recording upload job supports uploading up to 200 files. The maximum number of items in the TimeSlot list is 200.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a local video recording upload job.</p>
     * 
     * @param request CreateLocalFileUploadJobRequest
     * @return CreateLocalFileUploadJobResponse
     */
    public CreateLocalFileUploadJobResponse createLocalFileUploadJob(CreateLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocalFileUploadJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The maximum duration for a single time-based download is 30 minutes.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>A single instance supports up to 10 concurrent downloads. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the downloaded recording defaults to the first half of the recording.</li>
     * <li>Due to fluctuations in the device\&quot;s upstream network, the link may be abnormally disconnected or the device may actively drop data. As a result, the uploaded and downloaded recordings may be incomplete.</li>
     * <li>The downloaded recording data is determined by the device\&quot;s stream pushing logic. If the pushed data is abnormal, the duration of the downloaded recording may not match the time period specified in the task settings.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to download local video recordings by time.</p>
     * 
     * @param request CreateLocalRecordDownloadByTimeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLocalRecordDownloadByTimeJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The maximum duration for a single time-based download is 30 minutes.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>A single instance supports up to 10 concurrent downloads. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the downloaded recording defaults to the first half of the recording.</li>
     * <li>Due to fluctuations in the device\&quot;s upstream network, the link may be abnormally disconnected or the device may actively drop data. As a result, the uploaded and downloaded recordings may be incomplete.</li>
     * <li>The downloaded recording data is determined by the device\&quot;s stream pushing logic. If the pushed data is abnormal, the duration of the downloaded recording may not match the time period specified in the task settings.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to download local video recordings by time.</p>
     * 
     * @param request CreateLocalRecordDownloadByTimeJobRequest
     * @return CreateLocalRecordDownloadByTimeJobResponse
     */
    public CreateLocalRecordDownloadByTimeJobResponse createLocalRecordDownloadByTimeJob(CreateLocalRecordDownloadByTimeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocalRecordDownloadByTimeJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>A Resource Access Management (RAM) user shares the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an image search application instance.</p>
     * 
     * @param request CreatePictureSearchAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePictureSearchAppResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>A Resource Access Management (RAM) user shares the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an image search application instance.</p>
     * 
     * @param request CreatePictureSearchAppRequest
     * @return CreatePictureSearchAppResponse
     */
    public CreatePictureSearchAppResponse createPictureSearchApp(CreatePictureSearchAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPictureSearchAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both face and human body features simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an integrated image search task.</p>
     * 
     * @param request CreatePictureSearchJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePictureSearchJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both face and human body features simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an integrated image search task.</p>
     * 
     * @param request CreatePictureSearchJobRequest
     * @return CreatePictureSearchJobResponse
     */
    public CreatePictureSearchJobResponse createPictureSearchJob(CreatePictureSearchJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPictureSearchJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Maximum duration for a single time-based download: 30 minutes.</li>
     * <li>Download time precision: The precision of the download time range is within 10 seconds. For example, if you select a 20-second data segment to download, up to 30 seconds of data may be downloaded.</li>
     * <li>Maximum number of recording files for a single time-based download: 100.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>Maximum concurrent downloads per instance: 10. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the first half of the recording is downloaded by default.</li>
     * <li>If the download time ranges of recordings overlap, the cloud deduplicates the overlapping data.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to download cloud recordings by time.</p>
     * 
     * @param request CreateRecordDownloadByTimeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecordDownloadByTimeJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Maximum duration for a single time-based download: 30 minutes.</li>
     * <li>Download time precision: The precision of the download time range is within 10 seconds. For example, if you select a 20-second data segment to download, up to 30 seconds of data may be downloaded.</li>
     * <li>Maximum number of recording files for a single time-based download: 100.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>Maximum concurrent downloads per instance: 10. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the first half of the recording is downloaded by default.</li>
     * <li>If the download time ranges of recordings overlap, the cloud deduplicates the overlapping data.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to download cloud recordings by time.</p>
     * 
     * @param request CreateRecordDownloadByTimeJobRequest
     * @return CreateRecordDownloadByTimeJobResponse
     */
    public CreateRecordDownloadByTimeJobResponse createRecordDownloadByTimeJob(CreateRecordDownloadByTimeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordDownloadByTimeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a recording plan based on a time template.</p>
     * 
     * @param request CreateRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a recording plan based on a time template.</p>
     * 
     * @param request CreateRecordPlanRequest
     * @return CreateRecordPlanResponse
     */
    public CreateRecordPlanResponse createRecordPlan(CreateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordPlanWithOptions(request, runtime);
    }

    /**
     * @param request CreateRtmpDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRtmpDeviceResponse
     */
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

    /**
     * @param request CreateRtmpDeviceRequest
     * @return CreateRtmpDeviceResponse
     */
    public CreateRtmpDeviceResponse createRtmpDevice(CreateRtmpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRtmpDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a video stream pushing job.</p>
     * 
     * @param request CreateStreamPushJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamPushJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a video stream pushing job.</p>
     * 
     * @param request CreateStreamPushJobRequest
     * @return CreateStreamPushJobResponse
     */
    public CreateStreamPushJobResponse createStreamPushJob(CreateStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamPushJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud snapshot task.</p>
     * 
     * @param request CreateStreamSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamSnapshotJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud snapshot task.</p>
     * 
     * @param request CreateStreamSnapshotJobRequest
     * @return CreateStreamSnapshotJobResponse
     */
    public CreateStreamSnapshotJobResponse createStreamSnapshotJob(CreateStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a time template.</p>
     * 
     * @param request CreateTimeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTimeTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Creates a time template.</p>
     * 
     * @param request CreateTimeTemplateRequest
     * @return CreateTimeTemplateResponse
     */
    public CreateTimeTemplateResponse createTimeTemplate(CreateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTimeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an intelligent event recording plan.</p>
     * 
     * @param request DeleteEventRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes an intelligent event recording plan.</p>
     * 
     * @param request DeleteEventRecordPlanRequest
     * @return DeleteEventRecordPlanResponse
     */
    public DeleteEventRecordPlanResponse deleteEventRecordPlan(DeleteEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the IP cameras associated with an intelligent alert event recording plan.</p>
     * 
     * @param request DeleteEventRecordPlanDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventRecordPlanDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes the IP cameras associated with an intelligent alert event recording plan.</p>
     * 
     * @param request DeleteEventRecordPlanDeviceRequest
     * @return DeleteEventRecordPlanDeviceResponse
     */
    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a device group.</p>
     * 
     * @param request DeleteFaceDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceDeviceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a device group.</p>
     * 
     * @param request DeleteFaceDeviceGroupRequest
     * @return DeleteFaceDeviceGroupResponse
     */
    public DeleteFaceDeviceGroupResponse deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user from the face management service.</p>
     * 
     * @param request DeleteFaceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceUserResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a user from the face management service.</p>
     * 
     * @param request DeleteFaceUserRequest
     * @return DeleteFaceUserResponse
     */
    public DeleteFaceUserResponse deleteFaceUser(DeleteFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified user group.</p>
     * 
     * @param request DeleteFaceUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceUserGroupResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified user group.</p>
     * 
     * @param request DeleteFaceUserGroupRequest
     * @return DeleteFaceUserGroupResponse
     */
    public DeleteFaceUserGroupResponse deleteFaceUserGroup(DeleteFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>The maximum number of queries per second (QPS) per Alibaba Cloud account for invoking this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request DeleteFaceUserGroupAndDeviceGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceUserGroupAndDeviceGroupRelationResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>The maximum number of queries per second (QPS) per Alibaba Cloud account for invoking this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request DeleteFaceUserGroupAndDeviceGroupRelationRequest
     * @return DeleteFaceUserGroupAndDeviceGroupRelationResponse
     */
    public DeleteFaceUserGroupAndDeviceGroupRelationResponse deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified face image from a user in the face library.</p>
     * 
     * @param request DeleteFaceUserPictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceUserPictureResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified face image from a user in the face library.</p>
     * 
     * @param request DeleteFaceUserPictureRequest
     * @return DeleteFaceUserPictureResponse
     */
    public DeleteFaceUserPictureResponse deleteFaceUserPicture(DeleteFaceUserPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceUserPictureWithOptions(request, runtime);
    }

    /**
     * @param request DeleteGbDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGbDeviceResponse
     */
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

    /**
     * @param request DeleteGbDeviceRequest
     * @return DeleteGbDeviceResponse
     */
    public DeleteGbDeviceResponse deleteGbDevice(DeleteGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGbDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you stop a local recording upload task, the recording files that have been created are not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a local recording upload task.</p>
     * 
     * @param request DeleteLocalFileUploadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLocalFileUploadJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>After you stop a local recording upload task, the recording files that have been created are not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a local recording upload task.</p>
     * 
     * @param request DeleteLocalFileUploadJobRequest
     * @return DeleteLocalFileUploadJobResponse
     */
    public DeleteLocalFileUploadJobResponse deleteLocalFileUploadJob(DeleteLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLocalFileUploadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple cloud pictures with specified picture IDs for a specified IPC device.</p>
     * 
     * @param request DeletePictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePictureResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple cloud pictures with specified picture IDs for a specified IPC device.</p>
     * 
     * @param request DeletePictureRequest
     * @return DeletePictureResponse
     */
    public DeletePictureResponse deletePicture(DeletePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePictureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes video files stored in the cloud.</p>
     * 
     * @param request DeleteRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes video files stored in the cloud.</p>
     * 
     * @param request DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    public DeleteRecordResponse deleteRecord(DeleteRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a recording plan.</p>
     * 
     * @param request DeleteRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a recording plan.</p>
     * 
     * @param request DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     */
    public DeleteRecordPlanResponse deleteRecordPlan(DeleteRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the recording plan associated with an IPC device.</p>
     * 
     * @param request DeleteRecordPlanDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordPlanDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes the recording plan associated with an IPC device.</p>
     * 
     * @param request DeleteRecordPlanDeviceRequest
     * @return DeleteRecordPlanDeviceResponse
     */
    public DeleteRecordPlanDeviceResponse deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteRtmpDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRtmpDeviceResponse
     */
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

    /**
     * @param request DeleteRtmpDeviceRequest
     * @return DeleteRtmpDeviceResponse
     */
    public DeleteRtmpDeviceResponse deleteRtmpDevice(DeleteRtmpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRtmpDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteRtmpKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRtmpKeyResponse
     */
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

    /**
     * @param request DeleteRtmpKeyRequest
     * @return DeleteRtmpKeyResponse
     */
    public DeleteRtmpKeyResponse deleteRtmpKey(DeleteRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRtmpKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single Alibaba Cloud account can invoke this operation up to 50 times per second (QPS).</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of that account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video stream pushing job.</p>
     * 
     * @param request DeleteStreamPushJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamPushJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single Alibaba Cloud account can invoke this operation up to 50 times per second (QPS).</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of that account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video stream pushing job.</p>
     * 
     * @param request DeleteStreamPushJobRequest
     * @return DeleteStreamPushJobResponse
     */
    public DeleteStreamPushJobResponse deleteStreamPushJob(DeleteStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamPushJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video snapshot task.</p>
     * 
     * @param request DeleteStreamSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamSnapshotJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a video snapshot task.</p>
     * 
     * @param request DeleteStreamSnapshotJobRequest
     * @return DeleteStreamSnapshotJobResponse
     */
    public DeleteStreamSnapshotJobResponse deleteStreamSnapshotJob(DeleteStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a time template.</p>
     * 
     * @param request DeleteTimeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTimeTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a time template.</p>
     * 
     * @param request DeleteTimeTemplateRequest
     * @return DeleteTimeTemplateResponse
     */
    public DeleteTimeTemplateResponse deleteTimeTemplate(DeleteTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTimeTemplateWithOptions(request, runtime);
    }

    /**
     * @param request EnableGbSubDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableGbSubDeviceResponse
     */
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

    /**
     * @param request EnableGbSubDeviceRequest
     * @return EnableGbSubDeviceResponse
     */
    public EnableGbSubDeviceResponse enableGbSubDevice(EnableGbSubDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableGbSubDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both facial and body features during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an integrated image search task.</p>
     * 
     * @param request GetPictureSearchJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPictureSearchJobStatusResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both facial and body features during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an integrated image search task.</p>
     * 
     * @param request GetPictureSearchJobStatusRequest
     * @return GetPictureSearchJobStatusResponse
     */
    public GetPictureSearchJobStatusResponse getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPictureSearchJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an image search application instance to search for images.</p>
     * 
     * @param request PictureSearchPictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PictureSearchPictureResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Starts an image search application instance to search for images.</p>
     * 
     * @param request PictureSearchPictureRequest
     * @return PictureSearchPictureResponse
     */
    public PictureSearchPictureResponse pictureSearchPicture(PictureSearchPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pictureSearchPictureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 10.  </p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the intelligent alert events for vehicle operations.</p>
     * 
     * @param request QueryCarProcessEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCarProcessEventsResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 10.  </p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the intelligent alert events for vehicle operations.</p>
     * 
     * @param request QueryCarProcessEventsRequest
     * @return QueryCarProcessEventsResponse
     */
    public QueryCarProcessEventsResponse queryCarProcessEvents(QueryCarProcessEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCarProcessEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of intelligent alert events for an IPC device.</p>
     * 
     * @param request QueryDeviceEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceEventResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of intelligent alert events for an IPC device.</p>
     * 
     * @param request QueryDeviceEventRequest
     * @return QueryDeviceEventResponse
     */
    public QueryDeviceEventResponse queryDeviceEvent(QueryDeviceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the image captured and uploaded by an IPC device when an intelligent alert event is triggered.</p>
     * 
     * @param request QueryDeviceEventPictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceEventPictureResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the image captured and uploaded by an IPC device when an intelligent alert event is triggered.</p>
     * 
     * @param request QueryDeviceEventPictureRequest
     * @return QueryDeviceEventPictureResponse
     */
    public QueryDeviceEventPictureResponse queryDeviceEventPicture(QueryDeviceEventPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventPictureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL of the recording file for a specified intelligent alert event of an IP camera (IPC) device.</p>
     * 
     * @param request QueryDeviceEventRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceEventRecordResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL of the recording file for a specified intelligent alert event of an IP camera (IPC) device.</p>
     * 
     * @param request QueryDeviceEventRecordRequest
     * @return QueryDeviceEventRecordResponse
     */
    public QueryDeviceEventRecordResponse queryDeviceEventRecord(QueryDeviceEventRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves image URLs based on a list of image IDs.</p>
     * 
     * @param request QueryDevicePictureByListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicePictureByListResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves image URLs based on a list of image IDs.</p>
     * 
     * @param request QueryDevicePictureByListRequest
     * @return QueryDevicePictureByListResponse
     */
    public QueryDevicePictureByListResponse queryDevicePictureByList(QueryDevicePictureByListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureByListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about images captured by an IPC device.</p>
     * 
     * @param request QueryDevicePictureFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicePictureFileResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about images captured by an IPC device.</p>
     * 
     * @param request QueryDevicePictureFileRequest
     * @return QueryDevicePictureFileResponse
     */
    public QueryDevicePictureFileResponse queryDevicePictureFile(QueryDevicePictureFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud storage image lifecycle for an IPC device.</p>
     * 
     * @param request QueryDevicePictureLifeCycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicePictureLifeCycleResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud storage image lifecycle for an IPC device.</p>
     * 
     * @param request QueryDevicePictureLifeCycleRequest
     * @return QueryDevicePictureLifeCycleResponse
     */
    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureLifeCycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the cloud storage recording lifecycle of an IPC device.</p>
     * 
     * @param request QueryDeviceRecordLifeCycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceRecordLifeCycleResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the cloud storage recording lifecycle of an IPC device.</p>
     * 
     * @param request QueryDeviceRecordLifeCycleRequest
     * @return QueryDeviceRecordLifeCycleResponse
     */
    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL of a recording file with a specified file name from the storage card of a local network video recorder or IP camera.</p>
     * 
     * @param request QueryDeviceVodUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceVodUrlResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL of a recording file with a specified file name from the storage card of a local network video recorder or IP camera.</p>
     * 
     * @param request QueryDeviceVodUrlRequest
     * @return QueryDeviceVodUrlResponse
     */
    public QueryDeviceVodUrlResponse queryDeviceVodUrl(QueryDeviceVodUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceVodUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>This operation is supported only in scenarios where IPC devices are directly connected to IoT Platform.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback URL of a recording file within a specified time range from the storage card of a local network video recorder (NVR) or IP camera (IPC) device.</p>
     * 
     * @param request QueryDeviceVodUrlByTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceVodUrlByTimeResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>This operation is supported only in scenarios where IPC devices are directly connected to IoT Platform.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the playback URL of a recording file within a specified time range from the storage card of a local network video recorder (NVR) or IP camera (IPC) device.</p>
     * 
     * @param request QueryDeviceVodUrlByTimeRequest
     * @return QueryDeviceVodUrlByTimeResponse
     */
    public QueryDeviceVodUrlByTimeResponse queryDeviceVodUrlByTime(QueryDeviceVodUrlByTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceVodUrlByTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an intelligent alert event recording plan.</p>
     * 
     * @param request QueryEventRecordPlanDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventRecordPlanDetailResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an intelligent alert event recording plan.</p>
     * 
     * @param request QueryEventRecordPlanDetailRequest
     * @return QueryEventRecordPlanDetailResponse
     */
    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the intelligent alert event recording plan of an IPC device by device ID.</p>
     * 
     * @param request QueryEventRecordPlanDeviceByDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventRecordPlanDeviceByDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the intelligent alert event recording plan of an IPC device by device ID.</p>
     * 
     * @param request QueryEventRecordPlanDeviceByDeviceRequest
     * @return QueryEventRecordPlanDeviceByDeviceResponse
     */
    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cameras associated with an intelligent alert event recording plan.</p>
     * 
     * @param request QueryEventRecordPlanDeviceByPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventRecordPlanDeviceByPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cameras associated with an intelligent alert event recording plan.</p>
     * 
     * @param request QueryEventRecordPlanDeviceByPlanRequest
     * @return QueryEventRecordPlanDeviceByPlanResponse
     */
    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of intelligent alert event recording plans.</p>
     * 
     * @param request QueryEventRecordPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEventRecordPlansResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of intelligent alert event recording plans.</p>
     * 
     * @param request QueryEventRecordPlansRequest
     * @return QueryEventRecordPlansResponse
     */
    public QueryEventRecordPlansResponse queryEventRecordPlans(QueryEventRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all device groups.</p>
     * 
     * @param request QueryFaceAllDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceAllDeviceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all device groups.</p>
     * 
     * @param request QueryFaceAllDeviceGroupRequest
     * @return QueryFaceAllDeviceGroupResponse
     */
    public QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all user groups.</p>
     * 
     * @param request QueryFaceAllUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceAllUserGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all user groups.</p>
     * 
     * @param request QueryFaceAllUserGroupRequest
     * @return QueryFaceAllUserGroupResponse
     */
    public QueryFaceAllUserGroupResponse queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user groups and device groups with face synchronization relationships.</p>
     * 
     * @param request QueryFaceAllUserGroupAndDeviceGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceAllUserGroupAndDeviceGroupRelationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the user groups and device groups with face synchronization relationships.</p>
     * 
     * @param request QueryFaceAllUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceAllUserGroupAndDeviceGroupRelationResponse
     */
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all users in a user group.</p>
     * 
     * @param request QueryFaceAllUserIdsByGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceAllUserIdsByGroupIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries all users in a user group.</p>
     * 
     * @param request QueryFaceAllUserIdsByGroupIdRequest
     * @return QueryFaceAllUserIdsByGroupIdResponse
     */
    public QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceAllUserIdsByGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user ID in the caller\&quot;s service based on the user ID from the face image library synchronization service.</p>
     * 
     * @param request QueryFaceCustomUserIdByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceCustomUserIdByUserIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the user ID in the caller\&quot;s service based on the user ID from the face image library synchronization service.</p>
     * 
     * @param request QueryFaceCustomUserIdByUserIdRequest
     * @return QueryFaceCustomUserIdByUserIdResponse
     */
    public QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceCustomUserIdByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the device groups to which a device belongs.</p>
     * 
     * @param request QueryFaceDeviceGroupsByDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceDeviceGroupsByDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the device groups to which a device belongs.</p>
     * 
     * @param request QueryFaceDeviceGroupsByDeviceRequest
     * @return QueryFaceDeviceGroupsByDeviceResponse
     */
    public QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceDeviceGroupsByDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user.</p>
     * 
     * @param request QueryFaceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a user.</p>
     * 
     * @param request QueryFaceUserRequest
     * @return QueryFaceUserResponse
     */
    public QueryFaceUserResponse queryFaceUser(QueryFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries user information in batches based on a list of user IDs.</p>
     * 
     * @param request QueryFaceUserBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserBatchResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries user information in batches based on a list of user IDs.</p>
     * 
     * @param request QueryFaceUserBatchRequest
     * @return QueryFaceUserBatchResponse
     */
    public QueryFaceUserBatchResponse queryFaceUserBatch(QueryFaceUserBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face data by face name.</p>
     * 
     * @param request QueryFaceUserByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserByNameResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face data by face name.</p>
     * 
     * @param request QueryFaceUserByNameRequest
     * @return QueryFaceUserByNameResponse
     */
    public QueryFaceUserByNameResponse queryFaceUserByName(QueryFaceUserByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserByNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user groups to which a user belongs.</p>
     * 
     * @param request QueryFaceUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the user groups to which a user belongs.</p>
     * 
     * @param request QueryFaceUserGroupRequest
     * @return QueryFaceUserGroupResponse
     */
    public QueryFaceUserGroupResponse queryFaceUserGroup(QueryFaceUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the face synchronization relationships between user groups and device groups.</p>
     * 
     * @param request QueryFaceUserGroupAndDeviceGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserGroupAndDeviceGroupRelationResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the face synchronization relationships between user groups and device groups.</p>
     * 
     * @param request QueryFaceUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceUserGroupAndDeviceGroupRelationResponse
     */
    public QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user ID in the face library synchronization service based on the user ID in the caller system.</p>
     * 
     * @param request QueryFaceUserIdByCustomUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceUserIdByCustomUserIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the user ID in the face library synchronization service based on the user ID in the caller system.</p>
     * 
     * @param request QueryFaceUserIdByCustomUserIdRequest
     * @return QueryFaceUserIdByCustomUserIdResponse
     */
    public QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceUserIdByCustomUserIdWithOptions(request, runtime);
    }

    /**
     * @param request QueryGbSubDeviceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGbSubDeviceListResponse
     */
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

    /**
     * @param request QueryGbSubDeviceListRequest
     * @return QueryGbSubDeviceListResponse
     */
    public QueryGbSubDeviceListResponse queryGbSubDeviceList(QueryGbSubDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGbSubDeviceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the live streaming URL of an IPC device.</p>
     * 
     * @param request QueryLiveStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLiveStreamingResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the live streaming URL of an IPC device.</p>
     * 
     * @param request QueryLiveStreamingRequest
     * @return QueryLiveStreamingResponse
     */
    public QueryLiveStreamingResponse queryLiveStreaming(QueryLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLiveStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the task result of a local video recording upload node.</p>
     * 
     * @param request QueryLocalFileUploadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLocalFileUploadJobResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the task result of a local video recording upload node.</p>
     * 
     * @param request QueryLocalFileUploadJobRequest
     * @return QueryLocalFileUploadJobResponse
     */
    public QueryLocalFileUploadJobResponse queryLocalFileUploadJob(QueryLocalFileUploadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocalFileUploadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether an IP camera has video recordings for each day of a specified month.</p>
     * 
     * @param request QueryMonthRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMonthRecordResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries whether an IP camera has video recordings for each day of a specified month.</p>
     * 
     * @param request QueryMonthRecordRequest
     * @return QueryMonthRecordResponse
     */
    public QueryMonthRecordResponse queryMonthRecord(QueryMonthRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 500.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of images.</p>
     * 
     * @param request QueryPictureFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureFilesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 500.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of images.</p>
     * 
     * @param request QueryPictureFilesRequest
     * @return QueryPictureFilesResponse
     */
    public QueryPictureFilesResponse queryPictureFiles(QueryPictureFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of V-series edge all-in-one machines bound to an image search application instance.</p>
     * 
     * @param request QueryPictureSearchAiboxesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureSearchAiboxesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of V-series edge all-in-one machines bound to an image search application instance.</p>
     * 
     * @param request QueryPictureSearchAiboxesRequest
     * @return QueryPictureSearchAiboxesResponse
     */
    public QueryPictureSearchAiboxesResponse queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchAiboxesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of created image search application instances.</p>
     * 
     * @param request QueryPictureSearchAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureSearchAppsResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of created image search application instances.</p>
     * 
     * @param request QueryPictureSearchAppsRequest
     * @return QueryPictureSearchAppsResponse
     */
    public QueryPictureSearchAppsResponse queryPictureSearchApps(QueryPictureSearchAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of devices bound to an image search application instance.</p>
     * 
     * @param request QueryPictureSearchDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureSearchDevicesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the list of devices bound to an image search application instance.</p>
     * 
     * @param request QueryPictureSearchDevicesRequest
     * @return QueryPictureSearchDevicesResponse
     */
    public QueryPictureSearchDevicesResponse queryPictureSearchDevices(QueryPictureSearchDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search means that both faces and human bodies are retrieved simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of integrated image search jobs.</p>
     * 
     * @param request QueryPictureSearchJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureSearchJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Integrated image search means that both faces and human bodies are retrieved simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of integrated image search jobs.</p>
     * 
     * @param request QueryPictureSearchJobRequest
     * @return QueryPictureSearchJobResponse
     */
    public QueryPictureSearchJobResponse queryPictureSearchJob(QueryPictureSearchJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the image retrieval results of an integrated image search job.</p>
     * 
     * @param request QueryPictureSearchJobResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPictureSearchJobResultResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the image retrieval results of an integrated image search job.</p>
     * 
     * @param request QueryPictureSearchJobResultRequest
     * @return QueryPictureSearchJobResultResponse
     */
    public QueryPictureSearchJobResultResponse queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureSearchJobResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 250.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of cloud video recordings.</p>
     * 
     * @param request QueryRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 250.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of cloud video recordings.</p>
     * 
     * @param request QueryRecordRequest
     * @return QueryRecordResponse
     */
    public QueryRecordResponse queryRecord(QueryRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the URL of a recording file by recording file ID.</p>
     * 
     * @param request QueryRecordByRecordIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordByRecordIdResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the URL of a recording file by recording file ID.</p>
     * 
     * @param request QueryRecordByRecordIdRequest
     * @return QueryRecordByRecordIdResponse
     */
    public QueryRecordByRecordIdResponse queryRecordByRecordId(QueryRecordByRecordIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordByRecordIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a cloud record download task by task ID, including the start time, recording progress, recording type, and download URL.</p>
     * 
     * @param request QueryRecordDownloadJobByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordDownloadJobByIdResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a cloud record download task by task ID, including the start time, recording progress, recording type, and download URL.</p>
     * 
     * @param request QueryRecordDownloadJobByIdRequest
     * @return QueryRecordDownloadJobByIdResponse
     */
    public QueryRecordDownloadJobByIdResponse queryRecordDownloadJobById(QueryRecordDownloadJobByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadJobByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of cloud recording download tasks.</p>
     * 
     * @param request QueryRecordDownloadJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordDownloadJobListResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of cloud recording download tasks.</p>
     * 
     * @param request QueryRecordDownloadJobListRequest
     * @return QueryRecordDownloadJobListResponse
     */
    public QueryRecordDownloadJobListResponse queryRecordDownloadJobList(QueryRecordDownloadJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Generating a cloud recording file takes a long time. You must poll this operation to obtain the progress. The download URL is generated only after the progress is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests the download URL of a cloud recording file.</p>
     * 
     * @param request QueryRecordDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordDownloadUrlResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Generating a cloud recording file takes a long time. You must poll this operation to obtain the progress. The download URL is generated only after the progress is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests the download URL of a cloud recording file.</p>
     * 
     * @param request QueryRecordDownloadUrlRequest
     * @return QueryRecordDownloadUrlResponse
     */
    public QueryRecordDownloadUrlResponse queryRecordDownloadUrl(QueryRecordDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a recording plan.</p>
     * 
     * @param request QueryRecordPlanDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordPlanDetailResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a recording plan.</p>
     * 
     * @param request QueryRecordPlanDetailRequest
     * @return QueryRecordPlanDetailResponse
     */
    public QueryRecordPlanDetailResponse queryRecordPlanDetail(QueryRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the recording plan of a video device based on the device ID of the IP camera (IPC).</p>
     * 
     * @param request QueryRecordPlanDeviceByDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordPlanDeviceByDeviceResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the recording plan of a video device based on the device ID of the IP camera (IPC).</p>
     * 
     * @param request QueryRecordPlanDeviceByDeviceRequest
     * @return QueryRecordPlanDeviceByDeviceResponse
     */
    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the devices associated with a recording plan.</p>
     * 
     * @param request QueryRecordPlanDeviceByPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordPlanDeviceByPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the devices associated with a recording plan.</p>
     * 
     * @param request QueryRecordPlanDeviceByPlanRequest
     * @return QueryRecordPlanDeviceByPlanResponse
     */
    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of recording plans.</p>
     * 
     * @param request QueryRecordPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordPlansResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of recording plans.</p>
     * 
     * @param request QueryRecordPlansRequest
     * @return QueryRecordPlansResponse
     */
    public QueryRecordPlansResponse queryRecordPlans(QueryRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the playback URL of a cloud recording file.</p>
     * 
     * @param request QueryRecordUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordUrlResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the playback URL of a cloud recording file.</p>
     * 
     * @param request QueryRecordUrlRequest
     * @return QueryRecordUrlResponse
     */
    public QueryRecordUrlResponse queryRecordUrl(QueryRecordUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the playback URL for recording files within a specified time range.</p>
     * 
     * @param request QueryRecordUrlByTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordUrlByTimeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the playback URL for recording files within a specified time range.</p>
     * 
     * @param request QueryRecordUrlByTimeRequest
     * @return QueryRecordUrlByTimeResponse
     */
    public QueryRecordUrlByTimeResponse queryRecordUrlByTime(QueryRecordUrlByTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordUrlByTimeWithOptions(request, runtime);
    }

    /**
     * @param request QueryRtmpKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRtmpKeyResponse
     */
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

    /**
     * @param request QueryRtmpKeyRequest
     * @return QueryRtmpKeyResponse
     */
    public QueryRtmpKeyResponse queryRtmpKey(QueryRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRtmpKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a video stream push job, such as the creation time, current push status, job type, and push URL.</p>
     * 
     * @param request QueryStreamPushJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStreamPushJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a video stream push job, such as the creation time, current push status, job type, and push URL.</p>
     * 
     * @param request QueryStreamPushJobRequest
     * @return QueryStreamPushJobResponse
     */
    public QueryStreamPushJobResponse queryStreamPushJob(QueryStreamPushJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamPushJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and details of video stream push jobs, including the creation time, current push status, job type, and push URL.</p>
     * 
     * @param request QueryStreamPushJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStreamPushJobListResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and details of video stream push jobs, including the creation time, current push status, job type, and push URL.</p>
     * 
     * @param request QueryStreamPushJobListRequest
     * @return QueryStreamPushJobListResponse
     */
    public QueryStreamPushJobListResponse queryStreamPushJobList(QueryStreamPushJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamPushJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and details of cloud snapshot tasks, including the snapshot interval and stream type.</p>
     * 
     * @param request QueryStreamSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStreamSnapshotJobResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and details of cloud snapshot tasks, including the snapshot interval and stream type.</p>
     * 
     * @param request QueryStreamSnapshotJobRequest
     * @return QueryStreamSnapshotJobResponse
     */
    public QueryStreamSnapshotJobResponse queryStreamSnapshotJob(QueryStreamSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStreamSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the time template information of a device.</p>
     * 
     * @param request QueryTimeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTimeTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the time template information of a device.</p>
     * 
     * @param request QueryTimeTemplateRequest
     * @return QueryTimeTemplateResponse
     */
    public QueryTimeTemplateResponse queryTimeTemplate(QueryTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified time template.</p>
     * 
     * @param request QueryTimeTemplateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTimeTemplateDetailResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified time template.</p>
     * 
     * @param request QueryTimeTemplateDetailRequest
     * @return QueryTimeTemplateDetailResponse
     */
    public QueryTimeTemplateDetailResponse queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryVisionDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVisionDeviceInfoResponse
     */
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

    /**
     * @param request QueryVisionDeviceInfoRequest
     * @return QueryVisionDeviceInfoResponse
     */
    public QueryVisionDeviceInfoResponse queryVisionDeviceInfo(QueryVisionDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVisionDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the voice intercom address of an IPC device.</p>
     * 
     * @param request QueryVoiceIntercomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVoiceIntercomResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Retrieves the voice intercom address of an IPC device.</p>
     * 
     * @param request QueryVoiceIntercomRequest
     * @return QueryVoiceIntercomResponse
     */
    public QueryVoiceIntercomResponse queryVoiceIntercom(QueryVoiceIntercomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVoiceIntercomWithOptions(request, runtime);
    }

    /**
     * @param request RefreshGbSubDeviceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshGbSubDeviceListResponse
     */
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

    /**
     * @param request RefreshGbSubDeviceListRequest
     * @return RefreshGbSubDeviceListResponse
     */
    public RefreshGbSubDeviceListResponse refreshGbSubDeviceList(RefreshGbSubDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshGbSubDeviceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a device from a device group.</p>
     * 
     * @param request RemoveFaceDeviceFromDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFaceDeviceFromDeviceGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes a device from a device group.</p>
     * 
     * @param request RemoveFaceDeviceFromDeviceGroupRequest
     * @return RemoveFaceDeviceFromDeviceGroupResponse
     */
    public RemoveFaceDeviceFromDeviceGroupResponse removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFaceDeviceFromDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a user from a user group.</p>
     * 
     * @param request RemoveFaceUserFromUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFaceUserFromUserGroupResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Removes a user from a user group.</p>
     * 
     * @param request RemoveFaceUserFromUserGroupRequest
     * @return RemoveFaceUserFromUserGroupResponse
     */
    public RemoveFaceUserFromUserGroupResponse removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFaceUserFromUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, images are permanently stored in the cloud before you configure the cloud storage image lifecycle.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets the cloud storage image lifecycle for an IPC device.</p>
     * 
     * @param request SetDevicePictureLifeCycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDevicePictureLifeCycleResponse
     */
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, images are permanently stored in the cloud before you configure the cloud storage image lifecycle.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets the cloud storage image lifecycle for an IPC device.</p>
     * 
     * @param request SetDevicePictureLifeCycleRequest
     * @return SetDevicePictureLifeCycleResponse
     */
    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDevicePictureLifeCycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the recording lifecycle of an IPC device, which specifies the number of days that recording files are stored in the cloud.</p>
     * 
     * @param request SetDeviceRecordLifeCycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDeviceRecordLifeCycleResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Sets the recording lifecycle of an IPC device, which specifies the number of days that recording files are stored in the cloud.</p>
     * 
     * @param request SetDeviceRecordLifeCycleRequest
     * @return SetDeviceRecordLifeCycleResponse
     */
    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you invoke this operation, you must implement the Thing Specification Language (TSL) model service for stopping live streaming with the identity <strong>StopPushStreaming</strong> on the IPC device. If this service is not implemented on the IPC device, or the IPC device does not return a normal response after receiving the service invocation, the IPC device will not stop pushing the stream. For more information about TSL models, see <a href="https://help.aliyun.com/document_detail/73727.html">What is a TSL model</a>.</li>
     * <li>If no one is watching the stream on the IPC device, you do not need to invoke this operation. IoT Platform automatically triggers the device to stop pushing the stream.</li>
     * <li>During the procedure of triggering a video recording event, invoking this operation causes interruptions to the video file. Use this operation with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops the live streaming of an IPC device.</p>
     * 
     * @param request StopLiveStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopLiveStreamingResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you invoke this operation, you must implement the Thing Specification Language (TSL) model service for stopping live streaming with the identity <strong>StopPushStreaming</strong> on the IPC device. If this service is not implemented on the IPC device, or the IPC device does not return a normal response after receiving the service invocation, the IPC device will not stop pushing the stream. For more information about TSL models, see <a href="https://help.aliyun.com/document_detail/73727.html">What is a TSL model</a>.</li>
     * <li>If no one is watching the stream on the IPC device, you do not need to invoke this operation. IoT Platform automatically triggers the device to stop pushing the stream.</li>
     * <li>During the procedure of triggering a video recording event, invoking this operation causes interruptions to the video file. Use this operation with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops the live streaming of an IPC device.</p>
     * 
     * @param request StopLiveStreamingRequest
     * @return StopLiveStreamingResponse
     */
    public StopLiveStreamingResponse stopLiveStreaming(StopLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLiveStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an IP camera from actively triggering video recording.</p>
     * 
     * @param request StopTriggeredRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTriggeredRecordResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Stops an IP camera from actively triggering video recording.</p>
     * 
     * @param request StopTriggeredRecordRequest
     * @return StopTriggeredRecordResponse
     */
    public StopTriggeredRecordResponse stopTriggeredRecord(StopTriggeredRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTriggeredRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to transfer devices to another instance, contact technical support to evaluate the migration plan and prevent features from becoming unavailable after the migration.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The devices to be transferred have the video service feature enabled.<ul>
     * <li>Devices in the Enterprise instance: Log on to the IoT Platform console and click <strong>Enterprise instance</strong>. In the left-side navigation pane, choose <strong>Video Service</strong> &gt; <strong>Access Service</strong>. On the <strong>Access Service</strong> page, click the <strong>Product Management</strong> tab. Check the product to which the device to be transferred belongs, and make sure that the <strong>Enabled/Disabled Status</strong> column displays <strong>Enabled</strong>.</li>
     * <li>Devices in an Enterprise Edition instance: The video service is enabled.</li>
     * </ul>
     * </li>
     * <li>The device distribution task is complete. For more information, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a> or <a href="https://help.aliyun.com/document_detail/143450.html">Device distribution</a>.</li>
     * <li>Make sure that a picture lifecycle is configured for camera devices. If no picture lifecycle is configured for a camera device, calling this operation automatically sets the picture lifecycle to 180 days. For more information, see <a href="https://help.aliyun.com/document_detail/107880.html">SetDevicePictureLifeCycle</a>.
     * <strong>Background information</strong></li>
     * <li>If the source instance and target instance are of different types, review the Billable methods of the instances before the migration. For more information about Billable methods, see <a href="https://help.aliyun.com/document_detail/124250.html">Billing overview</a>.</li>
     * <li>During the migration, devices go offline. The more devices you migrate, the longer the migration takes. Data generated by the devices during this period cannot be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transfers devices to another instance.</p>
     * 
     * @param request TransferDeviceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferDeviceInstanceResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Before you call this operation to transfer devices to another instance, contact technical support to evaluate the migration plan and prevent features from becoming unavailable after the migration.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The devices to be transferred have the video service feature enabled.<ul>
     * <li>Devices in the Enterprise instance: Log on to the IoT Platform console and click <strong>Enterprise instance</strong>. In the left-side navigation pane, choose <strong>Video Service</strong> &gt; <strong>Access Service</strong>. On the <strong>Access Service</strong> page, click the <strong>Product Management</strong> tab. Check the product to which the device to be transferred belongs, and make sure that the <strong>Enabled/Disabled Status</strong> column displays <strong>Enabled</strong>.</li>
     * <li>Devices in an Enterprise Edition instance: The video service is enabled.</li>
     * </ul>
     * </li>
     * <li>The device distribution task is complete. For more information, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a> or <a href="https://help.aliyun.com/document_detail/143450.html">Device distribution</a>.</li>
     * <li>Make sure that a picture lifecycle is configured for camera devices. If no picture lifecycle is configured for a camera device, calling this operation automatically sets the picture lifecycle to 180 days. For more information, see <a href="https://help.aliyun.com/document_detail/107880.html">SetDevicePictureLifeCycle</a>.
     * <strong>Background information</strong></li>
     * <li>If the source instance and target instance are of different types, review the Billable methods of the instances before the migration. For more information about Billable methods, see <a href="https://help.aliyun.com/document_detail/124250.html">Billing overview</a>.</li>
     * <li>During the migration, devices go offline. The more devices you migrate, the longer the migration takes. Data generated by the devices during this period cannot be retained.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transfers devices to another instance.</p>
     * 
     * @param request TransferDeviceInstanceRequest
     * @return TransferDeviceInstanceResponse
     */
    public TransferDeviceInstanceResponse transferDeviceInstance(TransferDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferDeviceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers an IPC device to capture an image and upload it to the cloud.</p>
     * 
     * @param request TriggerCapturePictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerCapturePictureResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Triggers an IPC device to capture an image and upload it to the cloud.</p>
     * 
     * @param request TriggerCapturePictureRequest
     * @return TriggerCapturePictureResponse
     */
    public TriggerCapturePictureResponse triggerCapturePicture(TriggerCapturePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerCapturePictureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers the specified IPC device to start recording and uploads the recording file to the cloud.</p>
     * 
     * @param request TriggerRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerRecordResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Triggers the specified IPC device to start recording and uploads the recording file to the cloud.</p>
     * 
     * @param request TriggerRecordRequest
     * @return TriggerRecordResponse
     */
    public TriggerRecordResponse triggerRecord(TriggerRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the call is failed.</p>
     * 
     * <b>summary</b> : 
     * <p>Dissociates multiple devices from an image search application instance.</p>
     * 
     * @param request UnbindPictureSearchAppWithDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindPictureSearchAppWithDevicesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the call is failed.</p>
     * 
     * <b>summary</b> : 
     * <p>Dissociates multiple devices from an image search application instance.</p>
     * 
     * @param request UnbindPictureSearchAppWithDevicesRequest
     * @return UnbindPictureSearchAppWithDevicesResponse
     */
    public UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the video recording plan for intelligent alert events.</p>
     * 
     * @param request UpdateEventRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates the video recording plan for intelligent alert events.</p>
     * 
     * @param request UpdateEventRecordPlanRequest
     * @return UpdateEventRecordPlanResponse
     */
    public UpdateEventRecordPlanResponse updateEventRecordPlan(UpdateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventRecordPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates user information.</p>
     * 
     * @param request UpdateFaceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFaceUserResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates user information.</p>
     * 
     * @param request UpdateFaceUserRequest
     * @return UpdateFaceUserResponse
     */
    public UpdateFaceUserResponse updateFaceUser(UpdateFaceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request UpdateFaceUserGroupAndDeviceGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFaceUserGroupAndDeviceGroupRelationResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the face synchronization relationship between a user group and a device group.</p>
     * 
     * @param request UpdateFaceUserGroupAndDeviceGroupRelationRequest
     * @return UpdateFaceUserGroupAndDeviceGroupRelationResponse
     */
    public UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    /**
     * @param request UpdateGbDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGbDeviceResponse
     */
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

    /**
     * @param request UpdateGbDeviceRequest
     * @return UpdateGbDeviceResponse
     */
    public UpdateGbDeviceResponse updateGbDevice(UpdateGbDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGbDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the IP protocol version supported by an instance.</p>
     * 
     * @param request UpdateInstanceInternetProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceInternetProtocolResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Sets the IP protocol version supported by an instance.</p>
     * 
     * @param request UpdateInstanceInternetProtocolRequest
     * @return UpdateInstanceInternetProtocolResponse
     */
    public UpdateInstanceInternetProtocolResponse updateInstanceInternetProtocol(UpdateInstanceInternetProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceInternetProtocolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of an image search application instance.</p>
     * 
     * @param request UpdatePictureSearchAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePictureSearchAppResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of an image search application instance.</p>
     * 
     * @param request UpdatePictureSearchAppRequest
     * @return UpdatePictureSearchAppResponse
     */
    public UpdatePictureSearchAppResponse updatePictureSearchApp(UpdatePictureSearchAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePictureSearchAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a recording plan.</p>
     * 
     * @param request UpdateRecordPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordPlanResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates a recording plan.</p>
     * 
     * @param request UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     */
    public UpdateRecordPlanResponse updateRecordPlan(UpdateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordPlanWithOptions(request, runtime);
    }

    /**
     * @param request UpdateRtmpKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRtmpKeyResponse
     */
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

    /**
     * @param request UpdateRtmpKeyRequest
     * @return UpdateRtmpKeyResponse
     */
    public UpdateRtmpKeyResponse updateRtmpKey(UpdateRtmpKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRtmpKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a time template.</p>
     * 
     * @param request UpdateTimeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTimeTemplateResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Updates a time template.</p>
     * 
     * @param request UpdateTimeTemplateRequest
     * @return UpdateTimeTemplateResponse
     */
    public UpdateTimeTemplateResponse updateTimeTemplate(UpdateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTimeTemplateWithOptions(request, runtime);
    }
}
