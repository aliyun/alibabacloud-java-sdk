// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215;

import com.aliyun.tea.*;
import com.aliyun.cs20151215.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * <b>summary</b> : 
     * <p>Adds existing Elastic Compute Service (ECS) instances to a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>summary</b> : 
     * <p>Adds existing Elastic Compute Service (ECS) instances to a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>summary</b> : 
     * <p>Adds existing nodes to a specific node pool. You can add existing ECS instances to a specific node pool in a Container Service for Kubernetes (ACK) cluster as worker nodes. You can also add removed worker nodes back to the node pool.</p>
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
     * <b>summary</b> : 
     * <p>Adds existing nodes to a specific node pool. You can add existing ECS instances to a specific node pool in a Container Service for Kubernetes (ACK) cluster as worker nodes. You can also add removed worker nodes back to the node pool.</p>
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
     * <b>summary</b> : 
     * <p>You can call the CancelClusterUpgrade operation to cancel the update of a cluster.</p>
     * 
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelClusterUpgradeResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the CancelClusterUpgrade operation to cancel the update of a cluster.</p>
     * 
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated
     * @return CancelClusterUpgradeResponse
     */
    @Deprecated
    // Deprecated
    public CancelClusterUpgradeResponse cancelClusterUpgrade(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the CancelComponentUpgrade operation to cancel the update of a component.</p>
     * 
     * @deprecated OpenAPI CancelComponentUpgrade is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the CancelComponentUpgrade operation to cancel the update of a component.</p>
     * 
     * @deprecated OpenAPI CancelComponentUpgrade is deprecated
     * @return CancelComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
    public CancelComponentUpgradeResponse cancelComponentUpgrade(String clusterId, String componentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelComponentUpgradeWithOptions(clusterId, componentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the CancelOperationPlan operation to cancel a pending auto O\\\\\\&amp;M plan.</p>
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
     * <b>summary</b> : 
     * <p>You can call the CancelOperationPlan operation to cancel a pending auto O\\\\\\&amp;M plan.</p>
     * @return CancelOperationPlanResponse
     */
    public CancelOperationPlanResponse cancelOperationPlan(String planId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelOperationPlanWithOptions(planId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the execution of a cluster task.</p>
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
     * <b>summary</b> : 
     * <p>Cancels the execution of a cluster task.</p>
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current log configuration of control plane components, including the log retention period and the log collection component. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager.</p>
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
     * <b>summary</b> : 
     * <p>Queries the current log configuration of control plane components, including the log retention period and the log collection component. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager.</p>
     * @return CheckControlPlaneLogEnableResponse
     */
    public CheckControlPlaneLogEnableResponse checkControlPlaneLogEnable(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkControlPlaneLogEnableWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the specified service roles are granted to Container Service for Kubernetes (ACK) within the current Alibaba Cloud account. ACK can access other cloud services, such as Elastic Compute Service (ECS), Object Storage Service (OSS), File Storage NAS (NAS), and Server Load Balancer (SLB), only after ACK is assigned the required service roles.</p>
     * 
     * @param request CheckServiceRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceRoleResponse
     */
    public CheckServiceRoleResponse checkServiceRoleWithOptions(CheckServiceRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roles)) {
            body.put("roles", request.roles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceRole"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ram/check-service-role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the specified service roles are granted to Container Service for Kubernetes (ACK) within the current Alibaba Cloud account. ACK can access other cloud services, such as Elastic Compute Service (ECS), Object Storage Service (OSS), File Storage NAS (NAS), and Server Load Balancer (SLB), only after ACK is assigned the required service roles.</p>
     * 
     * @param request CheckServiceRoleRequest
     * @return CheckServiceRoleResponse
     */
    public CheckServiceRoleResponse checkServiceRole(CheckServiceRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkServiceRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes kubeconfig files that may pose potential risks from a user and revokes Role-Based Access Control (RBAC) permissions on a cluster.</p>
     * 
     * @param request CleanClusterUserPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CleanClusterUserPermissionsResponse
     */
    public CleanClusterUserPermissionsResponse cleanClusterUserPermissionsWithOptions(String ClusterId, String Uid, CleanClusterUserPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CleanClusterUserPermissions"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cluster/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/user/" + com.aliyun.openapiutil.Client.getEncodeParam(Uid) + "/permissions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CleanClusterUserPermissionsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes kubeconfig files that may pose potential risks from a user and revokes Role-Based Access Control (RBAC) permissions on a cluster.</p>
     * 
     * @param request CleanClusterUserPermissionsRequest
     * @return CleanClusterUserPermissionsResponse
     */
    public CleanClusterUserPermissionsResponse cleanClusterUserPermissions(String ClusterId, String Uid, CleanClusterUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cleanClusterUserPermissionsWithOptions(ClusterId, Uid, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the CleanUserPermissions operation to delete the kubeconfig files of the specified users and revoke the relevant Role-Based Access Control (RBAC) permissions. This API operation is suitable for scenarios where employees have resigned or the accounts of employees are locked.</p>
     * 
     * @param tmpReq CleanUserPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CleanUserPermissionsResponse
     */
    public CleanUserPermissionsResponse cleanUserPermissionsWithOptions(String Uid, CleanUserPermissionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CleanUserPermissionsShrinkRequest request = new CleanUserPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterIds)) {
            request.clusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterIds, "ClusterIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdsShrink)) {
            query.put("ClusterIds", request.clusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CleanUserPermissions"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(Uid) + "/permissions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CleanUserPermissionsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the CleanUserPermissions operation to delete the kubeconfig files of the specified users and revoke the relevant Role-Based Access Control (RBAC) permissions. This API operation is suitable for scenarios where employees have resigned or the accounts of employees are locked.</p>
     * 
     * @param request CleanUserPermissionsRequest
     * @return CleanUserPermissionsResponse
     */
    public CleanUserPermissionsResponse cleanUserPermissions(String Uid, CleanUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cleanUserPermissionsWithOptions(Uid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scaling configuration to allow the system to scale resources based on the given scaling rules. When you create a scaling configuration, you can specify the scaling metrics, thresholds, scaling order, and scaling interval.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.priorities)) {
            body.put("priorities", request.priorities);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalerType)) {
            body.put("scaler_type", request.scalerType);
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoscalingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scaling configuration to allow the system to scale resources based on the given scaling rules. When you create a scaling configuration, you can specify the scaling metrics, thresholds, scaling order, and scaling interval.</p>
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
     * <b>description</b> :
     * <h3><a href="#-openapi-"></a>Generate API request parameters through the ACK console</h3>
     * <p>When calling the CreateCluster operation to create a cluster, if the API call fails due to invalid parameter settings, you can generate valid request parameters through the ACK console. Follow these steps:</p>
     * <ol>
     * <li>Log on to the <a href="https://csnew.console.aliyun.com">ACK console</a>. In the left-side navigation pane, click <strong>Clusters</strong>.</li>
     * <li>On the <strong>Clusters</strong> page, click <strong>Cluster Templates</strong>.</li>
     * <li>In the Select Cluster Template dialog box, select the type of cluster you want to create and click Create. Then, configure the cluster parameters.</li>
     * <li>In the <strong>Confirm</strong> step, click <strong>Generate API Request Parameters</strong>.
     * The API request parameters are displayed in the API Request Parameters dialog box.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a Container Service for Kubernetes (ACK) cluster. For example, you can create an ACK managed cluster, ACK Serverless cluster, ACK Edge cluster, or registered cluster. When you create an ACK cluster, you need to configure the cluster information, components, and cloud resources used by ACK.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.auditLogConfig)) {
            body.put("audit_log_config", request.auditLogConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMode)) {
            body.put("auto_mode", request.autoMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("auto_renew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            body.put("auto_renew_period", request.autoRenewPeriod);
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

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneConfig)) {
            body.put("control_plane_config", request.controlPlaneConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneEndpointsConfig)) {
            body.put("control_plane_endpoints_config", request.controlPlaneEndpointsConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.extraSans)) {
            body.put("extra_sans", request.extraSans);
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

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("load_balancer_id", request.loadBalancerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.maintenanceWindow)) {
            body.put("maintenance_window", request.maintenanceWindow);
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

        if (!com.aliyun.teautil.Common.isUnset(request.operationPolicy)) {
            body.put("operation_policy", request.operationPolicy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rrsaConfig)) {
            body.put("rrsa_config", request.rrsaConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIds)) {
            body.put("zone_ids", request.zoneIds);
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
     * <b>description</b> :
     * <h3><a href="#-openapi-"></a>Generate API request parameters through the ACK console</h3>
     * <p>When calling the CreateCluster operation to create a cluster, if the API call fails due to invalid parameter settings, you can generate valid request parameters through the ACK console. Follow these steps:</p>
     * <ol>
     * <li>Log on to the <a href="https://csnew.console.aliyun.com">ACK console</a>. In the left-side navigation pane, click <strong>Clusters</strong>.</li>
     * <li>On the <strong>Clusters</strong> page, click <strong>Cluster Templates</strong>.</li>
     * <li>In the Select Cluster Template dialog box, select the type of cluster you want to create and click Create. Then, configure the cluster parameters.</li>
     * <li>In the <strong>Confirm</strong> step, click <strong>Generate API Request Parameters</strong>.
     * The API request parameters are displayed in the API Request Parameters dialog box.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a Container Service for Kubernetes (ACK) cluster. For example, you can create an ACK managed cluster, ACK Serverless cluster, ACK Edge cluster, or registered cluster. When you create an ACK cluster, you need to configure the cluster information, components, and cloud resources used by ACK.</p>
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
     * <b>summary</b> : 
     * <p>Starts a cluster diagnostic.</p>
     * 
     * @param request CreateClusterDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterDiagnosisResponse
     */
    public CreateClusterDiagnosisResponse createClusterDiagnosisWithOptions(String clusterId, CreateClusterDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("action", "CreateClusterDiagnosis"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/diagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a cluster diagnostic.</p>
     * 
     * @param request CreateClusterDiagnosisRequest
     * @return CreateClusterDiagnosisResponse
     */
    public CreateClusterDiagnosisResponse createClusterDiagnosis(String clusterId, CreateClusterDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterDiagnosisWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures cluster inspection.</p>
     * 
     * @param request CreateClusterInspectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterInspectConfigResponse
     */
    public CreateClusterInspectConfigResponse createClusterInspectConfigWithOptions(String clusterId, CreateClusterInspectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disabledCheckItems)) {
            body.put("disabledCheckItems", request.disabledCheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrence)) {
            body.put("recurrence", request.recurrence);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterInspectConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterInspectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures cluster inspection.</p>
     * 
     * @param request CreateClusterInspectConfigRequest
     * @return CreateClusterInspectConfigResponse
     */
    public CreateClusterInspectConfigResponse createClusterInspectConfig(String clusterId, CreateClusterInspectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterInspectConfigWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node pool for a Container Service for Kubernetes (ACK) cluster. You can use node pools to facilitate node management. For example, you can schedule, configure, or maintain nodes by node pool, and enable auto scaling for a node pool. We recommend that you use a managed node pool, which can help automate specific O\\\&amp;M tasks for nodes, such as Common Vulnerabilities and Exposures (CVE) patching and node repair. This reduces your O\\\&amp;M workload.</p>
     * 
     * @param request CreateClusterNodePoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterNodePoolResponse
     */
    public CreateClusterNodePoolResponse createClusterNodePoolWithOptions(String ClusterId, CreateClusterNodePoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoMode)) {
            body.put("auto_mode", request.autoMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoScaling)) {
            body.put("auto_scaling", request.autoScaling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.efloNodeGroup)) {
            body.put("eflo_node_group", request.efloNodeGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNetwork)) {
            body.put("host_network", request.hostNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interconnectConfig)) {
            body.put("interconnect_config", request.interconnectConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interconnectMode)) {
            body.put("interconnect_mode", request.interconnectMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranet)) {
            body.put("intranet", request.intranet);
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

        if (!com.aliyun.teautil.Common.isUnset(request.nodeComponents)) {
            body.put("node_components", request.nodeComponents);
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
     * <b>summary</b> : 
     * <p>Creates a node pool for a Container Service for Kubernetes (ACK) cluster. You can use node pools to facilitate node management. For example, you can schedule, configure, or maintain nodes by node pool, and enable auto scaling for a node pool. We recommend that you use a managed node pool, which can help automate specific O\\\&amp;M tasks for nodes, such as Common Vulnerabilities and Exposures (CVE) patching and node repair. This reduces your O\\\&amp;M workload.</p>
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
     * <b>summary</b> : 
     * <p>You can call the CreateKubernetesTrigger operation to create a trigger for an application.</p>
     * 
     * @deprecated OpenAPI CreateKubernetesTrigger is deprecated
     * 
     * @param request CreateKubernetesTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the CreateKubernetesTrigger operation to create a trigger for an application.</p>
     * 
     * @deprecated OpenAPI CreateKubernetesTrigger is deprecated
     * 
     * @param request CreateKubernetesTriggerRequest
     * @return CreateKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
    public CreateKubernetesTriggerResponse createKubernetesTrigger(CreateKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKubernetesTriggerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an orchestration template. An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can use orchestration templates to manage resources in Kubernetes clusters and automate resource deployment, such as pods, Services, Deployments, ConfigMaps, and persistent volumes (PVs).</p>
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
     * <b>summary</b> : 
     * <p>Creates an orchestration template. An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can use orchestration templates to manage resources in Kubernetes clusters and automate resource deployment, such as pods, Services, Deployments, ConfigMaps, and persistent volumes (PVs).</p>
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
     * <b>summary</b> : 
     * <p>Creates a trigger for an application to redeploy the application pods when specific conditions are met.</p>
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
     * <b>summary</b> : 
     * <p>Creates a trigger for an application to redeploy the application pods when specific conditions are met.</p>
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
     * <b>summary</b> : 
     * <p>Deletes one or more ACK alert contacts.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes one or more ACK alert contacts.</p>
     * 
     * @param request DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertContactWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an ACK alert contact group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an ACK alert contact group.</p>
     * 
     * @param request DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertContactGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Warning:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun nodes in a cluster cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release the resources. For more information, see \<a href="{0}" target="_blank">Rules for deleting clusters and releasing nodes\</a>.</li>
     * <li>If the SLB instance of the API server uses the subscription billing method, it cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release it.</li>
     * <li>By default, virtual private clouds (VPCs), vSwitches, security groups, and RAM roles are retained if they are used by other resources. To avoid unnecessary costs, we recommend that you manually release the resources.</li>
     * <li>Elastic container instances created on virtual nodes are automatically released.</li>
     * <li>Some resources created together with a cluster are not automatically released when the cluster is deleted. After the cluster is deleted, you are still charged for the resources. Release or retain the resources based on your actual needs. The resources include Simple Log Service projects automatically created by the cluster and dynamically provisioned disks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the DeleteCluster operation to delete a cluster and specify whether to delete or retain the relevant cluster resources. Before you delete a cluster, you must manually delete workloads in the cluster, such as Deployments, StatefulSets, Jobs, and CronJobs. Otherwise, you may fail to delete the cluster.</p>
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
     * <b>description</b> :
     * <p>Warning:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun nodes in a cluster cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release the resources. For more information, see \<a href="{0}" target="_blank">Rules for deleting clusters and releasing nodes\</a>.</li>
     * <li>If the SLB instance of the API server uses the subscription billing method, it cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release it.</li>
     * <li>By default, virtual private clouds (VPCs), vSwitches, security groups, and RAM roles are retained if they are used by other resources. To avoid unnecessary costs, we recommend that you manually release the resources.</li>
     * <li>Elastic container instances created on virtual nodes are automatically released.</li>
     * <li>Some resources created together with a cluster are not automatically released when the cluster is deleted. After the cluster is deleted, you are still charged for the resources. Release or retain the resources based on your actual needs. The resources include Simple Log Service projects automatically created by the cluster and dynamically provisioned disks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the DeleteCluster operation to delete a cluster and specify whether to delete or retain the relevant cluster resources. Before you delete a cluster, you must manually delete workloads in the cluster, such as Deployments, StatefulSets, Jobs, and CronJobs. Otherwise, you may fail to delete the cluster.</p>
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
     * <b>summary</b> : 
     * <p>Deletes cluster inspection configurations.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterInspectConfigResponse
     */
    public DeleteClusterInspectConfigResponse deleteClusterInspectConfigWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterInspectConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectConfig"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterInspectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes cluster inspection configurations.</p>
     * @return DeleteClusterInspectConfigResponse
     */
    public DeleteClusterInspectConfigResponse deleteClusterInspectConfig(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterInspectConfigWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null</p>
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
     * <b>summary</b> : 
     * <p>null</p>
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
     * <b>description</b> :
     * <p>  Use this API or the <a href="https://cs.console.aliyun.com">ACK console</a> for node removal. Do not remove a node by running the <code>kubectl delete node</code> command.</p>
     * <ul>
     * <li>Never directly release or remove ECS instances through the ECS or Auto Scaling console/APIs. Renew subscription ECS instances before they expire. Violations may cause node termination and removal from the ACK console.</li>
     * <li>If a node pool has the Expected Nodes parameter configured, the node pool automatically scales other ECS instances to maintain the expected number of nodes.</li>
     * <li>When you remove a node, the pods on the node are migrated to other nodes. To prevent service interruptions, remove nodes during off-peak hours. Unexpected risks may arise during node removal. Back up the data in advance.</li>
     * <li>ACK drains the node during node removal. Make sure that other nodes in the cluster have sufficient resources to host the evicted pods.</li>
     * <li>To ensure the pods on the node you want to remove can be successfully scheduled to other nodes, check whether the node affinity rules and scheduling policies of the pods meet the requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a Container Service for Kubernetes (ACK) cluster when they are no longer required through the DeleteClusterNodes interface. When removing nodes, you can specify whether to release the Elastic Compute Service (ECS) instances and drain the nodes.</p>
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
     * <b>description</b> :
     * <p>  Use this API or the <a href="https://cs.console.aliyun.com">ACK console</a> for node removal. Do not remove a node by running the <code>kubectl delete node</code> command.</p>
     * <ul>
     * <li>Never directly release or remove ECS instances through the ECS or Auto Scaling console/APIs. Renew subscription ECS instances before they expire. Violations may cause node termination and removal from the ACK console.</li>
     * <li>If a node pool has the Expected Nodes parameter configured, the node pool automatically scales other ECS instances to maintain the expected number of nodes.</li>
     * <li>When you remove a node, the pods on the node are migrated to other nodes. To prevent service interruptions, remove nodes during off-peak hours. Unexpected risks may arise during node removal. Back up the data in advance.</li>
     * <li>ACK drains the node during node removal. Make sure that other nodes in the cluster have sufficient resources to host the evicted pods.</li>
     * <li>To ensure the pods on the node you want to remove can be successfully scheduled to other nodes, check whether the node affinity rules and scheduling policies of the pods meet the requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a Container Service for Kubernetes (ACK) cluster when they are no longer required through the DeleteClusterNodes interface. When removing nodes, you can specify whether to release the Elastic Compute Service (ECS) instances and drain the nodes.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DeleteKubernetesTrigger operation to delete an application trigger by trigger ID</p>
     * 
     * @deprecated OpenAPI DeleteKubernetesTrigger is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DeleteKubernetesTrigger operation to delete an application trigger by trigger ID</p>
     * 
     * @deprecated OpenAPI DeleteKubernetesTrigger is deprecated
     * @return DeleteKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
    public DeleteKubernetesTriggerResponse deleteKubernetesTrigger(String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKubernetesTriggerWithOptions(Id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes policy instances in a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>summary</b> : 
     * <p>Deletes policy instances in a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>summary</b> : 
     * <p>Deletes the orchestration templates that you no longer need.</p>
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
     * <b>summary</b> : 
     * <p>Deletes the orchestration templates that you no longer need.</p>
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(String TemplateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(TemplateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application trigger.</p>
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
     * <b>summary</b> : 
     * <p>Deletes an application trigger.</p>
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(String clusterId, String Id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTriggerWithOptions(clusterId, Id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a policy in the specified namespaces of a specific Container Service for Kubernetes (ACK) cluster. You can create and deploy a security policy by specifying the policy type, action of the policy such as alerting or denying, and namespaces to which the policy applies.</p>
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
     * <b>summary</b> : 
     * <p>Deploys a policy in the specified namespaces of a specific Container Service for Kubernetes (ACK) cluster. You can create and deploy a security policy by specifying the policy type, action of the policy such as alerting or denying, and namespaces to which the policy applies.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a component based on specific conditions such as the region, cluster type, cluster subtype defined by cluster profile, cluster version, and component name. The information includes whether the component is managed, the component type, supported custom parameter schema, compatible operating system architecture, and earliest supported cluster version.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a component based on specific conditions such as the region, cluster type, cluster subtype defined by cluster profile, cluster version, and component name. The information includes whether the component is managed, the component type, supported custom parameter schema, compatible operating system architecture, and earliest supported cluster version.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeAddons operation to query the details about all components that are supported by Container Service for Kubernetes (ACK).</p>
     * 
     * @deprecated OpenAPI DescribeAddons is deprecated
     * 
     * @param request DescribeAddonsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddonsResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeAddons operation to query the details about all components that are supported by Container Service for Kubernetes (ACK).</p>
     * 
     * @deprecated OpenAPI DescribeAddons is deprecated
     * 
     * @param request DescribeAddonsRequest
     * @return DescribeAddonsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeAddonsResponse describeAddons(DescribeAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAddonsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonInstance operation to query the information about a cluster component, including the version, status, and configuration of the component.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonInstanceResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonInstance operation to query the information about a cluster component, including the version, status, and configuration of the component.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated
     * @return DescribeClusterAddonInstanceResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterAddonInstanceResponse describeClusterAddonInstance(String ClusterID, String AddonName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonInstanceWithOptions(ClusterID, AddonName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonMetadata operation to query the metadata of a component version. The metadata includes the component version and available parameters.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated
     * 
     * @param request DescribeClusterAddonMetadataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonMetadataResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonMetadata operation to query the metadata of a component version. The metadata includes the component version and available parameters.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated
     * 
     * @param request DescribeClusterAddonMetadataRequest
     * @return DescribeClusterAddonMetadataResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterAddonMetadataResponse describeClusterAddonMetadata(String clusterId, String componentId, DescribeClusterAddonMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonMetadataWithOptions(clusterId, componentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonUpgradeStatus operation to query the update progress of a cluster component.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonUpgradeStatus operation to query the update progress of a cluster component.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatus(String ClusterId, String ComponentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonUpgradeStatusWithOptions(ClusterId, ComponentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonsUpgradeStatus operation to query the update progress of a component by component name.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated
     * 
     * @param tmpReq DescribeClusterAddonsUpgradeStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonsUpgradeStatus operation to query the update progress of a component by component name.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated
     * 
     * @param request DescribeClusterAddonsUpgradeStatusRequest
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterAddonsUpgradeStatusResponse describeClusterAddonsUpgradeStatus(String ClusterId, DescribeClusterAddonsUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsUpgradeStatusWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonsVersion operation to query the details about all components in a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAddonsVersionResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterAddonsVersion operation to query the details about all components in a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated
     * @return DescribeClusterAddonsVersionResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterAddonsVersionResponse describeClusterAddonsVersion(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterAddonsVersionWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scripts used to add existing nodes to a Container Service for Kubernetes (ACK) cluster. ACK allows you to manually add existing Elastic Compute Service (ECS) instances to an ACK cluster as worker nodes or re-add worker nodes that you remove from the cluster to a node pool.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            body.put("expired", request.expired);
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

        if (!com.aliyun.teautil.Common.isUnset(request.oneTimeToken)) {
            body.put("one_time_token", request.oneTimeToken);
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
     * <b>summary</b> : 
     * <p>Queries the scripts used to add existing nodes to a Container Service for Kubernetes (ACK) cluster. ACK allows you to manually add existing Elastic Compute Service (ECS) instances to an ACK cluster as worker nodes or re-add worker nodes that you remove from the cluster to a node pool.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterDetail operation to query the details of a Container Service for Kubernetes (ACK) cluster by cluster ID.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterDetail operation to query the details of a Container Service for Kubernetes (ACK) cluster by cluster ID.</p>
     * @return DescribeClusterDetailResponse
     */
    public DescribeClusterDetailResponse describeClusterDetail(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterDetailWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries events and event details in a Container Service for Kubernetes (ACK) cluster, including the severity level, status, and start time of each event. Events are generated when clusters created, modified, and updated, node pools are created and scaled out, and components are installed.</p>
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
     * <b>summary</b> : 
     * <p>Queries events and event details in a Container Service for Kubernetes (ACK) cluster, including the severity level, status, and start time of each event. Events are generated when clusters created, modified, and updated, node pools are created and scaled out, and components are installed.</p>
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
     * <b>summary</b> : 
     * <p>Queries the cluster log to help analyze cluster issues and locate the cause.</p>
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
     * <b>summary</b> : 
     * <p>Queries the cluster log to help analyze cluster issues and locate the cause.</p>
     * @return DescribeClusterLogsResponse
     */
    public DescribeClusterLogsResponse describeClusterLogs(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterLogsWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterNodePoolDetail.html operation to query the details about a node pool in a cluster by node pool ID.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterNodePoolDetail.html operation to query the details about a node pool in a cluster by node pool ID.</p>
     * @return DescribeClusterNodePoolDetailResponse
     */
    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetail(String ClusterId, String NodepoolId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolDetailWithOptions(ClusterId, NodepoolId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all node pools in a cluster.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about all node pools in a cluster.</p>
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
     * <b>summary</b> : 
     * <p>null</p>
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
     * <b>summary</b> : 
     * <p>null</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterResources operation to query all resources in a cluster by cluster ID.</p>
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
     * <b>summary</b> : 
     * <p>You can call the DescribeClusterResources operation to query all resources in a cluster by cluster ID.</p>
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
     * <b>summary</b> : 
     * <p>Queries tasks in a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>summary</b> : 
     * <p>Queries tasks in a Container Service for Kubernetes (ACK) cluster.</p>
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
     * <b>description</b> :
     * <p>  The default validity period of a kubeconfig file is 3 years. 180 days before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the kubeconfig file is valid for 3 years. The previous kubeconfig file still remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.</p>
     * <ul>
     * <li>We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Kubeconfig files store identity and authentication information that is used by clients to access Container Service for Kubernetes (ACK) clusters. To use a kubectl client to manage an ACK cluster, you need to use the corresponding kubeconfig file to connect to the ACK cluster. We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.</p>
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
     * <b>description</b> :
     * <p>  The default validity period of a kubeconfig file is 3 years. 180 days before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the kubeconfig file is valid for 3 years. The previous kubeconfig file still remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.</p>
     * <ul>
     * <li>We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Kubeconfig files store identity and authentication information that is used by clients to access Container Service for Kubernetes (ACK) clusters. To use a kubectl client to manage an ACK cluster, you need to use the corresponding kubeconfig file to connect to the ACK cluster. We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.</p>
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
     * <b>summary</b> : 
     * <p>获取集群kubeconfig接口</p>
     * 
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated
     * 
     * @param request DescribeClusterV2UserKubeconfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfigWithOptions(String ClusterId, DescribeClusterV2UserKubeconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>summary</b> : 
     * <p>获取集群kubeconfig接口</p>
     * 
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated
     * 
     * @param request DescribeClusterV2UserKubeconfigRequest
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClusterV2UserKubeconfigResponse describeClusterV2UserKubeconfig(String ClusterId, DescribeClusterV2UserKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterV2UserKubeconfigWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security vulnerability details of a cluster by cluster ID. The details include vulnerability name, vulnerability type, and vulnerability severity. We recommend that you scan your cluster on a regular basis to ensure cluster security.</p>
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
     * <b>summary</b> : 
     * <p>Queries the security vulnerability details of a cluster by cluster ID. The details include vulnerability name, vulnerability type, and vulnerability severity. We recommend that you scan your cluster on a regular basis to ensure cluster security.</p>
     * @return DescribeClusterVulsResponse
     */
    public DescribeClusterVulsResponse describeClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all the clusters that belong to the current Alibaba Cloud account, including Kubernetes clusters and Swarm clusters.</p>
     * 
     * @deprecated OpenAPI DescribeClusters is deprecated
     * 
     * @param request DescribeClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClustersResponse
     */
    @Deprecated
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resource_group_id", request.resourceGroupId);
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
     * <b>summary</b> : 
     * <p>Queries all the clusters that belong to the current Alibaba Cloud account, including Kubernetes clusters and Swarm clusters.</p>
     * 
     * @deprecated OpenAPI DescribeClusters is deprecated
     * 
     * @param request DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    @Deprecated
    // Deprecated
    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters in a specified region.</p>
     * 
     * @param request DescribeClustersForRegionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClustersForRegionResponse
     */
    public DescribeClustersForRegionResponse describeClustersForRegionWithOptions(String regionId, DescribeClustersForRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClustersForRegion"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions/" + com.aliyun.openapiutil.Client.getEncodeParam(regionId) + "/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClustersForRegionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters in a specified region.</p>
     * 
     * @param request DescribeClustersForRegionRequest
     * @return DescribeClustersForRegionResponse
     */
    public DescribeClustersForRegionResponse describeClustersForRegion(String regionId, DescribeClustersForRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClustersForRegionWithOptions(regionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about Container Service for Kubernetes (ACK) clusters of specified types or specifications within an account.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details about Container Service for Kubernetes (ACK) clusters of specified types or specifications within an account.</p>
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
     * <b>summary</b> : 
     * <p>Queries the detailed information about a type of events, including the severity level, status, and time. Events are generated when clusters are created, modified, and updated, node pools are created and scaled out, and components are installed.</p>
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
     * <b>summary</b> : 
     * <p>Queries the detailed information about a type of events, including the severity level, status, and time. Events are generated when clusters are created, modified, and updated, node pools are created and scaled out, and components are installed.</p>
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
     * <b>summary</b> : 
     * <p>Queries all events in a specified region.</p>
     * 
     * @param request DescribeEventsForRegionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsForRegionResponse
     */
    public DescribeEventsForRegionResponse describeEventsForRegionWithOptions(String regionId, DescribeEventsForRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventsForRegion"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions/" + com.aliyun.openapiutil.Client.getEncodeParam(regionId) + "/events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsForRegionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all events in a specified region.</p>
     * 
     * @param request DescribeEventsForRegionRequest
     * @return DescribeEventsForRegionResponse
     */
    public DescribeEventsForRegionResponse describeEventsForRegion(String regionId, DescribeEventsForRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEventsForRegionWithOptions(regionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/121053.html">Register an external Kubernetes cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the proxy configurations of a registered cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI DescribeExternalAgent is deprecated
     * 
     * @param request DescribeExternalAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExternalAgentResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/121053.html">Register an external Kubernetes cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the proxy configurations of a registered cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI DescribeExternalAgent is deprecated
     * 
     * @param request DescribeExternalAgentRequest
     * @return DescribeExternalAgentResponse
     */
    @Deprecated
    // Deprecated
    public DescribeExternalAgentResponse describeExternalAgent(String ClusterId, DescribeExternalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExternalAgentWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about Kubernetes versions, including the version number, release date, expiration date, compatible OSs, and runtime.</p>
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
     * <b>summary</b> : 
     * <p>Queries the detailed information about Kubernetes versions, including the version number, release date, expiration date, compatible OSs, and runtime.</p>
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
     * <b>summary</b> : 
     * <p>Queries the vulnerability information of a node pool, such as vulnerability names and severity levels, by specifying the ID of the node pool. We recommend that you periodically scan node pools for vulnerabilities to enhance cluster security.</p>
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
     * <b>summary</b> : 
     * <p>Queries the vulnerability information of a node pool, such as vulnerability names and severity levels, by specifying the ID of the node pool. We recommend that you periodically scan node pools for vulnerabilities to enhance cluster security.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of security policies. Container Service for Kubernetes (ACK) clusters offer a variety of built-in container security policies, such as Compliance, Infra, K8s-general, and pod security policy (PSP). You can use these policies to ensure the security of containers running in a production environment.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of security policies. Container Service for Kubernetes (ACK) clusters offer a variety of built-in container security policies, such as Compliance, Infra, K8s-general, and pod security policy (PSP). You can use these policies to ensure the security of containers running in a production environment.</p>
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePolicies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePoliciesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a policy. The information includes the content, action, and severity level of the policy. Container Service for Kubernetes (ACK) provides the following types of predefined security policies: Compliance, Infra, K8s-general, and pod security policy (PSP). These policies ensure that containers are running in the production environment in a secure manner.</p>
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
     * <b>summary</b> : 
     * <p>Queries the detailed information about a policy. The information includes the content, action, and severity level of the policy. Container Service for Kubernetes (ACK) provides the following types of predefined security policies: Compliance, Infra, K8s-general, and pod security policy (PSP). These policies ensure that containers are running in the production environment in a secure manner.</p>
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetails(String policyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyDetailsWithOptions(policyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Container Service for Kubernetes (ACK) clusters offer a variety of built-in container security policies, such as Compliance, Infra, K8s-general, and pod security policy (PSP). You can use these policies to ensure the security of containers running in a production environment. You can call the DescribePolicyGovernanceInCluster operation to query the details of policies for an ACK cluster. For example, you can query the number of policies that are enabled per severity level, the audit logs of policies, and the blocking and alerting information.</p>
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
     * <b>summary</b> : 
     * <p>Container Service for Kubernetes (ACK) clusters offer a variety of built-in container security policies, such as Compliance, Infra, K8s-general, and pod security policy (PSP). You can use these policies to ensure the security of containers running in a production environment. You can call the DescribePolicyGovernanceInCluster operation to query the details of policies for an ACK cluster. For example, you can query the number of policies that are enabled per severity level, the audit logs of policies, and the blocking and alerting information.</p>
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInCluster(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyGovernanceInClusterWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about policy instances of the specified type in a Container Service for Kubernetes (ACK) cluster, such as the policy description and severity level. You can choose a type of security policy for an ACK cluster, specify the action and applicable scope of the policy, and then create and deploy a policy instance.</p>
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
     * <b>summary</b> : 
     * <p>Queries the detailed information about policy instances of the specified type in a Container Service for Kubernetes (ACK) cluster, such as the policy description and severity level. You can choose a type of security policy for an ACK cluster, specify the action and applicable scope of the policy, and then create and deploy a policy instance.</p>
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
     * <b>summary</b> : 
     * <p>Queries the deployment of policy instances in the current Container Service for Kubernetes (ACK) cluster, including the number of policy instances of each type and the number of policy types of each severity level.</p>
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
     * <b>summary</b> : 
     * <p>Queries the deployment of policy instances in the current Container Service for Kubernetes (ACK) cluster, including the number of policy instances of each type and the number of policy types of each severity level.</p>
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatus(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesStatusWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the deletion protection feature is enabled for the specified resources in the cluster. The resources that you can query include namespaces and Services.</p>
     * 
     * @param request DescribeResourcesDeleteProtectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourcesDeleteProtectionResponse
     */
    public DescribeResourcesDeleteProtectionResponse describeResourcesDeleteProtectionWithOptions(String ClusterId, String ResourceType, DescribeResourcesDeleteProtectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourcesDeleteProtection"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceType) + "/protection"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcesDeleteProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the deletion protection feature is enabled for the specified resources in the cluster. The resources that you can query include namespaces and Services.</p>
     * 
     * @param request DescribeResourcesDeleteProtectionRequest
     * @return DescribeResourcesDeleteProtectionResponse
     */
    public DescribeResourcesDeleteProtectionResponse describeResourcesDeleteProtection(String ClusterId, String ResourceType, DescribeResourcesDeleteProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeResourcesDeleteProtectionWithOptions(ClusterId, ResourceType, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using an Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries or issues the kubeconfig credentials of a Resource Access Management (RAM) user or RAM role of the account. If you are the permission manager of a Container Service for Kubernetes (ACK) cluster, you can issue the kubeconfig credentials to a specific RAM user or RAM role of the account by using the Alibaba Cloud account. The kubeconfig credentials, which are used to connect to the ACK cluster, contain the identity information about the RAM user or RAM role.</p>
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
     * <b>description</b> :
     * <p>You can call this operation only by using an Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries or issues the kubeconfig credentials of a Resource Access Management (RAM) user or RAM role of the account. If you are the permission manager of a Container Service for Kubernetes (ACK) cluster, you can issue the kubeconfig credentials to a specific RAM user or RAM role of the account by using the Alibaba Cloud account. The kubeconfig credentials, which are used to connect to the ACK cluster, contain the identity information about the RAM user or RAM role.</p>
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
     * <b>summary</b> : 
     * <p>Queries detailed information about a task, such as the task type, status, and progress.</p>
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
     * <b>summary</b> : 
     * <p>Queries detailed information about a task, such as the task type, status, and progress.</p>
     * @return DescribeTaskInfoResponse
     */
    public DescribeTaskInfoResponse describeTaskInfo(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskInfoWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.</p>
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
     * <b>summary</b> : 
     * <p>An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.</p>
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
     * <b>summary</b> : 
     * <p>An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.</p>
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
     * <b>summary</b> : 
     * <p>An orchestration template defines and describes a group of Kubernetes resources. It declaratively describes the configuration of an application or how an application runs. You can call the DescribeTemplates API operation to query orchestration templates and their detailed information, including access permissions, YAML content, and labels.</p>
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
     * <b>summary</b> : 
     * <p>Queries triggers that match specific conditions.</p>
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
     * <b>summary</b> : 
     * <p>Queries triggers that match specific conditions.</p>
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
     * <b>summary</b> : 
     * <p>You can use Kubernetes namespaces to limit users from accessing resources in a Container Service for Kubernetes (ACK) cluster. Users that are granted Role-Based Access Control (RBAC) permissions only on one namespace cannot access resources in other namespaces. Queries the RBAC permissions that are granted to the current Resource Access Management (RAM) user or RAM role on an ACK cluster.</p>
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
     * <b>summary</b> : 
     * <p>You can use Kubernetes namespaces to limit users from accessing resources in a Container Service for Kubernetes (ACK) cluster. Users that are granted Role-Based Access Control (RBAC) permissions only on one namespace cannot access resources in other namespaces. Queries the RBAC permissions that are granted to the current Resource Access Management (RAM) user or RAM role on an ACK cluster.</p>
     * @return DescribeUserClusterNamespacesResponse
     */
    public DescribeUserClusterNamespacesResponse describeUserClusterNamespaces(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserClusterNamespacesWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you call this operation as a Resource Access Management (RAM) user or by assuming a RAM role, only the permissions granted on the clusters on which the current account has the role-based access control (RBAC) administrator permissions are returned. If you want to query the permissions on all clusters, you must use an account that has the RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>In an Container Service for Kubernetes (ACK) cluster, you can create and specify different Resource Access Management (RAM) users or roles to have different access permissions. This ensures access control and resource isolation. You can call the DescribeUserPermission operation to query the permissions that are granted to a RAM user or RAM role on ACK clusters, including the resources that are allowed to access, the scope of the permissions, the predefined role, and the permission source.</p>
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
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you call this operation as a Resource Access Management (RAM) user or by assuming a RAM role, only the permissions granted on the clusters on which the current account has the role-based access control (RBAC) administrator permissions are returned. If you want to query the permissions on all clusters, you must use an account that has the RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>In an Container Service for Kubernetes (ACK) cluster, you can create and specify different Resource Access Management (RAM) users or roles to have different access permissions. This ensures access control and resource isolation. You can call the DescribeUserPermission operation to query the permissions that are granted to a RAM user or RAM role on ACK clusters, including the resources that are allowed to access, the scope of the permissions, the predefined role, and the permission source.</p>
     * @return DescribeUserPermissionResponse
     */
    public DescribeUserPermissionResponse describeUserPermission(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserPermissionWithOptions(uid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quotas related to Container Service for Kubernetes (ACK) clusters, node pools, and nodes. To increase a quota, submit an application in the Quota Center console.</p>
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
     * <b>summary</b> : 
     * <p>Queries quotas related to Container Service for Kubernetes (ACK) clusters, node pools, and nodes. To increase a quota, submit an application in the Quota Center console.</p>
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserQuotaWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).</li>
     * <li>ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.</li>
     * <li>Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.</li>
     * <li>CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Patches node vulnerabilities in a node pool to enhance node security. Cloud Security provided by Alibaba Cloud periodically scans Elastic Compute Service (ECS) instances for vulnerabilities and provides suggestions on how to patch the detected vulnerabilities. Vulnerability patching may require node restarts. Make sure that your cluster has sufficient idle nodes for node draining.</p>
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
     * <b>description</b> :
     * <ol>
     * <li>The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).</li>
     * <li>ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.</li>
     * <li>Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.</li>
     * <li>CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Patches node vulnerabilities in a node pool to enhance node security. Cloud Security provided by Alibaba Cloud periodically scans Elastic Compute Service (ECS) instances for vulnerabilities and provides suggestions on how to patch the detected vulnerabilities. Vulnerability patching may require node restarts. Make sure that your cluster has sufficient idle nodes for node draining.</p>
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
     * <b>summary</b> : 
     * <p>You can call the GetClusterAddonInstance operation to query the information of a component instance in a cluster, including the version, configurations, and log status of the component instance.</p>
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
     * <b>summary</b> : 
     * <p>You can call the GetClusterAddonInstance operation to query the information of a component instance in a cluster, including the version, configurations, and log status of the component instance.</p>
     * @return GetClusterAddonInstanceResponse
     */
    public GetClusterAddonInstanceResponse getClusterAddonInstance(String clusterId, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterAddonInstanceWithOptions(clusterId, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetClusterAuditProject operation to check whether the cluster has API Server auditing enabled and the corresponding Simple Log Service project that stores API Server audit logs.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterAuditProjectResponse
     */
    public GetClusterAuditProjectResponse getClusterAuditProjectWithOptions(String clusterid, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterAuditProject"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterid) + "/audit"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterAuditProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetClusterAuditProject operation to check whether the cluster has API Server auditing enabled and the corresponding Simple Log Service project that stores API Server audit logs.</p>
     * @return GetClusterAuditProjectResponse
     */
    public GetClusterAuditProjectResponse getClusterAuditProject(String clusterid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterAuditProjectWithOptions(clusterid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a cluster check task by cluster ID and task ID. You can view the status, check items, creation time, and end time of the task. Container Intelligence Service (CIS) provides a variety of Kubernetes cluster check features, including cluster update check, cluster migration check, component installation check, component update check, and node pool check.</p>
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
     * <b>summary</b> : 
     * <p>Queries a cluster check task by cluster ID and task ID. You can view the status, check items, creation time, and end time of the task. Container Intelligence Service (CIS) provides a variety of Kubernetes cluster check features, including cluster update check, cluster migration check, component installation check, component update check, and node pool check.</p>
     * @return GetClusterCheckResponse
     */
    public GetClusterCheckResponse getClusterCheck(String clusterId, String checkId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterCheckWithOptions(clusterId, checkId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster diagnostic items.</p>
     * 
     * @param request GetClusterDiagnosisCheckItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterDiagnosisCheckItemsResponse
     */
    public GetClusterDiagnosisCheckItemsResponse getClusterDiagnosisCheckItemsWithOptions(String clusterId, String diagnosisId, GetClusterDiagnosisCheckItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterDiagnosisCheckItems"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/diagnosis/" + com.aliyun.openapiutil.Client.getEncodeParam(diagnosisId) + "/check_items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterDiagnosisCheckItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster diagnostic items.</p>
     * 
     * @param request GetClusterDiagnosisCheckItemsRequest
     * @return GetClusterDiagnosisCheckItemsResponse
     */
    public GetClusterDiagnosisCheckItemsResponse getClusterDiagnosisCheckItems(String clusterId, String diagnosisId, GetClusterDiagnosisCheckItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterDiagnosisCheckItemsWithOptions(clusterId, diagnosisId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster diagnostic results.</p>
     * 
     * @param request GetClusterDiagnosisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterDiagnosisResultResponse
     */
    public GetClusterDiagnosisResultResponse getClusterDiagnosisResultWithOptions(String clusterId, String diagnosisId, GetClusterDiagnosisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterDiagnosisResult"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/diagnosis/" + com.aliyun.openapiutil.Client.getEncodeParam(diagnosisId) + "/result"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterDiagnosisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster diagnostic results.</p>
     * 
     * @param request GetClusterDiagnosisResultRequest
     * @return GetClusterDiagnosisResultResponse
     */
    public GetClusterDiagnosisResultResponse getClusterDiagnosisResult(String clusterId, String diagnosisId, GetClusterDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterDiagnosisResultWithOptions(clusterId, diagnosisId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves cluster inspection configuration.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterInspectConfigResponse
     */
    public GetClusterInspectConfigResponse getClusterInspectConfigWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterInspectConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterInspectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves cluster inspection configuration.</p>
     * @return GetClusterInspectConfigResponse
     */
    public GetClusterInspectConfigResponse getClusterInspectConfig(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterInspectConfigWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the details of the inspection report for the cluster</p>
     * 
     * @param request GetClusterInspectReportDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterInspectReportDetailResponse
     */
    public GetClusterInspectReportDetailResponse getClusterInspectReportDetailWithOptions(String clusterId, String reportId, GetClusterInspectReportDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFilter)) {
            query.put("enableFilter", request.enableFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterInspectReportDetail"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectReports/" + com.aliyun.openapiutil.Client.getEncodeParam(reportId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterInspectReportDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the details of the inspection report for the cluster</p>
     * 
     * @param request GetClusterInspectReportDetailRequest
     * @return GetClusterInspectReportDetailResponse
     */
    public GetClusterInspectReportDetailResponse getClusterInspectReportDetail(String clusterId, String reportId, GetClusterInspectReportDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterInspectReportDetailWithOptions(clusterId, reportId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetKubernetesTrigger operationto query the triggers of an application by application name.</p>
     * 
     * @deprecated OpenAPI GetKubernetesTrigger is deprecated
     * 
     * @param request GetKubernetesTriggerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the GetKubernetesTrigger operationto query the triggers of an application by application name.</p>
     * 
     * @deprecated OpenAPI GetKubernetesTrigger is deprecated
     * 
     * @param request GetKubernetesTriggerRequest
     * @return GetKubernetesTriggerResponse
     */
    @Deprecated
    // Deprecated
    public GetKubernetesTriggerResponse getKubernetesTrigger(String ClusterId, GetKubernetesTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKubernetesTriggerWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the GetUpgradeStatus operation to query the update progress of a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI GetUpgradeStatus is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUpgradeStatusResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the GetUpgradeStatus operation to query the update progress of a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI GetUpgradeStatus is deprecated
     * @return GetUpgradeStatusResponse
     */
    @Deprecated
    // Deprecated
    public GetUpgradeStatusResponse getUpgradeStatus(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUpgradeStatusWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you use a Resource Access Management (RAM) account to call this operation, make sure it has permissions to modify cluster authorization information for other RAM users or RAM roles. Otherwise, the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> error code is returned. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Use a RAM user to grant RBAC permissions to other RAM users</a>.</p>
     * <ul>
     * <li>This operation overwrites all existing cluster permissions for the target RAM user or RAM role. You must specify all the permissions you want to grant to the RAM user or RAM role in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a Resource Access Management (RAM) user or RAM role. By default, you do not have the RBAC permissions on a Container Service for Kubernetes (ACK) cluster if you are not the cluster owner or you are not using an Alibaba Cloud account. You can call this operation to specify the resources that can be accessed, permission scope, and predefined roles. This helps you better manage the access control on resources in ACK clusters.</p>
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
     * <b>description</b> :
     * <p>  If you use a Resource Access Management (RAM) account to call this operation, make sure it has permissions to modify cluster authorization information for other RAM users or RAM roles. Otherwise, the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> error code is returned. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Use a RAM user to grant RBAC permissions to other RAM users</a>.</p>
     * <ul>
     * <li>This operation overwrites all existing cluster permissions for the target RAM user or RAM role. You must specify all the permissions you want to grant to the RAM user or RAM role in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a Resource Access Management (RAM) user or RAM role. By default, you do not have the RBAC permissions on a Container Service for Kubernetes (ACK) cluster if you are not the cluster owner or you are not using an Alibaba Cloud account. You can call this operation to specify the resources that can be accessed, permission scope, and predefined roles. This helps you better manage the access control on resources in ACK clusters.</p>
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
     * <b>summary</b> : 
     * <p>为了增强Kubernetes能力，ACK集群支持了多种组件，例如托管的核心组件，应用、日志和监控、网络、存储、安全组件等。您可以调用InstallClusterAddons接口，通过组件名称和版本安装组件。</p>
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallClusterAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为了增强Kubernetes能力，ACK集群支持了多种组件，例如托管的核心组件，应用、日志和监控、网络、存储、安全组件等。您可以调用InstallClusterAddons接口，通过组件名称和版本安装组件。</p>
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
     * <b>summary</b> : 
     * <p>为ACK集群节点池安装节点组件</p>
     * 
     * @param request InstallNodePoolComponentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallNodePoolComponentsResponse
     */
    public InstallNodePoolComponentsResponse installNodePoolComponentsWithOptions(String clusterId, String nodePoolId, InstallNodePoolComponentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.components)) {
            body.put("components", request.components);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("nodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rollingPolicy", request.rollingPolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallNodePoolComponents"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodePoolId) + "/components"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallNodePoolComponentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为ACK集群节点池安装节点组件</p>
     * 
     * @param request InstallNodePoolComponentsRequest
     * @return InstallNodePoolComponentsResponse
     */
    public InstallNodePoolComponentsResponse installNodePoolComponents(String clusterId, String nodePoolId, InstallNodePoolComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installNodePoolComponentsWithOptions(clusterId, nodePoolId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available components based on specific conditions such as the region, cluster type, cluster subtype defined by cluster profile, and cluster version and queries the detailed information about a component. The information includes whether the component is managed, the supported custom parameter schema, and compatible operating system architecture.</p>
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
     * <b>summary</b> : 
     * <p>Queries the available components based on specific conditions such as the region, cluster type, cluster subtype defined by cluster profile, and cluster version and queries the detailed information about a component. The information includes whether the component is managed, the supported custom parameter schema, and compatible operating system architecture.</p>
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
     * <b>summary</b> : 
     * <p>获取集群组件实例的资源列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterAddonInstanceResourcesResponse
     */
    public ListClusterAddonInstanceResourcesResponse listClusterAddonInstanceResourcesWithOptions(String clusterId, String instanceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAddonInstanceResources"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/addon_instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceName) + "/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAddonInstanceResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群组件实例的资源列表</p>
     * @return ListClusterAddonInstanceResourcesResponse
     */
    public ListClusterAddonInstanceResourcesResponse listClusterAddonInstanceResources(String clusterId, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAddonInstanceResourcesWithOptions(clusterId, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the component instances that are running in the specified cluster and the information about the component instances. The information includes the component version and status.</p>
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
     * <b>summary</b> : 
     * <p>Queries the component instances that are running in the specified cluster and the information about the component instances. The information includes the component version and status.</p>
     * @return ListClusterAddonInstancesResponse
     */
    public ListClusterAddonInstancesResponse listClusterAddonInstances(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAddonInstancesWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the ListClusterChecks operation to query all the cluster check results of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>You can call the ListClusterChecks operation to query all the cluster check results of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>Obtains the details of the cluster inspection report.</p>
     * 
     * @param request ListClusterInspectReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterInspectReportsResponse
     */
    public ListClusterInspectReportsResponse listClusterInspectReportsWithOptions(String clusterId, ListClusterInspectReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterInspectReports"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectReports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterInspectReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of the cluster inspection report.</p>
     * 
     * @param request ListClusterInspectReportsRequest
     * @return ListClusterInspectReportsResponse
     */
    public ListClusterInspectReportsResponse listClusterInspectReports(String clusterId, ListClusterInspectReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterInspectReportsWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the kubeconfig files that are issued to users for the current cluster and the status of the kubeconfig files.</p>
     * 
     * @param request ListClusterKubeconfigStatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterKubeconfigStatesResponse
     */
    public ListClusterKubeconfigStatesResponse listClusterKubeconfigStatesWithOptions(String ClusterId, ListClusterKubeconfigStatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudServiceKubeConfig)) {
            query.put("cloudServiceKubeConfig", request.cloudServiceKubeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterKubeconfigStates"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/kubeconfig/states"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterKubeconfigStatesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the kubeconfig files that are issued to users for the current cluster and the status of the kubeconfig files.</p>
     * 
     * @param request ListClusterKubeconfigStatesRequest
     * @return ListClusterKubeconfigStatesResponse
     */
    public ListClusterKubeconfigStatesResponse listClusterKubeconfigStates(String ClusterId, ListClusterKubeconfigStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterKubeconfigStatesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automated maintenance schedules of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>Queries the automated maintenance schedules of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>获取单个地域的自动运维执行计划列表</p>
     * 
     * @param request ListOperationPlansForRegionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOperationPlansForRegionResponse
     */
    public ListOperationPlansForRegionResponse listOperationPlansForRegionWithOptions(String regionId, ListOperationPlansForRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOperationPlansForRegion"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions/" + com.aliyun.openapiutil.Client.getEncodeParam(regionId) + "/operation/plans"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOperationPlansForRegionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个地域的自动运维执行计划列表</p>
     * 
     * @param request ListOperationPlansForRegionRequest
     * @return ListOperationPlansForRegionResponse
     */
    public ListOperationPlansForRegionResponse listOperationPlansForRegion(String regionId, ListOperationPlansForRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationPlansForRegionWithOptions(regionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource labels and the detailed information, such as the key-value pairs of the labels and the clusters to which the labels are added. You can use labels to classify and manage Container Service for Kubernetes (ACK) clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.</p>
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
     * <b>summary</b> : 
     * <p>Queries resource labels and the detailed information, such as the key-value pairs of the labels and the clusters to which the labels are added. You can use labels to classify and manage Container Service for Kubernetes (ACK) clusters in order to meet monitoring, cost analysis, and tenant isolation requirements.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> To call this operation, make sure that you have the AliyunCSFullAccess permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the ListUserKubeConfigStates operation to query the status of the kubeconfig files of all clusters managed by the current user.</p>
     * 
     * @param request ListUserKubeConfigStatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserKubeConfigStatesResponse
     */
    public ListUserKubeConfigStatesResponse listUserKubeConfigStatesWithOptions(String Uid, ListUserKubeConfigStatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListUserKubeConfigStates"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(Uid) + "/kubeconfig/states"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserKubeConfigStatesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To call this operation, make sure that you have the AliyunCSFullAccess permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can call the ListUserKubeConfigStates operation to query the status of the kubeconfig files of all clusters managed by the current user.</p>
     * 
     * @param request ListUserKubeConfigStatesRequest
     * @return ListUserKubeConfigStatesResponse
     */
    public ListUserKubeConfigStatesResponse listUserKubeConfigStates(String Uid, ListUserKubeConfigStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserKubeConfigStatesWithOptions(Uid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The Container Service for Kubernetes (ACK) managed Pro cluster type is developed based on the ACK managed Basic cluster type. It inherits all benefits of ACK managed clusters, such as fully-managed control planes and control plane high availability. It further enhances reliability, security, scheduling capabilities, and offers service level agreement (SLA)-backed guarantees, making it ideal for enterprise customers with large-scale production workloads requiring high stability and security. You can call the MigrateCluster operation to migrate an ACK managed Basic cluster to an ACK managed Pro cluster.</p>
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
     * <b>summary</b> : 
     * <p>The Container Service for Kubernetes (ACK) managed Pro cluster type is developed based on the ACK managed Basic cluster type. It inherits all benefits of ACK managed clusters, such as fully-managed control planes and control plane high availability. It further enhances reliability, security, scheduling capabilities, and offers service level agreement (SLA)-backed guarantees, making it ideal for enterprise customers with large-scale production workloads requiring high stability and security. You can call the MigrateCluster operation to migrate an ACK managed Basic cluster to an ACK managed Pro cluster.</p>
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
     * <b>summary</b> : 
     * <p>You can call the ModifyCluster operation to modify the cluster configurations by cluster ID.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneConfig)) {
            body.put("control_plane_config", request.controlPlaneConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlPlaneEndpointsConfig)) {
            body.put("control_plane_endpoints_config", request.controlPlaneEndpointsConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("security_group_id", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemEventsLogging)) {
            body.put("system_events_logging", request.systemEventsLogging);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchIds)) {
            body.put("vswitch_ids", request.vswitchIds);
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
     * <b>summary</b> : 
     * <p>You can call the ModifyCluster operation to modify the cluster configurations by cluster ID.</p>
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
     * <b>description</b> :
     * <p>You can call this API operation to modify the component parameters of an ACK Basic cluster or the control plane parameters of an ACK Pro cluster:</p>
     * <ul>
     * <li>To view the component parameters of an ACK Basic cluster, call the DescribeClusterAddonMetadata API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query the metadata of a cluster component</a>.</li>
     * <li>To view the control plane parameters of an ACK Pro cluster, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameters of an ACK Pro cluster</a>.
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cluster component. This operation may affect your businesses. We recommend that you assess the impact, back up data, and perform the operation during off-peak hours.</p>
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
     * <b>description</b> :
     * <p>You can call this API operation to modify the component parameters of an ACK Basic cluster or the control plane parameters of an ACK Pro cluster:</p>
     * <ul>
     * <li>To view the component parameters of an ACK Basic cluster, call the DescribeClusterAddonMetadata API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query the metadata of a cluster component</a>.</li>
     * <li>To view the control plane parameters of an ACK Pro cluster, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameters of an ACK Pro cluster</a>.
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cluster component. This operation may affect your businesses. We recommend that you assess the impact, back up data, and perform the operation during off-peak hours.</p>
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
     * <b>summary</b> : 
     * <p>You can call the ModifyClusterNodePool operation to modify the configuration of a node pool with the specified node pool ID.</p>
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
     * <b>summary</b> : 
     * <p>You can call the ModifyClusterNodePool operation to modify the configuration of a node pool with the specified node pool ID.</p>
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
     * <b>summary</b> : 
     * <p>You can add labels in key-value pairs to clusters. This allows cluster developers or O\\\&amp;M engineers to classify and manage clusters in a more flexible manner. This also meets the requirements for monitoring, cost analysis, and tenant isolation. You can call the ModifyClusterTags operation to modify the labels of a cluster.</p>
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
     * <b>summary</b> : 
     * <p>You can add labels in key-value pairs to clusters. This allows cluster developers or O\\\&amp;M engineers to classify and manage clusters in a more flexible manner. This also meets the requirements for monitoring, cost analysis, and tenant isolation. You can call the ModifyClusterTags operation to modify the labels of a cluster.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a node pool, such as the kubelet configuration and node rolling update configuration. After you modify the node pool configuration, nodes are batch updated and the kubelet on each node is restarted. This may adversely affect the nodes and workloads. We recommend that you perform this operation during off-peak hours.</p>
     * 
     * @param request ModifyNodePoolNodeConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodePoolNodeConfigResponse
     */
    public ModifyNodePoolNodeConfigResponse modifyNodePoolNodeConfigWithOptions(String ClusterId, String NodepoolId, ModifyNodePoolNodeConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerdConfig)) {
            body.put("containerd_config", request.containerdConfig);
        }

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
     * <b>description</b> :
     * <blockquote>
     * <p> Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a node pool, such as the kubelet configuration and node rolling update configuration. After you modify the node pool configuration, nodes are batch updated and the kubelet on each node is restarted. This may adversely affect the nodes and workloads. We recommend that you perform this operation during off-peak hours.</p>
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
     * <b>summary</b> : 
     * <p>Updates a policy in a specific Container Service for Kubernetes (ACK) cluster. You can modify the action of the policy such as alerting or denying and namespaces to which the policy applies.</p>
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
     * <b>summary</b> : 
     * <p>Updates a policy in a specific Container Service for Kubernetes (ACK) cluster. You can modify the action of the policy such as alerting or denying and namespaces to which the policy applies.</p>
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
     * <b>description</b> :
     * <p>  You can activate ACK by using Alibaba Cloud accounts.</p>
     * <ul>
     * <li>To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When using Container Service for Kubernetes (ACK) for the first time, you must call the OpenAckService operation to activate the service.</p>
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
     * <b>description</b> :
     * <p>  You can activate ACK by using Alibaba Cloud accounts.</p>
     * <ul>
     * <li>To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When using Container Service for Kubernetes (ACK) for the first time, you must call the OpenAckService operation to activate the service.</p>
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
     * <b>summary</b> : 
     * <p>You can call the PauseClusterUpgrade operation to pause the update of a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseClusterUpgradeResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the PauseClusterUpgrade operation to pause the update of a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated
     * @return PauseClusterUpgradeResponse
     */
    @Deprecated
    // Deprecated
    public PauseClusterUpgradeResponse pauseClusterUpgrade(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseClusterUpgradeWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the PauseComponentUpgrade operation to pause the update of a component.</p>
     * 
     * @deprecated OpenAPI PauseComponentUpgrade is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the PauseComponentUpgrade operation to pause the update of a component.</p>
     * 
     * @deprecated OpenAPI PauseComponentUpgrade is deprecated
     * @return PauseComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
    public PauseComponentUpgradeResponse pauseComponentUpgrade(String clusterid, String componentid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses an on-going task.</p>
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
     * <b>summary</b> : 
     * <p>Pauses an on-going task.</p>
     * @return PauseTaskResponse
     */
    public PauseTaskResponse pauseTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * <ul>
     * <li>When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</li>
     * <li>Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>You can remove only worker nodes. You cannot remove master nodes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the RemoveClusterNodes operation to remove nodes from a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @deprecated OpenAPI RemoveClusterNodes is deprecated
     * 
     * @param request RemoveClusterNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClusterNodesResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <hr>
     * <ul>
     * <li>When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</li>
     * <li>Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>You can remove only worker nodes. You cannot remove master nodes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the RemoveClusterNodes operation to remove nodes from a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @deprecated OpenAPI RemoveClusterNodes is deprecated
     * 
     * @param request RemoveClusterNodesRequest
     * @return RemoveClusterNodesResponse
     */
    @Deprecated
    // Deprecated
    public RemoveClusterNodesResponse removeClusterNodes(String ClusterId, RemoveClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeClusterNodesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you remove a node, the pods on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>The system removes only worker nodes. It does not remove master nodes.</li>
     * <li>Even if you set the <code>release_node</code> parameter to <code>true</code>, subscription nodes are not released. You must release the subscription nodes in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after you remove the nodes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a node pool.</p>
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
     * <b>description</b> :
     * <p>  When you remove a node, the pods on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>The system removes only worker nodes. It does not remove master nodes.</li>
     * <li>Even if you set the <code>release_node</code> parameter to <code>true</code>, subscription nodes are not released. You must release the subscription nodes in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after you remove the nodes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a node pool.</p>
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
     * <b>summary</b> : 
     * <p>Repairs a node pool.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.operations)) {
            body.put("operations", request.operations);
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
     * <b>summary</b> : 
     * <p>Repairs a node pool.</p>
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
     * <b>summary</b> : 
     * <p>You can call the ResumeComponentUpgrade operation to resume the update of a component.</p>
     * 
     * @deprecated OpenAPI ResumeComponentUpgrade is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the ResumeComponentUpgrade operation to resume the update of a component.</p>
     * 
     * @deprecated OpenAPI ResumeComponentUpgrade is deprecated
     * @return ResumeComponentUpgradeResponse
     */
    @Deprecated
    // Deprecated
    public ResumeComponentUpgradeResponse resumeComponentUpgrade(String clusterid, String componentid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeComponentUpgradeWithOptions(clusterid, componentid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a task.</p>
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
     * <b>summary</b> : 
     * <p>Resumes a task.</p>
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the ResumeUpgradeCluster operation to resume the update of a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeUpgradeClusterResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>You can call the ResumeUpgradeCluster operation to resume the update of a cluster by cluster ID.</p>
     * 
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated
     * @return ResumeUpgradeClusterResponse
     */
    @Deprecated
    // Deprecated
    public ResumeUpgradeClusterResponse resumeUpgradeCluster(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeUpgradeClusterWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the RevokeK8sClusterKubeConfig operation to revoke the kubeconfig file of a cluster that belongs to the current Alibaba Cloud account or RAM user. After the kubeconfig file is revoked, the cluster generates a new kubeconfig file, and the original kubeconfig file becomes invalid.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeK8sClusterKubeConfigResponse
     */
    public RevokeK8sClusterKubeConfigResponse revokeK8sClusterKubeConfigWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeK8sClusterKubeConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/k8s/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/certs"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeK8sClusterKubeConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the RevokeK8sClusterKubeConfig operation to revoke the kubeconfig file of a cluster that belongs to the current Alibaba Cloud account or RAM user. After the kubeconfig file is revoked, the cluster generates a new kubeconfig file, and the original kubeconfig file becomes invalid.</p>
     * @return RevokeK8sClusterKubeConfigResponse
     */
    public RevokeK8sClusterKubeConfigResponse revokeK8sClusterKubeConfig(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeK8sClusterKubeConfigWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Container Intelligence Service (CIS) provides a variety of cluster check capabilities to allow you to perform cluster update check, cluster migration check, component installation check, component update check, and node pool check. A precheck is automatically triggered before an update, migration, or installation is performed. You can perform changes only if the cluster passes the precheck. You can also manually call the RunClusterCheck operation to initiate cluster checks. We recommend that you periodically check and maintain your cluster to mitigate potential risks.</p>
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
     * <b>summary</b> : 
     * <p>Container Intelligence Service (CIS) provides a variety of cluster check capabilities to allow you to perform cluster update check, cluster migration check, component installation check, component update check, and node pool check. A precheck is automatically triggered before an update, migration, or installation is performed. You can perform changes only if the cluster passes the precheck. You can also manually call the RunClusterCheck operation to initiate cluster checks. We recommend that you periodically check and maintain your cluster to mitigate potential risks.</p>
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
     * <b>summary</b> : 
     * <p>Triggers a cluster inspection and generates a report.</p>
     * 
     * @param request RunClusterInspectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunClusterInspectResponse
     */
    public RunClusterInspectResponse runClusterInspectWithOptions(String clusterId, RunClusterInspectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunClusterInspect"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectReports"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunClusterInspectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers a cluster inspection and generates a report.</p>
     * 
     * @param request RunClusterInspectRequest
     * @return RunClusterInspectResponse
     */
    public RunClusterInspectResponse runClusterInspect(String clusterId, RunClusterInspectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runClusterInspectWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales out a node pool.</p>
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
     * <b>summary</b> : 
     * <p>Scales out a node pool.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see <a href="https://help.aliyun.com/document_detail/184928.html">ScaleClusterNodePool</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the ScaleOutCluster operation to scale out a cluster by cluster ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see <a href="https://help.aliyun.com/document_detail/184928.html">ScaleClusterNodePool</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the ScaleOutCluster operation to scale out a cluster by cluster ID.</p>
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
     * <b>summary</b> : 
     * <p>Scans for vulnerabilities in a Container Service for Kubernetes (ACK) cluster, including workload vulnerabilities, third-party software vulnerabilities, CVE vulnerabilities, WebCMS vulnerabilities, and Windows vulnerabilities. We recommend that you scan your cluster on a regular basis to ensure cluster security.</p>
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
     * <b>summary</b> : 
     * <p>Scans for vulnerabilities in a Container Service for Kubernetes (ACK) cluster, including workload vulnerabilities, third-party software vulnerabilities, CVE vulnerabilities, WebCMS vulnerabilities, and Windows vulnerabilities. We recommend that you scan your cluster on a regular basis to ensure cluster security.</p>
     * @return ScanClusterVulsResponse
     */
    public ScanClusterVulsResponse scanClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the specified alert rule(s).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Activates the specified alert rule(s).</p>
     * 
     * @param request StartAlertRequest
     * @return StartAlertResponse
     */
    public StartAlertResponse startAlert(String ClusterId, StartAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAlertWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the StopAlert operation to disable an alert rule or an alert rule set in the alert center of Container Service for Kubernetes (ACK).</p>
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
     * <b>summary</b> : 
     * <p>You can call the StopAlert operation to disable an alert rule or an alert rule set in the alert center of Container Service for Kubernetes (ACK).</p>
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
     * <b>summary</b> : 
     * <p>Synchronizes the information about a node pool, including the metadata and node information of the node pool.</p>
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
     * <b>summary</b> : 
     * <p>Synchronizes the information about a node pool, including the metadata and node information of the node pool.</p>
     * @return SyncClusterNodePoolResponse
     */
    public SyncClusterNodePoolResponse syncClusterNodePool(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncClusterNodePoolWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can add labels in key-value pairs to clusters. This allows cluster developers or O\&amp;M engineers to classify and manage clusters in a more flexible manner. This also meets the requirements for monitoring, cost analysis, and tenant isolation. You can call the TagResources operation to add labels to a cluster.</p>
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
     * <b>summary</b> : 
     * <p>You can add labels in key-value pairs to clusters. This allows cluster developers or O\&amp;M engineers to classify and manage clusters in a more flexible manner. This also meets the requirements for monitoring, cost analysis, and tenant isolation. You can call the TagResources operation to add labels to a cluster.</p>
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
     * <b>summary</b> : 
     * <p>Uninstalls components that you no longer need from a cluster. You must specify the name of the components and specify whether to release associated Alibaba Cloud resources from the cluster.</p>
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnInstallClusterAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls components that you no longer need from a cluster. You must specify the name of the components and specify whether to release associated Alibaba Cloud resources from the cluster.</p>
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
     * <b>summary</b> : 
     * <p>If you no longer need the labels (key-value pairs) of a cluster, you can call the UntagResources operation to delete the labels.</p>
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
     * <b>summary</b> : 
     * <p>If you no longer need the labels (key-value pairs) of a cluster, you can call the UntagResources operation to delete the labels.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and pricing of <a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UpdateClusterAuditLogConfig operation to enable or disable the audit log feature in a Container Service for Kubernetes (ACK) cluster and update the audit log configuration. This operation also allows you to record requests to the Kubernetes API and the responses, which can be used to trace cluster operation history and troubleshoot cluster issues.</p>
     * 
     * @param request UpdateClusterAuditLogConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterAuditLogConfigResponse
     */
    public UpdateClusterAuditLogConfigResponse updateClusterAuditLogConfigWithOptions(String clusterid, UpdateClusterAuditLogConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disable)) {
            body.put("disable", request.disable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectName)) {
            body.put("sls_project_name", request.slsProjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterAuditLogConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterid) + "/audit_log"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterAuditLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and pricing of <a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UpdateClusterAuditLogConfig operation to enable or disable the audit log feature in a Container Service for Kubernetes (ACK) cluster and update the audit log configuration. This operation also allows you to record requests to the Kubernetes API and the responses, which can be used to trace cluster operation history and troubleshoot cluster issues.</p>
     * 
     * @param request UpdateClusterAuditLogConfigRequest
     * @return UpdateClusterAuditLogConfigResponse
     */
    public UpdateClusterAuditLogConfigResponse updateClusterAuditLogConfig(String clusterid, UpdateClusterAuditLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateClusterAuditLogConfigWithOptions(clusterid, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cluster inspection configurations.</p>
     * 
     * @param request UpdateClusterInspectConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterInspectConfigResponse
     */
    public UpdateClusterInspectConfigResponse updateClusterInspectConfigWithOptions(String clusterId, UpdateClusterInspectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disabledCheckItems)) {
            body.put("disabledCheckItems", request.disabledCheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            body.put("scheduleTime", request.scheduleTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterInspectConfig"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/inspectConfig"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterInspectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cluster inspection configurations.</p>
     * 
     * @param request UpdateClusterInspectConfigRequest
     * @return UpdateClusterInspectConfigResponse
     */
    public UpdateClusterInspectConfigResponse updateClusterInspectConfig(String clusterId, UpdateClusterInspectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateClusterInspectConfigWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateContactGroupForAlert operation to specify a contact group for an alert rule in an ACK cluster.</p>
     * 
     * @param request UpdateContactGroupForAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactGroupForAlertResponse
     */
    public UpdateContactGroupForAlertResponse updateContactGroupForAlertWithOptions(String ClusterId, UpdateContactGroupForAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleGroupName)) {
            body.put("alert_rule_group_name", request.alertRuleGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIds)) {
            body.put("contact_group_ids", request.contactGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crName)) {
            body.put("cr_name", request.crName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactGroupForAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the UpdateContactGroupForAlert operation to specify a contact group for an alert rule in an ACK cluster.</p>
     * 
     * @param request UpdateContactGroupForAlertRequest
     * @return UpdateContactGroupForAlertResponse
     */
    public UpdateContactGroupForAlertResponse updateContactGroupForAlert(String ClusterId, UpdateContactGroupForAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContactGroupForAlertWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the log configurations of control plane components. The configurations include the log retention period and components whose logs that you want to collect. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube-apiserver, kube-scheduler, Kubernetes controller manager, and cloud controller manager (CCM).</p>
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
     * <b>summary</b> : 
     * <p>Modifies the log configurations of control plane components. The configurations include the log retention period and components whose logs that you want to collect. Container Service for Kubernetes (ACK) managed clusters can collect the logs of control plane components and deliver the logs to projects in Simple Log Service. These control plane components include Kube-apiserver, kube-scheduler, Kubernetes controller manager, and cloud controller manager (CCM).</p>
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
     * <b>description</b> :
     * <p>  You can call this operation only with an Alibaba Cloud account.</p>
     * <ul>
     * <li>If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the validity period of a kubeconfig file used by a Resource Access Management (RAM) user or RAM role to connect to a Container Service for Kubernetes (ACK) cluster. The validity period ranges from 1 to 876,000 hours. You can call this API operation when you customize configurations by using an Alibaba Cloud account. The default validity period of a kubeconfig file is three years.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation only with an Alibaba Cloud account.</p>
     * <ul>
     * <li>If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the validity period of a kubeconfig file used by a Resource Access Management (RAM) user or RAM role to connect to a Container Service for Kubernetes (ACK) cluster. The validity period ranges from 1 to 876,000 hours. You can call this API operation when you customize configurations by using an Alibaba Cloud account. The default validity period of a kubeconfig file is three years.</p>
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
     * <b>summary</b> : 
     * <p>更新节点组件</p>
     * 
     * @param request UpdateNodePoolComponentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodePoolComponentResponse
     */
    public UpdateNodePoolComponentResponse updateNodePoolComponentWithOptions(String clusterId, String nodepoolId, UpdateNodePoolComponentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRolling)) {
            body.put("disableRolling", request.disableRolling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("nodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rollingPolicy", request.rollingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodePoolComponent"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodePoolComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新节点组件</p>
     * 
     * @param request UpdateNodePoolComponentRequest
     * @return UpdateNodePoolComponentResponse
     */
    public UpdateNodePoolComponentResponse updateNodePoolComponent(String clusterId, String nodepoolId, UpdateNodePoolComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNodePoolComponentWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the deletion protection status of the specified resources. You can enable or disable deletion protection for namespaces and Services. You can call this operation to enable deletion protection for namespaces or Services that involve businesses-critical and sensitive data to avoid incurring maintenance costs caused by accidental namespace or Service deletion.</p>
     * 
     * @param request UpdateResourcesDeleteProtectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourcesDeleteProtectionResponse
     */
    public UpdateResourcesDeleteProtectionResponse updateResourcesDeleteProtectionWithOptions(String ClusterId, UpdateResourcesDeleteProtectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourcesDeleteProtection"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/resources/protection"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourcesDeleteProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the deletion protection status of the specified resources. You can enable or disable deletion protection for namespaces and Services. You can call this operation to enable deletion protection for namespaces or Services that involve businesses-critical and sensitive data to avoid incurring maintenance costs caused by accidental namespace or Service deletion.</p>
     * 
     * @param request UpdateResourcesDeleteProtectionRequest
     * @return UpdateResourcesDeleteProtectionResponse
     */
    public UpdateResourcesDeleteProtectionResponse updateResourcesDeleteProtection(String ClusterId, UpdateResourcesDeleteProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourcesDeleteProtectionWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of an orchestration template. An orchestration template defines and describes a group of Container Service for Kubernetes (ACK) resources. An orchestration template describes the configurations of an application or how an application runs in a declarative manner.</p>
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
     * <b>summary</b> : 
     * <p>Updates the configurations of an orchestration template. An orchestration template defines and describes a group of Container Service for Kubernetes (ACK) resources. An orchestration template describes the configurations of an application or how an application runs in a declarative manner.</p>
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
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>You can update the permissions of a RAM user or RAM role on a cluster by using full update or incremental update. If you use full update, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation. If you use incremental update, you can grant permissions to or revoke permissions from the RAM user or RAM role on the cluster. In this case, only the permissions that you specify in the request parameters when you call the operation are granted or revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a Resource Access Management (RAM) user or RAM role. By default, you do not have the RBAC permissions on a Container Service for Kubernetes (ACK) cluster if you are not the cluster owner or you are not using an Alibaba Cloud account. You can call this operation to specify the resources that can be accessed, permission scope, and predefined roles. This helps you better manage the access control on resources in ACK clusters.</p>
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
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>You can update the permissions of a RAM user or RAM role on a cluster by using full update or incremental update. If you use full update, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation. If you use incremental update, you can grant permissions to or revoke permissions from the RAM user or RAM role on the cluster. In this case, only the permissions that you specify in the request parameters when you call the operation are granted or revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a Resource Access Management (RAM) user or RAM role. By default, you do not have the RBAC permissions on a Container Service for Kubernetes (ACK) cluster if you are not the cluster owner or you are not using an Alibaba Cloud account. You can call this operation to specify the resources that can be accessed, permission scope, and predefined roles. This helps you better manage the access control on resources in ACK clusters.</p>
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
     * <b>description</b> :
     * <p>After successfully calling the UpgradeCluster interface, this API returns the <code>task_id</code> of the upgrade task. You can manage this operation task by calling the following task APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a task that has been paused</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Outdated Kubernetes versions may have security and stability issues. We recommend that you update the Kubernetes version of your cluster at the earliest opportunity to enjoy the new features of the new Kubernetes version. You can call the UpgradeCluster operation to manually upgrade a cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rolling_policy", request.rollingPolicy);
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
     * <b>description</b> :
     * <p>After successfully calling the UpgradeCluster interface, this API returns the <code>task_id</code> of the upgrade task. You can manage this operation task by calling the following task APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a task that has been paused</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Outdated Kubernetes versions may have security and stability issues. We recommend that you update the Kubernetes version of your cluster at the earliest opportunity to enjoy the new features of the new Kubernetes version. You can call the UpgradeCluster operation to manually upgrade a cluster.</p>
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
     * <b>summary</b> : 
     * <p>Updates cluster components to use new features and patch vulnerabilities. You must update cluster components one after one and update a component only after the previous one is successfully updated. Before you update a component, we recommend that you read the update notes for each component. Cluster component updates may affect your businesses. Assess the impact, back up data, and perform the update during off-peak hours.</p>
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates cluster components to use new features and patch vulnerabilities. You must update cluster components one after one and update a component only after the previous one is successfully updated. Before you update a component, we recommend that you read the update notes for each component. Cluster component updates may affect your businesses. Assess the impact, back up data, and perform the update during off-peak hours.</p>
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
     * <b>description</b> :
     * <p>This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UpgradeClusterNodepool operation to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
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
     * <b>description</b> :
     * <p>This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the UpgradeClusterNodepool operation to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
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
