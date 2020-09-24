// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810;

import com.aliyun.tea.*;
import com.aliyun.microgw20200810.models.*;

public class Client extends com.aliyun.teaopenapi.Client {
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("microgw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * attachPolicy
     */
    public AttachPolicyResponse attachPolicy(String apiId, AttachPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachPolicyWithOptions(apiId, request, headers, runtime);
    }

    public AttachPolicyResponse attachPolicyWithOptions(String apiId, AttachPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("AttachPolicy", "2020-08-10", "HTTPS", "POST", "AK", "/v1/api/" + apiId + "/attach", "json", req, runtime), new AttachPolicyResponse());
    }

    /**
     * checkServiceHealth
     */
    public CheckServiceHealthResponse checkServiceHealth(CheckServiceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkServiceHealthWithOptions(request, headers, runtime);
    }

    public CheckServiceHealthResponse checkServiceHealthWithOptions(CheckServiceHealthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CheckServiceHealth", "2020-08-10", "HTTPS", "POST", "AK", "/v1/service/check", "json", req, runtime), new CheckServiceHealthResponse());
    }

    /**
     * createApi
     */
    public CreateApiResponse createApi(String gatewayId, CreateApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiWithOptions(gatewayId, request, headers, runtime);
    }

    public CreateApiResponse createApiWithOptions(String gatewayId, CreateApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreateApi", "2020-08-10", "HTTPS", "POST", "AK", "/v1/gateway/" + gatewayId + "/api", "json", req, runtime), new CreateApiResponse());
    }

    /**
     * createAuthTicket
     */
    public CreateAuthTicketResponse createAuthTicket(CreateAuthTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAuthTicketWithOptions(request, headers, runtime);
    }

    public CreateAuthTicketResponse createAuthTicketWithOptions(CreateAuthTicketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreateAuthTicket", "2020-08-10", "HTTPS", "POST", "AK", "/v1/auth", "json", req, runtime), new CreateAuthTicketResponse());
    }

    /**
     * createGateway
     */
    public CreateGatewayResponse createGateway(CreateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayWithOptions(request, headers, runtime);
    }

    public CreateGatewayResponse createGatewayWithOptions(CreateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreateGateway", "2020-08-10", "HTTPS", "POST", "AK", "/v1/gateway", "json", req, runtime), new CreateGatewayResponse());
    }

    /**
     * CreateGatewayLogEtl
     */
    public CreateGatewayLogEtlResponse createGatewayLogEtl(String gatewayId, String regionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGatewayLogEtlWithOptions(gatewayId, regionId, headers, runtime);
    }

    public CreateGatewayLogEtlResponse createGatewayLogEtlWithOptions(String gatewayId, String regionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateGatewayLogEtl", "2020-08-10", "HTTPS", "POST", "AK", "/v1/sls/gateway/" + gatewayId + "/region/{regionId}", "json", req, runtime), new CreateGatewayLogEtlResponse());
    }

    /**
     * createPolicy
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPolicyWithOptions(request, headers, runtime);
    }

    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePolicy", "2020-08-10", "HTTPS", "POST", "AK", "/v1/policy", "json", req, runtime), new CreatePolicyResponse());
    }

    /**
     * createPolicyToApi
     */
    public CreatePolicyToApiResponse createPolicyToApi(String apiId, CreatePolicyToApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPolicyToApiWithOptions(apiId, request, headers, runtime);
    }

    public CreatePolicyToApiResponse createPolicyToApiWithOptions(String apiId, CreatePolicyToApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePolicyToApi", "2020-08-10", "HTTPS", "POST", "AK", "/v1/api/" + apiId + "/policy", "json", req, runtime), new CreatePolicyToApiResponse());
    }

    /**
     * CreateRegistry
     */
    public CreateRegistryResponse createRegistry(String gatewayId, CreateRegistryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRegistryWithOptions(gatewayId, request, headers, runtime);
    }

