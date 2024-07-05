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
     * <b>summary</b> : 
     * <p>图片打马赛克算子</p>
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
     * <b>summary</b> : 
     * <p>图片打马赛克算子</p>
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
     * <p>为故事新增文件</p>
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
     * <p>为故事新增文件</p>
     * 
     * @param request AddStoryFilesRequest
     * @return AddStoryFilesResponse
     */
    public AddStoryFilesResponse addStoryFiles(AddStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addStoryFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定ossbucket</p>
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
     * <b>summary</b> : 
     * <p>绑定ossbucket</p>
     * 
     * @param request AttachOSSBucketRequest
     * @return AttachOSSBucketResponse
     */
    public AttachOSSBucketResponse attachOSSBucket(AttachOSSBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachOSSBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除文件元信息</p>
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
     * <b>summary</b> : 
     * <p>批量删除文件元信息</p>
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
     * <p>批量获取分组信息</p>
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
     * <p>批量获取分组信息</p>
     * 
     * @param request BatchGetFigureClusterRequest
     * @return BatchGetFigureClusterResponse
     */
    public BatchGetFigureClusterResponse batchGetFigureCluster(BatchGetFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取文件元信息</p>
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
     * <b>summary</b> : 
     * <p>批量获取文件元信息</p>
     * 
     * @param request BatchGetFileMetaRequest
     * @return BatchGetFileMetaResponse
     */
    public BatchGetFileMetaResponse batchGetFileMeta(BatchGetFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量索引文件元信息</p>
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
     * <b>summary</b> : 
     * <p>批量索引文件元信息</p>
     * 
     * @param request BatchIndexFileMetaRequest
     * @return BatchIndexFileMetaResponse
     */
    public BatchIndexFileMetaResponse batchIndexFileMeta(BatchIndexFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchIndexFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新文件元信息</p>
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
     * <b>summary</b> : 
     * <p>批量更新文件元信息</p>
     * 
     * @param request BatchUpdateFileMetaRequest
     * @return BatchUpdateFileMetaResponse
     */
    public BatchUpdateFileMetaResponse batchUpdateFileMeta(BatchUpdateFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以脸搜分组</p>
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
     * <b>summary</b> : 
     * <p>以脸搜分组</p>
     * 
     * @param request CompareImageFacesRequest
     * @return CompareImageFacesResponse
     */
    public CompareImageFacesResponse compareImageFaces(CompareImageFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareImageFacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建查看压缩包内文件列表任务</p>
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
     * <b>summary</b> : 
     * <p>创建查看压缩包内文件列表任务</p>
     * 
     * @param request CreateArchiveFileInspectionTaskRequest
     * @return CreateArchiveFileInspectionTaskResponse
     */
    public CreateArchiveFileInspectionTaskResponse createArchiveFileInspectionTask(CreateArchiveFileInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createArchiveFileInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据接入</p>
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
     * <b>summary</b> : 
     * <p>创建数据接入</p>
     * 
     * @param request CreateBatchRequest
     * @return CreateBatchResponse
     */
    public CreateBatchResponse createBatch(CreateBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建绑定</p>
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
     * <b>summary</b> : 
     * <p>创建绑定</p>
     * 
     * @param request CreateBindingRequest
     * @return CreateBindingResponse
     */
    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建点云压缩任务</p>
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
     * <b>summary</b> : 
     * <p>创建点云压缩任务</p>
     * 
     * @param request CreateCompressPointCloudTaskRequest
     * @return CreateCompressPointCloudTaskResponse
     */
    public CreateCompressPointCloudTaskResponse createCompressPointCloudTask(CreateCompressPointCloudTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompressPointCloudTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义故事</p>
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
     * <b>summary</b> : 
     * <p>创建自定义故事</p>
     * 
     * @param request CreateCustomizedStoryRequest
     * @return CreateCustomizedStoryResponse
     */
    public CreateCustomizedStoryResponse createCustomizedStory(CreateCustomizedStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomizedStoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDatasetWithOptions(CreateDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
     * <b>summary</b> : 
     * <p>创建数据集</p>
     * 
     * @param request CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    public CreateDatasetResponse createDataset(CreateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提取盲水印</p>
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
     * <b>summary</b> : 
     * <p>提取盲水印</p>
     * 
     * @param request CreateDecodeBlindWatermarkTaskRequest
     * @return CreateDecodeBlindWatermarkTaskResponse
     */
    public CreateDecodeBlindWatermarkTaskResponse createDecodeBlindWatermarkTask(CreateDecodeBlindWatermarkTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDecodeBlindWatermarkTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以脸搜图</p>
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
     * <b>summary</b> : 
     * <p>以脸搜图</p>
     * 
     * @param request CreateFacesSearchingTaskRequest
     * @return CreateFacesSearchingTaskResponse
     */
    public CreateFacesSearchingTaskResponse createFacesSearchingTask(CreateFacesSearchingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFacesSearchingTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>聚类</p>
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
     * <b>summary</b> : 
     * <p>聚类</p>
     * 
     * @param request CreateFigureClusteringTaskRequest
     * @return CreateFigureClusteringTaskResponse
     */
    public CreateFigureClusteringTaskResponse createFigureClusteringTask(CreateFigureClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFigureClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合并聚类</p>
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
     * <b>summary</b> : 
     * <p>合并聚类</p>
     * 
     * @param request CreateFigureClustersMergingTaskRequest
     * @return CreateFigureClustersMergingTaskResponse
     */
    public CreateFigureClustersMergingTaskResponse createFigureClustersMergingTask(CreateFigureClustersMergingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFigureClustersMergingTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>压缩/打包下载API</p>
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
     * <b>summary</b> : 
     * <p>压缩/打包下载API</p>
     * 
     * @param request CreateFileCompressionTaskRequest
     * @return CreateFileCompressionTaskResponse
     */
    public CreateFileCompressionTaskResponse createFileCompressionTask(CreateFileCompressionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileCompressionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在线解压API</p>
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
     * <b>summary</b> : 
     * <p>在线解压API</p>
     * 
     * @param request CreateFileUncompressionTaskRequest
     * @return CreateFileUncompressionTaskResponse
     */
    public CreateFileUncompressionTaskResponse createFileUncompressionTask(CreateFileUncompressionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileUncompressionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片检测</p>
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
     * <b>summary</b> : 
     * <p>创建图片检测</p>
     * 
     * @param request CreateImageModerationTaskRequest
     * @return CreateImageModerationTaskResponse
     */
    public CreateImageModerationTaskResponse createImageModerationTask(CreateImageModerationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageModerationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片拼接</p>
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
     * <b>summary</b> : 
     * <p>图片拼接</p>
     * 
     * @param request CreateImageSplicingTaskRequest
     * @return CreateImageSplicingTaskResponse
     */
    public CreateImageSplicingTaskResponse createImageSplicingTask(CreateImageSplicingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageSplicingTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片转PDF</p>
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
     * <b>summary</b> : 
     * <p>图片转PDF</p>
     * 
     * @param request CreateImageToPDFTaskRequest
     * @return CreateImageToPDFTaskResponse
     */
    public CreateImageToPDFTaskResponse createImageToPDFTask(CreateImageToPDFTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageToPDFTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建时空聚类任务</p>
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
     * <b>summary</b> : 
     * <p>创建时空聚类任务</p>
     * 
     * @param request CreateLocationDateClusteringTaskRequest
     * @return CreateLocationDateClusteringTaskResponse
     */
    public CreateLocationDateClusteringTaskResponse createLocationDateClusteringTask(CreateLocationDateClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLocationDateClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建转码服务</p>
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
     * <b>summary</b> : 
     * <p>创建转码服务</p>
     * 
     * @param request CreateMediaConvertTaskRequest
     * @return CreateMediaConvertTaskResponse
     */
    public CreateMediaConvertTaskResponse createMediaConvertTask(CreateMediaConvertTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMediaConvertTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文档转换任务</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <b>summary</b> : 
     * <p>创建文档转换任务</p>
     * 
     * @param request CreateOfficeConversionTaskRequest
     * @return CreateOfficeConversionTaskResponse
     */
    public CreateOfficeConversionTaskResponse createOfficeConversionTask(CreateOfficeConversionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOfficeConversionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
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
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建相似图片聚类任务</p>
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
     * <b>summary</b> : 
     * <p>创建相似图片聚类任务</p>
     * 
     * @param request CreateSimilarImageClusteringTaskRequest
     * @return CreateSimilarImageClusteringTaskResponse
     */
    public CreateSimilarImageClusteringTaskResponse createSimilarImageClusteringTask(CreateSimilarImageClusteringTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimilarImageClusteringTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个 Story</p>
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
     * <b>summary</b> : 
     * <p>创建一个 Story</p>
     * 
     * @param request CreateStoryRequest
     * @return CreateStoryResponse
     */
    public CreateStoryResponse createStory(CreateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据接入</p>
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
     * <b>summary</b> : 
     * <p>创建数据接入</p>
     * 
     * @param request CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检测视频中的内容</p>
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
     * <b>summary</b> : 
     * <p>检测视频中的内容</p>
     * 
     * @param request CreateVideoLabelClassificationTaskRequest
     * @return CreateVideoLabelClassificationTaskResponse
     */
    public CreateVideoLabelClassificationTaskResponse createVideoLabelClassificationTask(CreateVideoLabelClassificationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoLabelClassificationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频检测</p>
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
     * <b>summary</b> : 
     * <p>创建视频检测</p>
     * 
     * @param request CreateVideoModerationTaskRequest
     * @return CreateVideoModerationTaskResponse
     */
    public CreateVideoModerationTaskResponse createVideoModerationTask(CreateVideoModerationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoModerationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入实例</p>
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
     * <b>summary</b> : 
     * <p>删除数据接入实例</p>
     * 
     * @param request DeleteBatchRequest
     * @return DeleteBatchResponse
     */
    public DeleteBatchResponse deleteBatch(DeleteBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除绑定</p>
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
     * <b>summary</b> : 
     * <p>删除绑定</p>
     * 
     * @param request DeleteBindingRequest
     * @return DeleteBindingResponse
     */
    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒体集</p>
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
     * <b>summary</b> : 
     * <p>删除媒体集</p>
     * 
     * @param request DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    public DeleteDatasetResponse deleteDataset(DeleteDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件元信息</p>
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
     * <b>summary</b> : 
     * <p>删除文件元信息</p>
     * 
     * @param request DeleteFileMetaRequest
     * @return DeleteFileMetaResponse
     */
    public DeleteFileMetaResponse deleteFileMeta(DeleteFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除时空聚类</p>
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
     * <b>summary</b> : 
     * <p>删除时空聚类</p>
     * 
     * @param request DeleteLocationDateClusterRequest
     * @return DeleteLocationDateClusterResponse
     */
    public DeleteLocationDateClusterResponse deleteLocationDateCluster(DeleteLocationDateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLocationDateClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
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
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个 Story</p>
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
     * <b>summary</b> : 
     * <p>删除一个 Story</p>
     * 
     * @param request DeleteStoryRequest
     * @return DeleteStoryResponse
     */
    public DeleteStoryResponse deleteStory(DeleteStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据接入实例</p>
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
     * <b>summary</b> : 
     * <p>删除数据接入实例</p>
     * 
     * @param request DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑ossbucket</p>
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
     * <b>summary</b> : 
     * <p>解绑ossbucket</p>
     * 
     * @param request DetachOSSBucketRequest
     * @return DetachOSSBucketResponse
     */
    public DetachOSSBucketResponse detachOSSBucket(DetachOSSBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachOSSBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>人体检测算子</p>
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
     * <b>summary</b> : 
     * <p>人体检测算子</p>
     * 
     * @param request DetectImageBodiesRequest
     * @return DetectImageBodiesResponse
     */
    public DetectImageBodiesResponse detectImageBodies(DetectImageBodiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageBodiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检测图片中车辆信息</p>
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
     * <b>summary</b> : 
     * <p>检测图片中车辆信息</p>
     * 
     * @param request DetectImageCarsRequest
     * @return DetectImageCarsResponse
     */
    public DetectImageCarsResponse detectImageCars(DetectImageCarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageCarsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片二维码检测</p>
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
     * <b>summary</b> : 
     * <p>获取图片二维码检测</p>
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
     * <p>获取图片裁剪信息</p>
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
     * <p>获取图片裁剪信息</p>
     * 
     * @param request DetectImageCroppingRequest
     * @return DetectImageCroppingResponse
     */
    public DetectImageCroppingResponse detectImageCropping(DetectImageCroppingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageCroppingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片人脸信息</p>
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
     * <b>summary</b> : 
     * <p>获取图片人脸信息</p>
     * 
     * @param request DetectImageFacesRequest
     * @return DetectImageFacesResponse
     */
    public DetectImageFacesResponse detectImageFaces(DetectImageFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageFacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检测图像中的内容</p>
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
     * <b>summary</b> : 
     * <p>检测图像中的内容</p>
     * 
     * @param request DetectImageLabelsRequest
     * @return DetectImageLabelsResponse
     */
    public DetectImageLabelsResponse detectImageLabels(DetectImageLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片打分</p>
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
     * <b>summary</b> : 
     * <p>获取图片打分</p>
     * 
     * @param request DetectImageScoreRequest
     * @return DetectImageScoreResponse
     */
    public DetectImageScoreResponse detectImageScore(DetectImageScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageScoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>进行图片光学字符检测</p>
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
     * <b>summary</b> : 
     * <p>进行图片光学字符检测</p>
     * 
     * @param request DetectImageTextsRequest
     * @return DetectImageTextsResponse
     */
    public DetectImageTextsResponse detectImageTexts(DetectImageTextsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageTextsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取媒体文件信息</p>
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
     * <b>summary</b> : 
     * <p>获取媒体文件信息</p>
     * 
     * @param request DetectMediaMetaRequest
     * @return DetectMediaMetaResponse
     */
    public DetectMediaMetaResponse detectMediaMeta(DetectMediaMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectMediaMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检测文本</p>
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
     * <b>summary</b> : 
     * <p>检测文本</p>
     * 
     * @param request DetectTextAnomalyRequest
     * @return DetectTextAnomalyResponse
     */
    public DetectTextAnomalyResponse detectTextAnomaly(DetectTextAnomalyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectTextAnomalyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>嵌入图片盲水印算子</p>
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
     * <b>summary</b> : 
     * <p>嵌入图片盲水印算子</p>
     * 
     * @param request EncodeBlindWatermarkRequest
     * @return EncodeBlindWatermarkResponse
     */
    public EncodeBlindWatermarkResponse encodeBlindWatermark(EncodeBlindWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encodeBlindWatermarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提取文档中的文本</p>
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
     * <b>summary</b> : 
     * <p>提取文档中的文本</p>
     * 
     * @param request ExtractDocumentTextRequest
     * @return ExtractDocumentTextResponse
     */
    public ExtractDocumentTextResponse extractDocumentText(ExtractDocumentTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractDocumentTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对 Dataset 内的元数据进行模糊搜索。</p>
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
     * <b>summary</b> : 
     * <p>对 Dataset 内的元数据进行模糊搜索。</p>
     * 
     * @param request FuzzyQueryRequest
     * @return FuzzyQueryResponse
     */
    public FuzzyQueryResponse fuzzyQuery(FuzzyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fuzzyQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实时转码任务</p>
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
     * <b>summary</b> : 
     * <p>创建实时转码任务</p>
     * 
     * @param request GenerateVideoPlaylistRequest
     * @return GenerateVideoPlaylistResponse
     */
    public GenerateVideoPlaylistResponse generateVideoPlaylist(GenerateVideoPlaylistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateVideoPlaylistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档预览编辑凭证</p>
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
     * <b>summary</b> : 
     * <p>获取文档预览编辑凭证</p>
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
     * <p>获取数据接入实例</p>
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
     * <p>获取数据接入实例</p>
     * 
     * @param request GetBatchRequest
     * @return GetBatchResponse
     */
    public GetBatchResponse getBatch(GetBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定</p>
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
     * <b>summary</b> : 
     * <p>获取绑定</p>
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
     * <b>summary</b> : 
     * <p>获取媒体集信息</p>
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
     * <b>summary</b> : 
     * <p>获取媒体集信息</p>
     * 
     * @param request GetDatasetRequest
     * @return GetDatasetResponse
     */
    public GetDatasetResponse getDataset(GetDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取提取水印的结果</p>
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
     * <b>summary</b> : 
     * <p>获取提取水印的结果</p>
     * 
     * @param request GetDecodeBlindWatermarkResultRequest
     * @return GetDecodeBlindWatermarkResultResponse
     */
    public GetDecodeBlindWatermarkResultResponse getDecodeBlindWatermarkResult(GetDecodeBlindWatermarkResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDecodeBlindWatermarkResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取聚类</p>
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
     * <b>summary</b> : 
     * <p>获取聚类</p>
     * 
     * @param request GetFigureClusterRequest
     * @return GetFigureClusterResponse
     */
    public GetFigureClusterResponse getFigureCluster(GetFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件元信息</p>
     * 
     * @param request GetFileMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileMetaResponse
     */
    public GetFileMetaResponse getFileMetaWithOptions(GetFileMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>获取文件元信息</p>
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
     * <p>获取图片审核任务结果</p>
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
     * <p>获取图片审核任务结果</p>
     * 
     * @param request GetImageModerationResultRequest
     * @return GetImageModerationResultResponse
     */
    public GetImageModerationResultResponse getImageModerationResult(GetImageModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取绑定的ossbucket</p>
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
     * <b>summary</b> : 
     * <p>获取绑定的ossbucket</p>
     * 
     * @param request GetOSSBucketAttachmentRequest
     * @return GetOSSBucketAttachmentResponse
     */
    public GetOSSBucketAttachmentResponse getOSSBucketAttachment(GetOSSBucketAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSBucketAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目信息</p>
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
     * <b>summary</b> : 
     * <p>获取项目信息</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>返回一个 Story 的详细信息</p>
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
     * <b>summary</b> : 
     * <p>返回一个 Story 的详细信息</p>
     * 
     * @param request GetStoryRequest
     * @return GetStoryResponse
     */
    public GetStoryResponse getStory(GetStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务信息</p>
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
     * <b>summary</b> : 
     * <p>获取任务信息</p>
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
     * <p>获取数据接入实例</p>
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
     * <p>获取数据接入实例</p>
     * 
     * @param request GetTriggerRequest
     * @return GetTriggerResponse
     */
    public GetTriggerResponse getTrigger(GetTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频标签检测任务结果</p>
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
     * <b>summary</b> : 
     * <p>获取视频标签检测任务结果</p>
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
     * <p>获取视频审核任务结果</p>
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
     * <p>获取视频审核任务结果</p>
     * 
     * @param request GetVideoModerationResultRequest
     * @return GetVideoModerationResultResponse
     */
    public GetVideoModerationResultResponse getVideoModerationResult(GetVideoModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加文件元信息</p>
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
     * <b>summary</b> : 
     * <p>添加文件元信息</p>
     * 
     * @param request IndexFileMetaRequest
     * @return IndexFileMetaResponse
     */
    public IndexFileMetaResponse indexFileMeta(IndexFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.indexFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出数据接入实例</p>
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
     * <p>列出数据接入实例</p>
     * 
     * @param request ListBatchesRequest
     * @return ListBatchesResponse
     */
    public ListBatchesResponse listBatches(ListBatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBatchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出绑定</p>
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
     * <b>summary</b> : 
     * <p>列出绑定</p>
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
     * <p>列出媒体集列表</p>
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
     * <p>列出媒体集列表</p>
     * 
     * @param request ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    public ListDatasetsResponse listDatasets(ListDatasetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表</p>
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
     * <b>summary</b> : 
     * <p>获取项目列表</p>
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
     * <p>获取地区列表</p>
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
     * <p>获取地区列表</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务信息列表</p>
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
     * <b>summary</b> : 
     * <p>获取任务信息列表</p>
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
     * <p>列出数据接入实例</p>
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
     * <p>列出数据接入实例</p>
     * 
     * @param request ListTriggersRequest
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(ListTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTriggersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询聚类分组</p>
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
     * <b>summary</b> : 
     * <p>查询聚类分组</p>
     * 
     * @param request QueryFigureClustersRequest
     * @return QueryFigureClustersResponse
     */
    public QueryFigureClustersResponse queryFigureClusters(QueryFigureClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFigureClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找时空分组</p>
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
     * <b>summary</b> : 
     * <p>查找时空分组</p>
     * 
     * @param request QueryLocationDateClustersRequest
     * @return QueryLocationDateClustersResponse
     */
    public QueryLocationDateClustersResponse queryLocationDateClusters(QueryLocationDateClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLocationDateClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找相似图片分组</p>
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
     * <b>summary</b> : 
     * <p>查找相似图片分组</p>
     * 
     * @param request QuerySimilarImageClustersRequest
     * @return QuerySimilarImageClustersResponse
     */
    public QuerySimilarImageClustersResponse querySimilarImageClusters(QuerySimilarImageClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySimilarImageClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找 Story</p>
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
     * <b>summary</b> : 
     * <p>查找 Story</p>
     * 
     * @param request QueryStoriesRequest
     * @return QueryStoriesResponse
     */
    public QueryStoriesResponse queryStories(QueryStoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新文档预览编辑凭证</p>
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
     * <b>summary</b> : 
     * <p>刷新文档预览编辑凭证</p>
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
     * <p>为故事移除文件</p>
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
     * <p>为故事移除文件</p>
     * 
     * @param request RemoveStoryFilesRequest
     * @return RemoveStoryFilesResponse
     */
    public RemoveStoryFilesResponse removeStoryFiles(RemoveStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeStoryFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复一个挂起的数据接入任务</p>
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
     * <b>summary</b> : 
     * <p>恢复一个挂起的数据接入任务</p>
     * 
     * @param request ResumeBatchRequest
     * @return ResumeBatchResponse
     */
    public ResumeBatchResponse resumeBatch(ResumeBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复一个挂起的数据接入任务</p>
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
     * <b>summary</b> : 
     * <p>恢复一个挂起的数据接入任务</p>
     * 
     * @param request ResumeTriggerRequest
     * @return ResumeTriggerResponse
     */
    public ResumeTriggerResponse resumeTrigger(ResumeTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>以脸搜分组</p>
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
     * <b>summary</b> : 
     * <p>以脸搜分组</p>
     * 
     * @param request SearchImageFigureClusterRequest
     * @return SearchImageFigureClusterResponse
     */
    public SearchImageFigureClusterResponse searchImageFigureCluster(SearchImageFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过输入自然语言文字，对 Dataset 内的元数据进行查询与统计分析</p>
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
     * <b>summary</b> : 
     * <p>通过输入自然语言文字，对 Dataset 内的元数据进行查询与统计分析</p>
     * 
     * @param request SemanticQueryRequest
     * @return SemanticQueryResponse
     */
    public SemanticQueryResponse semanticQuery(SemanticQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.semanticQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过 JSON 结构的查询语言，对 Dataset 内的元数据进行查询与统计分析。</p>
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
     * <b>summary</b> : 
     * <p>通过 JSON 结构的查询语言，对 Dataset 内的元数据进行查询与统计分析。</p>
     * 
     * @param request SimpleQueryRequest
     * @return SimpleQueryResponse
     */
    public SimpleQueryResponse simpleQuery(SimpleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.simpleQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>挂起一个数据接入任务</p>
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
     * <b>summary</b> : 
     * <p>挂起一个数据接入任务</p>
     * 
     * @param request SuspendBatchRequest
     * @return SuspendBatchResponse
     */
    public SuspendBatchResponse suspendBatch(SuspendBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>挂起一个数据接入任务</p>
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
     * <b>summary</b> : 
     * <p>挂起一个数据接入任务</p>
     * 
     * @param request SuspendTriggerRequest
     * @return SuspendTriggerResponse
     */
    public SuspendTriggerResponse suspendTrigger(SuspendTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendTriggerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入实例</p>
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
     * <b>summary</b> : 
     * <p>更新数据接入实例</p>
     * 
     * @param request UpdateBatchRequest
     * @return UpdateBatchResponse
     */
    public UpdateBatchResponse updateBatch(UpdateBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新媒体集</p>
     * 
     * @param request UpdateDatasetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDatasetWithOptions(UpdateDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
     * <b>summary</b> : 
     * <p>更新媒体集</p>
     * 
     * @param request UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    public UpdateDatasetResponse updateDataset(UpdateDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDatasetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新聚类</p>
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
     * <b>summary</b> : 
     * <p>更新聚类</p>
     * 
     * @param request UpdateFigureClusterRequest
     * @return UpdateFigureClusterResponse
     */
    public UpdateFigureClusterResponse updateFigureCluster(UpdateFigureClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFigureClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文件元信息</p>
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
     * <b>summary</b> : 
     * <p>更新文件元信息</p>
     * 
     * @param request UpdateFileMetaRequest
     * @return UpdateFileMetaResponse
     */
    public UpdateFileMetaResponse updateFileMeta(UpdateFileMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新时空聚类</p>
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
     * <b>summary</b> : 
     * <p>更新时空聚类</p>
     * 
     * @param request UpdateLocationDateClusterRequest
     * @return UpdateLocationDateClusterResponse
     */
    public UpdateLocationDateClusterResponse updateLocationDateCluster(UpdateLocationDateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLocationDateClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目</p>
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
     * <b>summary</b> : 
     * <p>更新项目</p>
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
     * <p>更新故事</p>
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
     * <p>更新故事</p>
     * 
     * @param request UpdateStoryRequest
     * @return UpdateStoryResponse
     */
    public UpdateStoryResponse updateStory(UpdateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据接入实例</p>
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
     * <b>summary</b> : 
     * <p>更新数据接入实例</p>
     * 
     * @param request UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTriggerWithOptions(request, runtime);
    }
}
