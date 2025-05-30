// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228;

import com.aliyun.tea.*;
import com.aliyun.aipodcast20250228.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aipodcast", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>ai播客生成任务结果查询</p>
     * 
     * @param request PodcastTaskResultQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PodcastTaskResultQueryResponse
     */
    public PodcastTaskResultQueryResponse podcastTaskResultQueryWithOptions(PodcastTaskResultQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PodcastTaskResultQuery"),
            new TeaPair("version", "2025-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/podcast/task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PodcastTaskResultQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ai播客生成任务结果查询</p>
     * 
     * @param request PodcastTaskResultQueryRequest
     * @return PodcastTaskResultQueryResponse
     */
    public PodcastTaskResultQueryResponse podcastTaskResultQuery(PodcastTaskResultQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.podcastTaskResultQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ai播客生成任务提交</p>
     * 
     * @param tmpReq PodcastTaskSubmitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PodcastTaskSubmitResponse
     */
    public PodcastTaskSubmitResponse podcastTaskSubmitWithOptions(PodcastTaskSubmitRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PodcastTaskSubmitShrinkRequest request = new PodcastTaskSubmitShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileUrls)) {
            request.fileUrlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileUrls, "fileUrls", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.voices)) {
            request.voicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.voices, "voices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.counts)) {
            body.put("counts", request.counts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlsShrink)) {
            body.put("fileUrls", request.fileUrlsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voicesShrink)) {
            body.put("voices", request.voicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PodcastTaskSubmit"),
            new TeaPair("version", "2025-02-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/podcast/task/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PodcastTaskSubmitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ai播客生成任务提交</p>
     * 
     * @param request PodcastTaskSubmitRequest
     * @return PodcastTaskSubmitResponse
     */
    public PodcastTaskSubmitResponse podcastTaskSubmit(PodcastTaskSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.podcastTaskSubmitWithOptions(request, headers, runtime);
    }
}
