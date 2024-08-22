// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830;

import com.aliyun.tea.*;
import com.aliyun.cloudcontrol20220830.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudcontrol", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>取消任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/operation/cancel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消任务</p>
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request CreateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(String requestPath, CreateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(String requestPath, CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceWithOptions(requestPath, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request DeleteResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResourceWithOptions(String requestPath, DeleteResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(String requestPath, DeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceWithOptions(requestPath, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格</p>
     * 
     * @param requestPath the whole path of resource string
     * @param tmpReq GetPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPriceResponse
     */
    public GetPriceResponse getPriceWithOptions(String requestPath, GetPriceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPriceShrinkRequest request = new GetPriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceAttributes)) {
            request.resourceAttributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceAttributes, "resourceAttributes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttributesShrink)) {
            query.put("resourceAttributes", request.resourceAttributesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrice"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request GetPriceRequest
     * @return GetPriceResponse
     */
    public GetPriceResponse getPrice(String requestPath, GetPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPriceWithOptions(requestPath, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源元数据</p>
     * 
     * @param requestPath the whole path of resource string
     * @param headers GetResourceTypeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceTypeWithOptions(String requestPath, GetResourceTypeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAcceptLanguage)) {
            realHeaders.put("x-acs-accept-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAcceptLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceType"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源元数据</p>
     * 
     * @param requestPath the whole path of resource string
     * @return GetResourceTypeResponse
     */
    public GetResourceTypeResponse getResourceType(String requestPath) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetResourceTypeHeaders headers = new GetResourceTypeHeaders();
        return this.getResourceTypeWithOptions(requestPath, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param tmpReq GetResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResourcesWithOptions(String requestPath, GetResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourcesShrinkRequest request = new GetResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResources"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request GetResourcesRequest
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResources(String requestPath, GetResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourcesWithOptions(requestPath, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/tasks/{taskId}。</p>
     * 
     * <b>summary</b> : 
     * <p>查询任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/tasks/{taskId}。</p>
     * 
     * <b>summary</b> : 
     * <p>查询任务</p>
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举资源属性可选值</p>
     * 
     * @param requestPath the whole path of resource string
     * @param tmpReq ListDataSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(String requestPath, ListDataSourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeName)) {
            query.put("attributeName", request.attributeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举资源属性可选值</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(String requestPath, ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(requestPath, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products。</p>
     * 
     * <b>summary</b> : 
     * <p>列举资源类型</p>
     * 
     * @param request ListProductsRequest
     * @param headers ListProductsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductsResponse
     */
    public ListProductsResponse listProductsWithOptions(String provider, ListProductsRequest request, ListProductsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAcceptLanguage)) {
            realHeaders.put("x-acs-accept-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAcceptLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProducts"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + com.aliyun.openapiutil.Client.getEncodeParam(provider) + "/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products。</p>
     * 
     * <b>summary</b> : 
     * <p>列举资源类型</p>
     * 
     * @param request ListProductsRequest
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(String provider, ListProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProductsHeaders headers = new ListProductsHeaders();
        return this.listProductsWithOptions(provider, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products/{product}/resourceTypes。</p>
     * 
     * <b>summary</b> : 
     * <p>列举资源类型</p>
     * 
     * @param tmpReq ListResourceTypesRequest
     * @param headers ListResourceTypesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypesWithOptions(String provider, String product, ListResourceTypesRequest tmpReq, ListResourceTypesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceTypesShrinkRequest request = new ListResourceTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypes)) {
            request.resourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypes, "resourceTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesShrink)) {
            query.put("resourceTypes", request.resourceTypesShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAcceptLanguage)) {
            realHeaders.put("x-acs-accept-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAcceptLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/providers/" + com.aliyun.openapiutil.Client.getEncodeParam(provider) + "/products/" + com.aliyun.openapiutil.Client.getEncodeParam(product) + "/resourceTypes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypesResponse());
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products/{product}/resourceTypes。</p>
     * 
     * <b>summary</b> : 
     * <p>列举资源类型</p>
     * 
     * @param request ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    public ListResourceTypesResponse listResourceTypes(String provider, String product, ListResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListResourceTypesHeaders headers = new ListResourceTypesHeaders();
        return this.listResourceTypesWithOptions(provider, product, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request UpdateResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResourceWithOptions(String requestPath, UpdateResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2022-08-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "" + requestPath + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源</p>
     * 
     * @param requestPath the whole path of resource string
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(String requestPath, UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceWithOptions(requestPath, request, headers, runtime);
    }
}
