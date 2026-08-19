// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315;

import com.aliyun.tea.*;
import com.aliyun.accountlabel20200315.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("accountlabel", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomerLabelResponse
     */
    public AddCustomerLabelResponse addCustomerLabelWithOptions(AddCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endtime)) {
            query.put("Endtime", request.endtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTypes)) {
            query.put("LabelTypes", request.labelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomerLabel"),
            new TeaPair("version", "2020-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomerLabelResponse());
    }

    /**
     * @param request AddCustomerLabelRequest
     * @return AddCustomerLabelResponse
     */
    public AddCustomerLabelResponse addCustomerLabel(AddCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomerLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>传入多个labelSeries查询标签</p>
     * 
     * @param tmpReq BatchFetchAccountLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchFetchAccountLabelResponse
     */
    public BatchFetchAccountLabelResponse batchFetchAccountLabelWithOptions(BatchFetchAccountLabelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchFetchAccountLabelShrinkRequest request = new BatchFetchAccountLabelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelSeriesList)) {
            request.labelSeriesListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelSeriesList, "LabelSeriesList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instant)) {
            query.put("Instant", request.instant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSeriesListShrink)) {
            query.put("LabelSeriesList", request.labelSeriesListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchFetchAccountLabel"),
            new TeaPair("version", "2020-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchFetchAccountLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>传入多个labelSeries查询标签</p>
     * 
     * @param request BatchFetchAccountLabelRequest
     * @return BatchFetchAccountLabelResponse
     */
    public BatchFetchAccountLabelResponse batchFetchAccountLabel(BatchFetchAccountLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchFetchAccountLabelWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomerLabelResponse
     */
    public DeleteCustomerLabelResponse deleteCustomerLabelWithOptions(DeleteCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelTypes)) {
            query.put("LabelTypes", request.labelTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomerLabel"),
            new TeaPair("version", "2020-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomerLabelResponse());
    }

    /**
     * @param request DeleteCustomerLabelRequest
     * @return DeleteCustomerLabelResponse
     */
    public DeleteCustomerLabelResponse deleteCustomerLabel(DeleteCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomerLabelWithOptions(request, runtime);
    }

    /**
     * @param request QueryCustomerLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomerLabelResponse
     */
    public QueryCustomerLabelResponse queryCustomerLabelWithOptions(QueryCustomerLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instant)) {
            query.put("Instant", request.instant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelSeries)) {
            query.put("LabelSeries", request.labelSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomerLabel"),
            new TeaPair("version", "2020-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerLabelResponse());
    }

    /**
     * @param request QueryCustomerLabelRequest
     * @return QueryCustomerLabelResponse
     */
    public QueryCustomerLabelResponse queryCustomerLabel(QueryCustomerLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerLabelWithOptions(request, runtime);
    }

    /**
     * @param request QueryCustomerLabelByConfigGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomerLabelByConfigGroupResponse
     */
    public QueryCustomerLabelByConfigGroupResponse queryCustomerLabelByConfigGroupWithOptions(QueryCustomerLabelByConfigGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PK)) {
            query.put("PK", request.PK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomerLabelByConfigGroup"),
            new TeaPair("version", "2020-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerLabelByConfigGroupResponse());
    }

    /**
     * @param request QueryCustomerLabelByConfigGroupRequest
     * @return QueryCustomerLabelByConfigGroupResponse
     */
    public QueryCustomerLabelByConfigGroupResponse queryCustomerLabelByConfigGroup(QueryCustomerLabelByConfigGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerLabelByConfigGroupWithOptions(request, runtime);
    }
}
