// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630;

import com.aliyun.tea.*;
import com.aliyun.idrsservice20200630.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-south-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-chengdu", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-edge-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-fujian", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hongkong", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-qingdao", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-wuhan", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-central-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-west-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "idrsservice.aliyuncs.com"),
            new TeaPair("me-east-1", "idrsservice.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("us-east-1", "idrsservice.aliyuncs.com"),
            new TeaPair("us-west-1", "idrsservice.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("idrsservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AsrRealtimeResponse asrRealtimeWithOptions(AsrRealtimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customizationId)) {
            query.put("CustomizationId", request.customizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disfluency)) {
            query.put("Disfluency", request.disfluency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIgnoreSentenceTimeout)) {
            query.put("EnableIgnoreSentenceTimeout", request.enableIgnoreSentenceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIntermediateResult)) {
            query.put("EnableIntermediateResult", request.enableIntermediateResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInverseTextNormalization)) {
            query.put("EnableInverseTextNormalization", request.enableInverseTextNormalization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePunctuationPrediction)) {
            query.put("EnablePunctuationPrediction", request.enablePunctuationPrediction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSemanticSentenceDetection)) {
            query.put("EnableSemanticSentenceDetection", request.enableSemanticSentenceDetection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWords)) {
            query.put("EnableWords", request.enableWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSentenceSilence)) {
            query.put("MaxSentenceSilence", request.maxSentenceSilence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            query.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechNoiseThreshold)) {
            query.put("SpeechNoiseThreshold", request.speechNoiseThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            query.put("VocabularyId", request.vocabularyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsrRealtime"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsrRealtimeResponse());
    }

    public AsrRealtimeResponse asrRealtime(AsrRealtimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asrRealtimeWithOptions(request, runtime);
    }

    public AsrSentenceResponse asrSentenceWithOptions(AsrSentenceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AsrSentenceShrinkRequest request = new AsrSentenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.asrRequest)) {
            request.asrRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.asrRequest, "AsrRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrRequestShrink)) {
            body.put("AsrRequest", request.asrRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsrSentence"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsrSentenceResponse());
    }

    public AsrSentenceResponse asrSentence(AsrSentenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asrSentenceWithOptions(request, runtime);
    }

    public AsrTaskResponse asrTaskWithOptions(AsrTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AsrTaskShrinkRequest request = new AsrTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AsrTask"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AsrTaskResponse());
    }

    public AsrTaskResponse asrTask(AsrTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asrTaskWithOptions(request, runtime);
    }

    public AssociateRoomResponse associateRoomWithOptions(AssociateRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("RoomId", request.roomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateRoom"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateRoomResponse());
    }

    public AssociateRoomResponse associateRoom(AssociateRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateRoomWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateDepartmentResponse createDepartmentWithOptions(CreateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDepartment"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDepartmentResponse());
    }

    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDepartmentWithOptions(request, runtime);
    }

    public CreateDetectProcessResponse createDetectProcessWithOptions(CreateDetectProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draft)) {
            query.put("Draft", request.draft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDetectProcess"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDetectProcessResponse());
    }

    public CreateDetectProcessResponse createDetectProcess(CreateDetectProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDetectProcessWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateSignatureResponse createSignatureWithOptions(CreateSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSignature"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSignatureResponse());
    }

    public CreateSignatureResponse createSignature(CreateSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSignatureWithOptions(request, runtime);
    }

    public CreateTaskGroupResponse createTaskGroupWithOptions(CreateTaskGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.day)) {
            query.put("Day", request.day);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireAt)) {
            query.put("ExpireAt", request.expireAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runnableTimeFrom)) {
            query.put("RunnableTimeFrom", request.runnableTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runnableTimeTo)) {
            query.put("RunnableTimeTo", request.runnableTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerPeriod)) {
            query.put("TriggerPeriod", request.triggerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfo)) {
            query.put("VideoInfo", request.videoInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskGroup"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskGroupResponse());
    }

    public CreateTaskGroupResponse createTaskGroup(CreateTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskGroupWithOptions(request, runtime);
    }

    public CreateTtsQuestionResponse createTtsQuestionWithOptions(CreateTtsQuestionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTtsQuestionShrinkRequest request = new CreateTtsQuestionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTtsQuestion"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTtsQuestionResponse());
    }

    public CreateTtsQuestionResponse createTtsQuestion(CreateTtsQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTtsQuestionWithOptions(request, runtime);
    }

    public CreateTtsQuestionGroupResponse createTtsQuestionGroupWithOptions(CreateTtsQuestionGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTtsQuestionGroupShrinkRequest request = new CreateTtsQuestionGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTtsQuestionGroup"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTtsQuestionGroupResponse());
    }

    public CreateTtsQuestionGroupResponse createTtsQuestionGroup(CreateTtsQuestionGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTtsQuestionGroupWithOptions(request, runtime);
    }

    public CreateUserDepartmentsResponse createUserDepartmentsWithOptions(CreateUserDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserDepartments"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserDepartmentsResponse());
    }

    public CreateUserDepartmentsResponse createUserDepartments(CreateUserDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserDepartmentsWithOptions(request, runtime);
    }

    public CreateVideoMergeTaskResponse createVideoMergeTaskWithOptions(CreateVideoMergeTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVideoMergeTaskShrinkRequest request = new CreateVideoMergeTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoMergeRequest)) {
            request.videoMergeRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoMergeRequest, "VideoMergeRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoMergeRequestShrink)) {
            body.put("VideoMergeRequest", request.videoMergeRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoMergeTask"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoMergeTaskResponse());
    }

    public CreateVideoMergeTaskResponse createVideoMergeTask(CreateVideoMergeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoMergeTaskWithOptions(request, runtime);
    }

    public CreateWatermarkResponse createWatermarkWithOptions(CreateWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWatermark"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWatermarkResponse());
    }

    public CreateWatermarkResponse createWatermark(CreateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWatermarkWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteDepartmentResponse deleteDepartmentWithOptions(DeleteDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDepartment"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDepartmentResponse());
    }

    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDepartmentWithOptions(request, runtime);
    }

    public DeleteDetectProcessResponse deleteDetectProcessWithOptions(DeleteDetectProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDetectProcess"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDetectProcessResponse());
    }

    public DeleteDetectProcessResponse deleteDetectProcess(DeleteDetectProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDetectProcessWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserDepartmentsResponse deleteUserDepartmentsWithOptions(DeleteUserDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDepartments"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDepartmentsResponse());
    }

    public DeleteUserDepartmentsResponse deleteUserDepartments(DeleteUserDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDepartmentsWithOptions(request, runtime);
    }

    public DeleteWatermarkResponse deleteWatermarkWithOptions(DeleteWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWatermark"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWatermarkResponse());
    }

    public DeleteWatermarkResponse deleteWatermark(DeleteWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatermarkWithOptions(request, runtime);
    }

    public FaceCompareResponse faceCompareWithOptions(FaceCompareRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FaceCompareShrinkRequest request = new FaceCompareShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.faceRequest)) {
            request.faceRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.faceRequest, "FaceRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceRequestShrink)) {
            body.put("FaceRequest", request.faceRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceCompare"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceCompareResponse());
    }

    public FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceCompareWithOptions(request, runtime);
    }

    public FaceLivenessResponse faceLivenessWithOptions(FaceLivenessRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FaceLivenessShrinkRequest request = new FaceLivenessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.faceRequest)) {
            request.faceRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.faceRequest, "FaceRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceRequestShrink)) {
            body.put("FaceRequest", request.faceRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceLiveness"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceLivenessResponse());
    }

    public FaceLivenessResponse faceLiveness(FaceLivenessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceLivenessWithOptions(request, runtime);
    }

    public FaceRecognizeResponse faceRecognizeWithOptions(FaceRecognizeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FaceRecognizeShrinkRequest request = new FaceRecognizeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.faceRequest)) {
            request.faceRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.faceRequest, "FaceRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceRequestShrink)) {
            body.put("FaceRequest", request.faceRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FaceRecognize"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FaceRecognizeResponse());
    }

    public FaceRecognizeResponse faceRecognize(FaceRecognizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.faceRecognizeWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public GetAsrResultResponse getAsrResultWithOptions(GetAsrResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrTaskId)) {
            query.put("AsrTaskId", request.asrTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsrResult"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsrResultResponse());
    }

    public GetAsrResultResponse getAsrResult(GetAsrResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrResultWithOptions(request, runtime);
    }

    public GetDepartmentResponse getDepartmentWithOptions(GetDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDepartment"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDepartmentResponse());
    }

    public GetDepartmentResponse getDepartment(GetDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepartmentWithOptions(request, runtime);
    }

    public GetDetectProcessResponse getDetectProcessWithOptions(GetDetectProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectProcess"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectProcessResponse());
    }

    public GetDetectProcessResponse getDetectProcess(GetDetectProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectProcessWithOptions(request, runtime);
    }

    public GetDetectProcessJsonFileResponse getDetectProcessJsonFileWithOptions(GetDetectProcessJsonFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectProcessJsonFile"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectProcessJsonFileResponse());
    }

    public GetDetectProcessJsonFileResponse getDetectProcessJsonFile(GetDetectProcessJsonFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectProcessJsonFileWithOptions(request, runtime);
    }

    public GetDetectionResponse getDetectionWithOptions(GetDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetection"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectionResponse());
    }

    public GetDetectionResponse getDetection(GetDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectionWithOptions(request, runtime);
    }

    public GetPreSignedUrlResponse getPreSignedUrlWithOptions(GetPreSignedUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            body.put("Prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPreSignedUrl"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPreSignedUrlResponse());
    }

    public GetPreSignedUrlResponse getPreSignedUrl(GetPreSignedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPreSignedUrlWithOptions(request, runtime);
    }

    public GetRecordResultResponse getRecordResultWithOptions(GetRecordResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordResult"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordResultResponse());
    }

    public GetRecordResultResponse getRecordResult(GetRecordResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordResultWithOptions(request, runtime);
    }

    public GetRecordsByFeeIdResponse getRecordsByFeeIdWithOptions(GetRecordsByFeeIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feeId)) {
            body.put("FeeId", request.feeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordsByFeeId"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordsByFeeIdResponse());
    }

    public GetRecordsByFeeIdResponse getRecordsByFeeId(GetRecordsByFeeIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordsByFeeIdWithOptions(request, runtime);
    }

    public GetRecordsByOuterBusinessIdResponse getRecordsByOuterBusinessIdWithOptions(GetRecordsByOuterBusinessIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outerBusinessId)) {
            query.put("OuterBusinessId", request.outerBusinessId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordsByOuterBusinessId"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordsByOuterBusinessIdResponse());
    }

    public GetRecordsByOuterBusinessIdResponse getRecordsByOuterBusinessId(GetRecordsByOuterBusinessIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordsByOuterBusinessIdWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRule"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetStatisticsRecordsByFeeIdResponse getStatisticsRecordsByFeeIdWithOptions(GetStatisticsRecordsByFeeIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feeId)) {
            body.put("FeeId", request.feeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatisticsRecordsByFeeId"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatisticsRecordsByFeeIdResponse());
    }

    public GetStatisticsRecordsByFeeIdResponse getStatisticsRecordsByFeeId(GetStatisticsRecordsByFeeIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStatisticsRecordsByFeeIdWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2020-06-30"),
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

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
      * **1**
      *
      * @param request GetTaskGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTaskGroupResponse
     */
    public GetTaskGroupResponse getTaskGroupWithOptions(GetTaskGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskGroup"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskGroupResponse());
    }

    /**
      * **1**
      *
      * @param request GetTaskGroupRequest
      * @return GetTaskGroupResponse
     */
    public GetTaskGroupResponse getTaskGroup(GetTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskGroupWithOptions(request, runtime);
    }

    public GetTtsQuestionByGroupIdResponse getTtsQuestionByGroupIdWithOptions(GetTtsQuestionByGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTtsQuestionByGroupId"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTtsQuestionByGroupIdResponse());
    }

    public GetTtsQuestionByGroupIdResponse getTtsQuestionByGroupId(GetTtsQuestionByGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTtsQuestionByGroupIdWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetVideoMergeTaskResponse getVideoMergeTaskWithOptions(GetVideoMergeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoMergeTask"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoMergeTaskResponse());
    }

    public GetVideoMergeTaskResponse getVideoMergeTask(GetVideoMergeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoMergeTaskWithOptions(request, runtime);
    }

    public GetWatermarkResponse getWatermarkWithOptions(GetWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWatermark"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWatermarkResponse());
    }

    public GetWatermarkResponse getWatermark(GetWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWatermarkWithOptions(request, runtime);
    }

    public JoinRoomResponse joinRoomWithOptions(JoinRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomToken)) {
            query.put("RoomToken", request.roomToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamId)) {
            query.put("StreamId", request.streamId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinRoom"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinRoomResponse());
    }

    public JoinRoomResponse joinRoom(JoinRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinRoomWithOptions(request, runtime);
    }

    public LeaveRoomResponse leaveRoomWithOptions(LeaveRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("RoomId", request.roomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LeaveRoom"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LeaveRoomResponse());
    }

    public LeaveRoomResponse leaveRoom(LeaveRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveRoomWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public ListDepartmentsResponse listDepartmentsWithOptions(ListDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDepartments"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDepartmentsResponse());
    }

    public ListDepartmentsResponse listDepartments(ListDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDepartmentsWithOptions(request, runtime);
    }

    public ListDetectProcessesResponse listDetectProcessesWithOptions(ListDetectProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishStatus)) {
            query.put("PublishStatus", request.publishStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("SortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetectProcesses"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectProcessesResponse());
    }

    public ListDetectProcessesResponse listDetectProcesses(ListDetectProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDetectProcessesWithOptions(request, runtime);
    }

    public ListDetectionsResponse listDetectionsWithOptions(ListDetectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createDateFrom)) {
            query.put("CreateDateFrom", request.createDateFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createDateTo)) {
            query.put("CreateDateTo", request.createDateTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingType)) {
            query.put("RecordingType", request.recordingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDetections"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDetectionsResponse());
    }

    public ListDetectionsResponse listDetections(ListDetectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDetectionsWithOptions(request, runtime);
    }

    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    public ListRecordResultsResponse listRecordResultsWithOptions(ListRecordResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createDateFrom)) {
            query.put("CreateDateFrom", request.createDateFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createDateTo)) {
            query.put("CreateDateTo", request.createDateTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBusinessId)) {
            query.put("OuterBusinessId", request.outerBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecordResults"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordResultsResponse());
    }

    public ListRecordResultsResponse listRecordResults(ListRecordResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordResultsWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListTaskGroupsResponse listTaskGroupsWithOptions(ListTaskGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskGroups"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskGroupsResponse());
    }

    public ListTaskGroupsResponse listTaskGroups(ListTaskGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskGroupsWithOptions(request, runtime);
    }

    public ListTaskItemsResponse listTaskItemsWithOptions(ListTaskItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskItems"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskItemsResponse());
    }

    public ListTaskItemsResponse listTaskItems(ListTaskItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskItemsWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskGroupId)) {
            query.put("TaskGroupId", request.taskGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2020-06-30"),
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

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListWatermarksResponse listWatermarksWithOptions(ListWatermarksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWatermarks"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWatermarksResponse());
    }

    public ListWatermarksResponse listWatermarks(ListWatermarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWatermarksWithOptions(request, runtime);
    }

    public RenameDetectProcessResponse renameDetectProcessWithOptions(RenameDetectProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameDetectProcess"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameDetectProcessResponse());
    }

    public RenameDetectProcessResponse renameDetectProcess(RenameDetectProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameDetectProcessWithOptions(request, runtime);
    }

    public TtsCommonResponse ttsCommonWithOptions(TtsCommonRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TtsCommonShrinkRequest request = new TtsCommonShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ttsRequest)) {
            request.ttsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ttsRequest, "TtsRequest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ttsRequestShrink)) {
            body.put("TtsRequest", request.ttsRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TtsCommon"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TtsCommonResponse());
    }

    public TtsCommonResponse ttsCommon(TtsCommonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ttsCommonWithOptions(request, runtime);
    }

    public TtsTaskResponse ttsTaskWithOptions(TtsTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TtsTaskShrinkRequest request = new TtsTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TtsTask"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TtsTaskResponse());
    }

    public TtsTaskResponse ttsTask(TtsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ttsTaskWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("PackageName", request.packageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApp"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public UpdateDepartmentResponse updateDepartmentWithOptions(UpdateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDepartment"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDepartmentResponse());
    }

    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDepartmentWithOptions(request, runtime);
    }

    /**
      * ********
      *
      * @param request UpdateDetectProcessRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDetectProcessResponse
     */
    public UpdateDetectProcessResponse updateDetectProcessWithOptions(UpdateDetectProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draft)) {
            query.put("Draft", request.draft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDetectProcess"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDetectProcessResponse());
    }

    /**
      * ********
      *
      * @param request UpdateDetectProcessRequest
      * @return UpdateDetectProcessResponse
     */
    public UpdateDetectProcessResponse updateDetectProcess(UpdateDetectProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDetectProcessWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRule"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UpdateWatermarkResponse updateWatermarkWithOptions(UpdateWatermarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkId)) {
            query.put("WatermarkId", request.watermarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWatermark"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWatermarkResponse());
    }

    public UpdateWatermarkResponse updateWatermark(UpdateWatermarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatermarkWithOptions(request, runtime);
    }

    public UploadReportResponse uploadReportWithOptions(UploadReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientBaseParam)) {
            query.put("ClientBaseParam", request.clientBaseParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectProcessId)) {
            query.put("DetectProcessId", request.detectProcessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feeId)) {
            query.put("FeeId", request.feeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaUrl)) {
            query.put("MetaUrl", request.metaUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerBusinessId)) {
            query.put("OuterBusinessId", request.outerBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordAt)) {
            query.put("RecordAt", request.recordAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultUrl)) {
            query.put("ResultUrl", request.resultUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rtcRecordId)) {
            query.put("RtcRecordId", request.rtcRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoType)) {
            query.put("VideoType", request.videoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoUrl)) {
            query.put("VideoUrl", request.videoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadReport"),
            new TeaPair("version", "2020-06-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadReportResponse());
    }

    public UploadReportResponse uploadReport(UploadReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadReportWithOptions(request, runtime);
    }
}
