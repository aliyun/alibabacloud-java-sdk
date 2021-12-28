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

    public ActivateOfficeSiteResponse activateOfficeSiteWithOptions(ActivateOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivateOfficeSite", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ActivateOfficeSiteResponse());
    }

    public ActivateOfficeSiteResponse activateOfficeSite(ActivateOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateOfficeSiteWithOptions(request, runtime);
    }

    public AddUserToDesktopGroupResponse addUserToDesktopGroupWithOptions(AddUserToDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserToDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserToDesktopGroupResponse());
    }

    public AddUserToDesktopGroupResponse addUserToDesktopGroup(AddUserToDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToDesktopGroupWithOptions(request, runtime);
    }

    public AddUserToSecurityCenterWhiteListResponse addUserToSecurityCenterWhiteListWithOptions(AddUserToSecurityCenterWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserToSecurityCenterWhiteList", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserToSecurityCenterWhiteListResponse());
    }

    public AddUserToSecurityCenterWhiteListResponse addUserToSecurityCenterWhiteList(AddUserToSecurityCenterWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToSecurityCenterWhiteListWithOptions(request, runtime);
    }

    public AttachCenResponse attachCenWithOptions(AttachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachCen", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new AttachCenResponse());
    }

    public AttachCenResponse attachCen(AttachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachCenWithOptions(request, runtime);
    }

    public CheckUserInSecurityCenterWhiteListResponse checkUserInSecurityCenterWhiteListWithOptions(CheckUserInSecurityCenterWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckUserInSecurityCenterWhiteList", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CheckUserInSecurityCenterWhiteListResponse());
    }

    public CheckUserInSecurityCenterWhiteListResponse checkUserInSecurityCenterWhiteList(CheckUserInSecurityCenterWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUserInSecurityCenterWhiteListWithOptions(request, runtime);
    }

    public CheckUserTagsResponse checkUserTagsWithOptions(CheckUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckUserTags", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CheckUserTagsResponse());
    }

    public CheckUserTagsResponse checkUserTags(CheckUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUserTagsWithOptions(request, runtime);
    }

    public ClonePolicyGroupResponse clonePolicyGroupWithOptions(ClonePolicyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClonePolicyGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ClonePolicyGroupResponse());
    }

    public ClonePolicyGroupResponse clonePolicyGroup(ClonePolicyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clonePolicyGroupWithOptions(request, runtime);
    }

    public ConfigADConnectorTrustResponse configADConnectorTrustWithOptions(ConfigADConnectorTrustRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigADConnectorTrust", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigADConnectorTrustResponse());
    }

    public ConfigADConnectorTrustResponse configADConnectorTrust(ConfigADConnectorTrustRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configADConnectorTrustWithOptions(request, runtime);
    }

    public ConfigADConnectorUserResponse configADConnectorUserWithOptions(ConfigADConnectorUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigADConnectorUser", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigADConnectorUserResponse());
    }

    public ConfigADConnectorUserResponse configADConnectorUser(ConfigADConnectorUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configADConnectorUserWithOptions(request, runtime);
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

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSiteWithOptions(CreateADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateADConnectorOfficeSite", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateADConnectorOfficeSiteResponse());
    }

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public CreateBandwidthResourcePackagesResponse createBandwidthResourcePackagesWithOptions(CreateBandwidthResourcePackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBandwidthResourcePackages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBandwidthResourcePackagesResponse());
    }

    public CreateBandwidthResourcePackagesResponse createBandwidthResourcePackages(CreateBandwidthResourcePackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBandwidthResourcePackagesWithOptions(request, runtime);
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

    public CreateCloudDriveServiceResponse createCloudDriveServiceWithOptions(CreateCloudDriveServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCloudDriveService", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCloudDriveServiceResponse());
    }

    public CreateCloudDriveServiceResponse createCloudDriveService(CreateCloudDriveServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudDriveServiceWithOptions(request, runtime);
    }

    public CreateDesktopGroupResponse createDesktopGroupWithOptions(CreateDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDesktopGroupResponse());
    }

    public CreateDesktopGroupResponse createDesktopGroup(CreateDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopGroupWithOptions(request, runtime);
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

    public CreateDesktopsLiteResponse createDesktopsLiteWithOptions(CreateDesktopsLiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDesktopsLite", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDesktopsLiteResponse());
    }

    public CreateDesktopsLiteResponse createDesktopsLite(CreateDesktopsLiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDesktopsLiteWithOptions(request, runtime);
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

    public CreateNASFileSystemResponse createNASFileSystemWithOptions(CreateNASFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNASFileSystem", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNASFileSystemResponse());
    }

    public CreateNASFileSystemResponse createNASFileSystem(CreateNASFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNASFileSystemWithOptions(request, runtime);
    }

    public CreateNetworkPackageResponse createNetworkPackageWithOptions(CreateNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetworkPackage", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkPackageResponse());
    }

    public CreateNetworkPackageResponse createNetworkPackage(CreateNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkPackageWithOptions(request, runtime);
    }

    public CreateOrderForHardwareResponse createOrderForHardwareWithOptions(CreateOrderForHardwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrderForHardware", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrderForHardwareResponse());
    }

    public CreateOrderForHardwareResponse createOrderForHardware(CreateOrderForHardwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderForHardwareWithOptions(request, runtime);
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

    public CreateScaleStrategyResponse createScaleStrategyWithOptions(CreateScaleStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScaleStrategy", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScaleStrategyResponse());
    }

    public CreateScaleStrategyResponse createScaleStrategy(CreateScaleStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScaleStrategyWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSiteWithOptions(CreateSimpleOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSimpleOfficeSite", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSimpleOfficeSiteResponse());
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimpleOfficeSiteWithOptions(request, runtime);
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

    public DeleteCloudDriveServicesResponse deleteCloudDriveServicesWithOptions(DeleteCloudDriveServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCloudDriveServices", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCloudDriveServicesResponse());
    }

    public DeleteCloudDriveServicesResponse deleteCloudDriveServices(DeleteCloudDriveServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCloudDriveServicesWithOptions(request, runtime);
    }

    public DeleteDesktopGroupResponse deleteDesktopGroupWithOptions(DeleteDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDesktopGroupResponse());
    }

    public DeleteDesktopGroupResponse deleteDesktopGroup(DeleteDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDesktopGroupWithOptions(request, runtime);
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

    public DeleteNASFileSystemsResponse deleteNASFileSystemsWithOptions(DeleteNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNASFileSystems", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNASFileSystemsResponse());
    }

    public DeleteNASFileSystemsResponse deleteNASFileSystems(DeleteNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNASFileSystemsWithOptions(request, runtime);
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackagesWithOptions(DeleteNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetworkPackages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkPackagesResponse());
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackages(DeleteNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkPackagesWithOptions(request, runtime);
    }

    public DeleteOfficeSitesResponse deleteOfficeSitesWithOptions(DeleteOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOfficeSites", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOfficeSitesResponse());
    }

    public DeleteOfficeSitesResponse deleteOfficeSites(DeleteOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOfficeSitesWithOptions(request, runtime);
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

    public DeleteScaleStrategyResponse deleteScaleStrategyWithOptions(DeleteScaleStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScaleStrategy", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScaleStrategyResponse());
    }

    public DeleteScaleStrategyResponse deleteScaleStrategy(DeleteScaleStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScaleStrategyWithOptions(request, runtime);
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

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfoWithOptions(DescribeAlarmEventStackInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlarmEventStackInfo", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlarmEventStackInfoResponse());
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventStackInfoWithOptions(request, runtime);
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

    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCens", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCensResponse());
    }

    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
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

    public DescribeCloudDriveServiceResponse describeCloudDriveServiceWithOptions(DescribeCloudDriveServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudDriveService", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudDriveServiceResponse());
    }

    public DescribeCloudDriveServiceResponse describeCloudDriveService(DescribeCloudDriveServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudDriveServiceWithOptions(request, runtime);
    }

    public DescribeDesktopGroupsResponse describeDesktopGroupsWithOptions(DescribeDesktopGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktopGroups", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopGroupsResponse());
    }

    public DescribeDesktopGroupsResponse describeDesktopGroups(DescribeDesktopGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopGroupsWithOptions(request, runtime);
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNamesWithOptions(DescribeDesktopIdsByVulNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktopIdsByVulNames", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopIdsByVulNamesResponse());
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNames(DescribeDesktopIdsByVulNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopIdsByVulNamesWithOptions(request, runtime);
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

    public DescribeDesktopsInGroupResponse describeDesktopsInGroupWithOptions(DescribeDesktopsInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDesktopsInGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDesktopsInGroupResponse());
    }

    public DescribeDesktopsInGroupResponse describeDesktopsInGroup(DescribeDesktopsInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopsInGroupWithOptions(request, runtime);
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

    public DescribeFlowMetricResponse describeFlowMetricWithOptions(DescribeFlowMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowMetric", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowMetricResponse());
    }

    public DescribeFlowMetricResponse describeFlowMetric(DescribeFlowMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowMetricWithOptions(request, runtime);
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchListWithOptions(DescribeFrontVulPatchListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFrontVulPatchList", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFrontVulPatchListResponse());
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchList(DescribeFrontVulPatchListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFrontVulPatchListWithOptions(request, runtime);
    }

    public DescribeGroupedVulResponse describeGroupedVulWithOptions(DescribeGroupedVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedVul", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedVulResponse());
    }

    public DescribeGroupedVulResponse describeGroupedVul(DescribeGroupedVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedVulWithOptions(request, runtime);
    }

    public DescribeHardwareTerminalsResponse describeHardwareTerminalsWithOptions(DescribeHardwareTerminalsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHardwareTerminals", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHardwareTerminalsResponse());
    }

    public DescribeHardwareTerminalsResponse describeHardwareTerminals(DescribeHardwareTerminalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHardwareTerminalsWithOptions(request, runtime);
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

    public DescribeModificationPriceResponse describeModificationPriceWithOptions(DescribeModificationPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeModificationPrice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeModificationPriceResponse());
    }

    public DescribeModificationPriceResponse describeModificationPrice(DescribeModificationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModificationPriceWithOptions(request, runtime);
    }

    public DescribeNASFileSystemsResponse describeNASFileSystemsWithOptions(DescribeNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNASFileSystems", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNASFileSystemsResponse());
    }

    public DescribeNASFileSystemsResponse describeNASFileSystems(DescribeNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNASFileSystemsWithOptions(request, runtime);
    }

    public DescribeNetworkPackagesResponse describeNetworkPackagesWithOptions(DescribeNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkPackages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkPackagesResponse());
    }

    public DescribeNetworkPackagesResponse describeNetworkPackages(DescribeNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkPackagesWithOptions(request, runtime);
    }

    public DescribeOfficeSitesResponse describeOfficeSitesWithOptions(DescribeOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOfficeSites", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOfficeSitesResponse());
    }

    public DescribeOfficeSitesResponse describeOfficeSites(DescribeOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOfficeSitesWithOptions(request, runtime);
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

    public DescribePostPaidDesktopBillsResponse describePostPaidDesktopBillsWithOptions(DescribePostPaidDesktopBillsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePostPaidDesktopBills", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePostPaidDesktopBillsResponse());
    }

    public DescribePostPaidDesktopBillsResponse describePostPaidDesktopBills(DescribePostPaidDesktopBillsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePostPaidDesktopBillsWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
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

    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRenewalPrice", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRenewalPriceResponse());
    }

    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    public DescribeResourcePackageQuotaResponse describeResourcePackageQuotaWithOptions(DescribeResourcePackageQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourcePackageQuota", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourcePackageQuotaResponse());
    }

    public DescribeResourcePackageQuotaResponse describeResourcePackageQuota(DescribeResourcePackageQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackageQuotaWithOptions(request, runtime);
    }

    public DescribeScaleStrategysResponse describeScaleStrategysWithOptions(DescribeScaleStrategysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScaleStrategys", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScaleStrategysResponse());
    }

    public DescribeScaleStrategysResponse describeScaleStrategys(DescribeScaleStrategysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScaleStrategysWithOptions(request, runtime);
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgressWithOptions(DescribeScanTaskProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScanTaskProgress", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScanTaskProgressResponse());
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgress(DescribeScanTaskProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScanTaskProgressWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusWithOptions(DescribeSecurityEventOperationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityEventOperationStatus", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityEventOperationStatusResponse());
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationStatusWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityEventOperations", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityEventOperationsResponse());
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
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

    public DescribeSuspEventOverviewResponse describeSuspEventOverviewWithOptions(DescribeSuspEventOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEventOverview", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventOverviewResponse());
    }

    public DescribeSuspEventOverviewResponse describeSuspEventOverview(DescribeSuspEventOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventOverviewWithOptions(request, runtime);
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesWithOptions(DescribeSuspEventQuaraFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEventQuaraFiles", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventQuaraFilesResponse());
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventQuaraFilesWithOptions(request, runtime);
    }

    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEvents", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventsResponse());
    }

    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    public DescribeUserConnectionRecordsResponse describeUserConnectionRecordsWithOptions(DescribeUserConnectionRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserConnectionRecords", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserConnectionRecordsResponse());
    }

    public DescribeUserConnectionRecordsResponse describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserConnectionRecordsWithOptions(request, runtime);
    }

    public DescribeUsersInGroupResponse describeUsersInGroupWithOptions(DescribeUsersInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUsersInGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUsersInGroupResponse());
    }

    public DescribeUsersInGroupResponse describeUsersInGroup(DescribeUsersInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUsersInGroupWithOptions(request, runtime);
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

    public DescribeVulDetailsResponse describeVulDetailsWithOptions(DescribeVulDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulDetails", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulDetailsResponse());
    }

    public DescribeVulDetailsResponse describeVulDetails(DescribeVulDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulDetailsWithOptions(request, runtime);
    }

    public DescribeVulListResponse describeVulListWithOptions(DescribeVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulList", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulListResponse());
    }

    public DescribeVulListResponse describeVulList(DescribeVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulListWithOptions(request, runtime);
    }

    public DescribeVulOverviewResponse describeVulOverviewWithOptions(DescribeVulOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulOverview", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulOverviewResponse());
    }

    public DescribeVulOverviewResponse describeVulOverview(DescribeVulOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulOverviewWithOptions(request, runtime);
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

    public DetachCenResponse detachCenWithOptions(DetachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachCen", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new DetachCenResponse());
    }

    public DetachCenResponse detachCen(DetachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachCenWithOptions(request, runtime);
    }

    public ExportDesktopGroupInfoResponse exportDesktopGroupInfoWithOptions(ExportDesktopGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportDesktopGroupInfo", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ExportDesktopGroupInfoResponse());
    }

    public ExportDesktopGroupInfoResponse exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportDesktopGroupInfoWithOptions(request, runtime);
    }

    public ExportDesktopListInfoResponse exportDesktopListInfoWithOptions(ExportDesktopListInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportDesktopListInfo", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ExportDesktopListInfoResponse());
    }

    public ExportDesktopListInfoResponse exportDesktopListInfo(ExportDesktopListInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportDesktopListInfoWithOptions(request, runtime);
    }

    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConnectionTicket", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetConnectionTicketResponse());
    }

    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    public GetDesktopGroupDetailResponse getDesktopGroupDetailWithOptions(GetDesktopGroupDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDesktopGroupDetail", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDesktopGroupDetailResponse());
    }

    public GetDesktopGroupDetailResponse getDesktopGroupDetail(GetDesktopGroupDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDesktopGroupDetailWithOptions(request, runtime);
    }

    public GetDirectorySsoStatusResponse getDirectorySsoStatusWithOptions(GetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDirectorySsoStatus", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDirectorySsoStatusResponse());
    }

    public GetDirectorySsoStatusResponse getDirectorySsoStatus(GetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDirectorySsoStatusWithOptions(request, runtime);
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatusWithOptions(GetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOfficeSiteSsoStatus", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetOfficeSiteSsoStatusResponse());
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    public GetSpMetadataResponse getSpMetadataWithOptions(GetSpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSpMetadata", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetSpMetadataResponse());
    }

    public GetSpMetadataResponse getSpMetadata(GetSpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpMetadataWithOptions(request, runtime);
    }

    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HandleSecurityEvents", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new HandleSecurityEventsResponse());
    }

    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
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

    public ListOfficeSiteOverviewResponse listOfficeSiteOverviewWithOptions(ListOfficeSiteOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOfficeSiteOverview", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListOfficeSiteOverviewResponse());
    }

    public ListOfficeSiteOverviewResponse listOfficeSiteOverview(ListOfficeSiteOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteOverviewWithOptions(request, runtime);
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsersWithOptions(ListOfficeSiteUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOfficeSiteUsers", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListOfficeSiteUsersResponse());
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsers(ListOfficeSiteUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteUsersWithOptions(request, runtime);
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

    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnitsWithOptions(ListUserAdOrganizationUnitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserAdOrganizationUnits", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserAdOrganizationUnitsResponse());
    }

    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserAdOrganizationUnitsWithOptions(request, runtime);
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

    public MigrateDesktopResponse migrateDesktopWithOptions(MigrateDesktopRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateDesktop", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateDesktopResponse());
    }

    public MigrateDesktopResponse migrateDesktop(MigrateDesktopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateDesktopWithOptions(request, runtime);
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

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSiteWithOptions(ModifyADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyADConnectorOfficeSite", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyADConnectorOfficeSiteResponse());
    }

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public ModifyBundleResponse modifyBundleWithOptions(ModifyBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBundle", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBundleResponse());
    }

    public ModifyBundleResponse modifyBundle(ModifyBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBundleWithOptions(request, runtime);
    }

    public ModifyCloudDriveServiceResponse modifyCloudDriveServiceWithOptions(ModifyCloudDriveServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCloudDriveService", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCloudDriveServiceResponse());
    }

    public ModifyCloudDriveServiceResponse modifyCloudDriveService(ModifyCloudDriveServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCloudDriveServiceWithOptions(request, runtime);
    }

    public ModifyDesktopChargeTypeResponse modifyDesktopChargeTypeWithOptions(ModifyDesktopChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopChargeType", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopChargeTypeResponse());
    }

    public ModifyDesktopChargeTypeResponse modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopChargeTypeWithOptions(request, runtime);
    }

    public ModifyDesktopGroupResponse modifyDesktopGroupWithOptions(ModifyDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopGroupResponse());
    }

    public ModifyDesktopGroupResponse modifyDesktopGroup(ModifyDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopGroupWithOptions(request, runtime);
    }

    public ModifyDesktopHostNameResponse modifyDesktopHostNameWithOptions(ModifyDesktopHostNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopHostName", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopHostNameResponse());
    }

    public ModifyDesktopHostNameResponse modifyDesktopHostName(ModifyDesktopHostNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopHostNameWithOptions(request, runtime);
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

    public ModifyDesktopSpecResponse modifyDesktopSpecWithOptions(ModifyDesktopSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDesktopSpec", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDesktopSpecResponse());
    }

    public ModifyDesktopSpecResponse modifyDesktopSpec(ModifyDesktopSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopSpecWithOptions(request, runtime);
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

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTargetWithOptions(ModifyNASDefaultMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNASDefaultMountTarget", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNASDefaultMountTargetResponse());
    }

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNASDefaultMountTargetWithOptions(request, runtime);
    }

    public ModifyNetworkPackageResponse modifyNetworkPackageWithOptions(ModifyNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkPackage", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkPackageResponse());
    }

    public ModifyNetworkPackageResponse modifyNetworkPackage(ModifyNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageWithOptions(request, runtime);
    }

    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidthWithOptions(ModifyNetworkPackageBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkPackageBandwidth", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkPackageBandwidthResponse());
    }

    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageBandwidthWithOptions(request, runtime);
    }

    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabledWithOptions(ModifyNetworkPackageEnabledRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkPackageEnabled", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkPackageEnabledResponse());
    }

    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageEnabledWithOptions(request, runtime);
    }

    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttributeWithOptions(ModifyOfficeSiteAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOfficeSiteAttribute", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOfficeSiteAttributeResponse());
    }

    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteAttributeWithOptions(request, runtime);
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccessWithOptions(ModifyOfficeSiteCrossDesktopAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOfficeSiteCrossDesktopAccess", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOfficeSiteCrossDesktopAccessResponse());
    }

    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteCrossDesktopAccessWithOptions(request, runtime);
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabledWithOptions(ModifyOfficeSiteMfaEnabledRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOfficeSiteMfaEnabled", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOfficeSiteMfaEnabledResponse());
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteMfaEnabledWithOptions(request, runtime);
    }

    public ModifyOperateVulResponse modifyOperateVulWithOptions(ModifyOperateVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOperateVul", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOperateVulResponse());
    }

    public ModifyOperateVulResponse modifyOperateVul(ModifyOperateVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOperateVulWithOptions(request, runtime);
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

    public ModifyScaleStrategyResponse modifyScaleStrategyWithOptions(ModifyScaleStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScaleStrategy", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScaleStrategyResponse());
    }

    public ModifyScaleStrategyResponse modifyScaleStrategy(ModifyScaleStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScaleStrategyWithOptions(request, runtime);
    }

    public ModifyUserEntitlementResponse modifyUserEntitlementWithOptions(ModifyUserEntitlementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserEntitlement", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserEntitlementResponse());
    }

    public ModifyUserEntitlementResponse modifyUserEntitlement(ModifyUserEntitlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserEntitlementWithOptions(request, runtime);
    }

    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroupWithOptions(ModifyUserToDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserToDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserToDesktopGroupResponse());
    }

    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserToDesktopGroupWithOptions(request, runtime);
    }

    public OperateVulsResponse operateVulsWithOptions(OperateVulsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateVuls", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new OperateVulsResponse());
    }

    public OperateVulsResponse operateVuls(OperateVulsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateVulsWithOptions(request, runtime);
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

    public RebuildDesktopsResponse rebuildDesktopsWithOptions(RebuildDesktopsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebuildDesktops", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RebuildDesktopsResponse());
    }

    public RebuildDesktopsResponse rebuildDesktops(RebuildDesktopsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebuildDesktopsWithOptions(request, runtime);
    }

    public RecreateDesktopGroupResponse recreateDesktopGroupWithOptions(RecreateDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecreateDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RecreateDesktopGroupResponse());
    }

    public RecreateDesktopGroupResponse recreateDesktopGroup(RecreateDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recreateDesktopGroupWithOptions(request, runtime);
    }

    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroupWithOptions(RemoveUserFromDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUserFromDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUserFromDesktopGroupResponse());
    }

    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUserFromDesktopGroupWithOptions(request, runtime);
    }

    public RenewDesktopGroupResponse renewDesktopGroupWithOptions(RenewDesktopGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewDesktopGroup", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RenewDesktopGroupResponse());
    }

    public RenewDesktopGroupResponse renewDesktopGroup(RenewDesktopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDesktopGroupWithOptions(request, runtime);
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

    public RenewNetworkPackagesResponse renewNetworkPackagesWithOptions(RenewNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewNetworkPackages", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RenewNetworkPackagesResponse());
    }

    public RenewNetworkPackagesResponse renewNetworkPackages(RenewNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewNetworkPackagesWithOptions(request, runtime);
    }

    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTargetWithOptions(ResetNASDefaultMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetNASDefaultMountTarget", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new ResetNASDefaultMountTargetResponse());
    }

    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetNASDefaultMountTargetWithOptions(request, runtime);
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

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFileWithOptions(RollbackSuspEventQuaraFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackSuspEventQuaraFile", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackSuspEventQuaraFileResponse());
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackSuspEventQuaraFileWithOptions(request, runtime);
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

    public SendVerifyCodeResponse sendVerifyCodeWithOptions(SendVerifyCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendVerifyCode", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new SendVerifyCodeResponse());
    }

    public SendVerifyCodeResponse sendVerifyCode(SendVerifyCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendVerifyCodeWithOptions(request, runtime);
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatusWithOptions(SetDirectorySsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDirectorySsoStatus", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new SetDirectorySsoStatusResponse());
    }

    public SetDirectorySsoStatusResponse setDirectorySsoStatus(SetDirectorySsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDirectorySsoStatusWithOptions(request, runtime);
    }

    public SetIdpMetadataResponse setIdpMetadataWithOptions(SetIdpMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetIdpMetadata", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new SetIdpMetadataResponse());
    }

    public SetIdpMetadataResponse setIdpMetadata(SetIdpMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIdpMetadataWithOptions(request, runtime);
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatusWithOptions(SetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetOfficeSiteSsoStatus", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new SetOfficeSiteSsoStatusResponse());
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOfficeSiteSsoStatusWithOptions(request, runtime);
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

    public StartVirusScanTaskResponse startVirusScanTaskWithOptions(StartVirusScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartVirusScanTask", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new StartVirusScanTaskResponse());
    }

    public StartVirusScanTaskResponse startVirusScanTask(StartVirusScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startVirusScanTaskWithOptions(request, runtime);
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

    public VerifyCenResponse verifyCenWithOptions(VerifyCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyCen", "2020-09-30", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyCenResponse());
    }

    public VerifyCenResponse verifyCen(VerifyCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyCenWithOptions(request, runtime);
    }
}
