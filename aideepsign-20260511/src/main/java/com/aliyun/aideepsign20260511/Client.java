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
     * <li>This operation stops a batch trusted signing task for a bucket owned by the currently authenticated account. TaskId is the parent task ID of the bucket returned by CreateC2paBucketSignTask.</li>
     * <li>When the returned Status is <code>CANCELING</code>, the task is completing the stop process. Repeated requests may return the completed <code>CANCELED</code> status.</li>
     * <li>Call GetC2paSignResult to query the task status and final result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a batch C2PA trusted signing task for a specified OSS bucket.</p>
     * 
     * @param request CancelC2paBucketSignTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelC2paBucketSignTaskResponse
     */
    public CancelC2paBucketSignTaskResponse cancelC2paBucketSignTaskWithOptions(CancelC2paBucketSignTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelC2paBucketSignTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelC2paBucketSignTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation stops a batch trusted signing task for a bucket owned by the currently authenticated account. TaskId is the parent task ID of the bucket returned by CreateC2paBucketSignTask.</li>
     * <li>When the returned Status is <code>CANCELING</code>, the task is completing the stop process. Repeated requests may return the completed <code>CANCELED</code> status.</li>
     * <li>Call GetC2paSignResult to query the task status and final result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a batch C2PA trusted signing task for a specified OSS bucket.</p>
     * 
     * @param request CancelC2paBucketSignTaskRequest
     * @return CancelC2paBucketSignTaskResponse
     */
    public CancelC2paBucketSignTaskResponse cancelC2paBucketSignTask(CancelC2paBucketSignTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelC2paBucketSignTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a batch C2PA content credential signing task for files under a specified source prefix in an OSS bucket. It supports JPEG, JPG, PNG, MP4, FLAC, M4A, MP3, and WAV formats, and allows mixed processing under the same prefix.</li>
     * <li><code>SourcePrefix</code> must be <code>ai-deepsign/</code> or its subdirectory, and must not overlap with the output prefix <code>ai-deepsign-signed/</code>.</li>
     * <li>By default, a single task processes up to 20,000 non-directory objects. The size of a single file must not exceed 800 MiB.</li>
     * <li>The RAM identity of the caller must have permissions to call this operation. The service-linked role <code>AliyunServiceRoleForAIDeepSign</code> must have access permissions to the specified bucket and associated paths.</li>
     * <li>File name extensions are case-insensitive. Files in unsupported formats are recorded as failed, but this does not abort the processing of other files.</li>
     * <li>The signing results are written to the <code>ai-deepsign-signed/&lt;TaskId&gt;/</code> directory in the same bucket. The subdirectories relative to <code>SourcePrefix</code> and the source file name extensions are preserved, and <code>_signed</code> is added before the file name extension. The processing report is <code>c2pa_report.json</code> in the task directory.</li>
     * <li>For example, if <code>SourcePrefix=ai-deepsign/images/</code>, the signing result for the source file <code>ai-deepsign/images/audio/demo.m4a</code> is <code>ai-deepsign-signed/&lt;TaskId&gt;/audio/demo_signed.m4a</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Call <code>GetC2paSignResult</code> to query the results. A <code>SUCCEEDED</code> status for a batch task does not mean that every file was signed successfully. Check the final statistics and processing report for file-by-file results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch C2PA content credential signing task for objects in a specified OSS bucket.</p>
     * 
     * @param request CreateC2paBucketSignTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateC2paBucketSignTaskResponse
     */
    public CreateC2paBucketSignTaskResponse createC2paBucketSignTaskWithOptions(CreateC2paBucketSignTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketRegionId)) {
            query.put("BucketRegionId", request.bucketRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softwareAgent)) {
            query.put("SoftwareAgent", request.softwareAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePrefix)) {
            query.put("SourcePrefix", request.sourcePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateC2paBucketSignTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateC2paBucketSignTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a batch C2PA content credential signing task for files under a specified source prefix in an OSS bucket. It supports JPEG, JPG, PNG, MP4, FLAC, M4A, MP3, and WAV formats, and allows mixed processing under the same prefix.</li>
     * <li><code>SourcePrefix</code> must be <code>ai-deepsign/</code> or its subdirectory, and must not overlap with the output prefix <code>ai-deepsign-signed/</code>.</li>
     * <li>By default, a single task processes up to 20,000 non-directory objects. The size of a single file must not exceed 800 MiB.</li>
     * <li>The RAM identity of the caller must have permissions to call this operation. The service-linked role <code>AliyunServiceRoleForAIDeepSign</code> must have access permissions to the specified bucket and associated paths.</li>
     * <li>File name extensions are case-insensitive. Files in unsupported formats are recorded as failed, but this does not abort the processing of other files.</li>
     * <li>The signing results are written to the <code>ai-deepsign-signed/&lt;TaskId&gt;/</code> directory in the same bucket. The subdirectories relative to <code>SourcePrefix</code> and the source file name extensions are preserved, and <code>_signed</code> is added before the file name extension. The processing report is <code>c2pa_report.json</code> in the task directory.</li>
     * <li>For example, if <code>SourcePrefix=ai-deepsign/images/</code>, the signing result for the source file <code>ai-deepsign/images/audio/demo.m4a</code> is <code>ai-deepsign-signed/&lt;TaskId&gt;/audio/demo_signed.m4a</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Call <code>GetC2paSignResult</code> to query the results. A <code>SUCCEEDED</code> status for a batch task does not mean that every file was signed successfully. Check the final statistics and processing report for file-by-file results.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch C2PA content credential signing task for objects in a specified OSS bucket.</p>
     * 
     * @param request CreateC2paBucketSignTaskRequest
     * @return CreateC2paBucketSignTaskResponse
     */
    public CreateC2paBucketSignTaskResponse createC2paBucketSignTask(CreateC2paBucketSignTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createC2paBucketSignTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds standard C2PA content credentials to a single JPEG/JPG, PNG, MP4, FLAC, M4A, MP3, or WAV file.</li>
     * <li><code>FileUrl</code> must be an absolute HTTP or HTTPS URL accessible by the service and cannot contain a username or password.</li>
     * <li>File name extensions are case-insensitive, and URL query parameters are not used for file name identification. For example, the file name for <code>https://example.com/media/demo.m4a?token=xxx</code> is <code>demo.m4a</code>.</li>
     * <li>The source URL must directly return an HTTP 200 status code. Redirect URLs are not supported.</li>
     * <li>The size of a single file cannot exceed 800 MiB. Provide a valid file in a supported format. Changing only the file name extension does not transform the file format.</li>
     * <li>The signing result retains the source file name extension and adds <code>_signed</code> before the extension. For example, <code>demo.m4a</code> becomes <code>demo_signed.m4a</code>.</li>
     * <li>Unsupported file name extensions return <code>InvalidParam</code>, and the error message is <code>FileUrl only supports files with .jpg, .jpeg, .png, .mp4, .flac, .m4a, .mp3, or .wav extensions</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Save the returned <code>TaskId</code> and invoke <code>GetC2paSignResult</code> to query the task status and final result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a C2PA content credential signing task for a specified file and returns the task ID.</p>
     * 
     * @param request CreateC2paSignTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateC2paSignTaskResponse
     */
    public CreateC2paSignTaskResponse createC2paSignTaskWithOptions(CreateC2paSignTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softwareAgent)) {
            query.put("SoftwareAgent", request.softwareAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateC2paSignTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateC2paSignTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds standard C2PA content credentials to a single JPEG/JPG, PNG, MP4, FLAC, M4A, MP3, or WAV file.</li>
     * <li><code>FileUrl</code> must be an absolute HTTP or HTTPS URL accessible by the service and cannot contain a username or password.</li>
     * <li>File name extensions are case-insensitive, and URL query parameters are not used for file name identification. For example, the file name for <code>https://example.com/media/demo.m4a?token=xxx</code> is <code>demo.m4a</code>.</li>
     * <li>The source URL must directly return an HTTP 200 status code. Redirect URLs are not supported.</li>
     * <li>The size of a single file cannot exceed 800 MiB. Provide a valid file in a supported format. Changing only the file name extension does not transform the file format.</li>
     * <li>The signing result retains the source file name extension and adds <code>_signed</code> before the extension. For example, <code>demo.m4a</code> becomes <code>demo_signed.m4a</code>.</li>
     * <li>Unsupported file name extensions return <code>InvalidParam</code>, and the error message is <code>FileUrl only supports files with .jpg, .jpeg, .png, .mp4, .flac, .m4a, .mp3, or .wav extensions</code>.</li>
     * <li>A successful creation only indicates that the task has been accepted. Save the returned <code>TaskId</code> and invoke <code>GetC2paSignResult</code> to query the task status and final result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a C2PA content credential signing task for a specified file and returns the task ID.</p>
     * 
     * @param request CreateC2paSignTaskRequest
     * @return CreateC2paSignTaskResponse
     */
    public CreateC2paSignTaskResponse createC2paSignTask(CreateC2paSignTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createC2paSignTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation commits an image to the server for defect detection, including but not limited to blurriness, distortion, glare, and other anomalies in the image subject.</li>
     * <li><strong>ImageUrl is required</strong> and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a></li>
     * <li>After successful commit, a node ID is returned immediately. Regardless of whether the node has been completed or is still being processed, call the GetImageDefectDetectionTaskResult operation to perform polling for the final detection result.</li>
     * <li>If a parameter fault or other issue occurs during the commit procedure, the corresponding error message is returned directly without creating a node record.</li>
     * <li>The image file size cannot exceed 10 MB. Detection is failed for images that exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image for defect detection and returns a task ID for querying results.</p>
     * 
     * @param request CreateImageDefectDetectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageDefectDetectionTaskResponse
     */
    public CreateImageDefectDetectionTaskResponse createImageDefectDetectionTaskWithOptions(CreateImageDefectDetectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageDefectDetectionTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageDefectDetectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation commits an image to the server for defect detection, including but not limited to blurriness, distortion, glare, and other anomalies in the image subject.</li>
     * <li><strong>ImageUrl is required</strong> and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a></li>
     * <li>After successful commit, a node ID is returned immediately. Regardless of whether the node has been completed or is still being processed, call the GetImageDefectDetectionTaskResult operation to perform polling for the final detection result.</li>
     * <li>If a parameter fault or other issue occurs during the commit procedure, the corresponding error message is returned directly without creating a node record.</li>
     * <li>The image file size cannot exceed 10 MB. Detection is failed for images that exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image for defect detection and returns a task ID for querying results.</p>
     * 
     * @param request CreateImageDefectDetectionTaskRequest
     * @return CreateImageDefectDetectionTaskResponse
     */
    public CreateImageDefectDetectionTaskResponse createImageDefectDetectionTask(CreateImageDefectDetectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageDefectDetectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not currently supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a>.</li>
     * <li>The <strong>DetectType</strong> parameter is deprecated. This parameter is still accepted (<code>tamper</code>/<code>aigc</code>) but does not affect the actual detection pattern. Regardless of the value passed, tampering detection is executed and <code>DetectMode=tamper</code> is returned. New callers should not pass this parameter.</li>
     * <li>The <strong>UseTamperSmallModel</strong> parameter specifies whether to use the small model. If set to <code>true</code>, the small model is used and no large model report is generated. If set to <code>false</code> or not passed, the large model is used by default and a comprehensive large model analysis report is returned.</li>
     * </ul>
     * <h2>Settings</h2>
     * <ul>
     * <li>When <strong>UseTamperSmallModel</strong> is not specified, the large model is used by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous image tampering detection task and returns the task ID.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.detectType)) {
            query.put("DetectType", request.detectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useTamperSmallModel)) {
            query.put("UseTamperSmallModel", request.useTamperSmallModel);
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
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not currently supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single object or the URLs of multiple objects</a>.</li>
     * <li>The <strong>DetectType</strong> parameter is deprecated. This parameter is still accepted (<code>tamper</code>/<code>aigc</code>) but does not affect the actual detection pattern. Regardless of the value passed, tampering detection is executed and <code>DetectMode=tamper</code> is returned. New callers should not pass this parameter.</li>
     * <li>The <strong>UseTamperSmallModel</strong> parameter specifies whether to use the small model. If set to <code>true</code>, the small model is used and no large model report is generated. If set to <code>false</code> or not passed, the large model is used by default and a comprehensive large model analysis report is returned.</li>
     * </ul>
     * <h2>Settings</h2>
     * <ul>
     * <li>When <strong>UseTamperSmallModel</strong> is not specified, the large model is used by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous image tampering detection task and returns the task ID.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL (the server needs to download the image).</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more files?</a></li>
     * <li>The image file size cannot exceed 10 MB. Detection of images that exceed this limit will be failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a personal income tax record screenshot for forgery detection and returns a task ID.</p>
     * 
     * @param request CreateImageIncomeTaxDetectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageIncomeTaxDetectionTaskResponse
     */
    public CreateImageIncomeTaxDetectionTaskResponse createImageIncomeTaxDetectionTaskWithOptions(CreateImageIncomeTaxDetectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageIncomeTaxDetectionTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageIncomeTaxDetectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL (the server needs to download the image).</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more files?</a></li>
     * <li>The image file size cannot exceed 10 MB. Detection of images that exceed this limit will be failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a personal income tax record screenshot for forgery detection and returns a task ID.</p>
     * 
     * @param request CreateImageIncomeTaxDetectionTaskRequest
     * @return CreateImageIncomeTaxDetectionTaskResponse
     */
    public CreateImageIncomeTaxDetectionTaskResponse createImageIncomeTaxDetectionTask(CreateImageIncomeTaxDetectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageIncomeTaxDetectionTaskWithOptions(request, runtime);
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
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>The size of the image uploaded by using ImageUrl cannot exceed 10 MB.</li>
     * <li>The optional parameter <strong>ClientToken</strong> ensures the idempotence of the request. The client generates this parameter value, which must be unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters.</li>
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
     * <li><strong>ImageUrl</strong> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External images are not supported. Only image URLs accessible from the Chinese mainland public network are supported. Upload images to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>The size of the image uploaded by using ImageUrl cannot exceed 10 MB.</li>
     * <li>The optional parameter <strong>ClientToken</strong> ensures the idempotence of the request. The client generates this parameter value, which must be unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters.</li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation creates an AI video generation task. The system generates a video based on the positive prompt provided by the user.</li>
     * <li>By default, the generated video is automatically embedded with a C2PA digital signature.</li>
     * <li>After creating the task, use the <code>TaskId</code> to call the <code>GetVideoTaskResult</code> operation to query the generation result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a video generation task.</p>
     * 
     * @param request CreateVideoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoTaskResponse
     */
    public CreateVideoTaskResponse createVideoTaskWithOptions(CreateVideoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptExtend)) {
            query.put("PromptExtend", request.promptExtend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratio)) {
            query.put("Ratio", request.ratio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seed)) {
            query.put("Seed", request.seed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.media)) {
            query.put("Media", request.media);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation creates an AI video generation task. The system generates a video based on the positive prompt provided by the user.</li>
     * <li>By default, the generated video is automatically embedded with a C2PA digital signature.</li>
     * <li>After creating the task, use the <code>TaskId</code> to call the <code>GetVideoTaskResult</code> operation to query the generation result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a video generation task.</p>
     * 
     * @param request CreateVideoTaskRequest
     * @return CreateVideoTaskResponse
     */
    public CreateVideoTaskResponse createVideoTask(CreateVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible over the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud Object Storage Service (OSS) bucket in a Chinese mainland region first, and then use the presigned URL of the file as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType</strong> must match the actual file type. The same value must be specified during both embedding and fetch.</li>
     * <li>Supported file specifications: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must be no larger than 100 MB.</li>
     * <li>The task completion time is approximately equal to the file duration. For example, embedding a 10-second video takes about 10 seconds.</li>
     * <li>If the submission fails, no task record is created and a synchronous error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image or video file for invisible watermark embedding and returns a task ID for querying the result.</p>
     * 
     * @param request CreateWatermarkEmbedTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWatermarkEmbedTaskResponse
     */
    public CreateWatermarkEmbedTaskResponse createWatermarkEmbedTaskWithOptions(CreateWatermarkEmbedTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserved)) {
            query.put("Reserved", request.reserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkContent)) {
            query.put("WatermarkContent", request.watermarkContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWatermarkEmbedTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWatermarkEmbedTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible over the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud Object Storage Service (OSS) bucket in a Chinese mainland region first, and then use the presigned URL of the file as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType</strong> must match the actual file type. The same value must be specified during both embedding and fetch.</li>
     * <li>Supported file specifications: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must be no larger than 100 MB.</li>
     * <li>The task completion time is approximately equal to the file duration. For example, embedding a 10-second video takes about 10 seconds.</li>
     * <li>If the submission fails, no task record is created and a synchronous error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image or video file for invisible watermark embedding and returns a task ID for querying the result.</p>
     * 
     * @param request CreateWatermarkEmbedTaskRequest
     * @return CreateWatermarkEmbedTaskResponse
     */
    public CreateWatermarkEmbedTaskResponse createWatermarkEmbedTask(CreateWatermarkEmbedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWatermarkEmbedTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible from the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the presigned URL of the file as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType must be the same as the one used during embedding</strong>: Make sure that the file type (image or video) for extraction is the same as the file type used when the watermark was embedded.</li>
     * <li><strong>File specification limits</strong>: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must also be no larger than 100 MB.</li>
     * <li><strong>Processing time</strong>: Approximately equal to the actual playback duration of the file. For example, a 10-second video takes approximately 10 seconds to complete the watermark fetch procedure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image or video file to extract a dark watermark and returns a task ID.</p>
     * 
     * @param request CreateWatermarkExtractTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWatermarkExtractTaskResponse
     */
    public CreateWatermarkExtractTaskResponse createWatermarkExtractTaskWithOptions(CreateWatermarkExtractTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserved)) {
            query.put("Reserved", request.reserved);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWatermarkExtractTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWatermarkExtractTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>FileUrl</strong> must be a publicly accessible HTTP/HTTPS URL. External files are not supported. Only file URLs accessible from the Chinese mainland public network are supported. Upload the file to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the presigned URL of the file as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * <li><strong>FileType must be the same as the one used during embedding</strong>: Make sure that the file type (image or video) for extraction is the same as the file type used when the watermark was embedded.</li>
     * <li><strong>File specification limits</strong>: Video files must be no longer than 10 minutes and no larger than 100 MB. Image files must also be no larger than 100 MB.</li>
     * <li><strong>Processing time</strong>: Approximately equal to the actual playback duration of the file. For example, a 10-second video takes approximately 10 seconds to complete the watermark fetch procedure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an image or video file to extract a dark watermark and returns a task ID.</p>
     * 
     * @param request CreateWatermarkExtractTaskRequest
     * @return CreateWatermarkExtractTaskResponse
     */
    public CreateWatermarkExtractTaskResponse createWatermarkExtractTask(CreateWatermarkExtractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWatermarkExtractTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation detects whether a specified image is AI-generated content (AIGC). You can specify the image to detect by using an image URL or an OSS ObjectKey.</li>
     * <li>You must provide at least one of ImageUrl and ObjectKey. If both are provided, ObjectKey takes precedence.</li>
     * <li>When using the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>This is a synchronous operation suitable for real-time detection of a single image. If you need asynchronous detection or credential detection at the same time, use the CreateImageDetectionTask operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Determines whether an image is AI-generated and returns detection labels with confidence scores.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation detects whether a specified image is AI-generated content (AIGC). You can specify the image to detect by using an image URL or an OSS ObjectKey.</li>
     * <li>You must provide at least one of ImageUrl and ObjectKey. If both are provided, ObjectKey takes precedence.</li>
     * <li>When using the ObjectKey method, the system verifies whether the ObjectKey belongs to the current caller. Cross-tenant access is not allowed.</li>
     * <li>This is a synchronous operation suitable for real-time detection of a single image. If you need asynchronous detection or credential detection at the same time, use the CreateImageDetectionTask operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Determines whether an image is AI-generated and returns detection labels with confidence scores.</p>
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
     * <li>This operation detects and returns basic information about an image, including but not limited to the file name, image format (such as JPEG/PNG), file size, and resolution.</li>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
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
     * <li>This operation detects and returns basic information about an image, including but not limited to the file name, image format (such as JPEG/PNG), file size, and resolution.</li>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL. Currently, only image URLs accessible from the Chinese mainland public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a Chinese mainland region first, and then use the presigned URL of the image as the input parameter for this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and final results of nodes created by using CreateC2paSignTask or CreateC2paBucketSignTask.</li>
     * <li>It supports signing node queries for images, videos, and various audio formats (FLAC, M4A, MP3, and WAV).</li>
     * <li>For BUCKET nodes, intermediate statistics information is not provided when the node is in the PROCESSING, PAUSING, PAUSED, or CANCELING state. Complete statistics information and the report location are returned only after the node enters the SUCCEEDED or CANCELED state.</li>
     * <li>A valid TaskId must be provided for the query. This ID must be the value returned when the node was created. It supports the standard UUID format and is compatible with legacy decimal node IDs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of a single-file or OSS Bucket batch C2PA signing task.</p>
     * 
     * @param request GetC2paSignResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetC2paSignResultResponse
     */
    public GetC2paSignResultResponse getC2paSignResultWithOptions(GetC2paSignResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetC2paSignResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetC2paSignResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the status and final results of nodes created by using CreateC2paSignTask or CreateC2paBucketSignTask.</li>
     * <li>It supports signing node queries for images, videos, and various audio formats (FLAC, M4A, MP3, and WAV).</li>
     * <li>For BUCKET nodes, intermediate statistics information is not provided when the node is in the PROCESSING, PAUSING, PAUSED, or CANCELING state. Complete statistics information and the report location are returned only after the node enters the SUCCEEDED or CANCELED state.</li>
     * <li>A valid TaskId must be provided for the query. This ID must be the value returned when the node was created. It supports the standard UUID format and is compatible with legacy decimal node IDs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of a single-file or OSS Bucket batch C2PA signing task.</p>
     * 
     * @param request GetC2paSignResultRequest
     * @return GetC2paSignResultResponse
     */
    public GetC2paSignResultResponse getC2paSignResult(GetC2paSignResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getC2paSignResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries the execution status and result of an image defect detection task created by <code>CreateImageDefectDetectionTask</code>. Follow these polling conventions:</p>
     * <ul>
     * <li><strong>Set the polling interval to at least 5 seconds</strong>: When the task is in the <code>running</code> state, each call to this operation triggers a real downstream query. Excessively frequent polling only increases system load and does not speed up result retrieval.</li>
     * <li><strong>Total timeout is 30 minutes</strong>: If no result is received within 30 minutes after the task is created, the server marks the task as <code>failed</code> with the message <code>poll timeout: no result within 30m0s</code>. After that, the task no longer initiates new downstream query requests.</li>
     * <li>After the task reaches the <code>succeeded</code> or <code>failed</code> desired state, subsequent calls to this operation directly return the stored result without triggering additional downstream processing.
     * Note: The content in the <code>Result</code> field may be HTML-escaped JSON data. Unescape it before parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an image defect detection task, including the abnormality score and reason.</p>
     * 
     * @param request GetImageDefectDetectionTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageDefectDetectionTaskResultResponse
     */
    public GetImageDefectDetectionTaskResultResponse getImageDefectDetectionTaskResultWithOptions(GetImageDefectDetectionTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetImageDefectDetectionTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageDefectDetectionTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries the execution status and result of an image defect detection task created by <code>CreateImageDefectDetectionTask</code>. Follow these polling conventions:</p>
     * <ul>
     * <li><strong>Set the polling interval to at least 5 seconds</strong>: When the task is in the <code>running</code> state, each call to this operation triggers a real downstream query. Excessively frequent polling only increases system load and does not speed up result retrieval.</li>
     * <li><strong>Total timeout is 30 minutes</strong>: If no result is received within 30 minutes after the task is created, the server marks the task as <code>failed</code> with the message <code>poll timeout: no result within 30m0s</code>. After that, the task no longer initiates new downstream query requests.</li>
     * <li>After the task reaches the <code>succeeded</code> or <code>failed</code> desired state, subsequent calls to this operation directly return the stored result without triggering additional downstream processing.
     * Note: The content in the <code>Result</code> field may be HTML-escaped JSON data. Unescape it before parsing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an image defect detection task, including the abnormality score and reason.</p>
     * 
     * @param request GetImageDefectDetectionTaskResultRequest
     * @return GetImageDefectDetectionTaskResultResponse
     */
    public GetImageDefectDetectionTaskResultResponse getImageDefectDetectionTaskResult(GetImageDefectDetectionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageDefectDetectionTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Call this operation to query the execution status and result of a specified image detection task, including AIGC detection labels and tamper detection results. Poll at intervals of 2 to 5 seconds until the task status changes to succeeded or failed.</p>
     * <h2>Precautions</h2>
     * <ul>
     * <li>Ensure that you use a valid TaskId for the query.</li>
     * <li>If the task is not complete, increase the polling interval to avoid wasting resources due to frequent requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an image detection task created by CreateImageDetectionTask.</p>
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
     * <h2>Description</h2>
     * <p>Call this operation to query the execution status and result of a specified image detection task, including AIGC detection labels and tamper detection results. Poll at intervals of 2 to 5 seconds until the task status changes to succeeded or failed.</p>
     * <h2>Precautions</h2>
     * <ul>
     * <li>Ensure that you use a valid TaskId for the query.</li>
     * <li>If the task is not complete, increase the polling interval to avoid wasting resources due to frequent requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and result of an image detection task created by CreateImageDetectionTask.</p>
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
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. Polling more frequently while the task is in <code>running</code> status does not return results faster.</li>
     * <li><strong>Total timeout</strong>: If no result is obtained within 30 minutes after the task is created, the task is marked as <code>failed</code> with the Message <code>poll timeout: no result within 30m0s</code>.</li>
     * <li><strong>Desired state handling</strong>: <code>succeeded</code> and <code>failed</code> are the final states of the task. The result does not change after the task reaches either state.</li>
     * <li><strong>Items is an empty array</strong>: This indicates that no abnormal items are detected. It is not an error.</li>
     * <li><strong>Coordinates may be an empty array</strong>: Some abnormalities are image-wide in nature (for example, quality issues affecting the entire image) and cannot be located within a specific bounding box. In this case, <code>Coordinates</code> is an empty array, but the abnormal item itself is still valid and should still be presented to the user.</li>
     * <li><strong>Stage is an open value set</strong>: Future versions may introduce new <code>Stage</code> values. Display unknown values as-is. Do not perform whitelist validation on <code>Stage</code> or filter abnormal items based on it.</li>
     * <li><strong>quality stage</strong>: A <code>Stage</code> value of <code>quality</code> indicates that the image quality is too low and the detection result has low confidence. Prompt the user to resubmit a clear original screenshot and run the detection again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and list of abnormal items for an individual income tax screenshot detection task.</p>
     * 
     * @param request GetImageIncomeTaxDetectionTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageIncomeTaxDetectionTaskResultResponse
     */
    public GetImageIncomeTaxDetectionTaskResultResponse getImageIncomeTaxDetectionTaskResultWithOptions(GetImageIncomeTaxDetectionTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetImageIncomeTaxDetectionTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageIncomeTaxDetectionTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. Polling more frequently while the task is in <code>running</code> status does not return results faster.</li>
     * <li><strong>Total timeout</strong>: If no result is obtained within 30 minutes after the task is created, the task is marked as <code>failed</code> with the Message <code>poll timeout: no result within 30m0s</code>.</li>
     * <li><strong>Desired state handling</strong>: <code>succeeded</code> and <code>failed</code> are the final states of the task. The result does not change after the task reaches either state.</li>
     * <li><strong>Items is an empty array</strong>: This indicates that no abnormal items are detected. It is not an error.</li>
     * <li><strong>Coordinates may be an empty array</strong>: Some abnormalities are image-wide in nature (for example, quality issues affecting the entire image) and cannot be located within a specific bounding box. In this case, <code>Coordinates</code> is an empty array, but the abnormal item itself is still valid and should still be presented to the user.</li>
     * <li><strong>Stage is an open value set</strong>: Future versions may introduce new <code>Stage</code> values. Display unknown values as-is. Do not perform whitelist validation on <code>Stage</code> or filter abnormal items based on it.</li>
     * <li><strong>quality stage</strong>: A <code>Stage</code> value of <code>quality</code> indicates that the image quality is too low and the detection result has low confidence. Prompt the user to resubmit a clear original screenshot and run the detection again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and list of abnormal items for an individual income tax screenshot detection task.</p>
     * 
     * @param request GetImageIncomeTaxDetectionTaskResultRequest
     * @return GetImageIncomeTaxDetectionTaskResultResponse
     */
    public GetImageIncomeTaxDetectionTaskResultResponse getImageIncomeTaxDetectionTaskResult(GetImageIncomeTaxDetectionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageIncomeTaxDetectionTaskResultWithOptions(request, runtime);
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
     * <h2>Request description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous video generation task created by calling <code>CreateVideoTask</code>.</li>
     * <li>Poll the task status at an interval of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the task result of a video generation node.</p>
     * 
     * @param request GetVideoTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoTaskResultResponse
     */
    public GetVideoTaskResultResponse getVideoTaskResultWithOptions(GetVideoTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Call this operation to query the execution status and result of an asynchronous video generation task created by calling <code>CreateVideoTask</code>.</li>
     * <li>Poll the task status at an interval of 2 to 5 seconds until the task status changes to <code>succeeded</code> or <code>failed</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the task result of a video generation node.</p>
     * 
     * @param request GetVideoTaskResultRequest
     * @return GetVideoTaskResultResponse
     */
    public GetVideoTaskResultResponse getVideoTaskResult(GetVideoTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the execution status and result of an invisible watermark embedding task created by <code>CreateWatermarkEmbedTask</code>.</li>
     * <li>Tasks are processed asynchronously on the server side. Call this operation to retrieve the latest status.</li>
     * <li><strong>Polling recommendations</strong>: Ensure that the polling interval is at least 5 seconds. For video tasks, the expected completion time is approximately equal to the media duration (about 1x speed). Image tasks are completed within 5 minutes.</li>
     * <li><strong>Timeout mechanism</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. Tasks that are not completed within this period are marked as failed, and the corresponding error message is returned.</li>
     * <li>When the task status is <code>succeeded</code> or <code>failed</code>, the task has reached a desired state, and the result no longer changes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and download URL of an invisible watermark embedding task.</p>
     * 
     * @param request GetWatermarkEmbedTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWatermarkEmbedTaskResultResponse
     */
    public GetWatermarkEmbedTaskResultResponse getWatermarkEmbedTaskResultWithOptions(GetWatermarkEmbedTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetWatermarkEmbedTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWatermarkEmbedTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the execution status and result of an invisible watermark embedding task created by <code>CreateWatermarkEmbedTask</code>.</li>
     * <li>Tasks are processed asynchronously on the server side. Call this operation to retrieve the latest status.</li>
     * <li><strong>Polling recommendations</strong>: Ensure that the polling interval is at least 5 seconds. For video tasks, the expected completion time is approximately equal to the media duration (about 1x speed). Image tasks are completed within 5 minutes.</li>
     * <li><strong>Timeout mechanism</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. Tasks that are not completed within this period are marked as failed, and the corresponding error message is returned.</li>
     * <li>When the task status is <code>succeeded</code> or <code>failed</code>, the task has reached a desired state, and the result no longer changes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and download URL of an invisible watermark embedding task.</p>
     * 
     * @param request GetWatermarkEmbedTaskResultRequest
     * @return GetWatermarkEmbedTaskResultResponse
     */
    public GetWatermarkEmbedTaskResultResponse getWatermarkEmbedTaskResult(GetWatermarkEmbedTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkEmbedTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. The task completion time is approximately equal to the duration of the carrier media (approximately 1x speed).</li>
     * <li><strong>Timeout handling</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. If a task is not completed within this time, the task status changes to <code>failed</code>.</li>
     * <li><strong>Desired state confirmation</strong>: <code>succeeded</code> or <code>failed</code> is the final status. The result does not change after the task reaches either status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and extraction result of a dark watermark extraction task.</p>
     * 
     * @param request GetWatermarkExtractTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWatermarkExtractTaskResultResponse
     */
    public GetWatermarkExtractTaskResultResponse getWatermarkExtractTaskResultWithOptions(GetWatermarkExtractTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetWatermarkExtractTaskResult"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWatermarkExtractTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Polling recommendation</strong>: Set the polling interval to at least 5 seconds. The task completion time is approximately equal to the duration of the carrier media (approximately 1x speed).</li>
     * <li><strong>Timeout handling</strong>: The total timeout window for video tasks is 10 minutes, and for image tasks is 5 minutes. If a task is not completed within this time, the task status changes to <code>failed</code>.</li>
     * <li><strong>Desired state confirmation</strong>: <code>succeeded</code> or <code>failed</code> is the final status. The result does not change after the task reaches either status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and extraction result of a dark watermark extraction task.</p>
     * 
     * @param request GetWatermarkExtractTaskResultRequest
     * @return GetWatermarkExtractTaskResultResponse
     */
    public GetWatermarkExtractTaskResultResponse getWatermarkExtractTaskResult(GetWatermarkExtractTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkExtractTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation pauses a batch trusted signing parent task for a bucket that is owned and still controllable by the currently authenticated account.</li>
     * <li>The paused state is persisted to the database and remains effective after a service restart.</li>
     * <li>If no files have been submitted to the trusted signing service, the task directly enters the <code>PAUSED</code> state. If submitted files exist, the task first enters the <code>PAUSING</code> state, stops scanning and new submissions, and continues to query the actual results of those files. After all results converge, the task enters the <code>PAUSED</code> state.</li>
     * <li>Pausing does not interrupt an in-progress individual OSS or trusted signing service invoke, nor does it revoke signatures or metering that have already been completed.</li>
     * <li>Invoking this operation repeatedly on a task that is already in the <code>PAUSING</code> or <code>PAUSED</code> state is idempotent and succeeds.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be paused.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses a batch C2PA trusted signing task for a specified OSS bucket.</p>
     * 
     * @param request PauseC2paBucketSignTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseC2paBucketSignTaskResponse
     */
    public PauseC2paBucketSignTaskResponse pauseC2paBucketSignTaskWithOptions(PauseC2paBucketSignTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseC2paBucketSignTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseC2paBucketSignTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation pauses a batch trusted signing parent task for a bucket that is owned and still controllable by the currently authenticated account.</li>
     * <li>The paused state is persisted to the database and remains effective after a service restart.</li>
     * <li>If no files have been submitted to the trusted signing service, the task directly enters the <code>PAUSED</code> state. If submitted files exist, the task first enters the <code>PAUSING</code> state, stops scanning and new submissions, and continues to query the actual results of those files. After all results converge, the task enters the <code>PAUSED</code> state.</li>
     * <li>Pausing does not interrupt an in-progress individual OSS or trusted signing service invoke, nor does it revoke signatures or metering that have already been completed.</li>
     * <li>Invoking this operation repeatedly on a task that is already in the <code>PAUSING</code> or <code>PAUSED</code> state is idempotent and succeeds.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be paused.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses a batch C2PA trusted signing task for a specified OSS bucket.</p>
     * 
     * @param request PauseC2paBucketSignTaskRequest
     * @return PauseC2paBucketSignTaskResponse
     */
    public PauseC2paBucketSignTaskResponse pauseC2paBucketSignTask(PauseC2paBucketSignTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseC2paBucketSignTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation resumes a Bucket batch trusted signing parent task owned by the currently authenticated account.</li>
     * <li>After resumption, the task continues execution from the saved scan cursor and per-file stage. It does not rebuild the object list or resubmit trusted signing service tasks that have already been persisted.</li>
     * <li>This operation supports resuming from the <code>PAUSED</code> or <code>PAUSING</code> state. For tasks already in the <code>PROCESSING</code> state, repeated calls are idempotent and succeed.</li>
     * <li>If the task was previously auto-paused due to failures in shared dependencies such as user OSS, internal OSS, or the trusted signing service, the pause error recorded on the parent task is cleared upon resumption. If the dependencies have not yet recovered, the task may enter the <code>PAUSING</code> or <code>PAUSED</code> state again with a new reason recorded.</li>
     * <li>Before resuming a task that was paused due to permission issues, restore the OSS permissions of <code>AliyunServiceRoleForAIDeepSign</code> for the source prefix and output prefix. Otherwise, the task will be auto-paused again.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be resumed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resumes a paused or pausing OSS Bucket batch C2PA trusted signing task.</p>
     * 
     * @param request ResumeC2paBucketSignTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeC2paBucketSignTaskResponse
     */
    public ResumeC2paBucketSignTaskResponse resumeC2paBucketSignTaskWithOptions(ResumeC2paBucketSignTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeC2paBucketSignTask"),
            new TeaPair("version", "2026-05-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeC2paBucketSignTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation resumes a Bucket batch trusted signing parent task owned by the currently authenticated account.</li>
     * <li>After resumption, the task continues execution from the saved scan cursor and per-file stage. It does not rebuild the object list or resubmit trusted signing service tasks that have already been persisted.</li>
     * <li>This operation supports resuming from the <code>PAUSED</code> or <code>PAUSING</code> state. For tasks already in the <code>PROCESSING</code> state, repeated calls are idempotent and succeed.</li>
     * <li>If the task was previously auto-paused due to failures in shared dependencies such as user OSS, internal OSS, or the trusted signing service, the pause error recorded on the parent task is cleared upon resumption. If the dependencies have not yet recovered, the task may enter the <code>PAUSING</code> or <code>PAUSED</code> state again with a new reason recorded.</li>
     * <li>Before resuming a task that was paused due to permission issues, restore the OSS permissions of <code>AliyunServiceRoleForAIDeepSign</code> for the source prefix and output prefix. Otherwise, the task will be auto-paused again.</li>
     * <li>Tasks in the <code>SUCCEEDED</code>, <code>FAILED</code>, <code>CANCELING</code>, or <code>CANCELED</code> state cannot be resumed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resumes a paused or pausing OSS Bucket batch C2PA trusted signing task.</p>
     * 
     * @param request ResumeC2paBucketSignTaskRequest
     * @return ResumeC2paBucketSignTaskResponse
     */
    public ResumeC2paBucketSignTaskResponse resumeC2paBucketSignTask(ResumeC2paBucketSignTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeC2paBucketSignTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Signs with a platform-owned certificate and supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.
     * This operation provides basic signing. For trusted signing, call <code>CreateC2paSignTask</code> to create a task and call <code>GetC2paSignResult</code> to query the result.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External image URLs are not currently supported. Only image URLs that are publicly accessible within the Chinese mainland are supported. Upload the image to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>Supported image formats: JPEG and PNG. Unsupported formats return the C2PA_FORMAT_UNSUPPORTED fault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Signs an image with a basic C2PA signature by using a platform-owned certificate, supports content integrity verification, and returns the download URL of the signed image.</p>
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
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Signs with a platform-owned certificate and supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.
     * This operation provides basic signing. For trusted signing, call <code>CreateC2paSignTask</code> to create a task and call <code>GetC2paSignResult</code> to query the result.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li><code>ImageUrl</code> is required and must be a publicly accessible HTTP/HTTPS URL.</li>
     * <li>External image URLs are not currently supported. Only image URLs that are publicly accessible within the Chinese mainland are supported. Upload the image to an Alibaba Cloud OSS bucket in a region within the Chinese mainland first, and then use the pre-signed URL of the image as the input parameter of this operation. References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How to obtain the URL of a single file or the URLs of multiple files</a>.</li>
     * <li>Supported image formats: JPEG and PNG. Unsupported formats return the C2PA_FORMAT_UNSUPPORTED fault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Signs an image with a basic C2PA signature by using a platform-owned certificate, supports content integrity verification, and returns the download URL of the signed image.</p>
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
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Uses the platform\&quot;s own certificate for signing. Supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.</li>
     * </ul>
     * <h2>Verification result description</h2>
     * <ul>
     * <li>Content integrity verification checks whether the image and its signature-protected provenance information remain consistent with the state at the time of signing. It does not indicate that the visual content itself is authentic.</li>
     * <li><code>VerificationState=Valid</code> indicates that the signature and data hash are valid and content integrity verification has passed. This alone cannot be used to determine that the signature is a trusted signature.</li>
     * <li><code>VerificationState=Trusted</code> and <code>IssuerTrusted</code> present the certificate trust verification results. Whether a signature qualifies as a trusted signature as defined in this topic depends on whether the signing certificate chain can be verified through the C2PA official trust list, not solely on the certificate issuer name.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation verifies the C2PA (Coalition for Content Provenance and Authenticity) digital signature embedded in a specified image.</li>
     * <li><code>ImageUrl</code> <strong>does not currently support images from external networks. Only image URLs accessible over the China public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a China region first, and then use the presigned URL of the image as the input parameter for this operation.</strong> References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the C2PA signature in an image and returns the content integrity verification status and issuer certificate trust information.</p>
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
     * <h2>Signature types</h2>
     * <ul>
     * <li><strong>Basic signature</strong>: Uses the platform\&quot;s own certificate for signing. Supports content integrity verification.</li>
     * <li><strong>Trusted signature</strong>: In addition to integrity verification, the signing certificate chain can be verified through the C2PA official trust list.</li>
     * </ul>
     * <h2>Verification result description</h2>
     * <ul>
     * <li>Content integrity verification checks whether the image and its signature-protected provenance information remain consistent with the state at the time of signing. It does not indicate that the visual content itself is authentic.</li>
     * <li><code>VerificationState=Valid</code> indicates that the signature and data hash are valid and content integrity verification has passed. This alone cannot be used to determine that the signature is a trusted signature.</li>
     * <li><code>VerificationState=Trusted</code> and <code>IssuerTrusted</code> present the certificate trust verification results. Whether a signature qualifies as a trusted signature as defined in this topic depends on whether the signing certificate chain can be verified through the C2PA official trust list, not solely on the certificate issuer name.</li>
     * </ul>
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation verifies the C2PA (Coalition for Content Provenance and Authenticity) digital signature embedded in a specified image.</li>
     * <li><code>ImageUrl</code> <strong>does not currently support images from external networks. Only image URLs accessible over the China public network are supported. Upload the image to an Alibaba Cloud OSS bucket in a China region first, and then use the presigned URL of the image as the input parameter for this operation.</strong> References: <a href="https://www.alibabacloud.com/help/en/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">How do I obtain the URL of one or more objects?</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the C2PA signature in an image and returns the content integrity verification status and issuer certificate trust information.</p>
     * 
     * @param request VerifyImageSignatureRequest
     * @return VerifyImageSignatureResponse
     */
    public VerifyImageSignatureResponse verifyImageSignature(VerifyImageSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyImageSignatureWithOptions(request, runtime);
    }
}
