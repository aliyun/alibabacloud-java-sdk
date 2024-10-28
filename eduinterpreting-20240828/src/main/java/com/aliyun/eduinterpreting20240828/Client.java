// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828;

import com.aliyun.tea.*;
import com.aliyun.eduinterpreting20240828.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eduinterpreting", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>英语口译语音文件识别成英文内容</p>
     * 
     * @param request RecognizeAudioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeAudioResponse
     */
    public RecognizeAudioResponse recognizeAudioWithOptions(RecognizeAudioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCallBack)) {
            query.put("EnableCallBack", request.enableCallBack);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFileUrl)) {
            body.put("AudioFileUrl", request.audioFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBizId)) {
            body.put("OuterBizId", request.outerBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeAudio"),
            new TeaPair("version", "2024-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeAudioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>英语口译语音文件识别成英文内容</p>
     * 
     * @param request RecognizeAudioRequest
     * @return RecognizeAudioResponse
     */
    public RecognizeAudioResponse recognizeAudio(RecognizeAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeAudioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>口译评测任务</p>
     * 
     * @param request SubmitEvaluationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitEvaluationTaskResponse
     */
    public SubmitEvaluationTaskResponse submitEvaluationTaskWithOptions(SubmitEvaluationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioUrl)) {
            body.put("AudioUrl", request.audioUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialText)) {
            body.put("MaterialText", request.materialText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBizId)) {
            body.put("OuterBizId", request.outerBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suggestedAnswer)) {
            body.put("SuggestedAnswer", request.suggestedAnswer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitEvaluationTask"),
            new TeaPair("version", "2024-08-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitEvaluationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>口译评测任务</p>
     * 
     * @param request SubmitEvaluationTaskRequest
     * @return SubmitEvaluationTaskResponse
     */
    public SubmitEvaluationTaskResponse submitEvaluationTask(SubmitEvaluationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitEvaluationTaskWithOptions(request, runtime);
    }
}
