// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408;

import com.aliyun.tea.*;
import com.aliyun.emr20160408.models.*;
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
            new TeaPair("cn-beijing", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "emr.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "emr.aliyuncs.com"),
            new TeaPair("us-west-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "emr.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddClusterServiceResponse addClusterServiceWithOptions(AddClusterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddClusterService", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new AddClusterServiceResponse());
    }

    public AddClusterServiceResponse addClusterService(AddClusterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClusterServiceWithOptions(request, runtime);
    }

    public AddScalingConfigItemV2Response addScalingConfigItemV2WithOptions(AddScalingConfigItemV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddScalingConfigItemV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new AddScalingConfigItemV2Response());
    }

    public AddScalingConfigItemV2Response addScalingConfigItemV2(AddScalingConfigItemV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addScalingConfigItemV2WithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AuthorizeSecurityGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOrder", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public CleanupFlowEntitySnapshotResponse cleanupFlowEntitySnapshotWithOptions(CleanupFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CleanupFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CleanupFlowEntitySnapshotResponse());
    }

    public CleanupFlowEntitySnapshotResponse cleanupFlowEntitySnapshot(CleanupFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cleanupFlowEntitySnapshotWithOptions(request, runtime);
    }

    public CloneFlowResponse cloneFlowWithOptions(CloneFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CloneFlowResponse());
    }

    public CloneFlowResponse cloneFlow(CloneFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowWithOptions(request, runtime);
    }

    public CloneFlowJobResponse cloneFlowJobWithOptions(CloneFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CloneFlowJobResponse());
    }

    public CloneFlowJobResponse cloneFlowJob(CloneFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowJobWithOptions(request, runtime);
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshotWithOptions(CommitFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommitFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CommitFlowEntitySnapshotResponse());
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshot(CommitFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitFlowEntitySnapshotWithOptions(request, runtime);
    }

    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPlanResponse());
    }

    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    public CreateClusterBootstrapActionResponse createClusterBootstrapActionWithOptions(CreateClusterBootstrapActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterBootstrapAction", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterBootstrapActionResponse());
    }

    public CreateClusterBootstrapActionResponse createClusterBootstrapAction(CreateClusterBootstrapActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterBootstrapActionWithOptions(request, runtime);
    }

    public CreateClusterTemplateResponse createClusterTemplateWithOptions(CreateClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterTemplate", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterTemplateResponse());
    }

    public CreateClusterTemplateResponse createClusterTemplate(CreateClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterTemplateWithOptions(request, runtime);
    }

    public CreateClusterV2Response createClusterV2WithOptions(CreateClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterV2Response());
    }

    public CreateClusterV2Response createClusterV2(CreateClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterV2WithOptions(request, runtime);
    }

    public CreateClusterWithTemplateResponse createClusterWithTemplateWithOptions(CreateClusterWithTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterWithTemplate", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterWithTemplateResponse());
    }

    public CreateClusterWithTemplateResponse createClusterWithTemplate(CreateClusterWithTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithTemplateWithOptions(request, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataSource", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataSourceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    public CreateExecutionPlanResponse createExecutionPlanWithOptions(CreateExecutionPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExecutionPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExecutionPlanResponse());
    }

    public CreateExecutionPlanResponse createExecutionPlan(CreateExecutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExecutionPlanWithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public CreateFlowCategoryResponse createFlowCategoryWithOptions(CreateFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowCategory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowCategoryResponse());
    }

    public CreateFlowCategoryResponse createFlowCategory(CreateFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowCategoryWithOptions(request, runtime);
    }

    public CreateFlowEditLockResponse createFlowEditLockWithOptions(CreateFlowEditLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowEditLock", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowEditLockResponse());
    }

    public CreateFlowEditLockResponse createFlowEditLock(CreateFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowEditLockWithOptions(request, runtime);
    }

    public CreateFlowForWebResponse createFlowForWebWithOptions(CreateFlowForWebRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowForWeb", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowForWebResponse());
    }

    public CreateFlowForWebResponse createFlowForWeb(CreateFlowForWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowForWebWithOptions(request, runtime);
    }

    public CreateFlowJobResponse createFlowJobWithOptions(CreateFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowJobResponse());
    }

    public CreateFlowJobResponse createFlowJob(CreateFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowJobWithOptions(request, runtime);
    }

    public CreateFlowProjectResponse createFlowProjectWithOptions(CreateFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProject", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectResponse());
    }

    public CreateFlowProjectResponse createFlowProject(CreateFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectWithOptions(request, runtime);
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSettingWithOptions(CreateFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProjectClusterSetting", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectClusterSettingResponse());
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSetting(CreateFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public CreateFlowProjectUserResponse createFlowProjectUserWithOptions(CreateFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProjectUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectUserResponse());
    }

    public CreateFlowProjectUserResponse createFlowProjectUser(CreateFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectUserWithOptions(request, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateJobResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    public CreateLibraryResponse createLibraryWithOptions(CreateLibraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLibrary", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLibraryResponse());
    }

    public CreateLibraryResponse createLibrary(CreateLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLibraryWithOptions(request, runtime);
    }

    public CreateMetaTablePreviewTaskResponse createMetaTablePreviewTaskWithOptions(CreateMetaTablePreviewTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMetaTablePreviewTask", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMetaTablePreviewTaskResponse());
    }

    public CreateMetaTablePreviewTaskResponse createMetaTablePreviewTask(CreateMetaTablePreviewTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMetaTablePreviewTaskWithOptions(request, runtime);
    }

    public CreateNoteResponse createNoteWithOptions(CreateNoteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNote", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNoteResponse());
    }

    public CreateNoteResponse createNote(CreateNoteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNoteWithOptions(request, runtime);
    }

    public CreateParagraphResponse createParagraphWithOptions(CreateParagraphRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateParagraph", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateParagraphResponse());
    }

    public CreateParagraphResponse createParagraph(CreateParagraphRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createParagraphWithOptions(request, runtime);
    }

    public CreateResourcePoolResponse createResourcePoolWithOptions(CreateResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourcePool", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourcePoolResponse());
    }

    public CreateResourcePoolResponse createResourcePool(CreateResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourcePoolWithOptions(request, runtime);
    }

    public CreateResourceQueueResponse createResourceQueueWithOptions(CreateResourceQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourceQueue", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceQueueResponse());
    }

    public CreateResourceQueueResponse createResourceQueue(CreateResourceQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceQueueWithOptions(request, runtime);
    }

    public CreateScalingGroupV2Response createScalingGroupV2WithOptions(CreateScalingGroupV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingGroupV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingGroupV2Response());
    }

    public CreateScalingGroupV2Response createScalingGroupV2(CreateScalingGroupV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingGroupV2WithOptions(request, runtime);
    }

    public CreateScalingRuleResponse createScalingRuleWithOptions(CreateScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingRule", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingRuleResponse());
    }

    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingRuleWithOptions(request, runtime);
    }

    public CreateTagResponse createTagWithOptions(CreateTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTag", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTagResponse());
    }

    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateUsersResponse createUsersWithOptions(CreateUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUsers", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUsersResponse());
    }

    public CreateUsersResponse createUsers(CreateUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUsersWithOptions(request, runtime);
    }

    public DecommissionHostComponentResponse decommissionHostComponentWithOptions(DecommissionHostComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DecommissionHostComponent", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DecommissionHostComponentResponse());
    }

    public DecommissionHostComponentResponse decommissionHostComponent(DecommissionHostComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.decommissionHostComponentWithOptions(request, runtime);
    }

    public DeleteClusterTemplateResponse deleteClusterTemplateWithOptions(DeleteClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteClusterTemplate", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterTemplateResponse());
    }

    public DeleteClusterTemplateResponse deleteClusterTemplate(DeleteClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterTemplateWithOptions(request, runtime);
    }

    public DeleteExecutionPlanResponse deleteExecutionPlanWithOptions(DeleteExecutionPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExecutionPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExecutionPlanResponse());
    }

    public DeleteExecutionPlanResponse deleteExecutionPlan(DeleteExecutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExecutionPlanWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DeleteFlowCategoryResponse deleteFlowCategoryWithOptions(DeleteFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowCategory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowCategoryResponse());
    }

    public DeleteFlowCategoryResponse deleteFlowCategory(DeleteFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowCategoryWithOptions(request, runtime);
    }

    public DeleteFlowEditLockResponse deleteFlowEditLockWithOptions(DeleteFlowEditLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowEditLock", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowEditLockResponse());
    }

    public DeleteFlowEditLockResponse deleteFlowEditLock(DeleteFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowEditLockWithOptions(request, runtime);
    }

    public DeleteFlowJobResponse deleteFlowJobWithOptions(DeleteFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowJobResponse());
    }

    public DeleteFlowJobResponse deleteFlowJob(DeleteFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowJobWithOptions(request, runtime);
    }

    public DeleteFlowProjectResponse deleteFlowProjectWithOptions(DeleteFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProject", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectResponse());
    }

    public DeleteFlowProjectResponse deleteFlowProject(DeleteFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectWithOptions(request, runtime);
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSettingWithOptions(DeleteFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProjectClusterSetting", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectClusterSettingResponse());
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSetting(DeleteFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUserWithOptions(DeleteFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProjectUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectUserResponse());
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUser(DeleteFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectUserWithOptions(request, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteJobResponse());
    }

    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobWithOptions(request, runtime);
    }

    public DeleteLibrariesResponse deleteLibrariesWithOptions(DeleteLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLibraries", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLibrariesResponse());
    }

    public DeleteLibrariesResponse deleteLibraries(DeleteLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLibrariesWithOptions(request, runtime);
    }

    public DeleteNoteResponse deleteNoteWithOptions(DeleteNoteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNote", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNoteResponse());
    }

    public DeleteNoteResponse deleteNote(DeleteNoteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNoteWithOptions(request, runtime);
    }

    public DeleteResourcePoolResponse deleteResourcePoolWithOptions(DeleteResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteResourcePool", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteResourcePoolResponse());
    }

    public DeleteResourcePoolResponse deleteResourcePool(DeleteResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourcePoolWithOptions(request, runtime);
    }

    public DeleteResourceQueueResponse deleteResourceQueueWithOptions(DeleteResourceQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteResourceQueue", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteResourceQueueResponse());
    }

    public DeleteResourceQueueResponse deleteResourceQueue(DeleteResourceQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceQueueWithOptions(request, runtime);
    }

    public DeleteScalingRuleResponse deleteScalingRuleWithOptions(DeleteScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScalingRule", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScalingRuleResponse());
    }

    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScalingRuleWithOptions(request, runtime);
    }

    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTag", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagResponse());
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DescribeClusterBasicInfoResponse describeClusterBasicInfoWithOptions(DescribeClusterBasicInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterBasicInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterBasicInfoResponse());
    }

    public DescribeClusterBasicInfoResponse describeClusterBasicInfo(DescribeClusterBasicInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterBasicInfoWithOptions(request, runtime);
    }

    public DescribeClusterMetaCollectResponse describeClusterMetaCollectWithOptions(DescribeClusterMetaCollectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterMetaCollect", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterMetaCollectResponse());
    }

    public DescribeClusterMetaCollectResponse describeClusterMetaCollect(DescribeClusterMetaCollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterMetaCollectWithOptions(request, runtime);
    }

    public DescribeClusterOperationHostTaskLogResponse describeClusterOperationHostTaskLogWithOptions(DescribeClusterOperationHostTaskLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterOperationHostTaskLog", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterOperationHostTaskLogResponse());
    }

    public DescribeClusterOperationHostTaskLogResponse describeClusterOperationHostTaskLog(DescribeClusterOperationHostTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterOperationHostTaskLogWithOptions(request, runtime);
    }

    public DescribeClusterResourcePoolSchedulerTypeResponse describeClusterResourcePoolSchedulerTypeWithOptions(DescribeClusterResourcePoolSchedulerTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterResourcePoolSchedulerType", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterResourcePoolSchedulerTypeResponse());
    }

    public DescribeClusterResourcePoolSchedulerTypeResponse describeClusterResourcePoolSchedulerType(DescribeClusterResourcePoolSchedulerTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterResourcePoolSchedulerTypeWithOptions(request, runtime);
    }

    public DescribeClusterServiceResponse describeClusterServiceWithOptions(DescribeClusterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterService", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceResponse());
    }

    public DescribeClusterServiceResponse describeClusterService(DescribeClusterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceWithOptions(request, runtime);
    }

    public DescribeClusterServiceConfigResponse describeClusterServiceConfigWithOptions(DescribeClusterServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterServiceConfig", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceConfigResponse());
    }

    public DescribeClusterServiceConfigResponse describeClusterServiceConfig(DescribeClusterServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceConfigWithOptions(request, runtime);
    }

    public DescribeClusterServiceConfigHistoryResponse describeClusterServiceConfigHistoryWithOptions(DescribeClusterServiceConfigHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterServiceConfigHistory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceConfigHistoryResponse());
    }

    public DescribeClusterServiceConfigHistoryResponse describeClusterServiceConfigHistory(DescribeClusterServiceConfigHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceConfigHistoryWithOptions(request, runtime);
    }

    public DescribeClusterServiceConfigTagResponse describeClusterServiceConfigTagWithOptions(DescribeClusterServiceConfigTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterServiceConfigTag", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceConfigTagResponse());
    }

    public DescribeClusterServiceConfigTagResponse describeClusterServiceConfigTag(DescribeClusterServiceConfigTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceConfigTagWithOptions(request, runtime);
    }

    public DescribeClusterTemplateResponse describeClusterTemplateWithOptions(DescribeClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterTemplate", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterTemplateResponse());
    }

    public DescribeClusterTemplateResponse describeClusterTemplate(DescribeClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterTemplateWithOptions(request, runtime);
    }

    public DescribeClusterV2Response describeClusterV2WithOptions(DescribeClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterV2Response());
    }

    public DescribeClusterV2Response describeClusterV2(DescribeClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterV2WithOptions(request, runtime);
    }

    public DescribeDataSourceResponse describeDataSourceWithOptions(DescribeDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataSource", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataSourceResponse());
    }

    public DescribeDataSourceResponse describeDataSource(DescribeDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataSourceWithOptions(request, runtime);
    }

    public DescribeExecutionPlanResponse describeExecutionPlanWithOptions(DescribeExecutionPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExecutionPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExecutionPlanResponse());
    }

    public DescribeExecutionPlanResponse describeExecutionPlan(DescribeExecutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExecutionPlanWithOptions(request, runtime);
    }

    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowResponse());
    }

    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    public DescribeFlowAgentTokenResponse describeFlowAgentTokenWithOptions(DescribeFlowAgentTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowAgentToken", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowAgentTokenResponse());
    }

    public DescribeFlowAgentTokenResponse describeFlowAgentToken(DescribeFlowAgentTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowAgentTokenWithOptions(request, runtime);
    }

    public DescribeFlowAgentUserResponse describeFlowAgentUserWithOptions(DescribeFlowAgentUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowAgentUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowAgentUserResponse());
    }

    public DescribeFlowAgentUserResponse describeFlowAgentUser(DescribeFlowAgentUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowAgentUserWithOptions(request, runtime);
    }

    public DescribeFlowCategoryResponse describeFlowCategoryWithOptions(DescribeFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowCategory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowCategoryResponse());
    }

    public DescribeFlowCategoryResponse describeFlowCategory(DescribeFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowCategoryWithOptions(request, runtime);
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTreeWithOptions(DescribeFlowCategoryTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowCategoryTree", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowCategoryTreeResponse());
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTree(DescribeFlowCategoryTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowCategoryTreeWithOptions(request, runtime);
    }

    public DescribeFlowEntitySnapshotResponse describeFlowEntitySnapshotWithOptions(DescribeFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowEntitySnapshotResponse());
    }

    public DescribeFlowEntitySnapshotResponse describeFlowEntitySnapshot(DescribeFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowEntitySnapshotWithOptions(request, runtime);
    }

    public DescribeFlowInstanceResponse describeFlowInstanceWithOptions(DescribeFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowInstance", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowInstanceResponse());
    }

    public DescribeFlowInstanceResponse describeFlowInstance(DescribeFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowInstanceWithOptions(request, runtime);
    }

    public DescribeFlowJobResponse describeFlowJobWithOptions(DescribeFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowJobResponse());
    }

    public DescribeFlowJobResponse describeFlowJob(DescribeFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowJobWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstanceWithOptions(DescribeFlowNodeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstance", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceResponse());
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstance(DescribeFlowNodeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLogWithOptions(DescribeFlowNodeInstanceContainerLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstanceContainerLog", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceContainerLogResponse());
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLog(DescribeFlowNodeInstanceContainerLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceContainerLogWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLogWithOptions(DescribeFlowNodeInstanceLauncherLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstanceLauncherLog", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceLauncherLogResponse());
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLog(DescribeFlowNodeInstanceLauncherLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceLauncherLogWithOptions(request, runtime);
    }

    public DescribeFlowProjectResponse describeFlowProjectWithOptions(DescribeFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowProject", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowProjectResponse());
    }

    public DescribeFlowProjectResponse describeFlowProject(DescribeFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectWithOptions(request, runtime);
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSettingWithOptions(DescribeFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowProjectClusterSetting", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowProjectClusterSettingResponse());
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSetting(DescribeFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DescribeJobResponse describeJobWithOptions(DescribeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeJobResponse());
    }

    public DescribeJobResponse describeJob(DescribeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobWithOptions(request, runtime);
    }

    public DescribeLibraryDetailResponse describeLibraryDetailWithOptions(DescribeLibraryDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLibraryDetail", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLibraryDetailResponse());
    }

    public DescribeLibraryDetailResponse describeLibraryDetail(DescribeLibraryDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLibraryDetailWithOptions(request, runtime);
    }

    public DescribeLibraryInstallTaskDetailResponse describeLibraryInstallTaskDetailWithOptions(DescribeLibraryInstallTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLibraryInstallTaskDetail", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLibraryInstallTaskDetailResponse());
    }

    public DescribeLibraryInstallTaskDetailResponse describeLibraryInstallTaskDetail(DescribeLibraryInstallTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLibraryInstallTaskDetailWithOptions(request, runtime);
    }

    public DescribeMetaTablePreviewTaskResponse describeMetaTablePreviewTaskWithOptions(DescribeMetaTablePreviewTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetaTablePreviewTask", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetaTablePreviewTaskResponse());
    }

    public DescribeMetaTablePreviewTaskResponse describeMetaTablePreviewTask(DescribeMetaTablePreviewTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetaTablePreviewTaskWithOptions(request, runtime);
    }

    public DescribeScalingActivityResponse describeScalingActivityWithOptions(DescribeScalingActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingActivity", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingActivityResponse());
    }

    public DescribeScalingActivityResponse describeScalingActivity(DescribeScalingActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingActivityWithOptions(request, runtime);
    }

    public DescribeScalingCommonConfigResponse describeScalingCommonConfigWithOptions(DescribeScalingCommonConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingCommonConfig", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingCommonConfigResponse());
    }

    public DescribeScalingCommonConfigResponse describeScalingCommonConfig(DescribeScalingCommonConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingCommonConfigWithOptions(request, runtime);
    }

    public DescribeScalingConfigItemV2Response describeScalingConfigItemV2WithOptions(DescribeScalingConfigItemV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingConfigItemV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingConfigItemV2Response());
    }

    public DescribeScalingConfigItemV2Response describeScalingConfigItemV2(DescribeScalingConfigItemV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingConfigItemV2WithOptions(request, runtime);
    }

    public DescribeScalingGroupInstanceV2Response describeScalingGroupInstanceV2WithOptions(DescribeScalingGroupInstanceV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingGroupInstanceV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingGroupInstanceV2Response());
    }

    public DescribeScalingGroupInstanceV2Response describeScalingGroupInstanceV2(DescribeScalingGroupInstanceV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingGroupInstanceV2WithOptions(request, runtime);
    }

    public DescribeScalingGroupV2Response describeScalingGroupV2WithOptions(DescribeScalingGroupV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingGroupV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingGroupV2Response());
    }

    public DescribeScalingGroupV2Response describeScalingGroupV2(DescribeScalingGroupV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingGroupV2WithOptions(request, runtime);
    }

    public DescribeScalingRuleResponse describeScalingRuleWithOptions(DescribeScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingRule", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingRuleResponse());
    }

    public DescribeScalingRuleResponse describeScalingRule(DescribeScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingRuleWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupAttribute", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DetachAndReleaseClusterEniResponse detachAndReleaseClusterEniWithOptions(DetachAndReleaseClusterEniRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachAndReleaseClusterEni", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DetachAndReleaseClusterEniResponse());
    }

    public DetachAndReleaseClusterEniResponse detachAndReleaseClusterEni(DetachAndReleaseClusterEniRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachAndReleaseClusterEniWithOptions(request, runtime);
    }

    public DiffFlowEntitySnapshotResponse diffFlowEntitySnapshotWithOptions(DiffFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DiffFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DiffFlowEntitySnapshotResponse());
    }

    public DiffFlowEntitySnapshotResponse diffFlowEntitySnapshot(DiffFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.diffFlowEntitySnapshotWithOptions(request, runtime);
    }

    public DumpMetaDataSourceForOuterResponse dumpMetaDataSourceForOuterWithOptions(DumpMetaDataSourceForOuterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DumpMetaDataSourceForOuter", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new DumpMetaDataSourceForOuterResponse());
    }

    public DumpMetaDataSourceForOuterResponse dumpMetaDataSourceForOuter(DumpMetaDataSourceForOuterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dumpMetaDataSourceForOuterWithOptions(request, runtime);
    }

    public GetFlowEntityRelationGraphResponse getFlowEntityRelationGraphWithOptions(GetFlowEntityRelationGraphRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFlowEntityRelationGraph", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetFlowEntityRelationGraphResponse());
    }

    public GetFlowEntityRelationGraphResponse getFlowEntityRelationGraph(GetFlowEntityRelationGraphRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFlowEntityRelationGraphWithOptions(request, runtime);
    }

    public GetHdfsCapacityStatisticInfoResponse getHdfsCapacityStatisticInfoWithOptions(GetHdfsCapacityStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHdfsCapacityStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetHdfsCapacityStatisticInfoResponse());
    }

    public GetHdfsCapacityStatisticInfoResponse getHdfsCapacityStatisticInfo(GetHdfsCapacityStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHdfsCapacityStatisticInfoWithOptions(request, runtime);
    }

    public GetJobInputStatisticInfoResponse getJobInputStatisticInfoWithOptions(GetJobInputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobInputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobInputStatisticInfoResponse());
    }

    public GetJobInputStatisticInfoResponse getJobInputStatisticInfo(GetJobInputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobInputStatisticInfoWithOptions(request, runtime);
    }

    public GetJobOutputStatisticInfoResponse getJobOutputStatisticInfoWithOptions(GetJobOutputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobOutputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobOutputStatisticInfoResponse());
    }

    public GetJobOutputStatisticInfoResponse getJobOutputStatisticInfo(GetJobOutputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobOutputStatisticInfoWithOptions(request, runtime);
    }

    public GetJobRunningTimeStatisticInfoResponse getJobRunningTimeStatisticInfoWithOptions(GetJobRunningTimeStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJobRunningTimeStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetJobRunningTimeStatisticInfoResponse());
    }

    public GetJobRunningTimeStatisticInfoResponse getJobRunningTimeStatisticInfo(GetJobRunningTimeStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJobRunningTimeStatisticInfoWithOptions(request, runtime);
    }

    public GetQueueInputStatisticInfoResponse getQueueInputStatisticInfoWithOptions(GetQueueInputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQueueInputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetQueueInputStatisticInfoResponse());
    }

    public GetQueueInputStatisticInfoResponse getQueueInputStatisticInfo(GetQueueInputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQueueInputStatisticInfoWithOptions(request, runtime);
    }

    public GetQueueOutputStatisticInfoResponse getQueueOutputStatisticInfoWithOptions(GetQueueOutputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQueueOutputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetQueueOutputStatisticInfoResponse());
    }

    public GetQueueOutputStatisticInfoResponse getQueueOutputStatisticInfo(GetQueueOutputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQueueOutputStatisticInfoWithOptions(request, runtime);
    }

    public GetQueueSubmissionStatisticInfoResponse getQueueSubmissionStatisticInfoWithOptions(GetQueueSubmissionStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQueueSubmissionStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetQueueSubmissionStatisticInfoResponse());
    }

    public GetQueueSubmissionStatisticInfoResponse getQueueSubmissionStatisticInfo(GetQueueSubmissionStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQueueSubmissionStatisticInfoWithOptions(request, runtime);
    }

    public GetUserInputStatisticInfoResponse getUserInputStatisticInfoWithOptions(GetUserInputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserInputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserInputStatisticInfoResponse());
    }

    public GetUserInputStatisticInfoResponse getUserInputStatisticInfo(GetUserInputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserInputStatisticInfoWithOptions(request, runtime);
    }

    public GetUserOutputStatisticInfoResponse getUserOutputStatisticInfoWithOptions(GetUserOutputStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserOutputStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserOutputStatisticInfoResponse());
    }

    public GetUserOutputStatisticInfoResponse getUserOutputStatisticInfo(GetUserOutputStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserOutputStatisticInfoWithOptions(request, runtime);
    }

    public GetUserSubmissionStatisticInfoResponse getUserSubmissionStatisticInfoWithOptions(GetUserSubmissionStatisticInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserSubmissionStatisticInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserSubmissionStatisticInfoResponse());
    }

    public GetUserSubmissionStatisticInfoResponse getUserSubmissionStatisticInfo(GetUserSubmissionStatisticInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserSubmissionStatisticInfoWithOptions(request, runtime);
    }

    public InstallLibrariesResponse installLibrariesWithOptions(InstallLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallLibraries", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new InstallLibrariesResponse());
    }

    public InstallLibrariesResponse installLibraries(InstallLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installLibrariesWithOptions(request, runtime);
    }

    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinResourceGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new JoinResourceGroupResponse());
    }

    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    public KillExecutionJobInstanceResponse killExecutionJobInstanceWithOptions(KillExecutionJobInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillExecutionJobInstance", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new KillExecutionJobInstanceResponse());
    }

    public KillExecutionJobInstanceResponse killExecutionJobInstance(KillExecutionJobInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killExecutionJobInstanceWithOptions(request, runtime);
    }

    public KillFlowJobResponse killFlowJobWithOptions(KillFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new KillFlowJobResponse());
    }

    public KillFlowJobResponse killFlowJob(KillFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killFlowJobWithOptions(request, runtime);
    }

    public ListAdviceActionResponse listAdviceActionWithOptions(ListAdviceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAdviceAction", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListAdviceActionResponse());
    }

    public ListAdviceActionResponse listAdviceAction(ListAdviceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAdviceActionWithOptions(request, runtime);
    }

    public ListApmApplicationResponse listApmApplicationWithOptions(ListApmApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApmApplication", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListApmApplicationResponse());
    }

    public ListApmApplicationResponse listApmApplication(ListApmApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApmApplicationWithOptions(request, runtime);
    }

    public ListBackupsResponse listBackupsWithOptions(ListBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBackups", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListBackupsResponse());
    }

    public ListBackupsResponse listBackups(ListBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBackupsWithOptions(request, runtime);
    }

    public ListClusterHostResponse listClusterHostWithOptions(ListClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterHost", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterHostResponse());
    }

    public ListClusterHostResponse listClusterHost(ListClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterHostWithOptions(request, runtime);
    }

    public ListClusterHostComponentResponse listClusterHostComponentWithOptions(ListClusterHostComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterHostComponent", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterHostComponentResponse());
    }

    public ListClusterHostComponentResponse listClusterHostComponent(ListClusterHostComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterHostComponentWithOptions(request, runtime);
    }

    public ListClusterHostGroupResponse listClusterHostGroupWithOptions(ListClusterHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterHostGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterHostGroupResponse());
    }

    public ListClusterHostGroupResponse listClusterHostGroup(ListClusterHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterHostGroupWithOptions(request, runtime);
    }

    public ListClusterInstalledServiceResponse listClusterInstalledServiceWithOptions(ListClusterInstalledServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterInstalledService", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterInstalledServiceResponse());
    }

    public ListClusterInstalledServiceResponse listClusterInstalledService(ListClusterInstalledServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterInstalledServiceWithOptions(request, runtime);
    }

    public ListClusterOperationResponse listClusterOperationWithOptions(ListClusterOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperation", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationResponse());
    }

    public ListClusterOperationResponse listClusterOperation(ListClusterOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationWithOptions(request, runtime);
    }

    public ListClusterOperationHostResponse listClusterOperationHostWithOptions(ListClusterOperationHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperationHost", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationHostResponse());
    }

    public ListClusterOperationHostResponse listClusterOperationHost(ListClusterOperationHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationHostWithOptions(request, runtime);
    }

    public ListClusterOperationHostTaskResponse listClusterOperationHostTaskWithOptions(ListClusterOperationHostTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperationHostTask", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationHostTaskResponse());
    }

    public ListClusterOperationHostTaskResponse listClusterOperationHostTask(ListClusterOperationHostTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationHostTaskWithOptions(request, runtime);
    }

    public ListClusterOperationTaskResponse listClusterOperationTaskWithOptions(ListClusterOperationTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperationTask", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationTaskResponse());
    }

    public ListClusterOperationTaskResponse listClusterOperationTask(ListClusterOperationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationTaskWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusters", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListClusterServiceResponse listClusterServiceWithOptions(ListClusterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterService", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceResponse());
    }

    public ListClusterServiceResponse listClusterService(ListClusterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceWithOptions(request, runtime);
    }

    public ListClusterServiceComponentResponse listClusterServiceComponentWithOptions(ListClusterServiceComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterServiceComponent", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceComponentResponse());
    }

    public ListClusterServiceComponentResponse listClusterServiceComponent(ListClusterServiceComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceComponentWithOptions(request, runtime);
    }

    public ListClusterServiceComponentHealthInfoResponse listClusterServiceComponentHealthInfoWithOptions(ListClusterServiceComponentHealthInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterServiceComponentHealthInfo", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceComponentHealthInfoResponse());
    }

    public ListClusterServiceComponentHealthInfoResponse listClusterServiceComponentHealthInfo(ListClusterServiceComponentHealthInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceComponentHealthInfoWithOptions(request, runtime);
    }

    public ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistoryWithOptions(ListClusterServiceConfigHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterServiceConfigHistory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceConfigHistoryResponse());
    }

    public ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceConfigHistoryWithOptions(request, runtime);
    }

    public ListClusterServiceQuickLinkResponse listClusterServiceQuickLinkWithOptions(ListClusterServiceQuickLinkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterServiceQuickLink", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceQuickLinkResponse());
    }

    public ListClusterServiceQuickLinkResponse listClusterServiceQuickLink(ListClusterServiceQuickLinkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceQuickLinkWithOptions(request, runtime);
    }

    public ListClusterTemplatesResponse listClusterTemplatesWithOptions(ListClusterTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterTemplates", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterTemplatesResponse());
    }

    public ListClusterTemplatesResponse listClusterTemplates(ListClusterTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTemplatesWithOptions(request, runtime);
    }

    public ListDataSourceResponse listDataSourceWithOptions(ListDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataSource", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListDataSourceResponse());
    }

    public ListDataSourceResponse listDataSource(ListDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataSourceWithOptions(request, runtime);
    }

    public ListEmrAvailableConfigResponse listEmrAvailableConfigWithOptions(ListEmrAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEmrAvailableConfig", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListEmrAvailableConfigResponse());
    }

    public ListEmrAvailableConfigResponse listEmrAvailableConfig(ListEmrAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmrAvailableConfigWithOptions(request, runtime);
    }

    public ListEmrAvailableResourceResponse listEmrAvailableResourceWithOptions(ListEmrAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEmrAvailableResource", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListEmrAvailableResourceResponse());
    }

    public ListEmrAvailableResourceResponse listEmrAvailableResource(ListEmrAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmrAvailableResourceWithOptions(request, runtime);
    }

    public ListEmrMainVersionResponse listEmrMainVersionWithOptions(ListEmrMainVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEmrMainVersion", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListEmrMainVersionResponse());
    }

    public ListEmrMainVersionResponse listEmrMainVersion(ListEmrMainVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEmrMainVersionWithOptions(request, runtime);
    }

    public ListExecutionPlanInstancesResponse listExecutionPlanInstancesWithOptions(ListExecutionPlanInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutionPlanInstances", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListExecutionPlanInstancesResponse());
    }

    public ListExecutionPlanInstancesResponse listExecutionPlanInstances(ListExecutionPlanInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionPlanInstancesWithOptions(request, runtime);
    }

    public ListExecutionPlansResponse listExecutionPlansWithOptions(ListExecutionPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutionPlans", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListExecutionPlansResponse());
    }

    public ListExecutionPlansResponse listExecutionPlans(ListExecutionPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionPlansWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public ListFlowCategoryResponse listFlowCategoryWithOptions(ListFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowCategory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowCategoryResponse());
    }

    public ListFlowCategoryResponse listFlowCategory(ListFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowCategoryWithOptions(request, runtime);
    }

    public ListFlowClusterResponse listFlowClusterWithOptions(ListFlowClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowCluster", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterResponse());
    }

    public ListFlowClusterResponse listFlowCluster(ListFlowClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterWithOptions(request, runtime);
    }

    public ListFlowClusterAllResponse listFlowClusterAllWithOptions(ListFlowClusterAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterAll", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterAllResponse());
    }

    public ListFlowClusterAllResponse listFlowClusterAll(ListFlowClusterAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllWithOptions(request, runtime);
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHostsWithOptions(ListFlowClusterAllHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterAllHosts", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterAllHostsResponse());
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHosts(ListFlowClusterAllHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllHostsWithOptions(request, runtime);
    }

    public ListFlowClusterHostResponse listFlowClusterHostWithOptions(ListFlowClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterHost", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterHostResponse());
    }

    public ListFlowClusterHostResponse listFlowClusterHost(ListFlowClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterHostWithOptions(request, runtime);
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshotWithOptions(ListFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowEntitySnapshotResponse());
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshot(ListFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowEntitySnapshotWithOptions(request, runtime);
    }

    public ListFlowInstanceResponse listFlowInstanceWithOptions(ListFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowInstance", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowInstanceResponse());
    }

    public ListFlowInstanceResponse listFlowInstance(ListFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowInstanceWithOptions(request, runtime);
    }

    public ListFlowJobResponse listFlowJobWithOptions(ListFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowJobResponse());
    }

    public ListFlowJobResponse listFlowJob(ListFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobWithOptions(request, runtime);
    }

    public ListFlowJobHistoryResponse listFlowJobHistoryWithOptions(ListFlowJobHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowJobHistory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowJobHistoryResponse());
    }

    public ListFlowJobHistoryResponse listFlowJobHistory(ListFlowJobHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobHistoryWithOptions(request, runtime);
    }

    public ListFlowNodeInstanceResponse listFlowNodeInstanceWithOptions(ListFlowNodeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowNodeInstance", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowNodeInstanceResponse());
    }

    public ListFlowNodeInstanceResponse listFlowNodeInstance(ListFlowNodeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeInstanceWithOptions(request, runtime);
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatusWithOptions(ListFlowNodeInstanceContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowNodeInstanceContainerStatus", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowNodeInstanceContainerStatusResponse());
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatus(ListFlowNodeInstanceContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeInstanceContainerStatusWithOptions(request, runtime);
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResultWithOptions(ListFlowNodeSqlResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowNodeSqlResult", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowNodeSqlResultResponse());
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResult(ListFlowNodeSqlResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeSqlResultWithOptions(request, runtime);
    }

    public ListFlowProjectResponse listFlowProjectWithOptions(ListFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProject", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectResponse());
    }

    public ListFlowProjectResponse listFlowProject(ListFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectWithOptions(request, runtime);
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSettingWithOptions(ListFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProjectClusterSetting", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectClusterSettingResponse());
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSetting(ListFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ListFlowProjectUserResponse listFlowProjectUserWithOptions(ListFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProjectUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectUserResponse());
    }

    public ListFlowProjectUserResponse listFlowProjectUser(ListFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectUserWithOptions(request, runtime);
    }

    public ListJobExecutionInstancesResponse listJobExecutionInstancesWithOptions(ListJobExecutionInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobExecutionInstances", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobExecutionInstancesResponse());
    }

    public ListJobExecutionInstancesResponse listJobExecutionInstances(ListJobExecutionInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobExecutionInstancesWithOptions(request, runtime);
    }

    public ListJobInstanceWorkersResponse listJobInstanceWorkersWithOptions(ListJobInstanceWorkersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobInstanceWorkers", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobInstanceWorkersResponse());
    }

    public ListJobInstanceWorkersResponse listJobInstanceWorkers(ListJobInstanceWorkersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobInstanceWorkersWithOptions(request, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobs", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListJobsResponse());
    }

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    public ListLibrariesResponse listLibrariesWithOptions(ListLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLibraries", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListLibrariesResponse());
    }

    public ListLibrariesResponse listLibraries(ListLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLibrariesWithOptions(request, runtime);
    }

    public ListLibraryInstallTasksResponse listLibraryInstallTasksWithOptions(ListLibraryInstallTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLibraryInstallTasks", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListLibraryInstallTasksResponse());
    }

    public ListLibraryInstallTasksResponse listLibraryInstallTasks(ListLibraryInstallTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLibraryInstallTasksWithOptions(request, runtime);
    }

    public ListLibraryStatusResponse listLibraryStatusWithOptions(ListLibraryStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLibraryStatus", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListLibraryStatusResponse());
    }

    public ListLibraryStatusResponse listLibraryStatus(ListLibraryStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLibraryStatusWithOptions(request, runtime);
    }

    public ListMetaClusterResponse listMetaClusterWithOptions(ListMetaClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMetaCluster", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListMetaClusterResponse());
    }

    public ListMetaClusterResponse listMetaCluster(ListMetaClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMetaClusterWithOptions(request, runtime);
    }

    public ListMetaDataSourceClusterForOuterResponse listMetaDataSourceClusterForOuterWithOptions(ListMetaDataSourceClusterForOuterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMetaDataSourceClusterForOuter", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListMetaDataSourceClusterForOuterResponse());
    }

    public ListMetaDataSourceClusterForOuterResponse listMetaDataSourceClusterForOuter(ListMetaDataSourceClusterForOuterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMetaDataSourceClusterForOuterWithOptions(request, runtime);
    }

    public ListNotesResponse listNotesWithOptions(ListNotesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNotes", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListNotesResponse());
    }

    public ListNotesResponse listNotes(ListNotesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotesWithOptions(request, runtime);
    }

    public ListResourcePoolResponse listResourcePoolWithOptions(ListResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourcePool", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourcePoolResponse());
    }

    public ListResourcePoolResponse listResourcePool(ListResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourcePoolWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public ListScalingActivityV2Response listScalingActivityV2WithOptions(ListScalingActivityV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingActivityV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingActivityV2Response());
    }

    public ListScalingActivityV2Response listScalingActivityV2(ListScalingActivityV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingActivityV2WithOptions(request, runtime);
    }

    public ListScalingConfigItemV2Response listScalingConfigItemV2WithOptions(ListScalingConfigItemV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingConfigItemV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingConfigItemV2Response());
    }

    public ListScalingConfigItemV2Response listScalingConfigItemV2(ListScalingConfigItemV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingConfigItemV2WithOptions(request, runtime);
    }

    public ListScalingGroupV2Response listScalingGroupV2WithOptions(ListScalingGroupV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingGroupV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingGroupV2Response());
    }

    public ListScalingGroupV2Response listScalingGroupV2(ListScalingGroupV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingGroupV2WithOptions(request, runtime);
    }

    public ListSecurityGroupResponse listSecurityGroupWithOptions(ListSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecurityGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecurityGroupResponse());
    }

    public ListSecurityGroupResponse listSecurityGroup(ListSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityGroupWithOptions(request, runtime);
    }

    public ListStackResponse listStackWithOptions(ListStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListStack", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListStackResponse());
    }

    public ListStackResponse listStack(ListStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStackWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListVswitchResponse listVswitchWithOptions(ListVswitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVswitch", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListVswitchResponse());
    }

    public ListVswitchResponse listVswitch(ListVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVswitchWithOptions(request, runtime);
    }

    public ModifyClusterBootstrapActionResponse modifyClusterBootstrapActionWithOptions(ModifyClusterBootstrapActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterBootstrapAction", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterBootstrapActionResponse());
    }

    public ModifyClusterBootstrapActionResponse modifyClusterBootstrapAction(ModifyClusterBootstrapActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterBootstrapActionWithOptions(request, runtime);
    }

    public ModifyClusterHostGroupResponse modifyClusterHostGroupWithOptions(ModifyClusterHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterHostGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterHostGroupResponse());
    }

    public ModifyClusterHostGroupResponse modifyClusterHostGroup(ModifyClusterHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterHostGroupWithOptions(request, runtime);
    }

    public ModifyClusterMetaCollectResponse modifyClusterMetaCollectWithOptions(ModifyClusterMetaCollectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterMetaCollect", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterMetaCollectResponse());
    }

    public ModifyClusterMetaCollectResponse modifyClusterMetaCollect(ModifyClusterMetaCollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterMetaCollectWithOptions(request, runtime);
    }

    public ModifyClusterNameResponse modifyClusterNameWithOptions(ModifyClusterNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterName", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterNameResponse());
    }

    public ModifyClusterNameResponse modifyClusterName(ModifyClusterNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterNameWithOptions(request, runtime);
    }

    public ModifyClusterSecurityGroupRuleResponse modifyClusterSecurityGroupRuleWithOptions(ModifyClusterSecurityGroupRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterSecurityGroupRule", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterSecurityGroupRuleResponse());
    }

    public ModifyClusterSecurityGroupRuleResponse modifyClusterSecurityGroupRule(ModifyClusterSecurityGroupRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterSecurityGroupRuleWithOptions(request, runtime);
    }

    public ModifyClusterServiceConfigResponse modifyClusterServiceConfigWithOptions(ModifyClusterServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterServiceConfig", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterServiceConfigResponse());
    }

    public ModifyClusterServiceConfigResponse modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterServiceConfigWithOptions(request, runtime);
    }

    public ModifyClusterTemplateResponse modifyClusterTemplateWithOptions(ModifyClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterTemplate", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterTemplateResponse());
    }

    public ModifyClusterTemplateResponse modifyClusterTemplate(ModifyClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterTemplateWithOptions(request, runtime);
    }

    public ModifyExecutionPlanResponse modifyExecutionPlanWithOptions(ModifyExecutionPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyExecutionPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyExecutionPlanResponse());
    }

    public ModifyExecutionPlanResponse modifyExecutionPlan(ModifyExecutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyExecutionPlanWithOptions(request, runtime);
    }

    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowResponse());
    }

    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    public ModifyFlowCategoryResponse modifyFlowCategoryWithOptions(ModifyFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowCategory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowCategoryResponse());
    }

    public ModifyFlowCategoryResponse modifyFlowCategory(ModifyFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowCategoryWithOptions(request, runtime);
    }

    public ModifyFlowForWebResponse modifyFlowForWebWithOptions(ModifyFlowForWebRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowForWeb", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowForWebResponse());
    }

    public ModifyFlowForWebResponse modifyFlowForWeb(ModifyFlowForWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowForWebWithOptions(request, runtime);
    }

    public ModifyFlowJobResponse modifyFlowJobWithOptions(ModifyFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowJobResponse());
    }

    public ModifyFlowJobResponse modifyFlowJob(ModifyFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowJobWithOptions(request, runtime);
    }

    public ModifyFlowProjectResponse modifyFlowProjectWithOptions(ModifyFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowProject", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowProjectResponse());
    }

    public ModifyFlowProjectResponse modifyFlowProject(ModifyFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectWithOptions(request, runtime);
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSettingWithOptions(ModifyFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowProjectClusterSetting", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowProjectClusterSettingResponse());
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSetting(ModifyFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ModifyJobResponse modifyJobWithOptions(ModifyJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyJobResponse());
    }

    public ModifyJobResponse modifyJob(ModifyJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyJobWithOptions(request, runtime);
    }

    public ModifyResourcePoolResponse modifyResourcePoolWithOptions(ModifyResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyResourcePool", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyResourcePoolResponse());
    }

    public ModifyResourcePoolResponse modifyResourcePool(ModifyResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyResourcePoolWithOptions(request, runtime);
    }

    public ModifyResourcePoolSchedulerTypeResponse modifyResourcePoolSchedulerTypeWithOptions(ModifyResourcePoolSchedulerTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyResourcePoolSchedulerType", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyResourcePoolSchedulerTypeResponse());
    }

    public ModifyResourcePoolSchedulerTypeResponse modifyResourcePoolSchedulerType(ModifyResourcePoolSchedulerTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyResourcePoolSchedulerTypeWithOptions(request, runtime);
    }

    public ModifyResourceQueueResponse modifyResourceQueueWithOptions(ModifyResourceQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyResourceQueue", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyResourceQueueResponse());
    }

    public ModifyResourceQueueResponse modifyResourceQueue(ModifyResourceQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyResourceQueueWithOptions(request, runtime);
    }

    public ModifyScalingConfigItemV2Response modifyScalingConfigItemV2WithOptions(ModifyScalingConfigItemV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingConfigItemV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingConfigItemV2Response());
    }

    public ModifyScalingConfigItemV2Response modifyScalingConfigItemV2(ModifyScalingConfigItemV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingConfigItemV2WithOptions(request, runtime);
    }

    public ModifyScalingGroupV2Response modifyScalingGroupV2WithOptions(ModifyScalingGroupV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingGroupV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingGroupV2Response());
    }

    public ModifyScalingGroupV2Response modifyScalingGroupV2(ModifyScalingGroupV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingGroupV2WithOptions(request, runtime);
    }

    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingRule", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingRuleResponse());
    }

    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingRuleWithOptions(request, runtime);
    }

    public ModifyScalingTaskGroupResponse modifyScalingTaskGroupWithOptions(ModifyScalingTaskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingTaskGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingTaskGroupResponse());
    }

    public ModifyScalingTaskGroupResponse modifyScalingTaskGroup(ModifyScalingTaskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingTaskGroupWithOptions(request, runtime);
    }

    public QueryAlarmHistoryResponse queryAlarmHistoryWithOptions(QueryAlarmHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAlarmHistory", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAlarmHistoryResponse());
    }

    public QueryAlarmHistoryResponse queryAlarmHistory(QueryAlarmHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAlarmHistoryWithOptions(request, runtime);
    }

    public QueryEntityResponse queryEntityWithOptions(QueryEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEntity", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEntityResponse());
    }

    public QueryEntityResponse queryEntity(QueryEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEntityWithOptions(request, runtime);
    }

    public QueryTableDataResponse queryTableDataWithOptions(QueryTableDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTableData", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTableDataResponse());
    }

    public QueryTableDataResponse queryTableData(QueryTableDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTableDataWithOptions(request, runtime);
    }

    public QueryTagResponse queryTagWithOptions(QueryTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTag", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTagResponse());
    }

    public QueryTagResponse queryTag(QueryTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTagWithOptions(request, runtime);
    }

    public QueryTrendDataResponse queryTrendDataWithOptions(QueryTrendDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTrendData", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTrendDataResponse());
    }

    public QueryTrendDataResponse queryTrendData(QueryTrendDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrendDataWithOptions(request, runtime);
    }

    public RefreshClusterResourcePoolResponse refreshClusterResourcePoolWithOptions(RefreshClusterResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshClusterResourcePool", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshClusterResourcePoolResponse());
    }

    public RefreshClusterResourcePoolResponse refreshClusterResourcePool(RefreshClusterResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshClusterResourcePoolWithOptions(request, runtime);
    }

    public ReleaseClusterResponse releaseClusterWithOptions(ReleaseClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseCluster", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterResponse());
    }

    public ReleaseClusterResponse releaseCluster(ReleaseClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterWithOptions(request, runtime);
    }

    public ReleaseClusterByTemplateTagForInternalResponse releaseClusterByTemplateTagForInternalWithOptions(ReleaseClusterByTemplateTagForInternalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseClusterByTemplateTagForInternal", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterByTemplateTagForInternalResponse());
    }

    public ReleaseClusterByTemplateTagForInternalResponse releaseClusterByTemplateTagForInternal(ReleaseClusterByTemplateTagForInternalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterByTemplateTagForInternalWithOptions(request, runtime);
    }

    public ReleaseClusterHostGroupResponse releaseClusterHostGroupWithOptions(ReleaseClusterHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseClusterHostGroup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterHostGroupResponse());
    }

    public ReleaseClusterHostGroupResponse releaseClusterHostGroup(ReleaseClusterHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterHostGroupWithOptions(request, runtime);
    }

    public RemoveScalingConfigItemV2Response removeScalingConfigItemV2WithOptions(RemoveScalingConfigItemV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveScalingConfigItemV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveScalingConfigItemV2Response());
    }

    public RemoveScalingConfigItemV2Response removeScalingConfigItemV2(RemoveScalingConfigItemV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeScalingConfigItemV2WithOptions(request, runtime);
    }

    public RerunFlowResponse rerunFlowWithOptions(RerunFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RerunFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RerunFlowResponse());
    }

    public RerunFlowResponse rerunFlow(RerunFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rerunFlowWithOptions(request, runtime);
    }

    public ResizeClusterV2Response resizeClusterV2WithOptions(ResizeClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeClusterV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeClusterV2Response());
    }

    public ResizeClusterV2Response resizeClusterV2(ResizeClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeClusterV2WithOptions(request, runtime);
    }

    public RestoreBackupResponse restoreBackupWithOptions(RestoreBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreBackup", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreBackupResponse());
    }

    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreBackupWithOptions(request, runtime);
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshotWithOptions(RestoreFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreFlowEntitySnapshot", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreFlowEntitySnapshotResponse());
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshot(RestoreFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreFlowEntitySnapshotWithOptions(request, runtime);
    }

    public ResumeExecutionPlanSchedulerResponse resumeExecutionPlanSchedulerWithOptions(ResumeExecutionPlanSchedulerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeExecutionPlanScheduler", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeExecutionPlanSchedulerResponse());
    }

    public ResumeExecutionPlanSchedulerResponse resumeExecutionPlanScheduler(ResumeExecutionPlanSchedulerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeExecutionPlanSchedulerWithOptions(request, runtime);
    }

    public ResumeFlowResponse resumeFlowWithOptions(ResumeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeFlowResponse());
    }

    public ResumeFlowResponse resumeFlow(ResumeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeFlowWithOptions(request, runtime);
    }

    public RetryOperationResponse retryOperationWithOptions(RetryOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetryOperation", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RetryOperationResponse());
    }

    public RetryOperationResponse retryOperation(RetryOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryOperationWithOptions(request, runtime);
    }

    public RunClusterServiceActionResponse runClusterServiceActionWithOptions(RunClusterServiceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunClusterServiceAction", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RunClusterServiceActionResponse());
    }

    public RunClusterServiceActionResponse runClusterServiceAction(RunClusterServiceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runClusterServiceActionWithOptions(request, runtime);
    }

    public RunExecutionPlanResponse runExecutionPlanWithOptions(RunExecutionPlanRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunExecutionPlanShrinkRequest request = new RunExecutionPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.arguments)) {
            request.argumentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.arguments, "Arguments", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunExecutionPlan", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RunExecutionPlanResponse());
    }

    public RunExecutionPlanResponse runExecutionPlan(RunExecutionPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runExecutionPlanWithOptions(request, runtime);
    }

    public RunScalingActionV2Response runScalingActionV2WithOptions(RunScalingActionV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunScalingActionV2", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new RunScalingActionV2Response());
    }

    public RunScalingActionV2Response runScalingActionV2(RunScalingActionV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runScalingActionV2WithOptions(request, runtime);
    }

    public SearchLogResponse searchLogWithOptions(SearchLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchLog", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchLogResponse());
    }

    public SearchLogResponse searchLog(SearchLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchLogWithOptions(request, runtime);
    }

    public StartFlowResponse startFlowWithOptions(StartFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new StartFlowResponse());
    }

    public StartFlowResponse startFlow(StartFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startFlowWithOptions(request, runtime);
    }

    public SubmitFlowResponse submitFlowWithOptions(SubmitFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFlowResponse());
    }

    public SubmitFlowResponse submitFlow(SubmitFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowWithOptions(request, runtime);
    }

    public SubmitFlowJobResponse submitFlowJobWithOptions(SubmitFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFlowJob", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFlowJobResponse());
    }

    public SubmitFlowJobResponse submitFlowJob(SubmitFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowJobWithOptions(request, runtime);
    }

    public SuspendExecutionPlanSchedulerResponse suspendExecutionPlanSchedulerWithOptions(SuspendExecutionPlanSchedulerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendExecutionPlanScheduler", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendExecutionPlanSchedulerResponse());
    }

    public SuspendExecutionPlanSchedulerResponse suspendExecutionPlanScheduler(SuspendExecutionPlanSchedulerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendExecutionPlanSchedulerWithOptions(request, runtime);
    }

    public SuspendFlowResponse suspendFlowWithOptions(SuspendFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendFlow", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendFlowResponse());
    }

    public SuspendFlowResponse suspendFlow(SuspendFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendFlowWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTagsWithOptions(TagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResourcesSystemTags", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesSystemTagsResponse());
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTags(TagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesSystemTagsWithOptions(request, runtime);
    }

    public UninstallLibrariesResponse uninstallLibrariesWithOptions(UninstallLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallLibraries", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallLibrariesResponse());
    }

    public UninstallLibrariesResponse uninstallLibraries(UninstallLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallLibrariesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTagsWithOptions(UntagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResourcesSystemTags", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesSystemTagsResponse());
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTags(UntagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesSystemTagsWithOptions(request, runtime);
    }

    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDataSource", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDataSourceResponse());
    }

    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    public UpdateLibraryInstallTaskStatusResponse updateLibraryInstallTaskStatusWithOptions(UpdateLibraryInstallTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLibraryInstallTaskStatus", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLibraryInstallTaskStatusResponse());
    }

    public UpdateLibraryInstallTaskStatusResponse updateLibraryInstallTaskStatus(UpdateLibraryInstallTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLibraryInstallTaskStatusWithOptions(request, runtime);
    }

    public UpdateTagResponse updateTagWithOptions(UpdateTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTag", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTagResponse());
    }

    public UpdateTagResponse updateTag(UpdateTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTagWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2016-04-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
