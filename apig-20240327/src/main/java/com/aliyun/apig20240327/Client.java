// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327;

import com.aliyun.tea.*;
import com.aliyun.apig20240327.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("apig", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Authorize the security group for gateway to access services</p>
     * 
     * @param request AddGatewaySecurityGroupRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewaySecurityGroupRuleResponse
     */
    public AddGatewaySecurityGroupRuleResponse addGatewaySecurityGroupRuleWithOptions(String gatewayId, AddGatewaySecurityGroupRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRanges)) {
            body.put("portRanges", request.portRanges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("securityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewaySecurityGroupRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/security-group-rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewaySecurityGroupRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorize the security group for gateway to access services</p>
     * 
     * @param request AddGatewaySecurityGroupRuleRequest
     * @return AddGatewaySecurityGroupRuleResponse
     */
    public AddGatewaySecurityGroupRuleResponse addGatewaySecurityGroupRule(String gatewayId, AddGatewaySecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGatewaySecurityGroupRuleWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes consumer authentication rules.</p>
     * 
     * @param request BatchDeleteConsumerAuthorizationRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteConsumerAuthorizationRuleResponse
     */
    public BatchDeleteConsumerAuthorizationRuleResponse batchDeleteConsumerAuthorizationRuleWithOptions(BatchDeleteConsumerAuthorizationRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerAuthorizationRuleIds)) {
            query.put("consumerAuthorizationRuleIds", request.consumerAuthorizationRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/authorization-rules"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes consumer authentication rules.</p>
     * 
     * @param request BatchDeleteConsumerAuthorizationRuleRequest
     * @return BatchDeleteConsumerAuthorizationRuleResponse
     */
    public BatchDeleteConsumerAuthorizationRuleResponse batchDeleteConsumerAuthorizationRule(BatchDeleteConsumerAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteConsumerAuthorizationRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resource Group Transfer</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/move-resource-group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resource Group Transfer</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and associates a policy.</p>
     * 
     * @param request CreateAndAttachPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndAttachPolicyResponse
     */
    public CreateAndAttachPolicyResponse createAndAttachPolicyWithOptions(CreateAndAttachPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceIds)) {
            body.put("attachResourceIds", request.attachResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            body.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("className", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndAttachPolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndAttachPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and associates a policy.</p>
     * 
     * @param request CreateAndAttachPolicyRequest
     * @return CreateAndAttachPolicyResponse
     */
    public CreateAndAttachPolicyResponse createAndAttachPolicy(CreateAndAttachPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAndAttachPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer.</p>
     * 
     * @param request CreateConsumerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerResponse
     */
    public CreateConsumerResponse createConsumerWithOptions(CreateConsumerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.akSkIdentityConfigs)) {
            body.put("akSkIdentityConfigs", request.akSkIdentityConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apikeyIdentityConfig)) {
            body.put("apikeyIdentityConfig", request.apikeyIdentityConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtIdentityConfig)) {
            body.put("jwtIdentityConfig", request.jwtIdentityConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer.</p>
     * 
     * @param request CreateConsumerRequest
     * @return CreateConsumerResponse
     */
    public CreateConsumerResponse createConsumer(CreateConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer authorization rule.</p>
     * 
     * @param request CreateConsumerAuthorizationRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerAuthorizationRuleResponse
     */
    public CreateConsumerAuthorizationRuleResponse createConsumerAuthorizationRuleWithOptions(String consumerId, CreateConsumerAuthorizationRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceInfos)) {
            body.put("authorizationResourceInfos", request.authorizationResourceInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireMode)) {
            body.put("expireMode", request.expireMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimestamp)) {
            body.put("expireTimestamp", request.expireTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentResourceType)) {
            body.put("parentResourceType", request.parentResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + "/authorization-rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer authorization rule.</p>
     * 
     * @param request CreateConsumerAuthorizationRuleRequest
     * @return CreateConsumerAuthorizationRuleResponse
     */
    public CreateConsumerAuthorizationRuleResponse createConsumerAuthorizationRule(String consumerId, CreateConsumerAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerAuthorizationRuleWithOptions(consumerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer authentication rule.</p>
     * 
     * @param request CreateConsumerAuthorizationRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerAuthorizationRulesResponse
     */
    public CreateConsumerAuthorizationRulesResponse createConsumerAuthorizationRulesWithOptions(CreateConsumerAuthorizationRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRules)) {
            body.put("authorizationRules", request.authorizationRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerAuthorizationRules"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/authorization-rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer authentication rule.</p>
     * 
     * @param request CreateConsumerAuthorizationRulesRequest
     * @return CreateConsumerAuthorizationRulesResponse
     */
    public CreateConsumerAuthorizationRulesResponse createConsumerAuthorizationRules(CreateConsumerAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerAuthorizationRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name.</p>
     * 
     * @param request CreateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertIdentifier)) {
            body.put("caCertIdentifier", request.caCertIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            body.put("certIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientCACert)) {
            body.put("clientCACert", request.clientCACert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceHttps)) {
            body.put("forceHttps", request.forceHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Option)) {
            body.put("http2Option", request.http2Option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mTLSEnabled)) {
            body.put("mTLSEnabled", request.mTLSEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsCipherSuitesConfig)) {
            body.put("tlsCipherSuitesConfig", request.tlsCipherSuitesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMax)) {
            body.put("tlsMax", request.tlsMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMin)) {
            body.put("tlsMin", request.tlsMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain name.</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create environment.</p>
     * 
     * <b>summary</b> : 
     * <p>CreateEnvironment</p>
     * 
     * @deprecated OpenAPI CreateEnvironment is deprecated
     * 
     * @param request CreateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnvironment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/environments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnvironmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create environment.</p>
     * 
     * <b>summary</b> : 
     * <p>CreateEnvironment</p>
     * 
     * @deprecated OpenAPI CreateEnvironment is deprecated
     * 
     * @param request CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud-native gateway.</p>
     * 
     * @param request CreateGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayEdition)) {
            body.put("gatewayEdition", request.gatewayEdition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logConfig)) {
            body.put("logConfig", request.logConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessConfig)) {
            body.put("networkAccessConfig", request.networkAccessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneConfig)) {
            body.put("zoneConfig", request.zoneConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGateway"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud-native gateway.</p>
     * 
     * @param request CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an HTTP API.</p>
     * 
     * @param request CreateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpApiResponse
     */
    public CreateHttpApiResponse createHttpApiWithOptions(CreateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProtocols)) {
            body.put("agentProtocols", request.agentProtocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aiProtocols)) {
            body.put("aiProtocols", request.aiProtocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            body.put("authConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            body.put("basePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployConfigs)) {
            body.put("deployConfigs", request.deployConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuth)) {
            body.put("enableAuth", request.enableAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstByteTimeout)) {
            body.put("firstByteTimeout", request.firstByteTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConfig)) {
            body.put("ingressConfig", request.ingressConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCategory)) {
            body.put("modelCategory", request.modelCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("protocols", request.protocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeBasePathOnForward)) {
            body.put("removeBasePathOnForward", request.removeBasePathOnForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionConfig)) {
            body.put("versionConfig", request.versionConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an HTTP API.</p>
     * 
     * @param request CreateHttpApiRequest
     * @return CreateHttpApiResponse
     */
    public CreateHttpApiResponse createHttpApi(CreateHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHttpApiWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an Operation for HTTP API</p>
     * 
     * @param request CreateHttpApiOperationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpApiOperationResponse
     */
    public CreateHttpApiOperationResponse createHttpApiOperationWithOptions(String httpApiId, CreateHttpApiOperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operations)) {
            body.put("operations", request.operations);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpApiOperation"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/operations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpApiOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an Operation for HTTP API</p>
     * 
     * @param request CreateHttpApiOperationRequest
     * @return CreateHttpApiOperationResponse
     */
    public CreateHttpApiOperationResponse createHttpApiOperation(String httpApiId, CreateHttpApiOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHttpApiOperationWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a route for an HTTP API.</p>
     * 
     * @param request CreateHttpApiRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpApiRouteResponse
     */
    public CreateHttpApiRouteResponse createHttpApiRouteWithOptions(String httpApiId, CreateHttpApiRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployConfigs)) {
            body.put("deployConfigs", request.deployConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIds)) {
            body.put("domainIds", request.domainIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpRouteConfig)) {
            body.put("mcpRouteConfig", request.mcpRouteConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpApiRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/routes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpApiRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a route for an HTTP API.</p>
     * 
     * @param request CreateHttpApiRouteRequest
     * @return CreateHttpApiRouteResponse
     */
    public CreateHttpApiRouteResponse createHttpApiRoute(String httpApiId, CreateHttpApiRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHttpApiRouteWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an MCP server.</p>
     * 
     * @param request CreateMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcpServerResponse
     */
    public CreateMcpServerResponse createMcpServerWithOptions(CreateMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assembledSources)) {
            body.put("assembledSources", request.assembledSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromType)) {
            body.put("createFromType", request.createFromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIds)) {
            body.put("domainIds", request.domainIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exposedUriPath)) {
            body.put("exposedUriPath", request.exposedUriPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayMcpServerConfigs)) {
            body.put("grayMcpServerConfigs", request.grayMcpServerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpStatisticsEnable)) {
            body.put("mcpStatisticsEnable", request.mcpStatisticsEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an MCP server.</p>
     * 
     * @param request CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    public CreateMcpServerResponse createMcpServer(CreateMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMcpServerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a plug-in.</p>
     * 
     * @param request CreatePluginAttachmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePluginAttachmentResponse
     */
    public CreatePluginAttachmentResponse createPluginAttachmentWithOptions(CreatePluginAttachmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceIds)) {
            body.put("attachResourceIds", request.attachResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            body.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginConfig)) {
            body.put("pluginConfig", request.pluginConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            body.put("pluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePluginAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-attachments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePluginAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a plug-in.</p>
     * 
     * @param request CreatePluginAttachmentRequest
     * @return CreatePluginAttachmentResponse
     */
    public CreatePluginAttachmentResponse createPluginAttachment(CreatePluginAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPluginAttachmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Policy</p>
     * 
     * @param request CreatePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("className", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Policy</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create policy resource mount</p>
     * 
     * @param request CreatePolicyAttachmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyAttachmentResponse
     */
    public CreatePolicyAttachmentResponse createPolicyAttachmentWithOptions(CreatePolicyAttachmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceId)) {
            body.put("attachResourceId", request.attachResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            body.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("policyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policy-attachments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create policy resource mount</p>
     * 
     * @param request CreatePolicyAttachmentRequest
     * @return CreatePolicyAttachmentResponse
     */
    public CreatePolicyAttachmentResponse createPolicyAttachment(CreatePolicyAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPolicyAttachmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建密钥</p>
     * 
     * @param request CreateSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecretWithOptions(CreateSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsConfig)) {
            body.put("kmsConfig", request.kmsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretData)) {
            body.put("secretData", request.secretData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretSource)) {
            body.put("secretSource", request.secretSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecret"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建密钥</p>
     * 
     * @param request CreateSecretRequest
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecretWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a service.</p>
     * 
     * @param request CreateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConfigs)) {
            body.put("serviceConfigs", request.serviceConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("sourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a service.</p>
     * 
     * @param request CreateServiceRequest
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service version.</p>
     * 
     * @param request CreateServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceVersionResponse
     */
    public CreateServiceVersionResponse createServiceVersionWithOptions(String serviceId, CreateServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + "/versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service version.</p>
     * 
     * @param request CreateServiceVersionRequest
     * @return CreateServiceVersionResponse
     */
    public CreateServiceVersionResponse createServiceVersion(String serviceId, CreateServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceVersionWithOptions(serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务来源</p>
     * 
     * @param request CreateSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSourceResponse
     */
    public CreateSourceResponse createSourceWithOptions(CreateSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sSourceConfig)) {
            body.put("k8sSourceConfig", request.k8sSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacosSourceConfig)) {
            body.put("nacosSourceConfig", request.nacosSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务来源</p>
     * 
     * @param request CreateSourceRequest
     * @return CreateSourceResponse
     */
    public CreateSourceResponse createSource(CreateSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerResponse
     */
    public DeleteConsumerResponse deleteConsumerWithOptions(String consumerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer.</p>
     * @return DeleteConsumerResponse
     */
    public DeleteConsumerResponse deleteConsumer(String consumerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerWithOptions(consumerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer authorization rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerAuthorizationRuleResponse
     */
    public DeleteConsumerAuthorizationRuleResponse deleteConsumerAuthorizationRuleWithOptions(String consumerAuthorizationRuleId, String consumerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + "/authorization-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerAuthorizationRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer authorization rule.</p>
     * @return DeleteConsumerAuthorizationRuleResponse
     */
    public DeleteConsumerAuthorizationRuleResponse deleteConsumerAuthorizationRule(String consumerAuthorizationRuleId, String consumerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerAuthorizationRuleWithOptions(consumerAuthorizationRuleId, consumerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteDomain</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(String domainId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteDomain</p>
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(String domainId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(domainId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteEnvironment</p>
     * 
     * @deprecated OpenAPI DeleteEnvironment is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public DeleteEnvironmentResponse deleteEnvironmentWithOptions(String environmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnvironment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(environmentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteEnvironment</p>
     * 
     * @deprecated OpenAPI DeleteEnvironment is deprecated
     * @return DeleteEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public DeleteEnvironmentResponse deleteEnvironment(String environmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEnvironmentWithOptions(environmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Gateway</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGatewayWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Gateway</p>
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the security group rule of a gateway</p>
     * 
     * @param request DeleteGatewaySecurityGroupRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewaySecurityGroupRuleResponse
     */
    public DeleteGatewaySecurityGroupRuleResponse deleteGatewaySecurityGroupRuleWithOptions(String gatewayId, String securityGroupRuleId, DeleteGatewaySecurityGroupRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cascadingDelete)) {
            query.put("cascadingDelete", request.cascadingDelete);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewaySecurityGroupRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/security-group-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(securityGroupRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewaySecurityGroupRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the security group rule of a gateway</p>
     * 
     * @param request DeleteGatewaySecurityGroupRuleRequest
     * @return DeleteGatewaySecurityGroupRuleResponse
     */
    public DeleteGatewaySecurityGroupRuleResponse deleteGatewaySecurityGroupRule(String gatewayId, String securityGroupRuleId, DeleteGatewaySecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewaySecurityGroupRuleWithOptions(gatewayId, securityGroupRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an HTTP API.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpApiResponse
     */
    public DeleteHttpApiResponse deleteHttpApiWithOptions(String httpApiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an HTTP API.</p>
     * @return DeleteHttpApiResponse
     */
    public DeleteHttpApiResponse deleteHttpApi(String httpApiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHttpApiWithOptions(httpApiId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Operation</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpApiOperationResponse
     */
    public DeleteHttpApiOperationResponse deleteHttpApiOperationWithOptions(String httpApiId, String operationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpApiOperation"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/operations/" + com.aliyun.openapiutil.Client.getEncodeParam(operationId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpApiOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Operation</p>
     * @return DeleteHttpApiOperationResponse
     */
    public DeleteHttpApiOperationResponse deleteHttpApiOperation(String httpApiId, String operationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHttpApiOperationWithOptions(httpApiId, operationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the route of an HttpApi</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpApiRouteResponse
     */
    public DeleteHttpApiRouteResponse deleteHttpApiRouteWithOptions(String httpApiId, String routeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpApiRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/routes/" + com.aliyun.openapiutil.Client.getEncodeParam(routeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpApiRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the route of an HttpApi</p>
     * @return DeleteHttpApiRouteResponse
     */
    public DeleteHttpApiRouteResponse deleteHttpApiRoute(String httpApiId, String routeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHttpApiRouteWithOptions(httpApiId, routeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除MCP server</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcpServerResponse
     */
    public DeleteMcpServerResponse deleteMcpServerWithOptions(String mcpServerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除MCP server</p>
     * @return DeleteMcpServerResponse
     */
    public DeleteMcpServerResponse deleteMcpServer(String mcpServerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMcpServerWithOptions(mcpServerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a plug-in attachment.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePluginAttachmentResponse
     */
    public DeletePluginAttachmentResponse deletePluginAttachmentWithOptions(String pluginAttachmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePluginAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-attachments/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginAttachmentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePluginAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a plug-in attachment.</p>
     * @return DeletePluginAttachmentResponse
     */
    public DeletePluginAttachmentResponse deletePluginAttachment(String pluginAttachmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePluginAttachmentWithOptions(pluginAttachmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Policy</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Policy</p>
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyWithOptions(policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete policy resource attachment</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyAttachmentResponse
     */
    public DeletePolicyAttachmentResponse deletePolicyAttachmentWithOptions(String policyAttachmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policy-attachments/" + com.aliyun.openapiutil.Client.getEncodeParam(policyAttachmentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete policy resource attachment</p>
     * @return DeletePolicyAttachmentResponse
     */
    public DeletePolicyAttachmentResponse deletePolicyAttachment(String policyAttachmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyAttachmentWithOptions(policyAttachmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除密钥</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecretWithOptions(String secretId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecret"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets/" + com.aliyun.openapiutil.Client.getEncodeParam(secretId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除密钥</p>
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(String secretId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSecretWithOptions(secretId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service.</p>
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service version.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceVersionResponse
     */
    public DeleteServiceVersionResponse deleteServiceVersionWithOptions(String serviceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service version.</p>
     * @return DeleteServiceVersionResponse
     */
    public DeleteServiceVersionResponse deleteServiceVersion(String serviceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceVersionWithOptions(serviceId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务来源</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSourceWithOptions(String sourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/sources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务来源</p>
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSource(String sourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSourceWithOptions(sourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploy HttpApi</p>
     * 
     * @param request DeployHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployHttpApiResponse
     */
    public DeployHttpApiResponse deployHttpApiWithOptions(String httpApiId, DeployHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.httpApiConfig)) {
            body.put("httpApiConfig", request.httpApiConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restApiConfig)) {
            body.put("restApiConfig", request.restApiConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            body.put("routeId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/deploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploy HttpApi</p>
     * 
     * @param request DeployHttpApiRequest
     * @return DeployHttpApiResponse
     */
    public DeployHttpApiResponse deployHttpApi(String httpApiId, DeployHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployHttpApiWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys an MCP server.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployMcpServerResponse
     */
    public DeployMcpServerResponse deployMcpServerWithOptions(String mcpServerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + "/deploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys an MCP server.</p>
     * @return DeployMcpServerResponse
     */
    public DeployMcpServerResponse deployMcpServer(String mcpServerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployMcpServerWithOptions(mcpServerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export HTTP API</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportHttpApiResponse
     */
    public ExportHttpApiResponse exportHttpApiWithOptions(String httpApiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/export"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export HTTP API</p>
     * @return ExportHttpApiResponse
     */
    public ExportHttpApiResponse exportHttpApi(String httpApiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportHttpApiWithOptions(httpApiId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information of a consumer.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerResponse
     */
    public GetConsumerResponse getConsumerWithOptions(String consumerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information of a consumer.</p>
     * @return GetConsumerResponse
     */
    public GetConsumerResponse getConsumer(String consumerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerWithOptions(consumerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a consumer authentication rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumerAuthorizationRuleResponse
     */
    public GetConsumerAuthorizationRuleResponse getConsumerAuthorizationRuleWithOptions(String consumerAuthorizationRuleId, String consumerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + "/authorization-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerAuthorizationRuleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a consumer authentication rule.</p>
     * @return GetConsumerAuthorizationRuleResponse
     */
    public GetConsumerAuthorizationRuleResponse getConsumerAuthorizationRule(String consumerAuthorizationRuleId, String consumerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumerAuthorizationRuleWithOptions(consumerAuthorizationRuleId, consumerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains data from dashboards.</p>
     * 
     * @param tmpReq GetDashboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDashboardResponse
     */
    public GetDashboardResponse getDashboardWithOptions(String gatewayId, GetDashboardRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDashboardShrinkRequest request = new GetDashboardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("apiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginClassId)) {
            query.put("pluginClassId", request.pluginClassId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("pluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("routeId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamCluster)) {
            query.put("upstreamCluster", request.upstreamCluster);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDashboard"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/dashboards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDashboardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains data from dashboards.</p>
     * 
     * @param request GetDashboardRequest
     * @return GetDashboardResponse
     */
    public GetDashboardResponse getDashboard(String gatewayId, GetDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDashboardWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a domain name.</p>
     * 
     * @param request GetDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(String domainId, GetDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("withStatistics", request.withStatistics);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a domain name.</p>
     * 
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(String domainId, GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(domainId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetEnvironment</p>
     * 
     * @deprecated OpenAPI GetEnvironment is deprecated
     * 
     * @param request GetEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public GetEnvironmentResponse getEnvironmentWithOptions(String environmentId, GetEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("withStatistics", request.withStatistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withVpcInfo)) {
            query.put("withVpcInfo", request.withVpcInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(environmentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetEnvironment</p>
     * 
     * @deprecated OpenAPI GetEnvironment is deprecated
     * 
     * @param request GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public GetEnvironmentResponse getEnvironment(String environmentId, GetEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(environmentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about an instance, such as the virtual private cloud (VPC) and vSwitch to which the instance belongs and its ingress.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayResponse
     */
    public GetGatewayResponse getGatewayWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGateway"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about an instance, such as the virtual private cloud (VPC) and vSwitch to which the instance belongs and its ingress.</p>
     * @return GetGatewayResponse
     */
    public GetGatewayResponse getGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGatewayWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Read HttpApi</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpApiResponse
     */
    public GetHttpApiResponse getHttpApiWithOptions(String httpApiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Read HttpApi</p>
     * @return GetHttpApiResponse
     */
    public GetHttpApiResponse getHttpApi(String httpApiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiWithOptions(httpApiId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Operation</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpApiOperationResponse
     */
    public GetHttpApiOperationResponse getHttpApiOperationWithOptions(String httpApiId, String operationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpApiOperation"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/operations/" + com.aliyun.openapiutil.Client.getEncodeParam(operationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpApiOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Operation</p>
     * @return GetHttpApiOperationResponse
     */
    public GetHttpApiOperationResponse getHttpApiOperation(String httpApiId, String operationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiOperationWithOptions(httpApiId, operationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a route of an HTTP API.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpApiRouteResponse
     */
    public GetHttpApiRouteResponse getHttpApiRouteWithOptions(String httpApiId, String routeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpApiRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/routes/" + com.aliyun.openapiutil.Client.getEncodeParam(routeId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpApiRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a route of an HTTP API.</p>
     * @return GetHttpApiRouteResponse
     */
    public GetHttpApiRouteResponse getHttpApiRoute(String httpApiId, String routeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiRouteWithOptions(httpApiId, routeId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information of an MCP server.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpServerResponse
     */
    public GetMcpServerResponse getMcpServerWithOptions(String mcpServerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information of an MCP server.</p>
     * @return GetMcpServerResponse
     */
    public GetMcpServerResponse getMcpServer(String mcpServerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMcpServerWithOptions(mcpServerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a plug-in attachment.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPluginAttachmentResponse
     */
    public GetPluginAttachmentResponse getPluginAttachmentWithOptions(String pluginAttachmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPluginAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-attachments/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginAttachmentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPluginAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a plug-in attachment.</p>
     * @return GetPluginAttachmentResponse
     */
    public GetPluginAttachmentResponse getPluginAttachment(String pluginAttachmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPluginAttachmentWithOptions(pluginAttachmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a policy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicyWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a policy.</p>
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicy(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPolicyWithOptions(policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Policy Resource Attachment</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyAttachmentResponse
     */
    public GetPolicyAttachmentResponse getPolicyAttachmentWithOptions(String policyAttachmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policy-attachments/" + com.aliyun.openapiutil.Client.getEncodeParam(policyAttachmentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Policy Resource Attachment</p>
     * @return GetPolicyAttachmentResponse
     */
    public GetPolicyAttachmentResponse getPolicyAttachment(String policyAttachmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPolicyAttachmentWithOptions(policyAttachmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get resource overview information</p>
     * 
     * @param request GetResourceOverviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceOverviewResponse
     */
    public GetResourceOverviewResponse getResourceOverviewWithOptions(GetResourceOverviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceOverview"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/overview/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceOverviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get resource overview information</p>
     * 
     * @param request GetResourceOverviewRequest
     * @return GetResourceOverviewResponse
     */
    public GetResourceOverviewResponse getResourceOverview(GetResourceOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceOverviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretResponse
     */
    public GetSecretResponse getSecretWithOptions(String secretId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecret"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets/" + com.aliyun.openapiutil.Client.getEncodeParam(secretId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥</p>
     * @return GetSecretResponse
     */
    public GetSecretResponse getSecret(String secretId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSecretWithOptions(secretId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥值</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValueWithOptions(String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretValue"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets/name/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/value"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥值</p>
     * @return GetSecretValueResponse
     */
    public GetSecretValueResponse getSecretValue(String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSecretValueWithOptions(name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a service.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceResponse
     */
    public GetServiceResponse getServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a service.</p>
     * @return GetServiceResponse
     */
    public GetServiceResponse getService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(serviceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a service source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSourceResponse
     */
    public GetSourceResponse getSourceWithOptions(String sourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/sources/" + com.aliyun.openapiutil.Client.getEncodeParam(sourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a service source.</p>
     * @return GetSourceResponse
     */
    public GetSourceResponse getSource(String sourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSourceWithOptions(sourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve Tracing Configuration</p>
     * 
     * @param request GetTraceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTraceConfigResponse
     */
    public GetTraceConfigResponse getTraceConfigWithOptions(String gatewayId, GetTraceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTraceConfig"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/trace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTraceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve Tracing Configuration</p>
     * 
     * @param request GetTraceConfigRequest
     * @return GetTraceConfigResponse
     */
    public GetTraceConfigResponse getTraceConfig(String gatewayId, GetTraceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTraceConfigWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports HTTP APIs. You can call this operation to import OpenAPI 2.0 and OpenAPI 3.0.x definition files to create REST APIs.</p>
     * 
     * @param request ImportHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportHttpApiResponse
     */
    public ImportHttpApiResponse importHttpApiWithOptions(ImportHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployConfigs)) {
            body.put("deployConfigs", request.deployConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpRouteId)) {
            body.put("mcpRouteId", request.mcpRouteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specContentBase64)) {
            body.put("specContentBase64", request.specContentBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specFileUrl)) {
            body.put("specFileUrl", request.specFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specOssConfig)) {
            body.put("specOssConfig", request.specOssConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHttpApiId)) {
            body.put("targetHttpApiId", request.targetHttpApiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionConfig)) {
            body.put("versionConfig", request.versionConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/import"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports HTTP APIs. You can call this operation to import OpenAPI 2.0 and OpenAPI 3.0.x definition files to create REST APIs.</p>
     * 
     * @param request ImportHttpApiRequest
     * @return ImportHttpApiResponse
     */
    public ImportHttpApiResponse importHttpApi(ImportHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importHttpApiWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs a plug-in.</p>
     * 
     * @param request InstallPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallPluginResponse
     */
    public InstallPluginResponse installPluginWithOptions(InstallPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayIds)) {
            body.put("gatewayIds", request.gatewayIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginClassId)) {
            body.put("pluginClassId", request.pluginClassId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallPlugin"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugins/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallPluginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs a plug-in.</p>
     * 
     * @param request InstallPluginRequest
     * @return InstallPluginResponse
     */
    public InstallPluginResponse installPlugin(InstallPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installPluginWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询消费者授权规则列表</p>
     * 
     * @param request ListConsumerAuthorizationRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumerAuthorizationRulesResponse
     */
    public ListConsumerAuthorizationRulesResponse listConsumerAuthorizationRulesWithOptions(String consumerId, ListConsumerAuthorizationRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameLike)) {
            query.put("apiNameLike", request.apiNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerAuthorizationRules"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + "/authorization-rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumerAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询消费者授权规则列表</p>
     * 
     * @param request ListConsumerAuthorizationRulesRequest
     * @return ListConsumerAuthorizationRulesResponse
     */
    public ListConsumerAuthorizationRulesResponse listConsumerAuthorizationRules(String consumerId, ListConsumerAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerAuthorizationRulesWithOptions(consumerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumers.</p>
     * 
     * @param request ListConsumersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumersResponse
     */
    public ListConsumersResponse listConsumersWithOptions(ListConsumersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumers"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumers.</p>
     * 
     * @param request ListConsumersRequest
     * @return ListConsumersResponse
     */
    public ListConsumersResponse listConsumers(ListConsumersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names.</p>
     * 
     * @param request ListDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListEnvironments</p>
     * 
     * @deprecated OpenAPI ListEnvironments is deprecated
     * 
     * @param request ListEnvironmentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentsResponse
     */
    @Deprecated
    // Deprecated
    public ListEnvironmentsResponse listEnvironmentsWithOptions(ListEnvironmentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasLike)) {
            query.put("aliasLike", request.aliasLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayNameLike)) {
            query.put("gatewayNameLike", request.gatewayNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/environments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListEnvironments</p>
     * 
     * @deprecated OpenAPI ListEnvironments is deprecated
     * 
     * @param request ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    @Deprecated
    // Deprecated
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the feature parameter configurations of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayFeaturesResponse
     */
    public ListGatewayFeaturesResponse listGatewayFeaturesWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayFeatures"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-features"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayFeaturesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the feature parameter configurations of an instance.</p>
     * @return ListGatewayFeaturesResponse
     */
    public ListGatewayFeaturesResponse listGatewayFeatures(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayFeaturesWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param tmpReq ListGatewaysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewaysResponse
     */
    public ListGatewaysResponse listGatewaysWithOptions(ListGatewaysRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewaysShrinkRequest request = new ListGatewaysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGateways"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewaysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request ListGatewaysRequest
     * @return ListGatewaysResponse
     */
    public ListGatewaysResponse listGateways(ListGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewaysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Operations</p>
     * 
     * @param request ListHttpApiOperationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpApiOperationsResponse
     */
    public ListHttpApiOperationsResponse listHttpApiOperationsWithOptions(String httpApiId, ListHttpApiOperationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerAuthorizationRuleId)) {
            query.put("consumerAuthorizationRuleId", request.consumerAuthorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuth)) {
            query.put("enableAuth", request.enableAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forDeploy)) {
            query.put("forDeploy", request.forDeploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathLike)) {
            query.put("pathLike", request.pathLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConsumerInEnvironmentId)) {
            query.put("withConsumerInEnvironmentId", request.withConsumerInEnvironmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConsumerInfoById)) {
            query.put("withConsumerInfoById", request.withConsumerInfoById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPluginAttachmentByPluginId)) {
            query.put("withPluginAttachmentByPluginId", request.withPluginAttachmentByPluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpApiOperations"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/operations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpApiOperationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Operations</p>
     * 
     * @param request ListHttpApiOperationsRequest
     * @return ListHttpApiOperationsResponse
     */
    public ListHttpApiOperationsResponse listHttpApiOperations(String httpApiId, ListHttpApiOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHttpApiOperationsWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of an HTTP API.</p>
     * 
     * @param request ListHttpApiRoutesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpApiRoutesResponse
     */
    public ListHttpApiRoutesResponse listHttpApiRoutesWithOptions(String httpApiId, ListHttpApiRoutesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerAuthorizationRuleId)) {
            query.put("consumerAuthorizationRuleId", request.consumerAuthorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployStatuses)) {
            query.put("deployStatuses", request.deployStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("domainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forDeploy)) {
            query.put("forDeploy", request.forDeploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathLike)) {
            query.put("pathLike", request.pathLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAuthPolicyInfo)) {
            query.put("withAuthPolicyInfo", request.withAuthPolicyInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConsumerInfoById)) {
            query.put("withConsumerInfoById", request.withConsumerInfoById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPluginAttachmentByPluginId)) {
            query.put("withPluginAttachmentByPluginId", request.withPluginAttachmentByPluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpApiRoutes"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/routes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpApiRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of an HTTP API.</p>
     * 
     * @param request ListHttpApiRoutesRequest
     * @return ListHttpApiRoutesResponse
     */
    public ListHttpApiRoutesResponse listHttpApiRoutes(String httpApiId, ListHttpApiRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHttpApiRoutesWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of HTTP APIs.</p>
     * 
     * @param request ListHttpApisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpApisResponse
     */
    public ListHttpApisResponse listHttpApisWithOptions(ListHttpApisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAPIsPublishedToEnvironment)) {
            query.put("withAPIsPublishedToEnvironment", request.withAPIsPublishedToEnvironment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAuthPolicyInEnvironmentId)) {
            query.put("withAuthPolicyInEnvironmentId", request.withAuthPolicyInEnvironmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAuthPolicyList)) {
            query.put("withAuthPolicyList", request.withAuthPolicyList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConsumerInfoById)) {
            query.put("withConsumerInfoById", request.withConsumerInfoById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEnvironmentInfo)) {
            query.put("withEnvironmentInfo", request.withEnvironmentInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEnvironmentInfoById)) {
            query.put("withEnvironmentInfoById", request.withEnvironmentInfoById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withIngressInfo)) {
            query.put("withIngressInfo", request.withIngressInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPluginAttachmentByPluginId)) {
            query.put("withPluginAttachmentByPluginId", request.withPluginAttachmentByPluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPolicyConfigs)) {
            query.put("withPolicyConfigs", request.withPolicyConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpApis"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpApisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of HTTP APIs.</p>
     * 
     * @param request ListHttpApisRequest
     * @return ListHttpApisResponse
     */
    public ListHttpApisResponse listHttpApis(ListHttpApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHttpApisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of MCP servers.</p>
     * 
     * @param request ListMcpServersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpServersResponse
     */
    public ListMcpServersResponse listMcpServersWithOptions(ListMcpServersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFromTypes)) {
            query.put("createFromTypes", request.createFromTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployStatuses)) {
            query.put("deployStatuses", request.deployStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcpServers"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create multiple services at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of MCP servers.</p>
     * 
     * @param request ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    public ListMcpServersResponse listMcpServers(ListMcpServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMcpServersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of plug-in attachments.</p>
     * 
     * @param request ListPluginAttachmentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPluginAttachmentsResponse
     */
    public ListPluginAttachmentsResponse listPluginAttachmentsWithOptions(ListPluginAttachmentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceId)) {
            query.put("attachResourceId", request.attachResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            query.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceTypes)) {
            query.put("attachResourceTypes", request.attachResourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("pluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withParentResource)) {
            query.put("withParentResource", request.withParentResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPluginAttachments"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-attachments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPluginAttachmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of plug-in attachments.</p>
     * 
     * @param request ListPluginAttachmentsRequest
     * @return ListPluginAttachmentsResponse
     */
    public ListPluginAttachmentsResponse listPluginAttachments(ListPluginAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginAttachmentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListPluginClasses</p>
     * 
     * @param request ListPluginClassesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPluginClassesResponse
     */
    public ListPluginClassesResponse listPluginClassesWithOptions(ListPluginClassesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasLike)) {
            query.put("aliasLike", request.aliasLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeBuiltinAiProxy)) {
            query.put("excludeBuiltinAiProxy", request.excludeBuiltinAiProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installed)) {
            query.put("installed", request.installed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPluginClasses"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-classes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPluginClassesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListPluginClasses</p>
     * 
     * @param request ListPluginClassesRequest
     * @return ListPluginClassesResponse
     */
    public ListPluginClassesResponse listPluginClasses(ListPluginClassesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginClassesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries plug-ins.</p>
     * 
     * @param request ListPluginsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPluginsWithOptions(ListPluginsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceId)) {
            query.put("attachResourceId", request.attachResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            query.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeBuiltinAiGateway)) {
            query.put("includeBuiltinAiGateway", request.includeBuiltinAiGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginClassId)) {
            query.put("pluginClassId", request.pluginClassId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginClassName)) {
            query.put("pluginClassName", request.pluginClassName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAttachmentInfo)) {
            query.put("withAttachmentInfo", request.withAttachmentInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPlugins"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugins"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPluginsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries plug-ins.</p>
     * 
     * @param request ListPluginsRequest
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceId)) {
            query.put("attachResourceId", request.attachResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            query.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withAttachments)) {
            query.put("withAttachments", request.withAttachments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withSystemPolicy)) {
            query.put("withSystemPolicy", request.withSystemPolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicies"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPoliciesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListPolicyClasses</p>
     * 
     * @param request ListPolicyClassesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyClassesResponse
     */
    public ListPolicyClassesResponse listPolicyClassesWithOptions(ListPolicyClassesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceId)) {
            query.put("attachResourceId", request.attachResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            query.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyClasses"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policy-classes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyClassesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListPolicyClasses</p>
     * 
     * @param request ListPolicyClassesRequest
     * @return ListPolicyClassesResponse
     */
    public ListPolicyClassesResponse listPolicyClasses(ListPolicyClassesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPolicyClassesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥的引用详情</p>
     * 
     * @param request ListSecretReferencesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecretReferencesResponse
     */
    public ListSecretReferencesResponse listSecretReferencesWithOptions(String secretId, ListSecretReferencesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecretReferences"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets/" + com.aliyun.openapiutil.Client.getEncodeParam(secretId) + "/references"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretReferencesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥的引用详情</p>
     * 
     * @param request ListSecretReferencesRequest
     * @return ListSecretReferencesResponse
     */
    public ListSecretReferencesResponse listSecretReferences(String secretId, ListSecretReferencesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecretReferencesWithOptions(secretId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥列表</p>
     * 
     * @param request ListSecretsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecretsWithOptions(ListSecretsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            query.put("gatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameLike)) {
            query.put("nameLike", request.nameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecrets"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询密钥列表</p>
     * 
     * @param request ListSecretsRequest
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecretsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServicesResponse
     */
    public ListServicesResponse listServicesWithOptions(ListServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypes)) {
            query.put("sourceTypes", request.sourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of services.</p>
     * 
     * @param request ListServicesRequest
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListSslCerts</p>
     * 
     * @param request ListSslCertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSslCertsResponse
     */
    public ListSslCertsResponse listSslCertsWithOptions(ListSslCertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNameLike)) {
            query.put("certNameLike", request.certNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSslCerts"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/ssl/certs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSslCertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListSslCerts</p>
     * 
     * @param request ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    public ListSslCertsResponse listSslCerts(ListSslCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSslCertsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the availability zones under a cloud-native API gateway region</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListZonesResponse
     */
    public ListZonesResponse listZonesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZones"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/zones"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the availability zones under a cloud-native API gateway region</p>
     * @return ListZonesResponse
     */
    public ListZonesResponse listZones() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listZonesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumer authentication rules.</p>
     * 
     * @param request QueryConsumerAuthorizationRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConsumerAuthorizationRulesResponse
     */
    public QueryConsumerAuthorizationRulesResponse queryConsumerAuthorizationRulesWithOptions(QueryConsumerAuthorizationRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameLike)) {
            query.put("apiNameLike", request.apiNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("consumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerNameLike)) {
            query.put("consumerNameLike", request.consumerNameLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            query.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByApi)) {
            query.put("groupByApi", request.groupByApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentResourceId)) {
            query.put("parentResourceId", request.parentResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("resourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConsumerAuthorizationRules"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/authorization-rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConsumerAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumer authentication rules.</p>
     * 
     * @param request QueryConsumerAuthorizationRulesRequest
     * @return QueryConsumerAuthorizationRulesResponse
     */
    public QueryConsumerAuthorizationRulesResponse queryConsumerAuthorizationRules(QueryConsumerAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumerAuthorizationRulesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer authorization rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveConsumerAuthorizationRuleResponse
     */
    public RemoveConsumerAuthorizationRuleResponse removeConsumerAuthorizationRuleWithOptions(String consumerAuthorizationRuleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/authorization-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerAuthorizationRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer authorization rule.</p>
     * @return RemoveConsumerAuthorizationRuleResponse
     */
    public RemoveConsumerAuthorizationRuleResponse removeConsumerAuthorizationRule(String consumerAuthorizationRuleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumerAuthorizationRuleWithOptions(consumerAuthorizationRuleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gateway Restart</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartGatewayResponse
     */
    public RestartGatewayResponse restartGatewayWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartGateway"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gateway Restart</p>
     * @return RestartGatewayResponse
     */
    public RestartGatewayResponse restartGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartGatewayWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes Nacos Model Context Protocol (MCP) server configurations to Cloud-native API Gateway.</p>
     * 
     * @param request SyncMCPServersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncMCPServersResponse
     */
    public SyncMCPServersResponse syncMCPServersWithOptions(SyncMCPServersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainIds)) {
            body.put("domainIds", request.domainIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacosMcpServers)) {
            body.put("nacosMcpServers", request.nacosMcpServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMCPServers"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/sync-mcp-server"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMCPServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes Nacos Model Context Protocol (MCP) server configurations to Cloud-native API Gateway.</p>
     * 
     * @param request SyncMCPServersRequest
     * @return SyncMCPServersResponse
     */
    public SyncMCPServersResponse syncMCPServers(SyncMCPServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncMCPServersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Undeploys an MCP server.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnDeployMcpServerResponse
     */
    public UnDeployMcpServerResponse unDeployMcpServerWithOptions(String mcpServerId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnDeployMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + "/undeploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnDeployMcpServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Undeploys an MCP server.</p>
     * @return UnDeployMcpServerResponse
     */
    public UnDeployMcpServerResponse unDeployMcpServer(String mcpServerId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unDeployMcpServerWithOptions(mcpServerId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unpublishes an HTTP API.</p>
     * 
     * @param request UndeployHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UndeployHttpApiResponse
     */
    public UndeployHttpApiResponse undeployHttpApiWithOptions(String httpApiId, UndeployHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            body.put("operationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            body.put("routeId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UndeployHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/undeploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UndeployHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unpublishes an HTTP API.</p>
     * 
     * @param request UndeployHttpApiRequest
     * @return UndeployHttpApiResponse
     */
    public UndeployHttpApiResponse undeployHttpApi(String httpApiId, UndeployHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.undeployHttpApiWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls a plug-in.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallPluginResponse
     */
    public UninstallPluginResponse uninstallPluginWithOptions(String pluginId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallPlugin"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugins/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallPluginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls a plug-in.</p>
     * @return UninstallPluginResponse
     */
    public UninstallPluginResponse uninstallPlugin(String pluginId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallPluginWithOptions(pluginId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates and associates a policy.</p>
     * 
     * @param request UpdateAndAttachPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAndAttachPolicyResponse
     */
    public UpdateAndAttachPolicyResponse updateAndAttachPolicyWithOptions(String policyId, UpdateAndAttachPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceIds)) {
            body.put("attachResourceIds", request.attachResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceType)) {
            body.put("attachResourceType", request.attachResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            body.put("gatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAndAttachPolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAndAttachPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates and associates a policy.</p>
     * 
     * @param request UpdateAndAttachPolicyRequest
     * @return UpdateAndAttachPolicyResponse
     */
    public UpdateAndAttachPolicyResponse updateAndAttachPolicy(String policyId, UpdateAndAttachPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAndAttachPolicyWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a consumer.</p>
     * 
     * @param request UpdateConsumerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConsumerResponse
     */
    public UpdateConsumerResponse updateConsumerWithOptions(String consumerId, UpdateConsumerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.akSkIdentityConfigs)) {
            body.put("akSkIdentityConfigs", request.akSkIdentityConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apikeyIdentityConfig)) {
            body.put("apikeyIdentityConfig", request.apikeyIdentityConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtIdentityConfig)) {
            body.put("jwtIdentityConfig", request.jwtIdentityConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a consumer.</p>
     * 
     * @param request UpdateConsumerRequest
     * @return UpdateConsumerResponse
     */
    public UpdateConsumerResponse updateConsumer(String consumerId, UpdateConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumerWithOptions(consumerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a consumer authorization rule.</p>
     * 
     * @param request UpdateConsumerAuthorizationRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConsumerAuthorizationRuleResponse
     */
    public UpdateConsumerAuthorizationRuleResponse updateConsumerAuthorizationRuleWithOptions(String consumerId, String consumerAuthorizationRuleId, UpdateConsumerAuthorizationRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceInfos)) {
            body.put("authorizationResourceInfos", request.authorizationResourceInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireMode)) {
            body.put("expireMode", request.expireMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimestamp)) {
            body.put("expireTimestamp", request.expireTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerAuthorizationRule"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/consumers/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerId) + "/authorization-rules/" + com.aliyun.openapiutil.Client.getEncodeParam(consumerAuthorizationRuleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a consumer authorization rule.</p>
     * 
     * @param request UpdateConsumerAuthorizationRuleRequest
     * @return UpdateConsumerAuthorizationRuleResponse
     */
    public UpdateConsumerAuthorizationRuleResponse updateConsumerAuthorizationRule(String consumerId, String consumerAuthorizationRuleId, UpdateConsumerAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumerAuthorizationRuleWithOptions(consumerId, consumerAuthorizationRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a domain name.</p>
     * 
     * @param request UpdateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomainWithOptions(String domainId, UpdateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertIdentifier)) {
            body.put("caCertIdentifier", request.caCertIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            body.put("certIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientCACert)) {
            body.put("clientCACert", request.clientCACert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceHttps)) {
            body.put("forceHttps", request.forceHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Option)) {
            body.put("http2Option", request.http2Option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mTLSEnabled)) {
            body.put("mTLSEnabled", request.mTLSEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsCipherSuitesConfig)) {
            body.put("tlsCipherSuitesConfig", request.tlsCipherSuitesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMax)) {
            body.put("tlsMax", request.tlsMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMin)) {
            body.put("tlsMin", request.tlsMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomain"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/domains/" + com.aliyun.openapiutil.Client.getEncodeParam(domainId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a domain name.</p>
     * 
     * @param request UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(String domainId, UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDomainWithOptions(domainId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateEnvironment</p>
     * 
     * @deprecated OpenAPI UpdateEnvironment is deprecated
     * 
     * @param request UpdateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public UpdateEnvironmentResponse updateEnvironmentWithOptions(String environmentId, UpdateEnvironmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnvironment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/environments/" + com.aliyun.openapiutil.Client.getEncodeParam(environmentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnvironmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateEnvironment</p>
     * 
     * @deprecated OpenAPI UpdateEnvironment is deprecated
     * 
     * @param request UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    @Deprecated
    // Deprecated
    public UpdateEnvironmentResponse updateEnvironment(String environmentId, UpdateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(environmentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the feature configuration of the gateway</p>
     * 
     * @param request UpdateGatewayFeatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayFeatureResponse
     */
    public UpdateGatewayFeatureResponse updateGatewayFeatureWithOptions(String gatewayId, String name, UpdateGatewayFeatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayFeature"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-features/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the feature configuration of the gateway</p>
     * 
     * @param request UpdateGatewayFeatureRequest
     * @return UpdateGatewayFeatureResponse
     */
    public UpdateGatewayFeatureResponse updateGatewayFeature(String gatewayId, String name, UpdateGatewayFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayFeatureWithOptions(gatewayId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Change the name of a gateway instance</p>
     * 
     * @param request UpdateGatewayNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayNameResponse
     */
    public UpdateGatewayNameResponse updateGatewayNameWithOptions(String gatewayId, UpdateGatewayNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayName"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/name"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Change the name of a gateway instance</p>
     * 
     * @param request UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    public UpdateGatewayNameResponse updateGatewayName(String gatewayId, UpdateGatewayNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayNameWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an HTTP API.</p>
     * 
     * @param request UpdateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpApiResponse
     */
    public UpdateHttpApiResponse updateHttpApiWithOptions(String httpApiId, UpdateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentProtocols)) {
            body.put("agentProtocols", request.agentProtocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aiProtocols)) {
            body.put("aiProtocols", request.aiProtocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            body.put("authConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            body.put("basePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployConfigs)) {
            body.put("deployConfigs", request.deployConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuth)) {
            body.put("enableAuth", request.enableAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstByteTimeout)) {
            body.put("firstByteTimeout", request.firstByteTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConfig)) {
            body.put("ingressConfig", request.ingressConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyChangeConfig)) {
            body.put("onlyChangeConfig", request.onlyChangeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("protocols", request.protocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeBasePathOnForward)) {
            body.put("removeBasePathOnForward", request.removeBasePathOnForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionConfig)) {
            body.put("versionConfig", request.versionConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an HTTP API.</p>
     * 
     * @param request UpdateHttpApiRequest
     * @return UpdateHttpApiResponse
     */
    public UpdateHttpApiResponse updateHttpApi(String httpApiId, UpdateHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHttpApiWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Operation</p>
     * 
     * @param request UpdateHttpApiOperationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpApiOperationResponse
     */
    public UpdateHttpApiOperationResponse updateHttpApiOperationWithOptions(String httpApiId, String operationId, UpdateHttpApiOperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("operation", request.operation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpApiOperation"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/operations/" + com.aliyun.openapiutil.Client.getEncodeParam(operationId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpApiOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Operation</p>
     * 
     * @param request UpdateHttpApiOperationRequest
     * @return UpdateHttpApiOperationResponse
     */
    public UpdateHttpApiOperationResponse updateHttpApiOperation(String httpApiId, String operationId, UpdateHttpApiOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHttpApiOperationWithOptions(httpApiId, operationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the route of an HTTP API.</p>
     * 
     * @param request UpdateHttpApiRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpApiRouteResponse
     */
    public UpdateHttpApiRouteResponse updateHttpApiRouteWithOptions(String httpApiId, String routeId, UpdateHttpApiRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployConfigs)) {
            body.put("deployConfigs", request.deployConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIds)) {
            body.put("domainIds", request.domainIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpRouteConfig)) {
            body.put("mcpRouteConfig", request.mcpRouteConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyConfigs)) {
            body.put("policyConfigs", request.policyConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpApiRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/routes/" + com.aliyun.openapiutil.Client.getEncodeParam(routeId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpApiRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the route of an HTTP API.</p>
     * 
     * @param request UpdateHttpApiRouteRequest
     * @return UpdateHttpApiRouteResponse
     */
    public UpdateHttpApiRouteResponse updateHttpApiRoute(String httpApiId, String routeId, UpdateHttpApiRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHttpApiRouteWithOptions(httpApiId, routeId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can only update the listening Ingress configuration for sources of the <strong>ACK</strong> type.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an MCP server.</p>
     * 
     * @param request UpdateMcpServerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcpServerResponse
     */
    public UpdateMcpServerResponse updateMcpServerWithOptions(String mcpServerId, UpdateMcpServerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assembledSources)) {
            body.put("assembledSources", request.assembledSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromType)) {
            body.put("createFromType", request.createFromType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIds)) {
            body.put("domainIds", request.domainIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exposedUriPath)) {
            body.put("exposedUriPath", request.exposedUriPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayMcpServerConfigs)) {
            body.put("grayMcpServerConfigs", request.grayMcpServerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpStatisticsEnable)) {
            body.put("mcpStatisticsEnable", request.mcpStatisticsEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcpServer"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/mcp-servers/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServerId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcpServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can only update the listening Ingress configuration for sources of the <strong>ACK</strong> type.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an MCP server.</p>
     * 
     * @param request UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    public UpdateMcpServerResponse updateMcpServer(String mcpServerId, UpdateMcpServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMcpServerWithOptions(mcpServerId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a plug-in attachment.</p>
     * 
     * @param request UpdatePluginAttachmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePluginAttachmentResponse
     */
    public UpdatePluginAttachmentResponse updatePluginAttachmentWithOptions(String pluginAttachmentId, UpdatePluginAttachmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachResourceIds)) {
            body.put("attachResourceIds", request.attachResourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginConfig)) {
            body.put("pluginConfig", request.pluginConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePluginAttachment"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/plugin-attachments/" + com.aliyun.openapiutil.Client.getEncodeParam(pluginAttachmentId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePluginAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a plug-in attachment.</p>
     * 
     * @param request UpdatePluginAttachmentRequest
     * @return UpdatePluginAttachmentResponse
     */
    public UpdatePluginAttachmentResponse updatePluginAttachment(String pluginAttachmentId, UpdatePluginAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePluginAttachmentWithOptions(pluginAttachmentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Policy</p>
     * 
     * @param request UpdatePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicyWithOptions(String policyId, UpdatePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicy"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Policy</p>
     * 
     * @param request UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(String policyId, UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePolicyWithOptions(policyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新消费者</p>
     * 
     * @param request UpdateSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecretWithOptions(String secretId, UpdateSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secretData)) {
            body.put("secretData", request.secretData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecret"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/secrets/" + com.aliyun.openapiutil.Client.getEncodeParam(secretId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新消费者</p>
     * 
     * @param request UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(String secretId, UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSecretWithOptions(secretId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateServiceWithOptions(String serviceId, UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            body.put("addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentServiceConfig)) {
            body.put("agentServiceConfig", request.agentServiceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aiServiceConfig)) {
            body.put("aiServiceConfig", request.aiServiceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsServers)) {
            body.put("dnsServers", request.dnsServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConfig)) {
            body.put("healthCheckConfig", request.healthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyPanicThreshold)) {
            body.put("healthyPanicThreshold", request.healthyPanicThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outlierDetectionConfig)) {
            body.put("outlierDetectionConfig", request.outlierDetectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ports)) {
            body.put("ports", request.ports);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(String serviceId, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a service version.</p>
     * 
     * @param request UpdateServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceVersionResponse
     */
    public UpdateServiceVersionResponse updateServiceVersionWithOptions(String serviceId, String name, UpdateServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/services/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceId) + "/versions/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a service version.</p>
     * 
     * @param request UpdateServiceVersionRequest
     * @return UpdateServiceVersionResponse
     */
    public UpdateServiceVersionResponse updateServiceVersion(String serviceId, String name, UpdateServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceVersionWithOptions(serviceId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrade the gateway version</p>
     * 
     * @param request UpgradeGatewayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeGatewayResponse
     */
    public UpgradeGatewayResponse upgradeGatewayWithOptions(String gatewayId, UpgradeGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeGateway"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrade the gateway version</p>
     * 
     * @param request UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     */
    public UpgradeGatewayResponse upgradeGateway(String gatewayId, UpgradeGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeGatewayWithOptions(gatewayId, request, headers, runtime);
    }
}
