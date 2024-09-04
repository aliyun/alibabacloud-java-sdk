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
}
