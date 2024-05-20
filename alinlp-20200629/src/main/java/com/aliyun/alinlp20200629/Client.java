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

    /**
     * @summary ad画钟算法处理算法
     *
     * @param request ADClockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ADClockResponse
     */
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

    /**
     * @summary ad画钟算法处理算法
     *
     * @param request ADClockRequest
     * @return ADClockResponse
     */
    public ADClockResponse aDClock(ADClockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDClockWithOptions(request, runtime);
    }

    /**
     * @summary ad语音处理算法
     *
     * @param request ADMMURequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ADMMUResponse
     */
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

    /**
     * @summary ad语音处理算法
     *
     * @param request ADMMURequest
     * @return ADMMUResponse
     */
    public ADMMUResponse aDMMU(ADMMURequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMMUWithOptions(request, runtime);
    }

    /**
     * @summary AD筛查能力，处理用户传入的答题音频和画钟图片从而计算风险结果
     *
     * @param request ADMiniCogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ADMiniCogResponse
     */
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

    /**
     * @summary AD筛查能力，处理用户传入的答题音频和画钟图片从而计算风险结果
     *
     * @param request ADMiniCogRequest
     * @return ADMiniCogResponse
     */
    public ADMiniCogResponse aDMiniCog(ADMiniCogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMiniCogWithOptions(request, runtime);
    }

    /**
     * @summary AD筛查能力,提供给用户查询筛查结果，筛查结果来源自接口ADMIniCog
     *
     * @param request ADMiniCogResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ADMiniCogResultResponse
     */
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

    /**
     * @summary AD筛查能力,提供给用户查询筛查结果，筛查结果来源自接口ADMIniCog
     *
     * @param request ADMiniCogResultRequest
     * @return ADMiniCogResultResponse
     */
    public ADMiniCogResultResponse aDMiniCogResult(ADMiniCogResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aDMiniCogResultWithOptions(request, runtime);
    }

    /**
     * @summary 根据条件删除服务数据
     *
     * @param tmpReq DeleteServiceDataByConditionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceDataByConditionsResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.xDashScopeOpenAPISource)) {
            body.put("X-DashScope-OpenAPISource", request.xDashScopeOpenAPISource);
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

    /**
     * @summary 根据条件删除服务数据
     *
     * @param request DeleteServiceDataByConditionsRequest
     * @return DeleteServiceDataByConditionsResponse
     */
    public DeleteServiceDataByConditionsResponse deleteServiceDataByConditions(DeleteServiceDataByConditionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceDataByConditionsWithOptions(request, runtime);
    }

    /**
     * @summary 根据ids删除服务数据
     *
     * @param tmpReq DeleteServiceDataByIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceDataByIdsResponse
     */
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

    /**
     * @summary 根据ids删除服务数据
     *
     * @param request DeleteServiceDataByIdsRequest
     * @return DeleteServiceDataByIdsResponse
     */
    public DeleteServiceDataByIdsResponse deleteServiceDataByIds(DeleteServiceDataByIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceDataByIdsWithOptions(request, runtime);
    }

    /**
     * @summary 品牌预测
     *
     * @param request GetBrandChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBrandChEcomResponse
     */
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

    /**
     * @summary 品牌预测
     *
     * @param request GetBrandChEcomRequest
     * @return GetBrandChEcomResponse
     */
    public GetBrandChEcomResponse getBrandChEcom(GetBrandChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBrandChEcomWithOptions(request, runtime);
    }

    /**
     * @summary 类目预测
     *
     * @param request GetCateChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCateChEcomResponse
     */
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

    /**
     * @summary 类目预测
     *
     * @param request GetCateChEcomRequest
     * @return GetCateChEcomResponse
     */
    public GetCateChEcomResponse getCateChEcom(GetCateChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCateChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetCheckDuplicationChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCheckDuplicationChMedicalResponse
     */
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

    /**
     * @param request GetCheckDuplicationChMedicalRequest
     * @return GetCheckDuplicationChMedicalResponse
     */
    public GetCheckDuplicationChMedicalResponse getCheckDuplicationChMedical(GetCheckDuplicationChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCheckDuplicationChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetDiagnosisChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnosisChMedicalResponse
     */
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

    /**
     * @param request GetDiagnosisChMedicalRequest
     * @return GetDiagnosisChMedicalResponse
     */
    public GetDiagnosisChMedicalResponse getDiagnosisChMedical(GetDiagnosisChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiagnosisChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetDpChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDpChEcomResponse
     */
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

    /**
     * @param request GetDpChEcomRequest
     * @return GetDpChEcomResponse
     */
    public GetDpChEcomResponse getDpChEcom(GetDpChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetDpChGeneralCTBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDpChGeneralCTBResponse
     */
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

    /**
     * @param request GetDpChGeneralCTBRequest
     * @return GetDpChGeneralCTBResponse
     */
    public GetDpChGeneralCTBResponse getDpChGeneralCTB(GetDpChGeneralCTBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChGeneralCTBWithOptions(request, runtime);
    }

    /**
     * @param request GetDpChGeneralStanfordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDpChGeneralStanfordResponse
     */
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

    /**
     * @param request GetDpChGeneralStanfordRequest
     * @return GetDpChGeneralStanfordResponse
     */
    public GetDpChGeneralStanfordResponse getDpChGeneralStanford(GetDpChGeneralStanfordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDpChGeneralStanfordWithOptions(request, runtime);
    }

    /**
     * @param request GetEcChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEcChGeneralResponse
     */
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

    /**
     * @param request GetEcChGeneralRequest
     * @return GetEcChGeneralResponse
     */
    public GetEcChGeneralResponse getEcChGeneral(GetEcChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEcChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetEcEnGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEcEnGeneralResponse
     */
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

    /**
     * @param request GetEcEnGeneralRequest
     * @return GetEcEnGeneralResponse
     */
    public GetEcEnGeneralResponse getEcEnGeneral(GetEcEnGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEcEnGeneralWithOptions(request, runtime);
    }

    /**
     * @summary embedding
     *
     * @param request GetEmbeddingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmbeddingResponse
     */
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

    /**
     * @summary embedding
     *
     * @param request GetEmbeddingRequest
     * @return GetEmbeddingResponse
     */
    public GetEmbeddingResponse getEmbedding(GetEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEmbeddingWithOptions(request, runtime);
    }

    /**
     * @summary 微购整合接口
     *
     * @param request GetItemPubChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetItemPubChEcomResponse
     */
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

    /**
     * @summary 微购整合接口
     *
     * @param request GetItemPubChEcomRequest
     * @return GetItemPubChEcomResponse
     */
    public GetItemPubChEcomResponse getItemPubChEcom(GetItemPubChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getItemPubChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetKeywordChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKeywordChEcomResponse
     */
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

    /**
     * @param request GetKeywordChEcomRequest
     * @return GetKeywordChEcomResponse
     */
    public GetKeywordChEcomResponse getKeywordChEcom(GetKeywordChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetKeywordEnEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKeywordEnEcomResponse
     */
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

    /**
     * @param request GetKeywordEnEcomRequest
     * @return GetKeywordEnEcomResponse
     */
    public GetKeywordEnEcomResponse getKeywordEnEcom(GetKeywordEnEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordEnEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetMedicineChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMedicineChMedicalResponse
     */
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

    /**
     * @param request GetMedicineChMedicalRequest
     * @return GetMedicineChMedicalResponse
     */
    public GetMedicineChMedicalResponse getMedicineChMedical(GetMedicineChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMedicineChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetNerChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNerChEcomResponse
     */
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

    /**
     * @param request GetNerChEcomRequest
     * @return GetNerChEcomResponse
     */
    public GetNerChEcomResponse getNerChEcom(GetNerChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetNerChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNerChMedicalResponse
     */
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

    /**
     * @param request GetNerChMedicalRequest
     * @return GetNerChMedicalResponse
     */
    public GetNerChMedicalResponse getNerChMedical(GetNerChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetNerCustomizedChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNerCustomizedChEcomResponse
     */
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

    /**
     * @param request GetNerCustomizedChEcomRequest
     * @return GetNerCustomizedChEcomResponse
     */
    public GetNerCustomizedChEcomResponse getNerCustomizedChEcom(GetNerCustomizedChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerCustomizedChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetNerCustomizedSeaEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNerCustomizedSeaEcomResponse
     */
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

    /**
     * @param request GetNerCustomizedSeaEcomRequest
     * @return GetNerCustomizedSeaEcomResponse
     */
    public GetNerCustomizedSeaEcomResponse getNerCustomizedSeaEcom(GetNerCustomizedSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNerCustomizedSeaEcomWithOptions(request, runtime);
    }

    /**
     * @summary openNLU
     *
     * @param request GetOpenNLURequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenNLUResponse
     */
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

    /**
     * @summary openNLU
     *
     * @param request GetOpenNLURequest
     * @return GetOpenNLUResponse
     */
    public GetOpenNLUResponse getOpenNLU(GetOpenNLURequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenNLUWithOptions(request, runtime);
    }

    /**
     * @summary openNLU高召回版
     *
     * @param request GetOpenNLUHighRecallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenNLUHighRecallResponse
     */
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

    /**
     * @summary openNLU高召回版
     *
     * @param request GetOpenNLUHighRecallRequest
     * @return GetOpenNLUHighRecallResponse
     */
    public GetOpenNLUHighRecallResponse getOpenNLUHighRecall(GetOpenNLUHighRecallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenNLUHighRecallWithOptions(request, runtime);
    }

    /**
     * @param request GetOperationChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOperationChMedicalResponse
     */
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

    /**
     * @param request GetOperationChMedicalRequest
     * @return GetOperationChMedicalResponse
     */
    public GetOperationChMedicalResponse getOperationChMedical(GetOperationChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetPosChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPosChEcomResponse
     */
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

    /**
     * @param request GetPosChEcomRequest
     * @return GetPosChEcomResponse
     */
    public GetPosChEcomResponse getPosChEcom(GetPosChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPosChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetPosChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPosChGeneralResponse
     */
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

    /**
     * @param request GetPosChGeneralRequest
     * @return GetPosChGeneralResponse
     */
    public GetPosChGeneralResponse getPosChGeneral(GetPosChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPosChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetPriceChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPriceChEcomResponse
     */
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

    /**
     * @param request GetPriceChEcomRequest
     * @return GetPriceChEcomResponse
     */
    public GetPriceChEcomResponse getPriceChEcom(GetPriceChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPriceChEcomWithOptions(request, runtime);
    }

    /**
     * @summary 测试sse
     *
     * @param request GetSSETestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSSETestResponse
     */
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

    /**
     * @summary 测试sse
     *
     * @param request GetSSETestRequest
     * @return GetSSETestResponse
     */
    public GetSSETestResponse getSSETest(GetSSETestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSSETestWithOptions(request, runtime);
    }

    /**
     * @param request GetSaChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSaChGeneralResponse
     */
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

    /**
     * @param request GetSaChGeneralRequest
     * @return GetSaChGeneralResponse
     */
    public GetSaChGeneralResponse getSaChGeneral(GetSaChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSaChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetSaSeaEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSaSeaEcomResponse
     */
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

    /**
     * @param request GetSaSeaEcomRequest
     * @return GetSaSeaEcomResponse
     */
    public GetSaSeaEcomResponse getSaSeaEcom(GetSaSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSaSeaEcomWithOptions(request, runtime);
    }

    /**
     * @summary 获取服务数据导入状态
     *
     * @param tmpReq GetServiceDataImportStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceDataImportStatusResponse
     */
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

    /**
     * @summary 获取服务数据导入状态
     *
     * @param request GetServiceDataImportStatusRequest
     * @return GetServiceDataImportStatusResponse
     */
    public GetServiceDataImportStatusResponse getServiceDataImportStatus(GetServiceDataImportStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceDataImportStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetSimilarityChMedicalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSimilarityChMedicalResponse
     */
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

    /**
     * @param request GetSimilarityChMedicalRequest
     * @return GetSimilarityChMedicalResponse
     */
    public GetSimilarityChMedicalResponse getSimilarityChMedical(GetSimilarityChMedicalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSimilarityChMedicalWithOptions(request, runtime);
    }

    /**
     * @param request GetSummaryChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSummaryChEcomResponse
     */
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

    /**
     * @param request GetSummaryChEcomRequest
     * @return GetSummaryChEcomResponse
     */
    public GetSummaryChEcomResponse getSummaryChEcom(GetSummaryChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSummaryChEcomWithOptions(request, runtime);
    }

    /**
     * @summary 根据id查询tableqa服务基本信息
     *
     * @param request GetTableQAServiceInfoByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableQAServiceInfoByIdResponse
     */
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

    /**
     * @summary 根据id查询tableqa服务基本信息
     *
     * @param request GetTableQAServiceInfoByIdRequest
     * @return GetTableQAServiceInfoByIdResponse
     */
    public GetTableQAServiceInfoByIdResponse getTableQAServiceInfoById(GetTableQAServiceInfoByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableQAServiceInfoByIdWithOptions(request, runtime);
    }

    /**
     * @param request GetTcChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTcChEcomResponse
     */
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

    /**
     * @param request GetTcChEcomRequest
     * @return GetTcChEcomResponse
     */
    public GetTcChEcomResponse getTcChEcom(GetTcChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTcChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetTcChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTcChGeneralResponse
     */
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

    /**
     * @param request GetTcChGeneralRequest
     * @return GetTcChGeneralResponse
     */
    public GetTcChGeneralResponse getTcChGeneral(GetTcChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTcChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetTsChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTsChEcomResponse
     */
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

    /**
     * @param request GetTsChEcomRequest
     * @return GetTsChEcomResponse
     */
    public GetTsChEcomResponse getTsChEcom(GetTsChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTsChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetUserUploadSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserUploadSignResponse
     */
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

    /**
     * @param request GetUserUploadSignRequest
     * @return GetUserUploadSignResponse
     */
    public GetUserUploadSignResponse getUserUploadSign(GetUserUploadSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserUploadSignWithOptions(request, runtime);
    }

    /**
     * @param request GetWeChCommentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeChCommentResponse
     */
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

    /**
     * @param request GetWeChCommentRequest
     * @return GetWeChCommentResponse
     */
    public GetWeChCommentResponse getWeChComment(GetWeChCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChCommentWithOptions(request, runtime);
    }

    /**
     * @param request GetWeChEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeChEcomResponse
     */
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

    /**
     * @param request GetWeChEcomRequest
     * @return GetWeChEcomResponse
     */
    public GetWeChEcomResponse getWeChEcom(GetWeChEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetWeChEntertainmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeChEntertainmentResponse
     */
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

    /**
     * @param request GetWeChEntertainmentRequest
     * @return GetWeChEntertainmentResponse
     */
    public GetWeChEntertainmentResponse getWeChEntertainment(GetWeChEntertainmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChEntertainmentWithOptions(request, runtime);
    }

    /**
     * @param request GetWeChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeChGeneralResponse
     */
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

    /**
     * @param request GetWeChGeneralRequest
     * @return GetWeChGeneralResponse
     */
    public GetWeChGeneralResponse getWeChGeneral(GetWeChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetWeChSearchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeChSearchResponse
     */
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

    /**
     * @param request GetWeChSearchRequest
     * @return GetWeChSearchResponse
     */
    public GetWeChSearchResponse getWeChSearch(GetWeChSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWeChSearchWithOptions(request, runtime);
    }

    /**
     * @param request GetWsChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsChGeneralResponse
     */
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

    /**
     * @param request GetWsChGeneralRequest
     * @return GetWsChGeneralResponse
     */
    public GetWsChGeneralResponse getWsChGeneral(GetWsChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedChEcomCommentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChEcomCommentResponse
     */
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

    /**
     * @param request GetWsCustomizedChEcomCommentRequest
     * @return GetWsCustomizedChEcomCommentResponse
     */
    public GetWsCustomizedChEcomCommentResponse getWsCustomizedChEcomComment(GetWsCustomizedChEcomCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomCommentWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedChEcomContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChEcomContentResponse
     */
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

    /**
     * @param request GetWsCustomizedChEcomContentRequest
     * @return GetWsCustomizedChEcomContentResponse
     */
    public GetWsCustomizedChEcomContentResponse getWsCustomizedChEcomContent(GetWsCustomizedChEcomContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomContentWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedChEcomTitleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChEcomTitleResponse
     */
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

    /**
     * @param request GetWsCustomizedChEcomTitleRequest
     * @return GetWsCustomizedChEcomTitleResponse
     */
    public GetWsCustomizedChEcomTitleResponse getWsCustomizedChEcomTitle(GetWsCustomizedChEcomTitleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEcomTitleWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedChEntertainmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChEntertainmentResponse
     */
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

    /**
     * @param request GetWsCustomizedChEntertainmentRequest
     * @return GetWsCustomizedChEntertainmentResponse
     */
    public GetWsCustomizedChEntertainmentResponse getWsCustomizedChEntertainment(GetWsCustomizedChEntertainmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChEntertainmentWithOptions(request, runtime);
    }

    /**
     * @summary a
     *
     * @param request GetWsCustomizedChGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChGeneralResponse
     */
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

    /**
     * @summary a
     *
     * @param request GetWsCustomizedChGeneralRequest
     * @return GetWsCustomizedChGeneralResponse
     */
    public GetWsCustomizedChGeneralResponse getWsCustomizedChGeneral(GetWsCustomizedChGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChGeneralWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedChO2ORequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedChO2OResponse
     */
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

    /**
     * @param request GetWsCustomizedChO2ORequest
     * @return GetWsCustomizedChO2OResponse
     */
    public GetWsCustomizedChO2OResponse getWsCustomizedChO2O(GetWsCustomizedChO2ORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedChO2OWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedSeaEcomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedSeaEcomResponse
     */
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

    /**
     * @param request GetWsCustomizedSeaEcomRequest
     * @return GetWsCustomizedSeaEcomResponse
     */
    public GetWsCustomizedSeaEcomResponse getWsCustomizedSeaEcom(GetWsCustomizedSeaEcomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedSeaEcomWithOptions(request, runtime);
    }

    /**
     * @param request GetWsCustomizedSeaGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWsCustomizedSeaGeneralResponse
     */
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

    /**
     * @param request GetWsCustomizedSeaGeneralRequest
     * @return GetWsCustomizedSeaGeneralResponse
     */
    public GetWsCustomizedSeaGeneralResponse getWsCustomizedSeaGeneral(GetWsCustomizedSeaGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWsCustomizedSeaGeneralWithOptions(request, runtime);
    }

    /**
     * @summary 导入服务数据
     *
     * @param tmpReq ImportServiceDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportServiceDataResponse
     */
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

    /**
     * @summary 导入服务数据
     *
     * @param request ImportServiceDataRequest
     * @return ImportServiceDataResponse
     */
    public ImportServiceDataResponse importServiceData(ImportServiceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importServiceDataWithOptions(request, runtime);
    }

    /**
     * @summary 导入服务数据V2
     *
     * @param tmpReq ImportServiceDataV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportServiceDataV2Response
     */
    public ImportServiceDataV2Response importServiceDataV2WithOptions(ImportServiceDataV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportServiceDataV2ShrinkRequest request = new ImportServiceDataV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documents)) {
            request.documentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documents, "Documents", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentsShrink)) {
            body.put("Documents", request.documentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportServiceDataV2"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportServiceDataV2Response());
    }

    /**
     * @summary 导入服务数据V2
     *
     * @param request ImportServiceDataV2Request
     * @return ImportServiceDataV2Response
     */
    public ImportServiceDataV2Response importServiceDataV2(ImportServiceDataV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importServiceDataV2WithOptions(request, runtime);
    }

    /**
     * @param request InsertCustomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertCustomResponse
     */
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

    /**
     * @param request InsertCustomRequest
     * @return InsertCustomResponse
     */
    public InsertCustomResponse insertCustom(InsertCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertCustomWithOptions(request, runtime);
    }

    /**
     * @param request OpenAlinlpServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenAlinlpServiceResponse
     */
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

    /**
     * @return OpenAlinlpServiceResponse
     */
    public OpenAlinlpServiceResponse openAlinlpService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAlinlpServiceWithOptions(runtime);
    }

    /**
     * @summary 多轮改写
     *
     * @param tmpReq PostISConvRewriterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostISConvRewriterResponse
     */
    public PostISConvRewriterResponse postISConvRewriterWithOptions(PostISConvRewriterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PostISConvRewriterShrinkRequest request = new PostISConvRewriterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            body.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debug)) {
            body.put("Debug", request.debug);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            body.put("Parameters", request.parametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostISConvRewriter"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostISConvRewriterResponse());
    }

    /**
     * @summary 多轮改写
     *
     * @param request PostISConvRewriterRequest
     * @return PostISConvRewriterResponse
     */
    public PostISConvRewriterResponse postISConvRewriter(PostISConvRewriterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postISConvRewriterWithOptions(request, runtime);
    }

    /**
     * @summary 开放域搜索判定
     *
     * @param tmpReq PostISRetrieveRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostISRetrieveRouterResponse
     */
    public PostISRetrieveRouterResponse postISRetrieveRouterWithOptions(PostISRetrieveRouterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PostISRetrieveRouterShrinkRequest request = new PostISRetrieveRouterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.debug)) {
            query.put("Debug", request.debug);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            body.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostISRetrieveRouter"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostISRetrieveRouterResponse());
    }

    /**
     * @summary 开放域搜索判定
     *
     * @param request PostISRetrieveRouterRequest
     * @return PostISRetrieveRouterResponse
     */
    public PostISRetrieveRouterResponse postISRetrieveRouter(PostISRetrieveRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postISRetrieveRouterWithOptions(request, runtime);
    }

    /**
     * @summary 对话搜索身份凭证生成
     *
     * @param request PostMSConvSearchTokenGeneratedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostMSConvSearchTokenGeneratedResponse
     */
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

    /**
     * @summary 对话搜索身份凭证生成
     *
     * @return PostMSConvSearchTokenGeneratedResponse
     */
    public PostMSConvSearchTokenGeneratedResponse postMSConvSearchTokenGenerated() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSConvSearchTokenGeneratedWithOptions(runtime);
    }

    /**
     * @summary 数据处理进度查询
     *
     * @param tmpReq PostMSDataProcessingCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostMSDataProcessingCountResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.xDashScopeOpenAPISource)) {
            body.put("X-DashScope-OpenAPISource", request.xDashScopeOpenAPISource);
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

    /**
     * @summary 数据处理进度查询
     *
     * @param request PostMSDataProcessingCountRequest
     * @return PostMSDataProcessingCountResponse
     */
    public PostMSDataProcessingCountResponse postMSDataProcessingCount(PostMSDataProcessingCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSDataProcessingCountWithOptions(request, runtime);
    }

    /**
     * @summary 搜索增强
     *
     * @param tmpReq PostMSSearchEnhanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostMSSearchEnhanceResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.minScore)) {
            body.put("MinScore", request.minScore);
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

        if (!com.aliyun.teautil.Common.isUnset(request.xDashScopeOpenAPISource)) {
            body.put("X-DashScope-OpenAPISource", request.xDashScopeOpenAPISource);
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

    /**
     * @summary 搜索增强
     *
     * @param request PostMSSearchEnhanceRequest
     * @return PostMSSearchEnhanceResponse
     */
    public PostMSSearchEnhanceResponse postMSSearchEnhance(PostMSSearchEnhanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSSearchEnhanceWithOptions(request, runtime);
    }

    /**
     * @summary 导入服务数据V2
     *
     * @param tmpReq PostMSServiceDataImportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostMSServiceDataImportResponse
     */
    public PostMSServiceDataImportResponse postMSServiceDataImportWithOptions(PostMSServiceDataImportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PostMSServiceDataImportShrinkRequest request = new PostMSServiceDataImportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documents)) {
            request.documentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documents, "Documents", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentsShrink)) {
            body.put("Documents", request.documentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostMSServiceDataImport"),
            new TeaPair("version", "2020-06-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostMSServiceDataImportResponse());
    }

    /**
     * @summary 导入服务数据V2
     *
     * @param request PostMSServiceDataImportRequest
     * @return PostMSServiceDataImportResponse
     */
    public PostMSServiceDataImportResponse postMSServiceDataImport(PostMSServiceDataImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postMSServiceDataImportWithOptions(request, runtime);
    }

    /**
     * @param request RequestTableQARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestTableQAResponse
     */
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

    /**
     * @param request RequestTableQARequest
     * @return RequestTableQAResponse
     */
    public RequestTableQAResponse requestTableQA(RequestTableQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestTableQAWithOptions(request, runtime);
    }

    /**
     * @summary 表格问答在线接口
     *
     * @param request RequestTableQAOnlineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestTableQAOnlineResponse
     */
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

    /**
     * @summary 表格问答在线接口
     *
     * @param request RequestTableQAOnlineRequest
     * @return RequestTableQAOnlineResponse
     */
    public RequestTableQAOnlineResponse requestTableQAOnline(RequestTableQAOnlineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestTableQAOnlineWithOptions(request, runtime);
    }

    /**
     * @summary 更新服务数据
     *
     * @param tmpReq UpdateServiceDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceDataResponse
     */
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

    /**
     * @summary 更新服务数据
     *
     * @param request UpdateServiceDataRequest
     * @return UpdateServiceDataResponse
     */
    public UpdateServiceDataResponse updateServiceData(UpdateServiceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceDataWithOptions(request, runtime);
    }
}
