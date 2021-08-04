// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244;

import com.aliyun.tea.*;
import com.aliyun.nbf20210803_112546244.models.*;
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
        this._endpoint = this.getEndpoint("nbf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ArrayOutputResponse arrayOutput(ArrayOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.arrayOutputWithOptions(request, headers, runtime);
    }

    public ArrayOutputResponse arrayOutputWithOptions(ArrayOutputRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ArrayOutputShrinkRequest request = new ArrayOutputShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.innput))) {
            request.innputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.innput), "innput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innputShrink)) {
            query.put("innput", request.innputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ArrayOutput", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/ArrayOutput", "array", req, runtime), new ArrayOutputResponse());
    }

    public ArrayInputResponse arrayInput(ArrayInputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.arrayInputWithOptions(request, headers, runtime);
    }

    public ArrayInputResponse arrayInputWithOptions(ArrayInputRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ArrayInputShrinkRequest request = new ArrayInputShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ArrayInput", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/ArrayInput", "json", req, runtime), new ArrayInputResponse());
    }

    public SingleComplexResponse singleComplex(SingleComplexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.singleComplexWithOptions(request, headers, runtime);
    }

    public SingleComplexResponse singleComplexWithOptions(SingleComplexRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SingleComplexShrinkRequest request = new SingleComplexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SingleComplex", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/SingleComplex", "json", req, runtime), new SingleComplexResponse());
    }

    public PrimitiveInputIntResponse primitiveInputInt(PrimitiveInputIntRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveInputIntWithOptions(request, headers, runtime);
    }

    public PrimitiveInputIntResponse primitiveInputIntWithOptions(PrimitiveInputIntRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("input", request.input);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveInputInt", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveInputInt", "json", req, runtime), new PrimitiveInputIntResponse());
    }

    public PrimitiveOutputStringResponse primitiveOutputString(PrimitiveOutputStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveOutputStringWithOptions(request, headers, runtime);
    }

    public PrimitiveOutputStringResponse primitiveOutputStringWithOptions(PrimitiveOutputStringRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PrimitiveOutputStringShrinkRequest request = new PrimitiveOutputStringShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveOutputString", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveOutputString", "string", req, runtime), new PrimitiveOutputStringResponse());
    }

    public MultiComplexResponse multiComplex(MultiComplexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multiComplexWithOptions(request, headers, runtime);
    }

    public MultiComplexResponse multiComplexWithOptions(MultiComplexRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MultiComplexShrinkRequest request = new MultiComplexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.arg2))) {
            request.arg2Shrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.arg2), "arg2", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agr0)) {
            query.put("agr0", request.agr0);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg1)) {
            query.put("arg1", request.arg1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg2Shrink)) {
            query.put("arg2", request.arg2Shrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MultiComplex", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/MultiComplex", "json", req, runtime), new MultiComplexResponse());
    }

    public PrimitiveInputBooleanResponse primitiveInputBoolean(PrimitiveInputBooleanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveInputBooleanWithOptions(request, headers, runtime);
    }

    public PrimitiveInputBooleanResponse primitiveInputBooleanWithOptions(PrimitiveInputBooleanRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveInputBoolean", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveInputBoolean", "json", req, runtime), new PrimitiveInputBooleanResponse());
    }

    public VoidOutputResponse voidOutput(VoidOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.voidOutputWithOptions(request, headers, runtime);
    }

    public VoidOutputResponse voidOutputWithOptions(VoidOutputRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VoidOutputShrinkRequest request = new VoidOutputShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("VoidOutput", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/VoidOutput", "json", req, runtime), new VoidOutputResponse());
    }

    public PrimitiveOutputIntegerResponse primitiveOutputInteger(PrimitiveOutputIntegerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveOutputIntegerWithOptions(request, headers, runtime);
    }

    public PrimitiveOutputIntegerResponse primitiveOutputIntegerWithOptions(PrimitiveOutputIntegerRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PrimitiveOutputIntegerShrinkRequest request = new PrimitiveOutputIntegerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveOutputInteger", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveOutputInteger", "int32", req, runtime), new PrimitiveOutputIntegerResponse());
    }

    public PrimitiveOutputBooleanResponse primitiveOutputBoolean(PrimitiveOutputBooleanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveOutputBooleanWithOptions(request, headers, runtime);
    }

    public PrimitiveOutputBooleanResponse primitiveOutputBooleanWithOptions(PrimitiveOutputBooleanRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PrimitiveOutputBooleanShrinkRequest request = new PrimitiveOutputBooleanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveOutputBoolean", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveOutputBoolean", "boolean", req, runtime), new PrimitiveOutputBooleanResponse());
    }

    public PrimitiveInputStringResponse primitiveInputString(PrimitiveInputStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.primitiveInputStringWithOptions(request, headers, runtime);
    }

    public PrimitiveInputStringResponse primitiveInputStringWithOptions(PrimitiveInputStringRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("input", request.input);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PrimitiveInputString", "2021-08-03_11-25-46-244", "HTTPS", "POST", "AK", "/verification/PrimitiveInputString", "json", req, runtime), new PrimitiveInputStringResponse());
    }
}
