// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712;

import com.aliyun.tea.*;
import com.aliyun.iqs20240712.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iqs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>自然语言通用查询</p>
     * 
     * @param request CommonQueryBySceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommonQueryBySceneResponse
     */
    public CommonQueryBySceneResponse commonQueryBySceneWithOptions(CommonQueryBySceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonQueryByScene"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v2/nl/common"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonQueryBySceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自然语言通用查询</p>
     * 
     * @param request CommonQueryBySceneRequest
     * @return CommonQueryBySceneResponse
     */
    public CommonQueryBySceneResponse commonQueryByScene(CommonQueryBySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commonQueryBySceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>景点查询</p>
     * 
     * @param request QueryAttractionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAttractionsResponse
     */
    public QueryAttractionsResponse queryAttractionsWithOptions(QueryAttractionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAttractions"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v1/nl/attractions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAttractionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>景点查询</p>
     * 
     * @param request QueryAttractionsRequest
     * @return QueryAttractionsResponse
     */
    public QueryAttractionsResponse queryAttractions(QueryAttractionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAttractionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店查询</p>
     * 
     * @param request QueryHotelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotelsResponse
     */
    public QueryHotelsResponse queryHotelsWithOptions(QueryHotelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotels"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v1/nl/hotels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>酒店查询</p>
     * 
     * @param request QueryHotelsRequest
     * @return QueryHotelsResponse
     */
    public QueryHotelsResponse queryHotels(QueryHotelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryHotelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>餐厅查询</p>
     * 
     * @param request QueryRestaurantsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRestaurantsResponse
     */
    public QueryRestaurantsResponse queryRestaurantsWithOptions(QueryRestaurantsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRestaurants"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v1/nl/restaurants"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRestaurantsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>餐厅查询</p>
     * 
     * @param request QueryRestaurantsRequest
     * @return QueryRestaurantsResponse
     */
    public QueryRestaurantsResponse queryRestaurants(QueryRestaurantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRestaurantsWithOptions(request, headers, runtime);
    }
}
