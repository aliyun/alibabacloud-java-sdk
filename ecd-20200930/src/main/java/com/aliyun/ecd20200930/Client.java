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


    public CheckUserInSecurityCenterWhiteListResponse checkUserInSecurityCenterWhiteListWithOptions(CheckUserInSecurityCenterWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckUserInSecurityCenterWhiteList", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CheckUserInSecurityCenterWhiteListResponse());
    }

    public CheckUserInSecurityCenterWhiteListResponse checkUserInSecurityCenterWhiteList(CheckUserInSecurityCenterWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUserInSecurityCenterWhiteListWithOptions(request, runtime);
    }

    public AddUserToSecurityCenterWhiteListResponse addUserToSecurityCenterWhiteListWithOptions(AddUserToSecurityCenterWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddUserToSecurityCenterWhiteList", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new AddUserToSecurityCenterWhiteListResponse());
    }

    public AddUserToSecurityCenterWhiteListResponse addUserToSecurityCenterWhiteList(AddUserToSecurityCenterWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToSecurityCenterWhiteListWithOptions(request, runtime);
    }

    public DescribeVulOverviewResponse describeVulOverviewWithOptions(DescribeVulOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVulOverview", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVulOverviewResponse());
    }

    public DescribeVulOverviewResponse describeVulOverview(DescribeVulOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulOverviewWithOptions(request, runtime);
    }

    public DescribeSuspEventOverviewResponse describeSuspEventOverviewWithOptions(DescribeSuspEventOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSuspEventOverview", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSuspEventOverviewResponse());
    }

    public DescribeSuspEventOverviewResponse describeSuspEventOverview(DescribeSuspEventOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventOverviewWithOptions(request, runtime);
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabledWithOptions(ModifyOfficeSiteMfaEnabledRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyOfficeSiteMfaEnabled", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyOfficeSiteMfaEnabledResponse());
    }

    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOfficeSiteMfaEnabledWithOptions(request, runtime);
    }

    public DeleteNASFileSystemsResponse deleteNASFileSystemsWithOptions(DeleteNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNASFileSystems", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNASFileSystemsResponse());
    }

    public DeleteNASFileSystemsResponse deleteNASFileSystems(DeleteNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNASFileSystemsWithOptions(request, runtime);
    }

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTargetWithOptions(ModifyNASDefaultMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNASDefaultMountTarget", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNASDefaultMountTargetResponse());
    }

    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNASDefaultMountTargetWithOptions(request, runtime);
    }

    public CreateNASFileSystemResponse createNASFileSystemWithOptions(CreateNASFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNASFileSystem", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateNASFileSystemResponse());
    }

    public CreateNASFileSystemResponse createNASFileSystem(CreateNASFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNASFileSystemWithOptions(request, runtime);
    }

    public DescribeNASFileSystemsResponse describeNASFileSystemsWithOptions(DescribeNASFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNASFileSystems", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNASFileSystemsResponse());
    }

    public DescribeNASFileSystemsResponse describeNASFileSystems(DescribeNASFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNASFileSystemsWithOptions(request, runtime);
    }

    public StartVirusScanTaskResponse startVirusScanTaskWithOptions(StartVirusScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartVirusScanTask", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new StartVirusScanTaskResponse());
    }

    public StartVirusScanTaskResponse startVirusScanTask(StartVirusScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startVirusScanTaskWithOptions(request, runtime);
    }

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSiteWithOptions(ModifyADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyADConnectorOfficeSite", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyADConnectorOfficeSiteResponse());
    }

    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchListWithOptions(DescribeFrontVulPatchListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFrontVulPatchList", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFrontVulPatchListResponse());
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchList(DescribeFrontVulPatchListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFrontVulPatchListWithOptions(request, runtime);
    }

    public DescribeVulDetailsResponse describeVulDetailsWithOptions(DescribeVulDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVulDetails", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVulDetailsResponse());
    }

    public DescribeVulDetailsResponse describeVulDetails(DescribeVulDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulDetailsWithOptions(request, runtime);
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesWithOptions(DescribeSuspEventQuaraFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSuspEventQuaraFiles", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSuspEventQuaraFilesResponse());
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventQuaraFilesWithOptions(request, runtime);
    }

    public ModifyOperateVulResponse modifyOperateVulWithOptions(ModifyOperateVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyOperateVul", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyOperateVulResponse());
    }

    public ModifyOperateVulResponse modifyOperateVul(ModifyOperateVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOperateVulWithOptions(request, runtime);
    }

    public AttachCenResponse attachCenWithOptions(AttachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachCen", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new AttachCenResponse());
    }

    public AttachCenResponse attachCen(AttachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachCenWithOptions(request, runtime);
    }

    public DescribeVulListResponse describeVulListWithOptions(DescribeVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVulList", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVulListResponse());
    }

    public DescribeVulListResponse describeVulList(DescribeVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulListWithOptions(request, runtime);
    }

    public DescribeOfficeSitesResponse describeOfficeSitesWithOptions(DescribeOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOfficeSites", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOfficeSitesResponse());
    }

    public DescribeOfficeSitesResponse describeOfficeSites(DescribeOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOfficeSitesWithOptions(request, runtime);
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSiteWithOptions(CreateSimpleOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSimpleOfficeSite", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateSimpleOfficeSiteResponse());
    }

    public CreateSimpleOfficeSiteResponse createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimpleOfficeSiteWithOptions(request, runtime);
    }

    public OperateVulsResponse operateVulsWithOptions(OperateVulsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OperateVuls", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new OperateVulsResponse());
    }

    public OperateVulsResponse operateVuls(OperateVulsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateVulsWithOptions(request, runtime);
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgressWithOptions(DescribeScanTaskProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeScanTaskProgress", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeScanTaskProgressResponse());
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgress(DescribeScanTaskProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScanTaskProgressWithOptions(request, runtime);
    }

    public DetachCenResponse detachCenWithOptions(DetachCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachCen", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DetachCenResponse());
    }

    public DetachCenResponse detachCen(DetachCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachCenWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusWithOptions(DescribeSecurityEventOperationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityEventOperationStatus", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityEventOperationStatusResponse());
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationStatusWithOptions(request, runtime);
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfoWithOptions(DescribeAlarmEventStackInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAlarmEventStackInfo", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAlarmEventStackInfoResponse());
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventStackInfoWithOptions(request, runtime);
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsersWithOptions(ListOfficeSiteUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOfficeSiteUsers", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ListOfficeSiteUsersResponse());
    }

    public ListOfficeSiteUsersResponse listOfficeSiteUsers(ListOfficeSiteUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteUsersWithOptions(request, runtime);
    }

    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSuspEvents", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSuspEventsResponse());
    }

    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    public DescribeModificationPriceResponse describeModificationPriceWithOptions(DescribeModificationPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeModificationPrice", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeModificationPriceResponse());
    }

    public DescribeModificationPriceResponse describeModificationPrice(DescribeModificationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModificationPriceWithOptions(request, runtime);
    }

    public DeleteOfficeSitesResponse deleteOfficeSitesWithOptions(DeleteOfficeSitesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteOfficeSites", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteOfficeSitesResponse());
    }

    public DeleteOfficeSitesResponse deleteOfficeSites(DeleteOfficeSitesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOfficeSitesWithOptions(request, runtime);
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNamesWithOptions(DescribeDesktopIdsByVulNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDesktopIdsByVulNames", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDesktopIdsByVulNamesResponse());
    }

    public DescribeDesktopIdsByVulNamesResponse describeDesktopIdsByVulNames(DescribeDesktopIdsByVulNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDesktopIdsByVulNamesWithOptions(request, runtime);
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatusWithOptions(GetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOfficeSiteSsoStatus", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new GetOfficeSiteSsoStatusResponse());
    }

    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSecurityEventOperations", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSecurityEventOperationsResponse());
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
    }

    public CreateNetworkPackageResponse createNetworkPackageWithOptions(CreateNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNetworkPackage", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateNetworkPackageResponse());
    }

    public CreateNetworkPackageResponse createNetworkPackage(CreateNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkPackageWithOptions(request, runtime);
    }

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSiteWithOptions(CreateADConnectorOfficeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateADConnectorOfficeSite", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateADConnectorOfficeSiteResponse());
    }

    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createADConnectorOfficeSiteWithOptions(request, runtime);
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackagesWithOptions(DeleteNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteNetworkPackages", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteNetworkPackagesResponse());
    }

    public DeleteNetworkPackagesResponse deleteNetworkPackages(DeleteNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkPackagesWithOptions(request, runtime);
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatusWithOptions(SetOfficeSiteSsoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetOfficeSiteSsoStatus", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new SetOfficeSiteSsoStatusResponse());
    }

    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("HandleSecurityEvents", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new HandleSecurityEventsResponse());
    }

    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
    }

    public ModifyNetworkPackageResponse modifyNetworkPackageWithOptions(ModifyNetworkPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyNetworkPackage", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyNetworkPackageResponse());
    }

    public ModifyNetworkPackageResponse modifyNetworkPackage(ModifyNetworkPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkPackageWithOptions(request, runtime);
    }

    public DescribeNetworkPackagesResponse describeNetworkPackagesWithOptions(DescribeNetworkPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeNetworkPackages", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeNetworkPackagesResponse());
    }

    public DescribeNetworkPackagesResponse describeNetworkPackages(DescribeNetworkPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkPackagesWithOptions(request, runtime);
    }

    public DescribeGroupedVulResponse describeGroupedVulWithOptions(DescribeGroupedVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGroupedVul", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGroupedVulResponse());
    }

    public DescribeGroupedVulResponse describeGroupedVul(DescribeGroupedVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedVulWithOptions(request, runtime);
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFileWithOptions(RollbackSuspEventQuaraFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RollbackSuspEventQuaraFile", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RollbackSuspEventQuaraFileResponse());
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackSuspEventQuaraFileWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePrice", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public ModifyDesktopSpecResponse modifyDesktopSpecWithOptions(ModifyDesktopSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDesktopSpec", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDesktopSpecResponse());
    }

    public ModifyDesktopSpecResponse modifyDesktopSpec(ModifyDesktopSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDesktopSpecWithOptions(request, runtime);
    }

    public ListOfficeSiteOverviewResponse listOfficeSiteOverviewWithOptions(ListOfficeSiteOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOfficeSiteOverview", "HTTPS", "POST", "2020-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ListOfficeSiteOverviewResponse());
    }

    public ListOfficeSiteOverviewResponse listOfficeSiteOverview(ListOfficeSiteOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfficeSiteOverviewWithOptions(request, runtime);
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
