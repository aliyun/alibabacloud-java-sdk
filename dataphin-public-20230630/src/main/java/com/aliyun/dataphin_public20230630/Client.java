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
     * <p>添加数据服务项目用户并设置角色。</p>
     * 
     * @param tmpReq AddDataServiceProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataServiceProjectMemberResponse
     */
    public AddDataServiceProjectMemberResponse addDataServiceProjectMemberWithOptions(AddDataServiceProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddDataServiceProjectMemberShrinkRequest request = new AddDataServiceProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addCommand)) {
            request.addCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addCommand, "AddCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "AddDataServiceProjectMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataServiceProjectMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加数据服务项目用户并设置角色。</p>
     * 
     * @param request AddDataServiceProjectMemberRequest
     * @return AddDataServiceProjectMemberResponse
     */
    public AddDataServiceProjectMemberResponse addDataServiceProjectMember(AddDataServiceProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataServiceProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加项目成员。</p>
     * 
     * @param tmpReq AddProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddProjectMemberResponse
     */
    public AddProjectMemberResponse addProjectMemberWithOptions(AddProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddProjectMemberShrinkRequest request = new AddProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addCommand)) {
            request.addCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addCommand, "AddCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

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
            new TeaPair("action", "AddProjectMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProjectMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加项目成员。</p>
     * 
     * @param request AddProjectMemberRequest
     * @return AddProjectMemberResponse
     */
    public AddProjectMemberResponse addProjectMember(AddProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增注册血缘。</p>
     * 
     * @param tmpReq AddRegisterLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRegisterLineageResponse
     */
    public AddRegisterLineageResponse addRegisterLineageWithOptions(AddRegisterLineageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddRegisterLineageShrinkRequest request = new AddRegisterLineageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addRegisterLineageCommand)) {
            request.addRegisterLineageCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addRegisterLineageCommand, "AddRegisterLineageCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addRegisterLineageCommandShrink)) {
            body.put("AddRegisterLineageCommand", request.addRegisterLineageCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRegisterLineage"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRegisterLineageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增注册血缘。</p>
     * 
     * @param request AddRegisterLineageRequest
     * @return AddRegisterLineageResponse
     */
    public AddRegisterLineageResponse addRegisterLineage(AddRegisterLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRegisterLineageWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTenantMembersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTenantMembersBySourceUserResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserGroupMemberResponse());
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
     * <p>申请API权限。</p>
     * 
     * @param tmpReq ApplyDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyDataServiceApiResponse
     */
    public ApplyDataServiceApiResponse applyDataServiceApiWithOptions(ApplyDataServiceApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyDataServiceApiShrinkRequest request = new ApplyDataServiceApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applyCommand)) {
            request.applyCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applyCommand, "ApplyCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyCommandShrink)) {
            body.put("ApplyCommand", request.applyCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDataServiceApi"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDataServiceApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请API权限。</p>
     * 
     * @param request ApplyDataServiceApiRequest
     * @return ApplyDataServiceApiResponse
     */
    public ApplyDataServiceApiResponse applyDataServiceApi(ApplyDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请应用权限。</p>
     * 
     * @param tmpReq ApplyDataServiceAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyDataServiceAppResponse
     */
    public ApplyDataServiceAppResponse applyDataServiceAppWithOptions(ApplyDataServiceAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyDataServiceAppShrinkRequest request = new ApplyDataServiceAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applyCommand)) {
            request.applyCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applyCommand, "ApplyCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyCommandShrink)) {
            body.put("ApplyCommand", request.applyCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDataServiceApp"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDataServiceAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请应用权限。</p>
     * 
     * @param request ApplyDataServiceAppRequest
     * @return ApplyDataServiceAppResponse
     */
    public ApplyDataServiceAppResponse applyDataServiceApp(ApplyDataServiceAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataServiceAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定质量规则和调度设置进行绑定。</p>
     * 
     * @param tmpReq AssignQualityRuleOfAllRuleScopeSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignQualityRuleOfAllRuleScopeSchedulesResponse
     */
    public AssignQualityRuleOfAllRuleScopeSchedulesResponse assignQualityRuleOfAllRuleScopeSchedulesWithOptions(AssignQualityRuleOfAllRuleScopeSchedulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest request = new AssignQualityRuleOfAllRuleScopeSchedulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assignCommand)) {
            request.assignCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assignCommand, "AssignCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignCommandShrink)) {
            body.put("AssignCommand", request.assignCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignQualityRuleOfAllRuleScopeSchedules"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignQualityRuleOfAllRuleScopeSchedulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指定质量规则和调度设置进行绑定。</p>
     * 
     * @param request AssignQualityRuleOfAllRuleScopeSchedulesRequest
     * @return AssignQualityRuleOfAllRuleScopeSchedulesResponse
     */
    public AssignQualityRuleOfAllRuleScopeSchedulesResponse assignQualityRuleOfAllRuleScopeSchedules(AssignQualityRuleOfAllRuleScopeSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignQualityRuleOfAllRuleScopeSchedulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>项目计算源连通性检查。</p>
     * 
     * @param tmpReq CheckComputeSourceConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckComputeSourceConnectivityResponse
     */
    public CheckComputeSourceConnectivityResponse checkComputeSourceConnectivityWithOptions(CheckComputeSourceConnectivityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckComputeSourceConnectivityShrinkRequest request = new CheckComputeSourceConnectivityShrinkRequest();
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
            new TeaPair("action", "CheckComputeSourceConnectivity"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckComputeSourceConnectivityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目计算源连通性检查。</p>
     * 
     * @param request CheckComputeSourceConnectivityRequest
     * @return CheckComputeSourceConnectivityResponse
     */
    public CheckComputeSourceConnectivityResponse checkComputeSourceConnectivity(CheckComputeSourceConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkComputeSourceConnectivityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>计算源连通性检查。</p>
     * 
     * @param request CheckComputeSourceConnectivityByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckComputeSourceConnectivityByIdResponse
     */
    public CheckComputeSourceConnectivityByIdResponse checkComputeSourceConnectivityByIdWithOptions(CheckComputeSourceConnectivityByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CheckComputeSourceConnectivityById"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckComputeSourceConnectivityByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>计算源连通性检查。</p>
     * 
     * @param request CheckComputeSourceConnectivityByIdRequest
     * @return CheckComputeSourceConnectivityByIdResponse
     */
    public CheckComputeSourceConnectivityByIdResponse checkComputeSourceConnectivityById(CheckComputeSourceConnectivityByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkComputeSourceConnectivityByIdWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDataSourceConnectivityResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDataSourceConnectivityByIdResponse());
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
     * <p>检查项目是否存在依赖。</p>
     * 
     * @param request CheckProjectHasDependencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckProjectHasDependencyResponse
     */
    public CheckProjectHasDependencyResponse checkProjectHasDependencyWithOptions(CheckProjectHasDependencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CheckProjectHasDependency"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckProjectHasDependencyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查项目是否存在依赖。</p>
     * 
     * @param request CheckProjectHasDependencyRequest
     * @return CheckProjectHasDependencyResponse
     */
    public CheckProjectHasDependencyResponse checkProjectHasDependency(CheckProjectHasDependencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkProjectHasDependencyWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourcePermissionResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdHocFileResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizEntityResponse());
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
     * <p>新建业务指标</p>
     * 
     * @param tmpReq CreateBizMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBizMetricResponse
     */
    public CreateBizMetricResponse createBizMetricWithOptions(CreateBizMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBizMetricShrinkRequest request = new CreateBizMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createBizMetricCommand)) {
            request.createBizMetricCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createBizMetricCommand, "CreateBizMetricCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createBizMetricCommandShrink)) {
            body.put("CreateBizMetricCommand", request.createBizMetricCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBizMetric"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建业务指标</p>
     * 
     * @param request CreateBizMetricRequest
     * @return CreateBizMetricResponse
     */
    public CreateBizMetricResponse createBizMetric(CreateBizMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBizMetricWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBizUnitResponse());
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
     * <p>创建计算源。</p>
     * 
     * @param tmpReq CreateComputeSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComputeSourceResponse
     */
    public CreateComputeSourceResponse createComputeSourceWithOptions(CreateComputeSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateComputeSourceShrinkRequest request = new CreateComputeSourceShrinkRequest();
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
            new TeaPair("action", "CreateComputeSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建计算源。</p>
     * 
     * @param request CreateComputeSourceRequest
     * @return CreateComputeSourceResponse
     */
    public CreateComputeSourceResponse createComputeSource(CreateComputeSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComputeSourceWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataDomainResponse());
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
     * <p>创建新的数据服务API并提交。</p>
     * 
     * @param tmpReq CreateDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataServiceApiResponse
     */
    public CreateDataServiceApiResponse createDataServiceApiWithOptions(CreateDataServiceApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataServiceApiShrinkRequest request = new CreateDataServiceApiShrinkRequest();
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
            new TeaPair("action", "CreateDataServiceApi"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建新的数据服务API并提交。</p>
     * 
     * @param request CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirectoryResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeSupplementResponse());
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
     * <p>创建集成管道任务。</p>
     * 
     * @param tmpReq CreatePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipelineWithOptions(CreatePipelineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePipelineShrinkRequest request = new CreatePipelineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipeline"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建集成管道任务。</p>
     * 
     * @param request CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步创建集成管道任务。</p>
     * 
     * @param tmpReq CreatePipelineByAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineByAsyncResponse
     */
    public CreatePipelineByAsyncResponse createPipelineByAsyncWithOptions(CreatePipelineByAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePipelineByAsyncShrinkRequest request = new CreatePipelineByAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createCommand)) {
            request.createCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createCommand, "CreateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createCommandShrink)) {
            body.put("CreateCommand", request.createCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelineByAsync"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineByAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步创建集成管道任务。</p>
     * 
     * @param request CreatePipelineByAsyncRequest
     * @return CreatePipelineByAsyncResponse
     */
    public CreatePipelineByAsyncResponse createPipelineByAsync(CreatePipelineByAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPipelineByAsyncWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineNodeResponse());
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
     * <p>创建资源文件。</p>
     * 
     * @param tmpReq CreateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateResourceShrinkRequest request = new CreateResourceShrinkRequest();
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
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源文件。</p>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建行级权限</p>
     * 
     * @param tmpReq CreateRowPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRowPermissionResponse
     */
    public CreateRowPermissionResponse createRowPermissionWithOptions(CreateRowPermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRowPermissionShrinkRequest request = new CreateRowPermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createRowPermissionCommand)) {
            request.createRowPermissionCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createRowPermissionCommand, "CreateRowPermissionCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createRowPermissionCommandShrink)) {
            body.put("CreateRowPermissionCommand", request.createRowPermissionCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRowPermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRowPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建行级权限</p>
     * 
     * @param request CreateRowPermissionRequest
     * @return CreateRowPermissionResponse
     */
    public CreateRowPermissionResponse createRowPermission(CreateRowPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRowPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分类。</p>
     * 
     * @param tmpReq CreateSecurityClassifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityClassifyResponse
     */
    public CreateSecurityClassifyResponse createSecurityClassifyWithOptions(CreateSecurityClassifyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecurityClassifyShrinkRequest request = new CreateSecurityClassifyShrinkRequest();
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
            new TeaPair("action", "CreateSecurityClassify"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityClassifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分类。</p>
     * 
     * @param request CreateSecurityClassifyRequest
     * @return CreateSecurityClassifyResponse
     */
    public CreateSecurityClassifyResponse createSecurityClassify(CreateSecurityClassifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityClassifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分类目录。</p>
     * 
     * @param tmpReq CreateSecurityClassifyCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityClassifyCatalogResponse
     */
    public CreateSecurityClassifyCatalogResponse createSecurityClassifyCatalogWithOptions(CreateSecurityClassifyCatalogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecurityClassifyCatalogShrinkRequest request = new CreateSecurityClassifyCatalogShrinkRequest();
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
            new TeaPair("action", "CreateSecurityClassifyCatalog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityClassifyCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分类目录。</p>
     * 
     * @param request CreateSecurityClassifyCatalogRequest
     * @return CreateSecurityClassifyCatalogResponse
     */
    public CreateSecurityClassifyCatalogResponse createSecurityClassifyCatalog(CreateSecurityClassifyCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityClassifyCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建安全识别结果。</p>
     * 
     * @param tmpReq CreateSecurityIdentifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityIdentifyResultResponse
     */
    public CreateSecurityIdentifyResultResponse createSecurityIdentifyResultWithOptions(CreateSecurityIdentifyResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecurityIdentifyResultShrinkRequest request = new CreateSecurityIdentifyResultShrinkRequest();
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
            new TeaPair("action", "CreateSecurityIdentifyResult"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityIdentifyResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建安全识别结果。</p>
     * 
     * @param request CreateSecurityIdentifyResultRequest
     * @return CreateSecurityIdentifyResultResponse
     */
    public CreateSecurityIdentifyResultResponse createSecurityIdentifyResult(CreateSecurityIdentifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityIdentifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分级。</p>
     * 
     * @param tmpReq CreateSecurityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityLevelResponse
     */
    public CreateSecurityLevelResponse createSecurityLevelWithOptions(CreateSecurityLevelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecurityLevelShrinkRequest request = new CreateSecurityLevelShrinkRequest();
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
            new TeaPair("action", "CreateSecurityLevel"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建数据分级。</p>
     * 
     * @param request CreateSecurityLevelRequest
     * @return CreateSecurityLevelResponse
     */
    public CreateSecurityLevelResponse createSecurityLevel(CreateSecurityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准。</p>
     * 
     * @param tmpReq CreateStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardResponse
     */
    public CreateStandardResponse createStandardWithOptions(CreateStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardShrinkRequest request = new CreateStandardShrinkRequest();
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
            new TeaPair("action", "CreateStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准。</p>
     * 
     * @param request CreateStandardRequest
     * @return CreateStandardResponse
     */
    public CreateStandardResponse createStandard(CreateStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准码表。</p>
     * 
     * @param tmpReq CreateStandardLookupTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardLookupTableResponse
     */
    public CreateStandardLookupTableResponse createStandardLookupTableWithOptions(CreateStandardLookupTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardLookupTableShrinkRequest request = new CreateStandardLookupTableShrinkRequest();
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
            new TeaPair("action", "CreateStandardLookupTable"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardLookupTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准码表。</p>
     * 
     * @param request CreateStandardLookupTableRequest
     * @return CreateStandardLookupTableResponse
     */
    public CreateStandardLookupTableResponse createStandardLookupTable(CreateStandardLookupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardLookupTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准映射关系, 包括有效映射和无效映射。</p>
     * 
     * @param tmpReq CreateStandardMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardMappingResponse
     */
    public CreateStandardMappingResponse createStandardMappingWithOptions(CreateStandardMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardMappingShrinkRequest request = new CreateStandardMappingShrinkRequest();
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
            new TeaPair("action", "CreateStandardMapping"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准映射关系, 包括有效映射和无效映射。</p>
     * 
     * @param request CreateStandardMappingRequest
     * @return CreateStandardMappingResponse
     */
    public CreateStandardMappingResponse createStandardMapping(CreateStandardMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准关联关系。</p>
     * 
     * @param tmpReq CreateStandardRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardRelationsResponse
     */
    public CreateStandardRelationsResponse createStandardRelationsWithOptions(CreateStandardRelationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardRelationsShrinkRequest request = new CreateStandardRelationsShrinkRequest();
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
            new TeaPair("action", "CreateStandardRelations"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准关联关系。</p>
     * 
     * @param request CreateStandardRelationsRequest
     * @return CreateStandardRelationsResponse
     */
    public CreateStandardRelationsResponse createStandardRelations(CreateStandardRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准集。</p>
     * 
     * @param tmpReq CreateStandardSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardSetResponse
     */
    public CreateStandardSetResponse createStandardSetWithOptions(CreateStandardSetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardSetShrinkRequest request = new CreateStandardSetShrinkRequest();
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
            new TeaPair("action", "CreateStandardSet"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标准集。</p>
     * 
     * @param request CreateStandardSetRequest
     * @return CreateStandardSetResponse
     */
    public CreateStandardSetResponse createStandardSet(CreateStandardSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准模板。</p>
     * 
     * @param tmpReq CreateStandardTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardTemplateResponse
     */
    public CreateStandardTemplateResponse createStandardTemplateWithOptions(CreateStandardTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardTemplateShrinkRequest request = new CreateStandardTemplateShrinkRequest();
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
            new TeaPair("action", "CreateStandardTemplate"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准模板。</p>
     * 
     * @param request CreateStandardTemplateRequest
     * @return CreateStandardTemplateResponse
     */
    public CreateStandardTemplateResponse createStandardTemplate(CreateStandardTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准词根。</p>
     * 
     * @param tmpReq CreateStandardWordRootRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardWordRootResponse
     */
    public CreateStandardWordRootResponse createStandardWordRootWithOptions(CreateStandardWordRootRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStandardWordRootShrinkRequest request = new CreateStandardWordRootShrinkRequest();
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
            new TeaPair("action", "CreateStandardWordRoot"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardWordRootResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据标准词根。</p>
     * 
     * @param request CreateStandardWordRootRequest
     * @return CreateStandardWordRootResponse
     */
    public CreateStandardWordRootResponse createStandardWordRoot(CreateStandardWordRootRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardWordRootWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamBatchJobMappingResponse());
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
     * <p>创建自定义函数。</p>
     * 
     * @param tmpReq CreateUdfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUdfResponse
     */
    public CreateUdfResponse createUdfWithOptions(CreateUdfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUdfShrinkRequest request = new CreateUdfShrinkRequest();
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
            new TeaPair("action", "CreateUdf"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUdfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义函数。</p>
     * 
     * @param request CreateUdfRequest
     * @return CreateUdfResponse
     */
    public CreateUdfResponse createUdf(CreateUdfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAdHocFileResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBatchTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizEntityResponse());
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
     * <p>删除业务指标</p>
     * 
     * @param tmpReq DeleteBizMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBizMetricResponse
     */
    public DeleteBizMetricResponse deleteBizMetricWithOptions(DeleteBizMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteBizMetricShrinkRequest request = new DeleteBizMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteBizMetricCommand)) {
            request.deleteBizMetricCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteBizMetricCommand, "DeleteBizMetricCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteBizMetricCommandShrink)) {
            body.put("DeleteBizMetricCommand", request.deleteBizMetricCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizMetric"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务指标</p>
     * 
     * @param request DeleteBizMetricRequest
     * @return DeleteBizMetricResponse
     */
    public DeleteBizMetricResponse deleteBizMetric(DeleteBizMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBizMetricWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizUnitResponse());
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
     * <p>删除计算源。</p>
     * 
     * @param request DeleteComputeSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComputeSourceResponse
     */
    public DeleteComputeSourceResponse deleteComputeSourceWithOptions(DeleteComputeSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteComputeSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComputeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除计算源。</p>
     * 
     * @param request DeleteComputeSourceRequest
     * @return DeleteComputeSourceResponse
     */
    public DeleteComputeSourceResponse deleteComputeSource(DeleteComputeSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComputeSourceWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataDomainResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoryResponse());
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
     * <p>批量删除质量规则对象。</p>
     * 
     * @param tmpReq DeleteQualityRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityRulesResponse
     */
    public DeleteQualityRulesResponse deleteQualityRulesWithOptions(DeleteQualityRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQualityRulesShrinkRequest request = new DeleteQualityRulesShrinkRequest();
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
            new TeaPair("action", "DeleteQualityRules"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量规则对象。</p>
     * 
     * @param request DeleteQualityRulesRequest
     * @return DeleteQualityRulesResponse
     */
    public DeleteQualityRulesResponse deleteQualityRules(DeleteQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量调度对象。</p>
     * 
     * @param tmpReq DeleteQualitySchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualitySchedulesResponse
     */
    public DeleteQualitySchedulesResponse deleteQualitySchedulesWithOptions(DeleteQualitySchedulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQualitySchedulesShrinkRequest request = new DeleteQualitySchedulesShrinkRequest();
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
            new TeaPair("action", "DeleteQualitySchedules"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualitySchedulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量调度对象。</p>
     * 
     * @param request DeleteQualitySchedulesRequest
     * @return DeleteQualitySchedulesResponse
     */
    public DeleteQualitySchedulesResponse deleteQualitySchedules(DeleteQualitySchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualitySchedulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量模板对象。</p>
     * 
     * @param tmpReq DeleteQualityTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityTemplatesResponse
     */
    public DeleteQualityTemplatesResponse deleteQualityTemplatesWithOptions(DeleteQualityTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQualityTemplatesShrinkRequest request = new DeleteQualityTemplatesShrinkRequest();
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
            new TeaPair("action", "DeleteQualityTemplates"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量模板对象。</p>
     * 
     * @param request DeleteQualityTemplatesRequest
     * @return DeleteQualityTemplatesResponse
     */
    public DeleteQualityTemplatesResponse deleteQualityTemplates(DeleteQualityTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量监控对象。</p>
     * 
     * @param tmpReq DeleteQualityWatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityWatchesResponse
     */
    public DeleteQualityWatchesResponse deleteQualityWatchesWithOptions(DeleteQualityWatchesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQualityWatchesShrinkRequest request = new DeleteQualityWatchesShrinkRequest();
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
            new TeaPair("action", "DeleteQualityWatches"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityWatchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量监控对象。</p>
     * 
     * @param request DeleteQualityWatchesRequest
     * @return DeleteQualityWatchesResponse
     */
    public DeleteQualityWatchesResponse deleteQualityWatches(DeleteQualityWatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityWatchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册血缘。</p>
     * 
     * @param tmpReq DeleteRegisterLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegisterLineageResponse
     */
    public DeleteRegisterLineageResponse deleteRegisterLineageWithOptions(DeleteRegisterLineageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRegisterLineageShrinkRequest request = new DeleteRegisterLineageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteRegisterLineageCommand)) {
            request.deleteRegisterLineageCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteRegisterLineageCommand, "DeleteRegisterLineageCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteRegisterLineageCommandShrink)) {
            body.put("DeleteRegisterLineageCommand", request.deleteRegisterLineageCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegisterLineage"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegisterLineageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册血缘。</p>
     * 
     * @param request DeleteRegisterLineageRequest
     * @return DeleteRegisterLineageResponse
     */
    public DeleteRegisterLineageResponse deleteRegisterLineage(DeleteRegisterLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegisterLineageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源文件。</p>
     * 
     * @param request DeleteResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResourceWithOptions(DeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源文件。</p>
     * 
     * @param request DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除行级权限</p>
     * 
     * @param tmpReq DeleteRowPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRowPermissionResponse
     */
    public DeleteRowPermissionResponse deleteRowPermissionWithOptions(DeleteRowPermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRowPermissionShrinkRequest request = new DeleteRowPermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteRowPermissionCommand)) {
            request.deleteRowPermissionCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteRowPermissionCommand, "DeleteRowPermissionCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteRowPermissionCommandShrink)) {
            body.put("DeleteRowPermissionCommand", request.deleteRowPermissionCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRowPermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRowPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除行级权限</p>
     * 
     * @param request DeleteRowPermissionRequest
     * @return DeleteRowPermissionResponse
     */
    public DeleteRowPermissionResponse deleteRowPermission(DeleteRowPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRowPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分类。</p>
     * 
     * @param tmpReq DeleteSecurityClassifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityClassifyResponse
     */
    public DeleteSecurityClassifyResponse deleteSecurityClassifyWithOptions(DeleteSecurityClassifyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSecurityClassifyShrinkRequest request = new DeleteSecurityClassifyShrinkRequest();
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
            new TeaPair("action", "DeleteSecurityClassify"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityClassifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分类。</p>
     * 
     * @param request DeleteSecurityClassifyRequest
     * @return DeleteSecurityClassifyResponse
     */
    public DeleteSecurityClassifyResponse deleteSecurityClassify(DeleteSecurityClassifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityClassifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分类目录。</p>
     * 
     * @param tmpReq DeleteSecurityClassifyCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityClassifyCatalogResponse
     */
    public DeleteSecurityClassifyCatalogResponse deleteSecurityClassifyCatalogWithOptions(DeleteSecurityClassifyCatalogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSecurityClassifyCatalogShrinkRequest request = new DeleteSecurityClassifyCatalogShrinkRequest();
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
            new TeaPair("action", "DeleteSecurityClassifyCatalog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityClassifyCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分类目录。</p>
     * 
     * @param request DeleteSecurityClassifyCatalogRequest
     * @return DeleteSecurityClassifyCatalogResponse
     */
    public DeleteSecurityClassifyCatalogResponse deleteSecurityClassifyCatalog(DeleteSecurityClassifyCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityClassifyCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除安全识别结果。</p>
     * 
     * @param tmpReq DeleteSecurityIdentifyResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityIdentifyResultsResponse
     */
    public DeleteSecurityIdentifyResultsResponse deleteSecurityIdentifyResultsWithOptions(DeleteSecurityIdentifyResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSecurityIdentifyResultsShrinkRequest request = new DeleteSecurityIdentifyResultsShrinkRequest();
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
            new TeaPair("action", "DeleteSecurityIdentifyResults"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityIdentifyResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除安全识别结果。</p>
     * 
     * @param request DeleteSecurityIdentifyResultsRequest
     * @return DeleteSecurityIdentifyResultsResponse
     */
    public DeleteSecurityIdentifyResultsResponse deleteSecurityIdentifyResults(DeleteSecurityIdentifyResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityIdentifyResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分级。</p>
     * 
     * @param tmpReq DeleteSecurityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityLevelResponse
     */
    public DeleteSecurityLevelResponse deleteSecurityLevelWithOptions(DeleteSecurityLevelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSecurityLevelShrinkRequest request = new DeleteSecurityLevelShrinkRequest();
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
            new TeaPair("action", "DeleteSecurityLevel"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据分级。</p>
     * 
     * @param request DeleteSecurityLevelRequest
     * @return DeleteSecurityLevelResponse
     */
    public DeleteSecurityLevelResponse deleteSecurityLevel(DeleteSecurityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准。</p>
     * 
     * @param tmpReq DeleteStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardResponse
     */
    public DeleteStandardResponse deleteStandardWithOptions(DeleteStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStandardShrinkRequest request = new DeleteStandardShrinkRequest();
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
            new TeaPair("action", "DeleteStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准。</p>
     * 
     * @param request DeleteStandardRequest
     * @return DeleteStandardResponse
     */
    public DeleteStandardResponse deleteStandard(DeleteStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除无效映射关系。</p>
     * 
     * @param tmpReq DeleteStandardInValidMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardInValidMappingResponse
     */
    public DeleteStandardInValidMappingResponse deleteStandardInValidMappingWithOptions(DeleteStandardInValidMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStandardInValidMappingShrinkRequest request = new DeleteStandardInValidMappingShrinkRequest();
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
            new TeaPair("action", "DeleteStandardInValidMapping"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardInValidMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除无效映射关系。</p>
     * 
     * @param request DeleteStandardInValidMappingRequest
     * @return DeleteStandardInValidMappingResponse
     */
    public DeleteStandardInValidMappingResponse deleteStandardInValidMapping(DeleteStandardInValidMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardInValidMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据标准码表。</p>
     * 
     * @param request DeleteStandardLookupTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardLookupTableResponse
     */
    public DeleteStandardLookupTableResponse deleteStandardLookupTableWithOptions(DeleteStandardLookupTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteStandardLookupTable"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardLookupTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据标准码表。</p>
     * 
     * @param request DeleteStandardLookupTableRequest
     * @return DeleteStandardLookupTableResponse
     */
    public DeleteStandardLookupTableResponse deleteStandardLookupTable(DeleteStandardLookupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardLookupTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除标准关联关系。</p>
     * 
     * @param tmpReq DeleteStandardRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardRelationsResponse
     */
    public DeleteStandardRelationsResponse deleteStandardRelationsWithOptions(DeleteStandardRelationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStandardRelationsShrinkRequest request = new DeleteStandardRelationsShrinkRequest();
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
            new TeaPair("action", "DeleteStandardRelations"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除标准关联关系。</p>
     * 
     * @param request DeleteStandardRelationsRequest
     * @return DeleteStandardRelationsResponse
     */
    public DeleteStandardRelationsResponse deleteStandardRelations(DeleteStandardRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准集。</p>
     * 
     * @param request DeleteStandardSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardSetResponse
     */
    public DeleteStandardSetResponse deleteStandardSetWithOptions(DeleteStandardSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteStandardSet"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标准集。</p>
     * 
     * @param request DeleteStandardSetRequest
     * @return DeleteStandardSetResponse
     */
    public DeleteStandardSetResponse deleteStandardSet(DeleteStandardSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除有效映射关系。</p>
     * 
     * @param tmpReq DeleteStandardValidMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardValidMappingResponse
     */
    public DeleteStandardValidMappingResponse deleteStandardValidMappingWithOptions(DeleteStandardValidMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteStandardValidMappingShrinkRequest request = new DeleteStandardValidMappingShrinkRequest();
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
            new TeaPair("action", "DeleteStandardValidMapping"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardValidMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除有效映射关系。</p>
     * 
     * @param request DeleteStandardValidMappingRequest
     * @return DeleteStandardValidMappingResponse
     */
    public DeleteStandardValidMappingResponse deleteStandardValidMapping(DeleteStandardValidMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardValidMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据标准词根。</p>
     * 
     * @param request DeleteStandardWordRootRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardWordRootResponse
     */
    public DeleteStandardWordRootResponse deleteStandardWordRootWithOptions(DeleteStandardWordRootRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStandardWordRoot"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardWordRootResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据标准词根。</p>
     * 
     * @param request DeleteStandardWordRootRequest
     * @return DeleteStandardWordRootResponse
     */
    public DeleteStandardWordRootResponse deleteStandardWordRoot(DeleteStandardWordRootRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardWordRootWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义函数。</p>
     * 
     * @param request DeleteUdfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUdfResponse
     */
    public DeleteUdfResponse deleteUdfWithOptions(DeleteUdfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "DeleteUdf"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUdfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义函数。</p>
     * 
     * @param request DeleteUdfRequest
     * @return DeleteUdfResponse
     */
    public DeleteUdfResponse deleteUdf(DeleteUdfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUdfWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteAdHocTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteManualNodeResponse());
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
     * <p>运行触发式节点。</p>
     * 
     * @param request ExecuteTriggerNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTriggerNodeResponse
     */
    public ExecuteTriggerNodeResponse executeTriggerNodeWithOptions(ExecuteTriggerNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            query.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.index)) {
            query.put("Index", request.index);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "ExecuteTriggerNode"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTriggerNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运行触发式节点。</p>
     * 
     * @param request ExecuteTriggerNodeRequest
     * @return ExecuteTriggerNodeResponse
     */
    public ExecuteTriggerNodeResponse executeTriggerNode(ExecuteTriggerNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeTriggerNodeWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new FixDataResponse());
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
     * <p>根据行级权限ID获取某一行级权限下的所有授权账号</p>
     * 
     * @param tmpReq GetAccountByRowPermissionIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountByRowPermissionIdResponse
     */
    public GetAccountByRowPermissionIdResponse getAccountByRowPermissionIdWithOptions(GetAccountByRowPermissionIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAccountByRowPermissionIdShrinkRequest request = new GetAccountByRowPermissionIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.getAccountByRowPermissionIdQuery)) {
            request.getAccountByRowPermissionIdQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.getAccountByRowPermissionIdQuery, "GetAccountByRowPermissionIdQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getAccountByRowPermissionIdQueryShrink)) {
            body.put("GetAccountByRowPermissionIdQuery", request.getAccountByRowPermissionIdQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountByRowPermissionId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountByRowPermissionIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据行级权限ID获取某一行级权限下的所有授权账号</p>
     * 
     * @param request GetAccountByRowPermissionIdRequest
     * @return GetAccountByRowPermissionIdResponse
     */
    public GetAccountByRowPermissionIdResponse getAccountByRowPermissionId(GetAccountByRowPermissionIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountByRowPermissionIdWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocFileResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocTaskLogResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdHocTaskResultResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertEventResponse());
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
     * <p>根据资产对象GUID查询映射关系。</p>
     * 
     * @param tmpReq GetAssetMappingRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAssetMappingRelationsResponse
     */
    public GetAssetMappingRelationsResponse getAssetMappingRelationsWithOptions(GetAssetMappingRelationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAssetMappingRelationsShrinkRequest request = new GetAssetMappingRelationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetMappingQuery)) {
            request.assetMappingQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetMappingQuery, "AssetMappingQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetMappingQueryShrink)) {
            body.put("AssetMappingQuery", request.assetMappingQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAssetMappingRelations"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAssetMappingRelationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据资产对象GUID查询映射关系。</p>
     * 
     * @param request GetAssetMappingRelationsRequest
     * @return GetAssetMappingRelationsResponse
     */
    public GetAssetMappingRelationsResponse getAssetMappingRelations(GetAssetMappingRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAssetMappingRelationsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskInfoResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskInfoByVersionResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskUdfLineagesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTaskVersionsResponse());
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
     * <p>根据归属资产GUID查询映射关系。</p>
     * 
     * @param tmpReq GetBelongAssetMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBelongAssetMappingResponse
     */
    public GetBelongAssetMappingResponse getBelongAssetMappingWithOptions(GetBelongAssetMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetBelongAssetMappingShrinkRequest request = new GetBelongAssetMappingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assetMappingQuery)) {
            request.assetMappingQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assetMappingQuery, "AssetMappingQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetMappingQueryShrink)) {
            body.put("AssetMappingQuery", request.assetMappingQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBelongAssetMapping"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBelongAssetMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据归属资产GUID查询映射关系。</p>
     * 
     * @param request GetBelongAssetMappingRequest
     * @return GetBelongAssetMappingResponse
     */
    public GetBelongAssetMappingResponse getBelongAssetMapping(GetBelongAssetMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBelongAssetMappingWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizEntityInfoResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizEntityInfoByVersionResponse());
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
     * <p>查询业务指标详情</p>
     * 
     * @param tmpReq GetBizMetricByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBizMetricByNameResponse
     */
    public GetBizMetricByNameResponse getBizMetricByNameWithOptions(GetBizMetricByNameRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetBizMetricByNameShrinkRequest request = new GetBizMetricByNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizMetricByNameQuery)) {
            request.bizMetricByNameQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizMetricByNameQuery, "BizMetricByNameQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizMetricByNameQueryShrink)) {
            body.put("BizMetricByNameQuery", request.bizMetricByNameQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBizMetricByName"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizMetricByNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务指标详情</p>
     * 
     * @param request GetBizMetricByNameRequest
     * @return GetBizMetricByNameResponse
     */
    public GetBizMetricByNameResponse getBizMetricByName(GetBizMetricByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBizMetricByNameWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBizUnitInfoResponse());
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
     * <p>查询数据源连通性检查任务。</p>
     * 
     * @param request GetCheckConnectivityJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCheckConnectivityJobsResponse
     */
    public GetCheckConnectivityJobsResponse getCheckConnectivityJobsWithOptions(GetCheckConnectivityJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCheckConnectivityJobs"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCheckConnectivityJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源连通性检查任务。</p>
     * 
     * @param request GetCheckConnectivityJobsRequest
     * @return GetCheckConnectivityJobsResponse
     */
    public GetCheckConnectivityJobsResponse getCheckConnectivityJobs(GetCheckConnectivityJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCheckConnectivityJobsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterQueueInfoByEnvResponse());
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
     * <p>获取计算源详情。</p>
     * 
     * @param request GetComputeSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComputeSourceResponse
     */
    public GetComputeSourceResponse getComputeSourceWithOptions(GetComputeSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetComputeSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComputeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取计算源详情。</p>
     * 
     * @param request GetComputeSourceRequest
     * @return GetComputeSourceResponse
     */
    public GetComputeSourceResponse getComputeSource(GetComputeSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComputeSourceWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataDomainInfoResponse());
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
     * <p>运维监控Api调用汇总统计。</p>
     * 
     * @param request GetDataServiceApiCallSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiCallSummaryResponse
     */
    public GetDataServiceApiCallSummaryResponse getDataServiceApiCallSummaryWithOptions(GetDataServiceApiCallSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApiCallSummary"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiCallSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运维监控Api调用汇总统计。</p>
     * 
     * @param request GetDataServiceApiCallSummaryRequest
     * @return GetDataServiceApiCallSummaryResponse
     */
    public GetDataServiceApiCallSummaryResponse getDataServiceApiCallSummary(GetDataServiceApiCallSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiCallSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运维监控Api访问趋势分析。</p>
     * 
     * @param request GetDataServiceApiCallTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiCallTrendResponse
     */
    public GetDataServiceApiCallTrendResponse getDataServiceApiCallTrendWithOptions(GetDataServiceApiCallTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApiCallTrend"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiCallTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运维监控Api访问趋势分析。</p>
     * 
     * @param request GetDataServiceApiCallTrendRequest
     * @return GetDataServiceApiCallTrendResponse
     */
    public GetDataServiceApiCallTrendResponse getDataServiceApiCallTrend(GetDataServiceApiCallTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiCallTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取API文档。</p>
     * 
     * @param request GetDataServiceApiDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiDocumentResponse
     */
    public GetDataServiceApiDocumentResponse getDataServiceApiDocumentWithOptions(GetDataServiceApiDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApiDocument"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取API文档。</p>
     * 
     * @param request GetDataServiceApiDocumentRequest
     * @return GetDataServiceApiDocumentResponse
     */
    public GetDataServiceApiDocumentResponse getDataServiceApiDocument(GetDataServiceApiDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取API异常影响汇总。</p>
     * 
     * @param request GetDataServiceApiErrorImpactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiErrorImpactResponse
     */
    public GetDataServiceApiErrorImpactResponse getDataServiceApiErrorImpactWithOptions(GetDataServiceApiErrorImpactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApiErrorImpact"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiErrorImpactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取API异常影响汇总。</p>
     * 
     * @param request GetDataServiceApiErrorImpactRequest
     * @return GetDataServiceApiErrorImpactResponse
     */
    public GetDataServiceApiErrorImpactResponse getDataServiceApiErrorImpact(GetDataServiceApiErrorImpactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiErrorImpactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务API分组列表。</p>
     * 
     * @param request GetDataServiceApiGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiGroupsResponse
     */
    public GetDataServiceApiGroupsResponse getDataServiceApiGroupsWithOptions(GetDataServiceApiGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDataServiceApiGroups"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务API分组列表。</p>
     * 
     * @param request GetDataServiceApiGroupsRequest
     * @return GetDataServiceApiGroupsResponse
     */
    public GetDataServiceApiGroupsResponse getDataServiceApiGroups(GetDataServiceApiGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用有权限的用户列表。</p>
     * 
     * @param request GetDataServiceAppAuthorizedUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceAppAuthorizedUsersResponse
     */
    public GetDataServiceAppAuthorizedUsersResponse getDataServiceAppAuthorizedUsersWithOptions(GetDataServiceAppAuthorizedUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
            new TeaPair("action", "GetDataServiceAppAuthorizedUsers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceAppAuthorizedUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用有权限的用户列表。</p>
     * 
     * @param request GetDataServiceAppAuthorizedUsersRequest
     * @return GetDataServiceAppAuthorizedUsersResponse
     */
    public GetDataServiceAppAuthorizedUsersResponse getDataServiceAppAuthorizedUsers(GetDataServiceAppAuthorizedUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceAppAuthorizedUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务项目的应用分组列表。</p>
     * 
     * @param request GetDataServiceAppGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceAppGroupsResponse
     */
    public GetDataServiceAppGroupsResponse getDataServiceAppGroupsWithOptions(GetDataServiceAppGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDataServiceAppGroups"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceAppGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务项目的应用分组列表。</p>
     * 
     * @param request GetDataServiceAppGroupsRequest
     * @return GetDataServiceAppGroupsResponse
     */
    public GetDataServiceAppGroupsResponse getDataServiceAppGroups(GetDataServiceAppGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceAppGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组下应用列表。</p>
     * 
     * @param request GetDataServiceAppsByGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceAppsByGroupIdResponse
     */
    public GetDataServiceAppsByGroupIdResponse getDataServiceAppsByGroupIdWithOptions(GetDataServiceAppsByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
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
            new TeaPair("action", "GetDataServiceAppsByGroupId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceAppsByGroupIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询分组下应用列表。</p>
     * 
     * @param request GetDataServiceAppsByGroupIdRequest
     * @return GetDataServiceAppsByGroupIdResponse
     */
    public GetDataServiceAppsByGroupIdResponse getDataServiceAppsByGroupId(GetDataServiceAppsByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceAppsByGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据App分组Id查询账号有权限的应用列表。</p>
     * 
     * @param request GetDataServiceAuthorizedAppsByGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceAuthorizedAppsByGroupIdResponse
     */
    public GetDataServiceAuthorizedAppsByGroupIdResponse getDataServiceAuthorizedAppsByGroupIdWithOptions(GetDataServiceAuthorizedAppsByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
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
            new TeaPair("action", "GetDataServiceAuthorizedAppsByGroupId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceAuthorizedAppsByGroupIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据App分组Id查询账号有权限的应用列表。</p>
     * 
     * @param request GetDataServiceAuthorizedAppsByGroupIdRequest
     * @return GetDataServiceAuthorizedAppsByGroupIdResponse
     */
    public GetDataServiceAuthorizedAppsByGroupIdResponse getDataServiceAuthorizedAppsByGroupId(GetDataServiceAuthorizedAppsByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceAuthorizedAppsByGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询有权限的项目列表。</p>
     * 
     * @param request GetDataServiceAuthorizedProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceAuthorizedProjectsResponse
     */
    public GetDataServiceAuthorizedProjectsResponse getDataServiceAuthorizedProjectsWithOptions(GetDataServiceAuthorizedProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceAuthorizedProjects"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceAuthorizedProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询有权限的项目列表。</p>
     * 
     * @param request GetDataServiceAuthorizedProjectsRequest
     * @return GetDataServiceAuthorizedProjectsResponse
     */
    public GetDataServiceAuthorizedProjectsResponse getDataServiceAuthorizedProjects(GetDataServiceAuthorizedProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceAuthorizedProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当前登录当前用户作为负责人的项目列表。</p>
     * 
     * @param request GetDataServiceMyProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceMyProjectsResponse
     */
    public GetDataServiceMyProjectsResponse getDataServiceMyProjectsWithOptions(GetDataServiceMyProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceMyProjects"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceMyProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>当前登录当前用户作为负责人的项目列表。</p>
     * 
     * @param request GetDataServiceMyProjectsRequest
     * @return GetDataServiceMyProjectsResponse
     */
    public GetDataServiceMyProjectsResponse getDataServiceMyProjects(GetDataServiceMyProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceMyProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取可添加到项目成员的用户列表。</p>
     * 
     * @param request GetDataServiceProjectAddableUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceProjectAddableUsersResponse
     */
    public GetDataServiceProjectAddableUsersResponse getDataServiceProjectAddableUsersWithOptions(GetDataServiceProjectAddableUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDataServiceProjectAddableUsers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceProjectAddableUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取可添加到项目成员的用户列表。</p>
     * 
     * @param request GetDataServiceProjectAddableUsersRequest
     * @return GetDataServiceProjectAddableUsersResponse
     */
    public GetDataServiceProjectAddableUsersResponse getDataServiceProjectAddableUsers(GetDataServiceProjectAddableUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceProjectAddableUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源变更影响的集成任务及数据库SQL任务。</p>
     * 
     * @param request GetDataSourceDependenciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceDependenciesResponse
     */
    public GetDataSourceDependenciesResponse getDataSourceDependenciesWithOptions(GetDataSourceDependenciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDataSourceDependencies"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceDependenciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源变更影响的集成任务及数据库SQL任务。</p>
     * 
     * @param request GetDataSourceDependenciesRequest
     * @return GetDataSourceDependenciesResponse
     */
    public GetDataSourceDependenciesResponse getDataSourceDependencies(GetDataSourceDependenciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceDependenciesWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDevObjectDependencyResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryTreeResponse());
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
     * <p>获取文件存储临时读写授权。</p>
     * 
     * @param request GetFileStorageCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileStorageCredentialResponse
     */
    public GetFileStorageCredentialResponse getFileStorageCredentialWithOptions(GetFileStorageCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useVpcEndpoint)) {
            query.put("UseVpcEndpoint", request.useVpcEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileStorageCredential"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileStorageCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件存储临时读写授权。</p>
     * 
     * @param request GetFileStorageCredentialRequest
     * @return GetFileStorageCredentialResponse
     */
    public GetFileStorageCredentialResponse getFileStorageCredential(GetFileStorageCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileStorageCredentialWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceDownStreamResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceUpDownStreamResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestSubmitDetailResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMyRolesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMyTenantsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeUpDownStreamResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationSubmitStatusResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalInstanceResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalInstanceLogResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeByOutputNameResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeContentResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalNodeOperationLogResponse());
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
     * <p>查询异步操作管道任务的执行结果。</p>
     * 
     * @param tmpReq GetPipelineAsyncResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineAsyncResultResponse
     */
    public GetPipelineAsyncResultResponse getPipelineAsyncResultWithOptions(GetPipelineAsyncResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPipelineAsyncResultShrinkRequest request = new GetPipelineAsyncResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncId)) {
            query.put("AsyncId", request.asyncId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineAsyncResult"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineAsyncResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步操作管道任务的执行结果。</p>
     * 
     * @param request GetPipelineAsyncResultRequest
     * @return GetPipelineAsyncResultResponse
     */
    public GetPipelineAsyncResultResponse getPipelineAsyncResult(GetPipelineAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPipelineAsyncResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据管道任务id查询管道任务。</p>
     * 
     * @param tmpReq GetPipelineByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineByIdResponse
     */
    public GetPipelineByIdResponse getPipelineByIdWithOptions(GetPipelineByIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPipelineByIdShrinkRequest request = new GetPipelineByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryId)) {
            request.queryIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryId, "QueryId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryIdShrink)) {
            body.put("QueryId", request.queryIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineById"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据管道任务id查询管道任务。</p>
     * 
     * @param request GetPipelineByIdRequest
     * @return GetPipelineByIdResponse
     */
    public GetPipelineByIdResponse getPipelineById(GetPipelineByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPipelineByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情。</p>
     * 
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
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
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目详情。</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过项目名获取项目详情。</p>
     * 
     * @param request GetProjectByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectByNameResponse
     */
    public GetProjectByNameResponse getProjectByNameWithOptions(GetProjectByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectByName"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectByNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过项目名获取项目详情。</p>
     * 
     * @param request GetProjectByNameRequest
     * @return GetProjectByNameResponse
     */
    public GetProjectByNameResponse getProjectByName(GetProjectByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectByNameWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectProduceUserResponse());
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
     * <p>获取项目白名单。</p>
     * 
     * @param request GetProjectWhiteListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectWhiteListsResponse
     */
    public GetProjectWhiteListsResponse getProjectWhiteListsWithOptions(GetProjectWhiteListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetProjectWhiteLists"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectWhiteListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目白名单。</p>
     * 
     * @param request GetProjectWhiteListsRequest
     * @return GetProjectWhiteListsResponse
     */
    public GetProjectWhiteListsResponse getProjectWhiteLists(GetProjectWhiteListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWhiteListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象ID获取告警设置。</p>
     * 
     * @param request GetQualityAlertOfAllRuleScopeByWatchIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityAlertOfAllRuleScopeByWatchIdResponse
     */
    public GetQualityAlertOfAllRuleScopeByWatchIdResponse getQualityAlertOfAllRuleScopeByWatchIdWithOptions(GetQualityAlertOfAllRuleScopeByWatchIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchId)) {
            query.put("WatchId", request.watchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityAlertOfAllRuleScopeByWatchId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityAlertOfAllRuleScopeByWatchIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象ID获取告警设置。</p>
     * 
     * @param request GetQualityAlertOfAllRuleScopeByWatchIdRequest
     * @return GetQualityAlertOfAllRuleScopeByWatchIdResponse
     */
    public GetQualityAlertOfAllRuleScopeByWatchIdResponse getQualityAlertOfAllRuleScopeByWatchId(GetQualityAlertOfAllRuleScopeByWatchIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityAlertOfAllRuleScopeByWatchIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量规则对象。</p>
     * 
     * @param request GetQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleResponse
     */
    public GetQualityRuleResponse getQualityRuleWithOptions(GetQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualityRule"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量规则对象。</p>
     * 
     * @param request GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量任务对象详情。</p>
     * 
     * @param request GetQualityRuleTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleTaskResponse
     */
    public GetQualityRuleTaskResponse getQualityRuleTaskWithOptions(GetQualityRuleTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTaskId)) {
            query.put("RuleTaskId", request.ruleTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRuleTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量任务对象详情。</p>
     * 
     * @param request GetQualityRuleTaskRequest
     * @return GetQualityRuleTaskResponse
     */
    public GetQualityRuleTaskResponse getQualityRuleTask(GetQualityRuleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量任务对象日志内容。</p>
     * 
     * @param request GetQualityRuleTaskLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleTaskLogResponse
     */
    public GetQualityRuleTaskLogResponse getQualityRuleTaskLogWithOptions(GetQualityRuleTaskLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTaskId)) {
            query.put("RuleTaskId", request.ruleTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRuleTaskLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleTaskLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量任务对象日志内容。</p>
     * 
     * @param request GetQualityRuleTaskLogRequest
     * @return GetQualityRuleTaskLogResponse
     */
    public GetQualityRuleTaskLogResponse getQualityRuleTaskLog(GetQualityRuleTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleTaskLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量调度对象。</p>
     * 
     * @param request GetQualityScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityScheduleResponse
     */
    public GetQualityScheduleResponse getQualityScheduleWithOptions(GetQualityScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualitySchedule"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量调度对象。</p>
     * 
     * @param request GetQualityScheduleRequest
     * @return GetQualityScheduleResponse
     */
    public GetQualityScheduleResponse getQualitySchedule(GetQualityScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象ID获取调度设置列表。</p>
     * 
     * @param request GetQualitySchedulesByWatchIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualitySchedulesByWatchIdResponse
     */
    public GetQualitySchedulesByWatchIdResponse getQualitySchedulesByWatchIdWithOptions(GetQualitySchedulesByWatchIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchId)) {
            query.put("WatchId", request.watchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualitySchedulesByWatchId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualitySchedulesByWatchIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象ID获取调度设置列表。</p>
     * 
     * @param request GetQualitySchedulesByWatchIdRequest
     * @return GetQualitySchedulesByWatchIdResponse
     */
    public GetQualitySchedulesByWatchIdResponse getQualitySchedulesByWatchId(GetQualitySchedulesByWatchIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualitySchedulesByWatchIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量模板对象。</p>
     * 
     * @param request GetQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityTemplateResponse
     */
    public GetQualityTemplateResponse getQualityTemplateWithOptions(GetQualityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualityTemplate"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量模板对象。</p>
     * 
     * @param request GetQualityTemplateRequest
     * @return GetQualityTemplateResponse
     */
    public GetQualityTemplateResponse getQualityTemplate(GetQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量监控对象。</p>
     * 
     * @param request GetQualityWatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityWatchResponse
     */
    public GetQualityWatchResponse getQualityWatchWithOptions(GetQualityWatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetQualityWatch"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityWatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量监控对象。</p>
     * 
     * @param request GetQualityWatchRequest
     * @return GetQualityWatchResponse
     */
    public GetQualityWatchResponse getQualityWatch(GetQualityWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityWatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象原始ID获取监控对象记录，例如：数据源、表、指标等的ID。</p>
     * 
     * @param request GetQualityWatchByObjectIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityWatchByObjectIdResponse
     */
    public GetQualityWatchByObjectIdResponse getQualityWatchByObjectIdWithOptions(GetQualityWatchByObjectIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchObjectId)) {
            query.put("WatchObjectId", request.watchObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchType)) {
            query.put("WatchType", request.watchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityWatchByObjectId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityWatchByObjectIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过监控对象原始ID获取监控对象记录，例如：数据源、表、指标等的ID。</p>
     * 
     * @param request GetQualityWatchByObjectIdRequest
     * @return GetQualityWatchByObjectIdResponse
     */
    public GetQualityWatchByObjectIdResponse getQualityWatchByObjectId(GetQualityWatchByObjectIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityWatchByObjectIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控任务对象。</p>
     * 
     * @param request GetQualityWatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityWatchTaskResponse
     */
    public GetQualityWatchTaskResponse getQualityWatchTaskWithOptions(GetQualityWatchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchTaskId)) {
            query.put("WatchTaskId", request.watchTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityWatchTask"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityWatchTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控任务对象。</p>
     * 
     * @param request GetQualityWatchTaskRequest
     * @return GetQualityWatchTaskResponse
     */
    public GetQualityWatchTaskResponse getQualityWatchTask(GetQualityWatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityWatchTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控任务对象的日志内容。</p>
     * 
     * @param request GetQualityWatchTaskLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityWatchTaskLogResponse
     */
    public GetQualityWatchTaskLogResponse getQualityWatchTaskLogWithOptions(GetQualityWatchTaskLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchTaskId)) {
            query.put("WatchTaskId", request.watchTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityWatchTaskLog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityWatchTaskLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控任务对象的日志内容。</p>
     * 
     * @param request GetQualityWatchTaskLogRequest
     * @return GetQualityWatchTaskLogResponse
     */
    public GetQualityWatchTaskLogResponse getQualityWatchTaskLog(GetQualityWatchTaskLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityWatchTaskLogWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueEngineVersionByEnvResponse());
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
     * <p>获取资源文件详情。</p>
     * 
     * @param request GetResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceResponse
     */
    public GetResourceResponse getResourceWithOptions(GetResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源文件详情。</p>
     * 
     * @param request GetResourceRequest
     * @return GetResourceResponse
     */
    public GetResourceResponse getResource(GetResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源文件指定版本详情。</p>
     * 
     * @param request GetResourceByVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceByVersionResponse
     */
    public GetResourceByVersionResponse getResourceByVersionWithOptions(GetResourceByVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "GetResourceByVersion"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceByVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源文件指定版本详情。</p>
     * 
     * @param request GetResourceByVersionRequest
     * @return GetResourceByVersionResponse
     */
    public GetResourceByVersionResponse getResourceByVersion(GetResourceByVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceByVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据分类详情。</p>
     * 
     * @param request GetSecurityClassifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityClassifyResponse
     */
    public GetSecurityClassifyResponse getSecurityClassifyWithOptions(GetSecurityClassifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetSecurityClassify"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityClassifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据分类详情。</p>
     * 
     * @param request GetSecurityClassifyRequest
     * @return GetSecurityClassifyResponse
     */
    public GetSecurityClassifyResponse getSecurityClassify(GetSecurityClassifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityClassifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取识别结果详情。</p>
     * 
     * @param request GetSecurityIdentifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityIdentifyResultResponse
     */
    public GetSecurityIdentifyResultResponse getSecurityIdentifyResultWithOptions(GetSecurityIdentifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetSecurityIdentifyResult"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityIdentifyResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取识别结果详情。</p>
     * 
     * @param request GetSecurityIdentifyResultRequest
     * @return GetSecurityIdentifyResultResponse
     */
    public GetSecurityIdentifyResultResponse getSecurityIdentifyResult(GetSecurityIdentifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityIdentifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据分级详情。</p>
     * 
     * @param request GetSecurityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityLevelResponse
     */
    public GetSecurityLevelResponse getSecurityLevelWithOptions(GetSecurityLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.index)) {
            query.put("Index", request.index);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecurityLevel"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据分级详情。</p>
     * 
     * @param request GetSecurityLevelRequest
     * @return GetSecurityLevelResponse
     */
    public GetSecurityLevelResponse getSecurityLevel(GetSecurityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过密钥名称获取密钥值。</p>
     * 
     * @param request GetSecuritySecretKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecuritySecretKeyResponse
     */
    public GetSecuritySecretKeyResponse getSecuritySecretKeyWithOptions(GetSecuritySecretKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecuritySecretKey"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecuritySecretKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过密钥名称获取密钥值。</p>
     * 
     * @param request GetSecuritySecretKeyRequest
     * @return GetSecuritySecretKeyResponse
     */
    public GetSecuritySecretKeyResponse getSecuritySecretKey(GetSecuritySecretKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecuritySecretKeyWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkLocalClientInfoResponse());
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
     * <p>获取标准详情。</p>
     * 
     * @param tmpReq GetStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardResponse
     */
    public GetStandardResponse getStandardWithOptions(GetStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStandardShrinkRequest request = new GetStandardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardGetQuery)) {
            request.standardGetQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardGetQuery, "StandardGetQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.standardGetQueryShrink)) {
            body.put("StandardGetQuery", request.standardGetQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准详情。</p>
     * 
     * @param request GetStandardRequest
     * @return GetStandardResponse
     */
    public GetStandardResponse getStandard(GetStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准码表详情。</p>
     * 
     * @param request GetStandardLookupTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardLookupTableResponse
     */
    public GetStandardLookupTableResponse getStandardLookupTableWithOptions(GetStandardLookupTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullable)) {
            query.put("Nullable", request.nullable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardLookupTable"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardLookupTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准码表详情。</p>
     * 
     * @param request GetStandardLookupTableRequest
     * @return GetStandardLookupTableResponse
     */
    public GetStandardLookupTableResponse getStandardLookupTable(GetStandardLookupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardLookupTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准集详情。</p>
     * 
     * @param request GetStandardSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardSetResponse
     */
    public GetStandardSetResponse getStandardSetWithOptions(GetStandardSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullable)) {
            query.put("Nullable", request.nullable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardSet"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标准集详情。</p>
     * 
     * @param request GetStandardSetRequest
     * @return GetStandardSetResponse
     */
    public GetStandardSetResponse getStandardSet(GetStandardSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询目录下按照标准类型统计标准数目。</p>
     * 
     * @param tmpReq GetStandardStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardStatisticsResponse
     */
    public GetStandardStatisticsResponse getStandardStatisticsWithOptions(GetStandardStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStandardStatisticsShrinkRequest request = new GetStandardStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statisticsQuery)) {
            request.statisticsQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statisticsQuery, "StatisticsQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.statisticsQueryShrink)) {
            body.put("StatisticsQuery", request.statisticsQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardStatistics"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询目录下按照标准类型统计标准数目。</p>
     * 
     * @param request GetStandardStatisticsRequest
     * @return GetStandardStatisticsResponse
     */
    public GetStandardStatisticsResponse getStandardStatistics(GetStandardStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准模板详情。</p>
     * 
     * @param tmpReq GetStandardTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardTemplateResponse
     */
    public GetStandardTemplateResponse getStandardTemplateWithOptions(GetStandardTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStandardTemplateShrinkRequest request = new GetStandardTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterQuery)) {
            request.filterQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterQuery, "FilterQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullable)) {
            query.put("Nullable", request.nullable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterQueryShrink)) {
            body.put("FilterQuery", request.filterQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardTemplate"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准模板详情。</p>
     * 
     * @param request GetStandardTemplateRequest
     * @return GetStandardTemplateResponse
     */
    public GetStandardTemplateResponse getStandardTemplate(GetStandardTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准词根详情。</p>
     * 
     * @param request GetStandardWordRootRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardWordRootResponse
     */
    public GetStandardWordRootResponse getStandardWordRootWithOptions(GetStandardWordRootRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nullable)) {
            query.put("Nullable", request.nullable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardWordRoot"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardWordRootResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据标准词根详情。</p>
     * 
     * @param request GetStandardWordRootRequest
     * @return GetStandardWordRootResponse
     */
    public GetStandardWordRootResponse getStandardWordRoot(GetStandardWordRootRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardWordRootWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取dataphin实时研发任务集合</p>
     * 
     * @param request GetStreamJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStreamJobsResponse
     */
    public GetStreamJobsResponse getStreamJobsWithOptions(GetStreamJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStreamJobs"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStreamJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取dataphin实时研发任务集合</p>
     * 
     * @param request GetStreamJobsRequest
     * @return GetStreamJobsResponse
     */
    public GetStreamJobsResponse getStreamJobs(GetStreamJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStreamJobsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupplementDagrunResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupplementDagrunInstanceResponse());
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
     * <p>查询表字段血缘信息</p>
     * 
     * @param tmpReq GetTableColumnLineageByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnLineageByTaskIdResponse
     */
    public GetTableColumnLineageByTaskIdResponse getTableColumnLineageByTaskIdWithOptions(GetTableColumnLineageByTaskIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableColumnLineageByTaskIdShrinkRequest request = new GetTableColumnLineageByTaskIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableColumnLineageByTaskIdQuery)) {
            request.tableColumnLineageByTaskIdQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableColumnLineageByTaskIdQuery, "TableColumnLineageByTaskIdQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableColumnLineageByTaskIdQueryShrink)) {
            body.put("TableColumnLineageByTaskIdQuery", request.tableColumnLineageByTaskIdQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumnLineageByTaskId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnLineageByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询表字段血缘信息</p>
     * 
     * @param request GetTableColumnLineageByTaskIdRequest
     * @return GetTableColumnLineageByTaskIdResponse
     */
    public GetTableColumnLineageByTaskIdResponse getTableColumnLineageByTaskId(GetTableColumnLineageByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableColumnLineageByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产表字段血缘信息。</p>
     * 
     * @param tmpReq GetTableColumnLineagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnLineagesResponse
     */
    public GetTableColumnLineagesResponse getTableColumnLineagesWithOptions(GetTableColumnLineagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableColumnLineagesShrinkRequest request = new GetTableColumnLineagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterQuery)) {
            request.filterQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterQuery, "FilterQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterQueryShrink)) {
            body.put("FilterQuery", request.filterQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumnLineages"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnLineagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产表字段血缘信息。</p>
     * 
     * @param request GetTableColumnLineagesRequest
     * @return GetTableColumnLineagesResponse
     */
    public GetTableColumnLineagesResponse getTableColumnLineages(GetTableColumnLineagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableColumnLineagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产清单中Dataphin表的字段。</p>
     * 
     * @param request GetTableColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumnsWithOptions(GetTableColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalog)) {
            query.put("Catalog", request.catalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumns"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产清单中Dataphin表的字段。</p>
     * 
     * @param request GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumns(GetTableColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询表血缘信息</p>
     * 
     * @param tmpReq GetTableLineageByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableLineageByTaskIdResponse
     */
    public GetTableLineageByTaskIdResponse getTableLineageByTaskIdWithOptions(GetTableLineageByTaskIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableLineageByTaskIdShrinkRequest request = new GetTableLineageByTaskIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableLineageByTaskIdQuery)) {
            request.tableLineageByTaskIdQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableLineageByTaskIdQuery, "TableLineageByTaskIdQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableLineageByTaskIdQueryShrink)) {
            body.put("TableLineageByTaskIdQuery", request.tableLineageByTaskIdQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableLineageByTaskId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableLineageByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询表血缘信息</p>
     * 
     * @param request GetTableLineageByTaskIdRequest
     * @return GetTableLineageByTaskIdResponse
     */
    public GetTableLineageByTaskIdResponse getTableLineageByTaskId(GetTableLineageByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableLineageByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产表血缘信息。</p>
     * 
     * @param tmpReq GetTableLineagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableLineagesResponse
     */
    public GetTableLineagesResponse getTableLineagesWithOptions(GetTableLineagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableLineagesShrinkRequest request = new GetTableLineagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterQuery)) {
            request.filterQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterQuery, "FilterQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterQueryShrink)) {
            body.put("FilterQuery", request.filterQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableLineages"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableLineagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产表血缘信息。</p>
     * 
     * @param request GetTableLineagesRequest
     * @return GetTableLineagesResponse
     */
    public GetTableLineagesResponse getTableLineages(GetTableLineagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableLineagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据转交任务ID查询转交任务的进度</p>
     * 
     * @param request GetTransferInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTransferInfoResponse
     */
    public GetTransferInfoResponse getTransferInfoWithOptions(GetTransferInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proposalId)) {
            query.put("ProposalId", request.proposalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTransferInfo"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTransferInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据转交任务ID查询转交任务的进度</p>
     * 
     * @param request GetTransferInfoRequest
     * @return GetTransferInfoResponse
     */
    public GetTransferInfoResponse getTransferInfo(GetTransferInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTransferInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义函数详情。</p>
     * 
     * @param request GetUdfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUdfResponse
     */
    public GetUdfResponse getUdfWithOptions(GetUdfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "GetUdf"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUdfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义函数详情。</p>
     * 
     * @param request GetUdfRequest
     * @return GetUdfResponse
     */
    public GetUdfResponse getUdf(GetUdfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUdfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义函数版本详情。</p>
     * 
     * @param request GetUdfByVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUdfByVersionResponse
     */
    public GetUdfByVersionResponse getUdfByVersionWithOptions(GetUdfByVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "GetUdfByVersion"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUdfByVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义函数版本详情。</p>
     * 
     * @param request GetUdfByVersionRequest
     * @return GetUdfByVersionResponse
     */
    public GetUdfByVersionResponse getUdfByVersion(GetUdfByVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUdfByVersionWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserBySourceIdResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUsersResponse());
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
     * <p>API授权。</p>
     * 
     * @param tmpReq GrantDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantDataServiceApiResponse
     */
    public GrantDataServiceApiResponse grantDataServiceApiWithOptions(GrantDataServiceApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantDataServiceApiShrinkRequest request = new GrantDataServiceApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.grantCommand)) {
            request.grantCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.grantCommand, "GrantCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "GrantDataServiceApi"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantDataServiceApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>API授权。</p>
     * 
     * @param request GrantDataServiceApiRequest
     * @return GrantDataServiceApiResponse
     */
    public GrantDataServiceApiResponse grantDataServiceApi(GrantDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantDataServiceApiWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantResourcePermissionResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddableRolesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddableUsersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertEventsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertNotificationsResponse());
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
     * <p>根据app查询api列表</p>
     * 
     * @param tmpReq ListApiByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiByAppResponse
     */
    public ListApiByAppResponse listApiByAppWithOptions(ListApiByAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListApiByAppShrinkRequest request = new ListApiByAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pageQuery)) {
            request.pageQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pageQuery, "PageQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageQueryShrink)) {
            body.put("PageQuery", request.pageQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiByApp"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiByAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据app查询api列表</p>
     * 
     * @param request ListApiByAppRequest
     * @return ListApiByAppResponse
     */
    public ListApiByAppResponse listApiByApp(ListApiByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiByAppWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedDataServiceApiDetailsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizEntitiesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizUnitsResponse());
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
     * <p>查询计算源列表。</p>
     * 
     * @param tmpReq ListComputeSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComputeSourcesResponse
     */
    public ListComputeSourcesResponse listComputeSourcesWithOptions(ListComputeSourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListComputeSourcesShrinkRequest request = new ListComputeSourcesShrinkRequest();
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
            new TeaPair("action", "ListComputeSources"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComputeSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询计算源列表。</p>
     * 
     * @param request ListComputeSourcesRequest
     * @return ListComputeSourcesResponse
     */
    public ListComputeSourcesResponse listComputeSources(ListComputeSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComputeSourcesWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataDomainsResponse());
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
     * <p>查询API运维统计信息。</p>
     * 
     * @param tmpReq ListDataServiceApiCallStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApiCallStatisticsResponse
     */
    public ListDataServiceApiCallStatisticsResponse listDataServiceApiCallStatisticsWithOptions(ListDataServiceApiCallStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceApiCallStatisticsShrinkRequest request = new ListDataServiceApiCallStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceApiCallStatistics"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiCallStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询API运维统计信息。</p>
     * 
     * @param request ListDataServiceApiCallStatisticsRequest
     * @return ListDataServiceApiCallStatisticsResponse
     */
    public ListDataServiceApiCallStatisticsResponse listDataServiceApiCallStatistics(ListDataServiceApiCallStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiCallStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询数据服务调用日志。</p>
     * 
     * @param tmpReq ListDataServiceApiCallsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApiCallsResponse
     */
    public ListDataServiceApiCallsResponse listDataServiceApiCallsWithOptions(ListDataServiceApiCallsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceApiCallsShrinkRequest request = new ListDataServiceApiCallsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceApiCalls"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiCallsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询数据服务调用日志。</p>
     * 
     * @param request ListDataServiceApiCallsRequest
     * @return ListDataServiceApiCallsResponse
     */
    public ListDataServiceApiCallsResponse listDataServiceApiCalls(ListDataServiceApiCallsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiCallsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>API影响分析列表。</p>
     * 
     * @param tmpReq ListDataServiceApiImpactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApiImpactsResponse
     */
    public ListDataServiceApiImpactsResponse listDataServiceApiImpactsWithOptions(ListDataServiceApiImpactsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceApiImpactsShrinkRequest request = new ListDataServiceApiImpactsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceApiImpacts"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiImpactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>API影响分析列表。</p>
     * 
     * @param request ListDataServiceApiImpactsRequest
     * @return ListDataServiceApiImpactsResponse
     */
    public ListDataServiceApiImpactsResponse listDataServiceApiImpacts(ListDataServiceApiImpactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiImpactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户有权限的应用列表。</p>
     * 
     * @param tmpReq ListDataServiceAuthorizedAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceAuthorizedAppsResponse
     */
    public ListDataServiceAuthorizedAppsResponse listDataServiceAuthorizedAppsWithOptions(ListDataServiceAuthorizedAppsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceAuthorizedAppsShrinkRequest request = new ListDataServiceAuthorizedAppsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceAuthorizedApps"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceAuthorizedAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户有权限的应用列表。</p>
     * 
     * @param request ListDataServiceAuthorizedAppsRequest
     * @return ListDataServiceAuthorizedAppsResponse
     */
    public ListDataServiceAuthorizedAppsResponse listDataServiceAuthorizedApps(ListDataServiceAuthorizedAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取我管理的API权限列表。</p>
     * 
     * @param tmpReq ListDataServiceMyApiPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceMyApiPermissionsResponse
     */
    public ListDataServiceMyApiPermissionsResponse listDataServiceMyApiPermissionsWithOptions(ListDataServiceMyApiPermissionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceMyApiPermissionsShrinkRequest request = new ListDataServiceMyApiPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceMyApiPermissions"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceMyApiPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取我管理的API权限列表。</p>
     * 
     * @param request ListDataServiceMyApiPermissionsRequest
     * @return ListDataServiceMyApiPermissionsResponse
     */
    public ListDataServiceMyApiPermissionsResponse listDataServiceMyApiPermissions(ListDataServiceMyApiPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceMyApiPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户有权限的应用。</p>
     * 
     * @param tmpReq ListDataServiceMyAppPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceMyAppPermissionsResponse
     */
    public ListDataServiceMyAppPermissionsResponse listDataServiceMyAppPermissionsWithOptions(ListDataServiceMyAppPermissionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServiceMyAppPermissionsShrinkRequest request = new ListDataServiceMyAppPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServiceMyAppPermissions"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceMyAppPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户有权限的应用。</p>
     * 
     * @param request ListDataServiceMyAppPermissionsRequest
     * @return ListDataServiceMyAppPermissionsResponse
     */
    public ListDataServiceMyAppPermissionsResponse listDataServiceMyAppPermissions(ListDataServiceMyAppPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceMyAppPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询已发布的API列表。</p>
     * 
     * @param tmpReq ListDataServicePublishedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServicePublishedApisResponse
     */
    public ListDataServicePublishedApisResponse listDataServicePublishedApisWithOptions(ListDataServicePublishedApisRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataServicePublishedApisShrinkRequest request = new ListDataServicePublishedApisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "ListDataServicePublishedApis"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServicePublishedApisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询已发布的API列表。</p>
     * 
     * @param request ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApisWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceWithConfigResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeDownStreamResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
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
     * <p>获取项目成员列表。</p>
     * 
     * @param tmpReq ListProjectMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectMembersShrinkRequest request = new ListProjectMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listQuery)) {
            request.listQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listQuery, "ListQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目成员列表。</p>
     * 
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表。</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
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
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表。</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishRecordsResponse());
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
     * <p>分页查询质量规则任务。</p>
     * 
     * @param tmpReq ListQualityRuleTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityRuleTasksResponse
     */
    public ListQualityRuleTasksResponse listQualityRuleTasksWithOptions(ListQualityRuleTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQualityRuleTasksShrinkRequest request = new ListQualityRuleTasksShrinkRequest();
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
            new TeaPair("action", "ListQualityRuleTasks"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityRuleTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量规则任务。</p>
     * 
     * @param request ListQualityRuleTasksRequest
     * @return ListQualityRuleTasksResponse
     */
    public ListQualityRuleTasksResponse listQualityRuleTasks(ListQualityRuleTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRuleTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量规则。</p>
     * 
     * @param tmpReq ListQualityRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityRulesResponse
     */
    public ListQualityRulesResponse listQualityRulesWithOptions(ListQualityRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQualityRulesShrinkRequest request = new ListQualityRulesShrinkRequest();
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
            new TeaPair("action", "ListQualityRules"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量规则。</p>
     * 
     * @param request ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量模板。</p>
     * 
     * @param tmpReq ListQualityTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityTemplatesResponse
     */
    public ListQualityTemplatesResponse listQualityTemplatesWithOptions(ListQualityTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQualityTemplatesShrinkRequest request = new ListQualityTemplatesShrinkRequest();
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
            new TeaPair("action", "ListQualityTemplates"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量模板。</p>
     * 
     * @param request ListQualityTemplatesRequest
     * @return ListQualityTemplatesResponse
     */
    public ListQualityTemplatesResponse listQualityTemplates(ListQualityTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量监控任务。</p>
     * 
     * @param tmpReq ListQualityWatchTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityWatchTasksResponse
     */
    public ListQualityWatchTasksResponse listQualityWatchTasksWithOptions(ListQualityWatchTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQualityWatchTasksShrinkRequest request = new ListQualityWatchTasksShrinkRequest();
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
            new TeaPair("action", "ListQualityWatchTasks"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityWatchTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量监控任务。</p>
     * 
     * @param request ListQualityWatchTasksRequest
     * @return ListQualityWatchTasksResponse
     */
    public ListQualityWatchTasksResponse listQualityWatchTasks(ListQualityWatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityWatchTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量监控对象。</p>
     * 
     * @param tmpReq ListQualityWatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityWatchesResponse
     */
    public ListQualityWatchesResponse listQualityWatchesWithOptions(ListQualityWatchesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQualityWatchesShrinkRequest request = new ListQualityWatchesShrinkRequest();
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
            new TeaPair("action", "ListQualityWatches"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityWatchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询质量监控对象。</p>
     * 
     * @param request ListQualityWatchesRequest
     * @return ListQualityWatchesResponse
     */
    public ListQualityWatchesResponse listQualityWatches(ListQualityWatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityWatchesWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcePermissionOperationLogResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcePermissionsResponse());
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
     * <p>分页查询行级权限</p>
     * 
     * @param tmpReq ListRowPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRowPermissionResponse
     */
    public ListRowPermissionResponse listRowPermissionWithOptions(ListRowPermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRowPermissionShrinkRequest request = new ListRowPermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pageRowPermissionQuery)) {
            request.pageRowPermissionQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pageRowPermissionQuery, "PageRowPermissionQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageRowPermissionQueryShrink)) {
            body.put("PageRowPermissionQuery", request.pageRowPermissionQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRowPermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRowPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询行级权限</p>
     * 
     * @param request ListRowPermissionRequest
     * @return ListRowPermissionResponse
     */
    public ListRowPermissionResponse listRowPermission(ListRowPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRowPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询指定用户行级权限</p>
     * 
     * @param tmpReq ListRowPermissionByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRowPermissionByUserIdResponse
     */
    public ListRowPermissionByUserIdResponse listRowPermissionByUserIdWithOptions(ListRowPermissionByUserIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRowPermissionByUserIdShrinkRequest request = new ListRowPermissionByUserIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listRowPermissionByUserIdQuery)) {
            request.listRowPermissionByUserIdQueryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listRowPermissionByUserIdQuery, "ListRowPermissionByUserIdQuery", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listRowPermissionByUserIdQueryShrink)) {
            body.put("ListRowPermissionByUserIdQuery", request.listRowPermissionByUserIdQueryShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRowPermissionByUserId"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRowPermissionByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询指定用户行级权限</p>
     * 
     * @param request ListRowPermissionByUserIdRequest
     * @return ListRowPermissionByUserIdResponse
     */
    public ListRowPermissionByUserIdResponse listRowPermissionByUserId(ListRowPermissionByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRowPermissionByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询安全识别结果的识别记录。</p>
     * 
     * @param tmpReq ListSecurityIdentifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityIdentifyRecordsResponse
     */
    public ListSecurityIdentifyRecordsResponse listSecurityIdentifyRecordsWithOptions(ListSecurityIdentifyRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSecurityIdentifyRecordsShrinkRequest request = new ListSecurityIdentifyRecordsShrinkRequest();
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
            new TeaPair("action", "ListSecurityIdentifyRecords"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityIdentifyRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询安全识别结果的识别记录。</p>
     * 
     * @param request ListSecurityIdentifyRecordsRequest
     * @return ListSecurityIdentifyRecordsResponse
     */
    public ListSecurityIdentifyRecordsResponse listSecurityIdentifyRecords(ListSecurityIdentifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityIdentifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询安全识别结果。</p>
     * 
     * @param tmpReq ListSecurityIdentifyResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityIdentifyResultsResponse
     */
    public ListSecurityIdentifyResultsResponse listSecurityIdentifyResultsWithOptions(ListSecurityIdentifyResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSecurityIdentifyResultsShrinkRequest request = new ListSecurityIdentifyResultsShrinkRequest();
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
            new TeaPair("action", "ListSecurityIdentifyResults"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityIdentifyResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询安全识别结果。</p>
     * 
     * @param request ListSecurityIdentifyResultsRequest
     * @return ListSecurityIdentifyResultsResponse
     */
    public ListSecurityIdentifyResultsResponse listSecurityIdentifyResults(ListSecurityIdentifyResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityIdentifyResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询标准列表。</p>
     * 
     * @param tmpReq ListStandardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStandardsResponse
     */
    public ListStandardsResponse listStandardsWithOptions(ListStandardsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListStandardsShrinkRequest request = new ListStandardsShrinkRequest();
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
            new TeaPair("action", "ListStandards"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStandardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询标准列表。</p>
     * 
     * @param request ListStandardsRequest
     * @return ListStandardsResponse
     */
    public ListStandardsResponse listStandards(ListStandardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStandardsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubmitRecordsResponse());
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
     * <p>分页查询查询资产表元数据。</p>
     * 
     * @param tmpReq ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTablesShrinkRequest request = new ListTablesShrinkRequest();
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
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询查询资产表元数据。</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantMembersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupMembersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineBatchTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineBizEntityResponse());
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
     * <p>下线集成管道任务。</p>
     * 
     * @param tmpReq OfflinePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflinePipelineResponse
     */
    public OfflinePipelineResponse offlinePipelineWithOptions(OfflinePipelineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflinePipelineShrinkRequest request = new OfflinePipelineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.offlineCommand)) {
            request.offlineCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.offlineCommand, "OfflineCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineCommandShrink)) {
            body.put("OfflineCommand", request.offlineCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflinePipeline"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflinePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线集成管道任务。</p>
     * 
     * @param request OfflinePipelineRequest
     * @return OfflinePipelineResponse
     */
    public OfflinePipelineResponse offlinePipeline(OfflinePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlinePipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步下线集成管道任务。</p>
     * 
     * @param tmpReq OfflinePipelineByAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflinePipelineByAsyncResponse
     */
    public OfflinePipelineByAsyncResponse offlinePipelineByAsyncWithOptions(OfflinePipelineByAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflinePipelineByAsyncShrinkRequest request = new OfflinePipelineByAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.offlineCommand)) {
            request.offlineCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.offlineCommand, "OfflineCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offlineCommandShrink)) {
            body.put("OfflineCommand", request.offlineCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflinePipelineByAsync"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflinePipelineByAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步下线集成管道任务。</p>
     * 
     * @param request OfflinePipelineByAsyncRequest
     * @return OfflinePipelineByAsyncResponse
     */
    public OfflinePipelineByAsyncResponse offlinePipelineByAsync(OfflinePipelineByAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlinePipelineByAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线标准。</p>
     * 
     * @param tmpReq OfflineStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineStandardResponse
     */
    public OfflineStandardResponse offlineStandardWithOptions(OfflineStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OfflineStandardShrinkRequest request = new OfflineStandardShrinkRequest();
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
            new TeaPair("action", "OfflineStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线标准。</p>
     * 
     * @param request OfflineStandardRequest
     * @return OfflineStandardResponse
     */
    public OfflineStandardResponse offlineStandard(OfflineStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineStandardWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new OnlineBizEntityResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateInstanceResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ParseBatchTaskDependencyResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new PausePhysicalNodeResponse());
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
     * <p>发布数据服务API到生产环境。</p>
     * 
     * @param request PublishDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishDataServiceApiResponse
     */
    public PublishDataServiceApiResponse publishDataServiceApiWithOptions(PublishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
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
            new TeaPair("action", "PublishDataServiceApi"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishDataServiceApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布数据服务API到生产环境。</p>
     * 
     * @param request PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApiWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishObjectListResponse());
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
     * <p>发布标准。</p>
     * 
     * @param tmpReq PublishStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishStandardResponse
     */
    public PublishStandardResponse publishStandardWithOptions(PublishStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishStandardShrinkRequest request = new PublishStandardShrinkRequest();
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
            new TeaPair("action", "PublishStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布标准。</p>
     * 
     * @param request PublishStandardRequest
     * @return PublishStandardResponse
     */
    public PublishStandardResponse publishStandard(PublishStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishStandardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目成员。</p>
     * 
     * @param tmpReq RemoveProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveProjectMemberResponse
     */
    public RemoveProjectMemberResponse removeProjectMemberWithOptions(RemoveProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveProjectMemberShrinkRequest request = new RemoveProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.removeCommand)) {
            request.removeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.removeCommand, "RemoveCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

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
            new TeaPair("action", "RemoveProjectMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveProjectMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目成员。</p>
     * 
     * @param request RemoveProjectMemberRequest
     * @return RemoveProjectMemberResponse
     */
    public RemoveProjectMemberResponse removeProjectMember(RemoveProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量规则和调度的绑定关系。</p>
     * 
     * @param tmpReq RemoveQualityRuleSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveQualityRuleSchedulesResponse
     */
    public RemoveQualityRuleSchedulesResponse removeQualityRuleSchedulesWithOptions(RemoveQualityRuleSchedulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveQualityRuleSchedulesShrinkRequest request = new RemoveQualityRuleSchedulesShrinkRequest();
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
            new TeaPair("action", "RemoveQualityRuleSchedules"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveQualityRuleSchedulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除质量规则和调度的绑定关系。</p>
     * 
     * @param request RemoveQualityRuleSchedulesRequest
     * @return RemoveQualityRuleSchedulesResponse
     */
    public RemoveQualityRuleSchedulesResponse removeQualityRuleSchedules(RemoveQualityRuleSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeQualityRuleSchedulesWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTenantMemberResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserGroupMemberResponse());
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
     * <p>更新项目白名单。</p>
     * 
     * @param tmpReq ReplaceProjectWhiteListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceProjectWhiteListsResponse
     */
    public ReplaceProjectWhiteListsResponse replaceProjectWhiteListsWithOptions(ReplaceProjectWhiteListsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplaceProjectWhiteListsShrinkRequest request = new ReplaceProjectWhiteListsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.replaceCommand)) {
            request.replaceCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.replaceCommand, "ReplaceCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replaceCommandShrink)) {
            body.put("ReplaceCommand", request.replaceCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceProjectWhiteLists"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceProjectWhiteListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目白名单。</p>
     * 
     * @param request ReplaceProjectWhiteListsRequest
     * @return ReplaceProjectWhiteListsResponse
     */
    public ReplaceProjectWhiteListsResponse replaceProjectWhiteLists(ReplaceProjectWhiteListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceProjectWhiteListsWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumePhysicalNodeResponse());
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
     * <p>重新转交运行失败的转交任务</p>
     * 
     * @param tmpReq RetryTransferOwnershipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryTransferOwnershipResponse
     */
    public RetryTransferOwnershipResponse retryTransferOwnershipWithOptions(RetryTransferOwnershipRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryTransferOwnershipShrinkRequest request = new RetryTransferOwnershipShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.privilegeTransferRecord)) {
            request.privilegeTransferRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.privilegeTransferRecord, "PrivilegeTransferRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privilegeTransferRecordShrink)) {
            body.put("PrivilegeTransferRecord", request.privilegeTransferRecordShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryTransferOwnership"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryTransferOwnershipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新转交运行失败的转交任务</p>
     * 
     * @param request RetryTransferOwnershipRequest
     * @return RetryTransferOwnershipResponse
     */
    public RetryTransferOwnershipResponse retryTransferOwnership(RetryTransferOwnershipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryTransferOwnershipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回收API授权。</p>
     * 
     * @param tmpReq RevokeDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeDataServiceApiResponse
     */
    public RevokeDataServiceApiResponse revokeDataServiceApiWithOptions(RevokeDataServiceApiRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeDataServiceApiShrinkRequest request = new RevokeDataServiceApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.revokeCommand)) {
            request.revokeCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.revokeCommand, "RevokeCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
            new TeaPair("action", "RevokeDataServiceApi"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeDataServiceApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回收API授权。</p>
     * 
     * @param request RevokeDataServiceApiRequest
     * @return RevokeDataServiceApiResponse
     */
    public RevokeDataServiceApiResponse revokeDataServiceApi(RevokeDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeDataServiceApiWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourcePermissionResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAdHocTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitBatchTaskResponse());
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
     * <p>批量提交规则任务,支持试跑。</p>
     * 
     * @param tmpReq SubmitQualityRuleTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitQualityRuleTasksResponse
     */
    public SubmitQualityRuleTasksResponse submitQualityRuleTasksWithOptions(SubmitQualityRuleTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitQualityRuleTasksShrinkRequest request = new SubmitQualityRuleTasksShrinkRequest();
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
            new TeaPair("action", "SubmitQualityRuleTasks"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitQualityRuleTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量提交规则任务,支持试跑。</p>
     * 
     * @param request SubmitQualityRuleTasksRequest
     * @return SubmitQualityRuleTasksResponse
     */
    public SubmitQualityRuleTasksResponse submitQualityRuleTasks(SubmitQualityRuleTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitQualityRuleTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量提交监控对象校验任务。</p>
     * 
     * @param tmpReq SubmitQualityWatchTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitQualityWatchTasksResponse
     */
    public SubmitQualityWatchTasksResponse submitQualityWatchTasksWithOptions(SubmitQualityWatchTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitQualityWatchTasksShrinkRequest request = new SubmitQualityWatchTasksShrinkRequest();
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
            new TeaPair("action", "SubmitQualityWatchTasks"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitQualityWatchTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量提交监控对象校验任务。</p>
     * 
     * @param request SubmitQualityWatchTasksRequest
     * @return SubmitQualityWatchTasksResponse
     */
    public SubmitQualityWatchTasksResponse submitQualityWatchTasks(SubmitQualityWatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitQualityWatchTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步部门信息。</p>
     * 
     * @param tmpReq SyncDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDepartmentResponse
     */
    public SyncDepartmentResponse syncDepartmentWithOptions(SyncDepartmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncDepartmentShrinkRequest request = new SyncDepartmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.syncDepartmentCommand)) {
            request.syncDepartmentCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.syncDepartmentCommand, "SyncDepartmentCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.syncDepartmentCommandShrink)) {
            body.put("SyncDepartmentCommand", request.syncDepartmentCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDepartment"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步部门信息。</p>
     * 
     * @param request SyncDepartmentRequest
     * @return SyncDepartmentResponse
     */
    public SyncDepartmentResponse syncDepartment(SyncDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步部门成员信息</p>
     * 
     * @param tmpReq SyncDepartmentUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDepartmentUserResponse
     */
    public SyncDepartmentUserResponse syncDepartmentUserWithOptions(SyncDepartmentUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncDepartmentUserShrinkRequest request = new SyncDepartmentUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.syncDepartmentUserCommand)) {
            request.syncDepartmentUserCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.syncDepartmentUserCommand, "SyncDepartmentUserCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.syncDepartmentUserCommandShrink)) {
            body.put("SyncDepartmentUserCommand", request.syncDepartmentUserCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDepartmentUser"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDepartmentUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步部门成员信息</p>
     * 
     * @param request SyncDepartmentUserRequest
     * @return SyncDepartmentUserResponse
     */
    public SyncDepartmentUserResponse syncDepartmentUser(SyncDepartmentUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDepartmentUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>一键转交负责人</p>
     * 
     * @param tmpReq TransferOwnershipForAllObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferOwnershipForAllObjectResponse
     */
    public TransferOwnershipForAllObjectResponse transferOwnershipForAllObjectWithOptions(TransferOwnershipForAllObjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TransferOwnershipForAllObjectShrinkRequest request = new TransferOwnershipForAllObjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.privilegeTransferRecord)) {
            request.privilegeTransferRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.privilegeTransferRecord, "PrivilegeTransferRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privilegeTransferRecordShrink)) {
            body.put("PrivilegeTransferRecord", request.privilegeTransferRecordShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferOwnershipForAllObject"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferOwnershipForAllObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>一键转交负责人</p>
     * 
     * @param request TransferOwnershipForAllObjectRequest
     * @return TransferOwnershipForAllObjectResponse
     */
    public TransferOwnershipForAllObjectResponse transferOwnershipForAllObject(TransferOwnershipForAllObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferOwnershipForAllObjectWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdHocFileResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchTaskResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchTaskUdfLineagesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizEntityResponse());
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
     * <p>更新业务指标</p>
     * 
     * @param tmpReq UpdateBizMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBizMetricResponse
     */
    public UpdateBizMetricResponse updateBizMetricWithOptions(UpdateBizMetricRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBizMetricShrinkRequest request = new UpdateBizMetricShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateBizMetricCommand)) {
            request.updateBizMetricCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateBizMetricCommand, "UpdateBizMetricCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateBizMetricCommandShrink)) {
            body.put("UpdateBizMetricCommand", request.updateBizMetricCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBizMetric"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务指标</p>
     * 
     * @param request UpdateBizMetricRequest
     * @return UpdateBizMetricResponse
     */
    public UpdateBizMetricResponse updateBizMetric(UpdateBizMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBizMetricWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizUnitResponse());
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
     * <p>修改计算源。</p>
     * 
     * @param tmpReq UpdateComputeSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComputeSourceResponse
     */
    public UpdateComputeSourceResponse updateComputeSourceWithOptions(UpdateComputeSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateComputeSourceShrinkRequest request = new UpdateComputeSourceShrinkRequest();
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
            new TeaPair("action", "UpdateComputeSource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComputeSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改计算源。</p>
     * 
     * @param request UpdateComputeSourceRequest
     * @return UpdateComputeSourceResponse
     */
    public UpdateComputeSourceResponse updateComputeSource(UpdateComputeSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComputeSourceWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataDomainResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceBasicInfoResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceConfigResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileDirectoryResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileNameResponse());
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
     * <p>更新集成管道任务。</p>
     * 
     * @param tmpReq UpdatePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipelineWithOptions(UpdatePipelineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePipelineShrinkRequest request = new UpdatePipelineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipeline"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新集成管道任务。</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步更新集成管道任务。</p>
     * 
     * @param tmpReq UpdatePipelineByAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineByAsyncResponse
     */
    public UpdatePipelineByAsyncResponse updatePipelineByAsyncWithOptions(UpdatePipelineByAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePipelineByAsyncShrinkRequest request = new UpdatePipelineByAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.context)) {
            request.contextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.context, "Context", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contextShrink)) {
            body.put("Context", request.contextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateCommandShrink)) {
            body.put("UpdateCommand", request.updateCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipelineByAsync"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineByAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步更新集成管道任务。</p>
     * 
     * @param request UpdatePipelineByAsyncRequest
     * @return UpdatePipelineByAsyncResponse
     */
    public UpdatePipelineByAsyncResponse updatePipelineByAsync(UpdatePipelineByAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePipelineByAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加项目成员。</p>
     * 
     * @param tmpReq UpdateProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectMemberResponse
     */
    public UpdateProjectMemberResponse updateProjectMemberWithOptions(UpdateProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProjectMemberShrinkRequest request = new UpdateProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateCommand)) {
            request.updateCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateCommand, "UpdateCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

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
            new TeaPair("action", "UpdateProjectMember"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加项目成员。</p>
     * 
     * @param request UpdateProjectMemberRequest
     * @return UpdateProjectMemberResponse
     */
    public UpdateProjectMemberResponse updateProjectMember(UpdateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量开启或关闭质量规则。</p>
     * 
     * @param tmpReq UpdateQualityRuleSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityRuleSwitchResponse
     */
    public UpdateQualityRuleSwitchResponse updateQualityRuleSwitchWithOptions(UpdateQualityRuleSwitchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateQualityRuleSwitchShrinkRequest request = new UpdateQualityRuleSwitchShrinkRequest();
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
            new TeaPair("action", "UpdateQualityRuleSwitch"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityRuleSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量开启或关闭质量规则。</p>
     * 
     * @param request UpdateQualityRuleSwitchRequest
     * @return UpdateQualityRuleSwitchResponse
     */
    public UpdateQualityRuleSwitchResponse updateQualityRuleSwitch(UpdateQualityRuleSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRuleSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量开启或关闭质量监控对象。</p>
     * 
     * @param tmpReq UpdateQualityWatchSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityWatchSwitchResponse
     */
    public UpdateQualityWatchSwitchResponse updateQualityWatchSwitchWithOptions(UpdateQualityWatchSwitchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateQualityWatchSwitchShrinkRequest request = new UpdateQualityWatchSwitchShrinkRequest();
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
            new TeaPair("action", "UpdateQualityWatchSwitch"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityWatchSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量开启或关闭质量监控对象。</p>
     * 
     * @param request UpdateQualityWatchSwitchRequest
     * @return UpdateQualityWatchSwitchResponse
     */
    public UpdateQualityWatchSwitchResponse updateQualityWatchSwitch(UpdateQualityWatchSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityWatchSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑资源文件。</p>
     * 
     * @param tmpReq UpdateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResourceWithOptions(UpdateResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceShrinkRequest request = new UpdateResourceShrinkRequest();
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
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑资源文件。</p>
     * 
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新行级权限</p>
     * 
     * @param tmpReq UpdateRowPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRowPermissionResponse
     */
    public UpdateRowPermissionResponse updateRowPermissionWithOptions(UpdateRowPermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRowPermissionShrinkRequest request = new UpdateRowPermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateRowPermissionCommand)) {
            request.updateRowPermissionCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateRowPermissionCommand, "UpdateRowPermissionCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateRowPermissionCommandShrink)) {
            body.put("UpdateRowPermissionCommand", request.updateRowPermissionCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRowPermission"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRowPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新行级权限</p>
     * 
     * @param request UpdateRowPermissionRequest
     * @return UpdateRowPermissionResponse
     */
    public UpdateRowPermissionResponse updateRowPermission(UpdateRowPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRowPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据分类。</p>
     * 
     * @param tmpReq UpdateSecurityClassifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityClassifyResponse
     */
    public UpdateSecurityClassifyResponse updateSecurityClassifyWithOptions(UpdateSecurityClassifyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecurityClassifyShrinkRequest request = new UpdateSecurityClassifyShrinkRequest();
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
            new TeaPair("action", "UpdateSecurityClassify"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityClassifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据分类。</p>
     * 
     * @param request UpdateSecurityClassifyRequest
     * @return UpdateSecurityClassifyResponse
     */
    public UpdateSecurityClassifyResponse updateSecurityClassify(UpdateSecurityClassifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityClassifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据分类目录。</p>
     * 
     * @param tmpReq UpdateSecurityClassifyCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityClassifyCatalogResponse
     */
    public UpdateSecurityClassifyCatalogResponse updateSecurityClassifyCatalogWithOptions(UpdateSecurityClassifyCatalogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecurityClassifyCatalogShrinkRequest request = new UpdateSecurityClassifyCatalogShrinkRequest();
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
            new TeaPair("action", "UpdateSecurityClassifyCatalog"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityClassifyCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据分类目录。</p>
     * 
     * @param request UpdateSecurityClassifyCatalogRequest
     * @return UpdateSecurityClassifyCatalogResponse
     */
    public UpdateSecurityClassifyCatalogResponse updateSecurityClassifyCatalog(UpdateSecurityClassifyCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityClassifyCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新安全识别结果的生效状态。</p>
     * 
     * @param tmpReq UpdateSecurityIdentifyResultStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityIdentifyResultStatusResponse
     */
    public UpdateSecurityIdentifyResultStatusResponse updateSecurityIdentifyResultStatusWithOptions(UpdateSecurityIdentifyResultStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecurityIdentifyResultStatusShrinkRequest request = new UpdateSecurityIdentifyResultStatusShrinkRequest();
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
            new TeaPair("action", "UpdateSecurityIdentifyResultStatus"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityIdentifyResultStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新安全识别结果的生效状态。</p>
     * 
     * @param request UpdateSecurityIdentifyResultStatusRequest
     * @return UpdateSecurityIdentifyResultStatusResponse
     */
    public UpdateSecurityIdentifyResultStatusResponse updateSecurityIdentifyResultStatus(UpdateSecurityIdentifyResultStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityIdentifyResultStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过分级顺序更新数据分级。</p>
     * 
     * @param tmpReq UpdateSecurityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityLevelResponse
     */
    public UpdateSecurityLevelResponse updateSecurityLevelWithOptions(UpdateSecurityLevelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecurityLevelShrinkRequest request = new UpdateSecurityLevelShrinkRequest();
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
            new TeaPair("action", "UpdateSecurityLevel"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过分级顺序更新数据分级。</p>
     * 
     * @param request UpdateSecurityLevelRequest
     * @return UpdateSecurityLevelResponse
     */
    public UpdateSecurityLevelResponse updateSecurityLevel(UpdateSecurityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准。</p>
     * 
     * @param tmpReq UpdateStandardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardResponse
     */
    public UpdateStandardResponse updateStandardWithOptions(UpdateStandardRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardShrinkRequest request = new UpdateStandardShrinkRequest();
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
            new TeaPair("action", "UpdateStandard"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准。</p>
     * 
     * @param request UpdateStandardRequest
     * @return UpdateStandardResponse
     */
    public UpdateStandardResponse updateStandard(UpdateStandardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准码表。</p>
     * 
     * @param tmpReq UpdateStandardLookupTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardLookupTableResponse
     */
    public UpdateStandardLookupTableResponse updateStandardLookupTableWithOptions(UpdateStandardLookupTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardLookupTableShrinkRequest request = new UpdateStandardLookupTableShrinkRequest();
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
            new TeaPair("action", "UpdateStandardLookupTable"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardLookupTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准码表。</p>
     * 
     * @param request UpdateStandardLookupTableRequest
     * @return UpdateStandardLookupTableResponse
     */
    public UpdateStandardLookupTableResponse updateStandardLookupTable(UpdateStandardLookupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardLookupTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将标准映射关系置为无效映射。</p>
     * 
     * @param tmpReq UpdateStandardMappingToInvalidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardMappingToInvalidResponse
     */
    public UpdateStandardMappingToInvalidResponse updateStandardMappingToInvalidWithOptions(UpdateStandardMappingToInvalidRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardMappingToInvalidShrinkRequest request = new UpdateStandardMappingToInvalidShrinkRequest();
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
            new TeaPair("action", "UpdateStandardMappingToInvalid"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardMappingToInvalidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将标准映射关系置为无效映射。</p>
     * 
     * @param request UpdateStandardMappingToInvalidRequest
     * @return UpdateStandardMappingToInvalidResponse
     */
    public UpdateStandardMappingToInvalidResponse updateStandardMappingToInvalid(UpdateStandardMappingToInvalidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardMappingToInvalidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准集。</p>
     * 
     * @param tmpReq UpdateStandardSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardSetResponse
     */
    public UpdateStandardSetResponse updateStandardSetWithOptions(UpdateStandardSetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardSetShrinkRequest request = new UpdateStandardSetShrinkRequest();
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
            new TeaPair("action", "UpdateStandardSet"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新标准集。</p>
     * 
     * @param request UpdateStandardSetRequest
     * @return UpdateStandardSetResponse
     */
    public UpdateStandardSetResponse updateStandardSet(UpdateStandardSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准模板。</p>
     * 
     * @param tmpReq UpdateStandardTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardTemplateResponse
     */
    public UpdateStandardTemplateResponse updateStandardTemplateWithOptions(UpdateStandardTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardTemplateShrinkRequest request = new UpdateStandardTemplateShrinkRequest();
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
            new TeaPair("action", "UpdateStandardTemplate"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准模板。</p>
     * 
     * @param request UpdateStandardTemplateRequest
     * @return UpdateStandardTemplateResponse
     */
    public UpdateStandardTemplateResponse updateStandardTemplate(UpdateStandardTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准词根。</p>
     * 
     * @param tmpReq UpdateStandardWordRootRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardWordRootResponse
     */
    public UpdateStandardWordRootResponse updateStandardWordRootWithOptions(UpdateStandardWordRootRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStandardWordRootShrinkRequest request = new UpdateStandardWordRootShrinkRequest();
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
            new TeaPair("action", "UpdateStandardWordRoot"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardWordRootResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据标准词根。</p>
     * 
     * @param request UpdateStandardWordRootRequest
     * @return UpdateStandardWordRootResponse
     */
    public UpdateStandardWordRootResponse updateStandardWordRoot(UpdateStandardWordRootRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardWordRootWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改租户计算设置。</p>
     * 
     * @param tmpReq UpdateTenantComputeEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTenantComputeEngineResponse
     */
    public UpdateTenantComputeEngineResponse updateTenantComputeEngineWithOptions(UpdateTenantComputeEngineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTenantComputeEngineShrinkRequest request = new UpdateTenantComputeEngineShrinkRequest();
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
            new TeaPair("action", "UpdateTenantComputeEngine"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTenantComputeEngineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改租户计算设置。</p>
     * 
     * @param request UpdateTenantComputeEngineRequest
     * @return UpdateTenantComputeEngineResponse
     */
    public UpdateTenantComputeEngineResponse updateTenantComputeEngine(UpdateTenantComputeEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTenantComputeEngineWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTenantMemberResponse());
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
     * <p>编辑自定义函数。</p>
     * 
     * @param tmpReq UpdateUdfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUdfResponse
     */
    public UpdateUdfResponse updateUdfWithOptions(UpdateUdfRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUdfShrinkRequest request = new UpdateUdfShrinkRequest();
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
            new TeaPair("action", "UpdateUdf"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUdfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑自定义函数。</p>
     * 
     * @param request UpdateUdfRequest
     * @return UpdateUdfResponse
     */
    public UpdateUdfResponse updateUdf(UpdateUdfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupSwitchResponse());
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

    /**
     * <b>summary</b> : 
     * <p>新建或者修改质量规则。</p>
     * 
     * @param tmpReq UpsertQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertQualityRuleResponse
     */
    public UpsertQualityRuleResponse upsertQualityRuleWithOptions(UpsertQualityRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertQualityRuleShrinkRequest request = new UpsertQualityRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upsertCommand)) {
            request.upsertCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upsertCommand, "UpsertCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upsertCommandShrink)) {
            body.put("UpsertCommand", request.upsertCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertQualityRule"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertQualityRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改质量规则。</p>
     * 
     * @param request UpsertQualityRuleRequest
     * @return UpsertQualityRuleResponse
     */
    public UpsertQualityRuleResponse upsertQualityRule(UpsertQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改调度设置。</p>
     * 
     * @param tmpReq UpsertQualityScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertQualityScheduleResponse
     */
    public UpsertQualityScheduleResponse upsertQualityScheduleWithOptions(UpsertQualityScheduleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertQualityScheduleShrinkRequest request = new UpsertQualityScheduleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upsertCommand)) {
            request.upsertCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upsertCommand, "UpsertCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upsertCommandShrink)) {
            body.put("UpsertCommand", request.upsertCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertQualitySchedule"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertQualityScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改调度设置。</p>
     * 
     * @param request UpsertQualityScheduleRequest
     * @return UpsertQualityScheduleResponse
     */
    public UpsertQualityScheduleResponse upsertQualitySchedule(UpsertQualityScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertQualityScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改质量模板。</p>
     * 
     * @param tmpReq UpsertQualityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertQualityTemplateResponse
     */
    public UpsertQualityTemplateResponse upsertQualityTemplateWithOptions(UpsertQualityTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertQualityTemplateShrinkRequest request = new UpsertQualityTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upsertCommand)) {
            request.upsertCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upsertCommand, "UpsertCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upsertCommandShrink)) {
            body.put("UpsertCommand", request.upsertCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertQualityTemplate"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertQualityTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改质量模板。</p>
     * 
     * @param request UpsertQualityTemplateRequest
     * @return UpsertQualityTemplateResponse
     */
    public UpsertQualityTemplateResponse upsertQualityTemplate(UpsertQualityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertQualityTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建或更改质量监控对象, 支持添加多种类型的质量监控对象，包括：Dataphin表，全域表，数据源，指标，实时元表。</p>
     * 
     * @param tmpReq UpsertQualityWatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertQualityWatchResponse
     */
    public UpsertQualityWatchResponse upsertQualityWatchWithOptions(UpsertQualityWatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertQualityWatchShrinkRequest request = new UpsertQualityWatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upsertCommand)) {
            request.upsertCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upsertCommand, "UpsertCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upsertCommandShrink)) {
            body.put("UpsertCommand", request.upsertCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertQualityWatch"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertQualityWatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建或更改质量监控对象, 支持添加多种类型的质量监控对象，包括：Dataphin表，全域表，数据源，指标，实时元表。</p>
     * 
     * @param request UpsertQualityWatchRequest
     * @return UpsertQualityWatchResponse
     */
    public UpsertQualityWatchResponse upsertQualityWatch(UpsertQualityWatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertQualityWatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改监控对象告警设置。</p>
     * 
     * @param tmpReq UpsertQualityWatchAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertQualityWatchAlertResponse
     */
    public UpsertQualityWatchAlertResponse upsertQualityWatchAlertWithOptions(UpsertQualityWatchAlertRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertQualityWatchAlertShrinkRequest request = new UpsertQualityWatchAlertShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upsertCommand)) {
            request.upsertCommandShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upsertCommand, "UpsertCommand", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opTenantId)) {
            query.put("OpTenantId", request.opTenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upsertCommandShrink)) {
            body.put("UpsertCommand", request.upsertCommandShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertQualityWatchAlert"),
            new TeaPair("version", "2023-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertQualityWatchAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建或者修改监控对象告警设置。</p>
     * 
     * @param request UpsertQualityWatchAlertRequest
     * @return UpsertQualityWatchAlertResponse
     */
    public UpsertQualityWatchAlertResponse upsertQualityWatchAlert(UpsertQualityWatchAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertQualityWatchAlertWithOptions(request, runtime);
    }
}
