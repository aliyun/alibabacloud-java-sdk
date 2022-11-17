// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213;

import com.aliyun.tea.*;
import com.aliyun.jeepproduct20211213.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("jeepproduct", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BluesResponse bluesWithOptions(BluesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.five)) {
            query.put("Five", request.five);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.four)) {
            query.put("Four", request.four);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.one)) {
            query.put("One", request.one);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestAge)) {
            query.put("RequestAge", request.requestAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestName)) {
            query.put("RequestName", request.requestName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seven)) {
            query.put("Seven", request.seven);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.six)) {
            query.put("Six", request.six);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.three)) {
            query.put("Three", request.three);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.two)) {
            query.put("Two", request.two);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Blues"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BluesResponse());
    }

    public BluesResponse blues(BluesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bluesWithOptions(request, runtime);
    }

    public GetLastLogByIdResponse getLastLogByIdWithOptions(GetLastLogByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.five)) {
            query.put("Five", request.five);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.four)) {
            query.put("Four", request.four);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.news)) {
            query.put("News", request.news);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.one)) {
            query.put("One", request.one);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestAge)) {
            query.put("RequestAge", request.requestAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestName)) {
            query.put("RequestName", request.requestName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seven)) {
            query.put("Seven", request.seven);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.six)) {
            query.put("Six", request.six);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.three)) {
            query.put("Three", request.three);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.two)) {
            query.put("Two", request.two);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weirht)) {
            query.put("Weirht", request.weirht);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLastLogById"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLastLogByIdResponse());
    }

    public GetLastLogByIdResponse getLastLogById(GetLastLogByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLastLogByIdWithOptions(request, runtime);
    }

    public TTTResponse tTTWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TTT"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TTTResponse());
    }

    public TTTResponse tTT() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tTTWithOptions(runtime);
    }

    public TestBoyResponse testBoyWithOptions(TestBoyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newParam2)) {
            query.put("new-param-2", request.newParam2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam3)) {
            query.put("new-param-3", request.newParam3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam4)) {
            query.put("new-param-4", request.newParam4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam4Copy)) {
            query.put("new-param-4-copy", request.newParam4Copy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParam1)) {
            query.put("newParam1", request.newParam1);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestBoy"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestBoyResponse());
    }

    public TestBoyResponse testBoy(TestBoyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testBoyWithOptions(request, runtime);
    }

    public TestByondResponse testByondWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestByond"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestByondResponse());
    }

    public TestByondResponse testByond() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testByondWithOptions(runtime);
    }

    public TestDocDetailShowErrorResponse testDocDetailShowErrorWithOptions(TestDocDetailShowErrorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestDocDetailShowError"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestDocDetailShowErrorResponse());
    }

    public TestDocDetailShowErrorResponse testDocDetailShowError(TestDocDetailShowErrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testDocDetailShowErrorWithOptions(request, runtime);
    }

    public TestErrorResponse testErrorWithOptions(TestErrorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestErrorShrinkRequest request = new TestErrorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.testParamObjectFlat))) {
            request.testParamObjectFlatShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.testParamObjectFlat), "TestParamObjectFlat", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.testParamObjectJson)) {
            request.testParamObjectJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.testParamObjectJson, "TestParamObjectJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrayFlatMapString)) {
            query.put("ArrayFlatMapString", request.arrayFlatMapString);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.group))) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapFlarMapString)) {
            query.put("MapFlarMapString", request.mapFlarMapString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapFlatArratString)) {
            query.put("MapFlatArratString", request.mapFlatArratString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapFlatArratStringCopy)) {
            query.put("MapFlatArratString-copy", request.mapFlatArratStringCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapFlatArratStringCopyCopy)) {
            query.put("MapFlatArratString-copy-copy", request.mapFlatArratStringCopyCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.publishCat))) {
            query.put("PublishCat", request.publishCat);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.publishCatCopy))) {
            query.put("PublishCat-copy", request.publishCatCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testParamArrayFlat)) {
            query.put("TestParamArrayFlat", request.testParamArrayFlat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testParamArrayFlatObject)) {
            query.put("TestParamArrayFlatObject", request.testParamArrayFlatObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testParamObjectFlatShrink)) {
            query.put("TestParamObjectFlat", request.testParamObjectFlatShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.testParamObjectFlat1))) {
            query.put("TestParamObjectFlat1", request.testParamObjectFlat1);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.testParamObjectFlat1Copy))) {
            query.put("TestParamObjectFlat1-copy", request.testParamObjectFlat1Copy);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.testParamObjectFlat1CopyCopy))) {
            query.put("TestParamObjectFlat1-copy-copy", request.testParamObjectFlat1CopyCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testParamObjectJsonShrink)) {
            query.put("TestParamObjectJson", request.testParamObjectJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visityArrayFlat)) {
            query.put("VisityArrayFlat", request.visityArrayFlat);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeIdsShrink)) {
            body.put("KnowledgeIds", request.knowledgeIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestError"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestErrorResponse());
    }

    public TestErrorResponse testError(TestErrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testErrorWithOptions(request, runtime);
    }

    public TraceResponse traceWithOptions(TraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.five)) {
            query.put("Five", request.five);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.four)) {
            query.put("Four", request.four);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("Mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mockCopy)) {
            query.put("Mock-copy", request.mockCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.one)) {
            query.put("One", request.one);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestAge)) {
            query.put("RequestAge", request.requestAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestName)) {
            query.put("RequestName", request.requestName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seven)) {
            query.put("Seven", request.seven);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.six)) {
            query.put("Six", request.six);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.three)) {
            query.put("Three", request.three);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.two)) {
            query.put("Two", request.two);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Trace"),
            new TeaPair("version", "2021-12-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TraceResponse());
    }

    public TraceResponse trace(TraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.traceWithOptions(request, runtime);
    }
}
