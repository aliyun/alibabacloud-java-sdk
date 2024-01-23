// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629;

import com.aliyun.tea.*;
import com.aliyun.alinlp20200629.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alinlp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ADClockResponse aDClockWithOptions(ADClockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ADClock"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ADClockResponse());
    }

    public ADClockResponse aDClock(ADClockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDClockWithOptions(request, runtime);
    }

    public ADMMUResponse aDMMUWithOptions(ADMMURequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ADMMU"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ADMMUResponse());
    }

    public ADMMUResponse aDMMU(ADMMURequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMMUWithOptions(request, runtime);
    }

    public ADMiniCogResponse aDMiniCogWithOptions(ADMiniCogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ADMiniCog"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ADMiniCogResponse());
    }

    public ADMiniCogResponse aDMiniCog(ADMiniCogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMiniCogWithOptions(request, runtime);
    }

    public ADMiniCogResultResponse aDMiniCogResultWithOptions(ADMiniCogResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ADMiniCogResult"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ADMiniCogResultResponse());
    }

    public ADMiniCogResultResponse aDMiniCogResult(ADMiniCogResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMiniCogResultWithOptions(request, runtime);
    }

    public DeleteServiceDataByConditionsResponse deleteServiceDataByConditionsWithOptions(DeleteServiceDataByConditionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteServiceDataByConditionsShrinkRequest request = new DeleteServiceDataByConditionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            body.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceDataByConditions"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceDataByConditionsResponse());
    }

    public DeleteServiceDataByConditionsResponse deleteServiceDataByConditions(DeleteServiceDataByConditionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceDataByConditionsWithOptions(request, runtime);
    }

    public DeleteServiceDataByIdsResponse deleteServiceDataByIdsWithOptions(DeleteServiceDataByIdsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteServiceDataByIdsShrinkRequest request = new DeleteServiceDataByIdsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceDataByIds"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceDataByIdsResponse());
    }

    public DeleteServiceDataByIdsResponse deleteServiceDataByIds(DeleteServiceDataByIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceDataByIdsWithOptions(request, runtime);
    }

    public GetBrandChEcomResponse getBrandChEcomWithOptions(GetBrandChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBrandChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBrandChEcomResponse());
    }

    public GetBrandChEcomResponse getBrandChEcom(GetBrandChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBrandChEcomWithOptions(request, runtime);
    }

    public GetCateChEcomResponse getCateChEcomWithOptions(GetCateChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCateChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCateChEcomResponse());
    }

    public GetCateChEcomResponse getCateChEcom(GetCateChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCateChEcomWithOptions(request, runtime);
    }

    public GetCheckDuplicationChMedicalResponse getCheckDuplicationChMedicalWithOptions(GetCheckDuplicationChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originQ)) {
            body.put("OriginQ", request.originQ);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originT)) {
            body.put("OriginT", request.originT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCheckDuplicationChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCheckDuplicationChMedicalResponse());
    }

    public GetCheckDuplicationChMedicalResponse getCheckDuplicationChMedical(GetCheckDuplicationChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCheckDuplicationChMedicalWithOptions(request, runtime);
    }

    public GetDiagnosisChMedicalResponse getDiagnosisChMedicalWithOptions(GetDiagnosisChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnosisChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosisChMedicalResponse());
    }

    public GetDiagnosisChMedicalResponse getDiagnosisChMedical(GetDiagnosisChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiagnosisChMedicalWithOptions(request, runtime);
    }

    public GetDpChEcomResponse getDpChEcomWithOptions(GetDpChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDpChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDpChEcomResponse());
    }

    public GetDpChEcomResponse getDpChEcom(GetDpChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChEcomWithOptions(request, runtime);
    }

    public GetDpChGeneralCTBResponse getDpChGeneralCTBWithOptions(GetDpChGeneralCTBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDpChGeneralCTB"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDpChGeneralCTBResponse());
    }

    public GetDpChGeneralCTBResponse getDpChGeneralCTB(GetDpChGeneralCTBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChGeneralCTBWithOptions(request, runtime);
    }

    public GetDpChGeneralStanfordResponse getDpChGeneralStanfordWithOptions(GetDpChGeneralStanfordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDpChGeneralStanford"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDpChGeneralStanfordResponse());
    }

    public GetDpChGeneralStanfordResponse getDpChGeneralStanford(GetDpChGeneralStanfordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChGeneralStanfordWithOptions(request, runtime);
    }

    public GetEcChGeneralResponse getEcChGeneralWithOptions(GetEcChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEcChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEcChGeneralResponse());
    }

    public GetEcChGeneralResponse getEcChGeneral(GetEcChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEcChGeneralWithOptions(request, runtime);
    }

    public GetEcEnGeneralResponse getEcEnGeneralWithOptions(GetEcEnGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEcEnGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEcEnGeneralResponse());
    }

    public GetEcEnGeneralResponse getEcEnGeneral(GetEcEnGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEcEnGeneralWithOptions(request, runtime);
    }

    public GetEmbeddingResponse getEmbeddingWithOptions(GetEmbeddingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textType)) {
            body.put("TextType", request.textType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmbedding"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmbeddingResponse());
    }

    public GetEmbeddingResponse getEmbedding(GetEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEmbeddingWithOptions(request, runtime);
    }

    public GetItemPubChEcomResponse getItemPubChEcomWithOptions(GetItemPubChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetItemPubChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetItemPubChEcomResponse());
    }

    public GetItemPubChEcomResponse getItemPubChEcom(GetItemPubChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getItemPubChEcomWithOptions(request, runtime);
    }

    public GetKeywordChEcomResponse getKeywordChEcomWithOptions(GetKeywordChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiVersion)) {
            body.put("ApiVersion", request.apiVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeywordChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeywordChEcomResponse());
    }

    public GetKeywordChEcomResponse getKeywordChEcom(GetKeywordChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordChEcomWithOptions(request, runtime);
    }

    public GetKeywordEnEcomResponse getKeywordEnEcomWithOptions(GetKeywordEnEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeywordEnEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeywordEnEcomResponse());
    }

    public GetKeywordEnEcomResponse getKeywordEnEcom(GetKeywordEnEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordEnEcomWithOptions(request, runtime);
    }

    public GetMedicineChMedicalResponse getMedicineChMedicalWithOptions(GetMedicineChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factory)) {
            body.put("Factory", request.factory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            body.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unit)) {
            body.put("Unit", request.unit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMedicineChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMedicineChMedicalResponse());
    }

    public GetMedicineChMedicalResponse getMedicineChMedical(GetMedicineChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMedicineChMedicalWithOptions(request, runtime);
    }

    public GetNerChEcomResponse getNerChEcomWithOptions(GetNerChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lexerId)) {
            body.put("LexerId", request.lexerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNerChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNerChEcomResponse());
    }

    public GetNerChEcomResponse getNerChEcom(GetNerChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerChEcomWithOptions(request, runtime);
    }

    public GetNerChMedicalResponse getNerChMedicalWithOptions(GetNerChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNerChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNerChMedicalResponse());
    }

    public GetNerChMedicalResponse getNerChMedical(GetNerChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerChMedicalWithOptions(request, runtime);
    }

    public GetNerCustomizedChEcomResponse getNerCustomizedChEcomWithOptions(GetNerCustomizedChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lexerId)) {
            body.put("LexerId", request.lexerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNerCustomizedChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNerCustomizedChEcomResponse());
    }

    public GetNerCustomizedChEcomResponse getNerCustomizedChEcom(GetNerCustomizedChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerCustomizedChEcomWithOptions(request, runtime);
    }

    public GetNerCustomizedSeaEcomResponse getNerCustomizedSeaEcomWithOptions(GetNerCustomizedSeaEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNerCustomizedSeaEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNerCustomizedSeaEcomResponse());
    }

    public GetNerCustomizedSeaEcomResponse getNerCustomizedSeaEcom(GetNerCustomizedSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerCustomizedSeaEcomWithOptions(request, runtime);
    }

    public GetOpenNLUResponse getOpenNLUWithOptions(GetOpenNLURequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.examples)) {
            body.put("Examples", request.examples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sentence)) {
            body.put("Sentence", request.sentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("Task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenNLU"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenNLUResponse());
    }

    public GetOpenNLUResponse getOpenNLU(GetOpenNLURequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenNLUWithOptions(request, runtime);
    }

    public GetOpenNLUHighRecallResponse getOpenNLUHighRecallWithOptions(GetOpenNLUHighRecallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.examples)) {
            body.put("Examples", request.examples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sentence)) {
            body.put("Sentence", request.sentence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("Task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenNLUHighRecall"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenNLUHighRecallResponse());
    }

    public GetOpenNLUHighRecallResponse getOpenNLUHighRecall(GetOpenNLUHighRecallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenNLUHighRecallWithOptions(request, runtime);
    }

    public GetOperationChMedicalResponse getOperationChMedicalWithOptions(GetOperationChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperationChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationChMedicalResponse());
    }

    public GetOperationChMedicalResponse getOperationChMedical(GetOperationChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationChMedicalWithOptions(request, runtime);
    }

    public GetPosChEcomResponse getPosChEcomWithOptions(GetPosChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPosChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPosChEcomResponse());
    }

    public GetPosChEcomResponse getPosChEcom(GetPosChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPosChEcomWithOptions(request, runtime);
    }

    public GetPosChGeneralResponse getPosChGeneralWithOptions(GetPosChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPosChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPosChGeneralResponse());
    }

    public GetPosChGeneralResponse getPosChGeneral(GetPosChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPosChGeneralWithOptions(request, runtime);
    }

    public GetPriceChEcomResponse getPriceChEcomWithOptions(GetPriceChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPriceChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPriceChEcomResponse());
    }

    public GetPriceChEcomResponse getPriceChEcom(GetPriceChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPriceChEcomWithOptions(request, runtime);
    }

    public GetSSETestResponse getSSETestWithOptions(GetSSETestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSSETest"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSSETestResponse());
    }

    public GetSSETestResponse getSSETest(GetSSETestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSSETestWithOptions(request, runtime);
    }

    public GetSaChGeneralResponse getSaChGeneralWithOptions(GetSaChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSaChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSaChGeneralResponse());
    }

    public GetSaChGeneralResponse getSaChGeneral(GetSaChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSaChGeneralWithOptions(request, runtime);
    }

    public GetSaSeaEcomResponse getSaSeaEcomWithOptions(GetSaSeaEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSaSeaEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSaSeaEcomResponse());
    }

    public GetSaSeaEcomResponse getSaSeaEcom(GetSaSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSaSeaEcomWithOptions(request, runtime);
    }

    public GetServiceDataImportStatusResponse getServiceDataImportStatusWithOptions(GetServiceDataImportStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetServiceDataImportStatusShrinkRequest request = new GetServiceDataImportStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataImportIds)) {
            request.dataImportIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataImportIds, "DataImportIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataImportIdsShrink)) {
            body.put("DataImportIds", request.dataImportIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceDataImportStatus"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceDataImportStatusResponse());
    }

    public GetServiceDataImportStatusResponse getServiceDataImportStatus(GetServiceDataImportStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceDataImportStatusWithOptions(request, runtime);
    }

    public GetSimilarityChMedicalResponse getSimilarityChMedicalWithOptions(GetSimilarityChMedicalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originQ)) {
            body.put("OriginQ", request.originQ);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originT)) {
            body.put("OriginT", request.originT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSimilarityChMedical"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSimilarityChMedicalResponse());
    }

    public GetSimilarityChMedicalResponse getSimilarityChMedical(GetSimilarityChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSimilarityChMedicalWithOptions(request, runtime);
    }

    public GetSummaryChEcomResponse getSummaryChEcomWithOptions(GetSummaryChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSummaryChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSummaryChEcomResponse());
    }

    public GetSummaryChEcomResponse getSummaryChEcom(GetSummaryChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSummaryChEcomWithOptions(request, runtime);
    }

    public GetTableQAServiceInfoByIdResponse getTableQAServiceInfoByIdWithOptions(GetTableQAServiceInfoByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableQAServiceInfoById"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableQAServiceInfoByIdResponse());
    }

    public GetTableQAServiceInfoByIdResponse getTableQAServiceInfoById(GetTableQAServiceInfoByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableQAServiceInfoByIdWithOptions(request, runtime);
    }

    public GetTcChEcomResponse getTcChEcomWithOptions(GetTcChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTcChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTcChEcomResponse());
    }

    public GetTcChEcomResponse getTcChEcom(GetTcChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTcChEcomWithOptions(request, runtime);
    }

    public GetTcChGeneralResponse getTcChGeneralWithOptions(GetTcChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTcChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTcChGeneralResponse());
    }

    public GetTcChGeneralResponse getTcChGeneral(GetTcChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTcChGeneralWithOptions(request, runtime);
    }

    public GetTsChEcomResponse getTsChEcomWithOptions(GetTsChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originQ)) {
            body.put("OriginQ", request.originQ);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originT)) {
            body.put("OriginT", request.originT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTsChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTsChEcomResponse());
    }

    public GetTsChEcomResponse getTsChEcom(GetTsChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTsChEcomWithOptions(request, runtime);
    }

    public GetUserUploadSignResponse getUserUploadSignWithOptions(GetUserUploadSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserUploadSign"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserUploadSignResponse());
    }

    public GetUserUploadSignResponse getUserUploadSign(GetUserUploadSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserUploadSignWithOptions(request, runtime);
    }

    public GetWeChCommentResponse getWeChCommentWithOptions(GetWeChCommentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWeChComment"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeChCommentResponse());
    }

    public GetWeChCommentResponse getWeChComment(GetWeChCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChCommentWithOptions(request, runtime);
    }

    public GetWeChEcomResponse getWeChEcomWithOptions(GetWeChEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWeChEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeChEcomResponse());
    }

    public GetWeChEcomResponse getWeChEcom(GetWeChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChEcomWithOptions(request, runtime);
    }

    public GetWeChEntertainmentResponse getWeChEntertainmentWithOptions(GetWeChEntertainmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWeChEntertainment"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeChEntertainmentResponse());
    }

    public GetWeChEntertainmentResponse getWeChEntertainment(GetWeChEntertainmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChEntertainmentWithOptions(request, runtime);
    }

    public GetWeChGeneralResponse getWeChGeneralWithOptions(GetWeChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWeChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeChGeneralResponse());
    }

    public GetWeChGeneralResponse getWeChGeneral(GetWeChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChGeneralWithOptions(request, runtime);
    }

    public GetWeChSearchResponse getWeChSearchWithOptions(GetWeChSearchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWeChSearch"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeChSearchResponse());
    }

    public GetWeChSearchResponse getWeChSearch(GetWeChSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChSearchWithOptions(request, runtime);
    }

    public GetWsChGeneralResponse getWsChGeneralWithOptions(GetWsChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsChGeneralResponse());
    }

    public GetWsChGeneralResponse getWsChGeneral(GetWsChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsChGeneralWithOptions(request, runtime);
    }

    public GetWsCustomizedChEcomCommentResponse getWsCustomizedChEcomCommentWithOptions(GetWsCustomizedChEcomCommentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChEcomComment"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChEcomCommentResponse());
    }

    public GetWsCustomizedChEcomCommentResponse getWsCustomizedChEcomComment(GetWsCustomizedChEcomCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomCommentWithOptions(request, runtime);
    }

    public GetWsCustomizedChEcomContentResponse getWsCustomizedChEcomContentWithOptions(GetWsCustomizedChEcomContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChEcomContent"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChEcomContentResponse());
    }

    public GetWsCustomizedChEcomContentResponse getWsCustomizedChEcomContent(GetWsCustomizedChEcomContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomContentWithOptions(request, runtime);
    }

    public GetWsCustomizedChEcomTitleResponse getWsCustomizedChEcomTitleWithOptions(GetWsCustomizedChEcomTitleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChEcomTitle"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChEcomTitleResponse());
    }

    public GetWsCustomizedChEcomTitleResponse getWsCustomizedChEcomTitle(GetWsCustomizedChEcomTitleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomTitleWithOptions(request, runtime);
    }

    public GetWsCustomizedChEntertainmentResponse getWsCustomizedChEntertainmentWithOptions(GetWsCustomizedChEntertainmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChEntertainment"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChEntertainmentResponse());
    }

    public GetWsCustomizedChEntertainmentResponse getWsCustomizedChEntertainment(GetWsCustomizedChEntertainmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEntertainmentWithOptions(request, runtime);
    }

    public GetWsCustomizedChGeneralResponse getWsCustomizedChGeneralWithOptions(GetWsCustomizedChGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChGeneralResponse());
    }

    public GetWsCustomizedChGeneralResponse getWsCustomizedChGeneral(GetWsCustomizedChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChGeneralWithOptions(request, runtime);
    }

    public GetWsCustomizedChO2OResponse getWsCustomizedChO2OWithOptions(GetWsCustomizedChO2ORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outType)) {
            body.put("OutType", request.outType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenizerId)) {
            body.put("TokenizerId", request.tokenizerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedChO2O"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedChO2OResponse());
    }

    public GetWsCustomizedChO2OResponse getWsCustomizedChO2O(GetWsCustomizedChO2ORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChO2OWithOptions(request, runtime);
    }

    public GetWsCustomizedSeaEcomResponse getWsCustomizedSeaEcomWithOptions(GetWsCustomizedSeaEcomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedSeaEcom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedSeaEcomResponse());
    }

    public GetWsCustomizedSeaEcomResponse getWsCustomizedSeaEcom(GetWsCustomizedSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedSeaEcomWithOptions(request, runtime);
    }

    public GetWsCustomizedSeaGeneralResponse getWsCustomizedSeaGeneralWithOptions(GetWsCustomizedSeaGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWsCustomizedSeaGeneral"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWsCustomizedSeaGeneralResponse());
    }

    public GetWsCustomizedSeaGeneralResponse getWsCustomizedSeaGeneral(GetWsCustomizedSeaGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedSeaGeneralWithOptions(request, runtime);
    }

    public ImportServiceDataResponse importServiceDataWithOptions(ImportServiceDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportServiceDataShrinkRequest request = new ImportServiceDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partition)) {
            request.partitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partition, "Partition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partitionShrink)) {
            body.put("Partition", request.partitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPath)) {
            body.put("SubPath", request.subPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportServiceData"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportServiceDataResponse());
    }

    public ImportServiceDataResponse importServiceData(ImportServiceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importServiceDataWithOptions(request, runtime);
    }

    public InsertCustomResponse insertCustomWithOptions(InsertCustomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFileName)) {
            body.put("CustomFileName", request.customFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUrl)) {
            body.put("CustomUrl", request.customUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regFileName)) {
            body.put("RegFileName", request.regFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regUrl)) {
            body.put("RegUrl", request.regUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertCustom"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertCustomResponse());
    }

    public InsertCustomResponse insertCustom(InsertCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertCustomWithOptions(request, runtime);
    }

    public OpenAlinlpServiceResponse openAlinlpServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenAlinlpService"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAlinlpServiceResponse());
    }

    public OpenAlinlpServiceResponse openAlinlpService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAlinlpServiceWithOptions(runtime);
    }

    public PostMSConvSearchTokenGeneratedResponse postMSConvSearchTokenGeneratedWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostMSConvSearchTokenGenerated"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostMSConvSearchTokenGeneratedResponse());
    }

    public PostMSConvSearchTokenGeneratedResponse postMSConvSearchTokenGenerated() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSConvSearchTokenGeneratedWithOptions(runtime);
    }

    public PostMSDataProcessingCountResponse postMSDataProcessingCountWithOptions(PostMSDataProcessingCountRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PostMSDataProcessingCountShrinkRequest request = new PostMSDataProcessingCountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataIds)) {
            request.dataIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataIds, "DataIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIdsShrink)) {
            body.put("DataIds", request.dataIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataImportId)) {
            body.put("DataImportId", request.dataImportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostMSDataProcessingCount"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostMSDataProcessingCountResponse());
    }

    public PostMSDataProcessingCountResponse postMSDataProcessingCount(PostMSDataProcessingCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSDataProcessingCountWithOptions(request, runtime);
    }

    public PostMSSearchEnhanceResponse postMSSearchEnhanceWithOptions(PostMSSearchEnhanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PostMSSearchEnhanceShrinkRequest request = new PostMSSearchEnhanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customConfigInfo)) {
            request.customConfigInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customConfigInfo, "CustomConfigInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fields)) {
            request.fieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fields, "Fields", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rankModelInfo)) {
            request.rankModelInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rankModelInfo, "RankModelInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("Body", request.body);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customConfigInfoShrink)) {
            body.put("CustomConfigInfo", request.customConfigInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debug)) {
            body.put("Debug", request.debug);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldsShrink)) {
            body.put("Fields", request.fieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queries)) {
            body.put("Queries", request.queries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rankModelInfoShrink)) {
            body.put("RankModelInfo", request.rankModelInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rows)) {
            body.put("Rows", request.rows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uq)) {
            body.put("Uq", request.uq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostMSSearchEnhance"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostMSSearchEnhanceResponse());
    }

    public PostMSSearchEnhanceResponse postMSSearchEnhance(PostMSSearchEnhanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSSearchEnhanceWithOptions(request, runtime);
    }

    public RequestTableQAResponse requestTableQAWithOptions(RequestTableQARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestTableQA"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestTableQAResponse());
    }

    public RequestTableQAResponse requestTableQA(RequestTableQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestTableQAWithOptions(request, runtime);
    }

    public RequestTableQAOnlineResponse requestTableQAOnlineWithOptions(RequestTableQAOnlineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            body.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("Question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestTableQAOnline"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestTableQAOnlineResponse());
    }

    public RequestTableQAOnlineResponse requestTableQAOnline(RequestTableQAOnlineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestTableQAOnlineWithOptions(request, runtime);
    }

    public UpdateServiceDataResponse updateServiceDataWithOptions(UpdateServiceDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateServiceDataShrinkRequest request = new UpdateServiceDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            body.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceData"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceDataResponse());
    }

    public UpdateServiceDataResponse updateServiceData(UpdateServiceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceDataWithOptions(request, runtime);
    }
}
