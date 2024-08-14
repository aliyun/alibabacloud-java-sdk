// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101;

import com.aliyun.tea.*;
import com.aliyun.adcp20220101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "adcp.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "adcp.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "adcp.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "adcp.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "adcp.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-heyuan", "adcp.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-hongkong", "adcp.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "adcp.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "adcp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "adcp.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-south-1", "adcp.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "adcp.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "adcp.ap-southeast-3.aliyuncs.com"),
            new TeaPair("cn-chengdu", "adcp-vpc.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "adcp.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-qingdao", "adcp.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "adcp-vpc.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "adcp.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("eu-central-1", "adcp.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "adcp-vpc.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "adcp.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "adcp.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "adcp.us-west-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adcp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request AttachClusterToHubRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachClusterToHubResponse
     */
    public AttachClusterToHubResponse attachClusterToHubWithOptions(AttachClusterToHubRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachToMesh)) {
            query.put("AttachToMesh", request.attachToMesh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            body.put("ClusterIds", request.clusterIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachClusterToHub"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachClusterToHubResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request AttachClusterToHubRequest
     * @return AttachClusterToHubResponse
     */
    public AttachClusterToHubResponse attachClusterToHub(AttachClusterToHubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachClusterToHubWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
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
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-01-01"),
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
     * <p>更新资源组</p>
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
     * <p>Creates a master instance in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param tmpReq CreateHubClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHubClusterResponse
     */
    public CreateHubClusterResponse createHubClusterWithOptions(CreateHubClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHubClusterShrinkRequest request = new CreateHubClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiServerPublicEip)) {
            body.put("ApiServerPublicEip", request.apiServerPublicEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.argoServerEnabled)) {
            body.put("ArgoServerEnabled", request.argoServerEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditLogEnabled)) {
            body.put("AuditLogEnabled", request.auditLogEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnterpriseSecurityGroup)) {
            body.put("IsEnterpriseSecurityGroup", request.isEnterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priceLimit)) {
            body.put("PriceLimit", request.priceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            body.put("Profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            body.put("ResourceGroupID", request.resourceGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            body.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowScheduleMode)) {
            body.put("WorkflowScheduleMode", request.workflowScheduleMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHubCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHubClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a master instance in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param request CreateHubClusterRequest
     * @return CreateHubClusterResponse
     */
    public CreateHubClusterResponse createHubCluster(CreateHubClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHubClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a master cluster in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param tmpReq DeleteHubClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHubClusterResponse
     */
    public DeleteHubClusterResponse deleteHubClusterWithOptions(DeleteHubClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteHubClusterShrinkRequest request = new DeleteHubClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retainResources)) {
            request.retainResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retainResources, "RetainResources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResourcesShrink)) {
            query.put("RetainResources", request.retainResourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHubCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHubClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a master cluster in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param request DeleteHubClusterRequest
     * @return DeleteHubClusterResponse
     */
    public DeleteHubClusterResponse deleteHubCluster(DeleteHubClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHubClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy for associated clusters.</p>
     * 
     * @param tmpReq DeletePolicyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyInstanceResponse
     */
    public DeletePolicyInstanceResponse deletePolicyInstanceWithOptions(DeletePolicyInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeletePolicyInstanceShrinkRequest request = new DeletePolicyInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterIds)) {
            request.clusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterIds, "ClusterIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdsShrink)) {
            query.put("ClusterIds", request.clusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy for associated clusters.</p>
     * 
     * @param request DeletePolicyInstanceRequest
     * @return DeletePolicyInstanceResponse
     */
    public DeletePolicyInstanceResponse deletePolicyInstance(DeletePolicyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the role-based access control (RBAC) permissions of a RAM user.</p>
     * 
     * @param request DeleteUserPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPermissionResponse
     */
    public DeleteUserPermissionResponse deleteUserPermissionWithOptions(DeleteUserPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserPermission"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the role-based access control (RBAC) permissions of a RAM user.</p>
     * 
     * @param request DeleteUserPermissionRequest
     * @return DeleteUserPermissionResponse
     */
    public DeleteUserPermissionResponse deleteUserPermission(DeleteUserPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a policy instance in the clusters that are associated with a master instance.</p>
     * 
     * @param tmpReq DeployPolicyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployPolicyInstanceResponse
     */
    public DeployPolicyInstanceResponse deployPolicyInstanceWithOptions(DeployPolicyInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeployPolicyInstanceShrinkRequest request = new DeployPolicyInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterIds)) {
            request.clusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterIds, "ClusterIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdsShrink)) {
            query.put("ClusterIds", request.clusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyAction)) {
            query.put("PolicyAction", request.policyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployPolicyInstance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployPolicyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a policy instance in the clusters that are associated with a master instance.</p>
     * 
     * @param request DeployPolicyInstanceRequest
     * @return DeployPolicyInstanceResponse
     */
    public DeployPolicyInstanceResponse deployPolicyInstance(DeployPolicyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployPolicyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a master instance in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param request DescribeHubClusterDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHubClusterDetailsResponse
     */
    public DescribeHubClusterDetailsResponse describeHubClusterDetailsWithOptions(DescribeHubClusterDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHubClusterDetails"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHubClusterDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a master instance in Alibaba Cloud Distributed Cloud Container Platform (ACK One).</p>
     * 
     * @param request DescribeHubClusterDetailsRequest
     * @return DescribeHubClusterDetailsResponse
     */
    public DescribeHubClusterDetailsResponse describeHubClusterDetails(DescribeHubClusterDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHubClusterDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the kubeconfig file of a Distributed Cloud Container Platform for Kubernetes (ACK One) cluster. In addition to the Container Service for Kubernetes (ACK) console, you can also use the Kubernetes CLI kubectl to manage clusters and applications. If you use kubectl to manage an ACK cluster, you must obtain the kubeconfig file of the cluster and use kubectl to connect to the cluster.</p>
     * 
     * @param request DescribeHubClusterKubeconfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHubClusterKubeconfigResponse
     */
    public DescribeHubClusterKubeconfigResponse describeHubClusterKubeconfigWithOptions(DescribeHubClusterKubeconfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHubClusterKubeconfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHubClusterKubeconfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the kubeconfig file of a Distributed Cloud Container Platform for Kubernetes (ACK One) cluster. In addition to the Container Service for Kubernetes (ACK) console, you can also use the Kubernetes CLI kubectl to manage clusters and applications. If you use kubectl to manage an ACK cluster, you must obtain the kubeconfig file of the cluster and use kubectl to connect to the cluster.</p>
     * 
     * @param request DescribeHubClusterKubeconfigRequest
     * @return DescribeHubClusterKubeconfigResponse
     */
    public DescribeHubClusterKubeconfigResponse describeHubClusterKubeconfig(DescribeHubClusterKubeconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHubClusterKubeconfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of the Fleet instance of a multi-cluster fleet of Distributed Cloud Container Platform for Kubernetes (ACK One).</p>
     * 
     * @param request DescribeHubClusterLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHubClusterLogsResponse
     */
    public DescribeHubClusterLogsResponse describeHubClusterLogsWithOptions(DescribeHubClusterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHubClusterLogs"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHubClusterLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of the Fleet instance of a multi-cluster fleet of Distributed Cloud Container Platform for Kubernetes (ACK One).</p>
     * 
     * @param request DescribeHubClusterLogsRequest
     * @return DescribeHubClusterLogsResponse
     */
    public DescribeHubClusterLogsResponse describeHubClusterLogs(DescribeHubClusterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHubClusterLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Distributed Cloud Container Platform for Kubernetes (ACK One) clusters that are created by the current user.</p>
     * 
     * @param tmpReq DescribeHubClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHubClustersResponse
     */
    public DescribeHubClustersResponse describeHubClustersWithOptions(DescribeHubClustersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeHubClustersShrinkRequest request = new DescribeHubClustersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.profile)) {
            query.put("Profile", request.profile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHubClusters"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHubClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Distributed Cloud Container Platform for Kubernetes (ACK One) clusters that are created by the current user.</p>
     * 
     * @param request DescribeHubClustersRequest
     * @return DescribeHubClustersResponse
     */
    public DescribeHubClustersResponse describeHubClusters(DescribeHubClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHubClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud CLI allows you to search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request DescribeManagedClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeManagedClustersResponse
     */
    public DescribeManagedClustersResponse describeManagedClustersWithOptions(DescribeManagedClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeManagedClusters"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeManagedClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud CLI allows you to search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request DescribeManagedClustersRequest
     * @return DescribeManagedClustersResponse
     */
    public DescribeManagedClustersResponse describeManagedClusters(DescribeManagedClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeManagedClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of policies.</p>
     * 
     * @param request DescribePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePoliciesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicies"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of policies.</p>
     * @return DescribePoliciesResponse
     */
    public DescribePoliciesResponse describePolicies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePoliciesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about a policy.</p>
     * 
     * @param request DescribePolicyDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetailsWithOptions(DescribePolicyDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyDetails"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about a policy.</p>
     * 
     * @param request DescribePolicyDetailsRequest
     * @return DescribePolicyDetailsResponse
     */
    public DescribePolicyDetailsResponse describePolicyDetails(DescribePolicyDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about the policies used by the clusters that are associated with a master instance.</p>
     * 
     * @param request DescribePolicyGovernanceInClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInClusterWithOptions(DescribePolicyGovernanceInClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyGovernanceInCluster"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyGovernanceInClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about the policies used by the clusters that are associated with a master instance.</p>
     * 
     * @param request DescribePolicyGovernanceInClusterRequest
     * @return DescribePolicyGovernanceInClusterResponse
     */
    public DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyGovernanceInClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policy instances that are deployed in the clusters associated with a master instance.</p>
     * 
     * @param request DescribePolicyInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyInstancesResponse
     */
    public DescribePolicyInstancesResponse describePolicyInstancesWithOptions(DescribePolicyInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyInstances"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policy instances that are deployed in the clusters associated with a master instance.</p>
     * 
     * @param request DescribePolicyInstancesRequest
     * @return DescribePolicyInstancesResponse
     */
    public DescribePolicyInstancesResponse describePolicyInstances(DescribePolicyInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about policy instances that are deployed in the clusters associated with a master instance.</p>
     * 
     * @param request DescribePolicyInstancesStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatusWithOptions(DescribePolicyInstancesStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyInstancesStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyInstancesStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries detailed information about policy instances that are deployed in the clusters associated with a master instance.</p>
     * 
     * @param request DescribePolicyInstancesStatusRequest
     * @return DescribePolicyInstancesStatusResponse
     */
    public DescribePolicyInstancesStatusResponse describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyInstancesStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域列表</p>
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
     * <p>Query the permissions of a Resource Access Management (RAM) user.</p>
     * 
     * @param request DescribeUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserPermissionsResponse
     */
    public DescribeUserPermissionsResponse describeUserPermissionsWithOptions(DescribeUserPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserPermissions"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the permissions of a Resource Access Management (RAM) user.</p>
     * 
     * @param request DescribeUserPermissionsRequest
     * @return DescribeUserPermissionsResponse
     */
    public DescribeUserPermissionsResponse describeUserPermissions(DescribeUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud CLI allows you to search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request DetachClusterFromHubRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachClusterFromHubResponse
     */
    public DetachClusterFromHubResponse detachClusterFromHubWithOptions(DetachClusterFromHubRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detachFromMesh)) {
            query.put("DetachFromMesh", request.detachFromMesh);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            body.put("ClusterIds", request.clusterIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachClusterFromHub"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachClusterFromHubResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Alibaba Cloud CLI allows you to search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     * 
     * @param request DetachClusterFromHubRequest
     * @return DetachClusterFromHubResponse
     */
    public DetachClusterFromHubResponse detachClusterFromHub(DetachClusterFromHubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachClusterFromHubWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  To call this API operation to grant permissions to a RAM user or RAM role on a specific cluster, you must use an Alibaba Cloud account, the account that is used to create the cluster, or a RAM user that has the cluster administrator permissions. A regular RAM user does not have the permissions to call this operation.</p>
     * <ul>
     * <li>Before you grant RBAC permissions to a RAM user or RAM role on a cluster, you must grant the operation permissions to the RAM user or RAM role on the specified cluster. For more information, see <a href="https://help.aliyun.com/document_detail/613486.html">Attach a system permission policy to a RAM user or RAM role</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/613468.html">Authorization overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants role-based access control (RBAC) permissions to Resource Access Management (RAM) users or RAM roles. System policies can be attached to RAM users to grant only the operation permissions on Distributed Cloud Container Platform for Kubernetes (ACK One) cluster resources. The operation permissions include creating and viewing instances. If you want to perform operations on Kubernetes resources in a specific cluster by using a RAM user or assuming a RAM role, such as creating GitOps applications and Argo workflows, you must grant RBAC permissions to the RAM user or RAM role to perform operations on the specified ACK One cluster and namespace. This topic describes how to grant RBAC permissions to a RAM user or RAM role.</p>
     * 
     * @param request GrantUserPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantUserPermissionResponse
     */
    public GrantUserPermissionResponse grantUserPermissionWithOptions(GrantUserPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRamRole)) {
            query.put("IsRamRole", request.isRamRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPermission"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  To call this API operation to grant permissions to a RAM user or RAM role on a specific cluster, you must use an Alibaba Cloud account, the account that is used to create the cluster, or a RAM user that has the cluster administrator permissions. A regular RAM user does not have the permissions to call this operation.</p>
     * <ul>
     * <li>Before you grant RBAC permissions to a RAM user or RAM role on a cluster, you must grant the operation permissions to the RAM user or RAM role on the specified cluster. For more information, see <a href="https://help.aliyun.com/document_detail/613486.html">Attach a system permission policy to a RAM user or RAM role</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/613468.html">Authorization overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants role-based access control (RBAC) permissions to Resource Access Management (RAM) users or RAM roles. System policies can be attached to RAM users to grant only the operation permissions on Distributed Cloud Container Platform for Kubernetes (ACK One) cluster resources. The operation permissions include creating and viewing instances. If you want to perform operations on Kubernetes resources in a specific cluster by using a RAM user or assuming a RAM role, such as creating GitOps applications and Argo workflows, you must grant RBAC permissions to the RAM user or RAM role to perform operations on the specified ACK One cluster and namespace. This topic describes how to grant RBAC permissions to a RAM user or RAM role.</p>
     * 
     * @param request GrantUserPermissionRequest
     * @return GrantUserPermissionResponse
     */
    public GrantUserPermissionResponse grantUserPermission(GrantUserPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantUserPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grant permissions to a Resource Access Management (RAM) user.</p>
     * 
     * @deprecated OpenAPI GrantUserPermissions is deprecated, please use adcp::2022-01-01::GrantUserPermission instead.
     * 
     * @param tmpReq GrantUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantUserPermissionsResponse
     */
    @Deprecated
    // Deprecated
    public GrantUserPermissionsResponse grantUserPermissionsWithOptions(GrantUserPermissionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantUserPermissionsShrinkRequest request = new GrantUserPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            query.put("Permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPermissions"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grant permissions to a Resource Access Management (RAM) user.</p>
     * 
     * @deprecated OpenAPI GrantUserPermissions is deprecated, please use adcp::2022-01-01::GrantUserPermission instead.
     * 
     * @param request GrantUserPermissionsRequest
     * @return GrantUserPermissionsResponse
     */
    @Deprecated
    // Deprecated
    public GrantUserPermissionsResponse grantUserPermissions(GrantUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantUserPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a Container Service for Kubernetes (ACK) cluster that serves as a master instance.</p>
     * 
     * @param tmpReq UpdateHubClusterFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHubClusterFeatureResponse
     */
    public UpdateHubClusterFeatureResponse updateHubClusterFeatureWithOptions(UpdateHubClusterFeatureRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHubClusterFeatureShrinkRequest request = new UpdateHubClusterFeatureShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accessControlList)) {
            request.accessControlListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accessControlList, "AccessControlList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitches)) {
            request.vSwitchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitches, "VSwitches", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessControlListShrink)) {
            query.put("AccessControlList", request.accessControlListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiServerEipId)) {
            query.put("ApiServerEipId", request.apiServerEipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.argoCDEnabled)) {
            query.put("ArgoCDEnabled", request.argoCDEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.argoCDHAEnabled)) {
            query.put("ArgoCDHAEnabled", request.argoCDHAEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.argoEventsEnabled)) {
            query.put("ArgoEventsEnabled", request.argoEventsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.argoServerEnabled)) {
            query.put("ArgoServerEnabled", request.argoServerEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditLogEnabled)) {
            query.put("AuditLogEnabled", request.auditLogEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMesh)) {
            query.put("EnableMesh", request.enableMesh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayEnabled)) {
            query.put("GatewayEnabled", request.gatewayEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorEnabled)) {
            query.put("MonitorEnabled", request.monitorEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priceLimit)) {
            query.put("PriceLimit", request.priceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicAccessEnabled)) {
            query.put("PublicAccessEnabled", request.publicAccessEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicApiServerEnabled)) {
            query.put("PublicApiServerEnabled", request.publicApiServerEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchesShrink)) {
            query.put("VSwitches", request.vSwitchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowScheduleMode)) {
            query.put("WorkflowScheduleMode", request.workflowScheduleMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHubClusterFeature"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHubClusterFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a Container Service for Kubernetes (ACK) cluster that serves as a master instance.</p>
     * 
     * @param request UpdateHubClusterFeatureRequest
     * @return UpdateHubClusterFeatureResponse
     */
    public UpdateHubClusterFeatureResponse updateHubClusterFeature(UpdateHubClusterFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHubClusterFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a RAM user.</p>
     * 
     * @param request UpdateUserPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPermissionResponse
     */
    public UpdateUserPermissionResponse updateUserPermissionWithOptions(UpdateUserPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPermission"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the role-based access control (RBAC) permissions of a RAM user.</p>
     * 
     * @param request UpdateUserPermissionRequest
     * @return UpdateUserPermissionResponse
     */
    public UpdateUserPermissionResponse updateUserPermission(UpdateUserPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserPermissionWithOptions(request, runtime);
    }
}
