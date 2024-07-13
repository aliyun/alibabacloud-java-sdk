// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320;

import com.aliyun.tea.*;
import com.aliyun.emr20210320.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "emr.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "emr.aliyuncs.com"),
            new TeaPair("us-west-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "emr.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-edge-1", "emr.aliyuncs.com"),
            new TeaPair("cn-fujian", "emr.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "emr.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "emr.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-wuhan", "emr.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "emr.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "emr.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "emr.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "emr.aliyuncs.com")
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

    /**
     * @param request CreateApiTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiTemplateResponse
     */
    public CreateApiTemplateResponse createApiTemplateWithOptions(CreateApiTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiTemplate"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiTemplateResponse());
    }

    /**
     * @param request CreateApiTemplateRequest
     * @return CreateApiTemplateResponse
     */
    public CreateApiTemplateResponse createApiTemplate(CreateApiTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription cluster.</p>
     * 
     * @param request CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            query.put("ApplicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applications)) {
            query.put("Applications", request.applications);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootstrapScripts)) {
            query.put("BootstrapScripts", request.bootstrapScripts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMode)) {
            query.put("DeployMode", request.deployMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAttributes)) {
            query.put("NodeAttributes", request.nodeAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroups)) {
            query.put("NodeGroups", request.nodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            query.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityMode)) {
            query.put("SecurityMode", request.securityMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionConfig)) {
            query.put("SubscriptionConfig", request.subscriptionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Creates a pay-as-you-go or subscription cluster.</p>
     * 
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建节点组。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a node group.</p>
     * 
     * @param request CreateNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroupWithOptions(CreateNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroup)) {
            query.put("NodeGroup", request.nodeGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeGroup"),
            new TeaPair("version", "2021-03-20"),
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
     * <b>description</b> :
     * <p>创建节点组。</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a node group.</p>
     * 
     * @param request CreateNodeGroupRequest
     * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroup(CreateNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param request CreateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScriptWithOptions(CreateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scripts)) {
            query.put("Scripts", request.scripts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScript"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param request CreateScriptRequest
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Perform a scale-out operation on the target node group.</p>
     * 
     * @param request DecreaseNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecreaseNodesResponse
     */
    public DecreaseNodesResponse decreaseNodesWithOptions(DecreaseNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseNodeCount)) {
            query.put("DecreaseNodeCount", request.decreaseNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecreaseNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecreaseNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Perform a scale-out operation on the target node group.</p>
     * 
     * @param request DecreaseNodesRequest
     * @return DecreaseNodesResponse
     */
    public DecreaseNodesResponse decreaseNodes(DecreaseNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decreaseNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建集群模板</p>
     * 
     * @param request DeleteApiTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiTemplateResponse
     */
    public DeleteApiTemplateResponse deleteApiTemplateWithOptions(DeleteApiTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiTemplate"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>创建集群模板</p>
     * 
     * @param request DeleteApiTemplateRequest
     * @return DeleteApiTemplateResponse
     */
    public DeleteApiTemplateResponse deleteApiTemplate(DeleteApiTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2021-03-20"),
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
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param request DeleteScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScriptWithOptions(DeleteScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScript"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param request DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取API模板详情</p>
     * 
     * @param request GetApiTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiTemplateResponse
     */
    public GetApiTemplateResponse getApiTemplateWithOptions(GetApiTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiTemplate"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取API模板详情</p>
     * 
     * @param request GetApiTemplateRequest
     * @return GetApiTemplateResponse
     */
    public GetApiTemplateResponse getApiTemplate(GetApiTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApiTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询应用详情。</p>
     * 
     * @param request GetApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询应用详情。</p>
     * 
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取弹性伸缩活动详情。</p>
     * 
     * @param request GetAutoScalingActivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScalingActivityResponse
     */
    public GetAutoScalingActivityResponse getAutoScalingActivityWithOptions(GetAutoScalingActivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingActivity"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingActivityResponse());
    }

    /**
     * <b>description</b> :
     * <p>获取弹性伸缩活动详情。</p>
     * 
     * @param request GetAutoScalingActivityRequest
     * @return GetAutoScalingActivityResponse
     */
    public GetAutoScalingActivityResponse getAutoScalingActivity(GetAutoScalingActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingActivityWithOptions(request, runtime);
    }

    /**
     * @param request GetAutoScalingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScalingPolicyResponse
     */
    public GetAutoScalingPolicyResponse getAutoScalingPolicyWithOptions(GetAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingPolicyResponse());
    }

    /**
     * @param request GetAutoScalingPolicyRequest
     * @return GetAutoScalingPolicyResponse
     */
    public GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a cluster.</p>
     * 
     * @param request GetClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a cluster.</p>
     * 
     * @param request GetClusterRequest
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get one doctor analysis app</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains job analysis information on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplicationWithOptions(GetDoctorApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorApplication"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>get one doctor analysis app</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains job analysis information on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplication(GetDoctorApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get one specific luster engine queue by &lt;type, name&gt;</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about resource usage in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorComputeSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorComputeSummaryResponse
     */
    public GetDoctorComputeSummaryResponse getDoctorComputeSummaryWithOptions(GetDoctorComputeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentInfo)) {
            query.put("ComponentInfo", request.componentInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorComputeSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorComputeSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>get one specific luster engine queue by &lt;type, name&gt;</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about resource usage in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorComputeSummaryRequest
     * @return GetDoctorComputeSummaryResponse
     */
    public GetDoctorComputeSummaryResponse getDoctorComputeSummary(GetDoctorComputeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorComputeSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseCluster</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the metrics of an HBase cluster.</p>
     * 
     * @param request GetDoctorHBaseClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHBaseClusterResponse
     */
    public GetDoctorHBaseClusterResponse getDoctorHBaseClusterWithOptions(GetDoctorHBaseClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseCluster</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the metrics of an HBase cluster.</p>
     * 
     * @param request GetDoctorHBaseClusterRequest
     * @return GetDoctorHBaseClusterResponse
     */
    public GetDoctorHBaseClusterResponse getDoctorHBaseCluster(GetDoctorHBaseClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegions</p>
     * 
     * @param request GetDoctorHBaseRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHBaseRegionResponse
     */
    public GetDoctorHBaseRegionResponse getDoctorHBaseRegionWithOptions(GetDoctorHBaseRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hbaseRegionId)) {
            query.put("HbaseRegionId", request.hbaseRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseRegion"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseRegionResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegions</p>
     * 
     * @param request GetDoctorHBaseRegionRequest
     * @return GetDoctorHBaseRegionResponse
     */
    public GetDoctorHBaseRegionResponse getDoctorHBaseRegion(GetDoctorHBaseRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseRegionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseRegionServer</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about an HBase region server.</p>
     * 
     * @param request GetDoctorHBaseRegionServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHBaseRegionServerResponse
     */
    public GetDoctorHBaseRegionServerResponse getDoctorHBaseRegionServerWithOptions(GetDoctorHBaseRegionServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionServerHost)) {
            query.put("RegionServerHost", request.regionServerHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseRegionServer"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseRegionServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseRegionServer</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about an HBase region server.</p>
     * 
     * @param request GetDoctorHBaseRegionServerRequest
     * @return GetDoctorHBaseRegionServerResponse
     */
    public GetDoctorHBaseRegionServerResponse getDoctorHBaseRegionServer(GetDoctorHBaseRegionServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseRegionServerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseTable</p>
     * 
     * @param request GetDoctorHBaseTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHBaseTableResponse
     */
    public GetDoctorHBaseTableResponse getDoctorHBaseTableWithOptions(GetDoctorHBaseTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseTable"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseTableResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseTable</p>
     * 
     * @param request GetDoctorHBaseTableRequest
     * @return GetDoctorHBaseTableResponse
     */
    public GetDoctorHBaseTableResponse getDoctorHBaseTable(GetDoctorHBaseTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTableRegions</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of the Hadoop Distributed File System (HDFS) storage resources of a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHDFSClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHDFSClusterResponse
     */
    public GetDoctorHDFSClusterResponse getDoctorHDFSClusterWithOptions(GetDoctorHDFSClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTableRegions</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of the Hadoop Distributed File System (HDFS) storage resources of a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHDFSClusterRequest
     * @return GetDoctorHDFSClusterResponse
     */
    public GetDoctorHDFSClusterResponse getDoctorHDFSCluster(GetDoctorHDFSClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFSNode</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a specific Hadoop Distributed File System (HDFS) directory of a cluster. The depth of the directory is not greater than five.</p>
     * 
     * @param request GetDoctorHDFSDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHDFSDirectoryResponse
     */
    public GetDoctorHDFSDirectoryResponse getDoctorHDFSDirectoryWithOptions(GetDoctorHDFSDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirPath)) {
            query.put("DirPath", request.dirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSDirectory"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFSNode</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a specific Hadoop Distributed File System (HDFS) directory of a cluster. The depth of the directory is not greater than five.</p>
     * 
     * @param request GetDoctorHDFSDirectoryRequest
     * @return GetDoctorHDFSDirectoryResponse
     */
    public GetDoctorHDFSDirectoryResponse getDoctorHDFSDirectory(GetDoctorHDFSDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFS UGI</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of Hadoop Distributed File System (HDFS) storage resources for a specific owner or group on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHDFSUGIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHDFSUGIResponse
     */
    public GetDoctorHDFSUGIResponse getDoctorHDFSUGIWithOptions(GetDoctorHDFSUGIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSUGI"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSUGIResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFS UGI</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of Hadoop Distributed File System (HDFS) storage resources for a specific owner or group on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHDFSUGIRequest
     * @return GetDoctorHDFSUGIResponse
     */
    public GetDoctorHDFSUGIResponse getDoctorHDFSUGI(GetDoctorHDFSUGIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSUGIWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Cluster</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a Hive cluster.</p>
     * 
     * @param request GetDoctorHiveClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHiveClusterResponse
     */
    public GetDoctorHiveClusterResponse getDoctorHiveClusterWithOptions(GetDoctorHiveClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Cluster</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a Hive cluster.</p>
     * 
     * @param request GetDoctorHiveClusterRequest
     * @return GetDoctorHiveClusterResponse
     */
    public GetDoctorHiveClusterResponse getDoctorHiveCluster(GetDoctorHiveClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Database</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a Hive database.</p>
     * 
     * @param request GetDoctorHiveDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHiveDatabaseResponse
     */
    public GetDoctorHiveDatabaseResponse getDoctorHiveDatabaseWithOptions(GetDoctorHiveDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveDatabase"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveDatabaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Database</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a Hive database.</p>
     * 
     * @param request GetDoctorHiveDatabaseRequest
     * @return GetDoctorHiveDatabaseResponse
     */
    public GetDoctorHiveDatabaseResponse getDoctorHiveDatabase(GetDoctorHiveDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Table</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a specific Hive table in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHiveTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorHiveTableResponse
     */
    public GetDoctorHiveTableResponse getDoctorHiveTableWithOptions(GetDoctorHiveTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveTable"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveTableResponse());
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Table</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of a specific Hive table in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorHiveTableRequest
     * @return GetDoctorHiveTableResponse
     */
    public GetDoctorHiveTableResponse getDoctorHiveTable(GetDoctorHiveTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Get realtime job by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the basic running information about a job on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorJobResponse
     */
    public GetDoctorJobResponse getDoctorJobWithOptions(GetDoctorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorJob"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Get realtime job by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the basic running information about a job on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorJobRequest
     * @return GetDoctorJobResponse
     */
    public GetDoctorJobResponse getDoctorJob(GetDoctorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>get specify component&#39;s report analysis by emr doctor</p>
     * 
     * @param request GetDoctorReportComponentSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorReportComponentSummaryResponse
     */
    public GetDoctorReportComponentSummaryResponse getDoctorReportComponentSummaryWithOptions(GetDoctorReportComponentSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            query.put("ComponentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorReportComponentSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorReportComponentSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>get specify component&#39;s report analysis by emr doctor</p>
     * 
     * @param request GetDoctorReportComponentSummaryRequest
     * @return GetDoctorReportComponentSummaryResponse
     */
    public GetDoctorReportComponentSummaryResponse getDoctorReportComponentSummary(GetDoctorReportComponentSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorReportComponentSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>获取节点组详情。</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the details of a node group.</p>
     * 
     * @param request GetNodeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeGroupResponse
     */
    public GetNodeGroupResponse getNodeGroupWithOptions(GetNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeGroup"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>获取节点组详情。</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the details of a node group.</p>
     * 
     * @param request GetNodeGroupRequest
     * @return GetNodeGroupResponse
     */
    public GetNodeGroupResponse getNodeGroup(GetNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of an asynchronous operation.</p>
     * 
     * @param request GetOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOperationResponse
     */
    public GetOperationResponse getOperationWithOptions(GetOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperation"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of an asynchronous operation.</p>
     * 
     * @param request GetOperationRequest
     * @return GetOperationResponse
     */
    public GetOperationResponse getOperation(GetOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scale out the node group.</p>
     * 
     * @param request IncreaseNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncreaseNodesResponse
     */
    public IncreaseNodesResponse increaseNodesWithOptions(IncreaseNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            query.put("ApplicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPayOrder)) {
            query.put("AutoPayOrder", request.autoPayOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.increaseNodeCount)) {
            query.put("IncreaseNodeCount", request.increaseNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minIncreaseNodeCount)) {
            query.put("MinIncreaseNodeCount", request.minIncreaseNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            query.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            query.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scale out the node group.</p>
     * 
     * @param request IncreaseNodesRequest
     * @return IncreaseNodesResponse
     */
    public IncreaseNodesResponse increaseNodes(IncreaseNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add an EMR resource to the target resource group. A resource can belong to only one resource group.</p>
     * 
     * @param request JoinResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinResourceGroupResponse
     */
    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinResourceGroup"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add an EMR resource to the target resource group. A resource can belong to only one resource group.</p>
     * 
     * @param request JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
     */
    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询API模板</p>
     * 
     * @param request ListApiTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiTemplatesResponse
     */
    public ListApiTemplatesResponse listApiTemplatesWithOptions(ListApiTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiTemplates"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询API模板</p>
     * 
     * @param request ListApiTemplatesRequest
     * @return ListApiTemplatesResponse
     */
    public ListApiTemplatesResponse listApiTemplates(ListApiTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询应用配置。</p>
     * 
     * @param request ListApplicationConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationConfigsResponse
     */
    public ListApplicationConfigsResponse listApplicationConfigsWithOptions(ListApplicationConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configFileName)) {
            query.put("ConfigFileName", request.configFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configItemKey)) {
            query.put("ConfigItemKey", request.configItemKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configItemValue)) {
            query.put("ConfigItemValue", request.configItemValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationConfigs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询应用配置。</p>
     * 
     * @param request ListApplicationConfigsRequest
     * @return ListApplicationConfigsResponse
     */
    public ListApplicationConfigsResponse listApplicationConfigs(ListApplicationConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询应用列表。</p>
     * 
     * @param request ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationNames)) {
            query.put("ApplicationNames", request.applicationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询应用列表。</p>
     * 
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询弹性伸缩活动列表。</p>
     * 
     * @param request ListAutoScalingActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoScalingActivitiesResponse
     */
    public ListAutoScalingActivitiesResponse listAutoScalingActivitiesWithOptions(ListAutoScalingActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityStates)) {
            query.put("ScalingActivityStates", request.scalingActivityStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityType)) {
            query.put("ScalingActivityType", request.scalingActivityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingActivities"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingActivitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询弹性伸缩活动列表。</p>
     * 
     * @param request ListAutoScalingActivitiesRequest
     * @return ListAutoScalingActivitiesResponse
     */
    public ListAutoScalingActivitiesResponse listAutoScalingActivities(ListAutoScalingActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoScalingActivitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries E-MapReduce (EMR) clusters.</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            query.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterStates)) {
            query.put("ClusterStates", request.clusterStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterTypes)) {
            query.put("ClusterTypes", request.clusterTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentTypes)) {
            query.put("PaymentTypes", request.paymentTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Queries E-MapReduce (EMR) clusters.</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询组件实例列表。</p>
     * 
     * @param request ListComponentInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentInstancesResponse
     */
    public ListComponentInstancesResponse listComponentInstancesWithOptions(ListComponentInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationNames)) {
            query.put("ApplicationNames", request.applicationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentNames)) {
            query.put("ComponentNames", request.componentNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentStates)) {
            query.put("ComponentStates", request.componentStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentInstances"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询组件实例列表。</p>
     * 
     * @param request ListComponentInstancesRequest
     * @return ListComponentInstancesResponse
     */
    public ListComponentInstancesResponse listComponentInstances(ListComponentInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComponentInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询组件列表。</p>
     * 
     * @param request ListComponentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationNames)) {
            query.put("ApplicationNames", request.applicationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentNames)) {
            query.put("ComponentNames", request.componentNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentStates)) {
            query.put("ComponentStates", request.componentStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeExpiredConfig)) {
            query.put("IncludeExpiredConfig", request.includeExpiredConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询组件列表。</p>
     * 
     * @param request ListComponentsRequest
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list all doctor analysis apps</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple jobs on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorApplicationsResponse
     */
    public ListDoctorApplicationsResponse listDoctorApplicationsWithOptions(ListDoctorApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queues)) {
            query.put("Queues", request.queues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorApplications"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorApplicationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>list all doctor analysis apps</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple jobs on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorApplicationsRequest
     * @return ListDoctorApplicationsResponse
     */
    public ListDoctorApplicationsResponse listDoctorApplications(ListDoctorApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor analysis result of cluster engine queue view</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about resource usage by resource type in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorComputeSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorComputeSummaryResponse
     */
    public ListDoctorComputeSummaryResponse listDoctorComputeSummaryWithOptions(ListDoctorComputeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentTypes)) {
            query.put("ComponentTypes", request.componentTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorComputeSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorComputeSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor analysis result of cluster engine queue view</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about resource usage by resource type in a cluster on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorComputeSummaryRequest
     * @return ListDoctorComputeSummaryResponse
     */
    public ListDoctorComputeSummaryResponse listDoctorComputeSummary(ListDoctorComputeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorComputeSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegionServers</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about multiple HBase RegionServers at a time.</p>
     * 
     * @param request ListDoctorHBaseRegionServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHBaseRegionServersResponse
     */
    public ListDoctorHBaseRegionServersResponse listDoctorHBaseRegionServersWithOptions(ListDoctorHBaseRegionServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionServerHosts)) {
            query.put("RegionServerHosts", request.regionServerHosts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHBaseRegionServers"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHBaseRegionServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegionServers</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about multiple HBase RegionServers at a time.</p>
     * 
     * @param request ListDoctorHBaseRegionServersRequest
     * @return ListDoctorHBaseRegionServersResponse
     */
    public ListDoctorHBaseRegionServersResponse listDoctorHBaseRegionServers(ListDoctorHBaseRegionServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHBaseRegionServersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTables</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about multiple HBase tables at a time.</p>
     * 
     * @param request ListDoctorHBaseTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHBaseTablesResponse
     */
    public ListDoctorHBaseTablesResponse listDoctorHBaseTablesWithOptions(ListDoctorHBaseTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            query.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHBaseTables"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHBaseTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTables</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the information about multiple HBase tables at a time.</p>
     * 
     * @param request ListDoctorHBaseTablesRequest
     * @return ListDoctorHBaseTablesResponse
     */
    public ListDoctorHBaseTablesResponse listDoctorHBaseTables(ListDoctorHBaseTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHBaseTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFSNodes</p>
     * 
     * @param request ListDoctorHDFSDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHDFSDirectoriesResponse
     */
    public ListDoctorHDFSDirectoriesResponse listDoctorHDFSDirectoriesWithOptions(ListDoctorHDFSDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirPath)) {
            query.put("DirPath", request.dirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHDFSDirectories"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHDFSDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFSNodes</p>
     * 
     * @param request ListDoctorHDFSDirectoriesRequest
     * @return ListDoctorHDFSDirectoriesResponse
     */
    public ListDoctorHDFSDirectoriesResponse listDoctorHDFSDirectories(ListDoctorHDFSDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHDFSDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFS UGIs</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of Hadoop Distributed File System (HDFS) storage resources for multiple owners or groups at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorHDFSUGIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHDFSUGIResponse
     */
    public ListDoctorHDFSUGIResponse listDoctorHDFSUGIWithOptions(ListDoctorHDFSUGIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHDFSUGI"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHDFSUGIResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFS UGIs</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of Hadoop Distributed File System (HDFS) storage resources for multiple owners or groups at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorHDFSUGIRequest
     * @return ListDoctorHDFSUGIResponse
     */
    public ListDoctorHDFSUGIResponse listDoctorHDFSUGI(ListDoctorHDFSUGIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHDFSUGIWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Databases</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple Hive databases at a time.</p>
     * 
     * @param request ListDoctorHiveDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHiveDatabasesResponse
     */
    public ListDoctorHiveDatabasesResponse listDoctorHiveDatabasesWithOptions(ListDoctorHiveDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseNames)) {
            query.put("DatabaseNames", request.databaseNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHiveDatabases"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHiveDatabasesResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Databases</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple Hive databases at a time.</p>
     * 
     * @param request ListDoctorHiveDatabasesRequest
     * @return ListDoctorHiveDatabasesResponse
     */
    public ListDoctorHiveDatabasesResponse listDoctorHiveDatabases(ListDoctorHiveDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHiveDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Tables</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple Hive tables at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorHiveTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorHiveTablesResponse
     */
    public ListDoctorHiveTablesResponse listDoctorHiveTablesWithOptions(ListDoctorHiveTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            query.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHiveTables"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHiveTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Tables</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the analysis results of multiple Hive tables at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorHiveTablesRequest
     * @return ListDoctorHiveTablesResponse
     */
    public ListDoctorHiveTablesResponse listDoctorHiveTables(ListDoctorHiveTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHiveTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list realtime jobs by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the basic running information about multiple jobs at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorJobsResponse
     */
    public ListDoctorJobsResponse listDoctorJobsWithOptions(ListDoctorJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRange)) {
            query.put("EndRange", request.endRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queues)) {
            query.put("Queues", request.queues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRange)) {
            query.put("StartRange", request.startRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorJobs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>list realtime jobs by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the basic running information about multiple jobs at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorJobsRequest
     * @return ListDoctorJobsResponse
     */
    public ListDoctorJobsResponse listDoctorJobs(ListDoctorJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list stats groupBy jobs by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the summary of basic running information about multiple jobs at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorJobsStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorJobsStatsResponse
     */
    public ListDoctorJobsStatsResponse listDoctorJobsStatsWithOptions(ListDoctorJobsStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRange)) {
            query.put("EndRange", request.endRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRange)) {
            query.put("StartRange", request.startRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorJobsStats"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorJobsStatsResponse());
    }

    /**
     * <b>description</b> :
     * <p>list stats groupBy jobs by yarn</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the summary of basic running information about multiple jobs at a time on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request ListDoctorJobsStatsRequest
     * @return ListDoctorJobsStatsResponse
     */
    public ListDoctorJobsStatsResponse listDoctorJobsStats(ListDoctorJobsStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorJobsStatsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>list all reports analysis by emr doctor</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the overall analysis result reports of E-MapReduce (EMR) Doctor at a time.</p>
     * 
     * @param request ListDoctorReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDoctorReportsResponse
     */
    public ListDoctorReportsResponse listDoctorReportsWithOptions(ListDoctorReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorReports"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorReportsResponse());
    }

    /**
     * <b>description</b> :
     * <p>list all reports analysis by emr doctor</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the overall analysis result reports of E-MapReduce (EMR) Doctor at a time.</p>
     * 
     * @param request ListDoctorReportsRequest
     * @return ListDoctorReportsResponse
     */
    public ListDoctorReportsResponse listDoctorReports(ListDoctorReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorReportsWithOptions(request, runtime);
    }

    /**
     * @param request ListInspectionHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInspectionHistoryResponse
     */
    public ListInspectionHistoryResponse listInspectionHistoryWithOptions(ListInspectionHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.component)) {
            query.put("Component", request.component);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInspectionHistory"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInspectionHistoryResponse());
    }

    /**
     * @param request ListInspectionHistoryRequest
     * @return ListInspectionHistoryResponse
     */
    public ListInspectionHistoryResponse listInspectionHistory(ListInspectionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInspectionHistoryWithOptions(request, runtime);
    }

    /**
     * @param request ListInstanceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceTypesResponse
     */
    public ListInstanceTypesResponse listInstanceTypesWithOptions(ListInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMode)) {
            query.put("DeployMode", request.deployMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isModification)) {
            query.put("IsModification", request.isModification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupType)) {
            query.put("NodeGroupType", request.nodeGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            query.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceTypes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceTypesResponse());
    }

    /**
     * @param request ListInstanceTypesRequest
     * @return ListInstanceTypesResponse
     */
    public ListInstanceTypesResponse listInstanceTypes(ListInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of node groups in an EMR cluster.</p>
     * 
     * @param request ListNodeGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeGroupsResponse
     */
    public ListNodeGroupsResponse listNodeGroupsWithOptions(ListNodeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupIds)) {
            query.put("NodeGroupIds", request.nodeGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupNames)) {
            query.put("NodeGroupNames", request.nodeGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupStates)) {
            query.put("NodeGroupStates", request.nodeGroupStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupTypes)) {
            query.put("NodeGroupTypes", request.nodeGroupTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeGroups"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Queries the list of node groups in an EMR cluster.</p>
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
     * <p>Queries the node list of an EMR cluster.</p>
     * 
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupIds)) {
            query.put("NodeGroupIds", request.nodeGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStates)) {
            query.put("NodeStates", request.nodeStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIps)) {
            query.put("PrivateIps", request.privateIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIps)) {
            query.put("PublicIps", request.publicIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the node list of an EMR cluster.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询主版本。</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the major E-MapReduce (EMR) versions.</p>
     * 
     * @param request ListReleaseVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersionsWithOptions(ListReleaseVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaasType)) {
            query.put("IaasType", request.iaasType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReleaseVersions"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReleaseVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询主版本。</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the major E-MapReduce (EMR) versions.</p>
     * 
     * @param request ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersions(ListReleaseVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReleaseVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查询资源巡检项。</p>
     * 
     * @param request ListResourceHealthInspectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceHealthInspectionsResponse
     */
    public ListResourceHealthInspectionsResponse listResourceHealthInspectionsWithOptions(ListResourceHealthInspectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatuses)) {
            query.put("HealthStatuses", request.healthStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceHealthInspections"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceHealthInspectionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询资源巡检项。</p>
     * 
     * @param request ListResourceHealthInspectionsRequest
     * @return ListResourceHealthInspectionsResponse
     */
    public ListResourceHealthInspectionsResponse listResourceHealthInspections(ListResourceHealthInspectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceHealthInspectionsWithOptions(request, runtime);
    }

    /**
     * @param request ListScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScriptsWithOptions(ListScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScripts"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptsResponse());
    }

    /**
     * @param request ListScriptsRequest
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are bound to an EMR cluster.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Queries the tags that are bound to an EMR cluster.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure auto scaling policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures auto scaling rules.</p>
     * 
     * @param request PutAutoScalingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutAutoScalingPolicyResponse
     */
    public PutAutoScalingPolicyResponse putAutoScalingPolicyWithOptions(PutAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraints)) {
            query.put("Constraints", request.constraints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRules)) {
            query.put("ScalingRules", request.scalingRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutAutoScalingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure auto scaling policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures auto scaling rules.</p>
     * 
     * @param request PutAutoScalingPolicyRequest
     * @return PutAutoScalingPolicyResponse
     */
    public PutAutoScalingPolicyResponse putAutoScalingPolicy(PutAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putAutoScalingPolicyWithOptions(request, runtime);
    }

    /**
     * @param request RemoveAutoScalingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAutoScalingPolicyResponse
     */
    public RemoveAutoScalingPolicyResponse removeAutoScalingPolicyWithOptions(RemoveAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAutoScalingPolicyResponse());
    }

    /**
     * @param request RemoveAutoScalingPolicyRequest
     * @return RemoveAutoScalingPolicyResponse
     */
    public RemoveAutoScalingPolicyResponse removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAutoScalingPolicyWithOptions(request, runtime);
    }

    /**
     * @param request RunApiTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunApiTemplateResponse
     */
    public RunApiTemplateResponse runApiTemplateWithOptions(RunApiTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunApiTemplate"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunApiTemplateResponse());
    }

    /**
     * @param request RunApiTemplateRequest
     * @return RunApiTemplateResponse
     */
    public RunApiTemplateResponse runApiTemplate(RunApiTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runApiTemplateWithOptions(request, runtime);
    }

    /**
     * @param request RunApplicationActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunApplicationActionResponse
     */
    public RunApplicationActionResponse runApplicationActionWithOptions(RunApplicationActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchSize)) {
            query.put("BatchSize", request.batchSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentInstanceSelector)) {
            query.put("ComponentInstanceSelector", request.componentInstanceSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeStrategy)) {
            query.put("ExecuteStrategy", request.executeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingExecute)) {
            query.put("RollingExecute", request.rollingExecute);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunApplicationAction"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunApplicationActionResponse());
    }

    /**
     * @param request RunApplicationActionRequest
     * @return RunApplicationActionResponse
     */
    public RunApplicationActionResponse runApplicationAction(RunApplicationActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runApplicationActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Bind tags to a specified EMR cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Bind tags to a specified EMR cluster.</p>
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
     * <p>Unbinds tags from a specified column in an EMR cluster. If the tag is not bound to other resources, the tag is automatically deleted.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2021-03-20"),
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
     * <p>Unbinds tags from a specified column in an EMR cluster. If the tag is not bound to other resources, the tag is automatically deleted.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>修改集群模板</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an API operation template.</p>
     * 
     * @param request UpdateApiTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiTemplateResponse
     */
    public UpdateApiTemplateResponse updateApiTemplateWithOptions(UpdateApiTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiTemplate"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>修改集群模板</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an API operation template.</p>
     * 
     * @param request UpdateApiTemplateRequest
     * @return UpdateApiTemplateResponse
     */
    public UpdateApiTemplateResponse updateApiTemplate(UpdateApiTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiTemplateWithOptions(request, runtime);
    }

    /**
     * @param request UpdateApplicationConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationConfigsResponse
     */
    public UpdateApplicationConfigsResponse updateApplicationConfigsWithOptions(UpdateApplicationConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configAction)) {
            query.put("ConfigAction", request.configAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configScope)) {
            query.put("ConfigScope", request.configScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshConfig)) {
            query.put("RefreshConfig", request.refreshConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            bodyFlat.put("ApplicationConfigs", request.applicationConfigs);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationConfigs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationConfigsResponse());
    }

    /**
     * @param request UpdateApplicationConfigsRequest
     * @return UpdateApplicationConfigsResponse
     */
    public UpdateApplicationConfigsResponse updateApplicationConfigs(UpdateApplicationConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param tmpReq UpdateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScriptWithOptions(UpdateScriptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScriptShrinkRequest request = new UpdateScriptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.script)) {
            request.scriptShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.script, "Script", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptShrink)) {
            query.put("Script", request.scriptShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptType)) {
            query.put("ScriptType", request.scriptType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScript"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a bootstrap action or a common script of an E-MapReduce (EMR) cluster.</p>
     * 
     * @param request UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScriptWithOptions(request, runtime);
    }
}
