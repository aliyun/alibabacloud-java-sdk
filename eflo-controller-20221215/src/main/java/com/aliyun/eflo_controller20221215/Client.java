// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215;

import com.aliyun.tea.*;
import com.aliyun.eflo_controller20221215.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eflo-controller", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Approves an O\&amp;M operation.</p>
     * 
     * @param request ApproveOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveOperationResponse
     */
    public ApproveOperationResponse approveOperationWithOptions(ApproveOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveOperation"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Approves an O\&amp;M operation.</p>
     * 
     * @param request ApproveOperationRequest
     * @return ApproveOperationResponse
     */
    public ApproveOperationResponse approveOperation(ApproveOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveOperationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改节点的节点组</p>
     * 
     * @param tmpReq ChangeNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeNodeGroupResponse
     */
    public ChangeNodeGroupResponse changeNodeGroupWithOptions(ChangeNodeGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChangeNodeGroupShrinkRequest request = new ChangeNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "Nodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            query.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodeGroupId)) {
            query.put("TargetNodeGroupId", request.targetNodeGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            body.put("Nodes", request.nodesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeNodeGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改节点的节点组</p>
     * 
     * @param request ChangeNodeGroupRequest
     * @return ChangeNodeGroupResponse
     */
    public ChangeNodeGroupResponse changeNodeGroup(ChangeNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>节点规格变配</p>
     * 
     * @param tmpReq ChangeNodeTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeNodeTypesResponse
     */
    public ChangeNodeTypesResponse changeNodeTypesWithOptions(ChangeNodeTypesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChangeNodeTypesShrinkRequest request = new ChangeNodeTypesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIds)) {
            request.nodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIds, "NodeIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdsShrink)) {
            body.put("NodeIds", request.nodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("NodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeNodeTypes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeNodeTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>节点规格变配</p>
     * 
     * @param request ChangeNodeTypesRequest
     * @return ChangeNodeTypesResponse
     */
    public ChangeNodeTypesResponse changeNodeTypes(ChangeNodeTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeNodeTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource from one resource group to another.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource from one resource group to another.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disconnect Connection</p>
     * 
     * @param request CloseSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseSessionResponse
     */
    public CloseSessionResponse closeSessionWithOptions(CloseSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionToken)) {
            body.put("SessionToken", request.sessionToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseSession"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disconnect Connection</p>
     * 
     * @param request CloseSessionRequest
     * @return CloseSessionResponse
     */
    public CloseSessionResponse closeSession(CloseSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a large-scale computing cluster</p>
     * 
     * @param tmpReq CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterShrinkRequest request = new CreateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networks)) {
            request.networksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networks, "Networks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nimizVSwitches)) {
            request.nimizVSwitchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nimizVSwitches, "NimizVSwitches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeGroups)) {
            request.nodeGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeGroups, "NodeGroups", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterDescription)) {
            body.put("ClusterDescription", request.clusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpnZone)) {
            body.put("HpnZone", request.hpnZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networksShrink)) {
            body.put("Networks", request.networksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nimizVSwitchesShrink)) {
            body.put("NimizVSwitches", request.nimizVSwitchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupsShrink)) {
            body.put("NodeGroups", request.nodeGroupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openEniJumboFrame)) {
            body.put("OpenEniJumboFrame", request.openEniJumboFrame);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a large-scale computing cluster</p>
     * 
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostics task.</p>
     * 
     * @param tmpReq CreateDiagnosticTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnosticTaskResponse
     */
    public CreateDiagnosticTaskResponse createDiagnosticTaskWithOptions(CreateDiagnosticTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDiagnosticTaskShrinkRequest request = new CreateDiagnosticTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aiJobLogInfo)) {
            request.aiJobLogInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aiJobLogInfo, "AiJobLogInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIds)) {
            request.nodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIds, "NodeIds", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiJobLogInfoShrink)) {
            body.put("AiJobLogInfo", request.aiJobLogInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticType)) {
            body.put("DiagnosticType", request.diagnosticType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdsShrink)) {
            body.put("NodeIds", request.nodeIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnosticTask"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosticTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostics task.</p>
     * 
     * @param request CreateDiagnosticTaskRequest
     * @return CreateDiagnosticTaskResponse
     */
    public CreateDiagnosticTaskResponse createDiagnosticTask(CreateDiagnosticTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a network test task.</p>
     * 
     * @param tmpReq CreateNetTestTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetTestTaskResponse
     */
    public CreateNetTestTaskResponse createNetTestTaskWithOptions(CreateNetTestTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNetTestTaskShrinkRequest request = new CreateNetTestTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commTest)) {
            request.commTestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commTest, "CommTest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.delayTest)) {
            request.delayTestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.delayTest, "DelayTest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trafficTest)) {
            request.trafficTestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trafficTest, "TrafficTest", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commTestShrink)) {
            body.put("CommTest", request.commTestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayTestShrink)) {
            body.put("DelayTest", request.delayTestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netTestType)) {
            body.put("NetTestType", request.netTestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkMode)) {
            body.put("NetworkMode", request.networkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficTestShrink)) {
            body.put("TrafficTest", request.trafficTestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetTestTask"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetTestTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a network test task.</p>
     * 
     * @param request CreateNetTestTaskRequest
     * @return CreateNetTestTaskResponse
     */
    public CreateNetTestTaskResponse createNetTestTask(CreateNetTestTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetTestTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Node Group under Cluster</p>
     * 
     * @param tmpReq CreateNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroupWithOptions(CreateNodeGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNodeGroupShrinkRequest request = new CreateNodeGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeGroup)) {
            request.nodeGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeGroup, "NodeGroup", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeUnit)) {
            request.nodeUnitShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeUnit, "NodeUnit", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupShrink)) {
            body.put("NodeGroup", request.nodeGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeUnitShrink)) {
            body.put("NodeUnit", request.nodeUnitShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Node Group under Cluster</p>
     * 
     * @param request CreateNodeGroupRequest
     * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroup(CreateNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Web Terminal session.</p>
     * 
     * @param request CreateSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionType)) {
            body.put("SessionType", request.sessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSession"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Web Terminal session.</p>
     * 
     * @param request CreateSessionRequest
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual storage channel (VSC).</p>
     * 
     * @param request CreateVscRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVscResponse
     */
    public CreateVscResponse createVscWithOptions(CreateVscRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscName)) {
            body.put("VscName", request.vscName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscType)) {
            body.put("VscType", request.vscType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVsc"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVscResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual storage channel (VSC).</p>
     * 
     * @param request CreateVscRequest
     * @return CreateVscResponse
     */
    public CreateVscResponse createVsc(CreateVscRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVscWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Lingjun cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Lingjun cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个未使用超节点</p>
     * 
     * @param request DeleteHyperNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHyperNodeResponse
     */
    public DeleteHyperNodeResponse deleteHyperNodeWithOptions(DeleteHyperNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hyperNodeId)) {
            body.put("HyperNodeId", request.hyperNodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHyperNode"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHyperNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个未使用超节点</p>
     * 
     * @param request DeleteHyperNodeRequest
     * @return DeleteHyperNodeResponse
     */
    public DeleteHyperNodeResponse deleteHyperNode(DeleteHyperNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHyperNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个未使用节点</p>
     * 
     * @param request DeleteNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNodeWithOptions(DeleteNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNode"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个未使用节点</p>
     * 
     * @param request DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除节点分组</p>
     * 
     * @param request DeleteNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodeGroupResponse
     */
    public DeleteNodeGroupResponse deleteNodeGroupWithOptions(DeleteNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNodeGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除节点分组</p>
     * 
     * @param request DeleteNodeGroupRequest
     * @return DeleteNodeGroupResponse
     */
    public DeleteNodeGroupResponse deleteNodeGroup(DeleteNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual storage channel (VSC).</p>
     * 
     * @param request DeleteVscRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVscResponse
     */
    public DeleteVscResponse deleteVscWithOptions(DeleteVscRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vscId)) {
            body.put("VscId", request.vscId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVsc"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVscResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual storage channel (VSC).</p>
     * 
     * @param request DeleteVscRequest
     * @return DeleteVscResponse
     */
    public DeleteVscResponse deleteVsc(DeleteVscRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVscWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Lingjun cluster.</p>
     * 
     * @param request DescribeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeClusterWithOptions(DescribeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCluster"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a Lingjun cluster.</p>
     * 
     * @param request DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a diagnostic task.</p>
     * 
     * @param request DescribeDiagnosticResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosticResultResponse
     */
    public DescribeDiagnosticResultResponse describeDiagnosticResultWithOptions(DescribeDiagnosticResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnosticId)) {
            body.put("DiagnosticId", request.diagnosticId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosticResult"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosticResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a diagnostic task.</p>
     * 
     * @param request DescribeDiagnosticResultRequest
     * @return DescribeDiagnosticResultResponse
     */
    public DescribeDiagnosticResultResponse describeDiagnosticResult(DescribeDiagnosticResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosticResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点列表</p>
     * 
     * @param request DescribeHyperNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHyperNodeResponse
     */
    public DescribeHyperNodeResponse describeHyperNodeWithOptions(DescribeHyperNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hyperNodeId)) {
            body.put("HyperNodeId", request.hyperNodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHyperNode"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHyperNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点列表</p>
     * 
     * @param request DescribeHyperNodeRequest
     * @return DescribeHyperNodeResponse
     */
    public DescribeHyperNodeResponse describeHyperNode(DescribeHyperNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHyperNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution list and status of O\&amp;M Assistant commands.</p>
     * 
     * @param request DescribeInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            body.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOutput)) {
            body.put("IncludeOutput", request.includeOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            body.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution list and status of O\&amp;M Assistant commands.</p>
     * 
     * @param request DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Network Test Result</p>
     * 
     * @param request DescribeNetTestResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetTestResultResponse
     */
    public DescribeNetTestResultResponse describeNetTestResultWithOptions(DescribeNetTestResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.testId)) {
            body.put("TestId", request.testId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetTestResult"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetTestResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Network Test Result</p>
     * 
     * @param request DescribeNetTestResultRequest
     * @return DescribeNetTestResultResponse
     */
    public DescribeNetTestResultResponse describeNetTestResult(DescribeNetTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetTestResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes.</p>
     * 
     * @param request DescribeNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeResponse
     */
    public DescribeNodeResponse describeNodeWithOptions(DescribeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNode"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes.</p>
     * 
     * @param request DescribeNodeRequest
     * @return DescribeNodeResponse
     */
    public DescribeNodeResponse describeNode(DescribeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点分组</p>
     * 
     * @param request DescribeNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeGroupResponse
     */
    public DescribeNodeGroupResponse describeNodeGroupWithOptions(DescribeNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询节点分组</p>
     * 
     * @param request DescribeNodeGroupRequest
     * @return DescribeNodeGroupResponse
     */
    public DescribeNodeGroupResponse describeNodeGroup(DescribeNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Web Terminal会话</p>
     * 
     * @param request DescribeNodeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeTypeResponse
     */
    public DescribeNodeTypeResponse describeNodeTypeWithOptions(DescribeNodeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("NodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeType"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Web Terminal会话</p>
     * 
     * @param request DescribeNodeTypeRequest
     * @return DescribeNodeTypeResponse
     */
    public DescribeNodeTypeResponse describeNodeType(DescribeNodeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the files that are sent by an O\&amp;M assistant and the status of the files.</p>
     * 
     * @param request DescribeSendFileResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSendFileResultsResponse
     */
    public DescribeSendFileResultsResponse describeSendFileResultsWithOptions(DescribeSendFileResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            body.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSendFileResults"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSendFileResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the files that are sent by an O\&amp;M assistant and the status of the files.</p>
     * 
     * @param request DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    public DescribeSendFileResultsResponse describeSendFileResults(DescribeSendFileResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSendFileResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a task.</p>
     * 
     * @param request DescribeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTaskWithOptions(DescribeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a task.</p>
     * 
     * @param request DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTask(DescribeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a virtual storage channel (VSC).</p>
     * 
     * @param request DescribeVscRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVscResponse
     */
    public DescribeVscResponse describeVscWithOptions(DescribeVscRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vscId)) {
            body.put("VscId", request.vscId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsc"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVscResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a virtual storage channel (VSC).</p>
     * 
     * @param request DescribeVscRequest
     * @return DescribeVscResponse
     */
    public DescribeVscResponse describeVsc(DescribeVscRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVscWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of zones.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of zones.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cluster Scaling</p>
     * 
     * @param tmpReq ExtendClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExtendClusterResponse
     */
    public ExtendClusterResponse extendClusterWithOptions(ExtendClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExtendClusterShrinkRequest request = new ExtendClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ipAllocationPolicy)) {
            request.ipAllocationPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ipAllocationPolicy, "IpAllocationPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeGroups)) {
            request.nodeGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeGroups, "NodeGroups", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vpdSubnets)) {
            request.vpdSubnetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vpdSubnets, "VpdSubnets", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAllocationPolicyShrink)) {
            body.put("IpAllocationPolicy", request.ipAllocationPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupsShrink)) {
            body.put("NodeGroups", request.nodeGroupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchZoneId)) {
            body.put("VSwitchZoneId", request.vSwitchZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdSubnetsShrink)) {
            body.put("VpdSubnets", request.vpdSubnetsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtendCluster"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExtendClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cluster Scaling</p>
     * 
     * @param request ExtendClusterRequest
     * @return ExtendClusterResponse
     */
    public ExtendClusterResponse extendCluster(ExtendClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extendClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>集群下的主机分组列表，分组下的主机列表</p>
     * 
     * @param request ListClusterHyperNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterHyperNodesResponse
     */
    public ListClusterHyperNodesResponse listClusterHyperNodesWithOptions(ListClusterHyperNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterHyperNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterHyperNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>集群下的主机分组列表，分组下的主机列表</p>
     * 
     * @param request ListClusterHyperNodesRequest
     * @return ListClusterHyperNodesResponse
     */
    public ListClusterHyperNodesResponse listClusterHyperNodes(ListClusterHyperNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterHyperNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in a cluster.</p>
     * 
     * @param request ListClusterNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterNodesResponse
     */
    public ListClusterNodesResponse listClusterNodesWithOptions(ListClusterNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingStates)) {
            body.put("OperatingStates", request.operatingStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in a cluster.</p>
     * 
     * @param request ListClusterNodesRequest
     * @return ListClusterNodesResponse
     */
    public ListClusterNodesResponse listClusterNodes(ListClusterNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of clusters.</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of clusters.</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List of Diagnostic Tasks</p>
     * 
     * @param request ListDiagnosticResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnosticResultsResponse
     */
    public ListDiagnosticResultsResponse listDiagnosticResultsWithOptions(ListDiagnosticResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagType)) {
            body.put("DiagType", request.diagType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnosticResults"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnosticResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List of Diagnostic Tasks</p>
     * 
     * @param request ListDiagnosticResultsRequest
     * @return ListDiagnosticResultsResponse
     */
    public ListDiagnosticResultsResponse listDiagnosticResults(ListDiagnosticResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiagnosticResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>可用rack物理机列表</p>
     * 
     * @param request ListFreeHyperNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFreeHyperNodesResponse
     */
    public ListFreeHyperNodesResponse listFreeHyperNodesWithOptions(ListFreeHyperNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hpnZone)) {
            body.put("HpnZone", request.hpnZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineType)) {
            body.put("MachineType", request.machineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFreeHyperNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFreeHyperNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>可用rack物理机列表</p>
     * 
     * @param request ListFreeHyperNodesRequest
     * @return ListFreeHyperNodesResponse
     */
    public ListFreeHyperNodesResponse listFreeHyperNodes(ListFreeHyperNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFreeHyperNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes that are not used.</p>
     * 
     * @param request ListFreeNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFreeNodesResponse
     */
    public ListFreeNodesResponse listFreeNodesWithOptions(ListFreeNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hpnZone)) {
            body.put("HpnZone", request.hpnZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineType)) {
            body.put("MachineType", request.machineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingStates)) {
            body.put("OperatingStates", request.operatingStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFreeNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFreeNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes that are not used.</p>
     * 
     * @param request ListFreeNodesRequest
     * @return ListFreeNodesResponse
     */
    public ListFreeNodesResponse listFreeNodes(ListFreeNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFreeNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机器列表</p>
     * 
     * @param tmpReq ListHyperNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHyperNodesResponse
     */
    public ListHyperNodesResponse listHyperNodesWithOptions(ListHyperNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHyperNodesShrinkRequest request = new ListHyperNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hyperNodeIds)) {
            request.hyperNodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hyperNodeIds, "HyperNodeIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operatingStates)) {
            request.operatingStatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operatingStates, "OperatingStates", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperNodeIdsShrink)) {
            query.put("HyperNodeIds", request.hyperNodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingStatesShrink)) {
            query.put("OperatingStates", request.operatingStatesShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpnZone)) {
            body.put("HpnZone", request.hpnZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperNodeId)) {
            body.put("HyperNodeId", request.hyperNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineType)) {
            body.put("MachineType", request.machineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupName)) {
            body.put("NodeGroupName", request.nodeGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHyperNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHyperNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>机器列表</p>
     * 
     * @param request ListHyperNodesRequest
     * @return ListHyperNodesResponse
     */
    public ListHyperNodesResponse listHyperNodes(ListHyperNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHyperNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists available images.</p>
     * 
     * @param request ListImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architecture)) {
            body.put("Architecture", request.architecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageVersion)) {
            body.put("ImageVersion", request.imageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists available images.</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query machine network configuration using HPNZone and machine type</p>
     * 
     * @param tmpReq ListMachineNetworkInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMachineNetworkInfoResponse
     */
    public ListMachineNetworkInfoResponse listMachineNetworkInfoWithOptions(ListMachineNetworkInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMachineNetworkInfoShrinkRequest request = new ListMachineNetworkInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.machineHpnInfo)) {
            request.machineHpnInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.machineHpnInfo, "MachineHpnInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.machineHpnInfoShrink)) {
            body.put("MachineHpnInfo", request.machineHpnInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMachineNetworkInfo"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMachineNetworkInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query machine network configuration using HPNZone and machine type</p>
     * 
     * @param request ListMachineNetworkInfoRequest
     * @return ListMachineNetworkInfoResponse
     */
    public ListMachineNetworkInfoResponse listMachineNetworkInfo(ListMachineNetworkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMachineNetworkInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instance types that are available to users.</p>
     * 
     * @param request ListMachineTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMachineTypesResponse
     */
    public ListMachineTypesResponse listMachineTypesWithOptions(ListMachineTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMachineTypes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMachineTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instance types that are available to users.</p>
     * 
     * @param request ListMachineTypesRequest
     * @return ListMachineTypesResponse
     */
    public ListMachineTypesResponse listMachineTypes(ListMachineTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMachineTypesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the results of network test results.</p>
     * 
     * @param request ListNetTestResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetTestResultsResponse
     */
    public ListNetTestResultsResponse listNetTestResultsWithOptions(ListNetTestResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netTestType)) {
            body.put("NetTestType", request.netTestType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetTestResults"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetTestResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API creates a session, returns the frontend endpoint, and starts a periodic task to track the session status.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the results of network test results.</p>
     * 
     * @param request ListNetTestResultsRequest
     * @return ListNetTestResultsResponse
     */
    public ListNetTestResultsResponse listNetTestResults(ListNetTestResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetTestResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries node groups in a cluster.</p>
     * 
     * @param request ListNodeGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeGroupsResponse
     */
    public ListNodeGroupsResponse listNodeGroupsWithOptions(ListNodeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeGroups"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries node groups in a cluster.</p>
     * 
     * @param request ListNodeGroupsRequest
     * @return ListNodeGroupsResponse
     */
    public ListNodeGroupsResponse listNodeGroups(ListNodeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统日志</p>
     * 
     * @param request ListSyslogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSyslogsResponse
     */
    public ListSyslogsResponse listSyslogsWithOptions(ListSyslogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            body.put("FromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            body.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            body.put("ToTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSyslogs"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSyslogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询系统日志</p>
     * 
     * @param request ListSyslogsRequest
     * @return ListSyslogsResponse
     */
    public ListSyslogsResponse listSyslogs(ListSyslogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSyslogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the cluster types available to the user</p>
     * 
     * @param request ListUserClusterTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserClusterTypesResponse
     */
    public ListUserClusterTypesResponse listUserClusterTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserClusterTypes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserClusterTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the cluster types available to the user</p>
     * @return ListUserClusterTypesResponse
     */
    public ListUserClusterTypesResponse listUserClusterTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserClusterTypesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of virtual storage channels (VSC).</p>
     * 
     * @param tmpReq ListVscsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVscsResponse
     */
    public ListVscsResponse listVscsWithOptions(ListVscsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVscsShrinkRequest request = new ListVscsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIds)) {
            request.nodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIds, "NodeIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdsShrink)) {
            body.put("NodeIds", request.nodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscName)) {
            body.put("VscName", request.vscName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVscs"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVscsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of virtual storage channels (VSC).</p>
     * 
     * @param request ListVscsRequest
     * @return ListVscsResponse
     */
    public ListVscsResponse listVscs(ListVscsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVscsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts nodes.</p>
     * 
     * @param tmpReq RebootNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootNodesResponse
     */
    public RebootNodesResponse rebootNodesWithOptions(RebootNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebootNodesShrinkRequest request = new RebootNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "Nodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            body.put("Nodes", request.nodesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts nodes.</p>
     * 
     * @param request RebootNodesRequest
     * @return RebootNodesResponse
     */
    public RebootNodesResponse rebootNodes(RebootNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reinstall a node.</p>
     * 
     * @param tmpReq ReimageNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReimageNodesResponse
     */
    public ReimageNodesResponse reimageNodesWithOptions(ReimageNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReimageNodesShrinkRequest request = new ReimageNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "Nodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            body.put("Nodes", request.nodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReimageNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReimageNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reinstall a node.</p>
     * 
     * @param request ReimageNodesRequest
     * @return ReimageNodesResponse
     */
    public ReimageNodesResponse reimageNodes(ReimageNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reimageNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>节点异常问题上报</p>
     * 
     * @param tmpReq ReportNodesStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportNodesStatusResponse
     */
    public ReportNodesStatusResponse reportNodesStatusWithOptions(ReportNodesStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportNodesStatusShrinkRequest request = new ReportNodesStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "Nodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueCategory)) {
            body.put("IssueCategory", request.issueCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            body.put("Nodes", request.nodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportNodesStatus"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportNodesStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>节点异常问题上报</p>
     * 
     * @param request ReportNodesStatusRequest
     * @return ReportNodesStatusResponse
     */
    public ReportNodesStatusResponse reportNodesStatus(ReportNodesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportNodesStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a Shell script on one or more Lingjun nodes.</p>
     * 
     * @param tmpReq RunCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommandWithOptions(RunCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunCommandShrinkRequest request = new RunCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIdList)) {
            request.nodeIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIdList, "NodeIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            body.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandId)) {
            body.put("CommandId", request.commandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            body.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableParameter)) {
            body.put("EnableParameter", request.enableParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            body.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launcher)) {
            body.put("Launcher", request.launcher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdListShrink)) {
            body.put("NodeIdList", request.nodeIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            body.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatMode)) {
            body.put("RepeatMode", request.repeatMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationMode)) {
            body.put("TerminationMode", request.terminationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workingDir)) {
            body.put("WorkingDir", request.workingDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a Shell script on one or more Lingjun nodes.</p>
     * 
     * @param request RunCommandRequest
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a file to one or more Lingjun nodes.</p>
     * 
     * @param tmpReq SendFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendFileResponse
     */
    public SendFileResponse sendFileWithOptions(SendFileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendFileShrinkRequest request = new SendFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIdList)) {
            request.nodeIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIdList, "NodeIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileGroup)) {
            body.put("FileGroup", request.fileGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileMode)) {
            body.put("FileMode", request.fileMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOwner)) {
            body.put("FileOwner", request.fileOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdListShrink)) {
            body.put("NodeIdList", request.nodeIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            body.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDir)) {
            body.put("TargetDir", request.targetDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendFile"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a file to one or more Lingjun nodes.</p>
     * 
     * @param request SendFileRequest
     * @return SendFileResponse
     */
    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales in a cluster.</p>
     * 
     * @param tmpReq ShrinkClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ShrinkClusterResponse
     */
    public ShrinkClusterResponse shrinkClusterWithOptions(ShrinkClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ShrinkClusterShrinkRequest request = new ShrinkClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeGroups)) {
            request.nodeGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeGroups, "NodeGroups", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupsShrink)) {
            body.put("NodeGroups", request.nodeGroupsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShrinkCluster"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShrinkClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scales in a cluster.</p>
     * 
     * @param request ShrinkClusterRequest
     * @return ShrinkClusterResponse
     */
    public ShrinkClusterResponse shrinkCluster(ShrinkClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.shrinkClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the O\&amp;M assistant command execution.</p>
     * 
     * @param tmpReq StopInvocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInvocationResponse
     */
    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopInvocationShrinkRequest request = new StopInvocationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIdList)) {
            request.nodeIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIdList, "NodeIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            body.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdListShrink)) {
            body.put("NodeIdList", request.nodeIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInvocation"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInvocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the O\&amp;M assistant command execution.</p>
     * 
     * @param request StopInvocationRequest
     * @return StopInvocationResponse
     */
    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops nodes.</p>
     * 
     * @param tmpReq StopNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopNodesResponse
     */
    public StopNodesResponse stopNodesWithOptions(StopNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopNodesShrinkRequest request = new StopNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodes)) {
            request.nodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodes, "Nodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ignoreFailedNodeTasks)) {
            body.put("IgnoreFailedNodeTasks", request.ignoreFailedNodeTasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesShrink)) {
            body.put("Nodes", request.nodesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopNodes"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops nodes.</p>
     * 
     * @param request StopNodesRequest
     * @return StopNodesResponse
     */
    public StopNodesResponse stopNodes(StopNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tags resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Tags resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom tag from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom tag from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Node Group</p>
     * 
     * @param request UpdateNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeGroupResponse
     */
    public UpdateNodeGroupResponse updateNodeGroupWithOptions(UpdateNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemMountEnabled)) {
            body.put("FileSystemMountEnabled", request.fileSystemMountEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            body.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("LoginPassword", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newNodeGroupName)) {
            body.put("NewNodeGroupName", request.newNodeGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            body.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeGroup"),
            new TeaPair("version", "2022-12-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Node Group</p>
     * 
     * @param request UpdateNodeGroupRequest
     * @return UpdateNodeGroupResponse
     */
    public UpdateNodeGroupResponse updateNodeGroup(UpdateNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeGroupWithOptions(request, runtime);
    }
}
