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
     * <b>description</b> :
     * <p>Read <a href="https://help.aliyun.com/document_detail/86919.html">Limits</a> before calling this operation to ensure that the ECS instances to be added meet the requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds existing ECS instances to an ACK cluster. You can invoke this operation if you need to add a purchased cloud server to an ACK cluster as a worker node, or re-add a removed worker node instance to a node pool.</p>
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
     * <b>description</b> :
     * <p>Read <a href="https://help.aliyun.com/document_detail/86919.html">Limits</a> before calling this operation to ensure that the ECS instances to be added meet the requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds existing ECS instances to an ACK cluster. You can invoke this operation if you need to add a purchased cloud server to an ACK cluster as a worker node, or re-add a removed worker node instance to a node pool.</p>
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
     * <p>Adds existing ECS instances to a node pool as worker nodes in an ACK cluster, or re-adds removed worker nodes to a node pool.</p>
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
     * <p>Adds existing ECS instances to a node pool as worker nodes in an ACK cluster, or re-adds removed worker nodes to a node pool.</p>
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
     * <p>Cancels the upgrade of an ACK cluster.</p>
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
     * <p>Cancels the upgrade of an ACK cluster.</p>
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
     * <p>Cancels the upgrade of a cluster component.</p>
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
     * <p>Cancels the upgrade of a cluster component.</p>
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
     * <p>Cancels an existing but unexecuted automated O&amp;M task execution plan.</p>
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
     * <p>Cancels an existing but unexecuted automated O&amp;M task execution plan.</p>
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
     * <p>Queries the log configuration of control plane components in an ACK managed cluster. ACK managed clusters support collecting control plane component logs and delivering them to your Simple Log Service (SLS) project. Control plane components include core components such as Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager. You can call this operation to query the current log configuration of control plane components, including the log retention period and collected components.</p>
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
     * <p>Queries the log configuration of control plane components in an ACK managed cluster. ACK managed clusters support collecting control plane component logs and delivering them to your Simple Log Service (SLS) project. Control plane components include core components such as Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager. You can call this operation to query the current log configuration of control plane components, including the log retention period and collected components.</p>
     * @return CheckControlPlaneLogEnableResponse
     */
    public CheckControlPlaneLogEnableResponse checkControlPlaneLogEnable(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkControlPlaneLogEnableWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the current service account is granted the specified service role permissions. Container Service for Kubernetes can call other cloud services related to the service role, such as ECS, OSS, NAS, and SLB, only after the corresponding role permissions are granted.</p>
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
     * <p>Checks whether the current service account is granted the specified service role permissions. Container Service for Kubernetes can call other cloud services related to the service role, such as ECS, OSS, NAS, and SLB, only after the corresponding role permissions are granted.</p>
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
     * <ol>
     * <li>You must have the permissions to manage Container Service for Kubernetes (CS). The required policy is AliyunCSFullAccess. </li>
     * <li>You cannot clear the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot clear the permissions of the user who performs this operation.</li>
     * </ol>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Clears the issued KubeConfig credentials and Role-Based Access Control (RBAC) permissions of a specified user in a specified cluster. You can call this operation to clean up and revoke authorization for KubeConfig files that pose security risks.</p>
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
     * <ol>
     * <li>You must have the permissions to manage Container Service for Kubernetes (CS). The required policy is AliyunCSFullAccess. </li>
     * <li>You cannot clear the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot clear the permissions of the user who performs this operation.</li>
     * </ol>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Clears the issued KubeConfig credentials and Role-Based Access Control (RBAC) permissions of a specified user in a specified cluster. You can call this operation to clean up and revoke authorization for KubeConfig files that pose security risks.</p>
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
     * <li>Requires the permissions to manage Container Service for Kubernetes (CS) (AliyunCSFullAccess).</li>
     * <li>Clearing the permissions of Alibaba Cloud accounts is not supported.</li>
     * <li>Clearing the permissions of the calling user is not supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cleans up and revokes the KubeConfig credentials and RBAC permissions issued to a specified user, such as resigned employees or users with frozen accounts.</p>
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
     * <li>Requires the permissions to manage Container Service for Kubernetes (CS) (AliyunCSFullAccess).</li>
     * <li>Clearing the permissions of Alibaba Cloud accounts is not supported.</li>
     * <li>Clearing the permissions of the calling user is not supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cleans up and revokes the KubeConfig credentials and RBAC permissions issued to a specified user, such as resigned employees or users with frozen accounts.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a self-healing rule.</p>
     * 
     * @param request CreateAutoRepairPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoRepairPolicyResponse
     */
    public CreateAutoRepairPolicyResponse createAutoRepairPolicyWithOptions(String clusterId, CreateAutoRepairPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSubType)) {
            body.put("resource_sub_type", request.resourceSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resource_type", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoRepairPolicy"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/auto_repair_policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoRepairPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a self-healing rule.</p>
     * 
     * @param request CreateAutoRepairPolicyRequest
     * @return CreateAutoRepairPolicyResponse
     */
    public CreateAutoRepairPolicyResponse createAutoRepairPolicy(String clusterId, CreateAutoRepairPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAutoRepairPolicyWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an elastic scaling configuration that enables the system to automatically increase or decrease compute resources based on the configured scaling rules to meet the workload demands of your cluster. During the creation procedure, you can specify scaling metrics and thresholds, scale-out order, cool-down period, and more.</p>
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
     * <p>Creates an elastic scaling configuration that enables the system to automatically increase or decrease compute resources based on the configured scaling rules to meet the workload demands of your cluster. During the creation procedure, you can specify scaling metrics and thresholds, scale-out order, cool-down period, and more.</p>
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
     * <h3>Generate OpenAPI request parameters by using the console</h3>
     * <p>When you call the CreateCluster operation to create a cluster, if the API call fails due to incorrect combinations of request parameters, you can use the console to generate the required request parameter combinations. Perform the following steps:</p>
     * <ol>
     * <li>Log on to the <a href="https://csnew.console.aliyun.com">Container Service for Kubernetes (ACK) console</a> and choose <strong>Clusters</strong> in the left-side navigation pane.</li>
     * <li>On the <strong>Clusters</strong> page, click <strong>Cluster Template</strong>.</li>
     * <li>In the dialog box, select the cluster type that you want to create, click Create, and then configure the cluster information on the cluster configuration page.</li>
     * <li>After the configuration is complete, on the <strong>Confirm Configuration</strong> page, click <strong>Equivalent Code</strong> in the upper-right corner. The dialog box displays the parameter combinations required for creating the cluster. You can copy and use them.<blockquote>
     * <p>Notice: Starting from July 04, 2026, some request parameters will no longer take effect. For details about the changes and replacement parameter descriptions, see <a href="https://help.aliyun.com/document_detail/2932733.html">Notice on changes to OpenAPI request and response parameters for ACK cluster management and OpenAPI offline</a>.</notice></p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates an ACK cluster, including ACK managed clusters, ACK Serverless clusters, ACK Edge clusters, and registered clusters. When you create a cluster, you configure cluster information, cluster components, and ACK-related cloud resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("client_token", request.clientToken);
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
     * <h3>Generate OpenAPI request parameters by using the console</h3>
     * <p>When you call the CreateCluster operation to create a cluster, if the API call fails due to incorrect combinations of request parameters, you can use the console to generate the required request parameter combinations. Perform the following steps:</p>
     * <ol>
     * <li>Log on to the <a href="https://csnew.console.aliyun.com">Container Service for Kubernetes (ACK) console</a> and choose <strong>Clusters</strong> in the left-side navigation pane.</li>
     * <li>On the <strong>Clusters</strong> page, click <strong>Cluster Template</strong>.</li>
     * <li>In the dialog box, select the cluster type that you want to create, click Create, and then configure the cluster information on the cluster configuration page.</li>
     * <li>After the configuration is complete, on the <strong>Confirm Configuration</strong> page, click <strong>Equivalent Code</strong> in the upper-right corner. The dialog box displays the parameter combinations required for creating the cluster. You can copy and use them.<blockquote>
     * <p>Notice: Starting from July 04, 2026, some request parameters will no longer take effect. For details about the changes and replacement parameter descriptions, see <a href="https://help.aliyun.com/document_detail/2932733.html">Notice on changes to OpenAPI request and response parameters for ACK cluster management and OpenAPI offline</a>.</notice></p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates an ACK cluster, including ACK managed clusters, ACK Serverless clusters, ACK Edge clusters, and registered clusters. When you create a cluster, you configure cluster information, cluster components, and ACK-related cloud resources.</p>
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
     * <p>Initiates a cluster diagnosis.</p>
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
     * <p>Initiates a cluster diagnosis.</p>
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
     * <p>Creates a cluster inspection configuration.</p>
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
     * <p>Creates a cluster inspection configuration.</p>
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
     * <p>Creates a node pool for a cluster. A node pool is a logical collection of nodes that share the same attributes. It allows unified management and O&amp;M of nodes, such as node upgrades and elastic scaling. You can use the automated O&amp;M capabilities of node pools to reduce O&amp;M costs. These capabilities include automatic repair of OS CVE vulnerabilities, automatic recovery of faulty nodes, and automatic upgrades of kubelet and containerd versions.</p>
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
     * <p>Creates a node pool for a cluster. A node pool is a logical collection of nodes that share the same attributes. It allows unified management and O&amp;M of nodes, such as node upgrades and elastic scaling. You can use the automated O&amp;M capabilities of node pools to reduce O&amp;M costs. These capabilities include automatic repair of OS CVE vulnerabilities, automatic recovery of faulty nodes, and automatic upgrades of kubelet and containerd versions.</p>
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
     * <p>Creates a trigger for an application.</p>
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
     * <p>Creates a trigger for an application.</p>
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
     * <p>Installs node components.</p>
     * 
     * @param request CreateNodePoolComponentInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodePoolComponentInstancesResponse
     */
    public CreateNodePoolComponentInstancesResponse createNodePoolComponentInstancesWithOptions(String clusterId, String nodepoolId, CreateNodePoolComponentInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.components)) {
            body.put("components", request.components);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("node_names", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingPolicy)) {
            body.put("rolling_policy", request.rollingPolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodePoolComponentInstances"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component_instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodePoolComponentInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs node components.</p>
     * 
     * @param request CreateNodePoolComponentInstancesRequest
     * @return CreateNodePoolComponentInstancesResponse
     */
    public CreateNodePoolComponentInstancesResponse createNodePoolComponentInstances(String clusterId, String nodepoolId, CreateNodePoolComponentInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNodePoolComponentInstancesWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an orchestration template. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how applications should run or be configured. You can use these templates to automate deployment and cluster management of resources, such as Pods, Services, Deployments, ConfigMaps, and PersistentVolumes. You can invoke the CreateTemplate API operation to create an orchestration template.</p>
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
     * <p>Creates an orchestration template. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how applications should run or be configured. You can use these templates to automate deployment and cluster management of resources, such as Pods, Services, Deployments, ConfigMaps, and PersistentVolumes. You can invoke the CreateTemplate API operation to create an orchestration template.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Creating a trigger only supports pod redeployment.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a trigger for a cluster application to redeploy pods when specific conditions are met.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Creating a trigger only supports pod redeployment.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a trigger for a cluster application to redeploy pods when specific conditions are met.</p>
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
     * <p>Deletes ACK alert contacts.</p>
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
     * <p>Deletes ACK alert contacts.</p>
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
     * <p>Deletes ACK alert contact groups.</p>
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
     * <p>Deletes ACK alert contact groups.</p>
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
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a self-healing rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoRepairPolicyResponse
     */
    public DeleteAutoRepairPolicyResponse deleteAutoRepairPolicyWithOptions(String clusterId, String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoRepairPolicy"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/auto_repair_policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoRepairPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a self-healing rule.</p>
     * @return DeleteAutoRepairPolicyResponse
     */
    public DeleteAutoRepairPolicyResponse deleteAutoRepairPolicy(String clusterId, String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAutoRepairPolicyWithOptions(clusterId, policyId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Risk warnings:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun computing nodes in the cluster cannot be automatically released. To avoid unnecessary costs, perform a manual release. For more information, see Cluster deletion and node release rules.</li>
     * <li>Subscription API server SLB resources cannot be automatically released. To avoid unnecessary costs, perform a manual release.</li>
     * <li>VPCs, vSwitches, security groups, and RAM roles are retained by default if they are used by other resources and cannot be deleted. Perform a manual release.</li>
     * <li>Elastic Container Instance (ECI) pods created by using virtual nodes are automatically released.</li>
     * <li>Some cloud resources created by the cluster are not automatically released when the cluster is deleted. These resources continue to incur charges after the cluster is deleted. Release or retain them based on your business requirements. These resources include: Simple Log Service (SLS) projects automatically created by the cluster, and cloud disks purchased by using dynamic volumes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cluster and specifies whether to delete or retain the associated resources of the cluster. Before you delete a cluster, manually clean up workloads such as stateless, stateful, job, and cron job workloads. Otherwise, the cluster deletion may fail.</p>
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
     * <p>Risk warnings:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun computing nodes in the cluster cannot be automatically released. To avoid unnecessary costs, perform a manual release. For more information, see Cluster deletion and node release rules.</li>
     * <li>Subscription API server SLB resources cannot be automatically released. To avoid unnecessary costs, perform a manual release.</li>
     * <li>VPCs, vSwitches, security groups, and RAM roles are retained by default if they are used by other resources and cannot be deleted. Perform a manual release.</li>
     * <li>Elastic Container Instance (ECI) pods created by using virtual nodes are automatically released.</li>
     * <li>Some cloud resources created by the cluster are not automatically released when the cluster is deleted. These resources continue to incur charges after the cluster is deleted. Release or retain them based on your business requirements. These resources include: Simple Log Service (SLS) projects automatically created by the cluster, and cloud disks purchased by using dynamic volumes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cluster and specifies whether to delete or retain the associated resources of the cluster. Before you delete a cluster, manually clean up workloads such as stateless, stateful, job, and cron job workloads. Otherwise, the cluster deletion may fail.</p>
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
     * <p>Deletes the cluster inspection configuration.</p>
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
     * <p>Deletes the cluster inspection configuration.</p>
     * @return DeleteClusterInspectConfigResponse
     */
    public DeleteClusterInspectConfigResponse deleteClusterInspectConfig(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterInspectConfigWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a node pool that is no longer in use. When a node pool is deleted, all pods on its nodes are deleted, which may trigger rescheduling. If rescheduling fails, your services may be affected. Ensure that the cluster has sufficient resources for rescheduling.</p>
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
     * <p>Deletes a node pool that is no longer in use. When a node pool is deleted, all pods on its nodes are deleted, which may trigger rescheduling. If rescheduling fails, your services may be affected. Ensure that the cluster has sufficient resources for rescheduling.</p>
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
     * <ul>
     * <li>When removing nodes, perform standard operations by calling this API operation or using the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by running the <code>kubectl delete node</code> command.</li>
     * <li>Do not manually release nodes or remove instances in the ECS or Auto Scaling (ESS) console or by calling related API operations, or passively release nodes when a subscription instance expires. In these cases, the nodes are directly shut down and automatically removed from the Container Service console.</li>
     * <li>If the expected number of nodes is configured for a node pool, the node pool automatically scales out other instances based on the corresponding configurations to maintain the expected number of nodes.</li>
     * <li>Removing nodes involves pod migration and may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When you remove nodes, ACK executes drain operations. Make sure that other nodes in the cluster have sufficient resources to avoid application pod scheduling failures.</li>
     * <li>Check the node affinity rules and scheduling policies of the pods on the nodes to be removed to ensure that the pods can be scheduled to other nodes after the nodes are removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a cluster. When you remove nodes, you can specify whether to release the associated ECS instances and whether to automatically drain the nodes.</p>
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
     * <ul>
     * <li>When removing nodes, perform standard operations by calling this API operation or using the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by running the <code>kubectl delete node</code> command.</li>
     * <li>Do not manually release nodes or remove instances in the ECS or Auto Scaling (ESS) console or by calling related API operations, or passively release nodes when a subscription instance expires. In these cases, the nodes are directly shut down and automatically removed from the Container Service console.</li>
     * <li>If the expected number of nodes is configured for a node pool, the node pool automatically scales out other instances based on the corresponding configurations to maintain the expected number of nodes.</li>
     * <li>Removing nodes involves pod migration and may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When you remove nodes, ACK executes drain operations. Make sure that other nodes in the cluster have sufficient resources to avoid application pod scheduling failures.</li>
     * <li>Check the node affinity rules and scheduling policies of the pods on the nodes to be removed to ensure that the pods can be scheduled to other nodes after the nodes are removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a cluster. When you remove nodes, you can specify whether to release the associated ECS instances and whether to automatically drain the nodes.</p>
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
     * <p>Deletes an application trigger based on the application trigger ID.</p>
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
     * <p>Deletes an application trigger based on the application trigger ID.</p>
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
     * <p>Uninstalls a node component.</p>
     * 
     * @param tmpReq DeleteNodePoolComponentInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodePoolComponentInstanceResponse
     */
    public DeleteNodePoolComponentInstanceResponse deleteNodePoolComponentInstanceWithOptions(String clusterId, String nodepoolId, String name, DeleteNodePoolComponentInstanceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteNodePoolComponentInstanceShrinkRequest request = new DeleteNodePoolComponentInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeNames)) {
            request.nodeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeNames, "node_names", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchInterval)) {
            query.put("batch_interval", request.batchInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFailedNodes)) {
            query.put("max_failed_nodes", request.maxFailedNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxParallelism)) {
            query.put("max_parallelism", request.maxParallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNamesShrink)) {
            query.put("node_names", request.nodeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pausePolicy)) {
            query.put("pause_policy", request.pausePolicy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNodePoolComponentInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component_instances/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodePoolComponentInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls a node component.</p>
     * 
     * @param request DeleteNodePoolComponentInstanceRequest
     * @return DeleteNodePoolComponentInstanceResponse
     */
    public DeleteNodePoolComponentInstanceResponse deleteNodePoolComponentInstance(String clusterId, String nodepoolId, String name, DeleteNodePoolComponentInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNodePoolComponentInstanceWithOptions(clusterId, nodepoolId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy rule instance in a specified cluster.</p>
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
     * <p>Deletes a policy rule instance in a specified cluster.</p>
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
     * <p>Deletes an orchestration template.</p>
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
     * <p>Deletes an orchestration template.</p>
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
     * <p>Deploys a policy rule instance in a specified namespace of an ACK cluster. You can select the security policy type, configure the governance action (alert or block) for the policy instance, and specify the namespace scope.</p>
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
     * <p>Deploys a policy rule instance in a specified namespace of an ACK cluster. You can select the security policy type, configure the governance action (alert or block) for the policy instance, and specify the namespace scope.</p>
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
     * <p>Queries the information about a target component based on parameters such as the specified region, cluster type, cluster profile, cluster version, and component name. The information includes whether the component is managed, the component category, the supported custom parameter schema, the compatible operating system architecture, and the minimum cluster version required by the component version.</p>
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
     * <p>Queries the information about a target component based on parameters such as the specified region, cluster type, cluster profile, cluster version, and component name. The information includes whether the component is managed, the component category, the supported custom parameter schema, the compatible operating system architecture, and the minimum cluster version required by the component version.</p>
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
     * <p>Queries the details of all components supported by the platform.</p>
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
     * <p>Queries the details of all components supported by the platform.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries self-healing rules.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoRepairPolicyResponse
     */
    public DescribeAutoRepairPolicyResponse describeAutoRepairPolicyWithOptions(String clusterId, String policyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoRepairPolicy"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/auto_repair_policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoRepairPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries self-healing rules.</p>
     * @return DescribeAutoRepairPolicyResponse
     */
    public DescribeAutoRepairPolicyResponse describeAutoRepairPolicy(String clusterId, String policyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAutoRepairPolicyWithOptions(clusterId, policyId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version, state, and configuration of installed cluster add-ons.</p>
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
     * <p>Queries the version, state, and configuration of installed cluster add-ons.</p>
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
     * <p>Queries the metadata of a specified component version available for a specific cluster, including the component version and configurable parameters.</p>
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
     * <p>Queries the metadata of a specified component version available for a specific cluster, including the component version and configurable parameters.</p>
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
     * <p>Queries the upgrade status of cluster add-ons.</p>
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
     * <p>Queries the upgrade status of cluster add-ons.</p>
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
     * <p>Queries the upgrade status of a component by name.</p>
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
     * <p>Queries the upgrade status of a component by name.</p>
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
     * <p>Queries the details of all installed components in a cluster by cluster ID.</p>
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
     * <p>Queries the details of all installed components in a cluster by cluster ID.</p>
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
     * <p>Retrieves the script used to add existing ECS instances to an ACK cluster as worker nodes, or to re-add removed worker nodes to a node pool. ACK supports manually adding existing nodes to a node pool. You can invoke the DescribeClusterAttachScripts operation to obtain the script for adding existing nodes.</p>
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
     * <p>Retrieves the script used to add existing ECS instances to an ACK cluster as worker nodes, or to re-add removed worker nodes to a node pool. ACK supports manually adding existing nodes to a node pool. You can invoke the DescribeClusterAttachScripts operation to obtain the script for adding existing nodes.</p>
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
     * <p>Queries the details of a specified cluster by cluster ID.</p>
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
     * <p>Queries the details of a specified cluster by cluster ID.</p>
     * @return DescribeClusterDetailResponse
     */
    public DescribeClusterDetailResponse describeClusterDetail(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterDetailWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the events of a specified cluster. Cluster operation events include cluster creation, cluster modification, node pool creation, node pool scaling, add-on installation, and cluster upgrades. You can call this operation to retrieve a list of events that occurred in the cluster and query event details, including the event level, event status, and event time.</p>
     * 
     * @param request DescribeClusterEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterEventsResponse
     */
    public DescribeClusterEventsResponse describeClusterEventsWithOptions(String ClusterId, DescribeClusterEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

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
     * <p>Queries the events of a specified cluster. Cluster operation events include cluster creation, cluster modification, node pool creation, node pool scaling, add-on installation, and cluster upgrades. You can call this operation to retrieve a list of events that occurred in the cluster and query event details, including the event level, event status, and event time.</p>
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
     * <p>Retrieves the log data of a cluster for root cause analysis and tracing when cluster issues occur.</p>
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
     * <p>Retrieves the log data of a cluster for root cause analysis and tracing when cluster issues occur.</p>
     * @return DescribeClusterLogsResponse
     */
    public DescribeClusterLogsResponse describeClusterLogs(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterLogsWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of a specified node pool in a cluster.</p>
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
     * <p>Queries the configuration of a specified node pool in a cluster.</p>
     * @return DescribeClusterNodePoolDetailResponse
     */
    public DescribeClusterNodePoolDetailResponse describeClusterNodePoolDetail(String ClusterId, String NodepoolId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterNodePoolDetailWithOptions(ClusterId, NodepoolId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you remove a node, perform standard operations by using this API operation or the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by running the <code>kubectl delete node</code> command.</li>
     * <li>Do not release nodes or remove instances in the ECS or Auto Scaling console, or by calling related API operations, or passively release nodes when a subscription instance expires. In these cases, the nodes are directly shut down and automatically removed from the Container Service console.</li>
     * <li>If the expected number of nodes is configured for a node pool, the node pool automatically scales out other instances based on the corresponding configurations to maintain the expected number of nodes.</li>
     * <li>Removing a node involves pod migration, which may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When a node is removed, ACK drains the node. Make sure that other nodes in the cluster have sufficient resources to prevent application pods from failing to be scheduled.</li>
     * <li>Check the node affinity rules and scheduling policies of the pods on the node to be removed. Make sure that the pods can be scheduled to other nodes after the node is removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all node pools in a cluster.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>When you remove a node, perform standard operations by using this API operation or the <a href="https://cs.console.aliyun.com">Container Service console</a>. Do not manually remove nodes by running the <code>kubectl delete node</code> command.</li>
     * <li>Do not release nodes or remove instances in the ECS or Auto Scaling console, or by calling related API operations, or passively release nodes when a subscription instance expires. In these cases, the nodes are directly shut down and automatically removed from the Container Service console.</li>
     * <li>If the expected number of nodes is configured for a node pool, the node pool automatically scales out other instances based on the corresponding configurations to maintain the expected number of nodes.</li>
     * <li>Removing a node involves pod migration, which may affect your services. Perform this operation during off-peak hours. Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>When a node is removed, ACK drains the node. Make sure that other nodes in the cluster have sufficient resources to prevent application pods from failing to be scheduled.</li>
     * <li>Check the node affinity rules and scheduling policies of the pods on the node to be removed. Make sure that the pods can be scheduled to other nodes after the node is removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all node pools in a cluster.</p>
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
     * <p>Queries the list of nodes that meet the specified conditions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIps)) {
            query.put("nodeIps", request.nodeIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeLabels)) {
            query.put("nodeLabels", request.nodeLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("nodeNames", request.nodeNames);
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
     * <p>Queries the list of nodes that meet the specified conditions.</p>
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
     * <p>Queries the associated resources of a specified cluster. When you use Container Service for Kubernetes (ACK), you also use resources of other associated Alibaba Cloud services. You can call this operation to query these associated resources, such as VPCs and SLB instances. To query node pools or nodes, call the DescribeClusterNodePools or DescribeClusterNodes operation.</p>
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
     * <p>Queries the associated resources of a specified cluster. When you use Container Service for Kubernetes (ACK), you also use resources of other associated Alibaba Cloud services. You can call this operation to query these associated resources, such as VPCs and SLB instances. To query node pools or nodes, call the DescribeClusterNodePools or DescribeClusterNodes operation.</p>
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
     * <p>Queries a list of tasks in a cluster.</p>
     * 
     * @param request DescribeClusterTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterTasksResponse
     */
    public DescribeClusterTasksResponse describeClusterTasksWithOptions(String clusterId, DescribeClusterTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
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
     * <p>Queries a list of tasks in a cluster.</p>
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
     * <ul>
     * <li>The default validity period of the certificate issued for a kubeconfig file is three years. Within 180 days before expiration, you can obtain a refreshed kubeconfig file with rotated credentials through the Container Service for Kubernetes console or by calling the API operation to retrieve the cluster kubeconfig. The new kubeconfig certificate remains valid for three years. The old kubeconfig credentials remain valid until the certificate expires. Obtain the rotated credentials promptly based on the kubeconfig expiration time displayed in the console or returned by the API operation.</li>
     * <li>Properly manage the kubeconfig credentials used for cluster management, and revoke them promptly when they are no longer needed. This prevents security risks such as data leaks caused by kubeconfig exposure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the kubeconfig file of a cluster.</p>
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
     * <ul>
     * <li>The default validity period of the certificate issued for a kubeconfig file is three years. Within 180 days before expiration, you can obtain a refreshed kubeconfig file with rotated credentials through the Container Service for Kubernetes console or by calling the API operation to retrieve the cluster kubeconfig. The new kubeconfig certificate remains valid for three years. The old kubeconfig credentials remain valid until the certificate expires. Obtain the rotated credentials promptly based on the kubeconfig expiration time displayed in the console or returned by the API operation.</li>
     * <li>Properly manage the kubeconfig credentials used for cluster management, and revoke them promptly when they are no longer needed. This prevents security risks such as data leaks caused by kubeconfig exposure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the kubeconfig file of a cluster.</p>
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
     * <p>Retrieves the kubeconfig for a cluster.</p>
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
     * <p>Retrieves the kubeconfig for a cluster.</p>
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
     * <p>Invokes the DescribeClusterVuls operation to query the security vulnerability details of a cluster by cluster ID, including the vulnerability name, type, and severity level. Regularly scan clusters for security vulnerabilities to improve cluster security.</p>
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
     * <p>Invokes the DescribeClusterVuls operation to query the security vulnerability details of a cluster by cluster ID, including the vulnerability name, type, and severity level. Regularly scan clusters for security vulnerabilities to improve cluster security.</p>
     * @return DescribeClusterVulsResponse
     */
    public DescribeClusterVulsResponse describeClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters created in Container Service, including Swarm and Kubernetes clusters.</p>
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
     * <p>Queries all clusters created in Container Service, including Swarm and Kubernetes clusters.</p>
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
     * <p>Queries the list of all clusters in a specified region.</p>
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
     * <p>Queries the list of all clusters in a specified region.</p>
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
     * <p>Queries a list of ACK clusters that match specified conditions, such as cluster type and cluster specifications, under the current account.</p>
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
     * <p>Queries a list of ACK clusters that match specified conditions, such as cluster type and cluster specifications, under the current account.</p>
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
     * <p>Queries the details of cluster operation events, such as cluster creation, cluster modification, node pool creation, node pool scale-out, add-on installation, and cluster upgrade. This operation allows you to query the details of specific events, including the event level, status, and occurrence time.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
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
     * <p>Queries the details of cluster operation events, such as cluster creation, cluster modification, node pool creation, node pool scale-out, add-on installation, and cluster upgrade. This operation allows you to query the details of specific events, including the event level, status, and occurrence time.</p>
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
     * <p>Queries the list of all events in a specified region.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
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
     * <p>Queries the list of all events in a specified region.</p>
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
     * <p>For more information about cluster registration, see <a href="https://help.aliyun.com/document_detail/121053.html">Register an external Kubernetes cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the agent configuration deployed in a registered cluster based on the cluster ID.</p>
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
     * <p>For more information about cluster registration, see <a href="https://help.aliyun.com/document_detail/121053.html">Register an external Kubernetes cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the agent configuration deployed in a registered cluster based on the cluster ID.</p>
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
     * <p>Queries the details of Kubernetes versions, including version information, release dates, expiration dates, compatible operating systems, and supported runtimes.</p>
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
     * <p>Queries the details of Kubernetes versions, including version information, release dates, expiration dates, compatible operating systems, and supported runtimes.</p>
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
     * <p>Invokes the DescribeNodePoolVuls API operation to query the security vulnerability details of a node pool by node pool ID, including the vulnerability name and level. Regularly scan node pools for security vulnerabilities to improve cluster security.</p>
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
     * <p>Invokes the DescribeNodePoolVuls API operation to query the security vulnerability details of a node pool by node pool ID, including the vulnerability name and level. Regularly scan node pools for security vulnerabilities to improve cluster security.</p>
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
     * <p>Provides a comprehensive set of built-in rule libraries for container security policies in ACK clusters, including Compliance, Infra, K8s-general, and PSP, to ensure secure container operations in production environments. You can call the DescribePolicies operation to query the list of policy governance rule libraries.</p>
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
     * <p>Provides a comprehensive set of built-in rule libraries for container security policies in ACK clusters, including Compliance, Infra, K8s-general, and PSP, to ensure secure container operations in production environments. You can call the DescribePolicies operation to query the list of policy governance rule libraries.</p>
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePolicies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePoliciesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Provides a comprehensive built-in rule library for container security policies in ACK clusters, including Compliance, Infra, K8s-general, and PSP, to ensure the secure operation of containers in production environments. You can call the DescribePolicyDetails operation to query the details of specific policy governance rules, such as the rule template description, rule governance action, and rule governance level.</p>
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
     * <p>Provides a comprehensive built-in rule library for container security policies in ACK clusters, including Compliance, Infra, K8s-general, and PSP, to ensure the secure operation of containers in production environments. You can call the DescribePolicyDetails operation to query the details of specific policy governance rules, such as the rule template description, rule governance action, and rule governance level.</p>
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetails(String policyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyDetailsWithOptions(policyName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of policy governance in a specified ACK cluster. Container security policies for ACK clusters provide a comprehensive built-in rule library that includes Compliance, Infra, K8s-general, and PSP to ensure the secure operation of containers in production environments. This operation retrieves details such as the counts of enabled policies at different severity levels, policy governance audit logs, and interception and alerting statistics.</p>
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
     * <p>Queries the details of policy governance in a specified ACK cluster. Container security policies for ACK clusters provide a comprehensive built-in rule library that includes Compliance, Infra, K8s-general, and PSP to ensure the secure operation of containers in production environments. This operation retrieves details such as the counts of enabled policies at different severity levels, policy governance audit logs, and interception and alerting statistics.</p>
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInCluster(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyGovernanceInClusterWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of specified policy rule instances in an ACK cluster, such as policy descriptions and governance levels. You can select a security policy type, configure related enforcement actions and scopes, and create and deploy a policy instance in the ACK cluster.</p>
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
     * <p>Queries the details of specified policy rule instances in an ACK cluster, such as policy descriptions and governance levels. You can select a security policy type, configure related enforcement actions and scopes, and create and deploy a policy instance in the ACK cluster.</p>
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
     * <p>Queries the instance deployment status for different policy types in a cluster, including the number of enabled instances for each policy rule and the number of enabled policy types at different governance levels.</p>
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
     * <p>Queries the instance deployment status for different policy types in a cluster, including the number of enabled instances for each policy rule and the number of enabled policy types at different governance levels.</p>
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatus(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePolicyInstancesStatusWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("clusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("profile", request.profile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether deletion protection is enabled for specified resources in a cluster. Supported resources include namespaces and services.</p>
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
     * <p>Queries whether deletion protection is enabled for specified resources in a cluster. Supported resources include namespaces and services.</p>
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
     * <p>This API operation can be called only by an Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>As an administrator responsible for cluster permission management, you can use an Alibaba Cloud account to issue KubeConfig credentials that contain identity information for a specified Resource Access Management (RAM) user or RAM role within the account to connect to an ACK cluster. You can invoke the DescribeSubaccountK8sClusterUserConfig operation to issue or obtain the KubeConfig for any RAM user or role within the account.</p>
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
     * <p>This API operation can be called only by an Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>As an administrator responsible for cluster permission management, you can use an Alibaba Cloud account to issue KubeConfig credentials that contain identity information for a specified Resource Access Management (RAM) user or RAM role within the account to connect to an ACK cluster. You can invoke the DescribeSubaccountK8sClusterUserConfig operation to issue or obtain the KubeConfig for any RAM user or role within the account.</p>
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
     * <p>Queries the details of a cluster task, such as the task type, running status, and running stage.</p>
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
     * <p>Queries the details of a cluster task, such as the task type, running status, and running stage.</p>
     * @return DescribeTaskInfoResponse
     */
    public DescribeTaskInfoResponse describeTaskInfo(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTaskInfoWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified orchestration template, including access permissions, YAML content, and tags. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how applications should run or be configured.</p>
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
     * <p>Queries the details of a specified orchestration template, including access permissions, YAML content, and tags. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how applications should run or be configured.</p>
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
     * <p>Queries a list of orchestration templates and retrieves their details, including access permissions, YAML content, and tags. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how an application should run or be configured.</p>
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
     * <p>Queries a list of orchestration templates and retrieves their details, including access permissions, YAML content, and tags. An orchestration template defines and describes a set of Kubernetes cluster resources in a declarative manner to specify how an application should run or be configured.</p>
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
     * <p>Queries triggers that meet the specified conditions.</p>
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
     * <p>Queries triggers that meet the specified conditions.</p>
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
     * <p>Queries the RBAC access permissions to resources in namespaces granted to the current Resource Access Management (RAM) user or role in a specified ACK cluster. In ACK clusters, Kubernetes namespaces ensure that permissions and resources for cluster users are logically isolated. Users granted RBAC permissions only for a specific namespace cannot access resources in other namespaces of the cluster. You can invoke the DescribeUserClusterNamespaces operation to view the namespaces for which the current RAM user or role has been granted access permissions.</p>
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
     * <p>Queries the RBAC access permissions to resources in namespaces granted to the current Resource Access Management (RAM) user or role in a specified ACK cluster. In ACK clusters, Kubernetes namespaces ensure that permissions and resources for cluster users are logically isolated. Users granted RBAC permissions only for a specific namespace cannot access resources in other namespaces of the cluster. You can invoke the DescribeUserClusterNamespaces operation to view the namespaces for which the current RAM user or role has been granted access permissions.</p>
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
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user or RAM role, the API operation returns only the permissions for clusters on which the calling account has RBAC administrator permissions. To list permissions for all clusters, the calling account must have RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>In ACK clusters, you can create and assign different access permissions to different Resource Access Management (RAM) users or roles to ensure secure access control and resource isolation. You can invoke the DescribeUserPermission operation to query the details of cluster permissions granted to a Resource Access Management (RAM) user or role, including accessible resources, permission scope, preset role types, and permission sources.</p>
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
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user or RAM role, the API operation returns only the permissions for clusters on which the calling account has RBAC administrator permissions. To list permissions for all clusters, the calling account must have RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>In ACK clusters, you can create and assign different access permissions to different Resource Access Management (RAM) users or roles to ensure secure access control and resource isolation. You can invoke the DescribeUserPermission operation to query the details of cluster permissions granted to a Resource Access Management (RAM) user or role, including accessible resources, permission scope, preset role types, and permission sources.</p>
     * @return DescribeUserPermissionResponse
     */
    public DescribeUserPermissionResponse describeUserPermission(String uid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserPermissionWithOptions(uid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas for ACK clusters, node pools, and nodes. To increase a quota, apply in Quota Center.</p>
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
     * <p>Queries the quotas for ACK clusters, node pools, and nodes. To increase a quota, apply in Quota Center.</p>
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserQuotaWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>CVE compatibility is guaranteed by Security Center. Ensure that you have activated the Ultimate edition of Security Center or <a href="https://help.aliyun.com/document_detail/42308.html">purchased vulnerability fixes (pay-as-you-go)</a>.</li>
     * <li>Fixing certain CVEs requires node restarts. Container Service performs drain operations on a node before it restarts. Ensure that the cluster has sufficient idle resources for drain operations, such as scaling out the node pool in advance.</li>
     * <li>Pay attention to the compatibility between your applications and CVEs. CVE fixes are performed in batches. During the fix process, you can pause or cancel the task. After you pause or cancel the task, the batches to which fix tasks have been delivered continue to run until completion. The delivery of fix tasks to undelivered batches is paused or canceled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Fixes security vulnerability on nodes in a specified node pool of a cluster to improve cluster security. Alibaba Cloud security products regularly scan Elastic Compute Service (ECS) nodes for security vulnerability and provide corresponding fix suggestions and methods. Fixing certain Common Vulnerabilities and Exposures (CVEs) may require node restarts. Ensure that the cluster has sufficient nodes for drain operations. You can invoke the FixNodePoolVuls operation to fix security vulnerability on nodes in a specified node pool and improve the security of cluster nodes.</p>
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
     * <ul>
     * <li>CVE compatibility is guaranteed by Security Center. Ensure that you have activated the Ultimate edition of Security Center or <a href="https://help.aliyun.com/document_detail/42308.html">purchased vulnerability fixes (pay-as-you-go)</a>.</li>
     * <li>Fixing certain CVEs requires node restarts. Container Service performs drain operations on a node before it restarts. Ensure that the cluster has sufficient idle resources for drain operations, such as scaling out the node pool in advance.</li>
     * <li>Pay attention to the compatibility between your applications and CVEs. CVE fixes are performed in batches. During the fix process, you can pause or cancel the task. After you pause or cancel the task, the batches to which fix tasks have been delivered continue to run until completion. The delivery of fix tasks to undelivered batches is paused or canceled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Fixes security vulnerability on nodes in a specified node pool of a cluster to improve cluster security. Alibaba Cloud security products regularly scan Elastic Compute Service (ECS) nodes for security vulnerability and provide corresponding fix suggestions and methods. Fixing certain Common Vulnerabilities and Exposures (CVEs) may require node restarts. Ensure that the cluster has sufficient nodes for drain operations. You can invoke the FixNodePoolVuls operation to fix security vulnerability on nodes in a specified node pool and improve the security of cluster nodes.</p>
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
     * <p>Invokes the GetClusterAddonInstance operation to query the details of a specified add-on in a cluster, including the version, parameter settings, and log feature enabling status of the add-on instance.</p>
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
     * <p>Invokes the GetClusterAddonInstance operation to query the details of a specified add-on in a cluster, including the version, parameter settings, and log feature enabling status of the add-on instance.</p>
     * @return GetClusterAddonInstanceResponse
     */
    public GetClusterAddonInstanceResponse getClusterAddonInstance(String clusterId, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterAddonInstanceWithOptions(clusterId, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the API server audit feature is enabled for a cluster and the Simple Log Service (SLS) project associated with the API server audit logs.</p>
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
     * <p>Queries whether the API server audit feature is enabled for a cluster and the Simple Log Service (SLS) project associated with the API server audit logs.</p>
     * @return GetClusterAuditProjectResponse
     */
    public GetClusterAuditProjectResponse getClusterAuditProject(String clusterid) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterAuditProjectWithOptions(clusterid, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific check task for a Kubernetes cluster. The intelligent O&amp;M platform for containers provides comprehensive cluster check capabilities, including cluster upgrade, cluster migration, component installation, component upgrade, and node pool checks. You can retrieve information such as the check status, specific check items, and the creation and completion time of the check task.</p>
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
     * <p>Queries the details of a specific check task for a Kubernetes cluster. The intelligent O&amp;M platform for containers provides comprehensive cluster check capabilities, including cluster upgrade, cluster migration, component installation, component upgrade, and node pool checks. You can retrieve information such as the check status, specific check items, and the creation and completion time of the check task.</p>
     * @return GetClusterCheckResponse
     */
    public GetClusterCheckResponse getClusterCheck(String clusterId, String checkId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterCheckWithOptions(clusterId, checkId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the check items for cluster diagnostics.</p>
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
     * <p>Retrieves the check items for cluster diagnostics.</p>
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
     * <p>Retrieves the cluster diagnosis results.</p>
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
     * <p>Retrieves the cluster diagnosis results.</p>
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
     * <p>Retrieves the cluster inspection configuration.</p>
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
     * <p>Retrieves the cluster inspection configuration.</p>
     * @return GetClusterInspectConfigResponse
     */
    public GetClusterInspectConfigResponse getClusterInspectConfig(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterInspectConfigWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a cluster inspection report.</p>
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
     * <p>Retrieves the details of a cluster inspection report.</p>
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
     * <p>Queries the triggers of an application by name.</p>
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
     * <p>Queries the triggers of an application by name.</p>
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
     * <p>Queries the upgrade status of a cluster based on the cluster ID.</p>
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
     * <p>Queries the upgrade status of a cluster based on the cluster ID.</p>
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
     * <ul>
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user, make sure that the account has been granted permissions to modify the cluster authorization information of other RAM users or RAM roles. Otherwise, the API returns the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> fault code. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Grant RBAC authorization to other RAM users</a>.</li>
     * <li>The operation of updating all RBAC permissions of a RAM user or RAM role overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>By default, Resource Access Management (RAM) users or roles that are not cluster creators and have not been granted access permissions on all cluster dimensions do not have any RBAC permissions in a cluster. You can invoke the GrantPermissions operation to update the RBAC access permissions of a RAM user or role, including accessible resources, permission scope, and preset role types, to better manage cluster management security access control.</p>
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
     * <ul>
     * <li>If the account that invokes this API operation is a Resource Access Management (RAM) user, make sure that the account has been granted permissions to modify the cluster authorization information of other RAM users or RAM roles. Otherwise, the API returns the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> fault code. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Grant RBAC authorization to other RAM users</a>.</li>
     * <li>The operation of updating all RBAC permissions of a RAM user or RAM role overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>By default, Resource Access Management (RAM) users or roles that are not cluster creators and have not been granted access permissions on all cluster dimensions do not have any RBAC permissions in a cluster. You can invoke the GrantPermissions operation to update the RBAC access permissions of a RAM user or role, including accessible resources, permission scope, and preset role types, to better manage cluster management security access control.</p>
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
     * <p>To enhance Kubernetes capabilities, ACK clusters support various components, such as managed core components, and application, logging and monitoring, networking, storage, and security components. You can call the InstallClusterAddons operation to install components by specifying the component name and version.</p>
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
     * <p>To enhance Kubernetes capabilities, ACK clusters support various components, such as managed core components, and application, logging and monitoring, networking, storage, and security components. You can call the InstallClusterAddons operation to install components by specifying the component name and version.</p>
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
     * <p>Installs node components on specified nodes with custom configurations.</p>
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
     * <p>Installs node components on specified nodes with custom configurations.</p>
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
     * <p>Queries a list of available components and retrieves detailed component information based on parameters such as the region, cluster type, cluster profile, and cluster version. The detailed information includes whether the component is managed, the schema of supported custom parameters, and compatible operating system architectures.</p>
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
     * <p>Queries a list of available components and retrieves detailed component information based on parameters such as the region, cluster type, cluster profile, and cluster version. The detailed information includes whether the component is managed, the schema of supported custom parameters, and compatible operating system architectures.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</notice></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of self-healing rules.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoRepairPoliciesResponse
     */
    public ListAutoRepairPoliciesResponse listAutoRepairPoliciesWithOptions(String clusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoRepairPolicies"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/auto_repair_policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoRepairPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</notice></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of self-healing rules.</p>
     * @return ListAutoRepairPoliciesResponse
     */
    public ListAutoRepairPoliciesResponse listAutoRepairPolicies(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAutoRepairPoliciesWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resources contained in an installed cluster component instance, including Kubernetes cluster resources and Helm release instances.</p>
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
     * <p>Queries the list of resources contained in an installed cluster component instance, including Kubernetes cluster resources and Helm release instances.</p>
     * @return ListClusterAddonInstanceResourcesResponse
     */
    public ListClusterAddonInstanceResourcesResponse listClusterAddonInstanceResources(String clusterId, String instanceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAddonInstanceResourcesWithOptions(clusterId, instanceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of installed add-on instances in a specified cluster and retrieves related information about the add-on instances, such as the add-on version and status.</p>
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
     * <p>Queries a list of installed add-on instances in a specified cluster and retrieves related information about the add-on instances, such as the add-on version and status.</p>
     * @return ListClusterAddonInstancesResponse
     */
    public ListClusterAddonInstancesResponse listClusterAddonInstances(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAddonInstancesWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cluster checks and related information, such as the check type, status, creation time, and completion time, based on the cluster ID. The container intelligent O&amp;M platform provides comprehensive Kubernetes cluster check capabilities, including cluster upgrade checks, cluster migration checks, component installation checks, component upgrade checks, and node pool checks.</p>
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
     * <p>Queries the list of cluster checks and related information, such as the check type, status, creation time, and completion time, based on the cluster ID. The container intelligent O&amp;M platform provides comprehensive Kubernetes cluster check capabilities, including cluster upgrade checks, cluster migration checks, component installation checks, component upgrade checks, and node pool checks.</p>
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
     * <p>Retrieves the list of cluster inspection reports.</p>
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
     * <p>Retrieves the list of cluster inspection reports.</p>
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
     * <li>You must have the ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>You must have the permissions to manage Container Service for Kubernetes (CS) (AliyunCSFullAccess).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and status of user KubeConfigs issued for the current cluster.</p>
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
     * <li>You must have the ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>You must have the permissions to manage Container Service for Kubernetes (CS) (AliyunCSFullAccess).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list and status of user KubeConfigs issued for the current cluster.</p>
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
     * <p>Queries the status of node components on nodes.</p>
     * 
     * @param tmpReq ListNodePoolComponentInstanceNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodePoolComponentInstanceNodesResponse
     */
    public ListNodePoolComponentInstanceNodesResponse listNodePoolComponentInstanceNodesWithOptions(String clusterId, String nodepoolId, String name, ListNodePoolComponentInstanceNodesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodePoolComponentInstanceNodesShrinkRequest request = new ListNodePoolComponentInstanceNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeNames)) {
            request.nodeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeNames, "node_names", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRevision)) {
            query.put("config_revision", request.configRevision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNamesShrink)) {
            query.put("node_names", request.nodeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodePoolComponentInstanceNodes"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component_instances/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodePoolComponentInstanceNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of node components on nodes.</p>
     * 
     * @param request ListNodePoolComponentInstanceNodesRequest
     * @return ListNodePoolComponentInstanceNodesResponse
     */
    public ListNodePoolComponentInstanceNodesResponse listNodePoolComponentInstanceNodes(String clusterId, String nodepoolId, String name, ListNodePoolComponentInstanceNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodePoolComponentInstanceNodesWithOptions(clusterId, nodepoolId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of node component instances.</p>
     * 
     * @param request ListNodePoolComponentInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodePoolComponentInstancesResponse
     */
    public ListNodePoolComponentInstancesResponse listNodePoolComponentInstancesWithOptions(String clusterId, String nodepoolId, ListNodePoolComponentInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodePoolComponentInstances"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component_instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodePoolComponentInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of node component instances.</p>
     * 
     * @param request ListNodePoolComponentInstancesRequest
     * @return ListNodePoolComponentInstancesResponse
     */
    public ListNodePoolComponentInstancesResponse listNodePoolComponentInstances(String clusterId, String nodepoolId, ListNodePoolComponentInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodePoolComponentInstancesWithOptions(clusterId, nodepoolId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the node components that can be installed in a node pool.</p>
     * 
     * @param tmpReq ListNodePoolComponentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodePoolComponentsResponse
     */
    public ListNodePoolComponentsResponse listNodePoolComponentsWithOptions(String clusterId, ListNodePoolComponentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodePoolComponentsShrinkRequest request = new ListNodePoolComponentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceTypes)) {
            request.instanceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceTypes, "instance_types", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("image_id", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("image_type", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypesShrink)) {
            query.put("instance_types", request.instanceTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("max_results", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("next_token", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolId)) {
            query.put("nodepool_id", request.nodepoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodepoolType)) {
            query.put("nodepool_type", request.nodepoolType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodePoolComponents"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepool_components"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodePoolComponentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the node components that can be installed in a node pool.</p>
     * 
     * @param request ListNodePoolComponentsRequest
     * @return ListNodePoolComponentsResponse
     */
    public ListNodePoolComponentsResponse listNodePoolComponents(String clusterId, ListNodePoolComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodePoolComponentsWithOptions(clusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of automated O&amp;M execution plans.</p>
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
     * <p>Retrieves a list of automated O&amp;M execution plans.</p>
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
     * <p>Queries the latest 100 automated O&amp;M execution plans in a specified region. When features such as Auto Mode for intelligent cluster management, automatic cluster upgrades, and automated O&amp;M for node pools are enabled, you can use this operation to query system-generated O&amp;M plans and their execution status, such as cluster upgrades and node pool CVE fixes.</p>
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
     * <p>Queries the latest 100 automated O&amp;M execution plans in a specified region. When features such as Auto Mode for intelligent cluster management, automatic cluster upgrades, and automated O&amp;M for node pools are enabled, you can use this operation to query system-generated O&amp;M plans and their execution status, such as cluster upgrades and node pool CVE fixes.</p>
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
     * <p>Queries the tag list of clusters. You can add tag key-value pairs to clusters so that developers and O&amp;M engineers can classify and manage clusters more flexibly. This better supports requirements such as monitoring, cost analysis, and tenant isolation. You can call the ListTagResources operation to obtain the list of resource tags and query tag details, such as key-value pairs and associated clusters.</p>
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
     * <p>Queries the tag list of clusters. You can add tag key-value pairs to clusters so that developers and O&amp;M engineers can classify and manage clusters more flexibly. This better supports requirements such as monitoring, cost analysis, and tenant isolation. You can call the ListTagResources operation to obtain the list of resource tags and query tag details, such as key-value pairs and associated clusters.</p>
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
     * <p>To call this operation, you must have the permissions to manage Container Service (CS) (AliyunCSFullAccess).</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the KubeConfig status list of all clusters for the current user.</p>
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
     * <p>To call this operation, you must have the permissions to manage Container Service (CS) (AliyunCSFullAccess).</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the KubeConfig status list of all clusters for the current user.</p>
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
     * <b>description</b> :
     * <p>After you migrate an ACK basic managed cluster to an ACK Pro managed cluster, a <a href="https://help.aliyun.com/document_detail/462278.html">cluster management fee</a> charged by ACK is added. The billing of other cloud resources remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Migrates a cluster.</p>
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
     * <b>description</b> :
     * <p>After you migrate an ACK basic managed cluster to an ACK Pro managed cluster, a <a href="https://help.aliyun.com/document_detail/462278.html">cluster management fee</a> charged by ACK is added. The billing of other cloud resources remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Migrates a cluster.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a self-healing rule.</p>
     * 
     * @param request ModifyAutoRepairPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoRepairPolicyResponse
     */
    public ModifyAutoRepairPolicyResponse modifyAutoRepairPolicyWithOptions(String clusterId, String policyId, ModifyAutoRepairPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoRepairPolicy"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/auto_repair_policies/" + com.aliyun.openapiutil.Client.getEncodeParam(policyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoRepairPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API is not yet available. Stay tuned.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a self-healing rule.</p>
     * 
     * @param request ModifyAutoRepairPolicyRequest
     * @return ModifyAutoRepairPolicyResponse
     */
    public ModifyAutoRepairPolicyResponse modifyAutoRepairPolicy(String clusterId, String policyId, ModifyAutoRepairPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAutoRepairPolicyWithOptions(clusterId, policyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><notice>Starting from July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to OpenAPI request and response parameters and OpenAPI deprecation for ACK cluster management</a>.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an ACK cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("client_token", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("cluster_name", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("cluster_spec", request.clusterSpec);
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
     * <b>description</b> :
     * <p><notice>Starting from July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to OpenAPI request and response parameters and OpenAPI deprecation for ACK cluster management</a>.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an ACK cluster.</p>
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
     * <p>You can call this operation to modify the configuration of add-ons in common clusters and the control plane parameter settings of ACK Pro clusters:</p>
     * <ul>
     * <li>You can call the DescribeClusterAddonMetadata API operation to query the list of configurable parameters for common add-ons. For details, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query cluster add-on version metadata</a>.</li>
     * <li>For the list of configurable parameters for the control plane components of ACK Pro clusters, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameter settings of an ACK Pro cluster</a>.
     * Modifying the configuration may cause add-on redeployment and restart. Evaluate the impact before you proceed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an installed cluster add-on instance. Modifying the configuration may affect your services. Evaluate the impact, perform the operation during off-peak hours, and back up your data in advance.</p>
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
     * <p>You can call this operation to modify the configuration of add-ons in common clusters and the control plane parameter settings of ACK Pro clusters:</p>
     * <ul>
     * <li>You can call the DescribeClusterAddonMetadata API operation to query the list of configurable parameters for common add-ons. For details, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query cluster add-on version metadata</a>.</li>
     * <li>For the list of configurable parameters for the control plane components of ACK Pro clusters, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameter settings of an ACK Pro cluster</a>.
     * Modifying the configuration may cause add-on redeployment and restart. Evaluate the impact before you proceed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an installed cluster add-on instance. Modifying the configuration may affect your services. Evaluate the impact, perform the operation during off-peak hours, and back up your data in advance.</p>
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
     * <b>description</b> :
     * <p><notice>Starting July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to input and output parameters of ACK cluster management OpenAPI operations and deprecation of OpenAPI operations</a>.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a node pool based on the node pool ID by calling the ModifyClusterNodePool operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.efloNodeGroup)) {
            body.put("eflo_node_group", request.efloNodeGroup);
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
     * <b>description</b> :
     * <p><notice>Starting July 4, 2026, the request parameters instance_deletion_protection, ingress_loadbalancer_id, and access_control_list will no longer take effect. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to input and output parameters of ACK cluster management OpenAPI operations and deprecation of OpenAPI operations</a>.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a node pool based on the node pool ID by calling the ModifyClusterNodePool operation.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This operation performs a full update. When you call this operation, specify all target tags in the request parameters to avoid losing existing tags. To perform an incremental update, use the <a href="https://help.aliyun.com/document_detail/2667969.html">TagResources</a> operation to add tags to the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the tags of a cluster. You can add tag key-value pairs to a cluster to help developers and O&amp;M engineers classify and manage clusters more flexibly, and better support requirements such as monitoring, cost analysis, and tenant isolation. You can call the ModifyClusterTags operation to modify cluster tags.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This operation performs a full update. When you call this operation, specify all target tags in the request parameters to avoid losing existing tags. To perform an incremental update, use the <a href="https://help.aliyun.com/document_detail/2667969.html">TagResources</a> operation to add tags to the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the tags of a cluster. You can add tag key-value pairs to a cluster to help developers and O&amp;M engineers classify and manage clusters more flexibly, and better support requirements such as monitoring, cost analysis, and tenant isolation. You can call the ModifyClusterTags operation to modify cluster tags.</p>
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
     * <p>ACK supports modifying the kubelet configurations of nodes in a node pool. After the modification is complete, the configurations automatically take effect on existing nodes in the node pool, and new nodes added to the node pool also use the new configurations.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the node configurations in a cluster node pool, such as kubelet configurations and rolling update configurations. Modifying node configurations applies changes in batches and restarts kubelet, which may affect node operations and workload execution. Perform this operation during off-peak hours.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("node_names", request.nodeNames);
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
     * <p>ACK supports modifying the kubelet configurations of nodes in a node pool. After the modification is complete, the configurations automatically take effect on existing nodes in the node pool, and new nodes added to the node pool also use the new configurations.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the node configurations in a cluster node pool, such as kubelet configurations and rolling update configurations. Modifying node configurations applies changes in batches and restarts kubelet, which may affect node operations and workload execution. Perform this operation during off-peak hours.</p>
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
     * <p>Updates a policy rule instance in a specified cluster. You can modify the governance action, such as alert or block, and the namespace scope of the policy instance.</p>
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
     * <p>Updates a policy rule instance in a specified cluster. You can modify the governance action, such as alert or block, and the namespace scope of the policy instance.</p>
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
     * <ul>
     * <li>An Alibaba Cloud account can activate Container Service for Kubernetes (ACK).</li>
     * <li>A Resource Access Management (RAM) user to which the AdministratorAccess policy is attached can activate the service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Container Service for Kubernetes (ACK) for first-time users.</p>
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
     * <ul>
     * <li>An Alibaba Cloud account can activate Container Service for Kubernetes (ACK).</li>
     * <li>A Resource Access Management (RAM) user to which the AdministratorAccess policy is attached can activate the service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Container Service for Kubernetes (ACK) for first-time users.</p>
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
     * <p>Pauses a cluster upgrade.</p>
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
     * <p>Pauses a cluster upgrade.</p>
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
     * <p>Pauses a component upgrade.</p>
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
     * <p>Pauses a component upgrade.</p>
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
     * <p>Pauses a running cluster task.</p>
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
     * <p>Pauses a running cluster task.</p>
     * @return PauseTaskResponse
     */
    public PauseTaskResponse pauseTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除集群节点</p>
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
     * <b>summary</b> : 
     * <p>移除集群节点</p>
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
     * <ul>
     * <li>Node removal involves pod migration, which may affect your workloads. Perform this operation during off-peak hours.</li>
     * <li>Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>During the operation, the system sets the nodes to the unschedulable state.</li>
     * <li>Only worker nodes are removed. Master nodes are not removed.</li>
     * <li>Even if you choose to release nodes (by setting release_node to true), subscription nodes are not released. You must release them manually in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after removing them from the node pool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a node pool in a cluster and adjusts the expected number of nodes when the nodes are no longer needed. When removing nodes, you can specify whether to release the associated ECS instances and whether to automatically drain the nodes. Node removal involves pod migration, which may affect your workloads. Perform this operation during off-peak hours and back up your data in advance.</p>
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
     * <ul>
     * <li>Node removal involves pod migration, which may affect your workloads. Perform this operation during off-peak hours.</li>
     * <li>Unexpected risks may occur during the operation. Back up your data in advance.</li>
     * <li>During the operation, the system sets the nodes to the unschedulable state.</li>
     * <li>Only worker nodes are removed. Master nodes are not removed.</li>
     * <li>Even if you choose to release nodes (by setting release_node to true), subscription nodes are not released. You must release them manually in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after removing them from the node pool.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes nodes from a node pool in a cluster and adjusts the expected number of nodes when the nodes are no longer needed. When removing nodes, you can specify whether to release the associated ECS instances and whether to automatically drain the nodes. Node removal involves pod migration, which may affect your workloads. Perform this operation during off-peak hours and back up your data in advance.</p>
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
     * <p>Repairs a node pool in a cluster.</p>
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
     * <p>Repairs a node pool in a cluster.</p>
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
     * <p>Resumes a paused component upgrade task.</p>
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
     * <p>Resumes a paused component upgrade task.</p>
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
     * <p>Resumes a paused cluster task.</p>
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
     * <p>Resumes a paused cluster task.</p>
     * @return ResumeTaskResponse
     */
    public ResumeTaskResponse resumeTask(String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTaskWithOptions(taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes the upgrade of a cluster that is in the upgrade-paused state based on the cluster ID.</p>
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
     * <p>Resumes the upgrade of a cluster that is in the upgrade-paused state based on the cluster ID.</p>
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
     * <p>If you want to revoke the cluster KubeConfig credential owned by the currently logged-on Alibaba Cloud account or Resource Access Management (RAM) user, you can call the RevokeK8sClusterKubeConfig operation to revoke it. After the revocation succeeds, the cluster generates a new KubeConfig, and the original KubeConfig becomes invalid.</p>
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
     * <p>If you want to revoke the cluster KubeConfig credential owned by the currently logged-on Alibaba Cloud account or Resource Access Management (RAM) user, you can call the RevokeK8sClusterKubeConfig operation to revoke it. After the revocation succeeds, the cluster generates a new KubeConfig, and the original KubeConfig becomes invalid.</p>
     * @return RevokeK8sClusterKubeConfigResponse
     */
    public RevokeK8sClusterKubeConfigResponse revokeK8sClusterKubeConfig(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeK8sClusterKubeConfigWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a check for a Kubernetes cluster. The Container Intelligent O&amp;M Platform provides comprehensive check capabilities for Kubernetes clusters, including cluster upgrade, cluster migration, component installation, component upgrade, and node pool checks. The platform automatically triggers a check before an upgrade, migration, or installation. You can perform the change operation only after the check passes. You can also manually call the RunClusterCheck operation to perform a cluster check. Regularly check and maintain your clusters to prevent security risks.</p>
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
     * <p>Initiates a check for a Kubernetes cluster. The Container Intelligent O&amp;M Platform provides comprehensive check capabilities for Kubernetes clusters, including cluster upgrade, cluster migration, component installation, component upgrade, and node pool checks. The platform automatically triggers a check before an upgrade, migration, or installation. You can perform the change operation only after the check passes. You can also manually call the RunClusterCheck operation to perform a cluster check. Regularly check and maintain your clusters to prevent security risks.</p>
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
     * <p>Initiates a cluster inspection and creates an inspection report.</p>
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
     * <p>Initiates a cluster inspection and creates an inspection report.</p>
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
     * <p>Executes O&amp;M operations on a node.</p>
     * 
     * @param request RunNodeOperationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunNodeOperationResponse
     */
    public RunNodeOperationResponse runNodeOperationWithOptions(String clusterId, String nodepoolId, String nodeName, RunNodeOperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationAction)) {
            body.put("operationAction", request.operationAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationArgs)) {
            body.put("operationArgs", request.operationArgs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunNodeOperation"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/nodes/" + com.aliyun.openapiutil.Client.getEncodeParam(nodeName) + "/operation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunNodeOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes O&amp;M operations on a node.</p>
     * 
     * @param request RunNodeOperationRequest
     * @return RunNodeOperationResponse
     */
    public RunNodeOperationResponse runNodeOperation(String clusterId, String nodepoolId, String nodeName, RunNodeOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runNodeOperationWithOptions(clusterId, nodepoolId, nodeName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales out the nodes in a node pool to ensure sufficient node capacity for workloads.</p>
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
     * <p>Scales out the nodes in a node pool to ensure sufficient node capacity for workloads.</p>
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
     * <b>summary</b> : 
     * <p>扩容Kubernetes集群</p>
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
     * <b>summary</b> : 
     * <p>扩容Kubernetes集群</p>
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
     * <p>Invokes the ScanClusterVuls API operation to scan ACK clusters for potential security vulnerabilities, including container workload vulnerabilities, third-party software vulnerabilities, CVE vulnerabilities, WebCMS vulnerabilities, and Windows operating system vulnerabilities. Regularly scan clusters for security vulnerabilities to improve cluster security.</p>
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
     * <p>Invokes the ScanClusterVuls API operation to scan ACK clusters for potential security vulnerabilities, including container workload vulnerabilities, third-party software vulnerabilities, CVE vulnerabilities, WebCMS vulnerabilities, and Windows operating system vulnerabilities. Regularly scan clusters for security vulnerabilities to improve cluster security.</p>
     * @return ScanClusterVulsResponse
     */
    public ScanClusterVulsResponse scanClusterVuls(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanClusterVulsWithOptions(clusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the specified alert rule.</p>
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
     * <p>Starts the specified alert rule.</p>
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
     * <p>Disables alert rules in the ACK Alert Center. You can disable an entire alert rule group or an individual alert rule.</p>
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
     * <p>Disables alert rules in the ACK Alert Center. You can disable an entire alert rule group or an individual alert rule.</p>
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
     * <p>Synchronizes a cluster node pool, including node pool metadata and node information.</p>
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
     * <p>Synchronizes a cluster node pool, including node pool metadata and node information.</p>
     * @return SyncClusterNodePoolResponse
     */
    public SyncClusterNodePoolResponse syncClusterNodePool(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncClusterNodePoolWithOptions(ClusterId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds tags to a cluster. Adding tag key-value pairs allows cluster developers and O&amp;M engineers to classify and manage clusters more flexibly, and better supports requirements such as monitoring, cost analysis, and tenant isolation. You can call the TagResources operation to bind tags to a cluster.</p>
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
     * <p>Binds tags to a cluster. Adding tag key-value pairs allows cluster developers and O&amp;M engineers to classify and manage clusters more flexibly, and better supports requirements such as monitoring, cost analysis, and tenant isolation. You can call the TagResources operation to bind tags to a cluster.</p>
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
     * <p>Uninstalls specified components from a cluster and specifies whether to delete the associated Alibaba Cloud resources.</p>
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
     * <p>Uninstalls specified components from a cluster and specifies whether to delete the associated Alibaba Cloud resources.</p>
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
     * <p>Deletes resource tags when the tag key-value pairs of a cluster are no longer needed.</p>
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
     * <p>Deletes resource tags when the tag key-value pairs of a cluster are no longer needed.</p>
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
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/sls/detail/sls">Simple Log Service</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the audit log feature for a specified ACK cluster, or updates the audit log configurations to record requests to the Kubernetes API and the corresponding results for tracing cluster operation history and troubleshooting cluster faults.</p>
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
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/sls/detail/sls">Simple Log Service</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the audit log feature for a specified ACK cluster, or updates the audit log configurations to record requests to the Kubernetes API and the corresponding results for tracing cluster operation history and troubleshooting cluster faults.</p>
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
     * <p>Updates the cluster inspection configuration.</p>
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
     * <p>Updates the cluster inspection configuration.</p>
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
     * <p>Updates the contact group for an alert rule set in an ACK cluster.</p>
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
     * <p>Updates the contact group for an alert rule set in an ACK cluster.</p>
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
     * <p>Modifies the control plane component log configurations for an ACK managed cluster. ACK managed clusters support collecting control plane component logs and delivering them to your Simple Log Service (SLS) project. Control plane components include core components such as Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager. You can call the UpdateControlPlaneLog operation to modify the control plane component log configurations, such as the log retention period and the components to collect.</p>
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
     * <p>Modifies the control plane component log configurations for an ACK managed cluster. ACK managed clusters support collecting control plane component logs and delivering them to your Simple Log Service (SLS) project. Control plane components include core components such as Kube API Server, Kube Scheduler, Kube Controller Manager, and Cloud Controller Manager. You can call the UpdateControlPlaneLog operation to modify the control plane component log configurations, such as the log retention period and the components to collect.</p>
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
     * <ul>
     * <li>Only Alibaba Cloud accounts can call this operation.</li>
     * <li>If the KubeConfig credential used for the cluster is revoked, the custom expiration time configured for the cluster KubeConfig is also reset. You must call this operation to reconfigure the expiration time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the expiration time of the KubeConfig issued by an ACK cluster. By default, the KubeConfig expires in three years. You can use an Alibaba Cloud account to invoke the UpdateK8sClusterUserConfigExpire operation to specify the expiration time of the KubeConfig issued to a Resource Access Management (RAM) user or role in the ACK cluster. Valid values: 1 to 876000 hours.</p>
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
     * <ul>
     * <li>Only Alibaba Cloud accounts can call this operation.</li>
     * <li>If the KubeConfig credential used for the cluster is revoked, the custom expiration time configured for the cluster KubeConfig is also reset. You must call this operation to reconfigure the expiration time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the expiration time of the KubeConfig issued by an ACK cluster. By default, the KubeConfig expires in three years. You can use an Alibaba Cloud account to invoke the UpdateK8sClusterUserConfigExpire operation to specify the expiration time of the KubeConfig issued to a Resource Access Management (RAM) user or role in the ACK cluster. Valid values: 1 to 876000 hours.</p>
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
     * <b>description</b> :
     * <p>Do not disable or delete the KMS key used for encryption at rest in the KMS console or by calling API operations while enabling or disabling the feature, or after the feature is enabled. Otherwise, the API server of the cluster becomes unavailable. As a result, objects such as Secrets and ServiceAccounts cannot be retrieved, which affects the normal operation of your applications. For more information, see <a href="https://help.aliyun.com/document_detail/177372.html">Use Alibaba Cloud KMS to encrypt Secrets at rest</a>.</p>
     * <ul>
     * <li>The user or role that calls this API operation must be granted the required cluster RBAC permissions, such as the O&amp;M engineer or administrator permissions. Otherwise, the &quot;ForbiddenUpdateKMSState&quot; error code is returned.</li>
     * <li>After this API operation is successfully called, the cluster status changes to &quot;Updating&quot;. After the update is complete, the cluster status changes back to &quot;Running&quot;. You must wait at least 5 minutes after an update is complete before you can call this API operation for the same cluster again. Otherwise, the &quot;409&quot; status code is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption at rest configuration for Secrets in a specified cluster.</p>
     * 
     * @param request UpdateKMSEncryptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKMSEncryptionResponse
     */
    public UpdateKMSEncryptionResponse updateKMSEncryptionWithOptions(String ClusterId, UpdateKMSEncryptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disableEncryption)) {
            body.put("disable_encryption", request.disableEncryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            body.put("kms_key_id", request.kmsKeyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKMSEncryption"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/kms"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKMSEncryptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Do not disable or delete the KMS key used for encryption at rest in the KMS console or by calling API operations while enabling or disabling the feature, or after the feature is enabled. Otherwise, the API server of the cluster becomes unavailable. As a result, objects such as Secrets and ServiceAccounts cannot be retrieved, which affects the normal operation of your applications. For more information, see <a href="https://help.aliyun.com/document_detail/177372.html">Use Alibaba Cloud KMS to encrypt Secrets at rest</a>.</p>
     * <ul>
     * <li>The user or role that calls this API operation must be granted the required cluster RBAC permissions, such as the O&amp;M engineer or administrator permissions. Otherwise, the &quot;ForbiddenUpdateKMSState&quot; error code is returned.</li>
     * <li>After this API operation is successfully called, the cluster status changes to &quot;Updating&quot;. After the update is complete, the cluster status changes back to &quot;Running&quot;. You must wait at least 5 minutes after an update is complete before you can call this API operation for the same cluster again. Otherwise, the &quot;409&quot; status code is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption at rest configuration for Secrets in a specified cluster.</p>
     * 
     * @param request UpdateKMSEncryptionRequest
     * @return UpdateKMSEncryptionResponse
     */
    public UpdateKMSEncryptionResponse updateKMSEncryption(String ClusterId, UpdateKMSEncryptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKMSEncryptionWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a node component.</p>
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
     * <p>Updates a node component.</p>
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
     * <p>Updates a node component.</p>
     * 
     * @param request UpdateNodePoolComponentInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodePoolComponentInstanceResponse
     */
    public UpdateNodePoolComponentInstanceResponse updateNodePoolComponentInstanceWithOptions(String clusterId, String nodepoolId, String name, UpdateNodePoolComponentInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableRolling)) {
            body.put("disable_rolling", request.disableRolling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            body.put("node_names", request.nodeNames);
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
            new TeaPair("action", "UpdateNodePoolComponentInstance"),
            new TeaPair("version", "2015-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/nodepools/" + com.aliyun.openapiutil.Client.getEncodeParam(nodepoolId) + "/component_instances/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodePoolComponentInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a node component.</p>
     * 
     * @param request UpdateNodePoolComponentInstanceRequest
     * @return UpdateNodePoolComponentInstanceResponse
     */
    public UpdateNodePoolComponentInstanceResponse updateNodePoolComponentInstance(String clusterId, String nodepoolId, String name, UpdateNodePoolComponentInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNodePoolComponentInstanceWithOptions(clusterId, nodepoolId, name, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must install or upgrade the security policy component for the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/359818.html">Enable security policy management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the deletion protection status of a specified resource. Supported resource types include namespaces and services. You can enable deletion protection for namespaces or services that involve critical workloads or sensitive data to prevent accidental deletion and reduce maintenance costs.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, you must install or upgrade the security policy component for the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/359818.html">Enable security policy management</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the deletion protection status of a specified resource. Supported resource types include namespaces and services. You can enable deletion protection for namespaces or services that involve critical workloads or sensitive data to prevent accidental deletion and reduce maintenance costs.</p>
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
     * <p>Updates the configuration of an orchestration template. An orchestration template defines and describes a set of Kubernetes cluster resources declaratively to specify how an application should run or be configured.</p>
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
     * <p>Updates the configuration of an orchestration template. An orchestration template defines and describes a set of Kubernetes cluster resources declaratively to specify how an application should run or be configured.</p>
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
     * <p>You can update the cluster authorization information of a target Resource Access Management (RAM) user or RAM role by using a full update or an incremental update. A full update overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role. An incremental update includes add and delete operations. It only modifies the permissions based on the cluster authorization information included in the request and does not affect other cluster permissions of the RAM user or RAM role.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the Role-Based Access Control (RBAC) access permissions of a Resource Access Management (RAM) user or RAM role in an ACK cluster. By default, RAM users, RAM roles, and users other than the cluster creator do not have any RBAC access permissions in the cluster. You can invoke the UpdateUserPermissions operation to update the RBAC access permissions of a RAM user or RAM role, including the accessible resources, the scope of the permissions, and the preset role types, to improve secure access control in cluster management.</p>
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
     * <p>You can update the cluster authorization information of a target Resource Access Management (RAM) user or RAM role by using a full update or an incremental update. A full update overwrites the existing cluster permissions of the target RAM user or RAM role. The request must include all permission configurations that you want to grant to the target RAM user or RAM role. An incremental update includes add and delete operations. It only modifies the permissions based on the cluster authorization information included in the request and does not affect other cluster permissions of the RAM user or RAM role.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the Role-Based Access Control (RBAC) access permissions of a Resource Access Management (RAM) user or RAM role in an ACK cluster. By default, RAM users, RAM roles, and users other than the cluster creator do not have any RBAC access permissions in the cluster. You can invoke the UpdateUserPermissions operation to update the RBAC access permissions of a RAM user or RAM role, including the accessible resources, the scope of the permissions, and the preset role types, to improve secure access control in cluster management.</p>
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
     * <p>After you successfully call the UpgradeCluster operation, the API returns the task_id of the upgrade task. You can manage the task by calling the following task operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a><blockquote>
     * <p>Notice: Starting from July 4, 2026, the request parameters rolling_policy and rolling_policy.max_parallelism no longer take effect. Use <a href="https://help.aliyun.com/document_detail/2667922.html">UpgradeClusterNodepool</a> to upgrade worker nodes. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to request and response parameters of ACK cluster management operations and operation deprecation</a>.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an ACK cluster to mitigate potential security and stability risks associated with outdated versions and enable new features of the latest cluster version. You can call the UpgradeCluster operation to manually upgrade the cluster.</p>
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
     * <p>After you successfully call the UpgradeCluster operation, the API returns the task_id of the upgrade task. You can manage the task by calling the following task operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a><blockquote>
     * <p>Notice: Starting from July 4, 2026, the request parameters rolling_policy and rolling_policy.max_parallelism no longer take effect. Use <a href="https://help.aliyun.com/document_detail/2667922.html">UpgradeClusterNodepool</a> to upgrade worker nodes. For more information about the changes, see <a href="https://help.aliyun.com/document_detail/2932733.html">Announcement on changes to request and response parameters of ACK cluster management operations and operation deprecation</a>.</notice></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an ACK cluster to mitigate potential security and stability risks associated with outdated versions and enable new features of the latest cluster version. You can call the UpgradeCluster operation to manually upgrade the cluster.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Upgrading cluster component instance versions may affect your business. Assess the impact before performing the operation during off-peak hours and back up relevant data in advance.</li>
     * <li>Before upgrading a component, refer to <a href="https://help.aliyun.com/document_detail/176087.html">Component release notes</a> to learn about the changes and their impact for the specified component.</li>
     * <li>Upgrade components one at a time. Confirm that one component has been successfully upgraded before upgrading the next.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the versions of cluster component instances so that you can benefit from the feature optimizations in the new versions.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Upgrading cluster component instance versions may affect your business. Assess the impact before performing the operation during off-peak hours and back up relevant data in advance.</li>
     * <li>Before upgrading a component, refer to <a href="https://help.aliyun.com/document_detail/176087.html">Component release notes</a> to learn about the changes and their impact for the specified component.</li>
     * <li>Upgrade components one at a time. Confirm that one component has been successfully upgraded before upgrading the next.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the versions of cluster component instances so that you can benefit from the feature optimizations in the new versions.</p>
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
     * <p>Upgrades the Kubernetes version, operating system version, or container runtime version of nodes in a specified cluster node pool. After you successfully call the UpgradeClusterNodepool operation, the API returns a <code>task_id</code> for the upgrade task. You can manage the task by calling the following task API operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the kubelet version (recommended to match the control plane version), operating system version, or container runtime version of a specified cluster node pool.</p>
     * 
     * @param request UpgradeClusterNodepoolRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterNodepoolResponse
     */
    public UpgradeClusterNodepoolResponse upgradeClusterNodepoolWithOptions(String ClusterId, String NodepoolId, UpgradeClusterNodepoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ignoreWarningCheck)) {
            body.put("ignore_warning_check", request.ignoreWarningCheck);
        }

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
     * <p>Upgrades the Kubernetes version, operating system version, or container runtime version of nodes in a specified cluster node pool. After you successfully call the UpgradeClusterNodepool operation, the API returns a <code>task_id</code> for the upgrade task. You can manage the task by calling the following task API operations:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a paused task</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the kubelet version (recommended to match the control plane version), operating system version, or container runtime version of a specified cluster node pool.</p>
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
