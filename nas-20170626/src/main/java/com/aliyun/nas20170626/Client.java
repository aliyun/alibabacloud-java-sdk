// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626;

import com.aliyun.tea.*;
import com.aliyun.nas20170626.models.*;
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
            new TeaPair("cn-chengdu", "nas.aliyuncs.com"),
            new TeaPair("me-east-1", "nas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "nas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddClientToBlackListResponse addClientToBlackListWithOptions(AddClientToBlackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddClientToBlackList", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new AddClientToBlackListResponse());
    }

    public AddClientToBlackListResponse addClientToBlackList(AddClientToBlackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClientToBlackListWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTags", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyAutoSnapshotPolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelAutoSnapshotPolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CancelDirQuotaResponse cancelDirQuotaWithOptions(CancelDirQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelDirQuota", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelDirQuotaResponse());
    }

    public CancelDirQuotaResponse cancelDirQuota(CancelDirQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelDirQuotaWithOptions(request, runtime);
    }

    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJobWithOptions(CancelLifecycleRetrieveJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelLifecycleRetrieveJob", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CancelLifecycleRetrieveJobResponse());
    }

    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelLifecycleRetrieveJobWithOptions(request, runtime);
    }

    public CancelRecycleBinJobResponse cancelRecycleBinJobWithOptions(CancelRecycleBinJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelRecycleBinJob", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new CancelRecycleBinJobResponse());
    }

    public CancelRecycleBinJobResponse cancelRecycleBinJob(CancelRecycleBinJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRecycleBinJobWithOptions(request, runtime);
    }

    public CreateAccessGroupResponse createAccessGroupWithOptions(CreateAccessGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccessGroup", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccessGroupResponse());
    }

    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    public CreateAccessRuleResponse createAccessRuleWithOptions(CreateAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccessRule", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccessRuleResponse());
    }

    public CreateAccessRuleResponse createAccessRule(CreateAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessRuleWithOptions(request, runtime);
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAutoSnapshotPolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public CreateFileSystemResponse createFileSystemWithOptions(CreateFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFileSystem", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFileSystemResponse());
    }

    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    public CreateLDAPConfigResponse createLDAPConfigWithOptions(CreateLDAPConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLDAPConfig", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLDAPConfigResponse());
    }

    public CreateLDAPConfigResponse createLDAPConfig(CreateLDAPConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLDAPConfigWithOptions(request, runtime);
    }

    public CreateLifecyclePolicyResponse createLifecyclePolicyWithOptions(CreateLifecyclePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLifecyclePolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLifecyclePolicyResponse());
    }

    public CreateLifecyclePolicyResponse createLifecyclePolicy(CreateLifecyclePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLifecyclePolicyWithOptions(request, runtime);
    }

    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJobWithOptions(CreateLifecycleRetrieveJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLifecycleRetrieveJob", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLifecycleRetrieveJobResponse());
    }

    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLifecycleRetrieveJobWithOptions(request, runtime);
    }

    public CreateMountTargetResponse createMountTargetWithOptions(CreateMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMountTarget", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMountTargetResponse());
    }

    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJobWithOptions(CreateRecycleBinDeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRecycleBinDeleteJob", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new CreateRecycleBinDeleteJobResponse());
    }

    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecycleBinDeleteJobWithOptions(request, runtime);
    }

    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJobWithOptions(CreateRecycleBinRestoreJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRecycleBinRestoreJob", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new CreateRecycleBinRestoreJobResponse());
    }

    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecycleBinRestoreJobWithOptions(request, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSnapshot", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    public DeleteAccessGroupResponse deleteAccessGroupWithOptions(DeleteAccessGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccessGroup", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccessGroupResponse());
    }

    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    public DeleteAccessRuleResponse deleteAccessRuleWithOptions(DeleteAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccessRule", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccessRuleResponse());
    }

    public DeleteAccessRuleResponse deleteAccessRule(DeleteAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessRuleWithOptions(request, runtime);
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoSnapshotPolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public DeleteFileSystemResponse deleteFileSystemWithOptions(DeleteFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFileSystem", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFileSystemResponse());
    }

    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    public DeleteLDAPConfigResponse deleteLDAPConfigWithOptions(DeleteLDAPConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLDAPConfig", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLDAPConfigResponse());
    }

    public DeleteLDAPConfigResponse deleteLDAPConfig(DeleteLDAPConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLDAPConfigWithOptions(request, runtime);
    }

    public DeleteLifecyclePolicyResponse deleteLifecyclePolicyWithOptions(DeleteLifecyclePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLifecyclePolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLifecyclePolicyResponse());
    }

    public DeleteLifecyclePolicyResponse deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLifecyclePolicyWithOptions(request, runtime);
    }

    public DeleteMountTargetResponse deleteMountTargetWithOptions(DeleteMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMountTarget", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMountTargetResponse());
    }

    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSnapshot", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSnapshotResponse());
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    public DescribeAccessGroupsResponse describeAccessGroupsWithOptions(DescribeAccessGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessGroups", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessGroupsResponse());
    }

    public DescribeAccessGroupsResponse describeAccessGroups(DescribeAccessGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessGroupsWithOptions(request, runtime);
    }

    public DescribeAccessRulesResponse describeAccessRulesWithOptions(DescribeAccessRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccessRules", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccessRulesResponse());
    }

    public DescribeAccessRulesResponse describeAccessRules(DescribeAccessRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccessRulesWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPoliciesWithOptions(DescribeAutoSnapshotPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoSnapshotPolicies", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoSnapshotPoliciesResponse());
    }

    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasksWithOptions(DescribeAutoSnapshotTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoSnapshotTasks", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoSnapshotTasksResponse());
    }

    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoSnapshotTasksWithOptions(request, runtime);
    }

    public DescribeBlackListClientsResponse describeBlackListClientsWithOptions(DescribeBlackListClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBlackListClients", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBlackListClientsResponse());
    }

    public DescribeBlackListClientsResponse describeBlackListClients(DescribeBlackListClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBlackListClientsWithOptions(request, runtime);
    }

    public DescribeDirQuotasResponse describeDirQuotasWithOptions(DescribeDirQuotasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDirQuotas", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDirQuotasResponse());
    }

    public DescribeDirQuotasResponse describeDirQuotas(DescribeDirQuotasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirQuotasWithOptions(request, runtime);
    }

    public DescribeFileSystemsResponse describeFileSystemsWithOptions(DescribeFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFileSystems", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFileSystemsResponse());
    }

    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    public DescribeFileSystemStatisticsResponse describeFileSystemStatisticsWithOptions(DescribeFileSystemStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFileSystemStatistics", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFileSystemStatisticsResponse());
    }

    public DescribeFileSystemStatisticsResponse describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFileSystemStatisticsWithOptions(request, runtime);
    }

    public DescribeLDAPConfigResponse describeLDAPConfigWithOptions(DescribeLDAPConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLDAPConfig", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLDAPConfigResponse());
    }

    public DescribeLDAPConfigResponse describeLDAPConfig(DescribeLDAPConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLDAPConfigWithOptions(request, runtime);
    }

    public DescribeLifecyclePoliciesResponse describeLifecyclePoliciesWithOptions(DescribeLifecyclePoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLifecyclePolicies", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLifecyclePoliciesResponse());
    }

    public DescribeLifecyclePoliciesResponse describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLifecyclePoliciesWithOptions(request, runtime);
    }

    public DescribeLogAnalysisResponse describeLogAnalysisWithOptions(DescribeLogAnalysisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogAnalysis", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogAnalysisResponse());
    }

    public DescribeLogAnalysisResponse describeLogAnalysis(DescribeLogAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogAnalysisWithOptions(request, runtime);
    }

    public DescribeMountedClientsResponse describeMountedClientsWithOptions(DescribeMountedClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMountedClients", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMountedClientsResponse());
    }

    public DescribeMountedClientsResponse describeMountedClients(DescribeMountedClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMountedClientsWithOptions(request, runtime);
    }

    public DescribeMountTargetsResponse describeMountTargetsWithOptions(DescribeMountTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMountTargets", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMountTargetsResponse());
    }

    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshots", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeStoragePackagesResponse describeStoragePackagesWithOptions(DescribeStoragePackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStoragePackages", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStoragePackagesResponse());
    }

    public DescribeStoragePackagesResponse describeStoragePackages(DescribeStoragePackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStoragePackagesWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBinWithOptions(DisableAndCleanRecycleBinRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAndCleanRecycleBin", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new DisableAndCleanRecycleBinResponse());
    }

    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAndCleanRecycleBinWithOptions(request, runtime);
    }

    public EnableRecycleBinResponse enableRecycleBinWithOptions(EnableRecycleBinRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableRecycleBin", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new EnableRecycleBinResponse());
    }

    public EnableRecycleBinResponse enableRecycleBin(EnableRecycleBinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableRecycleBinWithOptions(request, runtime);
    }

    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFilePropertiesWithOptions(GetDirectoryOrFilePropertiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDirectoryOrFileProperties", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new GetDirectoryOrFilePropertiesResponse());
    }

    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDirectoryOrFilePropertiesWithOptions(request, runtime);
    }

    public GetRecycleBinAttributeResponse getRecycleBinAttributeWithOptions(GetRecycleBinAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRecycleBinAttribute", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new GetRecycleBinAttributeResponse());
    }

    public GetRecycleBinAttributeResponse getRecycleBinAttribute(GetRecycleBinAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRecycleBinAttributeWithOptions(request, runtime);
    }

    public ListDirectoriesAndFilesResponse listDirectoriesAndFilesWithOptions(ListDirectoriesAndFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDirectoriesAndFiles", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ListDirectoriesAndFilesResponse());
    }

    public ListDirectoriesAndFilesResponse listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDirectoriesAndFilesWithOptions(request, runtime);
    }

    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobsWithOptions(ListLifecycleRetrieveJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLifecycleRetrieveJobs", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ListLifecycleRetrieveJobsResponse());
    }

    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLifecycleRetrieveJobsWithOptions(request, runtime);
    }

    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectoriesWithOptions(ListRecentlyRecycledDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecentlyRecycledDirectories", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new ListRecentlyRecycledDirectoriesResponse());
    }

    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecentlyRecycledDirectoriesWithOptions(request, runtime);
    }

    public ListRecycleBinJobsResponse listRecycleBinJobsWithOptions(ListRecycleBinJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecycleBinJobs", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new ListRecycleBinJobsResponse());
    }

    public ListRecycleBinJobsResponse listRecycleBinJobs(ListRecycleBinJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecycleBinJobsWithOptions(request, runtime);
    }

    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFilesWithOptions(ListRecycledDirectoriesAndFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecycledDirectoriesAndFiles", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new ListRecycledDirectoriesAndFilesResponse());
    }

    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecycledDirectoriesAndFilesWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyAccessGroupResponse modifyAccessGroupWithOptions(ModifyAccessGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccessGroup", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccessGroupResponse());
    }

    public ModifyAccessGroupResponse modifyAccessGroup(ModifyAccessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccessGroupWithOptions(request, runtime);
    }

    public ModifyAccessRuleResponse modifyAccessRuleWithOptions(ModifyAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccessRule", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccessRuleResponse());
    }

    public ModifyAccessRuleResponse modifyAccessRule(ModifyAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccessRuleWithOptions(request, runtime);
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoSnapshotPolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFileSystem", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFileSystemResponse());
    }

    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    public ModifyLDAPConfigResponse modifyLDAPConfigWithOptions(ModifyLDAPConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLDAPConfig", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLDAPConfigResponse());
    }

    public ModifyLDAPConfigResponse modifyLDAPConfig(ModifyLDAPConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLDAPConfigWithOptions(request, runtime);
    }

    public ModifyLifecyclePolicyResponse modifyLifecyclePolicyWithOptions(ModifyLifecyclePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLifecyclePolicy", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLifecyclePolicyResponse());
    }

    public ModifyLifecyclePolicyResponse modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLifecyclePolicyWithOptions(request, runtime);
    }

    public ModifyMountTargetResponse modifyMountTargetWithOptions(ModifyMountTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMountTarget", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMountTargetResponse());
    }

    public ModifyMountTargetResponse modifyMountTarget(ModifyMountTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMountTargetWithOptions(request, runtime);
    }

    public OpenNASServiceResponse openNASServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenNASService", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new OpenNASServiceResponse());
    }

    public OpenNASServiceResponse openNASService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openNASServiceWithOptions(runtime);
    }

    public RemoveClientFromBlackListResponse removeClientFromBlackListWithOptions(RemoveClientFromBlackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveClientFromBlackList", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveClientFromBlackListResponse());
    }

    public RemoveClientFromBlackListResponse removeClientFromBlackList(RemoveClientFromBlackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeClientFromBlackListWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTags", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public ResetFileSystemResponse resetFileSystemWithOptions(ResetFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetFileSystem", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new ResetFileSystemResponse());
    }

    public ResetFileSystemResponse resetFileSystem(ResetFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetFileSystemWithOptions(request, runtime);
    }

    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJobWithOptions(RetryLifecycleRetrieveJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetryLifecycleRetrieveJob", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new RetryLifecycleRetrieveJobResponse());
    }

    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryLifecycleRetrieveJobWithOptions(request, runtime);
    }

    public SetDirQuotaResponse setDirQuotaWithOptions(SetDirQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDirQuota", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new SetDirQuotaResponse());
    }

    public SetDirQuotaResponse setDirQuota(SetDirQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDirQuotaWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateRecycleBinAttributeResponse updateRecycleBinAttributeWithOptions(UpdateRecycleBinAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRecycleBinAttribute", "2017-06-26", "HTTPS", "GET", "AK", "json", req, runtime), new UpdateRecycleBinAttributeResponse());
    }

    public UpdateRecycleBinAttributeResponse updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecycleBinAttributeWithOptions(request, runtime);
    }

    public UpgradeFileSystemResponse upgradeFileSystemWithOptions(UpgradeFileSystemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeFileSystem", "2017-06-26", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeFileSystemResponse());
    }

    public UpgradeFileSystemResponse upgradeFileSystem(UpgradeFileSystemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeFileSystemWithOptions(request, runtime);
    }
}
