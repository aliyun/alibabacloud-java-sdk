// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701;

import com.aliyun.tea.*;
import com.aliyun.cloudcallcenter20200701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudcallcenter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>abort campaign</p>
     * 
     * @param request AbortCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortCampaignResponse
     */
    public AbortCampaignResponse abortCampaignWithOptions(AbortCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>abort campaign</p>
     * 
     * @param request AbortCampaignRequest
     * @return AbortCampaignResponse
     */
    public AbortCampaignResponse abortCampaign(AbortCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>abort cases</p>
     * 
     * @param tmpReq AbortCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortCasesResponse
     */
    public AbortCasesResponse abortCasesWithOptions(AbortCasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AbortCasesShrinkRequest request = new AbortCasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumberList)) {
            request.phoneNumberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumberList, "PhoneNumberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberListShrink)) {
            query.put("PhoneNumberList", request.phoneNumberListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortCases"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>abort cases</p>
     * 
     * @param request AbortCasesRequest
     * @return AbortCasesResponse
     */
    public AbortCasesResponse abortCases(AbortCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abortCasesWithOptions(request, runtime);
    }

    /**
     * @param request CheckDemoInstanceExistsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDemoInstanceExistsResponse
     */
    public CheckDemoInstanceExistsResponse checkDemoInstanceExistsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDemoInstanceExists"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDemoInstanceExistsResponse());
    }

    /**
     * @return CheckDemoInstanceExistsResponse
     */
    public CheckDemoInstanceExistsResponse checkDemoInstanceExists() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDemoInstanceExistsWithOptions(runtime);
    }

    /**
     * @param request CheckMQRoleAssumptionAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMQRoleAssumptionAuthorityResponse
     */
    public CheckMQRoleAssumptionAuthorityResponse checkMQRoleAssumptionAuthorityWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMQRoleAssumptionAuthority"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMQRoleAssumptionAuthorityResponse());
    }

    /**
     * @return CheckMQRoleAssumptionAuthorityResponse
     */
    public CheckMQRoleAssumptionAuthorityResponse checkMQRoleAssumptionAuthority() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMQRoleAssumptionAuthorityWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>create campaign</p>
     * 
     * @param tmpReq CreateCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCampaignResponse
     */
    public CreateCampaignResponse createCampaignWithOptions(CreateCampaignRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCampaignShrinkRequest request = new CreateCampaignShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseList)) {
            request.caseListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseList, "CaseList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.numberList)) {
            request.numberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.numberList, "NumberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callableTime)) {
            query.put("CallableTime", request.callableTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseFileKey)) {
            query.put("CaseFileKey", request.caseFileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseListShrink)) {
            query.put("CaseList", request.caseListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactFlowId)) {
            query.put("ContactFlowId", request.contactFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executingUntilTimeout)) {
            query.put("ExecutingUntilTimeout", request.executingUntilTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashSmsParameters)) {
            query.put("FlashSmsParameters", request.flashSmsParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instGroupId)) {
            query.put("InstGroupId", request.instGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttemptCount)) {
            query.put("MaxAttemptCount", request.maxAttemptCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAttemptInterval)) {
            query.put("MinAttemptInterval", request.minAttemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberListShrink)) {
            query.put("NumberList", request.numberListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueId)) {
            query.put("QueueId", request.queueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulation)) {
            query.put("Simulation", request.simulation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulationParameters)) {
            query.put("SimulationParameters", request.simulationParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyParameters)) {
            query.put("StrategyParameters", request.strategyParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            query.put("StrategyType", request.strategyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>create campaign</p>
     * 
     * @param request CreateCampaignRequest
     * @return CreateCampaignResponse
     */
    public CreateCampaignResponse createCampaign(CreateCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCampaignWithOptions(request, runtime);
    }

    /**
     * @param request CreateChatMediaUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatMediaUrlResponse
     */
    public CreateChatMediaUrlResponse createChatMediaUrlWithOptions(CreateChatMediaUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mimeType)) {
            body.put("MimeType", request.mimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatMediaUrl"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatMediaUrlResponse());
    }

    /**
     * @param request CreateChatMediaUrlRequest
     * @return CreateChatMediaUrlResponse
     */
    public CreateChatMediaUrlResponse createChatMediaUrl(CreateChatMediaUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChatMediaUrlWithOptions(request, runtime);
    }

    /**
     * @param request CreateCorpNumberGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCorpNumberGroupResponse
     */
    public CreateCorpNumberGroupResponse createCorpNumberGroupWithOptions(CreateCorpNumberGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCorpNumberGroup"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCorpNumberGroupResponse());
    }

    /**
     * @param request CreateCorpNumberGroupRequest
     * @return CreateCorpNumberGroupResponse
     */
    public CreateCorpNumberGroupResponse createCorpNumberGroup(CreateCorpNumberGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCorpNumberGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateDemoInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDemoInstanceResponse
     */
    public CreateDemoInstanceResponse createDemoInstanceWithOptions(CreateDemoInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outboundCallWhitelist)) {
            query.put("OutboundCallWhitelist", request.outboundCallWhitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDemoInstance"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDemoInstanceResponse());
    }

    /**
     * @param request CreateDemoInstanceRequest
     * @return CreateDemoInstanceResponse
     */
    public CreateDemoInstanceResponse createDemoInstance(CreateDemoInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDemoInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAccessChannelOfStaging</p>
     * 
     * @param request GetAccessChannelOfStagingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessChannelOfStagingResponse
     */
    public GetAccessChannelOfStagingResponse getAccessChannelOfStagingWithOptions(GetAccessChannelOfStagingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessChannelOfStaging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessChannelOfStagingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAccessChannelOfStaging</p>
     * 
     * @param request GetAccessChannelOfStagingRequest
     * @return GetAccessChannelOfStagingResponse
     */
    public GetAccessChannelOfStagingResponse getAccessChannelOfStaging(GetAccessChannelOfStagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessChannelOfStagingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动</p>
     * 
     * @param request GetCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCampaignResponse
     */
    public GetCampaignResponse getCampaignWithOptions(GetCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动</p>
     * 
     * @param request GetCampaignRequest
     * @return GetCampaignResponse
     */
    public GetCampaignResponse getCampaign(GetCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetDocument</p>
     * 
     * @param request GetDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentResponse
     */
    public GetDocumentResponse getDocumentWithOptions(GetDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            body.put("DocumentId", request.documentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocument"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetDocument</p>
     * 
     * @param request GetDocumentRequest
     * @return GetDocumentResponse
     */
    public GetDocumentResponse getDocument(GetDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动历史报表</p>
     * 
     * @param request GetHistoricalCampaignReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistoricalCampaignReportResponse
     */
    public GetHistoricalCampaignReportResponse getHistoricalCampaignReportWithOptions(GetHistoricalCampaignReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistoricalCampaignReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHistoricalCampaignReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动历史报表</p>
     * 
     * @param request GetHistoricalCampaignReportRequest
     * @return GetHistoricalCampaignReportResponse
     */
    public GetHistoricalCampaignReportResponse getHistoricalCampaignReport(GetHistoricalCampaignReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHistoricalCampaignReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据aliyunuid获取实例</p>
     * 
     * @param request GetInstanceIdsByAliyunUidV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceIdsByAliyunUidV2Response
     */
    public GetInstanceIdsByAliyunUidV2Response getInstanceIdsByAliyunUidV2WithOptions(GetInstanceIdsByAliyunUidV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceIdsByAliyunUidV2"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceIdsByAliyunUidV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>根据aliyunuid获取实例</p>
     * 
     * @param request GetInstanceIdsByAliyunUidV2Request
     * @return GetInstanceIdsByAliyunUidV2Response
     */
    public GetInstanceIdsByAliyunUidV2Response getInstanceIdsByAliyunUidV2(GetInstanceIdsByAliyunUidV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceIdsByAliyunUidV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼实时状态</p>
     * 
     * @param request GetRealtimeCampaignStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeCampaignStatsResponse
     */
    public GetRealtimeCampaignStatsResponse getRealtimeCampaignStatsWithOptions(GetRealtimeCampaignStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeCampaignStats"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeCampaignStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼实时状态</p>
     * 
     * @param request GetRealtimeCampaignStatsRequest
     * @return GetRealtimeCampaignStatsResponse
     */
    public GetRealtimeCampaignStatsResponse getRealtimeCampaignStats(GetRealtimeCampaignStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeCampaignStatsWithOptions(request, runtime);
    }

    /**
     * @param request ImportAdminsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportAdminsResponse
     */
    public ImportAdminsResponse importAdminsWithOptions(ImportAdminsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramIdList)) {
            query.put("RamIdList", request.ramIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportAdmins"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportAdminsResponse());
    }

    /**
     * @param request ImportAdminsRequest
     * @return ImportAdminsResponse
     */
    public ImportAdminsResponse importAdmins(ImportAdminsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAdminsWithOptions(request, runtime);
    }

    /**
     * @param request IssueSoftphoneCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IssueSoftphoneCommandResponse
     */
    public IssueSoftphoneCommandResponse issueSoftphoneCommandWithOptions(IssueSoftphoneCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IssueSoftphoneCommand"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IssueSoftphoneCommandResponse());
    }

    /**
     * @param request IssueSoftphoneCommandRequest
     * @return IssueSoftphoneCommandResponse
     */
    public IssueSoftphoneCommandResponse issueSoftphoneCommand(IssueSoftphoneCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.issueSoftphoneCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼呼叫记录</p>
     * 
     * @param request ListAttemptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAttemptsResponse
     */
    public ListAttemptsResponse listAttemptsWithOptions(ListAttemptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAttempts"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAttemptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼呼叫记录</p>
     * 
     * @param request ListAttemptsRequest
     * @return ListAttemptsResponse
     */
    public ListAttemptsResponse listAttempts(ListAttemptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAttemptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动趋势报表</p>
     * 
     * @param request ListCampaignTrendingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCampaignTrendingReportResponse
     */
    public ListCampaignTrendingReportResponse listCampaignTrendingReportWithOptions(ListCampaignTrendingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCampaignTrendingReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCampaignTrendingReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取预测式外呼活动趋势报表</p>
     * 
     * @param request ListCampaignTrendingReportRequest
     * @return ListCampaignTrendingReportResponse
     */
    public ListCampaignTrendingReportResponse listCampaignTrendingReport(ListCampaignTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCampaignTrendingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询预测式外呼列表</p>
     * 
     * @param request ListCampaignsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCampaignsResponse
     */
    public ListCampaignsResponse listCampaignsWithOptions(ListCampaignsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualStartTimeFrom)) {
            query.put("ActualStartTimeFrom", request.actualStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actualStartTimeTo)) {
            query.put("ActualStartTimeTo", request.actualStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planedStartTimeFrom)) {
            query.put("PlanedStartTimeFrom", request.planedStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planedStartTimeTo)) {
            query.put("PlanedStartTimeTo", request.planedStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueId)) {
            query.put("QueueId", request.queueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCampaigns"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCampaignsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询预测式外呼列表</p>
     * 
     * @param request ListCampaignsRequest
     * @return ListCampaignsResponse
     */
    public ListCampaignsResponse listCampaigns(ListCampaignsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCampaignsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list case</p>
     * 
     * @param request ListCasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCasesResponse
     */
    public ListCasesResponse listCasesWithOptions(ListCasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCases"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list case</p>
     * 
     * @param request ListCasesRequest
     * @return ListCasesResponse
     */
    public ListCasesResponse listCases(ListCasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCasesWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ListFlashSmsSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsSettingsResponse
     */
    public ListFlashSmsSettingsResponse listFlashSmsSettingsWithOptions(ListFlashSmsSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlashSmsSettingsShrinkRequest request = new ListFlashSmsSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skillGroupIdList)) {
            request.skillGroupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skillGroupIdList, "SkillGroupIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdListShrink)) {
            query.put("SkillGroupIdList", request.skillGroupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsSettings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsSettingsResponse());
    }

    /**
     * @param request ListFlashSmsSettingsRequest
     * @return ListFlashSmsSettingsResponse
     */
    public ListFlashSmsSettingsResponse listFlashSmsSettings(ListFlashSmsSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询坐席技能组报表</p>
     * 
     * @param request ListHistoricalAgentSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    public ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReportWithOptions(ListHistoricalAgentSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            query.put("SkillGroupIdList", request.skillGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIdList)) {
            body.put("AgentIdList", request.agentIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalAgentSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalAgentSkillGroupReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询坐席技能组报表</p>
     * 
     * @param request ListHistoricalAgentSkillGroupReportRequest
     * @return ListHistoricalAgentSkillGroupReportResponse
     */
    public ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReport(ListHistoricalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询坐席技能组报表</p>
     * 
     * @param request ListIntervalAgentSkillGroupReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    public ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReportWithOptions(ListIntervalAgentSkillGroupReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDefaultIfEmpty)) {
            query.put("ShowDefaultIfEmpty", request.showDefaultIfEmpty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntervalAgentSkillGroupReport"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntervalAgentSkillGroupReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询坐席技能组报表</p>
     * 
     * @param request ListIntervalAgentSkillGroupReportRequest
     * @return ListIntervalAgentSkillGroupReportResponse
     */
    public ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReport(ListIntervalAgentSkillGroupReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntervalAgentSkillGroupReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>录音查询</p>
     * 
     * @param request ListMonoRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordingsWithOptions(ListMonoRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonoRecordings"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonoRecordingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>录音查询</p>
     * 
     * @param request ListMonoRecordingsRequest
     * @return ListMonoRecordingsResponse
     */
    public ListMonoRecordingsResponse listMonoRecordings(ListMonoRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMonoRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停预测式外呼</p>
     * 
     * @param request PauseCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseCampaignResponse
     */
    public PauseCampaignResponse pauseCampaignWithOptions(PauseCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停预测式外呼</p>
     * 
     * @param request PauseCampaignRequest
     * @return PauseCampaignResponse
     */
    public PauseCampaignResponse pauseCampaign(PauseCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ProcessAliMeCallbackOfStaging</p>
     * 
     * @param request ProcessAliMeCallbackOfStagingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    public ProcessAliMeCallbackOfStagingResponse processAliMeCallbackOfStagingWithOptions(ProcessAliMeCallbackOfStagingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessAliMeCallbackOfStaging"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessAliMeCallbackOfStagingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ProcessAliMeCallbackOfStaging</p>
     * 
     * @param request ProcessAliMeCallbackOfStagingRequest
     * @return ProcessAliMeCallbackOfStagingResponse
     */
    public ProcessAliMeCallbackOfStagingResponse processAliMeCallbackOfStaging(ProcessAliMeCallbackOfStagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processAliMeCallbackOfStagingWithOptions(request, runtime);
    }

    /**
     * @param request ProcessCustomIMCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessCustomIMCallbackResponse
     */
    public ProcessCustomIMCallbackResponse processCustomIMCallbackWithOptions(ProcessCustomIMCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            body.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageContent)) {
            body.put("MessageContent", request.messageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderAvatarMediaId)) {
            body.put("SenderAvatarMediaId", request.senderAvatarMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            body.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderName)) {
            body.put("SenderName", request.senderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessCustomIMCallback"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessCustomIMCallbackResponse());
    }

    /**
     * @param request ProcessCustomIMCallbackRequest
     * @return ProcessCustomIMCallbackResponse
     */
    public ProcessCustomIMCallbackResponse processCustomIMCallback(ProcessCustomIMCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processCustomIMCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ccc migration</p>
     * 
     * @param request ReplaceMigrationAvailableNumbersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceMigrationAvailableNumbersResponse
     */
    public ReplaceMigrationAvailableNumbersResponse replaceMigrationAvailableNumbersWithOptions(ReplaceMigrationAvailableNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            query.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorUid)) {
            query.put("OperatorUid", request.operatorUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.v1Numbers)) {
            query.put("V1Numbers", request.v1Numbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.v2Numbers)) {
            query.put("V2Numbers", request.v2Numbers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceMigrationAvailableNumbers"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceMigrationAvailableNumbersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ccc migration</p>
     * 
     * @param request ReplaceMigrationAvailableNumbersRequest
     * @return ReplaceMigrationAvailableNumbersResponse
     */
    public ReplaceMigrationAvailableNumbersResponse replaceMigrationAvailableNumbers(ReplaceMigrationAvailableNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceMigrationAvailableNumbersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>resume campaign</p>
     * 
     * @param request ResumeCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeCampaignResponse
     */
    public ResumeCampaignResponse resumeCampaignWithOptions(ResumeCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>resume campaign</p>
     * 
     * @param request ResumeCampaignRequest
     * @return ResumeCampaignResponse
     */
    public ResumeCampaignResponse resumeCampaign(ResumeCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeCampaignWithOptions(request, runtime);
    }

    /**
     * @param request SaveRTCStatsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveRTCStatsV2Response
     */
    public SaveRTCStatsV2Response saveRTCStatsV2WithOptions(SaveRTCStatsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generalInfo)) {
            query.put("GeneralInfo", request.generalInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.googAddress)) {
            query.put("GoogAddress", request.googAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverReport)) {
            query.put("ReceiverReport", request.receiverReport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderReport)) {
            query.put("SenderReport", request.senderReport);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRTCStatsV2"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveRTCStatsV2Response());
    }

    /**
     * @param request SaveRTCStatsV2Request
     * @return SaveRTCStatsV2Response
     */
    public SaveRTCStatsV2Response saveRTCStatsV2(SaveRTCStatsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRTCStatsV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request SaveTerminalLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveTerminalLogResponse
     */
    public SaveTerminalLogResponse saveTerminalLogWithOptions(SaveTerminalLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueRequestId)) {
            query.put("UniqueRequestId", request.uniqueRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTerminalLog"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTerminalLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request SaveTerminalLogRequest
     * @return SaveTerminalLogResponse
     */
    public SaveTerminalLogResponse saveTerminalLog(SaveTerminalLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTerminalLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request SaveWebRtcInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveWebRtcInfoResponse
     */
    public SaveWebRtcInfoResponse saveWebRtcInfoWithOptions(SaveWebRtcInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWebRtcInfo"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveWebRtcInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <ul>
     * <li></li>
     * </ul>
     * 
     * @param request SaveWebRtcInfoRequest
     * @return SaveWebRtcInfoResponse
     */
    public SaveWebRtcInfoResponse saveWebRtcInfo(SaveWebRtcInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWebRtcInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息</p>
     * 
     * @param request SendNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendNotificationResponse
     */
    public SendNotificationResponse sendNotificationWithOptions(SendNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageBody)) {
            query.put("MessageBody", request.messageBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTarget)) {
            query.put("NotificationTarget", request.notificationTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationType)) {
            query.put("NotificationType", request.notificationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingKey)) {
            query.put("ShardingKey", request.shardingKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendNotification"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送消息</p>
     * 
     * @param request SendNotificationRequest
     * @return SendNotificationResponse
     */
    public SendNotificationResponse sendNotification(SendNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendNotificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>submit campaign</p>
     * 
     * @param request SubmitCampaignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCampaignResponse
     */
    public SubmitCampaignResponse submitCampaignWithOptions(SubmitCampaignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.campaignId)) {
            query.put("CampaignId", request.campaignId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCampaign"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCampaignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>submit campaign</p>
     * 
     * @param request SubmitCampaignRequest
     * @return SubmitCampaignResponse
     */
    public SubmitCampaignResponse submitCampaign(SubmitCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCampaignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册设备</p>
     * 
     * @param request UnregisterDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnregisterDeviceResponse
     */
    public UnregisterDeviceResponse unregisterDeviceWithOptions(UnregisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterDevice"),
            new TeaPair("version", "2020-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除注册设备</p>
     * 
     * @param request UnregisterDeviceRequest
     * @return UnregisterDeviceResponse
     */
    public UnregisterDeviceResponse unregisterDevice(UnregisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unregisterDeviceWithOptions(request, runtime);
    }
}
