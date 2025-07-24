// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduaiservice20231218;

import com.aliyun.tea.*;
import com.aliyun.eduaiservice20231218.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eduaiservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>查询指定学生实验记录</p>
     * 
     * @param request QueryOrgLabRecordListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrgLabRecordListResponse
     */
    public QueryOrgLabRecordListResponse queryOrgLabRecordListWithOptions(QueryOrgLabRecordListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labId)) {
            query.put("LabId", request.labId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("OrderDirection", request.orderDirection);
        }

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
            new TeaPair("action", "QueryOrgLabRecordList"),
            new TeaPair("version", "2023-12-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrgLabRecordListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定学生实验记录</p>
     * 
     * @param request QueryOrgLabRecordListRequest
     * @return QueryOrgLabRecordListResponse
     */
    public QueryOrgLabRecordListResponse queryOrgLabRecordList(QueryOrgLabRecordListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrgLabRecordListWithOptions(request, runtime);
    }
}
