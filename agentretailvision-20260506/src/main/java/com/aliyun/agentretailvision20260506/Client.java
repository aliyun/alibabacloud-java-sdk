// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506;

import com.aliyun.tea.*;
import com.aliyun.agentretailvision20260506.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "agentretailvision.cn-beijing.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When <code>groupType=1</code>, <code>platformItemIdList</code> must contain only one element.</li>
     * <li>When <code>groupType=2</code>, <code>platformItemIdList</code> can contain 1 to 10 elements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a composite image for single-item multi-image or multi-item scenarios.</p>
     * 
     * @param tmpReq GenerateGroupImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateGroupImageResponse
     */
    public GenerateGroupImageResponse generateGroupImageWithOptions(GenerateGroupImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateGroupImageShrinkRequest request = new GenerateGroupImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.platformItemIdList)) {
            request.platformItemIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.platformItemIdList, "PlatformItemIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackSecret)) {
            query.put("CallbackSecret", request.callbackSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformItemIdListShrink)) {
            query.put("PlatformItemIdList", request.platformItemIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateGroupImage"),
            new TeaPair("version", "2026-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateGroupImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>When <code>groupType=1</code>, <code>platformItemIdList</code> must contain only one element.</li>
     * <li>When <code>groupType=2</code>, <code>platformItemIdList</code> can contain 1 to 10 elements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a composite image for single-item multi-image or multi-item scenarios.</p>
     * 
     * @param request GenerateGroupImageRequest
     * @return GenerateGroupImageResponse
     */
    public GenerateGroupImageResponse generateGroupImage(GenerateGroupImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateGroupImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used to add product information.</li>
     * <li>After you import products to the product library, they are stored in Alibaba Cloud OSS for direct recall and retrieval by the product recognition API.</li>
     * <li>You must provide at least one main image URL, and the <code>item_unique_id</code> must be unique within the same business party.</li>
     * <li>You can optionally provide multi-angle views and extra images to improve recognition accuracy.</li>
     * <li>The <code>device_id</code> field can be used to establish an association between a device and product vectors, but it is not required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds product information. After a successful import, the platform returns a globally unique platform_item_id for subsequent updates and recognition result association.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used to add product information.</li>
     * <li>After you import products to the product library, they are stored in Alibaba Cloud OSS for direct recall and retrieval by the product recognition API.</li>
     * <li>You must provide at least one main image URL, and the <code>item_unique_id</code> must be unique within the same business party.</li>
     * <li>You can optionally provide multi-angle views and extra images to improve recognition accuracy.</li>
     * <li>The <code>device_id</code> field can be used to establish an association between a device and product vectors, but it is not required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds product information. After a successful import, the platform returns a globally unique platform_item_id for subsequent updates and recognition result association.</p>
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
     * <p>At least one result retrieval method must be integrated: webhook callback or task status query. Both methods can be used simultaneously.
     *     •	If the user chooses the webhook callback method, the receiving endpoint must be prepared in advance and implemented according to the following request and response parameters.
     *     •	After the recognition task is completed, the platform will push the results to the business party based on the callback URL bound to the task.</p>
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
     * <p>At least one result retrieval method must be integrated: webhook callback or task status query. Both methods can be used simultaneously.
     *     •	If the user chooses the webhook callback method, the receiving endpoint must be prepared in advance and implemented according to the following request and response parameters.
     *     •	After the recognition task is completed, the platform will push the results to the business party based on the callback URL bound to the task.</p>
     * 
     * @param request QueryRecognitionResultRequest
     * @return QueryRecognitionResultResponse
     */
    public QueryRecognitionResultResponse queryRecognitionResult(QueryRecognitionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognitionResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>The user must provide <code>caller_uid</code> and <code>order_unique_id</code> as required parameters.</li>
     * <li>The <code>video_urls</code> parameter supports video files in mp4, avi, mov, and mkv formats, with a size limit of 100 MB, a duration of no more than 3 minutes, a resolution between 480p and 1080p, and specific aspect ratio requirements.</li>
     * <li>At least one of <code>device_id</code> or <code>candidate_items</code> must be provided to specify the recognition scope. If both are provided, the system first filters by the device product library and then further filters based on the candidate items list.</li>
     * <li>Optionally, the user can specify a <code>callback_url</code> to receive notifications of the recognition results. If not provided, the pre-registered default webhook address is used.</li>
     * <li>If a request is submitted repeatedly with the same <code>order_unique_id</code>, the system directly returns the previously existing task status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Used for intelligent recognition scenarios. Requires uploading the OSS address of shopping videos. The platform creates an asynchronous recognition task and immediately returns a task_id. Notifications are sent via webhook, and the results need to be actively retrieved through the query API.</p>
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
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>The user must provide <code>caller_uid</code> and <code>order_unique_id</code> as required parameters.</li>
     * <li>The <code>video_urls</code> parameter supports video files in mp4, avi, mov, and mkv formats, with a size limit of 100 MB, a duration of no more than 3 minutes, a resolution between 480p and 1080p, and specific aspect ratio requirements.</li>
     * <li>At least one of <code>device_id</code> or <code>candidate_items</code> must be provided to specify the recognition scope. If both are provided, the system first filters by the device product library and then further filters based on the candidate items list.</li>
     * <li>Optionally, the user can specify a <code>callback_url</code> to receive notifications of the recognition results. If not provided, the pre-registered default webhook address is used.</li>
     * <li>If a request is submitted repeatedly with the same <code>order_unique_id</code>, the system directly returns the previously existing task status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Used for intelligent recognition scenarios. Requires uploading the OSS address of shopping videos. The platform creates an asynchronous recognition task and immediately returns a task_id. Notifications are sent via webhook, and the results need to be actively retrieved through the query API.</p>
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
     * <p>Registers or updates the default webhook callback URL.</p>
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
     * <p>Registers or updates the default webhook callback URL.</p>
     * 
     * @param request RegisterWebhookRequest
     * @return RegisterWebhookResponse
     */
    public RegisterWebhookResponse registerWebhook(RegisterWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerWebhookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The platform_item_id parameter is used as the primary identifier for the update.</li>
     * <li>If both platform_item_id and item_unique_id are specified, they must point to the same item.</li>
     * <li>The item title (image_title) and the list of main image URLs (main_image) are required. The main_image parameter must contain at least one image.</li>
     * <li>Optional parameters include the multi-angle image list (multi_view_images), the list of additional image URLs (extra_images), and the device ID (device_id).</li>
     * <li>In multi_view_images, each object must contain the image OSS address (url) and the shooting angle (angle). Valid values of angle: top view (up), bottom view (down), left view (left), right view (right), front view (front), and back view (back).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of an existing item on the platform.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The platform_item_id parameter is used as the primary identifier for the update.</li>
     * <li>If both platform_item_id and item_unique_id are specified, they must point to the same item.</li>
     * <li>The item title (image_title) and the list of main image URLs (main_image) are required. The main_image parameter must contain at least one image.</li>
     * <li>Optional parameters include the multi-angle image list (multi_view_images), the list of additional image URLs (extra_images), and the device ID (device_id).</li>
     * <li>In multi_view_images, each object must contain the image OSS address (url) and the shooting angle (angle). Valid values of angle: top view (up), bottom view (down), left view (left), right view (right), front view (front), and back view (back).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of an existing item on the platform.</p>
     * 
     * @param request UpdateProductRequest
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }
}
