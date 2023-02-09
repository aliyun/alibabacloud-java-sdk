// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101;

import com.aliyun.tea.*;
import com.aliyun.aisearch20230101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddImageResponse addImageWithOptions(String InstanceName, String ProductId, AddImageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddImageShrinkRequest request = new AddImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.boxes)) {
            request.boxesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.boxes, "Boxes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            query.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectLimit)) {
            query.put("DetectLimit", request.detectLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            query.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            query.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            query.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            query.put("PicUrl", request.picUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            query.put("StrAttr", request.strAttr);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.boxesShrink)) {
            body.put("Boxes", request.boxesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/entity/" + com.aliyun.openapiutil.Client.getEncodeParam(ProductId) + "/image"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
    }

    public AddImageResponse addImage(String InstanceName, String ProductId, AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addImageWithOptions(InstanceName, ProductId, request, headers, runtime);
    }

    public AddImageResponse addImageAdvance(String InstanceName, String ProductId, AddImageAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
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
            new TeaPair("product", "aisearch"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        AddImageRequest addImageReq = new AddImageRequest();
        com.aliyun.openapiutil.Client.convert(request, addImageReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.picContentObject),
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
            addImageReq.picContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        AddImageResponse addImageResp = this.addImageWithOptions(InstanceName, ProductId, addImageReq, headers, runtime);
        return addImageResp;
    }

    public CheckOssIncrementMetaExistResponse checkOssIncrementMetaExistWithOptions(CheckOssIncrementMetaExistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOssIncrementMetaExist"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/oss/check-increment-metafile"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOssIncrementMetaExistResponse());
    }

    public CheckOssIncrementMetaExistResponse checkOssIncrementMetaExist(CheckOssIncrementMetaExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkOssIncrementMetaExistWithOptions(request, headers, runtime);
    }

    public CreateBatchTasksResponse createBatchTasksWithOptions(String InstanceName, CreateBatchTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackAddress)) {
            query.put("CallbackAddress", request.callbackAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatchTasks"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/batch-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchTasksResponse());
    }

    public CreateBatchTasksResponse createBatchTasks(String InstanceName, CreateBatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBatchTasksWithOptions(InstanceName, request, headers, runtime);
    }

    public CreateDumpMetaResponse createDumpMetaWithOptions(String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDumpMeta"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/dump-meta"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDumpMetaResponse());
    }

    public CreateDumpMetaResponse createDumpMeta(String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDumpMetaWithOptions(InstanceName, headers, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(String InstanceName, String ProductId, DeleteImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            query.put("PicName", request.picName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/entity/" + com.aliyun.openapiutil.Client.getEncodeParam(ProductId) + "/image"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(String InstanceName, String ProductId, DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageWithOptions(InstanceName, ProductId, request, headers, runtime);
    }

    public GetImageResponse getImageWithOptions(String InstanceName, String ProductId, GetImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            query.put("PicName", request.picName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/entity/" + com.aliyun.openapiutil.Client.getEncodeParam(ProductId) + "/image"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    public GetImageResponse getImage(String InstanceName, String ProductId, GetImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageWithOptions(InstanceName, ProductId, request, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(InstanceName, headers, runtime);
    }

    public ListBatchTasksResponse listBatchTasksWithOptions(String InstanceName, ListBatchTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBatchTasks"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/batch-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBatchTasksResponse());
    }

    public ListBatchTasksResponse listBatchTasks(String InstanceName, ListBatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBatchTasksWithOptions(InstanceName, request, headers, runtime);
    }

    public ListDumpMetaResponse listDumpMetaWithOptions(String InstanceName, ListDumpMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDumpMeta"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/dump-metas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDumpMetaResponse());
    }

    public ListDumpMetaResponse listDumpMeta(String InstanceName, ListDumpMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDumpMetaWithOptions(InstanceName, request, headers, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceWithOptions(request, headers, runtime);
    }

    public ListOssBucketAndPathResponse listOssBucketAndPathWithOptions(ListOssBucketAndPathRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOssBucketAndPath"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/oss/buckets-and-path"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOssBucketAndPathResponse());
    }

    public ListOssBucketAndPathResponse listOssBucketAndPath(ListOssBucketAndPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOssBucketAndPathWithOptions(request, headers, runtime);
    }

    public ResetInstanceResponse resetInstanceWithOptions(String InstanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetInstance"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/reset"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetInstanceResponse());
    }

    public ResetInstanceResponse resetInstance(String InstanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetInstanceWithOptions(InstanceName, headers, runtime);
    }

    public SearchImageByNameResponse searchImageByNameWithOptions(String InstanceName, SearchImageByNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            query.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByName"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/search-by-name"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByNameResponse());
    }

    public SearchImageByNameResponse searchImageByName(String InstanceName, SearchImageByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchImageByNameWithOptions(InstanceName, request, headers, runtime);
    }

    public SearchImageByPicResponse searchImageByPicWithOptions(String InstanceName, SearchImageByPicRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchImageByPicShrinkRequest request = new SearchImageByPicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.box)) {
            request.boxShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.box, "Box", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.boxShrink)) {
            query.put("Box", request.boxShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectLimit)) {
            query.put("DetectLimit", request.detectLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            query.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            query.put("PicUrl", request.picUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByPic"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/search-by-pic"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByPicResponse());
    }

    public SearchImageByPicResponse searchImageByPic(String InstanceName, SearchImageByPicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchImageByPicWithOptions(InstanceName, request, headers, runtime);
    }

    public SearchImageByPicResponse searchImageByPicAdvance(String InstanceName, SearchImageByPicAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
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
            new TeaPair("product", "aisearch"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        SearchImageByPicRequest searchImageByPicReq = new SearchImageByPicRequest();
        com.aliyun.openapiutil.Client.convert(request, searchImageByPicReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.picContentObject),
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
            searchImageByPicReq.picContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SearchImageByPicResponse searchImageByPicResp = this.searchImageByPicWithOptions(InstanceName, searchImageByPicReq, headers, runtime);
        return searchImageByPicResp;
    }

    public StopBatchTasksResponse stopBatchTasksWithOptions(String InstanceName, String Id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopBatchTasks"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/batch-task/" + com.aliyun.openapiutil.Client.getEncodeParam(Id) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopBatchTasksResponse());
    }

    public StopBatchTasksResponse stopBatchTasks(String InstanceName, String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopBatchTasksWithOptions(InstanceName, Id, headers, runtime);
    }

    public StopDumpMetaResponse stopDumpMetaWithOptions(String InstanceName, String Id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDumpMeta"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/dump-meta/" + com.aliyun.openapiutil.Client.getEncodeParam(Id) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDumpMetaResponse());
    }

    public StopDumpMetaResponse stopDumpMeta(String InstanceName, String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDumpMetaWithOptions(InstanceName, Id, headers, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(String InstanceName, String ProductId, UpdateImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            query.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            query.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            query.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            query.put("StrAttr", request.strAttr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2023-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceName) + "/entity/" + com.aliyun.openapiutil.Client.getEncodeParam(ProductId) + "/image"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    public UpdateImageResponse updateImage(String InstanceName, String ProductId, UpdateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateImageWithOptions(InstanceName, ProductId, request, headers, runtime);
    }
}
