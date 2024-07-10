// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628;

import com.aliyun.tea.*;
import com.aliyun.farui20240628.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("farui", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>上传合同文件</p>
     * 
     * @param request CreateTextFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTextFileResponse
     */
    public CreateTextFileResponse createTextFileWithOptions(String WorkspaceId, CreateTextFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            body.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textFileName)) {
            body.put("TextFileName", request.textFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textFileUrl)) {
            body.put("TextFileUrl", request.textFileUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTextFile"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/data/textFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTextFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传合同文件</p>
     * 
     * @param request CreateTextFileRequest
     * @return CreateTextFileResponse
     */
    public CreateTextFileResponse createTextFile(String WorkspaceId, CreateTextFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    public CreateTextFileResponse createTextFileAdvance(String WorkspaceId, CreateTextFileAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "FaRui"),
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
        CreateTextFileRequest createTextFileReq = new CreateTextFileRequest();
        com.aliyun.openapiutil.Client.convert(request, createTextFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.textFileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.textFileUrlObject),
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
            createTextFileReq.textFileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        CreateTextFileResponse createTextFileResp = this.createTextFileWithOptions(WorkspaceId, createTextFileReq, headers, runtime);
        return createTextFileResp;
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查结果</p>
     * 
     * @param tmpReq RunContractResultGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunContractResultGenerationResponse
     */
    public RunContractResultGenerationResponse runContractResultGenerationWithOptions(String workspaceId, RunContractResultGenerationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunContractResultGenerationShrinkRequest request = new RunContractResultGenerationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunContractResultGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/contract/result/genarate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunContractResultGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查结果</p>
     * 
     * @param request RunContractResultGenerationRequest
     * @return RunContractResultGenerationResponse
     */
    public RunContractResultGenerationResponse runContractResultGeneration(String workspaceId, RunContractResultGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runContractResultGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查规则</p>
     * 
     * @param tmpReq RunContractRuleGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunContractRuleGenerationResponse
     */
    public RunContractRuleGenerationResponse runContractRuleGenerationWithOptions(String workspaceId, RunContractRuleGenerationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunContractRuleGenerationShrinkRequest request = new RunContractRuleGenerationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunContractRuleGeneration"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/contract/rule/genarate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunContractRuleGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成合同审查规则</p>
     * 
     * @param request RunContractRuleGenerationRequest
     * @return RunContractRuleGenerationResponse
     */
    public RunContractRuleGenerationResponse runContractRuleGeneration(String workspaceId, RunContractRuleGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runContractRuleGenerationWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>法律咨询</p>
     * 
     * @param tmpReq RunLegalAdviceConsultationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunLegalAdviceConsultationResponse
     */
    public RunLegalAdviceConsultationResponse runLegalAdviceConsultationWithOptions(String workspaceId, RunLegalAdviceConsultationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunLegalAdviceConsultationShrinkRequest request = new RunLegalAdviceConsultationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.assistant)) {
            request.assistantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.assistant, "assistant", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thread)) {
            request.threadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thread, "thread", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assistantShrink)) {
            body.put("assistant", request.assistantShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadShrink)) {
            body.put("thread", request.threadShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunLegalAdviceConsultation"),
            new TeaPair("version", "2024-06-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/farui/legalAdvice/consult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunLegalAdviceConsultationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>法律咨询</p>
     * 
     * @param request RunLegalAdviceConsultationRequest
     * @return RunLegalAdviceConsultationResponse
     */
    public RunLegalAdviceConsultationResponse runLegalAdviceConsultation(String workspaceId, RunLegalAdviceConsultationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runLegalAdviceConsultationWithOptions(workspaceId, request, headers, runtime);
    }
}
