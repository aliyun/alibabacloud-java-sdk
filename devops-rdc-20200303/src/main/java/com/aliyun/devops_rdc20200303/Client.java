// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303;

import com.aliyun.tea.*;
import com.aliyun.devops_rdc20200303.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("devops-rdc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchInsertMembersResponse batchInsertMembersWithOptions(BatchInsertMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchInsertMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new BatchInsertMembersResponse());
    }

    public BatchInsertMembersResponse batchInsertMembers(BatchInsertMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchInsertMembersWithOptions(request, runtime);
    }

    public CancelPipelineResponse cancelPipelineWithOptions(CancelPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPipeline", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPipelineResponse());
    }

    public CancelPipelineResponse cancelPipeline(CancelPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPipelineWithOptions(request, runtime);
    }

    public CheckAliyunAccountExistsResponse checkAliyunAccountExistsWithOptions(CheckAliyunAccountExistsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAliyunAccountExists", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CheckAliyunAccountExistsResponse());
    }

    public CheckAliyunAccountExistsResponse checkAliyunAccountExists(CheckAliyunAccountExistsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAliyunAccountExistsWithOptions(request, runtime);
    }

    public CreateCommonGroupResponse createCommonGroupWithOptions(CreateCommonGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCommonGroup", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCommonGroupResponse());
    }

    public CreateCommonGroupResponse createCommonGroup(CreateCommonGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommonGroupWithOptions(request, runtime);
    }

    public CreateCredentialResponse createCredentialWithOptions(CreateCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCredential", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCredentialResponse());
    }

    public CreateCredentialResponse createCredential(CreateCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCredentialWithOptions(request, runtime);
    }

    public CreateDevopsOrganizationResponse createDevopsOrganizationWithOptions(CreateDevopsOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevopsOrganization", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDevopsOrganizationResponse());
    }

    public CreateDevopsOrganizationResponse createDevopsOrganization(CreateDevopsOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevopsOrganizationWithOptions(request, runtime);
    }

    public CreateDevopsProjectResponse createDevopsProjectWithOptions(CreateDevopsProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevopsProject", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDevopsProjectResponse());
    }

    public CreateDevopsProjectResponse createDevopsProject(CreateDevopsProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevopsProjectWithOptions(request, runtime);
    }

    public CreateDevopsProjectSprintResponse createDevopsProjectSprintWithOptions(CreateDevopsProjectSprintRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevopsProjectSprint", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDevopsProjectSprintResponse());
    }

    public CreateDevopsProjectSprintResponse createDevopsProjectSprint(CreateDevopsProjectSprintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevopsProjectSprintWithOptions(request, runtime);
    }

    public CreateDevopsProjectTaskResponse createDevopsProjectTaskWithOptions(CreateDevopsProjectTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevopsProjectTask", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDevopsProjectTaskResponse());
    }

    public CreateDevopsProjectTaskResponse createDevopsProjectTask(CreateDevopsProjectTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevopsProjectTaskWithOptions(request, runtime);
    }

    public CreatePipelineResponse createPipelineWithOptions(CreatePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePipeline", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePipelineResponse());
    }

    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPipelineWithOptions(request, runtime);
    }

    public CreateServiceConnectionResponse createServiceConnectionWithOptions(CreateServiceConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceConnection", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceConnectionResponse());
    }

    public CreateServiceConnectionResponse createServiceConnection(CreateServiceConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceConnectionWithOptions(request, runtime);
    }

    public DeleteCommonGroupResponse deleteCommonGroupWithOptions(DeleteCommonGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCommonGroup", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCommonGroupResponse());
    }

    public DeleteCommonGroupResponse deleteCommonGroup(DeleteCommonGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommonGroupWithOptions(request, runtime);
    }

    public DeleteDevopsOrganizationMembersResponse deleteDevopsOrganizationMembersWithOptions(DeleteDevopsOrganizationMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevopsOrganizationMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevopsOrganizationMembersResponse());
    }

    public DeleteDevopsOrganizationMembersResponse deleteDevopsOrganizationMembers(DeleteDevopsOrganizationMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevopsOrganizationMembersWithOptions(request, runtime);
    }

    public DeleteDevopsProjectResponse deleteDevopsProjectWithOptions(DeleteDevopsProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevopsProject", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevopsProjectResponse());
    }

    public DeleteDevopsProjectResponse deleteDevopsProject(DeleteDevopsProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevopsProjectWithOptions(request, runtime);
    }

    public DeleteDevopsProjectMembersResponse deleteDevopsProjectMembersWithOptions(DeleteDevopsProjectMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevopsProjectMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevopsProjectMembersResponse());
    }

    public DeleteDevopsProjectMembersResponse deleteDevopsProjectMembers(DeleteDevopsProjectMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevopsProjectMembersWithOptions(request, runtime);
    }

    public DeleteDevopsProjectSprintResponse deleteDevopsProjectSprintWithOptions(DeleteDevopsProjectSprintRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevopsProjectSprint", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevopsProjectSprintResponse());
    }

    public DeleteDevopsProjectSprintResponse deleteDevopsProjectSprint(DeleteDevopsProjectSprintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevopsProjectSprintWithOptions(request, runtime);
    }

    public DeleteDevopsProjectTaskResponse deleteDevopsProjectTaskWithOptions(DeleteDevopsProjectTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevopsProjectTask", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevopsProjectTaskResponse());
    }

    public DeleteDevopsProjectTaskResponse deleteDevopsProjectTask(DeleteDevopsProjectTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevopsProjectTaskWithOptions(request, runtime);
    }

    public DeletePipelineMemberResponse deletePipelineMemberWithOptions(DeletePipelineMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePipelineMember", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePipelineMemberResponse());
    }

    public DeletePipelineMemberResponse deletePipelineMember(DeletePipelineMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePipelineMemberWithOptions(request, runtime);
    }

    public ExecutePipelineResponse executePipelineWithOptions(ExecutePipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecutePipeline", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ExecutePipelineResponse());
    }

    public ExecutePipelineResponse executePipeline(ExecutePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executePipelineWithOptions(request, runtime);
    }

    public GetDevopsOrganizationMembersResponse getDevopsOrganizationMembersWithOptions(GetDevopsOrganizationMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevopsOrganizationMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetDevopsOrganizationMembersResponse());
    }

    public GetDevopsOrganizationMembersResponse getDevopsOrganizationMembers(GetDevopsOrganizationMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevopsOrganizationMembersWithOptions(request, runtime);
    }

    public GetDevopsProjectInfoResponse getDevopsProjectInfoWithOptions(GetDevopsProjectInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevopsProjectInfo", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetDevopsProjectInfoResponse());
    }

    public GetDevopsProjectInfoResponse getDevopsProjectInfo(GetDevopsProjectInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevopsProjectInfoWithOptions(request, runtime);
    }

    public GetDevopsProjectMembersResponse getDevopsProjectMembersWithOptions(GetDevopsProjectMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevopsProjectMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetDevopsProjectMembersResponse());
    }

    public GetDevopsProjectMembersResponse getDevopsProjectMembers(GetDevopsProjectMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevopsProjectMembersWithOptions(request, runtime);
    }

    public GetDevopsProjectSprintInfoResponse getDevopsProjectSprintInfoWithOptions(GetDevopsProjectSprintInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevopsProjectSprintInfo", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetDevopsProjectSprintInfoResponse());
    }

    public GetDevopsProjectSprintInfoResponse getDevopsProjectSprintInfo(GetDevopsProjectSprintInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevopsProjectSprintInfoWithOptions(request, runtime);
    }

    public GetDevopsProjectTaskInfoResponse getDevopsProjectTaskInfoWithOptions(GetDevopsProjectTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevopsProjectTaskInfo", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetDevopsProjectTaskInfoResponse());
    }

    public GetDevopsProjectTaskInfoResponse getDevopsProjectTaskInfo(GetDevopsProjectTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevopsProjectTaskInfoWithOptions(request, runtime);
    }

    public GetPipelineInstanceBuildNumberStatusResponse getPipelineInstanceBuildNumberStatusWithOptions(GetPipelineInstanceBuildNumberStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineInstanceBuildNumberStatus", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineInstanceBuildNumberStatusResponse());
    }

    public GetPipelineInstanceBuildNumberStatusResponse getPipelineInstanceBuildNumberStatus(GetPipelineInstanceBuildNumberStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstanceBuildNumberStatusWithOptions(request, runtime);
    }

    public GetPipelineInstanceGroupStatusResponse getPipelineInstanceGroupStatusWithOptions(GetPipelineInstanceGroupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineInstanceGroupStatus", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineInstanceGroupStatusResponse());
    }

    public GetPipelineInstanceGroupStatusResponse getPipelineInstanceGroupStatus(GetPipelineInstanceGroupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstanceGroupStatusWithOptions(request, runtime);
    }

    public GetPipelineInstanceInfoResponse getPipelineInstanceInfoWithOptions(GetPipelineInstanceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineInstanceInfo", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineInstanceInfoResponse());
    }

    public GetPipelineInstanceInfoResponse getPipelineInstanceInfo(GetPipelineInstanceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstanceInfoWithOptions(request, runtime);
    }

    public GetPipelineInstanceStatusResponse getPipelineInstanceStatusWithOptions(GetPipelineInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineInstanceStatus", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineInstanceStatusResponse());
    }

    public GetPipelineInstanceStatusResponse getPipelineInstanceStatus(GetPipelineInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstanceStatusWithOptions(request, runtime);
    }

    public GetPipelineInstHistoryResponse getPipelineInstHistoryWithOptions(GetPipelineInstHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineInstHistory", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineInstHistoryResponse());
    }

    public GetPipelineInstHistoryResponse getPipelineInstHistory(GetPipelineInstHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstHistoryWithOptions(request, runtime);
    }

    public GetPipelineLogResponse getPipelineLogWithOptions(GetPipelineLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineLog", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineLogResponse());
    }

    public GetPipelineLogResponse getPipelineLog(GetPipelineLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineLogWithOptions(request, runtime);
    }

    public GetPipelineStepLogResponse getPipelineStepLogWithOptions(GetPipelineStepLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipelineStepLog", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipelineStepLogResponse());
    }

    public GetPipelineStepLogResponse getPipelineStepLog(GetPipelineStepLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineStepLogWithOptions(request, runtime);
    }

    public GetPipleineLatestInstanceStatusResponse getPipleineLatestInstanceStatusWithOptions(GetPipleineLatestInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPipleineLatestInstanceStatus", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetPipleineLatestInstanceStatusResponse());
    }

    public GetPipleineLatestInstanceStatusResponse getPipleineLatestInstanceStatus(GetPipleineLatestInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipleineLatestInstanceStatusWithOptions(request, runtime);
    }

    public GetProjectOptionResponse getProjectOptionWithOptions(GetProjectOptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProjectOption", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetProjectOptionResponse());
    }

    public GetProjectOptionResponse getProjectOption(GetProjectOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProjectOptionWithOptions(request, runtime);
    }

    public GetTaskDetailActivityResponse getTaskDetailActivityWithOptions(GetTaskDetailActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskDetailActivity", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskDetailActivityResponse());
    }

    public GetTaskDetailActivityResponse getTaskDetailActivity(GetTaskDetailActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskDetailActivityWithOptions(request, runtime);
    }

    public GetTaskDetailBaseResponse getTaskDetailBaseWithOptions(GetTaskDetailBaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskDetailBase", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskDetailBaseResponse());
    }

    public GetTaskDetailBaseResponse getTaskDetailBase(GetTaskDetailBaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskDetailBaseWithOptions(request, runtime);
    }

    public GetTaskListFilterResponse getTaskListFilterWithOptions(GetTaskListFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskListFilter", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskListFilterResponse());
    }

    public GetTaskListFilterResponse getTaskListFilter(GetTaskListFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskListFilterWithOptions(request, runtime);
    }

    public GetUserByAliyunUidResponse getUserByAliyunUidWithOptions(GetUserByAliyunUidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserByAliyunUid", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserByAliyunUidResponse());
    }

    public GetUserByAliyunUidResponse getUserByAliyunUid(GetUserByAliyunUidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserByAliyunUidWithOptions(request, runtime);
    }

    public GetUserNameResponse getUserNameWithOptions(GetUserNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserName", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserNameResponse());
    }

    public GetUserNameResponse getUserName(GetUserNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserNameWithOptions(request, runtime);
    }

    public InsertDevopsUserResponse insertDevopsUserWithOptions(InsertDevopsUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertDevopsUser", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new InsertDevopsUserResponse());
    }

    public InsertDevopsUserResponse insertDevopsUser(InsertDevopsUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertDevopsUserWithOptions(request, runtime);
    }

    public InsertPipelineMemberResponse insertPipelineMemberWithOptions(InsertPipelineMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertPipelineMember", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new InsertPipelineMemberResponse());
    }

    public InsertPipelineMemberResponse insertPipelineMember(InsertPipelineMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertPipelineMemberWithOptions(request, runtime);
    }

    public InsertProjectMembersResponse insertProjectMembersWithOptions(InsertProjectMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertProjectMembers", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new InsertProjectMembersResponse());
    }

    public InsertProjectMembersResponse insertProjectMembers(InsertProjectMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertProjectMembersWithOptions(request, runtime);
    }

    public ListCommonGroupResponse listCommonGroupWithOptions(ListCommonGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCommonGroup", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListCommonGroupResponse());
    }

    public ListCommonGroupResponse listCommonGroup(ListCommonGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCommonGroupWithOptions(request, runtime);
    }

    public ListCredentialsResponse listCredentialsWithOptions(ListCredentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCredentials", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListCredentialsResponse());
    }

    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCredentialsWithOptions(request, runtime);
    }

    public ListDevopsProjectSprintsResponse listDevopsProjectSprintsWithOptions(ListDevopsProjectSprintsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsProjectSprints", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsProjectSprintsResponse());
    }

    public ListDevopsProjectSprintsResponse listDevopsProjectSprints(ListDevopsProjectSprintsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsProjectSprintsWithOptions(request, runtime);
    }

    public ListDevopsProjectTaskFlowResponse listDevopsProjectTaskFlowWithOptions(ListDevopsProjectTaskFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsProjectTaskFlow", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsProjectTaskFlowResponse());
    }

    public ListDevopsProjectTaskFlowResponse listDevopsProjectTaskFlow(ListDevopsProjectTaskFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsProjectTaskFlowWithOptions(request, runtime);
    }

    public ListDevopsProjectTaskFlowStatusResponse listDevopsProjectTaskFlowStatusWithOptions(ListDevopsProjectTaskFlowStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsProjectTaskFlowStatus", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsProjectTaskFlowStatusResponse());
    }

    public ListDevopsProjectTaskFlowStatusResponse listDevopsProjectTaskFlowStatus(ListDevopsProjectTaskFlowStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsProjectTaskFlowStatusWithOptions(request, runtime);
    }

    public ListDevopsProjectTaskListResponse listDevopsProjectTaskListWithOptions(ListDevopsProjectTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsProjectTaskList", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsProjectTaskListResponse());
    }

    public ListDevopsProjectTaskListResponse listDevopsProjectTaskList(ListDevopsProjectTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsProjectTaskListWithOptions(request, runtime);
    }

    public ListDevopsProjectTasksResponse listDevopsProjectTasksWithOptions(ListDevopsProjectTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsProjectTasks", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsProjectTasksResponse());
    }

    public ListDevopsProjectTasksResponse listDevopsProjectTasks(ListDevopsProjectTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsProjectTasksWithOptions(request, runtime);
    }

    public ListDevopsScenarioFieldConfigResponse listDevopsScenarioFieldConfigWithOptions(ListDevopsScenarioFieldConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevopsScenarioFieldConfig", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevopsScenarioFieldConfigResponse());
    }

    public ListDevopsScenarioFieldConfigResponse listDevopsScenarioFieldConfig(ListDevopsScenarioFieldConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevopsScenarioFieldConfigWithOptions(request, runtime);
    }

    public ListPipelinesResponse listPipelinesWithOptions(ListPipelinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPipelines", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListPipelinesResponse());
    }

    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPipelinesWithOptions(request, runtime);
    }

    public ListProjectCustomFieldsResponse listProjectCustomFieldsWithOptions(ListProjectCustomFieldsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjectCustomFields", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectCustomFieldsResponse());
    }

    public ListProjectCustomFieldsResponse listProjectCustomFields(ListProjectCustomFieldsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectCustomFieldsWithOptions(request, runtime);
    }

    public ListServiceConnectionsResponse listServiceConnectionsWithOptions(ListServiceConnectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceConnections", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceConnectionsResponse());
    }

    public ListServiceConnectionsResponse listServiceConnections(ListServiceConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceConnectionsWithOptions(request, runtime);
    }

    public ListSmartGroupResponse listSmartGroupWithOptions(ListSmartGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmartGroup", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmartGroupResponse());
    }

    public ListSmartGroupResponse listSmartGroup(ListSmartGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmartGroupWithOptions(request, runtime);
    }

    public ListUserOrganizationResponse listUserOrganizationWithOptions(ListUserOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserOrganization", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserOrganizationResponse());
    }

    public ListUserOrganizationResponse listUserOrganization(ListUserOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserOrganizationWithOptions(request, runtime);
    }

    public TransferPipelineOwnerResponse transferPipelineOwnerWithOptions(TransferPipelineOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferPipelineOwner", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new TransferPipelineOwnerResponse());
    }

    public TransferPipelineOwnerResponse transferPipelineOwner(TransferPipelineOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferPipelineOwnerWithOptions(request, runtime);
    }

    public UpdateCommonGroupResponse updateCommonGroupWithOptions(UpdateCommonGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCommonGroup", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCommonGroupResponse());
    }

    public UpdateCommonGroupResponse updateCommonGroup(UpdateCommonGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCommonGroupWithOptions(request, runtime);
    }

    public UpdateDevopsProjectResponse updateDevopsProjectWithOptions(UpdateDevopsProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevopsProject", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDevopsProjectResponse());
    }

    public UpdateDevopsProjectResponse updateDevopsProject(UpdateDevopsProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevopsProjectWithOptions(request, runtime);
    }

    public UpdateDevopsProjectSprintResponse updateDevopsProjectSprintWithOptions(UpdateDevopsProjectSprintRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevopsProjectSprint", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDevopsProjectSprintResponse());
    }

    public UpdateDevopsProjectSprintResponse updateDevopsProjectSprint(UpdateDevopsProjectSprintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevopsProjectSprintWithOptions(request, runtime);
    }

    public UpdateDevopsProjectTaskResponse updateDevopsProjectTaskWithOptions(UpdateDevopsProjectTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevopsProjectTask", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDevopsProjectTaskResponse());
    }

    public UpdateDevopsProjectTaskResponse updateDevopsProjectTask(UpdateDevopsProjectTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevopsProjectTaskWithOptions(request, runtime);
    }

    public UpdatePipelineMemberResponse updatePipelineMemberWithOptions(UpdatePipelineMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePipelineMember", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePipelineMemberResponse());
    }

    public UpdatePipelineMemberResponse updatePipelineMember(UpdatePipelineMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePipelineMemberWithOptions(request, runtime);
    }

    public UpdateTaskDetailResponse updateTaskDetailWithOptions(UpdateTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTaskDetail", "2020-03-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTaskDetailResponse());
    }

    public UpdateTaskDetailResponse updateTaskDetail(UpdateTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTaskDetailWithOptions(request, runtime);
    }
}
