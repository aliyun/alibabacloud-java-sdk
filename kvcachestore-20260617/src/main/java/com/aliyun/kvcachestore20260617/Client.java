// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617;

import com.aliyun.tea.*;
import com.aliyun.kvcachestore20260617.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "kvcachestore.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-shanghai", "kvcachestore.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "kvcachestore.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("kvcachestore", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>This is an asynchronous operation. A return status of Attaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. A record status of Attached indicates that the mount is complete.</p>
     * <ul>
     * <li>The KVCacheStore must be in the Available or InUse state before it can be mounted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Mounts KVCacheInstance resources to the virtualization side in batches.</p>
     * 
     * @param request AttachKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachKVCacheStoreResponse
     */
    public AttachKVCacheStoreResponse attachKVCacheStoreWithOptions(AttachKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arns)) {
            query.put("Arns", request.arns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachKVCacheStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. A return status of Attaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. A record status of Attached indicates that the mount is complete.</p>
     * <ul>
     * <li>The KVCacheStore must be in the Available or InUse state before it can be mounted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Mounts KVCacheInstance resources to the virtualization side in batches.</p>
     * 
     * @param request AttachKVCacheStoreRequest
     * @return AttachKVCacheStoreResponse
     */
    public AttachKVCacheStoreResponse attachKVCacheStore(AttachKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachKVCacheStoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the request is successful, the KVCacheStore enters the Creating state. You can call GetKVCacheStore or ListKVCacheStores to query the KVCacheStore status. The KVCacheStore becomes available when its status changes to Available.</p>
     * <ul>
     * <li>To ensure idempotence in case of network exceptions, use ClientToken. If you call the operation with the same ClientToken and the same request parameters, the same KVCacheStore ID and order ID are returned. If the request parameters change, an IdempotentParameterMismatch error is returned.</li>
     * <li>Creating a KVCacheStore generates an order. The response includes OrderId, which you can view in the Expenses and Costs console. For more information, refer to View and manage orders.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a KVCacheInstance instance.</p>
     * 
     * @param request CreateKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKVCacheStoreResponse
     */
    public CreateKVCacheStoreResponse createKVCacheStoreWithOptions(CreateKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpnZone)) {
            query.put("HpnZone", request.hpnZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKVCacheStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the request is successful, the KVCacheStore enters the Creating state. You can call GetKVCacheStore or ListKVCacheStores to query the KVCacheStore status. The KVCacheStore becomes available when its status changes to Available.</p>
     * <ul>
     * <li>To ensure idempotence in case of network exceptions, use ClientToken. If you call the operation with the same ClientToken and the same request parameters, the same KVCacheStore ID and order ID are returned. If the request parameters change, an IdempotentParameterMismatch error is returned.</li>
     * <li>Creating a KVCacheStore generates an order. The response includes OrderId, which you can view in the Expenses and Costs console. For more information, refer to View and manage orders.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a KVCacheInstance instance.</p>
     * 
     * @param request CreateKVCacheStoreRequest
     * @return CreateKVCacheStoreResponse
     */
    public CreateKVCacheStoreResponse createKVCacheStore(CreateKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKVCacheStoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The delete operation is irreversible. Data in the KVCacheStore will be erased and cannot be recovered. Proceed with caution.</p>
     * <ul>
     * <li>Billing stops after the deletion begins.</li>
     * <li>The KVCacheStore to be deleted cannot be in the Creating state.</li>
     * <li>The KVCacheStore to be deleted cannot have mount records in the Attaching or Attached state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a KVCacheInstance instance.</p>
     * 
     * @param request DeleteKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKVCacheStoreResponse
     */
    public DeleteKVCacheStoreResponse deleteKVCacheStoreWithOptions(DeleteKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvcsId)) {
            query.put("KvcsId", request.kvcsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKVCacheStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>The delete operation is irreversible. Data in the KVCacheStore will be erased and cannot be recovered. Proceed with caution.</p>
     * <ul>
     * <li>Billing stops after the deletion begins.</li>
     * <li>The KVCacheStore to be deleted cannot be in the Creating state.</li>
     * <li>The KVCacheStore to be deleted cannot have mount records in the Attaching or Attached state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a KVCacheInstance instance.</p>
     * 
     * @param request DeleteKVCacheStoreRequest
     * @return DeleteKVCacheStoreResponse
     */
    public DeleteKVCacheStoreResponse deleteKVCacheStore(DeleteKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKVCacheStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of regions where KVCacheStore is activated.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of regions where KVCacheStore is activated.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available zones for KVCacheStore in a specified region.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available zones for KVCacheStore in a specified region.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. A return status of Detaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. When no record corresponding to the specified KvcsId and VscId is found, the unmount operation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Unmounts KVCacheInstance resources from the virtualization side in batches.</p>
     * 
     * @param request DetachKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachKVCacheStoreResponse
     */
    public DetachKVCacheStoreResponse detachKVCacheStoreWithOptions(DetachKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachKVCacheStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. A return status of Detaching indicates that the request has been accepted. Call ListKVCacheStoreAttachInfo to query mount records. When no record corresponding to the specified KvcsId and VscId is found, the unmount operation is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Unmounts KVCacheInstance resources from the virtualization side in batches.</p>
     * 
     * @param request DetachKVCacheStoreRequest
     * @return DetachKVCacheStoreResponse
     */
    public DetachKVCacheStoreResponse detachKVCacheStore(DetachKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachKVCacheStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 KvCacheStore 实例详情</p>
     * 
     * @param request GetKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKVCacheStoreResponse
     */
    public GetKVCacheStoreResponse getKVCacheStoreWithOptions(GetKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvcsId)) {
            query.put("KvcsId", request.kvcsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKVCacheStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 KvCacheStore 实例详情</p>
     * 
     * @param request GetKVCacheStoreRequest
     * @return GetKVCacheStoreResponse
     */
    public GetKVCacheStoreResponse getKVCacheStore(GetKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKVCacheStoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mount information of KVCacheInstance resources in batches.</p>
     * 
     * @param request ListKVCacheStoreAttachInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKVCacheStoreAttachInfoResponse
     */
    public ListKVCacheStoreAttachInfoResponse listKVCacheStoreAttachInfoWithOptions(ListKVCacheStoreAttachInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvcsIds)) {
            query.put("KvcsIds", request.kvcsIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKVCacheStoreAttachInfo"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKVCacheStoreAttachInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mount information of KVCacheInstance resources in batches.</p>
     * 
     * @param request ListKVCacheStoreAttachInfoRequest
     * @return ListKVCacheStoreAttachInfoResponse
     */
    public ListKVCacheStoreAttachInfoResponse listKVCacheStoreAttachInfo(ListKVCacheStoreAttachInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKVCacheStoreAttachInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定 KVCacheStore 实例可用的 HpnZone 列表</p>
     * 
     * @param request ListKVCacheStoreAvailableHpnZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKVCacheStoreAvailableHpnZonesResponse
     */
    public ListKVCacheStoreAvailableHpnZonesResponse listKVCacheStoreAvailableHpnZonesWithOptions(ListKVCacheStoreAvailableHpnZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvcsIds)) {
            query.put("KvcsIds", request.kvcsIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKVCacheStoreAvailableHpnZones"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKVCacheStoreAvailableHpnZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定 KVCacheStore 实例可用的 HpnZone 列表</p>
     * 
     * @param request ListKVCacheStoreAvailableHpnZonesRequest
     * @return ListKVCacheStoreAvailableHpnZonesResponse
     */
    public ListKVCacheStoreAvailableHpnZonesResponse listKVCacheStoreAvailableHpnZones(ListKVCacheStoreAvailableHpnZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKVCacheStoreAvailableHpnZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Two pagination methods are supported: page number-based pagination (PageNumber + PageSize) and cursor-based pagination (NextToken + MaxResults). If both are specified, page number-based pagination takes precedence.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of KVCacheInstance instances.</p>
     * 
     * @param request ListKVCacheStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKVCacheStoresResponse
     */
    public ListKVCacheStoresResponse listKVCacheStoresWithOptions(ListKVCacheStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvcsIds)) {
            query.put("KvcsIds", request.kvcsIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKVCacheStores"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKVCacheStoresResponse());
    }

    /**
     * <b>description</b> :
     * <p>Two pagination methods are supported: page number-based pagination (PageNumber + PageSize) and cursor-based pagination (NextToken + MaxResults). If both are specified, page number-based pagination takes precedence.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of KVCacheInstance instances.</p>
     * 
     * @param request ListKVCacheStoresRequest
     * @return ListKVCacheStoresResponse
     */
    public ListKVCacheStoresResponse listKVCacheStores(ListKVCacheStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKVCacheStoresWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supports modifying Name, Description, and Capacity. The cluster number (HpnZone) cannot be modified after creation.</p>
     * <ul>
     * <li>Modifying Capacity triggers a specification change order, and the operation returns an OrderId. Modifying only Name or Description does not generate an order.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a KVCacheStore.</p>
     * 
     * @param request UpdateKVCacheStoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKVCacheStoreResponse
     */
    public UpdateKVCacheStoreResponse updateKVCacheStoreWithOptions(UpdateKVCacheStoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kvcsId)) {
            query.put("KvcsId", request.kvcsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKVCacheStore"),
            new TeaPair("version", "2026-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKVCacheStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supports modifying Name, Description, and Capacity. The cluster number (HpnZone) cannot be modified after creation.</p>
     * <ul>
     * <li>Modifying Capacity triggers a specification change order, and the operation returns an OrderId. Modifying only Name or Description does not generate an order.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a KVCacheStore.</p>
     * 
     * @param request UpdateKVCacheStoreRequest
     * @return UpdateKVCacheStoreResponse
     */
    public UpdateKVCacheStoreResponse updateKVCacheStore(UpdateKVCacheStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKVCacheStoreWithOptions(request, runtime);
    }
}
