// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402;

import com.aliyun.tea.*;
import com.aliyun.acc20240402.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "acc.aliyuncs.com"),
            new TeaPair("ap-south-1", "acc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "acc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "acc.aliyuncs.com"),
            new TeaPair("cn-fujian", "acc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "acc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "acc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "acc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "acc.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "acc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "acc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "acc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "acc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "acc.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "acc.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "acc.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "acc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("acc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建镜像缓存</p>
     * 
     * @param tmpReq CreateImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCacheWithOptions(CreateImageCacheRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateImageCacheShrinkRequest request = new CreateImageCacheShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networkConfig)) {
            request.networkConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networkConfig, "NetworkConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfos)) {
            query.put("AcrRegistryInfos", request.acrRegistryInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheName)) {
            query.put("ImageCacheName", request.imageCacheName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredentials)) {
            query.put("ImageRegistryCredentials", request.imageRegistryCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkConfigShrink)) {
            query.put("NetworkConfig", request.networkConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageCache"),
            new TeaPair("version", "2024-04-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建镜像缓存</p>
     * 
     * @param request CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除镜像缓存</p>
     * 
     * @param request DeleteImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCacheWithOptions(DeleteImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheId)) {
            query.put("ImageCacheId", request.imageCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImageCache"),
            new TeaPair("version", "2024-04-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除镜像缓存</p>
     * 
     * @param request DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCache(DeleteImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询镜像缓存</p>
     * 
     * @param request GetImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageCacheResponse
     */
    public GetImageCacheResponse getImageCacheWithOptions(GetImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheId)) {
            query.put("ImageCacheId", request.imageCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageCache"),
            new TeaPair("version", "2024-04-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询镜像缓存</p>
     * 
     * @param request GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    public GetImageCacheResponse getImageCache(GetImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询镜像缓存</p>
     * 
     * @param request ListImageCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCachesWithOptions(ListImageCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheName)) {
            query.put("ImageCacheName", request.imageCacheName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageCaches"),
            new TeaPair("version", "2024-04-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询镜像缓存</p>
     * 
     * @param request ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCaches(ListImageCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageCachesWithOptions(request, runtime);
    }
}
