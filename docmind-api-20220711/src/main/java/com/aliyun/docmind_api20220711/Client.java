// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711;

import com.aliyun.tea.*;
import com.aliyun.docmind_api20220711.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-south-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "docmind-api.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-chengdu", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-edge-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-fujian", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hongkong", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-qingdao", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-wuhan", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "docmind-api.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-central-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-west-1", "docmind-api.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "docmind-api.aliyuncs.com"),
            new TeaPair("me-east-1", "docmind-api.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "docmind-api.aliyuncs.com"),
            new TeaPair("us-east-1", "docmind-api.aliyuncs.com"),
            new TeaPair("us-west-1", "docmind-api.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("docmind-api", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>整票识别</p>
     * 
     * @param tmpReq AyncTradeDocumentPackageExtractSmartAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AyncTradeDocumentPackageExtractSmartAppResponse
     */
    public AyncTradeDocumentPackageExtractSmartAppResponse ayncTradeDocumentPackageExtractSmartAppWithOptions(AyncTradeDocumentPackageExtractSmartAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AyncTradeDocumentPackageExtractSmartAppShrinkRequest request = new AyncTradeDocumentPackageExtractSmartAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customExtractionRange)) {
            request.customExtractionRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customExtractionRange, "CustomExtractionRange", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customExtractionRangeShrink)) {
            query.put("CustomExtractionRange", request.customExtractionRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AyncTradeDocumentPackageExtractSmartApp"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AyncTradeDocumentPackageExtractSmartAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>整票识别</p>
     * 
     * @param request AyncTradeDocumentPackageExtractSmartAppRequest
     * @return AyncTradeDocumentPackageExtractSmartAppResponse
     */
    public AyncTradeDocumentPackageExtractSmartAppResponse ayncTradeDocumentPackageExtractSmartApp(AyncTradeDocumentPackageExtractSmartAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ayncTradeDocumentPackageExtractSmartAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档结构化流式接口</p>
     * 
     * @param request GetDocParserResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocParserResultResponse
     */
    public GetDocParserResultResponse getDocParserResultWithOptions(GetDocParserResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutNum)) {
            query.put("LayoutNum", request.layoutNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutStepSize)) {
            query.put("LayoutStepSize", request.layoutStepSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocParserResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocParserResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档结构化流式接口</p>
     * 
     * @param request GetDocParserResultRequest
     * @return GetDocParserResultResponse
     */
    public GetDocParserResultResponse getDocParserResult(GetDocParserResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocParserResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析结果查询</p>
     * 
     * @param request GetDocStructureResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocStructureResultResponse
     */
    public GetDocStructureResultResponse getDocStructureResultWithOptions(GetDocStructureResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageStrategy)) {
            query.put("ImageStrategy", request.imageStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revealMarkdown)) {
            query.put("RevealMarkdown", request.revealMarkdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUrlResponseBody)) {
            query.put("UseUrlResponseBody", request.useUrlResponseBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocStructureResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocStructureResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析结果查询</p>
     * 
     * @param request GetDocStructureResultRequest
     * @return GetDocStructureResultResponse
     */
    public GetDocStructureResultResponse getDocStructureResult(GetDocStructureResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocStructureResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档对比结果查询</p>
     * 
     * @param request GetDocumentCompareResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentCompareResultResponse
     */
    public GetDocumentCompareResultResponse getDocumentCompareResultWithOptions(GetDocumentCompareResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentCompareResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentCompareResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档对比结果查询</p>
     * 
     * @param request GetDocumentCompareResultRequest
     * @return GetDocumentCompareResultResponse
     */
    public GetDocumentCompareResultResponse getDocumentCompareResult(GetDocumentCompareResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentCompareResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档转换结果查询</p>
     * 
     * @param request GetDocumentConvertResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentConvertResultResponse
     */
    public GetDocumentConvertResultResponse getDocumentConvertResultWithOptions(GetDocumentConvertResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentConvertResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentConvertResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档转换结果查询</p>
     * 
     * @param request GetDocumentConvertResultRequest
     * @return GetDocumentConvertResultResponse
     */
    public GetDocumentConvertResultResponse getDocumentConvertResult(GetDocumentConvertResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentConvertResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档抽取结果查询</p>
     * 
     * @param request GetDocumentExtractResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentExtractResultResponse
     */
    public GetDocumentExtractResultResponse getDocumentExtractResultWithOptions(GetDocumentExtractResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentExtractResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentExtractResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档抽取结果查询</p>
     * 
     * @param request GetDocumentExtractResultRequest
     * @return GetDocumentExtractResultResponse
     */
    public GetDocumentExtractResultResponse getDocumentExtractResult(GetDocumentExtractResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentExtractResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>openmind</p>
     * 
     * @param request GetPageNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPageNumResponse
     */
    public GetPageNumResponse getPageNumWithOptions(GetPageNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPageNum"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPageNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>openmind</p>
     * 
     * @param request GetPageNumRequest
     * @return GetPageNumResponse
     */
    public GetPageNumResponse getPageNum(GetPageNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPageNumWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>表格智能解析结果查询</p>
     * 
     * @param request GetTableUnderstandingResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableUnderstandingResultResponse
     */
    public GetTableUnderstandingResultResponse getTableUnderstandingResultWithOptions(GetTableUnderstandingResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableUnderstandingResult"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableUnderstandingResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>表格智能解析结果查询</p>
     * 
     * @param request GetTableUnderstandingResultRequest
     * @return GetTableUnderstandingResultResponse
     */
    public GetTableUnderstandingResultResponse getTableUnderstandingResult(GetTableUnderstandingResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableUnderstandingResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档智能解析处理状态</p>
     * 
     * @param request QueryDocParserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDocParserStatusResponse
     */
    public QueryDocParserStatusResponse queryDocParserStatusWithOptions(QueryDocParserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDocParserStatus"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDocParserStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档智能解析处理状态</p>
     * 
     * @param request QueryDocParserStatusRequest
     * @return QueryDocParserStatusResponse
     */
    public QueryDocParserStatusResponse queryDocParserStatus(QueryDocParserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDocParserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片转excel</p>
     * 
     * @param tmpReq SubmitConvertImageToExcelJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertImageToExcelJobResponse
     */
    public SubmitConvertImageToExcelJobResponse submitConvertImageToExcelJobWithOptions(SubmitConvertImageToExcelJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitConvertImageToExcelJobShrinkRequest request = new SubmitConvertImageToExcelJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageNames)) {
            request.imageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageNames, "ImageNames", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrls)) {
            request.imageUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrls, "ImageUrls", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceMergeExcel)) {
            query.put("ForceMergeExcel", request.forceMergeExcel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNameExtension)) {
            query.put("ImageNameExtension", request.imageNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNamesShrink)) {
            query.put("ImageNames", request.imageNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlsShrink)) {
            query.put("ImageUrls", request.imageUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertImageToExcelJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertImageToExcelJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片转excel</p>
     * 
     * @param request SubmitConvertImageToExcelJobRequest
     * @return SubmitConvertImageToExcelJobResponse
     */
    public SubmitConvertImageToExcelJobResponse submitConvertImageToExcelJob(SubmitConvertImageToExcelJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertImageToExcelJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片转markdown</p>
     * 
     * @param tmpReq SubmitConvertImageToMarkdownJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertImageToMarkdownJobResponse
     */
    public SubmitConvertImageToMarkdownJobResponse submitConvertImageToMarkdownJobWithOptions(SubmitConvertImageToMarkdownJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitConvertImageToMarkdownJobShrinkRequest request = new SubmitConvertImageToMarkdownJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageNames)) {
            request.imageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageNames, "ImageNames", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrls)) {
            request.imageUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrls, "ImageUrls", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageNameExtension)) {
            query.put("ImageNameExtension", request.imageNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNamesShrink)) {
            query.put("ImageNames", request.imageNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlsShrink)) {
            query.put("ImageUrls", request.imageUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertImageToMarkdownJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertImageToMarkdownJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片转markdown</p>
     * 
     * @param request SubmitConvertImageToMarkdownJobRequest
     * @return SubmitConvertImageToMarkdownJobResponse
     */
    public SubmitConvertImageToMarkdownJobResponse submitConvertImageToMarkdownJob(SubmitConvertImageToMarkdownJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertImageToMarkdownJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片转pdf</p>
     * 
     * @param tmpReq SubmitConvertImageToPdfJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertImageToPdfJobResponse
     */
    public SubmitConvertImageToPdfJobResponse submitConvertImageToPdfJobWithOptions(SubmitConvertImageToPdfJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitConvertImageToPdfJobShrinkRequest request = new SubmitConvertImageToPdfJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageNames)) {
            request.imageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageNames, "ImageNames", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrls)) {
            request.imageUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrls, "ImageUrls", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageNameExtension)) {
            query.put("ImageNameExtension", request.imageNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNamesShrink)) {
            query.put("ImageNames", request.imageNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlsShrink)) {
            query.put("ImageUrls", request.imageUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertImageToPdfJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertImageToPdfJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片转pdf</p>
     * 
     * @param request SubmitConvertImageToPdfJobRequest
     * @return SubmitConvertImageToPdfJobResponse
     */
    public SubmitConvertImageToPdfJobResponse submitConvertImageToPdfJob(SubmitConvertImageToPdfJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertImageToPdfJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片转word</p>
     * 
     * @param tmpReq SubmitConvertImageToWordJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertImageToWordJobResponse
     */
    public SubmitConvertImageToWordJobResponse submitConvertImageToWordJobWithOptions(SubmitConvertImageToWordJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitConvertImageToWordJobShrinkRequest request = new SubmitConvertImageToWordJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageNames)) {
            request.imageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageNames, "ImageNames", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageUrls)) {
            request.imageUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageUrls, "ImageUrls", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageNameExtension)) {
            query.put("ImageNameExtension", request.imageNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNamesShrink)) {
            query.put("ImageNames", request.imageNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlsShrink)) {
            query.put("ImageUrls", request.imageUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertImageToWordJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertImageToWordJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片转word</p>
     * 
     * @param request SubmitConvertImageToWordJobRequest
     * @return SubmitConvertImageToWordJobResponse
     */
    public SubmitConvertImageToWordJobResponse submitConvertImageToWordJob(SubmitConvertImageToWordJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertImageToWordJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转excel</p>
     * 
     * @param request SubmitConvertPdfToExcelJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertPdfToExcelJobResponse
     */
    public SubmitConvertPdfToExcelJobResponse submitConvertPdfToExcelJobWithOptions(SubmitConvertPdfToExcelJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceExportInnerImage)) {
            query.put("ForceExportInnerImage", request.forceExportInnerImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceMergeExcel)) {
            query.put("ForceMergeExcel", request.forceMergeExcel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertPdfToExcelJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertPdfToExcelJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转excel</p>
     * 
     * @param request SubmitConvertPdfToExcelJobRequest
     * @return SubmitConvertPdfToExcelJobResponse
     */
    public SubmitConvertPdfToExcelJobResponse submitConvertPdfToExcelJob(SubmitConvertPdfToExcelJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertPdfToExcelJobWithOptions(request, runtime);
    }

    public SubmitConvertPdfToExcelJobResponse submitConvertPdfToExcelJobAdvance(SubmitConvertPdfToExcelJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitConvertPdfToExcelJobRequest submitConvertPdfToExcelJobReq = new SubmitConvertPdfToExcelJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitConvertPdfToExcelJobReq);
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
            submitConvertPdfToExcelJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitConvertPdfToExcelJobResponse submitConvertPdfToExcelJobResp = this.submitConvertPdfToExcelJobWithOptions(submitConvertPdfToExcelJobReq, runtime);
        return submitConvertPdfToExcelJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转图片</p>
     * 
     * @param request SubmitConvertPdfToImageJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertPdfToImageJobResponse
     */
    public SubmitConvertPdfToImageJobResponse submitConvertPdfToImageJobWithOptions(SubmitConvertPdfToImageJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertPdfToImageJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertPdfToImageJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转图片</p>
     * 
     * @param request SubmitConvertPdfToImageJobRequest
     * @return SubmitConvertPdfToImageJobResponse
     */
    public SubmitConvertPdfToImageJobResponse submitConvertPdfToImageJob(SubmitConvertPdfToImageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertPdfToImageJobWithOptions(request, runtime);
    }

    public SubmitConvertPdfToImageJobResponse submitConvertPdfToImageJobAdvance(SubmitConvertPdfToImageJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitConvertPdfToImageJobRequest submitConvertPdfToImageJobReq = new SubmitConvertPdfToImageJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitConvertPdfToImageJobReq);
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
            submitConvertPdfToImageJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitConvertPdfToImageJobResponse submitConvertPdfToImageJobResp = this.submitConvertPdfToImageJobWithOptions(submitConvertPdfToImageJobReq, runtime);
        return submitConvertPdfToImageJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转markdown</p>
     * 
     * @param request SubmitConvertPdfToMarkdownJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertPdfToMarkdownJobResponse
     */
    public SubmitConvertPdfToMarkdownJobResponse submitConvertPdfToMarkdownJobWithOptions(SubmitConvertPdfToMarkdownJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertPdfToMarkdownJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertPdfToMarkdownJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转markdown</p>
     * 
     * @param request SubmitConvertPdfToMarkdownJobRequest
     * @return SubmitConvertPdfToMarkdownJobResponse
     */
    public SubmitConvertPdfToMarkdownJobResponse submitConvertPdfToMarkdownJob(SubmitConvertPdfToMarkdownJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertPdfToMarkdownJobWithOptions(request, runtime);
    }

    public SubmitConvertPdfToMarkdownJobResponse submitConvertPdfToMarkdownJobAdvance(SubmitConvertPdfToMarkdownJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitConvertPdfToMarkdownJobRequest submitConvertPdfToMarkdownJobReq = new SubmitConvertPdfToMarkdownJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitConvertPdfToMarkdownJobReq);
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
            submitConvertPdfToMarkdownJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitConvertPdfToMarkdownJobResponse submitConvertPdfToMarkdownJobResp = this.submitConvertPdfToMarkdownJobWithOptions(submitConvertPdfToMarkdownJobReq, runtime);
        return submitConvertPdfToMarkdownJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转word</p>
     * 
     * @param request SubmitConvertPdfToWordJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitConvertPdfToWordJobResponse
     */
    public SubmitConvertPdfToWordJobResponse submitConvertPdfToWordJobWithOptions(SubmitConvertPdfToWordJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceExportInnerImage)) {
            query.put("ForceExportInnerImage", request.forceExportInnerImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formulaEnhancement)) {
            query.put("FormulaEnhancement", request.formulaEnhancement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitConvertPdfToWordJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitConvertPdfToWordJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>pdf转word</p>
     * 
     * @param request SubmitConvertPdfToWordJobRequest
     * @return SubmitConvertPdfToWordJobResponse
     */
    public SubmitConvertPdfToWordJobResponse submitConvertPdfToWordJob(SubmitConvertPdfToWordJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitConvertPdfToWordJobWithOptions(request, runtime);
    }

    public SubmitConvertPdfToWordJobResponse submitConvertPdfToWordJobAdvance(SubmitConvertPdfToWordJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitConvertPdfToWordJobRequest submitConvertPdfToWordJobReq = new SubmitConvertPdfToWordJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitConvertPdfToWordJobReq);
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
            submitConvertPdfToWordJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitConvertPdfToWordJobResponse submitConvertPdfToWordJobResp = this.submitConvertPdfToWordJobWithOptions(submitConvertPdfToWordJobReq, runtime);
        return submitConvertPdfToWordJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>电子解析</p>
     * 
     * @param request SubmitDigitalDocStructureJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDigitalDocStructureJobResponse
     */
    public SubmitDigitalDocStructureJobResponse submitDigitalDocStructureJobWithOptions(SubmitDigitalDocStructureJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameExtension)) {
            query.put("FileNameExtension", request.fileNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageStrategy)) {
            query.put("ImageStrategy", request.imageStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revealMarkdown)) {
            query.put("RevealMarkdown", request.revealMarkdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUrlResponseBody)) {
            query.put("UseUrlResponseBody", request.useUrlResponseBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDigitalDocStructureJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDigitalDocStructureJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>电子解析</p>
     * 
     * @param request SubmitDigitalDocStructureJobRequest
     * @return SubmitDigitalDocStructureJobResponse
     */
    public SubmitDigitalDocStructureJobResponse submitDigitalDocStructureJob(SubmitDigitalDocStructureJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDigitalDocStructureJobWithOptions(request, runtime);
    }

    public SubmitDigitalDocStructureJobResponse submitDigitalDocStructureJobAdvance(SubmitDigitalDocStructureJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitDigitalDocStructureJobRequest submitDigitalDocStructureJobReq = new SubmitDigitalDocStructureJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDigitalDocStructureJobReq);
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
            submitDigitalDocStructureJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDigitalDocStructureJobResponse submitDigitalDocStructureJobResp = this.submitDigitalDocStructureJobWithOptions(submitDigitalDocStructureJobReq, runtime);
        return submitDigitalDocStructureJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析流式输出</p>
     * 
     * @param request SubmitDocParserJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocParserJobResponse
     */
    public SubmitDocParserJobResponse submitDocParserJobWithOptions(SubmitDocParserJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameExtension)) {
            query.put("FileNameExtension", request.fileNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formulaEnhancement)) {
            query.put("FormulaEnhancement", request.formulaEnhancement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmEnhancement)) {
            query.put("LlmEnhancement", request.llmEnhancement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.option)) {
            query.put("Option", request.option);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocParserJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocParserJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析流式输出</p>
     * 
     * @param request SubmitDocParserJobRequest
     * @return SubmitDocParserJobResponse
     */
    public SubmitDocParserJobResponse submitDocParserJob(SubmitDocParserJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDocParserJobWithOptions(request, runtime);
    }

    public SubmitDocParserJobResponse submitDocParserJobAdvance(SubmitDocParserJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitDocParserJobRequest submitDocParserJobReq = new SubmitDocParserJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocParserJobReq);
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
            submitDocParserJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocParserJobResponse submitDocParserJobResp = this.submitDocParserJobWithOptions(submitDocParserJobReq, runtime);
        return submitDocParserJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析</p>
     * 
     * @param request SubmitDocStructureJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocStructureJobResponse
     */
    public SubmitDocStructureJobResponse submitDocStructureJobWithOptions(SubmitDocStructureJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPptFormat)) {
            query.put("AllowPptFormat", request.allowPptFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameExtension)) {
            query.put("FileNameExtension", request.fileNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formulaEnhancement)) {
            query.put("FormulaEnhancement", request.formulaEnhancement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureType)) {
            query.put("StructureType", request.structureType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocStructureJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocStructureJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档智能解析</p>
     * 
     * @param request SubmitDocStructureJobRequest
     * @return SubmitDocStructureJobResponse
     */
    public SubmitDocStructureJobResponse submitDocStructureJob(SubmitDocStructureJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDocStructureJobWithOptions(request, runtime);
    }

    public SubmitDocStructureJobResponse submitDocStructureJobAdvance(SubmitDocStructureJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitDocStructureJobRequest submitDocStructureJobReq = new SubmitDocStructureJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocStructureJobReq);
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
            submitDocStructureJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocStructureJobResponse submitDocStructureJobResp = this.submitDocStructureJobWithOptions(submitDocStructureJobReq, runtime);
        return submitDocStructureJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>文档抽取</p>
     * 
     * @param request SubmitDocumentExtractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocumentExtractJobResponse
     */
    public SubmitDocumentExtractJobResponse submitDocumentExtractJobWithOptions(SubmitDocumentExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameExtension)) {
            query.put("FileNameExtension", request.fileNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocumentExtractJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocumentExtractJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档抽取</p>
     * 
     * @param request SubmitDocumentExtractJobRequest
     * @return SubmitDocumentExtractJobResponse
     */
    public SubmitDocumentExtractJobResponse submitDocumentExtractJob(SubmitDocumentExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDocumentExtractJobWithOptions(request, runtime);
    }

    public SubmitDocumentExtractJobResponse submitDocumentExtractJobAdvance(SubmitDocumentExtractJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitDocumentExtractJobRequest submitDocumentExtractJobReq = new SubmitDocumentExtractJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocumentExtractJobReq);
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
            submitDocumentExtractJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocumentExtractJobResponse submitDocumentExtractJobResp = this.submitDocumentExtractJobWithOptions(submitDocumentExtractJobReq, runtime);
        return submitDocumentExtractJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>表格智能解析</p>
     * 
     * @param request SubmitTableUnderstandingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTableUnderstandingJobResponse
     */
    public SubmitTableUnderstandingJobResponse submitTableUnderstandingJobWithOptions(SubmitTableUnderstandingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileNameExtension)) {
            query.put("FileNameExtension", request.fileNameExtension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTableUnderstandingJob"),
            new TeaPair("version", "2022-07-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTableUnderstandingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>表格智能解析</p>
     * 
     * @param request SubmitTableUnderstandingJobRequest
     * @return SubmitTableUnderstandingJobResponse
     */
    public SubmitTableUnderstandingJobResponse submitTableUnderstandingJob(SubmitTableUnderstandingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTableUnderstandingJobWithOptions(request, runtime);
    }

    public SubmitTableUnderstandingJobResponse submitTableUnderstandingJobAdvance(SubmitTableUnderstandingJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "docmind-api"),
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
        SubmitTableUnderstandingJobRequest submitTableUnderstandingJobReq = new SubmitTableUnderstandingJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitTableUnderstandingJobReq);
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
            submitTableUnderstandingJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitTableUnderstandingJobResponse submitTableUnderstandingJobResp = this.submitTableUnderstandingJobWithOptions(submitTableUnderstandingJobReq, runtime);
        return submitTableUnderstandingJobResp;
    }
}
