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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcceptInquiredSystemEvent", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AcceptInquiredSystemEventResponse());
    }

    public AcceptInquiredSystemEventResponse acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptInquiredSystemEventWithOptions(request, runtime);
    }

    public ActivateRouterInterfaceResponse activateRouterInterfaceWithOptions(ActivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateRouterInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateRouterInterfaceResponse());
    }

    public ActivateRouterInterfaceResponse activateRouterInterface(ActivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateRouterInterfaceWithOptions(request, runtime);
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIpsWithOptions(AddBandwidthPackageIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBandwidthPackageIps", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AddBandwidthPackageIpsResponse());
    }

    public AddBandwidthPackageIpsResponse addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBandwidthPackageIpsWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTags", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHostsWithOptions(AllocateDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateDedicatedHosts", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateDedicatedHostsResponse());
    }

    public AllocateDedicatedHostsResponse allocateDedicatedHosts(AllocateDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateDedicatedHostsWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateEipAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddressWithOptions(AllocatePublicIpAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocatePublicIpAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AllocatePublicIpAddressResponse());
    }

    public AllocatePublicIpAddressResponse allocatePublicIpAddress(AllocatePublicIpAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePublicIpAddressWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyAutoSnapshotPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public AssignIpv6AddressesResponse assignIpv6AddressesWithOptions(AssignIpv6AddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignIpv6Addresses", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AssignIpv6AddressesResponse());
    }

    public AssignIpv6AddressesResponse assignIpv6Addresses(AssignIpv6AddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignIpv6AddressesWithOptions(request, runtime);
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddressesWithOptions(AssignPrivateIpAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignPrivateIpAddresses", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AssignPrivateIpAddressesResponse());
    }

    public AssignPrivateIpAddressesResponse assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignPrivateIpAddressesWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateEipAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AssociateHaVipResponse associateHaVipWithOptions(AssociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateHaVip", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateHaVipResponse());
    }

    public AssociateHaVipResponse associateHaVip(AssociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateHaVipWithOptions(request, runtime);
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpcWithOptions(AttachClassicLinkVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachClassicLinkVpc", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AttachClassicLinkVpcResponse());
    }

    public AttachClassicLinkVpcResponse attachClassicLinkVpc(AttachClassicLinkVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachClassicLinkVpcWithOptions(request, runtime);
    }

    public AttachDiskResponse attachDiskWithOptions(AttachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AttachDiskResponse());
    }

    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRoleWithOptions(AttachInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachInstanceRamRole", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AttachInstanceRamRoleResponse());
    }

    public AttachInstanceRamRoleResponse attachInstanceRamRole(AttachInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachInstanceRamRoleWithOptions(request, runtime);
    }

    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachKeyPair", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AttachKeyPairResponse());
    }

    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    public AttachNetworkInterfaceResponse attachNetworkInterfaceWithOptions(AttachNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachNetworkInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AttachNetworkInterfaceResponse());
    }

    public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachNetworkInterfaceWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuthorizeSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuthorizeSecurityGroupEgress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelAutoSnapshotPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CancelCopyImageResponse cancelCopyImageWithOptions(CancelCopyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelCopyImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelCopyImageResponse());
    }

    public CancelCopyImageResponse cancelCopyImage(CancelCopyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCopyImageWithOptions(request, runtime);
    }

    public CancelImagePipelineExecutionResponse cancelImagePipelineExecutionWithOptions(CancelImagePipelineExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelImagePipelineExecution", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelImagePipelineExecutionResponse());
    }

    public CancelImagePipelineExecutionResponse cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelImagePipelineExecutionWithOptions(request, runtime);
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnectionWithOptions(CancelPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPhysicalConnectionResponse());
    }

    public CancelPhysicalConnectionResponse cancelPhysicalConnection(CancelPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPhysicalConnectionWithOptions(request, runtime);
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEventsWithOptions(CancelSimulatedSystemEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelSimulatedSystemEvents", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelSimulatedSystemEventsResponse());
    }

    public CancelSimulatedSystemEventsResponse cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelSimulatedSystemEventsWithOptions(request, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelTask", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelTaskResponse());
    }

    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    public ConnectRouterInterfaceResponse connectRouterInterfaceWithOptions(ConnectRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConnectRouterInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ConnectRouterInterfaceResponse());
    }

    public ConnectRouterInterfaceResponse connectRouterInterface(ConnectRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.connectRouterInterfaceWithOptions(request, runtime);
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEipWithOptions(ConvertNatPublicIpToEipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertNatPublicIpToEip", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertNatPublicIpToEipResponse());
    }

    public ConvertNatPublicIpToEipResponse convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertNatPublicIpToEipWithOptions(request, runtime);
    }

    public CopyImageResponse copyImageWithOptions(CopyImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CopyImageResponse());
    }

    public CopyImageResponse copyImage(CopyImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyImageWithOptions(request, runtime);
    }

    public CopySnapshotResponse copySnapshotWithOptions(CopySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopySnapshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CopySnapshotResponse());
    }

    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copySnapshotWithOptions(request, runtime);
    }

    public CreateActivationResponse createActivationWithOptions(CreateActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateActivation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateActivationResponse());
    }

    public CreateActivationResponse createActivation(CreateActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createActivationWithOptions(request, runtime);
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroupWithOptions(CreateAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAutoProvisioningGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAutoProvisioningGroupResponse());
    }

    public CreateAutoProvisioningGroupResponse createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoProvisioningGroupWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAutoSnapshotPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateCapacityReservationResponse createCapacityReservationWithOptions(CreateCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCapacityReservation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCapacityReservationResponse());
    }

    public CreateCapacityReservationResponse createCapacityReservation(CreateCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCapacityReservationWithOptions(request, runtime);
    }

    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCommand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCommandResponse());
    }

    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostClusterWithOptions(CreateDedicatedHostClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedHostCluster", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedHostClusterResponse());
    }

    public CreateDedicatedHostClusterResponse createDedicatedHostCluster(CreateDedicatedHostClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedHostClusterWithOptions(request, runtime);
    }

    public CreateDemandResponse createDemandWithOptions(CreateDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDemand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDemandResponse());
    }

    public CreateDemandResponse createDemand(CreateDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDemandWithOptions(request, runtime);
    }

    public CreateDeploymentSetResponse createDeploymentSetWithOptions(CreateDeploymentSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeploymentSet", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeploymentSetResponse());
    }

    public CreateDeploymentSetResponse createDeploymentSet(CreateDeploymentSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeploymentSetWithOptions(request, runtime);
    }

    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDiskResponse());
    }

    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    public CreateElasticityAssuranceResponse createElasticityAssuranceWithOptions(CreateElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateElasticityAssurance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateElasticityAssuranceResponse());
    }

    public CreateElasticityAssuranceResponse createElasticityAssurance(CreateElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createElasticityAssuranceWithOptions(request, runtime);
    }

    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateForwardEntry", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateForwardEntryResponse());
    }

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    public CreateHaVipResponse createHaVipWithOptions(CreateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHaVip", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHaVipResponse());
    }

    public CreateHaVipResponse createHaVip(CreateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHaVipWithOptions(request, runtime);
    }

    public CreateHpcClusterResponse createHpcClusterWithOptions(CreateHpcClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHpcCluster", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHpcClusterResponse());
    }

    public CreateHpcClusterResponse createHpcCluster(CreateHpcClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHpcClusterWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateImageComponentResponse createImageComponentWithOptions(CreateImageComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImageComponent", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageComponentResponse());
    }

    public CreateImageComponentResponse createImageComponent(CreateImageComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageComponentWithOptions(request, runtime);
    }

    public CreateImagePipelineResponse createImagePipelineWithOptions(CreateImagePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImagePipeline", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImagePipelineResponse());
    }

    public CreateImagePipelineResponse createImagePipeline(CreateImagePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImagePipelineWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateKeyPair", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public CreateLaunchTemplateResponse createLaunchTemplateWithOptions(CreateLaunchTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLaunchTemplate", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLaunchTemplateResponse());
    }

    public CreateLaunchTemplateResponse createLaunchTemplate(CreateLaunchTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLaunchTemplateWithOptions(request, runtime);
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersionWithOptions(CreateLaunchTemplateVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLaunchTemplateVersion", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLaunchTemplateVersionResponse());
    }

    public CreateLaunchTemplateVersionResponse createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLaunchTemplateVersionWithOptions(request, runtime);
    }

    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNatGateway", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNatGatewayResponse());
    }

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    public CreateNetworkInterfaceResponse createNetworkInterfaceWithOptions(CreateNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetworkInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkInterfaceResponse());
    }

    public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkInterfaceWithOptions(request, runtime);
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionWithOptions(CreateNetworkInterfacePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetworkInterfacePermission", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkInterfacePermissionResponse());
    }

    public CreateNetworkInterfacePermissionResponse createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public CreatePhysicalConnectionResponse createPhysicalConnectionWithOptions(CreatePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePhysicalConnectionResponse());
    }

    public CreatePhysicalConnectionResponse createPhysicalConnection(CreatePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhysicalConnectionWithOptions(request, runtime);
    }

    public CreateResource02Response createResource02WithOptions(CreateResource02Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResource02", "2014-05-26", "HTTPS", "PUT", "AK", "json", req, runtime), new CreateResource02Response());
    }

    public CreateResource02Response createResource02(CreateResource02Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResource02WithOptions(request, runtime);
    }

    public CreateRouteEntryResponse createRouteEntryWithOptions(CreateRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRouteEntry", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRouteEntryResponse());
    }

    public CreateRouteEntryResponse createRouteEntry(CreateRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouteEntryWithOptions(request, runtime);
    }

    public CreateRouterInterfaceResponse createRouterInterfaceWithOptions(CreateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRouterInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRouterInterfaceResponse());
    }

    public CreateRouterInterfaceResponse createRouterInterface(CreateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRouterInterfaceWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEventsWithOptions(CreateSimulatedSystemEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSimulatedSystemEvents", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSimulatedSystemEventsResponse());
    }

    public CreateSimulatedSystemEventsResponse createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimulatedSystemEventsWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public CreateSnapshotGroupResponse createSnapshotGroupWithOptions(CreateSnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshotGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotGroupResponse());
    }

    public CreateSnapshotGroupResponse createSnapshotGroup(CreateSnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotGroupWithOptions(request, runtime);
    }

    public CreateStorageSetResponse createStorageSetWithOptions(CreateStorageSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStorageSet", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStorageSetResponse());
    }

    public CreateStorageSetResponse createStorageSet(CreateStorageSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStorageSetWithOptions(request, runtime);
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouterWithOptions(CreateVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVirtualBorderRouter", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVirtualBorderRouterResponse());
    }

    public CreateVirtualBorderRouterResponse createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualBorderRouterWithOptions(request, runtime);
    }

    public CreateVpcResponse createVpcWithOptions(CreateVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpc", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpcResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVSwitch", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterfaceWithOptions(DeactivateRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactivateRouterInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeactivateRouterInterfaceResponse());
    }

    public DeactivateRouterInterfaceResponse deactivateRouterInterface(DeactivateRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactivateRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteActivationResponse deleteActivationWithOptions(DeleteActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteActivation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteActivationResponse());
    }

    public DeleteActivationResponse deleteActivation(DeleteActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteActivationWithOptions(request, runtime);
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroupWithOptions(DeleteAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoProvisioningGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoProvisioningGroupResponse());
    }

    public DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoProvisioningGroupWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoSnapshotPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBandwidthPackage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteCommandResponse deleteCommandWithOptions(DeleteCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCommand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCommandResponse());
    }

    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommandWithOptions(request, runtime);
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostClusterWithOptions(DeleteDedicatedHostClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedHostCluster", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedHostClusterResponse());
    }

    public DeleteDedicatedHostClusterResponse deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedHostClusterWithOptions(request, runtime);
    }

    public DeleteDemandResponse deleteDemandWithOptions(DeleteDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDemand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDemandResponse());
    }

    public DeleteDemandResponse deleteDemand(DeleteDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDemandWithOptions(request, runtime);
    }

    public DeleteDeploymentSetResponse deleteDeploymentSetWithOptions(DeleteDeploymentSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeploymentSet", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeploymentSetResponse());
    }

    public DeleteDeploymentSetResponse deleteDeploymentSet(DeleteDeploymentSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeploymentSetWithOptions(request, runtime);
    }

    public DeleteDiskResponse deleteDiskWithOptions(DeleteDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDiskResponse());
    }

    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDiskWithOptions(request, runtime);
    }

    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteForwardEntry", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteForwardEntryResponse());
    }

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    public DeleteHaVipResponse deleteHaVipWithOptions(DeleteHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHaVip", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHaVipResponse());
    }

    public DeleteHaVipResponse deleteHaVip(DeleteHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHaVipWithOptions(request, runtime);
    }

    public DeleteHpcClusterResponse deleteHpcClusterWithOptions(DeleteHpcClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHpcCluster", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHpcClusterResponse());
    }

    public DeleteHpcClusterResponse deleteHpcCluster(DeleteHpcClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHpcClusterWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteImageComponentResponse deleteImageComponentWithOptions(DeleteImageComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImageComponent", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageComponentResponse());
    }

    public DeleteImageComponentResponse deleteImageComponent(DeleteImageComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageComponentWithOptions(request, runtime);
    }

    public DeleteImagePipelineResponse deleteImagePipelineWithOptions(DeleteImagePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImagePipeline", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImagePipelineResponse());
    }

    public DeleteImagePipelineResponse deleteImagePipeline(DeleteImagePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImagePipelineWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstancesResponse());
    }

    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstancesWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteKeyPairs", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplateWithOptions(DeleteLaunchTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLaunchTemplate", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLaunchTemplateResponse());
    }

    public DeleteLaunchTemplateResponse deleteLaunchTemplate(DeleteLaunchTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLaunchTemplateWithOptions(request, runtime);
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionWithOptions(DeleteLaunchTemplateVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLaunchTemplateVersion", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLaunchTemplateVersionResponse());
    }

    public DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLaunchTemplateVersionWithOptions(request, runtime);
    }

    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNatGateway", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNatGatewayResponse());
    }

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterfaceWithOptions(DeleteNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetworkInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkInterfaceResponse());
    }

    public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkInterfaceWithOptions(request, runtime);
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermissionWithOptions(DeleteNetworkInterfacePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetworkInterfacePermission", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkInterfacePermissionResponse());
    }

    public DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkInterfacePermissionWithOptions(request, runtime);
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnectionWithOptions(DeletePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhysicalConnectionResponse());
    }

    public DeletePhysicalConnectionResponse deletePhysicalConnection(DeletePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhysicalConnectionWithOptions(request, runtime);
    }

    public DeleteRouteEntryResponse deleteRouteEntryWithOptions(DeleteRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouteEntry", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouteEntryResponse());
    }

    public DeleteRouteEntryResponse deleteRouteEntry(DeleteRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteEntryWithOptions(request, runtime);
    }

    public DeleteRouterInterfaceResponse deleteRouterInterfaceWithOptions(DeleteRouterInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRouterInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRouterInterfaceResponse());
    }

    public DeleteRouterInterfaceResponse deleteRouterInterface(DeleteRouterInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouterInterfaceWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteSnapshotGroupResponse deleteSnapshotGroupWithOptions(DeleteSnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshotGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotGroupResponse());
    }

    public DeleteSnapshotGroupResponse deleteSnapshotGroup(DeleteSnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotGroupWithOptions(request, runtime);
    }

    public DeleteStorageSetResponse deleteStorageSetWithOptions(DeleteStorageSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStorageSet", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStorageSetResponse());
    }

    public DeleteStorageSetResponse deleteStorageSet(DeleteStorageSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStorageSetWithOptions(request, runtime);
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterWithOptions(DeleteVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVirtualBorderRouter", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVirtualBorderRouterResponse());
    }

    public DeleteVirtualBorderRouterResponse deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualBorderRouterWithOptions(request, runtime);
    }

    public DeleteVpcResponse deleteVpcWithOptions(DeleteVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpc", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVSwitch", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeregisterManagedInstanceResponse deregisterManagedInstanceWithOptions(DeregisterManagedInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeregisterManagedInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeregisterManagedInstanceResponse());
    }

    public DeregisterManagedInstanceResponse deregisterManagedInstance(DeregisterManagedInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterManagedInstanceWithOptions(request, runtime);
    }

    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessPoints", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessPointsResponse());
    }

    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    public DescribeAccountAttributesResponse describeAccountAttributesWithOptions(DescribeAccountAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountAttributes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountAttributesResponse());
    }

    public DescribeAccountAttributesResponse describeAccountAttributes(DescribeAccountAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountAttributesWithOptions(request, runtime);
    }

    public DescribeActivationsResponse describeActivationsWithOptions(DescribeActivationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActivations", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActivationsResponse());
    }

    public DescribeActivationsResponse describeActivations(DescribeActivationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActivationsWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryWithOptions(DescribeAutoProvisioningGroupHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoProvisioningGroupHistory", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoProvisioningGroupHistoryResponse());
    }

    public DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupHistoryWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesWithOptions(DescribeAutoProvisioningGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoProvisioningGroupInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoProvisioningGroupInstancesResponse());
    }

    public DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupInstancesWithOptions(request, runtime);
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsWithOptions(DescribeAutoProvisioningGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoProvisioningGroups", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoProvisioningGroupsResponse());
    }

    public DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoProvisioningGroupsWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExWithOptions(DescribeAutoSnapshotPolicyExRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoSnapshotPolicyEx", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoSnapshotPolicyExResponse());
    }

    public DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitationWithOptions(DescribeBandwidthLimitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBandwidthLimitation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBandwidthLimitationResponse());
    }

    public DescribeBandwidthLimitationResponse describeBandwidthLimitation(DescribeBandwidthLimitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthLimitationWithOptions(request, runtime);
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackagesWithOptions(DescribeBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBandwidthPackages", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBandwidthPackagesResponse());
    }

    public DescribeBandwidthPackagesResponse describeBandwidthPackages(DescribeBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthPackagesWithOptions(request, runtime);
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstancesWithOptions(DescribeCapacityReservationInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCapacityReservationInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCapacityReservationInstancesResponse());
    }

    public DescribeCapacityReservationInstancesResponse describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCapacityReservationInstancesWithOptions(request, runtime);
    }

    public DescribeCapacityReservationsResponse describeCapacityReservationsWithOptions(DescribeCapacityReservationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCapacityReservations", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCapacityReservationsResponse());
    }

    public DescribeCapacityReservationsResponse describeCapacityReservations(DescribeCapacityReservationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCapacityReservationsWithOptions(request, runtime);
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstancesWithOptions(DescribeClassicLinkInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClassicLinkInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClassicLinkInstancesResponse());
    }

    public DescribeClassicLinkInstancesResponse describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClassicLinkInstancesWithOptions(request, runtime);
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatusWithOptions(DescribeCloudAssistantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudAssistantStatus", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudAssistantStatusResponse());
    }

    public DescribeCloudAssistantStatusResponse describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudAssistantStatusWithOptions(request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusters", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DescribeCommandsResponse describeCommandsWithOptions(DescribeCommandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCommands", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCommandsResponse());
    }

    public DescribeCommandsResponse describeCommands(DescribeCommandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCommandsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewWithOptions(DescribeDedicatedHostAutoRenewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostAutoRenew", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostAutoRenewResponse());
    }

    public DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostAutoRenewWithOptions(request, runtime);
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClustersWithOptions(DescribeDedicatedHostClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostClusters", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostClustersResponse());
    }

    public DescribeDedicatedHostClustersResponse describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostClustersWithOptions(request, runtime);
    }

    public DescribeDedicatedHostsResponse describeDedicatedHostsWithOptions(DescribeDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHosts", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostsResponse());
    }

    public DescribeDedicatedHostsResponse describeDedicatedHosts(DescribeDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostsWithOptions(request, runtime);
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypesWithOptions(DescribeDedicatedHostTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedHostTypes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedHostTypesResponse());
    }

    public DescribeDedicatedHostTypesResponse describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedHostTypesWithOptions(request, runtime);
    }

    public DescribeDemandsResponse describeDemandsWithOptions(DescribeDemandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDemands", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDemandsResponse());
    }

    public DescribeDemandsResponse describeDemands(DescribeDemandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDemandsWithOptions(request, runtime);
    }

    public DescribeDeploymentSetsResponse describeDeploymentSetsWithOptions(DescribeDeploymentSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeploymentSets", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeploymentSetsResponse());
    }

    public DescribeDeploymentSetsResponse describeDeploymentSets(DescribeDeploymentSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeploymentSetsWithOptions(request, runtime);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeploymentSetSupportedInstanceTypeFamily", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse());
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponse describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeploymentSetSupportedInstanceTypeFamilyWithOptions(request, runtime);
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorDataWithOptions(DescribeDiskMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiskMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiskMonitorDataResponse());
    }

    public DescribeDiskMonitorDataResponse describeDiskMonitorData(DescribeDiskMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiskMonitorDataWithOptions(request, runtime);
    }

    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDisks", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatusWithOptions(DescribeDisksFullStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDisksFullStatus", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDisksFullStatusResponse());
    }

    public DescribeDisksFullStatusResponse describeDisksFullStatus(DescribeDisksFullStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksFullStatusWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipAddresses", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeEipMonitorDataResponse describeEipMonitorDataWithOptions(DescribeEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipMonitorDataResponse());
    }

    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipMonitorDataWithOptions(request, runtime);
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstancesWithOptions(DescribeElasticityAssuranceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticityAssuranceInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticityAssuranceInstancesResponse());
    }

    public DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticityAssuranceInstancesWithOptions(request, runtime);
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurancesWithOptions(DescribeElasticityAssurancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticityAssurances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticityAssurancesResponse());
    }

    public DescribeElasticityAssurancesResponse describeElasticityAssurances(DescribeElasticityAssurancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticityAssurancesWithOptions(request, runtime);
    }

    public DescribeEniMonitorDataResponse describeEniMonitorDataWithOptions(DescribeEniMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEniMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEniMonitorDataResponse());
    }

    public DescribeEniMonitorDataResponse describeEniMonitorData(DescribeEniMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEniMonitorDataWithOptions(request, runtime);
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeForwardTableEntries", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeForwardTableEntriesResponse());
    }

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    public DescribeHaVipsResponse describeHaVipsWithOptions(DescribeHaVipsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHaVips", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHaVipsResponse());
    }

    public DescribeHaVipsResponse describeHaVips(DescribeHaVipsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHaVipsWithOptions(request, runtime);
    }

    public DescribeHpcClustersResponse describeHpcClustersWithOptions(DescribeHpcClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHpcClusters", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHpcClustersResponse());
    }

    public DescribeHpcClustersResponse describeHpcClusters(DescribeHpcClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHpcClustersWithOptions(request, runtime);
    }

    public DescribeImageComponentsResponse describeImageComponentsWithOptions(DescribeImageComponentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageComponents", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageComponentsResponse());
    }

    public DescribeImageComponentsResponse describeImageComponents(DescribeImageComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageComponentsWithOptions(request, runtime);
    }

    public DescribeImageFromFamilyResponse describeImageFromFamilyWithOptions(DescribeImageFromFamilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageFromFamily", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageFromFamilyResponse());
    }

    public DescribeImageFromFamilyResponse describeImageFromFamily(DescribeImageFromFamilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageFromFamilyWithOptions(request, runtime);
    }

    public DescribeImagePipelineExecutionsResponse describeImagePipelineExecutionsWithOptions(DescribeImagePipelineExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImagePipelineExecutions", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagePipelineExecutionsResponse());
    }

    public DescribeImagePipelineExecutionsResponse describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagePipelineExecutionsWithOptions(request, runtime);
    }

    public DescribeImagePipelinesResponse describeImagePipelinesWithOptions(DescribeImagePipelinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImagePipelines", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagePipelinesResponse());
    }

    public DescribeImagePipelinesResponse describeImagePipelines(DescribeImagePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagePipelinesWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImages", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageSharePermission", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesWithOptions(DescribeImageSupportInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageSupportInstanceTypes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageSupportInstanceTypesResponse());
    }

    public DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSupportInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributesWithOptions(DescribeInstanceAttachmentAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAttachmentAttributes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAttachmentAttributesResponse());
    }

    public DescribeInstanceAttachmentAttributesResponse describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsWithOptions(DescribeInstanceHistoryEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceHistoryEvents", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceHistoryEventsResponse());
    }

    public DescribeInstanceHistoryEventsResponse describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceHistoryEventsWithOptions(request, runtime);
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesWithOptions(DescribeInstanceMaintenanceAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceMaintenanceAttributes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceMaintenanceAttributesResponse());
    }

    public DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public DescribeInstanceModificationPriceResponse describeInstanceModificationPriceWithOptions(DescribeInstanceModificationPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceModificationPrice", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceModificationPriceResponse());
    }

    public DescribeInstanceModificationPriceResponse describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceModificationPriceWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRoleWithOptions(DescribeInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceRamRole", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceRamRoleResponse());
    }

    public DescribeInstanceRamRoleResponse describeInstanceRamRole(DescribeInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceRamRoleWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatusWithOptions(DescribeInstancesFullStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstancesFullStatus", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesFullStatusResponse());
    }

    public DescribeInstancesFullStatusResponse describeInstancesFullStatus(DescribeInstancesFullStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesFullStatusWithOptions(request, runtime);
    }

    public DescribeInstanceStatusResponse describeInstanceStatusWithOptions(DescribeInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceStatus", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceStatusResponse());
    }

    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatusWithOptions(request, runtime);
    }

    public DescribeInstanceTopologyResponse describeInstanceTopologyWithOptions(DescribeInstanceTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceTopology", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTopologyResponse());
    }

    public DescribeInstanceTopologyResponse describeInstanceTopology(DescribeInstanceTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTopologyWithOptions(request, runtime);
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesWithOptions(DescribeInstanceTypeFamiliesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceTypeFamilies", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTypeFamiliesResponse());
    }

    public DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypeFamiliesWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceTypes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswdWithOptions(DescribeInstanceVncPasswdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceVncPasswd", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceVncPasswdResponse());
    }

    public DescribeInstanceVncPasswdResponse describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncPasswdWithOptions(request, runtime);
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceVncUrl", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceVncUrlResponse());
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeInvocationResultsResponse describeInvocationResultsWithOptions(DescribeInvocationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInvocationResults", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInvocationResultsResponse());
    }

    public DescribeInvocationResultsResponse describeInvocationResults(DescribeInvocationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationResultsWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInvocations", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeKeyPairs", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplatesWithOptions(DescribeLaunchTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLaunchTemplates", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLaunchTemplatesResponse());
    }

    public DescribeLaunchTemplatesResponse describeLaunchTemplates(DescribeLaunchTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLaunchTemplatesWithOptions(request, runtime);
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsWithOptions(DescribeLaunchTemplateVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLaunchTemplateVersions", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLaunchTemplateVersionsResponse());
    }

    public DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLaunchTemplateVersionsWithOptions(request, runtime);
    }

    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLimitation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLimitationResponse());
    }

    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    public DescribeManagedInstancesResponse describeManagedInstancesWithOptions(DescribeManagedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeManagedInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeManagedInstancesResponse());
    }

    public DescribeManagedInstancesResponse describeManagedInstances(DescribeManagedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeManagedInstancesWithOptions(request, runtime);
    }

    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNatGateways", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNatGatewaysResponse());
    }

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttributeWithOptions(DescribeNetworkInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkInterfaceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkInterfaceAttributeResponse());
    }

    public DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsWithOptions(DescribeNetworkInterfacePermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkInterfacePermissions", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkInterfacePermissionsResponse());
    }

    public DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacePermissionsWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkInterfaces", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataWithOptions(DescribeNewProjectEipMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNewProjectEipMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNewProjectEipMonitorDataResponse());
    }

    public DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNewProjectEipMonitorDataWithOptions(request, runtime);
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnectionsWithOptions(DescribePhysicalConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePhysicalConnections", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePhysicalConnectionsResponse());
    }

    public DescribePhysicalConnectionsResponse describePhysicalConnections(DescribePhysicalConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhysicalConnectionsWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeWithOptions(DescribeRecommendInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecommendInstanceType", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecommendInstanceTypeResponse());
    }

    public DescribeRecommendInstanceTypeResponse describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecommendInstanceTypeWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRenewalPrice", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribeReservedInstancesResponse describeReservedInstancesWithOptions(DescribeReservedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReservedInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReservedInstancesResponse());
    }

    public DescribeReservedInstancesResponse describeReservedInstances(DescribeReservedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReservedInstancesWithOptions(request, runtime);
    }

    public DescribeResourceByTagsResponse describeResourceByTagsWithOptions(DescribeResourceByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceByTags", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceByTagsResponse());
    }

    public DescribeResourceByTagsResponse describeResourceByTags(DescribeResourceByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceByTagsWithOptions(request, runtime);
    }

    public DescribeResourcesModificationResponse describeResourcesModificationWithOptions(DescribeResourcesModificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourcesModification", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourcesModificationResponse());
    }

    public DescribeResourcesModificationResponse describeResourcesModification(DescribeResourcesModificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcesModificationWithOptions(request, runtime);
    }

    public DescribeRouterInterfacesResponse describeRouterInterfacesWithOptions(DescribeRouterInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouterInterfaces", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouterInterfacesResponse());
    }

    public DescribeRouterInterfacesResponse describeRouterInterfaces(DescribeRouterInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouterInterfacesWithOptions(request, runtime);
    }

    public DescribeRouteTablesResponse describeRouteTablesWithOptions(DescribeRouteTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRouteTables", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRouteTablesResponse());
    }

    public DescribeRouteTablesResponse describeRouteTables(DescribeRouteTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteTablesWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesWithOptions(DescribeSecurityGroupReferencesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupReferences", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupReferencesResponse());
    }

    public DescribeSecurityGroupReferencesResponse describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupReferencesWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroups", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeSendFileResultsResponse describeSendFileResultsWithOptions(DescribeSendFileResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSendFileResults", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSendFileResultsResponse());
    }

    public DescribeSendFileResultsResponse describeSendFileResults(DescribeSendFileResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSendFileResultsWithOptions(request, runtime);
    }

    public DescribeSnapshotGroupsResponse describeSnapshotGroupsWithOptions(DescribeSnapshotGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshotGroups", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotGroupsResponse());
    }

    public DescribeSnapshotGroupsResponse describeSnapshotGroups(DescribeSnapshotGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotGroupsWithOptions(request, runtime);
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinksWithOptions(DescribeSnapshotLinksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshotLinks", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotLinksResponse());
    }

    public DescribeSnapshotLinksResponse describeSnapshotLinks(DescribeSnapshotLinksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotLinksWithOptions(request, runtime);
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorDataWithOptions(DescribeSnapshotMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshotMonitorData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotMonitorDataResponse());
    }

    public DescribeSnapshotMonitorDataResponse describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotMonitorDataWithOptions(request, runtime);
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackageWithOptions(DescribeSnapshotPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshotPackage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotPackageResponse());
    }

    public DescribeSnapshotPackageResponse describeSnapshotPackage(DescribeSnapshotPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotPackageWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshots", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsageWithOptions(DescribeSnapshotsUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshotsUsage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotsUsageResponse());
    }

    public DescribeSnapshotsUsageResponse describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsUsageWithOptions(request, runtime);
    }

    public DescribeSpotAdviceResponse describeSpotAdviceWithOptions(DescribeSpotAdviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSpotAdvice", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSpotAdviceResponse());
    }

    public DescribeSpotAdviceResponse describeSpotAdvice(DescribeSpotAdviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpotAdviceWithOptions(request, runtime);
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistoryWithOptions(DescribeSpotPriceHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSpotPriceHistory", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSpotPriceHistoryResponse());
    }

    public DescribeSpotPriceHistoryResponse describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpotPriceHistoryWithOptions(request, runtime);
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnitsWithOptions(DescribeStorageCapacityUnitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStorageCapacityUnits", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStorageCapacityUnitsResponse());
    }

    public DescribeStorageCapacityUnitsResponse describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageCapacityUnitsWithOptions(request, runtime);
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetailsWithOptions(DescribeStorageSetDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStorageSetDetails", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStorageSetDetailsResponse());
    }

    public DescribeStorageSetDetailsResponse describeStorageSetDetails(DescribeStorageSetDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageSetDetailsWithOptions(request, runtime);
    }

    public DescribeStorageSetsResponse describeStorageSetsWithOptions(DescribeStorageSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStorageSets", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStorageSetsResponse());
    }

    public DescribeStorageSetsResponse describeStorageSets(DescribeStorageSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStorageSetsWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeTaskAttributeResponse describeTaskAttributeWithOptions(DescribeTaskAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTaskAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTaskAttributeResponse());
    }

    public DescribeTaskAttributeResponse describeTaskAttribute(DescribeTaskAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskAttributeWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehaviorWithOptions(DescribeUserBusinessBehaviorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserBusinessBehavior", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserBusinessBehaviorResponse());
    }

    public DescribeUserBusinessBehaviorResponse describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBusinessBehaviorWithOptions(request, runtime);
    }

    public DescribeUserDataResponse describeUserDataWithOptions(DescribeUserDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserData", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserDataResponse());
    }

    public DescribeUserDataResponse describeUserData(DescribeUserDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDataWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersWithOptions(DescribeVirtualBorderRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVirtualBorderRouters", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVirtualBorderRoutersResponse());
    }

    public DescribeVirtualBorderRoutersResponse describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersWithOptions(request, runtime);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionWithOptions(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVirtualBorderRoutersForPhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVirtualBorderRoutersForPhysicalConnectionResponse());
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualBorderRoutersForPhysicalConnectionWithOptions(request, runtime);
    }

    public DescribeVpcsResponse describeVpcsWithOptions(DescribeVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcs", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcsResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcsWithOptions(request, runtime);
    }

    public DescribeVRoutersResponse describeVRoutersWithOptions(DescribeVRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVRouters", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVRoutersResponse());
    }

    public DescribeVRoutersResponse describeVRouters(DescribeVRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVRoutersWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVSwitches", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpcWithOptions(DetachClassicLinkVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachClassicLinkVpc", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DetachClassicLinkVpcResponse());
    }

    public DetachClassicLinkVpcResponse detachClassicLinkVpc(DetachClassicLinkVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachClassicLinkVpcWithOptions(request, runtime);
    }

    public DetachDiskResponse detachDiskWithOptions(DetachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DetachDiskResponse());
    }

    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRoleWithOptions(DetachInstanceRamRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachInstanceRamRole", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DetachInstanceRamRoleResponse());
    }

    public DetachInstanceRamRoleResponse detachInstanceRamRole(DetachInstanceRamRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachInstanceRamRoleWithOptions(request, runtime);
    }

    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachKeyPair", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DetachKeyPairResponse());
    }

    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    public DetachNetworkInterfaceResponse detachNetworkInterfaceWithOptions(DetachNetworkInterfaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachNetworkInterface", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DetachNetworkInterfaceResponse());
    }

    public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachNetworkInterfaceWithOptions(request, runtime);
    }

    public DisableActivationResponse disableActivationWithOptions(DisableActivationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableActivation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new DisableActivationResponse());
    }

    public DisableActivationResponse disableActivation(DisableActivationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableActivationWithOptions(request, runtime);
    }

    public EipFillParamsResponse eipFillParamsWithOptions(EipFillParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EipFillParams", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new EipFillParamsResponse());
    }

    public EipFillParamsResponse eipFillParams(EipFillParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipFillParamsWithOptions(request, runtime);
    }

    public EipFillProductResponse eipFillProductWithOptions(EipFillProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EipFillProduct", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new EipFillProductResponse());
    }

    public EipFillProductResponse eipFillProduct(EipFillProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipFillProductWithOptions(request, runtime);
    }

    public EipNotifyPaidResponse eipNotifyPaidWithOptions(EipNotifyPaidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EipNotifyPaid", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new EipNotifyPaidResponse());
    }

    public EipNotifyPaidResponse eipNotifyPaid(EipNotifyPaidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.eipNotifyPaidWithOptions(request, runtime);
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnectionWithOptions(EnablePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnablePhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new EnablePhysicalConnectionResponse());
    }

    public EnablePhysicalConnectionResponse enablePhysicalConnection(EnablePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enablePhysicalConnectionWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public ExportSnapshotResponse exportSnapshotWithOptions(ExportSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportSnapshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ExportSnapshotResponse());
    }

    public ExportSnapshotResponse exportSnapshot(ExportSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportSnapshotWithOptions(request, runtime);
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutputWithOptions(GetInstanceConsoleOutputRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceConsoleOutput", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceConsoleOutputResponse());
    }

    public GetInstanceConsoleOutputResponse getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceConsoleOutputWithOptions(request, runtime);
    }

    public GetInstanceScreenshotResponse getInstanceScreenshotWithOptions(GetInstanceScreenshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceScreenshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceScreenshotResponse());
    }

    public GetInstanceScreenshotResponse getInstanceScreenshot(GetInstanceScreenshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceScreenshotWithOptions(request, runtime);
    }

    public ImportImageResponse importImageWithOptions(ImportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportImage", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ImportImageResponse());
    }

    public ImportImageResponse importImage(ImportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importImageWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportKeyPair", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public ImportSnapshotResponse importSnapshotWithOptions(ImportSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportSnapshot", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ImportSnapshotResponse());
    }

    public ImportSnapshotResponse importSnapshot(ImportSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importSnapshotWithOptions(request, runtime);
    }

    public InstallCloudAssistantResponse installCloudAssistantWithOptions(InstallCloudAssistantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallCloudAssistant", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new InstallCloudAssistantResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeCommand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeCommandResponse());
    }

    public InvokeCommandResponse invokeCommand(InvokeCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeCommandWithOptions(request, runtime);
    }

    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinResourceGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new JoinResourceGroupResponse());
    }

    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LeaveSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroupWithOptions(ModifyAutoProvisioningGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoProvisioningGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoProvisioningGroupResponse());
    }

    public ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoProvisioningGroupWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoSnapshotPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyExWithOptions(ModifyAutoSnapshotPolicyExRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoSnapshotPolicyEx", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoSnapshotPolicyExResponse());
    }

    public ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoSnapshotPolicyExWithOptions(request, runtime);
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecWithOptions(ModifyBandwidthPackageSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBandwidthPackageSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBandwidthPackageSpecResponse());
    }

    public ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBandwidthPackageSpecWithOptions(request, runtime);
    }

    public ModifyCapacityReservationResponse modifyCapacityReservationWithOptions(ModifyCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCapacityReservation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCapacityReservationResponse());
    }

    public ModifyCapacityReservationResponse modifyCapacityReservation(ModifyCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCapacityReservationWithOptions(request, runtime);
    }

    public ModifyCommandResponse modifyCommandWithOptions(ModifyCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCommand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCommandResponse());
    }

    public ModifyCommandResponse modifyCommand(ModifyCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCommandWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeWithOptions(ModifyDedicatedHostAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAttributeResponse());
    }

    public ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTimeWithOptions(ModifyDedicatedHostAutoReleaseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAutoReleaseTime", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAutoReleaseTimeResponse());
    }

    public ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAutoReleaseTimeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttributeWithOptions(ModifyDedicatedHostAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostAutoRenewAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostAutoRenewAttributeResponse());
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttributeWithOptions(ModifyDedicatedHostClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostClusterAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostClusterAttributeResponse());
    }

    public ModifyDedicatedHostClusterAttributeResponse modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostClusterAttributeWithOptions(request, runtime);
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeTypeWithOptions(ModifyDedicatedHostsChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDedicatedHostsChargeType", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDedicatedHostsChargeTypeResponse());
    }

    public ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDedicatedHostsChargeTypeWithOptions(request, runtime);
    }

    public ModifyDemandResponse modifyDemandWithOptions(ModifyDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDemand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDemandResponse());
    }

    public ModifyDemandResponse modifyDemand(ModifyDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDemandWithOptions(request, runtime);
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttributeWithOptions(ModifyDeploymentSetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeploymentSetAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeploymentSetAttributeResponse());
    }

    public ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeploymentSetAttributeWithOptions(request, runtime);
    }

    public ModifyDiskAttributeResponse modifyDiskAttributeWithOptions(ModifyDiskAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDiskAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDiskAttributeResponse());
    }

    public ModifyDiskAttributeResponse modifyDiskAttribute(ModifyDiskAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskAttributeWithOptions(request, runtime);
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeTypeWithOptions(ModifyDiskChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDiskChargeType", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDiskChargeTypeResponse());
    }

    public ModifyDiskChargeTypeResponse modifyDiskChargeType(ModifyDiskChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskChargeTypeWithOptions(request, runtime);
    }

    public ModifyDiskSpecResponse modifyDiskSpecWithOptions(ModifyDiskSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDiskSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDiskSpecResponse());
    }

    public ModifyDiskSpecResponse modifyDiskSpec(ModifyDiskSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDiskSpecWithOptions(request, runtime);
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttributeWithOptions(ModifyEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEipAddressAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEipAddressAttributeResponse());
    }

    public ModifyEipAddressAttributeResponse modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyElasticityAssuranceResponse modifyElasticityAssuranceWithOptions(ModifyElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyElasticityAssurance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyElasticityAssuranceResponse());
    }

    public ModifyElasticityAssuranceResponse modifyElasticityAssurance(ModifyElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyElasticityAssuranceWithOptions(request, runtime);
    }

    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyForwardEntry", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyForwardEntryResponse());
    }

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttributeWithOptions(ModifyHaVipAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHaVipAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHaVipAttributeResponse());
    }

    public ModifyHaVipAttributeResponse modifyHaVipAttribute(ModifyHaVipAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHaVipAttributeWithOptions(request, runtime);
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeWithOptions(ModifyHpcClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHpcClusterAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHpcClusterAttributeResponse());
    }

    public ModifyHpcClusterAttributeResponse modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHpcClusterAttributeWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermissionWithOptions(ModifyImageShareGroupPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageShareGroupPermission", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageShareGroupPermissionResponse());
    }

    public ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageShareGroupPermissionWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageSharePermission", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributesWithOptions(ModifyInstanceAttachmentAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttachmentAttributes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttachmentAttributesResponse());
    }

    public ModifyInstanceAttachmentAttributesResponse modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttachmentAttributesWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTimeWithOptions(ModifyInstanceAutoReleaseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoReleaseTime", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoReleaseTimeResponse());
    }

    public ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoReleaseTimeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeWithOptions(ModifyInstanceChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceChargeType", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceChargeTypeResponse());
    }

    public ModifyInstanceChargeTypeResponse modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceChargeTypeWithOptions(request, runtime);
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeploymentWithOptions(ModifyInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceDeployment", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceDeploymentResponse());
    }

    public ModifyInstanceDeploymentResponse modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceDeploymentWithOptions(request, runtime);
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributesWithOptions(ModifyInstanceMaintenanceAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMaintenanceAttributes", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMaintenanceAttributesResponse());
    }

    public ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMaintenanceAttributesWithOptions(request, runtime);
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptionsWithOptions(ModifyInstanceMetadataOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMetadataOptions", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMetadataOptionsResponse());
    }

    public ModifyInstanceMetadataOptionsResponse modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMetadataOptionsWithOptions(request, runtime);
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpecWithOptions(ModifyInstanceNetworkSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceNetworkSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceNetworkSpecResponse());
    }

    public ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceNetworkSpecWithOptions(request, runtime);
    }

    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceSpecResponse());
    }

    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswdWithOptions(ModifyInstanceVncPasswdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceVncPasswd", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceVncPasswdResponse());
    }

    public ModifyInstanceVncPasswdResponse modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVncPasswdWithOptions(request, runtime);
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttributeWithOptions(ModifyInstanceVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceVpcAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceVpcAttributeResponse());
    }

    public ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVpcAttributeWithOptions(request, runtime);
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersionWithOptions(ModifyLaunchTemplateDefaultVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLaunchTemplateDefaultVersion", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLaunchTemplateDefaultVersionResponse());
    }

    public ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLaunchTemplateDefaultVersionWithOptions(request, runtime);
    }

    public ModifyManagedInstanceResponse modifyManagedInstanceWithOptions(ModifyManagedInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyManagedInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyManagedInstanceResponse());
    }

    public ModifyManagedInstanceResponse modifyManagedInstance(ModifyManagedInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyManagedInstanceWithOptions(request, runtime);
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttributeWithOptions(ModifyNetworkInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkInterfaceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkInterfaceAttributeResponse());
    }

    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeWithOptions(ModifyPhysicalConnectionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPhysicalConnectionAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPhysicalConnectionAttributeResponse());
    }

    public ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPhysicalConnectionAttributeWithOptions(request, runtime);
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPrepayInstanceSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPrepayInstanceSpecResponse());
    }

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttributeWithOptions(ModifyReservedInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReservedInstanceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReservedInstanceAttributeResponse());
    }

    public ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReservedInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyReservedInstancesResponse modifyReservedInstancesWithOptions(ModifyReservedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReservedInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReservedInstancesResponse());
    }

    public ModifyReservedInstancesResponse modifyReservedInstances(ModifyReservedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReservedInstancesWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeWithOptions(ModifyRouterInterfaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouterInterfaceAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouterInterfaceAttributeResponse());
    }

    public ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceAttributeWithOptions(request, runtime);
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecWithOptions(ModifyRouterInterfaceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRouterInterfaceSpec", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRouterInterfaceSpecResponse());
    }

    public ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRouterInterfaceSpecWithOptions(request, runtime);
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupAttributeResponse());
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRuleWithOptions(ModifySecurityGroupEgressRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupEgressRule", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupEgressRuleResponse());
    }

    public ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupEgressRuleWithOptions(request, runtime);
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicyWithOptions(ModifySecurityGroupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupPolicy", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupPolicyResponse());
    }

    public ModifySecurityGroupPolicyResponse modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupPolicyWithOptions(request, runtime);
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRuleWithOptions(ModifySecurityGroupRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupRule", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupRuleResponse());
    }

    public ModifySecurityGroupRuleResponse modifySecurityGroupRule(ModifySecurityGroupRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupRuleWithOptions(request, runtime);
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttributeWithOptions(ModifySnapshotAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySnapshotAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySnapshotAttributeResponse());
    }

    public ModifySnapshotAttributeResponse modifySnapshotAttribute(ModifySnapshotAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySnapshotAttributeWithOptions(request, runtime);
    }

    public ModifySnapshotGroupResponse modifySnapshotGroupWithOptions(ModifySnapshotGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySnapshotGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySnapshotGroupResponse());
    }

    public ModifySnapshotGroupResponse modifySnapshotGroup(ModifySnapshotGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySnapshotGroupWithOptions(request, runtime);
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttributeWithOptions(ModifyStorageCapacityUnitAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStorageCapacityUnitAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStorageCapacityUnitAttributeResponse());
    }

    public ModifyStorageCapacityUnitAttributeResponse modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageCapacityUnitAttributeWithOptions(request, runtime);
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttributeWithOptions(ModifyStorageSetAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStorageSetAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStorageSetAttributeResponse());
    }

    public ModifyStorageSetAttributeResponse modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageSetAttributeWithOptions(request, runtime);
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehaviorWithOptions(ModifyUserBusinessBehaviorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserBusinessBehavior", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserBusinessBehaviorResponse());
    }

    public ModifyUserBusinessBehaviorResponse modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserBusinessBehaviorWithOptions(request, runtime);
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeWithOptions(ModifyVirtualBorderRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVirtualBorderRouterAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVirtualBorderRouterAttributeResponse());
    }

    public ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVirtualBorderRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVpcAttributeResponse modifyVpcAttributeWithOptions(ModifyVpcAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpcAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpcAttributeResponse());
    }

    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcAttributeWithOptions(request, runtime);
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttributeWithOptions(ModifyVRouterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVRouterAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVRouterAttributeResponse());
    }

    public ModifyVRouterAttributeResponse modifyVRouterAttribute(ModifyVRouterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVRouterAttributeWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVSwitchAttribute", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOfferingWithOptions(PurchaseReservedInstancesOfferingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PurchaseReservedInstancesOffering", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new PurchaseReservedInstancesOfferingResponse());
    }

    public PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purchaseReservedInstancesOfferingWithOptions(request, runtime);
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnitWithOptions(PurchaseStorageCapacityUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PurchaseStorageCapacityUnit", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new PurchaseStorageCapacityUnitResponse());
    }

    public PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purchaseStorageCapacityUnitWithOptions(request, runtime);
    }

    public ReActivateInstancesResponse reActivateInstancesWithOptions(ReActivateInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReActivateInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReActivateInstancesResponse());
    }

    public ReActivateInstancesResponse reActivateInstances(ReActivateInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reActivateInstancesWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public RebootInstancesResponse rebootInstancesWithOptions(RebootInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RebootInstancesResponse());
    }

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterWithOptions(RecoverVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecoverVirtualBorderRouter", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RecoverVirtualBorderRouterResponse());
    }

    public RecoverVirtualBorderRouterResponse recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoverVirtualBorderRouterWithOptions(request, runtime);
    }

    public RedeployDedicatedHostResponse redeployDedicatedHostWithOptions(RedeployDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RedeployDedicatedHost", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RedeployDedicatedHostResponse());
    }

    public RedeployDedicatedHostResponse redeployDedicatedHost(RedeployDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.redeployDedicatedHostWithOptions(request, runtime);
    }

    public RedeployInstanceResponse redeployInstanceWithOptions(RedeployInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RedeployInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RedeployInstanceResponse());
    }

    public RedeployInstanceResponse redeployInstance(RedeployInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.redeployInstanceWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReInitDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public ReleaseCapacityReservationResponse releaseCapacityReservationWithOptions(ReleaseCapacityReservationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseCapacityReservation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseCapacityReservationResponse());
    }

    public ReleaseCapacityReservationResponse releaseCapacityReservation(ReleaseCapacityReservationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseCapacityReservationWithOptions(request, runtime);
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHostWithOptions(ReleaseDedicatedHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseDedicatedHost", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseDedicatedHostResponse());
    }

    public ReleaseDedicatedHostResponse releaseDedicatedHost(ReleaseDedicatedHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseDedicatedHostWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseEipAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddressWithOptions(ReleasePublicIpAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePublicIpAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePublicIpAddressResponse());
    }

    public ReleasePublicIpAddressResponse releasePublicIpAddress(ReleasePublicIpAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePublicIpAddressWithOptions(request, runtime);
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsWithOptions(RemoveBandwidthPackageIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveBandwidthPackageIps", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveBandwidthPackageIpsResponse());
    }

    public RemoveBandwidthPackageIpsResponse removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBandwidthPackageIpsWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTags", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public RenewDedicatedHostsResponse renewDedicatedHostsWithOptions(RenewDedicatedHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewDedicatedHosts", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RenewDedicatedHostsResponse());
    }

    public RenewDedicatedHostsResponse renewDedicatedHosts(RenewDedicatedHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDedicatedHostsWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ReplaceSystemDiskResponse replaceSystemDiskWithOptions(ReplaceSystemDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceSystemDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceSystemDiskResponse());
    }

    public ReplaceSystemDiskResponse replaceSystemDisk(ReplaceSystemDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceSystemDiskWithOptions(request, runtime);
    }

    public ReportInstancesStatusResponse reportInstancesStatusWithOptions(ReportInstancesStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportInstancesStatus", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ReportInstancesStatusResponse());
    }

    public ReportInstancesStatusResponse reportInstancesStatus(ReportInstancesStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportInstancesStatusWithOptions(request, runtime);
    }

    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ResetDiskResponse());
    }

    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    public ResetDisksResponse resetDisksWithOptions(ResetDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetDisks", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ResetDisksResponse());
    }

    public ResetDisksResponse resetDisks(ResetDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDisksWithOptions(request, runtime);
    }

    public ResizeDiskResponse resizeDiskWithOptions(ResizeDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeDisk", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeDiskResponse());
    }

    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDiskWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeSecurityGroup", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeSecurityGroupEgress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeSecurityGroupEgressResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunCommand", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public RunInstancesResponse runInstancesWithOptions(RunInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new RunInstancesResponse());
    }

    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

    public SendFileResponse sendFileWithOptions(SendFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendFile", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new SendFileResponse());
    }

    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    public StartElasticityAssuranceResponse startElasticityAssuranceWithOptions(StartElasticityAssuranceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartElasticityAssurance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StartElasticityAssuranceResponse());
    }

    public StartElasticityAssuranceResponse startElasticityAssurance(StartElasticityAssuranceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startElasticityAssuranceWithOptions(request, runtime);
    }

    public StartImagePipelineExecutionResponse startImagePipelineExecutionWithOptions(StartImagePipelineExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartImagePipelineExecution", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StartImagePipelineExecutionResponse());
    }

    public StartImagePipelineExecutionResponse startImagePipelineExecution(StartImagePipelineExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startImagePipelineExecutionWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StartInstancesResponse startInstancesWithOptions(StartInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstancesResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInstance", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInstances", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StopInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInvocation", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new StopInvocationResponse());
    }

    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnectionWithOptions(TerminatePhysicalConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TerminatePhysicalConnection", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new TerminatePhysicalConnectionResponse());
    }

    public TerminatePhysicalConnectionResponse terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminatePhysicalConnectionWithOptions(request, runtime);
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterWithOptions(TerminateVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TerminateVirtualBorderRouter", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new TerminateVirtualBorderRouterResponse());
    }

    public TerminateVirtualBorderRouterResponse terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateVirtualBorderRouterWithOptions(request, runtime);
    }

    public UnassignIpv6AddressesResponse unassignIpv6AddressesWithOptions(UnassignIpv6AddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassignIpv6Addresses", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new UnassignIpv6AddressesResponse());
    }

    public UnassignIpv6AddressesResponse unassignIpv6Addresses(UnassignIpv6AddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassignIpv6AddressesWithOptions(request, runtime);
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesWithOptions(UnassignPrivateIpAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassignPrivateIpAddresses", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new UnassignPrivateIpAddressesResponse());
    }

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassignPrivateIpAddressesWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateEipAddress", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public UnassociateHaVipResponse unassociateHaVipWithOptions(UnassociateHaVipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateHaVip", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateHaVipResponse());
    }

    public UnassociateHaVipResponse unassociateHaVip(UnassociateHaVipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateHaVipWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2014-05-26", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
