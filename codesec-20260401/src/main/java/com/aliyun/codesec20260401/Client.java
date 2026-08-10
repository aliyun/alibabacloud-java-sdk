// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401;

import com.aliyun.tea.*;
import com.aliyun.codesec20260401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <p>List projects for tenant</p>
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
     * <p>List projects for tenant</p>
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
     * <p>List findings for one engine (SAST / SCA)</p>
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
     * <p>List findings for one engine (SAST / SCA)</p>
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
     * <p>List scans for project</p>
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
     * <p>List scans for project</p>
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
