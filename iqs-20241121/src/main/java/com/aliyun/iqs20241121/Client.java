// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121;

import com.aliyun.tea.*;
import com.aliyun.iqs20241121.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iqs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>申请正式开通</p>
     * 
     * @param request ApplyFormalServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyFormalServiceResponse
     */
    public ApplyFormalServiceResponse applyFormalServiceWithOptions(ApplyFormalServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyFormalService"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/applyFormalService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyFormalServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请正式开通</p>
     * 
     * @param request ApplyFormalServiceRequest
     * @return ApplyFormalServiceResponse
     */
    public ApplyFormalServiceResponse applyFormalService(ApplyFormalServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFormalServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验账号类型</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccountTypeResponse
     */
    public CheckAccountTypeResponse checkAccountTypeWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccountType"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/checkAccountType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验账号类型</p>
     * @return CheckAccountTypeResponse
     */
    public CheckAccountTypeResponse checkAccountType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAccountTypeWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载接口计量日明细</p>
     * 
     * @param request DownloadApiCallDailyDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadApiCallDailyDetailResponse
     */
    public DownloadApiCallDailyDetailResponse downloadApiCallDailyDetailWithOptions(DownloadApiCallDailyDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadApiCallDailyDetail"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/downloadApiCallDailyDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadApiCallDailyDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载接口计量日明细</p>
     * 
     * @param request DownloadApiCallDailyDetailRequest
     * @return DownloadApiCallDailyDetailResponse
     */
    public DownloadApiCallDailyDetailResponse downloadApiCallDailyDetail(DownloadApiCallDailyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadApiCallDailyDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载接口计量日明细</p>
     * 
     * @param request DownloadMeteringDailyDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadMeteringDailyDetailResponse
     */
    public DownloadMeteringDailyDetailResponse downloadMeteringDailyDetailWithOptions(DownloadMeteringDailyDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadMeteringDailyDetail"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/downloadMeteringDailyDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadMeteringDailyDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载接口计量日明细</p>
     * 
     * @param request DownloadMeteringDailyDetailRequest
     * @return DownloadMeteringDailyDetailResponse
     */
    public DownloadMeteringDailyDetailResponse downloadMeteringDailyDetail(DownloadMeteringDailyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadMeteringDailyDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>延长测试时间</p>
     * 
     * @param request ExpandSearchExpiredTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExpandSearchExpiredTimeResponse
     */
    public ExpandSearchExpiredTimeResponse expandSearchExpiredTimeWithOptions(ExpandSearchExpiredTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpandSearchExpiredTime"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/expendExpiredTime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpandSearchExpiredTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>延长测试时间</p>
     * 
     * @param request ExpandSearchExpiredTimeRequest
     * @return ExpandSearchExpiredTimeResponse
     */
    public ExpandSearchExpiredTimeResponse expandSearchExpiredTime(ExpandSearchExpiredTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.expandSearchExpiredTimeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取账号配置信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountConfigInfoResponse
     */
    public GetAccountConfigInfoResponse getAccountConfigInfoWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountConfigInfo"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/openService/v1/account/command/accountConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountConfigInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取账号配置信息</p>
     * @return GetAccountConfigInfoResponse
     */
    public GetAccountConfigInfoResponse getAccountConfigInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccountConfigInfoWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户申请记录</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountReviewRecordResponse
     */
    public GetAccountReviewRecordResponse getAccountReviewRecordWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountReviewRecord"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/reviewRecord"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountReviewRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户申请记录</p>
     * @return GetAccountReviewRecordResponse
     */
    public GetAccountReviewRecordResponse getAccountReviewRecord() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccountReviewRecordWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量汇总信息</p>
     * 
     * @param request GetMeteringSummaryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMeteringSummaryResponse
     */
    public GetMeteringSummaryResponse getMeteringSummaryWithOptions(GetMeteringSummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billPeriod)) {
            query.put("billPeriod", request.billPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingItem)) {
            query.put("billingItem", request.billingItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountId)) {
            query.put("subAccountId", request.subAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMeteringSummary"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/metering/summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMeteringSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量汇总信息</p>
     * 
     * @param request GetMeteringSummaryRequest
     * @return GetMeteringSummaryResponse
     */
    public GetMeteringSummaryResponse getMeteringSummary(GetMeteringSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMeteringSummaryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务额度信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceConfigResponse
     */
    public GetServiceConfigResponse getServiceConfigWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceConfig"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/serviceConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务额度信息</p>
     * @return GetServiceConfigResponse
     */
    public GetServiceConfigResponse getServiceConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceConfigWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Api调用量（性能）日明细</p>
     * 
     * @param request ListApiCallDailyDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiCallDailyDetailResponse
     */
    public ListApiCallDailyDetailResponse listApiCallDailyDetailWithOptions(ListApiCallDailyDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("apiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("engineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiCallDailyDetail"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/apiCall/dailyDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiCallDailyDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Api调用量（性能）日明细</p>
     * 
     * @param request ListApiCallDailyDetailRequest
     * @return ListApiCallDailyDetailResponse
     */
    public ListApiCallDailyDetailResponse listApiCallDailyDetail(ListApiCallDailyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiCallDailyDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Api名称列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiNamesResponse
     */
    public ListApiNamesResponse listApiNamesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiNames"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/apiNames"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Api名称列表</p>
     * @return ListApiNamesResponse
     */
    public ListApiNamesResponse listApiNames() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiNamesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量日明细信息</p>
     * 
     * @param request ListMeteringDailyDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMeteringDailyDetailResponse
     */
    public ListMeteringDailyDetailResponse listMeteringDailyDetailWithOptions(ListMeteringDailyDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billPeriod)) {
            query.put("billPeriod", request.billPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingItem)) {
            query.put("billingItem", request.billingItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountId)) {
            query.put("subAccountId", request.subAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMeteringDailyDetail"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/metering/dailyDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMeteringDailyDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询计量日明细信息</p>
     * 
     * @param request ListMeteringDailyDetailRequest
     * @return ListMeteringDailyDetailResponse
     */
    public ListMeteringDailyDetailResponse listMeteringDailyDetail(ListMeteringDailyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMeteringDailyDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号的所有子账号信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubAccountInfoResponse
     */
    public ListSubAccountInfoResponse listSubAccountInfoWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubAccountInfo"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/subAccountInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号的所有子账号信息</p>
     * @return ListSubAccountInfoResponse
     */
    public ListSubAccountInfoResponse listSubAccountInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubAccountInfoWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>管理智搜用户</p>
     * 
     * @param request ManageSearchAccountInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageSearchAccountInfoResponse
     */
    public ManageSearchAccountInfoResponse manageSearchAccountInfoWithOptions(ManageSearchAccountInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageSearchAccountInfo"),
            new TeaPair("version", "2024-11-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/manage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageSearchAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>管理智搜用户</p>
     * 
     * @param request ManageSearchAccountInfoRequest
     * @return ManageSearchAccountInfoResponse
     */
    public ManageSearchAccountInfoResponse manageSearchAccountInfo(ManageSearchAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.manageSearchAccountInfoWithOptions(request, headers, runtime);
    }
}
