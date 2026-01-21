// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812;

import com.aliyun.tea.*;
import com.aliyun.adbai20250812.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adbai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建指标平台</p>
     * 
     * @param tmpReq CreateAgentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentPlatformResponse
     */
    public CreateAgentPlatformResponse createAgentPlatformWithOptions(CreateAgentPlatformRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAgentPlatformShrinkRequest request = new CreateAgentPlatformShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aiPlatformConfig)) {
            request.aiPlatformConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aiPlatformConfig, "AiPlatformConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiPlatformConfigShrink)) {
            query.put("AiPlatformConfig", request.aiPlatformConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentPlatform"),
            new TeaPair("version", "2025-08-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentPlatformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建指标平台</p>
     * 
     * @param request CreateAgentPlatformRequest
     * @return CreateAgentPlatformResponse
     */
    public CreateAgentPlatformResponse createAgentPlatform(CreateAgentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建具身智能平台</p>
     * 
     * @param tmpReq CreateEmbodiedAIPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEmbodiedAIPlatformResponse
     */
    public CreateEmbodiedAIPlatformResponse createEmbodiedAIPlatformWithOptions(CreateEmbodiedAIPlatformRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEmbodiedAIPlatformShrinkRequest request = new CreateEmbodiedAIPlatformShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rayConfig)) {
            request.rayConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rayConfig, "RayConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformName)) {
            query.put("PlatformName", request.platformName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rayConfigShrink)) {
            query.put("RayConfig", request.rayConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webserverSpecName)) {
            query.put("WebserverSpecName", request.webserverSpecName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEmbodiedAIPlatform"),
            new TeaPair("version", "2025-08-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEmbodiedAIPlatformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建具身智能平台</p>
     * 
     * @param request CreateEmbodiedAIPlatformRequest
     * @return CreateEmbodiedAIPlatformResponse
     */
    public CreateEmbodiedAIPlatformResponse createEmbodiedAIPlatform(CreateEmbodiedAIPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEmbodiedAIPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询具身智能平台</p>
     * 
     * @param request DescribeEmbodiedAIPlatformsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEmbodiedAIPlatformsResponse
     */
    public DescribeEmbodiedAIPlatformsResponse describeEmbodiedAIPlatformsWithOptions(DescribeEmbodiedAIPlatformsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformName)) {
            query.put("PlatformName", request.platformName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEmbodiedAIPlatforms"),
            new TeaPair("version", "2025-08-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEmbodiedAIPlatformsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询具身智能平台</p>
     * 
     * @param request DescribeEmbodiedAIPlatformsRequest
     * @return DescribeEmbodiedAIPlatformsResponse
     */
    public DescribeEmbodiedAIPlatformsResponse describeEmbodiedAIPlatforms(DescribeEmbodiedAIPlatformsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEmbodiedAIPlatformsWithOptions(request, runtime);
    }
}
