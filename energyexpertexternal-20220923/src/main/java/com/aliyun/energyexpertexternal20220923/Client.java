// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923;

import com.aliyun.tea.*;
import com.aliyun.energyexpertexternal20220923.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("energyexpertexternal", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Users obtain real-time VL results by uploading a document URL.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Document Results</p>
     * 
     * @param request AnalyzeVlRealtimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeVlRealtimeResponse
     */
    public AnalyzeVlRealtimeResponse analyzeVlRealtimeWithOptions(AnalyzeVlRealtimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeVlRealtime"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/analyzeVlRealtime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeVlRealtimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Users obtain real-time VL results by uploading a document URL.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Document Results</p>
     * 
     * @param request AnalyzeVlRealtimeRequest
     * @return AnalyzeVlRealtimeResponse
     */
    public AnalyzeVlRealtimeResponse analyzeVlRealtime(AnalyzeVlRealtimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.analyzeVlRealtimeWithOptions(request, headers, runtime);
    }

    public AnalyzeVlRealtimeResponse analyzeVlRealtimeAdvance(AnalyzeVlRealtimeAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "energyExpertExternal"),
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
        AnalyzeVlRealtimeRequest analyzeVlRealtimeReq = new AnalyzeVlRealtimeRequest();
        com.aliyun.openapiutil.Client.convert(request, analyzeVlRealtimeReq);
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
            analyzeVlRealtimeReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        AnalyzeVlRealtimeResponse analyzeVlRealtimeResp = this.analyzeVlRealtimeWithOptions(analyzeVlRealtimeReq, headers, runtime);
        return analyzeVlRealtimeResp;
    }

    /**
     * <b>summary</b> : 
     * <p>策略执行状态反馈</p>
     * 
     * @param request BatchSaveInstructionStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSaveInstructionStatusResponse
     */
    public BatchSaveInstructionStatusResponse batchSaveInstructionStatusWithOptions(BatchSaveInstructionStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pKey)) {
            body.put("pKey", request.pKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            body.put("statusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSaveInstructionStatus"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/batchSaveInstructionStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSaveInstructionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略执行状态反馈</p>
     * 
     * @param request BatchSaveInstructionStatusRequest
     * @return BatchSaveInstructionStatusResponse
     */
    public BatchSaveInstructionStatusResponse batchSaveInstructionStatus(BatchSaveInstructionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchSaveInstructionStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置空调站点运行计划</p>
     * 
     * @param request BatchUpdateSystemRunningPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateSystemRunningPlanResponse
     */
    public BatchUpdateSystemRunningPlanResponse batchUpdateSystemRunningPlanWithOptions(BatchUpdateSystemRunningPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("controlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("dateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earliestStartupTime)) {
            body.put("earliestStartupTime", request.earliestStartupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latestShutdownTime)) {
            body.put("latestShutdownTime", request.latestShutdownTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCarbonDioxide)) {
            body.put("maxCarbonDioxide", request.maxCarbonDioxide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTem)) {
            body.put("maxTem", request.maxTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTem)) {
            body.put("minTem", request.minTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seasonMode)) {
            body.put("seasonMode", request.seasonMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingEndTime)) {
            body.put("workingEndTime", request.workingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingStartTime)) {
            body.put("workingStartTime", request.workingStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateSystemRunningPlan"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/batchUpdateSystemRunningPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateSystemRunningPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置空调站点运行计划</p>
     * 
     * @param request BatchUpdateSystemRunningPlanRequest
     * @return BatchUpdateSystemRunningPlanResponse
     */
    public BatchUpdateSystemRunningPlanResponse batchUpdateSystemRunningPlan(BatchUpdateSystemRunningPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdateSystemRunningPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑禁用设备</p>
     * 
     * @param request EditProhibitedDevicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditProhibitedDevicesResponse
     */
    public EditProhibitedDevicesResponse editProhibitedDevicesWithOptions(EditProhibitedDevicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hvacDeviceConfigVOList)) {
            body.put("hvacDeviceConfigVOList", request.hvacDeviceConfigVOList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditProhibitedDevices"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/editProhibitedDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditProhibitedDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑禁用设备</p>
     * 
     * @param request EditProhibitedDevicesRequest
     * @return EditProhibitedDevicesResponse
     */
    public EditProhibitedDevicesResponse editProhibitedDevices(EditProhibitedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.editProhibitedDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑不利区设备</p>
     * 
     * @param request EditUnfavorableAreaDevicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditUnfavorableAreaDevicesResponse
     */
    public EditUnfavorableAreaDevicesResponse editUnfavorableAreaDevicesWithOptions(EditUnfavorableAreaDevicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hvacDeviceConfigVOList)) {
            body.put("hvacDeviceConfigVOList", request.hvacDeviceConfigVOList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditUnfavorableAreaDevices"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/editUnfavorableAreaDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditUnfavorableAreaDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑不利区设备</p>
     * 
     * @param request EditUnfavorableAreaDevicesRequest
     * @return EditUnfavorableAreaDevicesResponse
     */
    public EditUnfavorableAreaDevicesResponse editUnfavorableAreaDevices(EditUnfavorableAreaDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.editUnfavorableAreaDevicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\&quot;s status can be checked using the <code>IsCompleted</code> API. Following the generation of results, other result inquiry APIs can be accessed for display content.</p>
     * 
     * <b>summary</b> : 
     * <p>Generate a report of the specified carbon footprint.</p>
     * 
     * @param request GenerateResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResultWithOptions(GenerateResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/generate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\&quot;s status can be checked using the <code>IsCompleted</code> API. Following the generation of results, other result inquiry APIs can be accessed for display content.</p>
     * 
     * <b>summary</b> : 
     * <p>Generate a report of the specified carbon footprint.</p>
     * 
     * @param request GenerateResultRequest
     * @return GenerateResultResponse
     */
    public GenerateResultResponse generateResult(GenerateResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain electrical constitute analysis data.</p>
     * 
     * @param request GetAreaElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstituteWithOptions(GetAreaElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAreaElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/area"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAreaElecConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain electrical constitute analysis data.</p>
     * 
     * @param request GetAreaElecConstituteRequest
     * @return GetAreaElecConstituteResponse
     */
    public GetAreaElecConstituteResponse getAreaElecConstitute(GetAreaElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAreaElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get trends in carbon emissions.</p>
     * 
     * @param request GetCarbonEmissionTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrendWithOptions(GetCarbonEmissionTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trendType)) {
            body.put("trendType", request.trendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCarbonEmissionTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCarbonEmissionTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get trends in carbon emissions.</p>
     * 
     * @param request GetCarbonEmissionTrendRequest
     * @return GetCarbonEmissionTrendResponse
     */
    public GetCarbonEmissionTrendResponse getCarbonEmissionTrend(GetCarbonEmissionTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCarbonEmissionTrendWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>obtain data item detail list under the current enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to obtain the details category of a data item.</p>
     * 
     * @param request GetDataItemListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemListWithOptions(GetDataItemListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataItemList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataItemListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>obtain data item detail list under the current enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to obtain the details category of a data item.</p>
     * 
     * @param request GetDataItemListRequest
     * @return GetDataItemListResponse
     */
    public GetDataItemListResponse getDataItemList(GetDataItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataItemListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns the data quality evaluation results based on the user-provided product ID. It\&quot;s useful for understanding the data quality of the carbon emission factors for each inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the data quality evaluation results DQR and DQI.</p>
     * 
     * @param request GetDataQualityAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysisWithOptions(GetDataQualityAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataQualityAnalysis"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/data/quality/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataQualityAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns the data quality evaluation results based on the user-provided product ID. It\&quot;s useful for understanding the data quality of the carbon emission factors for each inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the data quality evaluation results DQR and DQI.</p>
     * 
     * @param request GetDataQualityAnalysisRequest
     * @return GetDataQualityAnalysisResponse
     */
    public GetDataQualityAnalysisResponse getDataQualityAnalysis(GetDataQualityAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataQualityAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a device at a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfoWithOptions(GetDeviceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("deviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ds)) {
            query.put("ds", request.ds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a device at a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceInfoRequest
     * @return GetDeviceInfoResponse
     */
    public GetDeviceInfoResponse getDeviceInfo(GetDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>Virtual meters at the site are not returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the devices of a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceListWithOptions(GetDeviceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            query.put("factoryId", request.factoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getDeviceList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>Virtual meters at the site are not returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the devices of a site that is activated by using an Alibaba Cloud account.</p>
     * 
     * @param request GetDeviceListRequest
     * @return GetDeviceListResponse
     */
    public GetDeviceListResponse getDeviceList(GetDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Information Extraction Result.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocExtractionTaskAdvance or SubmitDocExtractionTask.
     * The query results can reflect one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetDocExtractionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocExtractionResultResponse
     */
    public GetDocExtractionResultResponse getDocExtractionResultWithOptions(GetDocExtractionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocExtractionResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getDocExtractionResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocExtractionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Information Extraction Result.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocExtractionTaskAdvance or SubmitDocExtractionTask.
     * The query results can reflect one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetDocExtractionResultRequest
     * @return GetDocExtractionResultResponse
     */
    public GetDocExtractionResultResponse getDocExtractionResult(GetDocExtractionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocExtractionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Document Parsing Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocParsingTaskAdvance or SubmitDocParsingTask.
     * The query results can be one of three statuses: processing, successful, or failed.</p>
     * 
     * @param request GetDocParsingResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocParsingResultResponse
     */
    public GetDocParsingResultResponse getDocParsingResultWithOptions(GetDocParsingResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.returnFormat)) {
            body.put("returnFormat", request.returnFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocParsingResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getDocParsingResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocParsingResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Document Parsing Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitDocParsingTaskAdvance or SubmitDocParsingTask.
     * The query results can be one of three statuses: processing, successful, or failed.</p>
     * 
     * @param request GetDocParsingResultRequest
     * @return GetDocParsingResultResponse
     */
    public GetDocParsingResultResponse getDocParsingResult(GetDocParsingResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocParsingResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get document parsing/extraction result</p>
     * 
     * @param request GetDocumentAnalyzeResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResultWithOptions(GetDocumentAnalyzeResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("jobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentAnalyzeResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/getDocumentAnalyzeResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentAnalyzeResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get document parsing/extraction result</p>
     * 
     * @param request GetDocumentAnalyzeResultRequest
     * @return GetDocumentAnalyzeResultResponse
     */
    public GetDocumentAnalyzeResultResponse getDocumentAnalyzeResult(GetDocumentAnalyzeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentAnalyzeResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power composition analysis data.</p>
     * 
     * @param request GetElecConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstituteWithOptions(GetElecConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power composition analysis data.</p>
     * 
     * @param request GetElecConstituteRequest
     * @return GetElecConstituteResponse
     */
    public GetElecConstituteResponse getElecConstitute(GetElecConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power trend analysis data.</p>
     * 
     * @param request GetElecTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrendWithOptions(GetElecTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yearList)) {
            body.put("yearList", request.yearList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElecTrend"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/elec/trend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElecTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain power trend analysis data.</p>
     * 
     * @param request GetElecTrendRequest
     * @return GetElecTrendResponse
     */
    public GetElecTrendResponse getElecTrend(GetElecTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElecTrendWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the emission source composition.</p>
     * 
     * @param request GetEmissionSourceConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstituteWithOptions(GetEmissionSourceConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSourceConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSourceConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the emission source composition.</p>
     * 
     * @param request GetEmissionSourceConstituteRequest
     * @return GetEmissionSourceConstituteResponse
     */
    public GetEmissionSourceConstituteResponse getEmissionSourceConstitute(GetEmissionSourceConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSourceConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a summary of carbon emissions.</p>
     * 
     * @param request GetEmissionSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummaryWithOptions(GetEmissionSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmissionSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmissionSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get a summary of carbon emissions.</p>
     * 
     * @param request GetEmissionSummaryRequest
     * @return GetEmissionSummaryResponse
     */
    public GetEmissionSummaryResponse getEmissionSummary(GetEmissionSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmissionSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the result details of the environmental impact category.</p>
     * 
     * @param request GetEpdInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstituteWithOptions(GetEpdInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdInventoryConstituteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the result details of the environmental impact category.</p>
     * 
     * @param request GetEpdInventoryConstituteRequest
     * @return GetEpdInventoryConstituteResponse
     */
    public GetEpdInventoryConstituteResponse getEpdInventoryConstitute(GetEpdInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total amount of emissions for various environmental impacts.</p>
     * 
     * @param request GetEpdSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummaryWithOptions(GetEpdSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEpdSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/epd/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEpdSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total amount of emissions for various environmental impacts.</p>
     * 
     * @param request GetEpdSummaryRequest
     * @return GetEpdSummaryResponse
     */
    public GetEpdSummaryResponse getEpdSummary(GetEpdSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEpdSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\&quot;s detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of product carbon footprints.</p>
     * 
     * @param request GetFootprintListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintListWithOptions(GetFootprintListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("currentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFootprintList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/product/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFootprintListResponse());
    }

    /**
     * <b>description</b> :
     * <p>With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\&quot;s detailed information.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of product carbon footprints.</p>
     * 
     * @param request GetFootprintListRequest
     * @return GetFootprintListResponse
     */
    public GetFootprintListResponse getFootprintList(GetFootprintListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFootprintListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain gas composition analysis.</p>
     * 
     * @param request GetGasConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstituteWithOptions(GetGasConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGasConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/gas/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGasConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain gas composition analysis.</p>
     * 
     * @param request GetGasConstituteRequest
     * @return GetGasConstituteResponse
     */
    public GetGasConstituteResponse getGasConstitute(GetGasConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGasConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface returns a list of proactive carbon reduction information given product ID. It\&quot;s used to understand the carbon reduction efforts at various levels of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>obtain the active carbon reduction ranking list.</p>
     * 
     * @param request GetGwpBenchmarkListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkListWithOptions(GetGwpBenchmarkListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface returns a list of proactive carbon reduction information given product ID. It\&quot;s used to understand the carbon reduction efforts at various levels of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>obtain the active carbon reduction ranking list.</p>
     * 
     * @param request GetGwpBenchmarkListRequest
     * @return GetGwpBenchmarkListResponse
     */
    public GetGwpBenchmarkListResponse getGwpBenchmarkList(GetGwpBenchmarkListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is to obtain the total amount of active carbon reduction.</p>
     * 
     * @param request GetGwpBenchmarkSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummaryWithOptions(GetGwpBenchmarkSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpBenchmarkSummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/benchmark/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpBenchmarkSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is to obtain the total amount of active carbon reduction.</p>
     * 
     * @param request GetGwpBenchmarkSummaryRequest
     * @return GetGwpBenchmarkSummaryResponse
     */
    public GetGwpBenchmarkSummaryResponse getGwpBenchmarkSummary(GetGwpBenchmarkSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpBenchmarkSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * @param request GetGwpInventoryConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstituteWithOptions(GetGwpInventoryConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventoryConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/constitute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventoryConstituteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * <b>summary</b> : 
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * @param request GetGwpInventoryConstituteRequest
     * @return GetGwpInventoryConstituteResponse
     */
    public GetGwpInventoryConstituteResponse getGwpInventoryConstitute(GetGwpInventoryConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventoryConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.</p>
     * 
     * @param request GetGwpInventorySummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummaryWithOptions(GetGwpInventorySummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGwpInventorySummary"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/gwp/inventory/summary"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGwpInventorySummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the total carbon footprint of a product and the top four types of carbon footprint contribution.</p>
     * 
     * @param request GetGwpInventorySummaryRequest
     * @return GetGwpInventorySummaryResponse
     */
    public GetGwpInventorySummaryResponse getGwpInventorySummary(GetGwpInventorySummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGwpInventorySummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\&quot;s used to understand various environmental impact emission scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).</p>
     * 
     * @param request GetInventoryListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryListWithOptions(GetInventoryListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emissionType)) {
            body.put("emissionType", request.emissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodType)) {
            body.put("methodType", request.methodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInventoryList"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/inventory/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInventoryListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\&quot;s used to understand various environmental impact emission scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Get the list of emissions in descending order under the specified environmental impact (methodType), specified aggregate level (group), and specified calculation mode (emissionType).</p>
     * 
     * @param request GetInventoryListRequest
     * @return GetInventoryListResponse
     */
    public GetInventoryListResponse getInventoryList(GetInventoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInventoryListWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.</p>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactoryWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgAndFactory"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/external/getOrgAndFactory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgAndFactoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.</p>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the organizations and sites that are activated by using an Alibaba Cloud account. You cannot call this operation to query the organizations or sites that have not been activated in the console.</p>
     * @return GetOrgAndFactoryResponse
     */
    public GetOrgAndFactoryResponse getOrgAndFactory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgAndFactoryWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain carbon inventory organization analysis data.</p>
     * 
     * @param request GetOrgConstituteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstituteWithOptions(GetOrgConstituteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            body.put("moduleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleType)) {
            body.put("moduleType", request.moduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrgConstitute"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/analysis/org"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrgConstituteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain carbon inventory organization analysis data.</p>
     * 
     * @param request GetOrgConstituteRequest
     * @return GetOrgConstituteResponse
     */
    public GetOrgConstituteResponse getOrgConstitute(GetOrgConstituteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrgConstituteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the oss address of the Product Carbon footprint Report.</p>
     * 
     * @param request GetPcrInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfoWithOptions(GetPcrInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPcrInfo"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/pcr/detail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPcrInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the oss address of the Product Carbon footprint Report.</p>
     * 
     * @param request GetPcrInfoRequest
     * @return GetPcrInfoResponse
     */
    public GetPcrInfoResponse getPcrInfo(GetPcrInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPcrInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API returns carbon reduction proposals based on the product ID. It\&quot;s useful for understanding optimization tips to reduce the carbon emissions associated with a product.</p>
     * 
     * <b>summary</b> : 
     * <p>Get carbon reduction recommendations.</p>
     * 
     * @param request GetReductionProposalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposalWithOptions(GetReductionProposalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataQualityEvaluationType)) {
            body.put("dataQualityEvaluationType", request.dataQualityEvaluationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReductionProposal"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/reduction/proposal"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReductionProposalResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API returns carbon reduction proposals based on the product ID. It\&quot;s useful for understanding optimization tips to reduce the carbon emissions associated with a product.</p>
     * 
     * <b>summary</b> : 
     * <p>Get carbon reduction recommendations.</p>
     * 
     * @param request GetReductionProposalRequest
     * @return GetReductionProposalResponse
     */
    public GetReductionProposalResponse getReductionProposal(GetReductionProposalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReductionProposalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Qwen-VL Model Information Extraction Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitVLExtractionTask or SubmitVLExtractionTaskAdvance.
     * The query results can be in one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetVLExtractionResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVLExtractionResultResponse
     */
    public GetVLExtractionResultResponse getVLExtractionResultWithOptions(GetVLExtractionResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVLExtractionResult"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/getVLExtractionResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVLExtractionResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For Querying Qwen-VL Model Information Extraction Results.
     * The input parameter taskId is obtained from the taskId returned by the interfaces SubmitVLExtractionTask or SubmitVLExtractionTaskAdvance.
     * The query results can be in one of three statuses: processing, successfully completed, or failed.</p>
     * 
     * @param request GetVLExtractionResultRequest
     * @return GetVLExtractionResultResponse
     */
    public GetVLExtractionResultResponse getVLExtractionResult(GetVLExtractionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVLExtractionResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Check if the result generation is complete.</p>
     * 
     * @param request IsCompletedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompletedWithOptions(IsCompletedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsCompleted"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/footprint/result/completed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsCompletedResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Check if the result generation is complete.</p>
     * 
     * @param request IsCompletedRequest
     * @return IsCompletedResponse
     */
    public IsCompletedResponse isCompleted(IsCompletedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isCompletedWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to push device measuring point data, such as power meter voltage and other data.</p>
     * 
     * @param request PushDeviceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceDataWithOptions(PushDeviceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("deviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devices)) {
            body.put("devices", request.devices);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDeviceData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/data/increment/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDeviceDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to push device measuring point data, such as power meter voltage and other data.</p>
     * 
     * @param request PushDeviceDataRequest
     * @return PushDeviceDataResponse
     */
    public PushDeviceDataResponse pushDeviceData(PushDeviceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDeviceDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This interface is used for individual data item data.</li>
     * <li>Data items can link data to services such as carbon footprints and carbon inventories.</li>
     * <li>Depending on the platform configuration, active data on a yearly and monthly basis is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to push data items.</p>
     * 
     * @param request PushItemDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemDataWithOptions(PushItemDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushItemData"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushItemDataResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This interface is used for individual data item data.</li>
     * <li>Data items can link data to services such as carbon footprints and carbon inventories.</li>
     * <li>Depending on the platform configuration, active data on a yearly and monthly basis is supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This interface is used to push data items.</p>
     * 
     * @param request PushItemDataRequest
     * @return PushItemDataResponse
     */
    public PushItemDataResponse pushItemData(PushItemDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushItemDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After uploading the data items, you need to call this interface to recalculate the carbon inventory data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recalculate carbon emissions.</p>
     * 
     * @param request RecalculateCarbonEmissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmissionWithOptions(RecalculateCarbonEmissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecalculateCarbonEmission"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/emission/data/item/recalculate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecalculateCarbonEmissionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After uploading the data items, you need to call this interface to recalculate the carbon inventory data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recalculate carbon emissions.</p>
     * 
     * @param request RecalculateCarbonEmissionRequest
     * @return RecalculateCarbonEmissionResponse
     */
    public RecalculateCarbonEmissionResponse recalculateCarbonEmission(RecalculateCarbonEmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recalculateCarbonEmissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Online Document Q\&amp;A</p>
     * 
     * @param request SendDocumentAskQuestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestionWithOptions(SendDocumentAskQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendDocumentAskQuestion"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/sendDocumentAskQuestion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendDocumentAskQuestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Online Document Q\&amp;A</p>
     * 
     * @param request SendDocumentAskQuestionRequest
     * @return SendDocumentAskQuestionResponse
     */
    public SendDocumentAskQuestionResponse sendDocumentAskQuestion(SendDocumentAskQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendDocumentAskQuestionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置运行计划</p>
     * 
     * @param request SetRunningPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRunningPlanResponse
     */
    public SetRunningPlanResponse setRunningPlanWithOptions(SetRunningPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("controlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("dateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earliestStartupTime)) {
            body.put("earliestStartupTime", request.earliestStartupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factoryId)) {
            body.put("factoryId", request.factoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latestShutdownTime)) {
            body.put("latestShutdownTime", request.latestShutdownTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCarbonDioxide)) {
            body.put("maxCarbonDioxide", request.maxCarbonDioxide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTem)) {
            body.put("maxTem", request.maxTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTem)) {
            body.put("minTem", request.minTem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pKey)) {
            body.put("pKey", request.pKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seasonMode)) {
            body.put("seasonMode", request.seasonMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsTime)) {
            body.put("statisticsTime", request.statisticsTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemId)) {
            body.put("systemId", request.systemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingEndTime)) {
            body.put("workingEndTime", request.workingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingStartTime)) {
            body.put("workingStartTime", request.workingStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRunningPlan"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/carbon/hvac/setRunningPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRunningPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置运行计划</p>
     * 
     * @param request SetRunningPlanRequest
     * @return SetRunningPlanResponse
     */
    public SetRunningPlanResponse setRunningPlan(SetRunningPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setRunningPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using user-defined Key-Value or prompt templates. A taskId is returned upon successful execution for retrieving extraction results via GetDocExtractionResult.
     * Supports:
     * URL Upload: SubmitDocExtractionTask
     * Local File Upload: SubmitDocExtractionTask</p>
     * 
     * @param request SubmitDocExtractionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocExtractionTaskResponse
     */
    public SubmitDocExtractionTaskResponse submitDocExtractionTaskWithOptions(SubmitDocExtractionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extractType)) {
            query.put("extractType", request.extractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocExtractionTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitDocExtractionTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocExtractionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using user-defined Key-Value or prompt templates. A taskId is returned upon successful execution for retrieving extraction results via GetDocExtractionResult.
     * Supports:
     * URL Upload: SubmitDocExtractionTask
     * Local File Upload: SubmitDocExtractionTask</p>
     * 
     * @param request SubmitDocExtractionTaskRequest
     * @return SubmitDocExtractionTaskResponse
     */
    public SubmitDocExtractionTaskResponse submitDocExtractionTask(SubmitDocExtractionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocExtractionTaskWithOptions(request, headers, runtime);
    }

    public SubmitDocExtractionTaskResponse submitDocExtractionTaskAdvance(SubmitDocExtractionTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "energyExpertExternal"),
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
        SubmitDocExtractionTaskRequest submitDocExtractionTaskReq = new SubmitDocExtractionTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocExtractionTaskReq);
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
            submitDocExtractionTaskReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocExtractionTaskResponse submitDocExtractionTaskResp = this.submitDocExtractionTaskWithOptions(submitDocExtractionTaskReq, headers, runtime);
        return submitDocExtractionTaskResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Parses text, tables, images, and more from documents. After execution, a taskId is returned for retrieving document parsing results via GetDocParsingResult.
     * Supports:
     * URL Upload: SubmitDocParsingTask
     * Local File Upload: SubmitDocParsingTaskAdvance</p>
     * 
     * @param request SubmitDocParsingTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocParsingTaskResponse
     */
    public SubmitDocParsingTaskResponse submitDocParsingTaskWithOptions(SubmitDocParsingTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAnalyzeImg)) {
            query.put("needAnalyzeImg", request.needAnalyzeImg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocParsingTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitDocParsingTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocParsingTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Parses text, tables, images, and more from documents. After execution, a taskId is returned for retrieving document parsing results via GetDocParsingResult.
     * Supports:
     * URL Upload: SubmitDocParsingTask
     * Local File Upload: SubmitDocParsingTaskAdvance</p>
     * 
     * @param request SubmitDocParsingTaskRequest
     * @return SubmitDocParsingTaskResponse
     */
    public SubmitDocParsingTaskResponse submitDocParsingTask(SubmitDocParsingTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocParsingTaskWithOptions(request, headers, runtime);
    }

    public SubmitDocParsingTaskResponse submitDocParsingTaskAdvance(SubmitDocParsingTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "energyExpertExternal"),
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
        SubmitDocParsingTaskRequest submitDocParsingTaskReq = new SubmitDocParsingTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocParsingTaskReq);
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
            submitDocParsingTaskReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocParsingTaskResponse submitDocParsingTaskResp = this.submitDocParsingTaskWithOptions(submitDocParsingTaskReq, headers, runtime);
        return submitDocParsingTaskResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Get document extraction result</p>
     * 
     * @param request SubmitDocumentAnalyzeJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobWithOptions(SubmitDocumentAnalyzeJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisType)) {
            query.put("analysisType", request.analysisType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocumentAnalyzeJob"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/aidoc/document/submitDocumentAnalyzeJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocumentAnalyzeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get document extraction result</p>
     * 
     * @param request SubmitDocumentAnalyzeJobRequest
     * @return SubmitDocumentAnalyzeJobResponse
     */
    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJob(SubmitDocumentAnalyzeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocumentAnalyzeJobWithOptions(request, headers, runtime);
    }

    public SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobAdvance(SubmitDocumentAnalyzeJobAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "energyExpertExternal"),
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
        SubmitDocumentAnalyzeJobRequest submitDocumentAnalyzeJobReq = new SubmitDocumentAnalyzeJobRequest();
        com.aliyun.openapiutil.Client.convert(request, submitDocumentAnalyzeJobReq);
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
            submitDocumentAnalyzeJobReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitDocumentAnalyzeJobResponse submitDocumentAnalyzeJobResp = this.submitDocumentAnalyzeJobWithOptions(submitDocumentAnalyzeJobReq, headers, runtime);
        return submitDocumentAnalyzeJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using KV templates or prompts with the Qwen-VL model, ideal for image extraction. 
     * Supports:
     * URL Upload: SubmitVLExtractionTask.
     * Local File Upload: SubmitVLExtractionTaskAdvance</p>
     * 
     * @param request SubmitVLExtractionTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVLExtractionTaskResponse
     */
    public SubmitVLExtractionTaskResponse submitVLExtractionTaskWithOptions(SubmitVLExtractionTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVLExtractionTask"),
            new TeaPair("version", "2022-09-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/aidoc/document/submitVLExtractionTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVLExtractionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Extracts key information from documents using KV templates or prompts with the Qwen-VL model, ideal for image extraction. 
     * Supports:
     * URL Upload: SubmitVLExtractionTask.
     * Local File Upload: SubmitVLExtractionTaskAdvance</p>
     * 
     * @param request SubmitVLExtractionTaskRequest
     * @return SubmitVLExtractionTaskResponse
     */
    public SubmitVLExtractionTaskResponse submitVLExtractionTask(SubmitVLExtractionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitVLExtractionTaskWithOptions(request, headers, runtime);
    }

    public SubmitVLExtractionTaskResponse submitVLExtractionTaskAdvance(SubmitVLExtractionTaskAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "energyExpertExternal"),
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
        SubmitVLExtractionTaskRequest submitVLExtractionTaskReq = new SubmitVLExtractionTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, submitVLExtractionTaskReq);
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
            submitVLExtractionTaskReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SubmitVLExtractionTaskResponse submitVLExtractionTaskResp = this.submitVLExtractionTaskWithOptions(submitVLExtractionTaskReq, headers, runtime);
        return submitVLExtractionTaskResp;
    }
}
