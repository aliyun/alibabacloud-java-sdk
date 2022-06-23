// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230;

import com.aliyun.tea.*;
import com.aliyun.amptest20201230.models.*;
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
        this._endpoint = this.getEndpoint("amptest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRulesShrinkRequest request = new CreateRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRules"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRulesResponse());
    }

    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    public HuichengTestGrayResponse huichengTestGrayWithOptions(HuichengTestGrayRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayShrinkRequest request = new HuichengTestGrayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGray"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayResponse());
    }

    public HuichengTestGrayResponse huichengTestGray(HuichengTestGrayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayWithOptions(request, runtime);
    }

    public HuichengTestGrayEightResponse huichengTestGrayEightWithOptions(HuichengTestGrayEightRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayEightShrinkRequest request = new HuichengTestGrayEightShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGrayEight"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayEightResponse());
    }

    public HuichengTestGrayEightResponse huichengTestGrayEight(HuichengTestGrayEightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayEightWithOptions(request, runtime);
    }

    public HuichengTestGrayFifthResponse huichengTestGrayFifthWithOptions(HuichengTestGrayFifthRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayFifthShrinkRequest request = new HuichengTestGrayFifthShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGrayFifth"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayFifthResponse());
    }

    public HuichengTestGrayFifthResponse huichengTestGrayFifth(HuichengTestGrayFifthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayFifthWithOptions(request, runtime);
    }

    public HuichengTestGrayNineResponse huichengTestGrayNineWithOptions(HuichengTestGrayNineRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayNineShrinkRequest request = new HuichengTestGrayNineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGrayNine"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayNineResponse());
    }

    public HuichengTestGrayNineResponse huichengTestGrayNine(HuichengTestGrayNineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayNineWithOptions(request, runtime);
    }

    public HuichengTestGraySecondResponse huichengTestGraySecondWithOptions(HuichengTestGraySecondRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGraySecondShrinkRequest request = new HuichengTestGraySecondShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGraySecond"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGraySecondResponse());
    }

    public HuichengTestGraySecondResponse huichengTestGraySecond(HuichengTestGraySecondRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGraySecondWithOptions(request, runtime);
    }

    public HuichengTestGraySevenResponse huichengTestGraySevenWithOptions(HuichengTestGraySevenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGraySevenShrinkRequest request = new HuichengTestGraySevenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGraySeven"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGraySevenResponse());
    }

    public HuichengTestGraySevenResponse huichengTestGraySeven(HuichengTestGraySevenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGraySevenWithOptions(request, runtime);
    }

    public HuichengTestGraySixResponse huichengTestGraySixWithOptions(HuichengTestGraySixRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGraySixShrinkRequest request = new HuichengTestGraySixShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGraySix"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGraySixResponse());
    }

    public HuichengTestGraySixResponse huichengTestGraySix(HuichengTestGraySixRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGraySixWithOptions(request, runtime);
    }

    public HuichengTestGrayTenResponse huichengTestGrayTenWithOptions(HuichengTestGrayTenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayTenShrinkRequest request = new HuichengTestGrayTenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGrayTen"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayTenResponse());
    }

    public HuichengTestGrayTenResponse huichengTestGrayTen(HuichengTestGrayTenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayTenWithOptions(request, runtime);
    }

    public HuichengTestGrayThirdResponse huichengTestGrayThirdWithOptions(HuichengTestGrayThirdRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HuichengTestGrayThirdShrinkRequest request = new HuichengTestGrayThirdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.home))) {
            request.homeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.home), "Home", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.homeShrink)) {
            query.put("Home", request.homeShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestGrayThird"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestGrayThirdResponse());
    }

    public HuichengTestGrayThirdResponse huichengTestGrayThird(HuichengTestGrayThirdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestGrayThirdWithOptions(request, runtime);
    }

    public HuichengTestResourceOwnerIdResponse huichengTestResourceOwnerIdWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HuichengTestResourceOwnerId"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengTestResourceOwnerIdResponse());
    }

    public HuichengTestResourceOwnerIdResponse huichengTestResourceOwnerId() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengTestResourceOwnerIdWithOptions(runtime);
    }

    public HuichengetResponse huichengetWithOptions(HuichengetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.add)) {
            query.put("Add", request.add);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apple)) {
            query.put("Apple", request.apple);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blue)) {
            query.put("Blue", request.blue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enight)) {
            query.put("Enight", request.enight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.five)) {
            query.put("Five", request.five);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.four)) {
            query.put("Four", request.four);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.list)) {
            query.put("List", request.list);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newName)) {
            query.put("NewName", request.newName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nigh)) {
            query.put("Nigh", request.nigh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.now)) {
            query.put("Now", request.now);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params1)) {
            query.put("Params1", request.params1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params2)) {
            query.put("Params2", request.params2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params3)) {
            query.put("Params3", request.params3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params4)) {
            query.put("Params4", request.params4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.red)) {
            query.put("Red", request.red);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.six)) {
            query.put("Six", request.six);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tea)) {
            query.put("Tea", request.tea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ten)) {
            query.put("Ten", request.ten);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.three)) {
            query.put("Three", request.three);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.two)) {
            query.put("Two", request.two);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.white)) {
            query.put("White", request.white);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Huichenget"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengetResponse());
    }

    public HuichengetResponse huichenget(HuichengetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengetWithOptions(request, runtime);
    }

    public HuichengetestResponse huichengetestWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Huichengetest"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HuichengetestResponse());
    }

    public HuichengetestResponse huichengetest() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.huichengetestWithOptions(runtime);
    }
}
