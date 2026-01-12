// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926;

import com.aliyun.tea.*;
import com.aliyun.green20220926.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "green.aliyuncs.com"),
            new TeaPair("cn-hongkong", "green.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "green.aliyuncs.com"),
            new TeaPair("cn-qingdao", "green.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "green.aliyuncs.com"),
            new TeaPair("eu-central-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "green.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "green.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("green", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加代答样本</p>
     * 
     * @param request AddAnswerSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAnswerSampleResponse
     */
    public AddAnswerSampleResponse addAnswerSampleWithOptions(AddAnswerSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            query.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleObject)) {
            query.put("SampleObject", request.sampleObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samples)) {
            query.put("Samples", request.samples);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAnswerSample"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAnswerSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加代答样本</p>
     * 
     * @param request AddAnswerSampleRequest
     * @return AddAnswerSampleResponse
     */
    public AddAnswerSampleResponse addAnswerSample(AddAnswerSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAnswerSampleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Image Library</p>
     * 
     * @param request AddImageLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageLibResponse
     */
    public AddImageLibResponse addImageLibWithOptions(AddImageLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            body.put("LibName", request.libName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImageLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Image Library</p>
     * 
     * @param request AddImageLibRequest
     * @return AddImageLibResponse
     */
    public AddImageLibResponse addImageLib(AddImageLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add image to image lib</p>
     * 
     * @param request AddImages2LibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImages2LibResponse
     */
    public AddImages2LibResponse addImages2LibWithOptions(AddImages2LibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imgUrl)) {
            body.put("ImgUrl", request.imgUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImages2Lib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImages2LibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add image to image lib</p>
     * 
     * @param request AddImages2LibRequest
     * @return AddImages2LibResponse
     */
    public AddImages2LibResponse addImages2Lib(AddImages2LibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImages2LibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create keyword library</p>
     * 
     * @param request AddKeywordLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddKeywordLibResponse
     */
    public AddKeywordLibResponse addKeywordLibWithOptions(AddKeywordLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            body.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsObject)) {
            body.put("KeywordsObject", request.keywordsObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            body.put("LibName", request.libName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddKeywordLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddKeywordLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create keyword library</p>
     * 
     * @param request AddKeywordLibRequest
     * @return AddKeywordLibResponse
     */
    public AddKeywordLibResponse addKeywordLib(AddKeywordLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addKeywordLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add keywords</p>
     * 
     * @param request AddKeywordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddKeywordsResponse
     */
    public AddKeywordsResponse addKeywordsWithOptions(AddKeywordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            body.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsObject)) {
            body.put("KeywordsObject", request.keywordsObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddKeywords"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddKeywordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add keywords</p>
     * 
     * @param request AddKeywordsRequest
     * @return AddKeywordsResponse
     */
    public AddKeywordsResponse addKeywords(AddKeywordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addKeywordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add keywords to keyword library.</p>
     * 
     * @param request AddKeywordsToLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddKeywordsToLibResponse
     */
    public AddKeywordsToLibResponse addKeywordsToLibWithOptions(AddKeywordsToLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            body.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordsObject)) {
            body.put("KeywordsObject", request.keywordsObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddKeywordsToLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddKeywordsToLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add keywords to keyword library.</p>
     * 
     * @param request AddKeywordsToLibRequest
     * @return AddKeywordsToLibResponse
     */
    public AddKeywordsToLibResponse addKeywordsToLib(AddKeywordsToLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addKeywordsToLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel OSS detection task</p>
     * 
     * @param request CancelStockOssCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelStockOssCheckTaskResponse
     */
    public CancelStockOssCheckTaskResponse cancelStockOssCheckTaskWithOptions(CancelStockOssCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelStockOssCheckTask"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelStockOssCheckTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel OSS detection task</p>
     * 
     * @param request CancelStockOssCheckTaskRequest
     * @return CancelStockOssCheckTaskResponse
     */
    public CancelStockOssCheckTaskResponse cancelStockOssCheckTask(CancelStockOssCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelStockOssCheckTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>copy service config</p>
     * 
     * @param request CopyServiceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyServiceConfigResponse
     */
    public CopyServiceConfigResponse copyServiceConfigWithOptions(CopyServiceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDesc)) {
            body.put("ServiceDesc", request.serviceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyServiceConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyServiceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>copy service config</p>
     * 
     * @param request CopyServiceConfigRequest
     * @return CopyServiceConfigResponse
     */
    public CopyServiceConfigResponse copyServiceConfig(CopyServiceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyServiceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create stock oss check task</p>
     * 
     * @param request CreatStockOssCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatStockOssCheckTaskResponse
     */
    public CreatStockOssCheckTaskResponse creatStockOssCheckTaskWithOptions(CreatStockOssCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buckets)) {
            query.put("Buckets", request.buckets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackId)) {
            query.put("CallbackId", request.callbackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctHistoryTasks)) {
            query.put("DistinctHistoryTasks", request.distinctHistoryTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeDate)) {
            query.put("ExecuteDate", request.executeDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTime)) {
            query.put("ExecuteTime", request.executeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freeze)) {
            query.put("Freeze", request.freeze);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeHighRisk1)) {
            query.put("FreezeHighRisk1", request.freezeHighRisk1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeHighRisk2)) {
            query.put("FreezeHighRisk2", request.freezeHighRisk2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeMediumRisk1)) {
            query.put("FreezeMediumRisk1", request.freezeMediumRisk1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeMediumRisk2)) {
            query.put("FreezeMediumRisk2", request.freezeMediumRisk2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeRestorePath)) {
            query.put("FreezeRestorePath", request.freezeRestorePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeType)) {
            query.put("FreezeType", request.freezeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isInc)) {
            query.put("IsInc", request.isInc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixFilterType)) {
            query.put("PrefixFilterType", request.prefixFilterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixFilters)) {
            query.put("PrefixFilters", request.prefixFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referer)) {
            query.put("Referer", request.referer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanLimit)) {
            query.put("ScanLimit", request.scanLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanNoFileType)) {
            query.put("ScanNoFileType", request.scanNoFileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanResourceType)) {
            query.put("ScanResourceType", request.scanResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanService)) {
            query.put("ScanService", request.scanService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCycle)) {
            query.put("TaskCycle", request.taskCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatStockOssCheckTask"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatStockOssCheckTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create stock oss check task</p>
     * 
     * @param request CreatStockOssCheckTaskRequest
     * @return CreatStockOssCheckTaskResponse
     */
    public CreatStockOssCheckTaskResponse creatStockOssCheckTask(CreatStockOssCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.creatStockOssCheckTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代答库</p>
     * 
     * @param request CreateAnswerLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnswerLibResponse
     */
    public CreateAnswerLibResponse createAnswerLibWithOptions(CreateAnswerLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            body.put("LibName", request.libName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleBucket)) {
            body.put("SampleBucket", request.sampleBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleObject)) {
            body.put("SampleObject", request.sampleObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samples)) {
            body.put("Samples", request.samples);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnswerLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAnswerLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建代答库</p>
     * 
     * @param request CreateAnswerLibRequest
     * @return CreateAnswerLibResponse
     */
    public CreateAnswerLibResponse createAnswerLib(CreateAnswerLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAnswerLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new message notification</p>
     * 
     * @param request CreateCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCallbackResponse
     */
    public CreateCallbackResponse createCallbackWithOptions(CreateCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cryptType)) {
            body.put("CryptType", request.cryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new message notification</p>
     * 
     * @param request CreateCallbackRequest
     * @return CreateCallbackResponse
     */
    public CreateCallbackResponse createCallback(CreateCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在线测试</p>
     * 
     * @param request CreateOnlineTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOnlineTestResponse
     */
    public CreateOnlineTestResponse createOnlineTestWithOptions(CreateOnlineTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOnlineTest"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOnlineTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在线测试</p>
     * 
     * @param request CreateOnlineTestRequest
     * @return CreateOnlineTestResponse
     */
    public CreateOnlineTestResponse createOnlineTest(CreateOnlineTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOnlineTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check before creating an OSS scan task</p>
     * 
     * @param request CreatePreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePreCheckResponse
     */
    public CreatePreCheckResponse createPreCheckWithOptions(CreatePreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buckets)) {
            body.put("Buckets", request.buckets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctHistoryTasks)) {
            body.put("DistinctHistoryTasks", request.distinctHistoryTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isInc)) {
            body.put("IsInc", request.isInc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            body.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixFilterType)) {
            body.put("PrefixFilterType", request.prefixFilterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixFilters)) {
            body.put("PrefixFilters", request.prefixFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanLimit)) {
            body.put("ScanLimit", request.scanLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanNoFileType)) {
            body.put("ScanNoFileType", request.scanNoFileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanService)) {
            body.put("ScanService", request.scanService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePreCheck"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check before creating an OSS scan task</p>
     * 
     * @param request CreatePreCheckRequest
     * @return CreatePreCheckResponse
     */
    public CreatePreCheckResponse createPreCheck(CreatePreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPreCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代答库</p>
     * 
     * @param request DeleteAnswerLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnswerLibResponse
     */
    public DeleteAnswerLibResponse deleteAnswerLibWithOptions(DeleteAnswerLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            query.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnswerLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAnswerLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除代答库</p>
     * 
     * @param request DeleteAnswerLibRequest
     * @return DeleteAnswerLibResponse
     */
    public DeleteAnswerLibResponse deleteAnswerLib(DeleteAnswerLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAnswerLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代答答案</p>
     * 
     * @param request DeleteAnswerSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnswerSampleResponse
     */
    public DeleteAnswerSampleResponse deleteAnswerSampleWithOptions(DeleteAnswerSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            body.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnswerSample"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAnswerSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除代答答案</p>
     * 
     * @param request DeleteAnswerSampleRequest
     * @return DeleteAnswerSampleResponse
     */
    public DeleteAnswerSampleResponse deleteAnswerSample(DeleteAnswerSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAnswerSampleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete callback</p>
     * 
     * @param request DeleteCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCallbackResponse
     */
    public DeleteCallbackResponse deleteCallbackWithOptions(DeleteCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCallback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>delete callback</p>
     * 
     * @param request DeleteCallbackRequest
     * @return DeleteCallbackResponse
     */
    public DeleteCallbackResponse deleteCallback(DeleteCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete feature configuration</p>
     * 
     * @param request DeleteFeatureConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFeatureConfigResponse
     */
    public DeleteFeatureConfigResponse deleteFeatureConfigWithOptions(DeleteFeatureConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            body.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFeatureConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFeatureConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete feature configuration</p>
     * 
     * @param request DeleteFeatureConfigRequest
     * @return DeleteFeatureConfigResponse
     */
    public DeleteFeatureConfigResponse deleteFeatureConfig(DeleteFeatureConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFeatureConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete images from library.</p>
     * 
     * @param request DeleteImagesFromLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImagesFromLibResponse
     */
    public DeleteImagesFromLibResponse deleteImagesFromLibWithOptions(DeleteImagesFromLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageIds)) {
            body.put("ImageIds", request.imageIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImagesFromLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagesFromLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete images from library.</p>
     * 
     * @param request DeleteImagesFromLibRequest
     * @return DeleteImagesFromLibResponse
     */
    public DeleteImagesFromLibResponse deleteImagesFromLib(DeleteImagesFromLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImagesFromLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete keyword</p>
     * 
     * @param request DeleteKeywordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeywordResponse
     */
    public DeleteKeywordResponse deleteKeywordWithOptions(DeleteKeywordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keywordIdList)) {
            body.put("KeywordIdList", request.keywordIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordIds)) {
            body.put("KeywordIds", request.keywordIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyword"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeywordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete keyword</p>
     * 
     * @param request DeleteKeywordRequest
     * @return DeleteKeywordResponse
     */
    public DeleteKeywordResponse deleteKeyword(DeleteKeywordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeywordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Keyword Library</p>
     * 
     * @param request DeleteKeywordLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeywordLibResponse
     */
    public DeleteKeywordLibResponse deleteKeywordLibWithOptions(DeleteKeywordLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeywordLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeywordLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Keyword Library</p>
     * 
     * @param request DeleteKeywordLibRequest
     * @return DeleteKeywordLibResponse
     */
    public DeleteKeywordLibResponse deleteKeywordLib(DeleteKeywordLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeywordLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除在线测试接口</p>
     * 
     * @param request DeleteOnlineTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOnlineTestResponse
     */
    public DeleteOnlineTestResponse deleteOnlineTestWithOptions(DeleteOnlineTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOnlineTest"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOnlineTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除在线测试接口</p>
     * 
     * @param request DeleteOnlineTestRequest
     * @return DeleteOnlineTestResponse
     */
    public DeleteOnlineTestResponse deleteOnlineTest(DeleteOnlineTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOnlineTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询在线测试结果</p>
     * 
     * @param request DescribeOnlineTestResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOnlineTestResultResponse
     */
    public DescribeOnlineTestResultResponse describeOnlineTestResultWithOptions(DescribeOnlineTestResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOnlineTestResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOnlineTestResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询在线测试结果</p>
     * 
     * @param request DescribeOnlineTestResultRequest
     * @return DescribeOnlineTestResultResponse
     */
    public DescribeOnlineTestResultResponse describeOnlineTestResult(DescribeOnlineTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOnlineTestResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出代答答案</p>
     * 
     * @param request ExportAnswerSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportAnswerSampleResponse
     */
    public ExportAnswerSampleResponse exportAnswerSampleWithOptions(ExportAnswerSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportAnswerSample"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportAnswerSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出代答答案</p>
     * 
     * @param request ExportAnswerSampleRequest
     * @return ExportAnswerSampleResponse
     */
    public ExportAnswerSampleResponse exportAnswerSample(ExportAnswerSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportAnswerSampleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export Call Volume</p>
     * 
     * @param request ExportCipStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportCipStatsResponse
     */
    public ExportCipStatsResponse exportCipStatsWithOptions(ExportCipStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byMonth)) {
            body.put("ByMonth", request.byMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            body.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUid)) {
            body.put("SubUid", request.subUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportCipStats"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportCipStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export Call Volume</p>
     * 
     * @param request ExportCipStatsRequest
     * @return ExportCipStatsResponse
     */
    public ExportCipStatsResponse exportCipStats(ExportCipStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportCipStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export Keywords</p>
     * 
     * @param request ExportKeywordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportKeywordResponse
     */
    public ExportKeywordResponse exportKeywordWithOptions(ExportKeywordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportKeyword"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportKeywordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export Keywords</p>
     * 
     * @param request ExportKeywordRequest
     * @return ExportKeywordResponse
     */
    public ExportKeywordResponse exportKeyword(ExportKeywordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportKeywordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OSS Usage Statistics Export</p>
     * 
     * @param request ExportOssCheckStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportOssCheckStatResponse
     */
    public ExportOssCheckStatResponse exportOssCheckStatWithOptions(ExportOssCheckStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byMonth)) {
            body.put("ByMonth", request.byMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            body.put("ParentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportOssCheckStat"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportOssCheckStatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OSS Usage Statistics Export</p>
     * 
     * @param request ExportOssCheckStatRequest
     * @return ExportOssCheckStatResponse
     */
    public ExportOssCheckStatResponse exportOssCheckStat(ExportOssCheckStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportOssCheckStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export OSS scan results</p>
     * 
     * @param tmpReq ExportResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportResultResponse
     */
    public ExportResultResponse exportResultWithOptions(ExportResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportResultShrinkRequest request = new ExportResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export OSS scan results</p>
     * 
     * @param request ExportResultRequest
     * @return ExportResultResponse
     */
    public ExportResultResponse exportResult(ExportResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export scan results, Excel file</p>
     * 
     * @param tmpReq ExportScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportScanResultResponse
     */
    public ExportScanResultResponse exportScanResultWithOptions(ExportScanResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportScanResultShrinkRequest request = new ExportScanResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportScanResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportScanResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export scan results, Excel file</p>
     * 
     * @param request ExportScanResultRequest
     * @return ExportScanResultResponse
     */
    public ExportScanResultResponse exportScanResult(ExportScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportScanResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Export text scan results, Excel file</p>
     * 
     * @param tmpReq ExportTextScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportTextScanResultResponse
     */
    public ExportTextScanResultResponse exportTextScanResultWithOptions(ExportTextScanResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportTextScanResultShrinkRequest request = new ExportTextScanResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportTextScanResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportTextScanResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Export text scan results, Excel file</p>
     * 
     * @param request ExportTextScanResultRequest
     * @return ExportTextScanResultResponse
     */
    public ExportTextScanResultResponse exportTextScanResult(ExportTextScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportTextScanResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代答样本导入进度</p>
     * 
     * @param request GetAnswerImportProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnswerImportProgressResponse
     */
    public GetAnswerImportProgressResponse getAnswerImportProgressWithOptions(GetAnswerImportProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnswerImportProgress"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAnswerImportProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代答样本导入进度</p>
     * 
     * @param request GetAnswerImportProgressRequest
     * @return GetAnswerImportProgressResponse
     */
    public GetAnswerImportProgressResponse getAnswerImportProgress(GetAnswerImportProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAnswerImportProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Evidence Transfer to Get User\&quot;s Bucket List</p>
     * 
     * @param request GetBackupBucketsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBackupBucketsListResponse
     */
    public GetBackupBucketsListResponse getBackupBucketsListWithOptions(GetBackupBucketsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBackupBucketsList"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBackupBucketsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Evidence Transfer to Get User\&quot;s Bucket List</p>
     * 
     * @param request GetBackupBucketsListRequest
     * @return GetBackupBucketsListResponse
     */
    public GetBackupBucketsListResponse getBackupBucketsList(GetBackupBucketsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBackupBucketsListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Evidence Backup Configuration</p>
     * 
     * @param request GetBackupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBackupConfigResponse
     */
    public GetBackupConfigResponse getBackupConfigWithOptions(GetBackupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBackupConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBackupConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Evidence Backup Configuration</p>
     * 
     * @param request GetBackupConfigRequest
     * @return GetBackupConfigResponse
     */
    public GetBackupConfigResponse getBackupConfig(GetBackupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBackupConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>User Backup Authorization Verification</p>
     * 
     * @param request GetBackupStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBackupStatusResponse
     */
    public GetBackupStatusResponse getBackupStatusWithOptions(GetBackupStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBackupStatus"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBackupStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>User Backup Authorization Verification</p>
     * 
     * @param request GetBackupStatusRequest
     * @return GetBackupStatusResponse
     */
    public GetBackupStatusResponse getBackupStatus(GetBackupStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBackupStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get User OSS Scan Bucket List</p>
     * 
     * @param request GetBucketsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucketsListResponse
     */
    public GetBucketsListResponse getBucketsListWithOptions(GetBucketsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketsList"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucketsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get User OSS Scan Bucket List</p>
     * 
     * @param request GetBucketsListRequest
     * @return GetBucketsListResponse
     */
    public GetBucketsListResponse getBucketsList(GetBucketsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBucketsListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询调用量</p>
     * 
     * @param request GetCipStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCipStatsResponse
     */
    public GetCipStatsResponse getCipStatsWithOptions(GetCipStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byMonth)) {
            body.put("ByMonth", request.byMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUid)) {
            body.put("SubUid", request.subUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCipStats"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCipStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询调用量</p>
     * 
     * @param request GetCipStatsRequest
     * @return GetCipStatsResponse
     */
    public GetCipStatsResponse getCipStats(GetCipStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCipStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Scheduled  OSS Scan  Task Estimated Execution Time</p>
     * 
     * @param request GetExecuteTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecuteTimeResponse
     */
    public GetExecuteTimeResponse getExecuteTimeWithOptions(GetExecuteTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecuteTime"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecuteTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Scheduled  OSS Scan  Task Estimated Execution Time</p>
     * 
     * @param request GetExecuteTimeRequest
     * @return GetExecuteTimeResponse
     */
    public GetExecuteTimeResponse getExecuteTime(GetExecuteTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExecuteTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Feature Configuration</p>
     * 
     * @param request GetFeatureConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFeatureConfigResponse
     */
    public GetFeatureConfigResponse getFeatureConfigWithOptions(GetFeatureConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFeatureConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFeatureConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Feature Configuration</p>
     * 
     * @param request GetFeatureConfigRequest
     * @return GetFeatureConfigResponse
     */
    public GetFeatureConfigResponse getFeatureConfig(GetFeatureConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFeatureConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Image Rule Label Information</p>
     * 
     * @param request GetImageSceneLabelConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageSceneLabelConfResponse
     */
    public GetImageSceneLabelConfResponse getImageSceneLabelConfWithOptions(GetImageSceneLabelConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageSceneLabelConf"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageSceneLabelConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Image Rule Label Information</p>
     * 
     * @param request GetImageSceneLabelConfRequest
     * @return GetImageSceneLabelConfResponse
     */
    public GetImageSceneLabelConfResponse getImageSceneLabelConf(GetImageSceneLabelConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageSceneLabelConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Image Rule Label Information</p>
     * 
     * @param request GetImageSceneLabelListConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageSceneLabelListConfResponse
     */
    public GetImageSceneLabelListConfResponse getImageSceneLabelListConfWithOptions(GetImageSceneLabelListConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageServiceCode)) {
            query.put("ImageServiceCode", request.imageServiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageSceneLabelListConf"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageSceneLabelListConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Image Rule Label Information</p>
     * 
     * @param request GetImageSceneLabelListConfRequest
     * @return GetImageSceneLabelListConfResponse
     */
    public GetImageSceneLabelListConfResponse getImageSceneLabelListConf(GetImageSceneLabelListConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageSceneLabelListConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OSS scheduled scan detection cycle query</p>
     * 
     * @param tmpReq GetJobNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobNameListResponse
     */
    public GetJobNameListResponse getJobNameListWithOptions(GetJobNameListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetJobNameListShrinkRequest request = new GetJobNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            query.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobNameList"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OSS scheduled scan detection cycle query</p>
     * 
     * @param request GetJobNameListRequest
     * @return GetJobNameListResponse
     */
    public GetJobNameListResponse getJobNameList(GetJobNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the result of keyword import</p>
     * 
     * @param request GetKeywordImportResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKeywordImportResultResponse
     */
    public GetKeywordImportResultResponse getKeywordImportResultWithOptions(GetKeywordImportResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeywordImportResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeywordImportResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the result of keyword import</p>
     * 
     * @param request GetKeywordImportResultRequest
     * @return GetKeywordImportResultResponse
     */
    public GetKeywordImportResultResponse getKeywordImportResult(GetKeywordImportResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordImportResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Keyword Library Information</p>
     * 
     * @param request GetKeywordLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKeywordLibResponse
     */
    public GetKeywordLibResponse getKeywordLibWithOptions(GetKeywordLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKeywordLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKeywordLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Keyword Library Information</p>
     * 
     * @param request GetKeywordLibRequest
     * @return GetKeywordLibResponse
     */
    public GetKeywordLibResponse getKeywordLib(GetKeywordLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKeywordLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query OSS freeze result</p>
     * 
     * @param tmpReq GetOssCheckFreezeResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssCheckFreezeResultResponse
     */
    public GetOssCheckFreezeResultResponse getOssCheckFreezeResultWithOptions(GetOssCheckFreezeResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetOssCheckFreezeResultShrinkRequest request = new GetOssCheckFreezeResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishNum)) {
            query.put("FinishNum", request.finishNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            query.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCheckFreezeResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCheckFreezeResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query OSS freeze result</p>
     * 
     * @param request GetOssCheckFreezeResultRequest
     * @return GetOssCheckFreezeResultResponse
     */
    public GetOssCheckFreezeResultResponse getOssCheckFreezeResult(GetOssCheckFreezeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssCheckFreezeResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OSS result details</p>
     * 
     * @param request GetOssCheckResultDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssCheckResultDetailResponse
     */
    public GetOssCheckResultDetailResponse getOssCheckResultDetailWithOptions(GetOssCheckResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.object)) {
            query.put("Object", request.object);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            query.put("ParentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRequestId)) {
            query.put("QueryRequestId", request.queryRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCheckResultDetail"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCheckResultDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OSS result details</p>
     * 
     * @param request GetOssCheckResultDetailRequest
     * @return GetOssCheckResultDetailResponse
     */
    public GetOssCheckResultDetailResponse getOssCheckResultDetail(GetOssCheckResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssCheckResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OSS Check Usage Statistics</p>
     * 
     * @param request GetOssCheckStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssCheckStatResponse
     */
    public GetOssCheckStatResponse getOssCheckStatWithOptions(GetOssCheckStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byMonth)) {
            body.put("ByMonth", request.byMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            body.put("ParentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCheckStat"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCheckStatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OSS Check Usage Statistics</p>
     * 
     * @param request GetOssCheckStatRequest
     * @return GetOssCheckStatResponse
     */
    public GetOssCheckStatResponse getOssCheckStat(GetOssCheckStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssCheckStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get User OSS check user status</p>
     * 
     * @param request GetOssCheckStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssCheckStatusResponse
     */
    public GetOssCheckStatusResponse getOssCheckStatusWithOptions(GetOssCheckStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCheckStatus"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCheckStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get User OSS check user status</p>
     * 
     * @param request GetOssCheckStatusRequest
     * @return GetOssCheckStatusResponse
     */
    public GetOssCheckStatusResponse getOssCheckStatus(GetOssCheckStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssCheckStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询oss扫描任务详情</p>
     * 
     * @param request GetOssCheckTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssCheckTaskInfoResponse
     */
    public GetOssCheckTaskInfoResponse getOssCheckTaskInfoWithOptions(GetOssCheckTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            query.put("ParentTaskId", request.parentTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssCheckTaskInfo"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssCheckTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询oss扫描任务详情</p>
     * 
     * @param request GetOssCheckTaskInfoRequest
     * @return GetOssCheckTaskInfoResponse
     */
    public GetOssCheckTaskInfoResponse getOssCheckTaskInfo(GetOssCheckTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssCheckTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>User OSS Check Task Pending Inspection Information</p>
     * 
     * @param request GetScanNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScanNumResponse
     */
    public GetScanNumResponse getScanNumWithOptions(GetScanNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buckets)) {
            query.put("Buckets", request.buckets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScanNum"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScanNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>User OSS Check Task Pending Inspection Information</p>
     * 
     * @param request GetScanNumRequest
     * @return GetScanNumResponse
     */
    public GetScanNumResponse getScanNum(GetScanNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScanNumWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the Scan results</p>
     * 
     * @param tmpReq GetScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScanResultResponse
     */
    public GetScanResultResponse getScanResultWithOptions(GetScanResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetScanResultShrinkRequest request = new GetScanResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScanResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScanResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the Scan results</p>
     * 
     * @param request GetScanResultRequest
     * @return GetScanResultResponse
     */
    public GetScanResultResponse getScanResult(GetScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScanResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a Single Service Configuration</p>
     * 
     * @param request GetServiceConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceConfResponse
     */
    public GetServiceConfResponse getServiceConfWithOptions(GetServiceConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byDefault)) {
            body.put("ByDefault", request.byDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceConf"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get a Single Service Configuration</p>
     * 
     * @param request GetServiceConfRequest
     * @return GetServiceConfResponse
     */
    public GetServiceConfResponse getServiceConf(GetServiceConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a Single Service Configuration</p>
     * 
     * @param request GetServiceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceConfigResponse
     */
    public GetServiceConfigResponse getServiceConfigWithOptions(GetServiceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get a Single Service Configuration</p>
     * 
     * @param request GetServiceConfigRequest
     * @return GetServiceConfigResponse
     */
    public GetServiceConfigResponse getServiceConfig(GetServiceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the label configuration of a single service</p>
     * 
     * @param request GetServiceLabelConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceLabelConfigResponse
     */
    public GetServiceLabelConfigResponse getServiceLabelConfigWithOptions(GetServiceLabelConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceLabelConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceLabelConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the label configuration of a single service</p>
     * 
     * @param request GetServiceLabelConfigRequest
     * @return GetServiceLabelConfigResponse
     */
    public GetServiceLabelConfigResponse getServiceLabelConfig(GetServiceLabelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceLabelConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query OSS Scan Task List</p>
     * 
     * @param tmpReq GetStockOssCheckTasksListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStockOssCheckTasksListResponse
     */
    public GetStockOssCheckTasksListResponse getStockOssCheckTasksListWithOptions(GetStockOssCheckTasksListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetStockOssCheckTasksListShrinkRequest request = new GetStockOssCheckTasksListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isInc)) {
            query.put("IsInc", request.isInc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            body.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStockOssCheckTasksList"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStockOssCheckTasksListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query OSS Scan Task List</p>
     * 
     * @param request GetStockOssCheckTasksListRequest
     * @return GetStockOssCheckTasksListResponse
     */
    public GetStockOssCheckTasksListResponse getStockOssCheckTasksList(GetStockOssCheckTasksListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStockOssCheckTasksListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the invocation result</p>
     * 
     * @param tmpReq GetTextScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextScanResultResponse
     */
    public GetTextScanResultResponse getTextScanResultWithOptions(GetTextScanResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTextScanResultShrinkRequest request = new GetTextScanResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            body.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextScanResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextScanResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the invocation result</p>
     * 
     * @param request GetTextScanResultRequest
     * @return GetTextScanResultResponse
     */
    public GetTextScanResultResponse getTextScanResult(GetTextScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTextScanResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the corresponding information for file upload</p>
     * 
     * @param request GetUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadInfoResponse
     */
    public GetUploadInfoResponse getUploadInfoWithOptions(GetUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadInfo"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the corresponding information for file upload</p>
     * 
     * @param request GetUploadInfoRequest
     * @return GetUploadInfoResponse
     */
    public GetUploadInfoResponse getUploadInfo(GetUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传链接</p>
     * 
     * @param request GetUploadLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadLinkResponse
     */
    public GetUploadLinkResponse getUploadLinkWithOptions(GetUploadLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrl)) {
            query.put("UploadUrl", request.uploadUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadLink"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取上传链接</p>
     * 
     * @param request GetUploadLinkRequest
     * @return GetUploadLinkResponse
     */
    public GetUploadLinkResponse getUploadLink(GetUploadLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get User Purchase Status</p>
     * 
     * @param request GetUserBuyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserBuyStatusResponse
     */
    public GetUserBuyStatusResponse getUserBuyStatusWithOptions(GetUserBuyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserBuyStatus"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserBuyStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get User Purchase Status</p>
     * 
     * @param request GetUserBuyStatusRequest
     * @return GetUserBuyStatusResponse
     */
    public GetUserBuyStatusResponse getUserBuyStatus(GetUserBuyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserBuyStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>代答库列表</p>
     * 
     * @param request ListAnswerLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnswerLibResponse
     */
    public ListAnswerLibResponse listAnswerLibWithOptions(ListAnswerLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnswerLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnswerLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>代答库列表</p>
     * 
     * @param request ListAnswerLibRequest
     * @return ListAnswerLibResponse
     */
    public ListAnswerLibResponse listAnswerLib(ListAnswerLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnswerLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Callback List</p>
     * 
     * @param request ListCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallbackResponse
     */
    public ListCallbackResponse listCallbackWithOptions(ListCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Callback List</p>
     * 
     * @param request ListCallbackRequest
     * @return ListCallbackResponse
     */
    public ListCallbackResponse listCallback(ListCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Image Library List</p>
     * 
     * @param request ListImageLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageLibResponse
     */
    public ListImageLibResponse listImageLibWithOptions(ListImageLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Image Library List</p>
     * 
     * @param request ListImageLibRequest
     * @return ListImageLibResponse
     */
    public ListImageLibResponse listImageLib(ListImageLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Paged Image List</p>
     * 
     * @param tmpReq ListImagesFromLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesFromLibResponse
     */
    public ListImagesFromLibResponse listImagesFromLibWithOptions(ListImagesFromLibRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListImagesFromLibShrinkRequest request = new ListImagesFromLibShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imgId)) {
            body.put("ImgId", request.imgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImagesFromLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesFromLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Paged Image List</p>
     * 
     * @param request ListImagesFromLibRequest
     * @return ListImagesFromLibResponse
     */
    public ListImagesFromLibResponse listImagesFromLib(ListImagesFromLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesFromLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Keyword Library List</p>
     * 
     * @param request ListKeywordLibsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKeywordLibsResponse
     */
    public ListKeywordLibsResponse listKeywordLibsWithOptions(ListKeywordLibsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKeywordLibs"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKeywordLibsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Keyword Library List</p>
     * 
     * @param request ListKeywordLibsRequest
     * @return ListKeywordLibsResponse
     */
    public ListKeywordLibsResponse listKeywordLibs(ListKeywordLibsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeywordLibsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Keyword List</p>
     * 
     * @param tmpReq ListKeywordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKeywordsResponse
     */
    public ListKeywordsResponse listKeywordsWithOptions(ListKeywordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListKeywordsShrinkRequest request = new ListKeywordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            body.put("Word", request.word);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKeywords"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKeywordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Keyword List</p>
     * 
     * @param request ListKeywordsRequest
     * @return ListKeywordsResponse
     */
    public ListKeywordsResponse listKeywords(ListKeywordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKeywordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>query OSS scan result list</p>
     * 
     * @param tmpReq ListOssCheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOssCheckResultResponse
     */
    public ListOssCheckResultResponse listOssCheckResultWithOptions(ListOssCheckResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListOssCheckResultShrinkRequest request = new ListOssCheckResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishNum)) {
            query.put("FinishNum", request.finishNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            query.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOssCheckResult"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOssCheckResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>query OSS scan result list</p>
     * 
     * @param request ListOssCheckResultRequest
     * @return ListOssCheckResultResponse
     */
    public ListOssCheckResultResponse listOssCheckResult(ListOssCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOssCheckResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Service List</p>
     * 
     * @param request ListServiceConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceConfigsResponse
     */
    public ListServiceConfigsResponse listServiceConfigsWithOptions(ListServiceConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("Classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useStatus)) {
            query.put("UseStatus", request.useStatus);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceConfigs"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Service List</p>
     * 
     * @param request ListServiceConfigsRequest
     * @return ListServiceConfigsResponse
     */
    public ListServiceConfigsResponse listServiceConfigs(ListServiceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use SSE interface to stream large model calls</p>
     * 
     * @param request LlmStreamChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LlmStreamChatResponse
     */
    public LlmStreamChatResponse llmStreamChatWithOptions(LlmStreamChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("Messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            body.put("Temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topP)) {
            body.put("TopP", request.topP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LlmStreamChat"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LlmStreamChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use SSE interface to stream large model calls</p>
     * 
     * @param request LlmStreamChatRequest
     * @return LlmStreamChatResponse
     */
    public LlmStreamChatResponse llmStreamChat(LlmStreamChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmStreamChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代答库</p>
     * 
     * @param request ModifyAnswerLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAnswerLibResponse
     */
    public ModifyAnswerLibResponse modifyAnswerLibWithOptions(ModifyAnswerLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            query.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            query.put("LibName", request.libName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAnswerLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAnswerLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新代答库</p>
     * 
     * @param request ModifyAnswerLibRequest
     * @return ModifyAnswerLibResponse
     */
    public ModifyAnswerLibResponse modifyAnswerLib(ModifyAnswerLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAnswerLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Message Notification</p>
     * 
     * @param request ModifyCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCallbackResponse
     */
    public ModifyCallbackResponse modifyCallbackWithOptions(ModifyCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cryptType)) {
            body.put("CryptType", request.cryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCallback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Message Notification</p>
     * 
     * @param request ModifyCallbackRequest
     * @return ModifyCallbackResponse
     */
    public ModifyCallbackResponse modifyCallback(ModifyCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存特性配置</p>
     * 
     * @param request ModifyFeatureConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFeatureConfigResponse
     */
    public ModifyFeatureConfigResponse modifyFeatureConfigWithOptions(ModifyFeatureConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            body.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFeatureConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFeatureConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存特性配置</p>
     * 
     * @param request ModifyFeatureConfigRequest
     * @return ModifyFeatureConfigResponse
     */
    public ModifyFeatureConfigResponse modifyFeatureConfig(ModifyFeatureConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFeatureConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Service</p>
     * 
     * @param request ModifyServiceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyServiceInfoResponse
     */
    public ModifyServiceInfoResponse modifyServiceInfoWithOptions(ModifyServiceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDesc)) {
            body.put("ServiceDesc", request.serviceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyServiceInfo"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyServiceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Service</p>
     * 
     * @param request ModifyServiceInfoRequest
     * @return ModifyServiceInfoResponse
     */
    public ModifyServiceInfoResponse modifyServiceInfo(ModifyServiceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyServiceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>oss扫描结果查询</p>
     * 
     * @param tmpReq OssCheckResultListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OssCheckResultListResponse
     */
    public OssCheckResultListResponse ossCheckResultListWithOptions(OssCheckResultListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OssCheckResultListShrinkRequest request = new OssCheckResultListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishNum)) {
            query.put("FinishNum", request.finishNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            query.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OssCheckResultList"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OssCheckResultListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>oss扫描结果查询</p>
     * 
     * @param request OssCheckResultListRequest
     * @return OssCheckResultListResponse
     */
    public OssCheckResultListResponse ossCheckResultList(OssCheckResultListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ossCheckResultListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询代答样本</p>
     * 
     * @param tmpReq QueryAnswerSampleByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAnswerSampleByPageResponse
     */
    public QueryAnswerSampleByPageResponse queryAnswerSampleByPageWithOptions(QueryAnswerSampleByPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAnswerSampleByPageShrinkRequest request = new QueryAnswerSampleByPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answer)) {
            query.put("Answer", request.answer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            query.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            query.put("Sort", request.sortShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAnswerSampleByPage"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAnswerSampleByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询代答样本</p>
     * 
     * @param request QueryAnswerSampleByPageRequest
     * @return QueryAnswerSampleByPageResponse
     */
    public QueryAnswerSampleByPageResponse queryAnswerSampleByPage(QueryAnswerSampleByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAnswerSampleByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Callback Configuration</p>
     * 
     * @param request QueryCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallbackResponse
     */
    public QueryCallbackResponse queryCallbackWithOptions(QueryCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkForOss)) {
            body.put("CheckForOss", request.checkForOss);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Callback Configuration</p>
     * 
     * @param request QueryCallbackRequest
     * @return QueryCallbackResponse
     */
    public QueryCallbackResponse queryCallback(QueryCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Paginated Query of Message Notification List</p>
     * 
     * @param request QueryCallbackByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallbackByPageResponse
     */
    public QueryCallbackByPageResponse queryCallbackByPageWithOptions(QueryCallbackByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallbackByPage"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallbackByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Paginated Query of Message Notification List</p>
     * 
     * @param request QueryCallbackByPageRequest
     * @return QueryCallbackByPageResponse
     */
    public QueryCallbackByPageResponse queryCallbackByPage(QueryCallbackByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallbackByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止在线测试</p>
     * 
     * @param request StopOnlineTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOnlineTestResponse
     */
    public StopOnlineTestResponse stopOnlineTestWithOptions(StopOnlineTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOnlineTest"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopOnlineTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止在线测试</p>
     * 
     * @param request StopOnlineTestRequest
     * @return StopOnlineTestResponse
     */
    public StopOnlineTestResponse stopOnlineTest(StopOnlineTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopOnlineTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Evidence Backup Configuration</p>
     * 
     * @param request UpdateBackupConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupConfigResponse
     */
    public UpdateBackupConfigResponse updateBackupConfigWithOptions(UpdateBackupConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupConfig)) {
            query.put("BackupConfig", request.backupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackupConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Evidence Backup Configuration</p>
     * 
     * @param request UpdateBackupConfigRequest
     * @return UpdateBackupConfigResponse
     */
    public UpdateBackupConfigResponse updateBackupConfig(UpdateBackupConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBackupConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Image Library</p>
     * 
     * @param request UpdateImageLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageLibResponse
     */
    public UpdateImageLibResponse updateImageLibWithOptions(UpdateImageLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freeInspection)) {
            body.put("FreeInspection", request.freeInspection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            body.put("LibName", request.libName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Image Library</p>
     * 
     * @param request UpdateImageLibRequest
     * @return UpdateImageLibResponse
     */
    public UpdateImageLibResponse updateImageLib(UpdateImageLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Image Library Free Inspection Configuration</p>
     * 
     * @param tmpReq UpdateImageLibFreeInspectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageLibFreeInspectionResponse
     */
    public UpdateImageLibFreeInspectionResponse updateImageLibFreeInspectionWithOptions(UpdateImageLibFreeInspectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateImageLibFreeInspectionShrinkRequest request = new UpdateImageLibFreeInspectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageLibFreeInspection"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageLibFreeInspectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Image Library Free Inspection Configuration</p>
     * 
     * @param request UpdateImageLibFreeInspectionRequest
     * @return UpdateImageLibFreeInspectionResponse
     */
    public UpdateImageLibFreeInspectionResponse updateImageLibFreeInspection(UpdateImageLibFreeInspectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageLibFreeInspectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Keyword Library</p>
     * 
     * @param request UpdateKeywordLibRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKeywordLibResponse
     */
    public UpdateKeywordLibResponse updateKeywordLibWithOptions(UpdateKeywordLibRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.libId)) {
            body.put("LibId", request.libId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.libName)) {
            body.put("LibName", request.libName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKeywordLib"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKeywordLibResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Keyword Library</p>
     * 
     * @param request UpdateKeywordLibRequest
     * @return UpdateKeywordLibResponse
     */
    public UpdateKeywordLibResponse updateKeywordLib(UpdateKeywordLibRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKeywordLibWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量反馈任务</p>
     * 
     * @param request UpdateOssCheckResultsBatchFeedbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssCheckResultsBatchFeedbackResponse
     */
    public UpdateOssCheckResultsBatchFeedbackResponse updateOssCheckResultsBatchFeedbackWithOptions(UpdateOssCheckResultsBatchFeedbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            query.put("ParentTaskId", request.parentTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssCheckResultsBatchFeedback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOssCheckResultsBatchFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量反馈任务</p>
     * 
     * @param request UpdateOssCheckResultsBatchFeedbackRequest
     * @return UpdateOssCheckResultsBatchFeedbackResponse
     */
    public UpdateOssCheckResultsBatchFeedbackResponse updateOssCheckResultsBatchFeedback(UpdateOssCheckResultsBatchFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOssCheckResultsBatchFeedbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>oss结果反馈</p>
     * 
     * @param request UpdateOssCheckResultsFeedBackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssCheckResultsFeedBackResponse
     */
    public UpdateOssCheckResultsFeedBackResponse updateOssCheckResultsFeedBackWithOptions(UpdateOssCheckResultsFeedBackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRequestId)) {
            query.put("QueryRequestId", request.queryRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssCheckResultsFeedBack"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOssCheckResultsFeedBackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>oss结果反馈</p>
     * 
     * @param request UpdateOssCheckResultsFeedBackRequest
     * @return UpdateOssCheckResultsFeedBackResponse
     */
    public UpdateOssCheckResultsFeedBackResponse updateOssCheckResultsFeedBack(UpdateOssCheckResultsFeedBackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOssCheckResultsFeedBackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量冻结任务</p>
     * 
     * @param request UpdateOssCheckResultsFreezeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssCheckResultsFreezeResponse
     */
    public UpdateOssCheckResultsFreezeResponse updateOssCheckResultsFreezeWithOptions(UpdateOssCheckResultsFreezeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeItems)) {
            query.put("FreezeItems", request.freezeItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeRestorePath)) {
            query.put("FreezeRestorePath", request.freezeRestorePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeType)) {
            query.put("FreezeType", request.freezeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssCheckResultsFreeze"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOssCheckResultsFreezeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量冻结任务</p>
     * 
     * @param request UpdateOssCheckResultsFreezeRequest
     * @return UpdateOssCheckResultsFreezeResponse
     */
    public UpdateOssCheckResultsFreezeResponse updateOssCheckResultsFreeze(UpdateOssCheckResultsFreezeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOssCheckResultsFreezeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量解冻任务</p>
     * 
     * @param request UpdateOssCheckResultsUnfreezeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssCheckResultsUnfreezeResponse
     */
    public UpdateOssCheckResultsUnfreezeResponse updateOssCheckResultsUnfreezeWithOptions(UpdateOssCheckResultsUnfreezeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freezeItems)) {
            query.put("FreezeItems", request.freezeItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssCheckResultsUnfreeze"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOssCheckResultsUnfreezeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量解冻任务</p>
     * 
     * @param request UpdateOssCheckResultsUnfreezeRequest
     * @return UpdateOssCheckResultsUnfreezeResponse
     */
    public UpdateOssCheckResultsUnfreezeResponse updateOssCheckResultsUnfreeze(UpdateOssCheckResultsUnfreezeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOssCheckResultsUnfreezeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Feedback on Scan Results</p>
     * 
     * @param request UpdateScanResultFeedbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScanResultFeedbackResponse
     */
    public UpdateScanResultFeedbackResponse updateScanResultFeedbackWithOptions(UpdateScanResultFeedbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            body.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRequestId)) {
            body.put("QueryRequestId", request.queryRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScanResultFeedback"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScanResultFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Feedback on Scan Results</p>
     * 
     * @param request UpdateScanResultFeedbackRequest
     * @return UpdateScanResultFeedbackResponse
     */
    public UpdateScanResultFeedbackResponse updateScanResultFeedback(UpdateScanResultFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScanResultFeedbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceConfigResponse
     */
    public UpdateServiceConfigResponse updateServiceConfigWithOptions(UpdateServiceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileConfig)) {
            body.put("FileConfig", request.fileConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordFilterLibs)) {
            body.put("KeywordFilterLibs", request.keywordFilterLibs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordHitLibs)) {
            body.put("KeywordHitLibs", request.keywordHitLibs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manualMachineConfig)) {
            body.put("ManualMachineConfig", request.manualMachineConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneConfig)) {
            body.put("SceneConfig", request.sceneConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConfig)) {
            body.put("ServiceConfig", request.serviceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoConfig)) {
            body.put("VideoConfig", request.videoConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceConfig"),
            new TeaPair("version", "2022-09-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新服务</p>
     * 
     * @param request UpdateServiceConfigRequest
     * @return UpdateServiceConfigResponse
     */
    public UpdateServiceConfigResponse updateServiceConfig(UpdateServiceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceConfigWithOptions(request, runtime);
    }
}
