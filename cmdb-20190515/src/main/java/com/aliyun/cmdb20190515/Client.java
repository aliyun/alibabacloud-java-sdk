// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515;

import com.aliyun.tea.*;
import com.aliyun.cmdb20190515.models.*;
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
        this._endpoint = this.getEndpoint("cmdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AppGroupAddToCMDBResponse appGroupAddToCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.appGroupAddToCMDBWithOptions(headers, runtime);
    }

    public AppGroupAddToCMDBResponse appGroupAddToCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppGroupAddToCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/app_group/insert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppGroupAddToCMDBResponse());
    }

    public AppGroupUpdateFromCMDBResponse appGroupUpdateFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.appGroupUpdateFromCMDBWithOptions(headers, runtime);
    }

    public AppGroupUpdateFromCMDBResponse appGroupUpdateFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppGroupUpdateFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/app_group/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AppGroupUpdateFromCMDBResponse());
    }

    public CmdbCommonPostAPIResponse cmdbCommonPostAPI(CmdbCommonPostAPIRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cmdbCommonPostAPIWithOptions(request, headers, runtime);
    }

    public CmdbCommonPostAPIResponse cmdbCommonPostAPIWithOptions(CmdbCommonPostAPIRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("Method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("Timestamp", request.timestamp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CmdbCommonPostAPI"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/common-post"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CmdbCommonPostAPIResponse());
    }

    public CreatePodFromCMDBResponse createPodFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPodFromCMDBWithOptions(headers, runtime);
    }

    public CreatePodFromCMDBResponse createPodFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePodFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/openapi/device/vm/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePodFromCMDBResponse());
    }

    public DeletePodFromCMDBResponse deletePodFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePodFromCMDBWithOptions(headers, runtime);
    }

    public DeletePodFromCMDBResponse deletePodFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePodFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/openapi/device/vm/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePodFromCMDBResponse());
    }

    public ItemAddToCMDBResponse itemAddToCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemAddToCMDBWithOptions(headers, runtime);
    }

    public ItemAddToCMDBResponse itemAddToCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemAddToCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/item/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemAddToCMDBResponse());
    }

    public ItemBatchAddToCMDBResponse itemBatchAddToCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemBatchAddToCMDBWithOptions(headers, runtime);
    }

    public ItemBatchAddToCMDBResponse itemBatchAddToCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemBatchAddToCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/item/batch_add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemBatchAddToCMDBResponse());
    }

    public ItemBatchDeleteFromCMDBResponse itemBatchDeleteFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemBatchDeleteFromCMDBWithOptions(headers, runtime);
    }

    public ItemBatchDeleteFromCMDBResponse itemBatchDeleteFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemBatchDeleteFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/item/batch_delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemBatchDeleteFromCMDBResponse());
    }

    public ItemBatchUpdateFromCMDBResponse itemBatchUpdateFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemBatchUpdateFromCMDBWithOptions(headers, runtime);
    }

    public ItemBatchUpdateFromCMDBResponse itemBatchUpdateFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemBatchUpdateFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/item/batch_update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemBatchUpdateFromCMDBResponse());
    }

    public ItemDeleteFromCMDBResponse itemDeleteFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemDeleteFromCMDBWithOptions(headers, runtime);
    }

    public ItemDeleteFromCMDBResponse itemDeleteFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemDeleteFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/item/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemDeleteFromCMDBResponse());
    }

    public ItemUpdateFromCMDBResponse itemUpdateFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.itemUpdateFromCMDBWithOptions(headers, runtime);
    }

    public ItemUpdateFromCMDBResponse itemUpdateFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ItemUpdateFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/item/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ItemUpdateFromCMDBResponse());
    }

    public QueryPodFromCMDBResponse queryPodFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPodFromCMDBWithOptions(headers, runtime);
    }

    public QueryPodFromCMDBResponse queryPodFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPodFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/item/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPodFromCMDBResponse());
    }

    public UpdatePodFromCMDBResponse updatePodFromCMDB() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePodFromCMDBWithOptions(headers, runtime);
    }

    public UpdatePodFromCMDBResponse updatePodFromCMDBWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePodFromCMDB"),
            new TeaPair("version", "2019-05-15"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/openapi/device/server/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePodFromCMDBResponse());
    }
}
