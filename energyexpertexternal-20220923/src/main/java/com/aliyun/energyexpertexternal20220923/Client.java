// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923;

import com.aliyun.tea.*;
import com.aliyun.energyexpertexternal20220923.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("energyexpertexternal", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Generate a report of the specified carbon footprint.
     *
     * @description Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\\"s status can be checked using the `IsCompleted` API. Following the generation of results, other result inquiry APIs can be accessed for display content.
     *
     * @param request GenerateResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResultWithOptions(GenerateResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/generate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResultResponse());
    }

    /**
     * @summary Generate a report of the specified carbon footprint.
     *
     * @description Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\\"s status can be checked using the `IsCompleted` API. Following the generation of results, other result inquiry APIs can be accessed for display content.
     *
     * @param request GenerateResultRequest
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResult(GenerateResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateResultWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to obtain electrical constitute analysis data.
     *
     * @param request GetAreaElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstituteWithOptions(GetAreaElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAreaElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/area"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAreaElecConstituteResponse());
    }

    /**
     * @summary This interface is used to obtain electrical constitute analysis data.
     *
     * @param request GetAreaElecConstituteRequest
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstitute(GetAreaElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAreaElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary Get trends in carbon emissions.
     *
     * @param request GetCarbonEmissionTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrendWithOptions(GetCarbonEmissionTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trendType)) {
            body.put("trendType", request.trendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCarbonEmissionTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCarbonEmissionTrendResponse());
    }

    /**
     * @summary Get trends in carbon emissions.
     *
     * @param request GetCarbonEmissionTrendRequest
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrend(GetCarbonEmissionTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCarbonEmissionTrendWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to obtain the details category of a data item.
     *
     * @description - obtain data item detail list under the current enterprise.
     *
     * @param request GetDataItemListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemListWithOptions(GetDataItemListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataItemList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataItemListResponse());
    }

    /**
     * @summary This interface is used to obtain the details category of a data item.
     *
     * @description - obtain data item detail list under the current enterprise.
     *
     * @param request GetDataItemListRequest
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemList(GetDataItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataItemListWithOptions(request, headers, runtime);
    }

    /**
     * @summary Obtain the data quality evaluation results DQR and DQI.
     *
     * @description This API returns the data quality evaluation results based on the user-provided product ID. It\\"s useful for understanding the data quality of the carbon emission factors for each inventory of the product.
     *
     * @param request GetDataQualityAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysisWithOptions(GetDataQualityAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityAnalysis"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/data/quality/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityAnalysisResponse());
    }

    /**
     * @summary Obtain the data quality evaluation results DQR and DQI.
     *
     * @description This API returns the data quality evaluation results based on the user-provided product ID. It\\"s useful for understanding the data quality of the carbon emission factors for each inventory of the product.
     *
     * @param request GetDataQualityAnalysisRequest
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysis(GetDataQualityAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataQualityAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the information about a device at a site that is activated by using an Alibaba Cloud account.
     *
     * @description *   You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.
     * *   You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @param request GetDeviceInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfoWithOptions(GetDeviceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ds)) {
            query.put("ds", request.ds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceInfoResponse());
    }

    /**
     * @summary Queries the information about a device at a site that is activated by using an Alibaba Cloud account.
     *
     * @description *   You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.
     * *   You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @param request GetDeviceInfoRequest
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfo(GetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the devices of a site that is activated by using an Alibaba Cloud account.
     *
     * @description *   You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.
     * *   Virtual meters at the site are not returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @param request GetDeviceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceListWithOptions(GetDeviceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceListResponse());
    }

    /**
     * @summary Queries the devices of a site that is activated by using an Alibaba Cloud account.
     *
     * @description *   You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.
     * *   Virtual meters at the site are not returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @param request GetDeviceListRequest
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceList(GetDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取文档结果
     *
     * @param request GetDocumentAnalyzeResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResultWithOptions(GetDocumentAnalyzeResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("jobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentAnalyzeResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/getDocumentAnalyzeResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentAnalyzeResultResponse());
    }

    /**
     * @summary 获取文档结果
     *
     * @param request GetDocumentAnalyzeResultRequest
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResult(GetDocumentAnalyzeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentAnalyzeResultWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to obtain power composition analysis data.
     *
     * @param request GetElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstituteWithOptions(GetElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecConstituteResponse());
    }

    /**
     * @summary This interface is used to obtain power composition analysis data.
     *
     * @param request GetElecConstituteRequest
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstitute(GetElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to obtain power trend analysis data.
     *
     * @param request GetElecTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrendWithOptions(GetElecTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecTrendResponse());
    }

    /**
     * @summary This interface is used to obtain power trend analysis data.
     *
     * @param request GetElecTrendRequest
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrend(GetElecTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecTrendWithOptions(request, headers, runtime);
    }

    /**
     * @summary Obtain the emission source composition.
     *
     * @param request GetEmissionSourceConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstituteWithOptions(GetEmissionSourceConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSourceConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSourceConstituteResponse());
    }

    /**
     * @summary Obtain the emission source composition.
     *
     * @param request GetEmissionSourceConstituteRequest
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstitute(GetEmissionSourceConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSourceConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary Get a summary of carbon emissions.
     *
     * @param request GetEmissionSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummaryWithOptions(GetEmissionSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSummaryResponse());
    }

    /**
     * @summary Get a summary of carbon emissions.
     *
     * @param request GetEmissionSummaryRequest
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummary(GetEmissionSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSummaryWithOptions(request, headers, runtime);
    }

    /**
     * @summary Gets the result details of the environmental impact category.
     *
     * @description This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.
     *
     * @param request GetEpdInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstituteWithOptions(GetEpdInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdInventoryConstituteResponse());
    }

    /**
     * @summary Gets the result details of the environmental impact category.
     *
     * @description This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.
     *
     * @param request GetEpdInventoryConstituteRequest
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstitute(GetEpdInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary Obtain the total amount of emissions for various environmental impacts.
     *
     * @description This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.
     *
     * @param request GetEpdSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummaryWithOptions(GetEpdSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdSummaryResponse());
    }

    /**
     * @summary Obtain the total amount of emissions for various environmental impacts.
     *
     * @description This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.
     *
     * @param request GetEpdSummaryRequest
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummary(GetEpdSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdSummaryWithOptions(request, headers, runtime);
    }

    /**
     * @summary Get the list of product carbon footprints.
     *
     * @description With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\\"s detailed information.
     *
     * @param request GetFootprintListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintListWithOptions(GetFootprintListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFootprintList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/product/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFootprintListResponse());
    }

    /**
     * @summary Get the list of product carbon footprints.
     *
     * @description With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\\"s detailed information.
     *
     * @param request GetFootprintListRequest
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintList(GetFootprintListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFootprintListWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to obtain gas composition analysis.
     *
     * @param request GetGasConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstituteWithOptions(GetGasConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGasConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/gas/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGasConstituteResponse());
    }

    /**
     * @summary This interface is used to obtain gas composition analysis.
     *
     * @param request GetGasConstituteRequest
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstitute(GetGasConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGasConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary obtain the active carbon reduction ranking list.
     *
     * @description This interface returns a list of proactive carbon reduction information given product ID. It\\"s used to understand the carbon reduction efforts at various levels of the product.
     *
     * @param request GetGwpBenchmarkListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkListWithOptions(GetGwpBenchmarkListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkListResponse());
    }

    /**
     * @summary obtain the active carbon reduction ranking list.
     *
     * @description This interface returns a list of proactive carbon reduction information given product ID. It\\"s used to understand the carbon reduction efforts at various levels of the product.
     *
     * @param request GetGwpBenchmarkListRequest
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkList(GetGwpBenchmarkListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkListWithOptions(request, headers, runtime);
    }

    /**
     * @summary This API is to obtain the total amount of active carbon reduction.
     *
     * @description The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.
     *
     * @param request GetGwpBenchmarkSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummaryWithOptions(GetGwpBenchmarkSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkSummaryResponse());
    }

    /**
     * @summary This API is to obtain the total amount of active carbon reduction.
     *
     * @description The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.
     *
     * @param request GetGwpBenchmarkSummaryRequest
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummary(GetGwpBenchmarkSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkSummaryWithOptions(request, headers, runtime);
    }

    /**
     * @summary Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.
     *
     * @description Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.
     *
     * @param request GetGwpInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstituteWithOptions(GetGwpInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventoryConstituteResponse());
    }

    /**
     * @summary Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.
     *
     * @description Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.
     *
     * @param request GetGwpInventoryConstituteRequest
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstitute(GetGwpInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.
     *
     * @description Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.
     *
     * @param request GetGwpInventorySummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummaryWithOptions(GetGwpInventorySummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventorySummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventorySummaryResponse());
    }

    /**
     * @summary This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.
     *
     * @description Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.
     *
     * @param request GetGwpInventorySummaryRequest
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummary(GetGwpInventorySummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventorySummaryWithOptions(request, headers, runtime);
    }

    /**
     * @summary Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).
     *
     * @description This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\\"s used to understand various environmental impact emission scenarios.
     *
     * @param request GetInventoryListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryListWithOptions(GetInventoryListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emissionType)) {
            body.put("emissionType", request.emissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodType)) {
            body.put("methodType", request.methodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInventoryList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/inventory/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInventoryListResponse());
    }

    /**
     * @summary Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).
     *
     * @description This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\\"s used to understand various environmental impact emission scenarios.
     *
     * @param request GetInventoryListRequest
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryList(GetInventoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInventoryListWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.
     *
     * @description *   If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactoryWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgAndFactory"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getOrgAndFactory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgAndFactoryResponse());
    }

    /**
     * @summary Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.
     *
     * @description *   If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.
     * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
     * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89) 
     * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en) to apply for whitelist activation.
     *
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgAndFactoryWithOptions(headers, runtime);
    }

    /**
     * @summary This interface is used to obtain carbon inventory organization analysis data.
     *
     * @param request GetOrgConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstituteWithOptions(GetOrgConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/org"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgConstituteResponse());
    }

    /**
     * @summary This interface is used to obtain carbon inventory organization analysis data.
     *
     * @param request GetOrgConstituteRequest
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstitute(GetOrgConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgConstituteWithOptions(request, headers, runtime);
    }

    /**
     * @summary Obtains the oss address of the Product Carbon footprint Report.
     *
     * @description With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.
     *
     * @param request GetPcrInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfoWithOptions(GetPcrInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPcrInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/pcr/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPcrInfoResponse());
    }

    /**
     * @summary Obtains the oss address of the Product Carbon footprint Report.
     *
     * @description With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.
     *
     * @param request GetPcrInfoRequest
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfo(GetPcrInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPcrInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary Get carbon reduction recommendations.
     *
     * @description This API returns carbon reduction proposals based on the product ID. It\\"s useful for understanding optimization tips to reduce the carbon emissions associated with a product.
     *
     * @param request GetReductionProposalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposalWithOptions(GetReductionProposalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReductionProposal"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/reduction/proposal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReductionProposalResponse());
    }

    /**
     * @summary Get carbon reduction recommendations.
     *
     * @description This API returns carbon reduction proposals based on the product ID. It\\"s useful for understanding optimization tips to reduce the carbon emissions associated with a product.
     *
     * @param request GetReductionProposalRequest
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposal(GetReductionProposalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReductionProposalWithOptions(request, headers, runtime);
    }

    /**
     * @summary Check if the result generation is complete.
     *
     * @description This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.
     *
     * @param request IsCompletedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompletedWithOptions(IsCompletedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsCompleted"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/completed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsCompletedResponse());
    }

    /**
     * @summary Check if the result generation is complete.
     *
     * @description This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.
     *
     * @param request IsCompletedRequest
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompleted(IsCompletedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isCompletedWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to push device measuring point data, such as power meter voltage and other data.
     *
     * @param request PushDeviceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceDataWithOptions(PushDeviceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("deviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("devices", request.devices);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDeviceData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/data/increment/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDeviceDataResponse());
    }

    /**
     * @summary This interface is used to push device measuring point data, such as power meter voltage and other data.
     *
     * @param request PushDeviceDataRequest
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceData(PushDeviceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDeviceDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary This interface is used to push data items.
     *
     * @description - This interface is used for individual data item data.
     * - Data items can link data to services such as carbon footprints and carbon inventories.
     * - Depending on the platform configuration, active data on a yearly and monthly basis is supported.
     *
     * @param request PushItemDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemDataWithOptions(PushItemDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushItemData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushItemDataResponse());
    }

    /**
     * @summary This interface is used to push data items.
     *
     * @description - This interface is used for individual data item data.
     * - Data items can link data to services such as carbon footprints and carbon inventories.
     * - Depending on the platform configuration, active data on a yearly and monthly basis is supported.
     *
     * @param request PushItemDataRequest
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemData(PushItemDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushItemDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary Recalculate carbon emissions.
     *
     * @description - After uploading the data items, you need to call this interface to recalculate the carbon inventory data.
     *
     * @param request RecalculateCarbonEmissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmissionWithOptions(RecalculateCarbonEmissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecalculateCarbonEmission"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/recalculate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecalculateCarbonEmissionResponse());
    }

    /**
     * @summary Recalculate carbon emissions.
     *
     * @description - After uploading the data items, you need to call this interface to recalculate the carbon inventory data.
     *
     * @param request RecalculateCarbonEmissionRequest
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmission(RecalculateCarbonEmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recalculateCarbonEmissionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 在线文档问答
     *
     * @param request SendDocumentAskQuestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestionWithOptions(SendDocumentAskQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendDocumentAskQuestion"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/sendDocumentAskQuestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendDocumentAskQuestionResponse());
    }

    /**
     * @summary 在线文档问答
     *
     * @param request SendDocumentAskQuestionRequest
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestion(SendDocumentAskQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDocumentAskQuestionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取文档结果
     *
     * @param request SubmitDocumentAnalyzeJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobWithOptions(SubmitDocumentAnalyzeJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocumentAnalyzeJob"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/submitDocumentAnalyzeJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocumentAnalyzeJobResponse());
    }

    /**
     * @summary 获取文档结果
     *
     * @param request SubmitDocumentAnalyzeJobRequest
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJob(SubmitDocumentAnalyzeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocumentAnalyzeJobWithOptions(request, headers, runtime);
    }

    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobAdvance(SubmitDocumentAnalyzeJobAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "energyExpertExternal"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        SubmitDocumentAnalyzeJobRequest submitDocumentAnalyzeJobReq = new SubmitDocumentAnalyzeJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocumentAnalyzeJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            submitDocumentAnalyzeJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobResp = this.submitDocumentAnalyzeJobWithOptions(submitDocumentAnalyzeJobReq, headers, runtime);
        return submitDocumentAnalyzeJobResp;
    }
}