    public CreateRegistryResponse createRegistryWithOptions(String gatewayId, CreateRegistryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRegistry", "2020-08-10", "HTTPS", "POST", "AK", "/v1/registry", "json", req, runtime), new CreateRegistryResponse());
    }

    /**
     * /gateway/{gatewayId}/service
     */
    public CreateServiceResponse createService(String gatewayId, CreateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceWithOptions(gatewayId, request, headers, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(String gatewayId, CreateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("CreateService", "2020-08-10", "HTTPS", "POST", "AK", "/v1/gateway/" + gatewayId + "/service", "json", req, runtime), new CreateServiceResponse());
    }

    /**
     * createSpecialRouteForRegistry
     */
    public CreateSpecialRouteForRegistryResponse createSpecialRouteForRegistry(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpecialRouteForRegistryWithOptions(gatewayId, headers, runtime);
    }

    public CreateSpecialRouteForRegistryResponse createSpecialRouteForRegistryWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateSpecialRouteForRegistry", "2020-08-10", "HTTPS", "POST", "AK", "/v1/gateway/" + gatewayId + "/registry/special/route", "json", req, runtime), new CreateSpecialRouteForRegistryResponse());
    }

    /**
     * deleteApi
     */
    public DeleteApiResponse deleteApi(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiWithOptions(apiId, headers, runtime);
    }

