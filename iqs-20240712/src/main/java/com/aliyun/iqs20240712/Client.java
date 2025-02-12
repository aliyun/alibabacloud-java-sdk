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
     * <p>根据起终点坐标检索符合条件的骑行路线规划方案</p>
     * 
     * @param request BicyclingDirectionNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BicyclingDirectionNovaResponse
     */
    public BicyclingDirectionNovaResponse bicyclingDirectionNovaWithOptions(BicyclingDirectionNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BicyclingDirectionNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/direction/bicycling"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BicyclingDirectionNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BicyclingDirectionNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的骑行路线规划方案</p>
     * 
     * @param request BicyclingDirectionNovaRequest
     * @return BicyclingDirectionNovaResponse
     */
    public BicyclingDirectionNovaResponse bicyclingDirectionNova(BicyclingDirectionNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bicyclingDirectionNovaWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CommonQueryBySceneResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CommonQueryBySceneResponse());
        }

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
     * <p>根据起终点坐标检索符合条件的驾车路线规划方案</p>
     * 
     * @param request DrivingDirectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DrivingDirectionResponse
     */
    public DrivingDirectionResponse drivingDirectionWithOptions(DrivingDirectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DrivingDirection"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v1/direction/driving"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DrivingDirectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DrivingDirectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的驾车路线规划方案</p>
     * 
     * @param request DrivingDirectionRequest
     * @return DrivingDirectionResponse
     */
    public DrivingDirectionResponse drivingDirection(DrivingDirectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.drivingDirectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的驾车路线规划方案</p>
     * 
     * @param request DrivingDirectionNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DrivingDirectionNovaResponse
     */
    public DrivingDirectionNovaResponse drivingDirectionNovaWithOptions(DrivingDirectionNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.carType)) {
            query.put("carType", request.carType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plate)) {
            query.put("plate", request.plate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DrivingDirectionNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/direction/driving"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DrivingDirectionNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DrivingDirectionNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的驾车路线规划方案</p>
     * 
     * @param request DrivingDirectionNovaRequest
     * @return DrivingDirectionNovaResponse
     */
    public DrivingDirectionNovaResponse drivingDirectionNova(DrivingDirectionNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.drivingDirectionNovaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>电动车路线规划方案V2</p>
     * 
     * @param request ElectrobikeDirectionNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ElectrobikeDirectionNovaResponse
     */
    public ElectrobikeDirectionNovaResponse electrobikeDirectionNovaWithOptions(ElectrobikeDirectionNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ElectrobikeDirectionNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/direction/electrobike"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ElectrobikeDirectionNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ElectrobikeDirectionNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>电动车路线规划方案V2</p>
     * 
     * @param request ElectrobikeDirectionNovaRequest
     * @return ElectrobikeDirectionNovaResponse
     */
    public ElectrobikeDirectionNovaResponse electrobikeDirectionNova(ElectrobikeDirectionNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.electrobikeDirectionNovaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>地理编码，将详细的结构化地址转换为高德经纬度坐标</p>
     * 
     * @param request GeoCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GeoCodeResponse
     */
    public GeoCodeResponse geoCodeWithOptions(GeoCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("city", request.city);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GeoCode"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v1/geocode/geo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GeoCodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GeoCodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>地理编码，将详细的结构化地址转换为高德经纬度坐标</p>
     * 
     * @param request GeoCodeRequest
     * @return GeoCodeResponse
     */
    public GeoCodeResponse geoCode(GeoCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.geoCodeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过经纬度查询附近的地点</p>
     * 
     * @param request NearbySearchNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return NearbySearchNovaResponse
     */
    public NearbySearchNovaResponse nearbySearchNovaWithOptions(NearbySearchNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityLimit)) {
            query.put("cityLimit", request.cityLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.radius)) {
            query.put("radius", request.radius);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortRule)) {
            query.put("sortRule", request.sortRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NearbySearchNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/pois/nearby"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new NearbySearchNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new NearbySearchNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过经纬度查询附近的地点</p>
     * 
     * @param request NearbySearchNovaRequest
     * @return NearbySearchNovaResponse
     */
    public NearbySearchNovaResponse nearbySearchNova(NearbySearchNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.nearbySearchNovaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过关键词搜索地点</p>
     * 
     * @param request PlaceSearchNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PlaceSearchNovaResponse
     */
    public PlaceSearchNovaResponse placeSearchNovaWithOptions(PlaceSearchNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityLimit)) {
            query.put("cityLimit", request.cityLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlaceSearchNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/pois/place"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PlaceSearchNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PlaceSearchNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过关键词搜索地点</p>
     * 
     * @param request PlaceSearchNovaRequest
     * @return PlaceSearchNovaResponse
     */
    public PlaceSearchNovaResponse placeSearchNova(PlaceSearchNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.placeSearchNovaWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAttractionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAttractionsResponse());
        }

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
     * <p>景点查询</p>
     * 
     * @param request QueryAttractionsNlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAttractionsNlResponse
     */
    public QueryAttractionsNlResponse queryAttractionsNlWithOptions(QueryAttractionsNlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAttractionsNl"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v2/nl/attractions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAttractionsNlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryAttractionsNlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>景点查询</p>
     * 
     * @param request QueryAttractionsNlRequest
     * @return QueryAttractionsNlResponse
     */
    public QueryAttractionsNlResponse queryAttractionsNl(QueryAttractionsNlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAttractionsNlWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotelsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryHotelsResponse());
        }

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
     * <p>酒店查询</p>
     * 
     * @param request QueryHotelsNlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotelsNlResponse
     */
    public QueryHotelsNlResponse queryHotelsNlWithOptions(QueryHotelsNlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotelsNl"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v2/nl/hotels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotelsNlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryHotelsNlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>酒店查询</p>
     * 
     * @param request QueryHotelsNlRequest
     * @return QueryHotelsNlResponse
     */
    public QueryHotelsNlResponse queryHotelsNl(QueryHotelsNlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryHotelsNlWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRestaurantsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryRestaurantsResponse());
        }

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

    /**
     * <b>summary</b> : 
     * <p>餐厅查询</p>
     * 
     * @param request QueryRestaurantsNlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRestaurantsNlResponse
     */
    public QueryRestaurantsNlResponse queryRestaurantsNlWithOptions(QueryRestaurantsNlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRestaurantsNl"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/amap-function-call-agent/iqs-agent-service/v2/nl/restaurants"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRestaurantsNlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryRestaurantsNlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>餐厅查询</p>
     * 
     * @param request QueryRestaurantsNlRequest
     * @return QueryRestaurantsNlResponse
     */
    public QueryRestaurantsNlResponse queryRestaurantsNl(QueryRestaurantsNlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRestaurantsNlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>逆地理编码，将经纬度转换为详细结构化的地址信息</p>
     * 
     * @param request RgeoCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RgeoCodeResponse
     */
    public RgeoCodeResponse rgeoCodeWithOptions(RgeoCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("longitude", request.longitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RgeoCode"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v1/geocode/regeo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RgeoCodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RgeoCodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>逆地理编码，将经纬度转换为详细结构化的地址信息</p>
     * 
     * @param request RgeoCodeRequest
     * @return RgeoCodeResponse
     */
    public RgeoCodeResponse rgeoCode(RgeoCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rgeoCodeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>公共交通路线规划方案</p>
     * 
     * @param request TransitIntegratedDirectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransitIntegratedDirectionResponse
     */
    public TransitIntegratedDirectionResponse transitIntegratedDirectionWithOptions(TransitIntegratedDirectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCity)) {
            query.put("destinationCity", request.destinationCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originCity)) {
            query.put("originCity", request.originCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransitIntegratedDirection"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/direction/transit/integrated"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TransitIntegratedDirectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TransitIntegratedDirectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>公共交通路线规划方案</p>
     * 
     * @param request TransitIntegratedDirectionRequest
     * @return TransitIntegratedDirectionResponse
     */
    public TransitIntegratedDirectionResponse transitIntegratedDirection(TransitIntegratedDirectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transitIntegratedDirectionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的步行路线规划方案</p>
     * 
     * @param request WalkingDirectionNovaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WalkingDirectionNovaResponse
     */
    public WalkingDirectionNovaResponse walkingDirectionNovaWithOptions(WalkingDirectionNovaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationLatitude)) {
            query.put("destinationLatitude", request.destinationLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationLongitude)) {
            query.put("destinationLongitude", request.destinationLongitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLatitude)) {
            query.put("originLatitude", request.originLatitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originLongitude)) {
            query.put("originLongitude", request.originLongitude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WalkingDirectionNova"),
            new TeaPair("version", "2024-07-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ipaas/v2/direction/walking"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new WalkingDirectionNovaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new WalkingDirectionNovaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据起终点坐标检索符合条件的步行路线规划方案</p>
     * 
     * @param request WalkingDirectionNovaRequest
     * @return WalkingDirectionNovaResponse
     */
    public WalkingDirectionNovaResponse walkingDirectionNova(WalkingDirectionNovaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.walkingDirectionNovaWithOptions(request, headers, runtime);
    }
}
