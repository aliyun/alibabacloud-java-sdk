// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20210928;

import com.aliyun.tea.*;
import com.aliyun.aiearth_meteorology20210928.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiearth-meteorology", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GridQueryResponse gridQuery(String dataType, GridQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.gridQueryWithOptions(dataType, request, headers, runtime);
    }

    public GridQueryResponse gridQueryWithOptions(String dataType, GridQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        dataType = com.aliyun.openapiutil.Client.getEncodeParam(dataType);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.element)) {
            query.put("element", request.element);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastTimestamp)) {
            query.put("forecastTimestamp", request.forecastTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTimestamp)) {
            query.put("reportTimestamp", request.reportTimestamp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GridQuery", "2021-09-28", "HTTPS", "GET", "AK", "/grid/" + dataType + "/v1", "json", req, runtime), new GridQueryResponse());
    }
}
