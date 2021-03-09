// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930;

import com.aliyun.tea.*;
import com.aliyun.ecd20200930.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetDirectorySsoStatusResponse getDirectorySsoStatusWithOptions(GetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDirectorySsoStatus", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new GetDirectorySsoStatusResponse());
    }

    public GetDirectorySsoStatusResponse getDirectorySsoStatus(GetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDirectorySsoStatusWithOptions(request, runtime);
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatusWithOptions(SetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDirectorySsoStatus", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new SetDirectorySsoStatusResponse());
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatus(SetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDirectorySsoStatusWithOptions(request, runtime);
    }

    public GetSpMetadataResponse getSpMetadataWithOptions(GetSpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSpMetadata", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new GetSpMetadataResponse());
    }

    public GetSpMetadataResponse getSpMetadata(GetSpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpMetadataWithOptions(request, runtime);
    }

    public SetIdpMetadataResponse setIdpMetadataWithOptions(SetIdpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetIdpMetadata", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new SetIdpMetadataResponse());
    }

    public SetIdpMetadataResponse setIdpMetadata(SetIdpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIdpMetadataWithOptions(request, runtime);
    }

    public RebuildDesktopsResponse rebuildDesktopsWithOptions(RebuildDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebuildDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RebuildDesktopsResponse());
    }

    public RebuildDesktopsResponse rebuildDesktops(RebuildDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebuildDesktopsWithOptions(request, runtime);
    }

    public ModifyBundleResponse modifyBundleWithOptions(ModifyBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyBundle", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyBundleResponse());
    }

    public ModifyBundleResponse modifyBundle(ModifyBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBundleWithOptions(request, runtime);
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADeviceWithOptions(UnlockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnlockVirtualMFADevice", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new UnlockVirtualMFADeviceResponse());
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockVirtualMFADeviceWithOptions(request, runtime);
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevicesWithOptions(DescribeVirtualMFADevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVirtualMFADevices", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVirtualMFADevicesResponse());
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualMFADevicesWithOptions(request, runtime);
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADeviceWithOptions(LockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LockVirtualMFADevice", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new LockVirtualMFADeviceResponse());
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADevice(LockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockVirtualMFADeviceWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteVirtualMFADevice", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteVirtualMFADeviceResponse());
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectoryWithOptions(ModifyADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyADConnectorDirectory", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyADConnectorDirectoryResponse());
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorDirectoryWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public ModifyDesktopNameResponse modifyDesktopNameWithOptions(ModifyDesktopNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDesktopName", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDesktopNameResponse());
    }

    public ModifyDesktopNameResponse modifyDesktopName(ModifyDesktopNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopNameWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RunCommand", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInvocation", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new StopInvocationResponse());
    }

    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInvocations", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeZones", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeClientEventsResponse describeClientEventsWithOptions(DescribeClientEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeClientEvents", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeClientEventsResponse());
    }

    public DescribeClientEventsResponse describeClientEvents(DescribeClientEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientEventsWithOptions(request, runtime);
    }

    public ResetSnapshotResponse resetSnapshotWithOptions(ResetSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetSnapshot", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ResetSnapshotResponse());
    }

    public ResetSnapshotResponse resetSnapshot(ResetSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSnapshotWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSnapshot", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSnapshot", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshots", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public RenewDesktopsResponse renewDesktopsWithOptions(RenewDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RenewDesktopsResponse());
    }

    public RenewDesktopsResponse renewDesktops(RenewDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDesktopsWithOptions(request, runtime);
    }

    public StopDesktopsResponse stopDesktopsWithOptions(StopDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new StopDesktopsResponse());
    }

    public StopDesktopsResponse stopDesktops(StopDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDesktopsWithOptions(request, runtime);
    }

    public StartDesktopsResponse startDesktopsWithOptions(StartDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new StartDesktopsResponse());
    }

    public StartDesktopsResponse startDesktops(StartDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDesktopsWithOptions(request, runtime);
    }

    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPolicyGroup", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPolicyGroupResponse());
    }

    public ModifyPolicyGroupResponse modifyPolicyGroup(ModifyPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPolicyGroupWithOptions(request, runtime);
    }

    public DescribeDesktopTypesResponse describeDesktopTypesWithOptions(DescribeDesktopTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDesktopTypes", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDesktopTypesResponse());
    }

    public DescribeDesktopTypesResponse describeDesktopTypes(DescribeDesktopTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopTypesWithOptions(request, runtime);
    }

    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDirectories", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDirectoriesResponse());
    }

    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    public DeleteDirectoriesResponse deleteDirectoriesWithOptions(DeleteDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDirectories", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDirectoriesResponse());
    }

    public DeleteDirectoriesResponse deleteDirectories(DeleteDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDirectoriesWithOptions(request, runtime);
    }

    public ListDirectoryUsersResponse listDirectoryUsersWithOptions(ListDirectoryUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDirectoryUsers", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ListDirectoryUsersResponse());
    }

    public ListDirectoryUsersResponse listDirectoryUsers(ListDirectoryUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDirectoryUsersWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateImage", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateRAMDirectoryResponse createRAMDirectoryWithOptions(CreateRAMDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRAMDirectory", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateRAMDirectoryResponse());
    }

    public CreateRAMDirectoryResponse createRAMDirectory(CreateRAMDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRAMDirectoryWithOptions(request, runtime);
    }

    public DeletePolicyGroupsResponse deletePolicyGroupsWithOptions(DeletePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePolicyGroups", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeletePolicyGroupsResponse());
    }

    public DeletePolicyGroupsResponse deletePolicyGroups(DeletePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyGroupsWithOptions(request, runtime);
    }

    public DescribePolicyGroupsResponse describePolicyGroupsWithOptions(DescribePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePolicyGroups", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribePolicyGroupsResponse());
    }

    public DescribePolicyGroupsResponse describePolicyGroups(DescribePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyGroupsWithOptions(request, runtime);
    }

    public DeleteDesktopsResponse deleteDesktopsWithOptions(DeleteDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDesktopsResponse());
    }

    public DeleteDesktopsResponse deleteDesktops(DeleteDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDesktopsWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyImageAttribute", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyEntitlementResponse modifyEntitlementWithOptions(ModifyEntitlementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyEntitlement", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyEntitlementResponse());
    }

    public ModifyEntitlementResponse modifyEntitlement(ModifyEntitlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEntitlementWithOptions(request, runtime);
    }

    public DeleteBundlesResponse deleteBundlesWithOptions(DeleteBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBundles", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBundlesResponse());
    }

    public DeleteBundlesResponse deleteBundles(DeleteBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBundlesWithOptions(request, runtime);
    }

    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDesktopsResponse());
    }

    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    public RebootDesktopsResponse rebootDesktopsWithOptions(RebootDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RebootDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RebootDesktopsResponse());
    }

    public RebootDesktopsResponse rebootDesktops(RebootDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootDesktopsWithOptions(request, runtime);
    }

    public CreateBundleResponse createBundleWithOptions(CreateBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBundle", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateBundleResponse());
    }

    public CreateBundleResponse createBundle(CreateBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBundleWithOptions(request, runtime);
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroupWithOptions(ModifyDesktopsPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDesktopsPolicyGroup", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDesktopsPolicyGroupResponse());
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopsPolicyGroupWithOptions(request, runtime);
    }

    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePolicyGroup", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreatePolicyGroupResponse());
    }

    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyGroupWithOptions(request, runtime);
    }

    public CreateADConnectorDirectoryResponse createADConnectorDirectoryWithOptions(CreateADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateADConnectorDirectory", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateADConnectorDirectoryResponse());
    }

    public CreateADConnectorDirectoryResponse createADConnectorDirectory(CreateADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorDirectoryWithOptions(request, runtime);
    }

    public DescribeBundlesResponse describeBundlesWithOptions(DescribeBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBundles", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBundlesResponse());
    }

    public DescribeBundlesResponse describeBundles(DescribeBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBundlesWithOptions(request, runtime);
    }

    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteImages", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteImagesResponse());
    }

    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImagesWithOptions(request, runtime);
    }

    public CreateDesktopsResponse createDesktopsWithOptions(CreateDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDesktops", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateDesktopsResponse());
    }

    public CreateDesktopsResponse createDesktops(CreateDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopsWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImages", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
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
}
