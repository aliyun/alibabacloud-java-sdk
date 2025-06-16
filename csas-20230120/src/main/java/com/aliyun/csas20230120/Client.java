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
     * <b>summary</b> : 
     * <p>挂载connector的应用</p>
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
     * <b>summary</b> : 
     * <p>挂载connector的应用</p>
     * 
     * @param request AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    public AttachApplication2ConnectorResponse attachApplication2Connector(AttachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>挂载业务策略至指定审批流程</p>
     * 
     * @param request AttachPolicy2ApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachPolicy2ApprovalProcessResponse
     */
    public AttachPolicy2ApprovalProcessResponse attachPolicy2ApprovalProcessWithOptions(AttachPolicy2ApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPolicy2ApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPolicy2ApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>挂载业务策略至指定审批流程</p>
     * 
     * @param request AttachPolicy2ApprovalProcessRequest
     * @return AttachPolicy2ApprovalProcessResponse
     */
    public AttachPolicy2ApprovalProcessResponse attachPolicy2ApprovalProcess(AttachPolicy2ApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachPolicy2ApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建审批流程</p>
     * 
     * @param tmpReq CreateApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApprovalProcessResponse
     */
    public CreateApprovalProcessResponse createApprovalProcessWithOptions(CreateApprovalProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApprovalProcessShrinkRequest request = new CreateApprovalProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchSchemas)) {
            request.matchSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchSchemas, "MatchSchemas", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchSchemasShrink)) {
            body.put("MatchSchemas", request.matchSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            body.put("ProcessName", request.processName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processNodes)) {
            bodyFlat.put("ProcessNodes", request.processNodes);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建审批流程</p>
     * 
     * @param request CreateApprovalProcessRequest
     * @return CreateApprovalProcessResponse
     */
    public CreateApprovalProcessResponse createApprovalProcess(CreateApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义身份源用户</p>
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
     * <b>summary</b> : 
     * <p>创建自定义身份源用户</p>
     * 
     * @param request CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    public CreateClientUserResponse createClientUser(CreateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建动态路由</p>
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
     * <b>summary</b> : 
     * <p>创建动态路由</p>
     * 
     * @param request CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    public CreateDynamicRouteResponse createDynamicRoute(CreateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建加速策略</p>
     * 
     * @param request CreateEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    public CreateEnterpriseAcceleratePolicyResponse createEnterpriseAcceleratePolicyWithOptions(CreateEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerationType)) {
            body.put("AccelerationType", request.accelerationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showInClient)) {
            body.put("ShowInClient", request.showInClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamHost)) {
            body.put("UpstreamHost", request.upstreamHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamPort)) {
            body.put("UpstreamPort", request.upstreamPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamType)) {
            body.put("UpstreamType", request.upstreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAttributeGroup)) {
            body.put("UserAttributeGroup", request.userAttributeGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建加速策略</p>
     * 
     * @param request CreateEnterpriseAcceleratePolicyRequest
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    public CreateEnterpriseAcceleratePolicyResponse createEnterpriseAcceleratePolicy(CreateEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建加速对象</p>
     * 
     * @param request CreateEnterpriseAccelerateTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    public CreateEnterpriseAccelerateTargetResponse createEnterpriseAccelerateTargetWithOptions(CreateEnterpriseAccelerateTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            bodyFlat.put("Target", request.target);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseAccelerateTarget"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseAccelerateTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建加速对象</p>
     * 
     * @param request CreateEnterpriseAccelerateTargetRequest
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    public CreateEnterpriseAccelerateTargetResponse createEnterpriseAccelerateTarget(CreateEnterpriseAccelerateTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseAccelerateTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义身份源部门</p>
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
     * <b>summary</b> : 
     * <p>创建自定义身份源部门</p>
     * 
     * @param request CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    public CreateIdpDepartmentResponse createIdpDepartment(CreateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, you can create a maximum of 500 office applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an office application within the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq CreatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplicationWithOptions(CreatePrivateAccessApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrivateAccessApplicationShrinkRequest request = new CreatePrivateAccessApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.l7Config)) {
            request.l7ConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.l7Config, "L7Config", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            bodyFlat.put("Addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserAccessStatus)) {
            body.put("BrowserAccessStatus", request.browserAccessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ConfigShrink)) {
            body.put("L7Config", request.l7ConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainAutomaticPrefix)) {
            body.put("L7ProxyDomainAutomaticPrefix", request.l7ProxyDomainAutomaticPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainCustom)) {
            body.put("L7ProxyDomainCustom", request.l7ProxyDomainCustom);
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
     * <b>description</b> :
     * <p>By default, you can create a maximum of 500 office applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an office application within the current Alibaba Cloud account.</p>
     * 
     * @param request CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    public CreatePrivateAccessApplicationResponse createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建内网访问策略</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeAction)) {
            body.put("DeviceAttributeAction", request.deviceAttributeAction);
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

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTemplateId)) {
            body.put("TriggerTemplateId", request.triggerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessGroupIds)) {
            bodyFlat.put("TrustedProcessGroupIds", request.trustedProcessGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessStatus)) {
            body.put("TrustedProcessStatus", request.trustedProcessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedSoftwareIds)) {
            bodyFlat.put("TrustedSoftwareIds", request.trustedSoftwareIds);
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
     * <b>summary</b> : 
     * <p>创建内网访问策略</p>
     * 
     * @param request CreatePrivateAccessPolicyRequest
     * @return CreatePrivateAccessPolicyResponse
     */
    public CreatePrivateAccessPolicyResponse createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建内网访问标签</p>
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
     * <b>summary</b> : 
     * <p>创建内网访问标签</p>
     * 
     * @param request CreatePrivateAccessTagRequest
     * @return CreatePrivateAccessTagResponse
     */
    public CreatePrivateAccessTagResponse createPrivateAccessTag(CreatePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建设备注册策略</p>
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
     * <b>summary</b> : 
     * <p>创建设备注册策略</p>
     * 
     * @param request CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    public CreateRegistrationPolicyResponse createRegistrationPolicy(CreateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户组</p>
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
     * <b>summary</b> : 
     * <p>创建用户组</p>
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
     * <p>创建数字水印暗水印透明底图</p>
     * 
     * @param tmpReq CreateWmBaseImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmBaseImageResponse
     */
    public CreateWmBaseImageResponse createWmBaseImageWithOptions(CreateWmBaseImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmBaseImageShrinkRequest request = new CreateWmBaseImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageControl)) {
            request.imageControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageControl, "ImageControl", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageControlShrink)) {
            body.put("ImageControl", request.imageControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opacity)) {
            body.put("Opacity", request.opacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scale)) {
            body.put("Scale", request.scale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("Width", request.width);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoUint)) {
            body.put("WmInfoUint", request.wmInfoUint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmBaseImage"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmBaseImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数字水印暗水印透明底图</p>
     * 
     * @param request CreateWmBaseImageRequest
     * @return CreateWmBaseImageResponse
     */
    public CreateWmBaseImageResponse createWmBaseImage(CreateWmBaseImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmBaseImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建嵌入水印任务</p>
     * 
     * @param tmpReq CreateWmEmbedTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmEmbedTaskResponse
     */
    public CreateWmEmbedTaskResponse createWmEmbedTaskWithOptions(CreateWmEmbedTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmEmbedTaskShrinkRequest request = new CreateWmEmbedTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.csvControl)) {
            request.csvControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.csvControl, "CsvControl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentControl)) {
            request.documentControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentControl, "DocumentControl", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csvControlShrink)) {
            query.put("CsvControl", request.csvControlShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentControlShrink)) {
            body.put("DocumentControl", request.documentControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            body.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageEmbedJpegQuality)) {
            body.put("ImageEmbedJpegQuality", request.imageEmbedJpegQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageEmbedLevel)) {
            body.put("ImageEmbedLevel", request.imageEmbedLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoBitrate)) {
            body.put("VideoBitrate", request.videoBitrate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoIsLong)) {
            body.put("VideoIsLong", request.videoIsLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoUint)) {
            body.put("WmInfoUint", request.wmInfoUint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmEmbedTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmEmbedTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建嵌入水印任务</p>
     * 
     * @param request CreateWmEmbedTaskRequest
     * @return CreateWmEmbedTaskResponse
     */
    public CreateWmEmbedTaskResponse createWmEmbedTask(CreateWmEmbedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmEmbedTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a digital watermark extraction task.</p>
     * 
     * @param tmpReq CreateWmExtractTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmExtractTaskResponse
     */
    public CreateWmExtractTaskResponse createWmExtractTaskWithOptions(CreateWmExtractTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWmExtractTaskShrinkRequest request = new CreateWmExtractTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.csvControl)) {
            request.csvControlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.csvControl, "CsvControl", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csvControlShrink)) {
            query.put("CsvControl", request.csvControlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isClientEmbed)) {
            query.put("IsClientEmbed", request.isClientEmbed);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIsCapture)) {
            body.put("DocumentIsCapture", request.documentIsCapture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            body.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoIsLong)) {
            body.put("VideoIsLong", request.videoIsLong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoSpeed)) {
            body.put("VideoSpeed", request.videoSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmExtractTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmExtractTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a digital watermark extraction task.</p>
     * 
     * @param request CreateWmExtractTaskRequest
     * @return CreateWmExtractTaskResponse
     */
    public CreateWmExtractTaskResponse createWmExtractTask(CreateWmExtractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmExtractTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一条字符串水印信息到数字水印信息的映射记录</p>
     * 
     * @param request CreateWmInfoMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWmInfoMappingResponse
     */
    public CreateWmInfoMappingResponse createWmInfoMappingWithOptions(CreateWmInfoMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoBytesB64)) {
            body.put("WmInfoBytesB64", request.wmInfoBytesB64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmInfoSize)) {
            body.put("WmInfoSize", request.wmInfoSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wmType)) {
            body.put("WmType", request.wmType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWmInfoMapping"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWmInfoMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一条字符串水印信息到数字水印信息的映射记录</p>
     * 
     * @param request CreateWmInfoMappingRequest
     * @return CreateWmInfoMappingResponse
     */
    public CreateWmInfoMappingResponse createWmInfoMapping(CreateWmInfoMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWmInfoMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除审批流程</p>
     * 
     * @param request DeleteApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApprovalProcessesResponse
     */
    public DeleteApprovalProcessesResponse deleteApprovalProcessesWithOptions(DeleteApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processIds)) {
            bodyFlat.put("ProcessIds", request.processIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除审批流程</p>
     * 
     * @param request DeleteApprovalProcessesRequest
     * @return DeleteApprovalProcessesResponse
     */
    public DeleteApprovalProcessesResponse deleteApprovalProcesses(DeleteApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义身份源指定用户</p>
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
     * <b>summary</b> : 
     * <p>删除自定义身份源指定用户</p>
     * 
     * @param request DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    public DeleteClientUserResponse deleteClientUser(DeleteClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除动态路由</p>
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
     * <b>summary</b> : 
     * <p>删除动态路由</p>
     * 
     * @param request DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    public DeleteDynamicRouteResponse deleteDynamicRoute(DeleteDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除加速策略</p>
     * 
     * @param request DeleteEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    public DeleteEnterpriseAcceleratePolicyResponse deleteEnterpriseAcceleratePolicyWithOptions(DeleteEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除加速策略</p>
     * 
     * @param request DeleteEnterpriseAcceleratePolicyRequest
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    public DeleteEnterpriseAcceleratePolicyResponse deleteEnterpriseAcceleratePolicy(DeleteEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除加速对象</p>
     * 
     * @param request DeleteEnterpriseAccelerateTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    public DeleteEnterpriseAccelerateTargetResponse deleteEnterpriseAccelerateTargetWithOptions(DeleteEnterpriseAccelerateTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            bodyFlat.put("Target", request.target);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseAccelerateTarget"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseAccelerateTargetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除加速对象</p>
     * 
     * @param request DeleteEnterpriseAccelerateTargetRequest
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    public DeleteEnterpriseAccelerateTargetResponse deleteEnterpriseAccelerateTarget(DeleteEnterpriseAccelerateTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseAccelerateTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定自定义身份源部门</p>
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
     * <b>summary</b> : 
     * <p>删除指定自定义身份源部门</p>
     * 
     * @param request DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    public DeleteIdpDepartmentResponse deleteIdpDepartment(DeleteIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteOtpConfig</p>
     * 
     * @param request DeleteOtpConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOtpConfigResponse
     */
    public DeleteOtpConfigResponse deleteOtpConfigWithOptions(DeleteOtpConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOtpConfig"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOtpConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteOtpConfig</p>
     * 
     * @param request DeleteOtpConfigRequest
     * @return DeleteOtpConfigResponse
     */
    public DeleteOtpConfigResponse deleteOtpConfig(DeleteOtpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOtpConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除内网访问应用</p>
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
     * <b>summary</b> : 
     * <p>删除内网访问应用</p>
     * 
     * @param request DeletePrivateAccessApplicationRequest
     * @return DeletePrivateAccessApplicationResponse
     */
    public DeletePrivateAccessApplicationResponse deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除内网访问策略</p>
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
     * <b>summary</b> : 
     * <p>删除内网访问策略</p>
     * 
     * @param request DeletePrivateAccessPolicyRequest
     * @return DeletePrivateAccessPolicyResponse
     */
    public DeletePrivateAccessPolicyResponse deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除内网访问标签</p>
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
     * <b>summary</b> : 
     * <p>删除内网访问标签</p>
     * 
     * @param request DeletePrivateAccessTagRequest
     * @return DeletePrivateAccessTagResponse
     */
    public DeletePrivateAccessTagResponse deletePrivateAccessTag(DeletePrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备注册策略</p>
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
     * <b>summary</b> : 
     * <p>删除设备注册策略</p>
     * 
     * @param request DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    public DeleteRegistrationPoliciesResponse deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除用户非在线设备</p>
     * 
     * @param request DeleteUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserDevicesResponse
     */
    public DeleteUserDevicesResponse deleteUserDevicesWithOptions(DeleteUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("action", "DeleteUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除用户非在线设备</p>
     * 
     * @param request DeleteUserDevicesRequest
     * @return DeleteUserDevicesResponse
     */
    public DeleteUserDevicesResponse deleteUserDevices(DeleteUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户组</p>
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
     * <b>summary</b> : 
     * <p>删除用户组</p>
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
     * <p>卸载connector的应用</p>
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
     * <b>summary</b> : 
     * <p>卸载connector的应用</p>
     * 
     * @param request DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    public DetachApplication2ConnectorResponse detachApplication2Connector(DetachApplication2ConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachApplication2ConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑业务策略与审批流程</p>
     * 
     * @param request DetachPolicy2ApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachPolicy2ApprovalProcessResponse
     */
    public DetachPolicy2ApprovalProcessResponse detachPolicy2ApprovalProcessWithOptions(DetachPolicy2ApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachPolicy2ApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachPolicy2ApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑业务策略与审批流程</p>
     * 
     * @param request DetachPolicy2ApprovalProcessRequest
     * @return DetachPolicy2ApprovalProcessResponse
     */
    public DetachPolicy2ApprovalProcessResponse detachPolicy2ApprovalProcess(DetachPolicy2ApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachPolicy2ApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用加速策略</p>
     * 
     * @param request DisableEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    public DisableEnterpriseAcceleratePolicyResponse disableEnterpriseAcceleratePolicyWithOptions(DisableEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用加速策略</p>
     * 
     * @param request DisableEnterpriseAcceleratePolicyRequest
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    public DisableEnterpriseAcceleratePolicyResponse disableEnterpriseAcceleratePolicy(DisableEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用加速策略</p>
     * 
     * @param request EnableEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    public EnableEnterpriseAcceleratePolicyResponse enableEnterpriseAcceleratePolicyWithOptions(EnableEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用加速策略</p>
     * 
     * @param request EnableEnterpriseAcceleratePolicyRequest
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    public EnableEnterpriseAcceleratePolicyResponse enableEnterpriseAcceleratePolicy(EnableEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询用户设备列表</p>
     * 
     * @param request ExportUserDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportUserDevicesResponse
     */
    public ExportUserDevicesResponse exportUserDevicesWithOptions(ExportUserDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appStatuses)) {
            bodyFlat.put("AppStatuses", request.appStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            body.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceBelong)) {
            body.put("DeviceBelong", request.deviceBelong);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatuses)) {
            bodyFlat.put("DeviceStatuses", request.deviceStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTags)) {
            bodyFlat.put("DeviceTags", request.deviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTypes)) {
            bodyFlat.put("DeviceTypes", request.deviceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlpStatuses)) {
            bodyFlat.put("DlpStatuses", request.dlpStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            body.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaStatuses)) {
            bodyFlat.put("IaStatuses", request.iaStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacStatuses)) {
            bodyFlat.put("NacStatuses", request.nacStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paStatuses)) {
            bodyFlat.put("PaStatuses", request.paStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saseUserId)) {
            body.put("SaseUserId", request.saseUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharingStatus)) {
            body.put("SharingStatus", request.sharingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportUserDevices"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportUserDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询用户设备列表</p>
     * 
     * @param request ExportUserDevicesRequest
     * @return ExportUserDevicesResponse
     */
    public ExportUserDevicesResponse exportUserDevices(ExportUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已启用的身份源配置</p>
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
     * <b>summary</b> : 
     * <p>查询已启用的身份源配置</p>
     * @return GetActiveIdpConfigResponse
     */
    public GetActiveIdpConfigResponse getActiveIdpConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActiveIdpConfigWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批</p>
     * 
     * @param request GetApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalResponse
     */
    public GetApprovalResponse getApprovalWithOptions(GetApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApproval"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批</p>
     * 
     * @param request GetApprovalRequest
     * @return GetApprovalResponse
     */
    public GetApprovalResponse getApproval(GetApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批流程</p>
     * 
     * @param request GetApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalProcessResponse
     */
    public GetApprovalProcessResponse getApprovalProcessWithOptions(GetApprovalProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批流程</p>
     * 
     * @param request GetApprovalProcessRequest
     * @return GetApprovalProcessResponse
     */
    public GetApprovalProcessResponse getApprovalProcess(GetApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批动态模板</p>
     * 
     * @param request GetApprovalSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalSchemaResponse
     */
    public GetApprovalSchemaResponse getApprovalSchemaWithOptions(GetApprovalSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApprovalSchema"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批动态模板</p>
     * 
     * @param request GetApprovalSchemaRequest
     * @return GetApprovalSchemaResponse
     */
    public GetApprovalSchemaResponse getApprovalSchema(GetApprovalSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自启动与防卸载策略配置</p>
     * 
     * @param request GetBootAndAntiUninstallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    public GetBootAndAntiUninstallPolicyResponse getBootAndAntiUninstallPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBootAndAntiUninstallPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBootAndAntiUninstallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自启动与防卸载策略配置</p>
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    public GetBootAndAntiUninstallPolicyResponse getBootAndAntiUninstallPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBootAndAntiUninstallPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义身份源指定用户</p>
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
     * <b>summary</b> : 
     * <p>查询自定义身份源指定用户</p>
     * 
     * @param request GetClientUserRequest
     * @return GetClientUserResponse
     */
    public GetClientUserResponse getClientUser(GetClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询动态路由详情</p>
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
     * <b>summary</b> : 
     * <p>查询动态路由详情</p>
     * 
     * @param request GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    public GetDynamicRouteResponse getDynamicRoute(GetDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询身份源配置详情</p>
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
     * <b>summary</b> : 
     * <p>查询身份源配置详情</p>
     * 
     * @param request GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    public GetIdpConfigResponse getIdpConfig(GetIdpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdpConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the office applications that belong to the current Alibaba Cloud account.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of the office applications that belong to the current Alibaba Cloud account.</p>
     * 
     * @param request GetPrivateAccessApplicationRequest
     * @return GetPrivateAccessApplicationResponse
     */
    public GetPrivateAccessApplicationResponse getPrivateAccessApplication(GetPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Intranet Access Policy Details</p>
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
     * <b>summary</b> : 
     * <p>Query Intranet Access Policy Details</p>
     * 
     * @param request GetPrivateAccessPolicyRequest
     * @return GetPrivateAccessPolicyResponse
     */
    public GetPrivateAccessPolicyResponse getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备注册策略详情</p>
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
     * <b>summary</b> : 
     * <p>查询设备注册策略详情</p>
     * 
     * @param request GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    public GetRegistrationPolicyResponse getRegistrationPolicy(GetRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户设备详情</p>
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
     * <b>summary</b> : 
     * <p>查询用户设备详情</p>
     * 
     * @param request GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    public GetUserDeviceResponse getUserDevice(GetUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户组详情</p>
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
     * <b>summary</b> : 
     * <p>查询用户组详情</p>
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
     * <p>查询嵌入水印任务</p>
     * 
     * @param request GetWmEmbedTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWmEmbedTaskResponse
     */
    public GetWmEmbedTaskResponse getWmEmbedTaskWithOptions(GetWmEmbedTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWmEmbedTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWmEmbedTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询嵌入水印任务</p>
     * 
     * @param request GetWmEmbedTaskRequest
     * @return GetWmEmbedTaskResponse
     */
    public GetWmEmbedTaskResponse getWmEmbedTask(GetWmEmbedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWmEmbedTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文件水印提取任务详情</p>
     * 
     * @param request GetWmExtractTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWmExtractTaskResponse
     */
    public GetWmExtractTaskResponse getWmExtractTaskWithOptions(GetWmExtractTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWmExtractTask"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWmExtractTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文件水印提取任务详情</p>
     * 
     * @param request GetWmExtractTaskRequest
     * @return GetWmExtractTaskResponse
     */
    public GetWmExtractTaskResponse getWmExtractTask(GetWmExtractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWmExtractTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入加速对象异步任务</p>
     * 
     * @param request ImportEnterpriseAccelerateTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    public ImportEnterpriseAccelerateTargetsResponse importEnterpriseAccelerateTargetsWithOptions(ImportEnterpriseAccelerateTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportEnterpriseAccelerateTargets"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportEnterpriseAccelerateTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量导入加速对象异步任务</p>
     * 
     * @param request ImportEnterpriseAccelerateTargetsRequest
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    public ImportEnterpriseAccelerateTargetsResponse importEnterpriseAccelerateTargets(ImportEnterpriseAccelerateTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importEnterpriseAccelerateTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问策略的应用</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问策略的应用</p>
     * 
     * @param request ListApplicationsForPrivateAccessPolicyRequest
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    public ListApplicationsForPrivateAccessPolicyResponse listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问标签的应用</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问标签的应用</p>
     * 
     * @param request ListApplicationsForPrivateAccessTagRequest
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    public ListApplicationsForPrivateAccessTagResponse listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询审批流程</p>
     * 
     * @param request ListApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalProcessesResponse
     */
    public ListApprovalProcessesResponse listApprovalProcessesWithOptions(ListApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询审批流程</p>
     * 
     * @param request ListApprovalProcessesRequest
     * @return ListApprovalProcessesResponse
     */
    public ListApprovalProcessesResponse listApprovalProcesses(ListApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批渲染模板关联的流程</p>
     * 
     * @param request ListApprovalProcessesForApprovalSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    public ListApprovalProcessesForApprovalSchemasResponse listApprovalProcessesForApprovalSchemasWithOptions(ListApprovalProcessesForApprovalSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalProcessesForApprovalSchemas"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalProcessesForApprovalSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批渲染模板关联的流程</p>
     * 
     * @param request ListApprovalProcessesForApprovalSchemasRequest
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    public ListApprovalProcessesForApprovalSchemasResponse listApprovalProcessesForApprovalSchemas(ListApprovalProcessesForApprovalSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalProcessesForApprovalSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询审批动态模板</p>
     * 
     * @param request ListApprovalSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalSchemasResponse
     */
    public ListApprovalSchemasResponse listApprovalSchemasWithOptions(ListApprovalSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalSchemas"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询审批动态模板</p>
     * 
     * @param request ListApprovalSchemasRequest
     * @return ListApprovalSchemasResponse
     */
    public ListApprovalSchemasResponse listApprovalSchemas(ListApprovalSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批流程关联的渲染模板</p>
     * 
     * @param request ListApprovalSchemasForApprovalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    public ListApprovalSchemasForApprovalProcessesResponse listApprovalSchemasForApprovalProcessesWithOptions(ListApprovalSchemasForApprovalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovalSchemasForApprovalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalSchemasForApprovalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批流程关联的渲染模板</p>
     * 
     * @param request ListApprovalSchemasForApprovalProcessesRequest
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    public ListApprovalSchemasForApprovalProcessesResponse listApprovalSchemasForApprovalProcesses(ListApprovalSchemasForApprovalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalSchemasForApprovalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询审批</p>
     * 
     * @param request ListApprovalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApprovalsResponse
     */
    public ListApprovalsResponse listApprovalsWithOptions(ListApprovalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApprovals"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApprovalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询审批</p>
     * 
     * @param request ListApprovalsRequest
     * @return ListApprovalsResponse
     */
    public ListApprovalsResponse listApprovals(ListApprovalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApprovalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义身份源用户</p>
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
     * <b>summary</b> : 
     * <p>查询自定义身份源用户</p>
     * 
     * @param request ListClientUsersRequest
     * @return ListClientUsersResponse
     */
    public ListClientUsersResponse listClientUsers(ListClientUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询connector</p>
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
     * <b>summary</b> : 
     * <p>批量查询connector</p>
     * 
     * @param request ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    public ListConnectorsResponse listConnectors(ListConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Query Dynamic Policy Disposal Processes</p>
     * 
     * @param request ListDynamicDisposalProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDynamicDisposalProcessesResponse
     */
    public ListDynamicDisposalProcessesResponse listDynamicDisposalProcessesWithOptions(ListDynamicDisposalProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDynamicDisposalProcesses"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDynamicDisposalProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Query Dynamic Policy Disposal Processes</p>
     * 
     * @param request ListDynamicDisposalProcessesRequest
     * @return ListDynamicDisposalProcessesResponse
     */
    public ListDynamicDisposalProcessesResponse listDynamicDisposalProcesses(ListDynamicDisposalProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicDisposalProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询动态路由的地域</p>
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
     * <b>summary</b> : 
     * <p>批量查询动态路由的地域</p>
     * @return ListDynamicRouteRegionsResponse
     */
    public ListDynamicRouteRegionsResponse listDynamicRouteRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRouteRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询动态路由</p>
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
     * <b>summary</b> : 
     * <p>批量查询动态路由</p>
     * 
     * @param request ListDynamicRoutesRequest
     * @return ListDynamicRoutesResponse
     */
    public ListDynamicRoutesResponse listDynamicRoutes(ListDynamicRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDynamicRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速策略日志列表</p>
     * 
     * @param request ListEnterpriseAccelerateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAccelerateLogsResponse
     */
    public ListEnterpriseAccelerateLogsResponse listEnterpriseAccelerateLogsWithOptions(ListEnterpriseAccelerateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAccelerateLogs"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAccelerateLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速策略日志列表</p>
     * 
     * @param request ListEnterpriseAccelerateLogsRequest
     * @return ListEnterpriseAccelerateLogsResponse
     */
    public ListEnterpriseAccelerateLogsResponse listEnterpriseAccelerateLogs(ListEnterpriseAccelerateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAccelerateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速策略列表</p>
     * 
     * @param request ListEnterpriseAcceleratePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    public ListEnterpriseAcceleratePoliciesResponse listEnterpriseAcceleratePoliciesWithOptions(ListEnterpriseAcceleratePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAcceleratePolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAcceleratePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速策略列表</p>
     * 
     * @param request ListEnterpriseAcceleratePoliciesRequest
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    public ListEnterpriseAcceleratePoliciesResponse listEnterpriseAcceleratePolicies(ListEnterpriseAcceleratePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAcceleratePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速对象列表</p>
     * 
     * @param request ListEnterpriseAccelerateTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    public ListEnterpriseAccelerateTargetsResponse listEnterpriseAccelerateTargetsWithOptions(ListEnterpriseAccelerateTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseAccelerateTargets"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseAccelerateTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速对象列表</p>
     * 
     * @param request ListEnterpriseAccelerateTargetsRequest
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    public ListEnterpriseAccelerateTargetsResponse listEnterpriseAccelerateTargets(ListEnterpriseAccelerateTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseAccelerateTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询超额注册申请列表</p>
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
     * <b>summary</b> : 
     * <p>批量查询超额注册申请列表</p>
     * 
     * @param request ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    public ListExcessiveDeviceRegistrationApplicationsResponse listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExcessiveDeviceRegistrationApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询IDP配置</p>
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
     * <b>summary</b> : 
     * <p>查询IDP配置</p>
     * 
     * @param request ListIdpConfigsRequest
     * @return ListIdpConfigsResponse
     */
    public ListIdpConfigsResponse listIdpConfigs(ListIdpConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义身份源部门</p>
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
     * <b>summary</b> : 
     * <p>查询自定义身份源部门</p>
     * 
     * @param request ListIdpDepartmentsRequest
     * @return ListIdpDepartmentsResponse
     */
    public ListIdpDepartmentsResponse listIdpDepartments(ListIdpDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdpDepartmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>入网用户列表</p>
     * 
     * @param request ListNacUserCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNacUserCertResponse
     */
    public ListNacUserCertResponse listNacUserCertWithOptions(ListNacUserCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacUserCert"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacUserCertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>入网用户列表</p>
     * 
     * @param request ListNacUserCertRequest
     * @return ListNacUserCertResponse
     */
    public ListNacUserCertResponse listNacUserCert(ListNacUserCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNacUserCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问应用的策略</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问应用的策略</p>
     * 
     * @param request ListPolicesForPrivateAccessApplicationRequest
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    public ListPolicesForPrivateAccessApplicationResponse listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问标签的策略</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问标签的策略</p>
     * 
     * @param request ListPolicesForPrivateAccessTagRequest
     * @return ListPolicesForPrivateAccessTagResponse
     */
    public ListPolicesForPrivateAccessTagResponse listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForPrivateAccessTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询用户组的策略</p>
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
     * <b>summary</b> : 
     * <p>批量查询用户组的策略</p>
     * 
     * @param request ListPolicesForUserGroupRequest
     * @return ListPolicesForUserGroupResponse
     */
    public ListPolicesForUserGroupResponse listPolicesForUserGroup(ListPolicesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>pop节点流量统计</p>
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
     * <b>summary</b> : 
     * <p>pop节点流量统计</p>
     * 
     * @param request ListPopTrafficStatisticsRequest
     * @return ListPopTrafficStatisticsResponse
     */
    public ListPopTrafficStatisticsResponse listPopTrafficStatistics(ListPopTrafficStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPopTrafficStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问应用</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问应用</p>
     * 
     * @param request ListPrivateAccessApplicationsRequest
     * @return ListPrivateAccessApplicationsResponse
     */
    public ListPrivateAccessApplicationsResponse listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询动态路由的内网访问应用</p>
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
     * <b>summary</b> : 
     * <p>批量查询动态路由的内网访问应用</p>
     * 
     * @param request ListPrivateAccessApplicationsForDynamicRouteRequest
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    public ListPrivateAccessApplicationsForDynamicRouteResponse listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessApplicationsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the private access policies within the current Alibaba Cloud account.</p>
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
     * <b>summary</b> : 
     * <p>Queries the private access policies within the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessPolicesRequest
     * @return ListPrivateAccessPolicesResponse
     */
    public ListPrivateAccessPolicesResponse listPrivateAccessPolices(ListPrivateAccessPolicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessPolicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all internal access tags within the current Alibaba Cloud account.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about all internal access tags within the current Alibaba Cloud account.</p>
     * 
     * @param request ListPrivateAccessTagsRequest
     * @return ListPrivateAccessTagsResponse
     */
    public ListPrivateAccessTagsResponse listPrivateAccessTags(ListPrivateAccessTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询动态路由的内网访问标签</p>
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
     * <b>summary</b> : 
     * <p>批量查询动态路由的内网访问标签</p>
     * 
     * @param request ListPrivateAccessTagsForDynamicRouteRequest
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    public ListPrivateAccessTagsForDynamicRouteResponse listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivateAccessTagsForDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户设备注册策略列表</p>
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
     * <b>summary</b> : 
     * <p>查询用户设备注册策略列表</p>
     * 
     * @param request ListRegistrationPoliciesRequest
     * @return ListRegistrationPoliciesResponse
     */
    public ListRegistrationPoliciesResponse listRegistrationPolicies(ListRegistrationPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户组相关的设备注册策略</p>
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
     * <b>summary</b> : 
     * <p>查询用户组相关的设备注册策略</p>
     * 
     * @param request ListRegistrationPoliciesForUserGroupRequest
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    public ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegistrationPoliciesForUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询终端安装软件列表</p>
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
     * <b>summary</b> : 
     * <p>批量查询终端安装软件列表</p>
     * 
     * @param request ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    public ListSoftwareForUserDeviceResponse listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSoftwareForUserDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问应用的标签</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问应用的标签</p>
     * 
     * @param request ListTagsForPrivateAccessApplicationRequest
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    public ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询内网访问策略的标签</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问策略的标签</p>
     * 
     * @param request ListTagsForPrivateAccessPolicyRequest
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    public ListTagsForPrivateAccessPolicyResponse listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询卸载申请列表</p>
     * 
     * @param request ListUninstallApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUninstallApplicationsResponse
     */
    public ListUninstallApplicationsResponse listUninstallApplicationsWithOptions(ListUninstallApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUninstallApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUninstallApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询卸载申请列表</p>
     * 
     * @param request ListUninstallApplicationsRequest
     * @return ListUninstallApplicationsResponse
     */
    public ListUninstallApplicationsResponse listUninstallApplications(ListUninstallApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUninstallApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询用户应用权限</p>
     * 
     * @param request ListUserApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserApplicationsResponse
     */
    public ListUserApplicationsResponse listUserApplicationsWithOptions(ListUserApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserApplications"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询用户应用权限</p>
     * 
     * @param request ListUserApplicationsRequest
     * @return ListUserApplicationsResponse
     */
    public ListUserApplicationsResponse listUserApplications(ListUserApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询用户设备列表</p>
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
     * <b>summary</b> : 
     * <p>批量查询用户设备列表</p>
     * 
     * @param request ListUserDevicesRequest
     * @return ListUserDevicesResponse
     */
    public ListUserDevicesResponse listUserDevices(ListUserDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询用户组</p>
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
     * <b>summary</b> : 
     * <p>批量查询用户组</p>
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
     * <p>批量查询内网访问策略的用户组</p>
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
     * <b>summary</b> : 
     * <p>批量查询内网访问策略的用户组</p>
     * 
     * @param request ListUserGroupsForPrivateAccessPolicyRequest
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    public ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForPrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备注册策略相关用户组</p>
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
     * <b>summary</b> : 
     * <p>查询设备注册策略相关用户组</p>
     * 
     * @param request ListUserGroupsForRegistrationPolicyRequest
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    public ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsForRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List query of user zero trust policies</p>
     * 
     * @param request ListUserPrivateAccessPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPrivateAccessPoliciesResponse
     */
    public ListUserPrivateAccessPoliciesResponse listUserPrivateAccessPoliciesWithOptions(ListUserPrivateAccessPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPrivateAccessPolicies"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPrivateAccessPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List query of user zero trust policies</p>
     * 
     * @param request ListUserPrivateAccessPoliciesRequest
     * @return ListUserPrivateAccessPoliciesResponse
     */
    public ListUserPrivateAccessPoliciesResponse listUserPrivateAccessPolicies(ListUserPrivateAccessPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPrivateAccessPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询登陆用户</p>
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
     * <b>summary</b> : 
     * <p>列表查询登陆用户</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据数字水印信息查询字符串水印信息</p>
     * 
     * @param request LookupWmInfoMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LookupWmInfoMappingResponse
     */
    public LookupWmInfoMappingResponse lookupWmInfoMappingWithOptions(LookupWmInfoMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupWmInfoMapping"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupWmInfoMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据数字水印信息查询字符串水印信息</p>
     * 
     * @param request LookupWmInfoMappingRequest
     * @return LookupWmInfoMappingResponse
     */
    public LookupWmInfoMappingResponse lookupWmInfoMapping(LookupWmInfoMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupWmInfoMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改加速策略</p>
     * 
     * @param request ModifyEnterpriseAcceleratePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    public ModifyEnterpriseAcceleratePolicyResponse modifyEnterpriseAcceleratePolicyWithOptions(ModifyEnterpriseAcceleratePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accelerationType)) {
            body.put("AccelerationType", request.accelerationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eapId)) {
            body.put("EapId", request.eapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onTls)) {
            body.put("OnTls", request.onTls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showInClient)) {
            body.put("ShowInClient", request.showInClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamHost)) {
            body.put("UpstreamHost", request.upstreamHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamPort)) {
            body.put("UpstreamPort", request.upstreamPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamType)) {
            body.put("UpstreamType", request.upstreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAttributeGroup)) {
            body.put("UserAttributeGroup", request.userAttributeGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEnterpriseAcceleratePolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEnterpriseAcceleratePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改加速策略</p>
     * 
     * @param request ModifyEnterpriseAcceleratePolicyRequest
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    public ModifyEnterpriseAcceleratePolicyResponse modifyEnterpriseAcceleratePolicy(ModifyEnterpriseAcceleratePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEnterpriseAcceleratePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>吊销用户登录会话</p>
     * 
     * @deprecated OpenAPI RevokeUserSession is deprecated
     * 
     * @param request RevokeUserSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>吊销用户登录会话</p>
     * 
     * @deprecated OpenAPI RevokeUserSession is deprecated
     * 
     * @param request RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    // Deprecated
    public RevokeUserSessionResponse revokeUserSession(RevokeUserSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeUserSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新审批流程</p>
     * 
     * @param tmpReq UpdateApprovalProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApprovalProcessResponse
     */
    public UpdateApprovalProcessResponse updateApprovalProcessWithOptions(UpdateApprovalProcessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApprovalProcessShrinkRequest request = new UpdateApprovalProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchSchemas)) {
            request.matchSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchSchemas, "MatchSchemas", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchSchemasShrink)) {
            body.put("MatchSchemas", request.matchSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            body.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            body.put("ProcessName", request.processName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processNodes)) {
            bodyFlat.put("ProcessNodes", request.processNodes);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApprovalProcess"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApprovalProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新审批流程</p>
     * 
     * @param request UpdateApprovalProcessRequest
     * @return UpdateApprovalProcessResponse
     */
    public UpdateApprovalProcessResponse updateApprovalProcess(UpdateApprovalProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApprovalProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改审批状态</p>
     * 
     * @param request UpdateApprovalStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApprovalStatusResponse
     */
    public UpdateApprovalStatusResponse updateApprovalStatusWithOptions(UpdateApprovalStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            query.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApprovalStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApprovalStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改审批状态</p>
     * 
     * @param request UpdateApprovalStatusRequest
     * @return UpdateApprovalStatusResponse
     */
    public UpdateApprovalStatusResponse updateApprovalStatus(UpdateApprovalStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApprovalStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自启动与防卸载策略配置</p>
     * 
     * @param tmpReq UpdateBootAndAntiUninstallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    public UpdateBootAndAntiUninstallPolicyResponse updateBootAndAntiUninstallPolicyWithOptions(UpdateBootAndAntiUninstallPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBootAndAntiUninstallPolicyShrinkRequest request = new UpdateBootAndAntiUninstallPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.blockContent)) {
            request.blockContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.blockContent, "BlockContent", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowReport)) {
            body.put("AllowReport", request.allowReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockContentShrink)) {
            body.put("BlockContent", request.blockContentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAntiUninstall)) {
            body.put("IsAntiUninstall", request.isAntiUninstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBoot)) {
            body.put("IsBoot", request.isBoot);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            bodyFlat.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistUsers)) {
            bodyFlat.put("WhitelistUsers", request.whitelistUsers);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBootAndAntiUninstallPolicy"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBootAndAntiUninstallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自启动与防卸载策略配置</p>
     * 
     * @param request UpdateBootAndAntiUninstallPolicyRequest
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    public UpdateBootAndAntiUninstallPolicyResponse updateBootAndAntiUninstallPolicy(UpdateBootAndAntiUninstallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBootAndAntiUninstallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户</p>
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
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户</p>
     * 
     * @param request UpdateClientUserRequest
     * @return UpdateClientUserResponse
     */
    public UpdateClientUserResponse updateClientUser(UpdateClientUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户密码</p>
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
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户密码</p>
     * 
     * @param request UpdateClientUserPasswordRequest
     * @return UpdateClientUserPasswordResponse
     */
    public UpdateClientUserPasswordResponse updateClientUserPassword(UpdateClientUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户启用状态</p>
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
     * <b>summary</b> : 
     * <p>修改自定义身份源指定用户启用状态</p>
     * 
     * @param request UpdateClientUserStatusRequest
     * @return UpdateClientUserStatusResponse
     */
    public UpdateClientUserStatusResponse updateClientUserStatus(UpdateClientUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改动态路由</p>
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
     * <b>summary</b> : 
     * <p>修改动态路由</p>
     * 
     * @param request UpdateDynamicRouteRequest
     * @return UpdateDynamicRouteResponse
     */
    public UpdateDynamicRouteResponse updateDynamicRoute(UpdateDynamicRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDynamicRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新超额注册申请状态</p>
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
     * <b>summary</b> : 
     * <p>批量更新超额注册申请状态</p>
     * 
     * @param request UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    public UpdateExcessiveDeviceRegistrationApplicationsStatusResponse updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExcessiveDeviceRegistrationApplicationsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定自定义身份源部门</p>
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
     * <b>summary</b> : 
     * <p>修改指定自定义身份源部门</p>
     * 
     * @param request UpdateIdpDepartmentRequest
     * @return UpdateIdpDepartmentResponse
     */
    public UpdateIdpDepartmentResponse updateIdpDepartment(UpdateIdpDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdpDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新NAC User 状态</p>
     * 
     * @param request UpdateNacUserCertStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacUserCertStatusResponse
     */
    public UpdateNacUserCertStatusResponse updateNacUserCertStatusWithOptions(UpdateNacUserCertStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            bodyFlat.put("IdList", request.idList);
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
            new TeaPair("action", "UpdateNacUserCertStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacUserCertStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新NAC User 状态</p>
     * 
     * @param request UpdateNacUserCertStatusRequest
     * @return UpdateNacUserCertStatusResponse
     */
    public UpdateNacUserCertStatusResponse updateNacUserCertStatus(UpdateNacUserCertStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacUserCertStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the office applications of the current Alibaba Cloud account.</p>
     * 
     * @param tmpReq UpdatePrivateAccessApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplicationWithOptions(UpdatePrivateAccessApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePrivateAccessApplicationShrinkRequest request = new UpdatePrivateAccessApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.l7Config)) {
            request.l7ConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.l7Config, "L7Config", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.l7ConfigShrink)) {
            body.put("L7Config", request.l7ConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainAutomaticPrefix)) {
            body.put("L7ProxyDomainAutomaticPrefix", request.l7ProxyDomainAutomaticPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainCustom)) {
            body.put("L7ProxyDomainCustom", request.l7ProxyDomainCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.l7ProxyDomainPrivate)) {
            body.put("L7ProxyDomainPrivate", request.l7ProxyDomainPrivate);
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
     * <b>summary</b> : 
     * <p>Modifies the office applications of the current Alibaba Cloud account.</p>
     * 
     * @param request UpdatePrivateAccessApplicationRequest
     * @return UpdatePrivateAccessApplicationResponse
     */
    public UpdatePrivateAccessApplicationResponse updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Private Access Policy</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAttributeAction)) {
            body.put("DeviceAttributeAction", request.deviceAttributeAction);
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

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTemplateId)) {
            body.put("TriggerTemplateId", request.triggerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessGroupIds)) {
            bodyFlat.put("TrustedProcessGroupIds", request.trustedProcessGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedProcessStatus)) {
            body.put("TrustedProcessStatus", request.trustedProcessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustedSoftwareIds)) {
            bodyFlat.put("TrustedSoftwareIds", request.trustedSoftwareIds);
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
     * <b>summary</b> : 
     * <p>Modify Private Access Policy</p>
     * 
     * @param request UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    public UpdatePrivateAccessPolicyResponse updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备注册策略</p>
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
     * <b>summary</b> : 
     * <p>修改设备注册策略</p>
     * 
     * @param request UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    public UpdateRegistrationPolicyResponse updateRegistrationPolicy(UpdateRegistrationPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRegistrationPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改卸载申请状态</p>
     * 
     * @param request UpdateUninstallApplicationsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUninstallApplicationsStatusResponse
     */
    public UpdateUninstallApplicationsStatusResponse updateUninstallApplicationsStatusWithOptions(UpdateUninstallApplicationsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateUninstallApplicationsStatus"),
            new TeaPair("version", "2023-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUninstallApplicationsStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改卸载申请状态</p>
     * 
     * @param request UpdateUninstallApplicationsStatusRequest
     * @return UpdateUninstallApplicationsStatusResponse
     */
    public UpdateUninstallApplicationsStatusResponse updateUninstallApplicationsStatus(UpdateUninstallApplicationsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUninstallApplicationsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新用户设备共享状态</p>
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
     * <b>summary</b> : 
     * <p>批量更新用户设备共享状态</p>
     * 
     * @param request UpdateUserDevicesSharingStatusRequest
     * @return UpdateUserDevicesSharingStatusResponse
     */
    public UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesSharingStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新用户设备状态</p>
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
     * <b>summary</b> : 
     * <p>批量更新用户设备状态</p>
     * 
     * @param request UpdateUserDevicesStatusRequest
     * @return UpdateUserDevicesStatusResponse
     */
    public UpdateUserDevicesStatusResponse updateUserDevicesStatus(UpdateUserDevicesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDevicesStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户组</p>
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
     * <b>summary</b> : 
     * <p>修改用户组</p>
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
     * <p>批量修改登陆用户状态</p>
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
     * <b>summary</b> : 
     * <p>批量修改登陆用户状态</p>
     * 
     * @param request UpdateUsersStatusRequest
     * @return UpdateUsersStatusResponse
     */
    public UpdateUsersStatusResponse updateUsersStatus(UpdateUsersStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUsersStatusWithOptions(request, runtime);
    }
}
