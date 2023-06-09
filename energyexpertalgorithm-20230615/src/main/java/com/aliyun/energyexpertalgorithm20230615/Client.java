// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615;

import com.aliyun.tea.*;
import com.aliyun.energyexpertalgorithm20230615.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("energyexpertalgorithm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public QueryCostCurveContrastResponse queryCostCurveContrastWithOptions(QueryCostCurveContrastRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostCurveContrast"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryCostCurveContrast"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostCurveContrastResponse());
    }

    public QueryCostCurveContrastResponse queryCostCurveContrast(QueryCostCurveContrastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCostCurveContrastWithOptions(request, headers, runtime);
    }

    public QueryEnergyStorageStrategyResponse queryEnergyStorageStrategyWithOptions(QueryEnergyStorageStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEnergyStorageStrategy"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryEnergyStorageStrategy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEnergyStorageStrategyResponse());
    }

    public QueryEnergyStorageStrategyResponse queryEnergyStorageStrategy(QueryEnergyStorageStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnergyStorageStrategyWithOptions(request, headers, runtime);
    }

    public QueryLongTermLoadForecastDataResponse queryLongTermLoadForecastDataWithOptions(QueryLongTermLoadForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLongTermLoadForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryLongTermLoadForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLongTermLoadForecastDataResponse());
    }

    public QueryLongTermLoadForecastDataResponse queryLongTermLoadForecastData(QueryLongTermLoadForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLongTermLoadForecastDataWithOptions(request, headers, runtime);
    }

    public QueryLongTermPvForecastDataResponse queryLongTermPvForecastDataWithOptions(QueryLongTermPvForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLongTermPvForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryLongTermPvForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLongTermPvForecastDataResponse());
    }

    public QueryLongTermPvForecastDataResponse queryLongTermPvForecastData(QueryLongTermPvForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLongTermPvForecastDataWithOptions(request, headers, runtime);
    }

    public QueryShortTermLoadForecastDataResponse queryShortTermLoadForecastDataWithOptions(QueryShortTermLoadForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShortTermLoadForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryShortTermLoadForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShortTermLoadForecastDataResponse());
    }

    public QueryShortTermLoadForecastDataResponse queryShortTermLoadForecastData(QueryShortTermLoadForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryShortTermLoadForecastDataWithOptions(request, headers, runtime);
    }

    public QueryShortTermPvForecastDataResponse queryShortTermPvForecastDataWithOptions(QueryShortTermPvForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShortTermPvForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryShortTermPvForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShortTermPvForecastDataResponse());
    }

    public QueryShortTermPvForecastDataResponse queryShortTermPvForecastData(QueryShortTermPvForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryShortTermPvForecastDataWithOptions(request, headers, runtime);
    }

    public QueryUltraShortTermLoadForecastDataResponse queryUltraShortTermLoadForecastDataWithOptions(QueryUltraShortTermLoadForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUltraShortTermLoadForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryUltraShortTermLoadForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUltraShortTermLoadForecastDataResponse());
    }

    public QueryUltraShortTermLoadForecastDataResponse queryUltraShortTermLoadForecastData(QueryUltraShortTermLoadForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUltraShortTermLoadForecastDataWithOptions(request, headers, runtime);
    }

    public QueryUltraShortTermPvForecastDataResponse queryUltraShortTermPvForecastDataWithOptions(QueryUltraShortTermPvForecastDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnList)) {
            body.put("deviceSnList", request.deviceSnList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsTime)) {
            body.put("dsTime", request.dsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            body.put("dsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("timeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUltraShortTermPvForecastData"),
            new TeaPair("version", "2023-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/pves/v1/queryUltraShortTermPvForecastData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUltraShortTermPvForecastDataResponse());
    }

    public QueryUltraShortTermPvForecastDataResponse queryUltraShortTermPvForecastData(QueryUltraShortTermPvForecastDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUltraShortTermPvForecastDataWithOptions(request, headers, runtime);
    }
}
