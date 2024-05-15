// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215;

import com.aliyun.tea.*;
import com.aliyun.cs20151215.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cs.aliyuncs.com"),
            new TeaPair("cn-fujian", "cs.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cs.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cs.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cs.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cs.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * @summary You can call the AttachInstances operation to add existing Elastic Compute Service (ECS) instances to a cluster.
     *
     * @param request AttachInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstancesWithOptions(String ClusterId, AttachInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEdgeWorker)) {
            body.put("is_edge_worker", request.isEdgeWorker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachInstances"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/attach"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachInstancesResponse());
    }

    /**
     * @summary You can call the AttachInstances operation to add existing Elastic Compute Service (ECS) instances to a cluster.
     *
     * @param request AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(String ClusterId, AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachInstancesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the AttachInstancesToNodePool operation to add existing nodes to a node pool.
     *
     * @param request AttachInstancesToNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachInstancesToNodePoolResponse
     */
    public AttachInstancesToNodePoolResponse attachInstancesToNodePoolWithOptions(String ClusterId, String NodepoolId, AttachInstancesToNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachInstancesToNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + "/attach"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachInstancesToNodePoolResponse());
    }

    /**
     * @summary You can call the AttachInstancesToNodePool operation to add existing nodes to a node pool.
     *
     * @param request AttachInstancesToNodePoolRequest
     * @return AttachInstancesToNodePoolResponse
     */
    public AttachInstancesToNodePoolResponse attachInstancesToNodePool(String ClusterId, String NodepoolId, AttachInstancesToNodePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachInstancesToNodePoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated
     *
     * @summary You can call the CancelClusterUpgrade operation to cancel the update of a cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelClusterUpgradeResponse
     */
    // Deprecated
    public CancelClusterUpgradeResponse cancelClusterUpgradeWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelClusterUpgrade"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/upgrade/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelClusterUpgradeResponse());
    }

    /**
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated
     *
     * @summary You can call the CancelClusterUpgrade operation to cancel the update of a cluster.
     *
     * @return CancelClusterUpgradeResponse
     */
    // Deprecated
    public CancelClusterUpgradeResponse cancelClusterUpgrade(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the CancelComponentUpgrade operation to cancel the update of a component.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelComponentUpgradeResponse
     */
    public CancelComponentUpgradeResponse cancelComponentUpgradeWithOptions(String clusterId, String componentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelComponentUpgrade"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentId) + "/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelComponentUpgradeResponse());
    }

    /**
     * @summary You can call the CancelComponentUpgrade operation to cancel the update of a component.
     *
     * @return CancelComponentUpgradeResponse
     */
    public CancelComponentUpgradeResponse cancelComponentUpgrade(String clusterId, String componentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComponentUpgradeWithOptions(clusterId, componentId, headers, runtime);
    }

    /**
     * @summary 取消自动运维执行计划
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOperationPlanResponse
     */
    public CancelOperationPlanResponse cancelOperationPlanWithOptions(String planId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOperationPlan"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/operation/plans/" + com.aliyun.openapiutil.Client.getEncodeParam(planId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOperationPlanResponse());
    }

    /**
     * @summary 取消自动运维执行计划
     *
     * @return CancelOperationPlanResponse
     */
    public CancelOperationPlanResponse cancelOperationPlan(String planId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelOperationPlanWithOptions(planId, headers, runtime);
    }

    /**
     * @summary You can call the CancelTask operation to cancel a task.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    /**
     * @summary You can call the CancelTask operation to cancel a task.
     *
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * @summary You can call the CancelWorkflow operation to cancel an ongoing workflow.
     *
     * @param request CancelWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelWorkflowResponse
     */
    public CancelWorkflowResponse cancelWorkflowWithOptions(String workflowName, CancelWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelWorkflow"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gs/workflow/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelWorkflowResponse());
    }

    /**
     * @summary You can call the CancelWorkflow operation to cancel an ongoing workflow.
     *
     * @param request CancelWorkflowRequest
     * @return CancelWorkflowResponse
     */
    public CancelWorkflowResponse cancelWorkflow(String workflowName, CancelWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelWorkflowWithOptions(workflowName, request, headers, runtime);
    }

    /**
     * @summary Queries the current log configuration of control plane components, including the log retention period and the log collection component. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckControlPlaneLogEnableResponse
     */
    public CheckControlPlaneLogEnableResponse checkControlPlaneLogEnableWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckControlPlaneLogEnable"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/controlplanelog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckControlPlaneLogEnableResponse());
    }

    /**
     * @summary Queries the current log configuration of control plane components, including the log retention period and the log collection component. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager.
     *
     * @return CheckControlPlaneLogEnableResponse
     */
    public CheckControlPlaneLogEnableResponse checkControlPlaneLogEnable(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkControlPlaneLogEnableWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary Creates a scaling configuration to allow the system to scale resources based on the given scaling rules. When you create a scaling configuration, you can specify the scaling metrics, thresholds, scaling order, and scaling interval.
     *
     * @param request CreateAutoscalingConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoscalingConfigResponse
     */
    public CreateAutoscalingConfigResponse createAutoscalingConfigWithOptions(String ClusterId, CreateAutoscalingConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coolDownDuration)) {
            body.put("cool_down_duration", request.coolDownDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.daemonsetEvictionForNodes)) {
            body.put("daemonset_eviction_for_nodes", request.daemonsetEvictionForNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expander)) {
            body.put("expander", request.expander);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuUtilizationThreshold)) {
            body.put("gpu_utilization_threshold", request.gpuUtilizationThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxGracefulTerminationSec)) {
            body.put("max_graceful_termination_sec", request.maxGracefulTerminationSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReplicaCount)) {
            body.put("min_replica_count", request.minReplicaCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recycleNodeDeletionEnabled)) {
            body.put("recycle_node_deletion_enabled", request.recycleNodeDeletionEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleDownEnabled)) {
            body.put("scale_down_enabled", request.scaleDownEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleUpFromZero)) {
            body.put("scale_up_from_zero", request.scaleUpFromZero);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanInterval)) {
            body.put("scan_interval", request.scanInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipNodesWithLocalStorage)) {
            body.put("skip_nodes_with_local_storage", request.skipNodesWithLocalStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipNodesWithSystemPods)) {
            body.put("skip_nodes_with_system_pods", request.skipNodesWithSystemPods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unneededDuration)) {
            body.put("unneeded_duration", request.unneededDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utilizationThreshold)) {
            body.put("utilization_threshold", request.utilizationThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoscalingConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cluster/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/autoscale/config/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoscalingConfigResponse());
    }

    /**
     * @summary Creates a scaling configuration to allow the system to scale resources based on the given scaling rules. When you create a scaling configuration, you can specify the scaling metrics, thresholds, scaling order, and scaling interval.
     *
     * @param request CreateAutoscalingConfigRequest
     * @return CreateAutoscalingConfigResponse
     */
    public CreateAutoscalingConfigResponse createAutoscalingConfig(String ClusterId, CreateAutoscalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoscalingConfigWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the CreateCluster operation to create a Container Service for Kubernetes (ACK) cluster. ACK clusters include ACK managed clusters, ACK dedicated clusters, ACK Serverless clusters, ACK Edge clusters, ACK clusters that support sandboxed containers, and registered clusters. For more information about how to create different types of ACK clusters, see the following usage notes.
     *
     * @description This topic describes all parameters for creating an ACK cluster. You can create the following types of ACK clusters.
     * *   [Create an ACK managed cluster](https://help.aliyun.com/document_detail/90776.html)
     * *   [Create an ACK dedicated cluster](https://help.aliyun.com/document_detail/197620.html)
     * *   [Create an ACK Serverless cluster](https://help.aliyun.com/document_detail/144246.html)
     * *   [Create an ACK Edge cluster](https://help.aliyun.com/document_detail/128204.html)
     * *   [Create an ACK Basic cluster that supports sandboxed containers](https://help.aliyun.com/document_detail/196321.html)
     * *   [Create an ACK Pro cluster that supports sandboxed containers](https://help.aliyun.com/document_detail/140623.html)
     *
     * @param request CreateClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlList)) {
            body.put("access_control_list", request.accessControlList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addons)) {
            body.put("addons", request.addons);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiAudiences)) {
            body.put("api_audiences", request.apiAudiences);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("charge_type", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cisEnabled)) {
            body.put("cis_enabled", request.cisEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDomain)) {
            body.put("cluster_domain", request.clusterDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerCidr)) {
            body.put("container_cidr", request.containerCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogComponents)) {
            body.put("controlplane_log_components", request.controlplaneLogComponents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogProject)) {
            body.put("controlplane_log_project", request.controlplaneLogProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlplaneLogTtl)) {
            body.put("controlplane_log_ttl", request.controlplaneLogTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSan)) {
            body.put("custom_san", request.customSan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            body.put("deletion_protection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            body.put("disable_rollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRrsa)) {
            body.put("enable_rrsa", request.enableRrsa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionProviderKey)) {
            body.put("encryption_provider_key", request.encryptionProviderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointPublicAccess)) {
            body.put("endpoint_public_access", request.endpointPublicAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("image_type", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipStack)) {
            body.put("ip_stack", request.ipStack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnterpriseSecurityGroup)) {
            body.put("is_enterprise_security_group", request.isEnterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesVersion)) {
            body.put("kubernetes_version", request.kubernetesVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerSpec)) {
            body.put("load_balancer_spec", request.loadBalancerSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loggingType)) {
            body.put("logging_type", request.loggingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterAutoRenew)) {
            body.put("master_auto_renew", request.masterAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterAutoRenewPeriod)) {
            body.put("master_auto_renew_period", request.masterAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterCount)) {
            body.put("master_count", request.masterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstanceChargeType)) {
            body.put("master_instance_charge_type", request.masterInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstanceTypes)) {
            body.put("master_instance_types", request.masterInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPeriod)) {
            body.put("master_period", request.masterPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterPeriodUnit)) {
            body.put("master_period_unit", request.masterPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskCategory)) {
            body.put("master_system_disk_category", request.masterSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskPerformanceLevel)) {
            body.put("master_system_disk_performance_level", request.masterSystemDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskSize)) {
            body.put("master_system_disk_size", request.masterSystemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSystemDiskSnapshotPolicyId)) {
            body.put("master_system_disk_snapshot_policy_id", request.masterSystemDiskSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterVswitchIds)) {
            body.put("master_vswitch_ids", request.masterVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGateway)) {
            body.put("nat_gateway", request.natGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeCidrMask)) {
            body.put("node_cidr_mask", request.nodeCidrMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNameMode)) {
            body.put("node_name_mode", request.nodeNameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePortRange)) {
            body.put("node_port_range", request.nodePortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepools)) {
            body.put("nodepools", request.nodepools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numOfNodes)) {
            body.put("num_of_nodes", request.numOfNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("os_type", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("period_unit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podVswitchIds)) {
            body.put("pod_vswitch_ids", request.podVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            body.put("profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyMode)) {
            body.put("proxy_mode", request.proxyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resource_group_id", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("security_group_id", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityHardeningOs)) {
            body.put("security_hardening_os", request.securityHardeningOs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceAccountIssuer)) {
            body.put("service_account_issuer", request.serviceAccountIssuer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCidr)) {
            body.put("service_cidr", request.serviceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDiscoveryTypes)) {
            body.put("service_discovery_types", request.serviceDiscoveryTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatEntry)) {
            body.put("snat_entry", request.snatEntry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.socEnabled)) {
            body.put("soc_enabled", request.socEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sshFlags)) {
            body.put("ssh_flags", request.sshFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutMins)) {
            body.put("timeout_mins", request.timeoutMins);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCa)) {
            body.put("user_ca", request.userCa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcid)) {
            body.put("vpcid", request.vpcid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskPerformanceLevel)) {
            body.put("worker_system_disk_performance_level", request.workerSystemDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSnapshotPolicyId)) {
            body.put("worker_system_disk_snapshot_policy_id", request.workerSystemDiskSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerVswitchIds)) {
            body.put("worker_vswitch_ids", request.workerVswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zone_id", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * @summary You can call the CreateCluster operation to create a Container Service for Kubernetes (ACK) cluster. ACK clusters include ACK managed clusters, ACK dedicated clusters, ACK Serverless clusters, ACK Edge clusters, ACK clusters that support sandboxed containers, and registered clusters. For more information about how to create different types of ACK clusters, see the following usage notes.
     *
     * @description This topic describes all parameters for creating an ACK cluster. You can create the following types of ACK clusters.
     * *   [Create an ACK managed cluster](https://help.aliyun.com/document_detail/90776.html)
     * *   [Create an ACK dedicated cluster](https://help.aliyun.com/document_detail/197620.html)
     * *   [Create an ACK Serverless cluster](https://help.aliyun.com/document_detail/144246.html)
     * *   [Create an ACK Edge cluster](https://help.aliyun.com/document_detail/128204.html)
     * *   [Create an ACK Basic cluster that supports sandboxed containers](https://help.aliyun.com/document_detail/196321.html)
     * *   [Create an ACK Pro cluster that supports sandboxed containers](https://help.aliyun.com/document_detail/140623.html)
     *
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the CreateClusterNodePool operation to create a node pool for a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request CreateClusterNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterNodePoolResponse
     */
    public CreateClusterNodePoolResponse createClusterNodePoolWithOptions(String ClusterId, CreateClusterNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScaling)) {
            body.put("auto_scaling", request.autoScaling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interconnectConfig)) {
            body.put("interconnect_config", request.interconnectConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interconnectMode)) {
            body.put("interconnect_mode", request.interconnectMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesConfig)) {
            body.put("kubernetes_config", request.kubernetesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.management)) {
            body.put("management", request.management);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxNodes)) {
            body.put("max_nodes", request.maxNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeConfig)) {
            body.put("node_config", request.nodeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolInfo)) {
            body.put("nodepool_info", request.nodepoolInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroup)) {
            body.put("scaling_group", request.scalingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teeConfig)) {
            body.put("tee_config", request.teeConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterNodePoolResponse());
    }

    /**
     * @summary You can call the CreateClusterNodePool operation to create a node pool for a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     */
    public CreateClusterNodePoolResponse createClusterNodePool(String ClusterId, CreateClusterNodePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterNodePoolWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the CreateEdgeMachine operation to activate a cloud-native box.
     *
     * @param request CreateEdgeMachineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeMachineResponse
     */
    public CreateEdgeMachineResponse createEdgeMachineWithOptions(CreateEdgeMachineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            body.put("hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            body.put("sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeMachine"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeMachineResponse());
    }

    /**
     * @summary You can call the CreateEdgeMachine operation to activate a cloud-native box.
     *
     * @param request CreateEdgeMachineRequest
     * @return CreateEdgeMachineResponse
     */
    public CreateEdgeMachineResponse createEdgeMachine(CreateEdgeMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEdgeMachineWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the CreateKubernetesTrigger operation to create a trigger for an application.
     *
     * @param request CreateKubernetesTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKubernetesTriggerResponse
     */
    public CreateKubernetesTriggerResponse createKubernetesTriggerWithOptions(CreateKubernetesTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("project_id", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKubernetesTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/triggers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKubernetesTriggerResponse());
    }

    /**
     * @summary You can call the CreateKubernetesTrigger operation to create a trigger for an application.
     *
     * @param request CreateKubernetesTriggerRequest
     * @return CreateKubernetesTriggerResponse
     */
    public CreateKubernetesTriggerResponse createKubernetesTrigger(CreateKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKubernetesTriggerWithOptions(request, headers, runtime);
    }

    /**
     * @summary Creates an orchestration template. An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can use orchestration templates to manage resources in Kubernetes clusters and automate resource deployment, such as pods, Services, Deployments, ConfigMaps, and persistent volumes (PVs).
     *
     * @param request CreateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("template_type", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * @summary Creates an orchestration template. An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can use orchestration templates to manage resources in Kubernetes clusters and automate resource deployment, such as pods, Services, Deployments, ConfigMaps, and persistent volumes (PVs).
     *
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the CreateTrigger operation to create a trigger for an application.
     *
     * @param request CreateTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTriggerWithOptions(String clusterId, CreateTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("project_id", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/triggers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    /**
     * @summary You can call the CreateTrigger operation to create a trigger for an application.
     *
     * @param request CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(String clusterId, CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTriggerWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @param tmpReq DeleteAlertContactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertContactResponse
     */
    public DeleteAlertContactResponse deleteAlertContactWithOptions(DeleteAlertContactRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAlertContactShrinkRequest request = new DeleteAlertContactShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactIds)) {
            request.contactIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactIds, "contact_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIdsShrink)) {
            query.put("contact_ids", request.contactIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertContact"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alert/contacts"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertContactResponse());
    }

    /**
     * @param request DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertContactWithOptions(request, headers, runtime);
    }

    /**
     * @param tmpReq DeleteAlertContactGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertContactGroupResponse
     */
    public DeleteAlertContactGroupResponse deleteAlertContactGroupWithOptions(DeleteAlertContactGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAlertContactGroupShrinkRequest request = new DeleteAlertContactGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactGroupIds)) {
            request.contactGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactGroupIds, "contact_group_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIdsShrink)) {
            query.put("contact_group_ids", request.contactGroupIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlertContactGroup"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alert/contact_groups"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlertContactGroupResponse());
    }

    /**
     * @param request DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertContactGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the DeleteCluster operation to delete a cluster by cluster ID and release all nodes in the cluster.
     *
     * @param tmpReq DeleteClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(String ClusterId, DeleteClusterRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteClusterShrinkRequest request = new DeleteClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deleteOptions)) {
            request.deleteOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deleteOptions, "delete_options", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retainResources)) {
            request.retainResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retainResources, "retain_resources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteOptionsShrink)) {
            query.put("delete_options", request.deleteOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepSlb)) {
            query.put("keep_slb", request.keepSlb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainAllResources)) {
            query.put("retain_all_resources", request.retainAllResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResourcesShrink)) {
            query.put("retain_resources", request.retainResourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * @summary You can call the DeleteCluster operation to delete a cluster by cluster ID and release all nodes in the cluster.
     *
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(String ClusterId, DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DeleteClusterNodepool operation to delete a node pool by node pool ID.
     *
     * @param request DeleteClusterNodepoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterNodepoolResponse
     */
    public DeleteClusterNodepoolResponse deleteClusterNodepoolWithOptions(String ClusterId, String NodepoolId, DeleteClusterNodepoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterNodepool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterNodepoolResponse());
    }

    /**
     * @summary You can call the DeleteClusterNodepool operation to delete a node pool by node pool ID.
     *
     * @param request DeleteClusterNodepoolRequest
     * @return DeleteClusterNodepoolResponse
     */
    public DeleteClusterNodepoolResponse deleteClusterNodepool(String ClusterId, String NodepoolId, DeleteClusterNodepoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterNodepoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @summary Removes nodes from a Container Service for Kubernetes (ACK) cluster. When you remove nodes, you can specify whether to release the Elastic Compute Service (ECS) instances and drain the nodes. When you remove nodes, pods on the nodes are migrated. This may adversely affect your businesses. We recommend that you back up data and perform this operation during off-peak hours.
     *
     * @description > 
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
     *
     * @param request DeleteClusterNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterNodesResponse
     */
    public DeleteClusterNodesResponse deleteClusterNodesWithOptions(String ClusterId, DeleteClusterNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drainNode)) {
            body.put("drain_node", request.drainNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNode)) {
            body.put("release_node", request.releaseNode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterNodes"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterNodesResponse());
    }

    /**
     * @summary Removes nodes from a Container Service for Kubernetes (ACK) cluster. When you remove nodes, you can specify whether to release the Elastic Compute Service (ECS) instances and drain the nodes. When you remove nodes, pods on the nodes are migrated. This may adversely affect your businesses. We recommend that you back up data and perform this operation during off-peak hours.
     *
     * @description > 
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
     *
     * @param request DeleteClusterNodesRequest
     * @return DeleteClusterNodesResponse
     */
    public DeleteClusterNodesResponse deleteClusterNodes(String ClusterId, DeleteClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DeleteEdgeMachine operation to delete a cloud-native box.
     *
     * @param request DeleteEdgeMachineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeMachineResponse
     */
    public DeleteEdgeMachineResponse deleteEdgeMachineWithOptions(String edgeMachineid, DeleteEdgeMachineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeMachine"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines/%5Bedge_machineid%5D"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeMachineResponse());
    }

    /**
     * @summary You can call the DeleteEdgeMachine operation to delete a cloud-native box.
     *
     * @param request DeleteEdgeMachineRequest
     * @return DeleteEdgeMachineResponse
     */
    public DeleteEdgeMachineResponse deleteEdgeMachine(String edgeMachineid, DeleteEdgeMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEdgeMachineWithOptions(edgeMachineid, request, headers, runtime);
    }

    /**
     * @summary You can call the DeleteKubernetesTrigger operation to delete an application trigger by trigger ID
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKubernetesTriggerResponse
     */
    public DeleteKubernetesTriggerResponse deleteKubernetesTriggerWithOptions(String Id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKubernetesTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/triggers/revoke/" + com.aliyun.openapiutil.Client.getEncodeParam(Id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKubernetesTriggerResponse());
    }

    /**
     * @summary You can call the DeleteKubernetesTrigger operation to delete an application trigger by trigger ID
     *
     * @return DeleteKubernetesTriggerResponse
     */
    public DeleteKubernetesTriggerResponse deleteKubernetesTrigger(String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKubernetesTriggerWithOptions(Id, headers, runtime);
    }

    /**
     * @summary Deletes policy instances in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DeletePolicyInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyInstanceResponse
     */
    public DeletePolicyInstanceResponse deletePolicyInstanceWithOptions(String clusterId, String policyName, DeletePolicyInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("instance_name", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyInstanceResponse());
    }

    /**
     * @summary Deletes policy instances in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DeletePolicyInstanceRequest
     * @return DeletePolicyInstanceResponse
     */
    public DeletePolicyInstanceResponse deletePolicyInstance(String clusterId, String policyName, DeletePolicyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePolicyInstanceWithOptions(clusterId, policyName, request, headers, runtime);
    }

    /**
     * @summary You can call the DeleteTemplate operation to delete an orchestration template by template ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(String TemplateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * @summary You can call the DeleteTemplate operation to delete an orchestration template by template ID.
     *
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(TemplateId, headers, runtime);
    }

    /**
     * @summary You can call the DeleteTrigger operation to delete an application trigger.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTriggerWithOptions(String clusterId, String Id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(Id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    /**
     * @summary You can call the DeleteTrigger operation to delete an application trigger.
     *
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(String clusterId, String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTriggerWithOptions(clusterId, Id, headers, runtime);
    }

    /**
     * @summary You can call the DeployPolicyInstance operation to deploy a policy instance in a cluster.
     *
     * @param request DeployPolicyInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployPolicyInstanceResponse
     */
    public DeployPolicyInstanceResponse deployPolicyInstanceWithOptions(String clusterId, String policyName, DeployPolicyInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaces)) {
            body.put("namespaces", request.namespaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployPolicyInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployPolicyInstanceResponse());
    }

    /**
     * @summary You can call the DeployPolicyInstance operation to deploy a policy instance in a cluster.
     *
     * @param request DeployPolicyInstanceRequest
     * @return DeployPolicyInstanceResponse
     */
    public DeployPolicyInstanceResponse deployPolicyInstance(String clusterId, String policyName, DeployPolicyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployPolicyInstanceWithOptions(clusterId, policyName, request, headers, runtime);
    }

    /**
     * @summary You can call the DescirbeWorkflow operation to query detailed information about a workflow.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescirbeWorkflowResponse
     */
    public DescirbeWorkflowResponse descirbeWorkflowWithOptions(String workflowName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescirbeWorkflow"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gs/workflow/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescirbeWorkflowResponse());
    }

    /**
     * @summary You can call the DescirbeWorkflow operation to query detailed information about a workflow.
     *
     * @return DescirbeWorkflowResponse
     */
    public DescirbeWorkflowResponse descirbeWorkflow(String workflowName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.descirbeWorkflowWithOptions(workflowName, headers, runtime);
    }

    /**
     * @summary 查询指定集群组件
     *
     * @param request DescribeAddonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddonResponse
     */
    public DescribeAddonResponse describeAddonWithOptions(String addonName, DescribeAddonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVersion)) {
            query.put("cluster_version", request.clusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddon"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons/" + com.aliyun.openapiutil.Client.getEncodeParam(addonName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddonResponse());
    }

    /**
     * @summary 查询指定集群组件
     *
     * @param request DescribeAddonRequest
     * @return DescribeAddonResponse
     */
    public DescribeAddonResponse describeAddon(String addonName, DescribeAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAddonWithOptions(addonName, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeAddons is deprecated
     *
     * @summary You can call the DescribeAddons operation to query the details about all components that are supported by Container Service for Kubernetes (ACK).
     *
     * @param request DescribeAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddonsResponse
     */
    // Deprecated
    public DescribeAddonsResponse describeAddonsWithOptions(DescribeAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterProfile)) {
            query.put("cluster_profile", request.clusterProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVersion)) {
            query.put("cluster_version", request.clusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddons"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/components/metadata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddonsResponse());
    }

    /**
     * @deprecated OpenAPI DescribeAddons is deprecated
     *
     * @summary You can call the DescribeAddons operation to query the details about all components that are supported by Container Service for Kubernetes (ACK).
     *
     * @param request DescribeAddonsRequest
     * @return DescribeAddonsResponse
     */
    // Deprecated
    public DescribeAddonsResponse describeAddons(DescribeAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAddonsWithOptions(request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated
     *
     * @summary You can call the DescribeClusterAddonInstance operation to query the information about a cluster component, including the version, status, and configuration of the component.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonInstanceResponse
     */
    // Deprecated
    public DescribeClusterAddonInstanceResponse describeClusterAddonInstanceWithOptions(String ClusterID, String AddonName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAddonInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterID) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(AddonName) + "/instance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAddonInstanceResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated
     *
     * @summary You can call the DescribeClusterAddonInstance operation to query the information about a cluster component, including the version, status, and configuration of the component.
     *
     * @return DescribeClusterAddonInstanceResponse
     */
    // Deprecated
    public DescribeClusterAddonInstanceResponse describeClusterAddonInstance(String ClusterID, String AddonName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonInstanceWithOptions(ClusterID, AddonName, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated
     *
     * @summary You can call the DescribeClusterAddonMetadata operation to query the metadata of a component version. The metadata includes the component version and available parameters.
     *
     * @param request DescribeClusterAddonMetadataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonMetadataResponse
     */
    // Deprecated
    public DescribeClusterAddonMetadataResponse describeClusterAddonMetadataWithOptions(String clusterId, String componentId, DescribeClusterAddonMetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAddonMetadata"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentId) + "/metadata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAddonMetadataResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated
     *
     * @summary You can call the DescribeClusterAddonMetadata operation to query the metadata of a component version. The metadata includes the component version and available parameters.
     *
     * @param request DescribeClusterAddonMetadataRequest
     * @return DescribeClusterAddonMetadataResponse
     */
    // Deprecated
    public DescribeClusterAddonMetadataResponse describeClusterAddonMetadata(String clusterId, String componentId, DescribeClusterAddonMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonMetadataWithOptions(clusterId, componentId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated
     *
     * @summary You can call the DescribeClusterAddonUpgradeStatus operation to query the update progress of a cluster component.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    // Deprecated
    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatusWithOptions(String ClusterId, String ComponentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAddonUpgradeStatus"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(ComponentId) + "/upgradestatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAddonUpgradeStatusResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated
     *
     * @summary You can call the DescribeClusterAddonUpgradeStatus operation to query the update progress of a cluster component.
     *
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    // Deprecated
    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatus(String ClusterId, String ComponentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonUpgradeStatusWithOptions(ClusterId, ComponentId, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated
     *
     * @summary You can call the DescribeClusterAddonsUpgradeStatus operation to query the update progress of a component by component name.
     *
     * @param tmpReq DescribeClusterAddonsUpgradeStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    // Deprecated
    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatusWithOptions(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeClusterAddonsUpgradeStatusShrinkRequest request = new DescribeClusterAddonsUpgradeStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.componentIds)) {
            request.componentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.componentIds, "componentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentIdsShrink)) {
            query.put("componentIds", request.componentIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAddonsUpgradeStatus"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/upgradestatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAddonsUpgradeStatusResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated
     *
     * @summary You can call the DescribeClusterAddonsUpgradeStatus operation to query the update progress of a component by component name.
     *
     * @param request DescribeClusterAddonsUpgradeStatusRequest
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    // Deprecated
    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatus(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsUpgradeStatusWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated
     *
     * @summary You can call the DescribeClusterAddonsVersion operation to query the details about all components in a cluster by cluster ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonsVersionResponse
     */
    // Deprecated
    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersionWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAddonsVersion"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/version"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAddonsVersionResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated
     *
     * @summary You can call the DescribeClusterAddonsVersion operation to query the details about all components in a cluster by cluster ID.
     *
     * @return DescribeClusterAddonsVersionResponse
     */
    // Deprecated
    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersion(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsVersionWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary Queries the script that is used to add existing nodes to a Container Service for Kubernetes (ACK) cluster. You can manually add existing Elastic Compute Service (ECS) instances to an ACK cluster as worker nodes or re-add the worker nodes that you have removed to a node pool.
     *
     * @param request DescribeClusterAttachScriptsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAttachScriptsResponse
     */
    public DescribeClusterAttachScriptsResponse describeClusterAttachScriptsWithOptions(String ClusterId, DescribeClusterAttachScriptsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arch)) {
            body.put("arch", request.arch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatDisk)) {
            body.put("format_disk", request.formatDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepInstanceName)) {
            body.put("keep_instance_name", request.keepInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAttachScripts"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/attachscript"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAttachScriptsResponse());
    }

    /**
     * @summary Queries the script that is used to add existing nodes to a Container Service for Kubernetes (ACK) cluster. You can manually add existing Elastic Compute Service (ECS) instances to an ACK cluster as worker nodes or re-add the worker nodes that you have removed to a node pool.
     *
     * @param request DescribeClusterAttachScriptsRequest
     * @return DescribeClusterAttachScriptsResponse
     */
    public DescribeClusterAttachScriptsResponse describeClusterAttachScripts(String ClusterId, DescribeClusterAttachScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAttachScriptsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterDetail operation to query the details of a Container Service for Kubernetes (ACK) cluster by cluster ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterDetailResponse
     */
    public DescribeClusterDetailResponse describeClusterDetailWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterDetail"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterDetailResponse());
    }

    /**
     * @summary You can call the DescribeClusterDetail operation to query the details of a Container Service for Kubernetes (ACK) cluster by cluster ID.
     *
     * @return DescribeClusterDetailResponse
     */
    public DescribeClusterDetailResponse describeClusterDetail(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterDetailWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary Queries events and event details in a Container Service for Kubernetes (ACK) cluster, including the severity level, status, and start time of each event. Events are generated when clusters created, modified, and updated, node pools are created and scaled out, and components are installed.
     *
     * @param request DescribeClusterEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterEventsResponse
     */
    public DescribeClusterEventsResponse describeClusterEventsWithOptions(String ClusterId, DescribeClusterEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("task_id", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterEvents"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterEventsResponse());
    }

    /**
     * @summary Queries events and event details in a Container Service for Kubernetes (ACK) cluster, including the severity level, status, and start time of each event. Events are generated when clusters created, modified, and updated, node pools are created and scaled out, and components are installed.
     *
     * @param request DescribeClusterEventsRequest
     * @return DescribeClusterEventsResponse
     */
    public DescribeClusterEventsResponse describeClusterEvents(String ClusterId, DescribeClusterEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterEventsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Queries the cluster log to help analyze cluster issues and locate the cause.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterLogsResponse
     */
    public DescribeClusterLogsResponse describeClusterLogsWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterLogs"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterLogsResponse());
    }

    /**
     * @summary Queries the cluster log to help analyze cluster issues and locate the cause.
     *
     * @return DescribeClusterLogsResponse
     */
    public DescribeClusterLogsResponse describeClusterLogs(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterLogsWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterNodePoolDetail.html operation to query the details about a node pool in a cluster by node pool ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterNodePoolDetailResponse
     */
    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetailWithOptions(String ClusterId, String NodepoolId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterNodePoolDetail"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNodePoolDetailResponse());
    }

    /**
     * @summary You can call the DescribeClusterNodePoolDetail.html operation to query the details about a node pool in a cluster by node pool ID.
     *
     * @return DescribeClusterNodePoolDetailResponse
     */
    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetail(String ClusterId, String NodepoolId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolDetailWithOptions(ClusterId, NodepoolId, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterNodePools operation to query node pools in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DescribeClusterNodePoolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterNodePoolsResponse
     */
    public DescribeClusterNodePoolsResponse describeClusterNodePoolsWithOptions(String ClusterId, DescribeClusterNodePoolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolName)) {
            query.put("NodepoolName", request.nodepoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterNodePools"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNodePoolsResponse());
    }

    /**
     * @summary You can call the DescribeClusterNodePools operation to query node pools in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     */
    public DescribeClusterNodePoolsResponse describeClusterNodePools(String ClusterId, DescribeClusterNodePoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterNodes operation to query the details about all nodes in a cluster by cluster ID.
     *
     * @param request DescribeClusterNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterNodesResponse
     */
    public DescribeClusterNodesResponse describeClusterNodesWithOptions(String ClusterId, DescribeClusterNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            query.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterNodes"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNodesResponse());
    }

    /**
     * @summary You can call the DescribeClusterNodes operation to query the details about all nodes in a cluster by cluster ID.
     *
     * @param request DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     */
    public DescribeClusterNodesResponse describeClusterNodes(String ClusterId, DescribeClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterResources operation to query all resources in a cluster by cluster ID.
     *
     * @param request DescribeClusterResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResourcesResponse
     */
    public DescribeClusterResourcesResponse describeClusterResourcesWithOptions(String ClusterId, DescribeClusterResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withAddonResources)) {
            query.put("with_addon_resources", request.withAddonResources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterResources"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResourcesResponse());
    }

    /**
     * @summary You can call the DescribeClusterResources operation to query all resources in a cluster by cluster ID.
     *
     * @param request DescribeClusterResourcesRequest
     * @return DescribeClusterResourcesResponse
     */
    public DescribeClusterResourcesResponse describeClusterResources(String ClusterId, DescribeClusterResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterResourcesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Queries tasks in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DescribeClusterTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterTasksResponse
     */
    public DescribeClusterTasksResponse describeClusterTasksWithOptions(String clusterId, DescribeClusterTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterTasks"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterTasksResponse());
    }

    /**
     * @summary Queries tasks in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request DescribeClusterTasksRequest
     * @return DescribeClusterTasksResponse
     */
    public DescribeClusterTasksResponse describeClusterTasks(String clusterId, DescribeClusterTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterTasksWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @summary Kubeconfig files store identity and authentication information that is used by clients to access Container Service for Kubernetes (ACK) clusters. To use a kubectl client to manage an ACK cluster, you need to use the corresponding kubeconfig file to connect to the ACK cluster. We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.
     *
     * @description **
     * ****The default validity period of a kubeconfig file is 3 years. Two months before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the secret is valid for 3 years. The previous kubeconfig secret remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.
     *
     * @param request DescribeClusterUserKubeconfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterUserKubeconfigResponse
     */
    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfigWithOptions(String ClusterId, DescribeClusterUserKubeconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temporaryDurationMinutes)) {
            query.put("TemporaryDurationMinutes", request.temporaryDurationMinutes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterUserKubeconfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/user_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterUserKubeconfigResponse());
    }

    /**
     * @summary Kubeconfig files store identity and authentication information that is used by clients to access Container Service for Kubernetes (ACK) clusters. To use a kubectl client to manage an ACK cluster, you need to use the corresponding kubeconfig file to connect to the ACK cluster. We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.
     *
     * @description **
     * ****The default validity period of a kubeconfig file is 3 years. Two months before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the secret is valid for 3 years. The previous kubeconfig secret remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.
     *
     * @param request DescribeClusterUserKubeconfigRequest
     * @return DescribeClusterUserKubeconfigResponse
     */
    public DescribeClusterUserKubeconfigResponse describeClusterUserKubeconfig(String ClusterId, DescribeClusterUserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterUserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated
     *
     * @summary 获取集群kubeconfig接口
     *
     * @param request DescribeClusterV2UserKubeconfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    // Deprecated
    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfigWithOptions(String ClusterId, DescribeClusterV2UserKubeconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterV2UserKubeconfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/user_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterV2UserKubeconfigResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated
     *
     * @summary 获取集群kubeconfig接口
     *
     * @param request DescribeClusterV2UserKubeconfigRequest
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    // Deprecated
    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfig(String ClusterId, DescribeClusterV2UserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterV2UserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClusterVuls operation to query the vulnerability information of a cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterVulsResponse
     */
    public DescribeClusterVulsResponse describeClusterVulsWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterVuls"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/vuls"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterVulsResponse());
    }

    /**
     * @summary You can call the DescribeClusterVuls operation to query the vulnerability information of a cluster.
     *
     * @return DescribeClusterVulsResponse
     */
    public DescribeClusterVulsResponse describeClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DescribeClusters is deprecated
     *
     * @summary You can call the DescribeClusters operation to query all the clusters that belong to the current Alibaba Cloud account, including Kubernetes clusters and Swarm clusters.
     *
     * @param request DescribeClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClustersResponse
     */
    // Deprecated
    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("clusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusters"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClustersResponse());
    }

    /**
     * @deprecated OpenAPI DescribeClusters is deprecated
     *
     * @summary You can call the DescribeClusters operation to query all the clusters that belong to the current Alibaba Cloud account, including Kubernetes clusters and Swarm clusters.
     *
     * @param request DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    // Deprecated
    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeClustersV1 operation to query the details about all Container Service for Kubernetes (ACK) clusters.
     *
     * @param request DescribeClustersV1Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClustersV1Response
     */
    public DescribeClustersV1Response describeClustersV1WithOptions(DescribeClustersV1Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClustersV1"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClustersV1Response());
    }

    /**
     * @summary You can call the DescribeClustersV1 operation to query the details about all Container Service for Kubernetes (ACK) clusters.
     *
     * @param request DescribeClustersV1Request
     * @return DescribeClustersV1Response
     */
    public DescribeClustersV1Response describeClustersV1(DescribeClustersV1Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersV1WithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeEdgeMachineActiveProcess operation to query the activation progress of a cloud-native box.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeMachineActiveProcessResponse
     */
    public DescribeEdgeMachineActiveProcessResponse describeEdgeMachineActiveProcessWithOptions(String edgeMachineid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeMachineActiveProcess"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines/%5Bedge_machineid%5D/activeprocess"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeMachineActiveProcessResponse());
    }

    /**
     * @summary You can call the DescribeEdgeMachineActiveProcess operation to query the activation progress of a cloud-native box.
     *
     * @return DescribeEdgeMachineActiveProcessResponse
     */
    public DescribeEdgeMachineActiveProcessResponse describeEdgeMachineActiveProcess(String edgeMachineid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineActiveProcessWithOptions(edgeMachineid, headers, runtime);
    }

    /**
     * @summary You can call the DescribeEdgeMachineModels operation to query the cloud-native box models.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeMachineModelsResponse
     */
    public DescribeEdgeMachineModelsResponse describeEdgeMachineModelsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeMachineModels"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines/models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeMachineModelsResponse());
    }

    /**
     * @summary You can call the DescribeEdgeMachineModels operation to query the cloud-native box models.
     *
     * @return DescribeEdgeMachineModelsResponse
     */
    public DescribeEdgeMachineModelsResponse describeEdgeMachineModels() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineModelsWithOptions(headers, runtime);
    }

    /**
     * @summary You can call the DescribeEdgeMachineTunnelConfigDetail operation to obtain the SSH token of a cloud-native box.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeMachineTunnelConfigDetailResponse
     */
    public DescribeEdgeMachineTunnelConfigDetailResponse describeEdgeMachineTunnelConfigDetailWithOptions(String edgeMachineid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeMachineTunnelConfigDetail"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines/%5Bedge_machineid%5D/tunnelconfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeMachineTunnelConfigDetailResponse());
    }

    /**
     * @summary You can call the DescribeEdgeMachineTunnelConfigDetail operation to obtain the SSH token of a cloud-native box.
     *
     * @return DescribeEdgeMachineTunnelConfigDetailResponse
     */
    public DescribeEdgeMachineTunnelConfigDetailResponse describeEdgeMachineTunnelConfigDetail(String edgeMachineid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachineTunnelConfigDetailWithOptions(edgeMachineid, headers, runtime);
    }

    /**
     * @summary You can call the DescribeEdgeMachines operation to query a list of cloud-native boxes.
     *
     * @param request DescribeEdgeMachinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeMachinesResponse
     */
    public DescribeEdgeMachinesResponse describeEdgeMachinesWithOptions(DescribeEdgeMachinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifeState)) {
            query.put("life_state", request.lifeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineState)) {
            query.put("online_state", request.onlineState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeMachines"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/edge_machines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeMachinesResponse());
    }

    /**
     * @summary You can call the DescribeEdgeMachines operation to query a list of cloud-native boxes.
     *
     * @param request DescribeEdgeMachinesRequest
     * @return DescribeEdgeMachinesResponse
     */
    public DescribeEdgeMachinesResponse describeEdgeMachines(DescribeEdgeMachinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdgeMachinesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries detailed information about a type of events, including the severity level, status, and start time of each event. Events are generated when clusters are created, modified, and updated, node pools are created and scaled out, and components are installed.
     *
     * @param request DescribeEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    /**
     * @summary Queries detailed information about a type of events, including the severity level, status, and start time of each event. Events are generated when clusters are created, modified, and updated, node pools are created and scaled out, and components are installed.
     *
     * @param request DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventsWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeExternalAgent operation to query the agent configurations of a registered cluster by cluster ID.
     *
     * @description For more information, see [Register an external Kubernetes cluster](https://help.aliyun.com/document_detail/121053.html).
     *
     * @param request DescribeExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExternalAgentResponse
     */
    public DescribeExternalAgentResponse describeExternalAgentWithOptions(String ClusterId, DescribeExternalAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentMode)) {
            query.put("AgentMode", request.agentMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExternalAgent"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/external/agent/deployment"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExternalAgentResponse());
    }

    /**
     * @summary You can call the DescribeExternalAgent operation to query the agent configurations of a registered cluster by cluster ID.
     *
     * @description For more information, see [Register an external Kubernetes cluster](https://help.aliyun.com/document_detail/121053.html).
     *
     * @param request DescribeExternalAgentRequest
     * @return DescribeExternalAgentResponse
     */
    public DescribeExternalAgentResponse describeExternalAgent(String ClusterId, DescribeExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExternalAgentWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Queries the detailed information about Kubernetes versions, including the version number, release date, expiration date, compatible OSs, and runtime.
     *
     * @param request DescribeKubernetesVersionMetadataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKubernetesVersionMetadataResponse
     */
    public DescribeKubernetesVersionMetadataResponse describeKubernetesVersionMetadataWithOptions(DescribeKubernetesVersionMetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesVersion)) {
            query.put("KubernetesVersion", request.kubernetesVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("Profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUpgradableVersion)) {
            query.put("QueryUpgradableVersion", request.queryUpgradableVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            query.put("runtime", request.runtime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKubernetesVersionMetadata"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/metadata/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKubernetesVersionMetadataResponse());
    }

    /**
     * @summary Queries the detailed information about Kubernetes versions, including the version number, release date, expiration date, compatible OSs, and runtime.
     *
     * @param request DescribeKubernetesVersionMetadataRequest
     * @return DescribeKubernetesVersionMetadataResponse
     */
    public DescribeKubernetesVersionMetadataResponse describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeKubernetesVersionMetadataWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the vulnerability information of a node pool, such as vulnerability names and severity levels, by specifying the ID of the node pool. We recommend that you periodically scan node pools for vulnerabilities to enhance cluster security.
     *
     * @param request DescribeNodePoolVulsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodePoolVulsResponse
     */
    public DescribeNodePoolVulsResponse describeNodePoolVulsWithOptions(String clusterId, String nodepoolId, DescribeNodePoolVulsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.necessity)) {
            query.put("necessity", request.necessity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodePoolVuls"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/vuls"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodePoolVulsResponse());
    }

    /**
     * @summary Queries the vulnerability information of a node pool, such as vulnerability names and severity levels, by specifying the ID of the node pool. We recommend that you periodically scan node pools for vulnerabilities to enhance cluster security.
     *
     * @param request DescribeNodePoolVulsRequest
     * @return DescribeNodePoolVulsResponse
     */
    public DescribeNodePoolVulsResponse describeNodePoolVuls(String clusterId, String nodepoolId, DescribeNodePoolVulsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNodePoolVulsWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the DescribePolicies operation to query a list of policies.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePoliciesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicies"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePoliciesResponse());
    }

    /**
     * @summary You can call the DescribePolicies operation to query a list of policies.
     *
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePolicies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePoliciesWithOptions(headers, runtime);
    }

    /**
     * @summary Container security policies for Container Service for Kubernetes (ACK) clusters offer a variety of built-in policies, including cis-k8s, infra, k8s-general, and PodSecurityPolicy. You can use these policies to ensure the security of containers running in a production environment. You can call the DescribePolicyDetails operation to query information about a policy, such as the content, action, and severity level of the policy.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetailsWithOptions(String policyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyDetails"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyDetailsResponse());
    }

    /**
     * @summary Container security policies for Container Service for Kubernetes (ACK) clusters offer a variety of built-in policies, including cis-k8s, infra, k8s-general, and PodSecurityPolicy. You can use these policies to ensure the security of containers running in a production environment. You can call the DescribePolicyDetails operation to query information about a policy, such as the content, action, and severity level of the policy.
     *
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetails(String policyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyDetailsWithOptions(policyName, headers, runtime);
    }

    /**
     * @summary You can call the DescribePolicyGovernanceInCluster operation to query information about policies in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInClusterWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyGovernanceInCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policygovernance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyGovernanceInClusterResponse());
    }

    /**
     * @summary You can call the DescribePolicyGovernanceInCluster operation to query information about policies in a Container Service for Kubernetes (ACK) cluster.
     *
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInCluster(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyGovernanceInClusterWithOptions(clusterId, headers, runtime);
    }

    /**
     * @summary Queries the detailed information about policy instances of the specified type in a Container Service for Kubernetes (ACK) cluster, such as the policy description and severity level. You can choose a type of security policy for an ACK cluster, specify the action and applicable scope of the policy, and then create and deploy a policy instance.
     *
     * @param request DescribePolicyInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyInstancesResponse
     */
    public DescribePolicyInstancesResponse describePolicyInstancesWithOptions(String clusterId, DescribePolicyInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("instance_name", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policy_name", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyInstances"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyInstancesResponse());
    }

    /**
     * @summary Queries the detailed information about policy instances of the specified type in a Container Service for Kubernetes (ACK) cluster, such as the policy description and severity level. You can choose a type of security policy for an ACK cluster, specify the action and applicable scope of the policy, and then create and deploy a policy instance.
     *
     * @param request DescribePolicyInstancesRequest
     * @return DescribePolicyInstancesResponse
     */
    public DescribePolicyInstancesResponse describePolicyInstances(String clusterId, DescribePolicyInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @summary Queries the deployment of policy instances in the current Container Service for Kubernetes (ACK) cluster, including the number of policy instances of each type and the number of policy types of each severity level.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatusWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyInstancesStatus"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policies/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyInstancesStatusResponse());
    }

    /**
     * @summary Queries the deployment of policy instances in the current Container Service for Kubernetes (ACK) cluster, including the number of policy instances of each type and the number of policy types of each severity level.
     *
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatus(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesStatusWithOptions(clusterId, headers, runtime);
    }

    /**
     * @summary You can use an Alibaba Cloud account to call the DescribeSubaccountK8sClusterUserConfig operation to obtain the cluster kubeconfig file of a RAM user or RAM role.
     *
     * @description **
     * ****Only Alibaba Cloud accounts can call this API operation.
     *
     * @param request DescribeSubaccountK8sClusterUserConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubaccountK8sClusterUserConfigResponse
     */
    public DescribeSubaccountK8sClusterUserConfigResponse describeSubaccountK8sClusterUserConfigWithOptions(String ClusterId, String Uid, DescribeSubaccountK8sClusterUserConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.temporaryDurationMinutes)) {
            query.put("TemporaryDurationMinutes", request.temporaryDurationMinutes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubaccountK8sClusterUserConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(Uid) + "/user_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubaccountK8sClusterUserConfigResponse());
    }

    /**
     * @summary You can use an Alibaba Cloud account to call the DescribeSubaccountK8sClusterUserConfig operation to obtain the cluster kubeconfig file of a RAM user or RAM role.
     *
     * @description **
     * ****Only Alibaba Cloud accounts can call this API operation.
     *
     * @param request DescribeSubaccountK8sClusterUserConfigRequest
     * @return DescribeSubaccountK8sClusterUserConfigResponse
     */
    public DescribeSubaccountK8sClusterUserConfigResponse describeSubaccountK8sClusterUserConfig(String ClusterId, String Uid, DescribeSubaccountK8sClusterUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSubaccountK8sClusterUserConfigWithOptions(ClusterId, Uid, request, headers, runtime);
    }

    /**
     * @summary Queries detailed information about a task, such as the task type, status, and progress.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskInfoResponse
     */
    public DescribeTaskInfoResponse describeTaskInfoWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskInfo"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskInfoResponse());
    }

    /**
     * @summary Queries detailed information about a task, such as the task type, status, and progress.
     *
     * @return DescribeTaskInfoResponse
     */
    public DescribeTaskInfoResponse describeTaskInfo(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskInfoWithOptions(taskId, headers, runtime);
    }

    /**
     * @summary An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.
     *
     * @param request DescribeTemplateAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateAttributeResponse
     */
    public DescribeTemplateAttributeResponse describeTemplateAttributeWithOptions(String TemplateId, DescribeTemplateAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("template_type", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplateAttribute"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateAttributeResponse());
    }

    /**
     * @summary An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.
     *
     * @param request DescribeTemplateAttributeRequest
     * @return DescribeTemplateAttributeResponse
     */
    public DescribeTemplateAttributeResponse describeTemplateAttribute(String TemplateId, DescribeTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplateAttributeWithOptions(TemplateId, request, headers, runtime);
    }

    /**
     * @summary An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.
     *
     * @param request DescribeTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("page_num", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("template_type", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplates"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplatesResponse());
    }

    /**
     * @summary An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.
     *
     * @param request DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the DescribeTrigger operation to query triggers.
     *
     * @param request DescribeTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTriggerResponse
     */
    public DescribeTriggerResponse describeTriggerWithOptions(String clusterId, DescribeTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/triggers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTriggerResponse());
    }

    /**
     * @summary You can call the DescribeTrigger operation to query triggers.
     *
     * @param request DescribeTriggerRequest
     * @return DescribeTriggerResponse
     */
    public DescribeTriggerResponse describeTrigger(String clusterId, DescribeTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTriggerWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @summary Queries the Role-Based Access Control (RBAC) permissions that are granted to the current Resource Access Management (RAM) user or RAM role on a Container Service for Kubernetes (ACK) cluster. You can use Kubernetes namespaces to limit users from accessing resources in an ACK cluster. Users that are granted RBAC permissions only on one namespace cannot access resources in other namespaces.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserClusterNamespacesResponse
     */
    public DescribeUserClusterNamespacesResponse describeUserClusterNamespacesWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserClusterNamespaces"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/namespaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserClusterNamespacesResponse());
    }

    /**
     * @summary Queries the Role-Based Access Control (RBAC) permissions that are granted to the current Resource Access Management (RAM) user or RAM role on a Container Service for Kubernetes (ACK) cluster. You can use Kubernetes namespaces to limit users from accessing resources in an ACK cluster. Users that are granted RBAC permissions only on one namespace cannot access resources in other namespaces.
     *
     * @return DescribeUserClusterNamespacesResponse
     */
    public DescribeUserClusterNamespacesResponse describeUserClusterNamespaces(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserClusterNamespacesWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary In an Container Service for Kubernetes (ACK) cluster, you can create and specify different Resource Access Management (RAM) users or roles to have different access permissions. This ensures access control and resource isolation. You can call the DescribeUserPermission operation to query the permissions that are granted to a RAM user or RAM role on ACK clusters, including the resources that are allowed to access, the scope of the permissions, the predefined role, and the permission source.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserPermissionResponse
     */
    public DescribeUserPermissionResponse describeUserPermissionWithOptions(String uid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserPermission"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/permissions/users/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserPermissionResponse());
    }

    /**
     * @summary In an Container Service for Kubernetes (ACK) cluster, you can create and specify different Resource Access Management (RAM) users or roles to have different access permissions. This ensures access control and resource isolation. You can call the DescribeUserPermission operation to query the permissions that are granted to a RAM user or RAM role on ACK clusters, including the resources that are allowed to access, the scope of the permissions, the predefined role, and the permission source.
     *
     * @return DescribeUserPermissionResponse
     */
    public DescribeUserPermissionResponse describeUserPermission(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserPermissionWithOptions(uid, headers, runtime);
    }

    /**
     * @summary Queries quotas related to Container Service for Kubernetes (ACK) clusters, node pools, and nodes. To increase a quota, submit an application in the Quota Center console.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuotaWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserQuota"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/quota"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserQuotaResponse());
    }

    /**
     * @summary Queries quotas related to Container Service for Kubernetes (ACK) clusters, node pools, and nodes. To increase a quota, submit an application in the Quota Center console.
     *
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserQuotaWithOptions(headers, runtime);
    }

    /**
     * @summary You can call the DescribeWorkflows operation to query all workflows.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkflowsResponse
     */
    public DescribeWorkflowsResponse describeWorkflowsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkflows"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gs/workflows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkflowsResponse());
    }

    /**
     * @summary You can call the DescribeWorkflows operation to query all workflows.
     *
     * @return DescribeWorkflowsResponse
     */
    public DescribeWorkflowsResponse describeWorkflows() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWorkflowsWithOptions(headers, runtime);
    }

    /**
     * @summary You can call the EdgeClusterAddEdgeMachine operation to add a cloud-native box to a Container Service for Kubernetes (ACK) Edge cluster.
     *
     * @param request EdgeClusterAddEdgeMachineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EdgeClusterAddEdgeMachineResponse
     */
    public EdgeClusterAddEdgeMachineResponse edgeClusterAddEdgeMachineWithOptions(String clusterid, String edgeMachineid, EdgeClusterAddEdgeMachineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            body.put("expired", request.expired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            body.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EdgeClusterAddEdgeMachine"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/%5Bclusterid%5D/attachedgemachine/%5Bedge_machineid%5D"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EdgeClusterAddEdgeMachineResponse());
    }

    /**
     * @summary You can call the EdgeClusterAddEdgeMachine operation to add a cloud-native box to a Container Service for Kubernetes (ACK) Edge cluster.
     *
     * @param request EdgeClusterAddEdgeMachineRequest
     * @return EdgeClusterAddEdgeMachineResponse
     */
    public EdgeClusterAddEdgeMachineResponse edgeClusterAddEdgeMachine(String clusterid, String edgeMachineid, EdgeClusterAddEdgeMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.edgeClusterAddEdgeMachineWithOptions(clusterid, edgeMachineid, request, headers, runtime);
    }

    /**
     * @summary Patches node vulnerabilities in a node pool to enhance node security. Cloud Security provided by Alibaba Cloud periodically scans Elastic Compute Service (ECS) instances for vulnerabilities and provides suggestions on how to patch the detected vulnerabilities. Vulnerability patching may require node restarts. Make sure that your cluster has sufficient idle nodes for node draining.
     *
     * @description 1.  The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).
     * 2.  ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.
     * 3.  Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.
     * 4.  CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.
     *
     * @param request FixNodePoolVulsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FixNodePoolVulsResponse
     */
    public FixNodePoolVulsResponse fixNodePoolVulsWithOptions(String clusterId, String nodepoolId, FixNodePoolVulsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRestart)) {
            body.put("auto_restart", request.autoRestart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolloutPolicy)) {
            body.put("rollout_policy", request.rolloutPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vuls)) {
            body.put("vuls", request.vuls);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FixNodePoolVuls"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/vuls/fix"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FixNodePoolVulsResponse());
    }

    /**
     * @summary Patches node vulnerabilities in a node pool to enhance node security. Cloud Security provided by Alibaba Cloud periodically scans Elastic Compute Service (ECS) instances for vulnerabilities and provides suggestions on how to patch the detected vulnerabilities. Vulnerability patching may require node restarts. Make sure that your cluster has sufficient idle nodes for node draining.
     *
     * @description 1.  The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).
     * 2.  ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.
     * 3.  Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.
     * 4.  CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.
     *
     * @param request FixNodePoolVulsRequest
     * @return FixNodePoolVulsResponse
     */
    public FixNodePoolVulsResponse fixNodePoolVuls(String clusterId, String nodepoolId, FixNodePoolVulsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fixNodePoolVulsWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the GetClusterAddonInstance operation to query the information of a component instance in a cluster, including the version, configurations, and log status of the component instance.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterAddonInstanceResponse
     */
    public GetClusterAddonInstanceResponse getClusterAddonInstanceWithOptions(String clusterId, String instanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterAddonInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/addon_instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterAddonInstanceResponse());
    }

    /**
     * @summary You can call the GetClusterAddonInstance operation to query the information of a component instance in a cluster, including the version, configurations, and log status of the component instance.
     *
     * @return GetClusterAddonInstanceResponse
     */
    public GetClusterAddonInstanceResponse getClusterAddonInstance(String clusterId, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterAddonInstanceWithOptions(clusterId, instanceName, headers, runtime);
    }

    /**
     * @summary Queries a cluster check task by cluster ID and task ID. You can view the status, check items, creation time, and end time of the task. Container Intelligence Service (CIS) provides a variety of Kubernetes cluster check features, including cluster update check, cluster migration check, component installation check, component update check, and node pool check.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterCheckResponse
     */
    public GetClusterCheckResponse getClusterCheckWithOptions(String clusterId, String checkId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterCheck"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/checks/" + com.aliyun.openapiutil.Client.getEncodeParam(checkId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterCheckResponse());
    }

    /**
     * @summary Queries a cluster check task by cluster ID and task ID. You can view the status, check items, creation time, and end time of the task. Container Intelligence Service (CIS) provides a variety of Kubernetes cluster check features, including cluster update check, cluster migration check, component installation check, component update check, and node pool check.
     *
     * @return GetClusterCheckResponse
     */
    public GetClusterCheckResponse getClusterCheck(String clusterId, String checkId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterCheckWithOptions(clusterId, checkId, headers, runtime);
    }

    /**
     * @summary You can call the GetKubernetesTrigger operationto query the triggers of an application by application name.
     *
     * @param request GetKubernetesTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKubernetesTriggerResponse
     */
    public GetKubernetesTriggerResponse getKubernetesTriggerWithOptions(String ClusterId, GetKubernetesTriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKubernetesTrigger"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/triggers/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKubernetesTriggerResponse());
    }

    /**
     * @summary You can call the GetKubernetesTrigger operationto query the triggers of an application by application name.
     *
     * @param request GetKubernetesTriggerRequest
     * @return GetKubernetesTriggerResponse
     */
    public GetKubernetesTriggerResponse getKubernetesTrigger(String ClusterId, GetKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKubernetesTriggerWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the GetUpgradeStatus operation to query the update progress of a cluster by cluster ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUpgradeStatusResponse
     */
    public GetUpgradeStatusResponse getUpgradeStatusWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUpgradeStatus"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/upgrade/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUpgradeStatusResponse());
    }

    /**
     * @summary You can call the GetUpgradeStatus operation to query the update progress of a cluster by cluster ID.
     *
     * @return GetUpgradeStatusResponse
     */
    public GetUpgradeStatusResponse getUpgradeStatus(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeStatusWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the GrantPermissions operation to grant a Resource Access Management (RAM) user the permissions to manage Container Service for Kubernetes (ACK) clusters.
     *
     * @description ****
     * *   Make sure that you have granted the RAM user at least read-only permissions on the desired ACK clusters in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error code is returned. For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](https://help.aliyun.com/document_detail/86485.html).
     * *   If you use a RAM user to call this API operation, make sure that the RAM user is authorized to modify the permissions of other RAM users on the desired ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` error code is returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](https://help.aliyun.com/document_detail/119035.html).
     * *   This operation overwrites the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.
     *
     * @param request GrantPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantPermissionsResponse
     */
    public GrantPermissionsResponse grantPermissionsWithOptions(String uid, GrantPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantPermissions"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/permissions/users/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPermissionsResponse());
    }

    /**
     * @summary You can call the GrantPermissions operation to grant a Resource Access Management (RAM) user the permissions to manage Container Service for Kubernetes (ACK) clusters.
     *
     * @description ****
     * *   Make sure that you have granted the RAM user at least read-only permissions on the desired ACK clusters in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error code is returned. For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](https://help.aliyun.com/document_detail/86485.html).
     * *   If you use a RAM user to call this API operation, make sure that the RAM user is authorized to modify the permissions of other RAM users on the desired ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` error code is returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](https://help.aliyun.com/document_detail/119035.html).
     * *   This operation overwrites the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.
     *
     * @param request GrantPermissionsRequest
     * @return GrantPermissionsResponse
     */
    public GrantPermissionsResponse grantPermissions(String uid, GrantPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantPermissionsWithOptions(uid, request, headers, runtime);
    }

    /**
     * @summary Installs a component by specifying the name and version of the component. To enhance Kubernetes capabilities, you can install a variety of components in Container Service for Kubernetes (ACK) clusters, such as fully-managed core components and application, logging and monitoring, network, storage, and security group components.
     *
     * @param request InstallClusterAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallClusterAddonsResponse
     */
    public InstallClusterAddonsResponse installClusterAddonsWithOptions(String ClusterId, InstallClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallClusterAddons"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallClusterAddonsResponse());
    }

    /**
     * @summary Installs a component by specifying the name and version of the component. To enhance Kubernetes capabilities, you can install a variety of components in Container Service for Kubernetes (ACK) clusters, such as fully-managed core components and application, logging and monitoring, network, storage, and security group components.
     *
     * @param request InstallClusterAddonsRequest
     * @return InstallClusterAddonsResponse
     */
    public InstallClusterAddonsResponse installClusterAddons(String ClusterId, InstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the ListAddons operation to query all available components in a cluster. You can query all available components in a cluster by specifying the ID of the cluster. You can also specify parameters such as the region, cluster type, cluster subtype (profile), cluster specification, and cluster version to get a list of available components in clusters that meet the conditions.
     *
     * @param request ListAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddonsWithOptions(ListAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("cluster_spec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVersion)) {
            query.put("cluster_version", request.clusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddons"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/addons"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonsResponse());
    }

    /**
     * @summary You can call the ListAddons operation to query all available components in a cluster. You can query all available components in a cluster by specifying the ID of the cluster. You can also specify parameters such as the region, cluster type, cluster subtype (profile), cluster specification, and cluster version to get a list of available components in clusters that meet the conditions.
     *
     * @param request ListAddonsRequest
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddons(ListAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddonsWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the ListClusterAddonInstances operation to query information about the components that are installed in a cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterAddonInstancesResponse
     */
    public ListClusterAddonInstancesResponse listClusterAddonInstancesWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAddonInstances"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/addon_instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAddonInstancesResponse());
    }

    /**
     * @summary You can call the ListClusterAddonInstances operation to query information about the components that are installed in a cluster.
     *
     * @return ListClusterAddonInstancesResponse
     */
    public ListClusterAddonInstancesResponse listClusterAddonInstances(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAddonInstancesWithOptions(clusterId, headers, runtime);
    }

    /**
     * @summary You can call the ListClusterChecks operation to query all the cluster check results of a cluster.
     *
     * @param request ListClusterChecksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterChecksResponse
     */
    public ListClusterChecksResponse listClusterChecksWithOptions(String clusterId, ListClusterChecksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterChecks"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/checks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterChecksResponse());
    }

    /**
     * @summary You can call the ListClusterChecks operation to query all the cluster check results of a cluster.
     *
     * @param request ListClusterChecksRequest
     * @return ListClusterChecksResponse
     */
    public ListClusterChecksResponse listClusterChecks(String clusterId, ListClusterChecksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterChecksWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @summary 获取自动运维执行计划列表
     *
     * @param request ListOperationPlansRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationPlansResponse
     */
    public ListOperationPlansResponse listOperationPlansWithOptions(ListOperationPlansRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationPlans"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/operation/plans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationPlansResponse());
    }

    /**
     * @summary 获取自动运维执行计划列表
     *
     * @param request ListOperationPlansRequest
     * @return ListOperationPlansResponse
     */
    public ListOperationPlansResponse listOperationPlans(ListOperationPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationPlansWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries resource labels and the detailed information, such as the key-value pairs of the labels and the clusters to which the labels are added. You can use labels to classify and manage Container Service for Kubernetes (ACK) clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "resource_ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("resource_ids", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * @summary Queries resource labels and the detailed information, such as the key-value pairs of the labels and the clusters to which the labels are added. You can use labels to classify and manage Container Service for Kubernetes (ACK) clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Container Service for Kubernetes (ACK) Pro clusters are developed based on ACK Basic clusters. ACK Pro clusters provide all benefits of ACK managed clusters, such as fully-managed control planes and control plane high availability. In addition, ACK Pro clusters provide you with enhanced reliability, security, and schedulability. ACK Pro clusters are covered by the SLA that supports compensation clauses. ACK Pro clusters are suitable for large-scale businesses that require high stability and security in production environments. We recommend that you migrate from ACK Basic clusters to ACK Pro clusters.
     *
     * @param request MigrateClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateClusterResponse
     */
    public MigrateClusterResponse migrateClusterWithOptions(String clusterId, MigrateClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketEndpoint)) {
            body.put("oss_bucket_endpoint", request.ossBucketEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            body.put("oss_bucket_name", request.ossBucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/migrate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateClusterResponse());
    }

    /**
     * @summary Container Service for Kubernetes (ACK) Pro clusters are developed based on ACK Basic clusters. ACK Pro clusters provide all benefits of ACK managed clusters, such as fully-managed control planes and control plane high availability. In addition, ACK Pro clusters provide you with enhanced reliability, security, and schedulability. ACK Pro clusters are covered by the SLA that supports compensation clauses. ACK Pro clusters are suitable for large-scale businesses that require high stability and security in production environments. We recommend that you migrate from ACK Basic clusters to ACK Pro clusters.
     *
     * @param request MigrateClusterRequest
     * @return MigrateClusterResponse
     */
    public MigrateClusterResponse migrateCluster(String clusterId, MigrateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateClusterWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the ModifyCluster operation to modify the cluster configurations by cluster ID.
     *
     * @param request ModifyClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterResponse
     */
    public ModifyClusterResponse modifyClusterWithOptions(String ClusterId, ModifyClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlList)) {
            body.put("access_control_list", request.accessControlList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerCustomCertSans)) {
            body.put("api_server_custom_cert_sans", request.apiServerCustomCertSans);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEip)) {
            body.put("api_server_eip", request.apiServerEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEipId)) {
            body.put("api_server_eip_id", request.apiServerEipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("cluster_name", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            body.put("deletion_protection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRrsa)) {
            body.put("enable_rrsa", request.enableRrsa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressDomainRebinding)) {
            body.put("ingress_domain_rebinding", request.ingressDomainRebinding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressLoadbalancerId)) {
            body.put("ingress_loadbalancer_id", request.ingressLoadbalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDeletionProtection)) {
            body.put("instance_deletion_protection", request.instanceDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintenanceWindow)) {
            body.put("maintenance_window", request.maintenanceWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationPolicy)) {
            body.put("operation_policy", request.operationPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resource_group_id", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemEventsLogging)) {
            body.put("system_events_logging", request.systemEventsLogging);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterResponse());
    }

    /**
     * @summary You can call the ModifyCluster operation to modify the cluster configurations by cluster ID.
     *
     * @param request ModifyClusterRequest
     * @return ModifyClusterResponse
     */
    public ModifyClusterResponse modifyCluster(String ClusterId, ModifyClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Modifies the configuration of a cluster component. This operation may affect your businesses. We recommend that you assess the impact, back up data, and perform the operation during off-peak hours.
     *
     * @description You can use this API operation to modify the components in a Container Service for Kubernetes (ACK) cluster or the control plane components in an ACK Pro cluster.
     * *   To query the customizable parameters of a component, call the `DescribeClusterAddonMetadata` API operation. For more information, see [Query the metadata of a specified component version](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/query).
     * *   For more information about the customizable parameters of control plane components in ACK Pro clusters, see [Customize the parameters of control plane components in ACK Pro clusters](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/customize-control-plane-parameters-for-a-professional-kubernetes-cluster).
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.
     *
     * @param request ModifyClusterAddonRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterAddonResponse
     */
    public ModifyClusterAddonResponse modifyClusterAddonWithOptions(String clusterId, String componentId, ModifyClusterAddonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterAddon"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentId) + "/config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterAddonResponse());
    }

    /**
     * @summary Modifies the configuration of a cluster component. This operation may affect your businesses. We recommend that you assess the impact, back up data, and perform the operation during off-peak hours.
     *
     * @description You can use this API operation to modify the components in a Container Service for Kubernetes (ACK) cluster or the control plane components in an ACK Pro cluster.
     * *   To query the customizable parameters of a component, call the `DescribeClusterAddonMetadata` API operation. For more information, see [Query the metadata of a specified component version](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/query).
     * *   For more information about the customizable parameters of control plane components in ACK Pro clusters, see [Customize the parameters of control plane components in ACK Pro clusters](https://www.alibabacloud.com/help/zh/container-service-for-kubernetes/latest/customize-control-plane-parameters-for-a-professional-kubernetes-cluster).
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.
     *
     * @param request ModifyClusterAddonRequest
     * @return ModifyClusterAddonResponse
     */
    public ModifyClusterAddonResponse modifyClusterAddon(String clusterId, String componentId, ModifyClusterAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterAddonWithOptions(clusterId, componentId, request, headers, runtime);
    }

    /**
     * @summary This API operation applies only to Container Service for Kubernetes (ACK) managed clusters.
     *
     * @param request ModifyClusterConfigurationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterConfigurationResponse
     */
    public ModifyClusterConfigurationResponse modifyClusterConfigurationWithOptions(String ClusterId, ModifyClusterConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customizeConfig)) {
            body.put("customize_config", request.customizeConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterConfiguration"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/configuration"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterConfigurationResponse());
    }

    /**
     * @summary This API operation applies only to Container Service for Kubernetes (ACK) managed clusters.
     *
     * @param request ModifyClusterConfigurationRequest
     * @return ModifyClusterConfigurationResponse
     */
    public ModifyClusterConfigurationResponse modifyClusterConfiguration(String ClusterId, ModifyClusterConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterConfigurationWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the ModifyClusterNodePool operation to modify the configuration of a node pool with the specified node pool ID.
     *
     * @param request ModifyClusterNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterNodePoolResponse
     */
    public ModifyClusterNodePoolResponse modifyClusterNodePoolWithOptions(String ClusterId, String NodepoolId, ModifyClusterNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScaling)) {
            body.put("auto_scaling", request.autoScaling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesConfig)) {
            body.put("kubernetes_config", request.kubernetesConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.management)) {
            body.put("management", request.management);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolInfo)) {
            body.put("nodepool_info", request.nodepoolInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroup)) {
            body.put("scaling_group", request.scalingGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teeConfig)) {
            body.put("tee_config", request.teeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateNodes)) {
            body.put("update_nodes", request.updateNodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterNodePoolResponse());
    }

    /**
     * @summary You can call the ModifyClusterNodePool operation to modify the configuration of a node pool with the specified node pool ID.
     *
     * @param request ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     */
    public ModifyClusterNodePoolResponse modifyClusterNodePool(String ClusterId, String NodepoolId, ModifyClusterNodePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterNodePoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @summary Modifies the labels of a Container Service for Kubernetes (ACK) cluster. You can use labels (key-value pairs) to classify and manage ACK clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param request ModifyClusterTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterTagsResponse
     */
    public ModifyClusterTagsResponse modifyClusterTagsWithOptions(String ClusterId, ModifyClusterTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterTags"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterTagsResponse());
    }

    /**
     * @summary Modifies the labels of a Container Service for Kubernetes (ACK) cluster. You can use labels (key-value pairs) to classify and manage ACK clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param request ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     */
    public ModifyClusterTagsResponse modifyClusterTags(String ClusterId, ModifyClusterTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterTagsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Modifies the configuration of a node pool, such as the kubelet configuration and node rolling update configuration. After you modify the node pool configuration, nodes are batch updated and the kubelet on each node is restarted. This may adversely affect the nodes and workloads. We recommend that you perform this operation during off-peak hours.
     *
     * @description >  Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.
     *
     * @param request ModifyNodePoolNodeConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodePoolNodeConfigResponse
     */
    public ModifyNodePoolNodeConfigResponse modifyNodePoolNodeConfigWithOptions(String ClusterId, String NodepoolId, ModifyNodePoolNodeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kubeletConfig)) {
            body.put("kubelet_config", request.kubeletConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osConfig)) {
            body.put("os_config", request.osConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rolling_policy", request.rollingPolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodePoolNodeConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + "/node_config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodePoolNodeConfigResponse());
    }

    /**
     * @summary Modifies the configuration of a node pool, such as the kubelet configuration and node rolling update configuration. After you modify the node pool configuration, nodes are batch updated and the kubelet on each node is restarted. This may adversely affect the nodes and workloads. We recommend that you perform this operation during off-peak hours.
     *
     * @description >  Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.
     *
     * @param request ModifyNodePoolNodeConfigRequest
     * @return ModifyNodePoolNodeConfigResponse
     */
    public ModifyNodePoolNodeConfigResponse modifyNodePoolNodeConfig(String ClusterId, String NodepoolId, ModifyNodePoolNodeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyNodePoolNodeConfigWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the ModifyPolicyInstance operation to update policy instances in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request ModifyPolicyInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyInstanceResponse
     */
    public ModifyPolicyInstanceResponse modifyPolicyInstanceWithOptions(String clusterId, String policyName, ModifyPolicyInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("instance_name", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaces)) {
            body.put("namespaces", request.namespaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyInstanceResponse());
    }

    /**
     * @summary You can call the ModifyPolicyInstance operation to update policy instances in a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request ModifyPolicyInstanceRequest
     * @return ModifyPolicyInstanceResponse
     */
    public ModifyPolicyInstanceResponse modifyPolicyInstance(String clusterId, String policyName, ModifyPolicyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyPolicyInstanceWithOptions(clusterId, policyName, request, headers, runtime);
    }

    /**
     * @summary You can call the OpenAckService operation to activate Container Service for Kubernetes (ACK).
     *
     * @description *   You can activate ACK by using Alibaba Cloud accounts.
     * *   To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.
     *
     * @param request OpenAckServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenAckServiceResponse
     */
    public OpenAckServiceResponse openAckServiceWithOptions(OpenAckServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenAckService"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/service/open"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAckServiceResponse());
    }

    /**
     * @summary You can call the OpenAckService operation to activate Container Service for Kubernetes (ACK).
     *
     * @description *   You can activate ACK by using Alibaba Cloud accounts.
     * *   To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.
     *
     * @param request OpenAckServiceRequest
     * @return OpenAckServiceResponse
     */
    public OpenAckServiceResponse openAckService(OpenAckServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openAckServiceWithOptions(request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated
     *
     * @summary You can call the PauseClusterUpgrade operation to pause the update of a Container Service for Kubernetes (ACK) cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseClusterUpgradeResponse
     */
    // Deprecated
    public PauseClusterUpgradeResponse pauseClusterUpgradeWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseClusterUpgrade"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/upgrade/pause"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseClusterUpgradeResponse());
    }

    /**
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated
     *
     * @summary You can call the PauseClusterUpgrade operation to pause the update of a Container Service for Kubernetes (ACK) cluster.
     *
     * @return PauseClusterUpgradeResponse
     */
    // Deprecated
    public PauseClusterUpgradeResponse pauseClusterUpgrade(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the PauseComponentUpgrade operation to pause the update of a component.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseComponentUpgradeResponse
     */
    public PauseComponentUpgradeResponse pauseComponentUpgradeWithOptions(String clusterid, String componentid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseComponentUpgrade"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterid) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentid) + "/pause"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseComponentUpgradeResponse());
    }

    /**
     * @summary You can call the PauseComponentUpgrade operation to pause the update of a component.
     *
     * @return PauseComponentUpgradeResponse
     */
    public PauseComponentUpgradeResponse pauseComponentUpgrade(String clusterid, String componentid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    /**
     * @summary Pauses an on-going task.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseTaskResponse
     */
    public PauseTaskResponse pauseTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseTask"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/pause"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseTaskResponse());
    }

    /**
     * @summary Pauses an on-going task.
     *
     * @return PauseTaskResponse
     */
    public PauseTaskResponse pauseTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * @deprecated OpenAPI RemoveClusterNodes is deprecated
     *
     * @summary You can call the RemoveClusterNodes operation to remove nodes from a Container Service for Kubernetes (ACK) cluster.
     *
     * @description ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.
     * *   Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.
     * *   Nodes remain in the Unschedulable state when they are being removed.
     * *   You can remove only worker nodes. You cannot remove master nodes.
     *
     * @param request RemoveClusterNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClusterNodesResponse
     */
    // Deprecated
    public RemoveClusterNodesResponse removeClusterNodesWithOptions(String ClusterId, RemoveClusterNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drainNode)) {
            body.put("drain_node", request.drainNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNode)) {
            body.put("release_node", request.releaseNode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveClusterNodes"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodes/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClusterNodesResponse());
    }

    /**
     * @deprecated OpenAPI RemoveClusterNodes is deprecated
     *
     * @summary You can call the RemoveClusterNodes operation to remove nodes from a Container Service for Kubernetes (ACK) cluster.
     *
     * @description ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.
     * *   Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.
     * *   Nodes remain in the Unschedulable state when they are being removed.
     * *   You can remove only worker nodes. You cannot remove master nodes.
     *
     * @param request RemoveClusterNodesRequest
     * @return RemoveClusterNodesResponse
     */
    // Deprecated
    public RemoveClusterNodesResponse removeClusterNodes(String ClusterId, RemoveClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Removes nodes from a node pool.
     *
     * @description **
     * ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
     *
     * @param tmpReq RemoveNodePoolNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveNodePoolNodesResponse
     */
    public RemoveNodePoolNodesResponse removeNodePoolNodesWithOptions(String ClusterId, String NodepoolId, RemoveNodePoolNodesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveNodePoolNodesShrinkRequest request = new RemoveNodePoolNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "instance_ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "nodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drainNode)) {
            query.put("drain_node", request.drainNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("instance_ids", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            query.put("nodes", request.nodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNode)) {
            query.put("release_node", request.releaseNode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveNodePoolNodes"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + "/nodes"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveNodePoolNodesResponse());
    }

    /**
     * @summary Removes nodes from a node pool.
     *
     * @description **
     * ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours. - The operation may have unexpected risks. Back up the data before you perform this operation. - When the system removes a node, it sets the status of the node to Unschedulable. - The system removes only worker nodes. It does not remove master nodes.
     *
     * @param request RemoveNodePoolNodesRequest
     * @return RemoveNodePoolNodesResponse
     */
    public RemoveNodePoolNodesResponse removeNodePoolNodes(String ClusterId, String NodepoolId, RemoveNodePoolNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeNodePoolNodesWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the RemoveWorkflow operation to delete a workflow.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveWorkflowResponse
     */
    public RemoveWorkflowResponse removeWorkflowWithOptions(String workflowName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveWorkflow"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gs/workflow/" + com.aliyun.openapiutil.Client.getEncodeParam(workflowName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveWorkflowResponse());
    }

    /**
     * @summary You can call the RemoveWorkflow operation to delete a workflow.
     *
     * @return RemoveWorkflowResponse
     */
    public RemoveWorkflowResponse removeWorkflow(String workflowName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeWorkflowWithOptions(workflowName, headers, runtime);
    }

    /**
     * @summary You can call the RepairClusterNodePool operation to fix issues on specified nodes in a managed node pool.
     *
     * @param request RepairClusterNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RepairClusterNodePoolResponse
     */
    public RepairClusterNodePoolResponse repairClusterNodePoolWithOptions(String clusterId, String nodepoolId, RepairClusterNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRestart)) {
            body.put("auto_restart", request.autoRestart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepairClusterNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/repair"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepairClusterNodePoolResponse());
    }

    /**
     * @summary You can call the RepairClusterNodePool operation to fix issues on specified nodes in a managed node pool.
     *
     * @param request RepairClusterNodePoolRequest
     * @return RepairClusterNodePoolResponse
     */
    public RepairClusterNodePoolResponse repairClusterNodePool(String clusterId, String nodepoolId, RepairClusterNodePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repairClusterNodePoolWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the ResumeComponentUpgrade operation to resume the update of a component.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeComponentUpgradeResponse
     */
    public ResumeComponentUpgradeResponse resumeComponentUpgradeWithOptions(String clusterid, String componentid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeComponentUpgrade"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterid) + "/components/" + com.aliyun.openapiutil.Client.getEncodeParam(componentid) + "/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeComponentUpgradeResponse());
    }

    /**
     * @summary You can call the ResumeComponentUpgrade operation to resume the update of a component.
     *
     * @return ResumeComponentUpgradeResponse
     */
    public ResumeComponentUpgradeResponse resumeComponentUpgrade(String clusterid, String componentid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    /**
     * @summary You can call the ResumeTask operation to resume a task.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTaskWithOptions(String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTask"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTaskResponse());
    }

    /**
     * @summary You can call the ResumeTask operation to resume a task.
     *
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated
     *
     * @summary You can call the ResumeUpgradeCluster operation to resume the update of a cluster by cluster ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeUpgradeClusterResponse
     */
    // Deprecated
    public ResumeUpgradeClusterResponse resumeUpgradeClusterWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeUpgradeCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/upgrade/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeUpgradeClusterResponse());
    }

    /**
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated
     *
     * @summary You can call the ResumeUpgradeCluster operation to resume the update of a cluster by cluster ID.
     *
     * @return ResumeUpgradeClusterResponse
     */
    // Deprecated
    public ResumeUpgradeClusterResponse resumeUpgradeCluster(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeUpgradeClusterWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the RunClusterCheck operation to initiate cluster checks, such as cluster update prechecks.
     *
     * @param request RunClusterCheckRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunClusterCheckResponse
     */
    public RunClusterCheckResponse runClusterCheckWithOptions(String clusterId, RunClusterCheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunClusterCheck"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/checks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunClusterCheckResponse());
    }

    /**
     * @summary You can call the RunClusterCheck operation to initiate cluster checks, such as cluster update prechecks.
     *
     * @param request RunClusterCheckRequest
     * @return RunClusterCheckResponse
     */
    public RunClusterCheckResponse runClusterCheck(String clusterId, RunClusterCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runClusterCheckWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI ScaleCluster is deprecated
     *
     * @summary 扩容Kubernetes集群
     *
     * @param request ScaleClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleClusterResponse
     */
    // Deprecated
    public ScaleClusterResponse scaleClusterWithOptions(String ClusterId, ScaleClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRollback)) {
            body.put("disable_rollback", request.disableRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisk)) {
            body.put("worker_data_disk", request.workerDataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleClusterResponse());
    }

    /**
     * @deprecated OpenAPI ScaleCluster is deprecated
     *
     * @summary 扩容Kubernetes集群
     *
     * @param request ScaleClusterRequest
     * @return ScaleClusterResponse
     */
    // Deprecated
    public ScaleClusterResponse scaleCluster(String ClusterId, ScaleClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleClusterWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the ScaleClusterNodePool operation to scale out a node pool by node pool ID.
     *
     * @param request ScaleClusterNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleClusterNodePoolResponse
     */
    public ScaleClusterNodePoolResponse scaleClusterNodePoolWithOptions(String ClusterId, String NodepoolId, ScaleClusterNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleClusterNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleClusterNodePoolResponse());
    }

    /**
     * @summary You can call the ScaleClusterNodePool operation to scale out a node pool by node pool ID.
     *
     * @param request ScaleClusterNodePoolRequest
     * @return ScaleClusterNodePoolResponse
     */
    public ScaleClusterNodePoolResponse scaleClusterNodePool(String ClusterId, String NodepoolId, ScaleClusterNodePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleClusterNodePoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }

    /**
     * @summary You can call the ScaleOutCluster operation to scale out a cluster by cluster ID.
     *
     * @description **
     * ****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see [ScaleClusterNodePool](https://help.aliyun.com/document_detail/184928.html).
     *
     * @param request ScaleOutClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScaleOutClusterResponse
     */
    public ScaleOutClusterResponse scaleOutClusterWithOptions(String ClusterId, ScaleOutClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudMonitorFlags)) {
            body.put("cloud_monitor_flags", request.cloudMonitorFlags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuPolicy)) {
            body.put("cpu_policy", request.cpuPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPair)) {
            body.put("key_pair", request.keyPair);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("login_password", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstances)) {
            body.put("rds_instances", request.rdsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtime)) {
            body.put("runtime", request.runtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taints)) {
            body.put("taints", request.taints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenew)) {
            body.put("worker_auto_renew", request.workerAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAutoRenewPeriod)) {
            body.put("worker_auto_renew_period", request.workerAutoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerDataDisks)) {
            body.put("worker_data_disks", request.workerDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceChargeType)) {
            body.put("worker_instance_charge_type", request.workerInstanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerInstanceTypes)) {
            body.put("worker_instance_types", request.workerInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriod)) {
            body.put("worker_period", request.workerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerPeriodUnit)) {
            body.put("worker_period_unit", request.workerPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskCategory)) {
            body.put("worker_system_disk_category", request.workerSystemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerSystemDiskSize)) {
            body.put("worker_system_disk_size", request.workerSystemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleOutCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleOutClusterResponse());
    }

    /**
     * @summary You can call the ScaleOutCluster operation to scale out a cluster by cluster ID.
     *
     * @description **
     * ****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see [ScaleClusterNodePool](https://help.aliyun.com/document_detail/184928.html).
     *
     * @param request ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     */
    public ScaleOutClusterResponse scaleOutCluster(String ClusterId, ScaleOutClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleOutClusterWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary The cluster ID.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanClusterVulsResponse
     */
    public ScanClusterVulsResponse scanClusterVulsWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanClusterVuls"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/vuls/scan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanClusterVulsResponse());
    }

    /**
     * @summary The cluster ID.
     *
     * @return ScanClusterVulsResponse
     */
    public ScanClusterVulsResponse scanClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * @param request StartAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAlertResponse
     */
    public StartAlertResponse startAlertWithOptions(String ClusterId, StartAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleGroupName)) {
            body.put("alert_rule_group_name", request.alertRuleGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleName)) {
            body.put("alert_rule_name", request.alertRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAlert"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alert/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/alert_rule/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAlertResponse());
    }

    /**
     * @param request StartAlertRequest
     * @return StartAlertResponse
     */
    public StartAlertResponse startAlert(String ClusterId, StartAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAlertWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the StartWorkflow operation to create a workflow.
     *
     * @param request StartWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartWorkflowResponse
     */
    public StartWorkflowResponse startWorkflowWithOptions(StartWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mappingBamOutFilename)) {
            body.put("mapping_bam_out_filename", request.mappingBamOutFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingBamOutPath)) {
            body.put("mapping_bam_out_path", request.mappingBamOutPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingBucketName)) {
            body.put("mapping_bucket_name", request.mappingBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqFirstFilename)) {
            body.put("mapping_fastq_first_filename", request.mappingFastqFirstFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqPath)) {
            body.put("mapping_fastq_path", request.mappingFastqPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingFastqSecondFilename)) {
            body.put("mapping_fastq_second_filename", request.mappingFastqSecondFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingIsMarkDup)) {
            body.put("mapping_is_mark_dup", request.mappingIsMarkDup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingOssRegion)) {
            body.put("mapping_oss_region", request.mappingOssRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mappingReferencePath)) {
            body.put("mapping_reference_path", request.mappingReferencePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsBucketName)) {
            body.put("wgs_bucket_name", request.wgsBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqFirstFilename)) {
            body.put("wgs_fastq_first_filename", request.wgsFastqFirstFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqPath)) {
            body.put("wgs_fastq_path", request.wgsFastqPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsFastqSecondFilename)) {
            body.put("wgs_fastq_second_filename", request.wgsFastqSecondFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsOssRegion)) {
            body.put("wgs_oss_region", request.wgsOssRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsReferencePath)) {
            body.put("wgs_reference_path", request.wgsReferencePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsVcfOutFilename)) {
            body.put("wgs_vcf_out_filename", request.wgsVcfOutFilename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wgsVcfOutPath)) {
            body.put("wgs_vcf_out_path", request.wgsVcfOutPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowType)) {
            body.put("workflow_type", request.workflowType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartWorkflow"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gs/workflow"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartWorkflowResponse());
    }

    /**
     * @summary You can call the StartWorkflow operation to create a workflow.
     *
     * @param request StartWorkflowRequest
     * @return StartWorkflowResponse
     */
    public StartWorkflowResponse startWorkflow(StartWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startWorkflowWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the StopAlert operation to disable an alert rule or an alert rule set in the alert center of Container Service for Kubernetes (ACK).
     *
     * @param request StopAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAlertResponse
     */
    public StopAlertResponse stopAlertWithOptions(String ClusterId, StopAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleGroupName)) {
            body.put("alert_rule_group_name", request.alertRuleGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleName)) {
            body.put("alert_rule_name", request.alertRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAlert"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alert/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/alert_rule/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAlertResponse());
    }

    /**
     * @summary You can call the StopAlert operation to disable an alert rule or an alert rule set in the alert center of Container Service for Kubernetes (ACK).
     *
     * @param request StopAlertRequest
     * @return StopAlertResponse
     */
    public StopAlertResponse stopAlert(String ClusterId, StopAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAlertWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Synchronizes the information about a node pool, including the metadata and node information of the node pool.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncClusterNodePoolResponse
     */
    public SyncClusterNodePoolResponse syncClusterNodePoolWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncClusterNodePool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/sync_nodepools"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncClusterNodePoolResponse());
    }

    /**
     * @summary Synchronizes the information about a node pool, including the metadata and node information of the node pool.
     *
     * @return SyncClusterNodePoolResponse
     */
    public SyncClusterNodePoolResponse syncClusterNodePool(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncClusterNodePoolWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary Adds labels to a Container Service for Kubernetes (ACK) cluster. You can use labels to classify and manage ACK clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("resource_ids", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * @summary Adds labels to a Container Service for Kubernetes (ACK) cluster. You can use labels to classify and manage ACK clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary You can call the UnInstallClusterAddons operation to uninstall the components in a cluster by component names.
     *
     * @param request UnInstallClusterAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnInstallClusterAddonsResponse
     */
    public UnInstallClusterAddonsResponse unInstallClusterAddonsWithOptions(String ClusterId, UnInstallClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.addons))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnInstallClusterAddons"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/uninstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnInstallClusterAddonsResponse());
    }

    /**
     * @summary You can call the UnInstallClusterAddons operation to uninstall the components in a cluster by component names.
     *
     * @param request UnInstallClusterAddonsRequest
     * @return UnInstallClusterAddonsResponse
     */
    public UnInstallClusterAddonsResponse unInstallClusterAddons(String ClusterId, UnInstallClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unInstallClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Removes labels from a Container Service for Kubernetes (ACK) cluster.
     *
     * @param tmpReq UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "resource_ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "tag_keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("region_id", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("resource_ids", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            query.put("tag_keys", request.tagKeysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * @summary Removes labels from a Container Service for Kubernetes (ACK) cluster.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactGroupForAlertResponse
     */
    public UpdateContactGroupForAlertResponse updateContactGroupForAlertWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContactGroupForAlert"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alert/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/alert_rule/contact_groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactGroupForAlertResponse());
    }

    /**
     * @return UpdateContactGroupForAlertResponse
     */
    public UpdateContactGroupForAlertResponse updateContactGroupForAlert(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContactGroupForAlertWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary You can call the UpdateControlPlaneLog operation to modify the log collection configurations for control plane components in a Container Service for Kubernetes (ACK) managed cluster.
     *
     * @param request UpdateControlPlaneLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateControlPlaneLogResponse
     */
    public UpdateControlPlaneLogResponse updateControlPlaneLogWithOptions(String ClusterId, UpdateControlPlaneLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliuid)) {
            body.put("aliuid", request.aliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.components)) {
            body.put("components", request.components);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProject)) {
            body.put("log_project", request.logProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logTtl)) {
            body.put("log_ttl", request.logTtl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateControlPlaneLog"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/controlplanelog"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateControlPlaneLogResponse());
    }

    /**
     * @summary You can call the UpdateControlPlaneLog operation to modify the log collection configurations for control plane components in a Container Service for Kubernetes (ACK) managed cluster.
     *
     * @param request UpdateControlPlaneLogRequest
     * @return UpdateControlPlaneLogResponse
     */
    public UpdateControlPlaneLogResponse updateControlPlaneLog(String ClusterId, UpdateControlPlaneLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateControlPlaneLogWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Sets the validity period of a kubeconfig file used by a Resource Access Management (RAM) user or RAM role to connect to a Container Service for Kubernetes (ACK) cluster. The validity period ranges from 1 to 876,000 hours. You can call this API operation when you customize configurations by using an Alibaba Cloud account. The default validity period of a kubeconfig file is three years.
     *
     * @description **
     * ****
     * *   You can call this operation only with an Alibaba Cloud account. - If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.
     *
     * @param request UpdateK8sClusterUserConfigExpireRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateK8sClusterUserConfigExpireResponse
     */
    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpireWithOptions(String ClusterId, UpdateK8sClusterUserConfigExpireRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireHour)) {
            body.put("expire_hour", request.expireHour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("user", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sClusterUserConfigExpire"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/user_config/expire"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sClusterUserConfigExpireResponse());
    }

    /**
     * @summary Sets the validity period of a kubeconfig file used by a Resource Access Management (RAM) user or RAM role to connect to a Container Service for Kubernetes (ACK) cluster. The validity period ranges from 1 to 876,000 hours. You can call this API operation when you customize configurations by using an Alibaba Cloud account. The default validity period of a kubeconfig file is three years.
     *
     * @description **
     * ****
     * *   You can call this operation only with an Alibaba Cloud account. - If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.
     *
     * @param request UpdateK8sClusterUserConfigExpireRequest
     * @return UpdateK8sClusterUserConfigExpireResponse
     */
    public UpdateK8sClusterUserConfigExpireResponse updateK8sClusterUserConfigExpire(String ClusterId, UpdateK8sClusterUserConfigExpireRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sClusterUserConfigExpireWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the UpdateTemplate operation to update an orchestration template by template ID.
     *
     * @param request UpdateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(String TemplateId, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("template_type", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * @summary You can call the UpdateTemplate operation to update an orchestration template by template ID.
     *
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String TemplateId, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(TemplateId, request, headers, runtime);
    }

    /**
     * @summary 更新指定RAM用户/角色的RBAC权限
     *
     * @param request UpdateUserPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPermissionsResponse
     */
    public UpdateUserPermissionsResponse updateUserPermissionsWithOptions(String uid, UpdateUserPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPermissions"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/permissions/users/" + com.aliyun.openapiutil.Client.getEncodeParam(uid) + "/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserPermissionsResponse());
    }

    /**
     * @summary 更新指定RAM用户/角色的RBAC权限
     *
     * @param request UpdateUserPermissionsRequest
     * @return UpdateUserPermissionsResponse
     */
    public UpdateUserPermissionsResponse updateUserPermissions(String uid, UpdateUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserPermissionsWithOptions(uid, request, headers, runtime);
    }

    /**
     * @summary You can call the UpgradeCluster operation to upgrade a cluster by cluster ID.
     *
     * @param request UpgradeClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeClusterWithOptions(String ClusterId, UpgradeClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("component_name", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterOnly)) {
            body.put("master_only", request.masterOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextVersion)) {
            body.put("next_version", request.nextVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeCluster"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterResponse());
    }

    /**
     * @summary You can call the UpgradeCluster operation to upgrade a cluster by cluster ID.
     *
     * @param request UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeCluster(String ClusterId, UpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Updates cluster components to use new features and patch vulnerabilities. You must update cluster components one after one and update a component only after the previous one is successfully updated. Before you update a component, we recommend that you read the update notes for each component. Cluster component updates may affect your businesses. Assess the impact, back up data, and perform the update during off-peak hours.
     *
     * @param request UpgradeClusterAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterAddonsResponse
     */
    public UpgradeClusterAddonsResponse upgradeClusterAddonsWithOptions(String ClusterId, UpgradeClusterAddonsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeClusterAddons"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/components/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterAddonsResponse());
    }

    /**
     * @summary Updates cluster components to use new features and patch vulnerabilities. You must update cluster components one after one and update a component only after the previous one is successfully updated. Before you update a component, we recommend that you read the update notes for each component. Cluster component updates may affect your businesses. Assess the impact, back up data, and perform the update during off-peak hours.
     *
     * @param request UpgradeClusterAddonsRequest
     * @return UpgradeClusterAddonsResponse
     */
    public UpgradeClusterAddonsResponse upgradeClusterAddons(String ClusterId, UpgradeClusterAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterAddonsWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary You can call the UpgradeClusterNodepool operation to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.
     *
     * @description This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.
     *
     * @param request UpgradeClusterNodepoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterNodepoolResponse
     */
    public UpgradeClusterNodepoolResponse upgradeClusterNodepoolWithOptions(String ClusterId, String NodepoolId, UpgradeClusterNodepoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubernetesVersion)) {
            body.put("kubernetes_version", request.kubernetesVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("node_names", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rolling_policy", request.rollingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("runtime_type", request.runtimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeVersion)) {
            body.put("runtime_version", request.runtimeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useReplace)) {
            body.put("use_replace", request.useReplace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeClusterNodepool"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(NodepoolId) + "/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterNodepoolResponse());
    }

    /**
     * @summary You can call the UpgradeClusterNodepool operation to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.
     *
     * @description This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.
     *
     * @param request UpgradeClusterNodepoolRequest
     * @return UpgradeClusterNodepoolResponse
     */
    public UpgradeClusterNodepoolResponse upgradeClusterNodepool(String ClusterId, String NodepoolId, UpgradeClusterNodepoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeClusterNodepoolWithOptions(ClusterId, NodepoolId, request, headers, runtime);
    }
}
