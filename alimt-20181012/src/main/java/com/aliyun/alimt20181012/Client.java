// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012;

import com.aliyun.tea.*;
import com.aliyun.alimt20181012.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "mt.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mt.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mt.aliyuncs.com"),
            new TeaPair("ap-south-1", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mt.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mt.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mt.aliyuncs.com"),
            new TeaPair("cn-fujian", "mt.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mt.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mt.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mt.aliyuncs.com"),
            new TeaPair("eu-central-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mt.aliyuncs.com"),
            new TeaPair("me-east-1", "mt.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mt.aliyuncs.com"),
            new TeaPair("us-east-1", "mt.aliyuncs.com"),
            new TeaPair("us-west-1", "mt.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alimt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 大文本异步翻译，支持5000-50000字翻译
     *
     * @param request CreateAsyncTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAsyncTranslateResponse
     */
    public CreateAsyncTranslateResponse createAsyncTranslateWithOptions(CreateAsyncTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAsyncTranslate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAsyncTranslateResponse());
    }

    /**
     * @summary 大文本异步翻译，支持5000-50000字翻译
     *
     * @param request CreateAsyncTranslateRequest
     * @return CreateAsyncTranslateResponse
     */
    public CreateAsyncTranslateResponse createAsyncTranslate(CreateAsyncTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAsyncTranslateWithOptions(request, runtime);
    }

    /**
     * @param request CreateDocTranslateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocTranslateTaskResponse
     */
    public CreateDocTranslateTaskResponse createDocTranslateTaskWithOptions(CreateDocTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocTranslateTask"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocTranslateTaskResponse());
    }

    /**
     * @param request CreateDocTranslateTaskRequest
     * @return CreateDocTranslateTaskResponse
     */
    public CreateDocTranslateTaskResponse createDocTranslateTask(CreateDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocTranslateTaskWithOptions(request, runtime);
    }

    public CreateDocTranslateTaskResponse createDocTranslateTaskAdvance(CreateDocTranslateTaskAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "alimt"),
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
        CreateDocTranslateTaskRequest createDocTranslateTaskReq = new CreateDocTranslateTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, createDocTranslateTaskReq);
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
            createDocTranslateTaskReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        CreateDocTranslateTaskResponse createDocTranslateTaskResp = this.createDocTranslateTaskWithOptions(createDocTranslateTaskReq, runtime);
        return createDocTranslateTaskResp;
    }

    /**
     * @param request CreateImageTranslateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageTranslateTaskResponse
     */
    public CreateImageTranslateTaskResponse createImageTranslateTaskWithOptions(CreateImageTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlList)) {
            body.put("UrlList", request.urlList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageTranslateTask"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageTranslateTaskResponse());
    }

    /**
     * @param request CreateImageTranslateTaskRequest
     * @return CreateImageTranslateTaskResponse
     */
    public CreateImageTranslateTaskResponse createImageTranslateTask(CreateImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageTranslateTaskWithOptions(request, runtime);
    }

    /**
     * @summary 大文本异步翻译，支持5000-50000字翻译
     *
     * @param request GetAsyncTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncTranslateResponse
     */
    public GetAsyncTranslateResponse getAsyncTranslateWithOptions(GetAsyncTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncTranslate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncTranslateResponse());
    }

    /**
     * @summary 大文本异步翻译，支持5000-50000字翻译
     *
     * @param request GetAsyncTranslateRequest
     * @return GetAsyncTranslateResponse
     */
    public GetAsyncTranslateResponse getAsyncTranslate(GetAsyncTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncTranslateWithOptions(request, runtime);
    }

    /**
     * @param request GetBatchTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTranslateResponse
     */
    public GetBatchTranslateResponse getBatchTranslateWithOptions(GetBatchTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTranslate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTranslateResponse());
    }

    /**
     * @param request GetBatchTranslateRequest
     * @return GetBatchTranslateResponse
     */
    public GetBatchTranslateResponse getBatchTranslate(GetBatchTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTranslateWithOptions(request, runtime);
    }

    /**
     * @summary GetBatchTranslateByVPC
     *
     * @param request GetBatchTranslateByVPCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBatchTranslateByVPCResponse
     */
    public GetBatchTranslateByVPCResponse getBatchTranslateByVPCWithOptions(GetBatchTranslateByVPCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBatchTranslateByVPC"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBatchTranslateByVPCResponse());
    }

    /**
     * @summary GetBatchTranslateByVPC
     *
     * @param request GetBatchTranslateByVPCRequest
     * @return GetBatchTranslateByVPCResponse
     */
    public GetBatchTranslateByVPCResponse getBatchTranslateByVPC(GetBatchTranslateByVPCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTranslateByVPCWithOptions(request, runtime);
    }

    /**
     * @summary 语种识别
     *
     * @param request GetDetectLanguageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDetectLanguageResponse
     */
    public GetDetectLanguageResponse getDetectLanguageWithOptions(GetDetectLanguageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectLanguage"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectLanguageResponse());
    }

    /**
     * @summary 语种识别
     *
     * @param request GetDetectLanguageRequest
     * @return GetDetectLanguageResponse
     */
    public GetDetectLanguageResponse getDetectLanguage(GetDetectLanguageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectLanguageWithOptions(request, runtime);
    }

    /**
     * @param request GetDocTranslateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocTranslateTaskResponse
     */
    public GetDocTranslateTaskResponse getDocTranslateTaskWithOptions(GetDocTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocTranslateTask"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocTranslateTaskResponse());
    }

    /**
     * @param request GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    public GetDocTranslateTaskResponse getDocTranslateTask(GetDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocTranslateTaskWithOptions(request, runtime);
    }

    /**
     * @param request GetImageDiagnoseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageDiagnoseResponse
     */
    public GetImageDiagnoseResponse getImageDiagnoseWithOptions(GetImageDiagnoseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageDiagnose"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageDiagnoseResponse());
    }

    /**
     * @param request GetImageDiagnoseRequest
     * @return GetImageDiagnoseResponse
     */
    public GetImageDiagnoseResponse getImageDiagnose(GetImageDiagnoseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageDiagnoseWithOptions(request, runtime);
    }

    /**
     * @param request GetImageTranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageTranslateResponse
     */
    public GetImageTranslateResponse getImageTranslateWithOptions(GetImageTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageTranslate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageTranslateResponse());
    }

    /**
     * @param request GetImageTranslateRequest
     * @return GetImageTranslateResponse
     */
    public GetImageTranslateResponse getImageTranslate(GetImageTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTranslateWithOptions(request, runtime);
    }

    /**
     * @param request GetImageTranslateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageTranslateTaskResponse
     */
    public GetImageTranslateTaskResponse getImageTranslateTaskWithOptions(GetImageTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageTranslateTask"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageTranslateTaskResponse());
    }

    /**
     * @param request GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    public GetImageTranslateTaskResponse getImageTranslateTask(GetImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTranslateTaskWithOptions(request, runtime);
    }

    /**
     * @param request GetTitleDiagnoseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTitleDiagnoseResponse
     */
    public GetTitleDiagnoseResponse getTitleDiagnoseWithOptions(GetTitleDiagnoseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTitleDiagnose"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTitleDiagnoseResponse());
    }

    /**
     * @param request GetTitleDiagnoseRequest
     * @return GetTitleDiagnoseResponse
     */
    public GetTitleDiagnoseResponse getTitleDiagnose(GetTitleDiagnoseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleDiagnoseWithOptions(request, runtime);
    }

    /**
     * @param request GetTitleGenerateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTitleGenerateResponse
     */
    public GetTitleGenerateResponse getTitleGenerateWithOptions(GetTitleGenerateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("Attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotWords)) {
            body.put("HotWords", request.hotWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTitleGenerate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTitleGenerateResponse());
    }

    /**
     * @param request GetTitleGenerateRequest
     * @return GetTitleGenerateResponse
     */
    public GetTitleGenerateResponse getTitleGenerate(GetTitleGenerateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleGenerateWithOptions(request, runtime);
    }

    /**
     * @param request GetTitleIntelligenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTitleIntelligenceResponse
     */
    public GetTitleIntelligenceResponse getTitleIntelligenceWithOptions(GetTitleIntelligenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catLevelThreeId)) {
            body.put("CatLevelThreeId", request.catLevelThreeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catLevelTwoId)) {
            body.put("CatLevelTwoId", request.catLevelTwoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            body.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTitleIntelligence"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTitleIntelligenceResponse());
    }

    /**
     * @param request GetTitleIntelligenceRequest
     * @return GetTitleIntelligenceResponse
     */
    public GetTitleIntelligenceResponse getTitleIntelligence(GetTitleIntelligenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleIntelligenceWithOptions(request, runtime);
    }

    /**
     * @summary 获取图片批量翻译结果
     *
     * @param request GetTranslateImageBatchResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranslateImageBatchResultResponse
     */
    public GetTranslateImageBatchResultResponse getTranslateImageBatchResultWithOptions(GetTranslateImageBatchResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranslateImageBatchResult"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranslateImageBatchResultResponse());
    }

    /**
     * @summary 获取图片批量翻译结果
     *
     * @param request GetTranslateImageBatchResultRequest
     * @return GetTranslateImageBatchResultResponse
     */
    public GetTranslateImageBatchResultResponse getTranslateImageBatchResult(GetTranslateImageBatchResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranslateImageBatchResultWithOptions(request, runtime);
    }

    /**
     * @param request GetTranslateReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTranslateReportResponse
     */
    public GetTranslateReportResponse getTranslateReportWithOptions(GetTranslateReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTranslateReport"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTranslateReportResponse());
    }

    /**
     * @param request GetTranslateReportRequest
     * @return GetTranslateReportResponse
     */
    public GetTranslateReportResponse getTranslateReport(GetTranslateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranslateReportWithOptions(request, runtime);
    }

    /**
     * @summary 开通服务
     *
     * @param request OpenAlimtServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenAlimtServiceResponse
     */
    public OpenAlimtServiceResponse openAlimtServiceWithOptions(OpenAlimtServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenAlimtService"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAlimtServiceResponse());
    }

    /**
     * @summary 开通服务
     *
     * @param request OpenAlimtServiceRequest
     * @return OpenAlimtServiceResponse
     */
    public OpenAlimtServiceResponse openAlimtService(OpenAlimtServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAlimtServiceWithOptions(request, runtime);
    }

    /**
     * @param request TranslateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateResponse
     */
    public TranslateResponse translateWithOptions(TranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Translate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateResponse());
    }

    /**
     * @param request TranslateRequest
     * @return TranslateResponse
     */
    public TranslateResponse translate(TranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateWithOptions(request, runtime);
    }

    /**
     * @param request TranslateCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateCertificateResponse
     */
    public TranslateCertificateResponse translateCertificateWithOptions(TranslateCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateType)) {
            body.put("CertificateType", request.certificateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            body.put("ResultType", request.resultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateCertificate"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateCertificateResponse());
    }

    /**
     * @param request TranslateCertificateRequest
     * @return TranslateCertificateResponse
     */
    public TranslateCertificateResponse translateCertificate(TranslateCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateCertificateWithOptions(request, runtime);
    }

    public TranslateCertificateResponse translateCertificateAdvance(TranslateCertificateAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "alimt"),
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
        TranslateCertificateRequest translateCertificateReq = new TranslateCertificateRequest();
        com.aliyun.openapiutil.Client.convert(request, translateCertificateReq);
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.imageUrlObject),
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
            translateCertificateReq.imageUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        TranslateCertificateResponse translateCertificateResp = this.translateCertificateWithOptions(translateCertificateReq, runtime);
        return translateCertificateResp;
    }

    /**
     * @deprecated OpenAPI TranslateECommerce is deprecated, please use alimt::2018-10-12::Translate instead.
     *
     * @param request TranslateECommerceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateECommerceResponse
     */
    // Deprecated
    public TranslateECommerceResponse translateECommerceWithOptions(TranslateECommerceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateECommerce"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateECommerceResponse());
    }

    /**
     * @deprecated OpenAPI TranslateECommerce is deprecated, please use alimt::2018-10-12::Translate instead.
     *
     * @param request TranslateECommerceRequest
     * @return TranslateECommerceResponse
     */
    // Deprecated
    public TranslateECommerceResponse translateECommerce(TranslateECommerceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateECommerceWithOptions(request, runtime);
    }

    /**
     * @param request TranslateGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateGeneralResponse
     */
    public TranslateGeneralResponse translateGeneralWithOptions(TranslateGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateGeneral"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateGeneralResponse());
    }

    /**
     * @param request TranslateGeneralRequest
     * @return TranslateGeneralResponse
     */
    public TranslateGeneralResponse translateGeneral(TranslateGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateGeneralWithOptions(request, runtime);
    }

    /**
     * @summary TranslateGeneralVpc
     *
     * @param request TranslateGeneralVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateGeneralVpcResponse
     */
    public TranslateGeneralVpcResponse translateGeneralVpcWithOptions(TranslateGeneralVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("Context", request.context);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            body.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateGeneralVpc"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateGeneralVpcResponse());
    }

    /**
     * @summary TranslateGeneralVpc
     *
     * @param request TranslateGeneralVpcRequest
     * @return TranslateGeneralVpcResponse
     */
    public TranslateGeneralVpcResponse translateGeneralVpc(TranslateGeneralVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateGeneralVpcWithOptions(request, runtime);
    }

    /**
     * @summary 公有云图片翻译产品API
     *
     * @param request TranslateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateImageResponse
     */
    public TranslateImageResponse translateImageWithOptions(TranslateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ext)) {
            body.put("Ext", request.ext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            body.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageBase64)) {
            body.put("ImageBase64", request.imageBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateImage"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateImageResponse());
    }

    /**
     * @summary 公有云图片翻译产品API
     *
     * @param request TranslateImageRequest
     * @return TranslateImageResponse
     */
    public TranslateImageResponse translateImage(TranslateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateImageWithOptions(request, runtime);
    }

    /**
     * @summary 批量图片翻译接口
     *
     * @param request TranslateImageBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TranslateImageBatchResponse
     */
    public TranslateImageBatchResponse translateImageBatchWithOptions(TranslateImageBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customTaskId)) {
            body.put("CustomTaskId", request.customTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ext)) {
            body.put("Ext", request.ext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            body.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrls)) {
            body.put("ImageUrls", request.imageUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("TargetLanguage", request.targetLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TranslateImageBatch"),
            new TeaPair("version", "2018-10-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TranslateImageBatchResponse());
    }

    /**
     * @summary 批量图片翻译接口
     *
     * @param request TranslateImageBatchRequest
     * @return TranslateImageBatchResponse
     */
    public TranslateImageBatchResponse translateImageBatch(TranslateImageBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateImageBatchWithOptions(request, runtime);
    }
}
