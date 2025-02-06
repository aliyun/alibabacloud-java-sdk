// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720;

import com.aliyun.tea.*;
import com.aliyun.linkface20180720.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkface", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建组</p>
     * 
     * @param request CreateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建组</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备所在的所有分组</p>
     * 
     * @param request DeleteDeviceAllGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceAllGroupResponse
     */
    public DeleteDeviceAllGroupResponse deleteDeviceAllGroupWithOptions(DeleteDeviceAllGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceAllGroup"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceAllGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDeviceAllGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除设备所在的所有分组</p>
     * 
     * @param request DeleteDeviceAllGroupRequest
     * @return DeleteDeviceAllGroupResponse
     */
    public DeleteDeviceAllGroupResponse deleteDeviceAllGroup(DeleteDeviceAllGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceAllGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备设备组</p>
     * 
     * @param request DeleteDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceGroupResponse
     */
    public DeleteDeviceGroupResponse deleteDeviceGroupWithOptions(DeleteDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceGroup"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDeviceGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>设备设备组</p>
     * 
     * @param request DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     */
    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除人脸</p>
     * 
     * @param request DeleteFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceResponse
     */
    public DeleteFaceResponse deleteFaceWithOptions(DeleteFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除人脸</p>
     * 
     * @param request DeleteFaceRequest
     * @return DeleteFaceResponse
     */
    public DeleteFaceResponse deleteFace(DeleteFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除组</p>
     * 
     * @param request DeleteGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除组</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关联人脸</p>
     * 
     * @param request LinkFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkFaceResponse
     */
    public LinkFaceResponse linkFaceWithOptions(LinkFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LinkFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LinkFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LinkFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>关联人脸</p>
     * 
     * @param request LinkFaceRequest
     * @return LinkFaceResponse
     */
    public LinkFaceResponse linkFace(LinkFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.linkFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询添加的用户信息</p>
     * 
     * @param request QueryAddUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAddUserInfoResponse
     */
    public QueryAddUserInfoResponse queryAddUserInfoWithOptions(QueryAddUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddUserInfo"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddUserInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAddUserInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询添加的用户信息</p>
     * 
     * @param request QueryAddUserInfoRequest
     * @return QueryAddUserInfoResponse
     */
    public QueryAddUserInfoResponse queryAddUserInfo(QueryAddUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAddUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有分组</p>
     * 
     * @param request QueryAllGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllGroupsResponse
     */
    public QueryAllGroupsResponse queryAllGroupsWithOptions(QueryAllGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllGroups"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAllGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询所有分组</p>
     * 
     * @param request QueryAllGroupsRequest
     * @return QueryAllGroupsResponse
     */
    public QueryAllGroupsResponse queryAllGroups(QueryAllGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询认证</p>
     * 
     * @param request QueryAuthenticationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuthenticationResponse
     */
    public QueryAuthenticationResponse queryAuthenticationWithOptions(QueryAuthenticationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            body.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuthentication"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuthenticationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAuthenticationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询认证</p>
     * 
     * @param request QueryAuthenticationRequest
     * @return QueryAuthenticationResponse
     */
    public QueryAuthenticationResponse queryAuthentication(QueryAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuthenticationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询人脸</p>
     * 
     * @param request QueryFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFaceResponse
     */
    public QueryFaceResponse queryFaceWithOptions(QueryFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询人脸</p>
     * 
     * @param request QueryFaceRequest
     * @return QueryFaceResponse
     */
    public QueryFaceResponse queryFace(QueryFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组内用户</p>
     * 
     * @param request QueryGroupUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGroupUsersResponse
     */
    public QueryGroupUsersResponse queryGroupUsersWithOptions(QueryGroupUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGroupUsers"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGroupUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryGroupUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询分组内用户</p>
     * 
     * @param request QueryGroupUsersRequest
     * @return QueryGroupUsersResponse
     */
    public QueryGroupUsersResponse queryGroupUsers(QueryGroupUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGroupUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询授权</p>
     * 
     * @param request QueryLicensesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLicensesResponse
     */
    public QueryLicensesResponse queryLicensesWithOptions(QueryLicensesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            body.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLicenses"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLicensesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryLicensesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询授权</p>
     * 
     * @param request QueryLicensesRequest
     * @return QueryLicensesResponse
     */
    public QueryLicensesResponse queryLicenses(QueryLicensesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLicensesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询同步图片计划</p>
     * 
     * @param request QuerySyncPicScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySyncPicScheduleResponse
     */
    public QuerySyncPicScheduleResponse querySyncPicScheduleWithOptions(QuerySyncPicScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySyncPicSchedule"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySyncPicScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QuerySyncPicScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询同步图片计划</p>
     * 
     * @param request QuerySyncPicScheduleRequest
     * @return QuerySyncPicScheduleResponse
     */
    public QuerySyncPicScheduleResponse querySyncPicSchedule(QuerySyncPicScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySyncPicScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册人脸</p>
     * 
     * @param request RegisterFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterFaceResponse
     */
    public RegisterFaceResponse registerFaceWithOptions(RegisterFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfo)) {
            body.put("UserInfo", request.userInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>注册人脸</p>
     * 
     * @param request RegisterFaceRequest
     * @return RegisterFaceResponse
     */
    public RegisterFaceResponse registerFace(RegisterFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索人脸</p>
     * 
     * @param request SearchFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFaceResponse
     */
    public SearchFaceResponse searchFaceWithOptions(SearchFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("Image", request.image);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SearchFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>搜索人脸</p>
     * 
     * @param request SearchFaceRequest
     * @return SearchFaceResponse
     */
    public SearchFaceResponse searchFace(SearchFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步人脸</p>
     * 
     * @param request SyncFacePicturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncFacePicturesResponse
     */
    public SyncFacePicturesResponse syncFacePicturesWithOptions(SyncFacePicturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            body.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("ProductKey", request.productKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncFacePictures"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SyncFacePicturesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SyncFacePicturesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>同步人脸</p>
     * 
     * @param request SyncFacePicturesRequest
     * @return SyncFacePicturesResponse
     */
    public SyncFacePicturesResponse syncFacePictures(SyncFacePicturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncFacePicturesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑人脸</p>
     * 
     * @param request UnlinkFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlinkFaceResponse
     */
    public UnlinkFaceResponse unlinkFaceWithOptions(UnlinkFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlinkFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnlinkFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnlinkFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>解绑人脸</p>
     * 
     * @param request UnlinkFaceRequest
     * @return UnlinkFaceResponse
     */
    public UnlinkFaceResponse unlinkFace(UnlinkFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlinkFaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新人脸</p>
     * 
     * @param request UpdateFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFaceResponse
     */
    public UpdateFaceResponse updateFaceWithOptions(UpdateFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfo)) {
            body.put("UserInfo", request.userInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFace"),
            new TeaPair("version", "2018-07-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新人脸</p>
     * 
     * @param request UpdateFaceRequest
     * @return UpdateFaceResponse
     */
    public UpdateFaceResponse updateFace(UpdateFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceWithOptions(request, runtime);
    }
}
