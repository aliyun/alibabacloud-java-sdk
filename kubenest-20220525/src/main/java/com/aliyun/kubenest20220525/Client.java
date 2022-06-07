// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525;

import com.aliyun.tea.*;
import com.aliyun.kubenest20220525.models.*;
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
        this._endpoint = this.getEndpoint("kubenest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListAppResponse listApp() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListAppHeaders headers = new ListAppHeaders();
        return this.listAppWithOptions(headers, runtime);
    }

    public ListAppResponse listAppWithOptions(ListAppHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xSProjectId)) {
            realHeaders.put("x-s-projectId", com.aliyun.teautil.Common.toJSONString(headers.xSProjectId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xSnowUserData)) {
            realHeaders.put("x-snow-user-data", com.aliyun.teautil.Common.toJSONString(headers.xSnowUserData));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApp"),
            new TeaPair("version", "2022-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/app"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppResponse());
    }

    public ListAppInfoResponse listAppInfo(String id, String apiVersion, String resourceType, ListAppInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListAppInfoHeaders headers = new ListAppInfoHeaders();
        return this.listAppInfoWithOptions(id, apiVersion, resourceType, request, headers, runtime);
    }

    public ListAppInfoResponse listAppInfoWithOptions(String id, String apiVersion, String resourceType, ListAppInfoRequest request, ListAppInfoHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
        apiVersion = com.aliyun.openapiutil.Client.getEncodeParam(apiVersion);
        resourceType = com.aliyun.openapiutil.Client.getEncodeParam(resourceType);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("labels", request.labels);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xSProjectId)) {
            realHeaders.put("x-s-projectId", com.aliyun.teautil.Common.toJSONString(headers.xSProjectId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xSnowUserData)) {
            realHeaders.put("x-snow-user-data", com.aliyun.teautil.Common.toJSONString(headers.xSnowUserData));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInfo"),
            new TeaPair("version", "2022-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/app-cluster/" + id + "/" + apiVersion + "/" + resourceType + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInfoResponse());
    }
}
