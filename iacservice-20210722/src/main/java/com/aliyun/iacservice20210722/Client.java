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

    public ReloadResourcesResponse reloadResources(String provider, String productCode, String resourceTypeCode, ReloadResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reloadResourcesWithOptions(provider, productCode, resourceTypeCode, request, headers, runtime);
    }

    public ReloadResourcesResponse reloadResourcesWithOptions(String provider, String productCode, String resourceTypeCode, ReloadResourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
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
        return TeaModel.toModel(this.doROARequest("ReloadResources", "2021-07-22", "HTTPS", "PUT", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources/operation/reload", "json", req, runtime), new ReloadResourcesResponse());
    }

    public ListResourceTypesResponse listResourceTypes(String provider, String productCode, ListResourceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceTypesWithOptions(provider, productCode, request, headers, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(String provider, String productCode, ListResourceTypesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        ListResourceTypesShrinkRequest request = new ListResourceTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypeCodes)) {
            request.resourceTypeCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypeCodes, "resourceTypeCodes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeCodesShrink)) {
            query.put("resourceTypeCodes", request.resourceTypeCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListResourceTypes", "2021-07-22", "HTTPS", "GET", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes", "json", req, runtime), new ListResourceTypesResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListProducts", "2021-07-22", "HTTPS", "GET", "AK", "/api/v1/providers/" + provider + "/products", "json", req, runtime), new ListProductsResponse());
    }

    public ListResourcesResponse listResources(String provider, String productCode, String resourceTypeCode, ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourcesWithOptions(provider, productCode, resourceTypeCode, request, headers, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(String provider, String productCode, String resourceTypeCode, ListResourcesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        ListResourcesShrinkRequest request = new ListResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regionIds)) {
            request.regionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regionIds, "regionIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsShrink)) {
            query.put("regionIds", request.regionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReload)) {
            query.put("isReload", request.isReload);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListResources", "2021-07-22", "HTTPS", "GET", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources", "json", req, runtime), new ListResourcesResponse());
    }

    public CreateResourceResponse createResource(String provider, String productCode, String resourceTypeCode, CreateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(provider, productCode, resourceTypeCode, request, headers, runtime);
    }

    public CreateResourceResponse createResourceWithOptions(String provider, String productCode, String resourceTypeCode, CreateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
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
        return TeaModel.toModel(this.doROARequest("CreateResource", "2021-07-22", "HTTPS", "POST", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources", "json", req, runtime), new CreateResourceResponse());
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
        return TeaModel.toModel(this.doROARequest("GetTask", "2021-07-22", "HTTPS", "GET", "AK", "/api/v1/tasks/" + taskId + "", "json", req, runtime), new GetTaskResponse());
    }

    public UpdateResourceResponse updateResource(String provider, String productCode, String resourceTypeCode, String resourceId, UpdateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(provider, productCode, resourceTypeCode, resourceId, request, headers, runtime);
    }

    public UpdateResourceResponse updateResourceWithOptions(String provider, String productCode, String resourceTypeCode, String resourceId, UpdateResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("isAsync", request.isAsync);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateResource", "2021-07-22", "HTTPS", "PUT", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources/" + resourceId + "", "json", req, runtime), new UpdateResourceResponse());
    }

    public GetResourceResponse getResource(String provider, String productCode, String resourceTypeCode, String resourceId, GetResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceWithOptions(provider, productCode, resourceTypeCode, resourceId, request, headers, runtime);
    }

    public GetResourceResponse getResourceWithOptions(String provider, String productCode, String resourceTypeCode, String resourceId, GetResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetResource", "2021-07-22", "HTTPS", "GET", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources/" + resourceId + "", "json", req, runtime), new GetResourceResponse());
    }

    public DeleteResourceResponse deleteResource(String provider, String productCode, String resourceTypeCode, String resourceId, DeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(provider, productCode, resourceTypeCode, resourceId, request, headers, runtime);
    }

    public DeleteResourceResponse deleteResourceWithOptions(String provider, String productCode, String resourceTypeCode, String resourceId, DeleteResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        provider = com.aliyun.openapiutil.Client.getEncodeParam(provider);
        productCode = com.aliyun.openapiutil.Client.getEncodeParam(productCode);
        resourceTypeCode = com.aliyun.openapiutil.Client.getEncodeParam(resourceTypeCode);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("isAsync", request.isAsync);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteResource", "2021-07-22", "HTTPS", "DELETE", "AK", "/api/v1/providers/" + provider + "/products/" + productCode + "/resourceTypes/" + resourceTypeCode + "/resources/" + resourceId + "", "json", req, runtime), new DeleteResourceResponse());
    }
}
