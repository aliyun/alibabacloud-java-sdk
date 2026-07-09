// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511;

import com.aliyun.tea.*;
import com.aliyun.aideepsign20260511.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aideepsign", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an asynchronous image detection task that supports automatic classification, AIGC detection, and tampering detection.</li>
     * <li>You must specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>. If both are specified, <code>ObjectKey</code> takes precedence.</li>
     * <li>If you set <code>DetectType</code> to <code>auto</code>, the system automatically determines whether to perform AIGC detection or tampering detection based on the image content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous image detection task that supports AIGC and tampering detection.</p>
     * 
     * @param request CreateImageDetectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageDetectionTaskResponse
     */
    public CreateImageDetectionTaskResponse createImageDetectionTaskWithOptions(CreateImageDetectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credType)) {
            query.put("CredType", request.credType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectType)) {
            query.put("DetectType", request.detectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageDetectionTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageDetectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an asynchronous image detection task that supports automatic classification, AIGC detection, and tampering detection.</li>
     * <li>You must specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>. If both are specified, <code>ObjectKey</code> takes precedence.</li>
     * <li>If you set <code>DetectType</code> to <code>auto</code>, the system automatically determines whether to perform AIGC detection or tampering detection based on the image content.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous image detection task that supports AIGC and tampering detection.</p>
     * 
     * @param request CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    public CreateImageDetectionTaskResponse createImageDetectionTask(CreateImageDetectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageDetectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an AI image generation task. The system generates images based on the positive prompt provided by the user.</li>
     * <li>You can configure parameters such as negative prompt, model, and image size to optimize the generation results.</li>
     * <li>By default, generated images are automatically embedded with a C2PA digital signature. You can optionally add a watermark in the lower-right corner.</li>
     * <li>Set the ClientToken parameter to ensure the idempotence of the request and guarantee uniqueness across different requests.</li>
     * <li>After the task is created, call the GetImageTaskResult operation with the TaskId to query the generation results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates images based on a provided text description and returns a task ID.</p>
     * 
     * @param request CreateImageTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageTaskResponse
     */
    public CreateImageTaskResponse createImageTaskWithOptions(CreateImageTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.n)) {
            query.put("N", request.n);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.negativePrompt)) {
            query.put("NegativePrompt", request.negativePrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptExtend)) {
            query.put("PromptExtend", request.promptExtend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            query.put("Seed", request.seed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an AI image generation task. The system generates images based on the positive prompt provided by the user.</li>
     * <li>You can configure parameters such as negative prompt, model, and image size to optimize the generation results.</li>
     * <li>By default, generated images are automatically embedded with a C2PA digital signature. You can optionally add a watermark in the lower-right corner.</li>
     * <li>Set the ClientToken parameter to ensure the idempotence of the request and guarantee uniqueness across different requests.</li>
     * <li>After the task is created, call the GetImageTaskResult operation with the TaskId to query the generation results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates images based on a provided text description and returns a task ID.</p>
     * 
     * @param request CreateImageTaskRequest
     * @return CreateImageTaskResponse
     */
    public CreateImageTaskResponse createImageTask(CreateImageTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an image sensitive information scan task. The system performs sensitive data identification on the specified image.</li>
     * <li>You can specify the image to scan by using an image URL or an OSS ObjectKey.</li>
     * <li>The image size cannot exceed 10 MB.</li>
     * <li>You must specify at least one of ImageUrl and ObjectKey. If both are specified, ObjectKey takes precedence.</li>
     * <li>When you use ObjectKey, make sure that the key belongs to the namespace of the current caller. Cross-tenant access is not allowed.</li>
     * <li>You can use the ClientToken parameter to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image sensitive information scan task and returns the task ID.</p>
     * 
     * @param request CreateSensitiveScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSensitiveScanTaskResponse
     */
    public CreateSensitiveScanTaskResponse createSensitiveScanTaskWithOptions(CreateSensitiveScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSensitiveScanTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSensitiveScanTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an image sensitive information scan task. The system performs sensitive data identification on the specified image.</li>
     * <li>You can specify the image to scan by using an image URL or an OSS ObjectKey.</li>
     * <li>The image size cannot exceed 10 MB.</li>
     * <li>You must specify at least one of ImageUrl and ObjectKey. If both are specified, ObjectKey takes precedence.</li>
     * <li>When you use ObjectKey, make sure that the key belongs to the namespace of the current caller. Cross-tenant access is not allowed.</li>
     * <li>You can use the ClientToken parameter to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image sensitive information scan task and returns the task ID.</p>
     * 
     * @param request CreateSensitiveScanTaskRequest
     * @return CreateSensitiveScanTaskResponse
     */
    public CreateSensitiveScanTaskResponse createSensitiveScanTask(CreateSensitiveScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSensitiveScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation detects whether a specified image is AI-generated content (AIGC). You can specify the image to detect by using an image URL or an OSS ObjectKey.</li>
     * <li>You must provide at least one of ImageUrl and ObjectKey. If both are provided, ObjectKey takes precedence.</li>
     * <li>When you use the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>This is a synchronous operation suitable for real-time detection of a single image. To perform asynchronous detection or credential detection at the same time, use the CreateImageDetectionTask operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Determines whether an image is AI-generated and returns detection labels and confidence levels.</p>
     * 
     * @param request DetectAigcImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectAigcImageResponse
     */
    public DetectAigcImageResponse detectAigcImageWithOptions(DetectAigcImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectAigcImage"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectAigcImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation detects whether a specified image is AI-generated content (AIGC). You can specify the image to detect by using an image URL or an OSS ObjectKey.</li>
     * <li>You must provide at least one of ImageUrl and ObjectKey. If both are provided, ObjectKey takes precedence.</li>
     * <li>When you use the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>This is a synchronous operation suitable for real-time detection of a single image. To perform asynchronous detection or credential detection at the same time, use the CreateImageDetectionTask operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Determines whether an image is AI-generated and returns detection labels and confidence levels.</p>
     * 
     * @param request DetectAigcImageRequest
     * @return DetectAigcImageResponse
     */
    public DetectAigcImageResponse detectAigcImage(DetectAigcImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectAigcImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation detects and returns basic information about an image, including but not limited to the file name, image format (such as JPEG or PNG), file size, and resolution.</li>
     * <li>You can specify the image to detect by providing an image URL or an OSS ObjectKey. If both ImageUrl and ObjectKey are provided, ObjectKey takes precedence.</li>
     * <li>When using ObjectKey, ensure that the object belongs to the namespace of the current caller. Cross-tenant access is not allowed.</li>
     * <li>The optional parameter ClientToken ensures the idempotence of the request. Generate a new unique value for each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves basic information about a specified image, such as the file name, format, size, and resolution.</p>
     * 
     * @param request DetectImageBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageBasicInfoResponse
     */
    public DetectImageBasicInfoResponse detectImageBasicInfoWithOptions(DetectImageBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageBasicInfo"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageBasicInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation detects and returns basic information about an image, including but not limited to the file name, image format (such as JPEG or PNG), file size, and resolution.</li>
     * <li>You can specify the image to detect by providing an image URL or an OSS ObjectKey. If both ImageUrl and ObjectKey are provided, ObjectKey takes precedence.</li>
     * <li>When using ObjectKey, ensure that the object belongs to the namespace of the current caller. Cross-tenant access is not allowed.</li>
     * <li>The optional parameter ClientToken ensures the idempotence of the request. Generate a new unique value for each request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves basic information about a specified image, such as the file name, format, size, and resolution.</p>
     * 
     * @param request DetectImageBasicInfoRequest
     * @return DetectImageBasicInfoResponse
     */
    public DetectImageBasicInfoResponse detectImageBasicInfo(DetectImageBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Call this operation to query the execution status and results of an asynchronous detection task created by <code>CreateImageDetectionTask</code>. Poll at intervals of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Use a valid <code>TaskId</code> for the query.</li>
     * <li>If the task is not complete, increase the polling interval to avoid unnecessary resource consumption caused by frequent requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of an image detection task, including AIGC detection labels and tamper detection results.</p>
     * 
     * @param request GetImageDetectionTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageDetectionTaskResultResponse
     */
    public GetImageDetectionTaskResultResponse getImageDetectionTaskResultWithOptions(GetImageDetectionTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageDetectionTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageDetectionTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Call this operation to query the execution status and results of an asynchronous detection task created by <code>CreateImageDetectionTask</code>. Poll at intervals of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Use a valid <code>TaskId</code> for the query.</li>
     * <li>If the task is not complete, increase the polling interval to avoid unnecessary resource consumption caused by frequent requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of an image detection task, including AIGC detection labels and tamper detection results.</p>
     * 
     * @param request GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    public GetImageDetectionTaskResultResponse getImageDetectionTaskResult(GetImageDetectionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageDetectionTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous image generation task created by <code>CreateImageTask</code>.</li>
     * <li>Poll at intervals of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * <li>The image download URL (Url) returned after the task succeeds is a pre-signed URL that is valid for 1 hour.</li>
     * <li>To ensure idempotence of the request, set the <code>ClientToken</code> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an asynchronous image generation task and retrieves the image download URL.</p>
     * 
     * @param request GetImageTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageTaskResultResponse
     */
    public GetImageTaskResultResponse getImageTaskResultWithOptions(GetImageTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous image generation task created by <code>CreateImageTask</code>.</li>
     * <li>Poll at intervals of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * <li>The image download URL (Url) returned after the task succeeds is a pre-signed URL that is valid for 1 hour.</li>
     * <li>To ensure idempotence of the request, set the <code>ClientToken</code> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an asynchronous image generation task and retrieves the image download URL.</p>
     * 
     * @param request GetImageTaskResultRequest
     * @return GetImageTaskResultResponse
     */
    public GetImageTaskResultResponse getImageTaskResult(GetImageTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of a sensitive information scan task created by <code>CreateSensitiveScanTask</code>.</li>
     * <li>Poll at intervals of 3 to 5 seconds until the task status changes to <code>completed</code> or <code>terminated</code>.</li>
     * <li>The <code>ClientToken</code> parameter ensures the idempotence of the request. It is generated by the client, must be unique across different requests, supports ASCII characters, and cannot exceed 64 characters in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of a sensitive information scan task and returns the details of the sensitive data discovered during the scan.</p>
     * 
     * @param request GetSensitiveScanResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSensitiveScanResultResponse
     */
    public GetSensitiveScanResultResponse getSensitiveScanResultWithOptions(GetSensitiveScanResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSensitiveScanResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSensitiveScanResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of a sensitive information scan task created by <code>CreateSensitiveScanTask</code>.</li>
     * <li>Poll at intervals of 3 to 5 seconds until the task status changes to <code>completed</code> or <code>terminated</code>.</li>
     * <li>The <code>ClientToken</code> parameter ensures the idempotence of the request. It is generated by the client, must be unique across different requests, supports ASCII characters, and cannot exceed 64 characters in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of a sensitive information scan task and returns the details of the sensitive data discovered during the scan.</p>
     * 
     * @param request GetSensitiveScanResultRequest
     * @return GetSensitiveScanResultResponse
     */
    public GetSensitiveScanResultResponse getSensitiveScanResult(GetSensitiveScanResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSensitiveScanResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>. If both are specified, <code>ObjectKey</code> takes precedence.</li>
     * <li>When you use <code>ObjectKey</code>, the system verifies that the <code>ObjectKey</code> belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>Supported image formats are JPEG and PNG. Unsupported formats return the <code>C2PA_FORMAT_UNSUPPORTED</code> error.</li>
     * <li>If the original image already contains a C2PA signature, the system retains the original signature as an ingredient and appends a new signature.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. Make sure the value is unique across different requests and does not exceed 64 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Embeds a C2PA digital signature into a user-uploaded image and returns the download URL.</p>
     * 
     * @param request SignUserImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignUserImageResponse
     */
    public SignUserImageResponse signUserImageWithOptions(SignUserImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignUserImage"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignUserImageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>. If both are specified, <code>ObjectKey</code> takes precedence.</li>
     * <li>When you use <code>ObjectKey</code>, the system verifies that the <code>ObjectKey</code> belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>Supported image formats are JPEG and PNG. Unsupported formats return the <code>C2PA_FORMAT_UNSUPPORTED</code> error.</li>
     * <li>If the original image already contains a C2PA signature, the system retains the original signature as an ingredient and appends a new signature.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. Make sure the value is unique across different requests and does not exceed 64 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Embeds a C2PA digital signature into a user-uploaded image and returns the download URL.</p>
     * 
     * @param request SignUserImageRequest
     * @return SignUserImageResponse
     */
    public SignUserImageResponse signUserImage(SignUserImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signUserImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation verifies the C2PA digital signature embedded in an image and returns the signature verification status, issuer trustworthiness, issuer information, and the complete content credentials manifest.</li>
     * <li>You can specify the image to verify by using an image URL or an OSS ObjectKey. If both ImageUrl and ObjectKey are provided, ObjectKey takes precedence.</li>
     * <li>When you use the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>To ensure request idempotency, provide the ClientToken parameter. Ensure that the value is unique across different requests and does not exceed 64 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the C2PA digital signature in an image and returns the signature status and issuer information.</p>
     * 
     * @param request VerifyImageSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyImageSignatureResponse
     */
    public VerifyImageSignatureResponse verifyImageSignatureWithOptions(VerifyImageSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyImageSignature"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyImageSignatureResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation verifies the C2PA digital signature embedded in an image and returns the signature verification status, issuer trustworthiness, issuer information, and the complete content credentials manifest.</li>
     * <li>You can specify the image to verify by using an image URL or an OSS ObjectKey. If both ImageUrl and ObjectKey are provided, ObjectKey takes precedence.</li>
     * <li>When you use the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>To ensure request idempotency, provide the ClientToken parameter. Ensure that the value is unique across different requests and does not exceed 64 characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the C2PA digital signature in an image and returns the signature status and issuer information.</p>
     * 
     * @param request VerifyImageSignatureRequest
     * @return VerifyImageSignatureResponse
     */
    public VerifyImageSignatureResponse verifyImageSignature(VerifyImageSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyImageSignatureWithOptions(request, runtime);
    }
}
