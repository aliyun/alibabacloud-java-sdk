// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118;

import com.aliyun.tea.*;
import com.aliyun.address_purification20191118.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("address-purification", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CorrectAddressResponse correctAddressWithOptions(CorrectAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CorrectAddress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CorrectAddressResponse());
    }

    public CorrectAddressResponse correctAddress(CorrectAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.correctAddressWithOptions(request, runtime);
    }

    public ExtractAddressResponse extractAddressWithOptions(ExtractAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtractAddress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtractAddressResponse());
    }

    public ExtractAddressResponse extractAddress(ExtractAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractAddressWithOptions(request, runtime);
    }

    public ExtractNameResponse extractNameWithOptions(ExtractNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtractName"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtractNameResponse());
    }

    public ExtractNameResponse extractName(ExtractNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractNameWithOptions(request, runtime);
    }

    public ExtractPhoneResponse extractPhoneWithOptions(ExtractPhoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtractPhone"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtractPhoneResponse());
    }

    public ExtractPhoneResponse extractPhone(ExtractPhoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.extractPhoneWithOptions(request, runtime);
    }

    public GetAddressDivisionCodeResponse getAddressDivisionCodeWithOptions(GetAddressDivisionCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddressDivisionCode"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddressDivisionCodeResponse());
    }

    public GetAddressDivisionCodeResponse getAddressDivisionCode(GetAddressDivisionCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAddressDivisionCodeWithOptions(request, runtime);
    }

    public GetAddressSimilarityResponse getAddressSimilarityWithOptions(GetAddressSimilarityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddressSimilarity"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddressSimilarityResponse());
    }

    public GetAddressSimilarityResponse getAddressSimilarity(GetAddressSimilarityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAddressSimilarityWithOptions(request, runtime);
    }

    public GetZipcodeResponse getZipcodeWithOptions(GetZipcodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetZipcode"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetZipcodeResponse());
    }

    public GetZipcodeResponse getZipcode(GetZipcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getZipcodeWithOptions(request, runtime);
    }

    public StructureAddressResponse structureAddressWithOptions(StructureAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCity)) {
            body.put("DefaultCity", request.defaultCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDistrict)) {
            body.put("DefaultDistrict", request.defaultDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultProvince)) {
            body.put("DefaultProvince", request.defaultProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StructureAddress"),
            new TeaPair("version", "2019-11-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StructureAddressResponse());
    }

    public StructureAddressResponse structureAddress(StructureAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.structureAddressWithOptions(request, runtime);
    }
}
