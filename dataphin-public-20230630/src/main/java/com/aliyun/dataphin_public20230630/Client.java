// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630;

import com.aliyun.tea.*;
import com.aliyun.dataphin_public20230630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataphin-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>新增租户成员</p>
     * 
     * @param tmpReq AddTenantMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTenantMembersResponse
     */
    public AddTenantMembersResponse addTenantMembersWithOptions(AddTenantMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddTenantMembersShrinkRequest request = new AddTenantMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addCommand)) {
            request.addCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addCommand, "AddCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addCommandShrink)) {
            body.put("AddCommand", request.addCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTenantMembers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddTenantMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddTenantMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>新增租户成员</p>
     * 
     * @param request AddTenantMembersRequest
     * @return AddTenantMembersResponse
     */
    public AddTenantMembersResponse addTenantMembers(AddTenantMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTenantMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过原始用户添加租户成员.</p>
     * 
     * @param tmpReq AddTenantMembersBySourceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTenantMembersBySourceUserResponse
     */
    public AddTenantMembersBySourceUserResponse addTenantMembersBySourceUserWithOptions(AddTenantMembersBySourceUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddTenantMembersBySourceUserShrinkRequest request = new AddTenantMembersBySourceUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addCommand)) {
            request.addCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addCommand, "AddCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addCommandShrink)) {
            body.put("AddCommand", request.addCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTenantMembersBySourceUser"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddTenantMembersBySourceUserResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddTenantMembersBySourceUserResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过原始用户添加租户成员.</p>
     * 
     * @param request AddTenantMembersBySourceUserRequest
     * @return AddTenantMembersBySourceUserResponse
     */
    public AddTenantMembersBySourceUserResponse addTenantMembersBySourceUser(AddTenantMembersBySourceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTenantMembersBySourceUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户组成员.</p>
     * 
     * @param tmpReq AddUserGroupMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserGroupMemberResponse
     */
    public AddUserGroupMemberResponse addUserGroupMemberWithOptions(AddUserGroupMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddUserGroupMemberShrinkRequest request = new AddUserGroupMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addCommand)) {
            request.addCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addCommand, "AddCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addCommandShrink)) {
            body.put("AddCommand", request.addCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserGroupMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddUserGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加用户组成员.</p>
     * 
     * @param request AddUserGroupMemberRequest
     * @return AddUserGroupMemberResponse
     */
    public AddUserGroupMemberResponse addUserGroupMember(AddUserGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserGroupMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查数据源连通性</p>
     * 
     * @param tmpReq CheckDataSourceConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDataSourceConnectivityResponse
     */
    public CheckDataSourceConnectivityResponse checkDataSourceConnectivityWithOptions(CheckDataSourceConnectivityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckDataSourceConnectivityShrinkRequest request = new CheckDataSourceConnectivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkCommand)) {
            request.checkCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkCommand, "CheckCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkCommandShrink)) {
            body.put("CheckCommand", request.checkCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDataSourceConnectivity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDataSourceConnectivityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckDataSourceConnectivityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>检查数据源连通性</p>
     * 
     * @param request CheckDataSourceConnectivityRequest
     * @return CheckDataSourceConnectivityResponse
     */
    public CheckDataSourceConnectivityResponse checkDataSourceConnectivity(CheckDataSourceConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDataSourceConnectivityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查已创建的数据源是否正常连通</p>
     * 
     * @param request CheckDataSourceConnectivityByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDataSourceConnectivityByIdResponse
     */
    public CheckDataSourceConnectivityByIdResponse checkDataSourceConnectivityByIdWithOptions(CheckDataSourceConnectivityByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDataSourceConnectivityById"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDataSourceConnectivityByIdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckDataSourceConnectivityByIdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>检查已创建的数据源是否正常连通</p>
     * 
     * @param request CheckDataSourceConnectivityByIdRequest
     * @return CheckDataSourceConnectivityByIdResponse
     */
    public CheckDataSourceConnectivityByIdResponse checkDataSourceConnectivityById(CheckDataSourceConnectivityByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDataSourceConnectivityByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验用户是否有指定资源权限点.</p>
     * 
     * @param tmpReq CheckResourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResourcePermissionResponse
     */
    public CheckResourcePermissionResponse checkResourcePermissionWithOptions(CheckResourcePermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckResourcePermissionShrinkRequest request = new CheckResourcePermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.checkCommand)) {
            request.checkCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.checkCommand, "CheckCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkCommandShrink)) {
            body.put("CheckCommand", request.checkCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourcePermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourcePermissionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckResourcePermissionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>校验用户是否有指定资源权限点.</p>
     * 
     * @param request CheckResourcePermissionRequest
     * @return CheckResourcePermissionResponse
     */
    public CheckResourcePermissionResponse checkResourcePermission(CheckResourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResourcePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建即席查询文件</p>
     * 
     * @param tmpReq CreateAdHocFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdHocFileResponse
     */
    public CreateAdHocFileResponse createAdHocFileWithOptions(CreateAdHocFileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAdHocFileShrinkRequest request = new CreateAdHocFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdHocFile"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdHocFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAdHocFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建即席查询文件</p>
     * 
     * @param request CreateAdHocFileRequest
     * @return CreateAdHocFileResponse
     */
    public CreateAdHocFileResponse createAdHocFile(CreateAdHocFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdHocFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建离线计算任务。</p>
     * 
     * @param tmpReq CreateBatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBatchTaskResponse
     */
    public CreateBatchTaskResponse createBatchTaskWithOptions(CreateBatchTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBatchTaskShrinkRequest request = new CreateBatchTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateBatchTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建离线计算任务。</p>
     * 
     * @param request CreateBatchTaskRequest
     * @return CreateBatchTaskResponse
     */
    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建业务实体。</p>
     * 
     * @param tmpReq CreateBizEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBizEntityResponse
     */
    public CreateBizEntityResponse createBizEntityWithOptions(CreateBizEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBizEntityShrinkRequest request = new CreateBizEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBizEntity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizEntityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateBizEntityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建业务实体。</p>
     * 
     * @param request CreateBizEntityRequest
     * @return CreateBizEntityResponse
     */
    public CreateBizEntityResponse createBizEntity(CreateBizEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBizEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据板块。</p>
     * 
     * @param tmpReq CreateBizUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBizUnitResponse
     */
    public CreateBizUnitResponse createBizUnitWithOptions(CreateBizUnitRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBizUnitShrinkRequest request = new CreateBizUnitShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBizUnit"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizUnitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateBizUnitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建数据板块。</p>
     * 
     * @param request CreateBizUnitRequest
     * @return CreateBizUnitResponse
     */
    public CreateBizUnitResponse createBizUnit(CreateBizUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBizUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建主题域。</p>
     * 
     * @param tmpReq CreateDataDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataDomainResponse
     */
    public CreateDataDomainResponse createDataDomainWithOptions(CreateDataDomainRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataDomainShrinkRequest request = new CreateDataDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataDomain"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDataDomainResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建主题域。</p>
     * 
     * @param request CreateDataDomainRequest
     * @return CreateDataDomainResponse
     */
    public CreateDataDomainResponse createDataDomain(CreateDataDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据源</p>
     * 
     * @param tmpReq CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataSourceShrinkRequest request = new CreateDataSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDataSourceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>新建数据源</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建菜单树文件目录</p>
     * 
     * @param tmpReq CreateDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectoryWithOptions(CreateDirectoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDirectoryShrinkRequest request = new CreateDirectoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDirectory"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirectoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDirectoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建菜单树文件目录</p>
     * 
     * @param request CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用补数据接口 1.会生成补数据实例运行：影响相关产产出表数据 2.会进行任务运行：造成计算的费用以及存储的费用</p>
     * 
     * @param tmpReq CreateNodeSupplementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodeSupplementResponse
     */
    public CreateNodeSupplementResponse createNodeSupplementWithOptions(CreateNodeSupplementRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNodeSupplementShrinkRequest request = new CreateNodeSupplementShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeSupplement"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeSupplementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateNodeSupplementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通用补数据接口 1.会生成补数据实例运行：影响相关产产出表数据 2.会进行任务运行：造成计算的费用以及存储的费用</p>
     * 
     * @param request CreateNodeSupplementRequest
     * @return CreateNodeSupplementResponse
     */
    public CreateNodeSupplementResponse createNodeSupplement(CreateNodeSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeSupplementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集成任务。</p>
     * 
     * @param tmpReq CreatePipelineNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineNodeResponse
     */
    public CreatePipelineNodeResponse createPipelineNodeWithOptions(CreatePipelineNodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePipelineNodeShrinkRequest request = new CreatePipelineNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createPipelineNodeCommand)) {
            request.createPipelineNodeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createPipelineNodeCommand, "CreatePipelineNodeCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createPipelineNodeCommandShrink)) {
            body.put("CreatePipelineNodeCommand", request.createPipelineNodeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelineNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineNodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePipelineNodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集成任务。</p>
     * 
     * @param request CreatePipelineNodeRequest
     * @return CreatePipelineNodeResponse
     */
    public CreatePipelineNodeResponse createPipelineNode(CreatePipelineNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPipelineNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流批一体任务</p>
     * 
     * @param tmpReq CreateStreamBatchJobMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamBatchJobMappingResponse
     */
    public CreateStreamBatchJobMappingResponse createStreamBatchJobMappingWithOptions(CreateStreamBatchJobMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStreamBatchJobMappingShrinkRequest request = new CreateStreamBatchJobMappingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamBatchJobMappingCreateCommand)) {
            request.streamBatchJobMappingCreateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamBatchJobMappingCreateCommand, "StreamBatchJobMappingCreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.streamBatchJobMappingCreateCommandShrink)) {
            body.put("StreamBatchJobMappingCreateCommand", request.streamBatchJobMappingCreateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamBatchJobMapping"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamBatchJobMappingResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateStreamBatchJobMappingResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建流批一体任务</p>
     * 
     * @param request CreateStreamBatchJobMappingRequest
     * @return CreateStreamBatchJobMappingResponse
     */
    public CreateStreamBatchJobMappingResponse createStreamBatchJobMapping(CreateStreamBatchJobMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamBatchJobMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建用户组.</p>
     * 
     * @param tmpReq CreateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserGroupShrinkRequest request = new CreateUserGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateUserGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>新建用户组.</p>
     * 
     * @param request CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除菜单树即席查询文件</p>
     * 
     * @param request DeleteAdHocFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAdHocFileResponse
     */
    public DeleteAdHocFileResponse deleteAdHocFileWithOptions(DeleteAdHocFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAdHocFile"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdHocFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAdHocFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除菜单树即席查询文件</p>
     * 
     * @param request DeleteAdHocFileRequest
     * @return DeleteAdHocFileResponse
     */
    public DeleteAdHocFileResponse deleteAdHocFile(DeleteAdHocFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAdHocFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除离线计算任务，如果任务还没下线需要先下线再删除。</p>
     * 
     * @param tmpReq DeleteBatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBatchTaskResponse
     */
    public DeleteBatchTaskResponse deleteBatchTaskWithOptions(DeleteBatchTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteBatchTaskShrinkRequest request = new DeleteBatchTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteCommand)) {
            request.deleteCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteCommand, "DeleteCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteCommandShrink)) {
            body.put("DeleteCommand", request.deleteCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBatchTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBatchTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除离线计算任务，如果任务还没下线需要先下线再删除。</p>
     * 
     * @param request DeleteBatchTaskRequest
     * @return DeleteBatchTaskResponse
     */
    public DeleteBatchTaskResponse deleteBatchTask(DeleteBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务实体。</p>
     * 
     * @param request DeleteBizEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBizEntityResponse
     */
    public DeleteBizEntityResponse deleteBizEntityWithOptions(DeleteBizEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizUnitId)) {
            query.put("BizUnitId", request.bizUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizEntity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizEntityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBizEntityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除业务实体。</p>
     * 
     * @param request DeleteBizEntityRequest
     * @return DeleteBizEntityResponse
     */
    public DeleteBizEntityResponse deleteBizEntity(DeleteBizEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBizEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据板块。</p>
     * 
     * @param request DeleteBizUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBizUnitResponse
     */
    public DeleteBizUnitResponse deleteBizUnitWithOptions(DeleteBizUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizUnit"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizUnitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBizUnitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除数据板块。</p>
     * 
     * @param request DeleteBizUnitRequest
     * @return DeleteBizUnitResponse
     */
    public DeleteBizUnitResponse deleteBizUnit(DeleteBizUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBizUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除主题域。</p>
     * 
     * @param request DeleteDataDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataDomainResponse
     */
    public DeleteDataDomainResponse deleteDataDomainWithOptions(DeleteDataDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizUnitId)) {
            query.put("BizUnitId", request.bizUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataDomain"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDataDomainResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除主题域。</p>
     * 
     * @param request DeleteDataDomainRequest
     * @return DeleteDataDomainResponse
     */
    public DeleteDataDomainResponse deleteDataDomain(DeleteDataDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param tmpReq DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDataSourceShrinkRequest request = new DeleteDataSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteCommand)) {
            request.deleteCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteCommand, "DeleteCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteCommandShrink)) {
            body.put("DeleteCommand", request.deleteCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDataSourceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除菜单树文件目录</p>
     * 
     * @param request DeleteDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectoryWithOptions(DeleteDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDirectory"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDirectoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除菜单树文件目录</p>
     * 
     * @param request DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户组.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUserGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除用户组.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行即席查询任务。</p>
     * 
     * @param tmpReq ExecuteAdHocTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteAdHocTaskResponse
     */
    public ExecuteAdHocTaskResponse executeAdHocTaskWithOptions(ExecuteAdHocTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteAdHocTaskShrinkRequest request = new ExecuteAdHocTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executeCommand)) {
            request.executeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executeCommand, "ExecuteCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executeCommandShrink)) {
            body.put("ExecuteCommand", request.executeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteAdHocTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAdHocTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExecuteAdHocTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>执行即席查询任务。</p>
     * 
     * @param request ExecuteAdHocTaskRequest
     * @return ExecuteAdHocTaskResponse
     */
    public ExecuteAdHocTaskResponse executeAdHocTask(ExecuteAdHocTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeAdHocTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行手动调度节点。</p>
     * 
     * @param tmpReq ExecuteManualNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteManualNodeResponse
     */
    public ExecuteManualNodeResponse executeManualNodeWithOptions(ExecuteManualNodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteManualNodeShrinkRequest request = new ExecuteManualNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executeCommand)) {
            request.executeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executeCommand, "ExecuteCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executeCommandShrink)) {
            body.put("ExecuteCommand", request.executeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteManualNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteManualNodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExecuteManualNodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>运行手动调度节点。</p>
     * 
     * @param request ExecuteManualNodeRequest
     * @return ExecuteManualNodeResponse
     */
    public ExecuteManualNodeResponse executeManualNode(ExecuteManualNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeManualNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重跑下游(修复链路数据), 支持强制重跑下游。影响范围: 1. 会产生计算成本；2. 会影响数据产出</p>
     * 
     * @param tmpReq FixDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FixDataResponse
     */
    public FixDataResponse fixDataWithOptions(FixDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FixDataShrinkRequest request = new FixDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fixDataCommand)) {
            request.fixDataCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fixDataCommand, "FixDataCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fixDataCommandShrink)) {
            body.put("FixDataCommand", request.fixDataCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FixData"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FixDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FixDataResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重跑下游(修复链路数据), 支持强制重跑下游。影响范围: 1. 会产生计算成本；2. 会影响数据产出</p>
     * 
     * @param request FixDataRequest
     * @return FixDataResponse
     */
    public FixDataResponse fixData(FixDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fixDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询即席查询文件。</p>
     * 
     * @param request GetAdHocFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdHocFileResponse
     */
    public GetAdHocFileResponse getAdHocFileWithOptions(GetAdHocFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdHocFile"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAdHocFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询即席查询文件。</p>
     * 
     * @param request GetAdHocFileRequest
     * @return GetAdHocFileResponse
     */
    public GetAdHocFileResponse getAdHocFile(GetAdHocFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdHocFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取即席查询任务运行日志。</p>
     * 
     * @param request GetAdHocTaskLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdHocTaskLogResponse
     */
    public GetAdHocTaskLogResponse getAdHocTaskLogWithOptions(GetAdHocTaskLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subTaskId)) {
            query.put("SubTaskId", request.subTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdHocTaskLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocTaskLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAdHocTaskLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取即席查询任务运行日志。</p>
     * 
     * @param request GetAdHocTaskLogRequest
     * @return GetAdHocTaskLogResponse
     */
    public GetAdHocTaskLogResponse getAdHocTaskLog(GetAdHocTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdHocTaskLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取即席查询的任务运行结果。</p>
     * 
     * @param request GetAdHocTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdHocTaskResultResponse
     */
    public GetAdHocTaskResultResponse getAdHocTaskResultWithOptions(GetAdHocTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subTaskId)) {
            query.put("SubTaskId", request.subTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdHocTaskResult"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocTaskResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAdHocTaskResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取即席查询的任务运行结果。</p>
     * 
     * @param request GetAdHocTaskResultRequest
     * @return GetAdHocTaskResultResponse
     */
    public GetAdHocTaskResultResponse getAdHocTaskResult(GetAdHocTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdHocTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取告警事件详情</p>
     * 
     * @param request GetAlertEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertEventResponse
     */
    public GetAlertEventResponse getAlertEventWithOptions(GetAlertEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertEvent"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertEventResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAlertEventResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取告警事件详情</p>
     * 
     * @param request GetAlertEventRequest
     * @return GetAlertEventResponse
     */
    public GetAlertEventResponse getAlertEvent(GetAlertEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务详情。</p>
     * 
     * @param request GetBatchTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTaskInfoResponse
     */
    public GetBatchTaskInfoResponse getBatchTaskInfoWithOptions(GetBatchTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeAllUpStreams)) {
            query.put("IncludeAllUpStreams", request.includeAllUpStreams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBatchTaskInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务详情。</p>
     * 
     * @param request GetBatchTaskInfoRequest
     * @return GetBatchTaskInfoResponse
     */
    public GetBatchTaskInfoResponse getBatchTaskInfo(GetBatchTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务指定版本任务详情。</p>
     * 
     * @param request GetBatchTaskInfoByVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTaskInfoByVersionResponse
     */
    public GetBatchTaskInfoByVersionResponse getBatchTaskInfoByVersionWithOptions(GetBatchTaskInfoByVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskInfoByVersion"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskInfoByVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBatchTaskInfoByVersionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务指定版本任务详情。</p>
     * 
     * @param request GetBatchTaskInfoByVersionRequest
     * @return GetBatchTaskInfoByVersionResponse
     */
    public GetBatchTaskInfoByVersionResponse getBatchTaskInfoByVersion(GetBatchTaskInfoByVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTaskInfoByVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线任务自定义血缘。</p>
     * 
     * @param request GetBatchTaskUdfLineagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTaskUdfLineagesResponse
     */
    public GetBatchTaskUdfLineagesResponse getBatchTaskUdfLineagesWithOptions(GetBatchTaskUdfLineagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskUdfLineages"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskUdfLineagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBatchTaskUdfLineagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取离线任务自定义血缘。</p>
     * 
     * @param request GetBatchTaskUdfLineagesRequest
     * @return GetBatchTaskUdfLineagesResponse
     */
    public GetBatchTaskUdfLineagesResponse getBatchTaskUdfLineages(GetBatchTaskUdfLineagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTaskUdfLineagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务版本列表。</p>
     * 
     * @param request GetBatchTaskVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTaskVersionsResponse
     */
    public GetBatchTaskVersionsResponse getBatchTaskVersionsWithOptions(GetBatchTaskVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTaskVersions"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskVersionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBatchTaskVersionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取离线计算任务版本列表。</p>
     * 
     * @param request GetBatchTaskVersionsRequest
     * @return GetBatchTaskVersionsResponse
     */
    public GetBatchTaskVersionsResponse getBatchTaskVersions(GetBatchTaskVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTaskVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取业务实体详情。</p>
     * 
     * @param request GetBizEntityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBizEntityInfoResponse
     */
    public GetBizEntityInfoResponse getBizEntityInfoWithOptions(GetBizEntityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBizEntityInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizEntityInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBizEntityInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取业务实体详情。</p>
     * 
     * @param request GetBizEntityInfoRequest
     * @return GetBizEntityInfoResponse
     */
    public GetBizEntityInfoResponse getBizEntityInfo(GetBizEntityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBizEntityInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定版本的业务实体的详情。</p>
     * 
     * @param request GetBizEntityInfoByVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBizEntityInfoByVersionResponse
     */
    public GetBizEntityInfoByVersionResponse getBizEntityInfoByVersionWithOptions(GetBizEntityInfoByVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBizEntityInfoByVersion"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizEntityInfoByVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBizEntityInfoByVersionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询指定版本的业务实体的详情。</p>
     * 
     * @param request GetBizEntityInfoByVersionRequest
     * @return GetBizEntityInfoByVersionResponse
     */
    public GetBizEntityInfoByVersionResponse getBizEntityInfoByVersion(GetBizEntityInfoByVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBizEntityInfoByVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据板块详情。</p>
     * 
     * @param request GetBizUnitInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBizUnitInfoResponse
     */
    public GetBizUnitInfoResponse getBizUnitInfoWithOptions(GetBizUnitInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBizUnitInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizUnitInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBizUnitInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取数据板块详情。</p>
     * 
     * @param request GetBizUnitInfoRequest
     * @return GetBizUnitInfoResponse
     */
    public GetBizUnitInfoResponse getBizUnitInfo(GetBizUnitInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBizUnitInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据环境获取集群信息</p>
     * 
     * @param request GetClusterQueueInfoByEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterQueueInfoByEnvResponse
     */
    public GetClusterQueueInfoByEnvResponse getClusterQueueInfoByEnvWithOptions(GetClusterQueueInfoByEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamBatchMode)) {
            query.put("StreamBatchMode", request.streamBatchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterQueueInfoByEnv"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterQueueInfoByEnvResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetClusterQueueInfoByEnvResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据环境获取集群信息</p>
     * 
     * @param request GetClusterQueueInfoByEnvRequest
     * @return GetClusterQueueInfoByEnvResponse
     */
    public GetClusterQueueInfoByEnvResponse getClusterQueueInfoByEnv(GetClusterQueueInfoByEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterQueueInfoByEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主题域详情。</p>
     * 
     * @param request GetDataDomainInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataDomainInfoResponse
     */
    public GetDataDomainInfoResponse getDataDomainInfoWithOptions(GetDataDomainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataDomainInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataDomainInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDataDomainInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取主题域详情。</p>
     * 
     * @param request GetDataDomainInfoRequest
     * @return GetDataDomainInfoResponse
     */
    public GetDataDomainInfoResponse getDataDomainInfo(GetDataDomainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataDomainInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询开发态对象上游依赖。</p>
     * 
     * @param request GetDevObjectDependencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDevObjectDependencyResponse
     */
    public GetDevObjectDependencyResponse getDevObjectDependencyWithOptions(GetDevObjectDependencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectFrom)) {
            query.put("ObjectFrom", request.objectFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDevObjectDependency"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDevObjectDependencyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDevObjectDependencyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询开发态对象上游依赖。</p>
     * 
     * @param request GetDevObjectDependencyRequest
     * @return GetDevObjectDependencyResponse
     */
    public GetDevObjectDependencyResponse getDevObjectDependency(GetDevObjectDependencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDevObjectDependencyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件夹目录树</p>
     * 
     * @param request GetDirectoryTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectoryTreeResponse
     */
    public GetDirectoryTreeResponse getDirectoryTreeWithOptions(GetDirectoryTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectoryTree"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryTreeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDirectoryTreeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取文件夹目录树</p>
     * 
     * @param request GetDirectoryTreeRequest
     * @return GetDirectoryTreeResponse
     */
    public GetDirectoryTreeResponse getDirectoryTree(GetDirectoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据起始的实例查询该实例的下游</p>
     * 
     * @param tmpReq GetInstanceDownStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceDownStreamResponse
     */
    public GetInstanceDownStreamResponse getInstanceDownStreamWithOptions(GetInstanceDownStreamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetInstanceDownStreamShrinkRequest request = new GetInstanceDownStreamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceGet)) {
            request.instanceGetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceGet, "InstanceGet", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downStreamDepth)) {
            query.put("DownStreamDepth", request.downStreamDepth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runStatus)) {
            query.put("RunStatus", request.runStatus);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceGetShrink)) {
            body.put("InstanceGet", request.instanceGetShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceDownStream"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceDownStreamResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetInstanceDownStreamResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据起始的实例查询该实例的下游</p>
     * 
     * @param request GetInstanceDownStreamRequest
     * @return GetInstanceDownStreamResponse
     */
    public GetInstanceDownStreamResponse getInstanceDownStream(GetInstanceDownStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceDownStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例的上下游，支持逻辑表和代码任务。</p>
     * 
     * @param tmpReq GetInstanceUpDownStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceUpDownStreamResponse
     */
    public GetInstanceUpDownStreamResponse getInstanceUpDownStreamWithOptions(GetInstanceUpDownStreamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetInstanceUpDownStreamShrinkRequest request = new GetInstanceUpDownStreamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceId)) {
            request.instanceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceId, "InstanceId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downStreamDepth)) {
            query.put("DownStreamDepth", request.downStreamDepth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upStreamDepth)) {
            query.put("UpStreamDepth", request.upStreamDepth);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdShrink)) {
            body.put("InstanceId", request.instanceIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceUpDownStream"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceUpDownStreamResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetInstanceUpDownStreamResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询实例的上下游，支持逻辑表和代码任务。</p>
     * 
     * @param request GetInstanceUpDownStreamRequest
     * @return GetInstanceUpDownStreamResponse
     */
    public GetInstanceUpDownStreamResponse getInstanceUpDownStream(GetInstanceUpDownStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceUpDownStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取最新的待发布记录详情</p>
     * 
     * @param tmpReq GetLatestSubmitDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLatestSubmitDetailResponse
     */
    public GetLatestSubmitDetailResponse getLatestSubmitDetailWithOptions(GetLatestSubmitDetailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLatestSubmitDetailShrinkRequest request = new GetLatestSubmitDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.submitDetailQuery)) {
            request.submitDetailQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.submitDetailQuery, "SubmitDetailQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.submitDetailQueryShrink)) {
            body.put("SubmitDetailQuery", request.submitDetailQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestSubmitDetail"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestSubmitDetailResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetLatestSubmitDetailResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取最新的待发布记录详情</p>
     * 
     * @param request GetLatestSubmitDetailRequest
     * @return GetLatestSubmitDetailResponse
     */
    public GetLatestSubmitDetailResponse getLatestSubmitDetail(GetLatestSubmitDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLatestSubmitDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request GetMyRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMyRolesResponse
     */
    public GetMyRolesResponse getMyRolesWithOptions(GetMyRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMyRoles"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMyRolesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMyRolesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request GetMyRolesRequest
     * @return GetMyRolesResponse
     */
    public GetMyRolesResponse getMyRoles(GetMyRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMyRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户归属租户.</p>
     * 
     * @param tmpReq GetMyTenantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMyTenantsResponse
     */
    public GetMyTenantsResponse getMyTenantsWithOptions(GetMyTenantsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMyTenantsShrinkRequest request = new GetMyTenantsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.featureCodeList)) {
            request.featureCodeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.featureCodeList, "FeatureCodeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureCodeListShrink)) {
            body.put("FeatureCodeList", request.featureCodeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMyTenants"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMyTenantsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMyTenantsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户归属租户.</p>
     * 
     * @param request GetMyTenantsRequest
     * @return GetMyTenantsResponse
     */
    public GetMyTenantsResponse getMyTenants(GetMyTenantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMyTenantsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用查询节点上下游接口</p>
     * 
     * @param tmpReq GetNodeUpDownStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeUpDownStreamResponse
     */
    public GetNodeUpDownStreamResponse getNodeUpDownStreamWithOptions(GetNodeUpDownStreamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNodeUpDownStreamShrinkRequest request = new GetNodeUpDownStreamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeId)) {
            request.nodeIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeId, "NodeId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downStreamDepth)) {
            query.put("DownStreamDepth", request.downStreamDepth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upStreamDepth)) {
            query.put("UpStreamDepth", request.upStreamDepth);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdShrink)) {
            body.put("NodeId", request.nodeIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeUpDownStream"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeUpDownStreamResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetNodeUpDownStreamResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通用查询节点上下游接口</p>
     * 
     * @param request GetNodeUpDownStreamRequest
     * @return GetNodeUpDownStreamResponse
     */
    public GetNodeUpDownStreamResponse getNodeUpDownStream(GetNodeUpDownStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeUpDownStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询补数据提交的状态</p>
     * 
     * @param request GetOperationSubmitStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOperationSubmitStatusResponse
     */
    public GetOperationSubmitStatusResponse getOperationSubmitStatusWithOptions(GetOperationSubmitStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperationSubmitStatus"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationSubmitStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetOperationSubmitStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询补数据提交的状态</p>
     * 
     * @param request GetOperationSubmitStatusRequest
     * @return GetOperationSubmitStatusResponse
     */
    public GetOperationSubmitStatusResponse getOperationSubmitStatus(GetOperationSubmitStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationSubmitStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询脚本的实例信息, 包括实例状态、运行时间等信息.</p>
     * 
     * @param request GetPhysicalInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalInstanceResponse
     */
    public GetPhysicalInstanceResponse getPhysicalInstanceWithOptions(GetPhysicalInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalInstance"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询脚本的实例信息, 包括实例状态、运行时间等信息.</p>
     * 
     * @param request GetPhysicalInstanceRequest
     * @return GetPhysicalInstanceResponse
     */
    public GetPhysicalInstanceResponse getPhysicalInstance(GetPhysicalInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例执行的日志，如果实例重跑了多次，则会有多条日志</p>
     * 
     * @param request GetPhysicalInstanceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalInstanceLogResponse
     */
    public GetPhysicalInstanceLogResponse getPhysicalInstanceLogWithOptions(GetPhysicalInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalInstanceLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalInstanceLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalInstanceLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例执行的日志，如果实例重跑了多次，则会有多条日志</p>
     * 
     * @param request GetPhysicalInstanceLogRequest
     * @return GetPhysicalInstanceLogResponse
     */
    public GetPhysicalInstanceLogResponse getPhysicalInstanceLog(GetPhysicalInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalInstanceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询物理调度节点。</p>
     * 
     * @param request GetPhysicalNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalNodeResponse
     */
    public GetPhysicalNodeResponse getPhysicalNodeWithOptions(GetPhysicalNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalNodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询物理调度节点。</p>
     * 
     * @param request GetPhysicalNodeRequest
     * @return GetPhysicalNodeResponse
     */
    public GetPhysicalNodeResponse getPhysicalNode(GetPhysicalNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据输出名查询对应的物理节点。</p>
     * 
     * @param request GetPhysicalNodeByOutputNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalNodeByOutputNameResponse
     */
    public GetPhysicalNodeByOutputNameResponse getPhysicalNodeByOutputNameWithOptions(GetPhysicalNodeByOutputNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputName)) {
            query.put("OutputName", request.outputName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalNodeByOutputName"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeByOutputNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalNodeByOutputNameResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据输出名查询对应的物理节点。</p>
     * 
     * @param request GetPhysicalNodeByOutputNameRequest
     * @return GetPhysicalNodeByOutputNameResponse
     */
    public GetPhysicalNodeByOutputNameResponse getPhysicalNodeByOutputName(GetPhysicalNodeByOutputNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalNodeByOutputNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询调度节点代码内容。</p>
     * 
     * @param request GetPhysicalNodeContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalNodeContentResponse
     */
    public GetPhysicalNodeContentResponse getPhysicalNodeContentWithOptions(GetPhysicalNodeContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalNodeContent"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeContentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalNodeContentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询调度节点代码内容。</p>
     * 
     * @param request GetPhysicalNodeContentRequest
     * @return GetPhysicalNodeContentResponse
     */
    public GetPhysicalNodeContentResponse getPhysicalNodeContent(GetPhysicalNodeContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalNodeContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点的操作日志。</p>
     * 
     * @param request GetPhysicalNodeOperationLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalNodeOperationLogResponse
     */
    public GetPhysicalNodeOperationLogResponse getPhysicalNodeOperationLogWithOptions(GetPhysicalNodeOperationLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalNodeOperationLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeOperationLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPhysicalNodeOperationLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询节点的操作日志。</p>
     * 
     * @param request GetPhysicalNodeOperationLogRequest
     * @return GetPhysicalNodeOperationLogResponse
     */
    public GetPhysicalNodeOperationLogResponse getPhysicalNodeOperationLog(GetPhysicalNodeOperationLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalNodeOperationLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目生产账号</p>
     * 
     * @param request GetProjectProduceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectProduceUserResponse
     */
    public GetProjectProduceUserResponse getProjectProduceUserWithOptions(GetProjectProduceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectProduceUser"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectProduceUserResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectProduceUserResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取项目生产账号</p>
     * 
     * @param request GetProjectProduceUserRequest
     * @return GetProjectProduceUserResponse
     */
    public GetProjectProduceUserResponse getProjectProduceUser(GetProjectProduceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectProduceUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据集群ID获取集群版本</p>
     * 
     * @param request GetQueueEngineVersionByEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueEngineVersionByEnvResponse
     */
    public GetQueueEngineVersionByEnvResponse getQueueEngineVersionByEnvWithOptions(GetQueueEngineVersionByEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamBatchMode)) {
            query.put("StreamBatchMode", request.streamBatchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueEngineVersionByEnv"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueEngineVersionByEnvResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetQueueEngineVersionByEnvResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据集群ID获取集群版本</p>
     * 
     * @param request GetQueueEngineVersionByEnvRequest
     * @return GetQueueEngineVersionByEnvResponse
     */
    public GetQueueEngineVersionByEnvResponse getQueueEngineVersionByEnv(GetQueueEngineVersionByEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueEngineVersionByEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取计算源对应集群的spark客户信息</p>
     * 
     * @param request GetSparkLocalClientInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkLocalClientInfoResponse
     */
    public GetSparkLocalClientInfoResponse getSparkLocalClientInfoWithOptions(GetSparkLocalClientInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envEnum)) {
            query.put("EnvEnum", request.envEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkLocalClientInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkLocalClientInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSparkLocalClientInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取计算源对应集群的spark客户信息</p>
     * 
     * @param request GetSparkLocalClientInfoRequest
     * @return GetSparkLocalClientInfoResponse
     */
    public GetSparkLocalClientInfoResponse getSparkLocalClientInfo(GetSparkLocalClientInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkLocalClientInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取补数据工作流所有业务日期的Dagrun信息。</p>
     * 
     * @param request GetSupplementDagrunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSupplementDagrunResponse
     */
    public GetSupplementDagrunResponse getSupplementDagrunWithOptions(GetSupplementDagrunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementId)) {
            query.put("SupplementId", request.supplementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupplementDagrun"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupplementDagrunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSupplementDagrunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取补数据工作流所有业务日期的Dagrun信息。</p>
     * 
     * @param request GetSupplementDagrunRequest
     * @return GetSupplementDagrunResponse
     */
    public GetSupplementDagrunResponse getSupplementDagrun(GetSupplementDagrunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupplementDagrunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出补数据工作流下具体一个业务日期的所有节点的实例。</p>
     * 
     * @param request GetSupplementDagrunInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSupplementDagrunInstanceResponse
     */
    public GetSupplementDagrunInstanceResponse getSupplementDagrunInstanceWithOptions(GetSupplementDagrunInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagrunId)) {
            query.put("DagrunId", request.dagrunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupplementDagrunInstance"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupplementDagrunInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSupplementDagrunInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列出补数据工作流下具体一个业务日期的所有节点的实例。</p>
     * 
     * @param request GetSupplementDagrunInstanceRequest
     * @return GetSupplementDagrunInstanceResponse
     */
    public GetSupplementDagrunInstanceResponse getSupplementDagrunInstance(GetSupplementDagrunInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupplementDagrunInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过用户原始Id（如阿里云Id）获取用户详情</p>
     * 
     * @param request GetUserBySourceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserBySourceIdResponse
     */
    public GetUserBySourceIdResponse getUserBySourceIdWithOptions(GetUserBySourceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserBySourceId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserBySourceIdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetUserBySourceIdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过用户原始Id（如阿里云Id）获取用户详情</p>
     * 
     * @param request GetUserBySourceIdRequest
     * @return GetUserBySourceIdResponse
     */
    public GetUserBySourceIdResponse getUserBySourceId(GetUserBySourceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserBySourceIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户组详情.</p>
     * 
     * @param request GetUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroupWithOptions(GetUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGroup"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetUserGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取用户组详情.</p>
     * 
     * @param request GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroup(GetUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户详情</p>
     * 
     * @param tmpReq GetUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUsersResponse
     */
    public GetUsersResponse getUsersWithOptions(GetUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUsersShrinkRequest request = new GetUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "UserIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIdListShrink)) {
            body.put("UserIdList", request.userIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUsers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取用户详情</p>
     * 
     * @param request GetUsersRequest
     * @return GetUsersResponse
     */
    public GetUsersResponse getUsers(GetUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过资源点对用户授权</p>
     * 
     * @param tmpReq GrantResourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantResourcePermissionResponse
     */
    public GrantResourcePermissionResponse grantResourcePermissionWithOptions(GrantResourcePermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantResourcePermissionShrinkRequest request = new GrantResourcePermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.grantCommand)) {
            request.grantCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.grantCommand, "GrantCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grantCommandShrink)) {
            body.put("GrantCommand", request.grantCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantResourcePermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GrantResourcePermissionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GrantResourcePermissionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过资源点对用户授权</p>
     * 
     * @param request GrantResourcePermissionRequest
     * @return GrantResourcePermissionResponse
     */
    public GrantResourcePermissionResponse grantResourcePermission(GrantResourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantResourcePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request ListAddableRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddableRolesResponse
     */
    public ListAddableRolesResponse listAddableRolesWithOptions(ListAddableRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddableRoles"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddableRolesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAddableRolesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request ListAddableRolesRequest
     * @return ListAddableRolesResponse
     */
    public ListAddableRolesResponse listAddableRoles(ListAddableRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddableRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取可加入租户成员列表的用户</p>
     * 
     * @param tmpReq ListAddableUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddableUsersResponse
     */
    public ListAddableUsersResponse listAddableUsersWithOptions(ListAddableUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAddableUsersShrinkRequest request = new ListAddableUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddableUsers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddableUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAddableUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取可加入租户成员列表的用户</p>
     * 
     * @param request ListAddableUsersRequest
     * @return ListAddableUsersResponse
     */
    public ListAddableUsersResponse listAddableUsers(ListAddableUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddableUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据条件查询多个告警事件</p>
     * 
     * @param tmpReq ListAlertEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertEventsResponse
     */
    public ListAlertEventsResponse listAlertEventsWithOptions(ListAlertEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlertEventsShrinkRequest request = new ListAlertEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertEvents"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertEventsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAlertEventsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据条件查询多个告警事件</p>
     * 
     * @param request ListAlertEventsRequest
     * @return ListAlertEventsResponse
     */
    public ListAlertEventsResponse listAlertEvents(ListAlertEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据条件查询多个推送记录</p>
     * 
     * @param tmpReq ListAlertNotificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertNotificationsResponse
     */
    public ListAlertNotificationsResponse listAlertNotificationsWithOptions(ListAlertNotificationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlertNotificationsShrinkRequest request = new ListAlertNotificationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertNotifications"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertNotificationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAlertNotificationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据条件查询多个推送记录</p>
     * 
     * @param request ListAlertNotificationsRequest
     * @return ListAlertNotificationsResponse
     */
    public ListAlertNotificationsResponse listAlertNotifications(ListAlertNotificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertNotificationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用已申请的API的具体的字段列表</p>
     * 
     * @param tmpReq ListAuthorizedDataServiceApiDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedDataServiceApiDetailsResponse
     */
    public ListAuthorizedDataServiceApiDetailsResponse listAuthorizedDataServiceApiDetailsWithOptions(ListAuthorizedDataServiceApiDetailsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAuthorizedDataServiceApiDetailsShrinkRequest request = new ListAuthorizedDataServiceApiDetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedDataServiceApiDetails"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedDataServiceApiDetailsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAuthorizedDataServiceApiDetailsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询应用已申请的API的具体的字段列表</p>
     * 
     * @param request ListAuthorizedDataServiceApiDetailsRequest
     * @return ListAuthorizedDataServiceApiDetailsResponse
     */
    public ListAuthorizedDataServiceApiDetailsResponse listAuthorizedDataServiceApiDetails(ListAuthorizedDataServiceApiDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedDataServiceApiDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务实体列表。</p>
     * 
     * @param tmpReq ListBizEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBizEntitiesResponse
     */
    public ListBizEntitiesResponse listBizEntitiesWithOptions(ListBizEntitiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListBizEntitiesShrinkRequest request = new ListBizEntitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBizEntities"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizEntitiesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListBizEntitiesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询业务实体列表。</p>
     * 
     * @param request ListBizEntitiesRequest
     * @return ListBizEntitiesResponse
     */
    public ListBizEntitiesResponse listBizEntities(ListBizEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBizEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前租户下的所有数据板块</p>
     * 
     * @param request ListBizUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBizUnitsResponse
     */
    public ListBizUnitsResponse listBizUnitsWithOptions(ListBizUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBizUnits"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizUnitsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListBizUnitsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前租户下的所有数据板块</p>
     * 
     * @param request ListBizUnitsRequest
     * @return ListBizUnitsResponse
     */
    public ListBizUnitsResponse listBizUnits(ListBizUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBizUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主题域列表。</p>
     * 
     * @param tmpReq ListDataDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataDomainsResponse
     */
    public ListDataDomainsResponse listDataDomainsWithOptions(ListDataDomainsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataDomainsShrinkRequest request = new ListDataDomainsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataDomains"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataDomainsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDataDomainsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取主题域列表。</p>
     * 
     * @param request ListDataDomainsRequest
     * @return ListDataDomainsResponse
     */
    public ListDataDomainsResponse listDataDomains(ListDataDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索数据源，所属结果包含数据源配置项</p>
     * 
     * @param tmpReq ListDataSourceWithConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceWithConfigResponse
     */
    public ListDataSourceWithConfigResponse listDataSourceWithConfigWithOptions(ListDataSourceWithConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourceWithConfigShrinkRequest request = new ListDataSourceWithConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceWithConfig"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceWithConfigResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDataSourceWithConfigResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>搜索数据源，所属结果包含数据源配置项</p>
     * 
     * @param request ListDataSourceWithConfigRequest
     * @return ListDataSourceWithConfigResponse
     */
    public ListDataSourceWithConfigResponse listDataSourceWithConfig(ListDataSourceWithConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceWithConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>遍历菜单树目录文件。</p>
     * 
     * @param tmpReq ListFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilesResponse
     */
    public ListFilesResponse listFilesWithOptions(ListFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFilesShrinkRequest request = new ListFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListFilesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>遍历菜单树目录文件。</p>
     * 
     * @param request ListFilesRequest
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询实例。</p>
     * 
     * @param tmpReq ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstancesShrinkRequest request = new ListInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页查询实例。</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点下游，创建补数据工作流时可以作为数据参考</p>
     * 
     * @param tmpReq ListNodeDownStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeDownStreamResponse
     */
    public ListNodeDownStreamResponse listNodeDownStreamWithOptions(ListNodeDownStreamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodeDownStreamShrinkRequest request = new ListNodeDownStreamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeDownStream"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeDownStreamResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListNodeDownStreamResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询节点下游，创建补数据工作流时可以作为数据参考</p>
     * 
     * @param request ListNodeDownStreamRequest
     * @return ListNodeDownStreamResponse
     */
    public ListNodeDownStreamResponse listNodeDownStream(ListNodeDownStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeDownStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询调度节点列表。</p>
     * 
     * @param tmpReq ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListNodesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询调度节点列表。</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取发布记录列表</p>
     * 
     * @param tmpReq ListPublishRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishRecordsResponse
     */
    public ListPublishRecordsResponse listPublishRecordsWithOptions(ListPublishRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPublishRecordsShrinkRequest request = new ListPublishRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishRecords"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishRecordsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPublishRecordsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页获取发布记录列表</p>
     * 
     * @param request ListPublishRecordsRequest
     * @return ListPublishRecordsResponse
     */
    public ListPublishRecordsResponse listPublishRecords(ListPublishRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取权限操作列表</p>
     * 
     * @param tmpReq ListResourcePermissionOperationLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcePermissionOperationLogResponse
     */
    public ListResourcePermissionOperationLogResponse listResourcePermissionOperationLogWithOptions(ListResourcePermissionOperationLogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourcePermissionOperationLogShrinkRequest request = new ListResourcePermissionOperationLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourcePermissionOperationLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcePermissionOperationLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListResourcePermissionOperationLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页获取权限操作列表</p>
     * 
     * @param request ListResourcePermissionOperationLogRequest
     * @return ListResourcePermissionOperationLogResponse
     */
    public ListResourcePermissionOperationLogResponse listResourcePermissionOperationLog(ListResourcePermissionOperationLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcePermissionOperationLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取权限记录列表</p>
     * 
     * @param tmpReq ListResourcePermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcePermissionsResponse
     */
    public ListResourcePermissionsResponse listResourcePermissionsWithOptions(ListResourcePermissionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourcePermissionsShrinkRequest request = new ListResourcePermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourcePermissions"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcePermissionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListResourcePermissionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页获取权限记录列表</p>
     * 
     * @param request ListResourcePermissionsRequest
     * @return ListResourcePermissionsResponse
     */
    public ListResourcePermissionsResponse listResourcePermissions(ListResourcePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcePermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页获取待发布记录列表</p>
     * 
     * @param tmpReq ListSubmitRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubmitRecordsResponse
     */
    public ListSubmitRecordsResponse listSubmitRecordsWithOptions(ListSubmitRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSubmitRecordsShrinkRequest request = new ListSubmitRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubmitRecords"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubmitRecordsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSubmitRecordsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页获取待发布记录列表</p>
     * 
     * @param request ListSubmitRecordsRequest
     * @return ListSubmitRecordsResponse
     */
    public ListSubmitRecordsResponse listSubmitRecords(ListSubmitRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubmitRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询租户成员列表</p>
     * 
     * @param tmpReq ListTenantMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantMembersResponse
     */
    public ListTenantMembersResponse listTenantMembersWithOptions(ListTenantMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTenantMembersShrinkRequest request = new ListTenantMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantMembers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTenantMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询租户成员列表</p>
     * 
     * @param request ListTenantMembersRequest
     * @return ListTenantMembersResponse
     */
    public ListTenantMembersResponse listTenantMembers(ListTenantMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTenantMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户组成员列表分页查询.</p>
     * 
     * @param tmpReq ListUserGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupMembersResponse
     */
    public ListUserGroupMembersResponse listUserGroupMembersWithOptions(ListUserGroupMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserGroupMembersShrinkRequest request = new ListUserGroupMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupMembers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUserGroupMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>用户组成员列表分页查询.</p>
     * 
     * @param request ListUserGroupMembersRequest
     * @return ListUserGroupMembersResponse
     */
    public ListUserGroupMembersResponse listUserGroupMembers(ListUserGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户组列表分页查询.</p>
     * 
     * @param tmpReq ListUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserGroupsShrinkRequest request = new ListUserGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listQueryShrink)) {
            body.put("ListQuery", request.listQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroups"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUserGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>用户组列表分页查询.</p>
     * 
     * @param request ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线离线计算任务。</p>
     * 
     * @param request OfflineBatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineBatchTaskResponse
     */
    public OfflineBatchTaskResponse offlineBatchTaskWithOptions(OfflineBatchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineBatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineBatchTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OfflineBatchTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>下线离线计算任务。</p>
     * 
     * @param request OfflineBatchTaskRequest
     * @return OfflineBatchTaskResponse
     */
    public OfflineBatchTaskResponse offlineBatchTask(OfflineBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineBatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线业务实体、</p>
     * 
     * @param tmpReq OfflineBizEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineBizEntityResponse
     */
    public OfflineBizEntityResponse offlineBizEntityWithOptions(OfflineBizEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflineBizEntityShrinkRequest request = new OfflineBizEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.offlineCommand)) {
            request.offlineCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.offlineCommand, "OfflineCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offlineCommandShrink)) {
            body.put("OfflineCommand", request.offlineCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineBizEntity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineBizEntityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OfflineBizEntityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>下线业务实体、</p>
     * 
     * @param request OfflineBizEntityRequest
     * @return OfflineBizEntityResponse
     */
    public OfflineBizEntityResponse offlineBizEntity(OfflineBizEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineBizEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上线业务实体。</p>
     * 
     * @param tmpReq OnlineBizEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OnlineBizEntityResponse
     */
    public OnlineBizEntityResponse onlineBizEntityWithOptions(OnlineBizEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OnlineBizEntityShrinkRequest request = new OnlineBizEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.onlineCommand)) {
            request.onlineCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.onlineCommand, "OnlineCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlineCommandShrink)) {
            body.put("OnlineCommand", request.onlineCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OnlineBizEntity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineBizEntityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OnlineBizEntityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>上线业务实体。</p>
     * 
     * @param request OnlineBizEntityRequest
     * @return OnlineBizEntityResponse
     */
    public OnlineBizEntityResponse onlineBizEntity(OnlineBizEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.onlineBizEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运维实例。</p>
     * 
     * @param tmpReq OperateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateInstanceResponse
     */
    public OperateInstanceResponse operateInstanceWithOptions(OperateInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateInstanceShrinkRequest request = new OperateInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operateCommand)) {
            request.operateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operateCommand, "OperateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateCommandShrink)) {
            body.put("OperateCommand", request.operateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateInstance"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OperateInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OperateInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>运维实例。</p>
     * 
     * @param request OperateInstanceRequest
     * @return OperateInstanceResponse
     */
    public OperateInstanceResponse operateInstance(OperateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解析离线计算任务的逻辑表依赖，注意解析结果上游依赖信息中可能包含自依赖节点（上游节点ID和解析代码的任务节点ID相同）需要用户自己进行处理。</p>
     * 
     * @param tmpReq ParseBatchTaskDependencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ParseBatchTaskDependencyResponse
     */
    public ParseBatchTaskDependencyResponse parseBatchTaskDependencyWithOptions(ParseBatchTaskDependencyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ParseBatchTaskDependencyShrinkRequest request = new ParseBatchTaskDependencyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parseCommand)) {
            request.parseCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parseCommand, "ParseCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parseCommandShrink)) {
            body.put("ParseCommand", request.parseCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ParseBatchTaskDependency"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ParseBatchTaskDependencyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ParseBatchTaskDependencyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>解析离线计算任务的逻辑表依赖，注意解析结果上游依赖信息中可能包含自依赖节点（上游节点ID和解析代码的任务节点ID相同）需要用户自己进行处理。</p>
     * 
     * @param request ParseBatchTaskDependencyRequest
     * @return ParseBatchTaskDependencyResponse
     */
    public ParseBatchTaskDependencyResponse parseBatchTaskDependency(ParseBatchTaskDependencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.parseBatchTaskDependencyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停物理节点调度。</p>
     * 
     * @param tmpReq PausePhysicalNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PausePhysicalNodeResponse
     */
    public PausePhysicalNodeResponse pausePhysicalNodeWithOptions(PausePhysicalNodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PausePhysicalNodeShrinkRequest request = new PausePhysicalNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pauseCommand)) {
            request.pauseCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pauseCommand, "PauseCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pauseCommandShrink)) {
            body.put("PauseCommand", request.pauseCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PausePhysicalNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PausePhysicalNodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PausePhysicalNodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>暂停物理节点调度。</p>
     * 
     * @param request PausePhysicalNodeRequest
     * @return PausePhysicalNodeResponse
     */
    public PausePhysicalNodeResponse pausePhysicalNode(PausePhysicalNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pausePhysicalNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量发布对象</p>
     * 
     * @param tmpReq PublishObjectListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishObjectListResponse
     */
    public PublishObjectListResponse publishObjectListWithOptions(PublishObjectListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishObjectListShrinkRequest request = new PublishObjectListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.publishCommand)) {
            request.publishCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.publishCommand, "PublishCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.publishCommandShrink)) {
            body.put("PublishCommand", request.publishCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishObjectList"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PublishObjectListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PublishObjectListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量发布对象</p>
     * 
     * @param request PublishObjectListRequest
     * @return PublishObjectListResponse
     */
    public PublishObjectListResponse publishObjectList(PublishObjectListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishObjectListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除租户成员</p>
     * 
     * @param tmpReq RemoveTenantMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTenantMemberResponse
     */
    public RemoveTenantMemberResponse removeTenantMemberWithOptions(RemoveTenantMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveTenantMemberShrinkRequest request = new RemoveTenantMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.removeCommand)) {
            request.removeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.removeCommand, "RemoveCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.removeCommandShrink)) {
            body.put("RemoveCommand", request.removeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTenantMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTenantMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveTenantMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除租户成员</p>
     * 
     * @param request RemoveTenantMemberRequest
     * @return RemoveTenantMemberResponse
     */
    public RemoveTenantMemberResponse removeTenantMember(RemoveTenantMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTenantMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除用户组成员.</p>
     * 
     * @param tmpReq RemoveUserGroupMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserGroupMemberResponse
     */
    public RemoveUserGroupMemberResponse removeUserGroupMemberWithOptions(RemoveUserGroupMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveUserGroupMemberShrinkRequest request = new RemoveUserGroupMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.removeCommand)) {
            request.removeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.removeCommand, "RemoveCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.removeCommandShrink)) {
            body.put("RemoveCommand", request.removeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserGroupMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveUserGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>移除用户组成员.</p>
     * 
     * @param request RemoveUserGroupMemberRequest
     * @return RemoveUserGroupMemberResponse
     */
    public RemoveUserGroupMemberResponse removeUserGroupMember(RemoveUserGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserGroupMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复物理节点调度。</p>
     * 
     * @param tmpReq ResumePhysicalNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumePhysicalNodeResponse
     */
    public ResumePhysicalNodeResponse resumePhysicalNodeWithOptions(ResumePhysicalNodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumePhysicalNodeShrinkRequest request = new ResumePhysicalNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resumeCommand)) {
            request.resumeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resumeCommand, "ResumeCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resumeCommandShrink)) {
            body.put("ResumeCommand", request.resumeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumePhysicalNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResumePhysicalNodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResumePhysicalNodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>恢复物理节点调度。</p>
     * 
     * @param request ResumePhysicalNodeRequest
     * @return ResumePhysicalNodeResponse
     */
    public ResumePhysicalNodeResponse resumePhysicalNode(ResumePhysicalNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumePhysicalNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回收用户资源授权</p>
     * 
     * @param tmpReq RevokeResourcePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourcePermissionResponse
     */
    public RevokeResourcePermissionResponse revokeResourcePermissionWithOptions(RevokeResourcePermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeResourcePermissionShrinkRequest request = new RevokeResourcePermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.revokeCommand)) {
            request.revokeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.revokeCommand, "RevokeCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.revokeCommandShrink)) {
            body.put("RevokeCommand", request.revokeCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourcePermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourcePermissionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RevokeResourcePermissionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>回收用户资源授权</p>
     * 
     * @param request RevokeResourcePermissionRequest
     * @return RevokeResourcePermissionResponse
     */
    public RevokeResourcePermissionResponse revokeResourcePermission(RevokeResourcePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourcePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>终止即席查询任务。</p>
     * 
     * @param request StopAdHocTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAdHocTaskResponse
     */
    public StopAdHocTaskResponse stopAdHocTaskWithOptions(StopAdHocTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAdHocTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopAdHocTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopAdHocTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>终止即席查询任务。</p>
     * 
     * @param request StopAdHocTaskRequest
     * @return StopAdHocTaskResponse
     */
    public StopAdHocTaskResponse stopAdHocTask(StopAdHocTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAdHocTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交离线计算任务。</p>
     * 
     * @param tmpReq SubmitBatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitBatchTaskResponse
     */
    public SubmitBatchTaskResponse submitBatchTaskWithOptions(SubmitBatchTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitBatchTaskShrinkRequest request = new SubmitBatchTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.submitCommand)) {
            request.submitCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.submitCommand, "SubmitCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.submitCommandShrink)) {
            body.put("SubmitCommand", request.submitCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitBatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitBatchTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitBatchTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>提交离线计算任务。</p>
     * 
     * @param request SubmitBatchTaskRequest
     * @return SubmitBatchTaskResponse
     */
    public SubmitBatchTaskResponse submitBatchTask(SubmitBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitBatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑即席查询文件。</p>
     * 
     * @param tmpReq UpdateAdHocFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAdHocFileResponse
     */
    public UpdateAdHocFileResponse updateAdHocFileWithOptions(UpdateAdHocFileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAdHocFileShrinkRequest request = new UpdateAdHocFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdHocFile"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdHocFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAdHocFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑即席查询文件。</p>
     * 
     * @param request UpdateAdHocFileRequest
     * @return UpdateAdHocFileResponse
     */
    public UpdateAdHocFileResponse updateAdHocFile(UpdateAdHocFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAdHocFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑离线计算任务。</p>
     * 
     * @param tmpReq UpdateBatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBatchTaskResponse
     */
    public UpdateBatchTaskResponse updateBatchTaskWithOptions(UpdateBatchTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBatchTaskShrinkRequest request = new UpdateBatchTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateBatchTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑离线计算任务。</p>
     * 
     * @param request UpdateBatchTaskRequest
     * @return UpdateBatchTaskResponse
     */
    public UpdateBatchTaskResponse updateBatchTask(UpdateBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑离线计算任务自定义血缘。</p>
     * 
     * @param tmpReq UpdateBatchTaskUdfLineagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBatchTaskUdfLineagesResponse
     */
    public UpdateBatchTaskUdfLineagesResponse updateBatchTaskUdfLineagesWithOptions(UpdateBatchTaskUdfLineagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBatchTaskUdfLineagesShrinkRequest request = new UpdateBatchTaskUdfLineagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBatchTaskUdfLineages"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchTaskUdfLineagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateBatchTaskUdfLineagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑离线计算任务自定义血缘。</p>
     * 
     * @param request UpdateBatchTaskUdfLineagesRequest
     * @return UpdateBatchTaskUdfLineagesResponse
     */
    public UpdateBatchTaskUdfLineagesResponse updateBatchTaskUdfLineages(UpdateBatchTaskUdfLineagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBatchTaskUdfLineagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务实体、</p>
     * 
     * @param tmpReq UpdateBizEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBizEntityResponse
     */
    public UpdateBizEntityResponse updateBizEntityWithOptions(UpdateBizEntityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBizEntityShrinkRequest request = new UpdateBizEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBizEntity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizEntityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateBizEntityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新业务实体、</p>
     * 
     * @param request UpdateBizEntityRequest
     * @return UpdateBizEntityResponse
     */
    public UpdateBizEntityResponse updateBizEntity(UpdateBizEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBizEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据板块。</p>
     * 
     * @param tmpReq UpdateBizUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBizUnitResponse
     */
    public UpdateBizUnitResponse updateBizUnitWithOptions(UpdateBizUnitRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBizUnitShrinkRequest request = new UpdateBizUnitShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBizUnit"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizUnitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateBizUnitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新数据板块。</p>
     * 
     * @param request UpdateBizUnitRequest
     * @return UpdateBizUnitResponse
     */
    public UpdateBizUnitResponse updateBizUnit(UpdateBizUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBizUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新主题域。</p>
     * 
     * @param tmpReq UpdateDataDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataDomainResponse
     */
    public UpdateDataDomainResponse updateDataDomainWithOptions(UpdateDataDomainRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataDomainShrinkRequest request = new UpdateDataDomainShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataDomain"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDataDomainResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新主题域。</p>
     * 
     * @param request UpdateDataDomainRequest
     * @return UpdateDataDomainResponse
     */
    public UpdateDataDomainResponse updateDataDomain(UpdateDataDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑数据源基本信息</p>
     * 
     * @param tmpReq UpdateDataSourceBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceBasicInfoResponse
     */
    public UpdateDataSourceBasicInfoResponse updateDataSourceBasicInfoWithOptions(UpdateDataSourceBasicInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataSourceBasicInfoShrinkRequest request = new UpdateDataSourceBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSourceBasicInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceBasicInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDataSourceBasicInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑数据源基本信息</p>
     * 
     * @param request UpdateDataSourceBasicInfoRequest
     * @return UpdateDataSourceBasicInfoResponse
     */
    public UpdateDataSourceBasicInfoResponse updateDataSourceBasicInfo(UpdateDataSourceBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑数据源连接配置项</p>
     * 
     * @param tmpReq UpdateDataSourceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceConfigResponse
     */
    public UpdateDataSourceConfigResponse updateDataSourceConfigWithOptions(UpdateDataSourceConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataSourceConfigShrinkRequest request = new UpdateDataSourceConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSourceConfig"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceConfigResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDataSourceConfigResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑数据源连接配置项</p>
     * 
     * @param request UpdateDataSourceConfigRequest
     * @return UpdateDataSourceConfigResponse
     */
    public UpdateDataSourceConfigResponse updateDataSourceConfig(UpdateDataSourceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改菜单树文件所在目录</p>
     * 
     * @param request UpdateFileDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileDirectoryResponse
     */
    public UpdateFileDirectoryResponse updateFileDirectoryWithOptions(UpdateFileDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directory)) {
            query.put("Directory", request.directory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileDirectory"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileDirectoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFileDirectoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改菜单树文件所在目录</p>
     * 
     * @param request UpdateFileDirectoryRequest
     * @return UpdateFileDirectoryResponse
     */
    public UpdateFileDirectoryResponse updateFileDirectory(UpdateFileDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改菜单树文件名称</p>
     * 
     * @param request UpdateFileNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileNameResponse
     */
    public UpdateFileNameResponse updateFileNameWithOptions(UpdateFileNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileName"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFileNameResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改菜单树文件名称</p>
     * 
     * @param request UpdateFileNameRequest
     * @return UpdateFileNameResponse
     */
    public UpdateFileNameResponse updateFileName(UpdateFileNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑租户成员</p>
     * 
     * @param tmpReq UpdateTenantMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTenantMemberResponse
     */
    public UpdateTenantMemberResponse updateTenantMemberWithOptions(UpdateTenantMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTenantMemberShrinkRequest request = new UpdateTenantMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTenantMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTenantMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTenantMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑租户成员</p>
     * 
     * @param request UpdateTenantMemberRequest
     * @return UpdateTenantMemberResponse
     */
    public UpdateTenantMemberResponse updateTenantMember(UpdateTenantMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTenantMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑用户组.</p>
     * 
     * @param tmpReq UpdateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserGroupShrinkRequest request = new UpdateUserGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroup"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateUserGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑用户组.</p>
     * 
     * @param request UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑用户组启用开关.</p>
     * 
     * @param request UpdateUserGroupSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGroupSwitchResponse
     */
    public UpdateUserGroupSwitchResponse updateUserGroupSwitchWithOptions(UpdateUserGroupSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroupSwitch"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupSwitchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateUserGroupSwitchResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑用户组启用开关.</p>
     * 
     * @param request UpdateUserGroupSwitchRequest
     * @return UpdateUserGroupSwitchResponse
     */
    public UpdateUserGroupSwitchResponse updateUserGroupSwitch(UpdateUserGroupSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupSwitchWithOptions(request, runtime);
    }
}
