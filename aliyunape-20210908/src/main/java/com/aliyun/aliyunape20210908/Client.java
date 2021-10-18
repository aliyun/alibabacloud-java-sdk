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

    public ExecuteResponse executeWithOptions(ExecuteRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteShrinkRequest request = new ExecuteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceParam)) {
            request.serviceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceParam, "ServiceParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParam)) {
            request.extendParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParam, "ExtendParam", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Execute", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteResponse());
    }

    public ExecuteResponse execute(ExecuteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeWithOptions(request, runtime);
    }

    public WeathermonitorProvinceHourResponse weathermonitorProvinceHourWithOptions(WeathermonitorProvinceHourRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WeathermonitorProvinceHourShrinkRequest request = new WeathermonitorProvinceHourShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceParam)) {
            request.serviceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceParam, "ServiceParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParam)) {
            request.extendParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParam, "ExtendParam", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WeathermonitorProvinceHour", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new WeathermonitorProvinceHourResponse());
    }

    public WeathermonitorProvinceHourResponse weathermonitorProvinceHour(WeathermonitorProvinceHourRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weathermonitorProvinceHourWithOptions(request, runtime);
    }

    public WeathermonitorResponse weathermonitorWithOptions(WeathermonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Weathermonitor", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new WeathermonitorResponse());
    }

    public WeathermonitorResponse weathermonitor(WeathermonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weathermonitorWithOptions(request, runtime);
    }

    public WeatherforecastTimeResponse weatherforecastTimeWithOptions(WeatherforecastTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WeatherforecastTime", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new WeatherforecastTimeResponse());
    }

    public WeatherforecastTimeResponse weatherforecastTime(WeatherforecastTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weatherforecastTimeWithOptions(request, runtime);
    }

    public StationDayResponse stationDayWithOptions(StationDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StationDay", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new StationDayResponse());
    }

    public StationDayResponse stationDay(StationDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stationDayWithOptions(request, runtime);
    }

    public WeatherforecastResponse weatherforecastWithOptions(WeatherforecastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Weatherforecast", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new WeatherforecastResponse());
    }

    public WeatherforecastResponse weatherforecast(WeatherforecastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weatherforecastWithOptions(request, runtime);
    }

    public HistoricalResponse historicalWithOptions(HistoricalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Historical", "2021-09-08", "HTTPS", "POST", "AK", "json", req, runtime), new HistoricalResponse());
    }

    public HistoricalResponse historical(HistoricalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.historicalWithOptions(request, runtime);
    }
}
