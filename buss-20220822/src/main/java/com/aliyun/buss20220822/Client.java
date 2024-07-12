// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822;

import com.aliyun.tea.*;
import com.aliyun.buss20220822.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("buss", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>处罚请求异步接口回调</p>
     * 
     * @param tmpReq BusinessResultServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BusinessResultServiceResponse
     */
    public BusinessResultServiceResponse businessResultServiceWithOptions(BusinessResultServiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BusinessResultServiceShrinkRequest request = new BusinessResultServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.result)) {
            request.resultShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.result, "Result", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BusinessResultService"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BusinessResultServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>处罚请求异步接口回调</p>
     * 
     * @param request BusinessResultServiceRequest
     * @return BusinessResultServiceResponse
     */
    public BusinessResultServiceResponse businessResultService(BusinessResultServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.businessResultServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>协查中心查询任务接口</p>
     * 
     * @param request CreateUserInvestigationInfoQueryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserInvestigationInfoQueryTaskResponse
     */
    public CreateUserInvestigationInfoQueryTaskResponse createUserInvestigationInfoQueryTaskWithOptions(CreateUserInvestigationInfoQueryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserInvestigationInfoQueryTask"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserInvestigationInfoQueryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>协查中心查询任务接口</p>
     * 
     * @param request CreateUserInvestigationInfoQueryTaskRequest
     * @return CreateUserInvestigationInfoQueryTaskResponse
     */
    public CreateUserInvestigationInfoQueryTaskResponse createUserInvestigationInfoQueryTask(CreateUserInvestigationInfoQueryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserInvestigationInfoQueryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>反查资源</p>
     * 
     * @param tmpReq FindInstanceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindInstanceInfoResponse
     */
    public FindInstanceInfoResponse findInstanceInfoWithOptions(FindInstanceInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FindInstanceInfoShrinkRequest request = new FindInstanceInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extras)) {
            request.extrasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extras, "extras", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindInstanceInfo"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindInstanceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>反查资源</p>
     * 
     * @param request FindInstanceInfoRequest
     * @return FindInstanceInfoResponse
     */
    public FindInstanceInfoResponse findInstanceInfo(FindInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findInstanceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据用户id查询对应产品下全部可用资产信息接口</p>
     * 
     * @param request FindUserAvailbleResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindUserAvailbleResourcesResponse
     */
    public FindUserAvailbleResourcesResponse findUserAvailbleResourcesWithOptions(FindUserAvailbleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindUserAvailbleResources"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindUserAvailbleResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据用户id查询对应产品下全部可用资产信息接口</p>
     * 
     * @param request FindUserAvailbleResourcesRequest
     * @return FindUserAvailbleResourcesResponse
     */
    public FindUserAvailbleResourcesResponse findUserAvailbleResources(FindUserAvailbleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findUserAvailbleResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>处罚资源搜索</p>
     * 
     * @param tmpReq PunishResourceSearchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PunishResourceSearchResponse
     */
    public PunishResourceSearchResponse punishResourceSearchWithOptions(PunishResourceSearchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PunishResourceSearchShrinkRequest request = new PunishResourceSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionCodes)) {
            request.actionCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionCodes, "ActionCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bussinessCodes)) {
            request.bussinessCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bussinessCodes, "BussinessCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceCodes)) {
            request.sourceCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceCodes, "SourceCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "UserIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PunishResourceSearch"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PunishResourceSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>处罚资源搜索</p>
     * 
     * @param request PunishResourceSearchRequest
     * @return PunishResourceSearchResponse
     */
    public PunishResourceSearchResponse punishResourceSearch(PunishResourceSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.punishResourceSearchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>风险事件同步</p>
     * 
     * @param request RiskEventSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RiskEventSyncResponse
     */
    public RiskEventSyncResponse riskEventSyncWithOptions(RiskEventSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleted)) {
            body.put("Deleted", request.deleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryTime)) {
            body.put("DiscoveryTime", request.discoveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventNumber)) {
            body.put("EventNumber", request.eventNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relevanceBu)) {
            body.put("RelevanceBu", request.relevanceBu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskDetail)) {
            body.put("RiskDetail", request.riskDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskEffectType)) {
            body.put("RiskEffectType", request.riskEffectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskType)) {
            body.put("RiskType", request.riskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitter)) {
            body.put("Submitter", request.submitter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RiskEventSync"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RiskEventSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>风险事件同步</p>
     * 
     * @param request RiskEventSyncRequest
     * @return RiskEventSyncResponse
     */
    public RiskEventSyncResponse riskEventSync(RiskEventSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.riskEventSyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>管控事件查询</p>
     * 
     * @param tmpReq SearchPunishEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPunishEventsResponse
     */
    public SearchPunishEventsResponse searchPunishEventsWithOptions(SearchPunishEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchPunishEventsShrinkRequest request = new SearchPunishEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bussinessCodes)) {
            request.bussinessCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bussinessCodes, "BussinessCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseCodes)) {
            request.caseCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseCodes, "CaseCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventCodes)) {
            request.eventCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventCodes, "EventCodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bussinessCodesShrink)) {
            query.put("BussinessCodes", request.bussinessCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseCodesShrink)) {
            query.put("CaseCodes", request.caseCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodesShrink)) {
            query.put("EventCodes", request.eventCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPunishEvents"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPunishEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>管控事件查询</p>
     * 
     * @param request SearchPunishEventsRequest
     * @return SearchPunishEventsResponse
     */
    public SearchPunishEventsResponse searchPunishEvents(SearchPunishEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchPunishEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>管控事件查询</p>
     * 
     * @param tmpReq SearchPunishRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPunishRecordsResponse
     */
    public SearchPunishRecordsResponse searchPunishRecordsWithOptions(SearchPunishRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchPunishRecordsShrinkRequest request = new SearchPunishRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionCodes)) {
            request.actionCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionCodes, "ActionCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseCodes)) {
            request.caseCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseCodes, "CaseCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventCodes)) {
            request.eventCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventCodes, "EventCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.punishStatus)) {
            request.punishStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.punishStatus, "PunishStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceCodes)) {
            request.sourceCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceCodes, "SourceCodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCodesShrink)) {
            query.put("ActionCodes", request.actionCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bussinessCodes)) {
            query.put("BussinessCodes", request.bussinessCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseCodesShrink)) {
            query.put("CaseCodes", request.caseCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodesShrink)) {
            query.put("EventCodes", request.eventCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishStatusShrink)) {
            query.put("PunishStatus", request.punishStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCodesShrink)) {
            query.put("SourceCodes", request.sourceCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlFuzzy)) {
            query.put("UrlFuzzy", request.urlFuzzy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPunishRecords"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPunishRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>管控事件查询</p>
     * 
     * @param request SearchPunishRecordsRequest
     * @return SearchPunishRecordsResponse
     */
    public SearchPunishRecordsResponse searchPunishRecords(SearchPunishRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchPunishRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>处罚记录查询</p>
     * 
     * @param tmpReq SearchPunishRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPunishRequestResponse
     */
    public SearchPunishRequestResponse searchPunishRequestWithOptions(SearchPunishRequestRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchPunishRequestShrinkRequest request = new SearchPunishRequestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.antiStatuses)) {
            request.antiStatusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.antiStatuses, "AntiStatuses", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bussinessCodes)) {
            request.bussinessCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bussinessCodes, "BussinessCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventCodes)) {
            request.eventCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventCodes, "EventCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.punishStatuses)) {
            request.punishStatusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.punishStatuses, "PunishStatuses", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceCodes)) {
            request.sourceCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceCodes, "SourceCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "UserIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPunishRequest"),
            new TeaPair("version", "2022-08-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPunishRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>处罚记录查询</p>
     * 
     * @param request SearchPunishRequestRequest
     * @return SearchPunishRequestResponse
     */
    public SearchPunishRequestResponse searchPunishRequest(SearchPunishRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchPunishRequestWithOptions(request, runtime);
    }
}
