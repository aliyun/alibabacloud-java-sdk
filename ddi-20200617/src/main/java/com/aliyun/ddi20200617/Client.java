// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617;

import com.aliyun.tea.*;
import com.aliyun.ddi20200617.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ddi.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ddi.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ddi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ddi.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ddi.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ddi.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ddi.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ddi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "ddi.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "ddi.eu-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "ddi.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "ddi.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "ddi.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "ddi.ap-south-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ModifyFlowProjectResponse modifyFlowProjectWithOptions(ModifyFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowProject", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowProjectResponse());
    }

    public ModifyFlowProjectResponse modifyFlowProject(ModifyFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectWithOptions(request, runtime);
    }

    public QueryKnoxUserPasswordResponse queryKnoxUserPasswordWithOptions(QueryKnoxUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryKnoxUserPassword", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new QueryKnoxUserPasswordResponse());
    }

    public QueryKnoxUserPasswordResponse queryKnoxUserPassword(QueryKnoxUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryKnoxUserPasswordWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLogWithOptions(DescribeFlowNodeInstanceLauncherLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstanceLauncherLog", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceLauncherLogResponse());
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLog(DescribeFlowNodeInstanceLauncherLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceLauncherLogWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public ListFlowClusterHostResponse listFlowClusterHostWithOptions(ListFlowClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterHost", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterHostResponse());
    }

    public ListFlowClusterHostResponse listFlowClusterHost(ListFlowClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterHostWithOptions(request, runtime);
    }

    public ListClusterOperationResponse listClusterOperationWithOptions(ListClusterOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperation", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationResponse());
    }

    public ListClusterOperationResponse listClusterOperation(ListClusterOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationWithOptions(request, runtime);
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshotWithOptions(ListFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowEntitySnapshot", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowEntitySnapshotResponse());
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshot(ListFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowEntitySnapshotWithOptions(request, runtime);
    }

    public DeleteClusterTemplateResponse deleteClusterTemplateWithOptions(DeleteClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteClusterTemplate", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterTemplateResponse());
    }

    public DeleteClusterTemplateResponse deleteClusterTemplate(DeleteClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterTemplateWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOrder", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public CloneFlowJobResponse cloneFlowJobWithOptions(CloneFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CloneFlowJobResponse());
    }

    public CloneFlowJobResponse cloneFlowJob(CloneFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowJobWithOptions(request, runtime);
    }

    public StartFlowResponse startFlowWithOptions(StartFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new StartFlowResponse());
    }

    public StartFlowResponse startFlow(StartFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startFlowWithOptions(request, runtime);
    }

    public CreateFlowJobResponse createFlowJobWithOptions(CreateFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowJobResponse());
    }

    public CreateFlowJobResponse createFlowJob(CreateFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowJobWithOptions(request, runtime);
    }

    public DeleteFlowCategoryResponse deleteFlowCategoryWithOptions(DeleteFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowCategory", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowCategoryResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowEditLock", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowEditLockResponse());
    }

    public DeleteFlowEditLockResponse deleteFlowEditLock(DeleteFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowEditLockWithOptions(request, runtime);
    }

    public ResizeClusterResponse resizeClusterWithOptions(ResizeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeCluster", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeClusterResponse());
    }

    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeClusterWithOptions(request, runtime);
    }

    public DescribeMetaTablePreviewTaskResponse describeMetaTablePreviewTaskWithOptions(DescribeMetaTablePreviewTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetaTablePreviewTask", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetaTablePreviewTaskResponse());
    }

    public DescribeMetaTablePreviewTaskResponse describeMetaTablePreviewTask(DescribeMetaTablePreviewTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetaTablePreviewTaskWithOptions(request, runtime);
    }

    public ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistoryWithOptions(ListClusterServiceConfigHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterServiceConfigHistory", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterServiceConfigHistoryResponse());
    }

    public ListClusterServiceConfigHistoryResponse listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterServiceConfigHistoryWithOptions(request, runtime);
    }

    public ModifyScalingConfigItemResponse modifyScalingConfigItemWithOptions(ModifyScalingConfigItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingConfigItem", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingConfigItemResponse());
    }

    public ModifyScalingConfigItemResponse modifyScalingConfigItem(ModifyScalingConfigItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingConfigItemWithOptions(request, runtime);
    }

    public ListFlowClusterAllResponse listFlowClusterAllWithOptions(ListFlowClusterAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterAll", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterAllResponse());
    }

    public ListFlowClusterAllResponse listFlowClusterAll(ListFlowClusterAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllWithOptions(request, runtime);
    }

    public DescribeScalingGroupResponse describeScalingGroupWithOptions(DescribeScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingGroupResponse());
    }

    public DescribeScalingGroupResponse describeScalingGroup(DescribeScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingGroupWithOptions(request, runtime);
    }

    public ListScalingGroupResponse listScalingGroupWithOptions(ListScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingGroupResponse());
    }

    public ListScalingGroupResponse listScalingGroup(ListScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingGroupWithOptions(request, runtime);
    }

    public ModifyFlowCategoryResponse modifyFlowCategoryWithOptions(ModifyFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowCategory", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowCategoryResponse());
    }

    public ModifyFlowCategoryResponse modifyFlowCategory(ModifyFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowCategoryWithOptions(request, runtime);
    }

    public ModifyClusterServiceConfigResponse modifyClusterServiceConfigWithOptions(ModifyClusterServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterServiceConfig", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterServiceConfigResponse());
    }

    public ModifyClusterServiceConfigResponse modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterServiceConfigWithOptions(request, runtime);
    }

    public CloneFlowResponse cloneFlowWithOptions(CloneFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CloneFlowResponse());
    }

    public CloneFlowResponse cloneFlow(CloneFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowWithOptions(request, runtime);
    }

    public CreateClusterTemplateResponse createClusterTemplateWithOptions(CreateClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterTemplate", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterTemplateResponse());
    }

    public CreateClusterTemplateResponse createClusterTemplate(CreateClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterTemplateWithOptions(request, runtime);
    }

    public UpdateLibraryInstallTaskStatusResponse updateLibraryInstallTaskStatusWithOptions(UpdateLibraryInstallTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLibraryInstallTaskStatus", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLibraryInstallTaskStatusResponse());
    }

    public UpdateLibraryInstallTaskStatusResponse updateLibraryInstallTaskStatus(UpdateLibraryInstallTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLibraryInstallTaskStatusWithOptions(request, runtime);
    }

    public ListScalingConfigItemResponse listScalingConfigItemWithOptions(ListScalingConfigItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingConfigItem", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingConfigItemResponse());
    }

    public ListScalingConfigItemResponse listScalingConfigItem(ListScalingConfigItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingConfigItemWithOptions(request, runtime);
    }

    public ListFlowInstanceResponse listFlowInstanceWithOptions(ListFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowInstance", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowInstanceResponse());
    }

    public ListFlowInstanceResponse listFlowInstance(ListFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowInstanceWithOptions(request, runtime);
    }

    public DescribeScalingMetricsResponse describeScalingMetricsWithOptions(DescribeScalingMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingMetrics", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingMetricsResponse());
    }

    public DescribeScalingMetricsResponse describeScalingMetrics(DescribeScalingMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingMetricsWithOptions(request, runtime);
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTagsWithOptions(UntagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResourcesSystemTags", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesSystemTagsResponse());
    }

    public UntagResourcesSystemTagsResponse untagResourcesSystemTags(UntagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesSystemTagsWithOptions(request, runtime);
    }

    public DescribeFlowProjectResponse describeFlowProjectWithOptions(DescribeFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowProject", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowProjectResponse());
    }

    public DescribeFlowProjectResponse describeFlowProject(DescribeFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectWithOptions(request, runtime);
    }

    public DeleteSecurityWhiteListResponse deleteSecurityWhiteListWithOptions(DeleteSecurityWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecurityWhiteList", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecurityWhiteListResponse());
    }

    public DeleteSecurityWhiteListResponse deleteSecurityWhiteList(DeleteSecurityWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityWhiteListWithOptions(request, runtime);
    }

    public ListScalingActivityResponse listScalingActivityWithOptions(ListScalingActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScalingActivity", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListScalingActivityResponse());
    }

    public ListScalingActivityResponse listScalingActivity(ListScalingActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScalingActivityWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2020-06-17", "HTTPS", "GET", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ListClusterInstalledServiceResponse listClusterInstalledServiceWithOptions(ListClusterInstalledServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterInstalledService", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterInstalledServiceResponse());
    }

    public ListClusterInstalledServiceResponse listClusterInstalledService(ListClusterInstalledServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterInstalledServiceWithOptions(request, runtime);
    }

    public RunClusterServiceActionResponse runClusterServiceActionWithOptions(RunClusterServiceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunClusterServiceAction", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new RunClusterServiceActionResponse());
    }

    public RunClusterServiceActionResponse runClusterServiceAction(RunClusterServiceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runClusterServiceActionWithOptions(request, runtime);
    }

    public SuspendFlowResponse suspendFlowWithOptions(SuspendFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendFlowResponse());
    }

    public SuspendFlowResponse suspendFlow(SuspendFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendFlowWithOptions(request, runtime);
    }

    public CreateFlowProjectResponse createFlowProjectWithOptions(CreateFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProject", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectResponse());
    }

    public CreateFlowProjectResponse createFlowProject(CreateFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectWithOptions(request, runtime);
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatusWithOptions(ListFlowNodeInstanceContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowNodeInstanceContainerStatus", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowNodeInstanceContainerStatusResponse());
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatus(ListFlowNodeInstanceContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeInstanceContainerStatusWithOptions(request, runtime);
    }

    public ModifyClusterTemplateResponse modifyClusterTemplateWithOptions(ModifyClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterTemplate", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterTemplateResponse());
    }

    public ModifyClusterTemplateResponse modifyClusterTemplate(ModifyClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterTemplateWithOptions(request, runtime);
    }

    public AddSecurityWhiteListResponse addSecurityWhiteListWithOptions(AddSecurityWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSecurityWhiteList", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new AddSecurityWhiteListResponse());
    }

    public AddSecurityWhiteListResponse addSecurityWhiteList(AddSecurityWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSecurityWhiteListWithOptions(request, runtime);
    }

    public ListMetaClusterResponse listMetaClusterWithOptions(ListMetaClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMetaCluster", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListMetaClusterResponse());
    }

    public ListMetaClusterResponse listMetaCluster(ListMetaClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMetaClusterWithOptions(request, runtime);
    }

    public ListClusterOperationHostResponse listClusterOperationHostWithOptions(ListClusterOperationHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperationHost", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationHostResponse());
    }

    public ListClusterOperationHostResponse listClusterOperationHost(ListClusterOperationHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationHostWithOptions(request, runtime);
    }

    public ListClusterTemplatesResponse listClusterTemplatesWithOptions(ListClusterTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterTemplates", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterTemplatesResponse());
    }

    public ListClusterTemplatesResponse listClusterTemplates(ListClusterTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTemplatesWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusters", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTagsWithOptions(TagResourcesSystemTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResourcesSystemTags", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesSystemTagsResponse());
    }

    public TagResourcesSystemTagsResponse tagResourcesSystemTags(TagResourcesSystemTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesSystemTagsWithOptions(request, runtime);
    }

    public ModifyFlowJobResponse modifyFlowJobWithOptions(ModifyFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowJobResponse());
    }

    public ModifyFlowJobResponse modifyFlowJob(ModifyFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowJobWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public CreateFlowEditLockResponse createFlowEditLockWithOptions(CreateFlowEditLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowEditLock", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowEditLockResponse());
    }

    public CreateFlowEditLockResponse createFlowEditLock(CreateFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowEditLockWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstanceWithOptions(DescribeFlowNodeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstance", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceResponse());
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstance(DescribeFlowNodeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceWithOptions(request, runtime);
    }

    public DetachAndReleaseClusterEniResponse detachAndReleaseClusterEniWithOptions(DetachAndReleaseClusterEniRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachAndReleaseClusterEni", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DetachAndReleaseClusterEniResponse());
    }

    public DetachAndReleaseClusterEniResponse detachAndReleaseClusterEni(DetachAndReleaseClusterEniRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachAndReleaseClusterEniWithOptions(request, runtime);
    }

    public DescribeScalingGroupInstanceResponse describeScalingGroupInstanceWithOptions(DescribeScalingGroupInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingGroupInstance", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingGroupInstanceResponse());
    }

    public DescribeScalingGroupInstanceResponse describeScalingGroupInstance(DescribeScalingGroupInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingGroupInstanceWithOptions(request, runtime);
    }

    public CreateClusterHostGroupResponse createClusterHostGroupWithOptions(CreateClusterHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterHostGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterHostGroupResponse());
    }

    public CreateClusterHostGroupResponse createClusterHostGroup(CreateClusterHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterHostGroupWithOptions(request, runtime);
    }

    public DescribeClusterTemplateResponse describeClusterTemplateWithOptions(DescribeClusterTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterTemplate", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterTemplateResponse());
    }

    public DescribeClusterTemplateResponse describeClusterTemplate(DescribeClusterTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterTemplateWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshotWithOptions(CommitFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommitFlowEntitySnapshot", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CommitFlowEntitySnapshotResponse());
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshot(CommitFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitFlowEntitySnapshotWithOptions(request, runtime);
    }

    public SubmitFlowJobResponse submitFlowJobWithOptions(SubmitFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFlowJobResponse());
    }

    public SubmitFlowJobResponse submitFlowJob(SubmitFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowJobWithOptions(request, runtime);
    }

    public ListFlowJobHistoryResponse listFlowJobHistoryWithOptions(ListFlowJobHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowJobHistory", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowJobHistoryResponse());
    }

    public ListFlowJobHistoryResponse listFlowJobHistory(ListFlowJobHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobHistoryWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2020-06-17", "HTTPS", "GET", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListClusterHostComponentResponse listClusterHostComponentWithOptions(ListClusterHostComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterHostComponent", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterHostComponentResponse());
    }

    public ListClusterHostComponentResponse listClusterHostComponent(ListClusterHostComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterHostComponentWithOptions(request, runtime);
    }

    public ModifyScalingGroupResponse modifyScalingGroupWithOptions(ModifyScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingGroupResponse());
    }

    public ModifyScalingGroupResponse modifyScalingGroup(ModifyScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingGroupWithOptions(request, runtime);
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSettingWithOptions(DescribeFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowProjectClusterSetting", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowProjectClusterSettingResponse());
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSetting(DescribeFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSettingWithOptions(ListFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProjectClusterSetting", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectClusterSettingResponse());
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSetting(ListFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public SubmitFlowResponse submitFlowWithOptions(SubmitFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitFlowResponse());
    }

    public SubmitFlowResponse submitFlow(SubmitFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowWithOptions(request, runtime);
    }

    public DescribeScalingCommonConfigResponse describeScalingCommonConfigWithOptions(DescribeScalingCommonConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingCommonConfig", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingCommonConfigResponse());
    }

    public DescribeScalingCommonConfigResponse describeScalingCommonConfig(DescribeScalingCommonConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingCommonConfigWithOptions(request, runtime);
    }

    public ResumeFlowResponse resumeFlowWithOptions(ResumeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeFlowResponse());
    }

    public ResumeFlowResponse resumeFlow(ResumeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeFlowWithOptions(request, runtime);
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshotWithOptions(RestoreFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreFlowEntitySnapshot", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreFlowEntitySnapshotResponse());
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshot(RestoreFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreFlowEntitySnapshotWithOptions(request, runtime);
    }

    public CreateLibraryResponse createLibraryWithOptions(CreateLibraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLibrary", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLibraryResponse());
    }

    public CreateLibraryResponse createLibrary(CreateLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLibraryWithOptions(request, runtime);
    }

    public ListVswitchResponse listVswitchWithOptions(ListVswitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVswitch", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListVswitchResponse());
    }

    public ListVswitchResponse listVswitch(ListVswitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVswitchWithOptions(request, runtime);
    }

    public DeleteFlowProjectResponse deleteFlowProjectWithOptions(DeleteFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProject", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectResponse());
    }

    public DeleteFlowProjectResponse deleteFlowProject(DeleteFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectWithOptions(request, runtime);
    }

    public ReleaseClusterResponse releaseClusterWithOptions(ReleaseClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseCluster", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterResponse());
    }

    public ReleaseClusterResponse releaseCluster(ReleaseClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterWithOptions(request, runtime);
    }

    public AddScalingConfigItemResponse addScalingConfigItemWithOptions(AddScalingConfigItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddScalingConfigItem", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new AddScalingConfigItemResponse());
    }

    public AddScalingConfigItemResponse addScalingConfigItem(AddScalingConfigItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addScalingConfigItemWithOptions(request, runtime);
    }

    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetUserPassword", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ResetUserPasswordResponse());
    }

    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHostsWithOptions(ListFlowClusterAllHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowClusterAllHosts", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterAllHostsResponse());
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHosts(ListFlowClusterAllHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllHostsWithOptions(request, runtime);
    }

    public DeleteLibrariesResponse deleteLibrariesWithOptions(DeleteLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLibraries", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLibrariesResponse());
    }

    public DeleteLibrariesResponse deleteLibraries(DeleteLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLibrariesWithOptions(request, runtime);
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTreeWithOptions(DescribeFlowCategoryTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowCategoryTree", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowCategoryTreeResponse());
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTree(DescribeFlowCategoryTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowCategoryTreeWithOptions(request, runtime);
    }

    public ListDatasourceInstancesResponse listDatasourceInstancesWithOptions(ListDatasourceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDatasourceInstances", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListDatasourceInstancesResponse());
    }

    public ListDatasourceInstancesResponse listDatasourceInstances(ListDatasourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatasourceInstancesWithOptions(request, runtime);
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResultWithOptions(ListFlowNodeSqlResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowNodeSqlResult", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowNodeSqlResultResponse());
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResult(ListFlowNodeSqlResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeSqlResultWithOptions(request, runtime);
    }

    public DescribeFlowJobResponse describeFlowJobWithOptions(DescribeFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowJobResponse());
    }

    public DescribeFlowJobResponse describeFlowJob(DescribeFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowJobWithOptions(request, runtime);
    }

    public DescribeLibraryInstallTaskDetailResponse describeLibraryInstallTaskDetailWithOptions(DescribeLibraryInstallTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLibraryInstallTaskDetail", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLibraryInstallTaskDetailResponse());
    }

    public DescribeLibraryInstallTaskDetailResponse describeLibraryInstallTaskDetail(DescribeLibraryInstallTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLibraryInstallTaskDetailWithOptions(request, runtime);
    }

    public ModifyFlowForWebResponse modifyFlowForWebWithOptions(ModifyFlowForWebRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowForWeb", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowForWebResponse());
    }

    public ModifyFlowForWebResponse modifyFlowForWeb(ModifyFlowForWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowForWebWithOptions(request, runtime);
    }

    public RemoveScalingConfigItemResponse removeScalingConfigItemWithOptions(RemoveScalingConfigItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveScalingConfigItem", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveScalingConfigItemResponse());
    }

    public RemoveScalingConfigItemResponse removeScalingConfigItem(RemoveScalingConfigItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeScalingConfigItemWithOptions(request, runtime);
    }

    public DescribeSecurityWhiteListResponse describeSecurityWhiteListWithOptions(DescribeSecurityWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityWhiteList", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityWhiteListResponse());
    }

    public DescribeSecurityWhiteListResponse describeSecurityWhiteList(DescribeSecurityWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityWhiteListWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLogWithOptions(DescribeFlowNodeInstanceContainerLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowNodeInstanceContainerLog", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowNodeInstanceContainerLogResponse());
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLog(DescribeFlowNodeInstanceContainerLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceContainerLogWithOptions(request, runtime);
    }

    public RerunFlowResponse rerunFlowWithOptions(RerunFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RerunFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new RerunFlowResponse());
    }

    public RerunFlowResponse rerunFlow(RerunFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rerunFlowWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public DescribeClusterOperationHostTaskLogResponse describeClusterOperationHostTaskLogWithOptions(DescribeClusterOperationHostTaskLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterOperationHostTaskLog", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterOperationHostTaskLogResponse());
    }

    public DescribeClusterOperationHostTaskLogResponse describeClusterOperationHostTaskLog(DescribeClusterOperationHostTaskLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterOperationHostTaskLogWithOptions(request, runtime);
    }

    public KillFlowJobResponse killFlowJobWithOptions(KillFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillFlowJob", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new KillFlowJobResponse());
    }

    public KillFlowJobResponse killFlowJob(KillFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killFlowJobWithOptions(request, runtime);
    }

    public UninstallLibrariesResponse uninstallLibrariesWithOptions(UninstallLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallLibraries", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallLibrariesResponse());
    }

    public UninstallLibrariesResponse uninstallLibraries(UninstallLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallLibrariesWithOptions(request, runtime);
    }

    public DescribeClusterV2Response describeClusterV2WithOptions(DescribeClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterV2", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterV2Response());
    }

    public DescribeClusterV2Response describeClusterV2(DescribeClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterV2WithOptions(request, runtime);
    }

    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowResponse());
    }

    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    public ListFlowClusterResponse listFlowClusterWithOptions(ListFlowClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowCluster", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowClusterResponse());
    }

    public ListFlowClusterResponse listFlowCluster(ListFlowClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterWithOptions(request, runtime);
    }

    public ListLdapUsersResponse listLdapUsersWithOptions(ListLdapUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLdapUsers", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListLdapUsersResponse());
    }

    public ListLdapUsersResponse listLdapUsers(ListLdapUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLdapUsersWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSettingWithOptions(CreateFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProjectClusterSetting", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectClusterSettingResponse());
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSetting(CreateFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DescribeFlowInstanceResponse describeFlowInstanceWithOptions(DescribeFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowInstance", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowInstanceResponse());
    }

    public DescribeFlowInstanceResponse describeFlowInstance(DescribeFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowInstanceWithOptions(request, runtime);
    }

    public CreateFlowProjectUserResponse createFlowProjectUserWithOptions(CreateFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowProjectUser", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowProjectUserResponse());
    }

    public CreateFlowProjectUserResponse createFlowProjectUser(CreateFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectUserWithOptions(request, runtime);
    }

    public CreateFlowCategoryResponse createFlowCategoryWithOptions(CreateFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowCategory", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowCategoryResponse());
    }

    public CreateFlowCategoryResponse createFlowCategory(CreateFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowCategoryWithOptions(request, runtime);
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSettingWithOptions(DeleteFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProjectClusterSetting", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectClusterSettingResponse());
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSetting(DeleteFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ListLibrariesResponse listLibrariesWithOptions(ListLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLibraries", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListLibrariesResponse());
    }

    public ListLibrariesResponse listLibraries(ListLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLibrariesWithOptions(request, runtime);
    }

    public RunScalingActionResponse runScalingActionWithOptions(RunScalingActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunScalingAction", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new RunScalingActionResponse());
    }

    public RunScalingActionResponse runScalingAction(RunScalingActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runScalingActionWithOptions(request, runtime);
    }

    public InstallLibrariesResponse installLibrariesWithOptions(InstallLibrariesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallLibraries", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new InstallLibrariesResponse());
    }

    public InstallLibrariesResponse installLibraries(InstallLibrariesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installLibrariesWithOptions(request, runtime);
    }

    public ListFlowJobsResponse listFlowJobsWithOptions(ListFlowJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowJobs", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowJobsResponse());
    }

    public ListFlowJobsResponse listFlowJobs(ListFlowJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobsWithOptions(request, runtime);
    }

    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlow", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowResponse());
    }

    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListLibraryStatusResponse listLibraryStatusWithOptions(ListLibraryStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLibraryStatus", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListLibraryStatusResponse());
    }

    public ListLibraryStatusResponse listLibraryStatus(ListLibraryStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLibraryStatusWithOptions(request, runtime);
    }

    public DescribeClusterServiceConfigResponse describeClusterServiceConfigWithOptions(DescribeClusterServiceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterServiceConfig", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceConfigResponse());
    }

    public DescribeClusterServiceConfigResponse describeClusterServiceConfig(DescribeClusterServiceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceConfigWithOptions(request, runtime);
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSettingWithOptions(ModifyFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowProjectClusterSetting", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowProjectClusterSettingResponse());
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSetting(ModifyFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUserWithOptions(DeleteFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowProjectUser", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowProjectUserResponse());
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUser(DeleteFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectUserWithOptions(request, runtime);
    }

    public CreateClusterV2Response createClusterV2WithOptions(CreateClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateClusterV2", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterV2Response());
    }

    public CreateClusterV2Response createClusterV2(CreateClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterV2WithOptions(request, runtime);
    }

    public ModifyClusterNameResponse modifyClusterNameWithOptions(ModifyClusterNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterName", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterNameResponse());
    }

    public ModifyClusterNameResponse modifyClusterName(ModifyClusterNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterNameWithOptions(request, runtime);
    }

    public ListClusterOperationHostTaskResponse listClusterOperationHostTaskWithOptions(ListClusterOperationHostTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterOperationHostTask", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterOperationHostTaskResponse());
    }

    public ListClusterOperationHostTaskResponse listClusterOperationHostTask(ListClusterOperationHostTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterOperationHostTaskWithOptions(request, runtime);
    }

    public DescribeScalingConfigItemResponse describeScalingConfigItemWithOptions(DescribeScalingConfigItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingConfigItem", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingConfigItemResponse());
    }

    public DescribeScalingConfigItemResponse describeScalingConfigItem(DescribeScalingConfigItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingConfigItemWithOptions(request, runtime);
    }

    public ListClusterHostResponse listClusterHostWithOptions(ListClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterHost", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterHostResponse());
    }

    public ListClusterHostResponse listClusterHost(ListClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterHostWithOptions(request, runtime);
    }

    public CreateScalingGroupResponse createScalingGroupWithOptions(CreateScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingGroupResponse());
    }

    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingGroupWithOptions(request, runtime);
    }

    public DescribeClusterServiceResponse describeClusterServiceWithOptions(DescribeClusterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterService", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterServiceResponse());
    }

    public DescribeClusterServiceResponse describeClusterService(DescribeClusterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterServiceWithOptions(request, runtime);
    }

    public ListFlowProjectsResponse listFlowProjectsWithOptions(ListFlowProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProjects", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectsResponse());
    }

    public ListFlowProjectsResponse listFlowProjects(ListFlowProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectsWithOptions(request, runtime);
    }

    public CreateMetaTablePreviewTaskResponse createMetaTablePreviewTaskWithOptions(CreateMetaTablePreviewTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMetaTablePreviewTask", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMetaTablePreviewTaskResponse());
    }

    public CreateMetaTablePreviewTaskResponse createMetaTablePreviewTask(CreateMetaTablePreviewTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMetaTablePreviewTaskWithOptions(request, runtime);
    }

    public ListFlowProjectUserResponse listFlowProjectUserWithOptions(ListFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowProjectUser", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowProjectUserResponse());
    }

    public ListFlowProjectUserResponse listFlowProjectUser(ListFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectUserWithOptions(request, runtime);
    }

    public DeleteClusterHostGroupResponse deleteClusterHostGroupWithOptions(DeleteClusterHostGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteClusterHostGroup", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterHostGroupResponse());
    }

    public DeleteClusterHostGroupResponse deleteClusterHostGroup(DeleteClusterHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterHostGroupWithOptions(request, runtime);
    }

    public DescribeLibraryDetailResponse describeLibraryDetailWithOptions(DescribeLibraryDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLibraryDetail", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLibraryDetailResponse());
    }

    public DescribeLibraryDetailResponse describeLibraryDetail(DescribeLibraryDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLibraryDetailWithOptions(request, runtime);
    }

    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlows", "2020-06-17", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowsResponse());
    }

    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }
}
