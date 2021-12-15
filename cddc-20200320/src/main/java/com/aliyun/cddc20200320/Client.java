// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320;

import com.aliyun.tea.*;
import com.aliyun.cddc20200320.models.*;
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
        this._endpoint = this.getEndpoint("cddc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateDedicatedHostResponse createDedicatedHostWithOptions(CreateDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoRenew", request.autoRenew);
        query.put("ClientToken", request.clientToken);
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("HostClass", request.hostClass);
        query.put("HostName", request.hostName);
        query.put("ImageCategory", request.imageCategory);
        query.put("OsPassword", request.osPassword);
        query.put("OwnerId", request.ownerId);
        query.put("PayType", request.payType);
        query.put("Period", request.period);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UsedTime", request.usedTime);
        query.put("VSwitchId", request.vSwitchId);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedHost"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedHostResponse());
    }

    public CreateDedicatedHostResponse createDedicatedHost(CreateDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostWithOptions(request, runtime);
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccountWithOptions(CreateDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("AccountPassword", request.accountPassword);
        query.put("AccountType", request.accountType);
        query.put("BastionInstanceId", request.bastionInstanceId);
        query.put("ClientToken", request.clientToken);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedHostAccount"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedHostAccountResponse());
    }

    public CreateDedicatedHostAccountResponse createDedicatedHostAccount(CreateDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostAccountWithOptions(request, runtime);
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroupWithOptions(CreateDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationPolicy", request.allocationPolicy);
        query.put("ClientToken", request.clientToken);
        query.put("CpuAllocationRatio", request.cpuAllocationRatio);
        query.put("DedicatedHostGroupDesc", request.dedicatedHostGroupDesc);
        query.put("DiskAllocationRatio", request.diskAllocationRatio);
        query.put("Engine", request.engine);
        query.put("HostReplacePolicy", request.hostReplacePolicy);
        query.put("MemAllocationRatio", request.memAllocationRatio);
        query.put("OpenPermission", request.openPermission);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VPCId", request.VPCId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedHostGroup"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedHostGroupResponse());
    }

    public CreateDedicatedHostGroupResponse createDedicatedHostGroup(CreateDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostGroupWithOptions(request, runtime);
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccountWithOptions(DeleteDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDedicatedHostAccount"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDedicatedHostAccountResponse());
    }

    public DeleteDedicatedHostAccountResponse deleteDedicatedHostAccount(DeleteDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostAccountWithOptions(request, runtime);
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroupWithOptions(DeleteDedicatedHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDedicatedHostGroup"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDedicatedHostGroupResponse());
    }

    public DeleteDedicatedHostGroupResponse deleteDedicatedHostGroup(DeleteDedicatedHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostGroupWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttributeWithOptions(DescribeDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostAttribute"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostAttributeResponse());
    }

    public DescribeDedicatedHostAttributeResponse describeDedicatedHostAttribute(DescribeDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostAttributeWithOptions(request, runtime);
    }

    public DescribeDedicatedHostDisksResponse describeDedicatedHostDisksWithOptions(DescribeDedicatedHostDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostDisks"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostDisksResponse());
    }

    public DescribeDedicatedHostDisksResponse describeDedicatedHostDisks(DescribeDedicatedHostDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostDisksWithOptions(request, runtime);
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroupsWithOptions(DescribeDedicatedHostGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("Engine", request.engine);
        query.put("ImageCategory", request.imageCategory);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostGroups"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostGroupsResponse());
    }

    public DescribeDedicatedHostGroupsResponse describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostGroupsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationStatus", request.allocationStatus);
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("HostStatus", request.hostStatus);
        query.put("HostType", request.hostType);
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumbers", request.pageNumbers);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Tags", request.tags);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHosts"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeHostEcsLevelInfoResponse describeHostEcsLevelInfoWithOptions(DescribeHostEcsLevelInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DbType", request.dbType);
        query.put("ImageCategory", request.imageCategory);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("StorageType", request.storageType);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHostEcsLevelInfo"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHostEcsLevelInfoResponse());
    }

    public DescribeHostEcsLevelInfoResponse describeHostEcsLevelInfo(DescribeHostEcsLevelInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostEcsLevelInfoWithOptions(request, runtime);
    }

    public DescribeHostWebShellResponse describeHostWebShellWithOptions(DescribeHostWebShellRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHostWebShell"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHostWebShellResponse());
    }

    public DescribeHostWebShellResponse describeHostWebShell(DescribeHostWebShellRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostWebShellWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-03-20"),
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

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccountWithOptions(ModifyDedicatedHostAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("AccountPassword", request.accountPassword);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostAccount"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostAccountResponse());
    }

    public ModifyDedicatedHostAccountResponse modifyDedicatedHostAccount(ModifyDedicatedHostAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAccountWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationStatus", request.allocationStatus);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("HostName", request.hostName);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostAttribute"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostClassResponse modifyDedicatedHostClassWithOptions(ModifyDedicatedHostClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SwitchTime", request.switchTime);
        query.put("SwitchTimeMode", request.switchTimeMode);
        query.put("TargetClassCode", request.targetClassCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostClass"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostClassResponse());
    }

    public ModifyDedicatedHostClassResponse modifyDedicatedHostClass(ModifyDedicatedHostClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostClassWithOptions(request, runtime);
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttributeWithOptions(ModifyDedicatedHostGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationPolicy", request.allocationPolicy);
        query.put("CpuAllocationRatio", request.cpuAllocationRatio);
        query.put("DedicatedHostGroupDesc", request.dedicatedHostGroupDesc);
        query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        query.put("DiskAllocationRatio", request.diskAllocationRatio);
        query.put("HostReplacePolicy", request.hostReplacePolicy);
        query.put("MemAllocationRatio", request.memAllocationRatio);
        query.put("OpenPermission", request.openPermission);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostGroupAttribute"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostGroupAttributeResponse());
    }

    public ModifyDedicatedHostGroupAttributeResponse modifyDedicatedHostGroupAttribute(ModifyDedicatedHostGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostGroupAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostPasswordResponse modifyDedicatedHostPasswordWithOptions(ModifyDedicatedHostPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("NewPassword", request.newPassword);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostPassword"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostPasswordResponse());
    }

    public ModifyDedicatedHostPasswordResponse modifyDedicatedHostPassword(ModifyDedicatedHostPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostPasswordWithOptions(request, runtime);
    }

    public QueryHostBaseInfoByInstanceResponse queryHostBaseInfoByInstanceWithOptions(QueryHostBaseInfoByInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DBInstanceId", request.DBInstanceId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHostBaseInfoByInstance"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHostBaseInfoByInstanceResponse());
    }

    public QueryHostBaseInfoByInstanceResponse queryHostBaseInfoByInstance(QueryHostBaseInfoByInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHostBaseInfoByInstanceWithOptions(request, runtime);
    }

    public QueryHostInstanceConsoleInfoResponse queryHostInstanceConsoleInfoWithOptions(QueryHostInstanceConsoleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHostInstanceConsoleInfo"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHostInstanceConsoleInfoResponse());
    }

    public QueryHostInstanceConsoleInfoResponse queryHostInstanceConsoleInfo(QueryHostInstanceConsoleInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHostInstanceConsoleInfoWithOptions(request, runtime);
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHostWithOptions(ReplaceDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("FailoverMode", request.failoverMode);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceDedicatedHost"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceDedicatedHostResponse());
    }

    public ReplaceDedicatedHostResponse replaceDedicatedHost(ReplaceDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceDedicatedHostWithOptions(request, runtime);
    }

    public RestartDedicatedHostResponse restartDedicatedHostWithOptions(RestartDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("FailoverMode", request.failoverMode);
        query.put("ForceStop", request.forceStop);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDedicatedHost"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDedicatedHostResponse());
    }

    public RestartDedicatedHostResponse restartDedicatedHost(RestartDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDedicatedHostWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
