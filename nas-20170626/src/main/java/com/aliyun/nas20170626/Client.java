// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626;

import com.aliyun.tea.*;
import com.aliyun.nas20170626.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-chengdu", "nas.aliyuncs.com"),
            new TeaPair("me-east-1", "nas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "nas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DeleteLifecyclePolicyResponse deleteLifecyclePolicyWithOptions(DeleteLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLifecyclePolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLifecyclePolicyResponse());
    }

    public DeleteLifecyclePolicyResponse deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecyclePolicyWithOptions(request, runtime);
    }

    public UpgradeFileSystemResponse upgradeFileSystemWithOptions(UpgradeFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeFileSystem", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeFileSystemResponse());
    }

    public UpgradeFileSystemResponse upgradeFileSystem(UpgradeFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFileSystemWithOptions(request, runtime);
    }

    public ModifyLifecyclePolicyResponse modifyLifecyclePolicyWithOptions(ModifyLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLifecyclePolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyLifecyclePolicyResponse());
    }

    public ModifyLifecyclePolicyResponse modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecyclePolicyWithOptions(request, runtime);
    }

    public CreateLifecyclePolicyResponse createLifecyclePolicyWithOptions(CreateLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLifecyclePolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateLifecyclePolicyResponse());
    }

    public CreateLifecyclePolicyResponse createLifecyclePolicy(CreateLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecyclePolicyWithOptions(request, runtime);
    }

    public DescribeLifecyclePoliciesResponse describeLifecyclePoliciesWithOptions(DescribeLifecyclePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLifecyclePolicies", "HTTPS", "GET", "2017-06-26", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLifecyclePoliciesResponse());
    }

    public DescribeLifecyclePoliciesResponse describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecyclePoliciesWithOptions(request, runtime);
    }

    public DescribeDirQuotasResponse describeDirQuotasWithOptions(DescribeDirQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDirQuotas", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDirQuotasResponse());
    }

    public DescribeDirQuotasResponse describeDirQuotas(DescribeDirQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirQuotasWithOptions(request, runtime);
    }

    public SetDirQuotaResponse setDirQuotaWithOptions(SetDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDirQuota", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new SetDirQuotaResponse());
    }

    public SetDirQuotaResponse setDirQuota(SetDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDirQuotaWithOptions(request, runtime);
    }

    public CancelDirQuotaResponse cancelDirQuotaWithOptions(CancelDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelDirQuota", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelDirQuotaResponse());
    }

    public CancelDirQuotaResponse cancelDirQuota(CancelDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDirQuotaWithOptions(request, runtime);
    }

    public DescribeStoragePackagesResponse describeStoragePackagesWithOptions(DescribeStoragePackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeStoragePackages", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeStoragePackagesResponse());
    }

    public DescribeStoragePackagesResponse describeStoragePackages(DescribeStoragePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoragePackagesWithOptions(request, runtime);
    }

    public DescribeFileSystemStatisticsResponse describeFileSystemStatisticsWithOptions(DescribeFileSystemStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFileSystemStatistics", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFileSystemStatisticsResponse());
    }

    public DescribeFileSystemStatisticsResponse describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemStatisticsWithOptions(request, runtime);
    }

    public DescribeLogAnalysisResponse describeLogAnalysisWithOptions(DescribeLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLogAnalysis", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLogAnalysisResponse());
    }

    public DescribeLogAnalysisResponse describeLogAnalysis(DescribeLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogAnalysisWithOptions(request, runtime);
    }

    public DescribeMountedClientsResponse describeMountedClientsWithOptions(DescribeMountedClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMountedClients", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMountedClientsResponse());
    }

    public DescribeMountedClientsResponse describeMountedClients(DescribeMountedClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountedClientsWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasksWithOptions(DescribeAutoSnapshotTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoSnapshotTasks", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoSnapshotTasksResponse());
    }

    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotTasksWithOptions(request, runtime);
    }

    public RemoveClientFromBlackListResponse removeClientFromBlackListWithOptions(RemoveClientFromBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveClientFromBlackList", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new RemoveClientFromBlackListResponse());
    }

    public RemoveClientFromBlackListResponse removeClientFromBlackList(RemoveClientFromBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClientFromBlackListWithOptions(request, runtime);
    }

    public DescribeBlackListClientsResponse describeBlackListClientsWithOptions(DescribeBlackListClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBlackListClients", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBlackListClientsResponse());
    }

    public DescribeBlackListClientsResponse describeBlackListClients(DescribeBlackListClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlackListClientsWithOptions(request, runtime);
    }

    public AddClientToBlackListResponse addClientToBlackListWithOptions(AddClientToBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddClientToBlackList", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new AddClientToBlackListResponse());
    }

    public AddClientToBlackListResponse addClientToBlackList(AddClientToBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClientToBlackListWithOptions(request, runtime);
    }

    public DescribeLDAPConfigResponse describeLDAPConfigWithOptions(DescribeLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLDAPConfig", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLDAPConfigResponse());
    }

    public DescribeLDAPConfigResponse describeLDAPConfig(DescribeLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLDAPConfigWithOptions(request, runtime);
    }

    public ModifyLDAPConfigResponse modifyLDAPConfigWithOptions(ModifyLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLDAPConfig", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyLDAPConfigResponse());
    }

    public ModifyLDAPConfigResponse modifyLDAPConfig(ModifyLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLDAPConfigWithOptions(request, runtime);
    }

    public CreateLDAPConfigResponse createLDAPConfigWithOptions(CreateLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLDAPConfig", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateLDAPConfigResponse());
    }

    public CreateLDAPConfigResponse createLDAPConfig(CreateLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLDAPConfigWithOptions(request, runtime);
    }

    public DeleteLDAPConfigResponse deleteLDAPConfigWithOptions(DeleteLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLDAPConfig", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLDAPConfigResponse());
    }

    public DeleteLDAPConfigResponse deleteLDAPConfig(DeleteLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLDAPConfigWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTags", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveTags", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTags", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public ResetFileSystemResponse resetFileSystemWithOptions(ResetFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetFileSystem", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ResetFileSystemResponse());
    }

    public ResetFileSystemResponse resetFileSystem(ResetFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetFileSystemWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAutoSnapshotPolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPoliciesWithOptions(DescribeAutoSnapshotPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAutoSnapshotPolicies", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAutoSnapshotPoliciesResponse());
    }

    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelAutoSnapshotPolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyAutoSnapshotPolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAutoSnapshotPolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAutoSnapshotPolicy", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSnapshot", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSnapshot", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSnapshots", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeZones", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public CreateAccessGroupResponse createAccessGroupWithOptions(CreateAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAccessGroup", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateAccessGroupResponse());
    }

    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    public CreateMountTargetResponse createMountTargetWithOptions(CreateMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMountTarget", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateMountTargetResponse());
    }

    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    public CreateFileSystemResponse createFileSystemWithOptions(CreateFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFileSystem", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateFileSystemResponse());
    }

    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    public CreateAccessRuleResponse createAccessRuleWithOptions(CreateAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAccessRule", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new CreateAccessRuleResponse());
    }

    public CreateAccessRuleResponse createAccessRule(CreateAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessRuleWithOptions(request, runtime);
    }

    public DescribeAccessRulesResponse describeAccessRulesWithOptions(DescribeAccessRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccessRules", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccessRulesResponse());
    }

    public DescribeAccessRulesResponse describeAccessRules(DescribeAccessRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessRulesWithOptions(request, runtime);
    }

    public DescribeAccessGroupsResponse describeAccessGroupsWithOptions(DescribeAccessGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAccessGroups", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAccessGroupsResponse());
    }

    public DescribeAccessGroupsResponse describeAccessGroups(DescribeAccessGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessGroupsWithOptions(request, runtime);
    }

    public DeleteMountTargetResponse deleteMountTargetWithOptions(DeleteMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMountTarget", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMountTargetResponse());
    }

    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    public DeleteFileSystemResponse deleteFileSystemWithOptions(DeleteFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFileSystem", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFileSystemResponse());
    }

    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    public DeleteAccessRuleResponse deleteAccessRuleWithOptions(DeleteAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAccessRule", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAccessRuleResponse());
    }

    public DeleteAccessRuleResponse deleteAccessRule(DeleteAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessRuleWithOptions(request, runtime);
    }

    public DeleteAccessGroupResponse deleteAccessGroupWithOptions(DeleteAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAccessGroup", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAccessGroupResponse());
    }

    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    public ModifyAccessRuleResponse modifyAccessRuleWithOptions(ModifyAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAccessRule", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAccessRuleResponse());
    }

    public ModifyAccessRuleResponse modifyAccessRule(ModifyAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessRuleWithOptions(request, runtime);
    }

    public ModifyAccessGroupResponse modifyAccessGroupWithOptions(ModifyAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAccessGroup", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAccessGroupResponse());
    }

    public ModifyAccessGroupResponse modifyAccessGroup(ModifyAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessGroupWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeMountTargetsResponse describeMountTargetsWithOptions(DescribeMountTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMountTargets", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMountTargetsResponse());
    }

    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    public DescribeFileSystemsResponse describeFileSystemsWithOptions(DescribeFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFileSystems", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFileSystemsResponse());
    }

    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    public ModifyMountTargetResponse modifyMountTargetWithOptions(ModifyMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyMountTarget", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyMountTargetResponse());
    }

    public ModifyMountTargetResponse modifyMountTarget(ModifyMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMountTargetWithOptions(request, runtime);
    }

    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyFileSystem", "HTTPS", "POST", "2017-06-26", "AK", null, TeaModel.buildMap(request), runtime), new ModifyFileSystemResponse());
    }

    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
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
