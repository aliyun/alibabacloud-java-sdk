// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722;

import com.aliyun.tea.*;
import com.aliyun.iacservice20210722.models.*;
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
        this._endpoint = this.getEndpoint("iacservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateResourceResponse createResource(String productCode, String provider, String resourceTypeCode, CreateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(productCode, provider, resourceTypeCode, request, headers, runtime);
    }

    public CreateResourceResponse createResourceWithOptions(String productCode, String provider, String resourceTypeCode, CreateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("isAsync", request.isAsync);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    public DeleteResourceResponse deleteResource(String productCode, String provider, String resourceId, String resourceTypeCode, DeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(productCode, provider, resourceId, resourceTypeCode, request, headers, runtime);
    }

    public DeleteResourceResponse deleteResourceWithOptions(String productCode, String provider, String resourceId, String resourceTypeCode, DeleteResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("isAsync", request.isAsync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources/{resourceId}"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    public GetResourceResponse getResource(String productCode, String provider, String resourceId, String resourceTypeCode, GetResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceWithOptions(productCode, provider, resourceId, resourceTypeCode, request, headers, runtime);
    }

    public GetResourceResponse getResourceWithOptions(String productCode, String provider, String resourceId, String resourceTypeCode, GetResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources/{resourceId}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    public GetTaskResponse getTask(String taskId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(taskId, headers, runtime);
    }

    public GetTaskResponse getTaskWithOptions(String taskId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        taskId = com.aliyun.openapiutil.Client.getEncodeParam(taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tasks/" + taskId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    public ListDataSourcesResponse listDataSources(String attributeName, String productCode, String provider, String resourceTypeCode, ListDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(attributeName, productCode, provider, resourceTypeCode, request, headers, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(String attributeName, String productCode, String provider, String resourceTypeCode, ListDataSourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        attributeName = com.aliyun.openapiutil.Client.getEncodeParam(attributeName);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/dataSources/{attributeName}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    public ListProductsResponse listProducts(String provider, ListProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductsWithOptions(provider, request, headers, runtime);
    }

    public ListProductsResponse listProductsWithOptions(String provider, ListProductsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    public ListResourceTypesResponse listResourceTypes(String productCode, String provider, ListResourceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceTypesWithOptions(productCode, provider, request, headers, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(String productCode, String provider, ListResourceTypesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        ListResourceTypesShrinkRequest request = new ListResourceTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypeCodes)) {
            request.resourceTypeCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypeCodes, "resourceTypeCodes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeCodesShrink)) {
            query.put("resourceTypeCodes", request.resourceTypeCodesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypesResponse());
    }

    public ListResourcesResponse listResources(String productCode, String provider, String resourceTypeCode, ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(productCode, provider, resourceTypeCode, request, headers, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(String productCode, String provider, String resourceTypeCode, ListResourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        ListResourcesShrinkRequest request = new ListResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "regionIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReload)) {
            query.put("isReload", request.isReload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("regionIds", request.regionIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    public ReloadResourcesResponse reloadResources(String productCode, String provider, String resourceTypeCode, ReloadResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reloadResourcesWithOptions(productCode, provider, resourceTypeCode, request, headers, runtime);
    }

    public ReloadResourcesResponse reloadResourcesWithOptions(String productCode, String provider, String resourceTypeCode, ReloadResourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        ReloadResourcesShrinkRequest request = new ReloadResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "regionIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("regionIds", request.regionIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReloadResources"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources/operation/reload"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReloadResourcesResponse());
    }

    public UpdateResourceResponse updateResource(String productCode, String provider, String resourceId, String resourceTypeCode, UpdateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(productCode, provider, resourceId, resourceTypeCode, request, headers, runtime);
    }

    public UpdateResourceResponse updateResourceWithOptions(String productCode, String provider, String resourceId, String resourceTypeCode, UpdateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("isAsync", request.isAsync);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2021-07-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + provider + "/products/{productCode}/resourceTypes/{resourceTypeCode}/resources/{resourceId}"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }
}
