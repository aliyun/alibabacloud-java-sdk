// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101;

import com.aliyun.tea.*;
import com.aliyun.marketing_event20210101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("marketing_event", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddSumRecordFlowPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSumRecordFlowPopResponse
     */
    public AddSumRecordFlowPopResponse addSumRecordFlowPopWithOptions(AddSumRecordFlowPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceName)) {
            query.put("ConferenceName", request.conferenceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryName)) {
            query.put("EntryName", request.entryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idcard)) {
            query.put("Idcard", request.idcard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signTime)) {
            query.put("SignTime", request.signTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSumRecordFlowPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSumRecordFlowPopResponse());
    }

    /**
     * @param request AddSumRecordFlowPopRequest
     * @return AddSumRecordFlowPopResponse
     */
    public AddSumRecordFlowPopResponse addSumRecordFlowPop(AddSumRecordFlowPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSumRecordFlowPopWithOptions(request, runtime);
    }

    /**
     * @param request BindExhibitorRfidPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindExhibitorRfidPopResponse
     */
    public BindExhibitorRfidPopResponse bindExhibitorRfidPopWithOptions(BindExhibitorRfidPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            query.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestTicketRecordId)) {
            query.put("GuestTicketRecordId", request.guestTicketRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rfid)) {
            query.put("Rfid", request.rfid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketCode)) {
            query.put("TicketCode", request.ticketCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindExhibitorRfidPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindExhibitorRfidPopResponse());
    }

    /**
     * @param request BindExhibitorRfidPopRequest
     * @return BindExhibitorRfidPopResponse
     */
    public BindExhibitorRfidPopResponse bindExhibitorRfidPop(BindExhibitorRfidPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindExhibitorRfidPopWithOptions(request, runtime);
    }

    /**
     * @param request BindGuestRfidPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindGuestRfidPopResponse
     */
    public BindGuestRfidPopResponse bindGuestRfidPopWithOptions(BindGuestRfidPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            query.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestTicketRecordId)) {
            query.put("GuestTicketRecordId", request.guestTicketRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rfid)) {
            query.put("Rfid", request.rfid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketCode)) {
            query.put("TicketCode", request.ticketCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindGuestRfidPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindGuestRfidPopResponse());
    }

    /**
     * @param request BindGuestRfidPopRequest
     * @return BindGuestRfidPopResponse
     */
    public BindGuestRfidPopResponse bindGuestRfidPop(BindGuestRfidPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindGuestRfidPopWithOptions(request, runtime);
    }

    /**
     * @param request CheckNFCBindPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckNFCBindPopResponse
     */
    public CheckNFCBindPopResponse checkNFCBindPopWithOptions(CheckNFCBindPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nfcId)) {
            query.put("NfcId", request.nfcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckNFCBindPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckNFCBindPopResponse());
    }

    /**
     * @param request CheckNFCBindPopRequest
     * @return CheckNFCBindPopResponse
     */
    public CheckNFCBindPopResponse checkNFCBindPop(CheckNFCBindPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkNFCBindPopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拉取领证人员记录</p>
     * 
     * @param request FindGuestCredentialsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindGuestCredentialsRecordResponse
     */
    public FindGuestCredentialsRecordResponse findGuestCredentialsRecordWithOptions(FindGuestCredentialsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTimeString)) {
            query.put("DateTimeString", request.dateTimeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateTime)) {
            query.put("EndDateTime", request.endDateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateTime)) {
            query.put("StartDateTime", request.startDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindGuestCredentialsRecord"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindGuestCredentialsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>拉取领证人员记录</p>
     * 
     * @param request FindGuestCredentialsRecordRequest
     * @return FindGuestCredentialsRecordResponse
     */
    public FindGuestCredentialsRecordResponse findGuestCredentialsRecord(FindGuestCredentialsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findGuestCredentialsRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云栖大会获取取票人信息list接口</p>
     * 
     * @param request FindGuestTicketRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindGuestTicketRecordResponse
     */
    public FindGuestTicketRecordResponse findGuestTicketRecordWithOptions(FindGuestTicketRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTimeString)) {
            query.put("DateTimeString", request.dateTimeString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateTime)) {
            query.put("EndDateTime", request.endDateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateTime)) {
            query.put("StartDateTime", request.startDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindGuestTicketRecord"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindGuestTicketRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云栖大会获取取票人信息list接口</p>
     * 
     * @param request FindGuestTicketRecordRequest
     * @return FindGuestTicketRecordResponse
     */
    public FindGuestTicketRecordResponse findGuestTicketRecord(FindGuestTicketRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findGuestTicketRecordWithOptions(request, runtime);
    }

    /**
     * @param request QueryAllActivityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllActivityInfoResponse
     */
    public QueryAllActivityInfoResponse queryAllActivityInfoWithOptions(QueryAllActivityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllActivityInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllActivityInfoResponse());
    }

    /**
     * @param request QueryAllActivityInfoRequest
     * @return QueryAllActivityInfoResponse
     */
    public QueryAllActivityInfoResponse queryAllActivityInfo(QueryAllActivityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllActivityInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrderSessionListPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderSessionListPopResponse
     */
    public QueryOrderSessionListPopResponse queryOrderSessionListPopWithOptions(QueryOrderSessionListPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nfcId)) {
            query.put("NfcId", request.nfcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderSessionListPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderSessionListPopResponse());
    }

    /**
     * @param request QueryOrderSessionListPopRequest
     * @return QueryOrderSessionListPopResponse
     */
    public QueryOrderSessionListPopResponse queryOrderSessionListPop(QueryOrderSessionListPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderSessionListPopWithOptions(request, runtime);
    }

    /**
     * @param request QuerySessionByActivityIdPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionByActivityIdPopResponse
     */
    public QuerySessionByActivityIdPopResponse querySessionByActivityIdPopWithOptions(QuerySessionByActivityIdPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionByActivityIdPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionByActivityIdPopResponse());
    }

    /**
     * @param request QuerySessionByActivityIdPopRequest
     * @return QuerySessionByActivityIdPopResponse
     */
    public QuerySessionByActivityIdPopResponse querySessionByActivityIdPop(QuerySessionByActivityIdPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionByActivityIdPopWithOptions(request, runtime);
    }

    /**
     * @param request QuerySessionListPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySessionListPopResponse
     */
    public QuerySessionListPopResponse querySessionListPopWithOptions(QuerySessionListPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nfcId)) {
            query.put("NfcId", request.nfcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySessionListPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySessionListPopResponse());
    }

    /**
     * @param request QuerySessionListPopRequest
     * @return QuerySessionListPopResponse
     */
    public QuerySessionListPopResponse querySessionListPop(QuerySessionListPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionListPopWithOptions(request, runtime);
    }

    /**
     * @param request QuerySignInRecordPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySignInRecordPopResponse
     */
    public QuerySignInRecordPopResponse querySignInRecordPopWithOptions(QuerySignInRecordPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySignInRecordPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySignInRecordPopResponse());
    }

    /**
     * @param request QuerySignInRecordPopRequest
     * @return QuerySignInRecordPopResponse
     */
    public QuerySignInRecordPopResponse querySignInRecordPop(QuerySignInRecordPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySignInRecordPopWithOptions(request, runtime);
    }

    /**
     * @param request QuerySingleActivityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySingleActivityInfoResponse
     */
    public QuerySingleActivityInfoResponse querySingleActivityInfoWithOptions(QuerySingleActivityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySingleActivityInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySingleActivityInfoResponse());
    }

    /**
     * @param request QuerySingleActivityInfoRequest
     * @return QuerySingleActivityInfoResponse
     */
    public QuerySingleActivityInfoResponse querySingleActivityInfo(QuerySingleActivityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySingleActivityInfoWithOptions(request, runtime);
    }

    /**
     * @param request SyncSignInInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncSignInInfoResponse
     */
    public SyncSignInInfoResponse syncSignInInfoWithOptions(SyncSignInInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncSignInInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncSignInInfoResponse());
    }

    /**
     * @param request SyncSignInInfoRequest
     * @return SyncSignInInfoResponse
     */
    public SyncSignInInfoResponse syncSignInInfo(SyncSignInInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncSignInInfoWithOptions(request, runtime);
    }

    /**
     * @param request TicketOrCredentialsSignInPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketOrCredentialsSignInPopResponse
     */
    public TicketOrCredentialsSignInPopResponse ticketOrCredentialsSignInPopWithOptions(TicketOrCredentialsSignInPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceName)) {
            query.put("ConferenceName", request.conferenceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryName)) {
            query.put("EntryName", request.entryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idcard)) {
            query.put("Idcard", request.idcard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signTime)) {
            query.put("SignTime", request.signTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketOrCredentialsSignInPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketOrCredentialsSignInPopResponse());
    }

    /**
     * @param request TicketOrCredentialsSignInPopRequest
     * @return TicketOrCredentialsSignInPopResponse
     */
    public TicketOrCredentialsSignInPopResponse ticketOrCredentialsSignInPop(TicketOrCredentialsSignInPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ticketOrCredentialsSignInPopWithOptions(request, runtime);
    }

    /**
     * @param request UpdateCredentialsStatusPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialsStatusPopResponse
     */
    public UpdateCredentialsStatusPopResponse updateCredentialsStatusPopWithOptions(UpdateCredentialsStatusPopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRecipientName)) {
            query.put("ProxyRecipientName", request.proxyRecipientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyRecipientPhoneNumber)) {
            query.put("ProxyRecipientPhoneNumber", request.proxyRecipientPhoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptLocation)) {
            query.put("ReceiptLocation", request.receiptLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredentialsStatusPop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialsStatusPopResponse());
    }

    /**
     * @param request UpdateCredentialsStatusPopRequest
     * @return UpdateCredentialsStatusPopResponse
     */
    public UpdateCredentialsStatusPopResponse updateCredentialsStatusPop(UpdateCredentialsStatusPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialsStatusPopWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTicketRecordByticketCodePopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTicketRecordByticketCodePopResponse
     */
    public UpdateTicketRecordByticketCodePopResponse updateTicketRecordByticketCodePopWithOptions(UpdateTicketRecordByticketCodePopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agendaId)) {
            query.put("AgendaId", request.agendaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.event)) {
            query.put("Event", request.event);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTicketRecordByticketCodePop"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTicketRecordByticketCodePopResponse());
    }

    /**
     * @param request UpdateTicketRecordByticketCodePopRequest
     * @return UpdateTicketRecordByticketCodePopResponse
     */
    public UpdateTicketRecordByticketCodePopResponse updateTicketRecordByticketCodePop(UpdateTicketRecordByticketCodePopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTicketRecordByticketCodePopWithOptions(request, runtime);
    }
}
