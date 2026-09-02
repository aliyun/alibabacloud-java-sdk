// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509;

import com.aliyun.tea.*;
import com.aliyun.fcsandbox20260509.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("fcsandbox", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKeyWithOptions(CreateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiKey"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Team.</p>
     * 
     * @param request CreateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeamWithOptions(CreateTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTeam"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/teams"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Team.</p>
     * 
     * @param request CreateTeamRequest
     * @return CreateTeamResponse
     */
    public CreateTeamResponse createTeam(CreateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTeamWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a volume.</p>
     * 
     * @param request CreateVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolumeWithOptions(CreateVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVolume"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/volumes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a volume.</p>
     * 
     * @param request CreateVolumeRequest
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVolumeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKeyWithOptions(String apiKeyID, DeleteApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiKey"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKey(String apiKeyID, DeleteApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Quota configuration.</p>
     * 
     * @param request DeleteQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuotaWithOptions(DeleteQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Quota configuration.</p>
     * 
     * @param request DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuota(DeleteQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a team.</p>
     * 
     * @param request DeleteTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeamWithOptions(String teamID, DeleteTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTeam"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a team.</p>
     * 
     * @param request DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    public DeleteTeamResponse deleteTeam(String teamID, DeleteTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(String templateID, DeleteTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String templateID, DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Volume.</p>
     * 
     * @param request DeleteVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolumeWithOptions(String volumeID, DeleteVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVolume"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Volume.</p>
     * 
     * @param request DeleteVolumeRequest
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolume(String volumeID, DeleteVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVolumeWithOptions(volumeID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an API key.</p>
     * 
     * @param request DescribeApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiKeyResponse
     */
    public DescribeApiKeyResponse describeApiKeyWithOptions(String apiKeyID, DescribeApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiKey"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an API key.</p>
     * 
     * @param request DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     */
    public DescribeApiKeyResponse describeApiKey(String apiKeyID, DescribeApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Quota configuration.</p>
     * 
     * @param request DescribeQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuotaWithOptions(DescribeQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the Quota configuration.</p>
     * 
     * @param request DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a team.</p>
     * 
     * @param request GetTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeamWithOptions(String teamID, GetTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTeam"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a team.</p>
     * 
     * @param request GetTeamRequest
     * @return GetTeamResponse
     */
    public GetTeamResponse getTeam(String teamID, GetTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a template.</p>
     * 
     * @param request GetTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String templateID, GetTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a template.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String templateID, GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(templateID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a volume.</p>
     * 
     * @param request GetVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolumeWithOptions(String volumeID, GetVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVolume"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a volume.</p>
     * 
     * @param request GetVolumeRequest
     * @return GetVolumeResponse
     */
    public GetVolumeResponse getVolume(String volumeID, GetVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVolumeWithOptions(volumeID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API keys by paging.</p>
     * 
     * @param request ListApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeysWithOptions(ListApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyName)) {
            query.put("apiKeyName", request.apiKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiKeys"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries API keys by paging.</p>
     * 
     * @param request ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiKeysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configurations of an account.</p>
     * 
     * @param request ListQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuotaWithOptions(ListQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota configurations of an account.</p>
     * 
     * @param request ListQuotaRequest
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of teams.</p>
     * 
     * @param request ListTeamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeamsWithOptions(ListTeamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plan)) {
            query.put("plan", request.plan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamName)) {
            query.put("teamName", request.teamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeams"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/teams"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of teams.</p>
     * 
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTeamsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries volumes by using paging.</p>
     * 
     * @param request ListVolumesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumesWithOptions(ListVolumesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("resourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamID)) {
            query.put("teamID", request.teamID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userID)) {
            query.put("userID", request.userID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeName)) {
            query.put("volumeName", request.volumeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVolumes"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/volumes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries volumes by using paging.</p>
     * 
     * @param request ListVolumesRequest
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVolumesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKeyWithOptions(String apiKeyID, ResetApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetApiKey"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + "/reset"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKey(String apiKeyID, ResetApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKeyWithOptions(String apiKeyID, UpdateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiKey"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/api-keys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKey(String apiKeyID, UpdateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiKeyWithOptions(apiKeyID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Quota configuration.</p>
     * 
     * @param request UpdateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuotaWithOptions(UpdateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Quota configuration.</p>
     * 
     * @param request UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuota(UpdateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a team.</p>
     * 
     * @param request UpdateTeamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeamWithOptions(String teamID, UpdateTeamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTeam"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/teams/" + com.aliyun.openapiutil.Client.getEncodeParam(teamID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTeamResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a team.</p>
     * 
     * @param request UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    public UpdateTeamResponse updateTeam(String teamID, UpdateTeamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTeamWithOptions(teamID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a volume.</p>
     * 
     * @param request UpdateVolumeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVolumeResponse
     */
    public UpdateVolumeResponse updateVolumeWithOptions(String volumeID, UpdateVolumeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVolume"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/volumes/" + com.aliyun.openapiutil.Client.getEncodeParam(volumeID) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a volume.</p>
     * 
     * @param request UpdateVolumeRequest
     * @return UpdateVolumeResponse
     */
    public UpdateVolumeResponse updateVolume(String volumeID, UpdateVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVolumeWithOptions(volumeID, request, headers, runtime);
    }
}
