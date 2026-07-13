// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605;

import com.aliyun.tea.*;
import com.aliyun.agentteams20260605.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentteams", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>绑定上游身份提供商</p>
     * 
     * @param request BindIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindIdentityProviderResponse
     */
    public BindIdentityProviderResponse bindIdentityProviderWithOptions(BindIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            query.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpMetadata)) {
            query.put("IdpMetadata", request.idpMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginEnabled)) {
            query.put("LoginEnabled", request.loginEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncEnabled)) {
            query.put("SyncEnabled", request.syncEnabled);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindIdentityProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定上游身份提供商</p>
     * 
     * @param request BindIdentityProviderRequest
     * @return BindIdentityProviderResponse
     */
    public BindIdentityProviderResponse bindIdentityProvider(BindIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于为特定的AgentTeams实例创建公网NAT网关，并自动完成EIP申请、绑定以及SNAT规则的设置。</li>
     * <li>接口调用后将返回一个异步任务ID，实际的NAT网关、EIP及SNAT资源ID会在异步任务完成后通过任务结果提供。</li>
     * <li>NAT网关名称由系统自动生成，格式为<code>magic-create-for-vpc-{vpcId}</code>。</li>
     * <li>支持GET和POST方法进行请求。</li>
     * <li><code>eipBandwidth</code>参数指定了自动申请EIP时的带宽大小，默认值为5Mbps，范围在1-200Mbps之间。</li>
     * <li>如果<code>instanceId</code>为空或无效，或者提供的<code>eipBandwidth</code>不在允许范围内，API将返回错误响应。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>为指定AgentTeams实例异步开通并配置阿里云公网NAT网关。</p>
     * 
     * @param request ConfigureNatGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureNatGatewayResponse
     */
    public ConfigureNatGatewayResponse configureNatGatewayWithOptions(ConfigureNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipAllocationId)) {
            query.put("EipAllocationId", request.eipAllocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayInstanceId)) {
            query.put("NatGatewayInstanceId", request.natGatewayInstanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureNatGateway"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureNatGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于为特定的AgentTeams实例创建公网NAT网关，并自动完成EIP申请、绑定以及SNAT规则的设置。</li>
     * <li>接口调用后将返回一个异步任务ID，实际的NAT网关、EIP及SNAT资源ID会在异步任务完成后通过任务结果提供。</li>
     * <li>NAT网关名称由系统自动生成，格式为<code>magic-create-for-vpc-{vpcId}</code>。</li>
     * <li>支持GET和POST方法进行请求。</li>
     * <li><code>eipBandwidth</code>参数指定了自动申请EIP时的带宽大小，默认值为5Mbps，范围在1-200Mbps之间。</li>
     * <li>如果<code>instanceId</code>为空或无效，或者提供的<code>eipBandwidth</code>不在允许范围内，API将返回错误响应。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>为指定AgentTeams实例异步开通并配置阿里云公网NAT网关。</p>
     * 
     * @param request ConfigureNatGatewayRequest
     * @return ConfigureNatGatewayResponse
     */
    public ConfigureNatGatewayResponse configureNatGateway(ConfigureNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureNatGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建凭证</p>
     * 
     * @param request CreateCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredentialWithOptions(CreateCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCredential"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建凭证</p>
     * 
     * @param request CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过表单参数或 query 参数传递请求信息。</li>
     * <li><code>instanceSpec</code> 和 <code>networkType</code> 等部分参数有默认值，若未指定则使用默认值。</li>
     * <li>必须提供 <code>instanceName</code>, <code>regionId</code>, <code>vpcId</code>, 和 <code>vSwitchId</code> 参数。</li>
     * <li><code>networkType</code> 支持三种选项：<code>PRIVATE_PUBNET</code>, <code>PRIVATE_NET</code>, <code>PUB_NET</code>，默认为 <code>PRIVATE_NET</code>。</li>
     * <li>如果指定了 <code>zoneId</code>，则会尝试在该可用区创建实例；否则将根据系统策略选择合适的可用区。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建指定配置的集群实例。</p>
     * 
     * @param tmpReq CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateInstanceShrinkRequest request = new CreateInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.zones)) {
            request.zonesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.zones, "Zones", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zonesShrink)) {
            query.put("Zones", request.zonesShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("PaymentType", request.paymentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过表单参数或 query 参数传递请求信息。</li>
     * <li><code>instanceSpec</code> 和 <code>networkType</code> 等部分参数有默认值，若未指定则使用默认值。</li>
     * <li>必须提供 <code>instanceName</code>, <code>regionId</code>, <code>vpcId</code>, 和 <code>vSwitchId</code> 参数。</li>
     * <li><code>networkType</code> 支持三种选项：<code>PRIVATE_PUBNET</code>, <code>PRIVATE_NET</code>, <code>PUB_NET</code>，默认为 <code>PRIVATE_NET</code>。</li>
     * <li>如果指定了 <code>zoneId</code>，则会尝试在该可用区创建实例；否则将根据系统策略选择合适的可用区。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建指定配置的集群实例。</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建MCP</p>
     * 
     * @param tmpReq CreateMcpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcpResponse
     */
    public CreateMcpResponse createMcpWithOptions(CreateMcpRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMcpShrinkRequest request = new CreateMcpShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addresses)) {
            request.addressesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addresses, "Addresses", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressesShrink)) {
            body.put("Addresses", request.addressesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            body.put("AuthConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authEnabled)) {
            body.put("AuthEnabled", request.authEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            body.put("CreateType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swaggerConfig)) {
            body.put("SwaggerConfig", request.swaggerConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcp"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建MCP</p>
     * 
     * @param request CreateMcpRequest
     * @return CreateMcpResponse
     */
    public CreateMcpResponse createMcp(CreateMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param tmpReq CreateModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelResponse
     */
    public CreateModelResponse createModelWithOptions(CreateModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateModelShrinkRequest request = new CreateModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocols)) {
            request.protocolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocols, "Protocols", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolsShrink)) {
            body.put("Protocols", request.protocolsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("Provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModel"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param request CreateModelRequest
     * @return CreateModelResponse
     */
    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param tmpReq CreateModelProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelProviderResponse
     */
    public CreateModelProviderResponse createModelProviderWithOptions(CreateModelProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateModelProviderShrinkRequest request = new CreateModelProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiKeys)) {
            request.apiKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiKeys, "ApiKeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocols)) {
            request.protocolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocols, "Protocols", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiKeysShrink)) {
            body.put("ApiKeys", request.apiKeysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolsShrink)) {
            body.put("Protocols", request.protocolsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            body.put("Provider", request.provider);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建模型</p>
     * 
     * @param request CreateModelProviderRequest
     * @return CreateModelProviderResponse
     */
    public CreateModelProviderResponse createModelProvider(CreateModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>当前controller使用的是普通参数绑定，不是<code>@RequestBody</code>，因此参数更适合按query/form方式传递。</li>
     * <li><code>domain</code>字段会在服务端进行<code>trim + lowerCase</code>处理。</li>
     * <li><code>query</code>和<code>headers</code>必须是JSON object字符串格式，不能为数组。</li>
     * <li>创建操作仅将数据保存到数据库；只有在更新时，如果满足<code>ELEMENT/MATRIX + AI_GATEWAY + INTERNET</code>且域名或证书发生变化，才会触发AI Gateway域名同步逻辑。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建指定实例的Endpoint，支持多种组件和网关类型。</p>
     * 
     * @param request CreateServiceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceEndpointResponse
     */
    public CreateServiceEndpointResponse createServiceEndpointWithOptions(CreateServiceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.component)) {
            query.put("Component", request.component);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceEndpoint"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>当前controller使用的是普通参数绑定，不是<code>@RequestBody</code>，因此参数更适合按query/form方式传递。</li>
     * <li><code>domain</code>字段会在服务端进行<code>trim + lowerCase</code>处理。</li>
     * <li><code>query</code>和<code>headers</code>必须是JSON object字符串格式，不能为数组。</li>
     * <li>创建操作仅将数据保存到数据库；只有在更新时，如果满足<code>ELEMENT/MATRIX + AI_GATEWAY + INTERNET</code>且域名或证书发生变化，才会触发AI Gateway域名同步逻辑。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于创建指定实例的Endpoint，支持多种组件和网关类型。</p>
     * 
     * @param request CreateServiceEndpointRequest
     * @return CreateServiceEndpointResponse
     */
    public CreateServiceEndpointResponse createServiceEndpoint(CreateServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建团队</p>
     * 
     * @param tmpReq CreateTeamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeamWithOptions(CreateTeamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTeamShrinkRequest request = new CreateTeamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.teamMembers)) {
            request.teamMembersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.teamMembers, "TeamMembers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminName)) {
            query.put("AdminName", request.adminName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamMembersShrink)) {
            query.put("TeamMembers", request.teamMembersShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTeam"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建团队</p>
     * 
     * @param request CreateTeamRequest
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeam(CreateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTeamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMethod)) {
            query.put("AuthMethod", request.authMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Worker</p>
     * 
     * @param tmpReq CreateWorkerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkerResponse
     */
    public CreateWorkerResponse createWorkerWithOptions(CreateWorkerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkerShrinkRequest request = new CreateWorkerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channels)) {
            request.channelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channels, "Channels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentials)) {
            request.credentialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentials, "Credentials", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groups)) {
            request.groupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groups, "Groups", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.limitConfig)) {
            request.limitConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.limitConfig, "LimitConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mcpServers)) {
            request.mcpServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mcpServers, "McpServers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.model)) {
            request.modelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.model, "Model", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skills)) {
            request.skillsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skills, "Skills", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subagents)) {
            request.subagentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subagents, "Subagents", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agents)) {
            query.put("Agents", request.agents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelsShrink)) {
            query.put("Channels", request.channelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupsShrink)) {
            query.put("Groups", request.groupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitConfigShrink)) {
            query.put("LimitConfig", request.limitConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpServersShrink)) {
            query.put("McpServers", request.mcpServersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelShrink)) {
            query.put("Model", request.modelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillsShrink)) {
            query.put("Skills", request.skillsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soul)) {
            query.put("Soul", request.soul);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subagentsShrink)) {
            query.put("Subagents", request.subagentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialsShrink)) {
            body.put("Credentials", request.credentialsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorker"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Worker</p>
     * 
     * @param request CreateWorkerRequest
     * @return CreateWorkerResponse
     */
    public CreateWorkerResponse createWorker(CreateWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Worker本地纳管启动Token</p>
     * 
     * @param request CreateWorkerBootstrapTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkerBootstrapTokenResponse
     */
    public CreateWorkerBootstrapTokenResponse createWorkerBootstrapTokenWithOptions(CreateWorkerBootstrapTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkerBootstrapToken"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkerBootstrapTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Worker本地纳管启动Token</p>
     * 
     * @param request CreateWorkerBootstrapTokenRequest
     * @return CreateWorkerBootstrapTokenResponse
     */
    public CreateWorkerBootstrapTokenResponse createWorkerBootstrapToken(CreateWorkerBootstrapTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkerBootstrapTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除凭证</p>
     * 
     * @param request DeleteCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredentialWithOptions(DeleteCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredential"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除凭证</p>
     * 
     * @param request DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持<code>GET</code>和<code>POST</code>方法，两者语义相同。</li>
     * <li>使用<code>POST</code>方法时，参数通过<code>application/x-www-form-urlencoded</code>格式提交。</li>
     * <li>当前实例状态为<code>CREATING</code>、<code>DELETING</code>或<code>DELETED</code>时，请求将被拒绝。</li>
     * <li>成功调用后，实例状态将首先更改为<code>DELETING</code>，实际的资源清理过程由后台异步执行。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于释放指定的AgentTeams实例，并清理相关资源。</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持<code>GET</code>和<code>POST</code>方法，两者语义相同。</li>
     * <li>使用<code>POST</code>方法时，参数通过<code>application/x-www-form-urlencoded</code>格式提交。</li>
     * <li>当前实例状态为<code>CREATING</code>、<code>DELETING</code>或<code>DELETED</code>时，请求将被拒绝。</li>
     * <li>成功调用后，实例状态将首先更改为<code>DELETING</code>，实际的资源清理过程由后台异步执行。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于释放指定的AgentTeams实例，并清理相关资源。</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除MCP</p>
     * 
     * @param request DeleteMcpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcpResponse
     */
    public DeleteMcpResponse deleteMcpWithOptions(DeleteMcpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcp"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除MCP</p>
     * 
     * @param request DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    public DeleteMcpResponse deleteMcp(DeleteMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除模型</p>
     * 
     * @param request DeleteModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModel"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除模型</p>
     * 
     * @param request DeleteModelRequest
     * @return DeleteModelResponse
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除模型供应商</p>
     * 
     * @param request DeleteModelProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelProviderResponse
     */
    public DeleteModelProviderResponse deleteModelProviderWithOptions(DeleteModelProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除模型供应商</p>
     * 
     * @param request DeleteModelProviderRequest
     * @return DeleteModelProviderResponse
     */
    public DeleteModelProviderResponse deleteModelProvider(DeleteModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过GET或POST方法调用。</li>
     * <li>如果目标endpoint是<code>WORKER</code>类型，系统将自动清理与之关联的APIG/AI Gateway云资源及KubeOne worker service配置。</li>
     * <li>请求参数必须包含<code>instanceId</code>和<code>endpointId</code>，且不能为空。</li>
     * <li>成功响应会返回HTTP状态码200以及成功标志；错误响应则根据具体情况返回相应的HTTP状态码（如400、404、409）及错误信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于删除指定AgentTeams实例下的endpoint，并清理相关资源。</p>
     * 
     * @param request DeleteServiceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceEndpointResponse
     */
    public DeleteServiceEndpointResponse deleteServiceEndpointWithOptions(DeleteServiceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceEndpoint"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过GET或POST方法调用。</li>
     * <li>如果目标endpoint是<code>WORKER</code>类型，系统将自动清理与之关联的APIG/AI Gateway云资源及KubeOne worker service配置。</li>
     * <li>请求参数必须包含<code>instanceId</code>和<code>endpointId</code>，且不能为空。</li>
     * <li>成功响应会返回HTTP状态码200以及成功标志；错误响应则根据具体情况返回相应的HTTP状态码（如400、404、409）及错误信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于删除指定AgentTeams实例下的endpoint，并清理相关资源。</p>
     * 
     * @param request DeleteServiceEndpointRequest
     * @return DeleteServiceEndpointResponse
     */
    public DeleteServiceEndpointResponse deleteServiceEndpoint(DeleteServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除团队</p>
     * 
     * @param request DeleteTeamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeamWithOptions(DeleteTeamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTeam"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除团队</p>
     * 
     * @param request DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(DeleteTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTeamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Worker</p>
     * 
     * @param request DeleteWorkerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkerResponse
     */
    public DeleteWorkerResponse deleteWorkerWithOptions(DeleteWorkerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorker"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Worker</p>
     * 
     * @param request DeleteWorkerRequest
     * @return DeleteWorkerResponse
     */
    public DeleteWorkerResponse deleteWorker(DeleteWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询凭证详情</p>
     * 
     * @param request GetCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredentialWithOptions(GetCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredential"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询凭证详情</p>
     * 
     * @param request GetCredentialRequest
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(GetCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定类型的上游身份提供商详情</p>
     * 
     * @param request GetIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProviderWithOptions(GetIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            query.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定类型的上游身份提供商详情</p>
     * 
     * @param request GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li><code>X-Acs-Request-Id</code>为可选项，如果提供，则响应中的<code>requestId</code>将优先使用此值。</li>
     * <li>必须通过<code>instanceId</code>参数指定要查询的实例。</li>
     * <li>成功响应会返回实例的详细配置信息及状态。</li>
     * <li>如果请求失败，根据错误类型返回相应的HTTP状态码及错误消息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过实例ID查询指定实例的详细信息。</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li><code>X-Acs-Request-Id</code>为可选项，如果提供，则响应中的<code>requestId</code>将优先使用此值。</li>
     * <li>必须通过<code>instanceId</code>参数指定要查询的实例。</li>
     * <li>成功响应会返回实例的详细配置信息及状态。</li>
     * <li>如果请求失败，根据错误类型返回相应的HTTP状态码及错误消息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过实例ID查询指定实例的详细信息。</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定AgentTeams实例下的异步任务执行状态。</li>
     * <li>目前仅支持查询与实例生命周期相关的创建实例任务。</li>
     * <li>可通过<code>taskCode</code>参数指定要查询的任务类型，默认为创建实例任务。</li>
     * <li>支持使用<code>maxResults</code>和<code>nextToken</code>进行结果分页。</li>
     * <li>当任务处于暂停(<code>PAUSED</code>)状态时，会返回用户需要采取行动的信息(<code>recoveryMessage</code>)。</li>
     * <li>注意：当前不支持通过<code>taskId</code>直接查询任务状态。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定AgentTeams实例关联的异步任务状态，支持分页。</p>
     * 
     * @param request GetInstanceAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceAsyncTaskResponse
     */
    public GetInstanceAsyncTaskResponse getInstanceAsyncTaskWithOptions(GetInstanceAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCode)) {
            query.put("TaskCode", request.taskCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceAsyncTask"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceAsyncTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定AgentTeams实例下的异步任务执行状态。</li>
     * <li>目前仅支持查询与实例生命周期相关的创建实例任务。</li>
     * <li>可通过<code>taskCode</code>参数指定要查询的任务类型，默认为创建实例任务。</li>
     * <li>支持使用<code>maxResults</code>和<code>nextToken</code>进行结果分页。</li>
     * <li>当任务处于暂停(<code>PAUSED</code>)状态时，会返回用户需要采取行动的信息(<code>recoveryMessage</code>)。</li>
     * <li>注意：当前不支持通过<code>taskId</code>直接查询任务状态。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定AgentTeams实例关联的异步任务状态，支持分页。</p>
     * 
     * @param request GetInstanceAsyncTaskRequest
     * @return GetInstanceAsyncTaskResponse
     */
    public GetInstanceAsyncTaskResponse getInstanceAsyncTask(GetInstanceAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li>必须通过<code>instanceId</code>参数指定实例，后端会根据实例信息生成授权链接。</li>
     * <li>成功响应会返回 RAM 控制台授权链接，不会创建 RAM 角色或策略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取实例 OSS 挂载到 ACS 所需的 RAM 授权链接。</p>
     * 
     * @param request GetInstanceOssMountRamAuthorizeUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceOssMountRamAuthorizeUrlResponse
     */
    public GetInstanceOssMountRamAuthorizeUrlResponse getInstanceOssMountRamAuthorizeUrlWithOptions(GetInstanceOssMountRamAuthorizeUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceOssMountRamAuthorizeUrl"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceOssMountRamAuthorizeUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li>必须通过<code>instanceId</code>参数指定实例，后端会根据实例信息生成授权链接。</li>
     * <li>成功响应会返回 RAM 控制台授权链接，不会创建 RAM 角色或策略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取实例 OSS 挂载到 ACS 所需的 RAM 授权链接。</p>
     * 
     * @param request GetInstanceOssMountRamAuthorizeUrlRequest
     * @return GetInstanceOssMountRamAuthorizeUrlResponse
     */
    public GetInstanceOssMountRamAuthorizeUrlResponse getInstanceOssMountRamAuthorizeUrl(GetInstanceOssMountRamAuthorizeUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceOssMountRamAuthorizeUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询MCP详情</p>
     * 
     * @param request GetMcpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpResponse
     */
    public GetMcpResponse getMcpWithOptions(GetMcpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcp"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询MCP详情</p>
     * 
     * @param request GetMcpRequest
     * @return GetMcpResponse
     */
    public GetMcpResponse getMcp(GetMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模型调用摘要</p>
     * 
     * @param request GetModelInvocationSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelInvocationSummaryResponse
     */
    public GetModelInvocationSummaryResponse getModelInvocationSummaryWithOptions(GetModelInvocationSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelInvocationSummary"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelInvocationSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模型调用摘要</p>
     * 
     * @param request GetModelInvocationSummaryRequest
     * @return GetModelInvocationSummaryResponse
     */
    public GetModelInvocationSummaryResponse getModelInvocationSummary(GetModelInvocationSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelInvocationSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型供应商详情</p>
     * 
     * @param request GetModelProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelProviderResponse
     */
    public GetModelProviderResponse getModelProviderWithOptions(GetModelProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型供应商详情</p>
     * 
     * @param request GetModelProviderRequest
     * @return GetModelProviderResponse
     */
    public GetModelProviderResponse getModelProvider(GetModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过此API，您可以获取特定实例关联的NAT网关配置详情及SNAT规则的状态。该接口支持GET或POST方法调用，并需要提供<code>instanceId</code>作为请求参数来指定要查询的实例。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>instanceId</code>是有效的且属于您的账户。</li>
     * <li>根据返回的状态值（如<code>READY</code>, <code>NEED_CONFIGURE_NAT_GATEWAY</code>, <code>NEED_CONFIGURE_SNAT_RULE</code>），采取相应的操作以完成NAT网关或SNAT规则的配置。</li>
     * <li>当状态为<code>NEED_CONFIGURE_NAT_GATEWAY</code>时，表示当前VPC下没有可用的NAT网关；而<code>NEED_CONFIGURE_SNAT_RULE</code>则意味着虽然存在NAT网关但某些子网CIDR未被SNAT规则覆盖。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定实例的NAT网关及其SNAT规则的配置状态。</p>
     * 
     * @param request GetNatGatewayStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNatGatewayStatusResponse
     */
    public GetNatGatewayStatusResponse getNatGatewayStatusWithOptions(GetNatGatewayStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNatGatewayStatus"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNatGatewayStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过此API，您可以获取特定实例关联的NAT网关配置详情及SNAT规则的状态。该接口支持GET或POST方法调用，并需要提供<code>instanceId</code>作为请求参数来指定要查询的实例。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>instanceId</code>是有效的且属于您的账户。</li>
     * <li>根据返回的状态值（如<code>READY</code>, <code>NEED_CONFIGURE_NAT_GATEWAY</code>, <code>NEED_CONFIGURE_SNAT_RULE</code>），采取相应的操作以完成NAT网关或SNAT规则的配置。</li>
     * <li>当状态为<code>NEED_CONFIGURE_NAT_GATEWAY</code>时，表示当前VPC下没有可用的NAT网关；而<code>NEED_CONFIGURE_SNAT_RULE</code>则意味着虽然存在NAT网关但某些子网CIDR未被SNAT规则覆盖。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定实例的NAT网关及其SNAT规则的配置状态。</p>
     * 
     * @param request GetNatGatewayStatusRequest
     * @return GetNatGatewayStatusResponse
     */
    public GetNatGatewayStatusResponse getNatGatewayStatus(GetNatGatewayStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNatGatewayStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据<code>endpointId</code>查询单个Endpoint的具体配置与状态信息。</li>
     * <li>可选参数<code>instanceId</code>用于验证Endpoint是否属于特定实例。</li>
     * <li>请求方式支持<code>GET</code>和<code>POST</code>，其中<code>GET</code>使用query string传递参数，而<code>POST</code>则可以通过form参数提交。</li>
     * <li>如果<code>endpointId</code>缺失或为空，则会返回<code>InvalidParameter</code>错误。</li>
     * <li>当请求的Endpoint不存在、不属于提供的实例或者不属于当前用户时，将收到相应的资源不存在类错误响应。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定ID的Endpoint详细信息，支持通过实例ID进行校验。</p>
     * 
     * @param request GetServiceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceEndpointResponse
     */
    public GetServiceEndpointResponse getServiceEndpointWithOptions(GetServiceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceEndpoint"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据<code>endpointId</code>查询单个Endpoint的具体配置与状态信息。</li>
     * <li>可选参数<code>instanceId</code>用于验证Endpoint是否属于特定实例。</li>
     * <li>请求方式支持<code>GET</code>和<code>POST</code>，其中<code>GET</code>使用query string传递参数，而<code>POST</code>则可以通过form参数提交。</li>
     * <li>如果<code>endpointId</code>缺失或为空，则会返回<code>InvalidParameter</code>错误。</li>
     * <li>当请求的Endpoint不存在、不属于提供的实例或者不属于当前用户时，将收到相应的资源不存在类错误响应。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定ID的Endpoint详细信息，支持通过实例ID进行校验。</p>
     * 
     * @param request GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    public GetServiceEndpointResponse getServiceEndpoint(GetServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务统计摘要</p>
     * 
     * @param request GetTaskStatsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatsSummaryResponse
     */
    public GetTaskStatsSummaryResponse getTaskStatsSummaryWithOptions(GetTaskStatsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatsSummary"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务统计摘要</p>
     * 
     * @param request GetTaskStatsSummaryRequest
     * @return GetTaskStatsSummaryResponse
     */
    public GetTaskStatsSummaryResponse getTaskStatsSummary(GetTaskStatsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询团队详情</p>
     * 
     * @param request GetTeamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeamWithOptions(GetTeamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTeam"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询团队详情</p>
     * 
     * @param request GetTeamRequest
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeam(GetTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTeamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Token趋势统计</p>
     * 
     * @param request GetTokenTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenTrendResponse
     */
    public GetTokenTrendResponse getTokenTrendWithOptions(GetTokenTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenTrend"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Token趋势统计</p>
     * 
     * @param request GetTokenTrendRequest
     * @return GetTokenTrendResponse
     */
    public GetTokenTrendResponse getTokenTrend(GetTokenTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工具调用分布</p>
     * 
     * @param request GetToolCallDistributionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetToolCallDistributionResponse
     */
    public GetToolCallDistributionResponse getToolCallDistributionWithOptions(GetToolCallDistributionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToolCallDistribution"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetToolCallDistributionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>工具调用分布</p>
     * 
     * @param request GetToolCallDistributionRequest
     * @return GetToolCallDistributionResponse
     */
    public GetToolCallDistributionResponse getToolCallDistribution(GetToolCallDistributionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getToolCallDistributionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户详情</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户详情</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户初始密码</p>
     * 
     * @param request GetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserPasswordResponse
     */
    public GetUserPasswordResponse getUserPasswordWithOptions(GetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPassword"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户初始密码</p>
     * 
     * @param request GetUserPasswordRequest
     * @return GetUserPasswordResponse
     */
    public GetUserPasswordResponse getUserPassword(GetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker详情</p>
     * 
     * @param request GetWorkerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkerResponse
     */
    public GetWorkerResponse getWorkerWithOptions(GetWorkerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorker"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker详情</p>
     * 
     * @param request GetWorkerRequest
     * @return GetWorkerResponse
     */
    public GetWorkerResponse getWorker(GetWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker本地纳管启动选项</p>
     * 
     * @param request GetWorkerBootstrapOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkerBootstrapOptionsResponse
     */
    public GetWorkerBootstrapOptionsResponse getWorkerBootstrapOptionsWithOptions(GetWorkerBootstrapOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkerBootstrapOptions"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkerBootstrapOptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker本地纳管启动选项</p>
     * 
     * @param request GetWorkerBootstrapOptionsRequest
     * @return GetWorkerBootstrapOptionsResponse
     */
    public GetWorkerBootstrapOptionsResponse getWorkerBootstrapOptions(GetWorkerBootstrapOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerBootstrapOptionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker最大可升级版本</p>
     * 
     * @param request GetWorkerMaxVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkerMaxVersionResponse
     */
    public GetWorkerMaxVersionResponse getWorkerMaxVersionWithOptions(GetWorkerMaxVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkerMaxVersion"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkerMaxVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker最大可升级版本</p>
     * 
     * @param request GetWorkerMaxVersionRequest
     * @return GetWorkerMaxVersionResponse
     */
    public GetWorkerMaxVersionResponse getWorkerMaxVersion(GetWorkerMaxVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerMaxVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Worker统计摘要</p>
     * 
     * @param request GetWorkerStatsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkerStatsSummaryResponse
     */
    public GetWorkerStatsSummaryResponse getWorkerStatsSummaryWithOptions(GetWorkerStatsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkerStatsSummary"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkerStatsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Worker统计摘要</p>
     * 
     * @param request GetWorkerStatsSummaryRequest
     * @return GetWorkerStatsSummaryResponse
     */
    public GetWorkerStatsSummaryResponse getWorkerStatsSummary(GetWorkerStatsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerStatsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询凭证列表</p>
     * 
     * @param request ListCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentialsWithOptions(ListCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("NameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentials"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询凭证列表</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询上游身份提供商绑定列表</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProvidersWithOptions(ListIdentityProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviders"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询上游身份提供商绑定列表</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentityProvidersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>分页规则</strong>：<ul>
     * <li>如果传了 <code>NextToken</code>，优先按 <code>NextToken</code> 解析 offset。</li>
     * <li>如果没传 <code>NextToken</code>，则使用 <code>skip</code>。</li>
     * <li><code>MaxResults</code> 的取值范围为 1 到 100，非法值会返回 <code>400</code> 错误。</li>
     * <li><code>NextToken</code> 必须是有效的整数，否则会返回 <code>400</code> 错误。</li>
     * <li><code>skip</code> 的值不能小于 0，否则会返回 <code>400</code> 错误。</li>
     * </ul>
     * </li>
     * <li><strong>排序规则</strong>：列表按创建时间倒序返回。</li>
     * <li><strong>请求参数</strong>：<ul>
     * <li><code>instanceName</code>：实例名称，支持模糊匹配。</li>
     * <li><code>status</code>：实例状态。</li>
     * <li><code>MaxResults</code>：分页大小，默认值为 20。</li>
     * <li><code>NextToken</code>：下一页游标。</li>
     * <li><code>skip</code>：跳过的记录数，默认值为 0。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于查询符合条件的实例列表，并支持分页和模糊匹配。</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2026-06-05"),
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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>分页规则</strong>：<ul>
     * <li>如果传了 <code>NextToken</code>，优先按 <code>NextToken</code> 解析 offset。</li>
     * <li>如果没传 <code>NextToken</code>，则使用 <code>skip</code>。</li>
     * <li><code>MaxResults</code> 的取值范围为 1 到 100，非法值会返回 <code>400</code> 错误。</li>
     * <li><code>NextToken</code> 必须是有效的整数，否则会返回 <code>400</code> 错误。</li>
     * <li><code>skip</code> 的值不能小于 0，否则会返回 <code>400</code> 错误。</li>
     * </ul>
     * </li>
     * <li><strong>排序规则</strong>：列表按创建时间倒序返回。</li>
     * <li><strong>请求参数</strong>：<ul>
     * <li><code>instanceName</code>：实例名称，支持模糊匹配。</li>
     * <li><code>status</code>：实例状态。</li>
     * <li><code>MaxResults</code>：分页大小，默认值为 20。</li>
     * <li><code>NextToken</code>：下一页游标。</li>
     * <li><code>skip</code>：跳过的记录数，默认值为 0。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于查询符合条件的实例列表，并支持分页和模糊匹配。</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有Magic实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试模型供应商和模型</p>
     * 
     * @param request ListMcpToolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpToolsResponse
     */
    public ListMcpToolsResponse listMcpToolsWithOptions(ListMcpToolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcpTools"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpToolsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有Magic实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试模型供应商和模型</p>
     * 
     * @param request ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    public ListMcpToolsResponse listMcpTools(ListMcpToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcpToolsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询MCP列表</p>
     * 
     * @param request ListMcpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpsResponse
     */
    public ListMcpsResponse listMcpsWithOptions(ListMcpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcps"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询MCP列表</p>
     * 
     * @param request ListMcpsRequest
     * @return ListMcpsResponse
     */
    public ListMcpsResponse listMcps(ListMcpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型供应商列表</p>
     * 
     * @param request ListModelProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProvidersResponse
     */
    public ListModelProvidersResponse listModelProvidersWithOptions(ListModelProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProviders"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProvidersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型供应商列表</p>
     * 
     * @param request ListModelProvidersRequest
     * @return ListModelProvidersResponse
     */
    public ListModelProvidersResponse listModelProviders(ListModelProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelProvidersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型列表</p>
     * 
     * @param request ListModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelsResponse
     */
    public ListModelsResponse listModelsWithOptions(ListModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            query.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModels"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询模型列表</p>
     * 
     * @param request ListModelsRequest
     * @return ListModelsResponse
     */
    public ListModelsResponse listModels(ListModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>instanceId</code> 是必填参数，用来指定 AgentTeams 实例 ID。</li>
     * <li>可选参数包括 <code>component</code>, <code>serviceName</code>, <code>networkType</code>, 和 <code>domainType</code>，用于进一步筛选返回的端点列表。</li>
     * <li>不支持通过 <code>status</code> 参数进行筛选。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>此API用于查询指定实例下的AI网关端点列表。</p>
     * 
     * @param request ListServiceEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceEndpointsResponse
     */
    public ListServiceEndpointsResponse listServiceEndpointsWithOptions(ListServiceEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.component)) {
            query.put("Component", request.component);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceEndpoints"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceEndpointsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>instanceId</code> 是必填参数，用来指定 AgentTeams 实例 ID。</li>
     * <li>可选参数包括 <code>component</code>, <code>serviceName</code>, <code>networkType</code>, 和 <code>domainType</code>，用于进一步筛选返回的端点列表。</li>
     * <li>不支持通过 <code>status</code> 参数进行筛选。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>此API用于查询指定实例下的AI网关端点列表。</p>
     * 
     * @param request ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    public ListServiceEndpointsResponse listServiceEndpoints(ListServiceEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取与指定AgentTeams实例相关的SSL证书列表。</li>
     * <li>可通过<code>certNameLike</code>和<code>domainName</code>参数进行模糊搜索或精确匹配证书名称及绑定域名。</li>
     * <li>分页参数<code>pageNumber</code>和<code>pageSize</code>允许客户端控制返回结果的数量和页码，默认每页显示10条记录。</li>
     * <li>成功响应将包含请求ID、是否成功标志、错误代码（如果有的话）、HTTP状态码、本次请求的最大结果数、下一页标记（如果有更多数据的话）、总证书数量以及具体的证书详情列表。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询用户侧APIG可用的SSL证书列表</p>
     * 
     * @param request ListSslCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSslCertsResponse
     */
    public ListSslCertsResponse listSslCertsWithOptions(ListSslCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSslCerts"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSslCertsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取与指定AgentTeams实例相关的SSL证书列表。</li>
     * <li>可通过<code>certNameLike</code>和<code>domainName</code>参数进行模糊搜索或精确匹配证书名称及绑定域名。</li>
     * <li>分页参数<code>pageNumber</code>和<code>pageSize</code>允许客户端控制返回结果的数量和页码，默认每页显示10条记录。</li>
     * <li>成功响应将包含请求ID、是否成功标志、错误代码（如果有的话）、HTTP状态码、本次请求的最大结果数、下一页标记（如果有更多数据的话）、总证书数量以及具体的证书详情列表。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询用户侧APIG可用的SSL证书列表</p>
     * 
     * @param request ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    public ListSslCertsResponse listSslCerts(ListSslCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSslCertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>团队详情列表</p>
     * 
     * @param request ListTeamDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamDetailsResponse
     */
    public ListTeamDetailsResponse listTeamDetailsWithOptions(ListTeamDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeamDetails"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>团队详情列表</p>
     * 
     * @param request ListTeamDetailsRequest
     * @return ListTeamDetailsResponse
     */
    public ListTeamDetailsResponse listTeamDetails(ListTeamDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Team任务列表</p>
     * 
     * @param request ListTeamTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamTasksResponse
     */
    public ListTeamTasksResponse listTeamTasksWithOptions(ListTeamTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.team)) {
            query.put("Team", request.team);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeamTasks"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Team任务列表</p>
     * 
     * @param request ListTeamTasksRequest
     * @return ListTeamTasksResponse
     */
    public ListTeamTasksResponse listTeamTasks(ListTeamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询团队列表</p>
     * 
     * @param request ListTeamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeamsWithOptions(ListTeamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("NameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeams"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询团队列表</p>
     * 
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户列表</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("NameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户列表</p>
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
     * <p>Worker统计详情列表</p>
     * 
     * @param request ListWorkerStatsDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkerStatsDetailsResponse
     */
    public ListWorkerStatsDetailsResponse listWorkerStatsDetailsWithOptions(ListWorkerStatsDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkerStatsDetails"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkerStatsDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Worker统计详情列表</p>
     * 
     * @param request ListWorkerStatsDetailsRequest
     * @return ListWorkerStatsDetailsResponse
     */
    public ListWorkerStatsDetailsResponse listWorkerStatsDetails(ListWorkerStatsDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkerStatsDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker列表</p>
     * 
     * @param tmpReq ListWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkersResponse
     */
    public ListWorkersResponse listWorkersWithOptions(ListWorkersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkersShrinkRequest request = new ListWorkersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.group)) {
            request.groupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.group, "Group", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            query.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupShrink)) {
            query.put("Group", request.groupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcp)) {
            query.put("Mcp", request.mcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelProvider)) {
            query.put("ModelProvider", request.modelProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("NameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkers"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Worker列表</p>
     * 
     * @param request ListWorkersRequest
     * @return ListWorkersResponse
     */
    public ListWorkersResponse listWorkers(ListWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新CMS工作空间</p>
     * 
     * @param request PutCmsWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutCmsWorkspaceResponse
     */
    public PutCmsWorkspaceResponse putCmsWorkspaceWithOptions(PutCmsWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutCmsWorkspace"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutCmsWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新CMS工作空间</p>
     * 
     * @param request PutCmsWorkspaceRequest
     * @return PutCmsWorkspaceResponse
     */
    public PutCmsWorkspaceResponse putCmsWorkspace(PutCmsWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCmsWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询特定<code>instanceId</code>下的不同目标（如<code>INSTANCE</code>、<code>WORKER</code>、<code>TEAM</code>、<code>HUMAN</code>）的功能特性状态。</li>
     * <li><code>targetScope</code>参数定义了查询的目标类型，根据不同的<code>targetScope</code>值，可能需要提供额外的<code>resourceName</code>参数来指定具体的资源名称。</li>
     * <li>如果提供了<code>featureCodes</code>列表，则返回这些特定功能特性的状态；否则，将返回指定<code>targetScope</code>下所有功能特性的状态。</li>
     * <li>当使用<code>WORKER</code>、<code>TEAM</code>或<code>HUMAN</code>作为<code>targetScope</code>时，请确保正确填写对应的<code>resourceName</code>。</li>
     * <li>对于<code>INSTANCE</code>级别的查询，无需提供<code>resourceName</code>。</li>
     * <li>特性支持情况受基础版本、工作器版本等因素影响，并通过<code>unsupportedReasonCode</code>和<code>unsupportedReason</code>字段给出不支持的具体原因。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定实例、worker、团队或个人的功能特性状态。</p>
     * 
     * @param request QueryFeaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFeaturesResponse
     */
    public QueryFeaturesResponse queryFeaturesWithOptions(QueryFeaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetScope)) {
            query.put("TargetScope", request.targetScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFeatures"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFeaturesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询特定<code>instanceId</code>下的不同目标（如<code>INSTANCE</code>、<code>WORKER</code>、<code>TEAM</code>、<code>HUMAN</code>）的功能特性状态。</li>
     * <li><code>targetScope</code>参数定义了查询的目标类型，根据不同的<code>targetScope</code>值，可能需要提供额外的<code>resourceName</code>参数来指定具体的资源名称。</li>
     * <li>如果提供了<code>featureCodes</code>列表，则返回这些特定功能特性的状态；否则，将返回指定<code>targetScope</code>下所有功能特性的状态。</li>
     * <li>当使用<code>WORKER</code>、<code>TEAM</code>或<code>HUMAN</code>作为<code>targetScope</code>时，请确保正确填写对应的<code>resourceName</code>。</li>
     * <li>对于<code>INSTANCE</code>级别的查询，无需提供<code>resourceName</code>。</li>
     * <li>特性支持情况受基础版本、工作器版本等因素影响，并通过<code>unsupportedReasonCode</code>和<code>unsupportedReason</code>字段给出不支持的具体原因。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定实例、worker、团队或个人的功能特性状态。</p>
     * 
     * @param request QueryFeaturesRequest
     * @return QueryFeaturesResponse
     */
    public QueryFeaturesResponse queryFeatures(QueryFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFeaturesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>获取当前AgentTeams Resource Pool配置支持的所有可用区ID。</p>
     * 
     * @param request QuerySupportedZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySupportedZonesResponse
     */
    public QuerySupportedZonesResponse querySupportedZonesWithOptions(QuerySupportedZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupportedZones"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupportedZonesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>获取当前AgentTeams Resource Pool配置支持的所有可用区ID。</p>
     * 
     * @param request QuerySupportedZonesRequest
     * @return QuerySupportedZonesResponse
     */
    public QuerySupportedZonesResponse querySupportedZones(QuerySupportedZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupportedZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户密码</p>
     * 
     * @param request ResetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserPassword"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户密码</p>
     * 
     * @param request ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试模型供应商和模型</p>
     * 
     * @param request TestModelProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestModelProviderResponse
     */
    public TestModelProviderResponse testModelProviderWithOptions(TestModelProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            body.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            body.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestModelProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestModelProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>测试模型供应商和模型</p>
     * 
     * @param request TestModelProviderRequest
     * @return TestModelProviderResponse
     */
    public TestModelProviderResponse testModelProvider(TestModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑上游身份提供商</p>
     * 
     * @param request UnbindIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindIdentityProviderResponse
     */
    public UnbindIdentityProviderResponse unbindIdentityProviderWithOptions(UnbindIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            query.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindIdentityProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑上游身份提供商</p>
     * 
     * @param request UnbindIdentityProviderRequest
     * @return UnbindIdentityProviderResponse
     */
    public UnbindIdentityProviderResponse unbindIdentityProvider(UnbindIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新 AgentTeams 实例下已有 Credential 的密钥明文。</li>
     * <li>仅更新 Agent Identity TokenVault 中同名 APIKeyCredentialProvider 的密钥值，不修改本地元数据（description、createTime、updateTime、status）。</li>
     * <li>响应不包含 apiKey 明文；如需绑定 Worker 明细请调用 GetCredential。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新凭证密钥</p>
     * 
     * @param request UpdateCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredentialWithOptions(UpdateCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredential"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新 AgentTeams 实例下已有 Credential 的密钥明文。</li>
     * <li>仅更新 Agent Identity TokenVault 中同名 APIKeyCredentialProvider 的密钥值，不修改本地元数据（description、createTime、updateTime、status）。</li>
     * <li>响应不包含 apiKey 明文；如需绑定 Worker 明细请调用 GetCredential。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新凭证密钥</p>
     * 
     * @param request UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredential(UpdateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新上游身份提供商绑定</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProviderWithOptions(UpdateIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            query.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpMetadata)) {
            query.put("IdpMetadata", request.idpMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginEnabled)) {
            query.put("LoginEnabled", request.loginEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncEnabled)) {
            query.put("SyncEnabled", request.syncEnabled);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新上游身份提供商绑定</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>推荐使用<code>POST</code>方法，并以表单形式提交参数。</li>
     * <li>当前实现不支持JSON格式的请求体，请勿尝试使用<code>@RequestBody</code>方式调用。</li>
     * <li>必须提供有效的<code>instanceId</code>和非空的<code>instanceName</code>作为参数。</li>
     * <li>该接口仅允许修改实例名称(<code>instanceName</code>)，不允许通过此接口变更命名空间(<code>namespace</code>)。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定AgentTeams实例的名称，支持通过GET或POST方法调用。</p>
     * 
     * @param tmpReq UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateInstanceShrinkRequest request = new UpdateInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.zones)) {
            request.zonesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.zones, "Zones", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zonesShrink)) {
            query.put("Zones", request.zonesShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>推荐使用<code>POST</code>方法，并以表单形式提交参数。</li>
     * <li>当前实现不支持JSON格式的请求体，请勿尝试使用<code>@RequestBody</code>方式调用。</li>
     * <li>必须提供有效的<code>instanceId</code>和非空的<code>instanceName</code>作为参数。</li>
     * <li>该接口仅允许修改实例名称(<code>instanceName</code>)，不允许通过此接口变更命名空间(<code>namespace</code>)。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定AgentTeams实例的名称，支持通过GET或POST方法调用。</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于重新启动一个处于暂停状态的创建实例任务。</li>
     * <li>目前仅支持 <code>agentteams:pay-order:create</code> 类型的任务。</li>
     * <li>确保提供的 <code>instanceId</code>、<code>taskCode</code> 和 <code>taskId</code> 参数准确无误，否则可能导致请求失败。</li>
     * <li>如果任务不是暂停状态（PAUSED），则不允许调用此接口进行更新。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重启暂停中的创建实例异步任务。</p>
     * 
     * @param request UpdateInstanceAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceAsyncTaskResponse
     */
    public UpdateInstanceAsyncTaskResponse updateInstanceAsyncTaskWithOptions(UpdateInstanceAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isResume)) {
            query.put("IsResume", request.isResume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCode)) {
            query.put("TaskCode", request.taskCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceAsyncTask"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceAsyncTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于重新启动一个处于暂停状态的创建实例任务。</li>
     * <li>目前仅支持 <code>agentteams:pay-order:create</code> 类型的任务。</li>
     * <li>确保提供的 <code>instanceId</code>、<code>taskCode</code> 和 <code>taskId</code> 参数准确无误，否则可能导致请求失败。</li>
     * <li>如果任务不是暂停状态（PAUSED），则不允许调用此接口进行更新。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重启暂停中的创建实例异步任务。</p>
     * 
     * @param request UpdateInstanceAsyncTaskRequest
     * @return UpdateInstanceAsyncTaskResponse
     */
    public UpdateInstanceAsyncTaskResponse updateInstanceAsyncTask(UpdateInstanceAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新MCP</p>
     * 
     * @param tmpReq UpdateMcpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcpResponse
     */
    public UpdateMcpResponse updateMcpWithOptions(UpdateMcpRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMcpShrinkRequest request = new UpdateMcpShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addresses)) {
            request.addressesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addresses, "Addresses", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressesShrink)) {
            body.put("Addresses", request.addressesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            body.put("AuthConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authEnabled)) {
            body.put("AuthEnabled", request.authEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createType)) {
            body.put("CreateType", request.createType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swaggerConfig)) {
            body.put("SwaggerConfig", request.swaggerConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcp"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcpResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新MCP</p>
     * 
     * @param request UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    public UpdateMcpResponse updateMcp(UpdateMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMcpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新模型</p>
     * 
     * @param request UpdateModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModelWithOptions(UpdateModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModel"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新模型</p>
     * 
     * @param request UpdateModelRequest
     * @return UpdateModelResponse
     */
    public UpdateModelResponse updateModel(UpdateModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新模型供应商</p>
     * 
     * @param tmpReq UpdateModelProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelProviderResponse
     */
    public UpdateModelProviderResponse updateModelProviderWithOptions(UpdateModelProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateModelProviderShrinkRequest request = new UpdateModelProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiKeys)) {
            request.apiKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiKeys, "ApiKeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.protocols)) {
            request.protocolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.protocols, "Protocols", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiKeysShrink)) {
            body.put("ApiKeys", request.apiKeysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolsShrink)) {
            body.put("Protocols", request.protocolsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelProvider"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新模型供应商</p>
     * 
     * @param request UpdateModelProviderRequest
     * @return UpdateModelProviderResponse
     */
    public UpdateModelProviderResponse updateModelProvider(UpdateModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持更新<code>ELEMENT</code>、<code>MATRIX</code>类型的Endpoint。</li>
     * <li>如果尝试更新其他类型的Endpoint，将返回400错误。</li>
     * <li>当<code>endpointId</code>不存在或不属于当前用户实例时，将返回404错误。</li>
     * <li>更新域名时，系统会创建或复用新的HTTPS domain，并将其绑定到原endpoint route上，同时解绑旧domain，但不会删除旧domain。</li>
     * <li>若不提供<code>domain</code>或<code>certIdentifier</code>参数，则保持原有设置不变。</li>
     * <li>其他如<code>component</code>、<code>gatewayType</code>等字段即使传入也不会被更新。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更新指定Endpoint的域名和SSL证书信息。</p>
     * 
     * @param request UpdateServiceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceEndpointResponse
     */
    public UpdateServiceEndpointResponse updateServiceEndpointWithOptions(UpdateServiceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointId)) {
            query.put("EndpointId", request.endpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceEndpoint"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持更新<code>ELEMENT</code>、<code>MATRIX</code>类型的Endpoint。</li>
     * <li>如果尝试更新其他类型的Endpoint，将返回400错误。</li>
     * <li>当<code>endpointId</code>不存在或不属于当前用户实例时，将返回404错误。</li>
     * <li>更新域名时，系统会创建或复用新的HTTPS domain，并将其绑定到原endpoint route上，同时解绑旧domain，但不会删除旧domain。</li>
     * <li>若不提供<code>domain</code>或<code>certIdentifier</code>参数，则保持原有设置不变。</li>
     * <li>其他如<code>component</code>、<code>gatewayType</code>等字段即使传入也不会被更新。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更新指定Endpoint的域名和SSL证书信息。</p>
     * 
     * @param request UpdateServiceEndpointRequest
     * @return UpdateServiceEndpointResponse
     */
    public UpdateServiceEndpointResponse updateServiceEndpoint(UpdateServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新团队</p>
     * 
     * @param tmpReq UpdateTeamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeamWithOptions(UpdateTeamRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTeamShrinkRequest request = new UpdateTeamShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.teamMembers)) {
            request.teamMembersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.teamMembers, "TeamMembers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamMembersShrink)) {
            query.put("TeamMembers", request.teamMembersShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTeam"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新团队</p>
     * 
     * @param request UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(UpdateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTeamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户信息</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMethod)) {
            query.put("AuthMethod", request.authMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户信息</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Worker</p>
     * 
     * @param tmpReq UpdateWorkerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkerResponse
     */
    public UpdateWorkerResponse updateWorkerWithOptions(UpdateWorkerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkerShrinkRequest request = new UpdateWorkerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channels)) {
            request.channelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channels, "Channels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentials)) {
            request.credentialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentials, "Credentials", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.limitConfig)) {
            request.limitConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.limitConfig, "LimitConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mcpServers)) {
            request.mcpServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mcpServers, "McpServers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.model)) {
            request.modelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.model, "Model", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skills)) {
            request.skillsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skills, "Skills", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agents)) {
            query.put("Agents", request.agents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelsShrink)) {
            query.put("Channels", request.channelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialsShrink)) {
            query.put("Credentials", request.credentialsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitConfigShrink)) {
            query.put("LimitConfig", request.limitConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpServersShrink)) {
            query.put("McpServers", request.mcpServersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelShrink)) {
            query.put("Model", request.modelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillsShrink)) {
            query.put("Skills", request.skillsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soul)) {
            query.put("Soul", request.soul);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorker"),
            new TeaPair("version", "2026-06-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Worker</p>
     * 
     * @param request UpdateWorkerRequest
     * @return UpdateWorkerResponse
     */
    public UpdateWorkerResponse updateWorker(UpdateWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkerWithOptions(request, runtime);
    }
}
