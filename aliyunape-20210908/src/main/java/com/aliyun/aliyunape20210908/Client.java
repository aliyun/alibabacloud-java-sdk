// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908;

import com.aliyun.tea.*;
import com.aliyun.aliyunape20210908.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aliyunape", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApeInnerCommonApiResponse apeInnerCommonApiWithOptions(ApeInnerCommonApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApeInnerCommonApi"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApeInnerCommonApiResponse());
    }

    public ApeInnerCommonApiResponse apeInnerCommonApi(ApeInnerCommonApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.apeInnerCommonApiWithOptions(request, runtime);
    }

    public ApeProvinceStationRefResponse apeProvinceStationRefWithOptions(ApeProvinceStationRefRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Adcode", request.adcode);
        query.put("AppName", request.appName);
        query.put("City", request.city);
        query.put("Cnty", request.cnty);
        query.put("Offset", request.offset);
        query.put("PageSize", request.pageSize);
        query.put("ProvinceCode", request.provinceCode);
        query.put("ProvinceName", request.provinceName);
        query.put("StationName", request.stationName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApeProvinceStationRef"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApeProvinceStationRefResponse());
    }

    public ApeProvinceStationRefResponse apeProvinceStationRef(ApeProvinceStationRefRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.apeProvinceStationRefWithOptions(request, runtime);
    }

    public HistoricalResponse historicalWithOptions(HistoricalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("OrderId", request.orderId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("Station", request.station);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Historical"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HistoricalResponse());
    }

    public HistoricalResponse historical(HistoricalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.historicalWithOptions(request, runtime);
    }

    public StationDayResponse stationDayWithOptions(StationDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("StartForecast", request.startForecast);
        query.put("Station", request.station);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StationDay"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StationDayResponse());
    }

    public StationDayResponse stationDay(StationDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stationDayWithOptions(request, runtime);
    }

    public WeatherforecastResponse weatherforecastWithOptions(WeatherforecastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lat", request.lat);
        query.put("Lon", request.lon);
        query.put("OrderId", request.orderId);
        query.put("StartForecast", request.startForecast);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Weatherforecast"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WeatherforecastResponse());
    }

    public WeatherforecastResponse weatherforecast(WeatherforecastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weatherforecastWithOptions(request, runtime);
    }

    public WeatherforecastTimeResponse weatherforecastTimeWithOptions(WeatherforecastTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurHour", request.curHour);
        query.put("Lat", request.lat);
        query.put("Lon", request.lon);
        query.put("OrderId", request.orderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WeatherforecastTime"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WeatherforecastTimeResponse());
    }

    public WeatherforecastTimeResponse weatherforecastTime(WeatherforecastTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weatherforecastTimeWithOptions(request, runtime);
    }

    public WeathermonitorResponse weathermonitorWithOptions(WeathermonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurHour", request.curHour);
        query.put("OrderId", request.orderId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Weathermonitor"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WeathermonitorResponse());
    }

    public WeathermonitorResponse weathermonitor(WeathermonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weathermonitorWithOptions(request, runtime);
    }
}
