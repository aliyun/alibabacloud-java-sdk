// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605;

import com.aliyun.tea.*;
import com.aliyun.agentteams20260605.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "agentteams.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "agentteams.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agentteams.cn-hangzhou.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This is an asynchronous operation that immediately returns binding task information after the call.</li>
     * <li>Use <code>GetInstanceAsyncTask</code> to poll for the asynchronous task result. The default polling interval is 30 seconds, with a maximum of 20 attempts.</li>
     * <li>The <code>IdpMetadata</code> parameter contains sensitive information. Ensure secure transmission.</li>
     * <li>The default values of <code>LoginEnabled</code> and <code>SyncEnabled</code> are <code>true</code> and <code>false</code>, respectively. If not explicitly specified, the default values are used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an upstream identity provider to a specified instance and triggers a synchronization task.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This is an asynchronous operation that immediately returns binding task information after the call.</li>
     * <li>Use <code>GetInstanceAsyncTask</code> to poll for the asynchronous task result. The default polling interval is 30 seconds, with a maximum of 20 attempts.</li>
     * <li>The <code>IdpMetadata</code> parameter contains sensitive information. Ensure secure transmission.</li>
     * <li>The default values of <code>LoginEnabled</code> and <code>SyncEnabled</code> are <code>true</code> and <code>false</code>, respectively. If not explicitly specified, the default values are used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an upstream identity provider to a specified instance and triggers a synchronization task.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an Internet NAT gateway and automatically applies for an elastic IP address (EIP), bindS the EIP, and configures SNAT rules.</li>
     * <li>An asynchronous task ID is returned after the call. The actual resource ID is provided in the task result.</li>
     * <li>NAT gateway name format: <code>magic-create-for-vpc-{vpcId}</code>.</li>
     * <li>GET and POST methods are supported.</li>
     * <li>The <code>eipBandwidth</code> parameter ranges from 1 to 200 Mbit/s. Default value: 5 Mbit/s.</li>
     * <li>If <code>InstanceId</code> is invalid or <code>eipBandwidth</code> is out of range, the API returns an error response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates and configures an Internet NAT gateway for a specified AgentTeams instance.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an Internet NAT gateway and automatically applies for an elastic IP address (EIP), bindS the EIP, and configures SNAT rules.</li>
     * <li>An asynchronous task ID is returned after the call. The actual resource ID is provided in the task result.</li>
     * <li>NAT gateway name format: <code>magic-create-for-vpc-{vpcId}</code>.</li>
     * <li>GET and POST methods are supported.</li>
     * <li>The <code>eipBandwidth</code> parameter ranges from 1 to 200 Mbit/s. Default value: 5 Mbit/s.</li>
     * <li>If <code>InstanceId</code> is invalid or <code>eipBandwidth</code> is out of range, the API returns an error response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates and configures an Internet NAT gateway for a specified AgentTeams instance.</p>
     * 
     * @param request ConfigureNatGatewayRequest
     * @return ConfigureNatGatewayResponse
     */
    public ConfigureNatGatewayResponse configureNatGateway(ConfigureNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureNatGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>ApiKey</code> is a sensitive field and is not returned in plaintext.</li>
     * <li><code>ClientToken</code> is used to ensure idempotence of the request. This parameter is optional but recommended.</li>
     * <li>The credential name (Name) must match the regular expression <code>^[A-Z_][A-Z0-9_]*$</code>.</li>
     * <li>If the specified credential name already exists in the specified instance, the error code <code>Credential.Name.AlreadyExists</code> is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new key-value credential under a specified AgentTeams instance.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>ApiKey</code> is a sensitive field and is not returned in plaintext.</li>
     * <li><code>ClientToken</code> is used to ensure idempotence of the request. This parameter is optional but recommended.</li>
     * <li>The credential name (Name) must match the regular expression <code>^[A-Z_][A-Z0-9_]*$</code>.</li>
     * <li>If the specified credential name already exists in the specified instance, the error code <code>Credential.Name.AlreadyExists</code> is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a new key-value credential under a specified AgentTeams instance.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This is an asynchronous operation. After a successful call, the instance status changes to CREATING.</li>
     * <li>The actual resource creation is completed asynchronously in the background. Poll the creation result by calling the <code>GetInstance</code> operation.</li>
     * <li>You can pass request information by using form parameters or query parameters.</li>
     * <li>If optional parameters are not provided, default values are used.</li>
     * <li>Use <code>ClientToken</code> to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously creates a cluster instance with the specified configurations.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This is an asynchronous operation. After a successful call, the instance status changes to CREATING.</li>
     * <li>The actual resource creation is completed asynchronously in the background. Poll the creation result by calling the <code>GetInstance</code> operation.</li>
     * <li>You can pass request information by using form parameters or query parameters.</li>
     * <li>If optional parameters are not provided, default values are used.</li>
     * <li>Use <code>ClientToken</code> to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously creates a cluster instance with the specified configurations.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>You must specify the <code>InstanceId</code>, <code>Name</code>, and <code>Addresses</code> parameters when you create an MCP server.</li>
     * <li>The <code>CreateType</code> parameter defaults to <code>DIRECT_PROXY</code>. If you select the <code>HTTP_TO_MCP</code> mode, you must also specify <code>SwaggerConfig</code>.</li>
     * <li>Set <code>AuthEnabled</code> to enable or disable authentication. If authentication is enabled, you must specify <code>AuthConfig</code>.</li>
     * <li>Use <code>ClientToken</code> to ensure the idempotence of the request.</li>
     * <li>Custom protocol types are supported. The <code>streamable</code> protocol is used by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP server.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>You must specify the <code>InstanceId</code>, <code>Name</code>, and <code>Addresses</code> parameters when you create an MCP server.</li>
     * <li>The <code>CreateType</code> parameter defaults to <code>DIRECT_PROXY</code>. If you select the <code>HTTP_TO_MCP</code> mode, you must also specify <code>SwaggerConfig</code>.</li>
     * <li>Set <code>AuthEnabled</code> to enable or disable authentication. If authentication is enabled, you must specify <code>AuthConfig</code>.</li>
     * <li>Use <code>ClientToken</code> to ensure the idempotence of the request.</li>
     * <li>Custom protocol types are supported. The <code>streamable</code> protocol is used by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an MCP server.</p>
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
     * <p>Creates an AI model under a specified AgentTeams instance. You must specify the model name, the model provider, and the list of supported protocols.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI model under a specified AgentTeams instance. You must specify the model name, the model provider, and the list of supported protocols.</p>
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
     * <p>Creates an AI model under a specified AgentTeams instance. You must specify the model name, the model provider, and the list of supported protocols.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI model under a specified AgentTeams instance. You must specify the model name, the model provider, and the list of supported protocols.</p>
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
     * <p>Creates an AI model provider under a specified AgentTeams instance. You must specify the provider name, address, supported protocol list, and API keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI model provider under a specified AgentTeams instance. You must specify the provider name, address, supported protocol list, and API keys.</p>
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
     * <p>Creates an AI model provider under a specified AgentTeams instance. You must specify the provider name, address, supported protocol list, and API keys.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AI model provider under a specified AgentTeams instance. You must specify the provider name, address, supported protocol list, and API keys.</p>
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
     * <p>Creates an endpoint for a specified instance. Multiple component types and gateway types are supported.</p>
     * <ul>
     * <li>The current controller uses standard parameter binding instead of @RequestBody, so parameters are better suited for query/form-based transmission.</li>
     * <li>The domain field is trimmed and converted to lowercase on the server side.</li>
     * <li>The query and headers must be in JSON object string format and cannot be arrays.</li>
     * <li>The create operation only saves data to the database. The AI Gateway domain name synchronization logic is triggered only during an update when the conditions ELEMENT/MATRIX + AI_GATEWAY + INTERNET are met and the domain name or certificate has changed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint for a specified instance. Multiple component types and gateway types are supported.</p>
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
     * <p>Creates an endpoint for a specified instance. Multiple component types and gateway types are supported.</p>
     * <ul>
     * <li>The current controller uses standard parameter binding instead of @RequestBody, so parameters are better suited for query/form-based transmission.</li>
     * <li>The domain field is trimmed and converted to lowercase on the server side.</li>
     * <li>The query and headers must be in JSON object string format and cannot be arrays.</li>
     * <li>The create operation only saves data to the database. The AI Gateway domain name synchronization logic is triggered only during an update when the conditions ELEMENT/MATRIX + AI_GATEWAY + INTERNET are met and the domain name or certificate has changed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an endpoint for a specified instance. Multiple component types and gateway types are supported.</p>
     * 
     * @param request CreateServiceEndpointRequest
     * @return CreateServiceEndpointResponse
     */
    public CreateServiceEndpointResponse createServiceEndpoint(CreateServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a team under a specified instance. You can set the team name, description, administrator, and initial member list.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a team under a specified instance. You can set the team name, description, administrator, and initial member list.</p>
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
     * <b>description</b> :
     * <p>Creates a team under a specified instance. You can set the team name, description, administrator, and initial member list.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a team under a specified instance. You can set the team name, description, administrator, and initial member list.</p>
     * 
     * @param request CreateTeamRequest
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeam(CreateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTeamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a user under a specified instance. You can set the username, display name, email address, authentication method, note, and password. If no password is specified, the system automatically generates an initial password and returns it in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user under a specified instance. You can set the username, display name, email address, authentication method, note, and password. If no password is specified, the system automatically generates an initial password and returns it in the response.</p>
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
     * <b>description</b> :
     * <p>Creates a user under a specified instance. You can set the username, display name, email address, authentication method, note, and password. If no password is specified, the system automatically generates an initial password and returns it in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user under a specified instance. You can set the username, display name, email address, authentication method, note, and password. If no password is specified, the system automatically generates an initial password and returns it in the response.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a Worker instance with specified configurations such as model, skills, template, MCP servers, and channels.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Worker instance with specified configurations such as model, skills, template, MCP servers, and channels.</p>
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
     * <b>description</b> :
     * <p>Creates a Worker instance with specified configurations such as model, skills, template, MCP servers, and channels.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Worker instance with specified configurations such as model, skills, template, MCP servers, and channels.</p>
     * 
     * @param request CreateWorkerRequest
     * @return CreateWorkerResponse
     */
    public CreateWorkerResponse createWorker(CreateWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a local management bootstrap token for a Worker, with support for specifying the network type.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a local management bootstrap token for a Worker, with support for specifying the network type.</p>
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
     * <b>description</b> :
     * <p>Creates a local management bootstrap token for a Worker, with support for specifying the network type.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a local management bootstrap token for a Worker, with support for specifying the network type.</p>
     * 
     * @param request CreateWorkerBootstrapTokenRequest
     * @return CreateWorkerBootstrapTokenResponse
     */
    public CreateWorkerBootstrapTokenResponse createWorkerBootstrapToken(CreateWorkerBootstrapTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkerBootstrapTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an existing credential from a specified AgentTeams instance. The credential cannot be deleted if it is still attached to a Worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing credential from a specified AgentTeams instance. The credential cannot be deleted if it is still attached to a Worker.</p>
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
     * <b>description</b> :
     * <p>Deletes an existing credential from a specified AgentTeams instance. The credential cannot be deleted if it is still attached to a Worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing credential from a specified AgentTeams instance. The credential cannot be deleted if it is still attached to a Worker.</p>
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
     * <p>Releases a specified AgentTeams instance and cleans up related resources. Supports GET and POST methods. After a successful call, the instance status changes to DELETING, and resource cleanup is performed asynchronously in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a specified AgentTeams instance and cleans up related resources. Supports GET and POST methods. After a successful call, the instance status changes to DELETING, and resource cleanup is performed asynchronously in the background.</p>
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
     * <p>Releases a specified AgentTeams instance and cleans up related resources. Supports GET and POST methods. After a successful call, the instance status changes to DELETING, and resource cleanup is performed asynchronously in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a specified AgentTeams instance and cleans up related resources. Supports GET and POST methods. After a successful call, the instance status changes to DELETING, and resource cleanup is performed asynchronously in the background.</p>
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
     * <p>Deletes an MCP server from a specified AgentTeams instance. The server cannot be deleted if it is associated with any Workers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an MCP server from a specified AgentTeams instance. The server cannot be deleted if it is associated with any Workers.</p>
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
     * <p>Deletes an MCP server from a specified AgentTeams instance. The server cannot be deleted if it is associated with any Workers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an MCP server from a specified AgentTeams instance. The server cannot be deleted if it is associated with any Workers.</p>
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
     * <p>Deletes an AI model from a specified AgentTeams instance. The model cannot be deleted if it is still associated with a Worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI model from a specified AgentTeams instance. The model cannot be deleted if it is still associated with a Worker.</p>
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
     * <p>Deletes an AI model from a specified AgentTeams instance. The model cannot be deleted if it is still associated with a Worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI model from a specified AgentTeams instance. The model cannot be deleted if it is still associated with a Worker.</p>
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
     * <p>Deletes an AI model provider from a specified AgentTeams instance. The provider cannot be deleted if it still has associated models.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI model provider from a specified AgentTeams instance. The provider cannot be deleted if it still has associated models.</p>
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
     * <p>Deletes an AI model provider from a specified AgentTeams instance. The provider cannot be deleted if it still has associated models.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AI model provider from a specified AgentTeams instance. The provider cannot be deleted if it still has associated models.</p>
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
     * <p>Deletes an endpoint from a specified AgentTeams instance and cleans up related resources.</p>
     * <ul>
     * <li>This operation supports GET or POST methods.</li>
     * <li>If the target endpoint is of the WORKER type, the system automatically cleans up associated APIG/AI Gateway cloud resources and KubeOne worker service configurations.</li>
     * <li>The request parameters must include instanceId and endpointId, and neither can be empty.</li>
     * <li>A successful response returns HTTP status code 200 and a success flag. An error response returns the corresponding HTTP status code (such as 400, 404, or 409) and an error message.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint from a specified AgentTeams instance and cleans up related resources.</p>
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
     * <p>Deletes an endpoint from a specified AgentTeams instance and cleans up related resources.</p>
     * <ul>
     * <li>This operation supports GET or POST methods.</li>
     * <li>If the target endpoint is of the WORKER type, the system automatically cleans up associated APIG/AI Gateway cloud resources and KubeOne worker service configurations.</li>
     * <li>The request parameters must include instanceId and endpointId, and neither can be empty.</li>
     * <li>A successful response returns HTTP status code 200 and a success flag. An error response returns the corresponding HTTP status code (such as 400, 404, or 409) and an error message.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an endpoint from a specified AgentTeams instance and cleans up related resources.</p>
     * 
     * @param request DeleteServiceEndpointRequest
     * @return DeleteServiceEndpointResponse
     */
    public DeleteServiceEndpointResponse deleteServiceEndpoint(DeleteServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a team under a specified instance. After deletion, the team and associated resources enter an asynchronous cleanup process.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a team under a specified instance. After deletion, the team and associated resources enter an asynchronous cleanup process.</p>
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
     * <b>description</b> :
     * <p>Deletes a team under a specified instance. After deletion, the team and associated resources enter an asynchronous cleanup process.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a team under a specified instance. After deletion, the team and associated resources enter an asynchronous cleanup process.</p>
     * 
     * @param request DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(DeleteTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTeamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified user from a specified instance. After deletion, the user cannot log on to or access instance resources. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified user from a specified instance. After deletion, the user cannot log on to or access instance resources. Proceed with caution.</p>
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
     * <b>description</b> :
     * <p>Deletes a specified user from a specified instance. After deletion, the user cannot log on to or access instance resources. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified user from a specified instance. After deletion, the user cannot log on to or access instance resources. Proceed with caution.</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a Worker under a specified instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Worker under a specified instance.</p>
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
     * <b>description</b> :
     * <p>Deletes a Worker under a specified instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Worker under a specified instance.</p>
     * 
     * @param request DeleteWorkerRequest
     * @return DeleteWorkerResponse
     */
    public DeleteWorkerResponse deleteWorker(DeleteWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified credential under an AgentTeams instance, including the status, description, and list of bound Workers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified credential under an AgentTeams instance, including the status, description, and list of bound Workers.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified credential under an AgentTeams instance, including the status, description, and list of bound Workers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified credential under an AgentTeams instance, including the status, description, and list of bound Workers.</p>
     * 
     * @param request GetCredentialRequest
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(GetCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the binding details of an upstream identity provider for a specified instance and identity provider type, including the logon callback URL and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding details of an upstream identity provider for a specified instance and identity provider type, including the logon callback URL and metadata.</p>
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
     * <b>description</b> :
     * <p>Queries the binding details of an upstream identity provider for a specified instance and identity provider type, including the logon callback URL and metadata.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding details of an upstream identity provider for a specified instance and identity provider type, including the logon callback URL and metadata.</p>
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
     * <p>Queries the details of a specified instance by instance ID. Supports GET and POST methods. A successful response returns the detailed configuration and status of the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified instance by instance ID. Supports GET and POST methods. A successful response returns the detailed configuration and status of the instance.</p>
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
     * <p>Queries the details of a specified instance by instance ID. Supports GET and POST methods. A successful response returns the detailed configuration and status of the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified instance by instance ID. Supports GET and POST methods. A successful response returns the detailed configuration and status of the instance.</p>
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
     * <p>Queries the status of asynchronous tasks associated with a specified AgentTeams instance, with paging support.</p>
     * <ul>
     * <li>This operation queries the execution status of asynchronous tasks under a specific AgentTeams instance.</li>
     * <li>Currently, only instance creation tasks related to the instance lifecycle are supported.</li>
     * <li>Use the taskCode parameter to specify the task type to query. The default is the instance creation task.</li>
     * <li>Use maxResults and nextToken for result paging.</li>
     * <li>When a task is in the PAUSED state, the response includes information about the action the user needs to take (recoveryMessage).</li>
     * <li>Querying task status directly by taskId is not currently supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of asynchronous tasks associated with a specified AgentTeams instance, with pagination support.</p>
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
     * <p>Queries the status of asynchronous tasks associated with a specified AgentTeams instance, with paging support.</p>
     * <ul>
     * <li>This operation queries the execution status of asynchronous tasks under a specific AgentTeams instance.</li>
     * <li>Currently, only instance creation tasks related to the instance lifecycle are supported.</li>
     * <li>Use the taskCode parameter to specify the task type to query. The default is the instance creation task.</li>
     * <li>Use maxResults and nextToken for result paging.</li>
     * <li>When a task is in the PAUSED state, the response includes information about the action the user needs to take (recoveryMessage).</li>
     * <li>Querying task status directly by taskId is not currently supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of asynchronous tasks associated with a specified AgentTeams instance, with pagination support.</p>
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
     * <p>Retrieves the RAM authorization URL required to mount OSS to ACS for an instance.</p>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The X-User-Id header must be included in the request to verify instance ownership.</li>
     * <li>The InstanceId parameter is required to specify the instance. The backend generates the authorization URL based on the instance information.</li>
     * <li>A successful response returns the RAM console authorization URL without creating a RAM role or policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the RAM authorization URL required to mount OSS to ACS for an instance.</p>
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
     * <p>Retrieves the RAM authorization URL required to mount OSS to ACS for an instance.</p>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The X-User-Id header must be included in the request to verify instance ownership.</li>
     * <li>The InstanceId parameter is required to specify the instance. The backend generates the authorization URL based on the instance information.</li>
     * <li>A successful response returns the RAM console authorization URL without creating a RAM role or policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the RAM authorization URL required to mount OSS to ACS for an instance.</p>
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
     * <p>Queries the details of a specified MCP server, including the address, authentication configuration, deployment status, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP server, including the address, authentication configuration, deployment status, and protocol.</p>
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
     * <p>Queries the details of a specified MCP server, including the address, authentication configuration, deployment status, and protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified MCP server, including the address, authentication configuration, deployment status, and protocol.</p>
     * 
     * @param request GetMcpRequest
     * @return GetMcpResponse
     */
    public GetMcpResponse getMcp(GetMcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the model call summary for a specified AgentTeams instance within a specified time range, including today\&quot;s and this week\&quot;s call counts, change rates, call frequency, and provider distribution.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model call summary for a specified AgentTeams instance within a specified time range, including today\&quot;s and this week\&quot;s call counts, change rates, call frequency, and provider distribution.</p>
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
     * <b>description</b> :
     * <p>Queries the model call summary for a specified AgentTeams instance within a specified time range, including today\&quot;s and this week\&quot;s call counts, change rates, call frequency, and provider distribution.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model call summary for a specified AgentTeams instance within a specified time range, including today\&quot;s and this week\&quot;s call counts, change rates, call frequency, and provider distribution.</p>
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
     * <p>Queries the details of a single AI model provider, including the name, address, protocol list, API keys, and deployment status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single AI model provider, including the name, address, protocol list, API keys, and deployment status.</p>
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
     * <p>Queries the details of a single AI model provider, including the name, address, protocol list, API keys, and deployment status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single AI model provider, including the name, address, protocol list, API keys, and deployment status.</p>
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
     * <p>Queries the configuration status of the NAT gateway and its SNAT rules for a specified instance.</p>
     * <ul>
     * <li>This API allows you to retrieve the NAT gateway configuration details and SNAT rule status associated with a specific instance. This operation supports GET or POST method calls and requires the instanceId as a request parameter to specify the instance to query.</li>
     * <li>Ensure that the provided instanceId is valid and belongs to your account.</li>
     * <li>Based on the returned status values (such as READY, NEED_CONFIGURE_NAT_GATEWAY, or NEED_CONFIGURE_SNAT_RULE), take the corresponding actions to complete the NAT gateway or SNAT rule configuration.</li>
     * <li>When the status is NEED_CONFIGURE_NAT_GATEWAY, it indicates that no available NAT gateway exists in the current VPC. NEED_CONFIGURE_SNAT_RULE means that a NAT gateway exists but some subnet CIDRs are not covered by SNAT rules.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration status of the NAT gateway and its SNAT rules for a specified instance.</p>
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
     * <p>Queries the configuration status of the NAT gateway and its SNAT rules for a specified instance.</p>
     * <ul>
     * <li>This API allows you to retrieve the NAT gateway configuration details and SNAT rule status associated with a specific instance. This operation supports GET or POST method calls and requires the instanceId as a request parameter to specify the instance to query.</li>
     * <li>Ensure that the provided instanceId is valid and belongs to your account.</li>
     * <li>Based on the returned status values (such as READY, NEED_CONFIGURE_NAT_GATEWAY, or NEED_CONFIGURE_SNAT_RULE), take the corresponding actions to complete the NAT gateway or SNAT rule configuration.</li>
     * <li>When the status is NEED_CONFIGURE_NAT_GATEWAY, it indicates that no available NAT gateway exists in the current VPC. NEED_CONFIGURE_SNAT_RULE means that a NAT gateway exists but some subnet CIDRs are not covered by SNAT rules.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration status of the NAT gateway and its SNAT rules for a specified instance.</p>
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
     * <p>Queries the details of an endpoint with a specified ID. You can verify the endpoint by instance ID.</p>
     * <ul>
     * <li>This API operation queries the configuration and status information of a single endpoint based on the endpointId.</li>
     * <li>The optional parameter instanceId is used to verify whether the endpoint belongs to a specific instance.</li>
     * <li>The request supports both GET and POST methods. GET passes parameters through the query string, while POST submits parameters through form data.</li>
     * <li>If endpointId is missing or empty, an InvalidParameter error is returned.</li>
     * <li>If the requested endpoint does not exist, does not belong to the specified instance, or does not belong to the current user, a resource-not-found error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an endpoint with a specified ID. You can verify the endpoint by instance ID.</p>
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
     * <p>Queries the details of an endpoint with a specified ID. You can verify the endpoint by instance ID.</p>
     * <ul>
     * <li>This API operation queries the configuration and status information of a single endpoint based on the endpointId.</li>
     * <li>The optional parameter instanceId is used to verify whether the endpoint belongs to a specific instance.</li>
     * <li>The request supports both GET and POST methods. GET passes parameters through the query string, while POST submits parameters through form data.</li>
     * <li>If endpointId is missing or empty, an InvalidParameter error is returned.</li>
     * <li>If the requested endpoint does not exist, does not belong to the specified instance, or does not belong to the current user, a resource-not-found error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an endpoint with a specified ID. You can verify the endpoint by instance ID.</p>
     * 
     * @param request GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    public GetServiceEndpointResponse getServiceEndpoint(GetServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the task statistics summary of a specified AgentTeams instance within a specified time range, including total tasks, average task duration, token consumption, and status distribution.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task statistics summary of a specified AgentTeams instance within a specified time range, including total tasks, average task duration, token consumption, and status distribution.</p>
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
     * <b>description</b> :
     * <p>Queries the task statistics summary of a specified AgentTeams instance within a specified time range, including total tasks, average task duration, token consumption, and status distribution.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task statistics summary of a specified AgentTeams instance within a specified time range, including total tasks, average task duration, token consumption, and status distribution.</p>
     * 
     * @param request GetTaskStatsSummaryRequest
     * @return GetTaskStatsSummaryResponse
     */
    public GetTaskStatsSummaryResponse getTaskStatsSummary(GetTaskStatsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified team under a specified instance, including the description, administrator, leader, members, associated workers, and room status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified team under a specified instance, including the description, administrator, leader, members, associated workers, and room status.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified team under a specified instance, including the description, administrator, leader, members, associated workers, and room status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified team under a specified instance, including the description, administrator, leader, members, associated workers, and room status.</p>
     * 
     * @param request GetTeamRequest
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeam(GetTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTeamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the token consumption trend of a specified AgentTeams instance within a specified time range, supports grouping by time dimension, and returns time series data that can be used for charting.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token consumption trend of a specified AgentTeams instance within a specified time range, supports grouping by time dimension, and returns time series data that can be used for charting.</p>
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
     * <b>description</b> :
     * <p>Queries the token consumption trend of a specified AgentTeams instance within a specified time range, supports grouping by time dimension, and returns time series data that can be used for charting.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token consumption trend of a specified AgentTeams instance within a specified time range, supports grouping by time dimension, and returns time series data that can be used for charting.</p>
     * 
     * @param request GetTokenTrendRequest
     * @return GetTokenTrendResponse
     */
    public GetTokenTrendResponse getTokenTrend(GetTokenTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenTrendWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the tool calling distribution of a specified AgentTeams instance within a specified time range, and returns the number of calls for each tool and the total number of calls.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tool calling distribution of a specified AgentTeams instance within a specified time range, and returns the number of calls for each tool and the total number of calls.</p>
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
     * <b>description</b> :
     * <p>Queries the tool calling distribution of a specified AgentTeams instance within a specified time range, and returns the number of calls for each tool and the total number of calls.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tool calling distribution of a specified AgentTeams instance within a specified time range, and returns the number of calls for each tool and the total number of calls.</p>
     * 
     * @param request GetToolCallDistributionRequest
     * @return GetToolCallDistributionResponse
     */
    public GetToolCallDistributionResponse getToolCallDistribution(GetToolCallDistributionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getToolCallDistributionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified user under a specified instance, including the username, display name, email address, authentication method, status, and creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified user under a specified instance, including the username, display name, email address, authentication method, status, and creation time.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified user under a specified instance, including the username, display name, email address, authentication method, status, and creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified user under a specified instance, including the username, display name, email address, authentication method, status, and creation time.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the initial password of a specified user under a specified instance. The initial password is generated by the system or specified by the user when the user is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the initial password of a specified user under a specified instance. The initial password is generated by the system or specified by the user when the user is created.</p>
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
     * <b>description</b> :
     * <p>Retrieves the initial password of a specified user under a specified instance. The initial password is generated by the system or specified by the user when the user is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the initial password of a specified user under a specified instance. The initial password is generated by the system or specified by the user when the user is created.</p>
     * 
     * @param request GetUserPasswordRequest
     * @return GetUserPasswordResponse
     */
    public GetUserPasswordResponse getUserPassword(GetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified worker, including configurations such as model, skills, sub-agents, MCP servers, channels, and quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified worker, including configurations such as model, skills, sub-agents, MCP servers, channels, and quotas.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a specified worker, including configurations such as model, skills, sub-agents, MCP servers, channels, and quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified worker, including configurations such as model, skills, sub-agents, MCP servers, channels, and quotas.</p>
     * 
     * @param request GetWorkerRequest
     * @return GetWorkerResponse
     */
    public GetWorkerResponse getWorker(GetWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the startup options for local Worker management and returns available network types.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the startup options for local Worker management and returns available network types.</p>
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
     * <b>description</b> :
     * <p>Queries the startup options for local Worker management and returns available network types.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the startup options for local Worker management and returns available network types.</p>
     * 
     * @param request GetWorkerBootstrapOptionsRequest
     * @return GetWorkerBootstrapOptionsResponse
     */
    public GetWorkerBootstrapOptionsResponse getWorkerBootstrapOptions(GetWorkerBootstrapOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerBootstrapOptionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the maximum upgradable version of a worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum upgradable version of a worker.</p>
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
     * <b>description</b> :
     * <p>Queries the maximum upgradable version of a worker.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the maximum upgradable version of a worker.</p>
     * 
     * @param request GetWorkerMaxVersionRequest
     * @return GetWorkerMaxVersionResponse
     */
    public GetWorkerMaxVersionResponse getWorkerMaxVersion(GetWorkerMaxVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerMaxVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the Worker statistics summary, including the total number of workers, the number of running workers, the number of stopped workers, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Worker statistics summary, including the total number of workers, the number of running workers, the number of stopped workers, and more.</p>
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
     * <b>description</b> :
     * <p>Queries the Worker statistics summary, including the total number of workers, the number of running workers, the number of stopped workers, and more.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Worker statistics summary, including the total number of workers, the number of running workers, the number of stopped workers, and more.</p>
     * 
     * @param request GetWorkerStatsSummaryRequest
     * @return GetWorkerStatsSummaryResponse
     */
    public GetWorkerStatsSummaryResponse getWorkerStatsSummary(GetWorkerStatsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkerStatsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the credential list under a specified AgentTeams instance with paging, returning credential summary information and the number of Workers attached to each credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the credential list under a specified AgentTeams instance with paging, returning credential summary information and the number of Workers attached to each credential.</p>
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
     * <b>description</b> :
     * <p>Queries the credential list under a specified AgentTeams instance with paging, returning credential summary information and the number of Workers attached to each credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the credential list under a specified AgentTeams instance with paging, returning credential summary information and the number of Workers attached to each credential.</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of upstream identity provider bindings for a specified instance, with support for paginated responses.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of upstream identity provider bindings for a specified instance, with support for paginated responses.</p>
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
     * <b>description</b> :
     * <p>Queries the list of upstream identity provider bindings for a specified instance, with support for paginated responses.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of upstream identity provider bindings for a specified instance, with support for paginated responses.</p>
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
     * <p>Queries a list of instances that meet the specified conditions. Supports pagination and fuzzy match. Supports GET and POST methods. The list is returned in reverse chronological order by creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances that meet the specified conditions. Supports pagination and fuzzy match. Supports GET and POST methods. The list is returned in reverse chronological order by creation time.</p>
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
     * <p>Queries a list of instances that meet the specified conditions. Supports pagination and fuzzy match. Supports GET and POST methods. The list is returned in reverse chronological order by creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of instances that meet the specified conditions. Supports pagination and fuzzy match. Supports GET and POST methods. The list is returned in reverse chronological order by creation time.</p>
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
     * <p>Queries the list of tools provided by a specified MCP server, including tool names, titles, descriptions, and input schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools provided by a specified MCP server, including tool names, titles, descriptions, and input schemas.</p>
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
     * <p>Queries the list of tools provided by a specified MCP server, including tool names, titles, descriptions, and input schemas.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of tools provided by a specified MCP server, including tool names, titles, descriptions, and input schemas.</p>
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
     * <p>Queries the MCP server list under a specified AgentTeams instance by using paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the MCP server list under a specified AgentTeams instance by using paging.</p>
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
     * <p>Queries the MCP server list under a specified AgentTeams instance by using paging.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the MCP server list under a specified AgentTeams instance by using paging.</p>
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
     * <p>Queries the list of AI model providers under a specified AgentTeams instance. Paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI model providers under a specified AgentTeams instance. Paging is supported.</p>
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
     * <p>Queries the list of AI model providers under a specified AgentTeams instance. Paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI model providers under a specified AgentTeams instance. Paging is supported.</p>
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
     * <p>Queries the list of AI models under a specified AgentTeams instance. You can filter results by model name or provider name, and paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI models under a specified AgentTeams instance. You can filter results by model name or provider name, and paging is supported.</p>
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
     * <p>Queries the list of AI models under a specified AgentTeams instance. You can filter results by model name or provider name, and paging is supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI models under a specified AgentTeams instance. You can filter results by model name or provider name, and paging is supported.</p>
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
     * <p>This API queries the list of AI gateway endpoints under a specified instance.</p>
     * <ul>
     * <li>instanceId is a required parameter that specifies the AgentTeams instance ID.</li>
     * <li>Optional parameters include component, serviceName, networkType, and domainType, which are used to further filter the returned endpoint list.</li>
     * <li>Filtering by the status parameter is not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI gateway endpoints under a specified instance.</p>
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
     * <p>This API queries the list of AI gateway endpoints under a specified instance.</p>
     * <ul>
     * <li>instanceId is a required parameter that specifies the AgentTeams instance ID.</li>
     * <li>Optional parameters include component, serviceName, networkType, and domainType, which are used to further filter the returned endpoint list.</li>
     * <li>Filtering by the status parameter is not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of AI gateway endpoints under a specified instance.</p>
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
     * <p>Queries the list of SSL certificates available to the user in APIG.</p>
     * <ul>
     * <li>This API retrieves the list of SSL certificates associated with a specified AgentTeams instance.</li>
     * <li>The pagination parameters MaxResults and NextToken allow the client to control the number of returned results and retrieve the next page of data.</li>
     * <li>A successful response includes the request ID, success flag, error code, next page token, total certificate count, and the certificate details list.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of SSL certificates available to the user in APIG.</p>
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
     * <p>Queries the list of SSL certificates available to the user in APIG.</p>
     * <ul>
     * <li>This API retrieves the list of SSL certificates associated with a specified AgentTeams instance.</li>
     * <li>The pagination parameters MaxResults and NextToken allow the client to control the number of returned results and retrieve the next page of data.</li>
     * <li>A successful response includes the request ID, success flag, error code, next page token, total certificate count, and the certificate details list.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of SSL certificates available to the user in APIG.</p>
     * 
     * @param request ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    public ListSslCertsResponse listSslCerts(ListSslCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSslCertsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the statistical details of teams under a specified instance, including aggregate metrics such as the number of workers, number of tasks, success rate, and token usage for each team.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistical details of teams under a specified instance, including aggregate metrics such as the number of workers, number of tasks, success rate, and token usage for each team.</p>
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
     * <b>description</b> :
     * <p>Queries the statistical details of teams under a specified instance, including aggregate metrics such as the number of workers, number of tasks, success rate, and token usage for each team.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistical details of teams under a specified instance, including aggregate metrics such as the number of workers, number of tasks, success rate, and token usage for each team.</p>
     * 
     * @param request ListTeamDetailsRequest
     * @return ListTeamDetailsResponse
     */
    public ListTeamDetailsResponse listTeamDetails(ListTeamDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the task list of a specified team under a specified instance. The task metadata is sourced from the OSS bucket bound to the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task list of a specified team under a specified instance. The task metadata is sourced from the OSS bucket bound to the instance.</p>
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
     * <b>description</b> :
     * <p>Queries the task list of a specified team under a specified instance. The task metadata is sourced from the OSS bucket bound to the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the task list of a specified team under a specified instance. The task metadata is sourced from the OSS bucket bound to the instance.</p>
     * 
     * @param request ListTeamTasksRequest
     * @return ListTeamTasksResponse
     */
    public ListTeamTasksResponse listTeamTasks(ListTeamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of teams under a specified instance, with support for fuzzy filtering by name and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of teams under a specified instance, with support for fuzzy filtering by name and pagination.</p>
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
     * <b>description</b> :
     * <p>Queries the list of teams under a specified instance, with support for fuzzy filtering by name and pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of teams under a specified instance, with support for fuzzy filtering by name and pagination.</p>
     * 
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTeamsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of users under a specified instance. Supports fuzzy match by username and paging query. The list is returned in reverse chronological order by creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of users under a specified instance. Supports fuzzy match by username and paging query. The list is returned in reverse chronological order by creation time.</p>
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
     * <b>description</b> :
     * <p>Queries the list of users under a specified instance. Supports fuzzy match by username and paging query. The list is returned in reverse chronological order by creation time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of users under a specified instance. Supports fuzzy match by username and paging query. The list is returned in reverse chronological order by creation time.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a list of Worker statistics details by paging, including task count, token usage, and LLM call count.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Worker statistics details by paging, including task count, token usage, and LLM call count.</p>
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
     * <b>description</b> :
     * <p>Queries a list of Worker statistics details by paging, including task count, token usage, and LLM call count.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Worker statistics details by paging, including task count, token usage, and LLM call count.</p>
     * 
     * @param request ListWorkerStatsDetailsRequest
     * @return ListWorkerStatsDetailsResponse
     */
    public ListWorkerStatsDetailsResponse listWorkerStatsDetails(ListWorkerStatsDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkerStatsDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of Workers under a specified instance by using paging, with support for filtering by name, model, template, and other conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Workers under a specified instance by using paging, with support for filtering by name, model, template, and other conditions.</p>
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
     * <b>description</b> :
     * <p>Queries the list of Workers under a specified instance by using paging, with support for filtering by name, model, template, and other conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Workers under a specified instance by using paging, with support for filtering by name, model, template, and other conditions.</p>
     * 
     * @param request ListWorkersRequest
     * @return ListWorkersResponse
     */
    public ListWorkersResponse listWorkers(ListWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates or updates a CMS workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates a CMS workspace.</p>
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
     * <b>description</b> :
     * <p>Creates or updates a CMS workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates a CMS workspace.</p>
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
     * <p>Queries the feature status of a specified instance, worker, team, or individual.</p>
     * <ul>
     * <li>This operation queries the feature status of different targets (such as INSTANCE, WORKER, TEAM, or HUMAN) under a specific instanceId.</li>
     * <li>The targetScope parameter defines the target type for the query. Depending on the targetScope value, you may need to provide an additional resourceName parameter to specify the resource name.</li>
     * <li>If a featureCodes list is provided, the status of those specific features is returned. Otherwise, the status of all features under the specified targetScope is returned.</li>
     * <li>When using WORKER, TEAM, or HUMAN as the targetScope, make sure to correctly specify the corresponding resourceName.</li>
     * <li>For INSTANCE-level queries, resourceName is not required.</li>
     * <li>Feature support is affected by factors such as the base version and worker version. The unsupportedReasonCode and unsupportedReason fields provide the specific reason why a feature is not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the attribute status of a specified instance, worker, team, or individual.</p>
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
     * <p>Queries the feature status of a specified instance, worker, team, or individual.</p>
     * <ul>
     * <li>This operation queries the feature status of different targets (such as INSTANCE, WORKER, TEAM, or HUMAN) under a specific instanceId.</li>
     * <li>The targetScope parameter defines the target type for the query. Depending on the targetScope value, you may need to provide an additional resourceName parameter to specify the resource name.</li>
     * <li>If a featureCodes list is provided, the status of those specific features is returned. Otherwise, the status of all features under the specified targetScope is returned.</li>
     * <li>When using WORKER, TEAM, or HUMAN as the targetScope, make sure to correctly specify the corresponding resourceName.</li>
     * <li>For INSTANCE-level queries, resourceName is not required.</li>
     * <li>Feature support is affected by factors such as the base version and worker version. The unsupportedReasonCode and unsupportedReason fields provide the specific reason why a feature is not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the attribute status of a specified instance, worker, team, or individual.</p>
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
     * <p>Retrieves all zone IDs supported by the current AgentTeams Resource Pool configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all zone IDs supported by the current AgentTeams Resource Pool configuration.</p>
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
     * <p>Retrieves all zone IDs supported by the current AgentTeams Resource Pool configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves all zone IDs supported by the current AgentTeams Resource Pool configuration.</p>
     * 
     * @param request QuerySupportedZonesRequest
     * @return QuerySupportedZonesResponse
     */
    public QuerySupportedZonesResponse querySupportedZones(QuerySupportedZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupportedZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resets the password of a specified user under a specified instance. After the reset, the user must log on with the new password.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a specified user under a specified instance. After the reset, the user must log on with the new password.</p>
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
     * <b>description</b> :
     * <p>Resets the password of a specified user under a specified instance. After the reset, the user must log on with the new password.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a specified user under a specified instance. After the reset, the user must log on with the new password.</p>
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
     * <p>Tests the connectivity of an AI model provider and model under a specified AgentTeams instance by sending a test prompt and returning the call result, latency, and token usage.</p>
     * 
     * <b>summary</b> : 
     * <p>Tests the connectivity of an AI model provider and model under a specified AgentTeams instance by sending a test prompt and returning the call result, latency, and token usage.</p>
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
     * <p>Tests the connectivity of an AI model provider and model under a specified AgentTeams instance by sending a test prompt and returning the call result, latency, and token usage.</p>
     * 
     * <b>summary</b> : 
     * <p>Tests the connectivity of an AI model provider and model under a specified AgentTeams instance by sending a test prompt and returning the call result, latency, and token usage.</p>
     * 
     * @param request TestModelProviderRequest
     * @return TestModelProviderResponse
     */
    public TestModelProviderResponse testModelProvider(TestModelProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testModelProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Unbinds the upstream identity provider from a specified instance, dissociates the identity federation relationship, and cleans up associated user identities and data.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds the upstream identity provider from a specified instance, dissociates the identity federation relationship, and cleans up associated user identities and data.</p>
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
     * <b>description</b> :
     * <p>Unbinds the upstream identity provider from a specified instance, dissociates the identity federation relationship, and cleans up associated user identities and data.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds the upstream identity provider from a specified instance, dissociates the identity federation relationship, and cleans up associated user identities and data.</p>
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
     * <p>Updates the plaintext key of an existing credential in an AgentTeams instance.</p>
     * <ul>
     * <li>This operation updates the plaintext key of an existing Credential in an AgentTeams instance.</li>
     * <li>Only the key value of the APIKeyCredentialProvider with the same name in the Agent Identity TokenVault is updated. Local metadata (description, createTime, updateTime, and status) is not modified.</li>
     * <li>The response does not contain the apiKey plaintext. To obtain Worker details, call GetCredential.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the plaintext key of an existing credential in an AgentTeams instance.</p>
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
     * <p>Updates the plaintext key of an existing credential in an AgentTeams instance.</p>
     * <ul>
     * <li>This operation updates the plaintext key of an existing Credential in an AgentTeams instance.</li>
     * <li>Only the key value of the APIKeyCredentialProvider with the same name in the Agent Identity TokenVault is updated. Local metadata (description, createTime, updateTime, and status) is not modified.</li>
     * <li>The response does not contain the apiKey plaintext. To obtain Worker details, call GetCredential.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the plaintext key of an existing credential in an AgentTeams instance.</p>
     * 
     * @param request UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredential(UpdateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the upstream identity provider configuration bound to a specified instance. You can adjust the logon switch and user synchronization switch.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the upstream identity provider configuration bound to a specified instance. You can adjust the logon switch and user synchronization switch.</p>
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
     * <b>description</b> :
     * <p>Updates the upstream identity provider configuration bound to a specified instance. You can adjust the logon switch and user synchronization switch.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the upstream identity provider configuration bound to a specified instance. You can adjust the logon switch and user synchronization switch.</p>
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
     * <p>Changes the name of a specified AgentTeams instance. This operation supports GET and POST methods. You can only modify the instance name through this operation. You cannot change the namespace through this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the name of a specified AgentTeams instance. This operation supports GET and POST methods. You can only modify the instance name through this operation. You cannot change the namespace through this operation.</p>
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
     * <p>Changes the name of a specified AgentTeams instance. This operation supports GET and POST methods. You can only modify the instance name through this operation. You cannot change the namespace through this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the name of a specified AgentTeams instance. This operation supports GET and POST methods. You can only modify the instance name through this operation. You cannot change the namespace through this operation.</p>
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
     * <p>Restarts a paused asynchronous task for creating an instance.</p>
     * <ul>
     * <li>This operation restarts a create-instance task that is in the paused state.</li>
     * <li>Only tasks of the agentteams:pay-order:create type are supported.</li>
     * <li>Ensure that the InstanceId, TaskCode, and TaskId parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If the task is not in the paused state (PAUSED), you cannot call this operation to update the task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts a paused asynchronous task for creating an instance.</p>
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
     * <p>Restarts a paused asynchronous task for creating an instance.</p>
     * <ul>
     * <li>This operation restarts a create-instance task that is in the paused state.</li>
     * <li>Only tasks of the agentteams:pay-order:create type are supported.</li>
     * <li>Ensure that the InstanceId, TaskCode, and TaskId parameters are accurate. Otherwise, the request may fail.</li>
     * <li>If the task is not in the paused state (PAUSED), you cannot call this operation to update the task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts a paused asynchronous task for creating an instance.</p>
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
     * <p>Updates the configuration of a specified MCP server, including the address list, authentication information, and description.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified MCP server, including the address list, authentication information, and description.</p>
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
     * <p>Updates the configuration of a specified MCP server, including the address list, authentication information, and description.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified MCP server, including the address list, authentication information, and description.</p>
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
     * <p>Updates the description and other information of an AI model in a specified AgentTeams instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and other information of an AI model in a specified AgentTeams instance.</p>
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
     * <p>Updates the description and other information of an AI model in a specified AgentTeams instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and other information of an AI model in a specified AgentTeams instance.</p>
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
     * <p>Updates the address, protocol list, API key, and other information of an AI model provider in a specified AgentTeams instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, protocol list, API key, and other information of an AI model provider in a specified AgentTeams instance.</p>
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
     * <p>Updates the address, protocol list, API key, and other information of an AI model provider in a specified AgentTeams instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the address, protocol list, API key, and other information of an AI model provider in a specified AgentTeams instance.</p>
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
     * <p>Updates the domain name and SSL certificate information for a specified endpoint.</p>
     * <ul>
     * <li>This API operation supports updating endpoints of the ELEMENT or MATRIX type.</li>
     * <li>If you attempt to update an endpoint of another type, a 400 error is returned.</li>
     * <li>If the endpointId does not exist or does not belong to the current user instance, a 404 error is returned.</li>
     * <li>When updating a domain name, the system creates or reuses a new HTTPS domain and binds it to the original endpoint route. The old domain is unbound but not deleted.</li>
     * <li>If the domain or certIdentifier parameter is not specified, the existing settings are retained.</li>
     * <li>Other fields such as component and gatewayType are not updated even if they are specified in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the domain name and SSL certificate information for a specified endpoint.</p>
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
     * <p>Updates the domain name and SSL certificate information for a specified endpoint.</p>
     * <ul>
     * <li>This API operation supports updating endpoints of the ELEMENT or MATRIX type.</li>
     * <li>If you attempt to update an endpoint of another type, a 400 error is returned.</li>
     * <li>If the endpointId does not exist or does not belong to the current user instance, a 404 error is returned.</li>
     * <li>When updating a domain name, the system creates or reuses a new HTTPS domain and binds it to the original endpoint route. The old domain is unbound but not deleted.</li>
     * <li>If the domain or certIdentifier parameter is not specified, the existing settings are retained.</li>
     * <li>Other fields such as component and gatewayType are not updated even if they are specified in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the domain name and SSL certificate information for a specified endpoint.</p>
     * 
     * @param request UpdateServiceEndpointRequest
     * @return UpdateServiceEndpointResponse
     */
    public UpdateServiceEndpointResponse updateServiceEndpoint(UpdateServiceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the description and member list of a team under a specified instance, and returns the latest team information after the update.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and member list of a team under a specified instance, and returns the latest team information after the update.</p>
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
     * <b>description</b> :
     * <p>Updates the description and member list of a team under a specified instance, and returns the latest team information after the update.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description and member list of a team under a specified instance, and returns the latest team information after the update.</p>
     * 
     * @param request UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(UpdateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTeamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the information of a specified user under a specified instance, including the display name, email address, authentication method, and remarks.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of a specified user under a specified instance, including the display name, email address, authentication method, and remarks.</p>
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
     * <b>description</b> :
     * <p>Updates the information of a specified user under a specified instance, including the display name, email address, authentication method, and remarks.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of a specified user under a specified instance, including the display name, email address, authentication method, and remarks.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified Worker, including model, skills, template, MCP servers, channels, and quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified Worker, including model, skills, template, MCP servers, channels, and quotas.</p>
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
     * <b>description</b> :
     * <p>Updates the configuration of a specified Worker, including model, skills, template, MCP servers, channels, and quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified Worker, including model, skills, template, MCP servers, channels, and quotas.</p>
     * 
     * @param request UpdateWorkerRequest
     * @return UpdateWorkerResponse
     */
    public UpdateWorkerResponse updateWorker(UpdateWorkerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkerWithOptions(request, runtime);
    }
}
