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
     * <b>description</b> :
     * <p>Create Domain.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Domain</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.forceHttps)) {
            body.put("forceHttps", request.forceHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Option)) {
            body.put("http2Option", request.http2Option);
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
     * <p>Create Domain</p>
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
     * @param request CreateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnvironmentResponse
     */
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
     * @param request CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEnvironmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an API of HTTP type</p>
     * 
     * @param request CreateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpApiResponse
     */
    public CreateHttpApiResponse createHttpApiWithOptions(CreateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiProtocols)) {
            body.put("aiProtocols", request.aiProtocols);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConfig)) {
            body.put("ingressConfig", request.ingressConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("protocols", request.protocols);
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
     * <p>Create an API of HTTP type</p>
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
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnvironmentResponse
     */
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
     * @return DeleteEnvironmentResponse
     */
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
     * <p>Delete HTTP API</p>
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
     * <p>Delete HTTP API</p>
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
     * <p>Query domain details</p>
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
     * <p>Query domain details</p>
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
     * @param request GetEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnvironmentResponse
     */
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
     * @param request GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    public GetEnvironmentResponse getEnvironment(String environmentId, GetEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(environmentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a gateway.</p>
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
     * <p>Get a gateway.</p>
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
     * <p>获取HttpApi的路由详情</p>
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
     * <p>获取HttpApi的路由详情</p>
     * @return GetHttpApiRouteResponse
     */
    public GetHttpApiRouteResponse getHttpApiRoute(String httpApiId, String routeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiRouteWithOptions(httpApiId, routeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDomains</p>
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
     * <p>ListDomains</p>
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
     * @param request ListEnvironmentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvironmentsResponse
     */
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
     * @param request ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of created cloud-native gateways</p>
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("gatewayId", request.gatewayId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
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
     * <p>Retrieve the list of created cloud-native gateways</p>
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
     * <p>List HTTP APIs</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.withAuthPolicyInEnvironmentId)) {
            query.put("withAuthPolicyInEnvironmentId", request.withAuthPolicyInEnvironmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withConsumerInfoById)) {
            query.put("withConsumerInfoById", request.withConsumerInfoById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEnvironmentInfo)) {
            query.put("withEnvironmentInfo", request.withEnvironmentInfo);
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
     * <p>List HTTP APIs</p>
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
     * <b>summary</b> : 
     * <p>UpdateDomain</p>
     * 
     * @param request UpdateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomainWithOptions(String domainId, UpdateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertIndentifier)) {
            body.put("caCertIndentifier", request.caCertIndentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIndentifier)) {
            body.put("certIndentifier", request.certIndentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceHttps)) {
            body.put("forceHttps", request.forceHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Option)) {
            body.put("http2Option", request.http2Option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("protocol", request.protocol);
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
     * <p>UpdateDomain</p>
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
     * @param request UpdateEnvironmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnvironmentResponse
     */
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
     * @param request UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironment(String environmentId, UpdateEnvironmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnvironmentWithOptions(environmentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update HTTP API</p>
     * 
     * @param request UpdateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpApiResponse
     */
    public UpdateHttpApiResponse updateHttpApiWithOptions(String httpApiId, UpdateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiProtocols)) {
            body.put("aiProtocols", request.aiProtocols);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConfig)) {
            body.put("ingressConfig", request.ingressConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("protocols", request.protocols);
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
     * <p>Update HTTP API</p>
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
}
