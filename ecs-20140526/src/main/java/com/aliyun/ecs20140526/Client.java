// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526;

import com.aliyun.tea.*;
import com.aliyun.ecs20140526.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-west-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ecs.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ecs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ecs.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ecs.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ecs.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AcceptInquiredSystemEventResponse acceptInquiredSystemEventWithOptions(AcceptInquiredSystemEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("EventId", request.eventId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptInquiredSystemEvent"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptInquiredSystemEventResponse());
    }

    public AcceptInquiredSystemEventResponse acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptInquiredSystemEventWithOptions(request, runtime);
    }

    public ActivateRouterInterfaceResponse activateRouterInterfaceWithOptions(ActivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateRouterInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateRouterInterfaceResponse());
    }

    public ActivateRouterInterfaceResponse activateRouterInterface(ActivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateRouterInterfaceWithOptions(request, runtime);
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIpsWithOptions(AddBandwidthPackageIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("IpCount", request.ipCount);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBandwidthPackageIps"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBandwidthPackageIpsResponse());
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBandwidthPackageIpsWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTags"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHostsWithOptions(AllocateDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ZoneId", request.zoneId);
        query.put("DedicatedHostName", request.dedicatedHostName);
        query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        query.put("DedicatedHostType", request.dedicatedHostType);
        query.put("ActionOnMaintenance", request.actionOnMaintenance);
        query.put("Description", request.description);
        query.put("AutoPlacement", request.autoPlacement);
        query.put("CpuOverCommitRatio", request.cpuOverCommitRatio);
        query.put("MinQuantity", request.minQuantity);
        query.put("ChargeType", request.chargeType);
        query.put("Quantity", request.quantity);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("AutoRenew", request.autoRenew);
        query.put("AutoRenewPeriod", request.autoRenewPeriod);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateDedicatedHosts"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateDedicatedHostsResponse());
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHosts(AllocateDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateDedicatedHostsWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("Bandwidth", request.bandwidth);
        query.put("ISP", request.ISP);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("ActivityId", request.activityId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateEipAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddressWithOptions(AllocatePublicIpAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("IpAddress", request.ipAddress);
        query.put("VlanId", request.vlanId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocatePublicIpAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocatePublicIpAddressResponse());
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddress(AllocatePublicIpAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePublicIpAddressWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("regionId", request.regionId);
        query.put("autoSnapshotPolicyId", request.autoSnapshotPolicyId);
        query.put("diskIds", request.diskIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAutoSnapshotPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public AssignIpv6AddressesResponse assignIpv6AddressesWithOptions(AssignIpv6AddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("Ipv6AddressCount", request.ipv6AddressCount);
        query.put("Ipv6Address", request.ipv6Address);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignIpv6Addresses"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignIpv6AddressesResponse());
    }

    public AssignIpv6AddressesResponse assignIpv6Addresses(AssignIpv6AddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignIpv6AddressesWithOptions(request, runtime);
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddressesWithOptions(AssignPrivateIpAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("SecondaryPrivateIpAddressCount", request.secondaryPrivateIpAddressCount);
        query.put("ClientToken", request.clientToken);
        query.put("PrivateIpAddress", request.privateIpAddress);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignPrivateIpAddresses"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignPrivateIpAddressesResponse());
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignPrivateIpAddressesWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceType", request.instanceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateEipAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AssociateHaVipResponse associateHaVipWithOptions(AssociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("HaVipId", request.haVipId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateHaVip"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateHaVipResponse());
    }

    public AssociateHaVipResponse associateHaVip(AssociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateHaVipWithOptions(request, runtime);
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpcWithOptions(AttachClassicLinkVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachClassicLinkVpc"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachClassicLinkVpcResponse());
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpc(AttachClassicLinkVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachClassicLinkVpcWithOptions(request, runtime);
    }

    public AttachDiskResponse attachDiskWithOptions(AttachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("DiskId", request.diskId);
        query.put("Device", request.device);
        query.put("DeleteWithInstance", request.deleteWithInstance);
        query.put("Bootable", request.bootable);
        query.put("Password", request.password);
        query.put("KeyPairName", request.keyPairName);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDiskResponse());
    }

    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRoleWithOptions(AttachInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RamRoleName", request.ramRoleName);
        query.put("InstanceIds", request.instanceIds);
        query.put("Policy", request.policy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachInstanceRamRole"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachInstanceRamRoleResponse());
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRole(AttachInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachInstanceRamRoleWithOptions(request, runtime);
    }

    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairName", request.keyPairName);
        query.put("InstanceIds", request.instanceIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachKeyPair"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachKeyPairResponse());
    }

    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    public AttachNetworkInterfaceResponse attachNetworkInterfaceWithOptions(AttachNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("InstanceId", request.instanceId);
        query.put("TrunkNetworkInstanceId", request.trunkNetworkInstanceId);
        query.put("WaitForNetworkConfigurationReady", request.waitForNetworkConfigurationReady);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachNetworkInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachNetworkInterfaceResponse());
    }

    public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachNetworkInterfaceWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("IpProtocol", request.ipProtocol);
        query.put("PortRange", request.portRange);
        query.put("SourceGroupId", request.sourceGroupId);
        query.put("SourceGroupOwnerId", request.sourceGroupOwnerId);
        query.put("SourceGroupOwnerAccount", request.sourceGroupOwnerAccount);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("IpProtocol", request.ipProtocol);
        query.put("PortRange", request.portRange);
        query.put("DestGroupId", request.destGroupId);
        query.put("DestGroupOwnerId", request.destGroupOwnerId);
        query.put("DestGroupOwnerAccount", request.destGroupOwnerAccount);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroupEgress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("regionId", request.regionId);
        query.put("diskIds", request.diskIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAutoSnapshotPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CancelCopyImageResponse cancelCopyImageWithOptions(CancelCopyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCopyImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCopyImageResponse());
    }

    public CancelCopyImageResponse cancelCopyImage(CancelCopyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCopyImageWithOptions(request, runtime);
    }

    public CancelImagePipelineExecutionResponse cancelImagePipelineExecutionWithOptions(CancelImagePipelineExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("RegionId", request.regionId);
        query.put("ExecutionId", request.executionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelImagePipelineExecution"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelImagePipelineExecutionResponse());
    }

    public CancelImagePipelineExecutionResponse cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelImagePipelineExecutionWithOptions(request, runtime);
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnectionWithOptions(CancelPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPhysicalConnectionResponse());
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnection(CancelPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPhysicalConnectionWithOptions(request, runtime);
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEventsWithOptions(CancelSimulatedSystemEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("EventId", request.eventId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelSimulatedSystemEvents"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelSimulatedSystemEventsResponse());
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelSimulatedSystemEventsWithOptions(request, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    public ConnectRouterInterfaceResponse connectRouterInterfaceWithOptions(ConnectRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConnectRouterInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConnectRouterInterfaceResponse());
    }

    public ConnectRouterInterfaceResponse connectRouterInterface(ConnectRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.connectRouterInterfaceWithOptions(request, runtime);
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEipWithOptions(ConvertNatPublicIpToEipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertNatPublicIpToEip"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertNatPublicIpToEipResponse());
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertNatPublicIpToEipWithOptions(request, runtime);
    }

    public CopyImageResponse copyImageWithOptions(CopyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DestinationImageName", request.destinationImageName);
        query.put("DestinationDescription", request.destinationDescription);
        query.put("ImageId", request.imageId);
        query.put("RegionId", request.regionId);
        query.put("DestinationRegionId", request.destinationRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Encrypted", request.encrypted);
        query.put("KMSKeyId", request.KMSKeyId);
        query.put("EncryptAlgorithm", request.encryptAlgorithm);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyImageResponse());
    }

    public CopyImageResponse copyImage(CopyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyImageWithOptions(request, runtime);
    }

    public CopySnapshotResponse copySnapshotWithOptions(CopySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("DestinationRegionId", request.destinationRegionId);
        query.put("SnapshotId", request.snapshotId);
        query.put("DestinationSnapshotName", request.destinationSnapshotName);
        query.put("DestinationSnapshotDescription", request.destinationSnapshotDescription);
        query.put("RetentionDays", request.retentionDays);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopySnapshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopySnapshotResponse());
    }

    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copySnapshotWithOptions(request, runtime);
    }

    public CreateActivationResponse createActivationWithOptions(CreateActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceName", request.instanceName);
        query.put("Description", request.description);
        query.put("InstanceCount", request.instanceCount);
        query.put("TimeToLiveInHours", request.timeToLiveInHours);
        query.put("IpAddressRange", request.ipAddressRange);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateActivation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateActivationResponse());
    }

    public CreateActivationResponse createActivation(CreateActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createActivationWithOptions(request, runtime);
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroupWithOptions(CreateAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("AutoProvisioningGroupName", request.autoProvisioningGroupName);
        query.put("AutoProvisioningGroupType", request.autoProvisioningGroupType);
        query.put("SpotAllocationStrategy", request.spotAllocationStrategy);
        query.put("SpotInstanceInterruptionBehavior", request.spotInstanceInterruptionBehavior);
        query.put("SpotInstancePoolsToUseCount", request.spotInstancePoolsToUseCount);
        query.put("PayAsYouGoAllocationStrategy", request.payAsYouGoAllocationStrategy);
        query.put("ExcessCapacityTerminationPolicy", request.excessCapacityTerminationPolicy);
        query.put("ValidFrom", request.validFrom);
        query.put("ValidUntil", request.validUntil);
        query.put("TerminateInstancesWithExpiration", request.terminateInstancesWithExpiration);
        query.put("TerminateInstances", request.terminateInstances);
        query.put("MaxSpotPrice", request.maxSpotPrice);
        query.put("TotalTargetCapacity", request.totalTargetCapacity);
        query.put("PayAsYouGoTargetCapacity", request.payAsYouGoTargetCapacity);
        query.put("SpotTargetCapacity", request.spotTargetCapacity);
        query.put("DefaultTargetCapacityType", request.defaultTargetCapacityType);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("LaunchTemplateConfig", request.launchTemplateConfig);
        query.put("SystemDiskConfig", request.systemDiskConfig);
        query.put("DataDiskConfig", request.dataDiskConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoProvisioningGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoProvisioningGroupResponse());
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoProvisioningGroupWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("regionId", request.regionId);
        query.put("autoSnapshotPolicyName", request.autoSnapshotPolicyName);
        query.put("timePoints", request.timePoints);
        query.put("repeatWeekdays", request.repeatWeekdays);
        query.put("retentionDays", request.retentionDays);
        query.put("EnableCrossRegionCopy", request.enableCrossRegionCopy);
        query.put("TargetCopyRegions", request.targetCopyRegions);
        query.put("CopiedSnapshotsRetentionDays", request.copiedSnapshotsRetentionDays);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoSnapshotPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateCapacityReservationResponse createCapacityReservationWithOptions(CreateCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("InstanceAmount", request.instanceAmount);
        query.put("InstanceType", request.instanceType);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("EndTimeType", request.endTimeType);
        query.put("Platform", request.platform);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCapacityReservation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCapacityReservationResponse());
    }

    public CreateCapacityReservationResponse createCapacityReservation(CreateCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCapacityReservationWithOptions(request, runtime);
    }

    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("Type", request.type);
        query.put("CommandContent", request.commandContent);
        query.put("WorkingDir", request.workingDir);
        query.put("Timeout", request.timeout);
        query.put("EnableParameter", request.enableParameter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommandResponse());
    }

    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostClusterWithOptions(CreateDedicatedHostClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DryRun", request.dryRun);
        query.put("Tag", request.tag);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ZoneId", request.zoneId);
        query.put("DedicatedHostClusterName", request.dedicatedHostClusterName);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedHostCluster"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedHostClusterResponse());
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostCluster(CreateDedicatedHostClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostClusterWithOptions(request, runtime);
    }

    public CreateDemandResponse createDemandWithOptions(CreateDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DemandName", request.demandName);
        query.put("DemandDescription", request.demandDescription);
        query.put("InstanceType", request.instanceType);
        query.put("Amount", request.amount);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDemand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDemandResponse());
    }

    public CreateDemandResponse createDemand(CreateDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDemandWithOptions(request, runtime);
    }

    public CreateDeploymentSetResponse createDeploymentSetWithOptions(CreateDeploymentSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("OnUnableToRedeployFailedInstance", request.onUnableToRedeployFailedInstance);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("DeploymentSetName", request.deploymentSetName);
        query.put("Domain", request.domain);
        query.put("Granularity", request.granularity);
        query.put("Strategy", request.strategy);
        query.put("GroupCount", request.groupCount);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeploymentSet"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentSetResponse());
    }

    public CreateDeploymentSetResponse createDeploymentSet(CreateDeploymentSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentSetWithOptions(request, runtime);
    }

    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("SnapshotId", request.snapshotId);
        query.put("DiskName", request.diskName);
        query.put("Size", request.size);
        query.put("DiskCategory", request.diskCategory);
        query.put("Description", request.description);
        query.put("Encrypted", request.encrypted);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("KMSKeyId", request.KMSKeyId);
        query.put("PerformanceLevel", request.performanceLevel);
        query.put("AdvancedFeatures", request.advancedFeatures);
        query.put("StorageSetId", request.storageSetId);
        query.put("EncryptAlgorithm", request.encryptAlgorithm);
        query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        query.put("Tag", request.tag);
        query.put("Arn", request.arn);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskResponse());
    }

    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    public CreateElasticityAssuranceResponse createElasticityAssuranceWithOptions(CreateElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("AssuranceTimes", request.assuranceTimes);
        query.put("InstanceAmount", request.instanceAmount);
        query.put("InstanceCpuCoreCount", request.instanceCpuCoreCount);
        query.put("StartTime", request.startTime);
        query.put("ZoneId", request.zoneId);
        query.put("InstanceType", request.instanceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticityAssurance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateElasticityAssuranceResponse());
    }

    public CreateElasticityAssuranceResponse createElasticityAssurance(CreateElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createElasticityAssuranceWithOptions(request, runtime);
    }

    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ForwardTableId", request.forwardTableId);
        query.put("ExternalIp", request.externalIp);
        query.put("ExternalPort", request.externalPort);
        query.put("InternalIp", request.internalIp);
        query.put("InternalPort", request.internalPort);
        query.put("IpProtocol", request.ipProtocol);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForwardEntry"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForwardEntryResponse());
    }

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    public CreateHaVipResponse createHaVipWithOptions(CreateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("IpAddress", request.ipAddress);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHaVip"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHaVipResponse());
    }

    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHaVipWithOptions(request, runtime);
    }

    public CreateHpcClusterResponse createHpcClusterWithOptions(CreateHpcClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHpcCluster"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHpcClusterResponse());
    }

    public CreateHpcClusterResponse createHpcCluster(CreateHpcClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHpcClusterWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("SnapshotId", request.snapshotId);
        query.put("InstanceId", request.instanceId);
        query.put("ImageName", request.imageName);
        query.put("ImageFamily", request.imageFamily);
        query.put("ImageVersion", request.imageVersion);
        query.put("Description", request.description);
        query.put("Platform", request.platform);
        query.put("Architecture", request.architecture);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("DiskDeviceMapping", request.diskDeviceMapping);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateImageComponentResponse createImageComponentWithOptions(CreateImageComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("SystemType", request.systemType);
        query.put("ComponentType", request.componentType);
        query.put("Content", request.content);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageComponent"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageComponentResponse());
    }

    public CreateImageComponentResponse createImageComponent(CreateImageComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageComponentWithOptions(request, runtime);
    }

    public CreateImagePipelineResponse createImagePipelineWithOptions(CreateImagePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("BaseImageType", request.baseImageType);
        query.put("BaseImage", request.baseImage);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ImageName", request.imageName);
        query.put("VSwitchId", request.vSwitchId);
        query.put("InstanceType", request.instanceType);
        query.put("SystemDiskSize", request.systemDiskSize);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("DeleteInstanceOnFailure", request.deleteInstanceOnFailure);
        query.put("BuildContent", request.buildContent);
        query.put("ClientToken", request.clientToken);
        query.put("AddAccount", request.addAccount);
        query.put("ToRegionId", request.toRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImagePipeline"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImagePipelineResponse());
    }

    public CreateImagePipelineResponse createImagePipeline(CreateImagePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImagePipelineWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("ImageFamily", request.imageFamily);
        query.put("InstanceType", request.instanceType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("InstanceName", request.instanceName);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("AutoRenew", request.autoRenew);
        query.put("AutoRenewPeriod", request.autoRenewPeriod);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("HostName", request.hostName);
        query.put("Password", request.password);
        query.put("PasswordInherit", request.passwordInherit);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("DeploymentSetGroupNo", request.deploymentSetGroupNo);
        query.put("ZoneId", request.zoneId);
        query.put("ClusterId", request.clusterId);
        query.put("ClientToken", request.clientToken);
        query.put("VlanId", request.vlanId);
        query.put("InnerIpAddress", request.innerIpAddress);
        query.put("NodeControllerId", request.nodeControllerId);
        query.put("Description", request.description);
        query.put("VSwitchId", request.vSwitchId);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("IoOptimized", request.ioOptimized);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UseAdditionalService", request.useAdditionalService);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("UserData", request.userData);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("KeyPairName", request.keyPairName);
        query.put("SpotPriceLimit", request.spotPriceLimit);
        query.put("SpotDuration", request.spotDuration);
        query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        query.put("RamRoleName", request.ramRoleName);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("HpcClusterId", request.hpcClusterId);
        query.put("DryRun", request.dryRun);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("CreditSpecification", request.creditSpecification);
        query.put("DeletionProtection", request.deletionProtection);
        query.put("Affinity", request.affinity);
        query.put("Tenancy", request.tenancy);
        query.put("StorageSetId", request.storageSetId);
        query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        query.put("HttpEndpoint", request.httpEndpoint);
        query.put("HttpTokens", request.httpTokens);
        query.put("HttpPutResponseHopLimit", request.httpPutResponseHopLimit);
        query.put("DataDisk", request.dataDisk);
        query.put("Arn", request.arn);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairName", request.keyPairName);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public CreateLaunchTemplateResponse createLaunchTemplateWithOptions(CreateLaunchTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("VersionDescription", request.versionDescription);
        query.put("ImageId", request.imageId);
        query.put("ImageOwnerAlias", request.imageOwnerAlias);
        query.put("PasswordInherit", request.passwordInherit);
        query.put("InstanceType", request.instanceType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("VpcId", request.vpcId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("InstanceName", request.instanceName);
        query.put("Description", request.description);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("HostName", request.hostName);
        query.put("ZoneId", request.zoneId);
        query.put("IoOptimized", request.ioOptimized);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Period", request.period);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("EnableVmOsConfig", request.enableVmOsConfig);
        query.put("NetworkType", request.networkType);
        query.put("UserData", request.userData);
        query.put("KeyPairName", request.keyPairName);
        query.put("RamRoleName", request.ramRoleName);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("SpotPriceLimit", request.spotPriceLimit);
        query.put("SpotDuration", request.spotDuration);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("TemplateResourceGroupId", request.templateResourceGroupId);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("DataDisk", request.dataDisk);
        query.put("NetworkInterface", request.networkInterface);
        query.put("Tag", request.tag);
        query.put("SecurityGroupIds", request.securityGroupIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLaunchTemplate"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLaunchTemplateResponse());
    }

    public CreateLaunchTemplateResponse createLaunchTemplate(CreateLaunchTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLaunchTemplateWithOptions(request, runtime);
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersionWithOptions(CreateLaunchTemplateVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("VersionDescription", request.versionDescription);
        query.put("ImageId", request.imageId);
        query.put("ImageOwnerAlias", request.imageOwnerAlias);
        query.put("PasswordInherit", request.passwordInherit);
        query.put("InstanceType", request.instanceType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("VpcId", request.vpcId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("InstanceName", request.instanceName);
        query.put("Description", request.description);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("HostName", request.hostName);
        query.put("ZoneId", request.zoneId);
        query.put("IoOptimized", request.ioOptimized);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Period", request.period);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("EnableVmOsConfig", request.enableVmOsConfig);
        query.put("NetworkType", request.networkType);
        query.put("UserData", request.userData);
        query.put("KeyPairName", request.keyPairName);
        query.put("RamRoleName", request.ramRoleName);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("SpotPriceLimit", request.spotPriceLimit);
        query.put("SpotDuration", request.spotDuration);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("DataDisk", request.dataDisk);
        query.put("NetworkInterface", request.networkInterface);
        query.put("Tag", request.tag);
        query.put("SecurityGroupIds", request.securityGroupIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLaunchTemplateVersion"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLaunchTemplateVersionResponse());
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLaunchTemplateVersionWithOptions(request, runtime);
    }

    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("VpcId", request.vpcId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("BandwidthPackage", request.bandwidthPackage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNatGateway"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNatGatewayResponse());
    }

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    public CreateNetworkInterfaceResponse createNetworkInterfaceWithOptions(CreateNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("PrimaryIpAddress", request.primaryIpAddress);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("NetworkInterfaceName", request.networkInterfaceName);
        query.put("Description", request.description);
        query.put("Visible", request.visible);
        query.put("InstanceType", request.instanceType);
        query.put("BusinessType", request.businessType);
        query.put("SecondaryPrivateIpAddressCount", request.secondaryPrivateIpAddressCount);
        query.put("QueueNumber", request.queueNumber);
        query.put("ClientToken", request.clientToken);
        query.put("SecurityGroupIds", request.securityGroupIds);
        query.put("PrivateIpAddress", request.privateIpAddress);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkInterfaceResponse());
    }

    public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkInterfaceWithOptions(request, runtime);
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionWithOptions(CreateNetworkInterfacePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("AccountId", request.accountId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("Permission", request.permission);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkInterfacePermission"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkInterfacePermissionResponse());
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public CreatePhysicalConnectionResponse createPhysicalConnectionWithOptions(CreatePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AccessPointId", request.accessPointId);
        query.put("Type", request.type);
        query.put("LineOperator", request.lineOperator);
        query.put("bandwidth", request.bandwidth);
        query.put("PeerLocation", request.peerLocation);
        query.put("PortType", request.portType);
        query.put("RedundantPhysicalConnectionId", request.redundantPhysicalConnectionId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("CircuitCode", request.circuitCode);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePhysicalConnectionResponse());
    }

    public CreatePhysicalConnectionResponse createPhysicalConnection(CreatePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhysicalConnectionWithOptions(request, runtime);
    }

    public CreateResource02Response createResource02WithOptions(CreateResource02Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Status", request.status);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource02"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResource02Response());
    }

    public CreateResource02Response createResource02(CreateResource02Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResource02WithOptions(request, runtime);
    }

    public CreateRouteEntryResponse createRouteEntryWithOptions(CreateRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouteTableId", request.routeTableId);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("NextHopId", request.nextHopId);
        query.put("ClientToken", request.clientToken);
        query.put("NextHopType", request.nextHopType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("NextHopList", request.nextHopList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRouteEntry"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouteEntryResponse());
    }

    public CreateRouteEntryResponse createRouteEntry(CreateRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouteEntryWithOptions(request, runtime);
    }

    public CreateRouterInterfaceResponse createRouterInterfaceWithOptions(CreateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("Role", request.role);
        query.put("OppositeRegionId", request.oppositeRegionId);
        query.put("Spec", request.spec);
        query.put("RouterType", request.routerType);
        query.put("RouterId", request.routerId);
        query.put("OppositeInterfaceId", request.oppositeInterfaceId);
        query.put("OppositeRouterId", request.oppositeRouterId);
        query.put("OppositeRouterType", request.oppositeRouterType);
        query.put("OppositeInterfaceOwnerId", request.oppositeInterfaceOwnerId);
        query.put("HealthCheckSourceIp", request.healthCheckSourceIp);
        query.put("HealthCheckTargetIp", request.healthCheckTargetIp);
        query.put("AccessPointId", request.accessPointId);
        query.put("OppositeAccessPointId", request.oppositeAccessPointId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("Period", request.period);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("AutoPay", request.autoPay);
        query.put("PricingCycle", request.pricingCycle);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRouterInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouterInterfaceResponse());
    }

    public CreateRouterInterfaceResponse createRouterInterface(CreateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouterInterfaceWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("VpcId", request.vpcId);
        query.put("SecurityGroupType", request.securityGroupType);
        query.put("ServiceManaged", request.serviceManaged);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEventsWithOptions(CreateSimulatedSystemEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("EventType", request.eventType);
        query.put("NotBefore", request.notBefore);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimulatedSystemEvents"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimulatedSystemEventsResponse());
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimulatedSystemEventsWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("SnapshotName", request.snapshotName);
        query.put("Description", request.description);
        query.put("RetentionDays", request.retentionDays);
        query.put("Category", request.category);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("InstantAccess", request.instantAccess);
        query.put("InstantAccessRetentionDays", request.instantAccessRetentionDays);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public CreateSnapshotGroupResponse createSnapshotGroupWithOptions(CreateSnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("InstantAccess", request.instantAccess);
        query.put("InstantAccessRetentionDays", request.instantAccessRetentionDays);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ExcludeDiskId", request.excludeDiskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshotGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotGroupResponse());
    }

    public CreateSnapshotGroupResponse createSnapshotGroup(CreateSnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotGroupWithOptions(request, runtime);
    }

    public CreateStorageSetResponse createStorageSetWithOptions(CreateStorageSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("StorageSetName", request.storageSetName);
        query.put("Description", request.description);
        query.put("MaxPartitionNumber", request.maxPartitionNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStorageSet"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStorageSetResponse());
    }

    public CreateStorageSetResponse createStorageSet(CreateStorageSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStorageSetWithOptions(request, runtime);
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouterWithOptions(CreateVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("VbrOwnerId", request.vbrOwnerId);
        query.put("VlanId", request.vlanId);
        query.put("CircuitCode", request.circuitCode);
        query.put("LocalGatewayIp", request.localGatewayIp);
        query.put("PeerGatewayIp", request.peerGatewayIp);
        query.put("PeeringSubnetMask", request.peeringSubnetMask);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualBorderRouter"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualBorderRouterResponse());
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualBorderRouterWithOptions(request, runtime);
    }

    public CreateVpcResponse createVpcWithOptions(CreateVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("CidrBlock", request.cidrBlock);
        query.put("VpcName", request.vpcName);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpc"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ZoneId", request.zoneId);
        query.put("CidrBlock", request.cidrBlock);
        query.put("VpcId", request.vpcId);
        query.put("RegionId", request.regionId);
        query.put("VSwitchName", request.vSwitchName);
        query.put("Description", request.description);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVSwitch"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterfaceWithOptions(DeactivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateRouterInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateRouterInterfaceResponse());
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterface(DeactivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactivateRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteActivationResponse deleteActivationWithOptions(DeleteActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ActivationId", request.activationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteActivation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteActivationResponse());
    }

    public DeleteActivationResponse deleteActivation(DeleteActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteActivationWithOptions(request, runtime);
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroupWithOptions(DeleteAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("AutoProvisioningGroupId", request.autoProvisioningGroupId);
        query.put("TerminateInstances", request.terminateInstances);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoProvisioningGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoProvisioningGroupResponse());
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoProvisioningGroupWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("regionId", request.regionId);
        query.put("autoSnapshotPolicyId", request.autoSnapshotPolicyId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoSnapshotPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBandwidthPackage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteCommandResponse deleteCommandWithOptions(DeleteCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("CommandId", request.commandId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCommand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCommandResponse());
    }

    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommandWithOptions(request, runtime);
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostClusterWithOptions(DeleteDedicatedHostClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDedicatedHostCluster"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDedicatedHostClusterResponse());
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostClusterWithOptions(request, runtime);
    }

    public DeleteDemandResponse deleteDemandWithOptions(DeleteDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("DemandId", request.demandId);
        query.put("Reason", request.reason);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDemand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDemandResponse());
    }

    public DeleteDemandResponse deleteDemand(DeleteDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDemandWithOptions(request, runtime);
    }

    public DeleteDeploymentSetResponse deleteDeploymentSetWithOptions(DeleteDeploymentSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeploymentSet"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeploymentSetResponse());
    }

    public DeleteDeploymentSetResponse deleteDeploymentSet(DeleteDeploymentSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeploymentSetWithOptions(request, runtime);
    }

    public DeleteDiskResponse deleteDiskWithOptions(DeleteDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiskResponse());
    }

    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDiskWithOptions(request, runtime);
    }

    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ForwardTableId", request.forwardTableId);
        query.put("ForwardEntryId", request.forwardEntryId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteForwardEntry"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteForwardEntryResponse());
    }

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    public DeleteHaVipResponse deleteHaVipWithOptions(DeleteHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("HaVipId", request.haVipId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHaVip"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHaVipResponse());
    }

    public DeleteHaVipResponse deleteHaVip(DeleteHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHaVipWithOptions(request, runtime);
    }

    public DeleteHpcClusterResponse deleteHpcClusterWithOptions(DeleteHpcClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("HpcClusterId", request.hpcClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHpcCluster"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHpcClusterResponse());
    }

    public DeleteHpcClusterResponse deleteHpcCluster(DeleteHpcClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHpcClusterWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("Force", request.force);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteImageComponentResponse deleteImageComponentWithOptions(DeleteImageComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("RegionId", request.regionId);
        query.put("ImageComponentId", request.imageComponentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImageComponent"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageComponentResponse());
    }

    public DeleteImageComponentResponse deleteImageComponent(DeleteImageComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageComponentWithOptions(request, runtime);
    }

    public DeleteImagePipelineResponse deleteImagePipelineWithOptions(DeleteImagePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("RegionId", request.regionId);
        query.put("ImagePipelineId", request.imagePipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImagePipeline"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagePipelineResponse());
    }

    public DeleteImagePipelineResponse deleteImagePipeline(DeleteImagePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImagePipelineWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Force", request.force);
        query.put("TerminateSubscription", request.terminateSubscription);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Force", request.force);
        query.put("TerminateSubscription", request.terminateSubscription);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstancesResponse());
    }

    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstancesWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairNames", request.keyPairNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplateWithOptions(DeleteLaunchTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLaunchTemplate"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLaunchTemplateResponse());
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplate(DeleteLaunchTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLaunchTemplateWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionWithOptions(DeleteLaunchTemplateVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("DeleteVersion", request.deleteVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLaunchTemplateVersion"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLaunchTemplateVersionResponse());
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLaunchTemplateVersionWithOptions(request, runtime);
    }

    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("NatGatewayId", request.natGatewayId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNatGateway"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNatGatewayResponse());
    }

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterfaceWithOptions(DeleteNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkInterfaceResponse());
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkInterfaceWithOptions(request, runtime);
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermissionWithOptions(DeleteNetworkInterfacePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfacePermissionId", request.networkInterfacePermissionId);
        query.put("Force", request.force);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkInterfacePermission"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkInterfacePermissionResponse());
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnectionWithOptions(DeletePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePhysicalConnectionResponse());
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnection(DeletePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhysicalConnectionWithOptions(request, runtime);
    }

    public DeleteRouteEntryResponse deleteRouteEntryWithOptions(DeleteRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouteTableId", request.routeTableId);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("NextHopId", request.nextHopId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("NextHopList", request.nextHopList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteEntry"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteEntryResponse());
    }

    public DeleteRouteEntryResponse deleteRouteEntry(DeleteRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteEntryWithOptions(request, runtime);
    }

    public DeleteRouterInterfaceResponse deleteRouterInterfaceWithOptions(DeleteRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouterInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouterInterfaceResponse());
    }

    public DeleteRouterInterfaceResponse deleteRouterInterface(DeleteRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SnapshotId", request.snapshotId);
        query.put("Force", request.force);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteSnapshotGroupResponse deleteSnapshotGroupWithOptions(DeleteSnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("SnapshotGroupId", request.snapshotGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshotGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotGroupResponse());
    }

    public DeleteSnapshotGroupResponse deleteSnapshotGroup(DeleteSnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotGroupWithOptions(request, runtime);
    }

    public DeleteStorageSetResponse deleteStorageSetWithOptions(DeleteStorageSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("StorageSetId", request.storageSetId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStorageSet"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStorageSetResponse());
    }

    public DeleteStorageSetResponse deleteStorageSet(DeleteStorageSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStorageSetWithOptions(request, runtime);
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterWithOptions(DeleteVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("VbrId", request.vbrId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualBorderRouter"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualBorderRouterResponse());
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualBorderRouterWithOptions(request, runtime);
    }

    public DeleteVpcResponse deleteVpcWithOptions(DeleteVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VpcId", request.vpcId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpc"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVSwitch"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeregisterManagedInstanceResponse deregisterManagedInstanceWithOptions(DeregisterManagedInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterManagedInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterManagedInstanceResponse());
    }

    public DeregisterManagedInstanceResponse deregisterManagedInstance(DeregisterManagedInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterManagedInstanceWithOptions(request, runtime);
    }

    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessPoints"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessPointsResponse());
    }

    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    public DescribeAccountAttributesResponse describeAccountAttributesWithOptions(DescribeAccountAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("AttributeName", request.attributeName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountAttributes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountAttributesResponse());
    }

    public DescribeAccountAttributesResponse describeAccountAttributes(DescribeAccountAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountAttributesWithOptions(request, runtime);
    }

    public DescribeActivationsResponse describeActivationsWithOptions(DescribeActivationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ActivationId", request.activationId);
        query.put("InstanceName", request.instanceName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActivations"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActivationsResponse());
    }

    public DescribeActivationsResponse describeActivations(DescribeActivationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActivationsWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryWithOptions(DescribeAutoProvisioningGroupHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AutoProvisioningGroupId", request.autoProvisioningGroupId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoProvisioningGroupHistory"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoProvisioningGroupHistoryResponse());
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupHistoryWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesWithOptions(DescribeAutoProvisioningGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AutoProvisioningGroupId", request.autoProvisioningGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoProvisioningGroupInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoProvisioningGroupInstancesResponse());
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupInstancesWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsWithOptions(DescribeAutoProvisioningGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AutoProvisioningGroupName", request.autoProvisioningGroupName);
        query.put("AutoProvisioningGroupId", request.autoProvisioningGroupId);
        query.put("AutoProvisioningGroupStatus", request.autoProvisioningGroupStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoProvisioningGroups"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoProvisioningGroupsResponse());
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupsWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExWithOptions(DescribeAutoSnapshotPolicyExRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoSnapshotPolicyEx"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotPolicyExResponse());
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("SpotDuration", request.spotDuration);
        query.put("DestinationResource", request.destinationResource);
        query.put("ZoneId", request.zoneId);
        query.put("IoOptimized", request.ioOptimized);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("InstanceType", request.instanceType);
        query.put("SystemDiskCategory", request.systemDiskCategory);
        query.put("DataDiskCategory", request.dataDiskCategory);
        query.put("NetworkCategory", request.networkCategory);
        query.put("Cores", request.cores);
        query.put("Memory", request.memory);
        query.put("ResourceType", request.resourceType);
        query.put("Scope", request.scope);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitationWithOptions(DescribeBandwidthLimitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("InstanceType", request.instanceType);
        query.put("ResourceId", request.resourceId);
        query.put("OperationType", request.operationType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwidthLimitation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwidthLimitationResponse());
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitation(DescribeBandwidthLimitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthLimitationWithOptions(request, runtime);
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackagesWithOptions(DescribeBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("NatGatewayId", request.natGatewayId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwidthPackages"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwidthPackagesResponse());
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackages(DescribeBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthPackagesWithOptions(request, runtime);
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstancesWithOptions(DescribeCapacityReservationInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCapacityReservationInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCapacityReservationInstancesResponse());
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCapacityReservationInstancesWithOptions(request, runtime);
    }

    public DescribeCapacityReservationsResponse describeCapacityReservationsWithOptions(DescribeCapacityReservationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Platform", request.platform);
        query.put("InstanceType", request.instanceType);
        query.put("ZoneId", request.zoneId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCapacityReservations"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCapacityReservationsResponse());
    }

    public DescribeCapacityReservationsResponse describeCapacityReservations(DescribeCapacityReservationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCapacityReservationsWithOptions(request, runtime);
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstancesWithOptions(DescribeClassicLinkInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("VpcId", request.vpcId);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClassicLinkInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClassicLinkInstancesResponse());
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClassicLinkInstancesWithOptions(request, runtime);
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatusWithOptions(DescribeCloudAssistantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("OSType", request.OSType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudAssistantStatus"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudAssistantStatusResponse());
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudAssistantStatusWithOptions(request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusters"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DescribeCommandsResponse describeCommandsWithOptions(DescribeCommandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Provider", request.provider);
        query.put("CommandId", request.commandId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("Type", request.type);
        query.put("ContentEncoding", request.contentEncoding);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommands"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommandsResponse());
    }

    public DescribeCommandsResponse describeCommands(DescribeCommandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCommandsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewWithOptions(DescribeDedicatedHostAutoRenewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DedicatedHostIds", request.dedicatedHostIds);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostAutoRenew"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostAutoRenewResponse());
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostAutoRenewWithOptions(request, runtime);
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClustersWithOptions(DescribeDedicatedHostClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        query.put("LockReason", request.lockReason);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DedicatedHostClusterIds", request.dedicatedHostClusterIds);
        query.put("DedicatedHostClusterName", request.dedicatedHostClusterName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostClusters"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostClustersResponse());
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostClustersWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DedicatedHostIds", request.dedicatedHostIds);
        query.put("DedicatedHostName", request.dedicatedHostName);
        query.put("Status", request.status);
        query.put("DedicatedHostType", request.dedicatedHostType);
        query.put("LockReason", request.lockReason);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHosts"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypesWithOptions(DescribeDedicatedHostTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostType", request.dedicatedHostType);
        query.put("SupportedInstanceTypeFamily", request.supportedInstanceTypeFamily);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedHostTypes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedHostTypesResponse());
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostTypesWithOptions(request, runtime);
    }

    public DescribeDemandsResponse describeDemandsWithOptions(DescribeDemandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("DryRun", request.dryRun);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DemandId", request.demandId);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        query.put("InstanceType", request.instanceType);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("DemandType", request.demandType);
        query.put("DemandStatus", request.demandStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDemands"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDemandsResponse());
    }

    public DescribeDemandsResponse describeDemands(DescribeDemandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDemandsWithOptions(request, runtime);
    }

    public DescribeDeploymentSetsResponse describeDeploymentSetsWithOptions(DescribeDeploymentSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DeploymentSetIds", request.deploymentSetIds);
        query.put("NetworkType", request.networkType);
        query.put("Strategy", request.strategy);
        query.put("DeploymentSetName", request.deploymentSetName);
        query.put("Granularity", request.granularity);
        query.put("Domain", request.domain);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeploymentSets"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeploymentSetsResponse());
    }

    public DescribeDeploymentSetsResponse describeDeploymentSets(DescribeDeploymentSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeploymentSetsWithOptions(request, runtime);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeploymentSetSupportedInstanceTypeFamily"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse());
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(request, runtime);
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorDataWithOptions(DescribeDiskMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DiskId", request.diskId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskMonitorDataResponse());
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorData(DescribeDiskMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiskMonitorDataWithOptions(request, runtime);
    }

    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DiskIds", request.diskIds);
        query.put("InstanceId", request.instanceId);
        query.put("DiskType", request.diskType);
        query.put("Category", request.category);
        query.put("Status", request.status);
        query.put("SnapshotId", request.snapshotId);
        query.put("Portable", request.portable);
        query.put("DeleteWithInstance", request.deleteWithInstance);
        query.put("DeleteAutoSnapshot", request.deleteAutoSnapshot);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DiskName", request.diskName);
        query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        query.put("EnableAutoSnapshot", request.enableAutoSnapshot);
        query.put("EnableAutomatedSnapshotPolicy", request.enableAutomatedSnapshotPolicy);
        query.put("DiskChargeType", request.diskChargeType);
        query.put("LockReason", request.lockReason);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("EnableShared", request.enableShared);
        query.put("Encrypted", request.encrypted);
        query.put("DryRun", request.dryRun);
        query.put("KMSKeyId", request.KMSKeyId);
        query.put("Tag", request.tag);
        query.put("AdditionalAttributes", request.additionalAttributes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisks"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatusWithOptions(DescribeDisksFullStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("HealthStatus", request.healthStatus);
        query.put("EventType", request.eventType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("DiskId", request.diskId);
        query.put("EventId", request.eventId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisksFullStatus"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisksFullStatusResponse());
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatus(DescribeDisksFullStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksFullStatusWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("EipAddress", request.eipAddress);
        query.put("AllocationId", request.allocationId);
        query.put("ISP", request.ISP);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("LockReason", request.lockReason);
        query.put("AssociatedInstanceType", request.associatedInstanceType);
        query.put("AssociatedInstanceId", request.associatedInstanceId);
        query.put("ChargeType", request.chargeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEipAddresses"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeEipMonitorDataResponse describeEipMonitorDataWithOptions(DescribeEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEipMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEipMonitorDataResponse());
    }

    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstancesWithOptions(DescribeElasticityAssuranceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticityAssuranceInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticityAssuranceInstancesResponse());
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticityAssuranceInstancesWithOptions(request, runtime);
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurancesWithOptions(DescribeElasticityAssurancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Platform", request.platform);
        query.put("InstanceType", request.instanceType);
        query.put("ZoneId", request.zoneId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticityAssurances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticityAssurancesResponse());
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurances(DescribeElasticityAssurancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticityAssurancesWithOptions(request, runtime);
    }

    public DescribeEniMonitorDataResponse describeEniMonitorDataWithOptions(DescribeEniMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("EniId", request.eniId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEniMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEniMonitorDataResponse());
    }

    public DescribeEniMonitorDataResponse describeEniMonitorData(DescribeEniMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEniMonitorDataWithOptions(request, runtime);
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ForwardTableId", request.forwardTableId);
        query.put("ForwardEntryId", request.forwardEntryId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeForwardTableEntries"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeForwardTableEntriesResponse());
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    public DescribeHaVipsResponse describeHaVipsWithOptions(DescribeHaVipsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHaVips"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHaVipsResponse());
    }

    public DescribeHaVipsResponse describeHaVips(DescribeHaVipsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHaVipsWithOptions(request, runtime);
    }

    public DescribeHpcClustersResponse describeHpcClustersWithOptions(DescribeHpcClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("HpcClusterIds", request.hpcClusterIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHpcClusters"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHpcClustersResponse());
    }

    public DescribeHpcClustersResponse describeHpcClusters(DescribeHpcClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHpcClustersWithOptions(request, runtime);
    }

    public DescribeImageComponentsResponse describeImageComponentsWithOptions(DescribeImageComponentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Name", request.name);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("ImageComponentId", request.imageComponentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageComponents"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageComponentsResponse());
    }

    public DescribeImageComponentsResponse describeImageComponents(DescribeImageComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageComponentsWithOptions(request, runtime);
    }

    public DescribeImageFromFamilyResponse describeImageFromFamilyWithOptions(DescribeImageFromFamilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ImageFamily", request.imageFamily);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageFromFamily"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageFromFamilyResponse());
    }

    public DescribeImageFromFamilyResponse describeImageFromFamily(DescribeImageFromFamilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageFromFamilyWithOptions(request, runtime);
    }

    public DescribeImagePipelineExecutionsResponse describeImagePipelineExecutionsWithOptions(DescribeImagePipelineExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ImagePipelineId", request.imagePipelineId);
        query.put("ExecutionId", request.executionId);
        query.put("Status", request.status);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImagePipelineExecutions"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagePipelineExecutionsResponse());
    }

    public DescribeImagePipelineExecutionsResponse describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagePipelineExecutionsWithOptions(request, runtime);
    }

    public DescribeImagePipelinesResponse describeImagePipelinesWithOptions(DescribeImagePipelinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Name", request.name);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("ImagePipelineId", request.imagePipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImagePipelines"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagePipelinesResponse());
    }

    public DescribeImagePipelinesResponse describeImagePipelines(DescribeImagePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagePipelinesWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("ImageId", request.imageId);
        query.put("ShowExpired", request.showExpired);
        query.put("SnapshotId", request.snapshotId);
        query.put("ImageName", request.imageName);
        query.put("ImageFamily", request.imageFamily);
        query.put("ImageOwnerAlias", request.imageOwnerAlias);
        query.put("InstanceType", request.instanceType);
        query.put("IsSupportIoOptimized", request.isSupportIoOptimized);
        query.put("IsSupportCloudinit", request.isSupportCloudinit);
        query.put("OSType", request.OSType);
        query.put("Architecture", request.architecture);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Usage", request.usage);
        query.put("DryRun", request.dryRun);
        query.put("ActionType", request.actionType);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImages"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageSharePermission"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesWithOptions(DescribeImageSupportInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("ActionType", request.actionType);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageSupportInstanceTypes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageSupportInstanceTypesResponse());
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSupportInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributesWithOptions(DescribeInstanceAttachmentAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceIds", request.instanceIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAttachmentAttributes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAttachmentAttributesResponse());
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("RenewalStatus", request.renewalStatus);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAutoRenewAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsWithOptions(DescribeInstanceHistoryEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("EventCycleStatus", request.eventCycleStatus);
        query.put("EventType", request.eventType);
        query.put("ImpactLevel", request.impactLevel);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("EventId", request.eventId);
        query.put("InstanceEventCycleStatus", request.instanceEventCycleStatus);
        query.put("InstanceEventType", request.instanceEventType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceHistoryEvents"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceHistoryEventsResponse());
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceHistoryEventsWithOptions(request, runtime);
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesWithOptions(DescribeInstanceMaintenanceAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMaintenanceAttributes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMaintenanceAttributesResponse());
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceModificationPriceResponse describeInstanceModificationPriceWithOptions(DescribeInstanceModificationPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        query.put("DataDisk", request.dataDisk);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceModificationPrice"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceModificationPriceResponse());
    }

    public DescribeInstanceModificationPriceResponse describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceModificationPriceWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRoleWithOptions(DescribeInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("InstanceIds", request.instanceIds);
        query.put("RamRoleName", request.ramRoleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceRamRole"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceRamRoleResponse());
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRole(DescribeInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceRamRoleWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("VpcId", request.vpcId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("ZoneId", request.zoneId);
        query.put("InstanceNetworkType", request.instanceNetworkType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("InstanceIds", request.instanceIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("InnerIpAddresses", request.innerIpAddresses);
        query.put("PrivateIpAddresses", request.privateIpAddresses);
        query.put("PublicIpAddresses", request.publicIpAddresses);
        query.put("EipAddresses", request.eipAddresses);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("InstanceName", request.instanceName);
        query.put("ImageId", request.imageId);
        query.put("Status", request.status);
        query.put("LockReason", request.lockReason);
        query.put("DeviceAvailable", request.deviceAvailable);
        query.put("IoOptimized", request.ioOptimized);
        query.put("NeedSaleCycle", request.needSaleCycle);
        query.put("InstanceType", request.instanceType);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        query.put("KeyPairName", request.keyPairName);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("HpcClusterId", request.hpcClusterId);
        query.put("RdmaIpAddresses", request.rdmaIpAddresses);
        query.put("DryRun", request.dryRun);
        query.put("HttpEndpoint", request.httpEndpoint);
        query.put("HttpTokens", request.httpTokens);
        query.put("HttpPutResponseHopLimit", request.httpPutResponseHopLimit);
        query.put("Tag", request.tag);
        query.put("AdditionalAttributes", request.additionalAttributes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatusWithOptions(DescribeInstancesFullStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("HealthStatus", request.healthStatus);
        query.put("EventType", request.eventType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("InstanceId", request.instanceId);
        query.put("EventId", request.eventId);
        query.put("InstanceEventType", request.instanceEventType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstancesFullStatus"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesFullStatusResponse());
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatus(DescribeInstancesFullStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesFullStatusWithOptions(request, runtime);
    }

    public DescribeInstanceStatusResponse describeInstanceStatusWithOptions(DescribeInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("ClusterId", request.clusterId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceStatus"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceStatusResponse());
    }

    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatusWithOptions(request, runtime);
    }

    public DescribeInstanceTopologyResponse describeInstanceTopologyWithOptions(DescribeInstanceTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceIds", request.instanceIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTopology"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTopologyResponse());
    }

    public DescribeInstanceTopologyResponse describeInstanceTopology(DescribeInstanceTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTopologyWithOptions(request, runtime);
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesWithOptions(DescribeInstanceTypeFamiliesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Generation", request.generation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTypeFamilies"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTypeFamiliesResponse());
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypeFamiliesWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        query.put("InstanceTypes", request.instanceTypes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTypes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswdWithOptions(DescribeInstanceVncPasswdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceVncPasswd"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceVncPasswdResponse());
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncPasswdWithOptions(request, runtime);
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceVncUrl"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceVncUrlResponse());
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeInvocationResultsResponse describeInvocationResultsWithOptions(DescribeInvocationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InvokeId", request.invokeId);
        query.put("InstanceId", request.instanceId);
        query.put("CommandId", request.commandId);
        query.put("InvokeRecordStatus", request.invokeRecordStatus);
        query.put("IncludeHistory", request.includeHistory);
        query.put("ContentEncoding", request.contentEncoding);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocationResults"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationResultsResponse());
    }

    public DescribeInvocationResultsResponse describeInvocationResults(DescribeInvocationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationResultsWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InvokeId", request.invokeId);
        query.put("CommandId", request.commandId);
        query.put("CommandName", request.commandName);
        query.put("CommandType", request.commandType);
        query.put("Timed", request.timed);
        query.put("InvokeStatus", request.invokeStatus);
        query.put("InstanceId", request.instanceId);
        query.put("ContentEncoding", request.contentEncoding);
        query.put("IncludeOutput", request.includeOutput);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairName", request.keyPairName);
        query.put("KeyPairFingerPrint", request.keyPairFingerPrint);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKeyPairs"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplatesWithOptions(DescribeLaunchTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("TemplateResourceGroupId", request.templateResourceGroupId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLaunchTemplates"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLaunchTemplatesResponse());
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplates(DescribeLaunchTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLaunchTemplatesWithOptions(request, runtime);
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsWithOptions(DescribeLaunchTemplateVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("MinVersion", request.minVersion);
        query.put("MaxVersion", request.maxVersion);
        query.put("DefaultVersion", request.defaultVersion);
        query.put("DetailFlag", request.detailFlag);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLaunchTemplateVersions"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLaunchTemplateVersionsResponse());
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLaunchTemplateVersionsWithOptions(request, runtime);
    }

    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Limitation", request.limitation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLimitation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLimitationResponse());
    }

    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    public DescribeManagedInstancesResponse describeManagedInstancesWithOptions(DescribeManagedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("OsType", request.osType);
        query.put("InstanceIp", request.instanceIp);
        query.put("ActivationId", request.activationId);
        query.put("InstanceName", request.instanceName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeManagedInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeManagedInstancesResponse());
    }

    public DescribeManagedInstancesResponse describeManagedInstances(DescribeManagedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeManagedInstancesWithOptions(request, runtime);
    }

    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("NatGatewayId", request.natGatewayId);
        query.put("VpcId", request.vpcId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatGateways"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatGatewaysResponse());
    }

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttributeWithOptions(DescribeNetworkInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("Attribute", request.attribute);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInterfaceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInterfaceAttributeResponse());
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsWithOptions(DescribeNetworkInterfacePermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("NetworkInterfacePermissionId", request.networkInterfacePermissionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInterfacePermissions"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInterfacePermissionsResponse());
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacePermissionsWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VpcId", request.vpcId);
        query.put("PrimaryIpAddress", request.primaryIpAddress);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("NetworkInterfaceName", request.networkInterfaceName);
        query.put("Type", request.type);
        query.put("InstanceId", request.instanceId);
        query.put("ServiceManaged", request.serviceManaged);
        query.put("Status", request.status);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInterfaces"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataWithOptions(DescribeNewProjectEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNewProjectEipMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNewProjectEipMonitorDataResponse());
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNewProjectEipMonitorDataWithOptions(request, runtime);
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnectionsWithOptions(DescribePhysicalConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePhysicalConnections"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePhysicalConnectionsResponse());
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnections(DescribePhysicalConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhysicalConnectionsWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("ImageId", request.imageId);
        query.put("InstanceType", request.instanceType);
        query.put("DedicatedHostType", request.dedicatedHostType);
        query.put("IoOptimized", request.ioOptimized);
        query.put("InstanceNetworkType", request.instanceNetworkType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("Period", request.period);
        query.put("PriceUnit", request.priceUnit);
        query.put("Amount", request.amount);
        query.put("OfferingType", request.offeringType);
        query.put("InstanceAmount", request.instanceAmount);
        query.put("Scope", request.scope);
        query.put("Platform", request.platform);
        query.put("Capacity", request.capacity);
        query.put("AssuranceTimes", request.assuranceTimes);
        query.put("InstanceCpuCoreCount", request.instanceCpuCoreCount);
        query.put("Isp", request.isp);
        query.put("InstanceTypeList", request.instanceTypeList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeWithOptions(DescribeRecommendInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Cores", request.cores);
        query.put("Memory", request.memory);
        query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        query.put("InstanceType", request.instanceType);
        query.put("NetworkType", request.networkType);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("IoOptimized", request.ioOptimized);
        query.put("PriorityStrategy", request.priorityStrategy);
        query.put("MaxPrice", request.maxPrice);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("SystemDiskCategory", request.systemDiskCategory);
        query.put("ZoneMatchMode", request.zoneMatchMode);
        query.put("Scene", request.scene);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendInstanceType"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendInstanceTypeResponse());
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecommendInstanceTypeWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("ResourceType", request.resourceType);
        query.put("AcceptLanguage", request.acceptLanguage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("Period", request.period);
        query.put("PriceUnit", request.priceUnit);
        query.put("ExpectedRenewDay", request.expectedRenewDay);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenewalPrice"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribeReservedInstancesResponse describeReservedInstancesWithOptions(DescribeReservedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Tag", request.tag);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("ReservedInstanceName", request.reservedInstanceName);
        query.put("LockReason", request.lockReason);
        query.put("InstanceType", request.instanceType);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        query.put("Scope", request.scope);
        query.put("OfferingType", request.offeringType);
        query.put("AllocationType", request.allocationType);
        query.put("ReservedInstanceId", request.reservedInstanceId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReservedInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReservedInstancesResponse());
    }

    public DescribeReservedInstancesResponse describeReservedInstances(DescribeReservedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReservedInstancesWithOptions(request, runtime);
    }

    public DescribeResourceByTagsResponse describeResourceByTagsWithOptions(DescribeResourceByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("ResourceType", request.resourceType);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceByTags"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceByTagsResponse());
    }

    public DescribeResourceByTagsResponse describeResourceByTags(DescribeResourceByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceByTagsWithOptions(request, runtime);
    }

    public DescribeResourcesModificationResponse describeResourcesModificationWithOptions(DescribeResourcesModificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("MigrateAcrossZone", request.migrateAcrossZone);
        query.put("DestinationResource", request.destinationResource);
        query.put("OperationType", request.operationType);
        query.put("InstanceType", request.instanceType);
        query.put("Cores", request.cores);
        query.put("Memory", request.memory);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourcesModification"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcesModificationResponse());
    }

    public DescribeResourcesModificationResponse describeResourcesModification(DescribeResourcesModificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcesModificationWithOptions(request, runtime);
    }

    public DescribeRouterInterfacesResponse describeRouterInterfacesWithOptions(DescribeRouterInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouterInterfaces"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouterInterfacesResponse());
    }

    public DescribeRouterInterfacesResponse describeRouterInterfaces(DescribeRouterInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouterInterfacesWithOptions(request, runtime);
    }

    public DescribeRouteTablesResponse describeRouteTablesWithOptions(DescribeRouteTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("VRouterId", request.VRouterId);
        query.put("RouteTableId", request.routeTableId);
        query.put("RouterType", request.routerType);
        query.put("RouterId", request.routerId);
        query.put("RouteTableName", request.routeTableName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteTables"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteTablesResponse());
    }

    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteTablesWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("RegionId", request.regionId);
        query.put("NicType", request.nicType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Direction", request.direction);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroupAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesWithOptions(DescribeSecurityGroupReferencesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("SecurityGroupId", request.securityGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroupReferences"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupReferencesResponse());
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupReferencesWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("VpcId", request.vpcId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("SecurityGroupIds", request.securityGroupIds);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("NetworkType", request.networkType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("IsQueryEcsCount", request.isQueryEcsCount);
        query.put("FuzzyQuery", request.fuzzyQuery);
        query.put("SecurityGroupType", request.securityGroupType);
        query.put("DryRun", request.dryRun);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroups"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeSendFileResultsResponse describeSendFileResultsWithOptions(DescribeSendFileResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InvokeId", request.invokeId);
        query.put("Name", request.name);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSendFileResults"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSendFileResultsResponse());
    }

    public DescribeSendFileResultsResponse describeSendFileResults(DescribeSendFileResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSendFileResultsWithOptions(request, runtime);
    }

    public DescribeSnapshotGroupsResponse describeSnapshotGroupsWithOptions(DescribeSnapshotGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("Name", request.name);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("SnapshotGroupId", request.snapshotGroupId);
        query.put("Status", request.status);
        query.put("AdditionalAttributes", request.additionalAttributes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotGroups"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotGroupsResponse());
    }

    public DescribeSnapshotGroupsResponse describeSnapshotGroups(DescribeSnapshotGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotGroupsWithOptions(request, runtime);
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinksWithOptions(DescribeSnapshotLinksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("DiskIds", request.diskIds);
        query.put("SnapshotLinkIds", request.snapshotLinkIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotLinks"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotLinksResponse());
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinks(DescribeSnapshotLinksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotLinksWithOptions(request, runtime);
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorDataWithOptions(DescribeSnapshotMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("Period", request.period);
        query.put("Category", request.category);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotMonitorData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotMonitorDataResponse());
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotMonitorDataWithOptions(request, runtime);
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackageWithOptions(DescribeSnapshotPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotPackage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotPackageResponse());
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackage(DescribeSnapshotPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotPackageWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("DiskId", request.diskId);
        query.put("SnapshotLinkId", request.snapshotLinkId);
        query.put("RegionId", request.regionId);
        query.put("SnapshotIds", request.snapshotIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("SnapshotName", request.snapshotName);
        query.put("Status", request.status);
        query.put("SnapshotType", request.snapshotType);
        query.put("Usage", request.usage);
        query.put("SourceDiskType", request.sourceDiskType);
        query.put("Encrypted", request.encrypted);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("DryRun", request.dryRun);
        query.put("KMSKeyId", request.KMSKeyId);
        query.put("Category", request.category);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsageWithOptions(DescribeSnapshotsUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotsUsage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsUsageResponse());
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsUsageWithOptions(request, runtime);
    }

    public DescribeSpotAdviceResponse describeSpotAdviceWithOptions(DescribeSpotAdviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Cores", request.cores);
        query.put("Memory", request.memory);
        query.put("MinCores", request.minCores);
        query.put("MinMemory", request.minMemory);
        query.put("ZoneId", request.zoneId);
        query.put("InstanceTypeFamily", request.instanceTypeFamily);
        query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        query.put("GpuSpec", request.gpuSpec);
        query.put("GpuAmount", request.gpuAmount);
        query.put("InstanceTypes", request.instanceTypes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSpotAdvice"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSpotAdviceResponse());
    }

    public DescribeSpotAdviceResponse describeSpotAdvice(DescribeSpotAdviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpotAdviceWithOptions(request, runtime);
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistoryWithOptions(DescribeSpotPriceHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("NetworkType", request.networkType);
        query.put("InstanceType", request.instanceType);
        query.put("SpotDuration", request.spotDuration);
        query.put("IoOptimized", request.ioOptimized);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("OSType", request.OSType);
        query.put("Offset", request.offset);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSpotPriceHistory"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSpotPriceHistoryResponse());
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpotPriceHistoryWithOptions(request, runtime);
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnitsWithOptions(DescribeStorageCapacityUnitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Name", request.name);
        query.put("Capacity", request.capacity);
        query.put("AllocationType", request.allocationType);
        query.put("StorageCapacityUnitId", request.storageCapacityUnitId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageCapacityUnits"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageCapacityUnitsResponse());
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageCapacityUnitsWithOptions(request, runtime);
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetailsWithOptions(DescribeStorageSetDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("StorageSetId", request.storageSetId);
        query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        query.put("DiskIds", request.diskIds);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageSetDetails"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageSetDetailsResponse());
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetails(DescribeStorageSetDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageSetDetailsWithOptions(request, runtime);
    }

    public DescribeStorageSetsResponse describeStorageSetsWithOptions(DescribeStorageSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("StorageSetIds", request.storageSetIds);
        query.put("ZoneId", request.zoneId);
        query.put("StorageSetName", request.storageSetName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageSets"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageSetsResponse());
    }

    public DescribeStorageSetsResponse describeStorageSets(DescribeStorageSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageSetsWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("RegionId", request.regionId);
        query.put("Category", request.category);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeTaskAttributeResponse describeTaskAttributeWithOptions(DescribeTaskAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskAttributeResponse());
    }

    public DescribeTaskAttributeResponse describeTaskAttribute(DescribeTaskAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskAttributeWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TaskIds", request.taskIds);
        query.put("TaskAction", request.taskAction);
        query.put("TaskStatus", request.taskStatus);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehaviorWithOptions(DescribeUserBusinessBehaviorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("statusKey", request.statusKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBusinessBehavior"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBusinessBehaviorResponse());
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBusinessBehaviorWithOptions(request, runtime);
    }

    public DescribeUserDataResponse describeUserDataWithOptions(DescribeUserDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserData"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserDataResponse());
    }

    public DescribeUserDataResponse describeUserData(DescribeUserDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDataWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersWithOptions(DescribeVirtualBorderRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualBorderRouters"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualBorderRoutersResponse());
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionWithOptions(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Filter", request.filter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualBorderRoutersForPhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualBorderRoutersForPhysicalConnectionResponse());
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersForPhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VpcId", request.vpcId);
        query.put("RegionId", request.regionId);
        query.put("IsDefault", request.isDefault);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcs"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeVRoutersResponse describeVRoutersWithOptions(DescribeVRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VRouterId", request.VRouterId);
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVRouters"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVRoutersResponse());
    }

    public DescribeVRoutersResponse describeVRouters(DescribeVRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVRoutersWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VpcId", request.vpcId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("ZoneId", request.zoneId);
        query.put("RegionId", request.regionId);
        query.put("IsDefault", request.isDefault);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Verbose", request.verbose);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("AcceptLanguage", request.acceptLanguage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpcWithOptions(DetachClassicLinkVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachClassicLinkVpc"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachClassicLinkVpcResponse());
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpc(DetachClassicLinkVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachClassicLinkVpcWithOptions(request, runtime);
    }

    public DetachDiskResponse detachDiskWithOptions(DetachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("DiskId", request.diskId);
        query.put("DeleteWithInstance", request.deleteWithInstance);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDiskResponse());
    }

    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRoleWithOptions(DetachInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RamRoleName", request.ramRoleName);
        query.put("InstanceIds", request.instanceIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachInstanceRamRole"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachInstanceRamRoleResponse());
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRole(DetachInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachInstanceRamRoleWithOptions(request, runtime);
    }

    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairName", request.keyPairName);
        query.put("InstanceIds", request.instanceIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachKeyPair"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachKeyPairResponse());
    }

    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    public DetachNetworkInterfaceResponse detachNetworkInterfaceWithOptions(DetachNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("InstanceId", request.instanceId);
        query.put("TrunkNetworkInstanceId", request.trunkNetworkInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachNetworkInterface"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachNetworkInterfaceResponse());
    }

    public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachNetworkInterfaceWithOptions(request, runtime);
    }

    public DisableActivationResponse disableActivationWithOptions(DisableActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ActivationId", request.activationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableActivation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableActivationResponse());
    }

    public DisableActivationResponse disableActivation(DisableActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableActivationWithOptions(request, runtime);
    }

    public EipFillParamsResponse eipFillParamsWithOptions(EipFillParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EipFillParams"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EipFillParamsResponse());
    }

    public EipFillParamsResponse eipFillParams(EipFillParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipFillParamsWithOptions(request, runtime);
    }

    public EipFillProductResponse eipFillProductWithOptions(EipFillProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EipFillProduct"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EipFillProductResponse());
    }

    public EipFillProductResponse eipFillProduct(EipFillProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipFillProductWithOptions(request, runtime);
    }

    public EipNotifyPaidResponse eipNotifyPaidWithOptions(EipNotifyPaidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EipNotifyPaid"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EipNotifyPaidResponse());
    }

    public EipNotifyPaidResponse eipNotifyPaid(EipNotifyPaidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipNotifyPaidWithOptions(request, runtime);
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnectionWithOptions(EnablePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnablePhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnablePhysicalConnectionResponse());
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnection(EnablePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enablePhysicalConnectionWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("OSSBucket", request.OSSBucket);
        query.put("OSSPrefix", request.OSSPrefix);
        query.put("ImageFormat", request.imageFormat);
        query.put("RoleName", request.roleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public ExportSnapshotResponse exportSnapshotWithOptions(ExportSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SnapshotId", request.snapshotId);
        query.put("RegionId", request.regionId);
        query.put("OssBucket", request.ossBucket);
        query.put("RoleName", request.roleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportSnapshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportSnapshotResponse());
    }

    public ExportSnapshotResponse exportSnapshot(ExportSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportSnapshotWithOptions(request, runtime);
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutputWithOptions(GetInstanceConsoleOutputRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("RemoveSymbols", request.removeSymbols);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceConsoleOutput"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceConsoleOutputResponse());
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceConsoleOutputWithOptions(request, runtime);
    }

    public GetInstanceScreenshotResponse getInstanceScreenshotWithOptions(GetInstanceScreenshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("WakeUp", request.wakeUp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceScreenshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceScreenshotResponse());
    }

    public GetInstanceScreenshotResponse getInstanceScreenshot(GetInstanceScreenshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceScreenshotWithOptions(request, runtime);
    }

    public ImportImageResponse importImageWithOptions(ImportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageName", request.imageName);
        query.put("Description", request.description);
        query.put("Architecture", request.architecture);
        query.put("OSType", request.OSType);
        query.put("Platform", request.platform);
        query.put("BootMode", request.bootMode);
        query.put("RoleName", request.roleName);
        query.put("LicenseType", request.licenseType);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("DiskDeviceMapping", request.diskDeviceMapping);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportImage"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportImageResponse());
    }

    public ImportImageResponse importImage(ImportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importImageWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("KeyPairName", request.keyPairName);
        query.put("PublicKeyBody", request.publicKeyBody);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public ImportSnapshotResponse importSnapshotWithOptions(ImportSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SnapshotName", request.snapshotName);
        query.put("RegionId", request.regionId);
        query.put("OssBucket", request.ossBucket);
        query.put("OssObject", request.ossObject);
        query.put("RoleName", request.roleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportSnapshot"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportSnapshotResponse());
    }

    public ImportSnapshotResponse importSnapshot(ImportSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importSnapshotWithOptions(request, runtime);
    }

    public InstallCloudAssistantResponse installCloudAssistantWithOptions(InstallCloudAssistantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallCloudAssistant"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallCloudAssistantResponse());
    }

    public InstallCloudAssistantResponse installCloudAssistant(InstallCloudAssistantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installCloudAssistantWithOptions(request, runtime);
    }

    public InvokeCommandResponse invokeCommandWithOptions(InvokeCommandRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvokeCommandShrinkRequest request = new InvokeCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("CommandId", request.commandId);
        query.put("Timed", request.timed);
        query.put("Frequency", request.frequency);
        query.put("Parameters", request.parametersShrink);
        query.put("Username", request.username);
        query.put("WindowsPasswordName", request.windowsPasswordName);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeCommand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeCommandResponse());
    }

    public InvokeCommandResponse invokeCommand(InvokeCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeCommandWithOptions(request, runtime);
    }

    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinResourceGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinResourceGroupResponse());
    }

    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("InstanceId", request.instanceId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("InstanceId", request.instanceId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LeaveSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NextToken", request.nextToken);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("Tag", request.tag);
        query.put("TagFilter", request.tagFilter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroupWithOptions(ModifyAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("AutoProvisioningGroupId", request.autoProvisioningGroupId);
        query.put("ExcessCapacityTerminationPolicy", request.excessCapacityTerminationPolicy);
        query.put("DefaultTargetCapacityType", request.defaultTargetCapacityType);
        query.put("TerminateInstancesWithExpiration", request.terminateInstancesWithExpiration);
        query.put("MaxSpotPrice", request.maxSpotPrice);
        query.put("TotalTargetCapacity", request.totalTargetCapacity);
        query.put("PayAsYouGoTargetCapacity", request.payAsYouGoTargetCapacity);
        query.put("SpotTargetCapacity", request.spotTargetCapacity);
        query.put("AutoProvisioningGroupName", request.autoProvisioningGroupName);
        query.put("LaunchTemplateConfig", request.launchTemplateConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoProvisioningGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoProvisioningGroupResponse());
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoProvisioningGroupWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SystemDiskPolicyEnabled", request.systemDiskPolicyEnabled);
        query.put("SystemDiskPolicyTimePeriod", request.systemDiskPolicyTimePeriod);
        query.put("SystemDiskPolicyRetentionDays", request.systemDiskPolicyRetentionDays);
        query.put("SystemDiskPolicyRetentionLastWeek", request.systemDiskPolicyRetentionLastWeek);
        query.put("DataDiskPolicyEnabled", request.dataDiskPolicyEnabled);
        query.put("DataDiskPolicyTimePeriod", request.dataDiskPolicyTimePeriod);
        query.put("DataDiskPolicyRetentionDays", request.dataDiskPolicyRetentionDays);
        query.put("DataDiskPolicyRetentionLastWeek", request.dataDiskPolicyRetentionLastWeek);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyExWithOptions(ModifyAutoSnapshotPolicyExRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("regionId", request.regionId);
        query.put("autoSnapshotPolicyId", request.autoSnapshotPolicyId);
        query.put("autoSnapshotPolicyName", request.autoSnapshotPolicyName);
        query.put("timePoints", request.timePoints);
        query.put("repeatWeekdays", request.repeatWeekdays);
        query.put("retentionDays", request.retentionDays);
        query.put("EnableCrossRegionCopy", request.enableCrossRegionCopy);
        query.put("TargetCopyRegions", request.targetCopyRegions);
        query.put("CopiedSnapshotsRetentionDays", request.copiedSnapshotsRetentionDays);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicyEx"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoSnapshotPolicyExResponse());
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecWithOptions(ModifyBandwidthPackageSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("Bandwidth", request.bandwidth);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBandwidthPackageSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBandwidthPackageSpecResponse());
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBandwidthPackageSpecWithOptions(request, runtime);
    }

    public ModifyCapacityReservationResponse modifyCapacityReservationWithOptions(ModifyCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Description", request.description);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("EndTimeType", request.endTimeType);
        query.put("Platform", request.platform);
        query.put("InstanceAmount", request.instanceAmount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCapacityReservation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCapacityReservationResponse());
    }

    public ModifyCapacityReservationResponse modifyCapacityReservation(ModifyCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCapacityReservationWithOptions(request, runtime);
    }

    public ModifyCommandResponse modifyCommandWithOptions(ModifyCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("CommandId", request.commandId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("CommandContent", request.commandContent);
        query.put("WorkingDir", request.workingDir);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCommand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCommandResponse());
    }

    public ModifyCommandResponse modifyCommand(ModifyCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommandWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("DedicatedHostName", request.dedicatedHostName);
        query.put("Description", request.description);
        query.put("ActionOnMaintenance", request.actionOnMaintenance);
        query.put("AutoPlacement", request.autoPlacement);
        query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        query.put("CpuOverCommitRatio", request.cpuOverCommitRatio);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTimeWithOptions(ModifyDedicatedHostAutoReleaseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostAutoReleaseTime"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostAutoReleaseTimeResponse());
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAutoReleaseTimeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttributeWithOptions(ModifyDedicatedHostAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DedicatedHostIds", request.dedicatedHostIds);
        query.put("RegionId", request.regionId);
        query.put("Duration", request.duration);
        query.put("PeriodUnit", request.periodUnit);
        query.put("AutoRenew", request.autoRenew);
        query.put("RenewalStatus", request.renewalStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostAutoRenewAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostAutoRenewAttributeResponse());
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttributeWithOptions(ModifyDedicatedHostClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        query.put("DedicatedHostClusterName", request.dedicatedHostClusterName);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostClusterAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostClusterAttributeResponse());
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostClusterAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeTypeWithOptions(ModifyDedicatedHostsChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DedicatedHostIds", request.dedicatedHostIds);
        query.put("RegionId", request.regionId);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("DryRun", request.dryRun);
        query.put("AutoPay", request.autoPay);
        query.put("DedicatedHostChargeType", request.dedicatedHostChargeType);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DetailFee", request.detailFee);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedHostsChargeType"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedHostsChargeTypeResponse());
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostsChargeTypeWithOptions(request, runtime);
    }

    public ModifyDemandResponse modifyDemandWithOptions(ModifyDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("ZoneId", request.zoneId);
        query.put("DemandId", request.demandId);
        query.put("DemandName", request.demandName);
        query.put("DemandDescription", request.demandDescription);
        query.put("InstanceType", request.instanceType);
        query.put("Amount", request.amount);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDemand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDemandResponse());
    }

    public ModifyDemandResponse modifyDemand(ModifyDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDemandWithOptions(request, runtime);
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttributeWithOptions(ModifyDeploymentSetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("Description", request.description);
        query.put("DeploymentSetName", request.deploymentSetName);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeploymentSetAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeploymentSetAttributeResponse());
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeploymentSetAttributeWithOptions(request, runtime);
    }

    public ModifyDiskAttributeResponse modifyDiskAttributeWithOptions(ModifyDiskAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("DiskName", request.diskName);
        query.put("Description", request.description);
        query.put("DeleteWithInstance", request.deleteWithInstance);
        query.put("DeleteAutoSnapshot", request.deleteAutoSnapshot);
        query.put("EnableAutoSnapshot", request.enableAutoSnapshot);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DiskIds", request.diskIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskAttributeResponse());
    }

    public ModifyDiskAttributeResponse modifyDiskAttribute(ModifyDiskAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskAttributeWithOptions(request, runtime);
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeTypeWithOptions(ModifyDiskChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("DiskIds", request.diskIds);
        query.put("AutoPay", request.autoPay);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DiskChargeType", request.diskChargeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskChargeType"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskChargeTypeResponse());
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeType(ModifyDiskChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskChargeTypeWithOptions(request, runtime);
    }

    public ModifyDiskSpecResponse modifyDiskSpecWithOptions(ModifyDiskSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DiskId", request.diskId);
        query.put("PerformanceLevel", request.performanceLevel);
        query.put("DiskCategory", request.diskCategory);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskSpecResponse());
    }

    public ModifyDiskSpecResponse modifyDiskSpec(ModifyDiskSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskSpecWithOptions(request, runtime);
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttributeWithOptions(ModifyEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("Bandwidth", request.bandwidth);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEipAddressAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEipAddressAttributeResponse());
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyElasticityAssuranceResponse modifyElasticityAssuranceWithOptions(ModifyElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticityAssurance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticityAssuranceResponse());
    }

    public ModifyElasticityAssuranceResponse modifyElasticityAssurance(ModifyElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyElasticityAssuranceWithOptions(request, runtime);
    }

    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ForwardTableId", request.forwardTableId);
        query.put("ForwardEntryId", request.forwardEntryId);
        query.put("ExternalIp", request.externalIp);
        query.put("ExternalPort", request.externalPort);
        query.put("InternalIp", request.internalIp);
        query.put("InternalPort", request.internalPort);
        query.put("IpProtocol", request.ipProtocol);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyForwardEntry"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyForwardEntryResponse());
    }

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttributeWithOptions(ModifyHaVipAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("HaVipId", request.haVipId);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHaVipAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHaVipAttributeResponse());
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttribute(ModifyHaVipAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHaVipAttributeWithOptions(request, runtime);
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeWithOptions(ModifyHpcClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("HpcClusterId", request.hpcClusterId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHpcClusterAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHpcClusterAttributeResponse());
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHpcClusterAttributeWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("ImageName", request.imageName);
        query.put("Status", request.status);
        query.put("ImageFamily", request.imageFamily);
        query.put("BootMode", request.bootMode);
        query.put("LicenseType", request.licenseType);
        query.put("Description", request.description);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermissionWithOptions(ModifyImageShareGroupPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageShareGroupPermission"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageShareGroupPermissionResponse());
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageShareGroupPermissionWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("LaunchPermission", request.launchPermission);
        query.put("AddAccount", request.addAccount);
        query.put("RemoveAccount", request.removeAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageSharePermission"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributesWithOptions(ModifyInstanceAttachmentAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttachmentAttributes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttachmentAttributesResponse());
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("Password", request.password);
        query.put("HostName", request.hostName);
        query.put("InstanceName", request.instanceName);
        query.put("Description", request.description);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserData", request.userData);
        query.put("Recyclable", request.recyclable);
        query.put("CreditSpecification", request.creditSpecification);
        query.put("DeletionProtection", request.deletionProtection);
        query.put("NetworkInterfaceQueueNumber", request.networkInterfaceQueueNumber);
        query.put("SecurityGroupIds", request.securityGroupIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTimeWithOptions(ModifyInstanceAutoReleaseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAutoReleaseTime"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAutoReleaseTimeResponse());
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoReleaseTimeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("Duration", request.duration);
        query.put("AutoRenew", request.autoRenew);
        query.put("RenewalStatus", request.renewalStatus);
        query.put("PeriodUnit", request.periodUnit);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAutoRenewAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeWithOptions(ModifyInstanceChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceIds", request.instanceIds);
        query.put("RegionId", request.regionId);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("IncludeDataDisks", request.includeDataDisks);
        query.put("DryRun", request.dryRun);
        query.put("AutoPay", request.autoPay);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("IsDetailFee", request.isDetailFee);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceChargeType"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceChargeTypeResponse());
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceChargeTypeWithOptions(request, runtime);
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeploymentWithOptions(ModifyInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("DeploymentSetGroupNo", request.deploymentSetGroupNo);
        query.put("Force", request.force);
        query.put("Affinity", request.affinity);
        query.put("Tenancy", request.tenancy);
        query.put("MigrationType", request.migrationType);
        query.put("InstanceType", request.instanceType);
        query.put("DedicatedHostClusterId", request.dedicatedHostClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceDeployment"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceDeploymentResponse());
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceDeploymentWithOptions(request, runtime);
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributesWithOptions(ModifyInstanceMaintenanceAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ActionOnMaintenance", request.actionOnMaintenance);
        query.put("NotifyOnMaintenance", request.notifyOnMaintenance);
        query.put("InstanceId", request.instanceId);
        query.put("MaintenanceWindow", request.maintenanceWindow);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceMaintenanceAttributes"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceMaintenanceAttributesResponse());
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptionsWithOptions(ModifyInstanceMetadataOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("HttpEndpoint", request.httpEndpoint);
        query.put("HttpTokens", request.httpTokens);
        query.put("HttpPutResponseHopLimit", request.httpPutResponseHopLimit);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceMetadataOptions"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceMetadataOptionsResponse());
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMetadataOptionsWithOptions(request, runtime);
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpecWithOptions(ModifyInstanceNetworkSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("ISP", request.ISP);
        query.put("NetworkChargeType", request.networkChargeType);
        query.put("AllocatePublicIp", request.allocatePublicIp);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("AutoPay", request.autoPay);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceNetworkSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceNetworkSpecResponse());
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceNetworkSpecWithOptions(request, runtime);
    }

    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Async", request.async);
        query.put("AllowMigrateAcrossZone", request.allowMigrateAcrossZone);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSpecResponse());
    }

    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswdWithOptions(ModifyInstanceVncPasswdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("VncPassword", request.vncPassword);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceVncPasswd"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceVncPasswdResponse());
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVncPasswdWithOptions(request, runtime);
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttributeWithOptions(ModifyInstanceVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("VpcId", request.vpcId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("SecurityGroupId", request.securityGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceVpcAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceVpcAttributeResponse());
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVpcAttributeWithOptions(request, runtime);
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersionWithOptions(ModifyLaunchTemplateDefaultVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("DefaultVersionNumber", request.defaultVersionNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLaunchTemplateDefaultVersion"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLaunchTemplateDefaultVersionResponse());
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLaunchTemplateDefaultVersionWithOptions(request, runtime);
    }

    public ModifyManagedInstanceResponse modifyManagedInstanceWithOptions(ModifyManagedInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceName", request.instanceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyManagedInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyManagedInstanceResponse());
    }

    public ModifyManagedInstanceResponse modifyManagedInstance(ModifyManagedInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyManagedInstanceWithOptions(request, runtime);
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttributeWithOptions(ModifyNetworkInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceName", request.networkInterfaceName);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("QueueNumber", request.queueNumber);
        query.put("Description", request.description);
        query.put("SecurityGroupId", request.securityGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkInterfaceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkInterfaceAttributeResponse());
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeWithOptions(ModifyPhysicalConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("LineOperator", request.lineOperator);
        query.put("bandwidth", request.bandwidth);
        query.put("PeerLocation", request.peerLocation);
        query.put("PortType", request.portType);
        query.put("RedundantPhysicalConnectionId", request.redundantPhysicalConnectionId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        query.put("CircuitCode", request.circuitCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPhysicalConnectionAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPhysicalConnectionAttributeResponse());
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPhysicalConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        query.put("InstanceType", request.instanceType);
        query.put("OperatorType", request.operatorType);
        query.put("ClientToken", request.clientToken);
        query.put("AutoPay", request.autoPay);
        query.put("MigrateAcrossZone", request.migrateAcrossZone);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RebootTime", request.rebootTime);
        query.put("EndTime", request.endTime);
        query.put("RebootWhenFinished", request.rebootWhenFinished);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrepayInstanceSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrepayInstanceSpecResponse());
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttributeWithOptions(ModifyReservedInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ReservedInstanceId", request.reservedInstanceId);
        query.put("ReservedInstanceName", request.reservedInstanceName);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyReservedInstanceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyReservedInstanceAttributeResponse());
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReservedInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyReservedInstancesResponse modifyReservedInstancesWithOptions(ModifyReservedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("ReservedInstanceId", request.reservedInstanceId);
        query.put("Configuration", request.configuration);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyReservedInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyReservedInstancesResponse());
    }

    public ModifyReservedInstancesResponse modifyReservedInstances(ModifyReservedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReservedInstancesWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeWithOptions(ModifyRouterInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("OppositeInterfaceId", request.oppositeInterfaceId);
        query.put("OppositeRouterId", request.oppositeRouterId);
        query.put("OppositeRouterType", request.oppositeRouterType);
        query.put("OppositeInterfaceOwnerId", request.oppositeInterfaceOwnerId);
        query.put("HealthCheckSourceIp", request.healthCheckSourceIp);
        query.put("HealthCheckTargetIp", request.healthCheckTargetIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRouterInterfaceAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRouterInterfaceAttributeResponse());
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecWithOptions(ModifyRouterInterfaceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("RouterInterfaceId", request.routerInterfaceId);
        query.put("Spec", request.spec);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRouterInterfaceSpec"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRouterInterfaceSpecResponse());
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceSpecWithOptions(request, runtime);
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Description", request.description);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupAttributeResponse());
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRuleWithOptions(ModifySecurityGroupEgressRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("IpProtocol", request.ipProtocol);
        query.put("PortRange", request.portRange);
        query.put("DestGroupId", request.destGroupId);
        query.put("DestGroupOwnerId", request.destGroupOwnerId);
        query.put("DestGroupOwnerAccount", request.destGroupOwnerAccount);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupEgressRule"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupEgressRuleResponse());
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupEgressRuleWithOptions(request, runtime);
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicyWithOptions(ModifySecurityGroupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("RegionId", request.regionId);
        query.put("InnerAccessPolicy", request.innerAccessPolicy);
        query.put("ClientToken", request.clientToken);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupPolicy"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupPolicyResponse());
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupPolicyWithOptions(request, runtime);
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRuleWithOptions(ModifySecurityGroupRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("IpProtocol", request.ipProtocol);
        query.put("PortRange", request.portRange);
        query.put("SourceGroupId", request.sourceGroupId);
        query.put("SourceGroupOwnerId", request.sourceGroupOwnerId);
        query.put("SourceGroupOwnerAccount", request.sourceGroupOwnerAccount);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupRule"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupRuleResponse());
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRule(ModifySecurityGroupRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupRuleWithOptions(request, runtime);
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttributeWithOptions(ModifySnapshotAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("SnapshotId", request.snapshotId);
        query.put("SnapshotName", request.snapshotName);
        query.put("Description", request.description);
        query.put("DisableInstantAccess", request.disableInstantAccess);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySnapshotAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySnapshotAttributeResponse());
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttribute(ModifySnapshotAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySnapshotAttributeWithOptions(request, runtime);
    }

    public ModifySnapshotGroupResponse modifySnapshotGroupWithOptions(ModifySnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("SnapshotGroupId", request.snapshotGroupId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySnapshotGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySnapshotGroupResponse());
    }

    public ModifySnapshotGroupResponse modifySnapshotGroup(ModifySnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySnapshotGroupWithOptions(request, runtime);
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttributeWithOptions(ModifyStorageCapacityUnitAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("StorageCapacityUnitId", request.storageCapacityUnitId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStorageCapacityUnitAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStorageCapacityUnitAttributeResponse());
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageCapacityUnitAttributeWithOptions(request, runtime);
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttributeWithOptions(ModifyStorageSetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("StorageSetId", request.storageSetId);
        query.put("StorageSetName", request.storageSetName);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStorageSetAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStorageSetAttributeResponse());
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageSetAttributeWithOptions(request, runtime);
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehaviorWithOptions(ModifyUserBusinessBehaviorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("statusKey", request.statusKey);
        query.put("statusValue", request.statusValue);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserBusinessBehavior"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserBusinessBehaviorResponse());
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserBusinessBehaviorWithOptions(request, runtime);
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeWithOptions(ModifyVirtualBorderRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("VbrId", request.vbrId);
        query.put("VlanId", request.vlanId);
        query.put("CircuitCode", request.circuitCode);
        query.put("LocalGatewayIp", request.localGatewayIp);
        query.put("PeerGatewayIp", request.peerGatewayIp);
        query.put("PeeringSubnetMask", request.peeringSubnetMask);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVirtualBorderRouterAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVirtualBorderRouterAttributeResponse());
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVirtualBorderRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVpcAttributeResponse modifyVpcAttributeWithOptions(ModifyVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VpcId", request.vpcId);
        query.put("Description", request.description);
        query.put("VpcName", request.vpcName);
        query.put("CidrBlock", request.cidrBlock);
        query.put("RegionId", request.regionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcAttributeResponse());
    }

    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcAttributeWithOptions(request, runtime);
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttributeWithOptions(ModifyVRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("VRouterId", request.VRouterId);
        query.put("VRouterName", request.VRouterName);
        query.put("Description", request.description);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVRouterAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVRouterAttributeResponse());
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttribute(ModifyVRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VSwitchName", request.vSwitchName);
        query.put("RegionId", request.regionId);
        query.put("Description", request.description);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVSwitchAttribute"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOfferingWithOptions(PurchaseReservedInstancesOfferingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ZoneId", request.zoneId);
        query.put("ReservedInstanceName", request.reservedInstanceName);
        query.put("InstanceType", request.instanceType);
        query.put("Scope", request.scope);
        query.put("InstanceAmount", request.instanceAmount);
        query.put("OfferingType", request.offeringType);
        query.put("Description", request.description);
        query.put("Platform", request.platform);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurchaseReservedInstancesOffering"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurchaseReservedInstancesOfferingResponse());
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purchaseReservedInstancesOfferingWithOptions(request, runtime);
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnitWithOptions(PurchaseStorageCapacityUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Name", request.name);
        query.put("Capacity", request.capacity);
        query.put("Description", request.description);
        query.put("StartTime", request.startTime);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("FromApp", request.fromApp);
        query.put("ClientToken", request.clientToken);
        query.put("Amount", request.amount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurchaseStorageCapacityUnit"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurchaseStorageCapacityUnitResponse());
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purchaseStorageCapacityUnitWithOptions(request, runtime);
    }

    public ReActivateInstancesResponse reActivateInstancesWithOptions(ReActivateInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReActivateInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReActivateInstancesResponse());
    }

    public ReActivateInstancesResponse reActivateInstances(ReActivateInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reActivateInstancesWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("ForceStop", request.forceStop);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public RebootInstancesResponse rebootInstancesWithOptions(RebootInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DryRun", request.dryRun);
        query.put("RegionId", request.regionId);
        query.put("ForceReboot", request.forceReboot);
        query.put("BatchOptimization", request.batchOptimization);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstancesResponse());
    }

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterWithOptions(RecoverVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("VbrId", request.vbrId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverVirtualBorderRouter"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverVirtualBorderRouterResponse());
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoverVirtualBorderRouterWithOptions(request, runtime);
    }

    public RedeployDedicatedHostResponse redeployDedicatedHostWithOptions(RedeployDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedeployDedicatedHost"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedeployDedicatedHostResponse());
    }

    public RedeployDedicatedHostResponse redeployDedicatedHost(RedeployDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.redeployDedicatedHostWithOptions(request, runtime);
    }

    public RedeployInstanceResponse redeployInstanceWithOptions(RedeployInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("ForceStop", request.forceStop);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedeployInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedeployInstanceResponse());
    }

    public RedeployInstanceResponse redeployInstance(RedeployInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.redeployInstanceWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("Password", request.password);
        query.put("KeyPairName", request.keyPairName);
        query.put("AutoStartInstance", request.autoStartInstance);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReInitDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public ReleaseCapacityReservationResponse releaseCapacityReservationWithOptions(ReleaseCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCapacityReservation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseCapacityReservationResponse());
    }

    public ReleaseCapacityReservationResponse releaseCapacityReservation(ReleaseCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseCapacityReservationWithOptions(request, runtime);
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHostWithOptions(ReleaseDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("DedicatedHostId", request.dedicatedHostId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseDedicatedHost"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseDedicatedHostResponse());
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHost(ReleaseDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseDedicatedHostWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseEipAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddressWithOptions(ReleasePublicIpAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("PublicIpAddress", request.publicIpAddress);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePublicIpAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePublicIpAddressResponse());
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddress(ReleasePublicIpAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePublicIpAddressWithOptions(request, runtime);
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsWithOptions(RemoveBandwidthPackageIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("ClientToken", request.clientToken);
        query.put("RemovedIpAddresses", request.removedIpAddresses);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveBandwidthPackageIps"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBandwidthPackageIpsResponse());
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBandwidthPackageIpsWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTags"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public RenewDedicatedHostsResponse renewDedicatedHostsWithOptions(RenewDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DedicatedHostIds", request.dedicatedHostIds);
        query.put("RegionId", request.regionId);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewDedicatedHosts"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDedicatedHostsResponse());
    }

    public RenewDedicatedHostsResponse renewDedicatedHosts(RenewDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDedicatedHostsWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceId", request.instanceId);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("ExpectedRenewDay", request.expectedRenewDay);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ReplaceSystemDiskResponse replaceSystemDiskWithOptions(ReplaceSystemDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("ImageId", request.imageId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UseAdditionalService", request.useAdditionalService);
        query.put("Password", request.password);
        query.put("PasswordInherit", request.passwordInherit);
        query.put("KeyPairName", request.keyPairName);
        query.put("DiskId", request.diskId);
        query.put("Platform", request.platform);
        query.put("Architecture", request.architecture);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceSystemDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceSystemDiskResponse());
    }

    public ReplaceSystemDiskResponse replaceSystemDisk(ReplaceSystemDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceSystemDiskWithOptions(request, runtime);
    }

    public ReportInstancesStatusResponse reportInstancesStatusWithOptions(ReportInstancesStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Reason", request.reason);
        query.put("Description", request.description);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("IssueCategory", request.issueCategory);
        query.put("InstanceId", request.instanceId);
        query.put("DiskId", request.diskId);
        query.put("Device", request.device);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportInstancesStatus"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportInstancesStatusResponse());
    }

    public ReportInstancesStatusResponse reportInstancesStatus(ReportInstancesStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportInstancesStatusWithOptions(request, runtime);
    }

    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("SnapshotId", request.snapshotId);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDiskResponse());
    }

    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    public ResetDisksResponse resetDisksWithOptions(ResetDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("Disk", request.disk);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDisks"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDisksResponse());
    }

    public ResetDisksResponse resetDisks(ResetDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDisksWithOptions(request, runtime);
    }

    public ResizeDiskResponse resizeDiskWithOptions(ResizeDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("DiskId", request.diskId);
        query.put("Type", request.type);
        query.put("NewSize", request.newSize);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResizeDisk"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResizeDiskResponse());
    }

    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDiskWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("PortRange", request.portRange);
        query.put("IpProtocol", request.ipProtocol);
        query.put("SourceGroupId", request.sourceGroupId);
        query.put("SourceGroupOwnerId", request.sourceGroupOwnerId);
        query.put("SourceGroupOwnerAccount", request.sourceGroupOwnerAccount);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroup"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("IpProtocol", request.ipProtocol);
        query.put("PortRange", request.portRange);
        query.put("DestGroupId", request.destGroupId);
        query.put("DestGroupOwnerId", request.destGroupOwnerId);
        query.put("DestGroupOwnerAccount", request.destGroupOwnerAccount);
        query.put("DestCidrIp", request.destCidrIp);
        query.put("Ipv6DestCidrIp", request.ipv6DestCidrIp);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Policy", request.policy);
        query.put("Priority", request.priority);
        query.put("NicType", request.nicType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroupEgress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupEgressResponse());
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunCommandShrinkRequest request = new RunCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("Type", request.type);
        query.put("CommandContent", request.commandContent);
        query.put("WorkingDir", request.workingDir);
        query.put("Timeout", request.timeout);
        query.put("EnableParameter", request.enableParameter);
        query.put("Timed", request.timed);
        query.put("Frequency", request.frequency);
        query.put("Parameters", request.parametersShrink);
        query.put("KeepCommand", request.keepCommand);
        query.put("ContentEncoding", request.contentEncoding);
        query.put("Username", request.username);
        query.put("WindowsPasswordName", request.windowsPasswordName);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public RunInstancesResponse runInstancesWithOptions(RunInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ImageId", request.imageId);
        query.put("ImageFamily", request.imageFamily);
        query.put("InstanceType", request.instanceType);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("InstanceName", request.instanceName);
        query.put("Description", request.description);
        query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("HostName", request.hostName);
        query.put("UniqueSuffix", request.uniqueSuffix);
        query.put("Password", request.password);
        query.put("PasswordInherit", request.passwordInherit);
        query.put("ZoneId", request.zoneId);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("IoOptimized", request.ioOptimized);
        query.put("UserData", request.userData);
        query.put("KeyPairName", request.keyPairName);
        query.put("RamRoleName", request.ramRoleName);
        query.put("Amount", request.amount);
        query.put("MinAmount", request.minAmount);
        query.put("AutoReleaseTime", request.autoReleaseTime);
        query.put("SpotStrategy", request.spotStrategy);
        query.put("SpotDuration", request.spotDuration);
        query.put("SpotPriceLimit", request.spotPriceLimit);
        query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        query.put("ClientToken", request.clientToken);
        query.put("HpcClusterId", request.hpcClusterId);
        query.put("DryRun", request.dryRun);
        query.put("DedicatedHostId", request.dedicatedHostId);
        query.put("LaunchTemplateId", request.launchTemplateId);
        query.put("LaunchTemplateName", request.launchTemplateName);
        query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Period", request.period);
        query.put("PeriodUnit", request.periodUnit);
        query.put("AutoRenew", request.autoRenew);
        query.put("AutoRenewPeriod", request.autoRenewPeriod);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("DeploymentSetId", request.deploymentSetId);
        query.put("DeploymentSetGroupNo", request.deploymentSetGroupNo);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("CreditSpecification", request.creditSpecification);
        query.put("Ipv6AddressCount", request.ipv6AddressCount);
        query.put("NetworkInterfaceQueueNumber", request.networkInterfaceQueueNumber);
        query.put("DeletionProtection", request.deletionProtection);
        query.put("Affinity", request.affinity);
        query.put("Tenancy", request.tenancy);
        query.put("StorageSetId", request.storageSetId);
        query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        query.put("HttpEndpoint", request.httpEndpoint);
        query.put("HttpTokens", request.httpTokens);
        query.put("HttpPutResponseHopLimit", request.httpPutResponseHopLimit);
        query.put("Isp", request.isp);
        query.put("SecurityGroupIds", request.securityGroupIds);
        query.put("HostNames", request.hostNames);
        query.put("DataDisk", request.dataDisk);
        query.put("Arn", request.arn);
        query.put("NetworkInterface", request.networkInterface);
        query.put("Tag", request.tag);
        query.put("Ipv6Address", request.ipv6Address);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunInstancesResponse());
    }

    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

    public SendFileResponse sendFileWithOptions(SendFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("Timeout", request.timeout);
        query.put("TargetDir", request.targetDir);
        query.put("ContentType", request.contentType);
        query.put("Content", request.content);
        query.put("FileOwner", request.fileOwner);
        query.put("FileGroup", request.fileGroup);
        query.put("FileMode", request.fileMode);
        query.put("Overwrite", request.overwrite);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendFile"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendFileResponse());
    }

    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    public StartElasticityAssuranceResponse startElasticityAssuranceWithOptions(StartElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartElasticityAssurance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartElasticityAssuranceResponse());
    }

    public StartElasticityAssuranceResponse startElasticityAssurance(StartElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startElasticityAssuranceWithOptions(request, runtime);
    }

    public StartImagePipelineExecutionResponse startImagePipelineExecutionWithOptions(StartImagePipelineExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("TemplateTag", request.templateTag);
        query.put("RegionId", request.regionId);
        query.put("ImagePipelineId", request.imagePipelineId);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartImagePipelineExecution"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartImagePipelineExecutionResponse());
    }

    public StartImagePipelineExecutionResponse startImagePipelineExecution(StartImagePipelineExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startImagePipelineExecutionWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SourceRegionId", request.sourceRegionId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("InitLocalDisk", request.initLocalDisk);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StartInstancesResponse startInstancesWithOptions(StartInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DryRun", request.dryRun);
        query.put("RegionId", request.regionId);
        query.put("BatchOptimization", request.batchOptimization);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstancesResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("ConfirmStop", request.confirmStop);
        query.put("ForceStop", request.forceStop);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("StoppedMode", request.stoppedMode);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("DryRun", request.dryRun);
        query.put("RegionId", request.regionId);
        query.put("ForceStop", request.forceStop);
        query.put("StoppedMode", request.stoppedMode);
        query.put("BatchOptimization", request.batchOptimization);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstances"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("InvokeId", request.invokeId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInvocation"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInvocationResponse());
    }

    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("ResourceId", request.resourceId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnectionWithOptions(TerminatePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PhysicalConnectionId", request.physicalConnectionId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminatePhysicalConnection"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminatePhysicalConnectionResponse());
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminatePhysicalConnectionWithOptions(request, runtime);
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterWithOptions(TerminateVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("VbrId", request.vbrId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("UserCidr", request.userCidr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateVirtualBorderRouter"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateVirtualBorderRouterResponse());
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateVirtualBorderRouterWithOptions(request, runtime);
    }

    public UnassignIpv6AddressesResponse unassignIpv6AddressesWithOptions(UnassignIpv6AddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("Ipv6Address", request.ipv6Address);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignIpv6Addresses"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignIpv6AddressesResponse());
    }

    public UnassignIpv6AddressesResponse unassignIpv6Addresses(UnassignIpv6AddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassignIpv6AddressesWithOptions(request, runtime);
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesWithOptions(UnassignPrivateIpAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("NetworkInterfaceId", request.networkInterfaceId);
        query.put("PrivateIpAddress", request.privateIpAddress);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignPrivateIpAddresses"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignPrivateIpAddressesResponse());
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassignPrivateIpAddressesWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RegionId", request.regionId);
        query.put("AllocationId", request.allocationId);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("InstanceType", request.instanceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateEipAddress"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public UnassociateHaVipResponse unassociateHaVipWithOptions(UnassociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("ClientToken", request.clientToken);
        query.put("RegionId", request.regionId);
        query.put("HaVipId", request.haVipId);
        query.put("InstanceId", request.instanceId);
        query.put("Force", request.force);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateHaVip"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateHaVipResponse());
    }

    public UnassociateHaVipResponse unassociateHaVip(UnassociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateHaVipWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("RegionId", request.regionId);
        query.put("RegionId", request.regionId);
        query.put("ResourceType", request.resourceType);
        query.put("All", request.all);
        query.put("ResourceId", request.resourceId);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2014-05-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