    public DeleteApiResponse deleteApiWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteApi", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/api/" + apiId + "", "json", req, runtime), new DeleteApiResponse());
    }

    /**
     * deleteAuthTicket
     */
    public DeleteAuthTicketResponse deleteAuthTicket(String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAuthTicketWithOptions(ticketId, headers, runtime);
    }

    public DeleteAuthTicketResponse deleteAuthTicketWithOptions(String ticketId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteAuthTicket", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/auth/" + ticketId + "", "json", req, runtime), new DeleteAuthTicketResponse());
    }

    /**
     * deleteGateway
     */
    public DeleteGatewayResponse deleteGateway(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGatewayWithOptions(gatewayId, headers, runtime);
    }

    public DeleteGatewayResponse deleteGatewayWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteGateway", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/gateway/" + gatewayId + "", "json", req, runtime), new DeleteGatewayResponse());
    }

    /**
     * DeletePolicyById
     */
    public DeletePolicyByIdResponse deletePolicyById(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyByIdWithOptions(policyId, headers, runtime);
    }

    public DeletePolicyByIdResponse deletePolicyByIdWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeletePolicyById", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/policy/" + policyId + "", "json", req, runtime), new DeletePolicyByIdResponse());
    }

    /**
     * deleteRegistry
     */
    public DeleteRegistryResponse deleteRegistry(String registryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRegistryWithOptions(registryId, headers, runtime);
    }

    public DeleteRegistryResponse deleteRegistryWithOptions(String registryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRegistry", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/registry/" + registryId + "", "json", req, runtime), new DeleteRegistryResponse());
    }

    /**
     * deleteService
     */
    public DeleteServiceResponse deleteService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceWithOptions(serviceId, headers, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteService", "2020-08-10", "HTTPS", "DELETE", "AK", "/v1/service/" + serviceId + "", "json", req, runtime), new DeleteServiceResponse());
    }

    /**
     * detachPolicy
     */
    public DetachPolicyResponse detachPolicy(String apiId, String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detachPolicyWithOptions(apiId, policyId, headers, runtime);
    }

    public DetachPolicyResponse detachPolicyWithOptions(String apiId, String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DetachPolicy", "2020-08-10", "HTTPS", "GET", "AK", "/v1/api/" + apiId + "/detach/{policyId}", "json", req, runtime), new DetachPolicyResponse());
    }

    /**
     * findAllService
     */
    public FindAllServiceResponse findAllService(String gatewayId, FindAllServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findAllServiceWithOptions(gatewayId, request, headers, runtime);
    }

    public FindAllServiceResponse findAllServiceWithOptions(String gatewayId, FindAllServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("aliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHealth)) {
            query.put("isHealth", request.isHealth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FindAllService", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "/service", "json", req, runtime), new FindAllServiceResponse());
    }

    /**
     * findApisByPaging
     */
    public FindApisByPagingResponse findApisByPaging(String gatewayId, FindApisByPagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findApisByPagingWithOptions(gatewayId, request, headers, runtime);
    }

    public FindApisByPagingResponse findApisByPagingWithOptions(String gatewayId, FindApisByPagingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("aliasName", request.aliasName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FindApisByPaging", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "/api", "json", req, runtime), new FindApisByPagingResponse());
    }

    /**
     * findAuthTickets
     */
    public FindAuthTicketsResponse findAuthTickets(FindAuthTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findAuthTicketsWithOptions(request, headers, runtime);
    }

    public FindAuthTicketsResponse findAuthTicketsWithOptions(FindAuthTicketsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FindAuthTickets", "2020-08-10", "HTTPS", "GET", "AK", "/v1/auth", "json", req, runtime), new FindAuthTicketsResponse());
    }

    /**
     * findGateways
     */
    public FindGatewaysResponse findGateways(FindGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findGatewaysWithOptions(request, headers, runtime);
    }

    public FindGatewaysResponse findGatewaysWithOptions(FindGatewaysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("gatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayTypes)) {
            query.put("gatewayTypes", request.gatewayTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
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
        return TeaModel.toModel(this.doROARequest("FindGateways", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway", "json", req, runtime), new FindGatewaysResponse());
    }

    /**
     * FindPolicies
     */
    public FindPoliciesResponse findPolicies(String gatewayId, FindPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findPoliciesWithOptions(gatewayId, request, headers, runtime);
    }

    public FindPoliciesResponse findPoliciesWithOptions(String gatewayId, FindPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            query.put("aliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("FindPolicies", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "/policy", "json", req, runtime), new FindPoliciesResponse());
    }

    /**
     * findRegistry
     */
    public FindRegistryResponse findRegistry(String registryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findRegistryWithOptions(registryId, headers, runtime);
    }

    public FindRegistryResponse findRegistryWithOptions(String registryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("FindRegistry", "2020-08-10", "HTTPS", "GET", "AK", "/v1/registry/" + registryId + "", "json", req, runtime), new FindRegistryResponse());
    }

    /**
     * findService
     */
    public FindServiceResponse findService(String serviceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findServiceWithOptions(serviceId, headers, runtime);
    }

    public FindServiceResponse findServiceWithOptions(String serviceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("FindService", "2020-08-10", "HTTPS", "GET", "AK", "/v1/service/" + serviceId + "", "json", req, runtime), new FindServiceResponse());
    }

    /**
     * findTemplate
     */
    public FindTemplateResponse findTemplate(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.findTemplateWithOptions(apiId, headers, runtime);
    }

    public FindTemplateResponse findTemplateWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("FindTemplate", "2020-08-10", "HTTPS", "GET", "AK", "/v1/api/" + apiId + "/policy/template", "json", req, runtime), new FindTemplateResponse());
    }

    /**
     * getAllRegistry
     */
    public GetAllRegistryResponse getAllRegistry(String gatewayId, GetAllRegistryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAllRegistryWithOptions(gatewayId, request, headers, runtime);
    }

    public GetAllRegistryResponse getAllRegistryWithOptions(String gatewayId, GetAllRegistryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("groupBy", request.groupBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetAllRegistry", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "/registry", "json", req, runtime), new GetAllRegistryResponse());
    }

    /**
     * getApiDetail
     */
    public GetApiDetailResponse getApiDetail(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiDetailWithOptions(apiId, headers, runtime);
    }

    public GetApiDetailResponse getApiDetailWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetApiDetail", "2020-08-10", "HTTPS", "GET", "AK", "/v1/api/" + apiId + "", "json", req, runtime), new GetApiDetailResponse());
    }

    /**
     * getAuthTicketById
     */
    public GetAuthTicketByIdResponse getAuthTicketById(String ticketId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAuthTicketByIdHeaders headers = new GetAuthTicketByIdHeaders();
        return this.getAuthTicketByIdWithOptions(ticketId, headers, runtime);
    }

    public GetAuthTicketByIdResponse getAuthTicketByIdWithOptions(String ticketId, GetAuthTicketByIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        GetAuthTicketByIdShrinkHeaders headers = new GetAuthTicketByIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.cookie)) {
            headers.cookieShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.cookie, "cookie", "json");
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", com.aliyun.teautil.Common.stringifyMapValue(com.aliyun.teautil.Common.toMap(headers)))
        ));
        return TeaModel.toModel(this.doROARequest("GetAuthTicketById", "2020-08-10", "HTTPS", "GET", "AK", "/v1/auth/" + ticketId + "", "json", req, runtime), new GetAuthTicketByIdResponse());
    }

    /**
     * getGatewayById
     */
    public GetGatewayByIdResponse getGatewayById(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGatewayByIdWithOptions(gatewayId, headers, runtime);
    }

    public GetGatewayByIdResponse getGatewayByIdWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetGatewayById", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "", "json", req, runtime), new GetGatewayByIdResponse());
    }

    /**
     * GetPolicyById
     */
    public GetPolicyByIdResponse getPolicyById(String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPolicyByIdWithOptions(policyId, headers, runtime);
    }

    public GetPolicyByIdResponse getPolicyByIdWithOptions(String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPolicyById", "2020-08-10", "HTTPS", "GET", "AK", "/v1/policy/" + policyId + "", "json", req, runtime), new GetPolicyByIdResponse());
    }

    /**
     * getPolicyOwnedByApi
     */
    public GetPolicyOwnedByApiResponse getPolicyOwnedByApi(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPolicyOwnedByApiWithOptions(apiId, headers, runtime);
    }

    public GetPolicyOwnedByApiResponse getPolicyOwnedByApiWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPolicyOwnedByApi", "2020-08-10", "HTTPS", "GET", "AK", "/v1/api/" + apiId + "/policy", "json", req, runtime), new GetPolicyOwnedByApiResponse());
    }

    /**
     * getServiceInstanceForRegistryByServiceName
     */
    public GetServiceInstanceForRegistryByServiceNameResponse getServiceInstanceForRegistryByServiceName(String gatewayId, String registryId, GetServiceInstanceForRegistryByServiceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceInstanceForRegistryByServiceNameWithOptions(gatewayId, registryId, request, headers, runtime);
    }

    public GetServiceInstanceForRegistryByServiceNameResponse getServiceInstanceForRegistryByServiceNameWithOptions(String gatewayId, String registryId, GetServiceInstanceForRegistryByServiceNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceInstanceForRegistryByServiceName", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/" + gatewayId + "/registry/{registryId}/service", "json", req, runtime), new GetServiceInstanceForRegistryByServiceNameResponse());
    }

    /**
     * installArmsAgent
     */
    public InstallArmsAgentResponse installArmsAgent(String gatewayId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installArmsAgentWithOptions(gatewayId, headers, runtime);
    }

    public InstallArmsAgentResponse installArmsAgentWithOptions(String gatewayId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("InstallArmsAgent", "2020-08-10", "HTTPS", "GET", "AK", "/v1/gateway/agent/" + gatewayId + "", "json", req, runtime), new InstallArmsAgentResponse());
    }

    /**
     * publishApi
     */
    public PublishApiResponse publishApi(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishApiWithOptions(apiId, headers, runtime);
    }

    public PublishApiResponse publishApiWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PublishApi", "2020-08-10", "HTTPS", "POST", "AK", "/v1/api/" + apiId + "/publish", "json", req, runtime), new PublishApiResponse());
    }

    /**
     * pullServiceInfoFromRegistry
     */
    public PullServiceInfoFromRegistryResponse pullServiceInfoFromRegistry(String registryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullServiceInfoFromRegistryWithOptions(registryId, headers, runtime);
    }

    public PullServiceInfoFromRegistryResponse pullServiceInfoFromRegistryWithOptions(String registryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PullServiceInfoFromRegistry", "2020-08-10", "HTTPS", "GET", "AK", "/v1/registry/" + registryId + "/pull", "json", req, runtime), new PullServiceInfoFromRegistryResponse());
    }

    /**
     * recycleApi
     */
    public RecycleApiResponse recycleApi(String apiId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recycleApiWithOptions(apiId, headers, runtime);
    }

    public RecycleApiResponse recycleApiWithOptions(String apiId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RecycleApi", "2020-08-10", "HTTPS", "POST", "AK", "/v1/api/" + apiId + "/recycle", "json", req, runtime), new RecycleApiResponse());
    }

    /**
     * saveAllPolicies
     */
    public SaveAllPoliciesResponse saveAllPolicies(String apiId, SaveAllPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveAllPoliciesWithOptions(apiId, request, headers, runtime);
    }

    public SaveAllPoliciesResponse saveAllPoliciesWithOptions(String apiId, SaveAllPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("SaveAllPolicies", "2020-08-10", "HTTPS", "POST", "AK", "/v1/api/" + apiId + "/policies", "json", req, runtime), new SaveAllPoliciesResponse());
    }

    /**
     * updateApi
     */
    public UpdateApiResponse updateApi(String apiId, UpdateApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiWithOptions(apiId, request, headers, runtime);
    }

    public UpdateApiResponse updateApiWithOptions(String apiId, UpdateApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateApi", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/api/" + apiId + "", "json", req, runtime), new UpdateApiResponse());
    }

    /**
     * updateAuthTicket
     */
    public UpdateAuthTicketResponse updateAuthTicket(UpdateAuthTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAuthTicketWithOptions(request, headers, runtime);
    }

    public UpdateAuthTicketResponse updateAuthTicketWithOptions(UpdateAuthTicketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAuthTicket", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/auth", "json", req, runtime), new UpdateAuthTicketResponse());
    }

    /**
     * updateGateway
     */
    public UpdateGatewayResponse updateGateway(UpdateGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGatewayWithOptions(request, headers, runtime);
    }

    public UpdateGatewayResponse updateGatewayWithOptions(UpdateGatewayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateGateway", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/gateway", "json", req, runtime), new UpdateGatewayResponse());
    }

    /**
     * updatePolicy
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePolicyWithOptions(request, headers, runtime);
    }

    public UpdatePolicyResponse updatePolicyWithOptions(UpdatePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePolicy", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/policy", "json", req, runtime), new UpdatePolicyResponse());
    }

    /**
     * UpdateRegistry
     */
    public UpdateRegistryResponse updateRegistry(String registryId, UpdateRegistryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegistryWithOptions(registryId, request, headers, runtime);
    }

    public UpdateRegistryResponse updateRegistryWithOptions(String registryId, UpdateRegistryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateRegistry", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/registry/" + registryId + "", "json", req, runtime), new UpdateRegistryResponse());
    }

    /**
     * updateService
     */
    public UpdateServiceResponse updateService(String serviceId, UpdateServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateServiceWithOptions(serviceId, request, headers, runtime);
    }

    public UpdateServiceResponse updateServiceWithOptions(String serviceId, UpdateServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateService", "2020-08-10", "HTTPS", "PUT", "AK", "/v1/service/" + serviceId + "", "json", req, runtime), new UpdateServiceResponse());
    }

    /**
     * validateRegistryAddress
     */
    public ValidateRegistryAddressResponse validateRegistryAddress(String gatewayId, ValidateRegistryAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateRegistryAddressWithOptions(gatewayId, request, headers, runtime);
    }

    public ValidateRegistryAddressResponse validateRegistryAddressWithOptions(String gatewayId, ValidateRegistryAddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request.data))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateRegistryAddress", "2020-08-10", "HTTPS", "POST", "AK", "/v1/gateway/" + gatewayId + "/registry/validate", "json", req, runtime), new ValidateRegistryAddressResponse());
    }
}
