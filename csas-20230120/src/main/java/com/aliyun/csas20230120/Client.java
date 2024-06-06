// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120;

import com.aliyun.tea.*;
import com.aliyun.csas20230120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("csas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 挂载connector的应用
     *
     * @param tmpReq AttachApplication2ConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachApplication2ConnectorResponse
     */
    public AttachApplication2ConnectorResponse attachApplication2ConnectorWithOptions(AttachApplication2ConnectorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachApplication2ConnectorShrinkRequest request = new AttachApplication2ConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationIds)) {
            request.applicationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationIds, "ApplicationIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdsShrink)) {
            body.put("ApplicationIds", request.applicationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachApplication2Connector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachApplication2ConnectorResponse());
    }

    /**
     * @summary 挂载connector的应用
     *
     * @param request AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    public AttachApplication2ConnectorResponse attachApplication2Connector(AttachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * @summary 创建自定义身份源用户
     *
     * @param request CreateClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientUserResponse
     */
    public CreateClientUserResponse createClientUserWithOptions(CreateClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientUserResponse());
    }

    /**
     * @summary 创建自定义身份源用户
     *
     * @param request CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    public CreateClientUserResponse createClientUser(CreateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientUserWithOptions(request, runtime);
    }

    /**
     * @summary 创建动态路由
     *
     * @param request CreateDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDynamicRouteResponse
     */
    public CreateDynamicRouteResponse createDynamicRouteWithOptions(CreateDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteType)) {
            body.put("DynamicRouteType", request.dynamicRouteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            body.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIds)) {
            bodyFlat.put("RegionIds", request.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDynamicRouteResponse());
    }

    /**
     * @summary 创建动态路由
     *
     * @param request CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    public CreateDynamicRouteResponse createDynamicRoute(CreateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 创建自定义身份源部门
     *
     * @param request CreateIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdpDepartmentResponse
     */
    public CreateIdpDepartmentResponse createIdpDepartmentWithOptions(CreateIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdpDepartmentResponse());
    }

    /**
     * @summary 创建自定义身份源部门
     *
     * @param request CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    public CreateIdpDepartmentResponse createIdpDepartment(CreateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * @summary 创建内网访问应用
     *
     * @param request CreatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplicationWithOptions(CreatePrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            bodyFlat.put("Addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            bodyFlat.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessApplicationResponse());
    }

    /**
     * @summary 创建内网访问应用
     *
     * @param request CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 创建内网访问策略
     *
     * @param request CreatePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessPolicyResponse
     */
    public CreatePrivateAccessPolicyResponse createPrivateAccessPolicyWithOptions(CreatePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserAttributes)) {
            bodyFlat.put("CustomUserAttributes", request.customUserAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeId)) {
            body.put("DeviceAttributeId", request.deviceAttributeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyAction)) {
            body.put("PolicyAction", request.policyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupMode)) {
            body.put("UserGroupMode", request.userGroupMode);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessPolicyResponse());
    }

    /**
     * @summary 创建内网访问策略
     *
     * @param request CreatePrivateAccessPolicyRequest
     * @return CreatePrivateAccessPolicyResponse
     */
    public CreatePrivateAccessPolicyResponse createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 创建内网访问标签
     *
     * @param request CreatePrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessTagResponse
     */
    public CreatePrivateAccessTagResponse createPrivateAccessTagWithOptions(CreatePrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateAccessTagResponse());
    }

    /**
     * @summary 创建内网访问标签
     *
     * @param request CreatePrivateAccessTagRequest
     * @return CreatePrivateAccessTagResponse
     */
    public CreatePrivateAccessTagResponse createPrivateAccessTag(CreatePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * @summary 创建设备注册策略
     *
     * @param tmpReq CreateRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRegistrationPolicyResponse
     */
    public CreateRegistrationPolicyResponse createRegistrationPolicyWithOptions(CreateRegistrationPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRegistrationPolicyShrinkRequest request = new CreateRegistrationPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyLimitCount)) {
            request.companyLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyLimitCount, "CompanyLimitCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personalLimitCount)) {
            request.personalLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personalLimitCount, "PersonalLimitCount", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitCountShrink)) {
            body.put("CompanyLimitCount", request.companyLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitType)) {
            body.put("CompanyLimitType", request.companyLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitCountShrink)) {
            body.put("PersonalLimitCount", request.personalLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitType)) {
            body.put("PersonalLimitType", request.personalLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRegistrationPolicyResponse());
    }

    /**
     * @summary 创建设备注册策略
     *
     * @param request CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    public CreateRegistrationPolicyResponse createRegistrationPolicy(CreateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 创建用户组
     *
     * @param request CreateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            bodyFlat.put("Attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2023-01-20"),
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
     * @summary 创建用户组
     *
     * @param request CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary 删除自定义身份源指定用户
     *
     * @param request DeleteClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientUserResponse
     */
    public DeleteClientUserResponse deleteClientUserWithOptions(DeleteClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientUserResponse());
    }

    /**
     * @summary 删除自定义身份源指定用户
     *
     * @param request DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    public DeleteClientUserResponse deleteClientUser(DeleteClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientUserWithOptions(request, runtime);
    }

    /**
     * @summary 删除动态路由
     *
     * @param request DeleteDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDynamicRouteResponse
     */
    public DeleteDynamicRouteResponse deleteDynamicRouteWithOptions(DeleteDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteId)) {
            query.put("DynamicRouteId", request.dynamicRouteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDynamicRouteResponse());
    }

    /**
     * @summary 删除动态路由
     *
     * @param request DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    public DeleteDynamicRouteResponse deleteDynamicRoute(DeleteDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 删除指定自定义身份源部门
     *
     * @param request DeleteIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdpDepartmentResponse
     */
    public DeleteIdpDepartmentResponse deleteIdpDepartmentWithOptions(DeleteIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdpDepartmentResponse());
    }

    /**
     * @summary 删除指定自定义身份源部门
     *
     * @param request DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    public DeleteIdpDepartmentResponse deleteIdpDepartment(DeleteIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * @summary 删除内网访问应用
     *
     * @param request DeletePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessApplicationResponse
     */
    public DeletePrivateAccessApplicationResponse deletePrivateAccessApplicationWithOptions(DeletePrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessApplicationResponse());
    }

    /**
     * @summary 删除内网访问应用
     *
     * @param request DeletePrivateAccessApplicationRequest
     * @return DeletePrivateAccessApplicationResponse
     */
    public DeletePrivateAccessApplicationResponse deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 删除内网访问策略
     *
     * @param request DeletePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessPolicyResponse
     */
    public DeletePrivateAccessPolicyResponse deletePrivateAccessPolicyWithOptions(DeletePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessPolicyResponse());
    }

    /**
     * @summary 删除内网访问策略
     *
     * @param request DeletePrivateAccessPolicyRequest
     * @return DeletePrivateAccessPolicyResponse
     */
    public DeletePrivateAccessPolicyResponse deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 删除内网访问标签
     *
     * @param request DeletePrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateAccessTagResponse
     */
    public DeletePrivateAccessTagResponse deletePrivateAccessTagWithOptions(DeletePrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            body.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateAccessTagResponse());
    }

    /**
     * @summary 删除内网访问标签
     *
     * @param request DeletePrivateAccessTagRequest
     * @return DeletePrivateAccessTagResponse
     */
    public DeletePrivateAccessTagResponse deletePrivateAccessTag(DeletePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * @summary 删除设备注册策略
     *
     * @param request DeleteRegistrationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRegistrationPoliciesResponse
     */
    public DeleteRegistrationPoliciesResponse deleteRegistrationPoliciesWithOptions(DeleteRegistrationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            bodyFlat.put("PolicyIds", request.policyIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRegistrationPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRegistrationPoliciesResponse());
    }

    /**
     * @summary 删除设备注册策略
     *
     * @param request DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    public DeleteRegistrationPoliciesResponse deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary 删除用户组
     *
     * @param request DeleteUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2023-01-20"),
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
     * @summary 删除用户组
     *
     * @param request DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary 卸载connector的应用
     *
     * @param tmpReq DetachApplication2ConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachApplication2ConnectorResponse
     */
    public DetachApplication2ConnectorResponse detachApplication2ConnectorWithOptions(DetachApplication2ConnectorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachApplication2ConnectorShrinkRequest request = new DetachApplication2ConnectorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationIds)) {
            request.applicationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationIds, "ApplicationIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdsShrink)) {
            body.put("ApplicationIds", request.applicationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            body.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachApplication2Connector"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachApplication2ConnectorResponse());
    }

    /**
     * @summary 卸载connector的应用
     *
     * @param request DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    public DetachApplication2ConnectorResponse detachApplication2Connector(DetachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * @summary 查询已启用的身份源配置
     *
     * @param request GetActiveIdpConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActiveIdpConfigResponse
     */
    public GetActiveIdpConfigResponse getActiveIdpConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActiveIdpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActiveIdpConfigResponse());
    }

    /**
     * @summary 查询已启用的身份源配置
     *
     * @return GetActiveIdpConfigResponse
     */
    public GetActiveIdpConfigResponse getActiveIdpConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActiveIdpConfigWithOptions(runtime);
    }

    /**
     * @summary 查询自定义身份源指定用户
     *
     * @param request GetClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientUserResponse
     */
    public GetClientUserResponse getClientUserWithOptions(GetClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientUserResponse());
    }

    /**
     * @summary 查询自定义身份源指定用户
     *
     * @param request GetClientUserRequest
     * @return GetClientUserResponse
     */
    public GetClientUserResponse getClientUser(GetClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientUserWithOptions(request, runtime);
    }

    /**
     * @summary 查询动态路由详情
     *
     * @param request GetDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDynamicRouteResponse
     */
    public GetDynamicRouteResponse getDynamicRouteWithOptions(GetDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDynamicRouteResponse());
    }

    /**
     * @summary 查询动态路由详情
     *
     * @param request GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    public GetDynamicRouteResponse getDynamicRoute(GetDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 查询身份源配置详情
     *
     * @param request GetIdpConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdpConfigResponse
     */
    public GetIdpConfigResponse getIdpConfigWithOptions(GetIdpConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdpConfigResponse());
    }

    /**
     * @summary 查询身份源配置详情
     *
     * @param request GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    public GetIdpConfigResponse getIdpConfig(GetIdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdpConfigWithOptions(request, runtime);
    }

    /**
     * @summary 查询内网访问应用详情
     *
     * @param request GetPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrivateAccessApplicationResponse
     */
    public GetPrivateAccessApplicationResponse getPrivateAccessApplicationWithOptions(GetPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateAccessApplicationResponse());
    }

    /**
     * @summary 查询内网访问应用详情
     *
     * @param request GetPrivateAccessApplicationRequest
     * @return GetPrivateAccessApplicationResponse
     */
    public GetPrivateAccessApplicationResponse getPrivateAccessApplication(GetPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 查询内网访问策略详情
     *
     * @param request GetPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPrivateAccessPolicyResponse
     */
    public GetPrivateAccessPolicyResponse getPrivateAccessPolicyWithOptions(GetPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPrivateAccessPolicyResponse());
    }

    /**
     * @summary 查询内网访问策略详情
     *
     * @param request GetPrivateAccessPolicyRequest
     * @return GetPrivateAccessPolicyResponse
     */
    public GetPrivateAccessPolicyResponse getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 查询设备注册策略详情
     *
     * @param request GetRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegistrationPolicyResponse
     */
    public GetRegistrationPolicyResponse getRegistrationPolicyWithOptions(GetRegistrationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegistrationPolicyResponse());
    }

    /**
     * @summary 查询设备注册策略详情
     *
     * @param request GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    public GetRegistrationPolicyResponse getRegistrationPolicy(GetRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 查询用户设备详情
     *
     * @param request GetUserDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDeviceResponse
     */
    public GetUserDeviceResponse getUserDeviceWithOptions(GetUserDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDevice"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDeviceResponse());
    }

    /**
     * @summary 查询用户设备详情
     *
     * @param request GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    public GetUserDeviceResponse getUserDevice(GetUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeviceWithOptions(request, runtime);
    }

    /**
     * @summary 查询用户组详情
     *
     * @param request GetUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroupWithOptions(GetUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupResponse());
    }

    /**
     * @summary 查询用户组详情
     *
     * @param request GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    public GetUserGroupResponse getUserGroup(GetUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问策略的应用
     *
     * @param request ListApplicationsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    public ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicyWithOptions(ListApplicationsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForPrivateAccessPolicyResponse());
    }

    /**
     * @summary 批量查询内网访问策略的应用
     *
     * @param request ListApplicationsForPrivateAccessPolicyRequest
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    public ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问标签的应用
     *
     * @param request ListApplicationsForPrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    public ListApplicationsForPrivateAccessTagResponse listApplicationsForPrivateAccessTagWithOptions(ListApplicationsForPrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForPrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForPrivateAccessTagResponse());
    }

    /**
     * @summary 批量查询内网访问标签的应用
     *
     * @param request ListApplicationsForPrivateAccessTagRequest
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    public ListApplicationsForPrivateAccessTagResponse listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * @summary 查询自定义身份源用户
     *
     * @param request ListClientUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientUsersResponse
     */
    public ListClientUsersResponse listClientUsersWithOptions(ListClientUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientUsers"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientUsersResponse());
    }

    /**
     * @summary 查询自定义身份源用户
     *
     * @param request ListClientUsersRequest
     * @return ListClientUsersResponse
     */
    public ListClientUsersResponse listClientUsers(ListClientUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientUsersWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询connector
     *
     * @param request ListConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectorsWithOptions(ListConnectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectors"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectorsResponse());
    }

    /**
     * @summary 批量查询connector
     *
     * @param request ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectors(ListConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectorsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询动态路由的地域
     *
     * @param request ListDynamicRouteRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicRouteRegionsResponse
     */
    public ListDynamicRouteRegionsResponse listDynamicRouteRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicRouteRegions"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicRouteRegionsResponse());
    }

    /**
     * @summary 批量查询动态路由的地域
     *
     * @return ListDynamicRouteRegionsResponse
     */
    public ListDynamicRouteRegionsResponse listDynamicRouteRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRouteRegionsWithOptions(runtime);
    }

    /**
     * @summary 批量查询动态路由
     *
     * @param request ListDynamicRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicRoutesResponse
     */
    public ListDynamicRoutesResponse listDynamicRoutesWithOptions(ListDynamicRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicRoutes"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicRoutesResponse());
    }

    /**
     * @summary 批量查询动态路由
     *
     * @param request ListDynamicRoutesRequest
     * @return ListDynamicRoutesResponse
     */
    public ListDynamicRoutesResponse listDynamicRoutes(ListDynamicRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRoutesWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询超额注册申请列表
     *
     * @param request ListExcessiveDeviceRegistrationApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    public ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplicationsWithOptions(ListExcessiveDeviceRegistrationApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExcessiveDeviceRegistrationApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExcessiveDeviceRegistrationApplicationsResponse());
    }

    /**
     * @summary 批量查询超额注册申请列表
     *
     * @param request ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    public ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExcessiveDeviceRegistrationApplicationsWithOptions(request, runtime);
    }

    /**
     * @summary 查询IDP配置
     *
     * @param request ListIdpConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdpConfigsResponse
     */
    public ListIdpConfigsResponse listIdpConfigsWithOptions(ListIdpConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdpConfigs"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdpConfigsResponse());
    }

    /**
     * @summary 查询IDP配置
     *
     * @param request ListIdpConfigsRequest
     * @return ListIdpConfigsResponse
     */
    public ListIdpConfigsResponse listIdpConfigs(ListIdpConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpConfigsWithOptions(request, runtime);
    }

    /**
     * @summary 查询自定义身份源部门
     *
     * @param request ListIdpDepartmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdpDepartmentsResponse
     */
    public ListIdpDepartmentsResponse listIdpDepartmentsWithOptions(ListIdpDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdpDepartments"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdpDepartmentsResponse());
    }

    /**
     * @summary 查询自定义身份源部门
     *
     * @param request ListIdpDepartmentsRequest
     * @return ListIdpDepartmentsResponse
     */
    public ListIdpDepartmentsResponse listIdpDepartments(ListIdpDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpDepartmentsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问应用的策略
     *
     * @param request ListPolicesForPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    public ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplicationWithOptions(ListPolicesForPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForPrivateAccessApplicationResponse());
    }

    /**
     * @summary 批量查询内网访问应用的策略
     *
     * @param request ListPolicesForPrivateAccessApplicationRequest
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    public ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问标签的策略
     *
     * @param request ListPolicesForPrivateAccessTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForPrivateAccessTagResponse
     */
    public ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTagWithOptions(ListPolicesForPrivateAccessTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForPrivateAccessTag"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForPrivateAccessTagResponse());
    }

    /**
     * @summary 批量查询内网访问标签的策略
     *
     * @param request ListPolicesForPrivateAccessTagRequest
     * @return ListPolicesForPrivateAccessTagResponse
     */
    public ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询用户组的策略
     *
     * @param request ListPolicesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicesForUserGroupResponse
     */
    public ListPolicesForUserGroupResponse listPolicesForUserGroupWithOptions(ListPolicesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicesForUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicesForUserGroupResponse());
    }

    /**
     * @summary 批量查询用户组的策略
     *
     * @param request ListPolicesForUserGroupRequest
     * @return ListPolicesForUserGroupResponse
     */
    public ListPolicesForUserGroupResponse listPolicesForUserGroup(ListPolicesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary pop节点流量统计
     *
     * @param request ListPopTrafficStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPopTrafficStatisticsResponse
     */
    public ListPopTrafficStatisticsResponse listPopTrafficStatisticsWithOptions(ListPopTrafficStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPopTrafficStatistics"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPopTrafficStatisticsResponse());
    }

    /**
     * @summary pop节点流量统计
     *
     * @param request ListPopTrafficStatisticsRequest
     * @return ListPopTrafficStatisticsResponse
     */
    public ListPopTrafficStatisticsResponse listPopTrafficStatistics(ListPopTrafficStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPopTrafficStatisticsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问应用
     *
     * @param request ListPrivateAccessApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessApplicationsResponse
     */
    public ListPrivateAccessApplicationsResponse listPrivateAccessApplicationsWithOptions(ListPrivateAccessApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessApplicationsResponse());
    }

    /**
     * @summary 批量查询内网访问应用
     *
     * @param request ListPrivateAccessApplicationsRequest
     * @return ListPrivateAccessApplicationsResponse
     */
    public ListPrivateAccessApplicationsResponse listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询动态路由的内网访问应用
     *
     * @param request ListPrivateAccessApplicationsForDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    public ListPrivateAccessApplicationsForDynamicRouteResponse listPrivateAccessApplicationsForDynamicRouteWithOptions(ListPrivateAccessApplicationsForDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessApplicationsForDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessApplicationsForDynamicRouteResponse());
    }

    /**
     * @summary 批量查询动态路由的内网访问应用
     *
     * @param request ListPrivateAccessApplicationsForDynamicRouteRequest
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    public ListPrivateAccessApplicationsForDynamicRouteResponse listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问策略
     *
     * @param request ListPrivateAccessPolicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessPolicesResponse
     */
    public ListPrivateAccessPolicesResponse listPrivateAccessPolicesWithOptions(ListPrivateAccessPolicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessPolices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessPolicesResponse());
    }

    /**
     * @summary 批量查询内网访问策略
     *
     * @param request ListPrivateAccessPolicesRequest
     * @return ListPrivateAccessPolicesResponse
     */
    public ListPrivateAccessPolicesResponse listPrivateAccessPolices(ListPrivateAccessPolicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessPolicesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about all internal access tags within the current Alibaba Cloud account.
     *
     * @param request ListPrivateAccessTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessTagsResponse
     */
    public ListPrivateAccessTagsResponse listPrivateAccessTagsWithOptions(ListPrivateAccessTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessTags"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessTagsResponse());
    }

    /**
     * @summary Queries the information about all internal access tags within the current Alibaba Cloud account.
     *
     * @param request ListPrivateAccessTagsRequest
     * @return ListPrivateAccessTagsResponse
     */
    public ListPrivateAccessTagsResponse listPrivateAccessTags(ListPrivateAccessTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询动态路由的内网访问标签
     *
     * @param request ListPrivateAccessTagsForDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    public ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRouteWithOptions(ListPrivateAccessTagsForDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateAccessTagsForDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateAccessTagsForDynamicRouteResponse());
    }

    /**
     * @summary 批量查询动态路由的内网访问标签
     *
     * @param request ListPrivateAccessTagsForDynamicRouteRequest
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    public ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 查询用户设备注册策略列表
     *
     * @param request ListRegistrationPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistrationPoliciesResponse
     */
    public ListRegistrationPoliciesResponse listRegistrationPoliciesWithOptions(ListRegistrationPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistrationPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistrationPoliciesResponse());
    }

    /**
     * @summary 查询用户设备注册策略列表
     *
     * @param request ListRegistrationPoliciesRequest
     * @return ListRegistrationPoliciesResponse
     */
    public ListRegistrationPoliciesResponse listRegistrationPolicies(ListRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary 查询用户组相关的设备注册策略
     *
     * @param request ListRegistrationPoliciesForUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    public ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroupWithOptions(ListRegistrationPoliciesForUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegistrationPoliciesForUserGroup"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegistrationPoliciesForUserGroupResponse());
    }

    /**
     * @summary 查询用户组相关的设备注册策略
     *
     * @param request ListRegistrationPoliciesForUserGroupRequest
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    public ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesForUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询终端安装软件列表
     *
     * @param request ListSoftwareForUserDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSoftwareForUserDeviceResponse
     */
    public ListSoftwareForUserDeviceResponse listSoftwareForUserDeviceWithOptions(ListSoftwareForUserDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSoftwareForUserDevice"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSoftwareForUserDeviceResponse());
    }

    /**
     * @summary 批量查询终端安装软件列表
     *
     * @param request ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    public ListSoftwareForUserDeviceResponse listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSoftwareForUserDeviceWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问应用的标签
     *
     * @param request ListTagsForPrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    public ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplicationWithOptions(ListTagsForPrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagsForPrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsForPrivateAccessApplicationResponse());
    }

    /**
     * @summary 批量查询内网访问应用的标签
     *
     * @param request ListTagsForPrivateAccessApplicationRequest
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    public ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问策略的标签
     *
     * @param request ListTagsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    public ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicyWithOptions(ListTagsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsForPrivateAccessPolicyResponse());
    }

    /**
     * @summary 批量查询内网访问策略的标签
     *
     * @param request ListTagsForPrivateAccessPolicyRequest
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    public ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询用户设备列表
     *
     * @param request ListUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDevicesResponse
     */
    public ListUserDevicesResponse listUserDevicesWithOptions(ListUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDevicesResponse());
    }

    /**
     * @summary 批量查询用户设备列表
     *
     * @param request ListUserDevicesRequest
     * @return ListUserDevicesResponse
     */
    public ListUserDevicesResponse listUserDevices(ListUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDevicesWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询用户组
     *
     * @param request ListUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroups"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
    }

    /**
     * @summary 批量查询用户组
     *
     * @param request ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    /**
     * @summary 批量查询内网访问策略的用户组
     *
     * @param request ListUserGroupsForPrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    public ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicyWithOptions(ListUserGroupsForPrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsForPrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsForPrivateAccessPolicyResponse());
    }

    /**
     * @summary 批量查询内网访问策略的用户组
     *
     * @param request ListUserGroupsForPrivateAccessPolicyRequest
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    public ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 查询设备注册策略相关用户组
     *
     * @param request ListUserGroupsForRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    public ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicyWithOptions(ListUserGroupsForRegistrationPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsForRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsForRegistrationPolicyResponse());
    }

    /**
     * @summary 查询设备注册策略相关用户组
     *
     * @param request ListUserGroupsForRegistrationPolicyRequest
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    public ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询登陆用户
     *
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * @summary 列表查询登陆用户
     *
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @summary 吊销用户登录会话
     *
     * @param request RevokeUserSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeUserSessionResponse
     */
    public RevokeUserSessionResponse revokeUserSessionWithOptions(RevokeUserSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalIds)) {
            query.put("ExternalIds", request.externalIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpId)) {
            query.put("IdpId", request.idpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeUserSession"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeUserSessionResponse());
    }

    /**
     * @summary 吊销用户登录会话
     *
     * @param request RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    public RevokeUserSessionResponse revokeUserSession(RevokeUserSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeUserSessionWithOptions(request, runtime);
    }

    /**
     * @summary 修改自定义身份源指定用户
     *
     * @param request UpdateClientUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserResponse
     */
    public UpdateClientUserResponse updateClientUserWithOptions(UpdateClientUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUser"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserResponse());
    }

    /**
     * @summary 修改自定义身份源指定用户
     *
     * @param request UpdateClientUserRequest
     * @return UpdateClientUserResponse
     */
    public UpdateClientUserResponse updateClientUser(UpdateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserWithOptions(request, runtime);
    }

    /**
     * @summary 修改自定义身份源指定用户密码
     *
     * @param request UpdateClientUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserPasswordResponse
     */
    public UpdateClientUserPasswordResponse updateClientUserPasswordWithOptions(UpdateClientUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUserPassword"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserPasswordResponse());
    }

    /**
     * @summary 修改自定义身份源指定用户密码
     *
     * @param request UpdateClientUserPasswordRequest
     * @return UpdateClientUserPasswordResponse
     */
    public UpdateClientUserPasswordResponse updateClientUserPassword(UpdateClientUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserPasswordWithOptions(request, runtime);
    }

    /**
     * @summary 修改自定义身份源指定用户启用状态
     *
     * @param request UpdateClientUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientUserStatusResponse
     */
    public UpdateClientUserStatusResponse updateClientUserStatusWithOptions(UpdateClientUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientUserStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientUserStatusResponse());
    }

    /**
     * @summary 修改自定义身份源指定用户启用状态
     *
     * @param request UpdateClientUserStatusRequest
     * @return UpdateClientUserStatusResponse
     */
    public UpdateClientUserStatusResponse updateClientUserStatus(UpdateClientUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserStatusWithOptions(request, runtime);
    }

    /**
     * @summary 修改动态路由
     *
     * @param request UpdateDynamicRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDynamicRouteResponse
     */
    public UpdateDynamicRouteResponse updateDynamicRouteWithOptions(UpdateDynamicRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteId)) {
            body.put("DynamicRouteId", request.dynamicRouteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicRouteType)) {
            body.put("DynamicRouteType", request.dynamicRouteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            body.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIds)) {
            bodyFlat.put("RegionIds", request.regionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDynamicRoute"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDynamicRouteResponse());
    }

    /**
     * @summary 修改动态路由
     *
     * @param request UpdateDynamicRouteRequest
     * @return UpdateDynamicRouteResponse
     */
    public UpdateDynamicRouteResponse updateDynamicRoute(UpdateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDynamicRouteWithOptions(request, runtime);
    }

    /**
     * @summary 批量更新超额注册申请状态
     *
     * @param request UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatusWithOptions(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExcessiveDeviceRegistrationApplicationsStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExcessiveDeviceRegistrationApplicationsStatusResponse());
    }

    /**
     * @summary 批量更新超额注册申请状态
     *
     * @param request UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExcessiveDeviceRegistrationApplicationsStatusWithOptions(request, runtime);
    }

    /**
     * @summary 修改指定自定义身份源部门
     *
     * @param request UpdateIdpDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdpDepartmentResponse
     */
    public UpdateIdpDepartmentResponse updateIdpDepartmentWithOptions(UpdateIdpDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpConfigId)) {
            query.put("IdpConfigId", request.idpConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdpDepartment"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdpDepartmentResponse());
    }

    /**
     * @summary 修改指定自定义身份源部门
     *
     * @param request UpdateIdpDepartmentRequest
     * @return UpdateIdpDepartmentResponse
     */
    public UpdateIdpDepartmentResponse updateIdpDepartment(UpdateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * @summary 修改内网访问应用
     *
     * @param request UpdatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplicationWithOptions(UpdatePrivateAccessApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            bodyFlat.put("Addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            bodyFlat.put("PortRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateAccessApplication"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateAccessApplicationResponse());
    }

    /**
     * @summary 修改内网访问应用
     *
     * @param request UpdatePrivateAccessApplicationRequest
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * @summary 修改内网访问策略
     *
     * @param request UpdatePrivateAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessPolicyResponse
     */
    public UpdatePrivateAccessPolicyResponse updatePrivateAccessPolicyWithOptions(UpdatePrivateAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            bodyFlat.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            body.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserAttributes)) {
            bodyFlat.put("CustomUserAttributes", request.customUserAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeId)) {
            body.put("DeviceAttributeId", request.deviceAttributeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyAction)) {
            body.put("PolicyAction", request.policyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            bodyFlat.put("TagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupMode)) {
            body.put("UserGroupMode", request.userGroupMode);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateAccessPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateAccessPolicyResponse());
    }

    /**
     * @summary 修改内网访问策略
     *
     * @param request UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    public UpdatePrivateAccessPolicyResponse updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 修改设备注册策略
     *
     * @param tmpReq UpdateRegistrationPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegistrationPolicyResponse
     */
    public UpdateRegistrationPolicyResponse updateRegistrationPolicyWithOptions(UpdateRegistrationPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRegistrationPolicyShrinkRequest request = new UpdateRegistrationPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.companyLimitCount)) {
            request.companyLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.companyLimitCount, "CompanyLimitCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personalLimitCount)) {
            request.personalLimitCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personalLimitCount, "PersonalLimitCount", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitCountShrink)) {
            body.put("CompanyLimitCount", request.companyLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyLimitType)) {
            body.put("CompanyLimitType", request.companyLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            body.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitCountShrink)) {
            body.put("PersonalLimitCount", request.personalLimitCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalLimitType)) {
            body.put("PersonalLimitType", request.personalLimitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            bodyFlat.put("Whitelist", request.whitelist);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegistrationPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegistrationPolicyResponse());
    }

    /**
     * @summary 修改设备注册策略
     *
     * @param request UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    public UpdateRegistrationPolicyResponse updateRegistrationPolicy(UpdateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * @summary 批量更新用户设备共享状态
     *
     * @param request UpdateUserDevicesSharingStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDevicesSharingStatusResponse
     */
    public UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatusWithOptions(UpdateUserDevicesSharingStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharingStatus)) {
            body.put("SharingStatus", request.sharingStatus);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDevicesSharingStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDevicesSharingStatusResponse());
    }

    /**
     * @summary 批量更新用户设备共享状态
     *
     * @param request UpdateUserDevicesSharingStatusRequest
     * @return UpdateUserDevicesSharingStatusResponse
     */
    public UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesSharingStatusWithOptions(request, runtime);
    }

    /**
     * @summary 批量更新用户设备状态
     *
     * @param request UpdateUserDevicesStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDevicesStatusResponse
     */
    public UpdateUserDevicesStatusResponse updateUserDevicesStatusWithOptions(UpdateUserDevicesStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceAction)) {
            body.put("DeviceAction", request.deviceAction);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDevicesStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDevicesStatusResponse());
    }

    /**
     * @summary 批量更新用户设备状态
     *
     * @param request UpdateUserDevicesStatusRequest
     * @return UpdateUserDevicesStatusResponse
     */
    public UpdateUserDevicesStatusResponse updateUserDevicesStatus(UpdateUserDevicesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesStatusWithOptions(request, runtime);
    }

    /**
     * @summary 修改用户组
     *
     * @param request UpdateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            bodyFlat.put("Attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroup"),
            new TeaPair("version", "2023-01-20"),
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
     * @summary 修改用户组
     *
     * @param request UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    /**
     * @summary 批量修改登陆用户状态
     *
     * @param request UpdateUsersStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUsersStatusResponse
     */
    public UpdateUsersStatusResponse updateUsersStatusWithOptions(UpdateUsersStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.saseUserIds)) {
            query.put("SaseUserIds", request.saseUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUsersStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUsersStatusResponse());
    }

    /**
     * @summary 批量修改登陆用户状态
     *
     * @param request UpdateUsersStatusRequest
     * @return UpdateUsersStatusResponse
     */
    public UpdateUsersStatusResponse updateUsersStatus(UpdateUsersStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUsersStatusWithOptions(request, runtime);
    }
}
