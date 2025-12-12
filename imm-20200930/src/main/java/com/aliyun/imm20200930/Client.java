// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930;

import com.aliyun.tea.*;
import com.aliyun.imm20200930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing-gov-1", "imm-vpc.cn-beijing-gov-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>The operation accepts JPG and PNG images with a maximum side length of 30,000 pixels and a total of up to 250 million pixels.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds mosaics, Gaussian blurs, or solid color shapes to blur one or more areas of an image for privacy protection and saves the output image to the specified path in Object Storage Service (OSS).</p>
     * 
     * @param tmpReq AddImageMosaicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageMosaicResponse
     */
    public AddImageMosaicResponse addImageMosaicWithOptions(AddImageMosaicRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddImageMosaicShrinkRequest request = new AddImageMosaicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targets)) {
            request.targetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targets, "Targets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFormat)) {
            query.put("ImageFormat", request.imageFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetsShrink)) {
            query.put("Targets", request.targetsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImageMosaic"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageMosaicResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>The operation accepts JPG and PNG images with a maximum side length of 30,000 pixels and a total of up to 250 million pixels.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds mosaics, Gaussian blurs, or solid color shapes to blur one or more areas of an image for privacy protection and saves the output image to the specified path in Object Storage Service (OSS).</p>
     * 
     * @param request AddImageMosaicRequest
     * @return AddImageMosaicResponse
     */
    public AddImageMosaicResponse addImageMosaic(AddImageMosaicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageMosaicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds objects to a story.</p>
     * 
     * @param tmpReq AddStoryFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddStoryFilesResponse
     */
    public AddStoryFilesResponse addStoryFilesWithOptions(AddStoryFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddStoryFilesShrinkRequest request = new AddStoryFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddStoryFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddStoryFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds objects to a story.</p>
     * 
     * @param request AddStoryFilesRequest
     * @return AddStoryFilesResponse
     */
    public AddStoryFilesResponse addStoryFiles(AddStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addStoryFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>To use data processing capabilities of IMM based on the x-oss-process parameter, you must bind an OSS bucket to an IMM project. For more information, see <a href="https://help.aliyun.com/document_detail/2391270.html">x-oss-process</a>.</li>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an Object Storage Service (OSS) bucket to the specified project. The binding enables you to use IMM features by using the x-oss-process parameter.</p>
     * 
     * @param request AttachOSSBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachOSSBucketResponse
     */
    public AttachOSSBucketResponse attachOSSBucketWithOptions(AttachOSSBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachOSSBucket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachOSSBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>To use data processing capabilities of IMM based on the x-oss-process parameter, you must bind an OSS bucket to an IMM project. For more information, see <a href="https://help.aliyun.com/document_detail/2391270.html">x-oss-process</a>.</li>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an Object Storage Service (OSS) bucket to the specified project. The binding enables you to use IMM features by using the x-oss-process parameter.</p>
     * 
     * @param request AttachOSSBucketRequest
     * @return AttachOSSBucketResponse
     */
    public AttachOSSBucketResponse attachOSSBucket(AttachOSSBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachOSSBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>If you delete the metadata of a file from a dataset, the file stored in Object Storage Service (OSS) or Photo and Drive Service is <strong>not</strong> deleted. If you want to delete the file, use the operations provided by OSS or Photo and Drive Service.</li>
     * <li>Metadata deletion affects existing face groups and stories but does not affect existing spatiotemporal groups.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the metadata of multiple files from a dataset.</p>
     * 
     * @param tmpReq BatchDeleteFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteFileMetaResponse
     */
    public BatchDeleteFileMetaResponse batchDeleteFileMetaWithOptions(BatchDeleteFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteFileMetaShrinkRequest request = new BatchDeleteFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URIsShrink)) {
            query.put("URIs", request.URIsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>If you delete the metadata of a file from a dataset, the file stored in Object Storage Service (OSS) or Photo and Drive Service is <strong>not</strong> deleted. If you want to delete the file, use the operations provided by OSS or Photo and Drive Service.</li>
     * <li>Metadata deletion affects existing face groups and stories but does not affect existing spatiotemporal groups.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the metadata of multiple files from a dataset.</p>
     * 
     * @param request BatchDeleteFileMetaRequest
     * @return BatchDeleteFileMetaResponse
     */
    public BatchDeleteFileMetaResponse batchDeleteFileMeta(BatchDeleteFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries face clusters.</p>
     * 
     * @param tmpReq BatchGetFigureClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetFigureClusterResponse
     */
    public BatchGetFigureClusterResponse batchGetFigureClusterWithOptions(BatchGetFigureClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetFigureClusterShrinkRequest request = new BatchGetFigureClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectIds)) {
            request.objectIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectIds, "ObjectIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectIdsShrink)) {
            query.put("ObjectIds", request.objectIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetFigureClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries face clusters.</p>
     * 
     * @param request BatchGetFigureClusterRequest
     * @return BatchGetFigureClusterResponse
     */
    public BatchGetFigureClusterResponse batchGetFigureCluster(BatchGetFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, feel free to join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata of multiple objects or files in the specified dataset.</p>
     * 
     * @param tmpReq BatchGetFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetFileMetaResponse
     */
    public BatchGetFileMetaResponse batchGetFileMetaWithOptions(BatchGetFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetFileMetaShrinkRequest request = new BatchGetFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.URIs)) {
            request.URIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.URIs, "URIs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URIsShrink)) {
            query.put("URIs", request.URIsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, feel free to join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata of multiple objects or files in the specified dataset.</p>
     * 
     * @param request BatchGetFileMetaRequest
     * @return BatchGetFileMetaResponse
     */
    public BatchGetFileMetaResponse batchGetFileMeta(BatchGetFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Data processing operations supported for metadata processing vary with workflow templates. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>Metadata indexing poses limits on the total number and size of objects. For more information about these limits, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>. For more information about how to create</li>
     * <li>Metadata indexing is available in specific regions. For information about regions that support metadata indexing, see the &quot;Data management and indexing&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Indexes metadata of multiple objects into the specified dataset. The process involves data processing operations such as label detection, face detection, and location detection. Metadata indexing helps meet diverse data retrieval requirements.</p>
     * 
     * @param tmpReq BatchIndexFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchIndexFileMetaResponse
     */
    public BatchIndexFileMetaResponse batchIndexFileMetaWithOptions(BatchIndexFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchIndexFileMetaShrinkRequest request = new BatchIndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchIndexFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchIndexFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Data processing operations supported for metadata processing vary with workflow templates. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>Metadata indexing poses limits on the total number and size of objects. For more information about these limits, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>. For more information about how to create</li>
     * <li>Metadata indexing is available in specific regions. For information about regions that support metadata indexing, see the &quot;Data management and indexing&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Indexes metadata of multiple objects into the specified dataset. The process involves data processing operations such as label detection, face detection, and location detection. Metadata indexing helps meet diverse data retrieval requirements.</p>
     * 
     * @param request BatchIndexFileMetaRequest
     * @return BatchIndexFileMetaResponse
     */
    public BatchIndexFileMetaResponse batchIndexFileMeta(BatchIndexFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchIndexFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata fields such as CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates some metadata items of files indexed into a dataset.</p>
     * 
     * @param tmpReq BatchUpdateFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateFileMetaResponse
     */
    public BatchUpdateFileMetaResponse batchUpdateFileMetaWithOptions(BatchUpdateFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFileMetaShrinkRequest request = new BatchUpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata fields such as CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates some metadata items of files indexed into a dataset.</p>
     * 
     * @param request BatchUpdateFileMetaRequest
     * @return BatchUpdateFileMetaResponse
     */
    public BatchUpdateFileMetaResponse batchUpdateFileMeta(BatchUpdateFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For the input image, only the face with the largest face frame in the image is used for face comparison. The face frame detection result is consistent with the responses of the <a href="https://help.aliyun.com/document_detail/478213.html">DetectImageFaces</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Compares the similarity of the largest faces in two images. The largest face refers to the largest face frame in an image after face detection.</p>
     * 
     * @param tmpReq CompareImageFacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareImageFacesResponse
     */
    public CompareImageFacesResponse compareImageFacesWithOptions(CompareImageFacesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CompareImageFacesShrinkRequest request = new CompareImageFacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.source)) {
            request.sourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.source, "Source", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceShrink)) {
            query.put("Source", request.sourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareImageFaces"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareImageFacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For the input image, only the face with the largest face frame in the image is used for face comparison. The face frame detection result is consistent with the responses of the <a href="https://help.aliyun.com/document_detail/478213.html">DetectImageFaces</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Compares the similarity of the largest faces in two images. The largest face refers to the largest face frame in an image after face detection.</p>
     * 
     * @param request CompareImageFacesRequest
     * @return CompareImageFacesResponse
     */
    public CompareImageFacesResponse compareImageFaces(CompareImageFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareImageFacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/zh/imm/product-overview/billable-items?spm=openapi-amp.newDocPublishment.0.0.1ecd281fi27Zgk">pricing</a> of the Intelligent Media Management product.</li>
     * <li>Before calling this interface, ensure that you have indexed the files into the dataset (Dataset) through binding (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-createbinding?spm=a2c4g.11186623.0.0.a3d76f44xJrOnF">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-indexfilemeta?spm=a2c4g.11186623.help-menu-search-62354.d_0">IndexFileMeta</a> or <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta?spm=a2c4g.11186623.help-menu-62354.d_5_2_4_2_1_1.f1d86f44iBs3QZ">BatchIndexFileMeta</a>).</li>
     * <li>The returned result is only an example. Depending on the <a href="https://help.aliyun.com/zh/imm/user-guide/workflow-templates-and-operators?spm=a2c4g.11186623.0.0.a3d775abr3hDFp">workflow template configuration</a>, the categories and content of the file metadata information obtained may differ from the example. If you have any questions, please join the DingTalk group by searching for the group number 21714099 in DingTalk.</li>
     * </ul>
     * <h3>Usage Restrictions</h3>
     * <ul>
     * <li>The maximum length of the historical conversation is 100, including both user and assistant messages.</li>
     * <li>Each message should not exceed 1000 Chinese characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Phase II of AI Assistant, Q\&amp;A API</p>
     * 
     * @param tmpReq ContextualAnswerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContextualAnswerResponse
     */
    public ContextualAnswerResponse contextualAnswerWithOptions(ContextualAnswerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ContextualAnswerShrinkRequest request = new ContextualAnswerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messages)) {
            request.messagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messages, "Messages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messagesShrink)) {
            body.put("Messages", request.messagesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContextualAnswer"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContextualAnswerResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/zh/imm/product-overview/billable-items?spm=openapi-amp.newDocPublishment.0.0.1ecd281fi27Zgk">pricing</a> of the Intelligent Media Management product.</li>
     * <li>Before calling this interface, ensure that you have indexed the files into the dataset (Dataset) through binding (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-createbinding?spm=a2c4g.11186623.0.0.a3d76f44xJrOnF">CreateBinding</a>) or active indexing (<a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-indexfilemeta?spm=a2c4g.11186623.help-menu-search-62354.d_0">IndexFileMeta</a> or <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta?spm=a2c4g.11186623.help-menu-62354.d_5_2_4_2_1_1.f1d86f44iBs3QZ">BatchIndexFileMeta</a>).</li>
     * <li>The returned result is only an example. Depending on the <a href="https://help.aliyun.com/zh/imm/user-guide/workflow-templates-and-operators?spm=a2c4g.11186623.0.0.a3d775abr3hDFp">workflow template configuration</a>, the categories and content of the file metadata information obtained may differ from the example. If you have any questions, please join the DingTalk group by searching for the group number 21714099 in DingTalk.</li>
     * </ul>
     * <h3>Usage Restrictions</h3>
     * <ul>
     * <li>The maximum length of the historical conversation is 100, including both user and assistant messages.</li>
     * <li>Each message should not exceed 1000 Chinese characters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Phase II of AI Assistant, Q\&amp;A API</p>
     * 
     * @param request ContextualAnswerRequest
     * @return ContextualAnswerResponse
     */
    public ContextualAnswerResponse contextualAnswer(ContextualAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contextualAnswerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/zh/imm/product-overview/billable-items?spm=openapi-amp.newDocPublishment.0.0.1ecd281fi27Zgk">billing</a> of Intelligent Media Management (IMM).</li>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-createbinding?spm=a2c4g.11186623.0.0.a3d76f44xJrOnF">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-indexfilemeta?spm=a2c4g.11186623.help-menu-search-62354.d_0">IndexFileMeta</a> or <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta?spm=a2c4g.11186623.help-menu-62354.d_5_2_4_2_1_1.f1d86f44iBs3QZ">BatchIndexFileMeta</a> operation.</li>
     * <li>The response provided in this example is for reference only. The categories and content of metadata vary based on configurations of <a href="https://help.aliyun.com/zh/imm/user-guide/workflow-templates-and-operators?spm=a2c4g.11186623.0.0.a3d775abr3hDFp">workflow templates</a>. For any inquiries, join the DingTalk chat group (ID: 21714099) for feedback.</li>
     * </ul>
     * <h3><a href="#"></a>Limitations</h3>
     * <ul>
     * <li>The conversation history can hold up to 100 messages, including user-sent messages and assistant-generated messages.</li>
     * <li>Each message cannot exceed 1,000 characters in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves semantically similar documents. The operation is designed for multi-turn conversations and can process message input in historical conversations. The operation returns results that are highly related to the current conversation based on an in-depth understanding of contextual content. It provides consistent and efficient information retrieval in multi-turn conversations.</p>
     * 
     * @param tmpReq ContextualRetrievalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContextualRetrievalResponse
     */
    public ContextualRetrievalResponse contextualRetrievalWithOptions(ContextualRetrievalRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ContextualRetrievalShrinkRequest request = new ContextualRetrievalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messages)) {
            request.messagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messages, "Messages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.smartClusterIds)) {
            request.smartClusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.smartClusterIds, "SmartClusterIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallOnly)) {
            query.put("RecallOnly", request.recallOnly);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messagesShrink)) {
            body.put("Messages", request.messagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartClusterIdsShrink)) {
            body.put("SmartClusterIds", request.smartClusterIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContextualRetrieval"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContextualRetrievalResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/zh/imm/product-overview/billable-items?spm=openapi-amp.newDocPublishment.0.0.1ecd281fi27Zgk">billing</a> of Intelligent Media Management (IMM).</li>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-createbinding?spm=a2c4g.11186623.0.0.a3d76f44xJrOnF">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-indexfilemeta?spm=a2c4g.11186623.help-menu-search-62354.d_0">IndexFileMeta</a> or <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-batchindexfilemeta?spm=a2c4g.11186623.help-menu-62354.d_5_2_4_2_1_1.f1d86f44iBs3QZ">BatchIndexFileMeta</a> operation.</li>
     * <li>The response provided in this example is for reference only. The categories and content of metadata vary based on configurations of <a href="https://help.aliyun.com/zh/imm/user-guide/workflow-templates-and-operators?spm=a2c4g.11186623.0.0.a3d775abr3hDFp">workflow templates</a>. For any inquiries, join the DingTalk chat group (ID: 21714099) for feedback.</li>
     * </ul>
     * <h3><a href="#"></a>Limitations</h3>
     * <ul>
     * <li>The conversation history can hold up to 100 messages, including user-sent messages and assistant-generated messages.</li>
     * <li>Each message cannot exceed 1,000 characters in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves semantically similar documents. The operation is designed for multi-turn conversations and can process message input in historical conversations. The operation returns results that are highly related to the current conversation based on an in-depth understanding of contextual content. It provides consistent and efficient information retrieval in multi-turn conversations.</p>
     * 
     * @param request ContextualRetrievalRequest
     * @return ContextualRetrievalResponse
     */
    public ContextualRetrievalResponse contextualRetrieval(ContextualRetrievalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contextualRetrievalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk chat group (ID: 31690030817) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an archive file inspection task to preview the files in a package without decompressing the package.</p>
     * 
     * @param tmpReq CreateArchiveFileInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateArchiveFileInspectionTaskResponse
     */
    public CreateArchiveFileInspectionTaskResponse createArchiveFileInspectionTaskWithOptions(CreateArchiveFileInspectionTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateArchiveFileInspectionTaskShrinkRequest request = new CreateArchiveFileInspectionTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateArchiveFileInspectionTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateArchiveFileInspectionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk chat group (ID: 31690030817) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an archive file inspection task to preview the files in a package without decompressing the package.</p>
     * 
     * @param request CreateArchiveFileInspectionTaskRequest
     * @return CreateArchiveFileInspectionTaskResponse
     */
    public CreateArchiveFileInspectionTaskResponse createArchiveFileInspectionTask(CreateArchiveFileInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArchiveFileInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a batch processing task to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch processing task to perform a data processing operation, such as transcoding or format conversion, on multiple existing files at a time.</p>
     * 
     * @param tmpReq CreateBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBatchResponse
     */
    public CreateBatchResponse createBatchWithOptions(CreateBatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBatchShrinkRequest request = new CreateBatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actions)) {
            request.actionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actions, "Actions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionsShrink)) {
            body.put("Actions", request.actionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            body.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            body.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a batch processing task to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch processing task to perform a data processing operation, such as transcoding or format conversion, on multiple existing files at a time.</p>
     * 
     * @param request CreateBatchRequest
     * @return CreateBatchResponse
     */
    public CreateBatchResponse createBatch(CreateBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2743997.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <blockquote>
     * <p> Asynchronous processing does not guarantee timely task completion.
     * Before you create a binding, make sure that the project and the dataset that you want to use exist.</p>
     * </blockquote>
     * <ul>
     * <li>For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.<blockquote>
     * <p> The CreateBinding operation works by using the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that is specified when you created the project or dataset.
     * After you create a binding between a dataset and an OSS bucket, IMM scans the existing objects in the bucket and extracts metadata based on the scanning result. Then, IMM creates an index from the extracted metadata. If new objects are uploaded to the OSS bucket, IMM tracks and scans the objects and updates the index. For objects whose metadata index is created by calling this operation, you can call query operations, such as <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a>, to query objects, manage objects, and collect statistics on objects.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a binding relationship between a dataset and an Object Storage Service (OSS) bucket. This allows for the automatic synchronization of incremental and full data and indexing.</p>
     * 
     * @param request CreateBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBindingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2743997.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <blockquote>
     * <p> Asynchronous processing does not guarantee timely task completion.
     * Before you create a binding, make sure that the project and the dataset that you want to use exist.</p>
     * </blockquote>
     * <ul>
     * <li>For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For information about how to create a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a>.<blockquote>
     * <p> The CreateBinding operation works by using the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that is specified when you created the project or dataset.
     * After you create a binding between a dataset and an OSS bucket, IMM scans the existing objects in the bucket and extracts metadata based on the scanning result. Then, IMM creates an index from the extracted metadata. If new objects are uploaded to the OSS bucket, IMM tracks and scans the objects and updates the index. For objects whose metadata index is created by calling this operation, you can call query operations, such as <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a>, to query objects, manage objects, and collect statistics on objects.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a binding relationship between a dataset and an Object Storage Service (OSS) bucket. This allows for the automatic synchronization of incremental and full data and indexing.</p>
     * 
     * @param request CreateBindingRequest
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>This operation supports only Point Cloud Data (PCD) files.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Compresses point cloud data (PCD) in Object Storage Service (OSS) to reduce the amount of data transferred over networks.</p>
     * 
     * @param tmpReq CreateCompressPointCloudTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCompressPointCloudTaskResponse
     */
    public CreateCompressPointCloudTaskResponse createCompressPointCloudTaskWithOptions(CreateCompressPointCloudTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCompressPointCloudTaskShrinkRequest request = new CreateCompressPointCloudTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kdtreeOption)) {
            request.kdtreeOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kdtreeOption, "KdtreeOption", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.octreeOption)) {
            request.octreeOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.octreeOption, "OctreeOption", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pointCloudFields)) {
            request.pointCloudFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pointCloudFields, "PointCloudFields", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressMethod)) {
            query.put("CompressMethod", request.compressMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kdtreeOptionShrink)) {
            query.put("KdtreeOption", request.kdtreeOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.octreeOptionShrink)) {
            query.put("OctreeOption", request.octreeOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointCloudFieldsShrink)) {
            query.put("PointCloudFields", request.pointCloudFieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointCloudFileFormat)) {
            query.put("PointCloudFileFormat", request.pointCloudFileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCompressPointCloudTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCompressPointCloudTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>This operation supports only Point Cloud Data (PCD) files.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Compresses point cloud data (PCD) in Object Storage Service (OSS) to reduce the amount of data transferred over networks.</p>
     * 
     * @param request CreateCompressPointCloudTaskRequest
     * @return CreateCompressPointCloudTaskResponse
     */
    public CreateCompressPointCloudTaskResponse createCompressPointCloudTask(CreateCompressPointCloudTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompressPointCloudTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a story based on the specified images and videos.</p>
     * 
     * @param tmpReq CreateCustomizedStoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomizedStoryResponse
     */
    public CreateCustomizedStoryResponse createCustomizedStoryWithOptions(CreateCustomizedStoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCustomizedStoryShrinkRequest request = new CreateCustomizedStoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cover)) {
            request.coverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cover, "Cover", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverShrink)) {
            body.put("Cover", request.coverShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            body.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("StoryName", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            body.put("StorySubType", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("StoryType", request.storyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomizedStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomizedStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a story based on the specified images and videos.</p>
     * 
     * @param request CreateCustomizedStoryRequest
     * @return CreateCustomizedStoryResponse
     */
    public CreateCustomizedStoryResponse createCustomizedStory(CreateCustomizedStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomizedStoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>The dataset name must be unique within the same project.</li>
     * <li>There is a limit to the number of datasets that can be created, which can be queried through <a href="https://help.aliyun.com/document_detail/478155.html">GetProject</a>.</li>
     * <li>After creating a dataset, you can use <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> to build file metadata indexes, enabling diversified <a href="https://help.aliyun.com/document_detail/478175.html">data retrieval and statistics</a> and intelligent management.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create Dataset</p>
     * 
     * @param tmpReq CreateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatasetShrinkRequest request = new CreateDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowParameters)) {
            request.workflowParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowParameters, "WorkflowParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowParametersShrink)) {
            query.put("WorkflowParameters", request.workflowParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>The dataset name must be unique within the same project.</li>
     * <li>There is a limit to the number of datasets that can be created, which can be queried through <a href="https://help.aliyun.com/document_detail/478155.html">GetProject</a>.</li>
     * <li>After creating a dataset, you can use <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> to build file metadata indexes, enabling diversified <a href="https://help.aliyun.com/document_detail/478175.html">data retrieval and statistics</a> and intelligent management.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create Dataset</p>
     * 
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).
     *     **
     *     <strong>Note that</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>The region and project specified in the request to decode a blind watermark must match those in the <a href="https://help.aliyun.com/document_detail/2743655.html">EncodeBlindWatermark</a> request to encode the blind watermark.</li>
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, and color transformation, are performed on the image.</li>
     * <li>This operation is compatible with its earlier version DecodeBlindWatermark.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Decodes the blind watermark in an image.</p>
     * 
     * @param tmpReq CreateDecodeBlindWatermarkTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDecodeBlindWatermarkTaskResponse
     */
    public CreateDecodeBlindWatermarkTaskResponse createDecodeBlindWatermarkTaskWithOptions(CreateDecodeBlindWatermarkTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDecodeBlindWatermarkTaskShrinkRequest request = new CreateDecodeBlindWatermarkTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageQuality)) {
            query.put("ImageQuality", request.imageQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalImageURI)) {
            query.put("OriginalImageURI", request.originalImageURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strengthLevel)) {
            query.put("StrengthLevel", request.strengthLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDecodeBlindWatermarkTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDecodeBlindWatermarkTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).
     *     **
     *     <strong>Note that</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>The region and project specified in the request to decode a blind watermark must match those in the <a href="https://help.aliyun.com/document_detail/2743655.html">EncodeBlindWatermark</a> request to encode the blind watermark.</li>
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, and color transformation, are performed on the image.</li>
     * <li>This operation is compatible with its earlier version DecodeBlindWatermark.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Decodes the blind watermark in an image.</p>
     * 
     * @param request CreateDecodeBlindWatermarkTaskRequest
     * @return CreateDecodeBlindWatermarkTaskResponse
     */
    public CreateDecodeBlindWatermarkTaskResponse createDecodeBlindWatermarkTask(CreateDecodeBlindWatermarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDecodeBlindWatermarkTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The operation searches for faces that are similar to the face within the largest bounding box in each input image.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches the dataset for the specified number of images most similar to the specified image or face and returns face IDs and boundaries in descending order of similarity.</p>
     * 
     * @param tmpReq CreateFacesSearchingTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFacesSearchingTaskResponse
     */
    public CreateFacesSearchingTaskResponse createFacesSearchingTaskWithOptions(CreateFacesSearchingTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFacesSearchingTaskShrinkRequest request = new CreateFacesSearchingTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            query.put("MaxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFacesSearchingTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFacesSearchingTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The operation searches for faces that are similar to the face within the largest bounding box in each input image.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches the dataset for the specified number of images most similar to the specified image or face and returns face IDs and boundaries in descending order of similarity.</p>
     * 
     * @param request CreateFacesSearchingTaskRequest
     * @return CreateFacesSearchingTaskResponse
     */
    public CreateFacesSearchingTaskResponse createFacesSearchingTask(CreateFacesSearchingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFacesSearchingTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the <a href="~~CreateDataset~~">dataset</a> automatically by calling the <a href="~~CreateBinding~~">CreateBinding</a> operation or manually by calling the <a href="~~IndexFileMeta~~">IndexFileMeta</a> or <a href="~~BatchIndexFileMeta~~">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the <a href="~~CreateDataset~~">dataset</a>. You can regularly call this operation to process incremental files.</li>
     * <li>After the clustering task is complete, you can call the <a href="~~GetFigureCluster~~">GetFigureCluster</a> or <a href="~~BatchGetFigureCluster~~">BatchGetFigureCluster</a> operation to query information about a specific cluster. You can also call the <a href="~~QueryFigureClusters~~">QueryFigureClusters</a> operation to query all face clusters of the specified dataset.</li>
     * <li>Removing image information from the dataset causes changes to face clusters. When images that contain all faces in a cluster are removed, the cluster is deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="~~GetTask~~">GetTask</a> or <a href="~~ListTasks~~">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a face clustering task to cluster faces of different persons in images by person based on the intelligent algorithms.</p>
     * 
     * @param tmpReq CreateFigureClusteringTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFigureClusteringTaskResponse
     */
    public CreateFigureClusteringTaskResponse createFigureClusteringTaskWithOptions(CreateFigureClusteringTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFigureClusteringTaskShrinkRequest request = new CreateFigureClusteringTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFigureClusteringTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFigureClusteringTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the <a href="~~CreateDataset~~">dataset</a> automatically by calling the <a href="~~CreateBinding~~">CreateBinding</a> operation or manually by calling the <a href="~~IndexFileMeta~~">IndexFileMeta</a> or <a href="~~BatchIndexFileMeta~~">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the <a href="~~CreateDataset~~">dataset</a>. You can regularly call this operation to process incremental files.</li>
     * <li>After the clustering task is complete, you can call the <a href="~~GetFigureCluster~~">GetFigureCluster</a> or <a href="~~BatchGetFigureCluster~~">BatchGetFigureCluster</a> operation to query information about a specific cluster. You can also call the <a href="~~QueryFigureClusters~~">QueryFigureClusters</a> operation to query all face clusters of the specified dataset.</li>
     * <li>Removing image information from the dataset causes changes to face clusters. When images that contain all faces in a cluster are removed, the cluster is deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="~~GetTask~~">GetTask</a> or <a href="~~ListTasks~~">ListTasks</a> operation to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a face clustering task to cluster faces of different persons in images by person based on the intelligent algorithms.</p>
     * 
     * @param request CreateFigureClusteringTaskRequest
     * @return CreateFigureClusteringTaskResponse
     */
    public CreateFigureClusteringTaskResponse createFigureClusteringTask(CreateFigureClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFigureClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>If you merge unrelated groups, the feature values of the target groups are affected. As a result, the incremental data may be inaccurately grouped when you create a face clustering task.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Merges two or more face clustering groups into one face clustering group.</p>
     * 
     * @param tmpReq CreateFigureClustersMergingTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFigureClustersMergingTaskResponse
     */
    public CreateFigureClustersMergingTaskResponse createFigureClustersMergingTaskWithOptions(CreateFigureClustersMergingTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFigureClustersMergingTaskShrinkRequest request = new CreateFigureClustersMergingTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.froms)) {
            request.fromsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.froms, "Froms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromsShrink)) {
            query.put("Froms", request.fromsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFigureClustersMergingTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFigureClustersMergingTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>If you merge unrelated groups, the feature values of the target groups are affected. As a result, the incremental data may be inaccurately grouped when you create a face clustering task.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Merges two or more face clustering groups into one face clustering group.</p>
     * 
     * @param request CreateFigureClustersMergingTaskRequest
     * @return CreateFigureClustersMergingTaskResponse
     */
    public CreateFigureClustersMergingTaskResponse createFigureClustersMergingTask(CreateFigureClustersMergingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFigureClustersMergingTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.
     *  The operation supports file packing only. Compression support will be added later.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>A call to the operation can pack up to 80,000 objects into a package.</li>
     * <li>The total size of all objects to be packed into a package cannot exceed 200 GB.</li>
     * <li>The operation can pack only Standard objects in Object Storage Service (OSS). To pack an object in another storage class, you must first <a href="https://help.aliyun.com/document_detail/90090.html">convert the storage class of the object</a>.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a file packing task.</p>
     * 
     * @param tmpReq CreateFileCompressionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileCompressionTaskResponse
     */
    public CreateFileCompressionTaskResponse createFileCompressionTaskWithOptions(CreateFileCompressionTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFileCompressionTaskShrinkRequest request = new CreateFileCompressionTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressedFormat)) {
            query.put("CompressedFormat", request.compressedFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceManifestURI)) {
            query.put("SourceManifestURI", request.sourceManifestURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileCompressionTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileCompressionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.
     *  The operation supports file packing only. Compression support will be added later.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>A call to the operation can pack up to 80,000 objects into a package.</li>
     * <li>The total size of all objects to be packed into a package cannot exceed 200 GB.</li>
     * <li>The operation can pack only Standard objects in Object Storage Service (OSS). To pack an object in another storage class, you must first <a href="https://help.aliyun.com/document_detail/90090.html">convert the storage class of the object</a>.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a file packing task.</p>
     * 
     * @param request CreateFileCompressionTaskRequest
     * @return CreateFileCompressionTaskResponse
     */
    public CreateFileCompressionTaskResponse createFileCompressionTask(CreateFileCompressionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileCompressionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>The operation extracts files in streams to the specified directory. If the file extraction task is interrupted by a corrupt file, files that have been extracted are not deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extracts the specified files from a ZIP, RAR, or 7z package to the specified directory or decompresses the entire package.</p>
     * 
     * @param tmpReq CreateFileUncompressionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileUncompressionTaskResponse
     */
    public CreateFileUncompressionTaskResponse createFileUncompressionTaskWithOptions(CreateFileUncompressionTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFileUncompressionTaskShrinkRequest request = new CreateFileUncompressionTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.selectedFiles)) {
            request.selectedFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.selectedFiles, "SelectedFiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedFilesShrink)) {
            query.put("SelectedFiles", request.selectedFilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileUncompressionTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileUncompressionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The operation is in public preview. For any inquires, join our DingTalk group (ID: 88490020073) and share your questions with us.</p>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>The operation supports a package that contains up to 80,000 files.</li>
     * <li>The operation supports ZIP or RAR packages up to 200 GB in size, or 7z packages up to 50 GB in size.</li>
     * <li>The operation extracts files in streams to the specified directory. If the file extraction task is interrupted by a corrupt file, files that have been extracted are not deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extracts the specified files from a ZIP, RAR, or 7z package to the specified directory or decompresses the entire package.</p>
     * 
     * @param request CreateFileUncompressionTaskRequest
     * @return CreateFileUncompressionTaskResponse
     */
    public CreateFileUncompressionTaskResponse createFileUncompressionTask(CreateFileUncompressionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileUncompressionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The image for which you want to create a content moderation task must meet the following requirements:<ul>
     * <li>The image URL uses the HTTP or HTTPS protocol.</li>
     * <li>The image is in one of the following formats: PNG, JPG, JPEG, BMP, GIF, and WebP</li>
     * <li>The image size is limited to 20 MB for synchronous and asynchronous calls, with a maximum height or width of 30,000 pixels. The total number of pixels in the image cannot exceed 250 million. GIF images are limited to 4,194,304 pixels, with a maximum height or width of 30,000 pixels.</li>
     * <li>The image download time is limited to 3 seconds. If the download takes longer, a timeout error occurs.</li>
     * <li>To ensure effective moderation, we recommend that you submit an image with dimensions of at least 256 × 256 pixels.</li>
     * <li>The response time of the CreateImageModerationTask operation varies based on the duration of the image download. Make sure that the image is stored in a stable and reliable service. We recommend that you store images on Alibaba Cloud Object Storage Service (OSS) or cache them on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can also obtain information about the task based on notifications.<blockquote>
     * <p> The detection result is sent as an asynchronous notification. The Suggestion field of the notification can have one of the following values:</p>
     * </blockquote>
     * </li>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance categories. For more information, see Content moderation results.</li>
     * <li>review: A manual review is needed. After the manual review is completed, an asynchronous notification is sent to inform you of the result. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image moderation task to ensure image content compliance. You can call this operation to identify inappropriate content, such as pornography, violence, terrorism, politically sensitive content, undesirable scenes, unauthorized logos, and non-compliant ads.</p>
     * 
     * @param tmpReq CreateImageModerationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageModerationTaskResponse
     */
    public CreateImageModerationTaskResponse createImageModerationTaskWithOptions(CreateImageModerationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageModerationTaskShrinkRequest request = new CreateImageModerationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scenes)) {
            request.scenesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scenes, "Scenes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFrames)) {
            query.put("MaxFrames", request.maxFrames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenesShrink)) {
            query.put("Scenes", request.scenesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageModerationTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageModerationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The image for which you want to create a content moderation task must meet the following requirements:<ul>
     * <li>The image URL uses the HTTP or HTTPS protocol.</li>
     * <li>The image is in one of the following formats: PNG, JPG, JPEG, BMP, GIF, and WebP</li>
     * <li>The image size is limited to 20 MB for synchronous and asynchronous calls, with a maximum height or width of 30,000 pixels. The total number of pixels in the image cannot exceed 250 million. GIF images are limited to 4,194,304 pixels, with a maximum height or width of 30,000 pixels.</li>
     * <li>The image download time is limited to 3 seconds. If the download takes longer, a timeout error occurs.</li>
     * <li>To ensure effective moderation, we recommend that you submit an image with dimensions of at least 256 × 256 pixels.</li>
     * <li>The response time of the CreateImageModerationTask operation varies based on the duration of the image download. Make sure that the image is stored in a stable and reliable service. We recommend that you store images on Alibaba Cloud Object Storage Service (OSS) or cache them on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can also obtain information about the task based on notifications.<blockquote>
     * <p> The detection result is sent as an asynchronous notification. The Suggestion field of the notification can have one of the following values:</p>
     * </blockquote>
     * </li>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance categories. For more information, see Content moderation results.</li>
     * <li>review: A manual review is needed. After the manual review is completed, an asynchronous notification is sent to inform you of the result. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image moderation task to ensure image content compliance. You can call this operation to identify inappropriate content, such as pornography, violence, terrorism, politically sensitive content, undesirable scenes, unauthorized logos, and non-compliant ads.</p>
     * 
     * @param request CreateImageModerationTaskRequest
     * @return CreateImageModerationTaskResponse
     */
    public CreateImageModerationTaskResponse createImageModerationTask(CreateImageModerationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageModerationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can call this operation to merge up to 10 images. Each side of an image cannot exceed 32,876 pixels, and the total number of pixels of the image cannot exceed 1 billion.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image splicing task. You can call this operation to splice multiple images into one based on a given rule and save the final image into an Object Storage Service (OSS) bucket.</p>
     * 
     * @param tmpReq CreateImageSplicingTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageSplicingTaskResponse
     */
    public CreateImageSplicingTaskResponse createImageSplicingTaskWithOptions(CreateImageSplicingTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageSplicingTaskShrinkRequest request = new CreateImageSplicingTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.align)) {
            query.put("Align", request.align);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFormat)) {
            query.put("ImageFormat", request.imageFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.margin)) {
            query.put("Margin", request.margin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.padding)) {
            query.put("Padding", request.padding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            query.put("ScaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageSplicingTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageSplicingTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can call this operation to merge up to 10 images. Each side of an image cannot exceed 32,876 pixels, and the total number of pixels of the image cannot exceed 1 billion.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image splicing task. You can call this operation to splice multiple images into one based on a given rule and save the final image into an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request CreateImageSplicingTaskRequest
     * @return CreateImageSplicingTaskResponse
     */
    public CreateImageSplicingTaskResponse createImageSplicingTask(CreateImageSplicingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageSplicingTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can specify up to 100 images in a call to the operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Converts multiple images into one single PDF file and stores the PDF file to the specified path in Object Storage Service (OSS).</p>
     * 
     * @param tmpReq CreateImageToPDFTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageToPDFTaskResponse
     */
    public CreateImageToPDFTaskResponse createImageToPDFTaskWithOptions(CreateImageToPDFTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageToPDFTaskShrinkRequest request = new CreateImageToPDFTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageToPDFTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageToPDFTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * <li>You can specify up to 100 images in a call to the operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Converts multiple images into one single PDF file and stores the PDF file to the specified path in Object Storage Service (OSS).</p>
     * 
     * @param request CreateImageToPDFTaskRequest
     * @return CreateImageToPDFTaskResponse
     */
    public CreateImageToPDFTaskResponse createImageToPDFTask(CreateImageToPDFTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageToPDFTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After a spatiotemporal clustering task is complete, you can call the <a href="https://help.aliyun.com/document_detail/478189.html">QueryLocationDateClusters</a> operation to query the spatiotemporal clustering result.</li>
     * <li>Removing metadata from a dataset does not affect existing spatiotemporal clusters for the dataset. To delete a spatiotemporal cluster, call the <a href="https://help.aliyun.com/document_detail/478191.html">DeleteLocationDateCluster</a> operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a spatiotemporal clustering task to cluster photos and videos based on geolocation and time information. Spatiotemporal clustering allows you to group photos and videos taken during a travel or at different places by their spatial and temporal similarity. Based on spatiotemporal clustering, you can develop media capabilities such as media file categorization, photo collections, and image and video-based stories.</p>
     * 
     * @param tmpReq CreateLocationDateClusteringTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLocationDateClusteringTaskResponse
     */
    public CreateLocationDateClusteringTaskResponse createLocationDateClusteringTaskWithOptions(CreateLocationDateClusteringTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLocationDateClusteringTaskShrinkRequest request = new CreateLocationDateClusteringTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dateOptions)) {
            request.dateOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dateOptions, "DateOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationOptions)) {
            request.locationOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationOptions, "LocationOptions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateOptionsShrink)) {
            query.put("DateOptions", request.dateOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationOptionsShrink)) {
            query.put("LocationOptions", request.locationOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLocationDateClusteringTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLocationDateClusteringTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After a spatiotemporal clustering task is complete, you can call the <a href="https://help.aliyun.com/document_detail/478189.html">QueryLocationDateClusters</a> operation to query the spatiotemporal clustering result.</li>
     * <li>Removing metadata from a dataset does not affect existing spatiotemporal clusters for the dataset. To delete a spatiotemporal cluster, call the <a href="https://help.aliyun.com/document_detail/478191.html">DeleteLocationDateCluster</a> operation.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a spatiotemporal clustering task to cluster photos and videos based on geolocation and time information. Spatiotemporal clustering allows you to group photos and videos taken during a travel or at different places by their spatial and temporal similarity. Based on spatiotemporal clustering, you can develop media capabilities such as media file categorization, photo collections, and image and video-based stories.</p>
     * 
     * @param request CreateLocationDateClusteringTaskRequest
     * @return CreateLocationDateClusteringTaskResponse
     */
    public CreateLocationDateClusteringTaskResponse createLocationDateClusteringTask(CreateLocationDateClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocationDateClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>Before calling this interface, make sure that there is an available project (Project) in the current Region. For more details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.<blockquote>
     * <p>Notice: Asynchronous tasks do not guarantee timeliness.</p>
     * </blockquote>
     * </li>
     * <li>When using this interface for media transcoding, by default, only one video/audio/subtitle stream is processed, but you can also configure the number of video/audio/subtitle streams to be processed.</li>
     * <li>When using this interface for media concatenation, a maximum of 11 media files are supported. In this case, the configured transcoding, frame extraction, and other parameters will apply to the concatenated media data.</li>
     * <li>This is an asynchronous interface. After the task starts, the task information is retained for 7 days. If it exceeds 7 days, the information cannot be retrieved. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> interface to get the returned <code>TaskId</code> and view the task information. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> message notification parameter to obtain task information through message notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create Transcoding Service</p>
     * 
     * @param tmpReq CreateMediaConvertTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMediaConvertTaskResponse
     */
    public CreateMediaConvertTaskResponse createMediaConvertTaskWithOptions(CreateMediaConvertTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMediaConvertTaskShrinkRequest request = new CreateMediaConvertTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targets)) {
            request.targetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targets, "Targets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alignmentIndex)) {
            query.put("AlignmentIndex", request.alignmentIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetsShrink)) {
            query.put("Targets", request.targetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMediaConvertTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMediaConvertTaskResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>Before calling this interface, make sure that there is an available project (Project) in the current Region. For more details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.<blockquote>
     * <p>Notice: Asynchronous tasks do not guarantee timeliness.</p>
     * </blockquote>
     * </li>
     * <li>When using this interface for media transcoding, by default, only one video/audio/subtitle stream is processed, but you can also configure the number of video/audio/subtitle streams to be processed.</li>
     * <li>When using this interface for media concatenation, a maximum of 11 media files are supported. In this case, the configured transcoding, frame extraction, and other parameters will apply to the concatenated media data.</li>
     * <li>This is an asynchronous interface. After the task starts, the task information is retained for 7 days. If it exceeds 7 days, the information cannot be retrieved. Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> interface to get the returned <code>TaskId</code> and view the task information. You can also set the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> message notification parameter to obtain task information through message notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create Transcoding Service</p>
     * 
     * @param request CreateMediaConvertTaskRequest
     * @return CreateMediaConvertTaskResponse
     */
    public CreateMediaConvertTaskResponse createMediaConvertTask(CreateMediaConvertTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMediaConvertTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Supported input formats:<ul>
     * <li>Text documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, and html</li>
     * <li>Presentation documents: pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</li>
     * <li>Spreadsheet documents: xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</li>
     * <li>PDF documents: pdf</li>
     * </ul>
     * </li>
     * <li>Supported output formats:<ul>
     * <li>Image files: png and jpg</li>
     * <li>Text files: txt</li>
     * <li>PDF files: pdf</li>
     * </ul>
     * </li>
     * <li>Each input document can be up to 200 MB in size. The upper limit cannot be adjusted.</li>
     * <li>If the document size is large or the content is complex, the conversion task may time out.</li>
     * <li>The limit on the number of requests per second for a single user is 50.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can use one of the following methods to query the task information in a timely manner:<ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.``</li>
     * <li>In the region in which the IMM project is located, configure a Simple Message Queue (SMQ) subscription to receive task information notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For information about SMQ SDKs, see <a href="https://help.aliyun.com/document_detail/32449.html">Use queues</a>.</li>
     * <li>In the region in which the IMM project is located, create an ApsaraMQ for RocketMQ 4.0 instance, a topic, and a group to receive task notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For more information about how to use ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/169009.html">Call HTTP SDKs to send and subscribe to messages</a>.</li>
     * <li>In the region in which the IMM project is located, use <a href="https://www.aliyun.com/product/aliware/eventbridge">EventBridge</a> to receive task information notifications. For more information, see <a href="https://help.aliyun.com/document_detail/205730.html">IMM events</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a document format conversion task to convert the format of a document stored in an Object Storage Service (OSS) bucket.</p>
     * 
     * @param tmpReq CreateOfficeConversionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOfficeConversionTaskResponse
     */
    public CreateOfficeConversionTaskResponse createOfficeConversionTaskWithOptions(CreateOfficeConversionTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOfficeConversionTaskShrinkRequest request = new CreateOfficeConversionTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trimPolicy)) {
            request.trimPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trimPolicy, "TrimPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPage)) {
            query.put("EndPage", request.endPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstPage)) {
            query.put("FirstPage", request.firstPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToHeight)) {
            query.put("FitToHeight", request.fitToHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fitToWidth)) {
            query.put("FitToWidth", request.fitToWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdLineFeed)) {
            query.put("HoldLineFeed", request.holdLineFeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageDPI)) {
            query.put("ImageDPI", request.imageDPI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longPicture)) {
            query.put("LongPicture", request.longPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longText)) {
            query.put("LongText", request.longText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetColumn)) {
            query.put("MaxSheetColumn", request.maxSheetColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSheetRow)) {
            query.put("MaxSheetRow", request.maxSheetRow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pages)) {
            query.put("Pages", request.pages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paperHorizontal)) {
            query.put("PaperHorizontal", request.paperHorizontal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paperSize)) {
            query.put("PaperSize", request.paperSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalePercentage)) {
            query.put("ScalePercentage", request.scalePercentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetCount)) {
            query.put("SheetCount", request.sheetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetIndex)) {
            query.put("SheetIndex", request.sheetIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showComments)) {
            query.put("ShowComments", request.showComments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPage)) {
            query.put("StartPage", request.startPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURIPrefix)) {
            query.put("TargetURIPrefix", request.targetURIPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trimPolicyShrink)) {
            query.put("TrimPolicy", request.trimPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            body.put("Sources", request.sourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOfficeConversionTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOfficeConversionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Supported input formats:<ul>
     * <li>Text documents: doc, docx, wps, wpss, docm, dotm, dot, dotx, and html</li>
     * <li>Presentation documents: pptx, ppt, pot, potx, pps, ppsx, dps, dpt, pptm, potm, ppsm, and dpss</li>
     * <li>Spreadsheet documents: xls, xlt, et, ett, xlsx, xltx, csv, xlsb, xlsm, xltm, and ets</li>
     * <li>PDF documents: pdf</li>
     * </ul>
     * </li>
     * <li>Supported output formats:<ul>
     * <li>Image files: png and jpg</li>
     * <li>Text files: txt</li>
     * <li>PDF files: pdf</li>
     * </ul>
     * </li>
     * <li>Each input document can be up to 200 MB in size. The upper limit cannot be adjusted.</li>
     * <li>If the document size is large or the content is complex, the conversion task may time out.</li>
     * <li>The limit on the number of requests per second for a single user is 50.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can use one of the following methods to query the task information in a timely manner:<ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.``</li>
     * <li>In the region in which the IMM project is located, configure a Simple Message Queue (SMQ) subscription to receive task information notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For information about SMQ SDKs, see <a href="https://help.aliyun.com/document_detail/32449.html">Use queues</a>.</li>
     * <li>In the region in which the IMM project is located, create an ApsaraMQ for RocketMQ 4.0 instance, a topic, and a group to receive task notifications. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>. For more information about how to use ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/169009.html">Call HTTP SDKs to send and subscribe to messages</a>.</li>
     * <li>In the region in which the IMM project is located, use <a href="https://www.aliyun.com/product/aliware/eventbridge">EventBridge</a> to receive task information notifications. For more information, see <a href="https://help.aliyun.com/document_detail/205730.html">IMM events</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a document format conversion task to convert the format of a document stored in an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request CreateOfficeConversionTaskRequest
     * @return CreateOfficeConversionTaskResponse
     */
    public CreateOfficeConversionTaskResponse createOfficeConversionTask(CreateOfficeConversionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOfficeConversionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The name of a project must be unique in a region.</p>
     * <ul>
     * <li>By default, you can create up to 100 projects in a region. If you want to request a quota increase to create more projects, submit a ticket or join the DingTalk chat group (ID: 88490020073).</li>
     * <li>After you create a project, you can create other Intelligent Media Management (IMM) resources in the project. For more information, see the following links:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/479912.html">CreateTrigger</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMaxDatasetCount)) {
            query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            query.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The name of a project must be unique in a region.</p>
     * <ul>
     * <li>By default, you can create up to 100 projects in a region. If you want to request a quota increase to create more projects, submit a ticket or join the DingTalk chat group (ID: 88490020073).</li>
     * <li>After you create a project, you can create other Intelligent Media Management (IMM) resources in the project. For more information, see the following links:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/478160.html">CreateDataset</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/479912.html">CreateTrigger</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/606694.html">CreateBatch</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note that</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After clustering is completed, you can call the <a href="https://help.aliyun.com/document_detail/611304.html">QuerySimilarImageClusters</a> operation to query image clustering results.</li>
     * <li>An image cluster contains at lest two images. Removing similar images from the dataset affects existing image clusters. If image deletion reduces the number of images in a cluster to less than 2, the cluster is automatically deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Clusters images indexed into a dataset by similarity. Image clustering is suitable for image deduplication and selection. For example, you can use image clustering to filter photos in your album that are taken in continuous shooting mode.</p>
     * 
     * @param tmpReq CreateSimilarImageClusteringTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimilarImageClusteringTaskResponse
     */
    public CreateSimilarImageClusteringTaskResponse createSimilarImageClusteringTaskWithOptions(CreateSimilarImageClusteringTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSimilarImageClusteringTaskShrinkRequest request = new CreateSimilarImageClusteringTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimilarImageClusteringTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimilarImageClusteringTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note that</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Each call to the operation incrementally processes metadata in the dataset.****`` You can regularly call this operation to process incremental files.</li>
     * <li>After clustering is completed, you can call the <a href="https://help.aliyun.com/document_detail/611304.html">QuerySimilarImageClusters</a> operation to query image clustering results.</li>
     * <li>An image cluster contains at lest two images. Removing similar images from the dataset affects existing image clusters. If image deletion reduces the number of images in a cluster to less than 2, the cluster is automatically deleted.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Clusters images indexed into a dataset by similarity. Image clustering is suitable for image deduplication and selection. For example, you can use image clustering to filter photos in your album that are taken in continuous shooting mode.</p>
     * 
     * @param request CreateSimilarImageClusteringTaskRequest
     * @return CreateSimilarImageClusteringTaskResponse
     */
    public CreateSimilarImageClusteringTaskResponse createSimilarImageClusteringTask(CreateSimilarImageClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimilarImageClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a story.</p>
     * 
     * @param tmpReq CreateStoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoryResponse
     */
    public CreateStoryResponse createStoryWithOptions(CreateStoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStoryShrinkRequest request = new CreateStoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.address)) {
            request.addressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.address, "Address", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressShrink)) {
            body.put("Address", request.addressShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            body.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFileCount)) {
            body.put("MaxFileCount", request.maxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minFileCount)) {
            body.put("MinFileCount", request.minFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            body.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTime)) {
            body.put("StoryEndTime", request.storyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("StoryName", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTime)) {
            body.put("StoryStartTime", request.storyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            body.put("StorySubType", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("StoryType", request.storyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The operation is an asynchronous operation. After a task is executed, the task information is saved only for seven days. When the retention period ends, the task information can no longer be retrieved. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> to query information about the task. If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a story.</p>
     * 
     * @param request CreateStoryRequest
     * @return CreateStoryResponse
     */
    public CreateStoryResponse createStory(CreateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a trigger to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a trigger. A trigger can trigger Intelligent Media Management (IMM) based on events such as events in Object Storage Service (OSS) to process files, such as images, videos, and documents based on data processing templates.</p>
     * 
     * @param tmpReq CreateTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTriggerWithOptions(CreateTriggerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTriggerShrinkRequest request = new CreateTriggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actions)) {
            request.actionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actions, "Actions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionsShrink)) {
            body.put("Actions", request.actionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            body.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            body.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you want to create a trigger to process data in <a href="https://help.aliyun.com/document_detail/99372.html">OSS</a>, make sure that you have bound the dataset to the OSS bucket where the data is stored. For more information about how to bind a dataset to a bucket, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a trigger. A trigger can trigger Intelligent Media Management (IMM) based on events such as events in Object Storage Service (OSS) to process files, such as images, videos, and documents based on data processing templates.</p>
     * 
     * @param request CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2747104.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>For more information about video label detection, see <a href="https://help.aliyun.com/document_detail/477189.html">Video label detection</a>.</li>
     * <li>This operation supports multiple video formats, such as MP4, MPEG-TS, MKV, MOV, AVI, FLV, and M3U8.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the scene, object, and event tag information of video content. Scene information includes categories such as natural landscapes, life scenes, and disaster scenes. Event information includes categories such as talent shows, office events, performances, and production events. Object information includes categories such as tableware, electronic products, furniture, and transportation. Video tag detection supports more than 30 tag categories and thousands of tags.</p>
     * 
     * @param tmpReq CreateVideoLabelClassificationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoLabelClassificationTaskResponse
     */
    public CreateVideoLabelClassificationTaskResponse createVideoLabelClassificationTaskWithOptions(CreateVideoLabelClassificationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVideoLabelClassificationTaskShrinkRequest request = new CreateVideoLabelClassificationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoLabelClassificationTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoLabelClassificationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/2747104.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.
     * **
     * <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</li>
     * <li>For more information about video label detection, see <a href="https://help.aliyun.com/document_detail/477189.html">Video label detection</a>.</li>
     * <li>This operation supports multiple video formats, such as MP4, MPEG-TS, MKV, MOV, AVI, FLV, and M3U8.</li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects the scene, object, and event tag information of video content. Scene information includes categories such as natural landscapes, life scenes, and disaster scenes. Event information includes categories such as talent shows, office events, performances, and production events. Object information includes categories such as tableware, electronic products, furniture, and transportation. Video tag detection supports more than 30 tag categories and thousands of tags.</p>
     * 
     * @param request CreateVideoLabelClassificationTaskRequest
     * @return CreateVideoLabelClassificationTaskResponse
     */
    public CreateVideoLabelClassificationTaskResponse createVideoLabelClassificationTask(CreateVideoLabelClassificationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoLabelClassificationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The detection result is sent as an asynchronous notification. The Suggestion parameter in asynchronous notifications supports the following values:<ul>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance category. For more information, see <a href="https://help.aliyun.com/document_detail/2743995.html">Content moderation results</a>.</li>
     * <li>review: A manual review is needed. After the manual review is completed, an asynchronous notification is sent to inform you about the result.</li>
     * </ul>
     * </li>
     * <li>The following video frame requirements apply:<ul>
     * <li>The URLs for video frames must use HTTP or HTTPS.</li>
     * <li>Video frames must be in PNG, JPG, JPEG, BMP, GIF, or WebP format.</li>
     * <li>The size of a video frame cannot exceed 10 MB.</li>
     * <li>The resolution for video frames is not lower than 256 × 256 pixels. A frame resolution lower than this recommended resolution may affect detection accuracy.</li>
     * <li>The response time of the operation varies based on the amount of time required to download frames. Make sure that video frames to be detected are stored in a reliable and stable service. We recommend that you store video frames in OSS or cache video frames on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects risky or non-compliant content from videos. You can use this operation in scenarios such as intelligent pornography detection, terrorist content and political bias detection, ad violation detection, and logo detection.</p>
     * 
     * @param tmpReq CreateVideoModerationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoModerationTaskResponse
     */
    public CreateVideoModerationTaskResponse createVideoModerationTaskWithOptions(CreateVideoModerationTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVideoModerationTaskShrinkRequest request = new CreateVideoModerationTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scenes)) {
            request.scenesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scenes, "Scenes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFrames)) {
            query.put("MaxFrames", request.maxFrames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenesShrink)) {
            query.put("Scenes", request.scenesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoModerationTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoModerationTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****
     *     **
     *     <strong>Note</strong> Asynchronous processing does not guarantee timely task completion.</p>
     * <ul>
     * <li>The detection result is sent as an asynchronous notification. The Suggestion parameter in asynchronous notifications supports the following values:<ul>
     * <li>pass: No non-compliant content is found.</li>
     * <li>block: Non-compliant content is detected. The Categories field value indicates the non-compliance category. For more information, see <a href="https://help.aliyun.com/document_detail/2743995.html">Content moderation results</a>.</li>
     * <li>review: A manual review is needed. After the manual review is completed, an asynchronous notification is sent to inform you about the result.</li>
     * </ul>
     * </li>
     * <li>The following video frame requirements apply:<ul>
     * <li>The URLs for video frames must use HTTP or HTTPS.</li>
     * <li>Video frames must be in PNG, JPG, JPEG, BMP, GIF, or WebP format.</li>
     * <li>The size of a video frame cannot exceed 10 MB.</li>
     * <li>The resolution for video frames is not lower than 256 × 256 pixels. A frame resolution lower than this recommended resolution may affect detection accuracy.</li>
     * <li>The response time of the operation varies based on the amount of time required to download frames. Make sure that video frames to be detected are stored in a reliable and stable service. We recommend that you store video frames in OSS or cache video frames on Alibaba Cloud CDN.</li>
     * </ul>
     * </li>
     * <li>This operation is an asynchronous operation. After a task is executed, the task information is retained only for seven days and cannot be retrieved when the retention period elapses. You can call the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> or <a href="https://help.aliyun.com/document_detail/478242.html">ListTasks</a> operation to query information about the task.`` If you specify <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a>, you can obtain information about the task based on notifications. &gt;</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects risky or non-compliant content from videos. You can use this operation in scenarios such as intelligent pornography detection, terrorist content and political bias detection, ad violation detection, and logo detection.</p>
     * 
     * @param request CreateVideoModerationTaskRequest
     * @return CreateVideoModerationTaskResponse
     */
    public CreateVideoModerationTaskResponse createVideoModerationTask(CreateVideoModerationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoModerationTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can delete only a batch processing task that is in one of the following states: Ready, Failed, Suspended, and Succeeded.</p>
     * <ul>
     * <li>Before you delete a batch processing task, you can call the <a href="https://help.aliyun.com/document_detail/479922.html">GetBatch</a> operation to query the task status. This ensures a successful deletion.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a batch processing task.</p>
     * 
     * @param request DeleteBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBatchResponse
     */
    public DeleteBatchResponse deleteBatchWithOptions(DeleteBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can delete only a batch processing task that is in one of the following states: Ready, Failed, Suspended, and Succeeded.</p>
     * <ul>
     * <li>Before you delete a batch processing task, you can call the <a href="https://help.aliyun.com/document_detail/479922.html">GetBatch</a> operation to query the task status. This ensures a successful deletion.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a batch processing task.</p>
     * 
     * @param request DeleteBatchRequest
     * @return DeleteBatchResponse
     */
    public DeleteBatchResponse deleteBatch(DeleteBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>If you delete a binding, new changes in the OSS bucket are not synchronized to the dataset. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the binding between a dataset and an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request DeleteBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBindingResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>If you delete a binding, new changes in the OSS bucket are not synchronized to the dataset. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the binding between a dataset and an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request DeleteBindingRequest
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a dataset, make sure that you have deleted all indexes in the dataset. For more information about how to delete indexes, see <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> and <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a>.</p>
     * <ul>
     * <li>Before you <a href="https://help.aliyun.com/document_detail/478160.html">delete a dataset</a>, make sure that you have deleted all bindings between the dataset and Object Storage Service (OSS) buckets. For more information about how to delete a binding, see <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a>. The <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a> operation does not delete an index that is manually created, even if you set the <code>Cleanup</code> parameter to <code>true</code>. To delete indexes that are manually created, you must call the <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a> operation. For more information about the differences between automatically and manually created indexes, see <a href="https://help.aliyun.com/document_detail/478166.html">Create a metadata index</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
     * @param request DeleteDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDatasetWithOptions(DeleteDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a dataset, make sure that you have deleted all indexes in the dataset. For more information about how to delete indexes, see <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> and <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a>.</p>
     * <ul>
     * <li>Before you <a href="https://help.aliyun.com/document_detail/478160.html">delete a dataset</a>, make sure that you have deleted all bindings between the dataset and Object Storage Service (OSS) buckets. For more information about how to delete a binding, see <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a>. The <a href="https://help.aliyun.com/document_detail/478205.html">DeleteBinding</a> operation does not delete an index that is manually created, even if you set the <code>Cleanup</code> parameter to <code>true</code>. To delete indexes that are manually created, you must call the <a href="https://help.aliyun.com/document_detail/478172.html">DeleteFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478173.html">BatchDeleteFileMeta</a> operation. For more information about the differences between automatically and manually created indexes, see <a href="https://help.aliyun.com/document_detail/478166.html">Create a metadata index</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
     * @param request DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>The objects stored in Object Storage Service (OSS) or Photo and Drive Service are <strong>not</strong> deleted if you delete metadata from a dataset. If you want to delete the file, call the corresponding operations of OSS and Photo and Drive Service.</li>
     * <li>When you delete file metadata, the corresponding face clustering group information and story (if any) are changed, but the spatiotemporal clustering is not changed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the metadata of a file from a dataset.</p>
     * 
     * @param request DeleteFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileMetaResponse
     */
    public DeleteFileMetaResponse deleteFileMetaWithOptions(DeleteFileMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>A successful deletion message is returned regardless of whether the metadata of the file exists in the dataset.<blockquote>
     * </blockquote>
     * </li>
     * <li>The objects stored in Object Storage Service (OSS) or Photo and Drive Service are <strong>not</strong> deleted if you delete metadata from a dataset. If you want to delete the file, call the corresponding operations of OSS and Photo and Drive Service.</li>
     * <li>When you delete file metadata, the corresponding face clustering group information and story (if any) are changed, but the spatiotemporal clustering is not changed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the metadata of a file from a dataset.</p>
     * 
     * @param request DeleteFileMetaRequest
     * @return DeleteFileMetaResponse
     */
    public DeleteFileMetaResponse deleteFileMeta(DeleteFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to perform spatiotemporal clustering.</li>
     * <li>A successful deletion is returned regardless of whether a spatiotemporal clustering group ID exists.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a spatiotemporal cluster.</p>
     * 
     * @param request DeleteLocationDateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLocationDateClusterResponse
     */
    public DeleteLocationDateClusterResponse deleteLocationDateClusterWithOptions(DeleteLocationDateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLocationDateCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLocationDateClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to perform spatiotemporal clustering.</li>
     * <li>A successful deletion is returned regardless of whether a spatiotemporal clustering group ID exists.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a spatiotemporal cluster.</p>
     * 
     * @param request DeleteLocationDateClusterRequest
     * @return DeleteLocationDateClusterResponse
     */
    public DeleteLocationDateClusterResponse deleteLocationDateCluster(DeleteLocationDateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLocationDateClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a project, make sure that all resources in the project, such as datasets, bindings, batch processing tasks, and triggers, are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/478164.html">DeleteDataset</a>, <a href="https://help.aliyun.com/document_detail/479918.html">DeleteBatch</a>, and <a href="https://help.aliyun.com/document_detail/479915.html">DeleteTrigger</a>.</p>
     * <ul>
     * <li>After a project is deleted, all resources used by the project are recycled, and all related data is lost and cannot be recovered.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a project, make sure that all resources in the project, such as datasets, bindings, batch processing tasks, and triggers, are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/478164.html">DeleteDataset</a>, <a href="https://help.aliyun.com/document_detail/479918.html">DeleteBatch</a>, and <a href="https://help.aliyun.com/document_detail/479915.html">DeleteTrigger</a>.</p>
     * <ul>
     * <li>After a project is deleted, all resources used by the project are recycled, and all related data is lost and cannot be recovered.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a story.</p>
     * 
     * @param request DeleteStoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStoryResponse
     */
    public DeleteStoryResponse deleteStoryWithOptions(DeleteStoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a story.</p>
     * 
     * @param request DeleteStoryRequest
     * @return DeleteStoryResponse
     */
    public DeleteStoryResponse deleteStory(DeleteStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a trigger only if the trigger is in one of the following states: Ready, Failed, Suspended, and Succeeded. You cannot delete a trigger that is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a trigger.</p>
     * 
     * @param request DeleteTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTriggerWithOptions(DeleteTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a trigger only if the trigger is in one of the following states: Ready, Failed, Suspended, and Succeeded. You cannot delete a trigger that is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a trigger.</p>
     * 
     * @param request DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that the project is bound to a bucket. For more information, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds an Object Storage Service (OSS) bucket from the corresponding project.</p>
     * 
     * @param request DetachOSSBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachOSSBucketResponse
     */
    public DetachOSSBucketResponse detachOSSBucketWithOptions(DetachOSSBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachOSSBucket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachOSSBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that the project is bound to a bucket. For more information, see <a href="https://help.aliyun.com/document_detail/478206.html">AttachOSSBucket</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds an Object Storage Service (OSS) bucket from the corresponding project.</p>
     * 
     * @param request DetachOSSBucketRequest
     * @return DetachOSSBucketResponse
     */
    public DetachOSSBucketResponse detachOSSBucket(DetachOSSBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachOSSBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects human body information, such as the confidence level and body bounding box, in an image.</p>
     * 
     * @param tmpReq DetectImageBodiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageBodiesResponse
     */
    public DetectImageBodiesResponse detectImageBodiesWithOptions(DetectImageBodiesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageBodiesShrinkRequest request = new DetectImageBodiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitivity)) {
            query.put("Sensitivity", request.sensitivity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageBodies"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageBodiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects human body information, such as the confidence level and body bounding box, in an image.</p>
     * 
     * @param request DetectImageBodiesRequest
     * @return DetectImageBodiesResponse
     */
    public DetectImageBodiesResponse detectImageBodies(DetectImageBodiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageBodiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detects the outline data, attributes, and license plate information of vehicles in an image. The vehicle attributes include the vehicle color (CarColor) and vehicle type (CarType). The license plate information includes the recognition content (Content) and plate frame (Boundary).</p>
     * 
     * @param tmpReq DetectImageCarsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageCarsResponse
     */
    public DetectImageCarsResponse detectImageCarsWithOptions(DetectImageCarsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageCarsShrinkRequest request = new DetectImageCarsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageCars"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageCarsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detects the outline data, attributes, and license plate information of vehicles in an image. The vehicle attributes include the vehicle color (CarColor) and vehicle type (CarType). The license plate information includes the recognition content (Content) and plate frame (Boundary).</p>
     * 
     * @param request DetectImageCarsRequest
     * @return DetectImageCarsResponse
     */
    public DetectImageCarsResponse detectImageCars(DetectImageCarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageCarsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detects barcodes and QR codes in an image.</p>
     * 
     * @param tmpReq DetectImageCodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageCodesResponse
     */
    public DetectImageCodesResponse detectImageCodesWithOptions(DetectImageCodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageCodesShrinkRequest request = new DetectImageCodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageCodes"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageCodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detects barcodes and QR codes in an image.</p>
     * 
     * @param request DetectImageCodesRequest
     * @return DetectImageCodesResponse
     */
    public DetectImageCodesResponse detectImageCodes(DetectImageCodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageCodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the cropping area that produces the optimal visual effect based on a given image ratio by using AI model capabilities.</p>
     * 
     * @param tmpReq DetectImageCroppingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageCroppingResponse
     */
    public DetectImageCroppingResponse detectImageCroppingWithOptions(DetectImageCroppingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageCroppingShrinkRequest request = new DetectImageCroppingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatios)) {
            query.put("AspectRatios", request.aspectRatios);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageCropping"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageCroppingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects the cropping area that produces the optimal visual effect based on a given image ratio by using AI model capabilities.</p>
     * 
     * @param request DetectImageCroppingRequest
     * @return DetectImageCroppingResponse
     */
    public DetectImageCroppingResponse detectImageCropping(DetectImageCroppingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageCroppingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects faces from an image, including face boundary information, attributes, and quality. The boundary information includes the distance from the y-coordinate of the vertex to the top edge (Top), distance from the x-coordinate of the vertex to the left edge (Left), height (Height), and width (Width). Face attributes include the age (Age), age standard deviation (AgeSD), gender (Gender), emotion (Emotion), mouth opening (Mouth), beard (Beard), hat wearing (Hat), mask wearing (Mask), glasses wearing (Glasses), head orientation (HeadPose), attractiveness (Attractive), and confidence levels for preceding attributes. Quality information includes the face quality score (FaceQuality) and face resolution (Sharpness).</p>
     * 
     * @param tmpReq DetectImageFacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageFacesResponse
     */
    public DetectImageFacesResponse detectImageFacesWithOptions(DetectImageFacesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageFacesShrinkRequest request = new DetectImageFacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageFaces"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageFacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects faces from an image, including face boundary information, attributes, and quality. The boundary information includes the distance from the y-coordinate of the vertex to the top edge (Top), distance from the x-coordinate of the vertex to the left edge (Left), height (Height), and width (Width). Face attributes include the age (Age), age standard deviation (AgeSD), gender (Gender), emotion (Emotion), mouth opening (Mouth), beard (Beard), hat wearing (Hat), mask wearing (Mask), glasses wearing (Glasses), head orientation (HeadPose), attractiveness (Attractive), and confidence levels for preceding attributes. Quality information includes the face quality score (FaceQuality) and face resolution (Sharpness).</p>
     * 
     * @param request DetectImageFacesRequest
     * @return DetectImageFacesResponse
     */
    public DetectImageFacesResponse detectImageFaces(DetectImageFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageFacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that an IMM <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For more information about the features of this operation, see <a href="https://help.aliyun.com/document_detail/477179.html">Image label detection</a>.</li>
     * <li>For more information about the input images supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects scene, object, and event information in an image. Scene information includes natural landscapes, daily life, and disasters. Event information includes talent shows, office events, performances, and production events. Object information includes tableware, electronics, furniture, and transportation. The DetectImageLabels operation supports more than 30 different categories and thousands of labels.</p>
     * 
     * @param tmpReq DetectImageLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageLabelsResponse
     */
    public DetectImageLabelsResponse detectImageLabelsWithOptions(DetectImageLabelsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageLabelsShrinkRequest request = new DetectImageLabelsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageLabels"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageLabelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that an IMM <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>For more information about the features of this operation, see <a href="https://help.aliyun.com/document_detail/477179.html">Image label detection</a>.</li>
     * <li>For more information about the input images supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits on images</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects scene, object, and event information in an image. Scene information includes natural landscapes, daily life, and disasters. Event information includes talent shows, office events, performances, and production events. Object information includes tableware, electronics, furniture, and transportation. The DetectImageLabels operation supports more than 30 different categories and thousands of labels.</p>
     * 
     * @param request DetectImageLabelsRequest
     * @return DetectImageLabelsResponse
     */
    public DetectImageLabelsResponse detectImageLabels(DetectImageLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageLabelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478273.html">Project management</a>.<a href="~~478152~~"></a></li>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the aesthetics quality score of an image based on metrics such as the composition, brightness, contrast, color, and resolution. The operation returns a score within the range from 0 to 1. A higher score indicates better image quality.</p>
     * 
     * @param tmpReq DetectImageScoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageScoreResponse
     */
    public DetectImageScoreResponse detectImageScoreWithOptions(DetectImageScoreRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageScoreShrinkRequest request = new DetectImageScoreShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageScore"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageScoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478273.html">Project management</a>.<a href="~~478152~~"></a></li>
     * <li>For information about the image encoding formats supported by this operation, see <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calculates the aesthetics quality score of an image based on metrics such as the composition, brightness, contrast, color, and resolution. The operation returns a score within the range from 0 to 1. A higher score indicates better image quality.</p>
     * 
     * @param request DetectImageScoreRequest
     * @return DetectImageScoreResponse
     */
    public DetectImageScoreResponse detectImageScore(DetectImageScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageScoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The size of the image cannot exceed 20 MB.</li>
     * <li>The shortest side of the image is not less than 20 px, and the longest side is not more than 30,000 px.</li>
     * <li>The aspect ratio of the image is less than 1:2.</li>
     * <li>We recommend that you do not use an image that is smaller than 15 px × 15 px in size. Otherwise, the recognition rate is low.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recognizes and extracts text content from an image.</p>
     * 
     * @param tmpReq DetectImageTextsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectImageTextsResponse
     */
    public DetectImageTextsResponse detectImageTextsWithOptions(DetectImageTextsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectImageTextsShrinkRequest request = new DetectImageTextsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectImageTexts"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectImageTextsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The size of the image cannot exceed 20 MB.</li>
     * <li>The shortest side of the image is not less than 20 px, and the longest side is not more than 30,000 px.</li>
     * <li>The aspect ratio of the image is less than 1:2.</li>
     * <li>We recommend that you do not use an image that is smaller than 15 px × 15 px in size. Otherwise, the recognition rate is low.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recognizes and extracts text content from an image.</p>
     * 
     * @param request DetectImageTextsRequest
     * @return DetectImageTextsResponse
     */
    public DetectImageTextsResponse detectImageTexts(DetectImageTextsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageTextsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries media metadata, including the media format and stream information.</p>
     * 
     * @param tmpReq DetectMediaMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectMediaMetaResponse
     */
    public DetectMediaMetaResponse detectMediaMetaWithOptions(DetectMediaMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetectMediaMetaShrinkRequest request = new DetectMediaMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectMediaMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectMediaMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Make sure that the specified project exists in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries media metadata, including the media format and stream information.</p>
     * 
     * @param request DetectMediaMetaRequest
     * @return DetectMediaMetaResponse
     */
    public DetectMediaMetaResponse detectMediaMeta(DetectMediaMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectMediaMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <blockquote>
     * <p> The text compliance detection feature only supports Chinese characters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detects whether specified text contains anomalies, such as pornography, advertisements, excessive junk content, politically sensitive content, and abuse.</p>
     * 
     * @param request DetectTextAnomalyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectTextAnomalyResponse
     */
    public DetectTextAnomalyResponse detectTextAnomalyWithOptions(DetectTextAnomalyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectTextAnomaly"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectTextAnomalyResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <blockquote>
     * <p> The text compliance detection feature only supports Chinese characters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detects whether specified text contains anomalies, such as pornography, advertisements, excessive junk content, politically sensitive content, and abuse.</p>
     * 
     * @param request DetectTextAnomalyRequest
     * @return DetectTextAnomalyResponse
     */
    public DetectTextAnomalyResponse detectTextAnomaly(DetectTextAnomalyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectTextAnomalyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>You can embed only text as blind watermarks to an image.</li>
     * <li>The format of the output image is the same as that of the input image.</li>
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, and color transformation, are performed on the image.</li>
     * <li>Pure black and white images and images with low resolution (roughly less than 200 px × 200 px,) are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Embeds specific textual information into an image as watermarks. These watermarks are visually imperceptible and do not affect the aesthetics of the image or the integrity of the original data. The watermarks can be extracted by using the CreateDecodeBlindWatermarkTask operation.</p>
     * 
     * @param request EncodeBlindWatermarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EncodeBlindWatermarkResponse
     */
    public EncodeBlindWatermarkResponse encodeBlindWatermarkWithOptions(EncodeBlindWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageQuality)) {
            query.put("ImageQuality", request.imageQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strengthLevel)) {
            query.put("StrengthLevel", request.strengthLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetURI)) {
            query.put("TargetURI", request.targetURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EncodeBlindWatermark"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncodeBlindWatermarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of Intelligent Media Management (IMM).</p>
     * <ul>
     * <li>Make sure that an IMM project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</li>
     * <li>You can embed only text as blind watermarks to an image.</li>
     * <li>The format of the output image is the same as that of the input image.</li>
     * <li>A blind watermark can still be extracted even if attacks, such as compression, scaling, cropping, and color transformation, are performed on the image.</li>
     * <li>Pure black and white images and images with low resolution (roughly less than 200 px × 200 px,) are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Embeds specific textual information into an image as watermarks. These watermarks are visually imperceptible and do not affect the aesthetics of the image or the integrity of the original data. The watermarks can be extracted by using the CreateDecodeBlindWatermarkTask operation.</p>
     * 
     * @param request EncodeBlindWatermarkRequest
     * @return EncodeBlindWatermarkResponse
     */
    public EncodeBlindWatermarkResponse encodeBlindWatermark(EncodeBlindWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encodeBlindWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product.</strong></li>
     * <li>Before calling this interface, ensure that there is an available project (<a href="https://help.aliyun.com/document_detail/478273.html">Project</a>) in the current Region. For more details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>Supports common Word, Excel, PPT, PDF, and TXT documents.</li>
     * <li>The file size must not exceed 200 MB. The extracted plain text file size should not exceed 2 MB (approximately 600,000 Chinese characters).<blockquote>
     * <p>Notice: If the document format is complex or the text volume is too large, a timeout error may occur. In such scenarios, it is recommended to use the <a href="478228">CreateOfficeConversionTask</a> interface and specify the output format as txt to achieve similar functionality.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extract text from the document</p>
     * 
     * @param tmpReq ExtractDocumentTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExtractDocumentTextResponse
     */
    public ExtractDocumentTextResponse extractDocumentTextWithOptions(ExtractDocumentTextRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExtractDocumentTextShrinkRequest request = new ExtractDocumentTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtractDocumentText"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtractDocumentTextResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before using this interface, please make sure you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product.</strong></li>
     * <li>Before calling this interface, ensure that there is an available project (<a href="https://help.aliyun.com/document_detail/478273.html">Project</a>) in the current Region. For more details, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>Supports common Word, Excel, PPT, PDF, and TXT documents.</li>
     * <li>The file size must not exceed 200 MB. The extracted plain text file size should not exceed 2 MB (approximately 600,000 Chinese characters).<blockquote>
     * <p>Notice: If the document format is complex or the text volume is too large, a timeout error may occur. In such scenarios, it is recommended to use the <a href="478228">CreateOfficeConversionTask</a> interface and specify the output format as txt to achieve similar functionality.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extract text from the document</p>
     * 
     * @param request ExtractDocumentTextRequest
     * @return ExtractDocumentTextResponse
     */
    public ExtractDocumentTextResponse extractDocumentText(ExtractDocumentTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractDocumentTextWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 88490020073) and share your questions with us.</li>
     * <li>For information about the fields that you can use as query conditions, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the extracted file metadata, including the file name, labels, path, custom tags, text, and other fields. If the value of a metadata field of a file matches the specified string, the metadata of the file is returned.</p>
     * 
     * @param tmpReq FuzzyQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FuzzyQueryResponse
     */
    public FuzzyQueryResponse fuzzyQueryWithOptions(FuzzyQueryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FuzzyQueryShrinkRequest request = new FuzzyQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FuzzyQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FuzzyQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 88490020073) and share your questions with us.</li>
     * <li>For information about the fields that you can use as query conditions, see <a href="https://help.aliyun.com/document_detail/2743991.html">Supported fields and operators</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the extracted file metadata, including the file name, labels, path, custom tags, text, and other fields. If the value of a metadata field of a file matches the specified string, the metadata of the file is returned.</p>
     * 
     * @param request FuzzyQueryRequest
     * @return FuzzyQueryResponse
     */
    public FuzzyQueryResponse fuzzyQuery(FuzzyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fuzzyQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the project that you want to use is available in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>By default, you can call this operation to process only one video, audio, or subtitle track. You can specify the number of the video, audio, or subtitle tracks that you want to process.</li>
     * <li>You can call this operation to generate a media playlist and a master playlist. For more information, see the parameter description.</li>
     * <li>This operation is a synchronous operation. Synchronous or asynchronous transcoding is triggered only during playback or pre-transcoding. You can configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to obtain the transcoding task result.</li>
     * <li>For information about the feature description of this operation, see <a href="https://help.aliyun.com/document_detail/477192.html">Live transcoding</a>.</li>
     * <li>The data processing capability of Object Storage Service (OSS) also provides the playlist generation feature. However, this feature can generate only a media playlist, and related parameters are simplified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a live transcoding playlist and converts video files into M3U8 files. After a playlist is generated, the videos in the playlist are immediately played and the video files are transcoded based on the playback progress. Compared with offline transcoding, online transcoding significantly reduces the time spent in waiting for the videos to be transcoded and reduces transcoding and storage costs.</p>
     * 
     * @param tmpReq GenerateVideoPlaylistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateVideoPlaylistResponse
     */
    public GenerateVideoPlaylistResponse generateVideoPlaylistWithOptions(GenerateVideoPlaylistRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateVideoPlaylistShrinkRequest request = new GenerateVideoPlaylistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceSubtitles)) {
            request.sourceSubtitlesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceSubtitles, "SourceSubtitles", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targets)) {
            request.targetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targets, "Targets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterURI)) {
            query.put("MasterURI", request.masterURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwritePolicy)) {
            query.put("OverwritePolicy", request.overwritePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDuration)) {
            query.put("SourceDuration", request.sourceDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceStartTime)) {
            query.put("SourceStartTime", request.sourceStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSubtitlesShrink)) {
            query.put("SourceSubtitles", request.sourceSubtitlesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetsShrink)) {
            query.put("Targets", request.targetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateVideoPlaylist"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateVideoPlaylistResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the project that you want to use is available in the current region. For more information, see <a href="https://help.aliyun.com/document_detail/478152.html">Project Management</a>.</li>
     * <li>By default, you can call this operation to process only one video, audio, or subtitle track. You can specify the number of the video, audio, or subtitle tracks that you want to process.</li>
     * <li>You can call this operation to generate a media playlist and a master playlist. For more information, see the parameter description.</li>
     * <li>This operation is a synchronous operation. Synchronous or asynchronous transcoding is triggered only during playback or pre-transcoding. You can configure the <a href="https://help.aliyun.com/document_detail/2743997.html">Notification</a> parameter to obtain the transcoding task result.</li>
     * <li>For information about the feature description of this operation, see <a href="https://help.aliyun.com/document_detail/477192.html">Live transcoding</a>.</li>
     * <li>The data processing capability of Object Storage Service (OSS) also provides the playlist generation feature. However, this feature can generate only a media playlist, and related parameters are simplified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a live transcoding playlist and converts video files into M3U8 files. After a playlist is generated, the videos in the playlist are immediately played and the video files are transcoded based on the playback progress. Compared with offline transcoding, online transcoding significantly reduces the time spent in waiting for the videos to be transcoded and reduces transcoding and storage costs.</p>
     * 
     * @param request GenerateVideoPlaylistRequest
     * @return GenerateVideoPlaylistResponse
     */
    public GenerateVideoPlaylistResponse generateVideoPlaylist(GenerateVideoPlaylistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateVideoPlaylistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>The access token expires in 30 minutes, and the refresh token expires in 1 day.</li>
     * <li>The returned expiration time is in UTC, which has an 8-hour difference from Beijing Time.</li>
     * <li>Supported input file formats:<ul>
     * <li>Word documents: doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, rtf.</li>
     * <li>Presentation documents (PPT): ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, dps.</li>
     * <li>Spreadsheet documents (Excel): et, xls, xlt, xlsx, xlsm, xltx, xltm, csv</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * </li>
     * <li>Supports files up to 200MB.</li>
     * <li>Supports documents with a maximum of 5000 pages.</li>
     * <li>Projects created before 2023-12-01 are billed based on the number of document openings. Currently, billing is based on the number of API calls. To switch to the new billing model, simply create a new project. Note that one API call can only be used by one user; if reused, only the last user will have normal access, and the access rights of other users will be revoked.</li>
     * <li>In the same region as the Intelligent Media Management, activate MNS service, create topics and queues, and configure subscription relationships. You can pass the MNS topic name through the NotifyTopicName parameter to receive message notifications for file saves. For more information about the MNS SDK, see <a href="https://help.aliyun.com/document_detail/32449.html">Receiving and Deleting Messages</a>.
     * For an example of the JSON format of the Message field in file save message notifications, refer to <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice Message Notification Format</a>.<blockquote>
     * <p>To use the multi-version feature, you must first enable the multi-version feature in OSS, then set the \&quot;History\&quot; parameter to true.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates an access token for document preview or editing.</p>
     * 
     * @param tmpReq GenerateWebofficeTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateWebofficeTokenResponse
     */
    public GenerateWebofficeTokenResponse generateWebofficeTokenWithOptions(GenerateWebofficeTokenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateWebofficeTokenShrinkRequest request = new GenerateWebofficeTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permission)) {
            request.permissionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permission, "Permission", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.user)) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.user, "User", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.watermark)) {
            request.watermarkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.watermark, "Watermark", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cachePreview)) {
            query.put("CachePreview", request.cachePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUploaded)) {
            query.put("ExternalUploaded", request.externalUploaded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            query.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidecmb)) {
            query.put("Hidecmb", request.hidecmb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionShrink)) {
            query.put("Permission", request.permissionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewPages)) {
            query.put("PreviewPages", request.previewPages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referer)) {
            query.put("Referer", request.referer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            query.put("User", request.userShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkShrink)) {
            query.put("Watermark", request.watermarkShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateWebofficeToken"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateWebofficeTokenResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>The access token expires in 30 minutes, and the refresh token expires in 1 day.</li>
     * <li>The returned expiration time is in UTC, which has an 8-hour difference from Beijing Time.</li>
     * <li>Supported input file formats:<ul>
     * <li>Word documents: doc, docx, txt, dot, wps, wpt, dotx, docm, dotm, rtf.</li>
     * <li>Presentation documents (PPT): ppt, pptx, pptm, ppsx, ppsm, pps, potx, potm, dpt, dps.</li>
     * <li>Spreadsheet documents (Excel): et, xls, xlt, xlsx, xlsm, xltx, xltm, csv</li>
     * <li>PDF documents: pdf.</li>
     * </ul>
     * </li>
     * <li>Supports files up to 200MB.</li>
     * <li>Supports documents with a maximum of 5000 pages.</li>
     * <li>Projects created before 2023-12-01 are billed based on the number of document openings. Currently, billing is based on the number of API calls. To switch to the new billing model, simply create a new project. Note that one API call can only be used by one user; if reused, only the last user will have normal access, and the access rights of other users will be revoked.</li>
     * <li>In the same region as the Intelligent Media Management, activate MNS service, create topics and queues, and configure subscription relationships. You can pass the MNS topic name through the NotifyTopicName parameter to receive message notifications for file saves. For more information about the MNS SDK, see <a href="https://help.aliyun.com/document_detail/32449.html">Receiving and Deleting Messages</a>.
     * For an example of the JSON format of the Message field in file save message notifications, refer to <a href="https://help.aliyun.com/document_detail/2743999.html">WebOffice Message Notification Format</a>.<blockquote>
     * <p>To use the multi-version feature, you must first enable the multi-version feature in OSS, then set the \&quot;History\&quot; parameter to true.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates an access token for document preview or editing.</p>
     * 
     * @param request GenerateWebofficeTokenRequest
     * @return GenerateWebofficeTokenResponse
     */
    public GenerateWebofficeTokenResponse generateWebofficeToken(GenerateWebofficeTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateWebofficeTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a batch processing task.</p>
     * 
     * @param request GetBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchResponse
     */
    public GetBatchResponse getBatchWithOptions(GetBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a batch processing task.</p>
     * 
     * @param request GetBatchRequest
     * @return GetBatchResponse
     */
    public GetBatchResponse getBatch(GetBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the binding relationship that you want to query exists. For information about how to create a binding relationship, see <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding relationship between a specific dataset and an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request GetBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBindingResponse
     */
    public GetBindingResponse getBindingWithOptions(GetBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBinding"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBindingResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Make sure that the binding relationship that you want to query exists. For information about how to create a binding relationship, see <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding relationship between a specific dataset and an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request GetBindingRequest
     * @return GetBindingResponse
     */
    public GetBindingResponse getBinding(GetBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBindingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>drmlicense获取</p>
     * 
     * @deprecated OpenAPI GetDRMLicense is deprecated
     * 
     * @param request GetDRMLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDRMLicenseResponse
     */
    @Deprecated
    // Deprecated
    public GetDRMLicenseResponse getDRMLicenseWithOptions(GetDRMLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyEndpoint)) {
            query.put("NotifyEndpoint", request.notifyEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyTopicName)) {
            query.put("NotifyTopicName", request.notifyTopicName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionSystem)) {
            query.put("ProtectionSystem", request.protectionSystem);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDRMLicense"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDRMLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>drmlicense获取</p>
     * 
     * @deprecated OpenAPI GetDRMLicense is deprecated
     * 
     * @param request GetDRMLicenseRequest
     * @return GetDRMLicenseResponse
     */
    @Deprecated
    // Deprecated
    public GetDRMLicenseResponse getDRMLicense(GetDRMLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDRMLicenseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The GetDataset operation supports real-time retrieval of file statistics. You can specify WithStatistics to enable real-time retrieval of file statistics.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * 
     * @param request GetDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDatasetWithOptions(GetDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("WithStatistics", request.withStatistics);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatasetResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>The GetDataset operation supports real-time retrieval of file statistics. You can specify WithStatistics to enable real-time retrieval of file statistics.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * 
     * @param request GetDatasetRequest
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDataset(GetDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatasetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that an invisible watermark task is created and the task ID is obtained.``</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an invisible watermark parsing task.</p>
     * 
     * @param request GetDecodeBlindWatermarkResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDecodeBlindWatermarkResultResponse
     */
    public GetDecodeBlindWatermarkResultResponse getDecodeBlindWatermarkResultWithOptions(GetDecodeBlindWatermarkResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDecodeBlindWatermarkResult"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDecodeBlindWatermarkResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that an Intelligent Media Management (IMM) project is created. For information about how to create a project, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that an invisible watermark task is created and the task ID is obtained.``</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an invisible watermark parsing task.</p>
     * 
     * @param request GetDecodeBlindWatermarkResultRequest
     * @return GetDecodeBlindWatermarkResultResponse
     */
    public GetDecodeBlindWatermarkResultResponse getDecodeBlindWatermarkResult(GetDecodeBlindWatermarkResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDecodeBlindWatermarkResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains basic information about face clustering, including the creation time, number of images, and cover.</p>
     * 
     * @param request GetFigureClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFigureClusterResponse
     */
    public GetFigureClusterResponse getFigureClusterWithOptions(GetFigureClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFigureClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains basic information about face clustering, including the creation time, number of images, and cover.</p>
     * 
     * @param request GetFigureClusterRequest
     * @return GetFigureClusterResponse
     */
    public GetFigureClusterResponse getFigureCluster(GetFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata of a file whose metadata is indexed into the dataset.</p>
     * 
     * @param tmpReq GetFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileMetaResponse
     */
    public GetFileMetaResponse getFileMetaWithOptions(GetFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetFileMetaShrinkRequest request = new GetFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata of a file whose metadata is indexed into the dataset.</p>
     * 
     * @param request GetFileMetaRequest
     * @return GetFileMetaResponse
     */
    public GetFileMetaResponse getFileMeta(GetFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image compliance detection task.</p>
     * 
     * @param request GetImageModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageModerationResultResponse
     */
    public GetImageModerationResultResponse getImageModerationResultWithOptions(GetImageModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageModerationResult"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image compliance detection task.</p>
     * 
     * @param request GetImageModerationResultRequest
     * @return GetImageModerationResultResponse
     */
    public GetImageModerationResultResponse getImageModerationResult(GetImageModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that <a href="https://help.aliyun.com/document_detail/478206.html">the project whose name you want to query is bound to the specified OSS bucket</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the name of the project bound to an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request GetOSSBucketAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSBucketAttachmentResponse
     */
    public GetOSSBucketAttachmentResponse getOSSBucketAttachmentWithOptions(GetOSSBucketAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSBucketAttachment"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOSSBucketAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that <a href="https://help.aliyun.com/document_detail/478206.html">the project whose name you want to query is bound to the specified OSS bucket</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the name of the project bound to an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request GetOSSBucketAttachmentRequest
     * @return GetOSSBucketAttachmentResponse
     */
    public GetOSSBucketAttachmentResponse getOSSBucketAttachment(GetOSSBucketAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSBucketAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can enable the real-time retrieval of file statistics based on your business requirements. For more information, see the &quot;Request parameters&quot; section of this topic.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, datasets, and file statistics of a project.</p>
     * 
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStatistics)) {
            query.put("WithStatistics", request.withStatistics);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can enable the real-time retrieval of file statistics based on your business requirements. For more information, see the &quot;Request parameters&quot; section of this topic.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information, datasets, and file statistics of a project.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a story.</p>
     * 
     * @param request GetStoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStoryResponse
     */
    public GetStoryResponse getStoryWithOptions(GetStoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a story.</p>
     * 
     * @param request GetStoryRequest
     * @return GetStoryResponse
     */
    public GetStoryResponse getStory(GetStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an asynchronous task. Intelligent Media Management (IMM) has multiple asynchronous data processing capabilities, each of which has its own operation for creating tasks. For example, you can call the CreateFigureClusteringTask operation to create a face clustering task and the CreateFileCompressionTask operation to create a file compression task. The GetTask operation is a general operation. You can call this operation to query information about asynchronous tasks by task ID or type.</p>
     * 
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestDefinition)) {
            query.put("RequestDefinition", request.requestDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an asynchronous task. Intelligent Media Management (IMM) has multiple asynchronous data processing capabilities, each of which has its own operation for creating tasks. For example, you can call the CreateFigureClusteringTask operation to create a face clustering task and the CreateFileCompressionTask operation to create a file compression task. The GetTask operation is a general operation. You can call this operation to query information about asynchronous tasks by task ID or type.</p>
     * 
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a trigger.</p>
     * 
     * @param request GetTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTriggerResponse
     */
    public GetTriggerResponse getTriggerWithOptions(GetTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTriggerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a trigger.</p>
     * 
     * @param request GetTriggerRequest
     * @return GetTriggerResponse
     */
    public GetTriggerResponse getTrigger(GetTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that a <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created on Intelligent Media Management (IMM). For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that a video label detection task is created and the <code>TaskId</code> of the task is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/478223.html">CreateVideoLabelClassificationTask</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a video label detection task.</p>
     * 
     * @param request GetVideoLabelClassificationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoLabelClassificationResultResponse
     */
    public GetVideoLabelClassificationResultResponse getVideoLabelClassificationResultWithOptions(GetVideoLabelClassificationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoLabelClassificationResult"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoLabelClassificationResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that a <a href="https://help.aliyun.com/document_detail/478273.html">project</a> is created on Intelligent Media Management (IMM). For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that a video label detection task is created and the <code>TaskId</code> of the task is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/478223.html">CreateVideoLabelClassificationTask</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a video label detection task.</p>
     * 
     * @param request GetVideoLabelClassificationResultRequest
     * @return GetVideoLabelClassificationResultResponse
     */
    public GetVideoLabelClassificationResultResponse getVideoLabelClassificationResult(GetVideoLabelClassificationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoLabelClassificationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a video moderation task.</p>
     * 
     * @param request GetVideoModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoModerationResultResponse
     */
    public GetVideoModerationResultResponse getVideoModerationResultWithOptions(GetVideoModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoModerationResult"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a video moderation task.</p>
     * 
     * @param request GetVideoModerationResultRequest
     * @return GetVideoModerationResultResponse
     */
    public GetVideoModerationResultResponse getVideoModerationResult(GetVideoModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about how to create indexes from metadata, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>For information about the limits on the maximum number and size of index files that you can create, see the &quot;Limits on datasets&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic. For information about how to create a dataset, see the &quot;CreateDataset&quot; topic.</li>
     * <li>For information about the regions in which you can create index files from metadata, see the &quot;Datasets and indexes&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * <li>After you create an index from metadata, you can try <a href="https://help.aliyun.com/document_detail/478175.html">simple query</a> to retrieve data. For information about other query capabilities, see <a href="https://help.aliyun.com/document_detail/2402363.html">Query and statistics</a>. You can also <a href="https://help.aliyun.com/document_detail/478180.html">create a face clustering task</a> to group faces. For information about other clustering capabilities, see <a href="https://help.aliyun.com/document_detail/2402365.html">Intelligent management</a>.
     * **
     * <strong>Usage notes</strong></li>
     * <li>The IndexFileMeta operation is asynchronous, indicating that it takes some time to process the data after a request is submitted. After the processing is complete, the metadata is stored in your dataset. The amount of time it takes for this process varies based on <a href="https://help.aliyun.com/document_detail/466304.html">the workflow template, the operator</a>, and the content of the file, ranging from several seconds to several minutes or even longer. You can subscribe to <a href="https://help.aliyun.com/document_detail/2743997.html">Simple Message Service</a> for task completion notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an index from metadata extracted by using techniques such as label recognition, face detection, and location detection from input files. You can retrieve data from the same dataset by using multiple methods.</p>
     * 
     * @param tmpReq IndexFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IndexFileMetaResponse
     */
    public IndexFileMetaResponse indexFileMetaWithOptions(IndexFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IndexFileMetaShrinkRequest request = new IndexFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.file)) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.file, "File", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notification)) {
            request.notificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notification, "Notification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileShrink)) {
            query.put("File", request.fileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationShrink)) {
            query.put("Notification", request.notificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IndexFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IndexFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>For information about how to create indexes from metadata, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</li>
     * <li>For information about the limits on the maximum number and size of index files that you can create, see the &quot;Limits on datasets&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic. For information about how to create a dataset, see the &quot;CreateDataset&quot; topic.</li>
     * <li>For information about the regions in which you can create index files from metadata, see the &quot;Datasets and indexes&quot; section of the <a href="https://help.aliyun.com/document_detail/475569.html">Limits</a> topic.</li>
     * <li>After you create an index from metadata, you can try <a href="https://help.aliyun.com/document_detail/478175.html">simple query</a> to retrieve data. For information about other query capabilities, see <a href="https://help.aliyun.com/document_detail/2402363.html">Query and statistics</a>. You can also <a href="https://help.aliyun.com/document_detail/478180.html">create a face clustering task</a> to group faces. For information about other clustering capabilities, see <a href="https://help.aliyun.com/document_detail/2402365.html">Intelligent management</a>.
     * **
     * <strong>Usage notes</strong></li>
     * <li>The IndexFileMeta operation is asynchronous, indicating that it takes some time to process the data after a request is submitted. After the processing is complete, the metadata is stored in your dataset. The amount of time it takes for this process varies based on <a href="https://help.aliyun.com/document_detail/466304.html">the workflow template, the operator</a>, and the content of the file, ranging from several seconds to several minutes or even longer. You can subscribe to <a href="https://help.aliyun.com/document_detail/2743997.html">Simple Message Service</a> for task completion notifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an index from metadata extracted by using techniques such as label recognition, face detection, and location detection from input files. You can retrieve data from the same dataset by using multiple methods.</p>
     * 
     * @param request IndexFileMetaRequest
     * @return IndexFileMetaResponse
     */
    public IndexFileMetaResponse indexFileMeta(IndexFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.indexFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>Ensure that you have called <a href="%EF%BD%9E%EF%BD%9E478206%EF%BD%9E%EF%BD%9E">Bind Object Storage Bucket</a> to bind the OSS Bucket to the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>List bound attachments</p>
     * 
     * @param request ListAttachedOSSBucketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAttachedOSSBucketsResponse
     */
    public ListAttachedOSSBucketsResponse listAttachedOSSBucketsWithOptions(ListAttachedOSSBucketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAttachedOSSBuckets"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAttachedOSSBucketsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/88317.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>Ensure that you have called <a href="%EF%BD%9E%EF%BD%9E478206%EF%BD%9E%EF%BD%9E">Bind Object Storage Bucket</a> to bind the OSS Bucket to the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>List bound attachments</p>
     * 
     * @param request ListAttachedOSSBucketsRequest
     * @return ListAttachedOSSBucketsResponse
     */
    public ListAttachedOSSBucketsResponse listAttachedOSSBuckets(ListAttachedOSSBucketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAttachedOSSBucketsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries batch processing tasks. You can query batch processing tasks based on conditions such task tags and status. The results can be sorted.</p>
     * 
     * @param request ListBatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBatchesResponse
     */
    public ListBatchesResponse listBatchesWithOptions(ListBatchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagSelector)) {
            query.put("TagSelector", request.tagSelector);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBatches"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBatchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries batch processing tasks. You can query batch processing tasks based on conditions such task tags and status. The results can be sorted.</p>
     * 
     * @param request ListBatchesRequest
     * @return ListBatchesResponse
     */
    public ListBatchesResponse listBatches(ListBatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBatchesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries bindings between a dataset and Object Storage Service (OSS) buckets.</p>
     * 
     * @param request ListBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindingsResponse
     */
    public ListBindingsResponse listBindingsWithOptions(ListBindingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindings"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries bindings between a dataset and Object Storage Service (OSS) buckets.</p>
     * 
     * @param request ListBindingsRequest
     * @return ListBindingsResponse
     */
    public ListBindingsResponse listBindings(ListBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets. You can query the list by dataset prefix.</p>
     * 
     * @param request ListDatasetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasetsWithOptions(ListDatasetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasets"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets. You can query the list by dataset prefix.</p>
     * 
     * @param request ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ListProjects operation supports pagination. When you call this operation, you must specify the token that is obtained from the previous query as the value of NextToken. You must also specify MaxResults to limit the number of entries to return.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries projects. You can call this operation to query the basic information, datasets, and file statistics of multiple projects at the same time.</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ListProjects operation supports pagination. When you call this operation, you must specify the token that is obtained from the previous query as the value of NextToken. You must also specify MaxResults to limit the number of entries to return.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries projects. You can call this operation to query the basic information, datasets, and file statistics of multiple projects at the same time.</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of regions</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of regions</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tasks based on specific conditions, such as by time range and by tag.</p>
     * 
     * @param tmpReq ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTasksShrinkRequest request = new ListTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endTimeRange)) {
            request.endTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endTimeRange, "EndTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startTimeRange)) {
            request.startTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startTimeRange, "StartTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskTypes)) {
            request.taskTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskTypes, "TaskTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimeRangeShrink)) {
            query.put("EndTimeRange", request.endTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestDefinition)) {
            query.put("RequestDefinition", request.requestDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeRangeShrink)) {
            query.put("StartTimeRange", request.startTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagSelector)) {
            query.put("TagSelector", request.tagSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypesShrink)) {
            query.put("TaskTypes", request.taskTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tasks based on specific conditions, such as by time range and by tag.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries triggers by tag or status.</p>
     * 
     * @param request ListTriggersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggersWithOptions(ListTriggersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagSelector)) {
            query.put("TagSelector", request.tagSelector);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTriggers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTriggersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries triggers by tag or status.</p>
     * 
     * @param request ListTriggersRequest
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(ListTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTriggersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face groups based on given conditions.</p>
     * 
     * @param tmpReq QueryFigureClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFigureClustersResponse
     */
    public QueryFigureClustersResponse queryFigureClustersWithOptions(QueryFigureClustersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryFigureClustersShrinkRequest request = new QueryFigureClustersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createTimeRange)) {
            request.createTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createTimeRange, "CreateTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateTimeRange)) {
            request.updateTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateTimeRange, "UpdateTimeRange", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRangeShrink)) {
            query.put("CreateTimeRange", request.createTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimeRangeShrink)) {
            query.put("UpdateTimeRange", request.updateTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withTotalCount)) {
            query.put("WithTotalCount", request.withTotalCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFigureClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFigureClustersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that a face clustering task is created to group all faces in a dataset. For information about how to create a face clustering task, see <a href="~~CreateFigureClusteringTask~~">CreateFigureClusteringTask</a>. For information about how to create a dataset, see <a href="~~CreateDataset~~">CreateDataset</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face groups based on given conditions.</p>
     * 
     * @param request QueryFigureClustersRequest
     * @return QueryFigureClustersResponse
     */
    public QueryFigureClustersResponse queryFigureClusters(QueryFigureClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFigureClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of spatiotemporal clusters based on the specified conditions.</p>
     * 
     * @param tmpReq QueryLocationDateClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLocationDateClustersResponse
     */
    public QueryLocationDateClustersResponse queryLocationDateClustersWithOptions(QueryLocationDateClustersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryLocationDateClustersShrinkRequest request = new QueryLocationDateClustersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.address)) {
            request.addressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.address, "Address", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createTimeRange)) {
            request.createTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createTimeRange, "CreateTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDateClusterEndTimeRange)) {
            request.locationDateClusterEndTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDateClusterEndTimeRange, "LocationDateClusterEndTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDateClusterLevels)) {
            request.locationDateClusterLevelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDateClusterLevels, "LocationDateClusterLevels", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDateClusterStartTimeRange)) {
            request.locationDateClusterStartTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDateClusterStartTimeRange, "LocationDateClusterStartTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateTimeRange)) {
            request.updateTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateTimeRange, "UpdateTimeRange", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressShrink)) {
            query.put("Address", request.addressShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRangeShrink)) {
            query.put("CreateTimeRange", request.createTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationDateClusterEndTimeRangeShrink)) {
            query.put("LocationDateClusterEndTimeRange", request.locationDateClusterEndTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationDateClusterLevelsShrink)) {
            query.put("LocationDateClusterLevels", request.locationDateClusterLevelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationDateClusterStartTimeRangeShrink)) {
            query.put("LocationDateClusterStartTimeRange", request.locationDateClusterStartTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimeRangeShrink)) {
            query.put("UpdateTimeRange", request.updateTimeRangeShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLocationDateClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLocationDateClustersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of IMM.****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of spatiotemporal clusters based on the specified conditions.</p>
     * 
     * @param request QueryLocationDateClustersRequest
     * @return QueryLocationDateClustersResponse
     */
    public QueryLocationDateClustersResponse queryLocationDateClusters(QueryLocationDateClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocationDateClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/611302.html">CreateSimilarImageClusteringTask</a> operation to cluster similar images in the dataset.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of similar image clusters.</p>
     * 
     * @param request QuerySimilarImageClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySimilarImageClustersResponse
     */
    public QuerySimilarImageClustersResponse querySimilarImageClustersWithOptions(QuerySimilarImageClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySimilarImageClusters"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySimilarImageClustersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/611302.html">CreateSimilarImageClusteringTask</a> operation to cluster similar images in the dataset.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of similar image clusters.</p>
     * 
     * @param request QuerySimilarImageClustersRequest
     * @return QuerySimilarImageClustersResponse
     */
    public QuerySimilarImageClustersResponse querySimilarImageClusters(QuerySimilarImageClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySimilarImageClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries stories based on the specified conditions.</p>
     * 
     * @param tmpReq QueryStoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryStoriesResponse
     */
    public QueryStoriesResponse queryStoriesWithOptions(QueryStoriesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryStoriesShrinkRequest request = new QueryStoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createTimeRange)) {
            request.createTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createTimeRange, "CreateTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.figureClusterIds)) {
            request.figureClusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.figureClusterIds, "FigureClusterIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storyEndTimeRange)) {
            request.storyEndTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storyEndTimeRange, "StoryEndTimeRange", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storyStartTimeRange)) {
            request.storyStartTimeRangeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storyStartTimeRange, "StoryStartTimeRange", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRangeShrink)) {
            query.put("CreateTimeRange", request.createTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            query.put("CustomLabels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figureClusterIdsShrink)) {
            query.put("FigureClusterIds", request.figureClusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTimeRangeShrink)) {
            query.put("StoryEndTimeRange", request.storyEndTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            query.put("StoryName", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTimeRangeShrink)) {
            query.put("StoryStartTimeRange", request.storyStartTimeRangeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            query.put("StorySubType", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            query.put("StoryType", request.storyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEmptyStories)) {
            query.put("WithEmptyStories", request.withEmptyStories);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478193.html">CreateStory</a> or <a href="https://help.aliyun.com/document_detail/478196.html">CreateCustomizedStory</a> operation to create a story.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries stories based on the specified conditions.</p>
     * 
     * @param request QueryStoriesRequest
     * @return QueryStoriesResponse
     */
    public QueryStoriesResponse queryStories(QueryStoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</em>*</p>
     * <ul>
     * <li>For detailed billing information, refer to the <a href="https://help.aliyun.com/document_detail/2639703.html">WebOffice Billing Instructions</a>.</li>
     * <li>The access token expires after 30 minutes. You must open the preview before the access token expires; otherwise, you will not be able to preview.</li>
     * <li>The refresh token expires after 1 day. You need to call the refresh interface before the refresh token expires; otherwise, the token will become invalid.</li>
     * <li>The expiration time returned is in UTC, which has an 8-hour difference from Beijing Time.<blockquote>
     * <p>The access token is used for actual preview session access, while the refresh token is used to reduce the parameters required for users to refresh tokens. You can use the refresh token to directly obtain a new token based on previous configurations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refresh Document Preview and Editing Token</p>
     * 
     * @param tmpReq RefreshWebofficeTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshWebofficeTokenResponse
     */
    public RefreshWebofficeTokenResponse refreshWebofficeTokenWithOptions(RefreshWebofficeTokenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshWebofficeTokenShrinkRequest request = new RefreshWebofficeTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("RefreshToken", request.refreshToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshWebofficeToken"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshWebofficeTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</em>*</p>
     * <ul>
     * <li>For detailed billing information, refer to the <a href="https://help.aliyun.com/document_detail/2639703.html">WebOffice Billing Instructions</a>.</li>
     * <li>The access token expires after 30 minutes. You must open the preview before the access token expires; otherwise, you will not be able to preview.</li>
     * <li>The refresh token expires after 1 day. You need to call the refresh interface before the refresh token expires; otherwise, the token will become invalid.</li>
     * <li>The expiration time returned is in UTC, which has an 8-hour difference from Beijing Time.<blockquote>
     * <p>The access token is used for actual preview session access, while the refresh token is used to reduce the parameters required for users to refresh tokens. You can use the refresh token to directly obtain a new token based on previous configurations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refresh Document Preview and Editing Token</p>
     * 
     * @param request RefreshWebofficeTokenRequest
     * @return RefreshWebofficeTokenResponse
     */
    public RefreshWebofficeTokenResponse refreshWebofficeToken(RefreshWebofficeTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshWebofficeTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes files from a story.</p>
     * 
     * @param tmpReq RemoveStoryFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveStoryFilesResponse
     */
    public RemoveStoryFilesResponse removeStoryFilesWithOptions(RemoveStoryFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveStoryFilesShrinkRequest request = new RemoveStoryFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveStoryFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveStoryFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes files from a story.</p>
     * 
     * @param request RemoveStoryFilesRequest
     * @return RemoveStoryFilesResponse
     */
    public RemoveStoryFilesResponse removeStoryFiles(RemoveStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeStoryFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can resume a batch processing task only when the task is in the Suspended or Failed state. A batch processing task continues to provide services after you resume the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes a batch processing task that is in the Suspended or Failed state.</p>
     * 
     * @param request ResumeBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeBatchResponse
     */
    public ResumeBatchResponse resumeBatchWithOptions(ResumeBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can resume a batch processing task only when the task is in the Suspended or Failed state. A batch processing task continues to provide services after you resume the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes a batch processing task that is in the Suspended or Failed state.</p>
     * 
     * @param request ResumeBatchRequest
     * @return ResumeBatchResponse
     */
    public ResumeBatchResponse resumeBatch(ResumeBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can resume only a trigger that is in the Suspended or Failed state. After you resume a trigger, the trigger continues to provide services as expected.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes a trigger that is in the Suspended or Failed state.</p>
     * 
     * @param request ResumeTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTriggerResponse
     */
    public ResumeTriggerResponse resumeTriggerWithOptions(ResumeTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can resume only a trigger that is in the Suspended or Failed state. After you resume a trigger, the trigger continues to provide services as expected.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes a trigger that is in the Suspended or Failed state.</p>
     * 
     * @param request ResumeTriggerRequest
     * @return ResumeTriggerResponse
     */
    public ResumeTriggerResponse resumeTrigger(ResumeTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have created a face clustering task by calling the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face clusters that contain a specific face in an image. Each face cluster contains information such as bounding boxes and similarity.</p>
     * 
     * @param tmpReq SearchImageFigureClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageFigureClusterResponse
     */
    public SearchImageFigureClusterResponse searchImageFigureClusterWithOptions(SearchImageFigureClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchImageFigureClusterShrinkRequest request = new SearchImageFigureClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentialConfig)) {
            request.credentialConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentialConfig, "CredentialConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialConfigShrink)) {
            query.put("CredentialConfig", request.credentialConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageFigureClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/88317.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have created a face clustering task by calling the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries face clusters that contain a specific face in an image. Each face cluster contains information such as bounding boxes and similarity.</p>
     * 
     * @param request SearchImageFigureClusterRequest
     * @return SearchImageFigureClusterResponse
     */
    public SearchImageFigureClusterResponse searchImageFigureCluster(SearchImageFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).**** Each time you call this operation, you are charged for semantic understanding and query fees.</li>
     * <li>Before you call this operation, make sure that the file that you want to use is indexed into the dataset that you use. To index a file into a dataset, you can call one of the following operations: <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>, <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a>, and <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>The response provided in this example is for reference only. The categories and content of metadata vary based on configurations of <a href="https://help.aliyun.com/document_detail/466304.html">workflow templates</a>. If you have questions, search for and join the DingTalk group numbered 21714099.</li>
     * </ul>
     * <h3><a href="#"></a>Usage limits</h3>
     * <ul>
     * <li>Each time you call this operation, up to 1,000 metadata files are returned.</li>
     * <li>Pagination is not supported.</li>
     * <li>The natural language processing capability may not always produce completely accurate results.</li>
     * </ul>
     * <h3><a href="#"></a>Usage methods</h3>
     * <p>You can query files within a dataset by using natural language keywords. Key information supported for understanding includes labels (Labels.LabelName), time (ProduceTime), and location (Address.AddressLine). For example, if you use <code>2023 Hangzhou scenery</code> as the query criterion, the operation intelligently breaks the query criterion down into the following sub-criteria, and returns the files that meet all the sub-criteria:</p>
     * <ul>
     * <li>ProduceTime: 00:00 on January 1, 2023 to 00:00 on December 31, 2023.</li>
     * <li>Address.AddressLine: <code>Hangzhou</code></li>
     * <li>Labels.LabelName: <code>scenery</code>.
     * When you call this operation, you can configure a <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that includes the <code>ImageEmbeddingExtraction</code> operator. This allows the operation to return image content when the query you input matches the image content, thereby achieving intelligent image retrieval.``</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata in a dataset by inputting natural language.</p>
     * 
     * @param tmpReq SemanticQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SemanticQueryResponse
     */
    public SemanticQueryResponse semanticQueryWithOptions(SemanticQueryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SemanticQueryShrinkRequest request = new SemanticQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mediaTypes)) {
            request.mediaTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mediaTypes, "MediaTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTypesShrink)) {
            query.put("MediaTypes", request.mediaTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceURI)) {
            query.put("SourceURI", request.sourceURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SemanticQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SemanticQueryResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).**** Each time you call this operation, you are charged for semantic understanding and query fees.</li>
     * <li>Before you call this operation, make sure that the file that you want to use is indexed into the dataset that you use. To index a file into a dataset, you can call one of the following operations: <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a>, <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a>, and <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a>.</li>
     * <li>The response provided in this example is for reference only. The categories and content of metadata vary based on configurations of <a href="https://help.aliyun.com/document_detail/466304.html">workflow templates</a>. If you have questions, search for and join the DingTalk group numbered 21714099.</li>
     * </ul>
     * <h3><a href="#"></a>Usage limits</h3>
     * <ul>
     * <li>Each time you call this operation, up to 1,000 metadata files are returned.</li>
     * <li>Pagination is not supported.</li>
     * <li>The natural language processing capability may not always produce completely accurate results.</li>
     * </ul>
     * <h3><a href="#"></a>Usage methods</h3>
     * <p>You can query files within a dataset by using natural language keywords. Key information supported for understanding includes labels (Labels.LabelName), time (ProduceTime), and location (Address.AddressLine). For example, if you use <code>2023 Hangzhou scenery</code> as the query criterion, the operation intelligently breaks the query criterion down into the following sub-criteria, and returns the files that meet all the sub-criteria:</p>
     * <ul>
     * <li>ProduceTime: 00:00 on January 1, 2023 to 00:00 on December 31, 2023.</li>
     * <li>Address.AddressLine: <code>Hangzhou</code></li>
     * <li>Labels.LabelName: <code>scenery</code>.
     * When you call this operation, you can configure a <a href="https://help.aliyun.com/document_detail/466304.html">workflow template</a> that includes the <code>ImageEmbeddingExtraction</code> operator. This allows the operation to return image content when the query you input matches the image content, thereby achieving intelligent image retrieval.``</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries metadata in a dataset by inputting natural language.</p>
     * 
     * @param request SemanticQueryRequest
     * @return SemanticQueryResponse
     */
    public SemanticQueryResponse semanticQuery(SemanticQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.semanticQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.
     * <strong>Limits</strong></li>
     * <li>Each query returns information about up to 100 files.</li>
     * <li>Each query returns up to 2,000 aggregations.</li>
     * <li>A subquery supports up to 100 conditions.</li>
     * <li>A subquery can have a maximum nesting depth of 5 levels.
     * <strong>Example query conditions</strong></li>
     * <li>Retrieve JPEG images larger than 1,000 pixels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;ImageWidth&quot;,
     *   &quot;Value&quot;:&quot;1000&quot;,
     *   &quot;Operation&quot;:&quot;gt&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }</li>
     * <li>Search <code>oss://examplebucket/path/</code> for objects that have the <code>TV</code> or <code>Stereo</code> label and are larger than 10 MB in size:<blockquote>
     * <p> This query requires matching files to have the <code>TV</code> or <code>Stereo</code> label. The two labels are specified as separate objects in the <code>Labels</code> fields.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
     *   &quot;SubQueries&quot;: [
     *     {
     *       &quot;Field&quot;: &quot;URI&quot;,
     *       &quot;Value&quot;: &quot;oss://examplebucket/path/&quot;,
     *       &quot;Operation&quot;: &quot;prefix&quot;
     *     },
     *     {
     *       &quot;Field&quot;: &quot;Size&quot;,
     *       &quot;Value&quot;: &quot;1048576&quot;,
     *       &quot;Operation&quot;: &quot;gt&quot;
     *     },
     *     {
     *       &quot;SubQueries&quot;: [
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;TV&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         },
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;Stereo&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         }
     *       ],
     *       &quot;Operation&quot;: &quot;or&quot;
     *     }
     *   ],
     *   &quot;Operation&quot;: &quot;and&quot;
     * }
     *         
     * </code></pre>
     * <ul>
     * <li>Exclude images that contain a face of a male over the age of 36:<blockquote>
     * <p> In this example query, an image will be excluded from the query results if it contains a face of a male over the age of 36. This query is different from excluding an image that contains a male face or a face of a person over the age of 36. In this query, you need to use the <code>nested</code> operator to specify that the conditions are met on the same element.
     * {
     *     &quot;Operation&quot;: &quot;not&quot;,
     *     &quot;SubQueries&quot;: [{
     *         &quot;Operation&quot;: &quot;nested&quot;,
     *         &quot;SubQueries&quot;: [{
     *             &quot;Operation&quot;: &quot;and&quot;,
     *             &quot;SubQueries&quot;: [{
     *                 &quot;Field&quot;: &quot;Figures.Age&quot;,
     *                 &quot;Operation&quot;: &quot;gt&quot;,
     *                 &quot;Value&quot;: &quot;36&quot;
     *             }, {
     *                 &quot;Field&quot;: &quot;Figures.Gender&quot;,
     *                 &quot;Operation&quot;: &quot;eq&quot;,
     *                 &quot;Value&quot;: &quot;male&quot;
     *             }]
     *         }]
     *     }]
     * }</p>
     * </blockquote>
     * </li>
     * <li>Query JPEG images that have both custom labels and system labels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;CustomLabels.test&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;Labels.LabelName&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }
     * You can also perform aggregate operations to collect and analyze different data based on the specified conditions. For example, you can calculate the sum, count, average value, or maximum value of all files that meet the query conditions. You can also calculate the size distribution of images that meet the query conditions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries files in a dataset by performing a simple query operation. The operation supports logical expressions.</p>
     * 
     * @param tmpReq SimpleQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SimpleQueryResponse
     */
    public SimpleQueryResponse simpleQueryWithOptions(SimpleQueryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SimpleQueryShrinkRequest request = new SimpleQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregations)) {
            request.aggregationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregations, "Aggregations", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.withFields)) {
            request.withFieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.withFields, "WithFields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregationsShrink)) {
            query.put("Aggregations", request.aggregationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            query.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withFieldsShrink)) {
            query.put("WithFields", request.withFieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutTotalHits)) {
            query.put("WithoutTotalHits", request.withoutTotalHits);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SimpleQuery"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SimpleQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have indexed file metadata into the dataset automatically by calling the <a href="https://help.aliyun.com/document_detail/478202.html">CreateBinding</a> operation or manually by calling the <a href="https://help.aliyun.com/document_detail/478166.html">IndexFileMeta</a> or <a href="https://help.aliyun.com/document_detail/478167.html">BatchIndexFileMeta</a> operation.</li>
     * <li>The sample response is provided for reference only. The metadata type and content in your response may differ based on factors such as the <a href="https://help.aliyun.com/document_detail/466304.html">workflow template configurations</a>. For any inquiries, join the DingTalk chat group (ID: 31690030817) and share your questions with us.
     * <strong>Limits</strong></li>
     * <li>Each query returns information about up to 100 files.</li>
     * <li>Each query returns up to 2,000 aggregations.</li>
     * <li>A subquery supports up to 100 conditions.</li>
     * <li>A subquery can have a maximum nesting depth of 5 levels.
     * <strong>Example query conditions</strong></li>
     * <li>Retrieve JPEG images larger than 1,000 pixels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;ImageWidth&quot;,
     *   &quot;Value&quot;:&quot;1000&quot;,
     *   &quot;Operation&quot;:&quot;gt&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }</li>
     * <li>Search <code>oss://examplebucket/path/</code> for objects that have the <code>TV</code> or <code>Stereo</code> label and are larger than 10 MB in size:<blockquote>
     * <p> This query requires matching files to have the <code>TV</code> or <code>Stereo</code> label. The two labels are specified as separate objects in the <code>Labels</code> fields.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
     *   &quot;SubQueries&quot;: [
     *     {
     *       &quot;Field&quot;: &quot;URI&quot;,
     *       &quot;Value&quot;: &quot;oss://examplebucket/path/&quot;,
     *       &quot;Operation&quot;: &quot;prefix&quot;
     *     },
     *     {
     *       &quot;Field&quot;: &quot;Size&quot;,
     *       &quot;Value&quot;: &quot;1048576&quot;,
     *       &quot;Operation&quot;: &quot;gt&quot;
     *     },
     *     {
     *       &quot;SubQueries&quot;: [
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;TV&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         },
     *         {
     *           &quot;Field&quot;: &quot;Labels.LabelName&quot;,
     *           &quot;Value&quot;: &quot;Stereo&quot;,
     *           &quot;Operation&quot;: &quot;eq&quot;
     *         }
     *       ],
     *       &quot;Operation&quot;: &quot;or&quot;
     *     }
     *   ],
     *   &quot;Operation&quot;: &quot;and&quot;
     * }
     *         
     * </code></pre>
     * <ul>
     * <li>Exclude images that contain a face of a male over the age of 36:<blockquote>
     * <p> In this example query, an image will be excluded from the query results if it contains a face of a male over the age of 36. This query is different from excluding an image that contains a male face or a face of a person over the age of 36. In this query, you need to use the <code>nested</code> operator to specify that the conditions are met on the same element.
     * {
     *     &quot;Operation&quot;: &quot;not&quot;,
     *     &quot;SubQueries&quot;: [{
     *         &quot;Operation&quot;: &quot;nested&quot;,
     *         &quot;SubQueries&quot;: [{
     *             &quot;Operation&quot;: &quot;and&quot;,
     *             &quot;SubQueries&quot;: [{
     *                 &quot;Field&quot;: &quot;Figures.Age&quot;,
     *                 &quot;Operation&quot;: &quot;gt&quot;,
     *                 &quot;Value&quot;: &quot;36&quot;
     *             }, {
     *                 &quot;Field&quot;: &quot;Figures.Gender&quot;,
     *                 &quot;Operation&quot;: &quot;eq&quot;,
     *                 &quot;Value&quot;: &quot;male&quot;
     *             }]
     *         }]
     *     }]
     * }</p>
     * </blockquote>
     * </li>
     * <li>Query JPEG images that have both custom labels and system labels:<!---->
     * {
     *   &quot;SubQueries&quot;:[
     * {
     *   &quot;Field&quot;:&quot;ContentType&quot;,
     *   &quot;Value&quot;: &quot;image/jpeg&quot;,
     *   &quot;Operation&quot;:&quot;eq&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;CustomLabels.test&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * },<br>{
     *   &quot;Field&quot;:&quot;Labels.LabelName&quot;,
     *   &quot;Operation&quot;:&quot;exist&quot;
     * }
     *   ],
     *   &quot;Operation&quot;:&quot;and&quot;
     * }
     * You can also perform aggregate operations to collect and analyze different data based on the specified conditions. For example, you can calculate the sum, count, average value, or maximum value of all files that meet the query conditions. You can also calculate the size distribution of images that meet the query conditions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries files in a dataset by performing a simple query operation. The operation supports logical expressions.</p>
     * 
     * @param request SimpleQueryRequest
     * @return SimpleQueryResponse
     */
    public SimpleQueryResponse simpleQuery(SimpleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.simpleQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can suspend a batch processing task that is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume a batch processing task that is suspended.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends a batch processing task.</p>
     * 
     * @param request SuspendBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendBatchResponse
     */
    public SuspendBatchResponse suspendBatchWithOptions(SuspendBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can suspend a batch processing task that is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume a batch processing task that is suspended.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends a batch processing task.</p>
     * 
     * @param request SuspendBatchRequest
     * @return SuspendBatchResponse
     */
    public SuspendBatchResponse suspendBatch(SuspendBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The operation can be used to suspend a trigger only in the Running state. If you want to resume a suspended trigger, call the <a href="https://help.aliyun.com/document_detail/479919.html">ResumeTrigger</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends a running trigger.</p>
     * 
     * @param request SuspendTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendTriggerResponse
     */
    public SuspendTriggerResponse suspendTriggerWithOptions(SuspendTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>The operation can be used to suspend a trigger only in the Running state. If you want to resume a suspended trigger, call the <a href="https://help.aliyun.com/document_detail/479919.html">ResumeTrigger</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends a running trigger.</p>
     * 
     * @param request SuspendTriggerRequest
     * @return SuspendTriggerResponse
     */
    public SuspendTriggerResponse suspendTrigger(SuspendTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendTriggerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a batch processing task that is in the Ready or Failed state. The update operation does not change the status of the batch processing task.</p>
     * <ul>
     * <li>If you update a batch processing task that is in progress, the task is not automatically resumed after the update is complete. You must call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume the task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a batch processing task, including the input data source, data processing settings, and tags.</p>
     * 
     * @param tmpReq UpdateBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBatchResponse
     */
    public UpdateBatchResponse updateBatchWithOptions(UpdateBatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBatchShrinkRequest request = new UpdateBatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actions)) {
            request.actionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actions, "Actions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionsShrink)) {
            body.put("Actions", request.actionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBatch"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a batch processing task that is in the Ready or Failed state. The update operation does not change the status of the batch processing task.</p>
     * <ul>
     * <li>If you update a batch processing task that is in progress, the task is not automatically resumed after the update is complete. You must call the <a href="https://help.aliyun.com/document_detail/479914.html">ResumeBatch</a> operation to resume the task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a batch processing task, including the input data source, data processing settings, and tags.</p>
     * 
     * @param request UpdateBatchRequest
     * @return UpdateBatchResponse
     */
    public UpdateBatchResponse updateBatch(UpdateBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>When updating dataset information, make sure the dataset has been successfully created. For creating a dataset, please refer to the request parameter description.</li>
     * <li>When updating dataset information, only fill in the fields that need to be updated; unfilled fields will not change.</li>
     * <li>The update of the dataset will not take effect immediately and may require up to 5 minutes to become effective.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Media Set</p>
     * 
     * @param tmpReq UpdateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDatasetShrinkRequest request = new UpdateDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowParameters)) {
            request.workflowParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowParameters, "WorkflowParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowParametersShrink)) {
            query.put("WorkflowParameters", request.workflowParametersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataset"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Please ensure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/477042.html">pricing</a> of the Intelligent Media Management product before using this interface.</strong></li>
     * <li>When updating dataset information, make sure the dataset has been successfully created. For creating a dataset, please refer to the request parameter description.</li>
     * <li>When updating dataset information, only fill in the fields that need to be updated; unfilled fields will not change.</li>
     * <li>The update of the dataset will not take effect immediately and may require up to 5 minutes to become effective.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Media Set</p>
     * 
     * @param request UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>The operation updates only the cover image, cluster name, and tags.</li>
     * <li>After the operation is successful, you can call the <a href="https://help.aliyun.com/document_detail/478182.html">GetFigureCluster</a> or <a href="https://help.aliyun.com/document_detail/2248450.html">BatchGetFigureCluster</a> operation to query the updated cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a face cluster, such as the cluster name and labels.</p>
     * 
     * @param tmpReq UpdateFigureClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFigureClusterResponse
     */
    public UpdateFigureClusterResponse updateFigureClusterWithOptions(UpdateFigureClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFigureClusterShrinkRequest request = new UpdateFigureClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.figureCluster)) {
            request.figureClusterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.figureCluster, "FigureCluster", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.figureClusterShrink)) {
            query.put("FigureCluster", request.figureClusterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFigureCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFigureClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478180.html">CreateFigureClusteringTask</a> operation to cluster all faces in the dataset.</li>
     * <li>The operation updates only the cover image, cluster name, and tags.</li>
     * <li>After the operation is successful, you can call the <a href="https://help.aliyun.com/document_detail/478182.html">GetFigureCluster</a> or <a href="https://help.aliyun.com/document_detail/2248450.html">BatchGetFigureCluster</a> operation to query the updated cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a face cluster, such as the cluster name and labels.</p>
     * 
     * @param request UpdateFigureClusterRequest
     * @return UpdateFigureClusterResponse
     */
    public UpdateFigureClusterResponse updateFigureCluster(UpdateFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata specified by CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the partial metadata of the indexed files in a dataset.</p>
     * 
     * @param tmpReq UpdateFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileMetaResponse
     */
    public UpdateFileMetaResponse updateFileMetaWithOptions(UpdateFileMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFileMetaShrinkRequest request = new UpdateFileMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.file)) {
            request.fileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.file, "File", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileShrink)) {
            query.put("File", request.fileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileMeta"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>You cannot call this operation to update all metadata. You can update only metadata specified by CustomLabels, CustomId, and Figures. For more information, see the &quot;Request parameters&quot; section of this topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the partial metadata of the indexed files in a dataset.</p>
     * 
     * @param request UpdateFileMetaRequest
     * @return UpdateFileMetaResponse
     */
    public UpdateFileMetaResponse updateFileMeta(UpdateFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a spatiotemporal cluster.</p>
     * 
     * @param tmpReq UpdateLocationDateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLocationDateClusterResponse
     */
    public UpdateLocationDateClusterResponse updateLocationDateClusterWithOptions(UpdateLocationDateClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLocationDateClusterShrinkRequest request = new UpdateLocationDateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            query.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            query.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            query.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLocationDateCluster"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLocationDateClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/477042.html">billing</a> of Intelligent Media Management (IMM).****</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/478188.html">CreateLocationDateClusteringTask</a> operation to create spatiotemporal clusters in the project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a spatiotemporal cluster.</p>
     * 
     * @param request UpdateLocationDateClusterRequest
     * @return UpdateLocationDateClusterResponse
     */
    public UpdateLocationDateClusterResponse updateLocationDateCluster(UpdateLocationDateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLocationDateClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the project exists. For information about how to create a project, see &quot;CreateProject&quot;.</p>
     * <ul>
     * <li>When you call this operation, you need to specify only the parameters that you want to update. The parameters that you do not specify remain unchanged after you call this operation.</li>
     * <li>Wait for up to 5 minutes for the update to take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a project.</p>
     * 
     * @param tmpReq UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProjectShrinkRequest request = new UpdateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxBindCount)) {
            query.put("DatasetMaxBindCount", request.datasetMaxBindCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxEntityCount)) {
            query.put("DatasetMaxEntityCount", request.datasetMaxEntityCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxFileCount)) {
            query.put("DatasetMaxFileCount", request.datasetMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxRelationCount)) {
            query.put("DatasetMaxRelationCount", request.datasetMaxRelationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetMaxTotalFileSize)) {
            query.put("DatasetMaxTotalFileSize", request.datasetMaxTotalFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMaxDatasetCount)) {
            query.put("ProjectMaxDatasetCount", request.projectMaxDatasetCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRole)) {
            query.put("ServiceRole", request.serviceRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the project exists. For information about how to create a project, see &quot;CreateProject&quot;.</p>
     * <ul>
     * <li>When you call this operation, you need to specify only the parameters that you want to update. The parameters that you do not specify remain unchanged after you call this operation.</li>
     * <li>Wait for up to 5 minutes for the update to take effect.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a project.</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a story, such as the story name and cover image.</p>
     * 
     * @param tmpReq UpdateStoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStoryResponse
     */
    public UpdateStoryResponse updateStoryWithOptions(UpdateStoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStoryShrinkRequest request = new UpdateStoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cover)) {
            request.coverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cover, "Cover", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customLabels)) {
            request.customLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customLabels, "CustomLabels", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverShrink)) {
            body.put("Cover", request.coverShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabelsShrink)) {
            body.put("CustomLabels", request.customLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasetName)) {
            body.put("DatasetName", request.datasetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("StoryName", request.storyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a story, such as the story name and cover image.</p>
     * 
     * @param request UpdateStoryRequest
     * @return UpdateStoryResponse
     */
    public UpdateStoryResponse updateStory(UpdateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a trigger that is in the Ready or Failed state. The update operation does not change the trigger status.</p>
     * <ul>
     * <li>After you update a trigger, the uncompleted tasks under the original trigger are no longer executed. You can call the <a href="https://help.aliyun.com/document_detail/479916.html">ResumeTrigger</a> operation to resume the execution of the trigger.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a trigger, such as the input data source, data processing settings, and tags.</p>
     * 
     * @param tmpReq UpdateTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTriggerWithOptions(UpdateTriggerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTriggerShrinkRequest request = new UpdateTriggerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actions)) {
            request.actionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actions, "Actions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionsShrink)) {
            body.put("Actions", request.actionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrigger"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can update only a trigger that is in the Ready or Failed state. The update operation does not change the trigger status.</p>
     * <ul>
     * <li>After you update a trigger, the uncompleted tasks under the original trigger are no longer executed. You can call the <a href="https://help.aliyun.com/document_detail/479916.html">ResumeTrigger</a> operation to resume the execution of the trigger.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates information about a trigger, such as the input data source, data processing settings, and tags.</p>
     * 
     * @param request UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTriggerWithOptions(request, runtime);
    }
}
