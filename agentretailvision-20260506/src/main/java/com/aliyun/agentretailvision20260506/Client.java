// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506;

import com.aliyun.tea.*;
import com.aliyun.agentretailvision20260506.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentretailvision", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>商品导入</p>
     * 
     * @param tmpReq ImportProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportProductsResponse
     */
    public ImportProductsResponse importProductsWithOptions(ImportProductsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportProductsShrinkRequest request = new ImportProductsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraImages)) {
            request.extraImagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraImages, "ExtraImages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mainImage)) {
            request.mainImageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mainImage, "MainImage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.multiViewImages)) {
            request.multiViewImagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.multiViewImages, "MultiViewImages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraImagesShrink)) {
            query.put("ExtraImages", request.extraImagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTitle)) {
            query.put("ImageTitle", request.imageTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemUniqueId)) {
            query.put("ItemUniqueId", request.itemUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainImageShrink)) {
            query.put("MainImage", request.mainImageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiViewImagesShrink)) {
            query.put("MultiViewImages", request.multiViewImagesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportProducts"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商品导入</p>
     * 
     * @param request ImportProductsRequest
     * @return ImportProductsResponse
     */
    public ImportProductsResponse importProducts(ImportProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务状态</p>
     * 
     * @param request QueryRecognitionResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecognitionResultResponse
     */
    public QueryRecognitionResultResponse queryRecognitionResultWithOptions(QueryRecognitionResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderUniqueId)) {
            query.put("OrderUniqueId", request.orderUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecognitionResult"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecognitionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务状态</p>
     * 
     * @param request QueryRecognitionResultRequest
     * @return QueryRecognitionResultResponse
     */
    public QueryRecognitionResultResponse queryRecognitionResult(QueryRecognitionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognitionResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>购物识别</p>
     * 
     * @param tmpReq RecognizeOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeOrderResponse
     */
    public RecognizeOrderResponse recognizeOrderWithOptions(RecognizeOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeOrderShrinkRequest request = new RecognizeOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.candidateItems)) {
            request.candidateItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.candidateItems, "CandidateItems", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoUrls)) {
            request.videoUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoUrls, "VideoUrls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.candidateItemsShrink)) {
            query.put("CandidateItems", request.candidateItemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderUniqueId)) {
            query.put("OrderUniqueId", request.orderUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUrlsShrink)) {
            query.put("VideoUrls", request.videoUrlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeOrder"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>购物识别</p>
     * 
     * @param request RecognizeOrderRequest
     * @return RecognizeOrderResponse
     */
    public RecognizeOrderResponse recognizeOrder(RecognizeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Webhook注册</p>
     * 
     * @param request RegisterWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterWebhookResponse
     */
    public RegisterWebhookResponse registerWebhookWithOptions(RegisterWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackSecret)) {
            query.put("CallbackSecret", request.callbackSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterWebhook"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Webhook注册</p>
     * 
     * @param request RegisterWebhookRequest
     * @return RegisterWebhookResponse
     */
    public RegisterWebhookResponse registerWebhook(RegisterWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商品更新</p>
     * 
     * @param tmpReq UpdateProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProductShrinkRequest request = new UpdateProductShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraImages)) {
            request.extraImagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraImages, "ExtraImages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mainImage)) {
            request.mainImageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mainImage, "MainImage", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.multiViewImages)) {
            request.multiViewImagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.multiViewImages, "MultiViewImages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraImagesShrink)) {
            query.put("ExtraImages", request.extraImagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTitle)) {
            query.put("ImageTitle", request.imageTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemUniqueId)) {
            query.put("ItemUniqueId", request.itemUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainImageShrink)) {
            query.put("MainImage", request.mainImageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiViewImagesShrink)) {
            query.put("MultiViewImages", request.multiViewImagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformItemId)) {
            query.put("PlatformItemId", request.platformItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduct"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>商品更新</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }
}
