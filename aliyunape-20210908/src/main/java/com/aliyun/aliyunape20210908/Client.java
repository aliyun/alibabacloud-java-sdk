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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParam)) {
            request.extendParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParam, "ExtendParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceParam)) {
            request.serviceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceParam, "ServiceParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Channel", request.channel);
        query.put("ExtendParam", request.extendParamShrink);
        query.put("OrderId", request.orderId);
        query.put("RequestId", request.requestId);
        query.put("ServiceParam", request.serviceParamShrink);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Execute"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteResponse());
    }

    public ExecuteResponse execute(ExecuteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeWithOptions(request, runtime);
    }

    public WeathermonitorProvinceHourResponse weathermonitorProvinceHourWithOptions(WeathermonitorProvinceHourRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WeathermonitorProvinceHourShrinkRequest request = new WeathermonitorProvinceHourShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParam)) {
            request.extendParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParam, "ExtendParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceParam)) {
            request.serviceParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceParam, "ServiceParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Channel", request.channel);
        query.put("ExtendParam", request.extendParamShrink);
        query.put("OrderId", request.orderId);
        query.put("RequestId", request.requestId);
        query.put("ServiceParam", request.serviceParamShrink);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WeathermonitorProvinceHour"),
            new TeaPair("version", "2021-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WeathermonitorProvinceHourResponse());
    }

    public WeathermonitorProvinceHourResponse weathermonitorProvinceHour(WeathermonitorProvinceHourRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.weathermonitorProvinceHourWithOptions(request, runtime);
    }
}
