// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715;

import com.aliyun.tea.*;
import com.aliyun.epg20260715.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("epg", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>向出口代理地址池添加IP地址</p>
     * 
     * @param request AddIpAddressesToEgressProxyIpPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddIpAddressesToEgressProxyIpPoolResponse
     */
    public AddIpAddressesToEgressProxyIpPoolResponse addIpAddressesToEgressProxyIpPoolWithOptions(AddIpAddressesToEgressProxyIpPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpAddressesToEgressProxyIpPool"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpAddressesToEgressProxyIpPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向出口代理地址池添加IP地址</p>
     * 
     * @param request AddIpAddressesToEgressProxyIpPoolRequest
     * @return AddIpAddressesToEgressProxyIpPoolResponse
     */
    public AddIpAddressesToEgressProxyIpPoolResponse addIpAddressesToEgressProxyIpPool(AddIpAddressesToEgressProxyIpPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIpAddressesToEgressProxyIpPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to attach egress proxy rule groups to an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation attaches one or more egress proxy rule groups to a specified egress proxy configuration and specifies the priority of each egress proxy rule group in the egress proxy configuration.</li>
     * <li>The <strong>AttachEgressProxyRuleGroupsToConfiguration</strong> operation is asynchronous. After you send the request, the system returns a response, but the egress proxy rule groups are not yet attached. The attachment task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the attachment is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches egress proxy rule groups to an egress proxy configuration.</p>
     * 
     * @param request AttachEgressProxyRuleGroupsToConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachEgressProxyRuleGroupsToConfigurationResponse
     */
    public AttachEgressProxyRuleGroupsToConfigurationResponse attachEgressProxyRuleGroupsToConfigurationWithOptions(AttachEgressProxyRuleGroupsToConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroups)) {
            bodyFlat.put("EgressProxyRuleGroups", request.egressProxyRuleGroups);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEgressProxyRuleGroupsToConfiguration"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEgressProxyRuleGroupsToConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to attach egress proxy rule groups to an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation attaches one or more egress proxy rule groups to a specified egress proxy configuration and specifies the priority of each egress proxy rule group in the egress proxy configuration.</li>
     * <li>The <strong>AttachEgressProxyRuleGroupsToConfiguration</strong> operation is asynchronous. After you send the request, the system returns a response, but the egress proxy rule groups are not yet attached. The attachment task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the attachment is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches egress proxy rule groups to an egress proxy configuration.</p>
     * 
     * @param request AttachEgressProxyRuleGroupsToConfigurationRequest
     * @return AttachEgressProxyRuleGroupsToConfigurationResponse
     */
    public AttachEgressProxyRuleGroupsToConfigurationResponse attachEgressProxyRuleGroupsToConfiguration(AttachEgressProxyRuleGroupsToConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEgressProxyRuleGroupsToConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>The <strong>CreateEgressProxyConfiguration</strong> operation is asynchronous. After you call this operation, the system returns the ID of the egress proxy configuration, but the configuration is not yet created. The creation task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Provisioning</strong> state, the configuration is being created.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the configuration is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress proxy configuration.</p>
     * 
     * @param request CreateEgressProxyConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEgressProxyConfigurationResponse
     */
    public CreateEgressProxyConfigurationResponse createEgressProxyConfigurationWithOptions(CreateEgressProxyConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRulePhaseActions)) {
            bodyFlat.put("DefaultRulePhaseActions", request.defaultRulePhaseActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationName)) {
            body.put("EgressProxyConfigurationName", request.egressProxyConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEgressProxyConfiguration"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEgressProxyConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>The <strong>CreateEgressProxyConfiguration</strong> operation is asynchronous. After you call this operation, the system returns the ID of the egress proxy configuration, but the configuration is not yet created. The creation task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Provisioning</strong> state, the configuration is being created.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the configuration is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress proxy configuration.</p>
     * 
     * @param request CreateEgressProxyConfigurationRequest
     * @return CreateEgressProxyConfigurationResponse
     */
    public CreateEgressProxyConfigurationResponse createEgressProxyConfiguration(CreateEgressProxyConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEgressProxyConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateEgressProxyGateway</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the egress proxy gateway instance is not yet created and the creation task is still running in the background. You can call GetEgressProxyGatewayAttribute to query the creation status of the egress proxy gateway instance:</p>
     * <ul>
     * <li>When the egress proxy gateway instance is in the <strong>Provisioning</strong> state, the instance is being created.</li>
     * <li>When the egress proxy gateway instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress proxy gateway instance.</p>
     * 
     * @param request CreateEgressProxyGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEgressProxyGatewayResponse
     */
    public CreateEgressProxyGatewayResponse createEgressProxyGatewayWithOptions(CreateEgressProxyGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayName)) {
            body.put("EgressProxyGatewayName", request.egressProxyGatewayName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerProperties)) {
            bodyFlat.put("ListenerProperties", request.listenerProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsInterceptProperties)) {
            bodyFlat.put("TlsInterceptProperties", request.tlsInterceptProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEgressProxyGateway"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEgressProxyGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateEgressProxyGateway</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the egress proxy gateway instance is not yet created and the creation task is still running in the background. You can call GetEgressProxyGatewayAttribute to query the creation status of the egress proxy gateway instance:</p>
     * <ul>
     * <li>When the egress proxy gateway instance is in the <strong>Provisioning</strong> state, the instance is being created.</li>
     * <li>When the egress proxy gateway instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress proxy gateway instance.</p>
     * 
     * @param request CreateEgressProxyGatewayRequest
     * @return CreateEgressProxyGatewayResponse
     */
    public CreateEgressProxyGatewayResponse createEgressProxyGateway(CreateEgressProxyGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEgressProxyGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建出口代理地址池</p>
     * 
     * @param request CreateEgressProxyIpPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEgressProxyIpPoolResponse
     */
    public CreateEgressProxyIpPoolResponse createEgressProxyIpPoolWithOptions(CreateEgressProxyIpPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            body.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayId)) {
            body.put("EgressProxyGatewayId", request.egressProxyGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolName)) {
            body.put("EgressProxyIpPoolName", request.egressProxyIpPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashFactor)) {
            body.put("HashFactor", request.hashFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashHeaderName)) {
            body.put("HashHeaderName", request.hashHeaderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            body.put("Scheduler", request.scheduler);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEgressProxyIpPool"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEgressProxyIpPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建出口代理地址池</p>
     * 
     * @param request CreateEgressProxyIpPoolRequest
     * @return CreateEgressProxyIpPoolResponse
     */
    public CreateEgressProxyIpPoolResponse createEgressProxyIpPool(CreateEgressProxyIpPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEgressProxyIpPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress rule group, take note of the following items:</p>
     * <ul>
     * <li>You can create egress rules in batches by phase (PreDns, PreRequest, and PostResponse) when you create the rule group.</li>
     * <li>Within the same phase of a rule group, rule priorities (Priority) must be unique. Valid values: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the ID of the egress rule group, but the rule group is not yet created. The creation task is still running in the background. You can call GetEgressProxyRuleGroupAttribute to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rule group is being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rule group is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress rule group.</p>
     * 
     * @param request CreateEgressProxyRuleGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEgressProxyRuleGroupResponse
     */
    public CreateEgressProxyRuleGroupResponse createEgressProxyRuleGroupWithOptions(CreateEgressProxyRuleGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupName)) {
            body.put("EgressProxyRuleGroupName", request.egressProxyRuleGroupName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRules)) {
            bodyFlat.put("EgressProxyRules", request.egressProxyRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEgressProxyRuleGroup"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEgressProxyRuleGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress rule group, take note of the following items:</p>
     * <ul>
     * <li>You can create egress rules in batches by phase (PreDns, PreRequest, and PostResponse) when you create the rule group.</li>
     * <li>Within the same phase of a rule group, rule priorities (Priority) must be unique. Valid values: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the ID of the egress rule group, but the rule group is not yet created. The creation task is still running in the background. You can call GetEgressProxyRuleGroupAttribute to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rule group is being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rule group is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an egress rule group.</p>
     * 
     * @param request CreateEgressProxyRuleGroupRequest
     * @return CreateEgressProxyRuleGroupResponse
     */
    public CreateEgressProxyRuleGroupResponse createEgressProxyRuleGroup(CreateEgressProxyRuleGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEgressProxyRuleGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create multiple egress proxy rules in a specified egress rule group, note the following items:</p>
     * <ul>
     * <li>Egress rules are created in groups based on the effective phase (PreDns, PreRequest, or PostResponse).</li>
     * <li>Within the same effective phase of an egress rule group, the priority of rules must be unique.</li>
     * <li>Valid values for the priority: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the IDs of the created egress rules, but the rules are not yet created. The creation task is still running in the background. You can call the GetEgressProxyRuleGroupAttribute operation to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rules are being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rules are created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple egress proxy rules.</p>
     * 
     * @param request CreateEgressProxyRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEgressProxyRulesResponse
     */
    public CreateEgressProxyRulesResponse createEgressProxyRulesWithOptions(CreateEgressProxyRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRules)) {
            bodyFlat.put("EgressProxyRules", request.egressProxyRules);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEgressProxyRules"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEgressProxyRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create multiple egress proxy rules in a specified egress rule group, note the following items:</p>
     * <ul>
     * <li>Egress rules are created in groups based on the effective phase (PreDns, PreRequest, or PostResponse).</li>
     * <li>Within the same effective phase of an egress rule group, the priority of rules must be unique.</li>
     * <li>Valid values for the priority: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the IDs of the created egress rules, but the rules are not yet created. The creation task is still running in the background. You can call the GetEgressProxyRuleGroupAttribute operation to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rules are being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rules are created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple egress proxy rules.</p>
     * 
     * @param request CreateEgressProxyRulesRequest
     * @return CreateEgressProxyRulesResponse
     */
    public CreateEgressProxyRulesResponse createEgressProxyRules(CreateEgressProxyRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEgressProxyRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an egress proxy configuration.</p>
     * 
     * @param request DeleteEgressProxyConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEgressProxyConfigurationResponse
     */
    public DeleteEgressProxyConfigurationResponse deleteEgressProxyConfigurationWithOptions(DeleteEgressProxyConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEgressProxyConfiguration"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEgressProxyConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an egress proxy configuration.</p>
     * 
     * @param request DeleteEgressProxyConfigurationRequest
     * @return DeleteEgressProxyConfigurationResponse
     */
    public DeleteEgressProxyConfigurationResponse deleteEgressProxyConfiguration(DeleteEgressProxyConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEgressProxyConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>EgressProxyGatewayId</code> is a required parameter that specifies the egress proxy gateway instance ID to delete.</li>
     * <li><code>ClientToken</code> is an optional parameter used to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an egress proxy gateway instance.</p>
     * 
     * @param request DeleteEgressProxyGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEgressProxyGatewayResponse
     */
    public DeleteEgressProxyGatewayResponse deleteEgressProxyGatewayWithOptions(DeleteEgressProxyGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayId)) {
            body.put("EgressProxyGatewayId", request.egressProxyGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEgressProxyGateway"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEgressProxyGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>EgressProxyGatewayId</code> is a required parameter that specifies the egress proxy gateway instance ID to delete.</li>
     * <li><code>ClientToken</code> is an optional parameter used to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an egress proxy gateway instance.</p>
     * 
     * @param request DeleteEgressProxyGatewayRequest
     * @return DeleteEgressProxyGatewayResponse
     */
    public DeleteEgressProxyGatewayResponse deleteEgressProxyGateway(DeleteEgressProxyGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEgressProxyGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>EgressProxyIpPoolId</strong> is a required parameter that specifies the ID of the egress proxy IP address pool to delete.</li>
     * <li><strong>ClientToken</strong> is an optional parameter used to ensure the idempotence of the request.</li>
     * <li><strong>DryRun</strong> is an optional parameter. Default value: <code>false</code>. If you set this parameter to <code>true</code>, the system only prechecks the request and does not perform the delete operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an egress proxy IP address pool.</p>
     * 
     * @param request DeleteEgressProxyIpPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEgressProxyIpPoolResponse
     */
    public DeleteEgressProxyIpPoolResponse deleteEgressProxyIpPoolWithOptions(DeleteEgressProxyIpPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEgressProxyIpPool"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEgressProxyIpPoolResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>EgressProxyIpPoolId</strong> is a required parameter that specifies the ID of the egress proxy IP address pool to delete.</li>
     * <li><strong>ClientToken</strong> is an optional parameter used to ensure the idempotence of the request.</li>
     * <li><strong>DryRun</strong> is an optional parameter. Default value: <code>false</code>. If you set this parameter to <code>true</code>, the system only prechecks the request and does not perform the delete operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an egress proxy IP address pool.</p>
     * 
     * @param request DeleteEgressProxyIpPoolRequest
     * @return DeleteEgressProxyIpPoolResponse
     */
    public DeleteEgressProxyIpPoolResponse deleteEgressProxyIpPool(DeleteEgressProxyIpPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEgressProxyIpPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an egress proxy rule group.</p>
     * 
     * @param request DeleteEgressProxyRuleGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEgressProxyRuleGroupResponse
     */
    public DeleteEgressProxyRuleGroupResponse deleteEgressProxyRuleGroupWithOptions(DeleteEgressProxyRuleGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEgressProxyRuleGroup"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEgressProxyRuleGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an egress proxy rule group.</p>
     * 
     * @param request DeleteEgressProxyRuleGroupRequest
     * @return DeleteEgressProxyRuleGroupResponse
     */
    public DeleteEgressProxyRuleGroupResponse deleteEgressProxyRuleGroup(DeleteEgressProxyRuleGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEgressProxyRuleGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple egress proxy rules.</p>
     * 
     * @param request DeleteEgressProxyRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEgressProxyRulesResponse
     */
    public DeleteEgressProxyRulesResponse deleteEgressProxyRulesWithOptions(DeleteEgressProxyRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleIds)) {
            bodyFlat.put("EgressProxyRuleIds", request.egressProxyRuleIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEgressProxyRules"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEgressProxyRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple egress proxy rules.</p>
     * 
     * @param request DeleteEgressProxyRulesRequest
     * @return DeleteEgressProxyRulesResponse
     */
    public DeleteEgressProxyRulesResponse deleteEgressProxyRules(DeleteEgressProxyRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEgressProxyRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries zones.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries zones.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to disassociate egress proxy rule groups from an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation disassociates one or more egress proxy rule groups from a specified egress proxy configuration. After the disassociation, these egress proxy rule groups no longer take effect in the egress proxy configuration.</li>
     * <li>The <strong>DetachEgressProxyRuleGroupsFromConfiguration</strong> operation is asynchronous. After you send a request, the system returns a response, but the egress proxy rule groups are not yet disassociated. The disassociation task is still running in the background. You can call the GetEgressProxyConfigurationAttribute operation to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the disassociation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates egress proxy rule groups from an egress proxy configuration.</p>
     * 
     * @param request DetachEgressProxyRuleGroupsFromConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachEgressProxyRuleGroupsFromConfigurationResponse
     */
    public DetachEgressProxyRuleGroupsFromConfigurationResponse detachEgressProxyRuleGroupsFromConfigurationWithOptions(DetachEgressProxyRuleGroupsFromConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupIds)) {
            bodyFlat.put("EgressProxyRuleGroupIds", request.egressProxyRuleGroupIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachEgressProxyRuleGroupsFromConfiguration"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachEgressProxyRuleGroupsFromConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to disassociate egress proxy rule groups from an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation disassociates one or more egress proxy rule groups from a specified egress proxy configuration. After the disassociation, these egress proxy rule groups no longer take effect in the egress proxy configuration.</li>
     * <li>The <strong>DetachEgressProxyRuleGroupsFromConfiguration</strong> operation is asynchronous. After you send a request, the system returns a response, but the egress proxy rule groups are not yet disassociated. The disassociation task is still running in the background. You can call the GetEgressProxyConfigurationAttribute operation to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the disassociation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates egress proxy rule groups from an egress proxy configuration.</p>
     * 
     * @param request DetachEgressProxyRuleGroupsFromConfigurationRequest
     * @return DetachEgressProxyRuleGroupsFromConfigurationResponse
     */
    public DetachEgressProxyRuleGroupsFromConfigurationResponse detachEgressProxyRuleGroupsFromConfiguration(DetachEgressProxyRuleGroupsFromConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachEgressProxyRuleGroupsFromConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyConfigurationAttribute</em>* is a synchronous API operation that returns the details of a specified egress proxy configuration in real time after the call. You can determine the current status of the egress proxy configuration based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the configuration is being created, and <strong>Available</strong> indicates that the configuration is created and available.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an egress proxy configuration.</p>
     * 
     * @param request GetEgressProxyConfigurationAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEgressProxyConfigurationAttributeResponse
     */
    public GetEgressProxyConfigurationAttributeResponse getEgressProxyConfigurationAttributeWithOptions(GetEgressProxyConfigurationAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEgressProxyConfigurationAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEgressProxyConfigurationAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyConfigurationAttribute</em>* is a synchronous API operation that returns the details of a specified egress proxy configuration in real time after the call. You can determine the current status of the egress proxy configuration based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the configuration is being created, and <strong>Available</strong> indicates that the configuration is created and available.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an egress proxy configuration.</p>
     * 
     * @param request GetEgressProxyConfigurationAttributeRequest
     * @return GetEgressProxyConfigurationAttributeResponse
     */
    public GetEgressProxyConfigurationAttributeResponse getEgressProxyConfigurationAttribute(GetEgressProxyConfigurationAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEgressProxyConfigurationAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyGatewayAttribute</em>* is a synchronous operation that returns the current attribute information of the egress proxy gateway in real time after it is called.
     * You can determine the current status of the egress proxy gateway based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the instance is being created, <strong>Active</strong> indicates that the instance is running, <strong>Configuring</strong> indicates that the instance is being reconfigured, and <strong>Inactive</strong> indicates that the instance is stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an egress proxy gateway instance.</p>
     * 
     * @param request GetEgressProxyGatewayAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEgressProxyGatewayAttributeResponse
     */
    public GetEgressProxyGatewayAttributeResponse getEgressProxyGatewayAttributeWithOptions(GetEgressProxyGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayId)) {
            body.put("EgressProxyGatewayId", request.egressProxyGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEgressProxyGatewayAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEgressProxyGatewayAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyGatewayAttribute</em>* is a synchronous operation that returns the current attribute information of the egress proxy gateway in real time after it is called.
     * You can determine the current status of the egress proxy gateway based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the instance is being created, <strong>Active</strong> indicates that the instance is running, <strong>Configuring</strong> indicates that the instance is being reconfigured, and <strong>Inactive</strong> indicates that the instance is stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an egress proxy gateway instance.</p>
     * 
     * @param request GetEgressProxyGatewayAttributeRequest
     * @return GetEgressProxyGatewayAttributeResponse
     */
    public GetEgressProxyGatewayAttributeResponse getEgressProxyGatewayAttribute(GetEgressProxyGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEgressProxyGatewayAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>EgressProxyIpPoolId</code>，可以获取到与该ID关联的出口代理IP池的所有相关信息，包括但不限于名称、描述、网络类型等。请确保提供的<code>EgressProxyIpPoolId</code>是有效的且属于您的账户。</p>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理地址池详细信息</p>
     * 
     * @param request GetEgressProxyIpPoolAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEgressProxyIpPoolAttributeResponse
     */
    public GetEgressProxyIpPoolAttributeResponse getEgressProxyIpPoolAttributeWithOptions(GetEgressProxyIpPoolAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEgressProxyIpPoolAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEgressProxyIpPoolAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>EgressProxyIpPoolId</code>，可以获取到与该ID关联的出口代理IP池的所有相关信息，包括但不限于名称、描述、网络类型等。请确保提供的<code>EgressProxyIpPoolId</code>是有效的且属于您的账户。</p>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理地址池详细信息</p>
     * 
     * @param request GetEgressProxyIpPoolAttributeRequest
     * @return GetEgressProxyIpPoolAttributeResponse
     */
    public GetEgressProxyIpPoolAttributeResponse getEgressProxyIpPoolAttribute(GetEgressProxyIpPoolAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEgressProxyIpPoolAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询出口代理规则组详细信息</p>
     * 
     * @param request GetEgressProxyRuleGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEgressProxyRuleGroupAttributeResponse
     */
    public GetEgressProxyRuleGroupAttributeResponse getEgressProxyRuleGroupAttributeWithOptions(GetEgressProxyRuleGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEgressProxyRuleGroupAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEgressProxyRuleGroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询出口代理规则组详细信息</p>
     * 
     * @param request GetEgressProxyRuleGroupAttributeRequest
     * @return GetEgressProxyRuleGroupAttributeResponse
     */
    public GetEgressProxyRuleGroupAttributeResponse getEgressProxyRuleGroupAttribute(GetEgressProxyRuleGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEgressProxyRuleGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>ListEgressProxyConfigurations</em>* is a synchronous API operation that returns a list of egress proxy configurations that meet the specified conditions in real time after the call. The returned results are paginated by using <strong>MaxResults</strong> and <strong>NextToken</strong>:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, all data has been returned.</li>
     * <li>If <strong>NextToken</strong> has a value, you can use it as the <strong>NextToken</strong> for the next call to continue the query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of egress proxy configurations.</p>
     * 
     * @param request ListEgressProxyConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEgressProxyConfigurationsResponse
     */
    public ListEgressProxyConfigurationsResponse listEgressProxyConfigurationsWithOptions(ListEgressProxyConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationIds)) {
            bodyFlat.put("EgressProxyConfigurationIds", request.egressProxyConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationNames)) {
            bodyFlat.put("EgressProxyConfigurationNames", request.egressProxyConfigurationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEgressProxyConfigurations"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEgressProxyConfigurationsResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>ListEgressProxyConfigurations</em>* is a synchronous API operation that returns a list of egress proxy configurations that meet the specified conditions in real time after the call. The returned results are paginated by using <strong>MaxResults</strong> and <strong>NextToken</strong>:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, all data has been returned.</li>
     * <li>If <strong>NextToken</strong> has a value, you can use it as the <strong>NextToken</strong> for the next call to continue the query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of egress proxy configurations.</p>
     * 
     * @param request ListEgressProxyConfigurationsRequest
     * @return ListEgressProxyConfigurationsResponse
     */
    public ListEgressProxyConfigurationsResponse listEgressProxyConfigurations(ListEgressProxyConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEgressProxyConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于指定每页返回的最大结果数量，默认值为20，最大可设置为1000。</li>
     * <li><code>NextToken</code> 参数用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的结果，默认值为0。</li>
     * <li><code>VpcIds</code> 参数允许通过指定一个或多个VPC ID来过滤查询结果，一次最多支持20个ID。</li>
     * <li><code>EgressProxyGatewayIds</code> 和 <code>EgressProxyGatewayNames</code> 分别允许通过实例ID和实例名称来过滤查询结果，每次请求中每个参数最多支持20个值。</li>
     * <li><code>Status</code> 参数可用于根据实例状态（如Active, Inactive等）进行过滤。</li>
     * <li><code>ResourceGroupId</code> 参数允许按资源组ID过滤查询结果。</li>
     * <li><code>Tags</code> 参数支持基于标签键值对的过滤条件，可以用来更精确地定位特定资源。
     * 请注意，所有数组类型的参数在实际使用时需要按照API的具体要求格式化输入数据。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理网关列表</p>
     * 
     * @param request ListEgressProxyGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEgressProxyGatewaysResponse
     */
    public ListEgressProxyGatewaysResponse listEgressProxyGatewaysWithOptions(ListEgressProxyGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationIds)) {
            bodyFlat.put("EgressProxyConfigurationIds", request.egressProxyConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayIds)) {
            bodyFlat.put("EgressProxyGatewayIds", request.egressProxyGatewayIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayNames)) {
            bodyFlat.put("EgressProxyGatewayNames", request.egressProxyGatewayNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIds)) {
            bodyFlat.put("VpcIds", request.vpcIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEgressProxyGateways"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEgressProxyGatewaysResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于指定每页返回的最大结果数量，默认值为20，最大可设置为1000。</li>
     * <li><code>NextToken</code> 参数用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的结果，默认值为0。</li>
     * <li><code>VpcIds</code> 参数允许通过指定一个或多个VPC ID来过滤查询结果，一次最多支持20个ID。</li>
     * <li><code>EgressProxyGatewayIds</code> 和 <code>EgressProxyGatewayNames</code> 分别允许通过实例ID和实例名称来过滤查询结果，每次请求中每个参数最多支持20个值。</li>
     * <li><code>Status</code> 参数可用于根据实例状态（如Active, Inactive等）进行过滤。</li>
     * <li><code>ResourceGroupId</code> 参数允许按资源组ID过滤查询结果。</li>
     * <li><code>Tags</code> 参数支持基于标签键值对的过滤条件，可以用来更精确地定位特定资源。
     * 请注意，所有数组类型的参数在实际使用时需要按照API的具体要求格式化输入数据。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理网关列表</p>
     * 
     * @param request ListEgressProxyGatewaysRequest
     * @return ListEgressProxyGatewaysResponse
     */
    public ListEgressProxyGatewaysResponse listEgressProxyGateways(ListEgressProxyGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEgressProxyGatewaysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于控制每页返回的结果数量，默认为20，最大值为1000。</li>
     * <li><code>NextToken</code> 用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的记录，默认值为0。</li>
     * <li>可以通过 <code>EgressProxyGatewayIds</code>, <code>EgressProxyIpPoolIds</code>, <code>EgressProxyIpPoolNames</code> 等参数进行过滤查询。</li>
     * <li><code>Status</code> 参数支持按状态过滤结果。</li>
     * <li><code>Tags</code> 参数可用于更细粒度的资源筛选。</li>
     * <li>返回结果中包含 <code>NextToken</code> 以便于继续请求后续页面的数据。</li>
     * <li><code>CreateTime</code> 字段表示的是UTC时间格式。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理地址池列表</p>
     * 
     * @param request ListEgressProxyIpPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEgressProxyIpPoolsResponse
     */
    public ListEgressProxyIpPoolsResponse listEgressProxyIpPoolsWithOptions(ListEgressProxyIpPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayIds)) {
            bodyFlat.put("EgressProxyGatewayIds", request.egressProxyGatewayIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolIds)) {
            bodyFlat.put("EgressProxyIpPoolIds", request.egressProxyIpPoolIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolNames)) {
            bodyFlat.put("EgressProxyIpPoolNames", request.egressProxyIpPoolNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEgressProxyIpPools"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEgressProxyIpPoolsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于控制每页返回的结果数量，默认为20，最大值为1000。</li>
     * <li><code>NextToken</code> 用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的记录，默认值为0。</li>
     * <li>可以通过 <code>EgressProxyGatewayIds</code>, <code>EgressProxyIpPoolIds</code>, <code>EgressProxyIpPoolNames</code> 等参数进行过滤查询。</li>
     * <li><code>Status</code> 参数支持按状态过滤结果。</li>
     * <li><code>Tags</code> 参数可用于更细粒度的资源筛选。</li>
     * <li>返回结果中包含 <code>NextToken</code> 以便于继续请求后续页面的数据。</li>
     * <li><code>CreateTime</code> 字段表示的是UTC时间格式。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询出口代理地址池列表</p>
     * 
     * @param request ListEgressProxyIpPoolsRequest
     * @return ListEgressProxyIpPoolsResponse
     */
    public ListEgressProxyIpPoolsResponse listEgressProxyIpPools(ListEgressProxyIpPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEgressProxyIpPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询出口代理规则组列表</p>
     * 
     * @param request ListEgressProxyRuleGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEgressProxyRuleGroupsResponse
     */
    public ListEgressProxyRuleGroupsResponse listEgressProxyRuleGroupsWithOptions(ListEgressProxyRuleGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupIds)) {
            bodyFlat.put("EgressProxyRuleGroupIds", request.egressProxyRuleGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupNames)) {
            bodyFlat.put("EgressProxyRuleGroupNames", request.egressProxyRuleGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEgressProxyRuleGroups"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEgressProxyRuleGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询出口代理规则组列表</p>
     * 
     * @param request ListEgressProxyRuleGroupsRequest
     * @return ListEgressProxyRuleGroupsResponse
     */
    public ListEgressProxyRuleGroupsResponse listEgressProxyRuleGroups(ListEgressProxyRuleGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEgressProxyRuleGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags bound to the specified resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags bound to the specified resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Shifts a resource to another resource group. After the shift, the resource belongs to the new resource group. For valid values of the ResourceType parameter, see the metric description.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a resource belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Shifts a resource to another resource group. After the shift, the resource belongs to the new resource group. For valid values of the ResourceType parameter, see the metric description.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a resource belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从出口代理地址池移除IP地址</p>
     * 
     * @param request RemoveIpAddressesFromEgressProxyIpPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveIpAddressesFromEgressProxyIpPoolResponse
     */
    public RemoveIpAddressesFromEgressProxyIpPoolResponse removeIpAddressesFromEgressProxyIpPoolWithOptions(RemoveIpAddressesFromEgressProxyIpPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIpAddressesFromEgressProxyIpPool"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIpAddressesFromEgressProxyIpPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从出口代理地址池移除IP地址</p>
     * 
     * @param request RemoveIpAddressesFromEgressProxyIpPoolRequest
     * @return RemoveIpAddressesFromEgressProxyIpPoolResponse
     */
    public RemoveIpAddressesFromEgressProxyIpPoolResponse removeIpAddressesFromEgressProxyIpPool(RemoveIpAddressesFromEgressProxyIpPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeIpAddressesFromEgressProxyIpPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to a specified list of resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to a specified list of resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from the specified resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            bodyFlat.put("TagKey", request.tagKey);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from the specified resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新出口代理配置属性</p>
     * 
     * @param request UpdateEgressProxyConfigurationAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEgressProxyConfigurationAttributeResponse
     */
    public UpdateEgressProxyConfigurationAttributeResponse updateEgressProxyConfigurationAttributeWithOptions(UpdateEgressProxyConfigurationAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRulePhaseActions)) {
            bodyFlat.put("DefaultRulePhaseActions", request.defaultRulePhaseActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationId)) {
            body.put("EgressProxyConfigurationId", request.egressProxyConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyConfigurationName)) {
            body.put("EgressProxyConfigurationName", request.egressProxyConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroups)) {
            bodyFlat.put("EgressProxyRuleGroups", request.egressProxyRuleGroups);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEgressProxyConfigurationAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEgressProxyConfigurationAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新出口代理配置属性</p>
     * 
     * @param request UpdateEgressProxyConfigurationAttributeRequest
     * @return UpdateEgressProxyConfigurationAttributeResponse
     */
    public UpdateEgressProxyConfigurationAttributeResponse updateEgressProxyConfigurationAttribute(UpdateEgressProxyConfigurationAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEgressProxyConfigurationAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改出口代理网关属性</p>
     * 
     * @param request UpdateEgressProxyGatewayAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEgressProxyGatewayAttributeResponse
     */
    public UpdateEgressProxyGatewayAttributeResponse updateEgressProxyGatewayAttributeWithOptions(UpdateEgressProxyGatewayAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addListenerProperties)) {
            bodyFlat.put("AddListenerProperties", request.addListenerProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultEgressProxyIpPoolId)) {
            body.put("DefaultEgressProxyIpPoolId", request.defaultEgressProxyIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayId)) {
            body.put("EgressProxyGatewayId", request.egressProxyGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyGatewayName)) {
            body.put("EgressProxyGatewayName", request.egressProxyGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeListenerProperties)) {
            bodyFlat.put("RemoveListenerProperties", request.removeListenerProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsInterceptProperties)) {
            bodyFlat.put("TlsInterceptProperties", request.tlsInterceptProperties);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEgressProxyGatewayAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEgressProxyGatewayAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改出口代理网关属性</p>
     * 
     * @param request UpdateEgressProxyGatewayAttributeRequest
     * @return UpdateEgressProxyGatewayAttributeResponse
     */
    public UpdateEgressProxyGatewayAttributeResponse updateEgressProxyGatewayAttribute(UpdateEgressProxyGatewayAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEgressProxyGatewayAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>EgressProxyIpPoolId</code> 是必填参数，用来指定要更新的出口地址池ID。</li>
     * <li><code>DryRun</code> 参数可以设置为 <code>true</code> 来预检此次请求而不实际执行更改，默认值为 <code>false</code>。</li>
     * <li><code>Scheduler</code> 和 <code>HashFactor</code> 参数用于定义出口IP的选择逻辑及相关的哈希因子，可根据具体需求进行设置。</li>
     * <li>其他参数如 <code>EgressProxyIpPoolName</code>, <code>Description</code> 等均为可选项，提供给用户根据需要自定义出口地址池的名字和描述等信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新出口代理地址池属性</p>
     * 
     * @param request UpdateEgressProxyIpPoolAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEgressProxyIpPoolAttributeResponse
     */
    public UpdateEgressProxyIpPoolAttributeResponse updateEgressProxyIpPoolAttributeWithOptions(UpdateEgressProxyIpPoolAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolName)) {
            body.put("EgressProxyIpPoolName", request.egressProxyIpPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashFactor)) {
            body.put("HashFactor", request.hashFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashHeaderName)) {
            body.put("HashHeaderName", request.hashHeaderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            body.put("Scheduler", request.scheduler);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEgressProxyIpPoolAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEgressProxyIpPoolAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>EgressProxyIpPoolId</code> 是必填参数，用来指定要更新的出口地址池ID。</li>
     * <li><code>DryRun</code> 参数可以设置为 <code>true</code> 来预检此次请求而不实际执行更改，默认值为 <code>false</code>。</li>
     * <li><code>Scheduler</code> 和 <code>HashFactor</code> 参数用于定义出口IP的选择逻辑及相关的哈希因子，可根据具体需求进行设置。</li>
     * <li>其他参数如 <code>EgressProxyIpPoolName</code>, <code>Description</code> 等均为可选项，提供给用户根据需要自定义出口地址池的名字和描述等信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新出口代理地址池属性</p>
     * 
     * @param request UpdateEgressProxyIpPoolAttributeRequest
     * @return UpdateEgressProxyIpPoolAttributeResponse
     */
    public UpdateEgressProxyIpPoolAttributeResponse updateEgressProxyIpPoolAttribute(UpdateEgressProxyIpPoolAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEgressProxyIpPoolAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新出口代理规则组属性</p>
     * 
     * @param request UpdateEgressProxyRuleGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEgressProxyRuleGroupAttributeResponse
     */
    public UpdateEgressProxyRuleGroupAttributeResponse updateEgressProxyRuleGroupAttributeWithOptions(UpdateEgressProxyRuleGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyIpPoolId)) {
            body.put("EgressProxyIpPoolId", request.egressProxyIpPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupName)) {
            body.put("EgressProxyRuleGroupName", request.egressProxyRuleGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEgressProxyRuleGroupAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEgressProxyRuleGroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新出口代理规则组属性</p>
     * 
     * @param request UpdateEgressProxyRuleGroupAttributeRequest
     * @return UpdateEgressProxyRuleGroupAttributeResponse
     */
    public UpdateEgressProxyRuleGroupAttributeResponse updateEgressProxyRuleGroupAttribute(UpdateEgressProxyRuleGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEgressProxyRuleGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新出口代理规则属性</p>
     * 
     * @param request UpdateEgressProxyRulesAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEgressProxyRulesAttributeResponse
     */
    public UpdateEgressProxyRulesAttributeResponse updateEgressProxyRulesAttributeWithOptions(UpdateEgressProxyRulesAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRuleGroupId)) {
            body.put("EgressProxyRuleGroupId", request.egressProxyRuleGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.egressProxyRules)) {
            bodyFlat.put("EgressProxyRules", request.egressProxyRules);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEgressProxyRulesAttribute"),
            new TeaPair("version", "2026-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEgressProxyRulesAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新出口代理规则属性</p>
     * 
     * @param request UpdateEgressProxyRulesAttributeRequest
     * @return UpdateEgressProxyRulesAttributeResponse
     */
    public UpdateEgressProxyRulesAttributeResponse updateEgressProxyRulesAttribute(UpdateEgressProxyRulesAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEgressProxyRulesAttributeWithOptions(request, runtime);
    }
}
