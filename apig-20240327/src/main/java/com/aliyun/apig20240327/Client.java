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
     * <p>授权网关访问服务的安全组</p>
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
     * <p>授权网关访问服务的安全组</p>
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
     * <p>创建域名</p>
     * 
     * @param request CreateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
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
     * <b>summary</b> : 
     * <p>创建域名</p>
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
     * <p>创建网关路由</p>
     * 
     * @param request CreateGatewayRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayRouteResponse
     */
    public CreateGatewayRouteResponse createGatewayRouteWithOptions(String gatewayId, CreateGatewayRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainConfig)) {
            body.put("domainConfig", request.domainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * 
     * @param request CreateGatewayRouteRequest
     * @return CreateGatewayRouteResponse
     */
    public CreateGatewayRouteResponse createGatewayRoute(String gatewayId, CreateGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayRouteWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreateGatewayServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayServiceResponse
     */
    public CreateGatewayServiceResponse createGatewayServiceWithOptions(String gatewayId, CreateGatewayServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayServiceConfigs)) {
            body.put("gatewayServiceConfigs", request.gatewayServiceConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("sourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务</p>
     * 
     * @param request CreateGatewayServiceRequest
     * @return CreateGatewayServiceResponse
     */
    public CreateGatewayServiceResponse createGatewayService(String gatewayId, CreateGatewayServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayServiceWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务版本</p>
     * 
     * @param request CreateGatewayServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayServiceVersionResponse
     */
    public CreateGatewayServiceVersionResponse createGatewayServiceVersionWithOptions(String gatewayId, String gatewayServiceId, CreateGatewayServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateGatewayServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + "/service-versions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务版本</p>
     * 
     * @param request CreateGatewayServiceVersionRequest
     * @return CreateGatewayServiceVersionResponse
     */
    public CreateGatewayServiceVersionResponse createGatewayServiceVersion(String gatewayId, String gatewayServiceId, CreateGatewayServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayServiceVersionWithOptions(gatewayId, gatewayServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个HTTP类型的API</p>
     * 
     * @param request CreateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpApiResponse
     */
    public CreateHttpApiResponse createHttpApiWithOptions(CreateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            body.put("basePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
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
     * <p>创建一个HTTP类型的API</p>
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
     * <p>为HTTP API创建Operation</p>
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
     * <p>为HTTP API创建Operation</p>
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
     * <p>创建服务来源</p>
     * 
     * @param request CreateServiceSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceSourceResponse
     */
    public CreateServiceSourceResponse createServiceSourceWithOptions(String gatewayId, CreateServiceSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sServiceSourceConfig)) {
            body.put("k8sServiceSourceConfig", request.k8sServiceSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacosServiceSourceConfig)) {
            body.put("nacosServiceSourceConfig", request.nacosServiceSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/service-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务来源</p>
     * 
     * @param request CreateServiceSourceRequest
     * @return CreateServiceSourceResponse
     */
    public CreateServiceSourceResponse createServiceSource(String gatewayId, CreateServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceSourceWithOptions(gatewayId, request, headers, runtime);
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
     * <p>删除网关</p>
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
     * <p>删除网关</p>
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRouteWithOptions(String gatewayId, String gatewayRouteId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayRouteId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRoute(String gatewayId, String gatewayRouteId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayRouteWithOptions(gatewayId, gatewayRouteId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayServiceResponse
     */
    public DeleteGatewayServiceResponse deleteGatewayServiceWithOptions(String gatewayId, String gatewayServiceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务</p>
     * @return DeleteGatewayServiceResponse
     */
    public DeleteGatewayServiceResponse deleteGatewayService(String gatewayId, String gatewayServiceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayServiceWithOptions(gatewayId, gatewayServiceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayServiceVersionResponse
     */
    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersionWithOptions(String gatewayId, String gatewayServiceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + "/service-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务版本</p>
     * @return DeleteGatewayServiceVersionResponse
     */
    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersion(String gatewayId, String gatewayServiceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayServiceVersionWithOptions(gatewayId, gatewayServiceId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除HTTP API</p>
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
     * <p>删除HTTP API</p>
     * @return DeleteHttpApiResponse
     */
    public DeleteHttpApiResponse deleteHttpApi(String httpApiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHttpApiWithOptions(httpApiId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Operation</p>
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
     * <p>删除Operation</p>
     * @return DeleteHttpApiOperationResponse
     */
    public DeleteHttpApiOperationResponse deleteHttpApiOperation(String httpApiId, String operationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHttpApiOperationWithOptions(httpApiId, operationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务来源</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceSourceResponse
     */
    public DeleteServiceSourceResponse deleteServiceSourceWithOptions(String gatewayId, String serviceSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/service-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceSourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务来源</p>
     * @return DeleteServiceSourceResponse
     */
    public DeleteServiceSourceResponse deleteServiceSource(String gatewayId, String serviceSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceSourceWithOptions(gatewayId, serviceSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(String domainId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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
     * <p>查询域名详情</p>
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(String domainId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(domainId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetEnvironment</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnvironmentResponse
     */
    public GetEnvironmentResponse getEnvironmentWithOptions(String environmentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
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
     * @return GetEnvironmentResponse
     */
    public GetEnvironmentResponse getEnvironment(String environmentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(environmentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网关实例详情</p>
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
     * <p>获取网关实例详情</p>
     * @return GetGatewayResponse
     */
    public GetGatewayResponse getGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGatewayWithOptions(gatewayId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayRouteResponse
     */
    public GetGatewayRouteResponse getGatewayRouteWithOptions(String gatewayId, String gatewayRouteId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayRouteId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * @return GetGatewayRouteResponse
     */
    public GetGatewayRouteResponse getGatewayRoute(String gatewayId, String gatewayRouteId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGatewayRouteWithOptions(gatewayId, gatewayRouteId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayServiceResponse
     */
    public GetGatewayServiceResponse getGatewayServiceWithOptions(String gatewayId, String gatewayServiceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务</p>
     * @return GetGatewayServiceResponse
     */
    public GetGatewayServiceResponse getGatewayService(String gatewayId, String gatewayServiceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGatewayServiceWithOptions(gatewayId, gatewayServiceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>读取HttpApi</p>
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
     * <p>读取HttpApi</p>
     * @return GetHttpApiResponse
     */
    public GetHttpApiResponse getHttpApi(String httpApiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiWithOptions(httpApiId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>读取Operation</p>
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
     * <p>读取Operation</p>
     * @return GetHttpApiOperationResponse
     */
    public GetHttpApiOperationResponse getHttpApiOperation(String httpApiId, String operationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHttpApiOperationWithOptions(httpApiId, operationId, headers, runtime);
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
     * <p>创建网关路由</p>
     * 
     * @param request ListGatewayRoutesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayRoutesResponse
     */
    public ListGatewayRoutesResponse listGatewayRoutesWithOptions(String gatewayId, ListGatewayRoutesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayRoutes"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * 
     * @param request ListGatewayRoutesRequest
     * @return ListGatewayRoutesResponse
     */
    public ListGatewayRoutesResponse listGatewayRoutes(String gatewayId, ListGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayRoutesWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务列表</p>
     * 
     * @param request ListGatewayServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayServicesResponse
     */
    public ListGatewayServicesResponse listGatewayServicesWithOptions(String gatewayId, ListGatewayServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayServices"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务列表</p>
     * 
     * @param request ListGatewayServicesRequest
     * @return ListGatewayServicesResponse
     */
    public ListGatewayServicesResponse listGatewayServices(String gatewayId, ListGatewayServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGatewayServicesWithOptions(gatewayId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已经创建的云原生网关列表</p>
     * 
     * @param request ListGatewaysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewaysResponse
     */
    public ListGatewaysResponse listGatewaysWithOptions(ListGatewaysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <p>获取已经创建的云原生网关列表</p>
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
     * <p>列举Operation</p>
     * 
     * @param request ListHttpApiOperationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpApiOperationsResponse
     */
    public ListHttpApiOperationsResponse listHttpApiOperationsWithOptions(String httpApiId, ListHttpApiOperationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
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
     * <p>列举Operation</p>
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
     * <p>列举HTTP API</p>
     * 
     * @param request ListHttpApisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpApisResponse
     */
    public ListHttpApisResponse listHttpApisWithOptions(ListHttpApisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishedOnly)) {
            query.put("publishedOnly", request.publishedOnly);
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
     * <p>列举HTTP API</p>
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
     * <p>发布路由</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineGatewayRouteResponse
     */
    public OfflineGatewayRouteResponse offlineGatewayRouteWithOptions(String gatewayId, String gatewayRouteId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayRouteId) + "/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布路由</p>
     * @return OfflineGatewayRouteResponse
     */
    public OfflineGatewayRouteResponse offlineGatewayRoute(String gatewayId, String gatewayRouteId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineGatewayRouteWithOptions(gatewayId, gatewayRouteId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下线已发布的HTTP API</p>
     * 
     * @param request OfflineHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineHttpApiResponse
     */
    public OfflineHttpApiResponse offlineHttpApiWithOptions(String httpApiId, OfflineHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environmentId)) {
            body.put("environmentId", request.environmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下线已发布的HTTP API</p>
     * 
     * @param request OfflineHttpApiRequest
     * @return OfflineHttpApiResponse
     */
    public OfflineHttpApiResponse offlineHttpApi(String httpApiId, OfflineHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineHttpApiWithOptions(httpApiId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布路由</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishGatewayRouteResponse
     */
    public PublishGatewayRouteResponse publishGatewayRouteWithOptions(String gatewayId, String gatewayRouteId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayRouteId) + "/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布路由</p>
     * @return PublishGatewayRouteResponse
     */
    public PublishGatewayRouteResponse publishGatewayRoute(String gatewayId, String gatewayRouteId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishGatewayRouteWithOptions(gatewayId, gatewayRouteId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布HTTP API</p>
     * 
     * @param request PublishHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishHttpApiResponse
     */
    public PublishHttpApiResponse publishHttpApiWithOptions(String httpApiId, PublishHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowOverwrite)) {
            body.put("allowOverwrite", request.allowOverwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionId)) {
            body.put("revisionId", request.revisionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishHttpApi"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/http-apis/" + com.aliyun.openapiutil.Client.getEncodeParam(httpApiId) + "/publish"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishHttpApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布HTTP API</p>
     * 
     * @param request PublishHttpApiRequest
     * @return PublishHttpApiResponse
     */
    public PublishHttpApiResponse publishHttpApi(String httpApiId, PublishHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishHttpApiWithOptions(httpApiId, request, headers, runtime);
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
     * <p>创建网关路由</p>
     * 
     * @param request UpdateGatewayRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteResponse
     */
    public UpdateGatewayRouteResponse updateGatewayRouteWithOptions(String gatewayId, String gatewayRouteId, UpdateGatewayRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendConfig)) {
            body.put("backendConfig", request.backendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainConfig)) {
            body.put("domainConfig", request.domainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            body.put("match", request.match);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRoute"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/http-routes/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayRouteId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网关路由</p>
     * 
     * @param request UpdateGatewayRouteRequest
     * @return UpdateGatewayRouteResponse
     */
    public UpdateGatewayRouteResponse updateGatewayRoute(String gatewayId, String gatewayRouteId, UpdateGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayRouteWithOptions(gatewayId, gatewayRouteId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateGatewayServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayServiceResponse
     */
    public UpdateGatewayServiceResponse updateGatewayServiceWithOptions(String gatewayId, String gatewayServiceId, UpdateGatewayServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addresses)) {
            body.put("addresses", request.addresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayService"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateGatewayServiceRequest
     * @return UpdateGatewayServiceResponse
     */
    public UpdateGatewayServiceResponse updateGatewayService(String gatewayId, String gatewayServiceId, UpdateGatewayServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayServiceWithOptions(gatewayId, gatewayServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务版本</p>
     * 
     * @param request UpdateGatewayServiceVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayServiceVersionResponse
     */
    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersionWithOptions(String gatewayId, String gatewayServiceId, String name, UpdateGatewayServiceVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateGatewayServiceVersion"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/gateway-services/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayServiceId) + "/service-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayServiceVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务版本</p>
     * 
     * @param request UpdateGatewayServiceVersionRequest
     * @return UpdateGatewayServiceVersionResponse
     */
    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersion(String gatewayId, String gatewayServiceId, String name, UpdateGatewayServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayServiceVersionWithOptions(gatewayId, gatewayServiceId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新HTTP API</p>
     * 
     * @param request UpdateHttpApiRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpApiResponse
     */
    public UpdateHttpApiResponse updateHttpApiWithOptions(String httpApiId, UpdateHttpApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basePath)) {
            body.put("basePath", request.basePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
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
     * <p>更新HTTP API</p>
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
     * <p>更新Operation</p>
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
     * <p>更新Operation</p>
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
     * <p>更新服务来源</p>
     * 
     * @param request UpdateServiceSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceSourceResponse
     */
    public UpdateServiceSourceResponse updateServiceSourceWithOptions(String gatewayId, String serviceSourceId, UpdateServiceSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.k8sServiceSourceConfig)) {
            body.put("k8sServiceSourceConfig", request.k8sServiceSourceConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceSource"),
            new TeaPair("version", "2024-03-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/gateways/" + com.aliyun.openapiutil.Client.getEncodeParam(gatewayId) + "/service-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(serviceSourceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务来源</p>
     * 
     * @param request UpdateServiceSourceRequest
     * @return UpdateServiceSourceResponse
     */
    public UpdateServiceSourceResponse updateServiceSource(String gatewayId, String serviceSourceId, UpdateServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceSourceWithOptions(gatewayId, serviceSourceId, request, headers, runtime);
    }
}
