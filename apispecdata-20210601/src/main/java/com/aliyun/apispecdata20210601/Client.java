// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601;

import com.aliyun.tea.*;
import com.aliyun.apispecdata20210601.models.*;
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
        this._endpoint = this.getEndpoint("apispecdata", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetRuntimeApiResponse getRuntimeApiWithOptions(GetRuntimeApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuntimeApi", "2021-06-01", "HTTPS", "GET", "AK", "json", req, runtime), new GetRuntimeApiResponse());
    }

    public GetRuntimeApiResponse getRuntimeApi(GetRuntimeApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuntimeApiWithOptions(request, runtime);
    }

    public ListApiNamesResponse listApiNamesWithOptions(ListApiNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApiNames", "2021-06-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListApiNamesResponse());
    }

    public ListApiNamesResponse listApiNames(ListApiNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApiNamesWithOptions(request, runtime);
    }

    public ListChangeRecordsResponse listChangeRecordsWithOptions(ListChangeRecordsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChangeRecordsShrinkRequest request = new ListChangeRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChangeRecords", "2021-06-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListChangeRecordsResponse());
    }

    public ListChangeRecordsResponse listChangeRecords(ListChangeRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChangeRecordsWithOptions(request, runtime);
    }

    public ListPopProductsResponse listPopProductsWithOptions(ListPopProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPopProducts", "2021-06-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListPopProductsResponse());
    }

    public ListPopProductsResponse listPopProducts(ListPopProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPopProductsWithOptions(request, runtime);
    }

    public ListPopVersionsResponse listPopVersionsWithOptions(ListPopVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPopVersions", "2021-06-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListPopVersionsResponse());
    }

    public ListPopVersionsResponse listPopVersions(ListPopVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPopVersionsWithOptions(request, runtime);
    }
}
