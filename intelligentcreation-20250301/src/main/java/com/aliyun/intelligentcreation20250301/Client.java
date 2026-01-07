// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301;

import com.aliyun.tea.*;
import com.aliyun.intelligentcreation20250301.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("intelligentcreation", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建模型标注任务</p>
     * 
     * @param request CreateLabelTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabelTaskResponse
     */
    public CreateLabelTaskResponse createLabelTaskWithOptions(CreateLabelTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            body.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTemplateId)) {
            body.put("LabelTemplateId", request.labelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabelTask"),
            new TeaPair("version", "2025-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tongjian/yic-tongjian/openService/v2/aitag/createLabelTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模型标注任务</p>
     * 
     * @param request CreateLabelTaskRequest
     * @return CreateLabelTaskResponse
     */
    public CreateLabelTaskResponse createLabelTask(CreateLabelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLabelTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建OSS上传token</p>
     * 
     * @param request CreateOssUploadTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssUploadTokenResponse
     */
    public CreateOssUploadTokenResponse createOssUploadTokenWithOptions(CreateOssUploadTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssUploadToken"),
            new TeaPair("version", "2025-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tongjian/yic-tongjian/openService/v2/base/createOssUploadToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建OSS上传token</p>
     * 
     * @param request CreateOssUploadTokenRequest
     * @return CreateOssUploadTokenResponse
     */
    public CreateOssUploadTokenResponse createOssUploadToken(CreateOssUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOssUploadTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单条文本标注</p>
     * 
     * @param request CreateTextLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTextLabelResponse
     */
    public CreateTextLabelResponse createTextLabelWithOptions(CreateTextLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTemplateId)) {
            body.put("LabelTemplateId", request.labelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTextLabel"),
            new TeaPair("version", "2025-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tongjian/yic-tongjian/openService/v2/aitag/createTextLabel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTextLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单条文本标注</p>
     * 
     * @param request CreateTextLabelRequest
     * @return CreateTextLabelResponse
     */
    public CreateTextLabelResponse createTextLabel(CreateTextLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextLabelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型标注任务</p>
     * 
     * @param request GetLabelTaskResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLabelTaskResultResponse
     */
    public GetLabelTaskResultResponse getLabelTaskResultWithOptions(GetLabelTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLabelTaskResult"),
            new TeaPair("version", "2025-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tongjian/yic-tongjian/openService/v2/aitag/getLabelTaskResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLabelTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模型标注任务</p>
     * 
     * @param request GetLabelTaskResultRequest
     * @return GetLabelTaskResultResponse
     */
    public GetLabelTaskResultResponse getLabelTaskResult(GetLabelTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLabelTaskResultWithOptions(request, headers, runtime);
    }
}
