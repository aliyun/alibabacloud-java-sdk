// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930;

import com.aliyun.tea.*;
import com.aliyun.ecd20200930.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateADConnectorDirectoryResponse createADConnectorDirectoryWithOptions(CreateADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateADConnectorDirectory", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateADConnectorDirectoryResponse());
    }

    public CreateADConnectorDirectoryResponse createADConnectorDirectory(CreateADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorDirectoryWithOptions(request, runtime);
    }

    public CreateBundleResponse createBundleWithOptions(CreateBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBundle", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBundleResponse());
    }

    public CreateBundleResponse createBundle(CreateBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBundleWithOptions(request, runtime);
    }

    public CreateDesktopsResponse createDesktopsWithOptions(CreateDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDesktopsResponse());
    }

    public CreateDesktopsResponse createDesktops(CreateDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopsWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImage", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePolicyGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolicyGroupResponse());
    }

    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyGroupWithOptions(request, runtime);
    }

    public CreateRAMDirectoryResponse createRAMDirectoryWithOptions(CreateRAMDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRAMDirectory", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRAMDirectoryResponse());
    }

    public CreateRAMDirectoryResponse createRAMDirectory(CreateRAMDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRAMDirectoryWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshot", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DeleteBundlesResponse deleteBundlesWithOptions(DeleteBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBundles", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBundlesResponse());
    }

    public DeleteBundlesResponse deleteBundles(DeleteBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBundlesWithOptions(request, runtime);
    }

    public DeleteDesktopsResponse deleteDesktopsWithOptions(DeleteDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDesktopsResponse());
    }

    public DeleteDesktopsResponse deleteDesktops(DeleteDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDesktopsWithOptions(request, runtime);
    }

    public DeleteDirectoriesResponse deleteDirectoriesWithOptions(DeleteDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDirectories", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDirectoriesResponse());
    }

    public DeleteDirectoriesResponse deleteDirectories(DeleteDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDirectoriesWithOptions(request, runtime);
    }

    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImagesResponse());
    }

    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImagesWithOptions(request, runtime);
    }

    public DeletePolicyGroupsResponse deletePolicyGroupsWithOptions(DeletePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePolicyGroups", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePolicyGroupsResponse());
    }

    public DeletePolicyGroupsResponse deletePolicyGroups(DeletePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyGroupsWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshot", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVirtualMFADevice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVirtualMFADeviceResponse());
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public DescribeBundlesResponse describeBundlesWithOptions(DescribeBundlesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBundles", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBundlesResponse());
    }

    public DescribeBundlesResponse describeBundles(DescribeBundlesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBundlesWithOptions(request, runtime);
    }

    public DescribeClientEventsResponse describeClientEventsWithOptions(DescribeClientEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClientEvents", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClientEventsResponse());
    }

    public DescribeClientEventsResponse describeClientEvents(DescribeClientEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClientEventsWithOptions(request, runtime);
    }

    public DescribeDesktopPolicysResponse describeDesktopPolicysWithOptions(DescribeDesktopPolicysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktopPolicys", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopPolicysResponse());
    }

    public DescribeDesktopPolicysResponse describeDesktopPolicys(DescribeDesktopPolicysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopPolicysWithOptions(request, runtime);
    }

    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopsResponse());
    }

    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    public DescribeDesktopTypesResponse describeDesktopTypesWithOptions(DescribeDesktopTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktopTypes", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopTypesResponse());
    }

    public DescribeDesktopTypesResponse describeDesktopTypes(DescribeDesktopTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopTypesWithOptions(request, runtime);
    }

    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDirectories", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDirectoriesResponse());
    }

    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInvocations", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInvocationsResponse());
    }

    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    public DescribePolicyGroupsResponse describePolicyGroupsWithOptions(DescribePolicyGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolicyGroups", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolicyGroupsResponse());
    }

    public DescribePolicyGroupsResponse describePolicyGroups(DescribePolicyGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyGroupsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshots", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevicesWithOptions(DescribeVirtualMFADevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVirtualMFADevices", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVirtualMFADevicesResponse());
    }

    public DescribeVirtualMFADevicesResponse describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVirtualMFADevicesWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DoCheckResourceResponse doCheckResourceWithOptions(DoCheckResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoCheckResource", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DoCheckResourceResponse());
    }

    public DoCheckResourceResponse doCheckResource(DoCheckResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doCheckResourceWithOptions(request, runtime);
    }

    public DoLogicalDeleteResourceResponse doLogicalDeleteResourceWithOptions(DoLogicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoLogicalDeleteResource", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DoLogicalDeleteResourceResponse());
    }

    public DoLogicalDeleteResourceResponse doLogicalDeleteResource(DoLogicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doLogicalDeleteResourceWithOptions(request, runtime);
    }

    public DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceWithOptions(DoPhysicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoPhysicalDeleteResource", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DoPhysicalDeleteResourceResponse());
    }

    public DoPhysicalDeleteResourceResponse doPhysicalDeleteResource(DoPhysicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doPhysicalDeleteResourceWithOptions(request, runtime);
    }

    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConnectionTicket", "2020-09-30", "HTTP", "POST", "AK", "json", req, runtime), new GetConnectionTicketResponse());
    }

    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    public ListDirectoryUsersResponse listDirectoryUsersWithOptions(ListDirectoryUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDirectoryUsers", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDirectoryUsersResponse());
    }

    public ListDirectoryUsersResponse listDirectoryUsers(ListDirectoryUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDirectoryUsersWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADeviceWithOptions(LockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockVirtualMFADevice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new LockVirtualMFADeviceResponse());
    }

    public LockVirtualMFADeviceResponse lockVirtualMFADevice(LockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockVirtualMFADeviceWithOptions(request, runtime);
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectoryWithOptions(ModifyADConnectorDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyADConnectorDirectory", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyADConnectorDirectoryResponse());
    }

    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorDirectoryWithOptions(request, runtime);
    }

    public ModifyDesktopNameResponse modifyDesktopNameWithOptions(ModifyDesktopNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopName", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopNameResponse());
    }

    public ModifyDesktopNameResponse modifyDesktopName(ModifyDesktopNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopNameWithOptions(request, runtime);
    }

    public ModifyDesktopPolicysResponse modifyDesktopPolicysWithOptions(ModifyDesktopPolicysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopPolicys", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopPolicysResponse());
    }

    public ModifyDesktopPolicysResponse modifyDesktopPolicys(ModifyDesktopPolicysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopPolicysWithOptions(request, runtime);
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroupWithOptions(ModifyDesktopsPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopsPolicyGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopsPolicyGroupResponse());
    }

    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopsPolicyGroupWithOptions(request, runtime);
    }

    public ModifyEntitlementResponse modifyEntitlementWithOptions(ModifyEntitlementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEntitlement", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEntitlementResponse());
    }

    public ModifyEntitlementResponse modifyEntitlement(ModifyEntitlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEntitlementWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageAttribute", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPolicyGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPolicyGroupResponse());
    }

    public ModifyPolicyGroupResponse modifyPolicyGroup(ModifyPolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPolicyGroupWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PayOrderCallback", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public RebootDesktopsResponse rebootDesktopsWithOptions(RebootDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RebootDesktopsResponse());
    }

    public RebootDesktopsResponse rebootDesktops(RebootDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootDesktopsWithOptions(request, runtime);
    }

    public RenewDesktopsResponse renewDesktopsWithOptions(RenewDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RenewDesktopsResponse());
    }

    public RenewDesktopsResponse renewDesktops(RenewDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDesktopsWithOptions(request, runtime);
    }

    public ResetSnapshotResponse resetSnapshotWithOptions(ResetSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetSnapshot", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ResetSnapshotResponse());
    }

    public ResetSnapshotResponse resetSnapshot(ResetSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSnapshotWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunCommand", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public StartDesktopsResponse startDesktopsWithOptions(StartDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new StartDesktopsResponse());
    }

    public StartDesktopsResponse startDesktops(StartDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDesktopsWithOptions(request, runtime);
    }

    public StopDesktopsResponse stopDesktopsWithOptions(StopDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new StopDesktopsResponse());
    }

    public StopDesktopsResponse stopDesktops(StopDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDesktopsWithOptions(request, runtime);
    }

    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopInvocation", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new StopInvocationResponse());
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
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADeviceWithOptions(UnlockVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockVirtualMFADevice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockVirtualMFADeviceResponse());
    }

    public UnlockVirtualMFADeviceResponse unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockVirtualMFADeviceWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
