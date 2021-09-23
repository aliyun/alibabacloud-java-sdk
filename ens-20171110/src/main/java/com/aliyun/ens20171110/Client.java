// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110;

import com.aliyun.tea.*;
import com.aliyun.ens20171110.models.*;
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
        this._endpoint = this.getEndpoint("ens", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeServcieScheduleResponse describeServcieScheduleWithOptions(DescribeServcieScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServcieSchedule", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServcieScheduleResponse());
    }

    public DescribeServcieScheduleResponse describeServcieSchedule(DescribeServcieScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServcieScheduleWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeWithOptions(DescribeLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerTCPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerTCPListenerAttributeResponse());
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public RestartDeviceInstanceResponse restartDeviceInstanceWithOptions(RestartDeviceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDeviceInstance", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new RestartDeviceInstanceResponse());
    }

    public RestartDeviceInstanceResponse restartDeviceInstance(RestartDeviceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDeviceInstanceWithOptions(request, runtime);
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstanceWithOptions(ReleasePrePaidInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePrePaidInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePrePaidInstanceResponse());
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstance(ReleasePrePaidInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePrePaidInstanceWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateNetworkResponse createNetworkWithOptions(CreateNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetwork", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkResponse());
    }

    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReInitDisk", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstanceWithOptions(AddNetworkInterfaceToInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddNetworkInterfaceToInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AddNetworkInterfaceToInstanceResponse());
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNetworkInterfaceToInstanceWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public StopEpnInstanceResponse stopEpnInstanceWithOptions(StopEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StopEpnInstanceResponse());
    }

    public StopEpnInstanceResponse stopEpnInstance(StopEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopEpnInstanceWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEipAddresses", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeSecurityGroupEgress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeSecurityGroupEgressResponse());
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    public ConfigureSecurityGroupPermissionsResponse configureSecurityGroupPermissionsWithOptions(ConfigureSecurityGroupPermissionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigureSecurityGroupPermissionsShrinkRequest request = new ConfigureSecurityGroupPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authorizePermissions)) {
            request.authorizePermissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authorizePermissions, "AuthorizePermissions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.revokePermissions)) {
            request.revokePermissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.revokePermissions, "RevokePermissions", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSecurityGroupPermissions", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSecurityGroupPermissionsResponse());
    }

    public ConfigureSecurityGroupPermissionsResponse configureSecurityGroupPermissions(ConfigureSecurityGroupPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSecurityGroupPermissionsWithOptions(request, runtime);
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevelWithOptions(DescribeEnsNetLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsNetLevel", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsNetLevelResponse());
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevel(DescribeEnsNetLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetLevelWithOptions(request, runtime);
    }

    public DescribeNetworkAttributeResponse describeNetworkAttributeWithOptions(DescribeNetworkAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkAttributeResponse());
    }

    public DescribeNetworkAttributeResponse describeNetworkAttribute(DescribeNetworkAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkAttributeWithOptions(request, runtime);
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstanceWithOptions(JoinPublicIpsToEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinPublicIpsToEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new JoinPublicIpsToEpnInstanceResponse());
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinPublicIpsToEpnInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public AttachEnsInstancesResponse attachEnsInstancesWithOptions(AttachEnsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachEnsInstances", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AttachEnsInstancesResponse());
    }

    public AttachEnsInstancesResponse attachEnsInstances(AttachEnsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachEnsInstancesWithOptions(request, runtime);
    }

    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttributeWithOptions(ModifyLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoadBalancerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoadBalancerAttributeResponse());
    }

    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoadBalancerAttributeWithOptions(request, runtime);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeTypeWithOptions(DescribeEpnBandwitdhByInternetChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEpnBandwitdhByInternetChargeType", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEpnBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstanceWithOptions(RemovePublicIpsFromEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePublicIpsFromEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePublicIpsFromEpnInstanceResponse());
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePublicIpsFromEpnInstanceWithOptions(request, runtime);
    }

    public UpgradeApplicationResponse upgradeApplicationWithOptions(UpgradeApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeApplicationResponse());
    }

    public UpgradeApplicationResponse upgradeApplication(UpgradeApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeApplicationWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public RescaleDeviceServiceResponse rescaleDeviceServiceWithOptions(RescaleDeviceServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RescaleDeviceService", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RescaleDeviceServiceResponse());
    }

    public RescaleDeviceServiceResponse rescaleDeviceService(RescaleDeviceServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rescaleDeviceServiceWithOptions(request, runtime);
    }

    public CreateEnsServiceResponse createEnsServiceWithOptions(CreateEnsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEnsService", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEnsServiceResponse());
    }

    public CreateEnsServiceResponse createEnsService(CreateEnsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnsServiceWithOptions(request, runtime);
    }

    public ExportBillDetailDataResponse exportBillDetailDataWithOptions(ExportBillDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportBillDetailData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ExportBillDetailDataResponse());
    }

    public ExportBillDetailDataResponse exportBillDetailData(ExportBillDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportBillDetailDataWithOptions(request, runtime);
    }

    public DescribeImageInfosResponse describeImageInfosWithOptions(DescribeImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageInfos", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageInfosResponse());
    }

    public DescribeImageInfosResponse describeImageInfos(DescribeImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageInfosWithOptions(request, runtime);
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeWithOptions(DescribeLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerAttribute", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLoadBalancerAttributeResponse());
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

    public ModifyNetworkAttributeResponse modifyNetworkAttributeWithOptions(ModifyNetworkAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkAttributeResponse());
    }

    public ModifyNetworkAttributeResponse modifyNetworkAttribute(ModifyNetworkAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkAttributeWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteKeyPairs", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuthorizeSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListenerWithOptions(CreateLoadBalancerHTTPSListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerHTTPSListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerHTTPSListenerResponse());
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

    public AddDeviceInternetPortResponse addDeviceInternetPortWithOptions(AddDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDeviceInternetPort", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new AddDeviceInternetPortResponse());
    }

    public AddDeviceInternetPortResponse addDeviceInternetPort(AddDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeviceInternetPortWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVSwitchAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeEnsEipAddressesResponse describeEnsEipAddressesWithOptions(DescribeEnsEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsEipAddresses", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsEipAddressesResponse());
    }

    public DescribeEnsEipAddressesResponse describeEnsEipAddresses(DescribeEnsEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsEipAddressesWithOptions(request, runtime);
    }

    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RescaleApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RescaleApplicationResponse());
    }

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroups", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthDataWithOptions(DescribeUserBandWidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserBandWidthData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserBandWidthDataResponse());
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthData(DescribeUserBandWidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBandWidthDataWithOptions(request, runtime);
    }

    public StartEpnInstanceResponse startEpnInstanceWithOptions(StartEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StartEpnInstanceResponse());
    }

    public StartEpnInstanceResponse startEpnInstance(StartEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startEpnInstanceWithOptions(request, runtime);
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListenerWithOptions(CreateLoadBalancerUDPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerUDPListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerUDPListenerResponse());
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthDataWithOptions(DescribeEpnBandWidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEpnBandWidthData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEpnBandWidthDataResponse());
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnBandWidthDataWithOptions(request, runtime);
    }

    public DescribeMeasurementDataResponse describeMeasurementDataWithOptions(DescribeMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMeasurementData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMeasurementDataResponse());
    }

    public DescribeMeasurementDataResponse describeMeasurementData(DescribeMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeasurementDataWithOptions(request, runtime);
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatusWithOptions(SetLoadBalancerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerStatus", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerStatusResponse());
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVSwitch", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public CreateEpnInstanceResponse createEpnInstanceWithOptions(CreateEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEpnInstanceResponse());
    }

    public CreateEpnInstanceResponse createEpnInstance(CreateEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEpnInstanceWithOptions(request, runtime);
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupAttributeResponse());
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListenerWithOptions(DeleteLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoadBalancerListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoadBalancerListenerResponse());
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DeleteNetworkResponse deleteNetworkWithOptions(DeleteNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetwork", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkResponse());
    }

    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public RemoveBackendServersResponse removeBackendServersWithOptions(RemoveBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveBackendServersShrinkRequest request = new RemoveBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveBackendServers", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveBackendServersResponse());
    }

    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListenerWithOptions(CreateLoadBalancerHTTPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerHTTPListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerHTTPListenerResponse());
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVSwitches", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportImage", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public DescribeInstanceSpecResponse describeInstanceSpecWithOptions(DescribeInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSpec", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSpecResponse());
    }

    public DescribeInstanceSpecResponse describeInstanceSpec(DescribeInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceTypes", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddressWithOptions(UnAssociateEnsEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnAssociateEnsEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new UnAssociateEnsEipAddressResponse());
    }

    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unAssociateEnsEipAddressWithOptions(request, runtime);
    }

    public GetVmListResponse getVmListWithOptions(GetVmListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVmList", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new GetVmListResponse());
    }

    public GetVmListResponse getVmList(GetVmListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmListWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStockWithOptions(DescribePrePaidInstanceStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrePaidInstanceStock", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePrePaidInstanceStockResponse());
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePrePaidInstanceStockWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoWithOptions(DescribeEnsRegionIdIpv6InfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsRegionIdIpv6Info", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsRegionIdIpv6InfoResponse());
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionIdIpv6InfoWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeApplicationResponse describeApplicationWithOptions(DescribeApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeApplicationResponse());
    }

    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApplicationWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResourceWithOptions(DescribeEnsRegionIdResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsRegionIdResource", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsRegionIdResourceResponse());
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionIdResourceWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeDataDownloadURLResponse describeDataDownloadURLWithOptions(DescribeDataDownloadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataDownloadURL", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDataDownloadURLResponse());
    }

    public DescribeDataDownloadURLResponse describeDataDownloadURL(DescribeDataDownloadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataDownloadURLWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApplications", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public PreCreateEnsServiceResponse preCreateEnsServiceWithOptions(PreCreateEnsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PreCreateEnsService", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new PreCreateEnsServiceResponse());
    }

    public PreCreateEnsServiceResponse preCreateEnsService(PreCreateEnsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preCreateEnsServiceWithOptions(request, runtime);
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeWithOptions(DescribeBandWithdChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBandWithdChargeType", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBandWithdChargeTypeResponse());
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandWithdChargeTypeWithOptions(request, runtime);
    }

    public AddBackendServersResponse addBackendServersWithOptions(AddBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddBackendServersShrinkRequest request = new AddBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBackendServers", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AddBackendServersResponse());
    }

    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttributeWithOptions(SetLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerUDPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerUDPListenerAttributeResponse());
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeReservedResourceResponse describeReservedResourceWithOptions(DescribeReservedResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReservedResource", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReservedResourceResponse());
    }

    public DescribeReservedResourceResponse describeReservedResource(DescribeReservedResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReservedResourceWithOptions(request, runtime);
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultWithOptions(DescribeCreatePrePaidInstanceResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCreatePrePaidInstanceResult", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCreatePrePaidInstanceResultResponse());
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCreatePrePaidInstanceResultWithOptions(request, runtime);
    }

    public MigrateVmResponse migrateVmWithOptions(MigrateVmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateVm", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateVmResponse());
    }

    public MigrateVmResponse migrateVm(MigrateVmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateVmWithOptions(request, runtime);
    }

    public DeleteDeviceInternetPortResponse deleteDeviceInternetPortWithOptions(DeleteDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceInternetPort", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteDeviceInternetPortResponse());
    }

    public DeleteDeviceInternetPortResponse deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceInternetPortWithOptions(request, runtime);
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstanceWithOptions(JoinVSwitchesToEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinVSwitchesToEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new JoinVSwitchesToEpnInstanceResponse());
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinVSwitchesToEpnInstanceWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVSwitch", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttributeWithOptions(SetLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerHTTPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerHTTPListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceVncUrl", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceVncUrlResponse());
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeWithOptions(DescribeLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerHTTPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerHTTPListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImages", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuthorizeSecurityGroupEgress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttributeWithOptions(DescribeEpnInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEpnInstanceAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEpnInstanceAttributeResponse());
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnInstanceAttributeWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public DescribeLoadBalancersResponse describeLoadBalancersWithOptions(DescribeLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancers", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLoadBalancersResponse());
    }

    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    public AssociateEnsEipAddressResponse associateEnsEipAddressWithOptions(AssociateEnsEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateEnsEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateEnsEipAddressResponse());
    }

    public AssociateEnsEipAddressResponse associateEnsEipAddress(AssociateEnsEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEnsEipAddressWithOptions(request, runtime);
    }

    public PushApplicationDataResponse pushApplicationDataWithOptions(PushApplicationDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushApplicationData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new PushApplicationDataResponse());
    }

    public PushApplicationDataResponse pushApplicationData(PushApplicationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushApplicationDataWithOptions(request, runtime);
    }

    public DescribeEnsRegionsResponse describeEnsRegionsWithOptions(DescribeEnsRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsRegions", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsRegionsResponse());
    }

    public DescribeEnsRegionsResponse describeEnsRegions(DescribeEnsRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionsWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceMonitorData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnassociateEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeWithOptions(DescribeLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerUDPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerUDPListenerAttributeResponse());
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeDataPushResultResponse describeDataPushResultWithOptions(DescribeDataPushResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataPushResult", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataPushResultResponse());
    }

    public DescribeDataPushResultResponse describeDataPushResult(DescribeDataPushResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataPushResultWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LeaveSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportKeyPair", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListenerWithOptions(CreateLoadBalancerTCPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancerTCPListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerTCPListenerResponse());
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

    public DeleteVmResponse deleteVmWithOptions(DeleteVmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVm", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVmResponse());
    }

    public DeleteVmResponse deleteVm(DeleteVmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVmWithOptions(request, runtime);
    }

    public CheckQuotaResponse checkQuotaWithOptions(CheckQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckQuota", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CheckQuotaResponse());
    }

    public CheckQuotaResponse checkQuota(CheckQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkQuotaWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImage", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateEipInstanceResponse createEipInstanceWithOptions(CreateEipInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEipInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEipInstanceResponse());
    }

    public CreateEipInstanceResponse createEipInstance(CreateEipInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEipInstanceWithOptions(request, runtime);
    }

    public DeleteEpnInstanceResponse deleteEpnInstanceWithOptions(DeleteEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEpnInstanceResponse());
    }

    public DeleteEpnInstanceResponse deleteEpnInstance(DeleteEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEpnInstanceWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeTypeWithOptions(DescribeBandwitdhByInternetChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBandwitdhByInternetChargeType", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSecurityGroup", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public DescribeEpnInstancesResponse describeEpnInstancesWithOptions(DescribeEpnInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEpnInstances", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEpnInstancesResponse());
    }

    public DescribeEpnInstancesResponse describeEpnInstances(DescribeEpnInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnInstancesWithOptions(request, runtime);
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListenerWithOptions(StartLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartLoadBalancerListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StartLoadBalancerListenerResponse());
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListenerWithOptions(StopLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLoadBalancerListener", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new StopLoadBalancerListenerResponse());
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttributeWithOptions(SetLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerTCPListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerTCPListenerAttributeResponse());
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public DescribeDataDistResultResponse describeDataDistResultWithOptions(DescribeDataDistResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataDistResult", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataDistResultResponse());
    }

    public DescribeDataDistResultResponse describeDataDistResult(DescribeDataDistResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataDistResultWithOptions(request, runtime);
    }

    public GetDeviceInternetPortResponse getDeviceInternetPortWithOptions(GetDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceInternetPort", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceInternetPortResponse());
    }

    public GetDeviceInternetPortResponse getDeviceInternetPort(GetDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceInternetPortWithOptions(request, runtime);
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstanceWithOptions(ReleasePostPaidInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePostPaidInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePostPaidInstanceResponse());
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstance(ReleasePostPaidInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePostPaidInstanceWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttributeWithOptions(SetLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLoadBalancerHTTPSListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetLoadBalancerHTTPSListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public CreateEPInstanceResponse createEPInstanceWithOptions(CreateEPInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEPInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEPInstanceResponse());
    }

    public CreateEPInstanceResponse createEPInstance(CreateEPInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEPInstanceWithOptions(request, runtime);
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementDataWithOptions(DescribeEpnMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEpnMeasurementData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEpnMeasurementDataResponse());
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnMeasurementDataWithOptions(request, runtime);
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummaryWithOptions(DescribeApplicationResourceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApplicationResourceSummary", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeApplicationResourceSummaryResponse());
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApplicationResourceSummaryWithOptions(request, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

    public ExportMeasurementDataResponse exportMeasurementDataWithOptions(ExportMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportMeasurementData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ExportMeasurementDataResponse());
    }

    public ExportMeasurementDataResponse exportMeasurementData(ExportMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportMeasurementDataWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApplication", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeKeyPairs", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttributeWithOptions(ModifyEnsEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEnsEipAddressAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEnsEipAddressAttributeResponse());
    }

    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEnsEipAddressAttributeWithOptions(request, runtime);
    }

    public DescribeEnsResourceUsageResponse describeEnsResourceUsageWithOptions(DescribeEnsResourceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsResourceUsage", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeEnsResourceUsageResponse());
    }

    public DescribeEnsResourceUsageResponse describeEnsResourceUsage(DescribeEnsResourceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsResourceUsageWithOptions(request, runtime);
    }

    public DescribeExportImageStatusResponse describeExportImageStatusWithOptions(DescribeExportImageStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExportImageStatus", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExportImageStatusResponse());
    }

    public DescribeExportImageStatusResponse describeExportImageStatus(DescribeExportImageStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportImageStatusWithOptions(request, runtime);
    }

    public SetBackendServersResponse setBackendServersWithOptions(SetBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetBackendServersShrinkRequest request = new SetBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetBackendServers", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetBackendServersResponse());
    }

    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

    public DescribeExportImageInfoResponse describeExportImageInfoWithOptions(DescribeExportImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExportImageInfo", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExportImageInfoResponse());
    }

    public DescribeExportImageInfoResponse describeExportImageInfo(DescribeExportImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportImageInfoWithOptions(request, runtime);
    }

    public DistApplicationDataResponse distApplicationDataWithOptions(DistApplicationDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DistApplicationData", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DistApplicationDataResponse());
    }

    public DistApplicationDataResponse distApplicationData(DistApplicationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.distApplicationDataWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageSharePermission", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DescribeDeviceServiceResponse describeDeviceServiceWithOptions(DescribeDeviceServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceService", "2017-11-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDeviceServiceResponse());
    }

    public DescribeDeviceServiceResponse describeDeviceService(DescribeDeviceServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceServiceWithOptions(request, runtime);
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictWithOptions(DescribeEnsNetSaleDistrictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsNetSaleDistrict", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsNetSaleDistrictResponse());
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetSaleDistrictWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageSharePermission", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public ModifyEpnInstanceResponse modifyEpnInstanceWithOptions(ModifyEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEpnInstanceResponse());
    }

    public ModifyEpnInstanceResponse modifyEpnInstance(ModifyEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEpnInstanceWithOptions(request, runtime);
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrictWithOptions(DescribeEnsNetDistrictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEnsNetDistrict", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEnsNetDistrictResponse());
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrict(DescribeEnsNetDistrictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetDistrictWithOptions(request, runtime);
    }

    public DescribeNetworksResponse describeNetworksWithOptions(DescribeNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworks", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworksResponse());
    }

    public DescribeNetworksResponse describeNetworks(DescribeNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworksWithOptions(request, runtime);
    }

    public RunServiceScheduleResponse runServiceScheduleWithOptions(RunServiceScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunServiceSchedule", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RunServiceScheduleResponse());
    }

    public RunServiceScheduleResponse runServiceSchedule(RunServiceScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runServiceScheduleWithOptions(request, runtime);
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstanceWithOptions(RemoveVSwitchesFromEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveVSwitchesFromEpnInstance", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveVSwitchesFromEpnInstanceResponse());
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVSwitchesFromEpnInstanceWithOptions(request, runtime);
    }

    public SchedulePodResponse schedulePodWithOptions(SchedulePodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SchedulePod", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new SchedulePodResponse());
    }

    public SchedulePodResponse schedulePod(SchedulePodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.schedulePodWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkInterfaces", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateEipAddress", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateKeyPair", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeWithOptions(DescribeLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadBalancerHTTPSListenerAttribute", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadBalancerHTTPSListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfoWithOptions(DescribeAvailableResourceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResourceInfo", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceInfoResponse());
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfo(DescribeAvailableResourceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceInfoWithOptions(request, runtime);
    }

    public CreateVmAndSaveStockResponse createVmAndSaveStockWithOptions(CreateVmAndSaveStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVmAndSaveStock", "2017-11-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVmAndSaveStockResponse());
    }

    public CreateVmAndSaveStockResponse createVmAndSaveStock(CreateVmAndSaveStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVmAndSaveStockWithOptions(request, runtime);
    }
}
