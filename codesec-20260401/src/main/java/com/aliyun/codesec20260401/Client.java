// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401;

import com.aliyun.tea.*;
import com.aliyun.codesec20260401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("codesec", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Finalize code bundle after client PUT to OSS</p>
     * 
     * @param request CompleteCodeBundleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteCodeBundleResponse
     */
    public CompleteCodeBundleResponse completeCodeBundleWithOptions(String projectId, String codeBundleId, CompleteCodeBundleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byteSize)) {
            query.put("byteSize", request.byteSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("contentType", request.contentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteCodeBundle"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/codeBundles/" + com.aliyun.openapiutil.Client.getEncodeParam(codeBundleId) + "/complete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteCodeBundleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Finalize code bundle after client PUT to OSS</p>
     * 
     * @param request CompleteCodeBundleRequest
     * @return CompleteCodeBundleResponse
     */
    public CompleteCodeBundleResponse completeCodeBundle(String projectId, String codeBundleId, CompleteCodeBundleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeCodeBundleWithOptions(projectId, codeBundleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create pending code bundle with CI metadata and issue direct-to-OSS PUT credentials</p>
     * 
     * @param request CreateCodeBundleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCodeBundleResponse
     */
    public CreateCodeBundleResponse createCodeBundleWithOptions(String projectId, CreateCodeBundleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciMetadata)) {
            query.put("ciMetadata", request.ciMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            query.put("filename", request.filename);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCodeBundle"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/codeBundles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCodeBundleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create pending code bundle with CI metadata and issue direct-to-OSS PUT credentials</p>
     * 
     * @param request CreateCodeBundleRequest
     * @return CreateCodeBundleResponse
     */
    public CreateCodeBundleResponse createCodeBundle(String projectId, CreateCodeBundleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCodeBundleWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create project</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.engines)) {
            request.enginesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.engines, "engines", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.source)) {
            request.sourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.source, "source", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enginesShrink)) {
            query.put("engines", request.enginesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructionPrompt)) {
            query.put("instructionPrompt", request.instructionPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceShrink)) {
            query.put("source", request.sourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create project</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create scan</p>
     * 
     * @param request CreateScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScanResponse
     */
    public CreateScanResponse createScanWithOptions(String projectId, CreateScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeBundleId)) {
            query.put("codeBundleId", request.codeBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            query.put("kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScan"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/scans"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create scan</p>
     * 
     * @param request CreateScanRequest
     * @return CreateScanResponse
     */
    public CreateScanResponse createScan(String projectId, CreateScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScanWithOptions(projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists projects under the current tenant with pagination. Supports fuzzy match by name or prompt.</p>
     * 
     * @param request DescribeProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectsResponse
     */
    public DescribeProjectsResponse describeProjectsWithOptions(DescribeProjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("sortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("sortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjects"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists projects under the current tenant with pagination. Supports fuzzy match by name or prompt.</p>
     * 
     * @param request DescribeProjectsRequest
     * @return DescribeProjectsResponse
     */
    public DescribeProjectsResponse describeProjects(DescribeProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeProjectsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get scan</p>
     * 
     * @param request DescribeScanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScanResponse
     */
    public DescribeScanResponse describeScanWithOptions(String projectId, String scanId, DescribeScanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScan"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/scans/" + com.aliyun.openapiutil.Client.getEncodeParam(scanId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get scan</p>
     * 
     * @param request DescribeScanRequest
     * @return DescribeScanResponse
     */
    public DescribeScanResponse describeScan(String projectId, String scanId, DescribeScanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScanWithOptions(projectId, scanId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the task result list to retrieve detailed SAST or SCA results for a specific scan.</p>
     * 
     * @param request DescribeScanResultsByEngineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScanResultsByEngineResponse
     */
    public DescribeScanResultsByEngineResponse describeScanResultsByEngineWithOptions(String projectId, String scanId, String engine, DescribeScanResultsByEngineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineState)) {
            query.put("baselineState", request.baselineState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("packageName", request.packageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScanResultsByEngine"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/scans/" + com.aliyun.openapiutil.Client.getEncodeParam(scanId) + "/results/" + com.aliyun.openapiutil.Client.getEncodeParam(engine) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScanResultsByEngineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the task result list to retrieve detailed SAST or SCA results for a specific scan.</p>
     * 
     * @param request DescribeScanResultsByEngineRequest
     * @return DescribeScanResultsByEngineResponse
     */
    public DescribeScanResultsByEngineResponse describeScanResultsByEngine(String projectId, String scanId, String engine, DescribeScanResultsByEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScanResultsByEngineWithOptions(projectId, scanId, engine, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists scan tasks under a specified project with pagination.</p>
     * 
     * @param request DescribeScansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScansResponse
     */
    public DescribeScansResponse describeScansWithOptions(String projectId, DescribeScansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("taskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScans"),
            new TeaPair("version", "2026-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/scans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists scan tasks under a specified project with pagination.</p>
     * 
     * @param request DescribeScansRequest
     * @return DescribeScansResponse
     */
    public DescribeScansResponse describeScans(String projectId, DescribeScansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeScansWithOptions(projectId, request, headers, runtime);
    }
}
